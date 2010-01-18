package org.dcache.chimera.nfs.v4;

import org.dcache.chimera.nfs.v4.xdr.nfsstat4;
import org.dcache.chimera.nfs.v4.xdr.nfs_argop4;
import org.dcache.chimera.nfs.v4.xdr.nfs_opnum4;
import org.dcache.chimera.nfs.v4.xdr.SETCLIENTID_CONFIRM4res;
import org.dcache.chimera.nfs.ChimeraNFSException;
import org.dcache.xdr.RpcCall;
import org.apache.log4j.Logger;
import org.dcache.chimera.FileSystemProvider;
import org.dcache.chimera.nfs.ExportFile;

public class OperationSETCLIENTID_CONFIRM extends AbstractNFSv4Operation {

	private static final Logger _log = Logger.getLogger(OperationPUTFH.class.getName());

	OperationSETCLIENTID_CONFIRM(FileSystemProvider fs, RpcCall call$, CompoundArgs fh, nfs_argop4 args, ExportFile exports) {
		super(fs, exports, call$, fh, args, nfs_opnum4.OP_SETCLIENTID_CONFIRM);
	}

	@Override
	public NFSv4OperationResult process() {

    	SETCLIENTID_CONFIRM4res res = new SETCLIENTID_CONFIRM4res();

        try {
            Long clientid = Long.valueOf(_args.opsetclientid_confirm.clientid.value.value);

            NFS4Client client = NFSv4StateHandler.getInstace().getClientByID( clientid  );
            if( client == null ) {
                throw new ChimeraNFSException(nfsstat4.NFS4ERR_STALE_CLIENTID, "Bad client id");
            }

            res.status = nfsstat4.NFS4ERR_INVAL;
            if(client.verify_serverId(_args.opsetclientid_confirm.clientid.value.value) &&  client.verify_verifier( _args.opsetclientid_confirm.setclientid_confirm.value ) ) {
                res.status = nfsstat4.NFS4_OK;
                client.confirmed();
            }
        }catch(ChimeraNFSException he) {
        	if(_log.isDebugEnabled() ) {
        		_log.debug("SETCLIENTID_CONFIRM: " + he.getMessage() );
        	}
            res.status = he.getStatus();
        }

        _result.opsetclientid_confirm = res;

        return new NFSv4OperationResult(_result, res.status);
	}

}

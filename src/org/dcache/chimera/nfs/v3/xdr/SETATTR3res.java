/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v3.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class SETATTR3res implements XdrAble {
    public int status;
    public SETATTR3resok resok;
    public SETATTR3resfail resfail;

    public SETATTR3res() {
    }

    public SETATTR3res(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(status);
        switch ( status ) {
        case nfsstat3.NFS3_OK:
            resok.xdrEncode(xdr);
            break;
        default:
            resfail.xdrEncode(xdr);
            break;
        }
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        status = xdr.xdrDecodeInt();
        switch ( status ) {
        case nfsstat3.NFS3_OK:
            resok = new SETATTR3resok(xdr);
            break;
        default:
            resfail = new SETATTR3resfail(xdr);
            break;
        }
    }

}
// End of SETATTR3res.java

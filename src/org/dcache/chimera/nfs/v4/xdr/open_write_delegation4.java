/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class open_write_delegation4 implements XdrAble {
    public stateid4 stateid;
    public boolean recall;
    public nfs_space_limit4 space_limit;
    public nfsace4 permissions;

    public open_write_delegation4() {
    }

    public open_write_delegation4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        stateid.xdrEncode(xdr);
        xdr.xdrEncodeBoolean(recall);
        space_limit.xdrEncode(xdr);
        permissions.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        stateid = new stateid4(xdr);
        recall = xdr.xdrDecodeBoolean();
        space_limit = new nfs_space_limit4(xdr);
        permissions = new nfsace4(xdr);
    }

}
// End of open_write_delegation4.java

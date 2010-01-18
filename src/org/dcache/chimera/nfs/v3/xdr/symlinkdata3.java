/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v3.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class symlinkdata3 implements XdrAble {
    public sattr3 symlink_attributes;
    public nfspath3 symlink_data;

    public symlinkdata3() {
    }

    public symlinkdata3(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        symlink_attributes.xdrEncode(xdr);
        symlink_data.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        symlink_attributes = new sattr3(xdr);
        symlink_data = new nfspath3(xdr);
    }

}
// End of symlinkdata3.java

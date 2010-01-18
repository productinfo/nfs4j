/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class layoutreturn4 implements XdrAble {
    public int lr_returntype;
    public layoutreturn_file4 lr_layout;

    public layoutreturn4() {
    }

    public layoutreturn4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(lr_returntype);
        switch ( lr_returntype ) {
        case layoutreturn_type4.LAYOUTRETURN4_FILE:
            lr_layout.xdrEncode(xdr);
            break;
        default:
            break;
        }
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        lr_returntype = xdr.xdrDecodeInt();
        switch ( lr_returntype ) {
        case layoutreturn_type4.LAYOUTRETURN4_FILE:
            lr_layout = new layoutreturn_file4(xdr);
            break;
        default:
            break;
        }
    }

}
// End of layoutreturn4.java

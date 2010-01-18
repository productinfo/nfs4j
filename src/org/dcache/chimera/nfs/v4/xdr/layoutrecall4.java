/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class layoutrecall4 implements XdrAble {
    public int lor_recalltype;
    public layoutrecall_file4 lor_layout;
    public fsid4 lor_fsid;

    public layoutrecall4() {
    }

    public layoutrecall4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(lor_recalltype);
        switch ( lor_recalltype ) {
        case layoutrecall_type4.LAYOUTRECALL4_FILE:
            lor_layout.xdrEncode(xdr);
            break;
        case layoutrecall_type4.LAYOUTRECALL4_FSID:
            lor_fsid.xdrEncode(xdr);
            break;
        case layoutrecall_type4.LAYOUTRECALL4_ALL:
            break;
        }
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        lor_recalltype = xdr.xdrDecodeInt();
        switch ( lor_recalltype ) {
        case layoutrecall_type4.LAYOUTRECALL4_FILE:
            lor_layout = new layoutrecall_file4(xdr);
            break;
        case layoutrecall_type4.LAYOUTRECALL4_FSID:
            lor_fsid = new fsid4(xdr);
            break;
        case layoutrecall_type4.LAYOUTRECALL4_ALL:
            break;
        }
    }

}
// End of layoutrecall4.java

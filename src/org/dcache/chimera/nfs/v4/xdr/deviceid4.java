/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class deviceid4 implements XdrAble {

    public byte [] value;

    public deviceid4() {
    }

    public deviceid4(byte [] value) {
        this.value = value;
    }

    public deviceid4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeOpaque(value, nfs4_prot.NFS4_DEVICEID4_SIZE);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        value = xdr.xdrDecodeOpaque(nfs4_prot.NFS4_DEVICEID4_SIZE);
    }

}
// End of deviceid4.java

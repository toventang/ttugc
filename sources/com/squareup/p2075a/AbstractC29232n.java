package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.squareup.a.n */
public interface AbstractC29232n {

    /* renamed from: a */
    public static final AbstractC29232n f69276a = new AbstractC29232n() {
        /* class com.squareup.p2075a.AbstractC29232n.C292331 */

        static {
            Covode.recordClassIndex(35582);
        }

        @Override // com.squareup.p2075a.AbstractC29232n
        /* renamed from: a */
        public final List<InetAddress> mo50973a(String str) {
            if (str != null) {
                return Arrays.asList(InetAddress.getAllByName(str));
            }
            throw new UnknownHostException("hostname == null");
        }
    };

    /* renamed from: a */
    List<InetAddress> mo50973a(String str);

    static {
        Covode.recordClassIndex(35581);
    }
}

package com.bytedance.hybrid.spark.p1111e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.hybrid.spark.e.e */
public final class C15575e {

    /* renamed from: a */
    public static final C15576a f37958a = new C15576a((byte) 0);

    static {
        Covode.recordClassIndex(17837);
    }

    /* renamed from: com.bytedance.hybrid.spark.e.e$a */
    public static final class C15576a {
        static {
            Covode.recordClassIndex(17838);
        }

        private C15576a() {
        }

        public /* synthetic */ C15576a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int m28693a(String str) {
            C89219l.m154719c(str, "");
            try {
                Uri parse = Uri.parse(str);
                C89219l.m154709a((Object) parse, "");
                String host = parse.getHost();
                if (host != null && C89361p.m154876c(host, "_page", false)) {
                    return 1;
                }
                String host2 = parse.getHost();
                if (host2 != null && C89361p.m154876c(host2, "_popup", false)) {
                    return 2;
                }
                String host3 = parse.getHost();
                if (host3 == null) {
                    return 1;
                }
                C89361p.m154876c(host3, "_card", false);
                return 1;
            } catch (Exception unused) {
                return 1;
            }
        }
    }
}

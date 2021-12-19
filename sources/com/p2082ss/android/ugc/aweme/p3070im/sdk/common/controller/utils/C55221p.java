package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.p */
public final class C55221p {

    /* renamed from: a */
    public static final String[] f126300a = new String[0];

    /* renamed from: b */
    public static final C55222a f126301b = new C55222a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.p$a */
    public static final class C55222a {

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.p$a$a */
        public static final class C55223a {

            /* renamed from: d */
            public static String f126302d = "";

            /* renamed from: e */
            public static String f126303e = "large";

            /* renamed from: f */
            public static String f126304f = "medium";

            /* renamed from: g */
            public static String f126305g = "thumb";

            /* renamed from: h */
            public static final C55224a f126306h = new C55224a((byte) 0);

            /* renamed from: a */
            public List<String> f126307a;

            /* renamed from: b */
            public String f126308b;

            /* renamed from: c */
            public String f126309c;

            /* renamed from: i */
            private String f126310i = f126302d;

            /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.p$a$a$a */
            public static final class C55224a {
                static {
                    Covode.recordClassIndex(64971);
                }

                private C55224a() {
                }

                public /* synthetic */ C55224a(byte b) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(64970);
            }

            /* renamed from: a */
            public final String mo92218a() {
                String a = C1764a.m5928a("/img/%s~tplv-x-get:%s.image%s%s", Arrays.copyOf(new Object[]{this.f126308b, this.f126310i, "%%secretKey=", this.f126309c}, 4));
                C89219l.m154716b(a, "");
                return a;
            }

            public C55223a(List<String> list, String str, String str2) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                this.f126308b = str;
                this.f126309c = str2;
                this.f126307a = list;
            }
        }

        static {
            Covode.recordClassIndex(64969);
        }

        private C55222a() {
        }

        public /* synthetic */ C55222a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(64968);
    }
}

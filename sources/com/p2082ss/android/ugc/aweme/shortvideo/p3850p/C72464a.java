package com.p2082ss.android.ugc.aweme.shortvideo.p3850p;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65384bx;
import com.p2082ss.android.ugc.aweme.property.C65469ev;
import com.p2082ss.android.ugc.aweme.property.C65470ew;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78100a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a */
public final class C72464a {

    /* renamed from: a */
    public static boolean f162449a;

    /* renamed from: b */
    public static boolean f162450b;

    /* renamed from: c */
    public static final C72464a f162451c = new C72464a();

    private C72464a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$a */
    public static final class C72465a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C72465a f162452a = new C72465a();

        static {
            Covode.recordClassIndex(85140);
        }

        C72465a() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m127853a());
        }

        /* renamed from: a */
        public static boolean m127853a() {
            int[] g = C65357b.m117051g();
            if (g == null || g.length < 2 || g[0] != 720) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$b */
    public static final class C72466b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C72466b f162453a = new C72466b();

        static {
            Covode.recordClassIndex(85141);
        }

        C72466b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m127854a());
        }

        /* renamed from: a */
        public static boolean m127854a() {
            int[] h = C65357b.m117052h();
            if (h == null || h.length < 2 || h[0] != 720) {
                return false;
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(85139);
    }

    /* renamed from: a */
    public final void mo114735a() {
        int i;
        int i2;
        MethodCollector.m26663i(10512);
        synchronized (this) {
            try {
                if (f162450b && f162449a) {
                    if (C72465a.m127853a()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    m127851a("resolution", i, C89041ag.m154421a(C89387v.m154943a("resolution_default", C65469ev.m117195a()), C89387v.m154943a("resolution_category", C65470ew.m117196a()), C89387v.m154943a("resolution_real", C65357b.m117049e())).toString());
                    if (C72466b.m127854a()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    m127851a("resolution", i2, C89041ag.m154421a(C89387v.m154943a("resolution_default", C65469ev.m117195a()), C89387v.m154943a("resolution_category_upload", C65384bx.m117081a()), C89387v.m154943a("resolution_real_upload", C65357b.m117050f())).toString());
                }
            } finally {
                MethodCollector.m26664o(10512);
            }
        }
    }

    /* renamed from: a */
    public static void m127851a(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C40982q.m82522a("aweme_android_white_list", C78100a.m136518a(C89041ag.m154421a(C89387v.m154943a("white_list_type", str), C89387v.m154943a("white_list_value", String.valueOf(i)), C89387v.m154943a("extra", str2))));
    }
}

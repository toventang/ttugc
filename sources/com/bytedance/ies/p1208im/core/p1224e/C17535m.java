package com.bytedance.ies.p1208im.core.p1224e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.p1227h.C17594a;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19497k;
import com.bytedance.p1399im.core.p1415g.C19696b;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.e.m */
public final class C17535m {

    /* renamed from: a */
    public static final C19497k f41962a = new C19497k();

    /* renamed from: b */
    static Throwable f41963b;

    /* renamed from: c */
    static final AbstractC89244h f41964c = C89250i.m154773a((AbstractC89171a) C17538c.f41970a);

    /* renamed from: d */
    public static final C17535m f41965d = new C17535m();

    /* renamed from: e */
    private static final AbstractC89244h f41966e = C89250i.m154773a((AbstractC89171a) C17536a.f41968a);

    /* renamed from: f */
    private static final AbstractC89244h f41967f = C89250i.m154773a((AbstractC89171a) C17537b.f41969a);

    /* renamed from: a */
    public static C19497k m32504a() {
        return (C19497k) f41966e.getValue();
    }

    /* renamed from: b */
    public static C19497k m32506b() {
        return (C19497k) f41967f.getValue();
    }

    private C17535m() {
    }

    /* renamed from: com.bytedance.ies.im.core.e.m$a */
    static final class C17536a extends AbstractC89220m implements AbstractC89171a<C19497k> {

        /* renamed from: a */
        public static final C17536a f41968a = new C17536a();

        static {
            Covode.recordClassIndex(20025);
        }

        C17536a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19497k invoke() {
            return m32507a();
        }

        /* renamed from: a */
        private static C19497k m32507a() {
            try {
                return (C19497k) C16048b.m29633a().mo25415a(true, "im_options_mix_link_opt", C19497k.class);
            } catch (Throwable th) {
                C17535m.f41963b = th;
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.ies.im.core.e.m$b */
    static final class C17537b extends AbstractC89220m implements AbstractC89171a<C19497k> {

        /* renamed from: a */
        public static final C17537b f41969a = new C17537b();

        static {
            Covode.recordClassIndex(20026);
        }

        C17537b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19497k invoke() {
            return C17594a.m32640b();
        }
    }

    /* renamed from: com.bytedance.ies.im.core.e.m$c */
    static final class C17538c extends AbstractC89220m implements AbstractC89171a<C19497k> {

        /* renamed from: a */
        public static final C17538c f41970a = new C17538c();

        static {
            Covode.recordClassIndex(20027);
        }

        C17538c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19497k invoke() {
            C19497k a = C17535m.m32504a();
            if (a != null) {
                return a;
            }
            C19497k b = C17535m.m32506b();
            if (b == null) {
                return C17535m.f41962a;
            }
            return b;
        }
    }

    static {
        Covode.recordClassIndex(20024);
    }

    /* renamed from: a */
    public static void m32505a(String str, JSONObject jSONObject) {
        String str2;
        String str3;
        String valueOf;
        C89219l.m154721d(str, "");
        C17415a.m32255b().mo27836b("mix_link_opt", "interceptTeaEvent:".concat(String.valueOf(str)));
        try {
            if (!(!C89219l.m154714a((Object) str, (Object) "im_link_mode_migrate"))) {
                C19483d a = C19483d.m36365a();
                C89219l.m154716b(a, "");
                C19497k kVar = a.mo31141b().f46244ai;
                C19497k b = C17594a.m32640b();
                int i = 0;
                if (f41963b != null) {
                    i = 100;
                } else if (m32504a() == null) {
                    i = 101;
                } else {
                    C19497k a2 = m32504a();
                    if (a2 == null) {
                        C89219l.m154715b();
                    }
                    if (a2.enable != kVar.enable) {
                        i = 102;
                    } else if (b == null) {
                        i = 103;
                    } else if (b.enable != kVar.enable) {
                        i = 104;
                    } else if (m32506b() != null) {
                        C19497k b2 = m32506b();
                        if (b2 == null) {
                            C89219l.m154715b();
                        }
                        if (b2.enable != b.enable) {
                            i = 105;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject.put("error_reason", String.valueOf(i));
                    jSONObject.put("sdk_config", String.valueOf(kVar.enable));
                    String str4 = "-1";
                    if (b == null || (str2 = String.valueOf(b.enable)) == null) {
                        str2 = str4;
                    }
                    jSONObject.put("cur_config", str2);
                    C19497k b3 = m32506b();
                    if (b3 == null || (str3 = String.valueOf(b3.enable)) == null) {
                        str3 = str4;
                    }
                    jSONObject.put("last_config", str3);
                    C19497k a3 = m32504a();
                    if (!(a3 == null || (valueOf = String.valueOf(a3.enable)) == null)) {
                        str4 = valueOf;
                    }
                    jSONObject.put("init_config", str4);
                    Throwable th = f41963b;
                    if (th != null) {
                        jSONObject.put("error_msg", C19696b.m36810a(th));
                        jSONObject.put("error_stack", C19696b.m36828b(th));
                    }
                }
                C17415a.m32255b().mo27836b("mix_link_opt", "interceptTeaEvent end, " + str + ':' + jSONObject);
            }
        } catch (Throwable th2) {
            C17415a.m32255b().mo27830a("mix_link_opt", th2);
        }
    }
}

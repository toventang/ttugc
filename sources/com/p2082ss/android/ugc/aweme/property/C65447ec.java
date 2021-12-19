package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.ec */
public final class C65447ec {

    /* renamed from: a */
    public static final C65464eq f147616a = null;

    /* renamed from: b */
    public static final C65447ec f147617b = new C65447ec();

    private C65447ec() {
    }

    static {
        Covode.recordClassIndex(76934);
    }

    /* renamed from: c */
    private static C65464eq m117168c() {
        return (C65464eq) C16048b.m29633a().mo25416a(true, "tool_ve_setting_configs", C65464eq.class, f147616a);
    }

    /* renamed from: b */
    public static String m117167b() {
        C65464eq c = m117168c();
        if (c == null) {
            return C65383bw.m117080a();
        }
        C65467et[] a = C65466es.m117193a();
        int i = 0;
        if (a != null && a.length != 0 && true && a != null) {
            int length = a.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C65467et etVar = a[i];
                if (C89219l.m154714a((Object) etVar.f147658a, (Object) c.f147654b)) {
                    String str = etVar.f147659b;
                    if (str != null) {
                        return str;
                    }
                } else {
                    i++;
                }
            }
        }
        return C65383bw.m117080a();
    }

    /* renamed from: a */
    public static String m117166a() {
        C65464eq c = m117168c();
        if (c == null) {
            String a = C65465er.m117192a();
            C89219l.m154716b(a, "");
            return a;
        }
        C65467et[] a2 = C65466es.m117193a();
        int i = 0;
        if (a2 != null && a2.length != 0 && true && a2 != null) {
            int length = a2.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C65467et etVar = a2[i];
                if (C89219l.m154714a((Object) etVar.f147658a, (Object) c.f147653a)) {
                    String str = etVar.f147659b;
                    if (str != null) {
                        return str;
                    }
                } else {
                    i++;
                }
            }
        }
        String a3 = C65465er.m117192a();
        C89219l.m154716b(a3, "");
        return a3;
    }
}

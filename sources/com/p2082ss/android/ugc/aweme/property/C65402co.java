package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.co */
public final class C65402co {

    /* renamed from: c */
    public static C65402co f147547c;

    /* renamed from: d */
    public static final C65403a f147548d = new C65403a((byte) 0);

    /* renamed from: a */
    public final boolean f147549a;

    /* renamed from: b */
    public final String f147550b;

    static {
        Covode.recordClassIndex(76889);
    }

    /* renamed from: com.ss.android.ugc.aweme.property.co$a */
    public static final class C65403a {
        static {
            Covode.recordClassIndex(76890);
        }

        private C65403a() {
        }

        /* renamed from: a */
        public static C65402co m117104a() {
            C65402co coVar = C65402co.f147547c;
            if (coVar != null) {
                return coVar;
            }
            if (C65351au.f147482a) {
                String a = SettingsManager.m29616a().mo25398a("avtools_1080p_mv_photo_ve_synthesis_settings", "");
                C89219l.m154716b(a, "");
                if (a.length() > 0) {
                    C65402co coVar2 = new C65402co(a);
                    C65402co.f147547c = coVar2;
                    return coVar2;
                }
            }
            String a2 = SettingsManager.m29616a().mo25398a("avtools_720p_mv_photo_ve_synthesis_settings", "");
            C89219l.m154716b(a2, "");
            if (a2.length() > 0) {
                C65402co coVar3 = new C65402co(a2);
                C65402co.f147547c = coVar3;
                return coVar3;
            }
            C65402co coVar4 = new C65402co("");
            C65402co.f147547c = coVar4;
            return coVar4;
        }

        public /* synthetic */ C65403a(byte b) {
            this();
        }
    }

    public /* synthetic */ C65402co(String str) {
        this(C65351au.f147482a, str);
    }

    private C65402co(boolean z, String str) {
        C89219l.m154721d(str, "");
        this.f147549a = z;
        this.f147550b = str;
    }
}

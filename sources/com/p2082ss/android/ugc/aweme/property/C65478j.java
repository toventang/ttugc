package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.j */
public final class C65478j {

    /* renamed from: a */
    public static final C65480k f147674a = new C65480k();

    /* renamed from: b */
    static final int f147675b = m117208a().f147687b;

    /* renamed from: c */
    static final int f147676c = m117208a().f147688c;

    /* renamed from: d */
    static final int f147677d = m117208a().f147689d;

    /* renamed from: e */
    static final int f147678e = m117208a().f147690e;

    /* renamed from: f */
    static final boolean f147679f = m117208a().f147686a;

    /* renamed from: g */
    static final boolean f147680g = m117208a().f147691f;

    /* renamed from: h */
    static final boolean f147681h = m117208a().f147692g;

    /* renamed from: i */
    static final boolean f147682i = m117208a().f147693h;

    /* renamed from: j */
    public static final C65478j f147683j = new C65478j();

    /* renamed from: k */
    private static final AbstractC89244h f147684k = C89250i.m154773a((AbstractC89171a) C65479a.f147685a);

    /* renamed from: a */
    private static final C65480k m117208a() {
        return (C65480k) f147684k.getValue();
    }

    private C65478j() {
    }

    /* renamed from: com.ss.android.ugc.aweme.property.j$a */
    static final class C65479a extends AbstractC89220m implements AbstractC89171a<C65480k> {

        /* renamed from: a */
        public static final C65479a f147685a = new C65479a();

        static {
            Covode.recordClassIndex(76966);
        }

        C65479a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65480k invoke() {
            return m117209a();
        }

        /* renamed from: a */
        private static C65480k m117209a() {
            try {
                C65480k kVar = (C65480k) C16048b.m29633a().mo25416a(true, "creative_tools_brightness_enhance_config", C65480k.class, C65478j.f147674a);
                if (kVar == null) {
                    kVar = C65478j.f147674a;
                }
                C89219l.m154716b(kVar, "");
                return kVar;
            } catch (Exception e) {
                e.printStackTrace();
                return C65478j.f147674a;
            }
        }
    }

    static {
        Covode.recordClassIndex(76965);
    }
}

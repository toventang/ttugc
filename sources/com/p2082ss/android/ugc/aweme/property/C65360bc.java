package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.property.bc */
public final class C65360bc {

    /* renamed from: a */
    public static final C65360bc f147494a = new C65360bc();

    /* renamed from: b */
    private static final AbstractC89244h f147495b = C89250i.m154773a((AbstractC89171a) C65361a.f147498a);

    /* renamed from: c */
    private static final AbstractC89244h f147496c = C89250i.m154773a((AbstractC89171a) C65363c.f147500a);

    /* renamed from: d */
    private static final AbstractC89244h f147497d = C89250i.m154773a((AbstractC89171a) C65362b.f147499a);

    /* renamed from: a */
    public static final boolean m117057a() {
        return ((Boolean) f147495b.getValue()).booleanValue();
    }

    /* renamed from: b */
    public static final int m117058b() {
        return ((Number) f147496c.getValue()).intValue();
    }

    /* renamed from: c */
    public static final int m117059c() {
        return ((Number) f147497d.getValue()).intValue();
    }

    private C65360bc() {
    }

    /* renamed from: com.ss.android.ugc.aweme.property.bc$a */
    static final class C65361a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C65361a f147498a = new C65361a();

        static {
            Covode.recordClassIndex(76848);
        }

        C65361a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "creative_tools_monitor_fps_and_lag", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.bc$b */
    static final class C65362b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C65362b f147499a = new C65362b();

        static {
            Covode.recordClassIndex(76849);
        }

        C65362b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("creative_tools_ui_lag_monitor_duration", 5000));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.bc$c */
    static final class C65363c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C65363c f147500a = new C65363c();

        static {
            Covode.recordClassIndex(76850);
        }

        C65363c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("creative_tools_ui_block_threshold", 500));
        }
    }

    static {
        Covode.recordClassIndex(76847);
    }
}

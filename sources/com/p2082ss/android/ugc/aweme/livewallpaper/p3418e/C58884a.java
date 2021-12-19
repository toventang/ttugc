package com.p2082ss.android.ugc.aweme.livewallpaper.p3418e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.e.a */
public final class C58884a {

    /* renamed from: a */
    public static final int f134050a = 2;

    /* renamed from: b */
    public static final AbstractC89244h f134051b = C89250i.m154773a((AbstractC89171a) C58885a.f134053a);

    /* renamed from: c */
    public static final C58884a f134052c = new C58884a();

    private C58884a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.e.a$a */
    static final class C58885a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C58885a f134053a = new C58885a();

        static {
            Covode.recordClassIndex(69201);
        }

        C58885a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("wall_paper_active_check_interval_hour", 2));
        }
    }

    static {
        Covode.recordClassIndex(69200);
    }
}

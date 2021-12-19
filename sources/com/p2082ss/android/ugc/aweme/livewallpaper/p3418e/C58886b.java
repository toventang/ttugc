package com.p2082ss.android.ugc.aweme.livewallpaper.p3418e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.e.b */
public final class C58886b {

    /* renamed from: a */
    public static final int f134054a = 24;

    /* renamed from: b */
    public static final AbstractC89244h f134055b = C89250i.m154773a((AbstractC89171a) C58887a.f134057a);

    /* renamed from: c */
    public static final C58886b f134056c = new C58886b();

    private C58886b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.e.b$a */
    static final class C58887a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C58887a f134057a = new C58887a();

        static {
            Covode.recordClassIndex(69203);
        }

        C58887a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.m29616a().mo25394a("wall_paper_cache_feed_expire_hour", 24));
        }
    }

    static {
        Covode.recordClassIndex(69202);
    }
}

package com.p2082ss.android.ugc.aweme.social.widget.card.p3920a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.d */
public final class C74758d {

    /* renamed from: a */
    public static final C74757c f168037a = new C74757c((byte) 0);

    /* renamed from: b */
    static final AbstractC89244h f168038b = C89250i.m154773a((AbstractC89171a) C74759a.f168040a);

    /* renamed from: c */
    public static final C74758d f168039c = new C74758d();

    private C74758d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.d$a */
    static final class C74759a extends AbstractC89220m implements AbstractC89171a<C74757c> {

        /* renamed from: a */
        public static final C74759a f168040a = new C74759a();

        static {
            Covode.recordClassIndex(87604);
        }

        C74759a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74757c invoke() {
            Object a = SettingsManager.m29616a().mo25397a("social_permission_card_freq", C74757c.class, C74758d.f168037a);
            if (a == null) {
                a = C74758d.f168037a;
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(87603);
    }
}

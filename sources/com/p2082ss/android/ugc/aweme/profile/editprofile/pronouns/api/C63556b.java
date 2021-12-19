package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.b */
public final class C63556b {

    /* renamed from: a */
    public static final C63555a f144236a = new C63555a();

    /* renamed from: b */
    public static final AbstractC89244h f144237b = C89250i.m154773a((AbstractC89171a) C63557a.f144239a);

    /* renamed from: c */
    public static final C63556b f144238c = new C63556b();

    private C63556b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.api.b$a */
    static final class C63557a extends AbstractC89220m implements AbstractC89171a<C63555a> {

        /* renamed from: a */
        public static final C63557a f144239a = new C63557a();

        static {
            Covode.recordClassIndex(74873);
        }

        C63557a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63555a invoke() {
            Object a = SettingsManager.m29616a().mo25397a("profile_pronouns_config", C63555a.class, C63556b.f144236a);
            if (a == null) {
                a = C63556b.f144236a;
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(74872);
    }
}

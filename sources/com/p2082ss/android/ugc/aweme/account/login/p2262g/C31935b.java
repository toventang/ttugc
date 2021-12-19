package com.p2082ss.android.ugc.aweme.account.login.p2262g;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31930a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.g.b */
public final class C31935b implements C31930a.AbstractC31932b {

    /* renamed from: a */
    public final AuthResult f76277a;

    /* renamed from: b */
    public final AbstractC31936a f76278b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.g.b$a */
    public interface AbstractC31936a {
        static {
            Covode.recordClassIndex(38680);
        }

        /* renamed from: b */
        void mo57800b(int i, AuthResult authResult);
    }

    static {
        Covode.recordClassIndex(38679);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2262g.C31930a.AbstractC31932b
    /* renamed from: b */
    public final void mo57859b() {
        m66298a(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2262g.C31930a.AbstractC31932b
    /* renamed from: a */
    public final void mo57858a() {
        m66298a(-1);
    }

    /* renamed from: a */
    private void m66298a(int i) {
        this.f76278b.mo57800b(i, this.f76277a);
    }

    public C31935b(AuthResult authResult, AbstractC31936a aVar) {
        C89219l.m154721d(authResult, "");
        C89219l.m154721d(aVar, "");
        this.f76277a = authResult;
        this.f76278b = aVar;
    }
}

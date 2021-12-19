package com.p2082ss.android.ugc.aweme.account.agegate;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.p2082ss.android.ugc.aweme.account.agegate.C31412b;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.a */
public final class C31380a implements C31412b.AbstractC31413a {

    /* renamed from: a */
    private AuthResult f75159a;

    /* renamed from: b */
    private AbstractC31381a f75160b;

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a$a */
    public interface AbstractC31381a {
        static {
            Covode.recordClassIndex(38089);
        }

        /* renamed from: a */
        void mo57405a(int i, AuthResult authResult);
    }

    static {
        Covode.recordClassIndex(38088);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.C31412b.AbstractC31413a
    /* renamed from: a */
    public final void mo57401a() {
        m65605a(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.C31412b.AbstractC31413a
    /* renamed from: b */
    public final void mo57402b() {
        m65605a(-1);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.C31412b.AbstractC31413a
    /* renamed from: c */
    public final void mo57403c() {
        m65605a(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.C31412b.AbstractC31413a
    /* renamed from: d */
    public final void mo57404d() {
        m65605a(1);
    }

    /* renamed from: a */
    private void m65605a(int i) {
        AbstractC31381a aVar = this.f75160b;
        if (aVar != null) {
            aVar.mo57405a(i, this.f75159a);
        }
    }

    public C31380a(AuthResult authResult, AbstractC31381a aVar) {
        this.f75159a = authResult;
        this.f75160b = aVar;
    }
}

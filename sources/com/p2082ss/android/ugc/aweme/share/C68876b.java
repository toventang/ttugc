package com.p2082ss.android.ugc.aweme.share;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.share.api.C85157a;

/* renamed from: com.ss.android.ugc.aweme.share.b */
public final class C68876b implements AbstractC69357n {

    /* renamed from: a */
    public C85157a f154052a;

    /* renamed from: b */
    private Fragment f154053b;

    static {
        Covode.recordClassIndex(81181);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69357n
    /* renamed from: b */
    public final void mo109448b() {
        new C23144b(this.f154053b).mo37640e(R.string.g1u).mo37637b();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69357n
    /* renamed from: a */
    public final void mo109447a() {
        SharePrefCache.inst().getTwitterSecret().mo59935a();
        SharePrefCache.inst().getFacebookAccessToken().mo59935a();
        SharePrefCache.inst().getTwitterAccessToken().mo59935a();
        new C23144b(this.f154053b).mo37640e(R.string.fr8).mo37637b();
    }

    public C68876b(Fragment fragment) {
        this.f154053b = fragment;
        C85157a aVar = new C85157a();
        this.f154052a = aVar;
        aVar.mo67839a_(this);
    }
}

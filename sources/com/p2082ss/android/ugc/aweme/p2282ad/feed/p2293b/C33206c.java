package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.b.c */
public final class C33206c implements AbstractC33209f {

    /* renamed from: a */
    private final OnUIPlayListener f78906a;

    static {
        Covode.recordClassIndex(40029);
    }

    public C33206c(OnUIPlayListener onUIPlayListener) {
        C89219l.m154721d(onUIPlayListener, "");
        this.f78906a = onUIPlayListener;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33209f
    /* renamed from: a */
    public final void mo59136a(String str) {
        C89219l.m154721d(str, "");
        this.f78906a.onResumePlay(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33209f
    /* renamed from: b */
    public final void mo59139b(String str) {
        C89219l.m154721d(str, "");
        this.f78906a.onPausePlay(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33209f
    /* renamed from: c */
    public final void mo59140c(String str) {
        C89219l.m154721d(str, "");
        this.f78906a.onPlayCompleted(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33209f
    /* renamed from: a */
    public final void mo59137a(String str, long j) {
        C89219l.m154721d(str, "");
        this.f78906a.onRenderReady(new C84215n(str, false, j));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33209f
    /* renamed from: a */
    public final void mo59138a(String str, long j, long j2) {
        C89219l.m154721d(str, "");
        this.f78906a.onPlayProgressChange(str, j, j2);
    }
}

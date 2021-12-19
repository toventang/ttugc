package com.p2082ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63051l;
import com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.c */
final class C80997c implements AbstractC81002f.AbstractC81003a {

    /* renamed from: a */
    private AbstractC63051l f181055a;

    static {
        Covode.recordClassIndex(94315);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f.AbstractC81003a
    /* renamed from: a */
    public final void mo124436a() {
        this.f181055a.mo100977a(0.0f, 0.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f.AbstractC81003a
    /* renamed from: b */
    public final void mo124439b() {
        this.f181055a.mo100977a(1.0f, 1.0f);
    }

    C80997c(AbstractC63051l lVar) {
        this.f181055a = lVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f.AbstractC81003a
    /* renamed from: a */
    public final void mo124438a(String str) {
        this.f181055a.mo101004b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.simplayer.AbstractC81002f.AbstractC81003a
    /* renamed from: a */
    public final void mo124437a(float f, float f2) {
        this.f181055a.mo100977a(f, f2);
    }
}

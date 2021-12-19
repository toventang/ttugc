package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.ui.x */
final /* synthetic */ class RunnableC61239x implements Runnable {

    /* renamed from: a */
    private final C61225w.C612272 f139046a;

    /* renamed from: b */
    private final MusicModel f139047b;

    /* renamed from: c */
    private final boolean f139048c;

    static {
        Covode.recordClassIndex(71850);
    }

    RunnableC61239x(C61225w.C612272 r1, MusicModel musicModel, boolean z) {
        this.f139046a = r1;
        this.f139047b = musicModel;
        this.f139048c = z;
    }

    public final void run() {
        C61225w.C612272 r0 = this.f139046a;
        C61225w.this.f139006b.mo98596a(this.f139047b, this.f139048c);
    }
}

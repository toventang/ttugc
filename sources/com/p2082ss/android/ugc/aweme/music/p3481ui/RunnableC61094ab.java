package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.ab */
public final /* synthetic */ class RunnableC61094ab implements Runnable {

    /* renamed from: a */
    private final C61225w.C612272 f138656a;

    /* renamed from: b */
    private final MusicModel f138657b;

    static {
        Covode.recordClassIndex(71697);
    }

    RunnableC61094ab(C61225w.C612272 r1, MusicModel musicModel) {
        this.f138656a = r1;
        this.f138657b = musicModel;
    }

    public final void run() {
        C61225w.C612272 r0 = this.f138656a;
        C61225w.this.f139006b.mo98597a((Effect) null, this.f138657b);
    }
}

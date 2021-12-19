package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.ac */
public final /* synthetic */ class RunnableC61095ac implements Runnable {

    /* renamed from: a */
    private final C61225w.C612272 f138658a;

    /* renamed from: b */
    private final Effect f138659b;

    /* renamed from: c */
    private final MusicModel f138660c;

    static {
        Covode.recordClassIndex(71698);
    }

    RunnableC61095ac(C61225w.C612272 r1, Effect effect, MusicModel musicModel) {
        this.f138658a = r1;
        this.f138659b = effect;
        this.f138660c = musicModel;
    }

    public final void run() {
        C61225w.C612272 r0 = this.f138658a;
        C61225w.this.f139006b.mo98597a(this.f138659b, this.f138660c);
    }
}

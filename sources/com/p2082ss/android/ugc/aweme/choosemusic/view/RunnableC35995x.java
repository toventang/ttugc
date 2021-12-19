package com.p2082ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.x */
public final /* synthetic */ class RunnableC35995x implements Runnable {

    /* renamed from: a */
    private final C35991u f84992a;

    /* renamed from: b */
    private final int f84993b;

    /* renamed from: c */
    private final MusicModel f84994c;

    static {
        Covode.recordClassIndex(43241);
    }

    RunnableC35995x(C35991u uVar, int i, MusicModel musicModel) {
        this.f84992a = uVar;
        this.f84993b = i;
        this.f84994c = musicModel;
    }

    public final void run() {
        this.f84992a.mo63145b(this.f84993b, this.f84994c);
    }
}

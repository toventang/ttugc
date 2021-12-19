package com.p2082ss.android.ugc.aweme.choosemusic.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.w */
public final /* synthetic */ class RunnableC35994w implements Runnable {

    /* renamed from: a */
    private final C35991u f84989a;

    /* renamed from: b */
    private final int f84990b;

    /* renamed from: c */
    private final MusicModel f84991c;

    static {
        Covode.recordClassIndex(43240);
    }

    RunnableC35994w(C35991u uVar, int i, MusicModel musicModel) {
        this.f84989a = uVar;
        this.f84990b = i;
        this.f84991c = musicModel;
    }

    public final void run() {
        this.f84989a.mo63141a(this.f84990b, this.f84991c);
    }
}

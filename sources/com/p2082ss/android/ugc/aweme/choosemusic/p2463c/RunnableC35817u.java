package com.p2082ss.android.ugc.aweme.choosemusic.p2463c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.choosemusic.c.u */
public final /* synthetic */ class RunnableC35817u implements Runnable {

    /* renamed from: a */
    private final AbstractC35809r f84580a;

    /* renamed from: b */
    private final DmtTabLayout.C17294f f84581b;

    /* renamed from: c */
    private final MusicModel f84582c;

    static {
        Covode.recordClassIndex(43056);
    }

    RunnableC35817u(AbstractC35809r rVar, DmtTabLayout.C17294f fVar, MusicModel musicModel) {
        this.f84580a = rVar;
        this.f84581b = fVar;
        this.f84582c = musicModel;
    }

    public final void run() {
        this.f84580a.mo62916a(this.f84581b, this.f84582c);
    }
}

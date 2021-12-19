package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: com.ss.android.ugc.aweme.music.ui.y */
final /* synthetic */ class RunnableC61240y implements Runnable {

    /* renamed from: a */
    private final C61225w.C612272 f139049a;

    /* renamed from: b */
    private final boolean f139050b;

    /* renamed from: c */
    private final MusicModel f139051c;

    /* renamed from: d */
    private final MusicWaveBean f139052d;

    /* renamed from: e */
    private final String f139053e;

    /* renamed from: f */
    private final int f139054f;

    static {
        Covode.recordClassIndex(71851);
    }

    RunnableC61240y(C61225w.C612272 r1, boolean z, MusicModel musicModel, MusicWaveBean musicWaveBean, String str, int i) {
        this.f139049a = r1;
        this.f139050b = z;
        this.f139051c = musicModel;
        this.f139052d = musicWaveBean;
        this.f139053e = str;
        this.f139054f = i;
    }

    public final void run() {
        C61225w.C612272 r6 = this.f139049a;
        boolean z = this.f139050b;
        MusicModel musicModel = this.f139051c;
        MusicWaveBean musicWaveBean = this.f139052d;
        String str = this.f139053e;
        int i = this.f139054f;
        C61225w.this.f139006b.mo98602d_(z);
        musicModel.setMusicWaveBean(musicWaveBean);
        C61225w.this.f139006b.mo98598a(str, musicModel, i);
    }
}

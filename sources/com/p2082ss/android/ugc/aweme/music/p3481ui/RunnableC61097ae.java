package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61225w;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ae */
final /* synthetic */ class RunnableC61097ae implements Runnable {

    /* renamed from: a */
    private final C61225w.C612303 f138663a;

    /* renamed from: b */
    private final MusicModel f138664b;

    /* renamed from: c */
    private final MusicWaveBean f138665c;

    /* renamed from: d */
    private final String f138666d;

    /* renamed from: e */
    private final int f138667e;

    static {
        Covode.recordClassIndex(71700);
    }

    RunnableC61097ae(C61225w.C612303 r1, MusicModel musicModel, MusicWaveBean musicWaveBean, String str, int i) {
        this.f138663a = r1;
        this.f138664b = musicModel;
        this.f138665c = musicWaveBean;
        this.f138666d = str;
        this.f138667e = i;
    }

    public final void run() {
        C61225w.C612303 r6 = this.f138663a;
        MusicModel musicModel = this.f138664b;
        MusicWaveBean musicWaveBean = this.f138665c;
        String str = this.f138666d;
        int i = this.f138667e;
        C61225w.this.f139006b.mo98602d_(false);
        musicModel.setMusicWaveBean(musicWaveBean);
        C61225w.this.f139006b.mo98598a(str, musicModel, i);
    }
}

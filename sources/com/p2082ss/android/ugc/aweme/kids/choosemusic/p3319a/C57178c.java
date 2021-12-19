package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57320o;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.c */
final /* synthetic */ class C57178c implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    private final C57320o f130199a;

    static {
        Covode.recordClassIndex(67079);
    }

    C57178c(C57320o oVar) {
        this.f130199a = oVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C57320o oVar = this.f130199a;
        mediaPlayer.start();
        oVar.mo94503a(false, true);
    }
}

package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36050s;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.d */
final /* synthetic */ class C35708d implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    private final C36050s f84237a;

    static {
        Covode.recordClassIndex(42940);
    }

    C35708d(C36050s sVar) {
        this.f84237a = sVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C36050s sVar = this.f84237a;
        mediaPlayer.start();
        sVar.mo63155a(false, true);
    }
}

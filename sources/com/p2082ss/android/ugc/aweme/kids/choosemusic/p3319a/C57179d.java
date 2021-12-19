package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i.C57146b;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.d */
final /* synthetic */ class C57179d implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    static final MediaPlayer.OnErrorListener f130200a = new C57179d();

    static {
        Covode.recordClassIndex(67080);
    }

    private C57179d() {
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (C57146b.f130106a == null) {
            return false;
        }
        C57146b.f130106a.release();
        C57146b.f130106a = null;
        return false;
    }
}

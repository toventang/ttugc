package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60825c;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.e */
final /* synthetic */ class C35709e implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    static final MediaPlayer.OnErrorListener f84238a = new C35709e();

    static {
        Covode.recordClassIndex(42941);
    }

    private C35709e() {
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (C60825c.f138233a == null) {
            return false;
        }
        C60825c.f138233a.release();
        C60825c.f138233a = null;
        return false;
    }
}

package com.p2082ss.android.p2092ad.splash.core.video.p2106a;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.video.a.c */
public final class C29567c implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a */
    private final WeakReference<C29568d> f70447a;

    static {
        Covode.recordClassIndex(35962);
    }

    public C29567c(C29568d dVar) {
        this.f70447a = new WeakReference<>(dVar);
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f70447a.get() != null) {
            C29568d dVar = this.f70447a.get();
            if (dVar.f70444e != null) {
                dVar.f70444e.mo51800d();
            }
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (this.f70447a.get() != null) {
            C29568d dVar = this.f70447a.get();
            if (dVar.f70440a != null) {
                dVar.f70440a.mo51803e();
            }
        }
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f70447a.get() != null) {
            C29568d dVar = this.f70447a.get();
            if (dVar.f70443d != null) {
                dVar.f70443d.mo51798f();
            }
        }
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (this.f70447a.get() != null) {
            C29568d dVar = this.f70447a.get();
            if (dVar.f70442c != null) {
                dVar.f70442c.mo51799a(dVar, i);
            }
        }
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f70447a.get() != null) {
            this.f70447a.get();
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f70447a.get() == null) {
            return false;
        }
        C29568d dVar = this.f70447a.get();
        if (dVar.f70441b == null) {
            return false;
        }
        dVar.f70441b.mo51801a(i, i2);
        return false;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f70447a.get() == null) {
            return false;
        }
        C29568d dVar = this.f70447a.get();
        if (dVar.f70445f == null) {
            return false;
        }
        dVar.f70445f.mo51802a(dVar, i, i2);
        return false;
    }
}

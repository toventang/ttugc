package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer */
public class RepeatMusicPlayer implements AbstractC33974au {

    /* renamed from: a */
    public MediaPlayer f157942a;

    /* renamed from: b */
    public int f157943b;

    /* renamed from: c */
    public Handler f157944c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public Runnable f157945d = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.RunnableC705861 */

        static {
            Covode.recordClassIndex(83052);
        }

        public final void run() {
            int currentPosition;
            if (RepeatMusicPlayer.this.f157942a != null && RepeatMusicPlayer.this.f157942a.isPlaying() && (currentPosition = RepeatMusicPlayer.this.f157942a.getCurrentPosition()) <= RepeatMusicPlayer.this.f157942a.getDuration()) {
                if (RepeatMusicPlayer.this.f157946e != null) {
                    RepeatMusicPlayer.this.f157946e.mo88314f(currentPosition);
                }
                RepeatMusicPlayer.this.f157944c.post(RepeatMusicPlayer.this.f157945d);
            }
        }
    };

    /* renamed from: e */
    public AbstractC70589a f157946e;

    /* renamed from: f */
    private int f157947f;

    /* renamed from: g */
    private Runnable f157948g;

    /* renamed from: h */
    private Handler f157949h = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer$a */
    public interface AbstractC70589a {
        static {
            Covode.recordClassIndex(83055);
        }

        /* renamed from: f */
        void mo88314f(int i);
    }

    static {
        Covode.recordClassIndex(83051);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            pause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f157949h.removeCallbacksAndMessages(null);
        this.f157944c.removeCallbacksAndMessages(null);
        mo111361a();
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void pause() {
        MediaPlayer mediaPlayer = this.f157942a;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f157942a.pause();
        }
        this.f157944c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo111361a() {
        C40970e.m82485a("stopMusic() called");
        MediaPlayer mediaPlayer = this.f157942a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f157942a.pause();
            }
            this.f157942a.stop();
            this.f157942a.release();
            this.f157942a = null;
        }
        this.f157944c.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    private Runnable m124703b(final int i) {
        return new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.RunnableC705872 */

            static {
                Covode.recordClassIndex(83053);
            }

            public final void run() {
                if (RepeatMusicPlayer.this.f157942a != null) {
                    if (RepeatMusicPlayer.this.f157942a.isPlaying()) {
                        RepeatMusicPlayer.this.f157942a.pause();
                    }
                    RepeatMusicPlayer.this.mo111362a(i);
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo111362a(int i) {
        this.f157943b = i;
        C40970e.m82485a("playMusic() called");
        MediaPlayer mediaPlayer = this.f157942a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f157942a.pause();
            }
            Runnable runnable = this.f157948g;
            if (runnable != null) {
                this.f157949h.removeCallbacks(runnable);
            }
            this.f157948g = m124703b(i);
            this.f157942a.seekTo(i);
            this.f157949h.postDelayed(this.f157948g, (long) this.f157947f);
            this.f157942a.start();
            Runnable runnable2 = this.f157945d;
            if (runnable2 != null) {
                this.f157944c.removeCallbacks(runnable2);
            }
            this.f157944c.post(this.f157945d);
        }
    }

    public RepeatMusicPlayer(ActivityC33402b bVar, String str, int i) {
        this.f157947f = i;
        bVar.getLifecycle().mo4012a(this);
        MediaPlayer create = MediaPlayer.create(bVar, Uri.parse(str));
        this.f157942a = create;
        if (create != null) {
            create.setAudioStreamType(3);
            this.f157942a.setDisplay(null);
            this.f157942a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer.C705883 */

                static {
                    Covode.recordClassIndex(83054);
                }

                public final void onCompletion(MediaPlayer mediaPlayer) {
                    RepeatMusicPlayer repeatMusicPlayer = RepeatMusicPlayer.this;
                    repeatMusicPlayer.mo111362a(repeatMusicPlayer.f157943b);
                }
            });
        }
    }
}

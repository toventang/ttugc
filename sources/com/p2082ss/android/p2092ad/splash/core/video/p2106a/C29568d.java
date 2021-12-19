package com.p2082ss.android.p2092ad.splash.core.video.p2106a;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;

/* renamed from: com.ss.android.ad.splash.core.video.a.d */
public final class C29568d extends AbstractC29558a {

    /* renamed from: g */
    public final MediaPlayer f70448g;

    /* renamed from: h */
    private final C29567c f70449h;

    /* renamed from: i */
    private MediaDataSource f70450i;

    /* renamed from: j */
    private final Object f70451j;

    /* renamed from: k */
    private boolean f70452k;

    static {
        Covode.recordClassIndex(35963);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: b */
    public final void mo51789b() {
        this.f70448g.pause();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: c */
    public final void mo51790c() {
        this.f70448g.setScreenOnWhilePlaying(true);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: d */
    public final void mo51791d() {
        this.f70448g.stop();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: h */
    public final void mo51795h() {
        this.f70448g.start();
    }

    /* renamed from: k */
    private void m59448k() {
        MediaDataSource mediaDataSource = this.f70450i;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f70450i = null;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: f */
    public final long mo51793f() {
        try {
            return (long) this.f70448g.getDuration();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: i */
    public final long mo51796i() {
        try {
            return (long) this.f70448g.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: e */
    public final void mo51792e() {
        this.f70452k = true;
        this.f70448g.release();
        m59448k();
        mo51776a();
        m59449l();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: g */
    public final void mo51794g() {
        try {
            this.f70448g.reset();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        m59448k();
        mo51776a();
        m59449l();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: j */
    public final void mo51797j() {
        MediaPlayer mediaPlayer = this.f70448g;
        if (mediaPlayer != null && !this.f70452k && mediaPlayer.isPlaying()) {
            this.f70448g.setVolume(0.0f, 0.0f);
        }
    }

    public C29568d() {
        MediaPlayer mediaPlayer;
        MethodCollector.m26663i(10405);
        Object obj = new Object();
        this.f70451j = obj;
        synchronized (obj) {
            try {
                mediaPlayer = new MediaPlayer();
                this.f70448g = mediaPlayer;
            } catch (Throwable th) {
                MethodCollector.m26664o(10405);
                throw th;
            }
        }
        mediaPlayer.setAudioStreamType(3);
        this.f70449h = new C29567c(this);
        m59449l();
        MethodCollector.m26664o(10405);
    }

    /* renamed from: l */
    private void m59449l() {
        this.f70448g.setOnSeekCompleteListener(this.f70449h);
        this.f70448g.setOnInfoListener(this.f70449h);
        this.f70448g.setOnCompletionListener(this.f70449h);
        this.f70448g.setOnVideoSizeChangedListener(this.f70449h);
        this.f70448g.setOnPreparedListener(this.f70449h);
        this.f70448g.setOnErrorListener(this.f70449h);
        this.f70448g.setOnBufferingUpdateListener(this.f70449h);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: a */
    public final void mo51783a(long j) {
        this.f70448g.seekTo((int) j);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: a */
    public final void mo51784a(Context context) {
        this.f70448g.setWakeMode(context, 10);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: a */
    public final void mo51785a(Surface surface) {
        this.f70448g.setSurface(surface);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: a */
    public final void mo51786a(SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(10406);
        synchronized (this.f70451j) {
            try {
                if (!this.f70452k) {
                    this.f70448g.setDisplay(surfaceHolder);
                }
            } finally {
                MethodCollector.m26664o(10406);
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: a */
    public final void mo51787a(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.f70448g.setDataSource(str);
        } else {
            this.f70448g.setDataSource(parse.getPath());
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.video.p2106a.AbstractC29559b
    /* renamed from: a */
    public final void mo51788a(boolean z) {
        this.f70448g.setLooping(z);
    }
}

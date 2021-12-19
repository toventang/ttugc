package com.p2082ss.android.ugc.aweme.livewallpaper;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58862k;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.RunnableC58860j;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.a */
public final class C58821a {

    /* renamed from: a */
    C58862k f133900a;

    /* renamed from: b */
    public MediaPlayer f133901b;

    /* renamed from: c */
    RunnableC58860j f133902c;

    /* renamed from: d */
    SurfaceHolder f133903d;

    /* renamed from: e */
    Surface f133904e;

    /* renamed from: f */
    public LiveWallPaperBean f133905f;

    /* renamed from: g */
    public boolean f133906g;

    /* renamed from: h */
    private AbstractC58825a f133907h;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.a$a */
    public interface AbstractC58825a {
        static {
            Covode.recordClassIndex(69139);
        }

        /* renamed from: a */
        void mo96192a(boolean z, String str, String str2);
    }

    static {
        Covode.recordClassIndex(69135);
    }

    /* renamed from: c */
    public final void mo96219c() {
        MediaPlayer mediaPlayer = this.f133901b;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f133901b.pause();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo96220d() {
        MediaPlayer mediaPlayer;
        LiveWallPaperBean liveWallPaperBean = this.f133905f;
        if (liveWallPaperBean != null && !liveWallPaperBean.isForceToPause() && (mediaPlayer = this.f133901b) != null && !mediaPlayer.isPlaying()) {
            this.f133901b.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo96218b() {
        if (this.f133905f.isShouldMute()) {
            this.f133901b.setVolume(0.0f, 0.0f);
        } else {
            this.f133901b.setVolume(this.f133905f.getVolume(), this.f133905f.getVolume());
        }
    }

    /* renamed from: a */
    public final void mo96213a() {
        MediaPlayer mediaPlayer = this.f133901b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f133901b = null;
        }
        Surface surface = this.f133904e;
        if (surface != null) {
            surface.release();
            this.f133904e = null;
        }
        RunnableC58860j jVar = this.f133902c;
        if (jVar != null) {
            jVar.mo96287d();
        }
        C58862k kVar = this.f133900a;
        if (kVar != null) {
            kVar.release();
        }
        this.f133903d = null;
    }

    public C58821a(AbstractC58825a aVar) {
        this.f133907h = aVar;
    }

    /* renamed from: a */
    public final void mo96214a(float f) {
        LiveWallPaperBean liveWallPaperBean;
        if (this.f133901b != null && (liveWallPaperBean = this.f133905f) != null && !liveWallPaperBean.isShouldMute()) {
            this.f133905f.setVolume(f);
            this.f133901b.setVolume(f, f);
        }
    }

    /* renamed from: a */
    public final void mo96217a(boolean z, String str) {
        AbstractC58825a aVar = this.f133907h;
        if (aVar != null) {
            aVar.mo96192a(z, this.f133905f.getSource(), str);
        }
    }

    /* renamed from: a */
    public final void mo96215a(SurfaceHolder surfaceHolder, int i, int i2) {
        this.f133903d = surfaceHolder;
        RunnableC58860j jVar = this.f133902c;
        if (jVar != null) {
            jVar.mo96283a(i, i2);
        }
    }

    /* renamed from: a */
    static Pair<Float, Float> m108030a(int i, int i2, int i3, int i4) {
        float f;
        float f2 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        if (i4 <= 0 || i3 <= 0 || i2 <= 0 || i <= 0) {
            return new Pair<>(valueOf, valueOf);
        }
        float f3 = ((float) i3) / ((float) i4);
        float f4 = ((float) i) / ((float) i2);
        if (f3 < f4) {
            f = f4 / f3;
        } else {
            f2 = f3 / f4;
            f = 1.0f;
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo96216a(SurfaceHolder surfaceHolder, String str, int i, int i2) {
        this.f133903d = surfaceHolder;
        if (surfaceHolder != null) {
            Surface surface = surfaceHolder.getSurface();
            Rect surfaceFrame = this.f133903d.getSurfaceFrame();
            int height = surfaceFrame.height();
            int width = surfaceFrame.width();
            Pair<Float, Float> a = m108030a(width, height, i, i2);
            MediaPlayer mediaPlayer = this.f133901b;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.f133901b = null;
            }
            Surface surface2 = this.f133904e;
            if (surface2 != null) {
                surface2.release();
                this.f133904e = null;
            }
            RunnableC58860j jVar = this.f133902c;
            if (jVar != null) {
                jVar.mo96287d();
            }
            C58862k kVar = this.f133900a;
            if (kVar != null) {
                kVar.release();
            }
            RunnableC58860j jVar2 = new RunnableC58860j(surface);
            this.f133902c = jVar2;
            jVar2.f133988n = a;
            this.f133902c.mo96288e();
            C58862k f = this.f133902c.mo96289f();
            this.f133900a = f;
            if (f != null) {
                f.setDefaultBufferSize(width, height);
                surface = new Surface(this.f133900a);
            }
            this.f133904e = surface;
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f133901b = mediaPlayer2;
            try {
                mediaPlayer2.setSurface(surface);
                this.f133901b.setDataSource(str);
                this.f133901b.setLooping(true);
                mo96218b();
                this.f133901b.prepare();
                this.f133901b.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                    /* class com.p2082ss.android.ugc.aweme.livewallpaper.C58821a.C588221 */

                    static {
                        Covode.recordClassIndex(69136);
                    }

                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        C58821a.this.mo96217a(false, "onSurfaceCreated media play error what = " + i + " extra = " + i2);
                        return false;
                    }
                });
                mo96220d();
            } catch (Exception e) {
                e.printStackTrace();
                mo96217a(false, "onSurfaceCreated media play exception " + e.getMessage());
            }
        }
    }
}

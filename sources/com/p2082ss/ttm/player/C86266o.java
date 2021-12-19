package com.p2082ss.ttm.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttm.player.AbstractC86253m;
import java.io.FileDescriptor;
import java.util.Map;

/* renamed from: com.ss.ttm.player.o */
public final class C86266o extends AbstractC86265n {

    /* renamed from: a */
    protected AbstractC86253m.AbstractC86258e f192692a;

    /* renamed from: b */
    protected AbstractC86253m.AbstractC86256c f192693b;

    /* renamed from: c */
    protected AbstractC86253m.AbstractC86260g f192694c;

    /* renamed from: d */
    protected AbstractC86253m.AbstractC86255b f192695d;

    /* renamed from: e */
    protected AbstractC86253m.AbstractC86262i f192696e;

    /* renamed from: f */
    protected AbstractC86253m.AbstractC86254a f192697f;

    /* renamed from: g */
    private MediaPlayer f192698g;

    /* renamed from: h */
    private AbstractC86253m f192699h;

    static {
        Covode.recordClassIndex(101443);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136723a(int i, int i2) {
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136729a(IMediaDataSource iMediaDataSource) {
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136730a(AbstractC86246f fVar) {
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136734a(AbstractC86253m.AbstractC86257d dVar) {
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136739a(AbstractC86253m.AbstractC86264k kVar) {
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: c */
    public final int mo136751c() {
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: i */
    public final void mo136760i() {
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136743a(boolean z) {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setLooping(z);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136732a(AbstractC86253m.AbstractC86255b bVar) {
        this.f192695d = bVar;
        this.f192698g.setOnCompletionListener(new C86269b(bVar, this.f192699h));
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136733a(AbstractC86253m.AbstractC86256c cVar) {
        this.f192693b = cVar;
        this.f192698g.setOnErrorListener(new C86270c(cVar, this.f192699h));
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136735a(AbstractC86253m.AbstractC86258e eVar) {
        this.f192692a = eVar;
        this.f192698g.setOnInfoListener(new C86271d(eVar, this.f192699h));
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136736a(AbstractC86253m.AbstractC86260g gVar) {
        this.f192694c = gVar;
        this.f192698g.setOnPreparedListener(new C86272e(gVar, this.f192699h));
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136737a(AbstractC86253m.AbstractC86262i iVar) {
        this.f192696e = iVar;
        this.f192698g.setOnSeekCompleteListener(new C86273f(iVar, this.f192699h));
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136738a(AbstractC86253m.AbstractC86263j jVar) {
        this.f192698g.setOnVideoSizeChangedListener(new C86274g(jVar, this.f192699h));
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136741a(FileDescriptor fileDescriptor, long j, long j2) {
        this.f192698g.setDataSource(fileDescriptor, j, j2);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136740a(C86275p pVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            PlaybackParams playbackParams = new PlaybackParams();
            float f = pVar.f192718d;
            if (f > 0.0f) {
                playbackParams.setSpeed(f);
            }
            int i = pVar.f192716b;
            if (i >= 0) {
                playbackParams.setAudioFallbackMode(i);
            }
            float f2 = pVar.f192717c;
            if (f2 > 0.0f) {
                playbackParams.setPitch(f2);
            }
            MediaPlayer mediaPlayer = this.f192698g;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setPlaybackParams(playbackParams);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: e */
    public final void mo136754e() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: f */
    public final void mo136755f() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: g */
    public final void mo136756g() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: h */
    public final void mo136758h() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: k */
    public final void mo136762k() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.prepareAsync();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: j */
    public final void mo136761j() {
        new Thread(new Runnable() {
            /* class com.p2082ss.ttm.player.C86266o.RunnableC862671 */

            static {
                Covode.recordClassIndex(101444);
            }

            public final void run() {
                C86266o.this.mo136753d();
            }
        }).start();
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: l */
    public final int mo136763l() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getCurrentPosition();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: m */
    public final int mo136764m() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoHeight();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: n */
    public final int mo136765n() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getVideoWidth();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: o */
    public final int mo136766o() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.getDuration();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: p */
    public final boolean mo136767p() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                return mediaPlayer.isPlaying();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: q */
    public final void mo136768q() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setScreenOnWhilePlaying(true);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: d */
    public final void mo136753d() {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception unused) {
            } finally {
                this.f192698g = null;
            }
        }
    }

    /* renamed from: com.ss.ttm.player.o$b */
    static class C86269b implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        private AbstractC86253m.AbstractC86255b f192703a;

        /* renamed from: b */
        private AbstractC86253m f192704b;

        static {
            Covode.recordClassIndex(101446);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f192703a.mo16759a(this.f192704b);
        }

        public C86269b(AbstractC86253m.AbstractC86255b bVar, AbstractC86253m mVar) {
            this.f192704b = mVar;
            this.f192703a = bVar;
        }
    }

    /* renamed from: com.ss.ttm.player.o$e */
    static class C86272e implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        private AbstractC86253m.AbstractC86260g f192709a;

        /* renamed from: b */
        private AbstractC86253m f192710b;

        static {
            Covode.recordClassIndex(101449);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f192709a.mo16757a(this.f192710b);
        }

        public C86272e(AbstractC86253m.AbstractC86260g gVar, AbstractC86253m mVar) {
            this.f192709a = gVar;
            this.f192710b = mVar;
        }
    }

    /* renamed from: com.ss.ttm.player.o$f */
    static class C86273f implements MediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        private AbstractC86253m.AbstractC86262i f192711a;

        /* renamed from: b */
        private AbstractC86253m f192712b;

        static {
            Covode.recordClassIndex(101450);
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            this.f192711a.mo136844a();
        }

        public C86273f(AbstractC86253m.AbstractC86262i iVar, AbstractC86253m mVar) {
            this.f192711a = iVar;
            this.f192712b = mVar;
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136722a(int i) {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(i);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: b */
    public final void mo136748b(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setDisplay(surfaceHolder);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static final synchronized C86266o m148462a(AbstractC86253m mVar) {
        C86266o oVar;
        synchronized (C86266o.class) {
            MethodCollector.m26663i(3539);
            oVar = new C86266o();
            oVar.f192698g = new MediaPlayer();
            oVar.f192699h = mVar;
            MethodCollector.m26664o(3539);
        }
        return oVar;
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136727a(Surface surface) {
        this.f192698g.setSurface(surface);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136731a(AbstractC86253m.AbstractC86254a aVar) {
        this.f192697f = aVar;
        this.f192698g.setOnBufferingUpdateListener(new C86268a(aVar, this.f192699h));
    }

    /* renamed from: com.ss.ttm.player.o$a */
    static class C86268a implements MediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a */
        private AbstractC86253m.AbstractC86254a f192701a;

        /* renamed from: b */
        private AbstractC86253m f192702b;

        static {
            Covode.recordClassIndex(101445);
        }

        public C86268a(AbstractC86253m.AbstractC86254a aVar, AbstractC86253m mVar) {
            this.f192702b = mVar;
            this.f192701a = aVar;
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            this.f192701a.mo136842a(i);
        }
    }

    /* renamed from: com.ss.ttm.player.o$c */
    static class C86270c implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        private AbstractC86253m.AbstractC86256c f192705a;

        /* renamed from: b */
        private AbstractC86253m f192706b;

        static {
            Covode.recordClassIndex(101447);
        }

        public C86270c(AbstractC86253m.AbstractC86256c cVar, AbstractC86253m mVar) {
            this.f192706b = mVar;
            this.f192705a = cVar;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f192705a.mo16758a(this.f192706b, i, i2);
        }
    }

    /* renamed from: com.ss.ttm.player.o$d */
    static class C86271d implements MediaPlayer.OnInfoListener {

        /* renamed from: a */
        private AbstractC86253m.AbstractC86258e f192707a;

        /* renamed from: b */
        private AbstractC86253m f192708b;

        static {
            Covode.recordClassIndex(101448);
        }

        public C86271d(AbstractC86253m.AbstractC86258e eVar, AbstractC86253m mVar) {
            this.f192708b = mVar;
            this.f192707a = eVar;
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f192707a.mo16760a(this.f192708b, i, i2);
        }
    }

    /* renamed from: com.ss.ttm.player.o$g */
    static class C86274g implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        private AbstractC86253m.AbstractC86263j f192713a;

        /* renamed from: b */
        private AbstractC86253m f192714b;

        static {
            Covode.recordClassIndex(101451);
        }

        public C86274g(AbstractC86253m.AbstractC86263j jVar, AbstractC86253m mVar) {
            this.f192713a = jVar;
            this.f192714b = mVar;
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            this.f192713a.mo136845a(this.f192714b, i, i2);
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136721a(float f, float f2) {
        MediaPlayer mediaPlayer = this.f192698g;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136725a(Context context, Uri uri) {
        this.f192698g.setDataSource(context, uri);
    }

    @Override // com.p2082ss.ttm.player.AbstractC86265n
    /* renamed from: a */
    public final void mo136726a(Context context, Uri uri, Map<String, String> map) {
        this.f192698g.setDataSource(context, uri, map);
    }
}

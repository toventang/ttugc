package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1372a;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19156a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19157b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.p1364b.C19004g;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import java.io.FileDescriptor;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b */
public final class C19075b implements AbstractC19163h {

    /* renamed from: g */
    public static final String f45173g = C19075b.class.getSimpleName();

    /* renamed from: h */
    public static final C19076a f45174h = new C19076a((byte) 0);

    /* renamed from: a */
    public boolean f45175a;

    /* renamed from: b */
    public boolean f45176b;

    /* renamed from: c */
    public boolean f45177c;

    /* renamed from: d */
    public EnumC19170o f45178d = EnumC19170o.PLAYBACK_STATE_STOPPED;

    /* renamed from: e */
    public final Context f45179e;

    /* renamed from: f */
    public final AbstractC19156a f45180f;

    /* renamed from: i */
    private MediaPlayer f45181i;

    /* renamed from: j */
    private long f45182j;

    /* renamed from: k */
    private boolean f45183k;

    /* renamed from: l */
    private boolean f45184l;

    /* renamed from: m */
    private boolean f45185m = true;

    /* renamed from: n */
    private long f45186n = Long.MIN_VALUE;

    /* renamed from: o */
    private long f45187o = Long.MIN_VALUE;

    /* renamed from: p */
    private final Handler f45188p = new Handler(Looper.getMainLooper());

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: g */
    public final int mo30437g() {
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: h */
    public final long mo30438h() {
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: j */
    public final boolean mo30440j() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b$a */
    public static final class C19076a {
        static {
            Covode.recordClassIndex(21839);
        }

        private C19076a() {
        }

        public /* synthetic */ C19076a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: d */
    public final EnumC19170o mo30434d() {
        return this.f45178d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b$e */
    public static final class RunnableC19080e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C19075b f45194a;

        static {
            Covode.recordClassIndex(21843);
        }

        RunnableC19080e(C19075b bVar) {
            this.f45194a = bVar;
        }

        public final void run() {
            this.f45194a.mo30443m();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b$f */
    public static final class RunnableC19081f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C19075b f45195a;

        static {
            Covode.recordClassIndex(21844);
        }

        RunnableC19081f(C19075b bVar) {
            this.f45195a = bVar;
        }

        public final void run() {
            this.f45195a.mo30443m();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: i */
    public final void mo30439i() {
        C19004g.f44970a.mo30155a(f45173g, " ---> release()");
        m35485o();
    }

    static {
        Covode.recordClassIndex(21838);
    }

    /* renamed from: n */
    private final void m35484n() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnPreparedListener(new C19077b(this));
        mediaPlayer.setOnCompletionListener(new C19078c(this));
        mediaPlayer.setLooping(false);
        this.f45181i = mediaPlayer;
    }

    /* renamed from: o */
    private final void m35485o() {
        MediaPlayer mediaPlayer = this.f45181i;
        if (mediaPlayer != null) {
            mo30441k();
            mediaPlayer.setOnCompletionListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setOnSeekCompleteListener(null);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.f45181i = null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: c */
    public final void mo30433c() {
        C19004g.f44970a.mo30155a(f45173g, " ---> resume(), mIsPaused: " + this.f45184l);
        if (this.f45184l) {
            mo30442l();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: e */
    public final long mo30435e() {
        MediaPlayer mediaPlayer;
        try {
            if (!this.f45175a || (mediaPlayer = this.f45181i) == null) {
                return 0;
            }
            return (long) mediaPlayer.getCurrentPosition();
        } catch (Throwable unused) {
            m35485o();
            return 0;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: f */
    public final long mo30436f() {
        MediaPlayer mediaPlayer;
        try {
            if (!this.f45175a || (mediaPlayer = this.f45181i) == null) {
                return 0;
            }
            return (long) mediaPlayer.getDuration();
        } catch (Throwable th) {
            C19004g.f44970a.mo30157c(f45173g, th.getMessage());
            m35485o();
            return 0;
        }
    }

    /* renamed from: k */
    public final void mo30441k() {
        C19004g.f44970a.mo30155a(f45173g, " ---> resetFlags()");
        this.f45185m = true;
        this.f45176b = false;
        this.f45183k = false;
        this.f45183k = false;
        this.f45184l = false;
        this.f45177c = false;
        mo30430a(false);
    }

    /* renamed from: m */
    public final void mo30443m() {
        long e = mo30435e();
        if (e != this.f45186n) {
            this.f45180f.mo30480b(this, e);
            if (Math.abs(e - this.f45187o) >= 500) {
                this.f45180f.mo30473a(this, e);
                this.f45187o = e;
            }
            this.f45186n = e;
        }
        this.f45188p.postAtTime(new RunnableC19081f(this), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30423a() {
        C19004g.f44970a.mo30155a(f45173g, " ---> stop(), mIsStopped: " + this.f45185m);
        if (!this.f45185m) {
            try {
                MediaPlayer mediaPlayer = this.f45181i;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
                EnumC19170o oVar = EnumC19170o.PLAYBACK_STATE_STOPPED;
                this.f45178d = oVar;
                this.f45180f.mo30475a(this, oVar);
                mo30441k();
                MediaPlayer mediaPlayer2 = this.f45181i;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnSeekCompleteListener(null);
                }
                MediaPlayer mediaPlayer3 = this.f45181i;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.seekTo(0);
                }
            } catch (Throwable th) {
                C19004g.f44970a.mo30157c(f45173g, th.getMessage());
                m35485o();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: b */
    public final void mo30431b() {
        C19004g.f44970a.mo30155a(f45173g, " ---> pause(), mIsStarted: " + this.f45183k);
        if (this.f45183k) {
            try {
                MediaPlayer mediaPlayer = this.f45181i;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Throwable th) {
                C19004g.f44970a.mo30157c(f45173g, th.getMessage());
                m35485o();
            }
            this.f45184l = true;
            this.f45183k = false;
            this.f45176b = false;
            this.f45185m = false;
            EnumC19170o oVar = EnumC19170o.PLAYBACK_STATE_PAUSED;
            this.f45178d = oVar;
            this.f45180f.mo30475a(this, oVar);
            mo30430a(false);
        }
    }

    /* renamed from: l */
    public final void mo30442l() {
        C19004g.f44970a.mo30155a(f45173g, " ---> start(), startPlayTime: " + this.f45182j + ",   mIsStart: " + this.f45183k + ",   mIsPendingStart: " + this.f45176b + ",   mIsPrepared: " + this.f45175a);
        long j = this.f45182j;
        if (j > 0) {
            mo30425a(j, (AbstractC19168m) null);
            this.f45182j = 0;
        }
        try {
            MediaPlayer mediaPlayer = this.f45181i;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            this.f45183k = true;
            this.f45176b = false;
            this.f45184l = false;
            this.f45185m = false;
            EnumC19170o oVar = EnumC19170o.PLAYBACK_STATE_PLAYING;
            this.f45178d = oVar;
            this.f45180f.mo30475a(this, oVar);
            mo30430a(true);
        } catch (Throwable th) {
            C19004g.f44970a.mo30157c(f45173g, th.getMessage());
            this.f45180f.mo30471a(EnumC19157b.INVALIDATE_PLAYER_MODEL);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30428a(String str) {
        mo30432b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b$c */
    public static final class C19078c implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        final /* synthetic */ C19075b f45190a;

        static {
            Covode.recordClassIndex(21841);
        }

        C19078c(C19075b bVar) {
            this.f45190a = bVar;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f45190a.mo30441k();
            this.f45190a.f45178d = EnumC19170o.PLAYBACK_STATE_STOPPED;
            AbstractC19156a aVar = this.f45190a.f45180f;
            C19075b bVar = this.f45190a;
            aVar.mo30475a(bVar, bVar.f45178d);
            this.f45190a.f45180f.mo30484d(this.f45190a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b$d */
    public static final class C19079d implements MediaPlayer.OnSeekCompleteListener {

        /* renamed from: a */
        final /* synthetic */ C19075b f45191a;

        /* renamed from: b */
        final /* synthetic */ AbstractC19168m f45192b;

        /* renamed from: c */
        final /* synthetic */ long f45193c;

        static {
            Covode.recordClassIndex(21842);
        }

        C19079d(C19075b bVar, AbstractC19168m mVar, long j) {
            this.f45191a = bVar;
            this.f45192b = mVar;
            this.f45193c = j;
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            AbstractC19168m mVar = this.f45192b;
            if (mVar != null) {
                mVar.mo30489a(this.f45193c, true);
            }
            this.f45191a.mo30430a(true);
            this.f45191a.f45177c = false;
        }
    }

    /* renamed from: a */
    public final void mo30430a(boolean z) {
        if (z) {
            this.f45188p.postAtTime(new RunnableC19080e(this), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.f45188p.removeCallbacksAndMessages(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a.b$b */
    public static final class C19077b implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ C19075b f45189a;

        static {
            Covode.recordClassIndex(21840);
        }

        C19077b(C19075b bVar) {
            this.f45189a = bVar;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            C19004g.f44970a.mo30155a(C19075b.f45173g, "---> onPrepared()");
            this.f45189a.f45175a = true;
            this.f45189a.f45180f.mo30479b(this.f45189a);
            if (this.f45189a.f45176b) {
                this.f45189a.mo30442l();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30424a(long j) {
        C19004g.f44970a.mo30155a(f45173g, " ---> play(), startPlayTime: " + j + ",   mIsStart: " + this.f45183k + ",   mIsPendingStart: " + this.f45176b + ",   mIsPrepared: " + this.f45175a);
        if (!this.f45183k && !this.f45176b) {
            this.f45182j = j;
            if (this.f45175a) {
                mo30442l();
            } else {
                this.f45176b = true;
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: b */
    public final void mo30432b(String str) {
        C19004g gVar = C19004g.f44970a;
        String str2 = f45173g;
        gVar.mo30155a(str2, " ---> setDirectURL(), url is ".concat(String.valueOf(str)));
        try {
            if (this.f45181i == null) {
                C19004g.f44970a.mo30155a(str2, "mediaplayer is null ---> createMediaPlayer");
                m35484n();
            }
            MediaPlayer mediaPlayer = this.f45181i;
            if (mediaPlayer != null) {
                this.f45175a = false;
                mediaPlayer.reset();
                if (str == null || !C89361p.m154874b(str, "http", false)) {
                    mediaPlayer.setDataSource(this.f45179e, Uri.parse(str));
                } else {
                    mediaPlayer.setDataSource(str);
                }
                this.f45180f.mo30472a(this);
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            C19004g.f44970a.mo30157c(f45173g, th.getMessage());
            this.f45180f.mo30471a(EnumC19157b.INVALIDATE_PLAYER_MODEL);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30429a(String str, String str2) {
        mo30432b(str);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30426a(EnumC86649v vVar, C86535p pVar) {
        C19004g.f44970a.mo30157c(f45173g, "light player not support VideoModel src Type");
    }

    public C19075b(Context context, AbstractC19156a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        this.f45179e = context;
        this.f45180f = aVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30425a(long j, AbstractC19168m mVar) {
        C19004g.f44970a.mo30155a(f45173g, " ---> seekToTime(), time: " + j + ",   mIsSeeking: " + this.f45177c);
        if (!this.f45177c && j >= 0) {
            this.f45177c = true;
            mo30430a(false);
            try {
                MediaPlayer mediaPlayer = this.f45181i;
                if (mediaPlayer != null) {
                    mediaPlayer.seekTo((int) j);
                }
                MediaPlayer mediaPlayer2 = this.f45181i;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnSeekCompleteListener(new C19079d(this, mVar, j));
                }
            } catch (Throwable th) {
                C19004g.f44970a.mo30157c(f45173g, th.getMessage());
                m35485o();
            }
        } else if (mVar != null) {
            mVar.mo30489a(j, false);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h
    /* renamed from: a */
    public final void mo30427a(FileDescriptor fileDescriptor, long j, long j2) {
        try {
            C19004g gVar = C19004g.f44970a;
            String str = f45173g;
            gVar.mo30155a(str, " ---> setDataSource(), file descriptor is " + String.valueOf(fileDescriptor));
            if (this.f45181i == null) {
                C19004g.f44970a.mo30155a(str, "mediaplayer is null ---> createMediaPlayer");
                m35484n();
            }
            MediaPlayer mediaPlayer = this.f45181i;
            if (mediaPlayer != null) {
                this.f45175a = false;
                mediaPlayer.reset();
                mediaPlayer.setDataSource(fileDescriptor, j, j2);
                this.f45180f.mo30472a(this);
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            C19004g.f44970a.mo30157c(f45173g, th.getMessage());
            this.f45180f.mo30471a(EnumC19157b.INVALIDATE_PLAYER_MODEL);
        }
    }
}

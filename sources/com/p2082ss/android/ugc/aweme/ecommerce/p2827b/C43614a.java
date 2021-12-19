package com.p2082ss.android.ugc.aweme.ecommerce.p2827b;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.extension.player.AbstractC23075a;
import com.bytedance.tux.extension.player.AbstractC23099f;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommerce.p2827b.C43620b;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4314h.C84116g;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.b.a */
public final class C43614a implements AbstractC23075a {

    /* renamed from: q */
    public static final C43616a f101658q = new C43616a((byte) 0);

    /* renamed from: a */
    public boolean f101659a;

    /* renamed from: b */
    public SurfaceTexture f101660b;

    /* renamed from: c */
    public AbstractC23099f f101661c;

    /* renamed from: d */
    public Video f101662d;

    /* renamed from: e */
    public int f101663e;

    /* renamed from: f */
    public long f101664f;

    /* renamed from: g */
    public C81079v f101665g = new C81079v();

    /* renamed from: h */
    public boolean f101666h;

    /* renamed from: i */
    boolean f101667i;

    /* renamed from: j */
    public float f101668j = -1.0f;

    /* renamed from: k */
    public int f101669k;

    /* renamed from: l */
    public boolean f101670l;

    /* renamed from: m */
    public Runnable f101671m;

    /* renamed from: n */
    public long f101672n;

    /* renamed from: o */
    final C43618c f101673o;

    /* renamed from: p */
    public TuxPlayerView f101674p;

    /* renamed from: r */
    private final AbstractC89244h f101675r = C89250i.m154773a((AbstractC89171a) C43617b.f101677a);

    static {
        Covode.recordClassIndex(51872);
    }

    /* renamed from: i */
    public final Handler mo74290i() {
        return (Handler) this.f101675r.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.a$a */
    public static final class C43616a {
        static {
            Covode.recordClassIndex(51874);
        }

        private C43616a() {
        }

        public /* synthetic */ C43616a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: g */
    public final void mo37514g() {
        mo37506a();
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: d */
    public final void mo37511d() {
        C81079v vVar = this.f101665g;
        if (vVar != null) {
            vVar.mo123912F();
        }
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: e */
    public final void mo37512e() {
        C81079v vVar = this.f101665g;
        if (vVar != null) {
            vVar.mo123913G();
        }
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: h */
    public final int mo37515h() {
        return C84116g.m144637f();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.a$b */
    static final class C43617b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C43617b f101677a = new C43617b();

        static {
            Covode.recordClassIndex(51875);
        }

        C43617b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: l */
    private final void m86632l() {
        mo74290i().removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.a$d */
    public static final class RunnableC43619d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43614a f101679a;

        static {
            Covode.recordClassIndex(51877);
        }

        RunnableC43619d(C43614a aVar) {
            this.f101679a = aVar;
        }

        public final void run() {
            this.f101679a.f101672n += 1000;
            Runnable runnable = this.f101679a.f101671m;
            if (runnable != null) {
                this.f101679a.mo74290i().postDelayed(runnable, 1000);
            }
        }
    }

    /* renamed from: k */
    public static void m86631k() {
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95842p().mo96042a(true);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: a */
    public final void mo37506a() {
        if (this.f101659a) {
            this.f101667i = true;
            C81079v vVar = this.f101665g;
            if (vVar != null) {
                mo74291j();
                vVar.mo123915I();
                vVar.mo123937a(this.f101673o);
                vVar.mo123942b(this.f101662d, this.f101673o, 0);
            }
        }
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: b */
    public final void mo37509b() {
        this.f101667i = false;
        this.f101670l = false;
        this.f101668j = -1.0f;
        C81079v vVar = this.f101665g;
        if (vVar != null) {
            m86632l();
            vVar.mo124537P();
            vVar.mo123916J();
        }
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: f */
    public final boolean mo37513f() {
        C81079v vVar = this.f101665g;
        if (vVar != null) {
            return vVar.f181204a.mo124460h().mo124432s();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo74291j() {
        mo74290i().removeCallbacksAndMessages(null);
        RunnableC43619d dVar = new RunnableC43619d(this);
        this.f101671m = dVar;
        mo74290i().postDelayed(dVar, 1000);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: c */
    public final void mo37510c() {
        this.f101659a = false;
        SurfaceTexture surfaceTexture = this.f101660b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f101660b = null;
        C81079v vVar = this.f101665g;
        if (vVar != null) {
            this.f101672n = 0;
            m86632l();
            vVar.mo123951z();
            vVar.mo123937a((OnUIPlayListener) null);
            vVar.mo123914H();
            vVar.mo123909C();
        }
        this.f101665g = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.b.a$c */
    public static final class C43618c implements OnUIPlayListener {

        /* renamed from: a */
        final /* synthetic */ C43614a f101678a;

        static {
            Covode.recordClassIndex(51876);
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final OnUIPlayListener getWrapperedListener() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBufferedTimeMs(String str, long j) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBuffering(String str, boolean z) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onCompleteLoaded(String str, boolean z) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onDecoderBuffering(String str, boolean z) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onDecoderBuffering(boolean z) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str, int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompletedFirstTime(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(String str, C84208l lVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayPause(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayPrepare(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(String str, long j, long j2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayRelease(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayStop(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayStop(String str, JSONObject jSONObject) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayStop(String str, boolean z) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayerInternalEvent(String str, int i, JSONObject jSONObject) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlaying(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreParePlay(String str, C84215n nVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreRenderSessionMissed(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(String str, C84216o oVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrameFromResume(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderReady(C84215n nVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRetryOnError(String str, C84208l lVar) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onSeekEnd(String str, boolean z) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onSeekStart(String str, int i, float f) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onVideoSizeChanged(String str, int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onResumePlay(String str) {
            C43614a.m86631k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C43618c(C43614a aVar) {
            this.f101678a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayCompleted(String str) {
            AbstractC23099f fVar = this.f101678a.f101661c;
            if (fVar != null) {
                fVar.mo37545b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRetryOnError(C84208l lVar) {
            AbstractC23099f fVar = this.f101678a.f101661c;
            if (fVar != null) {
                fVar.mo37546b(String.valueOf(lVar));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPausePlay(String str) {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95842p().mo96042a(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPreparePlay(String str) {
            this.f101678a.f101664f = SystemClock.elapsedRealtime();
            C1731i.m5640b(C43620b.CallableC43624d.f101691a, C39162r.m79452a());
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(C84208l lVar) {
            AbstractC23099f fVar = this.f101678a.f101661c;
            if (fVar != null) {
                fVar.mo37543a(String.valueOf(lVar));
            }
            Video video = this.f101678a.f101662d;
            if (lVar != null && video != null) {
                C1731i.m5640b(new C43620b.CallableC43623c(video, lVar), C39162r.m79452a());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayProgressChange(float f) {
            AbstractC23099f fVar = this.f101678a.f101661c;
            if (fVar != null) {
                fVar.mo37541a(f);
            }
            if (this.f101678a.f101668j == f) {
                this.f101678a.f101669k++;
            } else {
                this.f101678a.f101669k = 0;
            }
            if (this.f101678a.f101669k > 1) {
                onBuffering(true);
            } else {
                onBuffering(false);
            }
            this.f101678a.f101668j = f;
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBuffering(boolean z) {
            if (z) {
                if (!this.f101678a.f101670l) {
                    AbstractC23099f fVar = this.f101678a.f101661c;
                    if (fVar != null) {
                        fVar.mo37544a(true);
                    }
                    if (C43620b.f101680a == -1) {
                        C43620b.f101680a = SystemClock.elapsedRealtime();
                    }
                    this.f101678a.f101670l = true;
                }
            } else if (this.f101678a.f101670l) {
                AbstractC23099f fVar2 = this.f101678a.f101661c;
                if (fVar2 != null) {
                    fVar2.mo37544a(false);
                }
                C1731i.m5640b(C43620b.CallableC43622b.f101688a, C39162r.m79452a());
                this.f101678a.f101670l = false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C84216o oVar) {
            int i;
            int i2;
            AbstractC23099f fVar = this.f101678a.f101661c;
            if (fVar != null) {
                fVar.mo37540a();
            }
            C81079v vVar = this.f101678a.f101665g;
            if (vVar != null) {
                i = (int) vVar.mo123886i();
            } else {
                i = 0;
            }
            C81079v vVar2 = this.f101678a.f101665g;
            if (vVar2 != null) {
                i2 = vVar2.mo123880c();
            } else {
                i2 = 0;
            }
            if (this.f101678a.f101664f != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f101678a.f101664f;
                Video video = this.f101678a.f101662d;
                int i3 = this.f101678a.f101663e;
                if (!(video == null || oVar == null)) {
                    C1731i.m5640b(new C43620b.CallableC43621a(video, oVar, elapsedRealtime, i3, i, i2), C39162r.m79452a());
                }
                this.f101678a.f101664f = 0;
            }
            C43614a.m86631k();
        }

        @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onBufferedPercent(String str, long j, int i) {
            AbstractC23099f fVar = this.f101678a.f101661c;
            if (fVar != null) {
                fVar.mo37542a(i);
            }
        }
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: a */
    public final void mo37507a(float f) {
        C81079v vVar = this.f101665g;
        if (vVar != null) {
            vVar.mo123931a(f);
        }
    }

    /* renamed from: a */
    public static boolean m86630a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture == null || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return surfaceTexture.isReleased();
    }

    public C43614a(TuxPlayerView tuxPlayerView) {
        C89219l.m154721d(tuxPlayerView, "");
        this.f101674p = tuxPlayerView;
        TuxPlayerView tuxPlayerView2 = this.f101674p;
        this.f101661c = tuxPlayerView2;
        tuxPlayerView2.getVideoView().setSurfaceTextureListener(new TextureView.SurfaceTextureListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.p2827b.C43614a.TextureView$SurfaceTextureListenerC436151 */

            /* renamed from: a */
            final /* synthetic */ C43614a f101676a;

            static {
                Covode.recordClassIndex(51873);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C89219l.m154721d(surfaceTexture, "");
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                C89219l.m154721d(surfaceTexture, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f101676a = r1;
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C89219l.m154721d(surfaceTexture, "");
                if (this.f101676a.f101660b == null || C43614a.m86630a(this.f101676a.f101660b)) {
                    return true;
                }
                return false;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C89219l.m154721d(surfaceTexture, "");
                if (this.f101676a.f101660b == null || C43614a.m86630a(this.f101676a.f101660b)) {
                    this.f101676a.f101660b = surfaceTexture;
                    C81079v vVar = this.f101676a.f101665g;
                    if (vVar != null) {
                        vVar.mo123934a(new Surface(this.f101676a.f101660b));
                    }
                } else {
                    SurfaceTexture surfaceTexture2 = this.f101676a.f101660b;
                    if (surfaceTexture2 != null && (!C89219l.m154714a(surfaceTexture2, this.f101676a.f101674p.getVideoView().getSurfaceTexture()))) {
                        int i3 = Build.VERSION.SDK_INT;
                        this.f101676a.f101674p.getVideoView().setSurfaceTexture(surfaceTexture2);
                    }
                }
                this.f101676a.f101659a = true;
                if (this.f101676a.f101666h) {
                    C43614a aVar = this.f101676a;
                    if (aVar.f101659a) {
                        aVar.f101666h = false;
                        aVar.f101667i = true;
                        C81079v vVar2 = aVar.f101665g;
                        if (vVar2 != null) {
                            aVar.mo74291j();
                            vVar2.mo123937a(aVar.f101673o);
                            vVar2.mo123928a(aVar.f101662d, true);
                            vVar2.mo123915I();
                            return;
                        }
                        return;
                    }
                    aVar.f101666h = true;
                }
            }
        });
        this.f101673o = new C43618c(this);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23075a
    /* renamed from: a */
    public final void mo37508a(int i) {
        if (this.f101659a) {
            this.f101666h = false;
            this.f101667i = true;
            C81079v vVar = this.f101665g;
            if (vVar != null) {
                mo74291j();
                vVar.mo123937a(this.f101673o);
                vVar.mo123921a(this.f101662d, i);
                vVar.mo123915I();
                return;
            }
            return;
        }
        this.f101666h = true;
    }
}

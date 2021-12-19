package com.p2082ss.android.ugc.aweme.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.OnActivityResultCallback;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.C50459f;
import com.p2082ss.android.ugc.aweme.metrics.C59221ap;
import com.p2082ss.android.ugc.aweme.metrics.C59223ar;
import com.p2082ss.android.ugc.aweme.metrics.C59224as;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61501c;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.view.e */
public final class C81220e extends FrameLayout implements OnUIPlayListener, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static boolean f181508c;

    /* renamed from: d */
    public static final C81221a f181509d = new C81221a((byte) 0);

    /* renamed from: a */
    public boolean f181510a;

    /* renamed from: b */
    Aweme f181511b;

    /* renamed from: e */
    private long f181512e;

    /* renamed from: f */
    private final AbstractC89244h f181513f;

    /* renamed from: g */
    private final AbstractC89244h f181514g;

    static {
        Covode.recordClassIndex(94550);
    }

    public final ActivityC0945e getCurrentActivity$eoy_release() {
        return (ActivityC0945e) this.f181514g.getValue();
    }

    /* access modifiers changed from: package-private */
    public final C61501c getMPlayVideoHelper() {
        return (C61501c) this.f181513f.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(141, new RunnableC90250g(C81220e.class, "subscribeUserClickPause", C50459f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
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
    public final void onPausePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
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
    public final void onPlayProgressChange(float f) {
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
    public final void onRenderFirstFrame(C84216o oVar) {
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
    public final void onResumePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
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

    /* renamed from: com.ss.android.ugc.aweme.view.e$a */
    public static final class C81221a {
        static {
            Covode.recordClassIndex(94551);
        }

        private C81221a() {
        }

        public /* synthetic */ C81221a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo124700b();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e$c */
    static final class C81224c extends AbstractC89220m implements AbstractC89171a<C61501c> {

        /* renamed from: a */
        final /* synthetic */ C81220e f181517a;

        static {
            Covode.recordClassIndex(94554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81224c(C81220e eVar) {
            super(0);
            this.f181517a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61501c invoke() {
            return new C61501c((KeepSurfaceTextureView) this.f181517a.findViewById(R.id.ec9), this.f181517a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.e$b */
    static final class C81222b extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Context f181515a;

        static {
            Covode.recordClassIndex(94552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81222b(Context context) {
            super(0);
            this.f181515a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            Object obj;
            Iterator a = C89309k.m154794a(this.f181515a, C812231.f181516a).mo2926a();
            while (true) {
                if (!a.hasNext()) {
                    obj = null;
                    break;
                }
                obj = a.next();
                if (obj instanceof Activity) {
                    break;
                }
            }
            if (!(obj instanceof ActivityC0945e)) {
                return null;
            }
            return obj;
        }
    }

    /* renamed from: a */
    public final void mo124699a() {
        new C59221ap().mo96749g(this.f181511b).mo96764a("eoy_hub").mo96792f();
        this.f181512e = System.currentTimeMillis();
        getMPlayVideoHelper().mo99154f();
    }

    /* renamed from: b */
    public final void mo124700b() {
        if (this.f181512e != 0) {
            C59224as a = new C59224as().mo96749g(this.f181511b).mo96778a("eoy_hub");
            a.f135069a = System.currentTimeMillis() - this.f181512e;
            a.mo96792f();
            this.f181512e = 0;
        }
        getMPlayVideoHelper().mo99152d();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        setMuted(f181508c);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        new C59223ar().mo96774a("eoy_hub").mo96749g(this.f181511b).mo96792f();
    }

    public final void setMuted(boolean z) {
        hashCode();
        Aweme aweme = this.f181511b;
        if (aweme != null) {
            aweme.getAid();
        }
        f181508c = z;
        if (z) {
            getMPlayVideoHelper().mo99156h();
        } else {
            getMPlayVideoHelper().mo99157i();
        }
    }

    public final void setSrc(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f181511b = aweme;
        getMPlayVideoHelper().mo99149a(aweme);
        hashCode();
        Aweme aweme2 = this.f181511b;
        if (aweme2 != null) {
            aweme2.getAid();
        }
    }

    @AbstractC90264r
    public final void subscribeUserClickPause(C50459f fVar) {
        String str;
        C89219l.m154721d(fVar, "");
        Aweme aweme = fVar.f116545a;
        String str2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = this.f181511b;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        if (C89219l.m154714a((Object) str, (Object) str2) && C89219l.m154714a((Object) fVar.f116546b, (Object) "eoy_hub")) {
            boolean z = true;
            if (fVar.f116548d == 1) {
                z = false;
            }
            this.f181510a = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C81220e(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12416);
        this.f181513f = C89250i.m154773a((AbstractC89171a) new C81224c(this));
        addView(C1764a.m5927a(LayoutInflater.from(context), R.layout.z7, this, false));
        getMPlayVideoHelper().f139608e = new C81079v();
        this.f181514g = C89250i.m154773a((AbstractC89171a) new C81222b(context));
        MethodCollector.m26664o(12416);
    }

    public /* synthetic */ C81220e(Context context, byte b) {
        this(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.e$d */
    public static final class C81225d implements OnActivityResultCallback {

        /* renamed from: a */
        final /* synthetic */ C81220e f181518a;

        static {
            Covode.recordClassIndex(94555);
        }

        C81225d(C81220e eVar) {
            this.f181518a = eVar;
        }

        @Override // com.bytedance.router.OnActivityResultCallback
        public final void onActivityResult(int i, int i2, Intent intent) {
            if (i == 10086) {
                this.f181518a.setMuted(C81220e.f181508c);
                if (this.f181518a.f181510a) {
                    this.f181518a.mo124699a();
                } else {
                    this.f181518a.mo124700b();
                }
                if (EventBus.m156962a().mo145393a(this.f181518a)) {
                    EventBus.m156962a().mo145395b(this.f181518a);
                }
            }
        }
    }
}

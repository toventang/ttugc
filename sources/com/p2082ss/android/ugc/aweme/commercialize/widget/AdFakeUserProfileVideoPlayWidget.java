package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38426i;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38651as;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38741f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38770z;
import com.p2082ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.p2082ss.android.ugc.aweme.commercialize.views.C38833b;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.experiment.C46782c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget */
public final class AdFakeUserProfileVideoPlayWidget extends AbsAdProfileWidget implements AbstractC33974au, OnUIPlayListener, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C39013a f92148k = new C39013a((byte) 0);

    /* renamed from: j */
    public C38833b f92149j;

    /* renamed from: l */
    private final AbstractC89244h f92150l = C89250i.m154773a((AbstractC89171a) new C39016d(this));

    /* renamed from: m */
    private final AbstractC89244h f92151m = C89250i.m154773a((AbstractC89171a) new C39017e(this));

    /* renamed from: n */
    private boolean f92152n;

    /* renamed from: o */
    private C38651as f92153o = new C38651as();

    /* renamed from: p */
    private boolean f92154p;

    /* renamed from: q */
    private Handler f92155q = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(46610);
    }

    /* renamed from: h */
    private final ViewGroup m79178h() {
        return (ViewGroup) this.f92150l.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final ImageView mo67703f() {
        return (ImageView) this.f92151m.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(387, new RunnableC90250g(AdFakeUserProfileVideoPlayWidget.class, "onAdPopupWebPageEvent", AdPopUpWebPageWidget.C39023a.class, ThreadMode.POSTING, 0, false));
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
    public final void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
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
    public final void onPreparePlay(String str) {
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

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$a */
    public static final class C39013a {
        static {
            Covode.recordClassIndex(46611);
        }

        private C39013a() {
        }

        public /* synthetic */ C39013a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$b */
    public static final class RunnableC39014b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f92156a;

        static {
            Covode.recordClassIndex(46612);
        }

        RunnableC39014b(ImageView imageView) {
            this.f92156a = imageView;
        }

        public final void run() {
            this.f92156a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$d */
    static final class C39016d extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f92159a;

        static {
            Covode.recordClassIndex(46614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39016d(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget) {
            super(0);
            this.f92159a = adFakeUserProfileVideoPlayWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            return this.f92159a.mo66948a(R.id.fc5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$e */
    static final class C39017e extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f92160a;

        static {
            Covode.recordClassIndex(46615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39017e(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget) {
            super(0);
            this.f92160a = adFakeUserProfileVideoPlayWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f92160a.mo66948a(R.id.fd9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$f */
    static final class RunnableC39018f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f92161a;

        /* renamed from: b */
        final /* synthetic */ int f92162b;

        static {
            Covode.recordClassIndex(46616);
        }

        RunnableC39018f(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget, int i) {
            this.f92161a = adFakeUserProfileVideoPlayWidget;
            this.f92162b = i;
        }

        public final void run() {
            C38833b bVar = this.f92161a.f92149j;
            if (bVar != null) {
                bVar.mo67448a(this.f92162b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$g */
    static final class RunnableC39019g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f92163a;

        /* renamed from: b */
        final /* synthetic */ int f92164b;

        static {
            Covode.recordClassIndex(46617);
        }

        RunnableC39019g(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget, int i) {
            this.f92163a = adFakeUserProfileVideoPlayWidget;
            this.f92164b = i;
        }

        public final void run() {
            C38833b bVar = this.f92163a.f92149j;
            if (bVar != null) {
                bVar.mo67448a(this.f92164b);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if (this.f92152n) {
            C38833b bVar = this.f92149j;
            if (bVar != null) {
                bVar.mo67449b();
            }
            mo67704g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        C38833b bVar;
        super.onResume();
        if (this.f92152n && !this.f92154p && (bVar = this.f92149j) != null && bVar.f91704b.f113577a != 0) {
            bVar.mo67447a();
        }
    }

    /* renamed from: g */
    public final void mo67704g() {
        ImageView f = mo67703f();
        if (f != null) {
            f.animate().alpha(0.0f).scaleX(2.5f).scaleY(2.5f).withEndAction(new RunnableC39014b(f)).setDuration(100).start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        C38833b bVar = this.f92149j;
        if (bVar != null) {
            if (bVar.f91707e.mo123945b(bVar)) {
                C38770z zVar = bVar.f91706d;
                if (zVar.f91553f != null && zVar.f91553f.mo123945b(zVar.f91551d)) {
                    zVar.f91553f.mo123937a((OnUIPlayListener) null);
                }
            }
            VideoViewComponent videoViewComponent = bVar.f91705c;
            videoViewComponent.f188405b.mo129314b(bVar.f91709g);
            bVar.f91703a.clear();
            try {
                bVar.f91707e.mo123914H();
                bVar.f91707e.mo123909C();
            } catch (Throwable unused) {
            }
        }
        Context context = this.f80270b;
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        long j = this.f92153o.f91329a;
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "homepage_ad";
        a.f90212b = "play_break";
        a.mo66485a(j).mo66497b(aweme).mo66495a(context);
        if (aweme != null) {
            C18129a.m33746a("homepage_ad", "play_break", aweme.getAwemeRawAd()).mo28900b("duration", Long.valueOf(j)).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C38189j.m77548w(this.f80270b, ((AbsAdProfileWidget) this).f90607a);
        this.f92153o.mo67223a();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        C81079v vVar;
        ViewGroup h;
        C38833b bVar = this.f92149j;
        if (!(bVar == null || (vVar = bVar.f91707e) == null || (h = m79178h()) == null)) {
            m79177a(h, vVar.mo123889l(), vVar.mo123890m());
        }
        this.f92153o.mo67223a();
        C38189j.m77548w(this.f80270b, ((AbsAdProfileWidget) this).f90607a);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$c */
    static final class View$OnClickListenerC39015c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f92157a;

        /* renamed from: b */
        final /* synthetic */ Video f92158b;

        static {
            Covode.recordClassIndex(46613);
        }

        View$OnClickListenerC39015c(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget, Video video) {
            this.f92157a = adFakeUserProfileVideoPlayWidget;
            this.f92158b = video;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C38833b bVar = this.f92157a.f92149j;
            if (bVar == null) {
                return;
            }
            if (bVar.f91704b.f113577a == 3) {
                bVar.mo67447a();
                this.f92157a.mo67704g();
                return;
            }
            bVar.mo67449b();
            ImageView f = this.f92157a.mo67703f();
            if (f != null) {
                f.setAlpha(0.0f);
                f.setScaleX(2.5f);
                f.setScaleY(2.5f);
                f.setVisibility(0);
                f.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    public final void mo66950a(C38426i iVar) {
        Video video;
        ViewGroup h;
        C81079v vVar;
        C89219l.m154721d(iVar, "");
        super.mo66950a(iVar);
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        if (aweme != null && (video = aweme.getVideo()) != null && (h = m79178h()) != null) {
            m79177a(h, video.getWidth(), video.getHeight());
            C38833b bVar = new C38833b(h, ((AbsAdProfileWidget) this).f90607a);
            this.f92149j = bVar;
            bVar.f91708f = false;
            C38833b bVar2 = this.f92149j;
            if (bVar2 != null && !bVar2.f91703a.contains(this)) {
                bVar2.f91703a.add(this);
            }
            C38833b bVar3 = this.f92149j;
            if (!(bVar3 == null || (vVar = bVar3.f91707e) == null)) {
                C38741f.f91489b = new WeakReference<>(vVar);
            }
            View view = this.f80272d;
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC39015c(this, video));
            }
        }
    }

    @AbstractC90264r
    public final void onAdPopupWebPageEvent(AdPopUpWebPageWidget.C39023a aVar) {
        int i;
        C38833b bVar;
        C89219l.m154721d(aVar, "");
        boolean z = aVar.f92180a;
        this.f92154p = z;
        if (z) {
            C38833b bVar2 = this.f92149j;
            if ((bVar2 == null || bVar2.f91704b.f113577a != 3) && (bVar = this.f92149j) != null) {
                bVar.mo67449b();
            }
        } else if (this.f92152n) {
            C38833b bVar3 = this.f92149j;
            if (bVar3 == null || bVar3.f91704b.f113577a != 0) {
                C38833b bVar4 = this.f92149j;
                if (bVar4 != null) {
                    bVar4.mo67447a();
                }
                mo67704g();
                return;
            }
            AbstractC80747i a = C38741f.m78581a();
            if (a != null) {
                i = (int) a.mo123891n();
            } else {
                i = 0;
            }
            if (!C46782c.m90130a()) {
                C38833b bVar5 = this.f92149j;
                if (bVar5 != null) {
                    bVar5.mo67448a(i);
                    return;
                }
                return;
            }
            this.f92155q.post(new RunnableC39018f(this, i));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        Context context = this.f80270b;
        Aweme aweme = ((AbsAdProfileWidget) this).f90607a;
        C38182f.C38184b a = C38182f.m77418a();
        a.f90211a = "homepage_ad";
        a.f90212b = "pause";
        a.mo66497b(aweme).mo66495a(context);
        if (aweme != null) {
            C18129a.m33746a("homepage_ad", "pause", aweme.getAwemeRawAd()).mo28902c();
        }
        C38651as asVar = this.f92153o;
        if (asVar.f91332d) {
            asVar.f91332d = false;
            asVar.f91331c = System.currentTimeMillis();
            if (asVar.f91331c > 0 && asVar.f91330b > 0 && asVar.f91331c - asVar.f91330b > 0) {
                asVar.f91329a += asVar.f91331c - asVar.f91330b;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r8 != false) goto L_0x0035;
     */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66951a(boolean r8) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget.mo66951a(boolean):void");
    }

    /* renamed from: a */
    private final void m79177a(View view, int i, int i2) {
        if (i > 0 && i2 > 0) {
            ViewWrapper viewWrapper = new ViewWrapper(view);
            viewWrapper.setWidth(C13628n.m24504a(this.f80270b));
            viewWrapper.setHeight((int) ((((float) viewWrapper.getWidth()) * ((float) i2)) / ((float) i)));
            DataCenter dataCenter = this.f80273e;
            if (dataCenter != null) {
                dataCenter.mo60191a("ON_VIDEO_CONTAINER_SIZE_CHANGE", (Object) null);
            }
        }
    }
}

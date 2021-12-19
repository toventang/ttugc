package com.p2082ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.helper.C49617c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.p2082ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.shoutouts.api.AbstractC74385a;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderRestrict;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsPrice;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsProduct;
import com.p2082ss.android.ugc.aweme.shoutouts.model.StandardMoney;
import com.p2082ss.android.ugc.aweme.shoutouts.p3901a.AbstractC74382a;
import com.p2082ss.android.ugc.aweme.shoutouts.p3902b.C74387a;
import com.p2082ss.android.ugc.aweme.shoutouts.player.C74487f;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3905c.EnumC74550a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3906d.C74560a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.C74585b;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsProductReviewError;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity */
public final class ShoutoutsProductPreviewActivity extends ActivityC17312a implements OnUIPlayListener, AbstractC74382a.AbstractC74383a, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C74490a f167496i = new C74490a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f167497A = C89250i.m154773a((AbstractC89171a) new C74509p(this));

    /* renamed from: B */
    private final AbstractC89244h f167498B = C89250i.m154773a((AbstractC89171a) new C74502k(this));

    /* renamed from: C */
    private final AbstractC89244h f167499C = C89250i.m154773a((AbstractC89171a) new C74504m(this));

    /* renamed from: D */
    private final AbstractC89244h f167500D = C89250i.m154773a((AbstractC89171a) new C74510q(this));

    /* renamed from: E */
    private final AbstractC89244h f167501E = C89250i.m154773a((AbstractC89171a) new C74494e(this));

    /* renamed from: F */
    private SparseArray f167502F;

    /* renamed from: a */
    public Aweme f167503a;

    /* renamed from: b */
    public Video f167504b;

    /* renamed from: c */
    public ShoutoutsProduct f167505c;

    /* renamed from: d */
    public boolean f167506d;

    /* renamed from: e */
    public final C74560a f167507e = new C74560a(this);

    /* renamed from: f */
    public SafeHandler f167508f = new SafeHandler(this);

    /* renamed from: g */
    public String f167509g;

    /* renamed from: h */
    public boolean f167510h;

    /* renamed from: j */
    private boolean f167511j;

    /* renamed from: k */
    private boolean f167512k;

    /* renamed from: l */
    private String f167513l;

    /* renamed from: m */
    private String f167514m;

    /* renamed from: n */
    private int f167515n;

    /* renamed from: o */
    private boolean f167516o;

    /* renamed from: p */
    private boolean f167517p;

    /* renamed from: q */
    private Integer f167518q;

    /* renamed from: r */
    private Integer f167519r;

    /* renamed from: s */
    private String f167520s;

    /* renamed from: t */
    private String f167521t;

    /* renamed from: u */
    private final long f167522u = System.currentTimeMillis();

    /* renamed from: v */
    private final AbstractC89244h f167523v = C89250i.m154773a((AbstractC89171a) C74517u.f167563a);

    /* renamed from: w */
    private final AbstractC89244h f167524w = C89250i.m154773a((AbstractC89171a) new C74493d(this));

    /* renamed from: x */
    private final AbstractC89244h f167525x = C89250i.m154773a((AbstractC89171a) new C74505n(this));

    /* renamed from: y */
    private final AbstractC89244h f167526y = C89250i.m154773a((AbstractC89171a) new C74492c(this));

    /* renamed from: z */
    private final AbstractC89244h f167527z = C89250i.m154773a((AbstractC89171a) new C74516t(this));

    static {
        Covode.recordClassIndex(87292);
    }

    /* renamed from: j */
    private final KeepSurfaceTextureView m130924j() {
        return (KeepSurfaceTextureView) this.f167527z.getValue();
    }

    /* renamed from: k */
    private final DmtStatusView m130925k() {
        return (DmtStatusView) this.f167497A.getValue();
    }

    /* renamed from: l */
    private final View m130926l() {
        return (View) this.f167498B.getValue();
    }

    /* renamed from: m */
    private final View m130927m() {
        return (View) this.f167499C.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f167502F;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f167502F == null) {
            this.f167502F = new SparseArray();
        }
        View view = (View) this.f167502F.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f167502F.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final VideoViewComponent mo117175c() {
        return (VideoViewComponent) this.f167523v.getValue();
    }

    /* renamed from: d */
    public final ViewGroup mo117176d() {
        return (ViewGroup) this.f167524w.getValue();
    }

    /* renamed from: e */
    public final C74544c mo117177e() {
        return (C74544c) this.f167525x.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(277, new RunnableC90250g(ShoutoutsProductPreviewActivity.class, "onShoutoutProductStatusChanged", C47959j.class, ThreadMode.MAIN, 0, false));
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$a */
    public static final class C74490a {
        static {
            Covode.recordClassIndex(87293);
        }

        private C74490a() {
        }

        public /* synthetic */ C74490a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$o */
    static final class C74506o extends AbstractC89220m implements AbstractC89172b<AbstractC89171a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167545a;

        static {
            Covode.recordClassIndex(87309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74506o(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(1);
            this.f167545a = shoutoutsProductPreviewActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$o$a */
        public static final class C74507a implements ShoutoutVideoDownloadListener {

            /* renamed from: a */
            final /* synthetic */ C74506o f167546a;

            /* renamed from: b */
            final /* synthetic */ String f167547b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89171a f167548c;

            /* renamed from: d */
            final /* synthetic */ IShoutOutsService f167549d;

            /* renamed from: e */
            final /* synthetic */ Long f167550e;

            static {
                Covode.recordClassIndex(87310);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener
            public final void onFail() {
                this.f167548c.invoke();
            }

            @Override // com.p2082ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener
            public final void onSuccess(final String str) {
                C89219l.m154721d(str, "");
                this.f167548c.invoke();
                if (!TextUtils.isEmpty(str)) {
                    this.f167546a.f167545a.f167508f.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity.C74506o.C74507a.RunnableC745081 */

                        /* renamed from: a */
                        final /* synthetic */ C74507a f167551a;

                        static {
                            Covode.recordClassIndex(87311);
                        }

                        {
                            this.f167551a = r1;
                        }

                        public final void run() {
                            String str;
                            IShoutOutsService iShoutOutsService = this.f167551a.f167549d;
                            ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity = this.f167551a.f167546a.f167545a;
                            String str2 = str;
                            String str3 = this.f167551a.f167547b;
                            Long l = this.f167551a.f167550e;
                            if (l != null) {
                                str = String.valueOf(l.longValue());
                            } else {
                                str = null;
                            }
                            iShoutOutsService.startShoutoutsPublishSyncActivity(shoutoutsProductPreviewActivity, str2, str3, str);
                        }
                    });
                }
            }

            C74507a(C74506o oVar, String str, AbstractC89171a aVar, IShoutOutsService iShoutOutsService, Long l) {
                this.f167546a = oVar;
                this.f167547b = str;
                this.f167548c = aVar;
                this.f167549d = iShoutOutsService;
                this.f167550e = l;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC89171a<? extends C89391z> aVar) {
            List<String> list;
            Music music;
            VideoUrlModel playAddr;
            AbstractC89171a<? extends C89391z> aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            IShoutOutsService shoutOutsService = AVExternalServiceImpl.m113114a().shoutOutsService();
            Video video = this.f167545a.f167504b;
            Long l = null;
            if (video == null || (playAddr = video.getPlayAddr()) == null) {
                list = null;
            } else {
                list = playAddr.getUrlList();
            }
            String g = this.f167545a.mo117179g();
            Aweme aweme = this.f167545a.f167503a;
            if (!(aweme == null || (music = aweme.getMusic()) == null)) {
                l = Long.valueOf(music.getId());
            }
            if (!(list == null || !(!list.isEmpty()) || list.get(0) == null || g == null)) {
                ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity = this.f167545a;
                String str = list.get(0);
                C89219l.m154716b(str, "");
                String str2 = str;
                C74507a aVar3 = new C74507a(this, g, aVar2, shoutOutsService, l);
                C89219l.m154721d(shoutoutsProductPreviewActivity, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(aVar3, "");
                AVExternalServiceImpl.m113114a().shoutOutsService().startDownLoadVideo(shoutoutsProductPreviewActivity, str2, aVar3);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$f */
    public static final class C74496f implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167535a;

        static {
            Covode.recordClassIndex(87299);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
            this.f167535a.f167506d = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74496f(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f167535a = shoutoutsProductPreviewActivity;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            this.f167535a.f167506d = true;
            this.f167535a.mo117180h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$u */
    static final class C74517u extends AbstractC89220m implements AbstractC89171a<VideoViewComponent> {

        /* renamed from: a */
        public static final C74517u f167563a = new C74517u();

        static {
            Covode.recordClassIndex(87320);
        }

        C74517u() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$c */
    static final class C74492c extends AbstractC89220m implements AbstractC89171a<AutoRTLImageView> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167530a;

        static {
            Covode.recordClassIndex(87295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74492c(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167530a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AutoRTLImageView invoke() {
            return this.f167530a.findViewById(R.id.e0q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$k */
    static final class C74502k extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167541a;

        static {
            Covode.recordClassIndex(87305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74502k(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167541a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f167541a.findViewById(R.id.e0p);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$m */
    static final class C74504m extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167543a;

        static {
            Covode.recordClassIndex(87307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74504m(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167543a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f167543a.findViewById(R.id.e0r);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$n */
    static final class C74505n extends AbstractC89220m implements AbstractC89171a<C74544c> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167544a;

        static {
            Covode.recordClassIndex(87308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74505n(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167544a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74544c invoke() {
            return new C74544c(this.f167544a, (byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$p */
    static final class C74509p extends AbstractC89220m implements AbstractC89171a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167553a;

        static {
            Covode.recordClassIndex(87312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74509p(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167553a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.f167553a.findViewById(R.id.cfy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$q */
    static final class C74510q extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167554a;

        static {
            Covode.recordClassIndex(87313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74510q(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167554a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f167554a.findViewById(R.id.f5v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$t */
    static final class C74516t extends AbstractC89220m implements AbstractC89171a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167562a;

        static {
            Covode.recordClassIndex(87319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74516t(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167562a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ KeepSurfaceTextureView invoke() {
            return this.f167562a.mo117176d().findViewById(R.id.e0s);
        }
    }

    /* renamed from: o */
    private final String m130929o() {
        String str = this.f167513l;
        if (str != null) {
            return str;
        }
        ShoutoutsProduct shoutoutsProduct = this.f167505c;
        if (shoutoutsProduct != null) {
            return shoutoutsProduct.getCreatorUid();
        }
        return null;
    }

    /* renamed from: g */
    public final String mo117179g() {
        String str = this.f167514m;
        if (str != null) {
            return str;
        }
        ShoutoutsProduct shoutoutsProduct = this.f167505c;
        if (shoutoutsProduct != null) {
            return shoutoutsProduct.getProductId();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.shoutouts.p3901a.AbstractC74382a.AbstractC74383a
    /* renamed from: a */
    public final void mo116999a() {
        m130925k().setVisibility(8);
        ((ShoutoutsProductReviewError) this.f167501E.getValue()).setVisibility(0);
    }

    /* renamed from: h */
    public final void mo117180h() {
        if (this.f167506d && this.f167504b != null) {
            mo117175c().mo129262a(this.f167504b);
            m130924j().setOnClickListener(new View$OnClickListenerC74503l(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$d */
    static final class C74493d extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167531a;

        static {
            Covode.recordClassIndex(87296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74493d(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167531a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            MethodCollector.m26663i(693);
            View inflate = ((ViewStub) this.f167531a.findViewById(R.id.fga)).inflate();
            if (inflate != null) {
                ViewGroup viewGroup = (ViewGroup) inflate;
                viewGroup.setVisibility(0);
                MethodCollector.m26664o(693);
                return viewGroup;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(693);
            throw nullPointerException;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$e */
    static final class C74494e extends AbstractC89220m implements AbstractC89171a<ShoutoutsProductReviewError> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167532a;

        static {
            Covode.recordClassIndex(87297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74494e(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167532a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ShoutoutsProductReviewError invoke() {
            MethodCollector.m26663i(703);
            View findViewById = this.f167532a.findViewById(R.id.fg4);
            C89219l.m154716b(findViewById, "");
            View inflate = ((ViewStub) findViewById).inflate();
            if (inflate != null) {
                final ShoutoutsProductReviewError shoutoutsProductReviewError = (ShoutoutsProductReviewError) inflate;
                shoutoutsProductReviewError.setRetryListener(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity.C74494e.C744951 */

                    /* renamed from: a */
                    final /* synthetic */ C74494e f167533a;

                    static {
                        Covode.recordClassIndex(87298);
                    }

                    {
                        this.f167533a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        shoutoutsProductReviewError.setVisibility(8);
                        this.f167533a.f167532a.mo117178f();
                        return C89391z.f203057a;
                    }
                });
                MethodCollector.m26664o(703);
                return shoutoutsProductReviewError;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsProductReviewError");
            MethodCollector.m26664o(703);
            throw nullPointerException;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$j */
    public static final class C74501j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167540a;

        static {
            Covode.recordClassIndex(87304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74501j(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            super(0);
            this.f167540a = shoutoutsProductPreviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View view = this.f167540a.mo117177e().getPopupView().f167672b;
            if (view == null) {
                C89219l.m154710a("clNewRequestView");
            }
            view.setVisibility(8);
            C74387a.m130852a((Context) this.f167540a, (Integer) 2, "shoutouts_detail_page");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$s */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC74515s implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167559a;

        /* renamed from: b */
        final /* synthetic */ TextureView f167560b;

        /* renamed from: c */
        final /* synthetic */ Video f167561c;

        static {
            Covode.recordClassIndex(87318);
        }

        public final void onGlobalLayout() {
            if (this.f167560b.getWidth() > 0 && this.f167560b.getHeight() > 0) {
                this.f167560b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                new C49617c().mo81411a(this.f167559a, this.f167560b, this.f167561c.getWidth(), this.f167561c.getHeight());
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC74515s(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity, TextureView textureView, Video video) {
            this.f167559a = shoutoutsProductPreviewActivity;
            this.f167560b = textureView;
            this.f167561c = video;
        }
    }

    /* renamed from: n */
    private final boolean m130928n() {
        String str = this.f167513l;
        if (str != null) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return C89219l.m154714a((Object) str, (Object) g.getCurUserId());
        }
        ShoutoutsProduct shoutoutsProduct = this.f167505c;
        if (shoutoutsProduct == null) {
            return false;
        }
        String creatorUid = shoutoutsProduct.getCreatorUid();
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        return C89219l.m154714a((Object) creatorUid, (Object) g2.getCurUserId());
    }

    @Override // com.p2082ss.android.ugc.aweme.shoutouts.p3901a.AbstractC74382a.AbstractC74383a
    /* renamed from: b */
    public final void mo117001b() {
        int i;
        this.f167517p = true;
        if (this.f167516o) {
            if (mo117177e().getCurrentStyle() == EnumC74550a.CONSUMER_AGE_LESS_THAN_18) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                i = C89241a.m154730a(TypedValue.applyDimension(1, 33.0f, system.getDisplayMetrics()));
            } else {
                i = 0;
            }
            mo117177e().mo117204a(i);
            mo117177e().setGotoSeeNewRequestListener(new C74501j(this));
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        if (m130925k().getVisibility() == 8 && this.f167504b != null && mo117175c().mo129273g()) {
            mo117174a(false);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onResume", true);
        super.onResume();
        if (m130925k().getVisibility() == 8 && this.f167504b != null && !mo117175c().mo129273g() && !this.f167512k && !this.f167510h) {
            mo117174a(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: p */
    private final String m130930p() {
        if (C89219l.m154714a((Object) this.f167509g, (Object) "add_anchor") || C89219l.m154714a((Object) this.f167509g, (Object) "homepage_folow") || C89219l.m154714a((Object) this.f167509g, (Object) "homepage_hot") || C89219l.m154714a((Object) this.f167509g, (Object) "personal_homepage") || C89219l.m154714a((Object) this.f167509g, (Object) "others_homepage")) {
            return "anchor";
        }
        if (C89219l.m154714a((Object) this.f167509g, (Object) "tools_preview")) {
            return "edit_page";
        }
        if (C89219l.m154714a((Object) this.f167509g, (Object) "notification_page")) {
            return "tiktok_message";
        }
        return "profile_link";
    }

    /* renamed from: f */
    public final void mo117178f() {
        String g;
        m130925k().setVisibility(0);
        m130925k().mo27384f();
        this.f167507e.mo117224a(this.f167513l, mo117179g());
        if (!this.f167517p && m130928n() && (!C89219l.m154714a((Object) this.f167509g, (Object) "tools_preview")) && (!C89219l.m154714a((Object) this.f167509g, (Object) "add_anchor")) && (g = mo117179g()) != null) {
            this.f167507e.mo117223a(g);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        String str;
        C15477a.m28479e(this);
        super.onDestroy();
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "shoutouts_detail_page");
        if (m130928n()) {
            str = "creator";
        } else {
            str = "consumer";
        }
        hashMap.put("user_type", str);
        hashMap.put("enter_method", m130930p());
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.f167522u));
        C39162r.m79460a("stay_time", hashMap);
    }

    /* renamed from: i */
    public final void mo117181i() {
        String str;
        String str2;
        Float f;
        String str3;
        ShoutoutsPrice price;
        StandardMoney creatorEarning;
        HashMap hashMap = new HashMap();
        if (C89219l.m154714a((Object) this.f167509g, (Object) "tools_preview") || C89219l.m154714a((Object) this.f167509g, (Object) "add_anchor")) {
            str = "video_post_page";
        } else if (C89219l.m154714a((Object) this.f167509g, (Object) "home_page") && m130928n()) {
            str = "personal_homepage";
        } else if (!C89219l.m154714a((Object) this.f167509g, (Object) "home_page") || m130928n()) {
            str = this.f167509g;
        } else {
            str = "others_homepage";
        }
        hashMap.put("enter_from", str);
        if (m130928n()) {
            str2 = "creator";
        } else {
            str2 = "consumer";
        }
        hashMap.put("user_type", str2);
        hashMap.put("to_user_id", m130929o());
        ShoutoutsProduct shoutoutsProduct = this.f167505c;
        Integer num = null;
        if (shoutoutsProduct != null) {
            f = Float.valueOf(shoutoutsProduct.getRatingAvg());
        } else {
            f = null;
        }
        hashMap.put("score", String.valueOf(f));
        ShoutoutsProduct shoutoutsProduct2 = this.f167505c;
        if (!(shoutoutsProduct2 == null || (price = shoutoutsProduct2.getPrice()) == null || (creatorEarning = price.getCreatorEarning()) == null)) {
            num = Integer.valueOf(creatorEarning.getMoney());
        }
        hashMap.put("price", String.valueOf(num));
        hashMap.put("enter_method", m130930p());
        if (this.f167510h) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        hashMap.put("is_unfold", str3);
        C39162r.m79460a("show_shoutouts_detail_page", hashMap);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$b */
    public static final class C74491b implements AbstractC74385a {

        /* renamed from: a */
        public boolean f167528a;

        /* renamed from: b */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167529b;

        static {
            Covode.recordClassIndex(87294);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74491b(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f167529b = shoutoutsProductPreviewActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.shoutouts.api.AbstractC74385a
        /* renamed from: a */
        public final void mo93983a(boolean z) {
            this.f167529b.f167510h = z;
            if (z) {
                if (this.f167529b.mo117175c().mo129273g()) {
                    this.f167529b.mo117174a(false);
                    this.f167528a = true;
                }
            } else if (this.f167528a) {
                this.f167528a = false;
                this.f167529b.mo117174a(false);
            }
            this.f167529b.mo117181i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$r */
    public static final class C74511r implements C74585b.AbstractC74587a {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167555a;

        static {
            Covode.recordClassIndex(87314);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74511r(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f167555a = shoutoutsProductPreviewActivity;
        }

        /* renamed from: a */
        private static Bundle m130945a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$r$a */
        static final class C74512a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C74511r f167556a;

            static {
                Covode.recordClassIndex(87315);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C74512a(C74511r rVar) {
                super(1);
                this.f167556a = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                C23025b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37416a(R.string.a8y, C745131.f167557a);
                String string = this.f167556a.f167555a.getResources().getString(R.string.as0);
                C89219l.m154716b(string, "");
                bVar2.mo37419b(string, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity.C74511r.C74512a.C745142 */

                    /* renamed from: a */
                    final /* synthetic */ C74512a f167558a;

                    static {
                        Covode.recordClassIndex(87317);
                    }

                    {
                        this.f167558a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        C89219l.m154721d(aVar, "");
                        C74387a.m130854a(this.f167558a.f167556a.f167555a, this.f167558a.f167556a.f167555a.mo117179g(), "shoutouts_detail_page");
                        return C89391z.f203057a;
                    }
                });
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shoutouts.review.view.C74585b.AbstractC74587a
        /* renamed from: a */
        public final void mo117187a(EnumC74550a aVar) {
            String str;
            Bundle a;
            Bundle a2;
            Integer num;
            boolean z;
            String string;
            ShoutoutsOrderRestrict restrict;
            ShoutoutsOrderRestrict restrict2;
            ShoutoutsOrderRestrict restrict3;
            C89219l.m154721d(aVar, "");
            int i = C74559d.f167663a[aVar.ordinal()];
            Integer num2 = null;
            r4 = null;
            String str2 = null;
            num2 = null;
            if (i != 1) {
                if (i == 2) {
                    Intent intent = this.f167555a.getIntent();
                    if (intent == null || (a2 = m130945a(intent)) == null) {
                        str = null;
                    } else {
                        str = a2.getString("title");
                    }
                    Intent intent2 = this.f167555a.getIntent();
                    if (!(intent2 == null || (a = m130945a(intent2)) == null)) {
                        num2 = Integer.valueOf(a.getInt(StringSet.type));
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("third_id", this.f167555a.mo117179g());
                    if (str != null && num2 != null) {
                        int intValue = num2.intValue();
                        String jSONObject2 = jSONObject.toString();
                        C89219l.m154716b(jSONObject2, "");
                        AbstractC81915c.m141874a(new C37609a(new C39053a(intValue, jSONObject2, str, null, null, null, null, false, null, null, null, null, null, 8184, null)));
                        this.f167555a.finish();
                    }
                } else if (i == 5) {
                    ShoutoutsProduct shoutoutsProduct = this.f167555a.f167505c;
                    if (shoutoutsProduct == null || (restrict3 = shoutoutsProduct.getRestrict()) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(restrict3.getRestrictType());
                    }
                    if (num != null && num.intValue() == 2) {
                        String string2 = this.f167555a.getResources().getString(R.string.h18);
                        C89219l.m154716b(string2, "");
                        String a3 = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{18}, 1));
                        C89219l.m154716b(a3, "");
                        String string3 = this.f167555a.getResources().getString(R.string.h19);
                        C89219l.m154716b(string3, "");
                        String a4 = C1764a.m5928a(string3, Arrays.copyOf(new Object[]{18, 18}, 2));
                        C89219l.m154716b(a4, "");
                        C23028c.m43435a(new C23023b(this.f167555a).mo37411b(a3).mo37413d(a4), new C74512a(this)).mo37405a().mo37396b().show();
                        return;
                    }
                    ShoutoutsProduct shoutoutsProduct2 = this.f167555a.f167505c;
                    if (shoutoutsProduct2 == null || (restrict2 = shoutoutsProduct2.getRestrict()) == null) {
                        z = false;
                    } else {
                        z = restrict2.getOtherRestrict();
                    }
                    ShoutoutsProduct shoutoutsProduct3 = this.f167555a.f167505c;
                    if (!(shoutoutsProduct3 == null || (restrict = shoutoutsProduct3.getRestrict()) == null)) {
                        str2 = restrict.getReason();
                    }
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (C74560a.m130985b(g.getCurUserId())) {
                        Resources resources = this.f167555a.getResources();
                        if (resources != null && (string = resources.getString(R.string.fwg)) != null) {
                            C89219l.m154716b(string, "");
                            String a5 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"10"}, 1));
                            C89219l.m154716b(a5, "");
                            new C23144b(this.f167555a).mo37635a(a5).mo37637b();
                        }
                    } else if (!z) {
                        ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity = this.f167555a;
                        C74387a.m130854a(shoutoutsProductPreviewActivity, shoutoutsProductPreviewActivity.mo117179g(), "shoutouts_detail_page");
                    } else if (str2 != null) {
                        new C23144b(this.f167555a).mo37635a(str2).mo37637b();
                    }
                }
            } else if (C89219l.m154714a((Object) this.f167555a.f167509g, (Object) "tools_preview")) {
                new C23144b(this.f167555a).mo37635a(this.f167555a.getResources().getString(R.string.fxb)).mo37637b();
            } else {
                C74387a.m130852a(this.f167555a, (Integer) null, "shoutouts_detail_page");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$g */
    static final class C74497g extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C74497g f167536a = new C74497g();

        static {
            Covode.recordClassIndex(87300);
        }

        C74497g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C744981.f167537a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$h */
    static final class View$OnClickListenerC74499h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167538a;

        static {
            Covode.recordClassIndex(87302);
        }

        View$OnClickListenerC74499h(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f167538a = shoutoutsProductPreviewActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167538a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$l */
    public static final class View$OnClickListenerC74503l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167542a;

        static {
            Covode.recordClassIndex(87306);
        }

        View$OnClickListenerC74503l(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f167542a = shoutoutsProductPreviewActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167542a.mo117174a(true);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onRestoreInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onRestoreInstanceState(bundle);
        bundle.putString("creator_id", this.f167513l);
        bundle.putString("product_id", mo117179g());
        bundle.putInt("is_anchor_add", this.f167515n);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onShoutoutProductStatusChanged(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (jVar.f111077b != null && !(!C89219l.m154714a((Object) jVar.f111077b.optString("eventName"), (Object) "shoutouts_abnormal_close")) && C89219l.m154714a((Object) jVar.f111077b.optString("product_id"), (Object) mo117179g())) {
            finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity$i */
    static final class View$OnClickListenerC74500i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsProductPreviewActivity f167539a;

        static {
            Covode.recordClassIndex(87303);
        }

        View$OnClickListenerC74500i(ShoutoutsProductPreviewActivity shoutoutsProductPreviewActivity) {
            this.f167539a = shoutoutsProductPreviewActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C69684e.C69686b a = new C69684e.C69686b().mo109824a(new SharePackage.C69654a().mo109803a("").mo109805a());
            a.f155589t = true;
            Aweme aweme = this.f167539a.f167503a;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = this.f167539a.f167503a;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C69684e.C69686b a2 = a.mo109827a(new C74487f(str, str2));
            a2.f155584o = false;
            new DialogC69695i(this.f167539a, R.style.a1c, a2.mo109831a()).show();
        }
    }

    /* renamed from: a */
    public final void mo117174a(boolean z) {
        if (this.f167511j) {
            if (!mo117175c().mo129273g() && this.f167504b != null) {
                mo117175c().mo129262a(this.f167504b);
                this.f167511j = false;
                this.f167512k = false;
                m130926l().setVisibility(8);
            }
        } else if (mo117175c().mo129273g()) {
            mo117175c().mo129267b();
            this.f167511j = true;
            if (z) {
                this.f167512k = true;
                m130926l().setVisibility(0);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String a;
        Integer num;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onCreate", true);
        activityConfiguration(C74497g.f167536a);
        super.onCreate(bundle);
        setContentView(R.layout.azj);
        if (bundle != null) {
            this.f167513l = bundle.getString("creator_id");
            this.f167514m = bundle.getString("product_id");
            this.f167515n = bundle.getInt("is_anchor_add");
            this.f167509g = bundle.getString("enter_from");
        } else {
            try {
                this.f167513l = m130923a(getIntent(), "creator_id");
                this.f167514m = m130923a(getIntent(), "product_id");
                try {
                    this.f167515n = getIntent().getIntExtra("is_anchor_add", 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.f167515n == 1) {
                    a = "add_anchor";
                } else {
                    a = m130923a(getIntent(), "enter_from");
                }
                this.f167509g = a;
                if (C89219l.m154714a((Object) a, (Object) "anchor_detail")) {
                    this.f167509g = m130923a(getIntent(), "enter_from_detail");
                }
                this.f167520s = m130923a(getIntent(), "currencyCharacter");
                this.f167521t = m130923a(getIntent(), "description");
                String a2 = m130923a(getIntent(), "coin");
                if (a2 != null) {
                    C89219l.m154716b(a2, "");
                    this.f167518q = C89361p.m154863e(a2);
                }
                String a3 = m130923a(getIntent(), "standardMoney");
                if (a3 != null) {
                    C89219l.m154716b(a3, "");
                    Float c = C89361p.m154861c(a3);
                    if (c != null) {
                        num = Integer.valueOf((int) c.floatValue());
                    } else {
                        num = null;
                    }
                    this.f167519r = num;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        m130925k().setBuilder(DmtStatusView.C17269a.m31905a(this));
        ((AutoRTLImageView) this.f167526y.getValue()).setOnClickListener(new View$OnClickListenerC74499h(this));
        m130927m().setOnClickListener(new View$OnClickListenerC74500i(this));
        mo117178f();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsProductPreviewActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shoutouts.p3901a.AbstractC74382a.AbstractC74383a
    /* renamed from: a */
    public final void mo117000a(ShoutoutsProduct shoutoutsProduct) {
        Video video;
        Boolean bool;
        Integer num;
        ShoutoutsOrderRestrict restrict;
        ShoutoutsOrderRestrict restrict2;
        String g;
        ShoutoutsProduct shoutoutsProduct2;
        int i;
        int coin;
        int i2;
        MethodCollector.m26663i(688);
        C89219l.m154721d(shoutoutsProduct, "");
        this.f167505c = shoutoutsProduct;
        Aweme videoInfo = shoutoutsProduct.getVideoInfo();
        this.f167503a = videoInfo;
        if (videoInfo != null) {
            video = videoInfo.getVideo();
        } else {
            video = null;
        }
        this.f167504b = video;
        if (video != null) {
            KeepSurfaceTextureView j = m130924j();
            if (j.getWidth() == 0 || j.getHeight() == 0) {
                j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC74515s(this, j, video));
            } else {
                new C49617c().mo81411a(this, j, video.getWidth(), video.getHeight());
            }
            mo117175c().mo129265a(m130924j());
            mo117175c().mo129268b(this);
            C84294j.m144981a(m130924j()).mo129312a(new C74496f(this));
        }
        mo117180h();
        m130925k().mo27382d();
        m130925k().setVisibility(8);
        this.f167516o = true;
        mo117176d().addView(mo117177e());
        String str = this.f167521t;
        if (str != null) {
            mo117177e().setDescription(str);
        } else {
            String description = shoutoutsProduct.getDescription();
            if (description != null) {
                mo117177e().setDescription(description);
            }
        }
        ShoutoutsPrice price = shoutoutsProduct.getPrice();
        if (price != null) {
            Integer num2 = this.f167518q;
            if (num2 != null) {
                coin = num2.intValue();
            } else {
                coin = price.getCoin();
            }
            Integer num3 = this.f167519r;
            if (num3 == null) {
                StandardMoney buyerPayment = price.getBuyerPayment();
                if (buyerPayment != null) {
                    num3 = Integer.valueOf(buyerPayment.getMoney());
                } else {
                    num3 = null;
                }
            }
            String str2 = this.f167520s;
            if (str2 == null) {
                StandardMoney buyerPayment2 = price.getBuyerPayment();
                if (buyerPayment2 != null) {
                    str2 = buyerPayment2.getCurrencyCharacter();
                } else {
                    str2 = null;
                }
            }
            C74544c e = mo117177e();
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = 0;
            }
            e.mo117205a(coin, i2, str2, shoutoutsProduct.getRatingAvg(), (long) shoutoutsProduct.getRatingCnt(), m130928n(), shoutoutsProduct.getShowRating());
        }
        if (shoutoutsProduct.getShowRating()) {
            C74544c e2 = mo117177e();
            String o = m130929o();
            String g2 = mo117179g();
            PowerList powerList = e2.f167625a;
            if (powerList != null) {
                powerList.mo28079a(1, C1764a.m5927a(LayoutInflater.from(powerList.getContext()), R.layout.azx, powerList, false));
                powerList.mo28082a(e2.getViewModel().mo117190a());
            }
            e2.getViewModel().f167576a = o;
            e2.getViewModel().f167577b = g2;
            e2.getViewModel().f167578c = e2.getResources().getString(R.string.dcn);
            e2.getViewModel().mo117190a().f42330c.mo28163e();
        }
        mo117177e().setBottomSheetCallback(new C74491b(this));
        if (C89219l.m154714a((Object) this.f167509g, (Object) "tools_preview") || C89219l.m154714a((Object) this.f167509g, (Object) "add_anchor")) {
            mo117177e().mo117203a();
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) C74544c.f167623d, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(500);
        mo117177e().setAnimation(animationSet);
        animationSet.start();
        if (!m130928n()) {
            ShoutoutsProduct shoutoutsProduct3 = this.f167505c;
            if (shoutoutsProduct3 == null || (restrict2 = shoutoutsProduct3.getRestrict()) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(restrict2.getOpening());
            }
            ShoutoutsProduct shoutoutsProduct4 = this.f167505c;
            if (shoutoutsProduct4 == null || (restrict = shoutoutsProduct4.getRestrict()) == null) {
                num = null;
            } else {
                num = Integer.valueOf(restrict.getRestrictType());
            }
            if (C89219l.m154714a((Object) bool, (Object) false)) {
                mo117177e().mo117206a(EnumC74550a.CONSUMER_OUT_OF_SERVICE);
            } else if (num != null && num.intValue() == 1) {
                mo117177e().mo117206a(EnumC74550a.CONSUMER_AGE_LESS_THAN_18);
            } else {
                mo117177e().mo117206a(EnumC74550a.CONSUMER_FILL_ORDER);
            }
        } else if (this.f167515n == 1) {
            mo117177e().mo117206a(EnumC74550a.CREATOR_ADD_TO_VIDEO);
        } else {
            mo117177e().mo117206a(EnumC74550a.CREATOR_MANAGE);
        }
        mo117177e().setReviewBottomBtnClickListener(new C74511r(this));
        if (m130928n() && (shoutoutsProduct2 = this.f167505c) != null && !shoutoutsProduct2.getPosted() && (!C89219l.m154714a((Object) this.f167509g, (Object) "tools_preview")) && (!C89219l.m154714a((Object) this.f167509g, (Object) "add_anchor"))) {
            if (mo117177e().getCurrentStyle() == EnumC74550a.CONSUMER_AGE_LESS_THAN_18) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                i = C89241a.m154730a(TypedValue.applyDimension(1, 33.0f, system.getDisplayMetrics()));
            } else {
                i = 0;
            }
            ShoutOutPopupView popupView = mo117177e().getPopupView();
            ViewGroup.LayoutParams layoutParams = popupView.getLayoutParams();
            if (layoutParams != null) {
                int i3 = C74544c.f167623d;
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i3 + C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())) + i;
                View view = popupView.f167671a;
                if (view == null) {
                    C89219l.m154710a("clPostIntroView");
                }
                view.setVisibility(0);
                View view2 = popupView.f167671a;
                if (view2 == null) {
                    C89219l.m154710a("clPostIntroView");
                }
                view2.findViewById(R.id.bu5).setOnClickListener(new ShoutOutPopupView.View$OnClickListenerC74568b(popupView));
                TuxButton tuxButton = popupView.f167673c;
                if (tuxButton == null) {
                    C89219l.m154710a("clPostView");
                }
                tuxButton.setOnClickListener(new ShoutOutPopupView.View$OnClickListenerC74569c(popupView));
                popupView.requestLayout();
                mo117177e().setPostIntroVideoListener(new C74506o(this));
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                MethodCollector.m26664o(688);
                throw nullPointerException;
            }
        }
        if (this.f167517p) {
            mo117001b();
        }
        if (!m130928n()) {
            m130927m().setVisibility(0);
        }
        if (!this.f167517p && m130928n() && this.f167514m == null && (!C89219l.m154714a((Object) this.f167509g, (Object) "tools_preview")) && (!C89219l.m154714a((Object) this.f167509g, (Object) "add_anchor")) && (g = mo117179g()) != null) {
            this.f167507e.mo117223a(g);
        }
        if (this.f167504b == null) {
            m130924j().setVisibility(8);
            ((ImageView) this.f167500D.getValue()).setVisibility(0);
        }
        mo117181i();
        MethodCollector.m26664o(688);
    }

    /* renamed from: a */
    private static String m130923a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.p2082ss.android.ugc.aweme.autoplay.player.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import com.C1764a;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.discover.p2766b.C41890j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.flowfeed.p2994b.C51045a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51056d;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.main.C59092g;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61501c;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.AbstractC72888b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p2082ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg;
import com.p2082ss.android.ugc.aweme.utils.C80297cf;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView */
public final class SearchVideoView extends FrameLayout implements WeakHandler.IHandler, AbstractC34186b.AbstractC34192d, AbstractC34259f, AbstractC72888b, AbstractC80379eg {

    /* renamed from: d */
    public static final C34236a f80955d = new C34236a((byte) 0);

    /* renamed from: a */
    public boolean f80956a;

    /* renamed from: b */
    public MotionEvent f80957b;

    /* renamed from: c */
    public MotionEvent f80958c;

    /* renamed from: e */
    private AbstractC34237b f80959e;

    /* renamed from: f */
    private C34246c f80960f;

    /* renamed from: g */
    private ImageView f80961g;

    /* renamed from: h */
    private SearchPlayerCore f80962h;

    /* renamed from: i */
    private boolean f80963i;

    /* renamed from: j */
    private boolean f80964j;

    /* renamed from: k */
    private ViewGroup f80965k;

    /* renamed from: l */
    private ImageView f80966l;

    /* renamed from: m */
    private LongPressLayout f80967m;

    /* renamed from: n */
    private boolean f80968n;

    /* renamed from: o */
    private final AbstractC89244h f80969o;

    /* renamed from: p */
    private final AbstractC89244h f80970p;

    /* renamed from: q */
    private View.OnTouchListener f80971q;

    /* renamed from: r */
    private long f80972r;

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$b */
    public interface AbstractC34237b {
        static {
            Covode.recordClassIndex(41174);
        }

        /* renamed from: a */
        void mo60415a(C71904j jVar);
    }

    static {
        Covode.recordClassIndex(41172);
    }

    public SearchVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final RotateAnimation getMRotateAnimation() {
        return (RotateAnimation) this.f80970p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    public final WeakHandler getMHandler() {
        return (WeakHandler) this.f80969o.getValue();
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
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    public final void onPause() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
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
    public final void onRetryOnError(String str, C84208l lVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    public final void onStop() {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, EnumC63056b bVar, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$a */
    public static final class C34236a {
        static {
            Covode.recordClassIndex(41173);
        }

        private C34236a() {
        }

        public /* synthetic */ C34236a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    /* renamed from: B */
    public final void mo60425B() {
        mo60631e();
    }

    public final SearchPlayerCore getCore() {
        return this.f80962h;
    }

    public final C34246c getDataProvider() {
        return this.f80960f;
    }

    public final boolean getEnableHideCoverAnim() {
        return this.f80963i;
    }

    public final boolean getEnableLifecycleObserver() {
        return this.f80964j;
    }

    public final ImageView getMCoverView() {
        return this.f80961g;
    }

    public final AbstractC34237b getVideoPlayerStatusListener() {
        return this.f80959e;
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        AbstractC80379eg.C80380a.onCreate(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC80379eg.C80380a.onDestroy(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    public final void onResume() {
        mo60429g();
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC80379eg.C80380a.onStart(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$d */
    public static final class C34239d implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ SearchVideoView f80974a;

        static {
            Covode.recordClassIndex(41176);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
            this.f80974a.mo60631e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34239d(SearchVideoView searchVideoView) {
            this.f80974a = searchVideoView;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            C34246c dataProvider = this.f80974a.getDataProvider();
            if (dataProvider != null && dataProvider.mo60499c()) {
                this.f80974a.hashCode();
                this.f80974a.hashCode();
                C51060g mScrollStateManager = this.f80974a.getMScrollStateManager();
                if (mScrollStateManager != null) {
                    mScrollStateManager.mo86395a(this.f80974a.getMScrollStateObserver());
                }
                C51060g mScrollStateManager2 = this.f80974a.getMScrollStateManager();
                if (mScrollStateManager2 != null) {
                    mScrollStateManager2.mo86400e();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return getItemView();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$e */
    static final class C34240e extends AbstractC89220m implements AbstractC89171a<WeakHandler> {

        /* renamed from: a */
        final /* synthetic */ SearchVideoView f80975a;

        static {
            Covode.recordClassIndex(41177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34240e(SearchVideoView searchVideoView) {
            super(0);
            this.f80975a = searchVideoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(Looper.getMainLooper(), this.f80975a);
        }
    }

    private final View getItemView() {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            return cVar.f80984a;
        }
        return null;
    }

    private final C61501c getMPlayVideoHelper() {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            return cVar.f80989f;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    /* renamed from: A */
    public final void mo60424A() {
        AbstractC34259f fVar;
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.mo60424A();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void bg_() {
        AbstractC34259f fVar;
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.bg_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void bi_() {
        AbstractC34259f fVar;
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.bi_();
        }
    }

    /* renamed from: e */
    public final void mo60631e() {
        ImageView imageView = this.f80961g;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
        }
    }

    public final Aweme getMAweme() {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            return cVar.f80987d;
        }
        return null;
    }

    public final String getMEventType() {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            return cVar.f81001r;
        }
        return null;
    }

    public final C51060g getMScrollStateManager() {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            return cVar.f80993j;
        }
        return null;
    }

    public final AbstractC51064i getMScrollStateObserver() {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            return cVar.f80994k;
        }
        return null;
    }

    public final long getCurrentPosition() {
        long j = this.f80972r;
        if (j > 0) {
            return j;
        }
        SearchPlayerCore searchPlayerCore = this.f80962h;
        if (searchPlayerCore != null) {
            return searchPlayerCore.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$f */
    static final class C34241f extends AbstractC89220m implements AbstractC89171a<RotateAnimation> {

        /* renamed from: a */
        public static final C34241f f80976a = new C34241f();

        static {
            Covode.recordClassIndex(41178);
        }

        C34241f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RotateAnimation invoke() {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration(1000);
            return rotateAnimation;
        }
    }

    /* renamed from: h */
    private final void m70001h() {
        if (this.f80963i) {
            ImageView imageView = this.f80961g;
            if (imageView == null || imageView.getVisibility() != 8) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80961g, View.ALPHA, 1.0f, 0.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new C34238c(this));
                ofFloat.start();
                return;
            }
            return;
        }
        ImageView imageView2 = this.f80961g;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.AbstractC72888b
    public final AbsInteractStickerWidget aI_() {
        Context context;
        AbsInteractStickerWidget a = C51045a.m95435a().mo118501a();
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            context = cVar.mo60502f();
        } else {
            context = null;
        }
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ActivityC0945e eVar = (ActivityC0945e) context;
        C33947e.m69517a(eVar, null, getItemView(), eVar).mo60216a(R.id.bp8, a);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    /* renamed from: g */
    public final void mo60429g() {
        AbstractC34259f fVar;
        C51053b a;
        SearchPlayerCore searchPlayerCore = this.f80962h;
        if (searchPlayerCore != null) {
            searchPlayerCore.setVisibility(8);
        }
        SearchPlayerCore searchPlayerCore2 = this.f80962h;
        if (searchPlayerCore2 != null) {
            searchPlayerCore2.setVisibility(0);
        }
        C34246c cVar = this.f80960f;
        if (cVar == null || (a = cVar.mo60666a()) == null || a.f117762f == null) {
            mo60631e();
        }
        C34246c cVar2 = this.f80960f;
        if (cVar2 != null && (fVar = cVar2.f81000q) != null) {
            fVar.mo60429g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f80964j) {
            Context context = getContext();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar != null) {
                C80375ef.m139357b(eVar, this);
            }
        }
        hashCode();
        AbstractC51064i mScrollStateObserver = getMScrollStateObserver();
        if (mScrollStateObserver != null) {
            mScrollStateObserver.hashCode();
        }
        C51060g mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.mo86397b(getMScrollStateObserver());
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        C67568r rVar = null;
        if (this.f80964j) {
            Context context = getContext();
            if (!(context instanceof ActivityC0945e)) {
                context = null;
            }
            ActivityC0945e eVar = (ActivityC0945e) context;
            if (eVar != null) {
                C80375ef.m139356a(eVar, this);
            }
        }
        hashCode();
        AbstractC51064i mScrollStateObserver = getMScrollStateObserver();
        if (mScrollStateObserver != null) {
            mScrollStateObserver.hashCode();
        }
        C51060g mScrollStateManager = getMScrollStateManager();
        if (mScrollStateManager != null) {
            mScrollStateManager.mo86395a(getMScrollStateObserver());
        }
        ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
        Aweme mAweme = getMAweme();
        if (mAweme == null || (str = mAweme.getAid()) == null) {
            str = "";
        }
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            rVar = cVar.f81007x;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
    }

    public final void setCore(SearchPlayerCore searchPlayerCore) {
        this.f80962h = searchPlayerCore;
    }

    public final void setCurrentPosition(long j) {
        this.f80972r = j;
    }

    public final void setDataProvider(C34246c cVar) {
        this.f80960f = cVar;
    }

    public final void setEnableHideCoverAnim(boolean z) {
        this.f80963i = z;
    }

    public final void setEnableLifecycleObserver(boolean z) {
        this.f80964j = z;
    }

    public final void setMCoverView(ImageView imageView) {
        this.f80961g = imageView;
    }

    public final void setVideoPlayerStatusListener(AbstractC34237b bVar) {
        this.f80959e = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$c */
    public static final class C34238c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ SearchVideoView f80973a;

        static {
            Covode.recordClassIndex(41175);
        }

        C34238c(SearchVideoView searchVideoView) {
            this.f80973a = searchVideoView;
        }

        public final void onAnimationEnd(Animator animator) {
            ImageView mCoverView = this.f80973a.getMCoverView();
            if (mCoverView != null) {
                mCoverView.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private final void m69999a(C71904j jVar) {
        AbstractC34237b bVar = this.f80959e;
        if (bVar != null) {
            bVar.mo60415a(jVar);
        }
    }

    public final void setMAweme(Aweme aweme) {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            cVar.f80987d = aweme;
        }
    }

    public final void setMScrollStateManager(C51060g gVar) {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            cVar.f80993j = gVar;
        }
    }

    public final void setMScrollStateObserver(AbstractC51064i iVar) {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            cVar.f80994k = iVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onDecoderBuffering(boolean z) {
        AbstractC34259f fVar;
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onDecoderBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayProgressChange(float f) {
        AbstractC34259f fVar;
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onPlayProgressChange(f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onRetryOnError(C84208l lVar) {
        AbstractC34259f fVar;
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onRetryOnError(lVar);
        }
    }

    public final void setMEventType(String str) {
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            if (str == null) {
                str = "";
            }
            cVar.mo60667a(str);
        }
    }

    /* renamed from: a */
    public final void mo60628a(int i) {
        if (i == 0) {
            m70000a(false);
        } else if (i == 1) {
            m70000a(false);
        } else if (i == 2) {
            m70000a(true);
        } else if (i == 3) {
            m70000a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayCompleted(String str) {
        C89219l.m154716b(C1764a.m5928a("onPlayCompleted: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        m69999a(new C71904j(7));
    }

    public final void setTapContainer(LongPressLayout longPressLayout) {
        C89219l.m154721d(longPressLayout, "");
        longPressLayout.setTapListener(this.f80971q);
        LongPressLayout longPressLayout2 = this.f80967m;
        if (longPressLayout2 != null) {
            longPressLayout2.setTapListener(null);
        }
    }

    /* renamed from: a */
    private final void m70000a(boolean z) {
        if (this.f80968n) {
            if (z) {
                ImageView imageView = this.f80966l;
                if (imageView == null || imageView.getVisibility() != 0) {
                    ImageView imageView2 = this.f80966l;
                    if (imageView2 != null) {
                        imageView2.startAnimation(getMRotateAnimation());
                    }
                    ImageView imageView3 = this.f80966l;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            ImageView imageView4 = this.f80966l;
            if (imageView4 == null || imageView4.getVisibility() != 8) {
                ImageView imageView5 = this.f80966l;
                if (imageView5 != null) {
                    imageView5.clearAnimation();
                }
                ImageView imageView6 = this.f80966l;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        AbstractC34186b.AbstractC34187a aVar;
        if (message != null && message.what == 0 && !C58001a.m104815a(this.f80965k, 1200) && SystemClock.elapsedRealtime() - C80297cf.f179823a >= 1000) {
            C80297cf.f179823a = SystemClock.elapsedRealtime();
            C34246c cVar = this.f80960f;
            if (cVar != null && (aVar = cVar.f80996m) != null) {
                aVar.mo60412a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPausePlay(String str) {
        AbstractC34259f fVar;
        if (C41890j.m83916d()) {
            mo60631e();
        }
        C61501c mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            this.f80972r = mPlayVideoHelper.mo99151c();
        }
        mo60628a(1);
        m69999a(new C71904j(4));
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onPausePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayCompletedFirstTime(String str) {
        AbstractC34259f fVar;
        C89219l.m154716b(C1764a.m5928a("onPlayCompletedFirstTime: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        m69999a(new C71904j(6));
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayFailed(C84208l lVar) {
        AbstractC34259f fVar;
        C89219l.m154716b(C1764a.m5928a("onPlayFailed: error=%s", Arrays.copyOf(new Object[]{lVar}, 1)), "");
        m69999a(new C71904j(1));
        mo60628a(1);
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onPlayFailed(lVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        C51053b a;
        C51053b a2;
        AbstractC80747i iVar;
        C34246c cVar = this.f80960f;
        if (!(cVar == null || (a2 = cVar.mo60666a()) == null || (iVar = a2.f117762f) == null)) {
            Boolean.valueOf(iVar.mo123892o());
        }
        m69999a(new C71904j(12));
        C34246c cVar2 = this.f80960f;
        if (cVar2 == null || (a = cVar2.mo60666a()) == null || a.f117762f == null) {
            mo60631e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPreparePlay(String str) {
        AbstractC34259f fVar;
        C89219l.m154716b(C1764a.m5928a("onPreparePlay: sourceId=%s, visibility: " + getVisibility(), Arrays.copyOf(new Object[]{str}, 1)), "");
        mo60628a(2);
        m69999a(new C71904j(2));
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onPreparePlay(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onResumePlay(String str) {
        long j;
        AbstractC34259f fVar;
        getVisibility();
        m70001h();
        mo60628a(0);
        C61501c mPlayVideoHelper = getMPlayVideoHelper();
        long j2 = 0;
        if (mPlayVideoHelper != null) {
            j = mPlayVideoHelper.mo99150b();
        } else {
            j = 0;
        }
        C61501c mPlayVideoHelper2 = getMPlayVideoHelper();
        if (mPlayVideoHelper2 != null) {
            j2 = mPlayVideoHelper2.mo99151c();
        }
        m69999a(new C71904j(j, j2));
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onResumePlay(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$h */
    static final class C34243h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SearchVideoView f80978a;

        static {
            Covode.recordClassIndex(41180);
        }

        C34243h(SearchVideoView searchVideoView) {
            this.f80978a = searchVideoView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC80747i iVar;
            C89219l.m154721d(obj, "");
            if (C89219l.m154714a((Object) "on_ear_phone_unplug", obj)) {
                C34246c dataProvider = this.f80978a.getDataProvider();
                if (dataProvider == null || (iVar = dataProvider.f80998o) == null || !iVar.mo123892o()) {
                    C59092g.m108570a("pause", this.f80978a.getMEventType(), this.f80978a.getMAweme());
                    return;
                }
                SearchPlayerCore core = this.f80978a.getCore();
                if (core != null) {
                    core.bi_();
                }
                this.f80978a.mo60628a(1);
                C59092g.m108570a("play", this.f80978a.getMEventType(), this.f80978a.getMAweme());
            }
        }
    }

    /* renamed from: a */
    public final void mo60629a(Aweme aweme) {
        C67568r rVar;
        String str = "";
        C89219l.m154721d(aweme, str);
        ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
        String aid = aweme.getAid();
        if (aid != null) {
            str = aid;
        }
        C34246c cVar = this.f80960f;
        if (cVar != null) {
            rVar = cVar.f81007x;
        } else {
            rVar = null;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
        setMAweme(aweme);
        SearchPlayerCore searchPlayerCore = this.f80962h;
        if (searchPlayerCore != null) {
            searchPlayerCore.mo60586a(aweme);
        }
        if (!(getMAweme() == null || getMAweme() == null)) {
            mo60631e();
        }
        m70000a(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onBuffering(boolean z) {
        int i;
        AbstractC34259f fVar;
        String str;
        m69999a(new C71904j(z));
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        mo60628a(i);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = Boolean.valueOf(z);
            C89219l.m154716b(C1764a.m5928a("onBuffering: sourceId=%s, start=%s", Arrays.copyOf(objArr, 2)), "");
        }
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onBuffering(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onRenderFirstFrame(C84216o oVar) {
        String str;
        AbstractC34259f fVar;
        if (oVar != null) {
            str = oVar.getId();
        } else {
            str = null;
        }
        C89219l.m154716b(C1764a.m5928a("onRenderFirstFrame: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        m70001h();
        m69999a(new C71904j(5));
        if (TextUtils.equals(getMEventType(), "homepage_follow") && (getContext() instanceof ActivityC0945e)) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FollowPageFirstFrameViewModel.m138884a((ActivityC0945e) context);
        }
        C59092g.m108569a("video_play");
        C34246c cVar = this.f80960f;
        if (cVar != null && (fVar = cVar.f81000q) != null) {
            fVar.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        String str;
        C89219l.m154721d(nVar, "");
        mo60628a(0);
        if (getMAweme() != null) {
            Object[] objArr = new Object[2];
            Aweme mAweme = getMAweme();
            if (mAweme != null) {
                str = mAweme.getAid();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = Long.valueOf(nVar.f188113c);
            C89219l.m154716b(C1764a.m5928a("onRenderReady: preload, sourceId=%s, duration=%d", Arrays.copyOf(objArr, 2)), "");
        }
        m69999a(new C71904j(0, nVar.f188113c));
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.video.SearchVideoView$g */
    static final class View$OnTouchListenerC34242g implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ SearchVideoView f80977a;

        static {
            Covode.recordClassIndex(41179);
        }

        View$OnTouchListenerC34242g(SearchVideoView searchVideoView) {
            this.f80977a = searchVideoView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            MotionEvent motionEvent2;
            MotionEvent motionEvent3;
            long j;
            C89219l.m154716b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                if (this.f80977a.getMHandler().hasMessages(0)) {
                    this.f80977a.getMHandler().removeMessages(0);
                }
                MotionEvent motionEvent4 = this.f80977a.f80957b;
                MotionEvent motionEvent5 = this.f80977a.f80958c;
                int scaledDoubleTapSlop = ViewConfiguration.get(this.f80977a.getContext()).getScaledDoubleTapSlop();
                int i = scaledDoubleTapSlop * scaledDoubleTapSlop;
                if (!(motionEvent4 == null || motionEvent5 == null)) {
                    long eventTime = motionEvent.getEventTime() - motionEvent5.getEventTime();
                    if (eventTime <= ((long) ViewConfiguration.getDoubleTapTimeout()) && eventTime >= 40) {
                        int x = ((int) motionEvent4.getX()) - ((int) motionEvent.getX());
                        int y = ((int) motionEvent4.getY()) - ((int) motionEvent.getY());
                        if ((x * x) + (y * y) < i) {
                            this.f80977a.f80956a = true;
                            if (!(this.f80977a.f80957b == null || (motionEvent2 = this.f80977a.f80957b) == null)) {
                                motionEvent2.recycle();
                            }
                            this.f80977a.f80957b = MotionEvent.obtain(motionEvent);
                        }
                    }
                }
                this.f80977a.f80956a = false;
                motionEvent2.recycle();
                this.f80977a.f80957b = MotionEvent.obtain(motionEvent);
            } else if (action == 1) {
                if (!this.f80977a.f80956a && this.f80977a.f80957b != null && !C51056d.m95447a(this.f80977a.f80957b, motionEvent, this.f80977a.getContext())) {
                    WeakHandler mHandler = this.f80977a.getMHandler();
                    Message obtainMessage = this.f80977a.getMHandler().obtainMessage(0);
                    long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime();
                    MotionEvent motionEvent6 = this.f80977a.f80957b;
                    if (motionEvent6 != null) {
                        j = motionEvent6.getEventTime();
                    } else {
                        j = 0;
                    }
                    mHandler.sendMessageDelayed(obtainMessage, doubleTapTimeout + j);
                }
                if (!(this.f80977a.f80958c == null || (motionEvent3 = this.f80977a.f80958c) == null)) {
                    motionEvent3.recycle();
                }
                this.f80977a.f80958c = MotionEvent.obtain(motionEvent);
            } else if (action == 2 && C51056d.m95447a(this.f80977a.f80957b, motionEvent, this.f80977a.getContext())) {
                this.f80977a.getMHandler().removeMessages(0);
            }
            return false;
        }
    }

    private /* synthetic */ SearchVideoView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchVideoView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C34246c cVar;
        AbstractC84293i surfaceHolder;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8479);
        this.f80968n = true;
        this.f80969o = C89250i.m154773a((AbstractC89171a) new C34240e(this));
        this.f80970p = C89250i.m154773a((AbstractC89171a) C34241f.f80976a);
        this.f80971q = new View$OnTouchListenerC34242g(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.acf});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f80968n = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.avp, this, true);
        this.f80965k = (ViewGroup) findViewById(R.id.c7j);
        this.f80962h = (SearchPlayerCore) findViewById(R.id.eh3);
        ImageView imageView = (ImageView) findViewById(R.id.bxi);
        this.f80966l = imageView;
        if (!this.f80968n && imageView != null) {
            imageView.setVisibility(8);
        }
        this.f80967m = (LongPressLayout) findViewById(R.id.ch5);
        SearchPlayerCore searchPlayerCore = this.f80962h;
        if (searchPlayerCore != null) {
            cVar = searchPlayerCore.getDataProvider();
        } else {
            cVar = null;
        }
        this.f80960f = cVar;
        SearchPlayerCore searchPlayerCore2 = this.f80962h;
        if (searchPlayerCore2 != null) {
            searchPlayerCore2.setMVideoViewListener(this);
        }
        SearchPlayerCore searchPlayerCore3 = this.f80962h;
        if (searchPlayerCore3 != null) {
            searchPlayerCore3.setMPlayerViewListener(this);
        }
        SearchPlayerCore searchPlayerCore4 = this.f80962h;
        if (searchPlayerCore4 != null) {
            searchPlayerCore4.setMVideoMobListener(new C34250d(this.f80960f));
        }
        LongPressLayout longPressLayout = this.f80967m;
        if (longPressLayout != null) {
            longPressLayout.setTapListener(this.f80971q);
        }
        SearchPlayerCore searchPlayerCore5 = this.f80962h;
        if (!(searchPlayerCore5 == null || (surfaceHolder = searchPlayerCore5.getSurfaceHolder()) == null)) {
            surfaceHolder.mo129312a(new C34239d(this));
        }
        getMPlayVideoHelper();
        Activity j = C17873f.m33102j();
        if (j instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) j;
            HomePageDataViewModel.C52942a.m97777a(eVar).f121743i.observe(eVar, new C34243h(this));
        }
        MethodCollector.m26664o(8479);
    }
}

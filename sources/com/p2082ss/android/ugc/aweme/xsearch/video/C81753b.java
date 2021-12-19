package com.p2082ss.android.ugc.aweme.xsearch.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.lighten.p1477a.p1481d.C20744c;
import com.google.gson.p2019b.C27895a;
import com.lynx.react.bridge.JavaOnlyMap;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.autoplay.p2345a.C34039a;
import com.p2082ss.android.ugc.aweme.autoplay.p2350e.C34181a;
import com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34246c;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.C34256e;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.p2994b.C51045a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51053b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.main.C59092g;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61501c;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.search.p3690f.C67432a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.AbstractC72888b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.xsearch.C81686a;
import com.p2082ss.android.ugc.aweme.xsearch.C81688c;
import com.p2082ss.android.ugc.aweme.xsearch.C81689d;
import com.p2082ss.android.ugc.aweme.xsearch.C81690e;
import com.p2082ss.android.ugc.aweme.xsearch.C81691f;
import com.p2082ss.android.ugc.aweme.xsearch.video.C81772d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.xsearch.video.b */
public final class C81753b extends FrameLayout implements AbstractC34259f, AbstractC72888b {

    /* renamed from: c */
    public static final C81754a f182809c = new C81754a((byte) 0);

    /* renamed from: a */
    public int f182810a;

    /* renamed from: b */
    boolean f182811b;

    /* renamed from: d */
    private AbstractC81755b f182812d;

    /* renamed from: e */
    private C34246c f182813e;

    /* renamed from: f */
    private LinearGradientDraweeView f182814f;

    /* renamed from: g */
    private ImageView f182815g;

    /* renamed from: h */
    private ImageView f182816h;

    /* renamed from: i */
    private SearchPlayerCore f182817i;

    /* renamed from: j */
    private boolean f182818j;

    /* renamed from: k */
    private int f182819k;

    /* renamed from: l */
    private View f182820l;

    /* renamed from: m */
    private AbstractC89183m<? super String, ? super Map<String, ? extends Object>, C89391z> f182821m;

    /* renamed from: n */
    private String f182822n;

    /* renamed from: o */
    private final AbstractC89244h f182823o;

    /* renamed from: p */
    private final AbstractC89244h f182824p;

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$b */
    public interface AbstractC81755b {
        static {
            Covode.recordClassIndex(95162);
        }
    }

    static {
        Covode.recordClassIndex(95160);
    }

    private final C81756c.C817571 getContainerStatusProvider() {
        return (C81756c.C817571) this.f182823o.getValue();
    }

    private final C81764f.C817651 getMImageDisplayLighten() {
        return (C81764f.C817651) this.f182824p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: A */
    public final void mo60424A() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: B */
    public final void mo60425B() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void an_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bg_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f, com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final void bi_() {
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

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onDecoderBuffering(boolean z) {
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

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
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

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$a */
    public static final class C81754a {
        static {
            Covode.recordClassIndex(95161);
        }

        private C81754a() {
        }

        public /* synthetic */ C81754a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$h */
    public static final class C81767h extends C27895a<Aweme> {
        static {
            Covode.recordClassIndex(95174);
        }

        C81767h() {
        }
    }

    public final SearchPlayerCore getCore() {
        return this.f182817i;
    }

    public final C34246c getDataProvider() {
        return this.f182813e;
    }

    public final ImageView getMCoverBackground() {
        return this.f182816h;
    }

    public final ImageView getMCoverMask() {
        return this.f182815g;
    }

    public final LinearGradientDraweeView getMCoverView() {
        return this.f182814f;
    }

    public final AbstractC81755b getVideoPlayerStatusListener() {
        return this.f182812d;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    /* renamed from: z */
    public final View mo60468z() {
        return this.f182817i;
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$c */
    static final class C81756c extends AbstractC89220m implements AbstractC89171a<C817571> {

        /* renamed from: a */
        final /* synthetic */ C81753b f182825a;

        /* renamed from: b */
        final /* synthetic */ Context f182826b;

        static {
            Covode.recordClassIndex(95163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81756c(C81753b bVar, Context context) {
            super(0);
            this.f182825a = bVar;
            this.f182826b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C817571 invoke() {
            return new AbstractC51043a(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.video.C81753b.C81756c.C817571 */

                /* renamed from: a */
                final /* synthetic */ C81756c f182827a;

                static {
                    Covode.recordClassIndex(95164);
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: g */
                public final Fragment mo60503g() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: h */
                public final AbstractC84295k mo60504h() {
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: f */
                public final Context mo60502f() {
                    return this.f182827a.f182826b;
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: c */
                public final boolean mo60499c() {
                    return this.f182827a.f182825a.isAttachedToWindow();
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: e */
                public final boolean mo60501e() {
                    return this.f182827a.f182825a.isAttachedToWindow();
                }

                @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a
                /* renamed from: d */
                public final String mo60500d() {
                    return "SearchVideoForLynx_" + this.f182827a.f182826b.hashCode();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f182827a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$e */
    public static final class C81763e implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ C81753b f182833a;

        static {
            Covode.recordClassIndex(95170);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
            this.f182833a.mo125461h();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81763e(C81753b bVar) {
            this.f182833a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$f */
    static final class C81764f extends AbstractC89220m implements AbstractC89171a<C817651> {

        /* renamed from: a */
        final /* synthetic */ C81753b f182834a;

        static {
            Covode.recordClassIndex(95171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81764f(C81753b bVar) {
            super(0);
            this.f182834a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C817651 invoke() {
            return new AbstractC20727d(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.video.C81753b.C81764f.C817651 */

                /* renamed from: a */
                final /* synthetic */ C81764f f182835a;

                static {
                    Covode.recordClassIndex(95172);
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                /* renamed from: a */
                public final void mo34159a(Uri uri, View view, Throwable th) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f182835a = r1;
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                /* renamed from: a */
                public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                    C89219l.m154721d(uri, "");
                    ImageView mCoverMask = this.f182835a.f182834a.getMCoverMask();
                    if (mCoverMask != null) {
                        mCoverMask.setVisibility(0);
                    }
                }
            };
        }
    }

    private final View getItemView() {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            return cVar.f80984a;
        }
        return null;
    }

    private final C61501c getMPlayVideoHelper() {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            return cVar.f80989f;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.AbstractC34186b.AbstractC34192d
    public final boolean aZ_() {
        SearchPlayerCore searchPlayerCore = this.f182817i;
        if (searchPlayerCore != null) {
            return searchPlayerCore.aZ_();
        }
        return false;
    }

    public final Aweme getMAweme() {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            return cVar.f80987d;
        }
        return null;
    }

    public final C51060g getMScrollStateManager() {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            return cVar.f80993j;
        }
        return null;
    }

    public final AbstractC51064i getMScrollStateObserver() {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            return cVar.f80994k;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo125461h() {
        ImageView imageView = this.f182816h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LinearGradientDraweeView linearGradientDraweeView = this.f182814f;
        if (linearGradientDraweeView != null) {
            linearGradientDraweeView.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$k */
    public static final class ViewTreeObserver$OnPreDrawListenerC81770k implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C81753b f182839a;

        static {
            Covode.recordClassIndex(95177);
        }

        public final boolean onPreDraw() {
            this.f182839a.mo125451e();
            this.f182839a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC81770k(C81753b bVar) {
            this.f182839a = bVar;
        }
    }

    /* renamed from: k */
    private final void m141632k() {
        ImageView imageView = this.f182816h;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LinearGradientDraweeView linearGradientDraweeView = this.f182814f;
        if (linearGradientDraweeView != null) {
            linearGradientDraweeView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    /* renamed from: g */
    public final void mo60429g() {
        C51053b a;
        C34246c cVar = this.f182813e;
        if (cVar == null || (a = cVar.mo60666a()) == null || a.f117762f == null) {
            C34246c cVar2 = this.f182813e;
            if (cVar2 == null || cVar2.f80998o == null) {
                mo125461h();
            }
        }
    }

    /* renamed from: j */
    public final void mo125463j() {
        C34256e eVar;
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        C34246c cVar = this.f182813e;
        if (cVar != null && (eVar = cVar.f80995l) != null) {
            eVar.bi_();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f182818j = false;
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        m141634m();
    }

    /* renamed from: m */
    private final void m141634m() {
        SearchPlayerCore searchPlayerCore = this.f182817i;
        if (searchPlayerCore != null) {
            C34181a.m69859b(searchPlayerCore);
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

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.AbstractC72888b
    public final AbsInteractStickerWidget aI_() {
        Context context;
        AbsInteractStickerWidget a = C51045a.m95435a().mo118501a();
        C34246c cVar = this.f182813e;
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

    /* renamed from: l */
    private final void m141633l() {
        C51060g gVar;
        AbstractC51044b bVar;
        AbstractC51044b bVar2;
        C34256e eVar;
        if (this.f182811b) {
            C34246c cVar = this.f182813e;
            if (!(cVar == null || (eVar = cVar.f80995l) == null)) {
                eVar.mo60344e();
            }
            C81686a a = C81691f.m141555a(this);
            AbstractC51044b bVar3 = null;
            if (a != null) {
                gVar = a.f182642a;
            } else {
                gVar = null;
            }
            setMScrollStateManager(gVar);
            C34246c cVar2 = this.f182813e;
            if (cVar2 != null) {
                bVar = cVar2.f80991h;
            } else {
                bVar = null;
            }
            if (bVar instanceof C81690e) {
                C34246c cVar3 = this.f182813e;
                if (cVar3 != null) {
                    bVar2 = cVar3.f80991h;
                } else {
                    bVar2 = null;
                }
                Objects.requireNonNull(bVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.xsearch.SearchLynxPlayObserver");
                C81690e eVar2 = (C81690e) bVar2;
                if (a != null) {
                    bVar3 = a.f182644c;
                }
                eVar2.f182662a = bVar3;
            }
            SearchPlayerCore searchPlayerCore = this.f182817i;
            if (searchPlayerCore != null) {
                C34181a.m69857a(searchPlayerCore);
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
        }
    }

    /* renamed from: i */
    public final void mo125462i() {
        C34256e eVar;
        C34256e eVar2;
        C51053b a;
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        AbstractC81915c.m141874a(new C67432a());
        C34246c cVar = this.f182813e;
        Integer num = null;
        if (!(cVar == null || (a = cVar.mo60666a()) == null || a.f117758b != 3)) {
            a.f117758b = 0;
        }
        C81772d dVar = C81772d.C81774b.f182846a;
        Aweme mAweme2 = getMAweme();
        C34246c cVar2 = this.f182813e;
        if (cVar2 != null) {
            eVar = cVar2.f80995l;
        } else {
            eVar = null;
        }
        C34246c cVar3 = this.f182813e;
        if (cVar3 != null) {
            num = Integer.valueOf(cVar3.f80980A);
        }
        dVar.mo125489a(mAweme2, eVar, num, this.f182811b);
        C34246c cVar4 = this.f182813e;
        if (cVar4 != null && (eVar2 = cVar4.f80995l) != null) {
            eVar2.mo60340a(150);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        String str;
        String str2;
        this.f182818j = true;
        super.onAttachedToWindow();
        Aweme mAweme = getMAweme();
        if (mAweme != null) {
            mAweme.getAid();
        }
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            cVar.f80992i = getContainerStatusProvider();
        }
        C81688c b = C81689d.f182658b.mo125341b(this.f182810a);
        C67568r rVar = null;
        if (b != null) {
            C34246c cVar2 = this.f182813e;
            if (cVar2 != null) {
                str2 = cVar2.mo60668b();
            } else {
                str2 = null;
            }
            b.f182648b = str2;
        }
        ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
        Aweme mAweme2 = getMAweme();
        if (mAweme2 == null || (str = mAweme2.getAid()) == null) {
            str = "";
        }
        C34246c cVar3 = this.f182813e;
        if (cVar3 != null) {
            rVar = cVar3.f81007x;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
        if (aZ_()) {
            Aweme mAweme3 = getMAweme();
            if (mAweme3 != null) {
                mAweme3.getAid();
            }
            mo125462i();
        } else {
            mo125461h();
            Aweme mAweme4 = getMAweme();
            if (mAweme4 != null) {
                mAweme4.getAid();
            }
        }
        m141633l();
    }

    /* renamed from: e */
    public final void mo125451e() {
        Aweme mAweme;
        Aweme mAweme2;
        Video video;
        int width;
        LinearGradientDraweeView linearGradientDraweeView = this.f182814f;
        if (linearGradientDraweeView != null) {
            linearGradientDraweeView.setAlpha(1.0f);
        }
        LinearGradientDraweeView linearGradientDraweeView2 = this.f182814f;
        if (linearGradientDraweeView2 != null && (mAweme = getMAweme()) != null && (mAweme2 = getMAweme()) != null && (video = mAweme2.getVideo()) != null) {
            UrlModel originCover = video.getOriginCover();
            if (originCover != null) {
                float height = ((float) video.getHeight()) / ((float) video.getWidth());
                if (height < 1.0f) {
                    ViewGroup.LayoutParams layoutParams = linearGradientDraweeView2.getLayoutParams();
                    if (layoutParams.width > 0) {
                        width = layoutParams.width;
                    } else if (getWidth() > 0) {
                        width = getWidth();
                    } else {
                        width = video.getWidth();
                    }
                    int i = (int) (((float) width) * height);
                    layoutParams.width = width;
                    layoutParams.height = i;
                    linearGradientDraweeView2.setLayoutParams(layoutParams);
                    C20766v b = C20761r.m39060a(C34735v.m70965a(originCover)).mo34179a("SearchVideoForLynx").mo34184b(width, i);
                    b.f49115l = R.color.j;
                    b.f49092E = linearGradientDraweeView2;
                    b.mo34181a(getMImageDisplayLighten());
                    return;
                }
                C20766v a = C20761r.m39060a(C34735v.m70965a(originCover)).mo34179a("SearchVideoForLynx");
                a.f49115l = R.color.j;
                a.f49092E = linearGradientDraweeView2;
                a.mo34181a(getMImageDisplayLighten());
                return;
            }
            UrlModel cover = video.getCover();
            if (cover == null && mAweme.getImageInfos() != null && mAweme.getImageInfos().size() > 1) {
                ImageInfo imageInfo = mAweme.getImageInfos().get(0);
                C89219l.m154716b(imageInfo, "");
                cover = imageInfo.getLabelThumb();
            }
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(cover)).mo34179a("SearchVideoForLynx");
            a2.f49115l = R.color.j;
            a2.f49092E = this.f182814f;
            a2.mo34181a(getMImageDisplayLighten());
        }
    }

    public final void setCore(SearchPlayerCore searchPlayerCore) {
        this.f182817i = searchPlayerCore;
    }

    public final void setDataProvider(C34246c cVar) {
        this.f182813e = cVar;
    }

    public final void setEventChangeListener(AbstractC89183m<? super String, ? super Map<String, ? extends Object>, C89391z> mVar) {
        this.f182821m = mVar;
    }

    public final void setMCoverBackground(ImageView imageView) {
        this.f182816h = imageView;
    }

    public final void setMCoverMask(ImageView imageView) {
        this.f182815g = imageView;
    }

    public final void setMCoverView(LinearGradientDraweeView linearGradientDraweeView) {
        this.f182814f = linearGradientDraweeView;
    }

    public final void setRate(int i) {
        this.f182819k = i;
    }

    public final void setVideoPlayerStatusListener(AbstractC81755b bVar) {
        this.f182812d = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPausePlay(String str) {
        mo125461h();
        mo125449a(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        mo125461h();
        mo125449a(5);
    }

    public final void setMAweme(Aweme aweme) {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            cVar.f80987d = aweme;
        }
    }

    public final void setMScrollStateManager(C51060g gVar) {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            cVar.f80993j = gVar;
        }
    }

    public final void setMScrollStateObserver(AbstractC51064i iVar) {
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            cVar.f80994k = iVar;
        }
    }

    public final void setMuted(boolean z) {
        SearchPlayerCore searchPlayerCore = this.f182817i;
        if (searchPlayerCore != null) {
            searchPlayerCore.setMute(z);
        }
    }

    public final void setRepeat(boolean z) {
        SearchPlayerCore searchPlayerCore = this.f182817i;
        if (searchPlayerCore != null) {
            searchPlayerCore.setRepeat(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$i */
    public static final class C81768i extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        final /* synthetic */ HashMap f182837a;

        static {
            Covode.recordClassIndex(95175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81768i(HashMap hashMap) {
            super(1);
            this.f182837a = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Aweme aweme) {
            Object obj = this.f182837a.get("search_result_id");
            if (obj == null) {
                return "";
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$j */
    public static final class C81769j extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        final /* synthetic */ HashMap f182838a;

        static {
            Covode.recordClassIndex(95176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81769j(HashMap hashMap) {
            super(1);
            this.f182838a = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Aweme aweme) {
            Object obj = this.f182838a.get("list_item_id");
            if (obj == null) {
                return "";
            }
            return obj;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayCompleted(String str) {
        C89219l.m154716b(C1764a.m5928a("onPlayCompleted: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        m141629a(this, "ended");
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPreparePlay(String str) {
        C89219l.m154716b(C1764a.m5928a("onPreparePlay: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        mo125449a(2);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onResumePlay(String str) {
        m141632k();
        mo125449a(0);
        C61501c mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            mPlayVideoHelper.mo99150b();
        }
        C61501c mPlayVideoHelper2 = getMPlayVideoHelper();
        if (mPlayVideoHelper2 != null) {
            mPlayVideoHelper2.mo99151c();
        }
    }

    public final void setAutoPlay(boolean z) {
        if (this.f182811b != z) {
            this.f182811b = z;
            C34246c cVar = this.f182813e;
            if (cVar != null) {
                cVar.f80997n = z;
            }
            if (this.f182811b) {
                m141633l();
            } else {
                m141634m();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$d */
    static final class C81758d extends AbstractC89220m implements AbstractC89172b<C34039a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81753b f182828a;

        static {
            Covode.recordClassIndex(95165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81758d(C81753b bVar) {
            super(1);
            this.f182828a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C34039a aVar) {
            C34039a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo60328a(new AbstractC89171a<AbstractC34186b.AbstractC34192d>(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.video.C81753b.C81758d.C817591 */

                /* renamed from: a */
                final /* synthetic */ C81758d f182829a;

                static {
                    Covode.recordClassIndex(95166);
                }

                {
                    this.f182829a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC34186b.AbstractC34192d invoke() {
                    return this.f182829a.f182828a.getCore();
                }
            });
            aVar2.mo60335d(new AbstractC89171a<Aweme>(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.video.C81753b.C81758d.C817602 */

                /* renamed from: a */
                final /* synthetic */ C81758d f182830a;

                static {
                    Covode.recordClassIndex(95167);
                }

                {
                    this.f182830a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Aweme invoke() {
                    return this.f182830a.f182828a.getMAweme();
                }
            });
            aVar2.mo60333c(new AbstractC89171a<Integer>(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.video.C81753b.C81758d.C817613 */

                /* renamed from: a */
                final /* synthetic */ C81758d f182831a;

                static {
                    Covode.recordClassIndex(95168);
                }

                {
                    this.f182831a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Integer invoke() {
                    int i;
                    C34246c dataProvider = this.f182831a.f182828a.getDataProvider();
                    if (dataProvider != null) {
                        i = dataProvider.f80980A;
                    } else {
                        i = -1;
                    }
                    return Integer.valueOf(i);
                }
            });
            aVar2.mo60331b(new AbstractC89171a<AbstractC34186b.AbstractC34189c>(this) {
                /* class com.p2082ss.android.ugc.aweme.xsearch.video.C81753b.C81758d.C817624 */

                /* renamed from: a */
                final /* synthetic */ C81758d f182832a;

                static {
                    Covode.recordClassIndex(95169);
                }

                {
                    this.f182832a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC34186b.AbstractC34189c invoke() {
                    C34256e eVar;
                    C81688c b;
                    C34256e eVar2 = new C34256e(this.f182832a.f182828a.getCore(), this.f182832a.f182828a.getDataProvider());
                    C34246c dataProvider = this.f182832a.f182828a.getDataProvider();
                    if (dataProvider != null) {
                        dataProvider.f80995l = eVar2;
                    }
                    C34246c dataProvider2 = this.f182832a.f182828a.getDataProvider();
                    if (!(dataProvider2 == null || (eVar = dataProvider2.f80995l) == null || (b = C81689d.f182658b.mo125341b(this.f182832a.f182828a.f182810a)) == null)) {
                        b.f182651e = new WeakReference<>(eVar);
                    }
                    return eVar2;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.xsearch.video.b$g */
    static final class C81766g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C81753b f182836a;

        static {
            Covode.recordClassIndex(95173);
        }

        C81766g(C81753b bVar) {
            this.f182836a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C34246c dataProvider;
            AbstractC80747i iVar;
            C89219l.m154721d(obj, "");
            if (C89219l.m154714a((Object) "on_ear_phone_unplug", obj) && (dataProvider = this.f182836a.getDataProvider()) != null && (iVar = dataProvider.f80998o) != null && iVar.mo123892o()) {
                SearchPlayerCore core = this.f182836a.getCore();
                if (core != null) {
                    core.bi_();
                }
                this.f182836a.mo125449a(1);
            }
        }
    }

    /* renamed from: a */
    private final boolean m141631a(String str) {
        if (!TextUtils.equals(this.f182822n, str)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onBuffering(boolean z) {
        int i;
        String str;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        mo125449a(i);
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
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayCompletedFirstTime(String str) {
        C89219l.m154716b(C1764a.m5928a("onPlayCompletedFirstTime: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        SearchPlayerCore searchPlayerCore = this.f182817i;
        if (searchPlayerCore == null || !searchPlayerCore.getRepeat()) {
            mo125461h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayFailed(C84208l lVar) {
        C89219l.m154716b(C1764a.m5928a("onPlayFailed: error=%s", Arrays.copyOf(new Object[]{lVar}, 1)), "");
        mo125449a(1);
        m141630a("error", C89041ag.m154428c(C89387v.m154943a("error", String.valueOf(lVar))));
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onPlayProgressChange(float f) {
        long j;
        AbstractC80747i iVar;
        C89378p[] pVarArr = new C89378p[1];
        C34246c cVar = this.f182813e;
        if (cVar == null || (iVar = cVar.f80998o) == null) {
            j = 0;
        } else {
            j = iVar.mo123891n();
        }
        pVarArr[0] = C89387v.m154943a("progress", Integer.valueOf((int) j));
        m141630a("timeupdate", C89041ag.m154428c(pVarArr));
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f
    public final void onRenderFirstFrame(C84216o oVar) {
        String str;
        if (oVar != null) {
            str = oVar.getId();
        } else {
            str = null;
        }
        C89219l.m154716b(C1764a.m5928a("onRenderFirstFrame: sourceId=%s", Arrays.copyOf(new Object[]{str}, 1)), "");
        m141632k();
        C59092g.m108569a("video_play");
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C84215n nVar) {
        String str;
        C89219l.m154721d(nVar, "");
        mo125449a(0);
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
    }

    public final void setAwemeIndex(C81752a aVar) {
        C42345d dVar;
        List<Aweme> awemeList;
        String str;
        C89219l.m154721d(aVar, "");
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            cVar.f80980A = aVar.f182807a;
        }
        C81688c b = C81689d.f182658b.mo125341b(this.f182810a);
        if (b != null && (dVar = b.f182656j) != null && (awemeList = dVar.getAwemeList()) != null) {
            Aweme aweme = awemeList.get(aVar.f182808b);
            C89219l.m154716b(aweme, "");
            m141628a(aweme);
            C34246c cVar2 = this.f182813e;
            if (cVar2 != null) {
                str = cVar2.mo60668b();
            } else {
                str = null;
            }
            b.f182648b = str;
        }
    }

    public final void setObjectFit(String str) {
        int i;
        C89219l.m154721d(str, "");
        SearchPlayerCore searchPlayerCore = this.f182817i;
        if (searchPlayerCore != null) {
            if (str.hashCode() == 3143043 && str.equals("fill")) {
                i = 0;
            } else {
                i = 1;
            }
            searchPlayerCore.setFitType(i);
        }
    }

    public final void setRoundCorner(View view) {
        C89219l.m154721d(view, "");
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new C80508gp((int) C20744c.m39047a(getContext(), 2.0f)));
            view.setClipToOutline(true);
        }
    }

    /* renamed from: a */
    private void m141628a(Aweme aweme) {
        C67568r rVar;
        String str = "";
        C89219l.m154721d(aweme, str);
        ConcurrentHashMap<String, WeakReference<C67568r>> concurrentHashMap = C67704b.f151780n;
        String aid = aweme.getAid();
        if (aid != null) {
            str = aid;
        }
        C34246c cVar = this.f182813e;
        if (cVar != null) {
            rVar = cVar.f81007x;
        } else {
            rVar = null;
        }
        concurrentHashMap.put(str, new WeakReference<>(rVar));
        setMAweme(aweme);
        SearchPlayerCore searchPlayerCore = this.f182817i;
        if (searchPlayerCore != null) {
            searchPlayerCore.mo60586a(aweme);
        }
        if (getMAweme() != null && getMAweme() != null) {
            if ((getWidth() == 0 || getHeight() == 0) && (getLayoutParams() == null || getLayoutParams().width == 0 || getLayoutParams().height == 0)) {
                getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC81770k(this));
            } else {
                mo125451e();
            }
            mo125461h();
        }
    }

    public final void setAweme(String str) {
        C89219l.m154721d(str, "");
        if (str != null && str.length() != 0) {
            Type type = new C81767h().type;
            GsonProvider c = GsonHolder.m138943c();
            C89219l.m154716b(c, "");
            Aweme aweme = (Aweme) c.mo123620b().mo46671a(str, type);
            if (aweme != null) {
                if (getMAweme() != null) {
                    Aweme mAweme = getMAweme();
                    if (mAweme == null) {
                        C89219l.m154715b();
                    }
                    if (!(!C89219l.m154714a((Object) mAweme.getAid(), (Object) aweme.getAid()))) {
                        return;
                    }
                }
                m141628a(aweme);
            }
        }
    }

    /* renamed from: a */
    public final void mo125449a(int i) {
        C34246c cVar;
        AbstractC80747i iVar;
        C34246c cVar2;
        AbstractC80747i iVar2;
        if (i == 0) {
            if (m141631a("play") && this.f182819k > 0 && (cVar = this.f182813e) != null && (iVar = cVar.f80998o) != null) {
                iVar.mo123933a(this.f182819k);
            }
            m141629a(this, "play");
        } else if (i == 1) {
            if (m141631a("pause") && this.f182819k > 0 && (cVar2 = this.f182813e) != null && (iVar2 = cVar2.f80998o) != null) {
                iVar2.mo123916J();
            }
            m141629a(this, "pause");
        } else if (i == 2) {
            m141629a(this, "loading");
        } else if (i == 5) {
            m141629a(this, "stop");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSessionId(int r5) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.xsearch.video.C81753b.setSessionId(int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C81753b(Context context) {
        super(context, null, 0);
        AbstractC84293i surfaceHolder;
        C89219l.m154721d(context, "");
        C34246c cVar = null;
        MethodCollector.m26663i(7505);
        this.f182810a = -1;
        this.f182819k = -1;
        this.f182823o = C89250i.m154773a((AbstractC89171a) new C81756c(this, context));
        this.f182824p = C89250i.m154773a((AbstractC89171a) new C81764f(this));
        C89219l.m154721d("SearchVideoForLynx init", "");
        C89219l.m154721d("SearchVideoForLynx initView", "");
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aww, this, true);
        View findViewById = findViewById(R.id.c7j);
        this.f182820l = findViewById;
        if (findViewById != null) {
            setRoundCorner(findViewById);
        }
        this.f182814f = (LinearGradientDraweeView) findViewById(R.id.afn);
        this.f182816h = (ImageView) findViewById(R.id.afr);
        this.f182815g = (ImageView) findViewById(R.id.aft);
        SearchPlayerCore searchPlayerCore = (SearchPlayerCore) findViewById(R.id.eh3);
        this.f182817i = searchPlayerCore;
        cVar = searchPlayerCore != null ? searchPlayerCore.getDataProvider() : cVar;
        this.f182813e = cVar;
        if (cVar != null) {
            cVar.f80997n = false;
        }
        C34246c cVar2 = this.f182813e;
        if (cVar2 != null) {
            cVar2.f80984a = this;
        }
        SearchPlayerCore searchPlayerCore2 = this.f182817i;
        if (searchPlayerCore2 != null) {
            searchPlayerCore2.setMVideoViewListener(this);
        }
        SearchPlayerCore searchPlayerCore3 = this.f182817i;
        if (searchPlayerCore3 != null) {
            searchPlayerCore3.setMPlayerViewListener(this);
        }
        SearchPlayerCore searchPlayerCore4 = this.f182817i;
        if (searchPlayerCore4 != null) {
            searchPlayerCore4.setMVideoMobListener(new C81771c(this.f182813e));
        }
        C89219l.m154721d("SearchVideoForLynx initVideoView", "");
        SearchPlayerCore searchPlayerCore5 = this.f182817i;
        if (!(searchPlayerCore5 == null || (surfaceHolder = searchPlayerCore5.getSurfaceHolder()) == null)) {
            surfaceHolder.mo129312a(new C81763e(this));
        }
        getMPlayVideoHelper();
        C89219l.m154721d("SearchVideoForLynx, initMob", "");
        C34246c cVar3 = this.f182813e;
        if (cVar3 != null) {
            cVar3.f81007x = C67568r.C67569a.m119673a();
        }
        C89219l.m154721d("SearchVideoForLynx, initAutoPlayComponents", "");
        C34256e eVar = new C34256e(this.f182817i, this.f182813e);
        C34246c cVar4 = this.f182813e;
        if (cVar4 != null) {
            cVar4.f80995l = eVar;
        }
        C34246c cVar5 = this.f182813e;
        if (cVar5 != null) {
            cVar5.f80991h = new C81690e(this.f182817i);
        }
        C89219l.m154721d("SearchVideoForLynx observerEarPhoneUnplug", "");
        Activity j = C17873f.m33102j();
        if (j instanceof ActivityC0945e) {
            ActivityC0945e eVar2 = (ActivityC0945e) j;
            HomePageDataViewModel.C52942a.m97777a(eVar2).f121743i.observe(eVar2, new C81766g(this));
        }
        C89219l.m154721d("SearchVideoForLynx, initAutoPlayComponents", "");
        C81758d dVar = new C81758d(this);
        C89219l.m154721d(dVar, "");
        C34039a aVar = new C34039a();
        dVar.invoke(aVar);
        setMScrollStateObserver(aVar);
        C34246c cVar6 = this.f182813e;
        if (cVar6 != null) {
            cVar6.f80991h = new C81690e(this.f182817i);
            MethodCollector.m26664o(7505);
            return;
        }
        MethodCollector.m26664o(7505);
    }

    public final void setLogExtra(HashMap<String, Object> hashMap) {
        C67568r rVar;
        C34246c cVar;
        C67568r rVar2;
        C34246c cVar2;
        C67568r rVar3;
        C34246c cVar3;
        C67568r rVar4;
        C34246c cVar4;
        C67568r rVar5;
        C34246c cVar5;
        C67568r rVar6;
        C34246c cVar6;
        C67568r rVar7;
        C34246c cVar7;
        C67568r rVar8;
        C34246c cVar8;
        C67568r rVar9;
        C67568r rVar10;
        C89219l.m154721d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                if (entry.getValue() instanceof JavaOnlyMap) {
                    String key = entry.getKey();
                    GsonProvider c = GsonHolder.m138943c();
                    C89219l.m154716b(c, "");
                    String b = c.mo123620b().mo46674b(entry.getValue());
                    C89219l.m154716b(b, "");
                    hashMap2.put(key, b);
                } else {
                    hashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
                    if (C89219l.m154714a((Object) "enter_from", (Object) entry.getKey())) {
                        C34246c cVar9 = this.f182813e;
                        if (!(cVar9 == null || (rVar10 = cVar9.f81007x) == null)) {
                            String str = (String) hashMap2.get("enter_from");
                            if (str == null) {
                                str = "";
                            }
                            C89219l.m154716b(str, "");
                            rVar10.mo106518g(str);
                        }
                        hashMap2.remove("enter_from");
                    }
                }
            }
        }
        if (!(!hashMap2.keySet().contains("impr_id") || (cVar8 = this.f182813e) == null || (rVar9 = cVar8.f81007x) == null)) {
            String str2 = (String) hashMap2.get("impr_id");
            if (str2 == null) {
                str2 = "";
            }
            C89219l.m154716b(str2, "");
            rVar9.mo106520i(str2);
        }
        if (!(!hashMap2.keySet().contains("search_keyword") || (cVar7 = this.f182813e) == null || (rVar8 = cVar7.f81007x) == null)) {
            String str3 = (String) hashMap2.get("search_keyword");
            if (str3 == null) {
                str3 = "";
            }
            C89219l.m154716b(str3, "");
            rVar8.mo106517f(str3);
        }
        if (!(!hashMap2.keySet().contains("search_result_id") || (cVar6 = this.f182813e) == null || (rVar7 = cVar6.f81007x) == null)) {
            rVar7.mo106508a(new C81768i(hashMap2));
        }
        if (!(!hashMap2.keySet().contains("list_item_id") || (cVar5 = this.f182813e) == null || (rVar6 = cVar5.f81007x) == null)) {
            rVar6.mo106512b(new C81769j(hashMap2));
        }
        if (!(!hashMap2.keySet().contains("search_id") || (cVar4 = this.f182813e) == null || (rVar5 = cVar4.f81007x) == null)) {
            String str4 = (String) hashMap2.get("search_id");
            if (str4 == null) {
                str4 = "";
            }
            C89219l.m154716b(str4, "");
            rVar5.mo106519h(str4);
        }
        if (!(!hashMap2.keySet().contains("music_id") || (cVar3 = this.f182813e) == null || (rVar4 = cVar3.f81007x) == null)) {
            String str5 = (String) hashMap2.get("music_id");
            if (str5 == null) {
                str5 = "";
            }
            C89219l.m154716b(str5, "");
            C89219l.m154721d(str5, "");
            rVar4.f151322q = str5;
        }
        if (!(!hashMap2.keySet().contains("token_type") || (cVar2 = this.f182813e) == null || (rVar3 = cVar2.f81007x) == null)) {
            String str6 = (String) hashMap2.get("token_type");
            if (str6 == null) {
                str6 = "";
            }
            C89219l.m154716b(str6, "");
            rVar3.mo106509a(str6);
        }
        if (!(!hashMap2.keySet().contains("is_fullscreen") || (cVar = this.f182813e) == null || (rVar2 = cVar.f81007x) == null)) {
            String str7 = (String) hashMap2.get("is_fullscreen");
            if (str7 == null) {
                str7 = "";
            }
            C89219l.m154716b(str7, "");
            C89219l.m154721d(str7, "");
            rVar2.f151328w = str7;
        }
        C34246c cVar10 = this.f182813e;
        if (!(cVar10 == null || (rVar = cVar10.f81007x) == null)) {
            rVar.mo106511a(hashMap2);
        }
    }

    public /* synthetic */ C81753b(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    private static /* synthetic */ void m141629a(C81753b bVar, String str) {
        bVar.m141630a(str, new HashMap());
    }

    /* renamed from: a */
    private final void m141630a(String str, Map<String, ? extends Object> map) {
        if (m141631a(str)) {
            this.f182822n = str;
            AbstractC89183m<? super String, ? super Map<String, ? extends Object>, C89391z> mVar = this.f182821m;
            if (mVar != null) {
                mVar.invoke(str, map);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7500);
        C89219l.m154721d("SearchVideoForLynx onMeasure", "");
        super.onMeasure(i, i2);
        MethodCollector.m26664o(7500);
    }

    /* renamed from: a */
    public final void mo125450a(int i, boolean z) {
        C61501c mPlayVideoHelper = getMPlayVideoHelper();
        if (mPlayVideoHelper != null) {
            mPlayVideoHelper.mo99148a((float) i);
        }
        if (z) {
            mo125462i();
        } else {
            mo125463j();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(7501);
        C89219l.m154721d("SearchVideoForLynx onLayout", "");
        super.onLayout(z, i, i2, i3, i4);
        MethodCollector.m26664o(7501);
    }
}

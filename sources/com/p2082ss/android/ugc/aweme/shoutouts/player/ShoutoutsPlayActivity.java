package com.p2082ss.android.ugc.aweme.shoutouts.player;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.loading.TuxLoadingHUD;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.feed.helper.C49617c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74438b;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderGetApi;
import com.p2082ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity */
public final class ShoutoutsPlayActivity extends ActivityC17312a implements AbstractC20380ar<C74486e>, AbstractC20527q, OnUIPlayListener {

    /* renamed from: c */
    public static final C74454c f167430c = new C74454c((byte) 0);

    /* renamed from: a */
    public Video f167431a;

    /* renamed from: b */
    public boolean f167432b;

    /* renamed from: d */
    private final AbstractC89244h f167433d = C89250i.m154773a((AbstractC89171a) C74473p.f167472a);

    /* renamed from: e */
    private boolean f167434e = true;

    /* renamed from: f */
    private boolean f167435f;

    /* renamed from: g */
    private boolean f167436g;

    /* renamed from: h */
    private float f167437h;

    /* renamed from: i */
    private final lifecycleAwareLazy f167438i;

    /* renamed from: j */
    private final AbstractC89244h f167439j;

    /* renamed from: k */
    private final AbstractC89244h f167440k;

    /* renamed from: l */
    private SparseArray f167441l;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$a */
    public static final class C74451a extends AbstractC89220m implements AbstractC89183m<ShoutoutsPlayState, Bundle, ShoutoutsPlayState> {
        public static final C74451a INSTANCE = new C74451a();

        static {
            Covode.recordClassIndex(87250);
        }

        public C74451a() {
            super(2);
        }

        public final ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState, Bundle bundle) {
            C89219l.m154719c(shoutoutsPlayState, "");
            return shoutoutsPlayState;
        }
    }

    static {
        Covode.recordClassIndex(87249);
    }

    /* renamed from: c */
    private final VideoViewComponent m130896c() {
        return (VideoViewComponent) this.f167433d.getValue();
    }

    /* renamed from: e */
    private final boolean m130897e() {
        return ((Boolean) this.f167440k.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f167441l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f167441l == null) {
            this.f167441l = new SparseArray();
        }
        View view = (View) this.f167441l.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f167441l.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ShoutoutsPlayViewModel mo117149a() {
        return (ShoutoutsPlayViewModel) this.f167438i.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
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

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$c */
    public static final class C74454c {
        static {
            Covode.recordClassIndex(87253);
        }

        private C74454c() {
        }

        public /* synthetic */ C74454c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$n */
    public static final class C74471n implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167468a;

        static {
            Covode.recordClassIndex(87270);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
            this.f167468a.f167432b = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74471n(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f167468a = shoutoutsPlayActivity;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            this.f167468a.f167432b = true;
            this.f167468a.mo117151b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$p */
    static final class C74473p extends AbstractC89220m implements AbstractC89171a<VideoViewComponent> {

        /* renamed from: a */
        public static final C74473p f167472a = new C74473p();

        static {
            Covode.recordClassIndex(87272);
        }

        C74473p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VideoViewComponent invoke() {
            return new VideoViewComponent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$q */
    static final class C74474q extends AbstractC89220m implements AbstractC89171a<C74486e> {

        /* renamed from: a */
        public static final C74474q f167473a = new C74474q();

        static {
            Covode.recordClassIndex(87273);
        }

        C74474q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74486e invoke() {
            return new C74486e();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* synthetic */ C74486e mo33721d() {
        return (C74486e) this.f167439j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$j */
    static final class C74461j extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167455a;

        static {
            Covode.recordClassIndex(87260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74461j(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            super(0);
            this.f167455a = shoutoutsPlayActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (this.f167455a.getIntent().getIntExtra("is_preview", 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        if (m130896c().mo129273g()) {
            mo117150a(false);
        }
        super.onPause();
    }

    public ShoutoutsPlayActivity() {
        AbstractC89277c a = C89204ab.m154669a(ShoutoutsPlayViewModel.class);
        this.f167438i = new lifecycleAwareLazy(this, new C74452b(this, a, C74451a.INSTANCE, a));
        this.f167439j = C89250i.m154773a((AbstractC89171a) C74474q.f167473a);
        this.f167440k = C89250i.m154773a((AbstractC89171a) new C74461j(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", true);
        super.onResume();
        if (!m130896c().mo129273g() && this.f167431a != null && !this.f167436g) {
            mo117150a(false);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        m130896c().mo129265a((KeepSurfaceTextureView) _$_findCachedViewById(R.id.e0o));
        m130896c().mo129268b(this);
        C84294j.m144981a((KeepSurfaceTextureView) _$_findCachedViewById(R.id.e0o)).mo129312a(new C74471n(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        m130896c().mo80280a(this);
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

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$b */
    public static final class C74452b extends AbstractC89220m implements AbstractC89171a<ShoutoutsPlayViewModel> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0218d f167442a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f167443b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f167444c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89277c f167445d;

        static {
            Covode.recordClassIndex(87251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74452b(ActivityC0218d dVar, AbstractC89277c cVar, AbstractC89183m mVar, AbstractC89277c cVar2) {
            super(0);
            this.f167442a = dVar;
            this.f167443b = cVar;
            this.f167444c = mVar;
            this.f167445d = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.f167442a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f167445d
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r3)
                h.k.c r0 = r4.f167443b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m130902x8afa3b15(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel> r0 = com.p2082ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.mo33696a(r0)
                if (r0 == 0) goto L_0x0038
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$b$1 r0 = new com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$b$1
                r0.<init>(r4)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.C74452b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_shoutouts_player_ShoutoutsPlayActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m130902x8afa3b15(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$o */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC74472o implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167469a;

        /* renamed from: b */
        final /* synthetic */ TextureView f167470b;

        /* renamed from: c */
        final /* synthetic */ Video f167471c;

        static {
            Covode.recordClassIndex(87271);
        }

        public final void onGlobalLayout() {
            if (this.f167470b.getWidth() > 0 && this.f167470b.getHeight() > 0) {
                this.f167470b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (this.f167471c.getWidth() > 0 && this.f167471c.getHeight() > 0) {
                    new C49617c().mo81411a(this.f167469a, this.f167470b, this.f167471c.getWidth(), this.f167471c.getHeight());
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC74472o(ShoutoutsPlayActivity shoutoutsPlayActivity, TextureView textureView, Video video) {
            this.f167469a = shoutoutsPlayActivity;
            this.f167470b = textureView;
            this.f167471c = video;
        }
    }

    /* renamed from: b */
    public final void mo117151b() {
        if (this.f167432b && this.f167431a != null) {
            m130896c().mo129262a(this.f167431a);
            Video video = this.f167431a;
            if (video == null) {
                C89219l.m154715b();
            }
            KeepSurfaceTextureView keepSurfaceTextureView = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e0o);
            C89219l.m154716b(keepSurfaceTextureView, "");
            if (keepSurfaceTextureView.getWidth() == 0 || keepSurfaceTextureView.getHeight() == 0) {
                keepSurfaceTextureView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC74472o(this, keepSurfaceTextureView, video));
            } else if (video.getWidth() > 0 && video.getHeight() > 0) {
                new C49617c().mo81411a(this, keepSurfaceTextureView, video.getWidth(), video.getHeight());
            }
            if (this.f167437h > 0.0f) {
                KeepSurfaceTextureView keepSurfaceTextureView2 = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e0o);
                C89219l.m154716b(keepSurfaceTextureView2, "");
                keepSurfaceTextureView2.setAlpha(0.0f);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        if (!this.f167434e) {
            finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(C84208l lVar) {
        if (lVar != null) {
            Integer.valueOf(lVar.f188035d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$d */
    static final class View$OnClickListenerC74455d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167447a;

        static {
            Covode.recordClassIndex(87254);
        }

        View$OnClickListenerC74455d(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f167447a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167447a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$e */
    static final class View$OnClickListenerC74456e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167448a;

        static {
            Covode.recordClassIndex(87255);
        }

        View$OnClickListenerC74456e(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f167448a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167448a.mo117150a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$f */
    static final class View$OnClickListenerC74457f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167449a;

        static {
            Covode.recordClassIndex(87256);
        }

        View$OnClickListenerC74457f(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f167449a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f167449a.mo117150a(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(C84208l lVar) {
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) _$_findCachedViewById(R.id.e0l);
        if (tuxLoadingHUD != null) {
            tuxLoadingHUD.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$k */
    static final class C74462k extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C74462k f167456a = new C74462k();

        static {
            Covode.recordClassIndex(87261);
        }

        C74462k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C744631.f167457a);
            baseActivityViewModel2.config(C744642.f167458a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$g */
    static final class View$OnClickListenerC74458g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167450a;

        static {
            Covode.recordClassIndex(87257);
        }

        View$OnClickListenerC74458g(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f167450a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Video video = this.f167450a.f167431a;
            if (video != null) {
                C39162r.m79460a("download", ShoutoutsPlayActivity.m130894a(this.f167450a, true, false, 2).f79943a);
                this.f167450a.mo117149a().mo117172a(this.f167450a, video);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$h */
    static final class View$OnClickListenerC74459h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167451a;

        static {
            Covode.recordClassIndex(87258);
        }

        View$OnClickListenerC74459h(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            this.f167451a = shoutoutsPlayActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C69684e.C69686b a = new C69684e.C69686b().mo109824a(new SharePackage.C69654a().mo109803a("").mo109805a());
            a.f155589t = true;
            C69684e.C69686b a2 = a.mo109827a(new C74487f(m130904a(this.f167451a.getIntent(), "aweme_id"), m130904a(this.f167451a.getIntent(), "author_id")));
            a2.f155584o = false;
            new DialogC69695i(this.f167451a, R.style.a1c, a2.mo109831a()).show();
        }

        /* renamed from: a */
        private static String m130904a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public final void mo117150a(boolean z) {
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) _$_findCachedViewById(R.id.e0l);
        C89219l.m154716b(tuxLoadingHUD, "");
        if (tuxLoadingHUD.getVisibility() != 0) {
            if (this.f167435f) {
                if (!m130896c().mo129273g() && this.f167431a != null) {
                    m130896c().mo129262a(this.f167431a);
                    TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.e0n);
                    C89219l.m154716b(tuxIconView, "");
                    tuxIconView.setVisibility(8);
                    this.f167435f = false;
                    this.f167436g = false;
                }
            } else if (m130896c().mo129273g()) {
                m130896c().mo129267b();
                TuxIconView tuxIconView2 = (TuxIconView) _$_findCachedViewById(R.id.e0n);
                C89219l.m154716b(tuxIconView2, "");
                tuxIconView2.setVisibility(0);
                this.f167435f = true;
                if (z) {
                    this.f167436g = true;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C84216o oVar) {
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) _$_findCachedViewById(R.id.e0l);
        C89219l.m154716b(tuxLoadingHUD, "");
        tuxLoadingHUD.setVisibility(8);
        C39162r.m79460a("video_play", m130894a(this, false, true, 1).f79943a);
        if (this.f167437h > 0.0f) {
            KeepSurfaceTextureView keepSurfaceTextureView = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e0o);
            if (keepSurfaceTextureView != null) {
                keepSurfaceTextureView.setAlpha(1.0f);
            }
            m130896c().mo129260a(this.f167437h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$i */
    static final class C74460i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167452a;

        /* renamed from: b */
        final /* synthetic */ String f167453b;

        /* renamed from: c */
        final /* synthetic */ String f167454c;

        static {
            Covode.recordClassIndex(87259);
        }

        C74460i(ShoutoutsPlayActivity shoutoutsPlayActivity, String str, String str2) {
            this.f167452a = shoutoutsPlayActivity;
            this.f167453b = str;
            this.f167454c = str2;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Video video;
            Video video2;
            C74438b bVar = (C74438b) obj;
            this.f167452a.f167431a = new Video();
            Video video3 = this.f167452a.f167431a;
            if (video3 != null) {
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                videoUrlModel.setUrlList(C89070n.m154516a(this.f167453b));
                videoUrlModel.setSourceId(this.f167453b);
                videoUrlModel.setUrlKey(this.f167453b);
                List<String> urlList = videoUrlModel.getUrlList();
                C89219l.m154716b(urlList, "");
                videoUrlModel.setUri((String) C89070n.m154583g((List) urlList));
                video3.setPlayAddr(videoUrlModel);
                video3.setDownloadAddr(video3.getPlayAddr());
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(this.f167454c);
                urlModel.setUrlList(C89070n.m154516a(this.f167454c));
                video3.setCover(urlModel);
                Aweme aweme = bVar.f167401b;
                int i2 = 0;
                if (aweme == null || (video2 = aweme.getVideo()) == null) {
                    i = 0;
                } else {
                    i = video2.getWidth();
                }
                video3.setWidth(i);
                Aweme aweme2 = bVar.f167401b;
                if (!(aweme2 == null || (video = aweme2.getVideo()) == null)) {
                    i2 = video.getHeight();
                }
                video3.setHeight(i2);
                video3.setSourceId(this.f167453b);
                this.f167452a.mo117151b();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        boolean z;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", true);
        activityConfiguration(C74462k.f167456a);
        super.onCreate(bundle);
        setContentView(R.layout.azp);
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.e0i);
        if (tuxIconView != null) {
            tuxIconView.setTintColor(C0643b.m2378c(tuxIconView.getContext(), R.color.a_));
            tuxIconView.setOnClickListener(new View$OnClickListenerC74455d(this));
        }
        KeepSurfaceTextureView keepSurfaceTextureView = (KeepSurfaceTextureView) _$_findCachedViewById(R.id.e0o);
        if (keepSurfaceTextureView != null) {
            keepSurfaceTextureView.setOnClickListener(new View$OnClickListenerC74456e(this));
        }
        TuxIconView tuxIconView2 = (TuxIconView) _$_findCachedViewById(R.id.e0n);
        if (tuxIconView2 != null) {
            tuxIconView2.setOnClickListener(new View$OnClickListenerC74457f(this));
        }
        ((TuxButton) _$_findCachedViewById(R.id.e0k)).setOnClickListener(new View$OnClickListenerC74458g(this));
        ((TuxButton) _$_findCachedViewById(R.id.e0k)).setBackgroundColor(C0643b.m2378c(this, R.color.a2));
        String a = m130895a(getIntent(), "author_id");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (C89219l.m154714a((Object) a, (Object) g.getCurUserId())) {
            TuxIconView tuxIconView3 = (TuxIconView) _$_findCachedViewById(R.id.e0m);
            C89219l.m154716b(tuxIconView3, "");
            tuxIconView3.setVisibility(8);
        } else {
            ((TuxIconView) _$_findCachedViewById(R.id.e0m)).setOnClickListener(new View$OnClickListenerC74459h(this));
        }
        String a2 = m130895a(getIntent(), "cover");
        String a3 = m130895a(getIntent(), "download_url");
        if (a2 == null || a2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || a3 == null || a3.length() == 0) {
            new C23144b(this).mo37640e(R.string.dck).mo37637b();
        } else {
            String a4 = m130895a(getIntent(), "order_id");
            if (a4 != null) {
                mo117149a().f167474a.observe(this, new C74460i(this, a3, a2));
                ShoutoutsPlayViewModel a5 = mo117149a();
                C89219l.m154716b(a4, "");
                C89219l.m154721d(a4, "");
                Object a6 = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ShoutoutsOrderGetApi.class);
                C89219l.m154716b(a6, "");
                ((ShoutoutsOrderGetApi) a6).getOrder(a4).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new ShoutoutsPlayViewModel.C74481c(a5));
            } else {
                new C23144b(this).mo37640e(R.string.dck).mo37637b();
            }
        }
        if (m130897e()) {
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.e0k);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setVisibility(8);
            TuxIconView tuxIconView4 = (TuxIconView) _$_findCachedViewById(R.id.e0m);
            C89219l.m154716b(tuxIconView4, "");
            tuxIconView4.setVisibility(8);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", false);
            return;
        }
        AbstractC88412b unused = selectSubscribe(mo117149a(), C74484c.f167486a, new C20370ah(), new C74465l(this));
        AbstractC88412b unused2 = selectSubscribe(mo117149a(), C74485d.f167487a, new C20370ah(), new C74470m(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m130895a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$m */
    static final class C74470m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167467a;

        static {
            Covode.recordClassIndex(87269);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74470m(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            super(2);
            this.f167467a = shoutoutsPlayActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            TuxTextView tuxTextView = (TuxTextView) this.f167467a._$_findCachedViewById(R.id.e0d);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(new StringBuilder().append(intValue).append('%').toString());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$l */
    static final class C74465l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, EnumC74482a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsPlayActivity f167459a;

        static {
            Covode.recordClassIndex(87264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74465l(ShoutoutsPlayActivity shoutoutsPlayActivity) {
            super(2);
            this.f167459a = shoutoutsPlayActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, EnumC74482a aVar) {
            AbstractC20477i iVar2 = iVar;
            EnumC74482a aVar2 = aVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(aVar2, "");
            int i = C74483b.f167485a[aVar2.ordinal()];
            if (i == 1 || i == 2) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f167459a._$_findCachedViewById(R.id.e0g);
                C89219l.m154716b(relativeLayout, "");
                relativeLayout.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) this.f167459a._$_findCachedViewById(R.id.e0e);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                TuxButton tuxButton = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setVisibility(0);
                TuxButton tuxButton2 = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setEnabled(true);
            } else if (i == 3) {
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f167459a._$_findCachedViewById(R.id.e0g);
                C89219l.m154716b(relativeLayout2, "");
                relativeLayout2.setVisibility(8);
                TuxTextView tuxTextView2 = (TuxTextView) this.f167459a._$_findCachedViewById(R.id.e0e);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxButton tuxButton3 = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton3, "");
                tuxButton3.setVisibility(4);
                TuxButton tuxButton4 = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton4, "");
                tuxButton4.setEnabled(false);
            } else if (i == 4) {
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f167459a._$_findCachedViewById(R.id.e0g);
                C89219l.m154716b(relativeLayout3, "");
                relativeLayout3.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) this.f167459a._$_findCachedViewById(R.id.e0e);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                TuxButton tuxButton5 = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton5, "");
                tuxButton5.setVisibility(4);
                TuxButton tuxButton6 = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton6, "");
                tuxButton6.setEnabled(false);
                TuxTextView tuxTextView4 = (TuxTextView) this.f167459a._$_findCachedViewById(R.id.e0c);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setText(this.f167459a.getString(R.string.bbr));
                TuxTextView tuxTextView5 = (TuxTextView) this.f167459a._$_findCachedViewById(R.id.e0d);
                C89219l.m154716b(tuxTextView5, "");
                tuxTextView5.setVisibility(0);
                ((TuxTextView) this.f167459a._$_findCachedViewById(R.id.e0f)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.C74465l.View$OnClickListenerC744661 */

                    /* renamed from: a */
                    final /* synthetic */ C74465l f167460a;

                    static {
                        Covode.recordClassIndex(87265);
                    }

                    {
                        this.f167460a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        DownloadServiceManager.INSTANCE.getDownloadService().cancel(this.f167460a.f167459a.mo117149a().f167475b);
                    }
                });
            } else if (i == 5) {
                RelativeLayout relativeLayout4 = (RelativeLayout) this.f167459a._$_findCachedViewById(R.id.e0g);
                C89219l.m154716b(relativeLayout4, "");
                relativeLayout4.setVisibility(0);
                TuxTextView tuxTextView6 = (TuxTextView) this.f167459a._$_findCachedViewById(R.id.e0e);
                C89219l.m154716b(tuxTextView6, "");
                tuxTextView6.setVisibility(8);
                TuxButton tuxButton7 = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton7, "");
                tuxButton7.setVisibility(4);
                TuxButton tuxButton8 = (TuxButton) this.f167459a._$_findCachedViewById(R.id.e0k);
                C89219l.m154716b(tuxButton8, "");
                tuxButton8.setEnabled(false);
                iVar2.withState(this.f167459a.mo117149a(), new AbstractC89172b<ShoutoutsPlayState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.C74465l.C744672 */

                    /* renamed from: a */
                    final /* synthetic */ C74465l f167461a;

                    static {
                        Covode.recordClassIndex(87266);
                    }

                    {
                        this.f167461a = r2;
                    }

                    /* renamed from: com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity$l$2$a */
                    public static final class C74469a extends ClickableSpan {

                        /* renamed from: a */
                        final /* synthetic */ C744672 f167463a;

                        /* renamed from: b */
                        final /* synthetic */ StyleSpan f167464b;

                        /* renamed from: c */
                        final /* synthetic */ String f167465c;

                        /* renamed from: d */
                        final /* synthetic */ String f167466d;

                        static {
                            Covode.recordClassIndex(87268);
                        }

                        public final void updateDrawState(TextPaint textPaint) {
                            C89219l.m154721d(textPaint, "");
                            textPaint.setColor(C0643b.m2378c(this.f167463a.f167461a.f167459a, R.color.a9));
                            textPaint.setUnderlineText(true);
                        }

                        public final void onClick(View view) {
                            C89219l.m154721d(view, "");
                            ShoutoutsPlayViewModel a = this.f167463a.f167461a.f167459a.mo117149a();
                            Context context = view.getContext();
                            C89219l.m154716b(context, "");
                            a.mo117172a(context, this.f167463a.f167461a.f167459a.f167431a);
                        }

                        C74469a(C744672 r1, StyleSpan styleSpan, String str, String str2) {
                            this.f167463a = r1;
                            this.f167464b = styleSpan;
                            this.f167465c = str;
                            this.f167466d = str2;
                        }
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(ShoutoutsPlayState shoutoutsPlayState) {
                        C89219l.m154721d(shoutoutsPlayState, "");
                        TuxTextView tuxTextView = (TuxTextView) this.f167461a.f167459a._$_findCachedViewById(R.id.e0d);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setText("");
                        TuxTextView tuxTextView2 = (TuxTextView) this.f167461a.f167459a._$_findCachedViewById(R.id.e0d);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setVisibility(8);
                        String string = this.f167461a.f167459a.getString(R.string.fwe);
                        C89219l.m154716b(string, "");
                        String string2 = this.f167461a.f167459a.getString(R.string.fxc);
                        C89219l.m154716b(string2, "");
                        StyleSpan styleSpan = new StyleSpan(1);
                        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string).append((CharSequence) string2);
                        append.setSpan(styleSpan, string.length(), string.length() + string2.length(), 33);
                        append.setSpan(new C74469a(this, styleSpan, string, string2), string.length(), string.length() + string2.length(), 33);
                        TuxTextView tuxTextView3 = (TuxTextView) this.f167461a.f167459a._$_findCachedViewById(R.id.e0c);
                        tuxTextView3.setText(append);
                        tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
                        tuxTextView3.setHighlightColor(0);
                        ((TuxTextView) this.f167461a.f167459a._$_findCachedViewById(R.id.e0f)).setOnClickListener(new View.OnClickListener(this) {
                            /* class com.p2082ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayActivity.C74465l.C744672.View$OnClickListenerC744681 */

                            /* renamed from: a */
                            final /* synthetic */ C744672 f167462a;

                            static {
                                Covode.recordClassIndex(87267);
                            }

                            {
                                this.f167462a = r1;
                            }

                            public final void onClick(View view) {
                                ClickAgent.onClick(view);
                                ShoutoutsPlayViewModel a = this.f167462a.f167461a.f167459a.mo117149a();
                                DownloadServiceManager.INSTANCE.getDownloadService().cancel(a.f167475b);
                                a.mo33689c(ShoutoutsPlayViewModel.C74475a.f167477a);
                            }
                        });
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    /* renamed from: a */
    static /* synthetic */ C33744d m130894a(ShoutoutsPlayActivity shoutoutsPlayActivity, boolean z, boolean z2, int i) {
        String str;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        String a = m130895a(shoutoutsPlayActivity.getIntent(), "author_id");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        boolean a2 = C89219l.m154714a((Object) a, (Object) g.getCurUserId());
        C33744d dVar = new C33744d();
        String a3 = m130895a(shoutoutsPlayActivity.getIntent(), "enter_from");
        if (a3 == null) {
            a3 = "chat";
        }
        C33744d a4 = dVar.mo59983a("enter_from", a3).mo59983a("content_source", "shoutouts");
        if (a2) {
            str = "creator";
        } else {
            str = "consumer";
        }
        C33744d a5 = a4.mo59983a("user_type", str).mo59983a("author_id", m130895a(shoutoutsPlayActivity.getIntent(), "author_id")).mo59983a("group_id", m130895a(shoutoutsPlayActivity.getIntent(), "aweme_id"));
        if (a2 && z2) {
            a5 = shoutoutsPlayActivity.m130897e() ? a5.mo59983a("video_status", "review") : a5.mo59983a("video_status", "finish");
        }
        if (z) {
            String a6 = m130895a(shoutoutsPlayActivity.getIntent(), "order_id");
            if (a6 == null) {
                a6 = "";
            }
            a5 = a5.mo59983a("order_id", a6);
        }
        C89219l.m154716b(a5, "");
        return a5;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

package com.p2082ss.android.ugc.aweme.trending.p4149ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
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
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.trending.p4148d.C79056a;
import com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainState;
import com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import org.greenrobot.eventbus.AbstractC90253j;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
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

/* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity */
public final class TrendingDetailActivity extends DetailActivity implements AbstractC20380ar<C34499i>, AbstractC20527q, AbstractC90253j {

    /* renamed from: j */
    public C34499i f177714j = new C34499i();

    /* renamed from: k */
    private final lifecycleAwareLazy f177715k;

    /* renamed from: l */
    private SparseArray f177716l;

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity$a */
    public static final class C79069a extends AbstractC89220m implements AbstractC89183m<TrendingMainState, Bundle, TrendingMainState> {
        public static final C79069a INSTANCE = new C79069a();

        static {
            Covode.recordClassIndex(92249);
        }

        public C79069a() {
            super(2);
        }

        public final TrendingMainState invoke(TrendingMainState trendingMainState, Bundle bundle) {
            C89219l.m154719c(trendingMainState, "");
            return trendingMainState;
        }
    }

    static {
        Covode.recordClassIndex(92248);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f177716l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f177716l == null) {
            this.f177716l = new SparseArray();
        }
        View view = (View) this.f177716l.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f177716l.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractActivityC41359ak, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f177714j;
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C80632w.m139802a(hashCode());
    }

    public TrendingDetailActivity() {
        AbstractC89277c a = C89204ab.m154669a(TrendingMainViewModel.class);
        this.f177715k = new lifecycleAwareLazy(this, new C79070b(this, a, C79069a.INSTANCE, a));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
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

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity$b */
    public static final class C79070b extends AbstractC89220m implements AbstractC89171a<TrendingMainViewModel> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0218d f177717a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f177718b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f177719c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89277c f177720d;

        static {
            Covode.recordClassIndex(92250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79070b(ActivityC0218d dVar, AbstractC89277c cVar, AbstractC89183m mVar, AbstractC89277c cVar2) {
            super(0);
            this.f177717a = dVar;
            this.f177718b = cVar;
            this.f177719c = mVar;
            this.f177720d = cVar2;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel invoke() {
            /*
                r4 = this;
                androidx.appcompat.app.d r1 = r4.f177717a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f177720d
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r3)
                h.k.c r0 = r4.f177718b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m137904xe5b05587(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel> r0 = com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel.class
                com.bytedance.jedi.arch.y r0 = r1.mo33696a(r0)
                if (r0 == 0) goto L_0x0038
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r3)
                r0.binding(r2)
            L_0x0038:
                com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity$b$1 r0 = new com.ss.android.ugc.aweme.trending.ui.TrendingDetailActivity$b$1
                r0.<init>(r4)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.trending.p4149ui.TrendingDetailActivity.C79070b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_trending_ui_TrendingDetailActivity$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m137904xe5b05587(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: a */
    private static Bundle m137901a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity
    /* renamed from: a */
    public final C41401l mo70608a(C49812b bVar) {
        Bundle bundle;
        String str;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = m137901a(intent);
        } else {
            bundle = null;
        }
        TrendingMainViewModel trendingMainViewModel = (TrendingMainViewModel) this.f177715k.getValue();
        if (bVar == null || (str = bVar.getEnterMethodValue()) == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        trendingMainViewModel.f177844c = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 71);
        C79056a.f177697a = bVar;
        int hashCode = hashCode();
        C80632w.f180283a = hashCode;
        C80632w.m139803a("video_play", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("video_play", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("video_play", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("video_play", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("video_play", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("video_play", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("video_play", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("video_play", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("video_play", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("play_time", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("play_time", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("play_time", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("play_time", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("play_time", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("play_time", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("play_time", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("play_time", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("play_time", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("video_play_finish", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("video_play_finish", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("video_play_finish", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("video_play_finish", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("video_play_finish", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("video_play_finish", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("video_play_finish", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("video_play_finish", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("video_play_finish", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("like", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("like", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("like", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("like", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("like", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("like", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("like", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("like", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("like", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("like_cancel", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("like_cancel", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("like_cancel", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("like_cancel", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("like_cancel", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("like_cancel", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("like_cancel", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("like_cancel", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("like_cancel", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("follow", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("follow", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("follow", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("follow", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("follow", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("follow", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("follow", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("follow", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("follow", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("click_comment_button", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("click_comment_button", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("click_comment_button", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("click_comment_button", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("click_comment_button", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("click_comment_button", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("click_comment_button", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("click_comment_button", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("click_comment_button", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("post_comment", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("post_comment", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("post_comment", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("post_comment", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("post_comment", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("post_comment", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("post_comment", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("post_comment", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("post_comment", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("click_more_button", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("click_more_button", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("click_more_button", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("click_more_button", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("click_more_button", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("click_more_button", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("click_more_button", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("click_more_button", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("click_more_button", "topic_group_num", C79056a.f177706j, hashCode);
        C80632w.m139803a("share_video", "enter_from", C79056a.f177698b, hashCode);
        C80632w.m139803a("share_video", "trending_entrance", C79056a.f177699c, hashCode);
        C80632w.m139803a("share_video", "from_group_id", C79056a.f177700d, hashCode);
        C80632w.m139803a("share_video", "trending_topic", C79056a.f177701e, hashCode);
        C80632w.m139803a("share_video", "trending_topic_id", C79056a.f177702f, hashCode);
        C80632w.m139803a("share_video", "trending_topic_source", C79056a.f177703g, hashCode);
        C80632w.m139803a("share_video", "topic_rank", C79056a.f177704h, hashCode);
        C80632w.m139803a("share_video", "topic_group_rank", C79056a.f177705i, hashCode);
        C80632w.m139803a("share_video", "topic_group_num", C79056a.f177706j, hashCode);
        C89219l.m154721d(bundle, "");
        bundle.putSerializable("feed_param", bVar);
        C79077a aVar = new C79077a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
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

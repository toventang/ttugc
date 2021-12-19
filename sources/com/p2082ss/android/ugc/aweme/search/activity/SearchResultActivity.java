package com.p2082ss.android.ugc.aweme.search.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17867d;
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
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.C33416j;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34468c;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p2082ss.android.ugc.aweme.discover.helper.C41985ae;
import com.p2082ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42097l;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42636ab;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42681ap;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42759bj;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.C42909a;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.C43024a;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40911c;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67611c;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67614d;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67606h;
import com.p2082ss.android.ugc.aweme.search.p3704r.C67704b;
import com.p2082ss.android.ugc.aweme.utils.C80514gu;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.greenrobot.eventbus.EventBus;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity */
public final class SearchResultActivity extends ActivityC17312a implements AbstractC20380ar<C34499i>, AbstractC20527q, AbstractC34585f, AbstractC40912d {

    /* renamed from: b */
    public static final C67340a f150902b = new C67340a((byte) 0);

    /* renamed from: g */
    private static boolean f150903g;

    /* renamed from: a */
    public C34499i f150904a = new C34499i();

    /* renamed from: c */
    private C67678d f150905c;

    /* renamed from: d */
    private final AbstractC89244h f150906d = C89250i.m154773a((AbstractC89171a) new C67342c(this));

    /* renamed from: e */
    private final AbstractC89244h f150907e = C89250i.m154773a((AbstractC89171a) new C67346f(this));

    /* renamed from: f */
    private final AbstractC89244h f150908f;

    /* renamed from: h */
    private SparseArray f150909h;

    static {
        Covode.recordClassIndex(78968);
    }

    /* renamed from: a */
    private final SearchIntermediateViewModel m119386a() {
        return (SearchIntermediateViewModel) this.f150906d.getValue();
    }

    /* renamed from: b */
    private final SearchStateViewModel m119390b() {
        return (SearchStateViewModel) this.f150907e.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f150909h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f150909h == null) {
            this.f150909h = new SparseArray();
        }
        View view = (View) this.f150909h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f150909h.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$a */
    public static final class C67340a {
        static {
            Covode.recordClassIndex(78969);
        }

        private C67340a() {
        }

        public /* synthetic */ C67340a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m119396a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        /* renamed from: a */
        private static void m119397a(Context context, Intent intent, Bundle bundle) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent, bundle);
        }

        /* renamed from: a */
        public static void m119398a(Context context, C67678d dVar, C67674b bVar, Bundle bundle) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(dVar, "");
            Intent intent = new Intent();
            intent.putExtra("searchParam", dVar);
            C43024a.m85850a(intent, bVar);
            intent.setClass(context, SearchResultActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (bundle == null || Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 30) {
                m119396a(context, intent);
            } else {
                m119397a(context, intent, bundle);
            }
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f150904a;
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

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$b */
    static final class C67341b extends AbstractC89220m implements AbstractC89171a<C67611c> {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f150910a;

        static {
            Covode.recordClassIndex(78970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67341b(SearchResultActivity searchResultActivity) {
            super(0);
            this.f150910a = searchResultActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67611c invoke() {
            return new C67611c(this.f150910a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$c */
    static final class C67342c extends AbstractC89220m implements AbstractC89171a<SearchIntermediateViewModel> {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f150911a;

        static {
            Covode.recordClassIndex(78971);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67342c(SearchResultActivity searchResultActivity) {
            super(0);
            this.f150911a = searchResultActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchIntermediateViewModel invoke() {
            return C1181ae.m3881a(this.f150911a, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$f */
    static final class C67346f extends AbstractC89220m implements AbstractC89171a<SearchStateViewModel> {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f150915a;

        static {
            Covode.recordClassIndex(78975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67346f(SearchResultActivity searchResultActivity) {
            super(0);
            this.f150915a = searchResultActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchStateViewModel invoke() {
            return C1181ae.m3881a(this.f150915a, (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        }
    }

    /* renamed from: g */
    private boolean m119393g() {
        return MSAdaptionService.m97895c().mo89372a((Context) this);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        overridePendingTransition(C34468c.f81445a, C34468c.f81446b);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d
    public final AbstractC40911c getInflater() {
        return (AbstractC40911c) this.f150908f.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        m119390b().setSearchPageVisible(true);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        Fragment a = getSupportFragmentManager().mo3551a("container");
        if (!(a instanceof AbstractC42636ab) || !((AbstractC42636ab) a).mo72827a()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", true);
        super.onResume();
        C80632w.f180283a = hashCode();
        C42909a.f100056a = hashCode();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        int i;
        Fragment a = getSupportFragmentManager().mo3551a("container");
        if (a instanceof C42759bj) {
            C42759bj bjVar = (C42759bj) a;
            if (bjVar.mo73039b() != null) {
                C42681ap b = bjVar.mo73039b();
                if (b == null) {
                    C89219l.m154715b();
                }
                i = b.f99542k;
            } else {
                i = -1;
            }
            if (i == C67458j.f151133b) {
                return "general_search";
            }
            if (i == C67458j.f151135d) {
                return "search_result";
            }
        }
        return "";
    }

    public SearchResultActivity() {
        for (SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver : C89070n.m154516a(new SearchMusicPlayerLifecycleObserver(this))) {
            getLifecycleOwner().getLifecycle().mo4012a(searchMusicPlayerLifecycleObserver);
        }
        this.f150908f = C89250i.m154773a((AbstractC89171a) new C67341b(this));
    }

    /* renamed from: e */
    private final C67678d m119391e() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        String a = m119387a(intent, "keyword");
        String a2 = m119387a(intent, "display_keyword");
        if (TextUtils.isEmpty(a2)) {
            a2 = m119387a(intent, "displayKeyword");
        }
        String a3 = m119387a(intent, "enter_from");
        String a4 = m119387a(intent, "search_from");
        String a5 = m119387a(intent, "enter_method");
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        C67678d realSearchWord = new C67678d().setRealSearchWord(a);
        if (!TextUtils.isEmpty(a2)) {
            a = a2;
        }
        return realSearchWord.setKeyword(a).setSearchFrom(a4).setEnterMethod(a5);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        m119390b().setSearchPageVisible(false);
        m119390b().setIsLeavingSearch(false);
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

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r2 != null) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m119392f() {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity.m119392f():void");
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        View decorView;
        C15477a.m28479e(this);
        Window window = getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null)) {
            C89219l.m154716b(decorView, "");
            C42460j.C42461a.m84866b(decorView);
        }
        super.onDestroy();
        C42097l.f98148d--;
        C42097l.f98147c--;
        if (C42097l.f98148d <= 0) {
            C42097l.f98145a.clear();
        }
        C67605g.f151448a.clear();
        C67606h.f151453a.clear();
        C42452d.f98939k = 0;
        C42452d.f98940l = 0;
        C42452d.f98930b = false;
        C42452d.f98931c = false;
        C42452d.f98932d = false;
        SearchEnterViewModel.C42997a.m85830a(this);
        SearchEnterViewModel.f100246b.remove(Integer.valueOf(hashCode()));
        C80632w.m139802a(hashCode());
        C41985ae aeVar = C41985ae.f97915a;
        aeVar.f98539b--;
        if (aeVar.f98539b <= 0) {
            EventBus.m156962a().mo145395b(aeVar);
            aeVar.mo71486a().clear();
            aeVar.f98539b = 0;
        }
        SearchApiNew.f97601d.clear();
        int hashCode = hashCode();
        ConcurrentLinkedDeque<C89378p<Integer, AbstractC67567q>> concurrentLinkedDeque = C67486am.f151181a;
        ArrayList<C89378p> arrayList = new ArrayList();
        for (T t : concurrentLinkedDeque) {
            T t2 = t;
            if (!(t2 == null || hashCode != ((Number) t2.getFirst()).intValue() || t2.getSecond() == null)) {
                arrayList.add(t);
            }
        }
        for (C89378p pVar : arrayList) {
            C67486am.f151181a.remove(pVar);
            ((AbstractC67567q) pVar.getSecond()).mo106432d();
        }
        C80514gu.m139559a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$e */
    static final class RunnableC67345e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f150914a;

        static {
            Covode.recordClassIndex(78974);
        }

        RunnableC67345e(SearchResultActivity searchResultActivity) {
            this.f150914a = searchResultActivity;
        }

        public final void run() {
            int i;
            SearchResultActivity searchResultActivity = this.f150914a;
            if (searchResultActivity != null) {
                i = searchResultActivity.hashCode();
            } else {
                i = 0;
            }
            C80632w.m139803a("search_result_show_video", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("search_result_show_video", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("search_result_show_video", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("search_result_show_video", "log_pb", C67704b.f151774h, i);
            C80632w.m139803a("search_result_show_video", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("search_result_show_video", "video_tag", C67704b.f151769c, i);
            C80632w.m139803a("search_result_show", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("search_result_show", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("search_result_show", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("search_result_show", "log_pb", C67704b.f151774h, i);
            C80632w.m139803a("search_result_show", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("search_result_click", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("search_result_click", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("search_result_click", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("search_result_click", "log_pb", C67704b.f151774h, i);
            C80632w.m139803a("search_result_click", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("feed_enter", "video_tag", C67704b.f151769c, i);
            C80632w.m139803a("feed_enter", "user_tag", C67704b.f151770d, i);
            C80632w.m139803a("feed_enter", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("feed_enter", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("feed_enter", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("feed_enter", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("feed_enter", "log_pb", C67704b.f151774h, i);
            C80632w.m139803a("feed_enter", "token_type", C67704b.f151778l, i);
            C80632w.m139803a("feed_enter", "anchor_info", C67704b.f151779m, i);
            C80632w.m139803a("video_play", "video_tag", C67704b.f151769c, i);
            C80632w.m139803a("video_play", "user_tag", C67704b.f151770d, i);
            C80632w.m139803a("video_play", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("video_play", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("video_play", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("video_play", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("video_play", "log_pb", C67704b.f151774h, i);
            C80632w.m139803a("video_play", "list_result_type", C67704b.f151775i, i);
            C80632w.m139803a("video_play", "list_item_id", C67704b.f151776j, i);
            C80632w.m139803a("video_play", "search_third_item_id", C67704b.f151777k, i);
            C80632w.m139803a("video_play", "token_type", C67704b.f151778l, i);
            C80632w.m139803a("video_play", "anchor_info", C67704b.f151779m, i);
            C80632w.m139803a("play_time", "video_tag", C67704b.f151769c, i);
            C80632w.m139803a("play_time", "user_tag", C67704b.f151770d, i);
            C80632w.m139803a("play_time", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("play_time", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("play_time", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("play_time", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("play_time", "log_pb", C67704b.f151774h, i);
            C80632w.m139803a("play_time", "list_result_type", C67704b.f151775i, i);
            C80632w.m139803a("play_time", "list_item_id", C67704b.f151776j, i);
            C80632w.m139803a("play_time", "search_third_item_id", C67704b.f151777k, i);
            C80632w.m139803a("play_time", "token_type", C67704b.f151778l, i);
            C80632w.m139803a("play_time", "anchor_info", C67704b.f151779m, i);
            C80632w.m139803a("video_play_finish", "video_tag", C67704b.f151769c, i);
            C80632w.m139803a("video_play_finish", "user_tag", C67704b.f151770d, i);
            C80632w.m139803a("video_play_finish", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("video_play_finish", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("video_play_finish", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("video_play_finish", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("video_play_finish", "log_pb", C67704b.f151774h, i);
            C80632w.m139803a("video_play_finish", "list_result_type", C67704b.f151775i, i);
            C80632w.m139803a("video_play_finish", "list_item_id", C67704b.f151776j, i);
            C80632w.m139803a("video_play_finish", "search_third_item_id", C67704b.f151777k, i);
            C80632w.m139803a("video_play_finish", "token_type", C67704b.f151778l, i);
            C80632w.m139803a("video_play_finish", "anchor_info", C67704b.f151779m, i);
            C80632w.m139803a("enter_personal_detail", "video_tag", C67704b.f151769c, i);
            C80632w.m139803a("enter_personal_detail", "user_tag", C67704b.f151770d, i);
            C80632w.m139803a("enter_personal_detail", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("enter_personal_detail", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("enter_personal_detail", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("enter_personal_detail", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("enter_tag_detail", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("enter_tag_detail", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("enter_tag_detail", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("enter_tag_detail", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("enter_music_detail", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("enter_music_detail", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("enter_music_detail", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("enter_music_detail", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("follow", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("follow", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("follow", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("follow", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("like", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("like", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("like", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("like", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("like_cancel", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("like_cancel", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("like_cancel", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("like_cancel", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("click_comment_button", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("click_comment_button", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("click_comment_button", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("click_comment_button", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("post_comment", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("post_comment", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("post_comment", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("post_comment", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("click_more_button", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("click_more_button", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("click_more_button", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("click_more_button", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("share_video", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("share_video", "search_keyword", C67704b.f151768b, i);
            C80632w.m139803a("share_video", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("share_video", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("search_video_play_finish", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("search_video_play_finish", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("search_video_play", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("search_video_play", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("search_play_time", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("search_play_time", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("search_follow", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("search_follow", "impr_id", C67704b.f151773g, i);
            C80632w.m139803a("tiktok_video_anchor_view", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("tiktok_video_anchor_view", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("tiktok_video_anchor_view", "enter_from", C67704b.f151772f, i);
            C80632w.m139803a("tiktok_video_anchor_click", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("tiktok_video_anchor_click", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("tiktok_video_anchor_click", "enter_from", C67704b.f151772f, i);
            C80632w.m139803a("tiktokec_product_show", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("tiktokec_product_show", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("tiktokec_product_show", "enter_from", C67704b.f151772f, i);
            C80632w.m139803a("tiktokec_product_click", "search_id", C67704b.f151767a, i);
            C80632w.m139803a("tiktokec_product_click", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("tiktokec_product_click", "enter_from", C67704b.f151772f, i);
            C80632w.m139803a("tiktokec_enter_product_detail", "search_id", C67704b.f151771e, i);
            C80632w.m139803a("tiktokec_enter_product_detail", "search_result_id", C67704b.f151771e, i);
            C80632w.m139803a("tiktokec_enter_product_detail", "enter_from", C67704b.f151772f, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$d */
    static final class C67343d extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C67343d f150912a = new C67343d();

        static {
            Covode.recordClassIndex(78972);
        }

        C67343d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C673441.f150913a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m119392f();
    }

    /* renamed from: a */
    private final void m119388a(C67674b bVar) {
        if (bVar != null) {
            if (bVar.getUseSingleStack()) {
                getIntent().putExtra("in_single_stack", true);
            }
            bVar.setUseSingleStack(false);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
        if (!m119393g()) {
            if (Build.VERSION.SDK_INT >= 24) {
                z = isInMultiWindowMode();
            } else {
                z = false;
            }
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            Context a = C17867d.m33078a();
            if ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || !a.getPackageManager().hasSystemFeature("com.huawei.hardware.sensor.posture")) && ((!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || (!"HWTAH ".equalsIgnoreCase(Build.DEVICE) && !"HWTAH-C".equalsIgnoreCase(Build.DEVICE) && !"unknownRLI".equalsIgnoreCase(Build.DEVICE) && !"unknownRHA".equalsIgnoreCase(Build.DEVICE))) && (!"HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || (!"TAH-AN00".equalsIgnoreCase(Build.MODEL) && !"TAH-N29".equalsIgnoreCase(Build.MODEL) && !"TAH-AN00m".equalsIgnoreCase(Build.MODEL) && !"TAH-N29m".equalsIgnoreCase(Build.MODEL) && !"RLI-AN00".equalsIgnoreCase(Build.MODEL) && !"RLI-N29".equalsIgnoreCase(Build.MODEL) && !"RHA-AN00m".equalsIgnoreCase(Build.MODEL) && !"RHA-N29m".equalsIgnoreCase(Build.MODEL))))) {
                C33416j.f79445a = false;
                C33416j.f79446b = 0;
                C33416j.f79447c = 0;
            } else {
                C33416j.f79445a = z;
                if (z) {
                    C33416j.f79446b = i;
                    C33416j.f79447c = i2;
                } else {
                    C33416j.f79446b = 0;
                    C33416j.f79447c = 0;
                }
            }
            if (z != f150903g) {
                getSupportFragmentManager().mo3551a("container");
            }
            f150903g = z;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Bundle a;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", true);
        activityConfiguration(C67343d.f150912a);
        super.onCreate(bundle);
        setContentView(EnumC67634k.INSTANCE.getView(this, R.layout.atn, null));
        m119392f();
        if (!m119393g()) {
            if (Build.VERSION.SDK_INT >= 30) {
                C34468c.m70449a(this, 1);
            } else {
                C34468c.m70449a(this, 0);
            }
        }
        C67614d.m119764a();
        EnumC67634k.INSTANCE.async(new RunnableC67345e(this));
        C41985ae aeVar = C41985ae.f97915a;
        aeVar.f98539b++;
        EventBus.m156966a(EventBus.m156962a(), aeVar);
        C89219l.m154721d(this, "");
        Iterator<T> it = C80514gu.f180115b.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().size();
        }
        if (i >= C80514gu.f180114a) {
            List list = (List) C89070n.m154565c((Iterable) C80514gu.f180115b);
            if (list == null) {
                list = new ArrayList();
            }
            if (list.isEmpty()) {
                C80514gu.f180115b.poll();
            } else {
                Activity activity = (Activity) list.remove(0);
                if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
                    activity.finish();
                }
            }
        }
        if (C80514gu.f180115b.isEmpty() || ((a = C80514gu.m139556a(getIntent())) != null && a.getBoolean("in_single_stack"))) {
            C80514gu.f180115b.offer(C89070n.m154525d(this));
        } else {
            C80514gu.m139561b().add(this);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m119387a(Intent intent, String str) {
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

    /* renamed from: a */
    private final void m119389a(C67678d dVar, C67674b bVar) {
        C42759bj a = C42759bj.C42760a.m85478a(dVar, bVar, this);
        AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a2, "");
        a2.mo3470b(R.id.b82, a, "container");
        a2.mo3473c();
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

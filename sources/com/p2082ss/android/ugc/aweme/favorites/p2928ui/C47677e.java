package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.bridge.magpie.C13427b;
import com.bytedance.bridge.magpie.p883b.C13431b;
import com.bytedance.bridge.magpie.p884c.C13435a;
import com.bytedance.bridge.magpie.p884c.C13438b;
import com.bytedance.bridge.magpie.p885d.AbstractC13444c;
import com.bytedance.bridge.magpie.p885d.AbstractC13445d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.C15531c;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.p1107a.AbstractC15507c;
import com.bytedance.hybrid.spark.page.C15593c;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35501a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.favorites.model.ChallengeCollectedViewModel;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47436b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.p4541b.C88120a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.e */
public final class C47677e extends C17372a implements AbstractC47713j, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C47680c f110544k = new C47680c((byte) 0);

    /* renamed from: e */
    public final Handler f110545e = new Handler();

    /* renamed from: f */
    public C15593c f110546f;

    /* renamed from: g */
    public boolean f110547g;

    /* renamed from: h */
    public boolean f110548h;

    /* renamed from: i */
    public AbstractC21154h f110549i;

    /* renamed from: j */
    public long f110550j;

    /* renamed from: l */
    private FrameLayout f110551l;

    /* renamed from: m */
    private TuxStatusView f110552m;

    /* renamed from: n */
    private final AbstractC89244h f110553n = C88120a.m153193a(this, C89204ab.m154669a(ChallengeCollectedViewModel.class), new C47679b(new C47678a(this)));

    /* renamed from: o */
    private List<C13431b> f110554o = new ArrayList();

    /* renamed from: p */
    private long f110555p;

    /* renamed from: q */
    private boolean f110556q;

    /* renamed from: r */
    private SparseArray f110557r;

    static {
        Covode.recordClassIndex(56299);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f110557r == null) {
            this.f110557r = new SparseArray();
        }
        View view = (View) this.f110557r.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f110557r.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f110557r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final ChallengeCollectedViewModel mo64296c() {
        return (ChallengeCollectedViewModel) this.f110553n.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(144, new RunnableC90250g(C47677e.class, "onChallengeCollectEvent", C35501a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C47677e.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$a */
    public static final class C47678a extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110558a;

        static {
            Covode.recordClassIndex(56300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47678a(Fragment fragment) {
            super(0);
            this.f110558a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f110558a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$c */
    public static final class C47680c {
        static {
            Covode.recordClassIndex(56302);
        }

        private C47680c() {
        }

        public /* synthetic */ C47680c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$d */
    public static final class C47681d extends AbstractC15507c {

        /* renamed from: a */
        final /* synthetic */ C47677e f110560a;

        static {
            Covode.recordClassIndex(56303);
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: c */
        public final void mo25385c() {
            super.mo25385c();
        }

        C47681d(C47677e eVar) {
            this.f110560a = eVar;
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: a */
        public final void mo25381a(AbstractC21154h hVar) {
            C89219l.m154721d(hVar, "");
            super.mo25381a(hVar);
            C18285c.m34004a("discovery_collect_hashtag_lynx_load_result", System.currentTimeMillis() - this.f110560a.f110550j);
            C18285c.m34006b("discovery_collect_hashtag_load_lynx");
            System.currentTimeMillis();
            this.f110560a.f110549i = hVar;
            this.f110560a.f110547g = true;
            this.f110560a.mo79810d();
        }

        @Override // com.bytedance.lynx.hybrid.p1515a.AbstractC21152f
        /* renamed from: b */
        public final void mo25384b(AbstractC21154h hVar, String str) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(str, "");
            super.mo25384b(hVar, str);
            this.f110560a.mo79812f();
            C18285c.m34004a("discovery_collect_hashtag_lynx_load_result", -1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47713j
    public final void bm_() {
        mo79814h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$j */
    public static final class C47691j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47677e f110576a;

        static {
            Covode.recordClassIndex(56313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47691j(C47677e eVar) {
            super(0);
            this.f110576a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f110576a.mo79814h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$f */
    static final class C47684f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47677e f110567a;

        /* renamed from: b */
        final /* synthetic */ C34569a f110568b;

        static {
            Covode.recordClassIndex(56306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47684f(C47677e eVar, C34569a aVar) {
            super(0);
            this.f110567a = eVar;
            this.f110568b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f110567a.f110545e.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47677e.C47684f.RunnableC476851 */

                /* renamed from: a */
                final /* synthetic */ C47684f f110569a;

                static {
                    Covode.recordClassIndex(56307);
                }

                {
                    this.f110569a = r1;
                }

                public final void run() {
                    this.f110569a.f110567a.mo79812f();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$l */
    public static final class C47694l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47677e f110580a;

        static {
            Covode.recordClassIndex(56316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47694l(C47677e eVar) {
            super(0);
            this.f110580a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f110580a.f110545e.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47677e.C47694l.RunnableC476951 */

                /* renamed from: a */
                final /* synthetic */ C47694l f110581a;

                static {
                    Covode.recordClassIndex(56317);
                }

                {
                    this.f110581a = r1;
                }

                public final void run() {
                    this.f110581a.f110580a.mo79812f();
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: j */
    private static boolean m90682j() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$b */
    public static final class C47679b extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f110559a;

        static {
            Covode.recordClassIndex(56301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47679b(AbstractC89171a aVar) {
            super(0);
            this.f110559a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = ((AbstractC1183ag) this.f110559a.invoke()).getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: g */
    public final void mo79813g() {
        TuxStatusView tuxStatusView = this.f110552m;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        tuxStatusView.setVisibility(8);
        C15593c cVar = this.f110546f;
        if (cVar != null) {
            cVar.setVisibility(0);
        }
        this.f110556q = false;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus a = EventBus.m156962a();
        if (a != null && a.mo145393a(this)) {
            a.mo145395b(this);
        }
        bx_();
    }

    /* renamed from: e */
    public final void mo79811e() {
        if (this.f41692a && !isDetached() && isAdded()) {
            TuxStatusView tuxStatusView = this.f110552m;
            if (tuxStatusView == null) {
                C89219l.m154710a("statusView");
            }
            TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C47690i.f110575a));
            String string = getString(R.string.bs4);
            C89219l.m154716b(string, "");
            TuxStatusView.C23263c a2 = a.mo37879a(string);
            String string2 = getString(R.string.bs3);
            C89219l.m154716b(string2, "");
            tuxStatusView.setStatus(a2.mo37878a((CharSequence) string2));
            TuxStatusView tuxStatusView2 = this.f110552m;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("statusView");
            }
            tuxStatusView2.setVisibility(0);
            this.f110556q = true;
            C15593c cVar = this.f110546f;
            if (cVar != null) {
                cVar.setVisibility(8);
            }
        }
    }

    /* renamed from: f */
    public final void mo79812f() {
        if (this.f41692a && !isDetached() && isAdded()) {
            TuxStatusView tuxStatusView = this.f110552m;
            if (tuxStatusView == null) {
                C89219l.m154710a("statusView");
            }
            tuxStatusView.setVisibility(0);
            TuxStatusView tuxStatusView2 = this.f110552m;
            if (tuxStatusView2 == null) {
                C89219l.m154710a("statusView");
            }
            tuxStatusView2.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C47691j(this)));
            C15593c cVar = this.f110546f;
            if (cVar != null) {
                cVar.setVisibility(8);
            }
            this.f110556q = false;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C21196a hybridContext;
        C13427b bVar;
        super.onDestroy();
        AbstractC21154h hVar = this.f110549i;
        if (!(hVar == null || (hybridContext = hVar.getHybridContext()) == null || (bVar = (C13427b) hybridContext.mo34746a(C13427b.class)) == null)) {
            for (T t : this.f110554o) {
                C89219l.m154719c(t, "");
                C13435a aVar = bVar.f32730a.f32692a;
                if (aVar != null) {
                    C89219l.m154719c(t, "");
                    if (t.f32747c.length() > 0) {
                        C13438b bVar2 = aVar.f32757b.get(t.f32747c);
                        if (bVar2 != null) {
                            bVar2.mo21665b(t);
                        }
                    } else {
                        aVar.f32756a.mo21665b(t);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo79810d() {
        View view;
        RecyclerView a;
        AbstractC21154h kitView;
        MethodCollector.m26663i(7437);
        if (isDetached() || !isAdded()) {
            MethodCollector.m26664o(7437);
        } else if (!this.f41692a || !this.f110547g || !this.f110548h) {
            if (this.f41692a) {
                if (this.f110547g) {
                    C18285c.m34004a("discovery_collect_hashtag_data_and_template_ready", -1);
                    MethodCollector.m26664o(7437);
                    return;
                }
                C18285c.m34004a("discovery_collect_hashtag_data_and_template_ready", 1);
            }
            MethodCollector.m26664o(7437);
        } else {
            mo79813g();
            Context context = getContext();
            if (context != null) {
                FrameLayout frameLayout = this.f110551l;
                if (frameLayout == null) {
                    C89219l.m154710a("flCtr");
                }
                frameLayout.removeAllViews();
                FrameLayout frameLayout2 = this.f110551l;
                if (frameLayout2 == null) {
                    C89219l.m154710a("flCtr");
                }
                frameLayout2.addView(this.f110546f, new ViewGroup.LayoutParams(-1, -1));
                AbstractC21154h hVar = this.f110549i;
                if (hVar != null) {
                    C13427b bVar = (C13427b) hVar.getHybridContext().mo34746a(C13427b.class);
                    if (bVar != null) {
                        C13431b bVar2 = new C13431b();
                        this.f110554o.add(bVar2);
                        bVar2.mo21654a("app.clickChallengeItem");
                        bVar2.f32748d = new C47686g(this);
                        bVar.mo21646a(bVar2);
                        C13431b bVar3 = new C13431b();
                        this.f110554o.add(bVar3);
                        bVar3.mo21654a("app.getChallenge");
                        bVar3.f32748d = new C47687h(this);
                        bVar.mo21646a(bVar3);
                    }
                    this.f110555p = System.currentTimeMillis();
                    C18285c.m34003a("discovery_collect_hashtag_lynx_list_render");
                    ChallengeCollectedViewModel c = mo64296c();
                    C89219l.m154716b(context, "");
                    hVar.updateData(c.mo79738a(context));
                    C18285c.m34006b("discovery_collect_hashtag_lynx_list_render");
                    C18285c.m34006b("discovery_collect_hashtag_first_screen");
                    C15593c cVar = this.f110546f;
                    if (cVar == null || (kitView = cVar.getKitView()) == null) {
                        view = null;
                    } else {
                        view = kitView.mo34724a();
                    }
                    if (!(view instanceof ViewGroup) || (a = m90681a((ViewGroup) view)) == null) {
                        MethodCollector.m26664o(7437);
                        return;
                    }
                    C80330da.C80331a.m139266a("discovery_collect_hashtag_lynx_list").mo123698a(a);
                    MethodCollector.m26664o(7437);
                    return;
                }
                MethodCollector.m26664o(7437);
                return;
            }
            MethodCollector.m26664o(7437);
        }
    }

    /* renamed from: h */
    public final void mo79814h() {
        Context context;
        if (this.f41692a && !isDetached() && isAdded()) {
            if (!this.f110548h || !this.f110547g) {
                getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m90682j();
                }
                if (C58029j.f132256h) {
                    if (this.f41692a) {
                        TuxStatusView tuxStatusView = this.f110552m;
                        if (tuxStatusView == null) {
                            C89219l.m154710a("statusView");
                        }
                        tuxStatusView.setVisibility(0);
                        TuxStatusView tuxStatusView2 = this.f110552m;
                        if (tuxStatusView2 == null) {
                            C89219l.m154710a("statusView");
                        }
                        tuxStatusView2.mo37867a();
                        this.f110556q = false;
                    }
                    C18285c.m34003a("discovery_collect_hashtag_first_screen");
                    if (!this.f110548h) {
                        mo64296c().mo79740b(new C47692k(this), new C47694l(this));
                    }
                    if (!this.f110547g && (context = getContext()) != null) {
                        C89219l.m154716b(context, "");
                        SparkContext sparkContext = new SparkContext();
                        sparkContext.mo25238a("aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bundle=demo%2Ftemplate%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect&surl=https://lf21-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource/discovery_hashtag_collect/demo/template/template.js");
                        sparkContext.mo25237a(new C47681d(this));
                        C15593c b = C15531c.C15532a.m28665a(context, sparkContext).mo25317b();
                        SparkContext sparkContext2 = b.getSparkContext();
                        if (sparkContext2 != null) {
                            b.mo25371a(sparkContext2);
                        }
                        C18285c.m34003a("discovery_collect_hashtag_load_lynx");
                        this.f110550j = System.currentTimeMillis();
                        b.mo25374c();
                        this.f110546f = b;
                        return;
                    }
                    return;
                }
                mo79812f();
            } else if (!this.f110556q) {
                mo79813g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$g */
    public static final class C47686g implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ C47677e f110570a;

        static {
            Covode.recordClassIndex(56308);
        }

        C47686g(C47677e eVar) {
            this.f110570a = eVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, AbstractC13445d dVar) {
            String str3;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            String optString = new JSONObject(str2).optString("cid", "");
            ChallengeCollectedViewModel c = this.f110570a.mo64296c();
            C89219l.m154716b(optString, "");
            Challenge a = c.mo79737a(optString);
            C47436b.m90456a(this.f110570a.getActivity(), a, "collection_tag", "");
            ICommerceChallengeService e = CommerceChallengeServiceImpl.m75741e();
            if (a != null) {
                str3 = a.getChallengeName();
            } else {
                str3 = null;
            }
            e.mo65391b("favorite_hashtag", str3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$h */
    public static final class C47687h implements AbstractC13444c {

        /* renamed from: a */
        final /* synthetic */ C47677e f110571a;

        static {
            Covode.recordClassIndex(56309);
        }

        C47687h(C47677e eVar) {
            this.f110571a = eVar;
        }

        @Override // com.bytedance.bridge.magpie.p885d.AbstractC13444c
        /* renamed from: a */
        public final void mo21670a(String str, String str2, final AbstractC13445d dVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(dVar, "");
            new JSONObject(str2).optInt("cursor", 0);
            this.f110571a.mo64296c().mo79739a(new AbstractC89187q<Integer, Boolean, List<? extends Challenge>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47677e.C47687h.C476881 */

                /* renamed from: a */
                final /* synthetic */ C47687h f110572a;

                static {
                    Covode.recordClassIndex(56310);
                }

                {
                    this.f110572a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                public final /* synthetic */ C89391z invoke(Integer num, Boolean bool, List<? extends Challenge> list) {
                    int intValue = num.intValue();
                    boolean booleanValue = bool.booleanValue();
                    List<? extends Challenge> list2 = list;
                    C89219l.m154721d(list2, "");
                    AbstractC13445d dVar = dVar;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hasMore", booleanValue);
                    jSONObject.put("cursor", intValue);
                    this.f110572a.f110571a.mo64296c();
                    jSONObject.put("hashTagList", ChallengeCollectedViewModel.m90517a(list2, this.f110572a.f110571a.getContext()).toString());
                    dVar.mo21666a(200, "success", jSONObject);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47677e.C47687h.C476892 */

                static {
                    Covode.recordClassIndex(56311);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    dVar.mo21666a(-1, "fail", null);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$i */
    public static final class C47690i extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C47690i f110575a = new C47690i();

        static {
            Covode.recordClassIndex(56312);
        }

        C47690i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_bookmark;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static RecyclerView m90681a(ViewGroup viewGroup) {
        while (true) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i) instanceof RecyclerView) {
                    View childAt = viewGroup.getChildAt(i);
                    Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                    return (RecyclerView) childAt;
                } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    View childAt2 = viewGroup.getChildAt(i);
                    Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewGroup = (ViewGroup) childAt2;
                }
            }
            return null;
        }
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        String str;
        if (aVar != null && (str = aVar.f81610a) != null && C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/challenge/listcollection/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            mo64296c().mo79740b(new C47682e(this, aVar), new C47684f(this, aVar));
        }
    }

    @AbstractC90264r
    public final void onChallengeCollectEvent(C35501a aVar) {
        C15593c cVar;
        AbstractC21154h kitView;
        C89219l.m154721d(aVar, "");
        if (this.f41692a) {
            Challenge challenge = aVar.f83726a;
            boolean z = false;
            if (challenge.getCollectStatus() == 0) {
                List<Challenge> list = mo64296c().f110272b;
                if (list.size() > 0) {
                    Iterator<Challenge> it = list.iterator();
                    while (it.hasNext()) {
                        Challenge next = it.next();
                        if (!TextUtils.isEmpty(next.getCid()) && C89219l.m154714a((Object) next.getCid(), (Object) challenge.getCid())) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (challenge.getCollectStatus() == 1) {
                mo64296c().f110272b.add(0, challenge);
            } else {
                return;
            }
            Context context = getContext();
            if (!(context == null || (cVar = this.f110546f) == null || (kitView = cVar.getKitView()) == null)) {
                ChallengeCollectedViewModel c = mo64296c();
                C89219l.m154716b(context, "");
                kitView.updateData(c.mo79738a(context));
            }
            if (mo64296c().f110272b.isEmpty()) {
                mo79811e();
            } else {
                mo79813g();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        EventBus a = EventBus.m156962a();
        if (a != null && !a.mo145393a(this)) {
            EventBus.m156966a(a, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$k */
    public static final class C47692k extends AbstractC89220m implements AbstractC89187q<Integer, Boolean, List<? extends Challenge>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47677e f110577a;

        static {
            Covode.recordClassIndex(56314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47692k(C47677e eVar) {
            super(3);
            this.f110577a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Integer num, Boolean bool, List<? extends Challenge> list) {
            num.intValue();
            bool.booleanValue();
            final List<? extends Challenge> list2 = list;
            C89219l.m154721d(list2, "");
            this.f110577a.f110545e.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47677e.C47692k.RunnableC476931 */

                /* renamed from: a */
                final /* synthetic */ C47692k f110578a;

                static {
                    Covode.recordClassIndex(56315);
                }

                {
                    this.f110578a = r1;
                }

                public final void run() {
                    this.f110578a.f110577a.f110548h = true;
                    if (list2.isEmpty()) {
                        this.f110578a.f110577a.mo79811e();
                    } else {
                        this.f110578a.f110577a.mo79810d();
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.e$e */
    static final class C47682e extends AbstractC89220m implements AbstractC89187q<Integer, Boolean, List<? extends Challenge>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47677e f110561a;

        /* renamed from: b */
        final /* synthetic */ C34569a f110562b;

        static {
            Covode.recordClassIndex(56304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47682e(C47677e eVar, C34569a aVar) {
            super(3);
            this.f110561a = eVar;
            this.f110562b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Integer num, Boolean bool, List<? extends Challenge> list) {
            final int intValue = num.intValue();
            final boolean booleanValue = bool.booleanValue();
            final List<? extends Challenge> list2 = list;
            C89219l.m154721d(list2, "");
            this.f110561a.f110545e.post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47677e.C47682e.RunnableC476831 */

                /* renamed from: a */
                final /* synthetic */ C47682e f110563a;

                static {
                    Covode.recordClassIndex(56305);
                }

                {
                    this.f110563a = r1;
                }

                public final void run() {
                    AbstractC21154h kitView;
                    if (!list2.isEmpty()) {
                        this.f110563a.f110561a.mo79813g();
                        C15593c cVar = this.f110563a.f110561a.f110546f;
                        if (cVar != null && (kitView = cVar.getKitView()) != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("hasMore", Boolean.valueOf(booleanValue));
                            linkedHashMap.put("cursor", Integer.valueOf(intValue));
                            this.f110563a.f110561a.mo64296c();
                            String jSONArray = ChallengeCollectedViewModel.m90517a(list2, this.f110563a.f110561a.getContext()).toString();
                            C89219l.m154716b(jSONArray, "");
                            linkedHashMap.put("hashTagList", jSONArray);
                            kitView.updateData(linkedHashMap);
                            return;
                        }
                        return;
                    }
                    this.f110563a.f110561a.mo79811e();
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.zp, viewGroup, false);
        View findViewById = a.findViewById(R.id.b46);
        C89219l.m154716b(findViewById, "");
        this.f110551l = (FrameLayout) findViewById;
        View findViewById2 = a.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById2, "");
        this.f110552m = (TuxStatusView) findViewById2;
        return a;
    }
}

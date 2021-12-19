package com.p2082ss.android.ugc.aweme.interest;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.C17275e;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46842do;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C56861h;
import com.p2082ss.android.ugc.aweme.journey.C56868o;
import com.p2082ss.android.ugc.aweme.journey.C57053v;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.journey.JourneyApi;
import com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56969a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.views.C81437h;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity */
public final class UpdateInterestActivity extends ActivityC17312a {

    /* renamed from: a */
    public int f129346a = -1;

    /* renamed from: b */
    public final AbstractC56869p f129347b = AbstractC56869p.C56870a.m103133a();

    /* renamed from: c */
    public final Keva f129348c = Keva.getRepo("new_user_journey");

    /* renamed from: d */
    public long f129349d;

    /* renamed from: e */
    public long f129350e = System.currentTimeMillis();

    /* renamed from: f */
    private SparseArray f129351f;

    static {
        Covode.recordClassIndex(66654);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f129351f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f129351f == null) {
            this.f129351f = new SparseArray();
        }
        View view = (View) this.f129351f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f129351f.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity$c */
    static final class View$OnClickListenerC56793c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UpdateInterestActivity f129356a;

        static {
            Covode.recordClassIndex(66659);
        }

        View$OnClickListenerC56793c(UpdateInterestActivity updateInterestActivity) {
            this.f129356a = updateInterestActivity;
        }

        /* renamed from: a */
        private static boolean m102975a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            int i;
            Integer num;
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            view.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m102975a();
            }
            if (!C58029j.f132256h) {
                new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            RecyclerView recyclerView = (RecyclerView) this.f129356a._$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            C56969a aVar = (C56969a) adapter;
            C89378p<List<C57054w>, JSONArray> a = C56800a.m102981a(aVar, false);
            long a2 = this.f129356a.mo93941a();
            String jSONArray = a.getSecond().toString();
            C89219l.m154716b(jSONArray, "");
            RecyclerView recyclerView2 = (RecyclerView) this.f129356a._$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView2, "");
            RecyclerView.AbstractC1362i layoutManager = recyclerView2.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            C39162r.m79460a("exit_interest_selection", C56800a.m102978a("customize_interests_page", "done", jSONArray, a2, aVar, (FlexboxLayoutManager) layoutManager).f79943a);
            if (this.f129356a.f129347b.mo63252c() != 0) {
                i = this.f129356a.f129347b.mo63255f();
            } else {
                i = this.f129356a.f129348c.getInt("update_interest_recommend_group_return_user", this.f129356a.f129348c.getInt("update_interest_recommend_group_new_user", -1));
            }
            JourneyApi journeyApi = C56861h.f129483a;
            C27917g gVar = new C27917g();
            gVar.f65565e = false;
            C27910f b = gVar.mo46682b();
            if (i > 0) {
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            journeyApi.uploadInterest(b.mo46674b(new C56804d(num, a.getFirst(), (int) (a2 / 1000))), "interest_setting_page").mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(C567941.f129357a, C567952.f129358a);
            this.f129356a.finish();
        }
    }

    /* renamed from: a */
    public final long mo93941a() {
        return (System.currentTimeMillis() - this.f129350e) + this.f129349d;
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity$e */
    static final class RunnableC56797e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UpdateInterestActivity f129360a;

        static {
            Covode.recordClassIndex(66663);
        }

        RunnableC56797e(UpdateInterestActivity updateInterestActivity) {
            this.f129360a = updateInterestActivity;
        }

        public final void run() {
            UpdateInterestActivity updateInterestActivity = this.f129360a;
            DmtStatusView dmtStatusView = (DmtStatusView) updateInterestActivity._$_findCachedViewById(R.id.e77);
            C89219l.m154716b(dmtStatusView, "");
            updateInterestActivity.f129346a = dmtStatusView.getWidth();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onResume", true);
        super.onResume();
        this.f129350e = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onResume", false);
    }

    /* renamed from: b */
    public final void mo93942b() {
        AbstractC88979t<C56868o> a;
        String b = C46842do.C46843a.m90157b();
        if (b != null) {
            a = C56861h.f129483a.getJourney(Integer.valueOf(this.f129347b.mo63254e()), "new_user_journey", b);
        } else {
            a = JourneyApi.C56816a.m103078a(C56861h.f129483a, Integer.valueOf(this.f129347b.mo63254e()), "new_user_journey");
        }
        a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C56798f(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        C56969a aVar;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dnz);
        C89219l.m154716b(recyclerView, "");
        FlexboxLayoutManager flexboxLayoutManager = null;
        if (recyclerView.getAdapter() != null) {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView2, "");
            RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            aVar = (C56969a) adapter;
        } else {
            aVar = null;
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.dnz);
        C89219l.m154716b(recyclerView3, "");
        if (recyclerView3.getLayoutManager() != null) {
            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView4, "");
            RecyclerView.AbstractC1362i layoutManager = recyclerView4.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
        }
        C39162r.m79460a("exit_interest_selection", C56800a.m102978a("customize_interests_page", "skip", "", mo93941a(), aVar, flexboxLayoutManager).f79943a);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        this.f129349d += System.currentTimeMillis() - this.f129350e;
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

    /* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity$d */
    public static final class C56796d implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ UpdateInterestActivity f129359a;

        static {
            Covode.recordClassIndex(66662);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56796d(UpdateInterestActivity updateInterestActivity) {
            this.f129359a = updateInterestActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f129359a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity$f */
    public static final class C56798f implements AbstractC88986z<C56868o> {

        /* renamed from: a */
        final /* synthetic */ UpdateInterestActivity f129361a;

        static {
            Covode.recordClassIndex(66664);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56798f(UpdateInterestActivity updateInterestActivity) {
            this.f129361a = updateInterestActivity;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            ((DmtStatusView) this.f129361a._$_findCachedViewById(R.id.e77)).mo27387h();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            ((DmtStatusView) this.f129361a._$_findCachedViewById(R.id.e77)).mo27384f();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C56868o oVar) {
            List list;
            C56868o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            UpdateInterestActivity updateInterestActivity = this.f129361a;
            C57053v vVar = oVar2.f129497a;
            if (vVar == null || (list = vVar.f129910a) == null) {
                list = new LinkedList();
            }
            C89219l.m154721d(list, "");
            DmtStatusView dmtStatusView = (DmtStatusView) updateInterestActivity._$_findCachedViewById(R.id.e77);
            C89219l.m154716b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) updateInterestActivity._$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setLayoutManager(new FlexboxLayoutManager(updateInterestActivity));
            RecyclerView recyclerView2 = (RecyclerView) updateInterestActivity._$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setVisibility(0);
            C56799g gVar = new C56799g(updateInterestActivity);
            RecyclerView recyclerView3 = (RecyclerView) updateInterestActivity._$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView3, "");
            recyclerView3.setAdapter(new C56802c(list, gVar));
            C39162r.m79460a("show_interest_selection", C56800a.m102980a("customize_interests_page", false).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity$a */
    static final class View$OnClickListenerC56789a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UpdateInterestActivity f129352a;

        static {
            Covode.recordClassIndex(66655);
        }

        View$OnClickListenerC56789a(UpdateInterestActivity updateInterestActivity) {
            this.f129352a = updateInterestActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129352a.mo93942b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity$b */
    static final class C56790b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C56790b f129353a = new C56790b();

        static {
            Covode.recordClassIndex(66656);
        }

        C56790b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C567911.f129354a);
            baseActivityViewModel2.config(C567922.f129355a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.UpdateInterestActivity$g */
    static final class C56799g extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UpdateInterestActivity f129362a;

        static {
            Covode.recordClassIndex(66665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56799g(UpdateInterestActivity updateInterestActivity) {
            super(1);
            this.f129362a = updateInterestActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            num.intValue();
            TuxTextView tuxTextView = (TuxTextView) this.f129362a._$_findCachedViewById(R.id.dov);
            C89219l.m154716b(tuxTextView, "");
            RecyclerView recyclerView = (RecyclerView) this.f129362a._$_findCachedViewById(R.id.dnz);
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            C56969a aVar = (C56969a) adapter;
            boolean z = true;
            if (aVar.f129703b.size() == aVar.f129704c.size() && aVar.f129703b.containsAll(aVar.f129704c)) {
                z = false;
            }
            tuxTextView.setEnabled(z);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onCreate", true);
        activityConfiguration(C56790b.f129353a);
        super.onCreate(bundle);
        setContentView(R.layout.ab6);
        C17275e eVar = new C17275e(this);
        eVar.setStatus(C81437h.m141212a(eVar.getContext(), new View$OnClickListenerC56789a(this)));
        DmtStatusView dmtStatusView = (DmtStatusView) _$_findCachedViewById(R.id.e77);
        C89219l.m154716b(dmtStatusView, "");
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(dmtStatusView.getContext()).mo27408c(eVar));
        dmtStatusView.setVisibility(0);
        C17235c.m31810a(_$_findCachedViewById(R.id.dov), 0.5f);
        ((TuxTextView) _$_findCachedViewById(R.id.dov)).setOnClickListener(new View$OnClickListenerC56793c(this));
        ((ButtonTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C56796d(this));
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.dov);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.dnz);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        ((DmtStatusView) _$_findCachedViewById(R.id.e77)).post(new RunnableC56797e(this));
        mo93942b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.interest.UpdateInterestActivity", "onCreate", false);
    }
}

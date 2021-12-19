package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.interest.C56800a;
import com.p2082ss.android.ugc.aweme.interest.C56805e;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56854e;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C56861h;
import com.p2082ss.android.ugc.aweme.journey.C56877r;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.journey.JourneyApi;
import com.p2082ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56836b;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d */
public final class C56975d extends AbstractC34586a {

    /* renamed from: j */
    public static int f129714j = 1;

    /* renamed from: k */
    public static final C56976a f129715k = new C56976a((byte) 0);

    /* renamed from: a */
    public boolean f129716a;

    /* renamed from: b */
    public TextView f129717b;

    /* renamed from: c */
    public RecyclerView f129718c;

    /* renamed from: d */
    public View f129719d;

    /* renamed from: e */
    public AbstractC88412b f129720e;

    /* renamed from: l */
    private boolean f129721l = true;

    /* renamed from: m */
    private C56877r f129722m;

    /* renamed from: n */
    private List<C57054w> f129723n = C89086z.INSTANCE;

    /* renamed from: o */
    private long f129724o = SystemClock.elapsedRealtime();

    /* renamed from: p */
    private long f129725p = SystemClock.elapsedRealtime();

    /* renamed from: q */
    private long f129726q;

    /* renamed from: r */
    private final AbstractC89244h f129727r = C89250i.m154774a(EnumC89331m.NONE, C56993n.f129753a);

    /* renamed from: s */
    private SparseArray f129728s;

    /* renamed from: e */
    private final String m103331e() {
        return (String) this.f129727r.getValue();
    }

    /* renamed from: a */
    public final View mo94157a(int i) {
        if (this.f129728s == null) {
            this.f129728s = new SparseArray();
        }
        View view = (View) this.f129728s.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129728s.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$a */
    public static final class C56976a {
        static {
            Covode.recordClassIndex(66864);
        }

        private C56976a() {
        }

        public /* synthetic */ C56976a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$e */
    static final class View$OnClickListenerC56980e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56975d f129737a;

        static {
            Covode.recordClassIndex(66868);
        }

        View$OnClickListenerC56980e(C56975d dVar) {
            this.f129737a = dVar;
        }

        /* renamed from: a */
        private static boolean m103340a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            MethodCollector.m26663i(4174);
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            view.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m103340a();
            }
            if (!C58029j.f132256h) {
                new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                MethodCollector.m26664o(4174);
                return;
            }
            this.f129737a.f129716a = true;
            C56805e d = this.f129737a.mo94163d();
            JourneyApi.C56816a.m103079a(C56861h.f129483a, d.f129370a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(C569811.f129738a).mo143254a(C569822.f129739a, C569833.f129740a);
            this.f129737a.mo94159a("done", d.f129371b, d.f129372c);
            if (AbstractC56869p.C56870a.m103133a().mo63252c() == 2) {
                if (this.f129737a.getActivity() != null) {
                    ActivityC0945e activity = this.f129737a.getActivity();
                    if (activity != null) {
                        ((NewUserJourneyActivity) activity).mo93991b();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
                        MethodCollector.m26664o(4174);
                        throw nullPointerException;
                    }
                }
                this.f129737a.mo94162c().setVisibility(0);
                this.f129737a.mo94158a().setText("");
                this.f129737a.mo94162c().startAnimation(AnimationUtils.loadAnimation(this.f129737a.mo94158a().getContext(), R.anim.c8));
                C34727m.m70945a(RunnableC569844.f129741a, 1500);
                MethodCollector.m26664o(4174);
                return;
            }
            AbstractC81915c.m141874a(new C56955b(false));
            MethodCollector.m26664o(4174);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$n */
    static final class C56993n extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56993n f129753a = new C56993n();

        static {
            Covode.recordClassIndex(66881);
        }

        C56993n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return AbstractC56869p.C56870a.m103133a().mo63256g();
        }
    }

    /* renamed from: a */
    public final TextView mo94158a() {
        TextView textView = this.f129717b;
        if (textView == null) {
            C89219l.m154710a("doneView");
        }
        return textView;
    }

    /* renamed from: b */
    public final RecyclerView mo94161b() {
        RecyclerView recyclerView = this.f129718c;
        if (recyclerView == null) {
            C89219l.m154710a("infoListView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public final View mo94162c() {
        View view = this.f129719d;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$d */
    static final class RunnableC56979d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56975d f129735a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f129736b;

        static {
            Covode.recordClassIndex(66867);
        }

        RunnableC56979d(C56975d dVar, AbstractC89171a aVar) {
            this.f129735a = dVar;
            this.f129736b = aVar;
        }

        public final void run() {
            if (this.f129735a.af_() && this.f129735a.mo94161b().getAdapter() != null) {
                this.f129736b.invoke();
            }
        }
    }

    static {
        Covode.recordClassIndex(66863);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onDestroyView() {
        View view = this.f129719d;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        view.clearAnimation();
        super.onDestroyView();
        SparseArray sparseArray = this.f129728s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f129720e = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C56988i.f129746a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C56989j(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f129720e = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C56990k(this));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f129724o = elapsedRealtime;
        this.f129725p = elapsedRealtime;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f129726q += SystemClock.elapsedRealtime() - this.f129724o;
        if (!this.f129716a) {
            C56805e d = mo94163d();
            mo94159a("background", d.f129371b, d.f129372c);
        }
        super.onStop();
    }

    /* renamed from: d */
    public final C56805e mo94163d() {
        RecyclerView recyclerView = this.f129718c;
        if (recyclerView == null) {
            C89219l.m154710a("infoListView");
        }
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
        C89378p<List<C57054w>, JSONArray> a = C56800a.m102981a((C56969a) adapter, true);
        String a2 = AbstractC56869p.C56870a.m103133a().mo94052a(a.getFirst(), (int) (((SystemClock.elapsedRealtime() - this.f129724o) + this.f129726q) / 1000));
        String jSONArray = a.getSecond().toString();
        C89219l.m154716b(jSONArray, "");
        return new C56805e(a2, jSONArray, a.getSecond().length());
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$g */
    static final class C56986g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56975d f129743a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f129744b;

        static {
            Covode.recordClassIndex(66874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56986g(C56975d dVar, C89233z.C89236c cVar) {
            super(0);
            this.f129743a = dVar;
            this.f129744b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C89233z.C89236c cVar = this.f129744b;
            RecyclerView b = this.f129743a.mo94161b();
            RecyclerView.AbstractC1350a adapter = this.f129743a.mo94161b().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
            C56969a aVar = (C56969a) adapter;
            RecyclerView.AbstractC1362i layoutManager = this.f129743a.mo94161b().getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
            C89219l.m154721d(b, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(flexboxLayoutManager, "");
            int D = flexboxLayoutManager.mo41233D();
            View g = flexboxLayoutManager.mo4717g(D);
            View g2 = flexboxLayoutManager.mo4717g(0);
            int i = -1;
            if (g != null && g2 != null && D > 0 && (b.mo4393a(g2) instanceof AbstractC56854e)) {
                i = (int) ((((((float) aVar.mo94032a()) * 1.0f) / ((float) D)) * ((float) (g.getBottom() - g2.getBottom()))) + ((float) g2.getHeight()));
            }
            cVar.element = i;
            if (this.f129744b.element > this.f129743a.mo94161b().getHeight()) {
                View a = this.f129743a.mo94157a(R.id.dq6);
                C89219l.m154716b(a, "");
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                TextTitleBar textTitleBar = (TextTitleBar) this.f129743a.mo94157a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                layoutParams.height = ((int) ((((float) this.f129743a.mo94161b().getHeight()) * (((float) this.f129743a.mo94161b().getHeight()) + 0.0f)) / ((float) this.f129744b.element))) - textTitleBar.getHeight();
                View a2 = this.f129743a.mo94157a(R.id.dq6);
                C89219l.m154716b(a2, "");
                View a3 = this.f129743a.mo94157a(R.id.dq6);
                C89219l.m154716b(a3, "");
                a2.setLayoutParams(a3.getLayoutParams());
                View a4 = this.f129743a.mo94157a(R.id.dq6);
                C89219l.m154716b(a4, "");
                a4.setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$m */
    public static final class C56992m extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public int f129751a;

        /* renamed from: b */
        final /* synthetic */ C56975d f129752b;

        static {
            Covode.recordClassIndex(66880);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56992m(C56975d dVar) {
            this.f129752b = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            this.f129751a += i2;
            if (this.f129752b.af_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f129752b.mo94157a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f129752b.mo94157a(R.id.eiz);
                    C89219l.m154716b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f129752b.mo94157a(R.id.eiz);
                    C89219l.m154716b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f129751a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$k */
    static final class C56990k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C56975d f129748a;

        static {
            Covode.recordClassIndex(66878);
        }

        C56990k(C56975d dVar) {
            this.f129748a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((ITpcConsentService) obj).mo68646i();
            AbstractC88412b bVar = this.f129748a.f129720e;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$h */
    static final class C56987h extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56975d f129745a;

        static {
            Covode.recordClassIndex(66875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56987h(C56975d dVar) {
            super(1);
            this.f129745a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 1) {
                this.f129745a.mo94160a(true);
            } else if (intValue == 0) {
                this.f129745a.mo94160a(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$j */
    static final class C56989j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C56975d f129747a;

        static {
            Covode.recordClassIndex(66877);
        }

        C56989j(C56975d dVar) {
            this.f129747a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C56977b bVar = (C56977b) obj;
            if (bVar.f129729a && C17873f.f42636l) {
                bVar.f129730b.mo68645h();
            }
            AbstractC88412b bVar2 = this.f129747a.f129720e;
            if (bVar2 != null) {
                bVar2.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$f */
    static final class View$OnClickListenerC56985f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56975d f129742a;

        static {
            Covode.recordClassIndex(66873);
        }

        View$OnClickListenerC56985f(C56975d dVar) {
            this.f129742a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129742a.f129716a = true;
            C56805e d = this.f129742a.mo94163d();
            this.f129742a.mo94159a("skip", d.f129371b, d.f129372c);
            AbstractC81915c.m141874a(new C56955b(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$l */
    static final class C56991l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C56975d f129749a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f129750b;

        static {
            Covode.recordClassIndex(66879);
        }

        C56991l(C56975d dVar, C89233z.C89238e eVar) {
            this.f129749a = dVar;
            this.f129750b = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            if (iTpcConsentService.mo68637a((AbstractC39273a) null) && this.f129749a.getActivity() != null) {
                ActivityC0945e activity = this.f129749a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.mo68636a(activity, "interest_selection");
            }
            T t = this.f129750b.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo94160a(boolean z) {
        String str;
        TextView textView = this.f129717b;
        if (textView == null) {
            C89219l.m154710a("doneView");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.f129717b;
            if (textView2 == null) {
                C89219l.m154710a("doneView");
            }
            TextView textView3 = this.f129717b;
            if (textView3 == null) {
                C89219l.m154710a("doneView");
            }
            textView2.setTextColor(C0643b.m2378c(textView3.getContext(), R.color.a9));
        } else {
            TextView textView4 = this.f129717b;
            if (textView4 == null) {
                C89219l.m154710a("doneView");
            }
            TextView textView5 = this.f129717b;
            if (textView5 == null) {
                C89219l.m154710a("doneView");
            }
            textView4.setTextColor(C0643b.m2378c(textView5.getContext(), R.color.bz));
        }
        C56877r rVar = this.f129722m;
        if (rVar != null) {
            str = rVar.f129533c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView6 = this.f129717b;
            if (textView6 == null) {
                C89219l.m154710a("doneView");
            }
            C56877r rVar2 = this.f129722m;
            if (rVar2 == null) {
                C89219l.m154715b();
            }
            textView6.setText(rVar2.f129533c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$b */
    public static final class C56977b {

        /* renamed from: a */
        public final boolean f129729a;

        /* renamed from: b */
        public final ITpcConsentService f129730b;

        /* renamed from: c */
        public final WeakReference<Activity> f129731c;

        static {
            Covode.recordClassIndex(66865);
        }

        public C56977b(ITpcConsentService iTpcConsentService, WeakReference<Activity> weakReference) {
            C89219l.m154721d(iTpcConsentService, "");
            C89219l.m154721d(weakReference, "");
            this.f129730b = iTpcConsentService;
            this.f129731c = weakReference;
            this.f129729a = iTpcConsentService.mo68637a((AbstractC39273a) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$i */
    static final class C56988i<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C56988i f129746a = new C56988i();

        static {
            Covode.recordClassIndex(66876);
        }

        C56988i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            C89219l.m154721d(iTpcConsentService, "");
            C89219l.m154721d(obj2, "");
            return new C56977b(iTpcConsentService, new WeakReference(obj2));
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2 = "";
        C89219l.m154721d(view, str2);
        super.onViewCreated(view, bundle);
        ComponentDependencies componentDependencies = (ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class);
        this.f129721l = componentDependencies.mo94085k();
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, str2);
        this.f129722m = componentDependencies.mo94056a(requireContext);
        Context requireContext2 = requireContext();
        C89219l.m154716b(requireContext2, str2);
        C89219l.m154721d(requireContext2, str2);
        List<C57054w> value = componentDependencies.f129539b.getValue();
        if (value == null) {
            value = C56972b.m103326a(requireContext2);
        }
        this.f129723n = value;
        TuxTextView tuxTextView = (TuxTextView) mo94157a(R.id.anm);
        C89219l.m154716b(tuxTextView, str2);
        this.f129717b = tuxTextView;
        RecyclerView recyclerView = (RecyclerView) mo94157a(R.id.dnz);
        C89219l.m154716b(recyclerView, str2);
        this.f129718c = recyclerView;
        ImageView imageView = (ImageView) mo94157a(R.id.cfv);
        C89219l.m154716b(imageView, str2);
        this.f129719d = imageView;
        RecyclerView recyclerView2 = this.f129718c;
        if (recyclerView2 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView2.setItemAnimator(null);
        TextView textView = this.f129717b;
        if (textView == null) {
            C89219l.m154710a("doneView");
        }
        C17235c.m31810a(textView, 0.75f);
        C17235c.m31810a(mo94157a(R.id.e1u), 0.75f);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        eVar.element = (T) AbstractC88403ab.m153602a(C39223a.m79604r()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142930d().mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C56991l(this, eVar));
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = -1;
        C89233z.C89236c cVar2 = new C89233z.C89236c();
        cVar2.element = 0;
        Keva.getRepo("new_user_journey").storeLong("last_show_interest_select_time", System.currentTimeMillis());
        RecyclerView recyclerView3 = this.f129718c;
        if (recyclerView3 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView3.mo4405a(new C56978c(this, cVar2, cVar));
        C56986g gVar = new C56986g(this, cVar);
        RecyclerView recyclerView4 = this.f129718c;
        if (recyclerView4 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView4.post(new RunnableC56979d(this, gVar));
        RecyclerView recyclerView5 = this.f129718c;
        if (recyclerView5 == null) {
            C89219l.m154710a("infoListView");
        }
        RecyclerView recyclerView6 = this.f129718c;
        if (recyclerView6 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView5.setLayoutManager(new FlexboxLayoutManager(recyclerView6.getContext()));
        C56969a aVar = new C56969a(this.f129723n, false, new C56987h(this), this.f129722m);
        RecyclerView recyclerView7 = this.f129718c;
        if (recyclerView7 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView7.setAdapter(aVar);
        C39162r.m79460a("show_interest_selection", C56800a.m102980a("new_user_journey", this.f129721l).mo59983a("user_type", m103331e()).mo59981a("page_show_cost", SystemClock.elapsedRealtime() - this.f129725p).mo59983a("selection_type", "category").f79943a);
        AbstractC17250a aVar2 = (AbstractC17250a) mo94157a(R.id.eiz);
        C56877r rVar = this.f129722m;
        if (!(rVar == null || (str = rVar.f129534d) == null)) {
            str2 = str;
        }
        aVar2.setTitle(str2);
        TextView textView2 = this.f129717b;
        if (textView2 == null) {
            C89219l.m154710a("doneView");
        }
        textView2.setOnClickListener(new View$OnClickListenerC56980e(this));
        ((TuxTextView) mo94157a(R.id.e1u)).setOnClickListener(new View$OnClickListenerC56985f(this));
        mo94160a(false);
        RecyclerView recyclerView8 = this.f129718c;
        if (recyclerView8 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView8.mo4405a(new C56992m(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.d$c */
    public static final class C56978c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C56975d f129732a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f129733b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f129734c;

        static {
            Covode.recordClassIndex(66866);
        }

        C56978c(C56975d dVar, C89233z.C89236c cVar, C89233z.C89236c cVar2) {
            this.f129732a = dVar;
            this.f129733b = cVar;
            this.f129734c = cVar2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            this.f129733b.element += i2;
            if (i2 != 0 && this.f129732a.af_() && this.f129734c.element != -1) {
                int height = this.f129734c.element - this.f129732a.mo94161b().getHeight();
                int height2 = this.f129732a.mo94161b().getHeight();
                View a = this.f129732a.mo94157a(R.id.dq6);
                C89219l.m154716b(a, "");
                int height3 = height2 - a.getHeight();
                View a2 = this.f129732a.mo94157a(R.id.dq6);
                C89219l.m154716b(a2, "");
                float f = ((((float) this.f129733b.element) * 1.0f) / ((float) height)) * ((float) height3);
                TextTitleBar textTitleBar = (TextTitleBar) this.f129732a.mo94157a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                a2.setY(f + ((float) textTitleBar.getHeight()));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ab9, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo94159a(String str, String str2, int i) {
        int i2;
        FlexboxLayoutManager flexboxLayoutManager;
        if (!C56836b.m103086a()) {
            i2 = -1;
        } else {
            i2 = f129714j;
        }
        C56969a aVar = null;
        if (af_()) {
            RecyclerView recyclerView = this.f129718c;
            if (recyclerView == null) {
                C89219l.m154710a("infoListView");
            }
            if (recyclerView.getAdapter() != null) {
                RecyclerView recyclerView2 = this.f129718c;
                if (recyclerView2 == null) {
                    C89219l.m154710a("infoListView");
                }
                RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.InterestAdapter");
                aVar = (C56969a) adapter;
                RecyclerView recyclerView3 = this.f129718c;
                if (recyclerView3 == null) {
                    C89219l.m154710a("infoListView");
                }
                RecyclerView.AbstractC1362i layoutManager = recyclerView3.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayoutManager");
                flexboxLayoutManager = (FlexboxLayoutManager) layoutManager;
                C39162r.m79460a("exit_interest_selection", C56800a.m102978a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.f129725p, aVar, flexboxLayoutManager).mo59983a("user_type", m103331e()).mo59980a("select_interest_cnt", i).mo59980a("icon_fully_loaded", i2).f79943a);
            }
        }
        flexboxLayoutManager = null;
        C39162r.m79460a("exit_interest_selection", C56800a.m102978a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.f129725p, aVar, flexboxLayoutManager).mo59983a("user_type", m103331e()).mo59980a("select_interest_cnt", i).mo59980a("icon_fully_loaded", i2).f79943a);
    }
}

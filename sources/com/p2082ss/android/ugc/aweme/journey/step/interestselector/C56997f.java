package com.p2082ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.experiment.C46998gw;
import com.p2082ss.android.ugc.aweme.interest.C56800a;
import com.p2082ss.android.ugc.aweme.interest.C56805e;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C56849ai;
import com.p2082ss.android.ugc.aweme.journey.C56861h;
import com.p2082ss.android.ugc.aweme.journey.C56877r;
import com.p2082ss.android.ugc.aweme.journey.C57054w;
import com.p2082ss.android.ugc.aweme.journey.JourneyApi;
import com.p2082ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4571c.AbstractCallableC88474g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88695ay;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88712bf;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
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
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f */
public final class C56997f extends AbstractC34586a {

    /* renamed from: c */
    public static final LinkedHashSet<String> f129757c = new LinkedHashSet<>();

    /* renamed from: d */
    public static int f129758d = 1;

    /* renamed from: e */
    public static LinearLayoutManager f129759e;

    /* renamed from: j */
    public static int f129760j;

    /* renamed from: k */
    public static Map<Integer, Integer> f129761k = new LinkedHashMap();

    /* renamed from: l */
    public static final C56998a f129762l = new C56998a((byte) 0);

    /* renamed from: A */
    private SparseArray f129763A;

    /* renamed from: a */
    public boolean f129764a;

    /* renamed from: b */
    public TextView f129765b;

    /* renamed from: m */
    private boolean f129766m = true;

    /* renamed from: n */
    private C56877r f129767n;

    /* renamed from: o */
    private List<C56849ai> f129768o = C89086z.INSTANCE;

    /* renamed from: p */
    private long f129769p = SystemClock.elapsedRealtime();

    /* renamed from: q */
    private long f129770q = SystemClock.elapsedRealtime();

    /* renamed from: r */
    private long f129771r;

    /* renamed from: s */
    private TextView f129772s;

    /* renamed from: t */
    private TextView f129773t;

    /* renamed from: u */
    private TextView f129774u;

    /* renamed from: v */
    private TextView f129775v;

    /* renamed from: w */
    private TextView f129776w;

    /* renamed from: y */
    private RecyclerView f129777y;

    /* renamed from: z */
    private final AbstractC89244h f129778z = C89250i.m154774a(EnumC89331m.NONE, C57009i.f129792a);

    /* renamed from: b */
    private final String m103348b() {
        return (String) this.f129778z.getValue();
    }

    /* renamed from: a */
    public final View mo94168a(int i) {
        if (this.f129763A == null) {
            this.f129763A = new SparseArray();
        }
        View view = (View) this.f129763A.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129763A.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$a */
    public static final class C56998a {
        static {
            Covode.recordClassIndex(66886);
        }

        private C56998a() {
        }

        public /* synthetic */ C56998a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$c */
    static final class View$OnClickListenerC57000c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56997f f129781a;

        static {
            Covode.recordClassIndex(66888);
        }

        View$OnClickListenerC57000c(C56997f fVar) {
            this.f129781a = fVar;
        }

        /* renamed from: a */
        private static boolean m103353a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            view.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m103353a();
            }
            if (!C58029j.f132256h) {
                new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            this.f129781a.f129764a = true;
            C56805e a = this.f129781a.mo94169a();
            JourneyApi.C56816a.m103079a(C56861h.f129483a, a.f129370a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(C570011.f129782a, C570022.f129783a);
            this.f129781a.mo94170a("done", a.f129371b, a.f129372c);
            if (AbstractC56869p.C56870a.m103133a().mo63252c() == 2) {
                if (this.f129781a.getActivity() != null) {
                    ActivityC0945e activity = this.f129781a.getActivity();
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
                    ((NewUserJourneyActivity) activity).mo93991b();
                }
                TextView textView = this.f129781a.f129765b;
                if (textView == null) {
                    C89219l.m154710a("finalNext");
                }
                textView.setText("");
                C34727m.m70945a(RunnableC570033.f129784a, 1500);
                return;
            }
            AbstractC81915c.m141874a(new C56955b(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$i */
    static final class C57009i extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C57009i f129792a = new C57009i();

        static {
            Covode.recordClassIndex(66897);
        }

        C57009i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return AbstractC56869p.C56870a.m103133a().mo63256g();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f129763A;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f129769p = elapsedRealtime;
        this.f129770q = elapsedRealtime;
    }

    static {
        Covode.recordClassIndex(66885);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f129771r += SystemClock.elapsedRealtime() - this.f129769p;
        if (!this.f129764a) {
            C56805e a = mo94169a();
            mo94170a("background", a.f129371b, a.f129372c);
        }
        super.onStop();
    }

    /* renamed from: a */
    public final C56805e mo94169a() {
        RecyclerView recyclerView = this.f129777y;
        if (recyclerView == null) {
            C89219l.m154710a("infoListView");
        }
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter");
        C89378p<List<C57054w>, JSONArray> a = C56800a.m102982a((C57010g) adapter);
        String b = AbstractC56869p.C56870a.m103133a().mo94054b(a.getFirst(), (int) (((SystemClock.elapsedRealtime() - this.f129769p) + this.f129771r) / 1000));
        String jSONArray = a.getSecond().toString();
        C89219l.m154716b(jSONArray, "");
        return new C56805e(b, jSONArray, a.getSecond().length());
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$h */
    public static final class C57008h extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public int f129790a;

        /* renamed from: b */
        final /* synthetic */ C56997f f129791b;

        static {
            Covode.recordClassIndex(66896);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57008h(C56997f fVar) {
            this.f129791b = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            int i2;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            int i3 = C56997f.f129760j;
            LinearLayoutManager linearLayoutManager = C56997f.f129759e;
            if (linearLayoutManager == null) {
                C89219l.m154710a("outerLayoutManager");
            }
            C56997f.f129760j = Math.max(i3, linearLayoutManager.mo4373m() - 1);
            Map<Integer, Integer> map = C56997f.f129761k;
            Integer valueOf = Integer.valueOf(C56997f.f129760j);
            Integer num = C56997f.f129761k.get(Integer.valueOf(C56997f.f129760j));
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            map.put(valueOf, Integer.valueOf(Math.max(i2, 4)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            this.f129790a += i2;
            if (this.f129791b.af_()) {
                TextTitleBar textTitleBar = (TextTitleBar) this.f129791b.mo94168a(R.id.eiz);
                C89219l.m154716b(textTitleBar, "");
                if (textTitleBar.getHeight() > 0) {
                    TextTitleBar textTitleBar2 = (TextTitleBar) this.f129791b.mo94168a(R.id.eiz);
                    C89219l.m154716b(textTitleBar2, "");
                    TextTitleBar textTitleBar3 = (TextTitleBar) this.f129791b.mo94168a(R.id.eiz);
                    C89219l.m154716b(textTitleBar3, "");
                    textTitleBar2.setAlpha((((float) this.f129790a) * 1.0f) / ((float) textTitleBar3.getHeight()));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$b */
    public static final class C56999b {

        /* renamed from: a */
        public final boolean f129779a;

        /* renamed from: b */
        public final ITpcConsentService f129780b;

        static {
            Covode.recordClassIndex(66887);
        }

        public C56999b(ITpcConsentService iTpcConsentService) {
            C89219l.m154721d(iTpcConsentService, "");
            this.f129780b = iTpcConsentService;
            this.f129779a = iTpcConsentService.mo68637a((AbstractC39273a) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$e */
    static final class C57005e extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56997f f129786a;

        static {
            Covode.recordClassIndex(66893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57005e(C56997f fVar) {
            super(1);
            this.f129786a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue == 1) {
                this.f129786a.mo94171a(true);
            } else if (intValue == 0) {
                this.f129786a.mo94171a(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$f */
    static final class C57006f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C57006f f129787a = new C57006f();

        static {
            Covode.recordClassIndex(66894);
        }

        C57006f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            C89219l.m154721d(iTpcConsentService, "");
            return AbstractC88979t.m154310b(new C56999b(iTpcConsentService));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$d */
    static final class View$OnClickListenerC57004d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56997f f129785a;

        static {
            Covode.recordClassIndex(66892);
        }

        View$OnClickListenerC57004d(C56997f fVar) {
            this.f129785a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129785a.f129764a = true;
            C56805e a = this.f129785a.mo94169a();
            this.f129785a.mo94170a("skip", a.f129371b, a.f129372c);
            AbstractC81915c.m141874a(new C56955b(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.interestselector.f$g */
    static final class C57007g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C56997f f129788a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f129789b;

        static {
            Covode.recordClassIndex(66895);
        }

        C57007g(C56997f fVar, C89233z.C89238e eVar) {
            this.f129788a = fVar;
            this.f129789b = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C56999b bVar = (C56999b) obj;
            if (bVar.f129779a && this.f129788a.getActivity() != null) {
                ITpcConsentService iTpcConsentService = bVar.f129780b;
                ActivityC0945e activity = this.f129788a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.mo68636a(activity, "interest_selection");
            }
            T t = this.f129789b.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo94171a(boolean z) {
        String str;
        TextView textView = this.f129765b;
        if (textView == null) {
            C89219l.m154710a("finalNext");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.f129765b;
            if (textView2 == null) {
                C89219l.m154710a("finalNext");
            }
            TextView textView3 = this.f129765b;
            if (textView3 == null) {
                C89219l.m154710a("finalNext");
            }
            textView2.setTextColor(C0643b.m2378c(textView3.getContext(), R.color.a9));
        } else {
            TextView textView4 = this.f129765b;
            if (textView4 == null) {
                C89219l.m154710a("finalNext");
            }
            TextView textView5 = this.f129765b;
            if (textView5 == null) {
                C89219l.m154710a("finalNext");
            }
            textView4.setTextColor(C0643b.m2378c(textView5.getContext(), R.color.bz));
        }
        C56877r rVar = this.f129767n;
        if (rVar != null) {
            str = rVar.f129533c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView6 = this.f129765b;
            if (textView6 == null) {
                C89219l.m154710a("finalNext");
            }
            C56877r rVar2 = this.f129767n;
            if (rVar2 == null) {
                C89219l.m154715b();
            }
            textView6.setText(rVar2.f129533c);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC88979t a;
        String str;
        String str2 = "";
        C89219l.m154721d(view, str2);
        super.onViewCreated(view, bundle);
        ComponentDependencies componentDependencies = (ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class);
        this.f129766m = componentDependencies.mo94085k();
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, str2);
        this.f129767n = componentDependencies.mo94056a(requireContext);
        ActivityC0945e requireActivity = requireActivity();
        C89219l.m154716b(requireActivity, str2);
        C89219l.m154721d(requireActivity, str2);
        List<C56849ai> value = componentDependencies.f129540c.getValue();
        if (value == null) {
            value = C57014h.m103360a(requireActivity);
        }
        this.f129768o = value;
        TuxTextView tuxTextView = (TuxTextView) mo94168a(R.id.em0);
        C89219l.m154716b(tuxTextView, str2);
        this.f129772s = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) mo94168a(R.id.vd);
        C89219l.m154716b(tuxTextView2, str2);
        this.f129773t = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) mo94168a(R.id.dkf);
        C89219l.m154716b(tuxTextView3, str2);
        this.f129774u = tuxTextView3;
        TuxTextView tuxTextView4 = (TuxTextView) mo94168a(R.id.a32);
        C89219l.m154716b(tuxTextView4, str2);
        this.f129775v = tuxTextView4;
        RecyclerView recyclerView = (RecyclerView) mo94168a(R.id.dnz);
        C89219l.m154716b(recyclerView, str2);
        this.f129777y = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView.setItemAnimator(null);
        int size = this.f129768o.size();
        for (int i = 0; i < size; i++) {
            f129761k.put(Integer.valueOf(i), -1);
        }
        TextView textView = this.f129774u;
        if (textView == null) {
            C89219l.m154710a("rightNext");
        }
        this.f129765b = textView;
        TextView textView2 = this.f129773t;
        if (textView2 == null) {
            C89219l.m154710a("bottomSkip");
        }
        this.f129776w = textView2;
        if (C46998gw.m90276b()) {
            TextView textView3 = this.f129773t;
            if (textView3 == null) {
                C89219l.m154710a("bottomSkip");
            }
            textView3.setVisibility(8);
            TextView textView4 = this.f129774u;
            if (textView4 == null) {
                C89219l.m154710a("rightNext");
            }
            textView4.setVisibility(8);
            TextView textView5 = this.f129775v;
            if (textView5 == null) {
                C89219l.m154710a("centerNext");
            }
            textView5.setVisibility(0);
            TextView textView6 = this.f129772s;
            if (textView6 == null) {
                C89219l.m154710a("topSkip");
            }
            textView6.setVisibility(0);
            TextView textView7 = this.f129772s;
            if (textView7 == null) {
                C89219l.m154710a("topSkip");
            }
            this.f129776w = textView7;
            TextView textView8 = this.f129775v;
            if (textView8 == null) {
                C89219l.m154710a("centerNext");
            }
            this.f129765b = textView8;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        AbstractC88979t d = AbstractC88403ab.m153602a(C39223a.m79604r()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142930d();
        C57006f fVar = C57006f.f129787a;
        int i2 = AbstractC88924h.f201932a;
        C88466b.m153697a((Object) fVar, "mapper is null");
        C88466b.m153696a(i2, "bufferSize");
        if (d instanceof AbstractCallableC88474g) {
            Object call = ((AbstractCallableC88474g) d).call();
            if (call == null) {
                a = C88925a.m154171a(C88790v.f201616a);
            } else {
                a = C88695ay.m153918a(call, fVar);
            }
        } else {
            a = C88925a.m154171a(new C88712bf(d, fVar, i2));
        }
        eVar.element = (T) a.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C57007g(this, eVar));
        Keva.getRepo("new_user_journey").storeLong("last_show_interest_select_time", System.currentTimeMillis());
        RecyclerView recyclerView2 = this.f129777y;
        if (recyclerView2 == null) {
            C89219l.m154710a("infoListView");
        }
        RecyclerView recyclerView3 = this.f129777y;
        if (recyclerView3 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView3.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        C57005e eVar2 = new C57005e(this);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView4 = this.f129777y;
        if (recyclerView4 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView4.setLayoutManager(linearLayoutManager);
        f129759e = linearLayoutManager;
        RecyclerView recyclerView5 = this.f129777y;
        if (recyclerView5 == null) {
            C89219l.m154710a("infoListView");
        }
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, str2);
        recyclerView5.mo4402a(new C57016i(C89241a.m154730a(TypedValue.applyDimension(1, 38.0f, system.getDisplayMetrics()))));
        RecyclerView recyclerView6 = this.f129777y;
        if (recyclerView6 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView6.setItemViewCacheSize(this.f129768o.size());
        C57010g gVar = new C57010g(this.f129768o, eVar2, this.f129767n, linearLayoutManager);
        RecyclerView recyclerView7 = this.f129777y;
        if (recyclerView7 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView7.setAdapter(gVar);
        C39162r.m79460a("show_interest_selection", C56800a.m102980a("new_user_journey", this.f129766m).mo59983a("user_type", m103348b()).mo59981a("page_show_cost", SystemClock.elapsedRealtime() - this.f129770q).mo59983a("selection_type", "topic").f79943a);
        if (C46998gw.m90275a()) {
            AbstractC17250a aVar = (AbstractC17250a) mo94168a(R.id.eiz);
            C56877r rVar = this.f129767n;
            if (!(rVar == null || (str = rVar.f129534d) == null)) {
                str2 = str;
            }
            aVar.setTitle(str2);
        }
        TextView textView9 = this.f129765b;
        if (textView9 == null) {
            C89219l.m154710a("finalNext");
        }
        textView9.setOnClickListener(new View$OnClickListenerC57000c(this));
        TextView textView10 = this.f129776w;
        if (textView10 == null) {
            C89219l.m154710a("finalSkip");
        }
        textView10.setOnClickListener(new View$OnClickListenerC57004d(this));
        mo94171a(false);
        RecyclerView recyclerView8 = this.f129777y;
        if (recyclerView8 == null) {
            C89219l.m154710a("infoListView");
        }
        recyclerView8.mo4405a(new C57008h(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ab_, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo94170a(String str, String str2, int i) {
        C57010g gVar;
        if (af_()) {
            RecyclerView recyclerView = this.f129777y;
            if (recyclerView == null) {
                C89219l.m154710a("infoListView");
            }
            if (recyclerView.getAdapter() != null) {
                RecyclerView recyclerView2 = this.f129777y;
                if (recyclerView2 == null) {
                    C89219l.m154710a("infoListView");
                }
                RecyclerView.AbstractC1350a adapter = recyclerView2.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter");
                gVar = (C57010g) adapter;
                C39162r.m79460a("exit_interest_selection", C56800a.m102979a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.f129770q, gVar).mo59983a("user_type", m103348b()).mo59980a("select_interest_cnt", i).mo59980a("icon_fully_loaded", f129758d).f79943a);
            }
        }
        gVar = null;
        C39162r.m79460a("exit_interest_selection", C56800a.m102979a("new_user_journey", str, str2, SystemClock.elapsedRealtime() - this.f129770q, gVar).mo59983a("user_type", m103348b()).mo59980a("select_interest_cnt", i).mo59980a("icon_fully_loaded", f129758d).f79943a);
    }
}

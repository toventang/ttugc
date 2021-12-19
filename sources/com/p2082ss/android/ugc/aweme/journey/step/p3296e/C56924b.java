package com.p2082ss.android.ugc.aweme.journey.step.p3296e;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.journey.C56833a;
import com.p2082ss.android.ugc.aweme.journey.C56843ac;
import com.p2082ss.android.ugc.aweme.journey.C56861h;
import com.p2082ss.android.ugc.aweme.journey.C56867n;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.interestselector.C56975d;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.journey.step.e.b */
public final class C56924b extends AbstractC56880a {

    /* renamed from: k */
    public final String f129636k = "done";

    /* renamed from: l */
    public final String f129637l = "male";

    /* renamed from: m */
    public final String f129638m = "female";

    /* renamed from: n */
    public final String f129639n = "non-binary";

    /* renamed from: o */
    public final String f129640o = "error_saving_gender";

    /* renamed from: p */
    public AbstractC88412b f129641p;

    /* renamed from: q */
    public String f129642q;

    /* renamed from: r */
    public int f129643r = 1;

    /* renamed from: s */
    private final String f129644s = "show_gender_selection";

    /* renamed from: t */
    private final String f129645t = "exit_gender_selection";

    /* renamed from: u */
    private final String f129646u = "gender";

    /* renamed from: v */
    private final String f129647v = "exit_method";

    /* renamed from: w */
    private final String f129648w = "option_list";

    /* renamed from: y */
    private final String f129649y = "is_binary";

    /* renamed from: z */
    private SparseArray f129650z;

    static {
        Covode.recordClassIndex(66811);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    /* renamed from: a */
    public final View mo94100a(int i) {
        if (this.f129650z == null) {
            this.f129650z = new SparseArray();
        }
        View view = (View) this.f129650z.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129650z.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    /* renamed from: c */
    public final void mo94104c() {
        SparseArray sparseArray = this.f129650z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo94104c();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$c */
    static final class View$OnClickListenerC56927c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56924b f129654a;

        static {
            Covode.recordClassIndex(66814);
        }

        View$OnClickListenerC56927c(C56924b bVar) {
            this.f129654a = bVar;
        }

        /* renamed from: a */
        private static boolean m103250a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            Integer num;
            String str;
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            view.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m103250a();
            }
            if (!C58029j.f132256h) {
                new C79459a(view.getContext()).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            this.f129654a.f129570j = true;
            RecyclerView.AbstractC1350a adapter = this.f129654a.mo94103b().getAdapter();
            if (!(adapter instanceof C56921a)) {
                adapter = null;
            }
            C56921a aVar = (C56921a) adapter;
            if (!(aVar == null || (num = aVar.f129625b) == null)) {
                C56861h.f129483a.uploadGender(num.intValue()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.journey.step.p3296e.C56924b.View$OnClickListenerC56927c.C569281 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC56927c f129655a;

                    static {
                        Covode.recordClassIndex(66815);
                    }

                    {
                        this.f129655a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C39162r.m79460a(this.f129655a.f129654a.f129640o, new C33744d().f79943a);
                    }
                }).mo143254a(C569292.f129656a, C569303.f129657a);
                if (num.intValue() == 1) {
                    str = this.f129654a.f129637l;
                } else if (num.intValue() == 2) {
                    str = this.f129654a.f129638m;
                } else {
                    str = this.f129654a.f129639n;
                }
                C56924b bVar = this.f129654a;
                bVar.mo94127a(bVar.f129636k, str);
            }
            AbstractC81915c.m141874a(new C56955b(false));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC88412b bVar = this.f129641p;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    public final void onStop() {
        this.f129569e = new C56935h(this);
        super.onStop();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f129641p = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C56932e.f129659a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C56933f(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    public final void onResume() {
        super.onResume();
        this.f129641p = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C56934g(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$a */
    static final class C56925a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56867n f129651a;

        /* renamed from: b */
        final /* synthetic */ C56924b f129652b;

        static {
            Covode.recordClassIndex(66812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56925a(C56867n nVar, C56924b bVar) {
            super(1);
            this.f129651a = nVar;
            this.f129652b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            boolean z;
            C56924b bVar = this.f129652b;
            if (num != null) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo94102a(z);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$g */
    static final class C56934g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C56924b f129661a;

        static {
            Covode.recordClassIndex(66821);
        }

        C56934g(C56924b bVar) {
            this.f129661a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((ITpcConsentService) obj).mo68646i();
            AbstractC88412b bVar = this.f129661a.f129641p;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$h */
    static final class C56935h extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56924b f129662a;

        static {
            Covode.recordClassIndex(66822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56935h(C56924b bVar) {
            super(1);
            this.f129662a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f129662a.mo94127a((C56924b) "background", "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$b */
    static final class C56926b extends AbstractC89220m implements AbstractC89172b<C56843ac, CharSequence> {

        /* renamed from: a */
        public static final C56926b f129653a = new C56926b();

        static {
            Covode.recordClassIndex(66813);
        }

        C56926b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(C56843ac acVar) {
            String valueOf;
            C56843ac acVar2 = acVar;
            C89219l.m154721d(acVar2, "");
            Integer num = acVar2.f129437a;
            if (num == null || (valueOf = String.valueOf(num.intValue())) == null) {
                return "";
            }
            return valueOf;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$d */
    static final class View$OnClickListenerC56931d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56924b f129658a;

        static {
            Covode.recordClassIndex(66818);
        }

        View$OnClickListenerC56931d(C56924b bVar) {
            this.f129658a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129658a.f129570j = true;
            this.f129658a.mo94127a((C56924b) "skip", "");
            AbstractC81915c.m141874a(new C56955b(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$f */
    static final class C56933f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C56924b f129660a;

        static {
            Covode.recordClassIndex(66820);
        }

        C56933f(C56924b bVar) {
            this.f129660a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C56975d.C56977b bVar = (C56975d.C56977b) obj;
            if (bVar.f129729a && C17873f.f42636l) {
                bVar.f129730b.mo68645h();
            }
            AbstractC88412b bVar2 = this.f129660a.f129641p;
            if (bVar2 != null) {
                bVar2.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$i */
    static final class C56936i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C56924b f129663a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f129664b;

        static {
            Covode.recordClassIndex(66823);
        }

        C56936i(C56924b bVar, C89233z.C89238e eVar) {
            this.f129663a = bVar;
            this.f129664b = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            if (iTpcConsentService.mo68637a((AbstractC39273a) null) && this.f129663a.getActivity() != null) {
                ActivityC0945e activity = this.f129663a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                iTpcConsentService.mo68636a(activity, "gender_selection");
            }
            T t = this.f129664b.element;
            if (t != null) {
                t.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.e.b$e */
    static final class C56932e<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C56932e f129659a = new C56932e();

        static {
            Covode.recordClassIndex(66819);
        }

        C56932e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            C89219l.m154721d(iTpcConsentService, "");
            C89219l.m154721d(obj2, "");
            return new C56975d.C56977b(iTpcConsentService, new WeakReference(obj2));
        }
    }

    /* renamed from: a */
    public final void mo94127a(String str, String str2) {
        C33744d a = new C33744d().mo59983a(this.f129647v, str).mo59981a("stay_time", System.currentTimeMillis() - this.f129568d);
        Integer a2 = HybridABInfoService.m69246b().mo60084a();
        if (a2 != null) {
            a.mo59980a("is_ab_backend_resp_received", a2.intValue());
        }
        if (!C89219l.m154714a((Object) str, (Object) "background")) {
            a.mo59983a(this.f129646u, str2);
        }
        C39162r.m79460a(this.f129645t, a.f79943a);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C56833a aVar;
        List<C56843ac> list;
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView b = mo94103b();
        mo94103b().getContext();
        b.setLayoutManager(new LinearLayoutManager());
        C56867n nVar = ((ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class)).f129545h;
        if (!(nVar == null || (aVar = nVar.f129496d) == null || (list = aVar.f129423b) == null)) {
            this.f129642q = C89070n.m154551a(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C56926b.f129653a, 31);
            if (list.size() <= 2) {
                i = 1;
            } else {
                i = 0;
            }
            this.f129643r = i;
            mo94103b().setAdapter(new C56921a(list, nVar.f129493a, nVar.f129494b, new C56925a(nVar, this)));
        }
        mo94101a().setOnClickListener(new View$OnClickListenerC56927c(this));
        ((TuxTextView) mo94100a(R.id.e1u)).setOnClickListener(new View$OnClickListenerC56931d(this));
        C39162r.m79460a(this.f129644s, new C33744d().mo59983a("enter_from", "new_user_journey").mo59983a(this.f129648w, this.f129642q).mo59980a(this.f129649y, this.f129643r).f79943a);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        eVar.element = (T) AbstractC88403ab.m153602a(C39223a.m79604r()).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142930d().mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C56936i(this, eVar));
    }
}

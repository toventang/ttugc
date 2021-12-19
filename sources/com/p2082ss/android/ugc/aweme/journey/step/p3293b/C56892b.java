package com.p2082ss.android.ugc.aweme.journey.step.p3293b;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.C40313cq;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.b.b */
public final class C56892b extends AbstractC56880a {

    /* renamed from: k */
    private SparseArray f129591k;

    static {
        Covode.recordClassIndex(66779);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    /* renamed from: a */
    public final View mo94100a(int i) {
        if (this.f129591k == null) {
            this.f129591k = new SparseArray();
        }
        View view = (View) this.f129591k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129591k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    /* renamed from: c */
    public final void mo94104c() {
        SparseArray sparseArray = this.f129591k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo94104c();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a
    public final void onStop() {
        this.f129569e = new C56896d(this);
        super.onStop();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.b$c */
    static final class C56895c extends AbstractC89220m implements AbstractC89172b<AbstractC58069b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56892b f129594a;

        static {
            Covode.recordClassIndex(66782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56895c(C56892b bVar) {
            super(1);
            this.f129594a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC58069b bVar) {
            boolean z;
            C56892b bVar2 = this.f129594a;
            if (bVar != null) {
                z = true;
            } else {
                z = false;
            }
            bVar2.mo94102a(z);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.b$d */
    static final class C56896d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56892b f129595a;

        static {
            Covode.recordClassIndex(66783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56896d(C56892b bVar) {
            super(1);
            this.f129595a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f129595a.mo94113a(true, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.b$b */
    static final class View$OnClickListenerC56894b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56892b f129593a;

        static {
            Covode.recordClassIndex(66781);
        }

        View$OnClickListenerC56894b(C56892b bVar) {
            this.f129593a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129593a.f129570j = true;
            this.f129593a.mo94113a(false, "cancel");
            AbstractC81915c.m141874a(new C56955b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.b.b$a */
    static final class View$OnClickListenerC56893a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56892b f129592a;

        static {
            Covode.recordClassIndex(66780);
        }

        View$OnClickListenerC56893a(C56892b bVar) {
            this.f129592a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129592a.f129570j = true;
            RecyclerView.AbstractC1350a adapter = this.f129592a.mo94103b().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.step.applanguage.ChooseAppLanguageAdapter");
            AbstractC58069b bVar = ((C56889a) adapter).f129583b;
            if (bVar == null) {
                C89219l.m154715b();
            }
            C56892b bVar2 = this.f129592a;
            String f = bVar.mo90022f();
            C89219l.m154716b(f, "");
            bVar2.mo94113a(false, f);
            ComponentDependencies componentDependencies = (ComponentDependencies) C1181ae.m3881a(this.f129592a.requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class);
            componentDependencies.mo94063a(bVar);
            componentDependencies.mo94098x().invoke();
        }
    }

    /* renamed from: a */
    public final void mo94113a(boolean z, String str) {
        if (!z) {
            C39162r.m79460a("choose_language_popup", new C33744d().mo59983a("enter_from", "new_user_journey").mo59983a("language_type", str).mo59981a("duration", System.currentTimeMillis() - this.f129568d).f79943a);
        }
        C33744d a = new C33744d().mo59983a("enter_from", "new_user_journey").mo59981a("duration", System.currentTimeMillis() - this.f129568d);
        Integer a2 = HybridABInfoService.m69246b().mo60084a();
        if (a2 != null) {
            a.mo59980a("is_ab_backend_resp_received", a2.intValue());
        }
        C39162r.m79460a("language_popup_duration", a.f79943a);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.journey.step.AbstractC56880a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView b = mo94103b();
        mo94103b().getContext();
        b.setLayoutManager(new LinearLayoutManager());
        String[] strArr = {"ms-MY", "zh-Hant-TW", "en"};
        ArrayList arrayList = new ArrayList();
        Map<String, AbstractC58069b> j = SettingServiceImpl.m120782v().mo108874j();
        int i = 0;
        do {
            AbstractC58069b bVar = j.get(strArr[i]);
            if (bVar == null) {
                C89219l.m154715b();
            }
            arrayList.add(bVar);
            i++;
        } while (i < 3);
        C56895c cVar = new C56895c(this);
        String string = getString(R.string.dd_);
        C89219l.m154716b(string, "");
        C56889a aVar = new C56889a(arrayList, cVar, string);
        mo94103b().setAdapter(aVar);
        AbstractC17250a aVar2 = (AbstractC17250a) mo94100a(R.id.eiz);
        String str2 = aVar.f129482a;
        if (str2 == null) {
            str2 = "";
        }
        aVar2.setTitle(str2);
        mo94101a().setOnClickListener(new View$OnClickListenerC56893a(this));
        ((TuxTextView) mo94100a(R.id.e1u)).setOnClickListener(new View$OnClickListenerC56894b(this));
        C40313cq cqVar = C40313cq.f94478a;
        Context context = mo94103b().getContext();
        C89219l.m154716b(context, "");
        cqVar.mo60091a(context, true);
        C33744d a = new C33744d().mo59983a("enter_from", "new_user_journey");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            str = "1";
        } else {
            str = "0";
        }
        C39162r.m79460a("show_language_popup", a.mo59983a("is_login", str).f79943a);
    }
}

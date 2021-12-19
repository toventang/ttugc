package com.p2082ss.android.ugc.aweme.journey.step.p3292a;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.p2082ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceSettingsServiceImpl;
import com.p2082ss.android.ugc.aweme.journey.C56845ae;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57048b;
import com.p2082ss.android.ugc.aweme.journey.p3300ui.C57049c;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.a.c */
public final class View$OnClickListenerC56885c extends AbstractC34586a implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final AbstractC89244h f129578a = C89250i.m154773a((AbstractC89171a) C56886a.f129580a);

    /* renamed from: b */
    private SparseArray f129579b;

    static {
        Covode.recordClassIndex(66772);
    }

    /* renamed from: a */
    public final View mo94107a(int i) {
        if (this.f129579b == null) {
            this.f129579b = new SparseArray();
        }
        View view = (View) this.f129579b.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129579b.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.a.c$a */
    static final class C56886a extends AbstractC89220m implements AbstractC89171a<IComplianceSettingsService> {

        /* renamed from: a */
        public static final C56886a f129580a = new C56886a();

        static {
            Covode.recordClassIndex(66773);
        }

        C56886a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IComplianceSettingsService invoke() {
            return ComplianceSettingsServiceImpl.m80477b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.a.c$b */
    static final class View$OnClickListenerC56887b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC56885c f129581a;

        static {
            Covode.recordClassIndex(66774);
        }

        View$OnClickListenerC56887b(View$OnClickListenerC56885c cVar) {
            this.f129581a = cVar;
        }

        /* renamed from: a */
        private static boolean m103199a() {
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
                C58029j.f132256h = m103199a();
            }
            if (!C58029j.f132256h) {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.dcq).mo123053a();
            }
            AbstractC81915c.m141874a(new C56955b(false));
            TuxRadio tuxRadio = (TuxRadio) this.f129581a.mo94107a(R.id.d13);
            C89219l.m154716b(tuxRadio, "");
            ((IComplianceSettingsService) this.f129581a.f129578a.getValue()).mo68696a(tuxRadio.isChecked() ? 1 : 0);
            C33744d dVar = new C33744d();
            TuxRadio tuxRadio2 = (TuxRadio) this.f129581a.mo94107a(R.id.d13);
            C89219l.m154716b(tuxRadio2, "");
            C39162r.m79460a("pa_1p_prompt_click", dVar.mo59980a("click_position", tuxRadio2.isChecked() ? 1 : 0).f79943a);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f129579b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: a */
    private static void m103197a(View view) {
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C57049c cVar = new C57049c(view.getResources().getColor(R.color.l), C57048b.m103398a(context));
        Context context2 = view.getContext();
        C89219l.m154716b(context2, "");
        cVar.mo94209a(context2.getResources().getColor(R.color.b6));
        view.setBackground(cVar);
        view.setLayerType(1, null);
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        TuxButton tuxButton = (TuxButton) mo94107a(R.id.cs_);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setEnabled(true);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.d12) {
                TuxRadio tuxRadio = (TuxRadio) mo94107a(R.id.d13);
                C89219l.m154716b(tuxRadio, "");
                tuxRadio.setChecked(true);
            } else if (valueOf.intValue() == R.id.b9u) {
                TuxRadio tuxRadio2 = (TuxRadio) mo94107a(R.id.b9v);
                C89219l.m154716b(tuxRadio2, "");
                tuxRadio2.setChecked(true);
            }
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Integer valueOf;
        if (z) {
            TuxButton tuxButton = (TuxButton) mo94107a(R.id.cs_);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setEnabled(true);
            if (compoundButton != null && (valueOf = Integer.valueOf(compoundButton.getId())) != null) {
                if (valueOf.intValue() == R.id.d13) {
                    TuxRadio tuxRadio = (TuxRadio) mo94107a(R.id.b9v);
                    C89219l.m154716b(tuxRadio, "");
                    tuxRadio.setChecked(false);
                } else if (valueOf.intValue() == R.id.b9v) {
                    TuxRadio tuxRadio2 = (TuxRadio) mo94107a(R.id.d13);
                    C89219l.m154716b(tuxRadio2, "");
                    tuxRadio2.setChecked(false);
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) mo94107a(R.id.d12);
        C89219l.m154716b(relativeLayout, "");
        m103197a(relativeLayout);
        RelativeLayout relativeLayout2 = (RelativeLayout) mo94107a(R.id.b9u);
        C89219l.m154716b(relativeLayout2, "");
        m103197a(relativeLayout2);
        C56845ae aeVar = ((ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class)).f129544g;
        TuxTextView tuxTextView = (TuxTextView) mo94107a(R.id.cyr);
        C89219l.m154716b(tuxTextView, "");
        if (aeVar == null || (string = aeVar.f129442b) == null || string.length() <= 0) {
            string = getString(R.string.exk);
        }
        tuxTextView.setText(string);
        TuxTextView tuxTextView2 = (TuxTextView) mo94107a(R.id.d14);
        C89219l.m154716b(tuxTextView2, "");
        if (aeVar == null || (string2 = aeVar.f129443c) == null || string2.length() <= 0) {
            string2 = getString(R.string.exf);
        }
        tuxTextView2.setText(string2);
        TuxTextView tuxTextView3 = (TuxTextView) mo94107a(R.id.d11);
        C89219l.m154716b(tuxTextView3, "");
        if (aeVar == null || (string3 = aeVar.f129444d) == null || string3.length() <= 0) {
            string3 = getString(R.string.exg);
        }
        tuxTextView3.setText(string3);
        TuxTextView tuxTextView4 = (TuxTextView) mo94107a(R.id.b9w);
        C89219l.m154716b(tuxTextView4, "");
        if (aeVar == null || (string4 = aeVar.f129445e) == null || string4.length() <= 0) {
            string4 = getString(R.string.exh);
        }
        tuxTextView4.setText(string4);
        TuxTextView tuxTextView5 = (TuxTextView) mo94107a(R.id.b9t);
        C89219l.m154716b(tuxTextView5, "");
        if (aeVar == null || (string5 = aeVar.f129446f) == null || string5.length() <= 0) {
            string5 = getString(R.string.exi);
        }
        tuxTextView5.setText(string5);
        TuxTextView tuxTextView6 = (TuxTextView) mo94107a(R.id.b7o);
        C89219l.m154716b(tuxTextView6, "");
        if (aeVar == null || (string6 = aeVar.f129447g) == null || string6.length() <= 0) {
            string6 = getString(R.string.exj);
        }
        tuxTextView6.setText(string6);
        ((RelativeLayout) mo94107a(R.id.d12)).setOnClickListener(this);
        ((RelativeLayout) mo94107a(R.id.b9u)).setOnClickListener(this);
        ((TuxRadio) mo94107a(R.id.d13)).setOnCheckedChangeListener(this);
        ((TuxRadio) mo94107a(R.id.b9v)).setOnCheckedChangeListener(this);
        ((TuxButton) mo94107a(R.id.cs_)).setOnClickListener(new View$OnClickListenerC56887b(this));
        C39162r.m79460a("pa_1p_prompt_v1_show", new C33744d().f79943a);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ab7, viewGroup, false);
    }
}

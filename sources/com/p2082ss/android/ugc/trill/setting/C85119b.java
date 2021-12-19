package com.p2082ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.C85151k;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.b */
public final class C85119b extends AbstractC34586a {

    /* renamed from: a */
    public C85151k.AbstractC85152a f190461a;

    /* renamed from: b */
    private final AbstractC89244h f190462b = C89250i.m154773a((AbstractC89171a) new C85120a(this));

    /* renamed from: c */
    private SparseArray f190463c;

    static {
        Covode.recordClassIndex(99158);
    }

    /* renamed from: a */
    public final View mo130060a(int i) {
        if (this.f190463c == null) {
            this.f190463c = new SparseArray();
        }
        View view = (View) this.f190463c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f190463c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f190463c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.b$a */
    static final class C85120a extends AbstractC89220m implements AbstractC89171a<ContentPreferenceViewModel> {

        /* renamed from: a */
        final /* synthetic */ C85119b f190464a;

        static {
            Covode.recordClassIndex(99159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C85120a(C85119b bVar) {
            super(0);
            this.f190464a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ContentPreferenceViewModel invoke() {
            ActivityC0945e activity = this.f190464a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            return C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ContentPreferenceViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.b$b */
    public static final class C85121b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C85119b f190465a;

        static {
            Covode.recordClassIndex(99160);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C85121b(C85119b bVar) {
            this.f190465a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C85151k.AbstractC85152a aVar = this.f190465a.f190461a;
            if (aVar != null) {
                aVar.mo130042d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.b$c */
    static final class View$OnClickListenerC85122c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85119b f190466a;

        static {
            Covode.recordClassIndex(99161);
        }

        View$OnClickListenerC85122c(C85119b bVar) {
            this.f190466a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C85151k.AbstractC85152a aVar = this.f190466a.f190461a;
            if (aVar != null) {
                aVar.mo130041c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.b$d */
    static final class View$OnClickListenerC85123d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85119b f190467a;

        static {
            Covode.recordClassIndex(99162);
        }

        View$OnClickListenerC85123d(C85119b bVar) {
            this.f190467a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C85151k.AbstractC85152a aVar = this.f190467a.f190461a;
            if (aVar != null) {
                aVar.mo130043e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.b$e */
    static final class View$OnClickListenerC85124e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85119b f190468a;

        static {
            Covode.recordClassIndex(99163);
        }

        View$OnClickListenerC85124e(C85119b bVar) {
            this.f190468a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C85151k.AbstractC85152a aVar = this.f190468a.f190461a;
            if (aVar != null) {
                aVar.mo130040b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.b$f */
    static final class C85125f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C85119b f190469a;

        static {
            Covode.recordClassIndex(99164);
        }

        C85125f(C85119b bVar) {
            this.f190469a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 1) {
                    ((CommonItemView) this.f190469a.mo130060a(R.id.d3p)).setRightText(this.f190469a.getString(R.string.fkc));
                } else if (num.intValue() == 2) {
                    ((CommonItemView) this.f190469a.mo130060a(R.id.d3p)).setRightText(this.f190469a.getString(R.string.fkf));
                } else if (num.intValue() == 3) {
                    ((CommonItemView) this.f190469a.mo130060a(R.id.d3p)).setRightText(this.f190469a.getString(R.string.bv_));
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((ButtonTitleBar) mo130060a(R.id.eiz)).setOnTitleBarClickListener(new C85121b(this));
        ((CommonItemView) mo130060a(R.id.fcy)).setOnClickListener(new View$OnClickListenerC85122c(this));
        if (C57058z.f129923a.mo57267a(false)) {
            CommonItemView commonItemView = (CommonItemView) mo130060a(R.id.f9t);
            C89219l.m154716b(commonItemView, "");
            commonItemView.setVisibility(0);
            ((CommonItemView) mo130060a(R.id.f9t)).setOnClickListener(new View$OnClickListenerC85123d(this));
        } else {
            CommonItemView commonItemView2 = (CommonItemView) mo130060a(R.id.f9t);
            C89219l.m154716b(commonItemView2, "");
            commonItemView2.setVisibility(8);
        }
        if (C39223a.m79591e().mo68725a() && !C39223a.m79601o().mo68703a()) {
            CommonItemView commonItemView3 = (CommonItemView) mo130060a(R.id.d3p);
            C89219l.m154716b(commonItemView3, "");
            commonItemView3.setVisibility(0);
            ((CommonItemView) mo130060a(R.id.d3p)).setOnClickListener(new View$OnClickListenerC85124e(this));
            ((ContentPreferenceViewModel) this.f190462b.getValue()).mo69432b().observe(this, new C85125f(this));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0r, viewGroup, false);
    }
}

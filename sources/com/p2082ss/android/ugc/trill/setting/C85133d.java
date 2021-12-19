package com.p2082ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.ChooseOneOfMultiItemView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.d */
public final class C85133d extends AbstractC34586a {

    /* renamed from: a */
    private final AbstractC89244h f190484a = C89250i.m154773a((AbstractC89171a) new C85139f(this));

    /* renamed from: b */
    private SparseArray f190485b;

    static {
        Covode.recordClassIndex(99173);
    }

    /* renamed from: a */
    public final View mo130067a(int i) {
        if (this.f190485b == null) {
            this.f190485b = new SparseArray();
        }
        View view = (View) this.f190485b.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f190485b.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ContentPreferenceViewModel mo130068a() {
        return (ContentPreferenceViewModel) this.f190484a.getValue();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f190485b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.d$f */
    static final class C85139f extends AbstractC89220m implements AbstractC89171a<ContentPreferenceViewModel> {

        /* renamed from: a */
        final /* synthetic */ C85133d f190491a;

        static {
            Covode.recordClassIndex(99179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C85139f(C85133d dVar) {
            super(0);
            this.f190491a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ContentPreferenceViewModel invoke() {
            ActivityC0945e activity = this.f190491a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            return C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ContentPreferenceViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onDetach() {
        Integer valueOf;
        super.onDetach();
        C1213t<Integer> b = mo130068a().mo69432b();
        if (C39223a.m79591e().mo68729d() == 0) {
            valueOf = C39223a.m79591e().mo68732g();
        } else {
            valueOf = Integer.valueOf(C39223a.m79591e().mo68729d());
        }
        b.setValue(valueOf);
    }

    /* renamed from: com.ss.android.ugc.trill.setting.d$a */
    static final class View$OnClickListenerC85134a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85133d f190486a;

        static {
            Covode.recordClassIndex(99174);
        }

        View$OnClickListenerC85134a(C85133d dVar) {
            this.f190486a = dVar;
        }

        public final void onClick(View view) {
            AbstractC0952i supportFragmentManager;
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f190486a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.mo3562c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.d$c */
    static final class View$OnClickListenerC85136c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85133d f190488a;

        static {
            Covode.recordClassIndex(99176);
        }

        View$OnClickListenerC85136c(C85133d dVar) {
            this.f190488a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f190488a.mo130068a().mo69429a(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.d$d */
    static final class View$OnClickListenerC85137d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85133d f190489a;

        static {
            Covode.recordClassIndex(99177);
        }

        View$OnClickListenerC85137d(C85133d dVar) {
            this.f190489a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f190489a.mo130068a().mo69429a(2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.d$e */
    static final class View$OnClickListenerC85138e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C85133d f190490a;

        static {
            Covode.recordClassIndex(99178);
        }

        View$OnClickListenerC85138e(C85133d dVar) {
            this.f190490a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f190490a.mo130068a().mo69429a(3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.d$b */
    static final class C85135b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C85133d f190487a;

        static {
            Covode.recordClassIndex(99175);
        }

        C85135b(C85133d dVar) {
            this.f190487a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num.intValue() == 1) {
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.ie)).setSelect(true);
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.cwz)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.cx0)).setSelect(false);
                } else if (num.intValue() == 2) {
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.ie)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.cwz)).setSelect(true);
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.cx0)).setSelect(false);
                } else if (num.intValue() == 3) {
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.ie)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.cwz)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f190487a.mo130067a(R.id.cx0)).setSelect(true);
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C89219l.m154721d(view, "");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.fkb);
        ((ImageView) view.findViewById(R.id.pi)).setOnClickListener(new View$OnClickListenerC85134a(this));
        mo130068a().mo69432b().observe(this, new C85135b(this));
        ((ChooseOneOfMultiItemView) mo130067a(R.id.ie)).setOnClickListener(new View$OnClickListenerC85136c(this));
        ((ChooseOneOfMultiItemView) mo130067a(R.id.cwz)).setOnClickListener(new View$OnClickListenerC85137d(this));
        ((ChooseOneOfMultiItemView) mo130067a(R.id.cx0)).setOnClickListener(new View$OnClickListenerC85138e(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a1t, viewGroup, false);
    }
}

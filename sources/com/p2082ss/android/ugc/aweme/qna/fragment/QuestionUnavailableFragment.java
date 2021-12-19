package com.p2082ss.android.ugc.aweme.qna.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.qna.fragment.QuestionUnavailableFragment */
public class QuestionUnavailableFragment extends C17372a {

    /* renamed from: e */
    private SparseArray f148808e;

    static {
        Covode.recordClassIndex(77601);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f148808e == null) {
            this.f148808e = new SparseArray();
        }
        View view = (View) this.f148808e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f148808e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f148808e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QuestionUnavailableFragment$a */
    static final class View$OnClickListenerC66094a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuestionUnavailableFragment f148809a;

        static {
            Covode.recordClassIndex(77602);
        }

        View$OnClickListenerC66094a(QuestionUnavailableFragment questionUnavailableFragment) {
            this.f148809a = questionUnavailableFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f148809a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QuestionUnavailableFragment$c */
    static final class C66096c extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C66096c f148811a = new C66096c();

        static {
            Covode.recordClassIndex(77604);
        }

        C66096c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C660971.f148812a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C66096c.f148811a);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QuestionUnavailableFragment$b */
    static final class C66095b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C66095b f148810a = new C66095b();

        static {
            Covode.recordClassIndex(77603);
        }

        C66095b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_error_qa;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxIconView) mo27715a(R.id.dbp)).setOnClickListener(new View$OnClickListenerC66094a(this));
        TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C66095b.f148810a));
        String string = requireContext().getString(R.string.f2e);
        C89219l.m154716b(string, "");
        TuxStatusView.C23263c a2 = a.mo37878a((CharSequence) string);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 69.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        ((TuxStatusView) mo27715a(R.id.ddg)).setStatus(a2.mo37880b(a3, C89241a.m154730a(TypedValue.applyDimension(1, 69.0f, system2.getDisplayMetrics()))));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aql, viewGroup, false);
    }
}

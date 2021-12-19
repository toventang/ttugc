package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2667b.p2668a.C39633a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d */
public abstract class AbstractC39716d extends AbstractC39712a {

    /* renamed from: a */
    private SparseArray f93568a;

    static {
        Covode.recordClassIndex(47443);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: a */
    public View mo69087a(int i) {
        if (this.f93568a == null) {
            this.f93568a = new SparseArray();
        }
        View view = (View) this.f93568a.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f93568a.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    /* renamed from: b */
    public void mo69089b() {
        SparseArray sparseArray = this.f93568a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<AbstractC39713b> mo69099c();

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39712a
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69089b();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d$a */
    static final class C39717a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC39716d f93569a;

        static {
            Covode.recordClassIndex(47444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39717a(AbstractC39716d dVar) {
            super(0);
            this.f93569a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93569a.mo69088a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69098b(int i) {
        String string = getString(i);
        C89219l.m154716b(string, "");
        C89219l.m154721d(string, "");
        ((TuxNavBar) mo69087a(R.id.ejf)).mo37725a(new C23194g().mo37753a(string));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69097a(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) mo69087a(R.id.em4);
        if (tuxTextView == null) {
            return;
        }
        if (charSequence == null || charSequence.length() == 0) {
            tuxTextView.setVisibility(8);
            return;
        }
        tuxTextView.setVisibility(0);
        tuxTextView.setText(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxNavBar) mo69087a(R.id.ejf)).mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C39717a(this)));
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) mo69087a(R.id.c_1);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo69087a(R.id.c_1);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        List<AbstractC39713b> c = mo69099c();
        RecyclerView recyclerView3 = (RecyclerView) mo69087a(R.id.c_1);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setAdapter(new C39633a(c));
    }
}

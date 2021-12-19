package com.p2082ss.android.ugc.aweme.favorites.p2923e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.powerpage.AbstractC17736b;
import com.bytedance.ies.powerpage.AbstractC17738c;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.e.a */
public abstract class AbstractC47421a extends C17372a implements AbstractC17736b {

    /* renamed from: e */
    private View f110150e;

    /* renamed from: f */
    private SparseArray f110151f;

    static {
        Covode.recordClassIndex(56034);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public View mo27715a(int i) {
        if (this.f110151f == null) {
            this.f110151f = new SparseArray();
        }
        View view = (View) this.f110151f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f110151f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public void bx_() {
        SparseArray sparseArray = this.f110151f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: e */
    public abstract int mo79700e();

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onNewIntent(Intent intent) {
    }

    /* renamed from: g */
    public boolean mo79702g() {
        mo79701f();
        return true;
    }

    /* renamed from: f */
    public final void mo79701f() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onBackPressed_Activity() {
        if (!mo79702g()) {
            AbstractC17738c.m32872a(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.e.a$a */
    static final class C47422a extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C47422a f110152a = new C47422a();

        static {
            Covode.recordClassIndex(56035);
        }

        C47422a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C474231.f110153a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.e.a$b */
    static final class C47424b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C47424b f110154a = new C47424b();

        static {
            Covode.recordClassIndex(56037);
        }

        C47424b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C474251.f110155a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C47422a.f110152a);
        mo27717b(C47424b.f110154a);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        C89219l.m154721d(context, "");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onActivityResult_Activity(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, mo79700e(), viewGroup, false);
        C89219l.m154716b(a, "");
        this.f110150e = a;
        if (a == null) {
            C89219l.m154710a("viewContainer");
        }
        return a;
    }
}

package com.bytedance.ies.foundation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17370e;
import java.lang.ref.WeakReference;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.foundation.fragment.a */
public class C17372a extends Fragment implements AbstractC17370e {

    /* renamed from: b */
    public static Class<? extends BaseFragmentViewModel> f41689b = BaseFragmentViewModel.class;

    /* renamed from: c */
    public static final C17375b f41690c = new C17375b();

    /* renamed from: d */
    public static final C17373a f41691d = new C17373a((byte) 0);

    /* renamed from: a */
    public boolean f41692a;

    /* renamed from: e */
    private final AbstractC89244h f41693e = C89250i.m154773a((AbstractC89171a) new C17374b(this));

    /* renamed from: f */
    private WeakReference<C17372a> f41694f;

    /* renamed from: g */
    private SparseArray f41695g;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final BaseFragmentViewModel provideBaseViewModel() {
        return (BaseFragmentViewModel) this.f41693e.getValue();
    }

    /* renamed from: a */
    public View mo27715a(int i) {
        if (this.f41695g == null) {
            this.f41695g = new SparseArray();
        }
        View view = (View) this.f41695g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f41695g.put(i, findViewById);
        return findViewById;
    }

    public void bx_() {
        SparseArray sparseArray = this.f41695g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.a$a */
    public static final class C17373a {
        static {
            Covode.recordClassIndex(19860);
        }

        private C17373a() {
        }

        public /* synthetic */ C17373a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.a$b */
    static final class C17374b extends AbstractC89220m implements AbstractC89171a<BaseFragmentViewModel> {

        /* renamed from: a */
        final /* synthetic */ C17372a f41696a;

        static {
            Covode.recordClassIndex(19861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17374b(C17372a aVar) {
            super(0);
            this.f41696a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BaseFragmentViewModel invoke() {
            return this.f41696a.bo_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f41692a = false;
    }

    public final BaseFragmentViewModel bo_() {
        return (BaseFragmentViewModel) C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(f41689b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f41692a = false;
        bx_();
    }

    static {
        Covode.recordClassIndex(19859);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41692a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27716a(AbstractC89172b<? super BaseFragmentViewModel, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        bVar.invoke(bo_());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27717b(AbstractC89172b<? super BaseActivityViewModel, C89391z> bVar) {
        BaseActivityViewModel viewModel;
        C89219l.m154721d(bVar, "");
        ActivityC0945e activity = getActivity();
        if (!(activity instanceof ActivityC17312a)) {
            activity = null;
        }
        ActivityC17312a aVar = (ActivityC17312a) activity;
        if (aVar != null && (viewModel = aVar.getViewModel()) != null) {
            bVar.invoke(viewModel);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        AbstractC0952i supportFragmentManager;
        C89219l.m154721d(context, "");
        super.onAttach(context);
        this.f41694f = new WeakReference<>(this);
        BaseFragmentViewModel c = provideBaseViewModel();
        if (!c.initialized) {
            c.init();
        }
        ActivityC0945e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && getParentFragment() == null) {
            supportFragmentManager.mo3555a((AbstractC0952i.AbstractC0954b) f41690c, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f41692a = true;
    }
}

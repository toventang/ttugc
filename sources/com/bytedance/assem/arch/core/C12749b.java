package com.bytedance.assem.arch.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.p025c.C0498h;
import com.bytedance.assem.arch.extensions.C12790l;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.core.b */
public final class C12749b extends Fragment {

    /* renamed from: d */
    public static final C12750a f31004d = new C12750a((byte) 0);

    /* renamed from: a */
    public final C0498h<AbstractC89187q<Integer, Integer, Intent, C89391z>> f31005a = new C0498h<>();

    /* renamed from: b */
    public final C0498h<AbstractC89172b<int[], C89391z>> f31006b = new C0498h<>();

    /* renamed from: c */
    public final Set<AbstractC89171a<C89391z>> f31007c = new LinkedHashSet();

    /* renamed from: e */
    private HashMap f31008e;

    static {
        Covode.recordClassIndex(14573);
    }

    /* renamed from: com.bytedance.assem.arch.core.b$a */
    public static final class C12750a {
        static {
            Covode.recordClassIndex(14574);
        }

        private C12750a() {
        }

        public /* synthetic */ C12750a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f31008e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<T> it = this.f31007c.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.f31007c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC89187q<Integer, Integer, Intent, C89391z> a = this.f31005a.mo2183a(i, null);
        if (a != null) {
            a.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
            this.f31005a.mo2185b(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        super.onRequestPermissionsResult(i, strArr, iArr);
        AbstractC89172b<int[], C89391z> a = this.f31006b.mo2183a(i, null);
        if (a != null) {
            a.invoke(iArr);
            this.f31006b.mo2185b(i);
        }
    }

    /* renamed from: a */
    public final void mo20600a(AbstractC1204m mVar, Intent intent, int i, Bundle bundle, AbstractC89187q<? super Integer, ? super Integer, ? super Intent, C89391z> qVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(intent, "");
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            ActivityC0945e requireActivity = requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            if (C12790l.m23013a(requireActivity, mVar)) {
                if (i < 0) {
                    startActivity(intent);
                    return;
                }
                this.f31005a.mo2186b(i, qVar);
                startActivityForResult(intent, i, bundle);
                mVar.getLifecycle().mo4012a(new AssemContainerBridge$startActivityForResult$1(this, mVar, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("This method must be called on main thread".toString());
    }
}

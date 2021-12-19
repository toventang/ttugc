package androidx.lifecycle;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1223y;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: androidx.lifecycle.ab */
public final class C1171ab {

    /* renamed from: a */
    public static final WeakHashMap<C1175ad, AbstractC1223y> f3960a = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(1278);
    }

    /* renamed from: androidx.lifecycle.ab$a */
    static final class C1172a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C1175ad f3961a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f3962b;

        static {
            Covode.recordClassIndex(1279);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C1171ab.f3960a.put(this.f3961a, new AbstractC1223y.C1224a(AbstractC1223y.EnumC1226c.Activity, new WeakReference(this.f3962b)));
            this.f3962b.getLifecycle().mo4012a(new VScopeOwnerKt$putActivityProvider$1$1(this));
            return C89391z.f203057a;
        }
    }

    /* renamed from: androidx.lifecycle.ab$b */
    static final class C1173b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C1175ad f3963a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3964b;

        static {
            Covode.recordClassIndex(1280);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C1171ab.f3960a.put(this.f3963a, new AbstractC1223y.C1225b(AbstractC1223y.EnumC1226c.Fragment, new WeakReference(this.f3964b)));
            this.f3964b.getLifecycle().mo4012a(new VScopeOwnerKt$putFragmentProvider$$inlined$let$lambda$1$1(this));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m3870a(AbstractC1174ac acVar, C1175ad adVar) {
        C89219l.m154719c(acVar, "");
        C89219l.m154719c(adVar, "");
        acVar.setTagIfAbsent("v_scope_vm_key", adVar);
    }
}

package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1171ab;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class VScopeOwnerKt$putFragmentProvider$$inlined$let$lambda$1$1 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ C1171ab.C1173b f3949a;

    static {
        Covode.recordClassIndex(1272);
    }

    VScopeOwnerKt$putFragmentProvider$$inlined$let$lambda$1$1(C1171ab.C1173b bVar) {
        this.f3949a = bVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            C1171ab.f3960a.remove(this.f3949a.f3963a);
        }
    }
}

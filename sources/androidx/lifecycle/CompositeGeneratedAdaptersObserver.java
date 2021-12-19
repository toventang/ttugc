package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements AbstractC1202k {

    /* renamed from: a */
    private final AbstractC1191e[] f3924a;

    static {
        Covode.recordClassIndex(1256);
    }

    CompositeGeneratedAdaptersObserver(AbstractC1191e[] eVarArr) {
        this.f3924a = eVarArr;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C1212s sVar = new C1212s();
        for (AbstractC1191e eVar : this.f3924a) {
            eVar.mo4008a(mVar, aVar, false, sVar);
        }
        for (AbstractC1191e eVar2 : this.f3924a) {
            eVar2.mo4008a(mVar, aVar, true, sVar);
        }
    }
}

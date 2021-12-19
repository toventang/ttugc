package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class SingleGeneratedAdapterObserver implements AbstractC1202k {

    /* renamed from: a */
    private final AbstractC1191e f3948a;

    static {
        Covode.recordClassIndex(1270);
    }

    SingleGeneratedAdapterObserver(AbstractC1191e eVar) {
        this.f3948a = eVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        this.f3948a.mo4008a(mVar, aVar, false, null);
        this.f3948a.mo4008a(mVar, aVar, true, null);
    }
}

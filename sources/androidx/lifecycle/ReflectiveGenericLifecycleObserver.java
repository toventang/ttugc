package androidx.lifecycle;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1166a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements AbstractC1202k {

    /* renamed from: a */
    private final Object f3937a;

    /* renamed from: b */
    private final C1166a.C1167a f3938b;

    static {
        Covode.recordClassIndex(1266);
    }

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3937a = obj;
        this.f3938b = C1166a.f3951a.mo3986b(obj.getClass());
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C1166a.C1167a aVar2 = this.f3938b;
        Object obj = this.f3937a;
        C1166a.C1167a.m3868a(aVar2.f3954a.get(aVar), mVar, aVar, obj);
        C1166a.C1167a.m3868a(aVar2.f3954a.get(AbstractC1196i.EnumC1198a.ON_ANY), mVar, aVar, obj);
    }
}

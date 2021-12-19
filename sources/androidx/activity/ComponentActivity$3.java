package androidx.activity;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;

class ComponentActivity$3 implements AbstractC1202k {

    /* renamed from: a */
    final /* synthetic */ ActivityC0192b f491a;

    static {
        Covode.recordClassIndex(215);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY && !this.f491a.isChangingConfigurations()) {
            this.f491a.getViewModelStore().mo3997a();
        }
    }
}

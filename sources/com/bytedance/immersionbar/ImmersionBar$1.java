package com.bytedance.immersionbar;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
public class ImmersionBar$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C20057e f47651a;

    static {
        Covode.recordClassIndex(23557);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            handleDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void handleDestroy() {
        C20057e eVar = this.f47651a;
        Iterator<Map.Entry<String, C20057e>> it = C20057e.f47680a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C20057e> next = it.next();
            if (next.getKey().contains(eVar.f47683c) || next.getKey().equals(eVar.f47683c)) {
                it.remove();
            }
        }
        eVar.f47684d = false;
    }

    ImmersionBar$1(C20057e eVar) {
        this.f47651a = eVar;
    }
}

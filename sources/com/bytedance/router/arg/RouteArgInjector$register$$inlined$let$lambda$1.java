package com.bytedance.router.arg;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;

public final class RouteArgInjector$register$$inlined$let$lambda$1 implements AbstractC33974au {
    final /* synthetic */ AbstractC89171a $onInjected$inlined;
    final /* synthetic */ AbstractC1204m $owner$inlined;

    static {
        Covode.recordClassIndex(25874);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        ConcurrentHashMap access$getMap$p = RouteArgInjector.access$getMap$p(RouteArgInjector.INSTANCE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : access$getMap$p.entrySet()) {
            if (((WeakReference) entry.getKey()).get() == this.$owner$inlined) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ConcurrentHashMap access$getMap$p2 = RouteArgInjector.access$getMap$p(RouteArgInjector.INSTANCE);
        C89070n.m154538b((Collection) access$getMap$p2.keySet(), (Iterable) linkedHashMap.keySet());
    }

    RouteArgInjector$register$$inlined$let$lambda$1(AbstractC1204m mVar, AbstractC89171a aVar) {
        this.$owner$inlined = mVar;
        this.$onInjected$inlined = aVar;
    }
}

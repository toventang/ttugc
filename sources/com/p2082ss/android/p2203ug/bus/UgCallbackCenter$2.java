package com.p2082ss.android.p2203ug.bus;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2203ug.bus.C30981c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ug.bus.UgCallbackCenter$2 */
public class UgCallbackCenter$2 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ ConcurrentHashMap f74252a;

    /* renamed from: b */
    final /* synthetic */ C30981c.AbstractC30984a f74253b;

    /* renamed from: c */
    final /* synthetic */ Type f74254c;

    static {
        Covode.recordClassIndex(37599);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        this.f74252a.remove(this.f74253b);
        if (this.f74252a.isEmpty()) {
            C30981c.f74262a.remove(this.f74254c);
        }
    }

    UgCallbackCenter$2(ConcurrentHashMap concurrentHashMap, C30981c.AbstractC30984a aVar, Type type) {
        this.f74252a = concurrentHashMap;
        this.f74253b = aVar;
        this.f74254c = type;
    }
}

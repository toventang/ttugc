package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C2242h;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1949h.AbstractC25755a;
import com.google.android.gms.internal.p1949h.C25756b;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.ab */
final class CallableC2222ab implements Callable<Void> {

    /* renamed from: a */
    private final /* synthetic */ C2244i f6662a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC2246j f6663b;

    /* renamed from: c */
    private final /* synthetic */ C2237e f6664c;

    static {
        Covode.recordClassIndex(2427);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        int i;
        String str;
        C2237e eVar = this.f6664c;
        C2244i iVar = this.f6662a;
        AbstractC2246j jVar = this.f6663b;
        String str2 = iVar.f6736a;
        try {
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                "Consuming purchase with token: ".concat(valueOf);
            } else {
                new String("Consuming purchase with token: ");
            }
            if (eVar.f6702j) {
                AbstractC25755a aVar = eVar.f6697e;
                String packageName = eVar.f6696d.getPackageName();
                boolean z = eVar.f6702j;
                String str3 = eVar.f6694b;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str3);
                }
                Bundle c = aVar.mo41994c(packageName, str2, bundle);
                i = c.getInt("RESPONSE_CODE");
                str = C25756b.m49718b(c);
            } else {
                i = eVar.f6697e.mo41985a(eVar.f6696d.getPackageName(), str2);
                str = "";
            }
            C2242h.C2243a a = C2242h.m6864a();
            a.f6734a = i;
            a.f6735b = str;
            C2242h a2 = a.mo6211a();
            if (i == 0) {
                eVar.mo6200a(new RunnableC2230aj(jVar, a2, str2));
                return null;
            }
            eVar.mo6200a(new RunnableC2229ai(i, jVar, a2, str2));
            return null;
        } catch (Exception e) {
            eVar.mo6200a(new RunnableC2231ak(e, jVar, str2));
            return null;
        }
    }

    CallableC2222ab(C2237e eVar, C2244i iVar, AbstractC2246j jVar) {
        this.f6664c = eVar;
        this.f6662a = iVar;
        this.f6663b = jVar;
    }
}

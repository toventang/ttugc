package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1949h.AbstractC25755a;
import com.google.android.gms.internal.p1949h.C25756b;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.ac */
public final class CallableC2223ac implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ AbstractC2234c f6665a;

    /* renamed from: b */
    private final /* synthetic */ C2232b f6666b;

    /* renamed from: c */
    private final /* synthetic */ C2237e f6667c;

    static {
        Covode.recordClassIndex(2428);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        try {
            AbstractC25755a aVar = this.f6667c.f6697e;
            String packageName = this.f6667c.f6696d.getPackageName();
            String str = this.f6666b.f6688a;
            String str2 = this.f6667c.f6694b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str2);
            Bundle d = aVar.mo41995d(packageName, str, bundle);
            this.f6667c.mo6200a(new RunnableC2224ad(this, C25756b.m49713a(d), C25756b.m49718b(d)));
            return null;
        } catch (Exception e) {
            this.f6667c.mo6200a(new RunnableC2225ae(this, e));
            return null;
        }
    }

    CallableC2223ac(C2237e eVar, C2232b bVar, AbstractC2234c cVar) {
        this.f6667c = eVar;
        this.f6666b = bVar;
        this.f6665a = cVar;
    }
}

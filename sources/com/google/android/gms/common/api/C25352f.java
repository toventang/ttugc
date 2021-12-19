package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.internal.C25390b;
import com.google.android.gms.common.internal.C25565r;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.api.f */
public final class C25352f extends Exception {

    /* renamed from: a */
    private final C0484a<C25390b<?>, ConnectionResult> f60117a;

    static {
        Covode.recordClassIndex(30749);
    }

    public final C0484a<C25390b<?>, ConnectionResult> zaj() {
        return this.f60117a;
    }

    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C25390b<?> bVar : this.f60117a.keySet()) {
            ConnectionResult connectionResult = this.f60117a.get(bVar);
            if (connectionResult.mo41434b()) {
                z = false;
            }
            String str = bVar.f60260b.f60112b;
            String valueOf = String.valueOf(connectionResult);
            arrayList.add(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length()).append(str).append(": ").append(valueOf).toString());
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    public C25352f(C0484a<C25390b<?>, ConnectionResult> aVar) {
        this.f60117a = aVar;
    }

    public final ConnectionResult getConnectionResult(C25354h<? extends C25335a.AbstractC25339d> hVar) {
        boolean z;
        C25390b<O> bVar = hVar.f60121d;
        if (this.f60117a.get(bVar) != null) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49325b(z, "The given API was not part of the availability request.");
        return this.f60117a.get(bVar);
    }

    public final ConnectionResult getConnectionResult(AbstractC25477j<? extends C25335a.AbstractC25339d> jVar) {
        boolean z;
        C25390b<? extends C25335a.AbstractC25339d> c = jVar.mo41513c();
        if (this.f60117a.get(c) != null) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49325b(z, "The given API was not part of the availability request.");
        return this.f60117a.get(c);
    }
}

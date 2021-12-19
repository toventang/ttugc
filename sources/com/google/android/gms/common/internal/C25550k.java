package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C25335a;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C25550k {

    /* renamed from: a */
    public final SparseIntArray f60630a;

    /* renamed from: b */
    private C25497c f60631b;

    static {
        Covode.recordClassIndex(30953);
    }

    public C25550k() {
        this(GoogleApiAvailability.getInstance());
    }

    public C25550k(C25497c cVar) {
        this.f60630a = new SparseIntArray();
        C25565r.m49314a(cVar);
        this.f60631b = cVar;
    }

    /* renamed from: a */
    public final int mo41823a(Context context, C25335a.AbstractC25343f fVar) {
        int isGooglePlayServicesAvailable;
        C25565r.m49314a(context);
        C25565r.m49314a(fVar);
        int e = fVar.mo41416e();
        int i = this.f60630a.get(e, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f60630a.size()) {
                isGooglePlayServicesAvailable = this.f60631b.isGooglePlayServicesAvailable(context, e);
                break;
            }
            int keyAt = this.f60630a.keyAt(i2);
            if (keyAt > e && this.f60630a.get(keyAt) == 0) {
                isGooglePlayServicesAvailable = 0;
                break;
            }
            i2++;
        }
        this.f60630a.put(e, isGooglePlayServicesAvailable);
        return isGooglePlayServicesAvailable;
    }
}

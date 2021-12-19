package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C25512ae();

    /* renamed from: a */
    Bundle f60648a;

    /* renamed from: b */
    Feature[] f60649b;

    /* renamed from: c */
    private int f60650c;

    public zza() {
    }

    static {
        Covode.recordClassIndex(30983);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49350a(parcel, 1, this.f60648a);
        C25569b.m49356a(parcel, 2, this.f60649b, i);
        C25569b.m49360b(parcel, 3, this.f60650c);
        C25569b.m49359b(parcel, a);
    }

    zza(Bundle bundle, Feature[] featureArr, int i) {
        this.f60648a = bundle;
        this.f60649b = featureArr;
        this.f60650c = i;
    }
}

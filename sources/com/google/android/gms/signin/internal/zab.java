package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zab extends AbstractSafeParcelable implements AbstractC25485p {
    public static final Parcelable.Creator<zab> CREATOR = new C26547b();

    /* renamed from: a */
    private final int f62647a;

    /* renamed from: b */
    private int f62648b;

    /* renamed from: c */
    private Intent f62649c;

    public zab() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(31983);
    }

    @Override // com.google.android.gms.common.api.AbstractC25485p
    /* renamed from: D_ */
    public final Status mo41384D_() {
        if (this.f62648b == 0) {
            return Status.f60100a;
        }
        return Status.f60104e;
    }

    private zab(byte b) {
        this(2, 0, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f62647a);
        C25569b.m49360b(parcel, 2, this.f62648b);
        C25569b.m49352a(parcel, 3, this.f62649c, i);
        C25569b.m49359b(parcel, a);
    }

    zab(int i, int i2, Intent intent) {
        this.f62647a = i;
        this.f62648b = i2;
        this.f62649c = intent;
    }
}

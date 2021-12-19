package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C25303c();

    /* renamed from: a */
    public int f60032a;

    /* renamed from: b */
    private final int f60033b;

    /* renamed from: c */
    private Bundle f60034c;

    static {
        Covode.recordClassIndex(30687);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60033b);
        C25569b.m49360b(parcel, 2, this.f60032a);
        C25569b.m49350a(parcel, 3, this.f60034c);
        C25569b.m49359b(parcel, a);
    }

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f60033b = i;
        this.f60032a = i2;
        this.f60034c = bundle;
    }
}

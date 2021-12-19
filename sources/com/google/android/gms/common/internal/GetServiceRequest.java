package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C25513af();

    /* renamed from: a */
    String f60494a;

    /* renamed from: b */
    IBinder f60495b;

    /* renamed from: c */
    Scope[] f60496c;

    /* renamed from: d */
    public Bundle f60497d;

    /* renamed from: e */
    Account f60498e;

    /* renamed from: f */
    Feature[] f60499f;

    /* renamed from: g */
    Feature[] f60500g;

    /* renamed from: h */
    private final int f60501h;

    /* renamed from: i */
    private final int f60502i;

    /* renamed from: j */
    private int f60503j;

    /* renamed from: k */
    private boolean f60504k;

    /* renamed from: l */
    private int f60505l;

    static {
        Covode.recordClassIndex(30906);
    }

    public GetServiceRequest(int i) {
        this.f60501h = 4;
        this.f60503j = C25497c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.f60502i = i;
        this.f60504k = true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60501h);
        C25569b.m49360b(parcel, 2, this.f60502i);
        C25569b.m49360b(parcel, 3, this.f60503j);
        C25569b.m49353a(parcel, 4, this.f60494a);
        C25569b.m49351a(parcel, 5, this.f60495b);
        C25569b.m49356a(parcel, 6, this.f60496c, i);
        C25569b.m49350a(parcel, 7, this.f60497d);
        C25569b.m49352a(parcel, 8, this.f60498e, i);
        C25569b.m49356a(parcel, 10, this.f60499f, i);
        C25569b.m49356a(parcel, 11, this.f60500g, i);
        C25569b.m49355a(parcel, 12, this.f60504k);
        C25569b.m49360b(parcel, 13, this.f60505l);
        C25569b.m49359b(parcel, a);
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4) {
        this.f60501h = i;
        this.f60502i = i2;
        this.f60503j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f60494a = "com.google.android.gms";
        } else {
            this.f60494a = str;
        }
        if (i < 2) {
            this.f60498e = iBinder != null ? BinderC25507a.m49195a(AbstractC25551l.AbstractBinderC25552a.m49297a(iBinder)) : null;
        } else {
            this.f60495b = iBinder;
            this.f60498e = account;
        }
        this.f60496c = scopeArr;
        this.f60497d = bundle;
        this.f60499f = featureArr;
        this.f60500g = featureArr2;
        this.f60504k = z;
        this.f60505l = i4;
    }
}

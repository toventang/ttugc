package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C25299g();

    /* renamed from: a */
    public GoogleSignInAccount f60026a;

    /* renamed from: b */
    private String f60027b;

    /* renamed from: c */
    private String f60028c;

    static {
        Covode.recordClassIndex(30679);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 4, this.f60027b);
        C25569b.m49352a(parcel, 7, this.f60026a, i);
        C25569b.m49353a(parcel, 8, this.f60028c);
        C25569b.m49359b(parcel, a);
    }

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f60026a = googleSignInAccount;
        this.f60027b = C25565r.m49317a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f60028c = C25565r.m49317a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }
}

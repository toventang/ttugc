package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new C25510ac();

    /* renamed from: a */
    public final Account f60506a;

    /* renamed from: b */
    public final int f60507b;

    /* renamed from: c */
    public final GoogleSignInAccount f60508c;

    /* renamed from: d */
    private final int f60509d;

    static {
        Covode.recordClassIndex(30908);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60509d);
        C25569b.m49352a(parcel, 2, this.f60506a, i);
        C25569b.m49360b(parcel, 3, this.f60507b);
        C25569b.m49352a(parcel, 4, this.f60508c, i);
        C25569b.m49359b(parcel, a);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f60509d = i;
        this.f60506a = account;
        this.f60507b = i2;
        this.f60508c = googleSignInAccount;
    }
}

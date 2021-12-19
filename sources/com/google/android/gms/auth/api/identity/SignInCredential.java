package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.Arrays;

public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new C25289g();

    /* renamed from: a */
    public final String f59968a;

    /* renamed from: b */
    public final String f59969b;

    /* renamed from: c */
    public final String f59970c;

    /* renamed from: d */
    public final String f59971d;

    /* renamed from: e */
    public final Uri f59972e;

    /* renamed from: f */
    public final String f59973f;

    /* renamed from: g */
    public final String f59974g;

    static {
        Covode.recordClassIndex(30663);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59968a, this.f59969b, this.f59970c, this.f59971d, this.f59972e, this.f59973f, this.f59974g});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!C25560p.m49308a(this.f59968a, signInCredential.f59968a) || !C25560p.m49308a(this.f59969b, signInCredential.f59969b) || !C25560p.m49308a(this.f59970c, signInCredential.f59970c) || !C25560p.m49308a(this.f59971d, signInCredential.f59971d) || !C25560p.m49308a(this.f59972e, signInCredential.f59972e) || !C25560p.m49308a(this.f59973f, signInCredential.f59973f) || !C25560p.m49308a(this.f59974g, signInCredential.f59974g)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 1, this.f59968a);
        C25569b.m49353a(parcel, 2, this.f59969b);
        C25569b.m49353a(parcel, 3, this.f59970c);
        C25569b.m49353a(parcel, 4, this.f59971d);
        C25569b.m49352a(parcel, 5, this.f59972e, i);
        C25569b.m49353a(parcel, 6, this.f59973f);
        C25569b.m49353a(parcel, 7, this.f59974g);
        C25569b.m49359b(parcel, a);
    }

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6) {
        this.f59968a = C25565r.m49316a(str);
        this.f59969b = str2;
        this.f59970c = str3;
        this.f59971d = str4;
        this.f59972e = uri;
        this.f59973f = str5;
        this.f59974g = str6;
    }
}

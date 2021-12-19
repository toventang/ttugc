package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C25275j();

    /* renamed from: a */
    public final String f59944a;

    /* renamed from: b */
    public final String f59945b;

    static {
        Covode.recordClassIndex(30641);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (!C25560p.m49308a(this.f59944a, idToken.f59944a) || !C25560p.m49308a(this.f59945b, idToken.f59945b)) {
            return false;
        }
        return true;
    }

    public IdToken(String str, String str2) {
        C25565r.m49325b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C25565r.m49325b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f59944a = str;
        this.f59945b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 1, this.f59944a);
        C25569b.m49353a(parcel, 2, this.f59945b);
        C25569b.m49359b(parcel, a);
    }
}

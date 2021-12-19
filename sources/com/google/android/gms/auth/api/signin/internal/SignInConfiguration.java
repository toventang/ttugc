package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C25323w();

    /* renamed from: a */
    public GoogleSignInOptions f60035a;

    /* renamed from: b */
    private final String f60036b;

    static {
        Covode.recordClassIndex(30688);
    }

    public final int hashCode() {
        return new C25301a().mo41398a(this.f60036b).mo41398a(this.f60035a).f60045a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f60036b.equals(signInConfiguration.f60036b)) {
            GoogleSignInOptions googleSignInOptions = this.f60035a;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f60035a == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f60035a)) {
                return true;
            }
        }
        return false;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f60036b = C25565r.m49316a(str);
        this.f60035a = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 2, this.f60036b);
        C25569b.m49352a(parcel, 5, this.f60035a, i);
        C25569b.m49359b(parcel, a);
    }
}

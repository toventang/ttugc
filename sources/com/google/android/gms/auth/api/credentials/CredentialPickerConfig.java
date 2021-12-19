package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C25272g();

    /* renamed from: a */
    public final boolean f59905a;

    /* renamed from: b */
    public final boolean f59906b;

    /* renamed from: c */
    private final int f59907c;

    /* renamed from: d */
    private final boolean f59908d;

    /* renamed from: e */
    private final int f59909e;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C25262a {

        /* renamed from: a */
        boolean f59910a;

        /* renamed from: b */
        public boolean f59911b = true;

        /* renamed from: c */
        int f59912c = 1;

        static {
            Covode.recordClassIndex(30636);
        }

        /* renamed from: a */
        public final CredentialPickerConfig mo41304a() {
            return new CredentialPickerConfig(this, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(30635);
    }

    private CredentialPickerConfig(C25262a aVar) {
        this(2, aVar.f59910a, aVar.f59911b, false, aVar.f59912c);
    }

    /* synthetic */ CredentialPickerConfig(C25262a aVar, byte b) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        boolean z = true;
        C25569b.m49355a(parcel, 1, this.f59905a);
        C25569b.m49355a(parcel, 2, this.f59906b);
        if (this.f59909e != 3) {
            z = false;
        }
        C25569b.m49355a(parcel, 3, z);
        C25569b.m49360b(parcel, 4, this.f59909e);
        C25569b.m49360b(parcel, 1000, this.f59907c);
        C25569b.m49359b(parcel, a);
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f59907c = i;
        this.f59905a = z;
        this.f59906b = z2;
        boolean z4 = true;
        int i3 = 1;
        if (i < 2) {
            this.f59908d = z3;
            this.f59909e = z3 ? 3 : i3;
            return;
        }
        this.f59908d = i2 != 3 ? false : z4;
        this.f59909e = i2;
    }
}

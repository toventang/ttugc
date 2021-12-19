package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C25273h();

    /* renamed from: a */
    public final boolean f59913a;

    /* renamed from: b */
    public final String[] f59914b;

    /* renamed from: c */
    public final CredentialPickerConfig f59915c;

    /* renamed from: d */
    public final CredentialPickerConfig f59916d;

    /* renamed from: e */
    public final boolean f59917e;

    /* renamed from: f */
    public final String f59918f;

    /* renamed from: g */
    public final String f59919g;

    /* renamed from: h */
    private final int f59920h;

    /* renamed from: i */
    private final boolean f59921i;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    public static final class C25263a {

        /* renamed from: a */
        public boolean f59922a;

        /* renamed from: b */
        public String[] f59923b;

        /* renamed from: c */
        CredentialPickerConfig f59924c;

        /* renamed from: d */
        CredentialPickerConfig f59925d;

        /* renamed from: e */
        boolean f59926e;

        /* renamed from: f */
        String f59927f;

        /* renamed from: g */
        String f59928g;

        static {
            Covode.recordClassIndex(30638);
        }
    }

    static {
        Covode.recordClassIndex(30637);
    }

    private CredentialRequest(C25263a aVar) {
        this(4, aVar.f59922a, aVar.f59923b, aVar.f59924c, aVar.f59925d, aVar.f59926e, aVar.f59927f, aVar.f59928g, false);
    }

    public /* synthetic */ CredentialRequest(C25263a aVar, byte b) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49355a(parcel, 1, this.f59913a);
        C25569b.m49357a(parcel, 2, this.f59914b);
        C25569b.m49352a(parcel, 3, this.f59915c, i);
        C25569b.m49352a(parcel, 4, this.f59916d, i);
        C25569b.m49355a(parcel, 5, this.f59917e);
        C25569b.m49353a(parcel, 6, this.f59918f);
        C25569b.m49353a(parcel, 7, this.f59919g);
        C25569b.m49355a(parcel, 8, this.f59921i);
        C25569b.m49360b(parcel, 1000, this.f59920h);
        C25569b.m49359b(parcel, a);
    }

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f59920h = i;
        this.f59913a = z;
        this.f59914b = (String[]) C25565r.m49314a(strArr);
        this.f59915c = credentialPickerConfig == null ? new CredentialPickerConfig.C25262a().mo41304a() : credentialPickerConfig;
        this.f59916d = credentialPickerConfig2 == null ? new CredentialPickerConfig.C25262a().mo41304a() : credentialPickerConfig2;
        if (i < 3) {
            this.f59917e = true;
            this.f59918f = null;
            this.f59919g = null;
        } else {
            this.f59917e = z2;
            this.f59918f = str;
            this.f59919g = str2;
        }
        this.f59921i = z3;
    }
}

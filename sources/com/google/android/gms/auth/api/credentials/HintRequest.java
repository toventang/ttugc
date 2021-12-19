package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C25274i();

    /* renamed from: a */
    public final CredentialPickerConfig f59929a;

    /* renamed from: b */
    public final boolean f59930b;

    /* renamed from: c */
    public final String[] f59931c;

    /* renamed from: d */
    public final boolean f59932d;

    /* renamed from: e */
    public final String f59933e;

    /* renamed from: f */
    public final String f59934f;

    /* renamed from: g */
    private final int f59935g;

    /* renamed from: h */
    private final boolean f59936h;

    static {
        Covode.recordClassIndex(30639);
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C25264a {

        /* renamed from: a */
        boolean f59937a;

        /* renamed from: b */
        public boolean f59938b;

        /* renamed from: c */
        String[] f59939c;

        /* renamed from: d */
        CredentialPickerConfig f59940d = new CredentialPickerConfig.C25262a().mo41304a();

        /* renamed from: e */
        boolean f59941e = false;

        /* renamed from: f */
        String f59942f;

        /* renamed from: g */
        String f59943g;

        static {
            Covode.recordClassIndex(30640);
        }

        /* renamed from: a */
        public final HintRequest mo41308a() {
            if (this.f59939c == null) {
                this.f59939c = new String[0];
            }
            if (this.f59937a || this.f59938b || this.f59939c.length != 0) {
                return new HintRequest(this, (byte) 0);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: a */
        public final C25264a mo41307a(CredentialPickerConfig credentialPickerConfig) {
            this.f59940d = (CredentialPickerConfig) C25565r.m49314a(credentialPickerConfig);
            return this;
        }
    }

    private HintRequest(C25264a aVar) {
        this(2, aVar.f59940d, aVar.f59937a, aVar.f59938b, aVar.f59939c, aVar.f59941e, aVar.f59942f, aVar.f59943g);
    }

    /* synthetic */ HintRequest(C25264a aVar, byte b) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49352a(parcel, 1, this.f59929a, i);
        C25569b.m49355a(parcel, 2, this.f59930b);
        C25569b.m49355a(parcel, 3, this.f59936h);
        C25569b.m49357a(parcel, 4, this.f59931c);
        C25569b.m49355a(parcel, 5, this.f59932d);
        C25569b.m49353a(parcel, 6, this.f59933e);
        C25569b.m49353a(parcel, 7, this.f59934f);
        C25569b.m49360b(parcel, 1000, this.f59935g);
        C25569b.m49359b(parcel, a);
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f59935g = i;
        this.f59929a = (CredentialPickerConfig) C25565r.m49314a(credentialPickerConfig);
        this.f59930b = z;
        this.f59936h = z2;
        this.f59931c = (String[]) C25565r.m49314a(strArr);
        if (i < 2) {
            this.f59932d = true;
            this.f59933e = null;
            this.f59934f = null;
            return;
        }
        this.f59932d = z3;
        this.f59933e = str;
        this.f59934f = str2;
    }
}

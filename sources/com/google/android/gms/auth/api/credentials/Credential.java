package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C25271f();

    /* renamed from: a */
    public final String f59889a;

    /* renamed from: b */
    public final String f59890b;

    /* renamed from: c */
    public final Uri f59891c;

    /* renamed from: d */
    public final List<IdToken> f59892d;

    /* renamed from: e */
    public final String f59893e;

    /* renamed from: f */
    public final String f59894f;

    /* renamed from: g */
    public final String f59895g;

    /* renamed from: h */
    public final String f59896h;

    static {
        Covode.recordClassIndex(30633);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59889a, this.f59890b, this.f59891c, this.f59893e, this.f59894f});
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    public static class C25261a {

        /* renamed from: a */
        public final String f59897a;

        /* renamed from: b */
        public String f59898b;

        /* renamed from: c */
        public Uri f59899c;

        /* renamed from: d */
        public List<IdToken> f59900d;

        /* renamed from: e */
        public String f59901e;

        /* renamed from: f */
        public String f59902f;

        /* renamed from: g */
        public String f59903g;

        /* renamed from: h */
        public String f59904h;

        static {
            Covode.recordClassIndex(30634);
        }

        public C25261a(String str) {
            this.f59897a = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        if (!TextUtils.equals(this.f59889a, credential.f59889a) || !TextUtils.equals(this.f59890b, credential.f59890b) || !C25560p.m49308a(this.f59891c, credential.f59891c) || !TextUtils.equals(this.f59893e, credential.f59893e) || !TextUtils.equals(this.f59894f, credential.f59894f)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 1, this.f59889a);
        C25569b.m49353a(parcel, 2, this.f59890b);
        C25569b.m49352a(parcel, 3, this.f59891c, i);
        C25569b.m49361b(parcel, 4, this.f59892d);
        C25569b.m49353a(parcel, 5, this.f59893e);
        C25569b.m49353a(parcel, 6, this.f59894f);
        C25569b.m49353a(parcel, 9, this.f59895g);
        C25569b.m49353a(parcel, 10, this.f59896h);
        C25569b.m49359b(parcel, a);
    }

    public Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> unmodifiableList;
        String trim = ((String) C25565r.m49315a((Object) str, (Object) "credential identifier cannot be null")).trim();
        C25565r.m49317a(trim, (Object) "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f59890b = str2;
                this.f59891c = uri;
                if (list == null) {
                    unmodifiableList = Collections.emptyList();
                } else {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                this.f59892d = unmodifiableList;
                this.f59889a = trim;
                this.f59893e = str3;
                this.f59894f = str4;
                this.f59895g = str5;
                this.f59896h = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }
}

package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C25283b();

    /* renamed from: a */
    public final PasswordRequestOptions f59947a;

    /* renamed from: b */
    public final GoogleIdTokenRequestOptions f59948b;

    /* renamed from: c */
    public final String f59949c;

    /* renamed from: d */
    public final boolean f59950d;

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C25285d();

        /* renamed from: a */
        public final boolean f59951a;

        /* renamed from: b */
        public final String f59952b;

        /* renamed from: c */
        public final String f59953c;

        /* renamed from: d */
        public final boolean f59954d;

        /* renamed from: e */
        private final String f59955e;

        /* renamed from: f */
        private final List<String> f59956f;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$a */
        public static final class C25279a {

            /* renamed from: a */
            public boolean f59957a;

            /* renamed from: b */
            public String f59958b;

            /* renamed from: c */
            public String f59959c;

            /* renamed from: d */
            public boolean f59960d = true;

            static {
                Covode.recordClassIndex(30658);
            }

            /* renamed from: a */
            public final GoogleIdTokenRequestOptions mo41334a() {
                return new GoogleIdTokenRequestOptions(this.f59957a, this.f59958b, this.f59959c, this.f59960d, null, null);
            }
        }

        static {
            Covode.recordClassIndex(30657);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f59951a), this.f59952b, this.f59953c, Boolean.valueOf(this.f59954d), this.f59955e, this.f59956f});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.f59951a != googleIdTokenRequestOptions.f59951a || !C25560p.m49308a(this.f59952b, googleIdTokenRequestOptions.f59952b) || !C25560p.m49308a(this.f59953c, googleIdTokenRequestOptions.f59953c) || this.f59954d != googleIdTokenRequestOptions.f59954d || !C25560p.m49308a(this.f59955e, googleIdTokenRequestOptions.f59955e) || !C25560p.m49308a(this.f59956f, googleIdTokenRequestOptions.f59956f)) {
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C25569b.m49347a(parcel, 20293);
            C25569b.m49355a(parcel, 1, this.f59951a);
            C25569b.m49353a(parcel, 2, this.f59952b);
            C25569b.m49353a(parcel, 3, this.f59953c);
            C25569b.m49355a(parcel, 4, this.f59954d);
            C25569b.m49353a(parcel, 5, this.f59955e);
            C25569b.m49354a(parcel, 6, this.f59956f);
            C25569b.m49359b(parcel, a);
        }

        GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List<String> list) {
            ArrayList arrayList;
            this.f59951a = z;
            if (z) {
                C25565r.m49315a((Object) str, (Object) "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f59952b = str;
            this.f59953c = str2;
            this.f59954d = z2;
            if (list == null || list.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f59956f = arrayList;
            this.f59955e = str3;
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new C25286e();

        /* renamed from: a */
        public final boolean f59961a;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$a */
        public static final class C25280a {

            /* renamed from: a */
            boolean f59962a;

            static {
                Covode.recordClassIndex(30660);
            }
        }

        static {
            Covode.recordClassIndex(30659);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f59961a)});
        }

        PasswordRequestOptions(boolean z) {
            this.f59961a = z;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof PasswordRequestOptions) && this.f59961a == ((PasswordRequestOptions) obj).f59961a) {
                return true;
            }
            return false;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C25569b.m49347a(parcel, 20293);
            C25569b.m49355a(parcel, 1, this.f59961a);
            C25569b.m49359b(parcel, a);
        }
    }

    static {
        Covode.recordClassIndex(30656);
    }

    /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$a */
    public static final class C25281a {

        /* renamed from: a */
        public PasswordRequestOptions f59963a;

        /* renamed from: b */
        public String f59964b;

        /* renamed from: c */
        public boolean f59965c;

        /* renamed from: d */
        private GoogleIdTokenRequestOptions f59966d;

        static {
            Covode.recordClassIndex(30661);
        }

        /* renamed from: a */
        public final BeginSignInRequest mo41339a() {
            return new BeginSignInRequest(this.f59963a, this.f59966d, this.f59964b, this.f59965c);
        }

        public C25281a() {
            PasswordRequestOptions.C25280a aVar = new PasswordRequestOptions.C25280a();
            aVar.f59962a = false;
            this.f59963a = new PasswordRequestOptions(aVar.f59962a);
            GoogleIdTokenRequestOptions.C25279a aVar2 = new GoogleIdTokenRequestOptions.C25279a();
            aVar2.f59957a = false;
            this.f59966d = aVar2.mo41334a();
        }

        /* renamed from: a */
        public final C25281a mo41338a(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f59966d = (GoogleIdTokenRequestOptions) C25565r.m49314a(googleIdTokenRequestOptions);
            return this;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f59947a, this.f59948b, this.f59949c, Boolean.valueOf(this.f59950d)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!C25560p.m49308a(this.f59947a, beginSignInRequest.f59947a) || !C25560p.m49308a(this.f59948b, beginSignInRequest.f59948b) || !C25560p.m49308a(this.f59949c, beginSignInRequest.f59949c) || this.f59950d != beginSignInRequest.f59950d) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49352a(parcel, 1, this.f59947a, i);
        C25569b.m49352a(parcel, 2, this.f59948b, i);
        C25569b.m49353a(parcel, 3, this.f59949c);
        C25569b.m49355a(parcel, 4, this.f59950d);
        C25569b.m49359b(parcel, a);
    }

    BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z) {
        this.f59947a = (PasswordRequestOptions) C25565r.m49314a(passwordRequestOptions);
        this.f59948b = (GoogleIdTokenRequestOptions) C25565r.m49314a(googleIdTokenRequestOptions);
        this.f59949c = str;
        this.f59950d = z;
    }
}

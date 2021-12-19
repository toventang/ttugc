package com.google.android.gms.auth.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.AbstractC25267c;
import com.google.android.gms.auth.api.p1933b.AbstractC25259a;
import com.google.android.gms.auth.api.signin.AbstractC25293a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C25307g;
import com.google.android.gms.auth.api.signin.internal.C25308h;
import com.google.android.gms.common.api.AbstractC25350d;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.internal.p1942authapi.C25699u;
import com.google.android.gms.internal.p1942authapi.C25704z;
import java.util.Arrays;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C25253a {

    /* renamed from: a */
    public static final C25335a.C25344g<C25704z> f59865a;

    /* renamed from: b */
    public static final C25335a.C25344g<C25307g> f59866b;

    /* renamed from: c */
    public static final C25335a<C25260c> f59867c = C25258b.f59885a;

    /* renamed from: d */
    public static final C25335a<C25254a> f59868d;

    /* renamed from: e */
    public static final C25335a<GoogleSignInOptions> f59869e;

    /* renamed from: f */
    public static final AbstractC25259a f59870f = C25258b.f59886b;

    /* renamed from: g */
    public static final AbstractC25267c f59871g = new C25699u();

    /* renamed from: h */
    public static final AbstractC25293a f59872h = new C25308h();

    /* renamed from: i */
    private static final C25335a.AbstractC25336a<C25704z, C25254a> f59873i;

    /* renamed from: j */
    private static final C25335a.AbstractC25336a<C25307g, GoogleSignInOptions> f59874j;

    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C25254a implements AbstractC25350d {

        /* renamed from: a */
        public static final C25254a f59875a = new C25255a().mo41297a();

        /* renamed from: b */
        public final String f59876b;

        /* renamed from: c */
        public final boolean f59877c;

        /* renamed from: d */
        public final String f59878d;

        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C25255a {

            /* renamed from: a */
            protected String f59879a;

            /* renamed from: b */
            protected Boolean f59880b = false;

            /* renamed from: c */
            protected String f59881c;

            static {
                Covode.recordClassIndex(30627);
            }

            /* renamed from: a */
            public C25254a mo41297a() {
                return new C25254a(this);
            }

            public C25255a() {
            }

            /* renamed from: a */
            public C25255a mo41296a(String str) {
                this.f59881c = str;
                return this;
            }

            public C25255a(C25254a aVar) {
                this.f59879a = aVar.f59876b;
                this.f59880b = Boolean.valueOf(aVar.f59877c);
                this.f59881c = aVar.f59878d;
            }
        }

        static {
            Covode.recordClassIndex(30626);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f59876b, Boolean.valueOf(this.f59877c), this.f59878d});
        }

        public C25254a(C25255a aVar) {
            this.f59876b = aVar.f59879a;
            this.f59877c = aVar.f59880b.booleanValue();
            this.f59878d = aVar.f59881c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C25254a)) {
                return false;
            }
            C25254a aVar = (C25254a) obj;
            if (!C25560p.m49308a(this.f59876b, aVar.f59876b) || this.f59877c != aVar.f59877c || !C25560p.m49308a(this.f59878d, aVar.f59878d)) {
                return false;
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(30625);
        C25335a.C25344g<C25704z> gVar = new C25335a.C25344g<>();
        f59865a = gVar;
        C25335a.C25344g<C25307g> gVar2 = new C25335a.C25344g<>();
        f59866b = gVar2;
        C25277e eVar = new C25277e();
        f59873i = eVar;
        C25278f fVar = new C25278f();
        f59874j = fVar;
        f59868d = new C25335a<>("Auth.CREDENTIALS_API", eVar, gVar);
        f59869e = new C25335a<>("Auth.GOOGLE_SIGN_IN_API", fVar, gVar2);
    }
}

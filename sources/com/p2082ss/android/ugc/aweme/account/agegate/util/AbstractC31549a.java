package com.p2082ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.EnumC31926c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.a */
public abstract class AbstractC31549a {

    /* renamed from: a */
    public final String f75455a;

    /* renamed from: b */
    private final EnumC31926c f75456b;

    /* renamed from: c */
    private final AgeGateResponse f75457c;

    /* renamed from: d */
    private final String f75458d;

    /* renamed from: e */
    private final String f75459e;

    /* renamed from: f */
    private final String f75460f;

    /* renamed from: g */
    private final long f75461g;

    /* renamed from: h */
    private final boolean f75462h;

    static {
        Covode.recordClassIndex(38268);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.a$a */
    public static final class C31550a extends AbstractC31549a {

        /* renamed from: b */
        private final EnumC31926c f75463b;

        /* renamed from: c */
        private final AgeGateResponse f75464c;

        /* renamed from: d */
        private final String f75465d;

        /* renamed from: e */
        private final String f75466e;

        /* renamed from: f */
        private final String f75467f;

        /* renamed from: g */
        private final long f75468g;

        /* renamed from: h */
        private final boolean f75469h;

        static {
            Covode.recordClassIndex(38269);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: a */
        public final EnumC31926c mo57555a() {
            return this.f75463b;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: b */
        public final AgeGateResponse mo57556b() {
            return this.f75464c;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: c */
        public final String mo57557c() {
            return this.f75465d;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: d */
        public final String mo57558d() {
            return this.f75466e;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: e */
        public final String mo57559e() {
            return this.f75467f;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: f */
        public final long mo57560f() {
            return this.f75468g;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: g */
        public final boolean mo57561g() {
            return this.f75469h;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            EnumC31926c cVar = this.f75463b;
            int i5 = 0;
            if (cVar != null) {
                i = cVar.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            AgeGateResponse ageGateResponse = this.f75464c;
            if (ageGateResponse != null) {
                i2 = ageGateResponse.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str = this.f75465d;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str2 = this.f75466e;
            if (str2 != null) {
                i4 = str2.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str3 = this.f75467f;
            if (str3 != null) {
                i5 = str3.hashCode();
            }
            long j = this.f75468g;
            int i10 = (((i9 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            boolean z = this.f75469h;
            if (z) {
                z = true;
            }
            int i11 = z ? 1 : 0;
            int i12 = z ? 1 : 0;
            int i13 = z ? 1 : 0;
            return i10 + i11;
        }

        public final String toString() {
            return "AgeGateResponseEvent(userRetentionType=" + this.f75463b + ", ageGateResponseNetworkEntity=" + this.f75464c + ", enterFrom=" + this.f75465d + ", enterMethod=" + this.f75466e + ", platform=" + this.f75467f + ", pageStayTime=" + this.f75468g + ", nicknameProvided=" + this.f75469h + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31550a)) {
                return false;
            }
            C31550a aVar = (C31550a) obj;
            if (!C89219l.m154714a(this.f75463b, aVar.f75463b) || !C89219l.m154714a(this.f75464c, aVar.f75464c) || !C89219l.m154714a((Object) this.f75465d, (Object) aVar.f75465d) || !C89219l.m154714a((Object) this.f75466e, (Object) aVar.f75466e) || !C89219l.m154714a((Object) this.f75467f, (Object) aVar.f75467f) || this.f75468g != aVar.f75468g || this.f75469h != aVar.f75469h) {
                return false;
            }
            return true;
        }

        public /* synthetic */ C31550a(EnumC31926c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j) {
            this(cVar, ageGateResponse, str, str2, str3, j, false);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31550a(EnumC31926c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j, boolean z) {
            super("age_gate_response", cVar, ageGateResponse, str, str2, str3, j, z, (byte) 0);
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(ageGateResponse, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f75463b = cVar;
            this.f75464c = ageGateResponse;
            this.f75465d = str;
            this.f75466e = str2;
            this.f75467f = str3;
            this.f75468g = j;
            this.f75469h = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.a$b */
    public static final class C31551b extends AbstractC31549a {

        /* renamed from: b */
        public final int f75470b;

        /* renamed from: c */
        private final AgeGateResponse f75471c;

        /* renamed from: d */
        private final String f75472d;

        /* renamed from: e */
        private final String f75473e;

        /* renamed from: f */
        private final long f75474f;

        static {
            Covode.recordClassIndex(38270);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: b */
        public final AgeGateResponse mo57556b() {
            return this.f75471c;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: c */
        public final String mo57557c() {
            return this.f75472d;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: d */
        public final String mo57558d() {
            return this.f75473e;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: f */
        public final long mo57560f() {
            return this.f75474f;
        }

        public final int hashCode() {
            int i;
            int i2;
            AgeGateResponse ageGateResponse = this.f75471c;
            int i3 = 0;
            if (ageGateResponse != null) {
                i = ageGateResponse.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str = this.f75472d;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            String str2 = this.f75473e;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            long j = this.f75474f;
            return ((((i5 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f75470b;
        }

        public final String toString() {
            return "EditAgeGateResponseEvent(ageGateResponseNetworkEntity=" + this.f75471c + ", enterFrom=" + this.f75472d + ", enterMethod=" + this.f75473e + ", pageStayTime=" + this.f75474f + ", userAgeStatus=" + this.f75470b + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31551b)) {
                return false;
            }
            C31551b bVar = (C31551b) obj;
            if (!C89219l.m154714a(this.f75471c, bVar.f75471c) || !C89219l.m154714a((Object) this.f75472d, (Object) bVar.f75472d) || !C89219l.m154714a((Object) this.f75473e, (Object) bVar.f75473e) || this.f75474f != bVar.f75474f || this.f75470b != bVar.f75470b) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31551b(AgeGateResponse ageGateResponse, String str, String str2, long j, int i) {
            super("age_edit_response", EnumC31926c.EXISTING_USER, ageGateResponse, str, str2, "", j);
            C89219l.m154721d(ageGateResponse, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f75471c = ageGateResponse;
            this.f75472d = str;
            this.f75473e = str2;
            this.f75474f = j;
            this.f75470b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.a$c */
    public static final class C31552c extends AbstractC31549a {

        /* renamed from: b */
        public final boolean f75475b;

        /* renamed from: c */
        private final EnumC31926c f75476c;

        /* renamed from: d */
        private final AgeGateResponse f75477d;

        /* renamed from: e */
        private final String f75478e;

        /* renamed from: f */
        private final String f75479f;

        /* renamed from: g */
        private final String f75480g;

        /* renamed from: h */
        private final long f75481h;

        /* renamed from: i */
        private final boolean f75482i;

        static {
            Covode.recordClassIndex(38271);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: a */
        public final EnumC31926c mo57555a() {
            return this.f75476c;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: b */
        public final AgeGateResponse mo57556b() {
            return this.f75477d;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: c */
        public final String mo57557c() {
            return this.f75479f;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: d */
        public final String mo57558d() {
            return this.f75478e;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: e */
        public final String mo57559e() {
            return this.f75480g;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: f */
        public final long mo57560f() {
            return this.f75481h;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a
        /* renamed from: g */
        public final boolean mo57561g() {
            return this.f75482i;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            EnumC31926c cVar = this.f75476c;
            int i5 = 0;
            if (cVar != null) {
                i = cVar.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            AgeGateResponse ageGateResponse = this.f75477d;
            if (ageGateResponse != null) {
                i2 = ageGateResponse.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str = this.f75478e;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str2 = this.f75479f;
            if (str2 != null) {
                i4 = str2.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str3 = this.f75480g;
            if (str3 != null) {
                i5 = str3.hashCode();
            }
            long j = this.f75481h;
            int i10 = (((i9 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            boolean z = this.f75475b;
            int i11 = 1;
            if (z) {
                z = true;
            }
            int i12 = z ? 1 : 0;
            int i13 = z ? 1 : 0;
            int i14 = z ? 1 : 0;
            int i15 = (i10 + i12) * 31;
            if (!this.f75482i) {
                i11 = 0;
            }
            return i15 + i11;
        }

        public final String toString() {
            return "FTCAgeGateResponseEvent(userRetentionType=" + this.f75476c + ", ageGateResponseNetworkEntity=" + this.f75477d + ", enterMethod=" + this.f75478e + ", enterFrom=" + this.f75479f + ", platform=" + this.f75480g + ", pageStayTime=" + this.f75481h + ", isWeb=" + this.f75475b + ", nicknameProvided=" + this.f75482i + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31552c)) {
                return false;
            }
            C31552c cVar = (C31552c) obj;
            if (!C89219l.m154714a(this.f75476c, cVar.f75476c) || !C89219l.m154714a(this.f75477d, cVar.f75477d) || !C89219l.m154714a((Object) this.f75478e, (Object) cVar.f75478e) || !C89219l.m154714a((Object) this.f75479f, (Object) cVar.f75479f) || !C89219l.m154714a((Object) this.f75480g, (Object) cVar.f75480g) || this.f75481h != cVar.f75481h || this.f75475b != cVar.f75475b || this.f75482i != cVar.f75482i) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C31552c(EnumC31926c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j, boolean z) {
            super("f_age_gate_response", cVar, ageGateResponse, "", str, str3, j);
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(ageGateResponse, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f75476c = cVar;
            this.f75477d = ageGateResponse;
            this.f75478e = str;
            this.f75479f = str2;
            this.f75480g = str3;
            this.f75481h = j;
            this.f75475b = false;
            this.f75482i = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C31552c(EnumC31926c cVar, AgeGateResponse ageGateResponse, String str, String str2, String str3, long j, boolean z, int i) {
            this(cVar, ageGateResponse, str, str2, str3, j, (i & 128) != 0 ? false : z);
        }
    }

    /* renamed from: a */
    public EnumC31926c mo57555a() {
        return this.f75456b;
    }

    /* renamed from: b */
    public AgeGateResponse mo57556b() {
        return this.f75457c;
    }

    /* renamed from: c */
    public String mo57557c() {
        return this.f75458d;
    }

    /* renamed from: d */
    public String mo57558d() {
        return this.f75459e;
    }

    /* renamed from: e */
    public String mo57559e() {
        return this.f75460f;
    }

    /* renamed from: f */
    public long mo57560f() {
        return this.f75461g;
    }

    /* renamed from: g */
    public boolean mo57561g() {
        return this.f75462h;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.a$d */
    public static final class C31553d extends AbstractC31549a {

        /* renamed from: b */
        public static final C31553d f75483b = new C31553d();

        static {
            Covode.recordClassIndex(38272);
        }

        private C31553d() {
            super("", EnumC31926c.NEW_USER, new AgeGateResponse(-1, null, false, 0, 0, null, 56, null), "", "", "", 0);
        }
    }

    public /* synthetic */ AbstractC31549a(String str, EnumC31926c cVar, AgeGateResponse ageGateResponse, String str2, String str3, String str4, long j) {
        this(str, cVar, ageGateResponse, str2, str3, str4, j, false);
    }

    private AbstractC31549a(String str, EnumC31926c cVar, AgeGateResponse ageGateResponse, String str2, String str3, String str4, long j, boolean z) {
        this.f75455a = str;
        this.f75456b = cVar;
        this.f75457c = ageGateResponse;
        this.f75458d = str2;
        this.f75459e = str3;
        this.f75460f = str4;
        this.f75461g = j;
        this.f75462h = z;
    }

    public /* synthetic */ AbstractC31549a(String str, EnumC31926c cVar, AgeGateResponse ageGateResponse, String str2, String str3, String str4, long j, boolean z, byte b) {
        this(str, cVar, ageGateResponse, str2, str3, str4, j, z);
    }
}

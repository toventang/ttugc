package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32399s;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.u */
public final class C32403u extends C22291d<C32399s.C32401b> {

    /* renamed from: k */
    public final boolean f77251k = true;

    /* renamed from: l */
    public final int f77252l;

    /* renamed from: m */
    public final C32399s.C32401b f77253m;

    /* renamed from: n */
    public final JSONObject f77254n;

    /* renamed from: o */
    public final String f77255o;

    /* renamed from: p */
    public final C22507a f77256p;

    static {
        Covode.recordClassIndex(39171);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32403u)) {
            return false;
        }
        C32403u uVar = (C32403u) obj;
        return this.f77251k == uVar.f77251k && this.f77252l == uVar.f77252l && C89219l.m154714a(this.f77253m, uVar.f77253m) && C89219l.m154714a(this.f77254n, uVar.f77254n) && C89219l.m154714a(this.f77255o, uVar.f77255o) && C89219l.m154714a(this.f77256p, uVar.f77256p);
    }

    public final int hashCode() {
        boolean z = this.f77251k;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = ((i * 31) + this.f77252l) * 31;
        C32399s.C32401b bVar = this.f77253m;
        int i5 = 0;
        int hashCode = (i4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        JSONObject jSONObject = this.f77254n;
        int hashCode2 = (hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        String str = this.f77255o;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C22507a aVar = this.f77256p;
        if (aVar != null) {
            i5 = aVar.hashCode();
        }
        return hashCode3 + i5;
    }

    public final String toString() {
        return "ForceResetPasswordResponse(success=" + this.f77251k + ", api=" + this.f77252l + ", queryObj=" + this.f77253m + ", rawData=" + this.f77254n + ", mErrorCaptcha=" + this.f77255o + ", userInfo=" + this.f77256p + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32403u(int i, C32399s.C32401b bVar, JSONObject jSONObject, String str, C22507a aVar) {
        super(true, i, bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(jSONObject, "");
        this.f77252l = i;
        this.f77253m = bVar;
        this.f77254n = jSONObject;
        this.f77255o = str;
        this.f77256p = aVar;
    }
}

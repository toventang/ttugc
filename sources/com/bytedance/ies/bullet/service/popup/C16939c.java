package com.bytedance.ies.bullet.service.popup;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.c */
public final class C16939c {

    /* renamed from: E */
    public static final C16940a f40303E = new C16940a((byte) 0);

    /* renamed from: A */
    public int f40304A;

    /* renamed from: B */
    public final boolean f40305B;

    /* renamed from: C */
    public final boolean f40306C;

    /* renamed from: D */
    public final boolean f40307D;

    /* renamed from: a */
    public final String f40308a;

    /* renamed from: b */
    public final int f40309b;

    /* renamed from: c */
    public final JSONObject f40310c;

    /* renamed from: d */
    public final int f40311d;

    /* renamed from: e */
    public final Uri f40312e;

    /* renamed from: f */
    public final Bundle f40313f;

    /* renamed from: g */
    public final int f40314g;

    /* renamed from: h */
    public final int f40315h;

    /* renamed from: i */
    public final int f40316i;

    /* renamed from: j */
    public final String f40317j;

    /* renamed from: k */
    public final boolean f40318k;

    /* renamed from: l */
    public final boolean f40319l;

    /* renamed from: m */
    public final JSONObject f40320m;

    /* renamed from: n */
    public final JSONObject f40321n;

    /* renamed from: o */
    public final boolean f40322o;

    /* renamed from: p */
    public final boolean f40323p;

    /* renamed from: q */
    public final String f40324q;

    /* renamed from: r */
    public Bundle f40325r;

    /* renamed from: s */
    public final Integer f40326s;

    /* renamed from: t */
    public final Integer f40327t;

    /* renamed from: u */
    public final boolean f40328u;

    /* renamed from: v */
    public final boolean f40329v;

    /* renamed from: w */
    public final boolean f40330w;

    /* renamed from: x */
    public final int f40331x;

    /* renamed from: y */
    public final boolean f40332y;

    /* renamed from: z */
    public final boolean f40333z;

    static {
        Covode.recordClassIndex(19381);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16939c)) {
            return false;
        }
        C16939c cVar = (C16939c) obj;
        return C89219l.m154714a(this.f40308a, cVar.f40308a) && this.f40309b == cVar.f40309b && C89219l.m154714a(this.f40310c, cVar.f40310c) && this.f40311d == cVar.f40311d && C89219l.m154714a(this.f40312e, cVar.f40312e) && C89219l.m154714a(this.f40313f, cVar.f40313f) && this.f40314g == cVar.f40314g && this.f40315h == cVar.f40315h && this.f40316i == cVar.f40316i && C89219l.m154714a(this.f40317j, cVar.f40317j) && this.f40318k == cVar.f40318k && this.f40319l == cVar.f40319l && C89219l.m154714a(this.f40320m, cVar.f40320m) && C89219l.m154714a(this.f40321n, cVar.f40321n) && this.f40322o == cVar.f40322o && this.f40323p == cVar.f40323p && C89219l.m154714a(this.f40324q, cVar.f40324q) && C89219l.m154714a(this.f40325r, cVar.f40325r) && C89219l.m154714a(this.f40326s, cVar.f40326s) && C89219l.m154714a(this.f40327t, cVar.f40327t) && this.f40328u == cVar.f40328u && this.f40329v == cVar.f40329v && this.f40330w == cVar.f40330w && this.f40331x == cVar.f40331x && this.f40332y == cVar.f40332y && this.f40333z == cVar.f40333z && this.f40304A == cVar.f40304A && this.f40305B == cVar.f40305B && this.f40306C == cVar.f40306C && this.f40307D == cVar.f40307D;
    }

    public final int hashCode() {
        String str = this.f40308a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f40309b) * 31;
        JSONObject jSONObject = this.f40310c;
        int hashCode2 = (((hashCode + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + this.f40311d) * 31;
        Uri uri = this.f40312e;
        int hashCode3 = (hashCode2 + (uri != null ? uri.hashCode() : 0)) * 31;
        Bundle bundle = this.f40313f;
        int hashCode4 = (((((((hashCode3 + (bundle != null ? bundle.hashCode() : 0)) * 31) + this.f40314g) * 31) + this.f40315h) * 31) + this.f40316i) * 31;
        String str2 = this.f40317j;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f40318k;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        boolean z2 = this.f40319l;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        JSONObject jSONObject2 = this.f40320m;
        int hashCode6 = (i10 + (jSONObject2 != null ? jSONObject2.hashCode() : 0)) * 31;
        JSONObject jSONObject3 = this.f40321n;
        int hashCode7 = (hashCode6 + (jSONObject3 != null ? jSONObject3.hashCode() : 0)) * 31;
        boolean z3 = this.f40322o;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (hashCode7 + i11) * 31;
        boolean z4 = this.f40323p;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        String str3 = this.f40324q;
        int hashCode8 = (i18 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Bundle bundle2 = this.f40325r;
        int hashCode9 = (hashCode8 + (bundle2 != null ? bundle2.hashCode() : 0)) * 31;
        Integer num = this.f40326s;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f40327t;
        if (num2 != null) {
            i = num2.hashCode();
        }
        int i19 = (hashCode10 + i) * 31;
        boolean z5 = this.f40328u;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z6 = this.f40329v;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        boolean z7 = this.f40330w;
        if (z7) {
            z7 = true;
        }
        int i28 = z7 ? 1 : 0;
        int i29 = z7 ? 1 : 0;
        int i30 = z7 ? 1 : 0;
        int i31 = (((i27 + i28) * 31) + this.f40331x) * 31;
        boolean z8 = this.f40332y;
        if (z8) {
            z8 = true;
        }
        int i32 = z8 ? 1 : 0;
        int i33 = z8 ? 1 : 0;
        int i34 = z8 ? 1 : 0;
        int i35 = (i31 + i32) * 31;
        boolean z9 = this.f40333z;
        if (z9) {
            z9 = true;
        }
        int i36 = z9 ? 1 : 0;
        int i37 = z9 ? 1 : 0;
        int i38 = z9 ? 1 : 0;
        int i39 = (((i35 + i36) * 31) + this.f40304A) * 31;
        boolean z10 = this.f40305B;
        if (z10) {
            z10 = true;
        }
        int i40 = z10 ? 1 : 0;
        int i41 = z10 ? 1 : 0;
        int i42 = z10 ? 1 : 0;
        int i43 = (i39 + i40) * 31;
        boolean z11 = this.f40306C;
        if (z11) {
            z11 = true;
        }
        int i44 = z11 ? 1 : 0;
        int i45 = z11 ? 1 : 0;
        int i46 = z11 ? 1 : 0;
        int i47 = (i43 + i44) * 31;
        if (!this.f40307D) {
            i2 = 0;
        }
        return i47 + i2;
    }

    public final String toString() {
        return "BulletPopUpConfig(sessionId=" + this.f40308a + ", mode=" + this.f40309b + ", extras=" + this.f40310c + ", triggerOrigin=" + this.f40311d + ", schema=" + this.f40312e + ", bundle=" + this.f40313f + ", width=" + this.f40314g + ", height=" + this.f40315h + ", touchLimit=" + this.f40316i + ", maskColor=" + this.f40317j + ", closeByMask=" + this.f40318k + ", closeByGesture=" + this.f40319l + ", keyboardStyle=" + this.f40320m + ", style=" + this.f40321n + ", blockBackPress=" + this.f40322o + ", listenKeyboard=" + this.f40323p + ", lastContainerID=" + this.f40324q + ", extraBundle=" + this.f40325r + ", screenWidth=" + this.f40326s + ", screenHeight=" + this.f40327t + ", ensureShowOnForeground=" + this.f40328u + ", showLoading=" + this.f40329v + ", showError=" + this.f40330w + ", radius=" + this.f40331x + ", closeByMaskUntilLoaded=" + this.f40332y + ", allowClosed=" + this.f40333z + ", dragMaxHeight=" + this.f40304A + ", dragByGesture=" + this.f40305B + ", dragFollowGesture=" + this.f40306C + ", dragBack=" + this.f40307D + ")";
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.c$a */
    public static final class C16940a {
        static {
            Covode.recordClassIndex(19382);
        }

        private C16940a() {
        }

        public /* synthetic */ C16940a(byte b) {
            this();
        }
    }

    private C16939c(String str, int i, JSONObject jSONObject, int i2, Uri uri, Bundle bundle, int i3, int i4, int i5, String str2, boolean z, boolean z2, JSONObject jSONObject2, JSONObject jSONObject3, boolean z3, boolean z4, String str3, Integer num, Integer num2, boolean z5, boolean z6, boolean z7, int i6, boolean z8, boolean z9, int i7, boolean z10, boolean z11, boolean z12) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f40308a = str;
        this.f40309b = i;
        this.f40310c = jSONObject;
        this.f40311d = i2;
        this.f40312e = uri;
        this.f40313f = bundle;
        this.f40314g = i3;
        this.f40315h = i4;
        this.f40316i = i5;
        this.f40317j = str2;
        this.f40318k = z;
        this.f40319l = z2;
        this.f40320m = jSONObject2;
        this.f40321n = jSONObject3;
        this.f40322o = z3;
        this.f40323p = z4;
        this.f40324q = str3;
        this.f40325r = null;
        this.f40326s = num;
        this.f40327t = num2;
        this.f40328u = z5;
        this.f40329v = z6;
        this.f40330w = z7;
        this.f40331x = i6;
        this.f40332y = z8;
        this.f40333z = z9;
        this.f40304A = i7;
        this.f40305B = z10;
        this.f40306C = z11;
        this.f40307D = z12;
    }

    public /* synthetic */ C16939c(String str, int i, JSONObject jSONObject, int i2, Uri uri, Bundle bundle, int i3, int i4, int i5, String str2, boolean z, boolean z2, JSONObject jSONObject2, JSONObject jSONObject3, boolean z3, boolean z4, String str3, Integer num, Integer num2, boolean z5, boolean z6, boolean z7, int i6, boolean z8, boolean z9, int i7, boolean z10, boolean z11, boolean z12, byte b) {
        this(str, i, jSONObject, i2, uri, bundle, i3, i4, i5, str2, z, z2, jSONObject2, jSONObject3, z3, z4, str3, num, num2, z5, z6, z7, i6, z8, z9, i7, z10, z11, z12);
    }
}

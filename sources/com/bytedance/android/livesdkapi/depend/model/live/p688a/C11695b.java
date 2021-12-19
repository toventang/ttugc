package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.b */
public final class C11695b {
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: a */
    public long f27976a;
    @AbstractC27891c(mo46611a = "combo_status")

    /* renamed from: b */
    public long f27977b;
    @AbstractC27891c(mo46611a = "combo_count")

    /* renamed from: c */
    public long f27978c;
    @AbstractC27891c(mo46611a = "combo_icon_url")

    /* renamed from: d */
    public String f27979d;
    @AbstractC27891c(mo46611a = "combo_type")

    /* renamed from: e */
    public int f27980e;
    @AbstractC27891c(mo46611a = "combo_rule_guide_schema")

    /* renamed from: f */
    public String f27981f;

    static {
        Covode.recordClassIndex(13383);
    }

    public C11695b(char c) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11695b)) {
            return false;
        }
        C11695b bVar = (C11695b) obj;
        return this.f27976a == bVar.f27976a && this.f27977b == bVar.f27977b && this.f27978c == bVar.f27978c && C89219l.m154714a(this.f27979d, bVar.f27979d) && this.f27980e == bVar.f27980e && C89219l.m154714a(this.f27981f, bVar.f27981f);
    }

    public final String toString() {
        return "BattleComboInfo(userId=" + this.f27976a + ", comboStatus=" + this.f27977b + ", comboCount=" + this.f27978c + ", comboIconUrl=" + this.f27979d + ", comboType=" + this.f27980e + ", comboRuleGuideSchema=" + this.f27981f + ")";
    }

    private C11695b() {
        this.f27976a = 0;
        this.f27977b = 0;
        this.f27978c = 0;
        this.f27979d = null;
        this.f27980e = 0;
        this.f27981f = null;
    }

    public final int hashCode() {
        int i;
        long j = this.f27976a;
        long j2 = this.f27977b;
        long j3 = this.f27978c;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str = this.f27979d;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (((i2 + i) * 31) + this.f27980e) * 31;
        String str2 = this.f27981f;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public /* synthetic */ C11695b(byte b) {
        this();
    }
}

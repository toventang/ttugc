package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.q */
public final class C46106q {

    /* renamed from: e */
    public static final C46107a f107359e = new C46107a((byte) 0);
    @AbstractC27891c(mo46611a = "anchor_business_type")

    /* renamed from: a */
    public int f107360a = -1;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: b */
    public int f107361b = 0;
    @AbstractC27891c(mo46611a = "anchor_id")

    /* renamed from: c */
    public String f107362c = null;
    @AbstractC27891c(mo46611a = "anchor_content")

    /* renamed from: d */
    public String f107363d = null;

    static {
        Covode.recordClassIndex(54664);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46106q)) {
            return false;
        }
        C46106q qVar = (C46106q) obj;
        return this.f107360a == qVar.f107360a && this.f107361b == qVar.f107361b && C89219l.m154714a(this.f107362c, qVar.f107362c) && C89219l.m154714a(this.f107363d, qVar.f107363d);
    }

    public final int hashCode() {
        int i = ((this.f107360a * 31) + this.f107361b) * 31;
        String str = this.f107362c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107363d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TempPublishAnchorModel(anchorBusinessType=" + this.f107360a + ", source=" + this.f107361b + ", anchorId=" + this.f107362c + ", anchorContent=" + this.f107363d + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.q$a */
    public static final class C46107a {
        static {
            Covode.recordClassIndex(54665);
        }

        private C46107a() {
        }

        public /* synthetic */ C46107a(byte b) {
            this();
        }
    }

    private C46106q() {
    }

    /* renamed from: a */
    public final boolean mo78293a() {
        if (this.f107360a != 0 || this.f107362c == null || this.f107363d == null) {
            return false;
        }
        return true;
    }
}

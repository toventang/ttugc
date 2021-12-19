package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.a */
public final class C34465a {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f81441a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    public final String f81442b;
    @AbstractC27891c(mo46611a = "anchor_list")

    /* renamed from: c */
    public final List<AnchorPublishStruct> f81443c;
    @AbstractC27891c(mo46611a = "register_region")

    /* renamed from: d */
    public final String f81444d;

    static {
        Covode.recordClassIndex(41418);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34465a)) {
            return false;
        }
        C34465a aVar = (C34465a) obj;
        return this.f81441a == aVar.f81441a && C89219l.m154714a(this.f81442b, aVar.f81442b) && C89219l.m154714a(this.f81443c, aVar.f81443c) && C89219l.m154714a(this.f81444d, aVar.f81444d);
    }

    public final int hashCode() {
        int i = this.f81441a * 31;
        String str = this.f81442b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<AnchorPublishStruct> list = this.f81443c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f81444d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AnchorListResp(statusCode=" + this.f81441a + ", statusMsg=" + this.f81442b + ", anchorList=" + this.f81443c + ", registerRegion=" + this.f81444d + ")";
    }
}

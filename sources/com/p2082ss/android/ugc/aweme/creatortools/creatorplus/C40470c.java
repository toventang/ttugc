package com.p2082ss.android.ugc.aweme.creatortools.creatorplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.c */
public final class C40470c {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    public final Integer f94705a;
    @AbstractC27891c(mo46611a = "image")

    /* renamed from: b */
    public final UrlModel f94706b;
    @AbstractC27891c(mo46611a = "is_accessible")

    /* renamed from: c */
    public final Boolean f94707c;
    @AbstractC27891c(mo46611a = "modal_info")

    /* renamed from: d */
    public final C40488h f94708d;
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: e */
    public final String f94709e;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: f */
    public final String f94710f;

    static {
        Covode.recordClassIndex(48277);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40470c)) {
            return false;
        }
        C40470c cVar = (C40470c) obj;
        return C89219l.m154714a(this.f94705a, cVar.f94705a) && C89219l.m154714a(this.f94706b, cVar.f94706b) && C89219l.m154714a(this.f94707c, cVar.f94707c) && C89219l.m154714a(this.f94708d, cVar.f94708d) && C89219l.m154714a(this.f94709e, cVar.f94709e) && C89219l.m154714a(this.f94710f, cVar.f94710f);
    }

    public final int hashCode() {
        Integer num = this.f94705a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        UrlModel urlModel = this.f94706b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        Boolean bool = this.f94707c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        C40488h hVar = this.f94708d;
        int hashCode4 = (hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str = this.f94709e;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94710f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "CreatorPlusFeature(id=" + this.f94705a + ", image=" + this.f94706b + ", isAccessible=" + this.f94707c + ", modalInfo=" + this.f94708d + ", name=" + this.f94709e + ", schema=" + this.f94710f + ")";
    }
}

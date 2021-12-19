package com.p2082ss.android.ugc.aweme.kids.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.a */
public final class C57743a {

    /* renamed from: a */
    public final UrlModel f131743a;

    /* renamed from: b */
    public final String f131744b;

    /* renamed from: c */
    public final String f131745c;

    /* renamed from: d */
    public final String f131746d;

    /* renamed from: e */
    public final AbstractC57153a f131747e;

    static {
        Covode.recordClassIndex(67728);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57743a)) {
            return false;
        }
        C57743a aVar = (C57743a) obj;
        return C89219l.m154714a(this.f131743a, aVar.f131743a) && C89219l.m154714a(this.f131744b, aVar.f131744b) && C89219l.m154714a(this.f131745c, aVar.f131745c) && C89219l.m154714a(this.f131746d, aVar.f131746d) && C89219l.m154714a(this.f131747e, aVar.f131747e);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f131743a;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f131744b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f131745c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f131746d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AbstractC57153a aVar = this.f131747e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "KidsProfileHeaderData(avatarModel=" + this.f131743a + ", userId=" + this.f131744b + ", secId=" + this.f131745c + ", username=" + this.f131746d + ", kidsUser=" + this.f131747e + ")";
    }

    public C57743a(UrlModel urlModel, String str, String str2, String str3, AbstractC57153a aVar) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(aVar, "");
        this.f131743a = urlModel;
        this.f131744b = str;
        this.f131745c = str2;
        this.f131746d = str3;
        this.f131747e = aVar;
    }
}

package com.p2082ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66358d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.model.e */
public final class C66292e {

    /* renamed from: a */
    public final String f149037a;

    /* renamed from: b */
    public final String f149038b;

    /* renamed from: c */
    public final String f149039c;

    /* renamed from: d */
    public final C66358d f149040d;

    /* renamed from: e */
    public final List<C66299k> f149041e;

    static {
        Covode.recordClassIndex(77801);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66292e)) {
            return false;
        }
        C66292e eVar = (C66292e) obj;
        return C89219l.m154714a(this.f149037a, eVar.f149037a) && C89219l.m154714a(this.f149038b, eVar.f149038b) && C89219l.m154714a(this.f149039c, eVar.f149039c) && C89219l.m154714a(this.f149040d, eVar.f149040d) && C89219l.m154714a(this.f149041e, eVar.f149041e);
    }

    public final int hashCode() {
        String str = this.f149037a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149038b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f149039c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C66358d dVar = this.f149040d;
        int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        List<C66299k> list = this.f149041e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "QnaCellDataAnswersSubsection(avatarUrlThumbnail=" + this.f149037a + ", avatarAdjacentTextDisplayName=" + this.f149038b + ", avatarAdjacentTextTimestamp=" + this.f149039c + ", profileData=" + this.f149040d + ", videoThumbnail=" + this.f149041e + ")";
    }

    public C66292e(String str, String str2, String str3, C66358d dVar, List<C66299k> list) {
        C89219l.m154721d(dVar, "");
        this.f149037a = str;
        this.f149038b = str2;
        this.f149039c = str3;
        this.f149040d = dVar;
        this.f149041e = list;
    }
}

package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.e */
public final class C61630e {
    @AbstractC27891c(mo46611a = "nid")

    /* renamed from: a */
    public final Long f139885a;
    @AbstractC27891c(mo46611a = "notice")

    /* renamed from: b */
    public final C61621c f139886b;
    @AbstractC27891c(mo46611a = "create_time")

    /* renamed from: c */
    public final Long f139887c;
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: d */
    public final Long f139888d;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: e */
    public final Integer f139889e;
    @AbstractC27891c(mo46611a = "nid_str")

    /* renamed from: f */
    public final String f139890f;
    @AbstractC27891c(mo46611a = "has_read")

    /* renamed from: g */
    public final boolean f139891g;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: h */
    public final String f139892h;
    @AbstractC27891c(mo46611a = "message_extra")

    /* renamed from: i */
    public final String f139893i;
    @AbstractC27891c(mo46611a = "should_keep")

    /* renamed from: j */
    public final boolean f139894j;
    @AbstractC27891c(mo46611a = "actions")

    /* renamed from: k */
    public final C61626a f139895k;
    @AbstractC27891c(mo46611a = "action_meta")

    /* renamed from: l */
    public final String f139896l;

    /* renamed from: m */
    public int f139897m;

    /* renamed from: n */
    public String f139898n;

    static {
        Covode.recordClassIndex(72357);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61630e)) {
            return false;
        }
        C61630e eVar = (C61630e) obj;
        return C89219l.m154714a(this.f139885a, eVar.f139885a) && C89219l.m154714a(this.f139886b, eVar.f139886b) && C89219l.m154714a(this.f139887c, eVar.f139887c) && C89219l.m154714a(this.f139888d, eVar.f139888d) && C89219l.m154714a(this.f139889e, eVar.f139889e) && C89219l.m154714a(this.f139890f, eVar.f139890f) && this.f139891g == eVar.f139891g && C89219l.m154714a(this.f139892h, eVar.f139892h) && C89219l.m154714a(this.f139893i, eVar.f139893i) && this.f139894j == eVar.f139894j && C89219l.m154714a(this.f139895k, eVar.f139895k) && C89219l.m154714a(this.f139896l, eVar.f139896l) && this.f139897m == eVar.f139897m && C89219l.m154714a(this.f139898n, eVar.f139898n);
    }

    public final int hashCode() {
        Long l = this.f139885a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        C61621c cVar = this.f139886b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Long l2 = this.f139887c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f139888d;
        int hashCode4 = (hashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Integer num = this.f139889e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f139890f;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f139891g;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        String str2 = this.f139892h;
        int hashCode7 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139893i;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        if (!this.f139894j) {
            i2 = 0;
        }
        int i7 = (hashCode8 + i2) * 31;
        C61626a aVar = this.f139895k;
        int hashCode9 = (i7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f139896l;
        int hashCode10 = (((hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f139897m) * 31;
        String str5 = this.f139898n;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "GeneralTemplateNotice(nid=" + this.f139885a + ", uiTemplate=" + this.f139886b + ", createTime=" + this.f139887c + ", userId=" + this.f139888d + ", type=" + this.f139889e + ", nidStr=" + this.f139890f + ", hasRead=" + this.f139891g + ", schemaUrl=" + this.f139892h + ", messageExtra=" + this.f139893i + ", shouldKeep=" + this.f139894j + ", actions=" + this.f139895k + ", actionMeta=" + this.f139896l + ", groupType=" + this.f139897m + ", accountType=" + this.f139898n + ")";
    }
}

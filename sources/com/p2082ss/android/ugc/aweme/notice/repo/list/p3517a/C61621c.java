package com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.a.c */
public final class C61621c {
    @AbstractC27891c(mo46611a = "avatar_image_url")

    /* renamed from: a */
    public final UrlModel f139840a;
    @AbstractC27891c(mo46611a = "avatar_schema_url")

    /* renamed from: b */
    public final String f139841b;
    @AbstractC27891c(mo46611a = "middle_type")

    /* renamed from: c */
    public final int f139842c;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: d */
    public final C61624f f139843d;
    @AbstractC27891c(mo46611a = "label")

    /* renamed from: e */
    public final C61620b f139844e;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: f */
    public final String f139845f;
    @AbstractC27891c(mo46611a = "event")

    /* renamed from: g */
    public final String f139846g;
    @AbstractC27891c(mo46611a = "quote_content")

    /* renamed from: h */
    public final String f139847h;
    @AbstractC27891c(mo46611a = "quote_image")

    /* renamed from: i */
    public final UrlModel f139848i;
    @AbstractC27891c(mo46611a = "middle_schema_url")

    /* renamed from: j */
    public final String f139849j;
    @AbstractC27891c(mo46611a = "right_type")

    /* renamed from: k */
    public final int f139850k;
    @AbstractC27891c(mo46611a = "image_url")

    /* renamed from: l */
    public final UrlModel f139851l;
    @AbstractC27891c(mo46611a = "button_content")

    /* renamed from: m */
    public final String f139852m;
    @AbstractC27891c(mo46611a = "button_type")

    /* renamed from: n */
    public final Integer f139853n;
    @AbstractC27891c(mo46611a = "right_schema_url")

    /* renamed from: o */
    public final String f139854o;
    @AbstractC27891c(mo46611a = "content_text_link_configs")

    /* renamed from: p */
    public final List<C61623e> f139855p;
    @AbstractC27891c(mo46611a = "buttons")

    /* renamed from: q */
    public final List<C61622d> f139856q;

    static {
        Covode.recordClassIndex(72317);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61621c)) {
            return false;
        }
        C61621c cVar = (C61621c) obj;
        return C89219l.m154714a(this.f139840a, cVar.f139840a) && C89219l.m154714a(this.f139841b, cVar.f139841b) && this.f139842c == cVar.f139842c && C89219l.m154714a(this.f139843d, cVar.f139843d) && C89219l.m154714a(this.f139844e, cVar.f139844e) && C89219l.m154714a(this.f139845f, cVar.f139845f) && C89219l.m154714a(this.f139846g, cVar.f139846g) && C89219l.m154714a(this.f139847h, cVar.f139847h) && C89219l.m154714a(this.f139848i, cVar.f139848i) && C89219l.m154714a(this.f139849j, cVar.f139849j) && this.f139850k == cVar.f139850k && C89219l.m154714a(this.f139851l, cVar.f139851l) && C89219l.m154714a(this.f139852m, cVar.f139852m) && C89219l.m154714a(this.f139853n, cVar.f139853n) && C89219l.m154714a(this.f139854o, cVar.f139854o) && C89219l.m154714a(this.f139855p, cVar.f139855p) && C89219l.m154714a(this.f139856q, cVar.f139856q);
    }

    public final int hashCode() {
        UrlModel urlModel = this.f139840a;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f139841b;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f139842c) * 31;
        C61624f fVar = this.f139843d;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        C61620b bVar = this.f139844e;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str2 = this.f139845f;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139846g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f139847h;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.f139848i;
        int hashCode8 = (hashCode7 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str5 = this.f139849j;
        int hashCode9 = (((hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f139850k) * 31;
        UrlModel urlModel3 = this.f139851l;
        int hashCode10 = (hashCode9 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        String str6 = this.f139852m;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f139853n;
        int hashCode12 = (hashCode11 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.f139854o;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<C61623e> list = this.f139855p;
        int hashCode14 = (hashCode13 + (list != null ? list.hashCode() : 0)) * 31;
        List<C61622d> list2 = this.f139856q;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode14 + i;
    }

    public final String toString() {
        return "NoticeUITemplate(avatarImageUrl=" + this.f139840a + ", avatarSchemaUrl=" + this.f139841b + ", middleType=" + this.f139842c + ", titleTemplate=" + this.f139843d + ", labelInfo=" + this.f139844e + ", content=" + this.f139845f + ", event=" + this.f139846g + ", quoteContent=" + this.f139847h + ", quoteImage=" + this.f139848i + ", middleSchemaUrl=" + this.f139849j + ", rightType=" + this.f139850k + ", rightImageUrl=" + this.f139851l + ", buttonContent=" + this.f139852m + ", buttonType=" + this.f139853n + ", rightSchemaUrl=" + this.f139854o + ", contentTextLinkConfigs=" + this.f139855p + ", bottomButtons=" + this.f139856q + ")";
    }
}

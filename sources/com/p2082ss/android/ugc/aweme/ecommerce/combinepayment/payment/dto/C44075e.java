package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27919i;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Icon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e */
public final class C44075e {

    /* renamed from: o */
    public static final C44076a f102741o = new C44076a((byte) 0);
    @AbstractC27891c(mo46611a = "element")

    /* renamed from: a */
    public final String f102742a;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: b */
    public final Icon f102743b;
    @AbstractC27891c(mo46611a = "inner_style_type")

    /* renamed from: c */
    public final Integer f102744c;
    @AbstractC27891c(mo46611a = "frontend_rule_list")

    /* renamed from: d */
    public final C27919i f102745d;
    @AbstractC27891c(mo46611a = "display_tag")

    /* renamed from: e */
    public final String f102746e;
    @AbstractC27891c(mo46611a = "param_name")

    /* renamed from: f */
    public final String f102747f;
    @AbstractC27891c(mo46611a = "option_list")

    /* renamed from: g */
    public final List<C44078g> f102748g;
    @AbstractC27891c(mo46611a = "placeholder_display_name")

    /* renamed from: h */
    public final String f102749h;
    @AbstractC27891c(mo46611a = "sub_element_list")

    /* renamed from: i */
    public final List<C44075e> f102750i;
    @AbstractC27891c(mo46611a = "display_name")

    /* renamed from: j */
    public final String f102751j;
    @AbstractC27891c(mo46611a = "need_encryption")

    /* renamed from: k */
    public final Boolean f102752k;
    @AbstractC27891c(mo46611a = "notification_url")

    /* renamed from: l */
    public final String f102753l;
    @AbstractC27891c(mo46611a = "inner_configuration")

    /* renamed from: m */
    public final C44074d f102754m;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: n */
    public final String f102755n;

    static {
        Covode.recordClassIndex(52386);
    }

    public C44075e() {
        this(null, null, 16383);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44075e)) {
            return false;
        }
        C44075e eVar = (C44075e) obj;
        return C89219l.m154714a(this.f102742a, eVar.f102742a) && C89219l.m154714a(this.f102743b, eVar.f102743b) && C89219l.m154714a(this.f102744c, eVar.f102744c) && C89219l.m154714a(this.f102745d, eVar.f102745d) && C89219l.m154714a(this.f102746e, eVar.f102746e) && C89219l.m154714a(this.f102747f, eVar.f102747f) && C89219l.m154714a(this.f102748g, eVar.f102748g) && C89219l.m154714a(this.f102749h, eVar.f102749h) && C89219l.m154714a(this.f102750i, eVar.f102750i) && C89219l.m154714a(this.f102751j, eVar.f102751j) && C89219l.m154714a(this.f102752k, eVar.f102752k) && C89219l.m154714a(this.f102753l, eVar.f102753l) && C89219l.m154714a(this.f102754m, eVar.f102754m) && C89219l.m154714a(this.f102755n, eVar.f102755n);
    }

    public final int hashCode() {
        String str = this.f102742a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Icon icon = this.f102743b;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 31;
        Integer num = this.f102744c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        C27919i iVar = this.f102745d;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str2 = this.f102746e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102747f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<C44078g> list = this.f102748g;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        String str4 = this.f102749h;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<C44075e> list2 = this.f102750i;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str5 = this.f102751j;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool = this.f102752k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str6 = this.f102753l;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 31;
        C44074d dVar = this.f102754m;
        int hashCode13 = (hashCode12 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str7 = this.f102755n;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode13 + i;
    }

    public final String toString() {
        return "ElementDTO(id=" + this.f102742a + ", icon=" + this.f102743b + ", styleType=" + this.f102744c + ", frontendRuleList=" + this.f102745d + ", displayTag=" + this.f102746e + ", paramName=" + this.f102747f + ", optionList=" + this.f102748g + ", placeholderDisplayName=" + this.f102749h + ", subElementDTOList=" + this.f102750i + ", displayName=" + this.f102751j + ", needEncryption=" + this.f102752k + ", notificationUrl=" + this.f102753l + ", configuration=" + this.f102754m + ", description=" + this.f102755n + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.e$a */
    public static final class C44076a {
        static {
            Covode.recordClassIndex(52387);
        }

        private C44076a() {
        }

        public /* synthetic */ C44076a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final List<C44075e> mo74915a() {
        List<C44075e> list = this.f102750i;
        if (list == null || list.isEmpty()) {
            return C89070n.m154516a(this);
        }
        List<C44075e> list2 = this.f102750i;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            C89070n.m154535a((Collection) arrayList, (Iterable) it.next().mo74915a());
        }
        return arrayList;
    }

    private C44075e(String str, String str2) {
        this.f102742a = str;
        this.f102743b = null;
        this.f102744c = null;
        this.f102745d = null;
        this.f102746e = null;
        this.f102747f = null;
        this.f102748g = null;
        this.f102749h = null;
        this.f102750i = null;
        this.f102751j = str2;
        this.f102752k = null;
        this.f102753l = null;
        this.f102754m = null;
        this.f102755n = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44075e(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 512) != 0 ? null : str2);
    }
}

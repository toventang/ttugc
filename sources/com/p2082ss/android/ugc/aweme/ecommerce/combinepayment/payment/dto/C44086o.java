package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45572m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o */
public final class C44086o {
    @AbstractC27891c(mo46611a = "payment_method_id")

    /* renamed from: a */
    public final String f102794a;
    @AbstractC27891c(mo46611a = "display_name")

    /* renamed from: b */
    public final String f102795b;
    @AbstractC27891c(mo46611a = "payment_method_first_type")

    /* renamed from: c */
    public final String f102796c;
    @AbstractC27891c(mo46611a = "payment_method_second_type")

    /* renamed from: d */
    public final String f102797d;
    @AbstractC27891c(mo46611a = "icon_url")

    /* renamed from: e */
    public final String f102798e;
    @AbstractC27891c(mo46611a = "elements")

    /* renamed from: f */
    public final List<C44075e> f102799f;
    @AbstractC27891c(mo46611a = "pci_sensitive")

    /* renamed from: g */
    public final Boolean f102800g;
    @AbstractC27891c(mo46611a = "sub_payment_methods")

    /* renamed from: h */
    public final List<C44086o> f102801h;
    @AbstractC27891c(mo46611a = "is_deeplink")

    /* renamed from: i */
    public final Boolean f102802i;
    @AbstractC27891c(mo46611a = "package_name")

    /* renamed from: j */
    public final String f102803j;
    @AbstractC27891c(mo46611a = "is_need_install_app")

    /* renamed from: k */
    public final Boolean f102804k;
    @AbstractC27891c(mo46611a = "extra_info")

    /* renamed from: l */
    public final String f102805l;
    @AbstractC27891c(mo46611a = "save_display_text")

    /* renamed from: m */
    public final String f102806m;
    @AbstractC27891c(mo46611a = "masked_identity")

    /* renamed from: n */
    public final String f102807n;
    @AbstractC27891c(mo46611a = "is_primary")

    /* renamed from: o */
    public final Boolean f102808o;
    @AbstractC27891c(mo46611a = "payment_method_token")

    /* renamed from: p */
    public final String f102809p;
    @AbstractC27891c(mo46611a = "save_notification_url")

    /* renamed from: q */
    public final String f102810q;
    @AbstractC27891c(mo46611a = "needed_elements")

    /* renamed from: r */
    public final List<C44075e> f102811r;
    @AbstractC27891c(mo46611a = "balance")

    /* renamed from: s */
    public final String f102812s;
    @AbstractC27891c(mo46611a = "availability")

    /* renamed from: t */
    public final C44071a f102813t;
    @AbstractC27891c(mo46611a = "bind_info")

    /* renamed from: u */
    public final C44073c f102814u;

    static {
        Covode.recordClassIndex(52397);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44086o)) {
            return false;
        }
        C44086o oVar = (C44086o) obj;
        return C89219l.m154714a(this.f102794a, oVar.f102794a) && C89219l.m154714a(this.f102795b, oVar.f102795b) && C89219l.m154714a(this.f102796c, oVar.f102796c) && C89219l.m154714a(this.f102797d, oVar.f102797d) && C89219l.m154714a(this.f102798e, oVar.f102798e) && C89219l.m154714a(this.f102799f, oVar.f102799f) && C89219l.m154714a(this.f102800g, oVar.f102800g) && C89219l.m154714a(this.f102801h, oVar.f102801h) && C89219l.m154714a(this.f102802i, oVar.f102802i) && C89219l.m154714a(this.f102803j, oVar.f102803j) && C89219l.m154714a(this.f102804k, oVar.f102804k) && C89219l.m154714a(this.f102805l, oVar.f102805l) && C89219l.m154714a(this.f102806m, oVar.f102806m) && C89219l.m154714a(this.f102807n, oVar.f102807n) && C89219l.m154714a(this.f102808o, oVar.f102808o) && C89219l.m154714a(this.f102809p, oVar.f102809p) && C89219l.m154714a(this.f102810q, oVar.f102810q) && C89219l.m154714a(this.f102811r, oVar.f102811r) && C89219l.m154714a(this.f102812s, oVar.f102812s) && C89219l.m154714a(this.f102813t, oVar.f102813t) && C89219l.m154714a(this.f102814u, oVar.f102814u);
    }

    public final int hashCode() {
        String str = this.f102794a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f102795b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102796c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f102797d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f102798e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<C44075e> list = this.f102799f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.f102800g;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<C44086o> list2 = this.f102801h;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool2 = this.f102802i;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str6 = this.f102803j;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool3 = this.f102804k;
        int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str7 = this.f102805l;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f102806m;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f102807n;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Boolean bool4 = this.f102808o;
        int hashCode15 = (hashCode14 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        String str10 = this.f102809p;
        int hashCode16 = (hashCode15 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f102810q;
        int hashCode17 = (hashCode16 + (str11 != null ? str11.hashCode() : 0)) * 31;
        List<C44075e> list3 = this.f102811r;
        int hashCode18 = (hashCode17 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str12 = this.f102812s;
        int hashCode19 = (hashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        C44071a aVar = this.f102813t;
        int hashCode20 = (hashCode19 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C44073c cVar = this.f102814u;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode20 + i;
    }

    public final String toString() {
        return "PaymentMethod(id=" + this.f102794a + ", displayName=" + this.f102795b + ", firstType=" + this.f102796c + ", secondType=" + this.f102797d + ", iconUrl=" + this.f102798e + ", elementDTOS=" + this.f102799f + ", pciSensitive=" + this.f102800g + ", subPaymentMethods=" + this.f102801h + ", isDeepLink=" + this.f102802i + ", packageName=" + this.f102803j + ", hideIfNotInstall=" + this.f102804k + ", extraInfo=" + this.f102805l + ", saveDisplayText=" + this.f102806m + ", maskedIdentity=" + this.f102807n + ", isPrimary=" + this.f102808o + ", token=" + this.f102809p + ", saveNotificationUrl=" + this.f102810q + ", neededElementDTOS=" + this.f102811r + ", balance=" + this.f102812s + ", availability=" + this.f102813t + ", bindInfo=" + this.f102814u + ")";
    }

    /* renamed from: a */
    public final List<C44075e> mo74949a() {
        List<C44075e> list = this.f102799f;
        if (list == null) {
            return this.f102811r;
        }
        return list;
    }

    /* renamed from: d */
    public final boolean mo74953d() {
        if (!(!C89219l.m154714a((Object) this.f102804k, (Object) true))) {
            String str = this.f102803j;
            if (str == null) {
                str = "";
            }
            if (C45572m.m88116a(str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo74952c() {
        boolean z;
        String str = this.f102797d;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z) || str == null) {
            str = this.f102796c;
        }
        if (str == null || str.length() == 0 || str == null) {
            return "unknown";
        }
        return str;
    }

    /* renamed from: b */
    public final List<C44084m> mo74951b() {
        ArrayList arrayList = new ArrayList();
        List<C44075e> list = this.f102811r;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<C44075e> a = it.next().mo74915a();
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
                for (T t : a) {
                    arrayList2.add(new C44084m(t.f102742a, t.f102747f, null, t.f102752k, null, 16, null));
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean mo74950a(C44086o oVar) {
        List<C44086o> list;
        if (oVar != null && (list = this.f102801h) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (C44083l.m86908a(next, oVar)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C44086o(String str, String str2, String str3, String str4, String str5, List<C44075e> list, Boolean bool, List<C44086o> list2, Boolean bool2, String str6, Boolean bool3, String str7, String str8, String str9, Boolean bool4, String str10, String str11, List<C44075e> list3, String str12, C44071a aVar, C44073c cVar) {
        this.f102794a = str;
        this.f102795b = str2;
        this.f102796c = str3;
        this.f102797d = str4;
        this.f102798e = str5;
        this.f102799f = list;
        this.f102800g = bool;
        this.f102801h = list2;
        this.f102802i = bool2;
        this.f102803j = str6;
        this.f102804k = bool3;
        this.f102805l = str7;
        this.f102806m = str8;
        this.f102807n = str9;
        this.f102808o = bool4;
        this.f102809p = str10;
        this.f102810q = str11;
        this.f102811r = list3;
        this.f102812s = str12;
        this.f102813t = aVar;
        this.f102814u = cVar;
    }
}

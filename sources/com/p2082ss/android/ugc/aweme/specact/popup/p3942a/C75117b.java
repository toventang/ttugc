package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.b */
public final class C75117b {
    @AbstractC27891c(mo46611a = "button_text")

    /* renamed from: a */
    public String f168858a;
    @AbstractC27891c(mo46611a = "button_link")

    /* renamed from: b */
    public String f168859b;
    @AbstractC27891c(mo46611a = "button_image")

    /* renamed from: c */
    public String f168860c;
    @AbstractC27891c(mo46611a = "parameters")

    /* renamed from: d */
    public List<String> f168861d;
    @AbstractC27891c(mo46611a = "button_action")

    /* renamed from: e */
    public int f168862e;
    @AbstractC27891c(mo46611a = "button_client_action")

    /* renamed from: f */
    public int f168863f;
    @AbstractC27891c(mo46611a = "service_call_actions")

    /* renamed from: g */
    public List<C75123h> f168864g;

    static {
        Covode.recordClassIndex(87990);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75117b)) {
            return false;
        }
        C75117b bVar = (C75117b) obj;
        return C89219l.m154714a(this.f168858a, bVar.f168858a) && C89219l.m154714a(this.f168859b, bVar.f168859b) && C89219l.m154714a(this.f168860c, bVar.f168860c) && C89219l.m154714a(this.f168861d, bVar.f168861d) && this.f168862e == bVar.f168862e && this.f168863f == bVar.f168863f && C89219l.m154714a(this.f168864g, bVar.f168864g);
    }

    public final int hashCode() {
        String str = this.f168858a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f168859b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f168860c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list = this.f168861d;
        int hashCode4 = (((((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f168862e) * 31) + this.f168863f) * 31;
        List<C75123h> list2 = this.f168864g;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ButtonInfo(buttonText=" + this.f168858a + ", buttonLink=" + this.f168859b + ", buttonImage=" + this.f168860c + ", parameters=" + this.f168861d + ", buttonActionType=" + this.f168862e + ", buttonClientAction=" + this.f168863f + ", serviceCallActions=" + this.f168864g + ")";
    }

    private /* synthetic */ C75117b() {
        this("", "", "", new ArrayList(), new ArrayList());
    }

    private C75117b(String str, String str2, String str3, List<String> list, List<C75123h> list2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f168858a = str;
        this.f168859b = str2;
        this.f168860c = str3;
        this.f168861d = list;
        this.f168862e = 0;
        this.f168863f = -1;
        this.f168864g = list2;
    }
}

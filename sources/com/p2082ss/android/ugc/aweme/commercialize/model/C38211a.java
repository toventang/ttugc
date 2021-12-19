package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.a */
public final class C38211a implements Serializable {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    private int f90257a;
    @AbstractC27891c(mo46611a = "pure_text")

    /* renamed from: b */
    private String f90258b;
    @AbstractC27891c(mo46611a = "spliced_texts")

    /* renamed from: c */
    private List<C38258v> f90259c;

    static {
        Covode.recordClassIndex(45695);
    }

    public C38211a() {
        this(0, null, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_AdDisclaimer_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77588x389810b8(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38211a copy$default(C38211a aVar, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aVar.f90257a;
        }
        if ((i2 & 2) != 0) {
            str = aVar.f90258b;
        }
        if ((i2 & 4) != 0) {
            list = aVar.f90259c;
        }
        return aVar.copy(i, str, list);
    }

    public final int component1() {
        return this.f90257a;
    }

    public final String component2() {
        return this.f90258b;
    }

    public final List<C38258v> component3() {
        return this.f90259c;
    }

    public final C38211a copy(int i, String str, List<C38258v> list) {
        C89219l.m154721d(str, "");
        return new C38211a(i, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38211a)) {
            return false;
        }
        C38211a aVar = (C38211a) obj;
        return this.f90257a == aVar.f90257a && C89219l.m154714a(this.f90258b, aVar.f90258b) && C89219l.m154714a(this.f90259c, aVar.f90259c);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdDisclaimer_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77588x389810b8(this.f90257a) * 31;
        String str = this.f90258b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdDisclaimer_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<C38258v> list = this.f90259c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AdDisclaimer(type=" + this.f90257a + ", pureText=" + this.f90258b + ", textList=" + this.f90259c + ")";
    }

    public final String getPureText() {
        return this.f90258b;
    }

    public final List<C38258v> getTextList() {
        return this.f90259c;
    }

    public final int getType() {
        return this.f90257a;
    }

    public final void setTextList(List<C38258v> list) {
        this.f90259c = list;
    }

    public final void setType(int i) {
        this.f90257a = i;
    }

    public final void setPureText(String str) {
        C89219l.m154721d(str, "");
        this.f90258b = str;
    }

    public C38211a(int i, String str, List<C38258v> list) {
        C89219l.m154721d(str, "");
        this.f90257a = i;
        this.f90258b = str;
        this.f90259c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38211a(int i, String str, List list, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : list);
    }
}

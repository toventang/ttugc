package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.l */
public final class C38243l implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private int f90355a;
    @AbstractC27891c(mo46611a = "content")

    /* renamed from: b */
    private String f90356b;
    @AbstractC27891c(mo46611a = "show_interval")

    /* renamed from: c */
    private Integer f90357c;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: d */
    private String f90358d;
    @AbstractC27891c(mo46611a = "gecko_channel")

    /* renamed from: e */
    private List<String> f90359e;

    static {
        Covode.recordClassIndex(45727);
    }

    public C38243l() {
        this(0, null, null, null, null, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_AdQuestionnaire_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77598xf2da3716(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.l */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38243l copy$default(C38243l lVar, int i, String str, Integer num, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = lVar.f90355a;
        }
        if ((i2 & 2) != 0) {
            str = lVar.f90356b;
        }
        if ((i2 & 4) != 0) {
            num = lVar.f90357c;
        }
        if ((i2 & 8) != 0) {
            str2 = lVar.f90358d;
        }
        if ((i2 & 16) != 0) {
            list = lVar.f90359e;
        }
        return lVar.copy(i, str, num, str2, list);
    }

    public final int component1() {
        return this.f90355a;
    }

    public final String component2() {
        return this.f90356b;
    }

    public final Integer component3() {
        return this.f90357c;
    }

    public final String component4() {
        return this.f90358d;
    }

    public final List<String> component5() {
        return this.f90359e;
    }

    public final C38243l copy(int i, String str, Integer num, String str2, List<String> list) {
        return new C38243l(i, str, num, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38243l)) {
            return false;
        }
        C38243l lVar = (C38243l) obj;
        return this.f90355a == lVar.f90355a && C89219l.m154714a(this.f90356b, lVar.f90356b) && C89219l.m154714a(this.f90357c, lVar.f90357c) && C89219l.m154714a(this.f90358d, lVar.f90358d) && C89219l.m154714a(this.f90359e, lVar.f90359e);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdQuestionnaire_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77598xf2da3716(this.f90355a) * 31;
        String str = this.f90356b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdQuestionnaire_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f90357c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f90358d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f90359e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "AdQuestionnaire(id=" + this.f90355a + ", content=" + this.f90356b + ", showInterval=" + this.f90357c + ", schema=" + this.f90358d + ", geckoChannel=" + this.f90359e + ")";
    }

    public final String getContent() {
        return this.f90356b;
    }

    public final List<String> getGeckoChannel() {
        return this.f90359e;
    }

    public final int getId() {
        return this.f90355a;
    }

    public final String getSchema() {
        return this.f90358d;
    }

    public final Integer getShowInterval() {
        return this.f90357c;
    }

    public final void setContent(String str) {
        this.f90356b = str;
    }

    public final void setGeckoChannel(List<String> list) {
        this.f90359e = list;
    }

    public final void setId(int i) {
        this.f90355a = i;
    }

    public final void setSchema(String str) {
        this.f90358d = str;
    }

    public final void setShowInterval(Integer num) {
        this.f90357c = num;
    }

    public C38243l(int i, String str, Integer num, String str2, List<String> list) {
        this.f90355a = i;
        this.f90356b = str;
        this.f90357c = num;
        this.f90358d = str2;
        this.f90359e = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38243l(int i, String str, Integer num, String str2, List list, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? list : null);
    }
}

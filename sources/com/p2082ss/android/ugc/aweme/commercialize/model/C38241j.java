package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.j */
public final class C38241j implements Serializable {
    @AbstractC27891c(mo46611a = "entry_type")

    /* renamed from: a */
    private int f90352a;
    @AbstractC27891c(mo46611a = "lynx_scheme")

    /* renamed from: b */
    private String f90353b;
    @AbstractC27891c(mo46611a = "gecko_channel")

    /* renamed from: c */
    private List<String> f90354c;

    static {
        Covode.recordClassIndex(45725);
    }

    public C38241j() {
        this(0, null, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_AdLynxEntryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77597x11b63c58(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.commercialize.model.j */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38241j copy$default(C38241j jVar, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jVar.f90352a;
        }
        if ((i2 & 2) != 0) {
            str = jVar.f90353b;
        }
        if ((i2 & 4) != 0) {
            list = jVar.f90354c;
        }
        return jVar.copy(i, str, list);
    }

    public final int component1() {
        return this.f90352a;
    }

    public final String component2() {
        return this.f90353b;
    }

    public final List<String> component3() {
        return this.f90354c;
    }

    public final C38241j copy(int i, String str, List<String> list) {
        return new C38241j(i, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38241j)) {
            return false;
        }
        C38241j jVar = (C38241j) obj;
        return this.f90352a == jVar.f90352a && C89219l.m154714a(this.f90353b, jVar.f90353b) && C89219l.m154714a(this.f90354c, jVar.f90354c);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_commercialize_model_AdLynxEntryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m77597x11b63c58(this.f90352a) * 31;
        String str = this.f90353b;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_commercialize_model_AdLynxEntryData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.f90354c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AdLynxEntryData(entryType=" + this.f90352a + ", lynxScheme=" + this.f90353b + ", geckoChannel=" + this.f90354c + ")";
    }

    public final int getEntryType() {
        return this.f90352a;
    }

    public final List<String> getGeckoChannel() {
        return this.f90354c;
    }

    public final String getLynxScheme() {
        return this.f90353b;
    }

    public final void setEntryType(int i) {
        this.f90352a = i;
    }

    public final void setGeckoChannel(List<String> list) {
        this.f90354c = list;
    }

    public final void setLynxScheme(String str) {
        this.f90353b = str;
    }

    public C38241j(int i, String str, List<String> list) {
        this.f90352a = i;
        this.f90353b = str;
        this.f90354c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38241j(int i, String str, List list, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list);
    }
}

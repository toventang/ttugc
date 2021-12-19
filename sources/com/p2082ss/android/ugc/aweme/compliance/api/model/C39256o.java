package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.o */
public final class C39256o implements Serializable {
    @AbstractC27891c(mo46611a = "show_type")

    /* renamed from: a */
    private final int f92735a;
    @AbstractC27891c(mo46611a = "res_type")

    /* renamed from: b */
    private final int f92736b;
    @AbstractC27891c(mo46611a = "values")

    /* renamed from: c */
    private final List<C39257p> f92737c;
    @AbstractC27891c(mo46611a = "tips_type")

    /* renamed from: d */
    private final int f92738d;

    static {
        Covode.recordClassIndex(46914);
    }

    public C39256o() {
        this(0, 0, null, 0, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m79637x42054f87(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.o */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39256o copy$default(C39256o oVar, int i, int i2, List list, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = oVar.f92735a;
        }
        if ((i4 & 2) != 0) {
            i2 = oVar.f92736b;
        }
        if ((i4 & 4) != 0) {
            list = oVar.f92737c;
        }
        if ((i4 & 8) != 0) {
            i3 = oVar.f92738d;
        }
        return oVar.copy(i, i2, list, i3);
    }

    public final int component1() {
        return this.f92735a;
    }

    public final int component2() {
        return this.f92736b;
    }

    public final List<C39257p> component3() {
        return this.f92737c;
    }

    public final int component4() {
        return this.f92738d;
    }

    public final C39256o copy(int i, int i2, List<C39257p> list, int i3) {
        return new C39256o(i, i2, list, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39256o)) {
            return false;
        }
        C39256o oVar = (C39256o) obj;
        return this.f92735a == oVar.f92735a && this.f92736b == oVar.f92736b && C89219l.m154714a(this.f92737c, oVar.f92737c) && this.f92738d == oVar.f92738d;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m79637x42054f87(this.f92735a) * 31) + m79637x42054f87(this.f92736b)) * 31;
        List<C39257p> list = this.f92737c;
        return ((com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionItem_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31) + m79637x42054f87(this.f92738d);
    }

    public final int getResType() {
        return this.f92736b;
    }

    public final int getShowType() {
        return this.f92735a;
    }

    public final int getTipsType() {
        return this.f92738d;
    }

    public final List<C39257p> getValues() {
        return this.f92737c;
    }

    public final String toString() {
        return "{'show_type':" + this.f92735a + ", 'res_type':" + this.f92736b + ", 'values':" + this.f92737c + ", 'tips_type':" + this.f92738d + "}";
    }

    public final C39257p getTargetRestrictionOption(Integer num) {
        List<C39257p> list = this.f92737c;
        T t = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            int value = next.getValue();
            if (num != null && value == num.intValue()) {
                t = next;
                break;
            }
        }
        return t;
    }

    public C39256o(int i, int i2, List<C39257p> list, int i3) {
        this.f92735a = i;
        this.f92736b = i2;
        this.f92737c = list;
        this.f92738d = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39256o(int i, int i2, List list, int i3, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? 0 : i3);
    }
}

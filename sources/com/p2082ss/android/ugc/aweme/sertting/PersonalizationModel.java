package com.p2082ss.android.ugc.aweme.sertting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sertting.PersonalizationModel */
public final class PersonalizationModel {
    @AbstractC27891c(mo46611a = "biz_name")
    private final String bizName;
    @AbstractC27891c(mo46611a = "need_personalization")
    private final boolean needPersonalization;

    static {
        Covode.recordClassIndex(79504);
    }

    public PersonalizationModel() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ PersonalizationModel copy$default(PersonalizationModel personalizationModel, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = personalizationModel.bizName;
        }
        if ((i & 2) != 0) {
            z = personalizationModel.needPersonalization;
        }
        return personalizationModel.copy(str, z);
    }

    public final String component1() {
        return this.bizName;
    }

    public final boolean component2() {
        return this.needPersonalization;
    }

    public final PersonalizationModel copy(String str, boolean z) {
        C89219l.m154721d(str, "");
        return new PersonalizationModel(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizationModel)) {
            return false;
        }
        PersonalizationModel personalizationModel = (PersonalizationModel) obj;
        return C89219l.m154714a(this.bizName, personalizationModel.bizName) && this.needPersonalization == personalizationModel.needPersonalization;
    }

    public final int hashCode() {
        String str = this.bizName;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.needPersonalization;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "PersonalizationModel(bizName=" + this.bizName + ", needPersonalization=" + this.needPersonalization + ")";
    }

    public final String getBizName() {
        return this.bizName;
    }

    public final boolean getNeedPersonalization() {
        return this.needPersonalization;
    }

    public PersonalizationModel(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.bizName = str;
        this.needPersonalization = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersonalizationModel(String str, boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}

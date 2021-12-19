package com.p2082ss.android.ugc.aweme.setting;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.EoyHighlightConfig */
public final class EoyHighlightConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<EoyHighlightConfig> CREATOR = new C67956a();
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: a */
    private final List<String> f152243a;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: b */
    private final String f152244b;
    @AbstractC27891c(mo46611a = "is_eoy_campaign")

    /* renamed from: c */
    private final boolean f152245c;
    @AbstractC27891c(mo46611a = "effect_id")

    /* renamed from: d */
    private final String f152246d;
    @AbstractC27891c(mo46611a = "url")

    /* renamed from: e */
    private final String f152247e;

    static {
        Covode.recordClassIndex(80126);
    }

    public EoyHighlightConfig() {
        this(null, null, false, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.setting.EoyHighlightConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EoyHighlightConfig copy$default(EoyHighlightConfig eoyHighlightConfig, List list, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eoyHighlightConfig.f152243a;
        }
        if ((i & 2) != 0) {
            str = eoyHighlightConfig.f152244b;
        }
        if ((i & 4) != 0) {
            z = eoyHighlightConfig.f152245c;
        }
        if ((i & 8) != 0) {
            str2 = eoyHighlightConfig.f152246d;
        }
        if ((i & 16) != 0) {
            str3 = eoyHighlightConfig.f152247e;
        }
        return eoyHighlightConfig.copy(list, str, z, str2, str3);
    }

    public final List<String> component1() {
        return this.f152243a;
    }

    public final String component2() {
        return this.f152244b;
    }

    public final boolean component3() {
        return this.f152245c;
    }

    public final String component4() {
        return this.f152246d;
    }

    public final String component5() {
        return this.f152247e;
    }

    public final EoyHighlightConfig copy(List<String> list, String str, boolean z, String str2, String str3) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        return new EoyHighlightConfig(list, str, z, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EoyHighlightConfig)) {
            return false;
        }
        EoyHighlightConfig eoyHighlightConfig = (EoyHighlightConfig) obj;
        return C89219l.m154714a(this.f152243a, eoyHighlightConfig.f152243a) && C89219l.m154714a(this.f152244b, eoyHighlightConfig.f152244b) && this.f152245c == eoyHighlightConfig.f152245c && C89219l.m154714a(this.f152246d, eoyHighlightConfig.f152246d) && C89219l.m154714a(this.f152247e, eoyHighlightConfig.f152247e);
    }

    public final int hashCode() {
        List<String> list = this.f152243a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f152244b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f152245c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        String str2 = this.f152246d;
        int hashCode3 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f152247e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "EoyHighlightConfig(text=" + this.f152243a + ", color=" + this.f152244b + ", isEoyCampaign=" + this.f152245c + ", effectId=" + this.f152246d + ", hubUrl=" + this.f152247e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeStringList(this.f152243a);
        parcel.writeString(this.f152244b);
        parcel.writeInt(this.f152245c ? 1 : 0);
        parcel.writeString(this.f152246d);
        parcel.writeString(this.f152247e);
    }

    public final String getColor() {
        return this.f152244b;
    }

    public final String getEffectId() {
        return this.f152246d;
    }

    public final String getHubUrl() {
        return this.f152247e;
    }

    public final List<String> getText() {
        return this.f152243a;
    }

    public final boolean isEoyCampaign() {
        return this.f152245c;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.EoyHighlightConfig$a */
    public static class C67956a implements Parcelable.Creator<EoyHighlightConfig> {
        static {
            Covode.recordClassIndex(80127);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EoyHighlightConfig[] newArray(int i) {
            return new EoyHighlightConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EoyHighlightConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EoyHighlightConfig(parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }
    }

    public EoyHighlightConfig(List<String> list, String str, boolean z, String str2, String str3) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        this.f152243a = list;
        this.f152244b = str;
        this.f152245c = z;
        this.f152246d = str2;
        this.f152247e = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EoyHighlightConfig(List list, String str, boolean z, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? C89086z.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null);
    }
}

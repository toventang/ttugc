package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent */
public final class RedirectContent implements Parcelable {
    public static final Parcelable.Creator<RedirectContent> CREATOR = new C43608a();
    @AbstractC27891c(mo46611a = "close_page")
    private final Boolean closePage;
    @AbstractC27891c(mo46611a = "jump_schema")
    private final String jumpSchema;

    static {
        Covode.recordClassIndex(51862);
    }

    public static /* synthetic */ RedirectContent copy$default(RedirectContent redirectContent, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redirectContent.jumpSchema;
        }
        if ((i & 2) != 0) {
            bool = redirectContent.closePage;
        }
        return redirectContent.copy(str, bool);
    }

    public final String component1() {
        return this.jumpSchema;
    }

    public final Boolean component2() {
        return this.closePage;
    }

    public final RedirectContent copy(String str, Boolean bool) {
        return new RedirectContent(str, bool);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectContent)) {
            return false;
        }
        RedirectContent redirectContent = (RedirectContent) obj;
        return C89219l.m154714a(this.jumpSchema, redirectContent.jumpSchema) && C89219l.m154714a(this.closePage, redirectContent.closePage);
    }

    public final int hashCode() {
        String str = this.jumpSchema;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.closePage;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RedirectContent(jumpSchema=" + this.jumpSchema + ", closePage=" + this.closePage + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.jumpSchema);
        Boolean bool = this.closePage;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        parcel.writeInt(i2);
    }

    public final Boolean getClosePage() {
        return this.closePage;
    }

    public final String getJumpSchema() {
        return this.jumpSchema;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent$a */
    public static class C43608a implements Parcelable.Creator<RedirectContent> {
        static {
            Covode.recordClassIndex(51863);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RedirectContent[] newArray(int i) {
            return new RedirectContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RedirectContent createFromParcel(Parcel parcel) {
            Boolean bool;
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new RedirectContent(readString, bool);
        }
    }

    public RedirectContent(String str, Boolean bool) {
        this.jumpSchema = str;
        this.closePage = bool;
    }
}

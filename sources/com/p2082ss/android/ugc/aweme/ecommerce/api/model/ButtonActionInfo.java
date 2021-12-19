package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo */
public final class ButtonActionInfo implements Parcelable {
    public static final Parcelable.Creator<ButtonActionInfo> CREATOR = new C43599a();
    @AbstractC27891c(mo46611a = "fetch_info")
    private final FetchInfo fetchInfo;
    @AbstractC27891c(mo46611a = "schema")
    private final String schema;

    static {
        Covode.recordClassIndex(51844);
    }

    public static /* synthetic */ ButtonActionInfo copy$default(ButtonActionInfo buttonActionInfo, String str, FetchInfo fetchInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonActionInfo.schema;
        }
        if ((i & 2) != 0) {
            fetchInfo2 = buttonActionInfo.fetchInfo;
        }
        return buttonActionInfo.copy(str, fetchInfo2);
    }

    public final String component1() {
        return this.schema;
    }

    public final FetchInfo component2() {
        return this.fetchInfo;
    }

    public final ButtonActionInfo copy(String str, FetchInfo fetchInfo2) {
        return new ButtonActionInfo(str, fetchInfo2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonActionInfo)) {
            return false;
        }
        ButtonActionInfo buttonActionInfo = (ButtonActionInfo) obj;
        return C89219l.m154714a(this.schema, buttonActionInfo.schema) && C89219l.m154714a(this.fetchInfo, buttonActionInfo.fetchInfo);
    }

    public final int hashCode() {
        String str = this.schema;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        FetchInfo fetchInfo2 = this.fetchInfo;
        if (fetchInfo2 != null) {
            i = fetchInfo2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ButtonActionInfo(schema=" + this.schema + ", fetchInfo=" + this.fetchInfo + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.schema);
        FetchInfo fetchInfo2 = this.fetchInfo;
        if (fetchInfo2 != null) {
            parcel.writeInt(1);
            fetchInfo2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final FetchInfo getFetchInfo() {
        return this.fetchInfo;
    }

    public final String getSchema() {
        return this.schema;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo$a */
    public static class C43599a implements Parcelable.Creator<ButtonActionInfo> {
        static {
            Covode.recordClassIndex(51845);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ButtonActionInfo[] newArray(int i) {
            return new ButtonActionInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ButtonActionInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ButtonActionInfo(parcel.readString(), parcel.readInt() != 0 ? FetchInfo.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public ButtonActionInfo(String str, FetchInfo fetchInfo2) {
        this.schema = str;
        this.fetchInfo = fetchInfo2;
    }
}

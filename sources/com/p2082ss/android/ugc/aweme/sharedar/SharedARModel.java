package com.p2082ss.android.ugc.aweme.sharedar;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharedar.SharedARModel */
public final class SharedARModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SharedARModel> CREATOR = new C69510a();
    @AbstractC27891c(mo46611a = "shared_ar_multi_player_user_id")

    /* renamed from: a */
    private String f155287a;
    @AbstractC27891c(mo46611a = "shared_ar_multi_player_user_name")

    /* renamed from: b */
    private String f155288b;
    @AbstractC27891c(mo46611a = "shared_ar_session_id")

    /* renamed from: c */
    private String f155289c;
    @AbstractC27891c(mo46611a = "is_current_user_host")

    /* renamed from: d */
    private boolean f155290d;
    @AbstractC27891c(mo46611a = "shared_ar_telco")

    /* renamed from: e */
    private String f155291e;

    static {
        Covode.recordClassIndex(81851);
    }

    public SharedARModel() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ SharedARModel copy$default(SharedARModel sharedARModel, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedARModel.f155287a;
        }
        if ((i & 2) != 0) {
            str2 = sharedARModel.f155288b;
        }
        if ((i & 4) != 0) {
            str3 = sharedARModel.f155289c;
        }
        if ((i & 8) != 0) {
            z = sharedARModel.f155290d;
        }
        if ((i & 16) != 0) {
            str4 = sharedARModel.f155291e;
        }
        return sharedARModel.copy(str, str2, str3, z, str4);
    }

    public final String component1() {
        return this.f155287a;
    }

    public final String component2() {
        return this.f155288b;
    }

    public final String component3() {
        return this.f155289c;
    }

    public final boolean component4() {
        return this.f155290d;
    }

    public final String component5() {
        return this.f155291e;
    }

    public final SharedARModel copy(String str, String str2, String str3, boolean z, String str4) {
        return new SharedARModel(str, str2, str3, z, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedARModel)) {
            return false;
        }
        SharedARModel sharedARModel = (SharedARModel) obj;
        return C89219l.m154714a(this.f155287a, sharedARModel.f155287a) && C89219l.m154714a(this.f155288b, sharedARModel.f155288b) && C89219l.m154714a(this.f155289c, sharedARModel.f155289c) && this.f155290d == sharedARModel.f155290d && C89219l.m154714a(this.f155291e, sharedARModel.f155291e);
    }

    public final int hashCode() {
        String str = this.f155287a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f155288b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f155289c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f155290d;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        String str4 = this.f155291e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "SharedARModel(sharedARMultiPlayerUserId=" + this.f155287a + ", sharedARMultiPlayerUserName=" + this.f155288b + ", sharedARSessionId=" + this.f155289c + ", isCurrentUserHost=" + this.f155290d + ", sharedARTelco=" + this.f155291e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f155287a);
        parcel.writeString(this.f155288b);
        parcel.writeString(this.f155289c);
        parcel.writeInt(this.f155290d ? 1 : 0);
        parcel.writeString(this.f155291e);
    }

    public final String getSharedARMultiPlayerUserId() {
        return this.f155287a;
    }

    public final String getSharedARMultiPlayerUserName() {
        return this.f155288b;
    }

    public final String getSharedARSessionId() {
        return this.f155289c;
    }

    public final String getSharedARTelco() {
        return this.f155291e;
    }

    public final boolean isCurrentUserHost() {
        return this.f155290d;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.SharedARModel$a */
    public static class C69510a implements Parcelable.Creator<SharedARModel> {
        static {
            Covode.recordClassIndex(81852);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharedARModel[] newArray(int i) {
            return new SharedARModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharedARModel createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new SharedARModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }
    }

    public final void setCurrentUserHost(boolean z) {
        this.f155290d = z;
    }

    public final void setSharedARMultiPlayerUserId(String str) {
        this.f155287a = str;
    }

    public final void setSharedARMultiPlayerUserName(String str) {
        this.f155288b = str;
    }

    public final void setSharedARSessionId(String str) {
        this.f155289c = str;
    }

    public final void setSharedARTelco(String str) {
        this.f155291e = str;
    }

    public SharedARModel(String str, String str2, String str3, boolean z, String str4) {
        this.f155287a = str;
        this.f155288b = str2;
        this.f155289c = str3;
        this.f155290d = z;
        this.f155291e = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedARModel(String str, String str2, String str3, boolean z, String str4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? str4 : null);
    }
}

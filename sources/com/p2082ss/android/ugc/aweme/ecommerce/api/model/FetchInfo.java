package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo */
public final class FetchInfo implements Parcelable {
    public static final Parcelable.Creator<FetchInfo> CREATOR = new C43603a();
    @AbstractC27891c(mo46611a = "fetch_api_type")
    private final Integer fetchAPI;
    @AbstractC27891c(mo46611a = "server_issued_params")
    private final String serverIssuedParams;

    static {
        Covode.recordClassIndex(51852);
    }

    public static /* synthetic */ FetchInfo copy$default(FetchInfo fetchInfo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = fetchInfo.fetchAPI;
        }
        if ((i & 2) != 0) {
            str = fetchInfo.serverIssuedParams;
        }
        return fetchInfo.copy(num, str);
    }

    public final Integer component1() {
        return this.fetchAPI;
    }

    public final String component2() {
        return this.serverIssuedParams;
    }

    public final FetchInfo copy(Integer num, String str) {
        return new FetchInfo(num, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchInfo)) {
            return false;
        }
        FetchInfo fetchInfo = (FetchInfo) obj;
        return C89219l.m154714a(this.fetchAPI, fetchInfo.fetchAPI) && C89219l.m154714a(this.serverIssuedParams, fetchInfo.serverIssuedParams);
    }

    public final int hashCode() {
        Integer num = this.fetchAPI;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.serverIssuedParams;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FetchInfo(fetchAPI=" + this.fetchAPI + ", serverIssuedParams=" + this.serverIssuedParams + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C89219l.m154721d(parcel, "");
        Integer num = this.fetchAPI;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.serverIssuedParams);
    }

    public final Integer getFetchAPI() {
        return this.fetchAPI;
    }

    public final String getServerIssuedParams() {
        return this.serverIssuedParams;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo$a */
    public static class C43603a implements Parcelable.Creator<FetchInfo> {
        static {
            Covode.recordClassIndex(51853);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FetchInfo[] newArray(int i) {
            return new FetchInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FetchInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new FetchInfo(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }
    }

    public FetchInfo(Integer num, String str) {
        this.fetchAPI = num;
        this.serverIssuedParams = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchInfo(Integer num, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : num, str);
    }
}

package com.p2082ss.android.ugc.aweme.tools;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.ToolsUrlModel */
public class ToolsUrlModel implements Parcelable {
    public static final Parcelable.Creator<ToolsUrlModel> CREATOR = new Parcelable.Creator<ToolsUrlModel>() {
        /* class com.p2082ss.android.ugc.aweme.tools.ToolsUrlModel.C778031 */

        static {
            Covode.recordClassIndex(90887);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ToolsUrlModel[] newArray(int i) {
            return new ToolsUrlModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ToolsUrlModel createFromParcel(Parcel parcel) {
            return new ToolsUrlModel(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: a */
    public String f174537a;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: b */
    public List<String> f174538b;

    public int describeContents() {
        return 0;
    }

    public ToolsUrlModel() {
    }

    static {
        Covode.recordClassIndex(90886);
    }

    public int hashCode() {
        return (this.f174537a.hashCode() * 31) + this.f174538b.hashCode();
    }

    public String toString() {
        return "ToolsUrlModel{uri='" + this.f174537a + '\'' + ", urlList=" + this.f174538b + '}';
    }

    protected ToolsUrlModel(Parcel parcel) {
        this.f174537a = parcel.readString();
        this.f174538b = parcel.createStringArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToolsUrlModel toolsUrlModel = (ToolsUrlModel) obj;
        if (!this.f174537a.equals(toolsUrlModel.f174537a)) {
            return false;
        }
        return this.f174538b.equals(toolsUrlModel.f174538b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f174537a);
        parcel.writeStringList(this.f174538b);
    }
}

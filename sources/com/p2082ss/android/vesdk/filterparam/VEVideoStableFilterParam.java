package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEVideoStableFilterParam */
public class VEVideoStableFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoStableFilterParam> CREATOR = new Parcelable.Creator<VEVideoStableFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VEVideoStableFilterParam.C855051 */

        static {
            Covode.recordClassIndex(99660);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEVideoStableFilterParam[] newArray(int i) {
            return new VEVideoStableFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEVideoStableFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoStableFilterParam(parcel);
        }
    };

    /* renamed from: a */
    public String f191456a;

    /* renamed from: b */
    public String f191457b;

    /* renamed from: c */
    public int f191458c;

    /* renamed from: d */
    public int f191459d;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99659);
    }

    public VEVideoStableFilterParam() {
        this.filterName = "video stable filter";
        this.filterType = 27;
        this.filterDurationType = 1;
        this.f191456a = "";
        this.f191457b = "";
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoStableFilterParam{ptsMatrix=" + this.f191456a + ", videoStabMatrix='" + this.f191457b + '\'' + ", filterType=" + this.filterType + '\'' + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '\'' + ", width=" + this.f191458c + '\'' + ", height=" + this.f191459d + '\'' + '}';
    }

    protected VEVideoStableFilterParam(Parcel parcel) {
        super(parcel);
        this.f191456a = parcel.readString();
        this.f191457b = parcel.readString();
        this.f191458c = parcel.readInt();
        this.f191459d = parcel.readInt();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f191456a);
        parcel.writeString(this.f191457b);
        parcel.writeInt(this.f191458c);
        parcel.writeInt(this.f191459d);
    }
}

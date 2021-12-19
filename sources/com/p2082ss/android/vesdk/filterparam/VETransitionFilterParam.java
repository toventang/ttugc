package com.p2082ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VETransitionFilterParam */
public class VETransitionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VETransitionFilterParam> CREATOR = new Parcelable.Creator<VETransitionFilterParam>() {
        /* class com.p2082ss.android.vesdk.filterparam.VETransitionFilterParam.C855011 */

        static {
            Covode.recordClassIndex(99652);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VETransitionFilterParam[] newArray(int i) {
            return new VETransitionFilterParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VETransitionFilterParam createFromParcel(Parcel parcel) {
            return new VETransitionFilterParam(parcel);
        }
    };
    public int tranDuration;
    public int tranType;
    public String transName;

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(99651);
    }

    public VETransitionFilterParam() {
        this.filterName = "tran filter";
        this.filterType = 14;
        this.transName = "";
        this.tranType = EnumC85502a.TransitionType_DEFAULT.ordinal();
        this.tranDuration = 500;
    }

    /* renamed from: com.ss.android.vesdk.filterparam.VETransitionFilterParam$a */
    public enum EnumC85502a {
        TransitionType_DEFAULT,
        TransitionType_VARIABLE_TIME,
        TransitionType_SINGLE;

        static {
            Covode.recordClassIndex(99653);
        }
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VETransitionFilterParam{transName='" + this.transName + '\'' + ", tranType=" + this.tranType + ", tranDuration=" + this.tranDuration + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VETransitionFilterParam(Parcel parcel) {
        super(parcel);
        this.transName = parcel.readString();
        this.tranType = parcel.readInt();
        this.tranDuration = parcel.readInt();
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.transName);
        parcel.writeInt(this.tranType);
        parcel.writeInt(this.tranDuration);
    }
}

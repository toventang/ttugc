package com.p2082ss.android.ugc.aweme.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.NewUserCount */
public class NewUserCount extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<NewUserCount> CREATOR = new Parcelable.Creator<NewUserCount>() {
        /* class com.p2082ss.android.ugc.aweme.profile.model.NewUserCount.C638171 */

        static {
            Covode.recordClassIndex(75193);
        }

        @Override // android.os.Parcelable.Creator
        public final NewUserCount[] newArray(int i) {
            return new NewUserCount[i];
        }

        @Override // android.os.Parcelable.Creator
        public final NewUserCount createFromParcel(Parcel parcel) {
            return new NewUserCount(parcel);
        }
    };
    public int count;

    public int describeContents() {
        return 0;
    }

    public NewUserCount() {
    }

    static {
        Covode.recordClassIndex(75192);
    }

    public NewUserCount(int i) {
        this.count = i;
    }

    protected NewUserCount(Parcel parcel) {
        this.count = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
    }
}

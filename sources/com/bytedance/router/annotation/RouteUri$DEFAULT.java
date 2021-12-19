package com.bytedance.router.annotation;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class RouteUri$DEFAULT implements IRouteArg {
    public static final Parcelable.Creator<RouteUri$DEFAULT> CREATOR = new Parcelable.Creator<RouteUri$DEFAULT>() {
        /* class com.bytedance.router.annotation.RouteUri$DEFAULT.C221091 */

        static {
            Covode.recordClassIndex(25848);
        }

        @Override // android.os.Parcelable.Creator
        public final RouteUri$DEFAULT[] newArray(int i) {
            return new RouteUri$DEFAULT[i];
        }

        @Override // android.os.Parcelable.Creator
        public final RouteUri$DEFAULT createFromParcel(Parcel parcel) {
            return new RouteUri$DEFAULT();
        }
    };

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    static {
        Covode.recordClassIndex(25847);
    }
}

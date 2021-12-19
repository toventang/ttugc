package com.p2082ss.android.ugc.aweme.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.ZoomAnimationUtils */
public final class ZoomAnimationUtils {
    static {
        Covode.recordClassIndex(93446);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ZoomAnimationUtils$ZoomInfo */
    public static class ZoomInfo implements Parcelable {
        public static final Parcelable.Creator<ZoomInfo> CREATOR = new Parcelable.Creator<ZoomInfo>() {
            /* class com.p2082ss.android.ugc.aweme.utils.ZoomAnimationUtils.ZoomInfo.C801801 */

            static {
                Covode.recordClassIndex(93448);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ZoomInfo[] newArray(int i) {
                return new ZoomInfo[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ZoomInfo createFromParcel(Parcel parcel) {
                return new ZoomInfo(parcel);
            }
        };

        /* renamed from: a */
        public int f179628a;

        /* renamed from: b */
        public int f179629b;

        /* renamed from: c */
        public int f179630c;

        /* renamed from: d */
        public int f179631d;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(93447);
        }

        protected ZoomInfo(Parcel parcel) {
            this.f179628a = parcel.readInt();
            this.f179629b = parcel.readInt();
            this.f179630c = parcel.readInt();
            this.f179631d = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f179628a);
            parcel.writeInt(this.f179629b);
            parcel.writeInt(this.f179630c);
            parcel.writeInt(this.f179631d);
        }

        public ZoomInfo(int i, int i2, int i3, int i4) {
            this.f179628a = i;
            this.f179629b = i2;
            this.f179630c = i3;
            this.f179631d = i4;
        }
    }

    /* renamed from: a */
    public static ZoomInfo m138997a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new ZoomInfo(iArr[0], iArr[1], view.getWidth(), view.getHeight());
    }
}

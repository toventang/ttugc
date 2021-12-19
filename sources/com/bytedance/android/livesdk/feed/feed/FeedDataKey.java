package com.bytedance.android.livesdk.feed.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class FeedDataKey implements Parcelable {
    public static final Parcelable.Creator<FeedDataKey> CREATOR = new Parcelable.Creator<FeedDataKey>() {
        /* class com.bytedance.android.livesdk.feed.feed.FeedDataKey.C85811 */

        static {
            Covode.recordClassIndex(9438);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FeedDataKey[] newArray(int i) {
            return new FeedDataKey[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FeedDataKey createFromParcel(Parcel parcel) {
            return new FeedDataKey(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), (byte) 0);
        }
    };

    /* renamed from: d */
    private static final Integer f21203d = 1;

    /* renamed from: e */
    private static final Integer f21204e = 0;

    /* renamed from: f */
    private static final Integer f21205f = 31;

    /* renamed from: a */
    public String f21206a;

    /* renamed from: b */
    public String f21207b;

    /* renamed from: c */
    public long f21208c;

    /* renamed from: g */
    private int f21209g;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(9437);
    }

    public int hashCode() {
        int i;
        Integer num = f21205f;
        int intValue = num.intValue();
        String str = this.f21207b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int intValue2 = num.intValue() * (intValue + i);
        String str2 = this.f21206a;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (num.intValue() * (intValue2 + i2)) + Long.valueOf(this.f21208c).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("label: ");
        String str = this.f21207b;
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append("; url: ");
        String str3 = this.f21206a;
        if (str3 != null) {
            str2 = str3;
        }
        return append.append(str2).append("; id: ").append(this.f21208c).append("; repeatCheck: ").append(this.f21209g).toString();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof FeedDataKey)) {
            FeedDataKey feedDataKey = (FeedDataKey) obj;
            if (!TextUtils.equals(this.f21207b, feedDataKey.f21207b) || !TextUtils.equals(this.f21206a, feedDataKey.f21206a) || this.f21208c != feedDataKey.f21208c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21207b);
        parcel.writeString(this.f21206a);
        parcel.writeLong(this.f21208c);
        parcel.writeInt(this.f21209g);
    }

    /* renamed from: a */
    public static FeedDataKey m16810a(String str, String str2, long j) {
        int intValue = f21203d.intValue();
        if (!TextUtils.isEmpty(str)) {
            return new FeedDataKey(str, str2, j, intValue);
        }
        throw new IllegalArgumentException("label must not be null or empty");
    }

    private FeedDataKey(String str, String str2, long j, int i) {
        this.f21206a = "";
        this.f21207b = "";
        this.f21208c = Long.MIN_VALUE;
        this.f21209g = f21203d.intValue();
        this.f21207b = str;
        this.f21206a = str2;
        this.f21208c = j;
        this.f21209g = i;
    }

    /* synthetic */ FeedDataKey(String str, String str2, long j, int i, byte b) {
        this(str, str2, j, i);
    }
}

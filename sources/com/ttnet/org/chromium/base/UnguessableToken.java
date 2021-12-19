package com.ttnet.org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new Parcelable.Creator<UnguessableToken>() {
        /* class com.ttnet.org.chromium.base.UnguessableToken.C874401 */

        static {
            Covode.recordClassIndex(103369);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UnguessableToken[] newArray(int i) {
            return new UnguessableToken[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            return new UnguessableToken(readLong, readLong2, (byte) 0);
        }
    };

    /* renamed from: a */
    private final long f198334a;

    /* renamed from: b */
    private final long f198335b;

    public int describeContents() {
        return 0;
    }

    public long getHighForSerialization() {
        return this.f198334a;
    }

    public long getLowForSerialization() {
        return this.f198335b;
    }

    static {
        Covode.recordClassIndex(103368);
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    private UnguessableToken(long j, long j2) {
        this.f198334a = j;
        this.f198335b = j2;
    }

    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f198334a);
        parcel.writeLong(this.f198335b);
    }

    /* synthetic */ UnguessableToken(long j, long j2, byte b) {
        this(j, j2);
    }
}

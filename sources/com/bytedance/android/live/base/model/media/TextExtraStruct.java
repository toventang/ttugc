package com.bytedance.android.live.base.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class TextExtraStruct implements Parcelable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new Parcelable.Creator<TextExtraStruct>() {
        /* class com.bytedance.android.live.base.model.media.TextExtraStruct.C29841 */

        static {
            Covode.recordClassIndex(3437);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextExtraStruct[] newArray(int i) {
            return new TextExtraStruct[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextExtraStruct createFromParcel(Parcel parcel) {
            return new TextExtraStruct(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "end")
    private int end;
    private transient boolean isAddPosition;
    @AbstractC27891c(mo46611a = "start")
    private int start;
    @AbstractC27891c(mo46611a = "user_id")
    private long userId;

    public int describeContents() {
        return 0;
    }

    public TextExtraStruct() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isAddPosition() {
        return this.isAddPosition;
    }

    static {
        Covode.recordClassIndex(3436);
    }

    public void setAddPosition(boolean z) {
        this.isAddPosition = z;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    protected TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeLong(this.userId);
    }
}

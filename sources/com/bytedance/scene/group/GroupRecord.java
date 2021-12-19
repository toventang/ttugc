package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.p1622d.C22171k;

/* access modifiers changed from: package-private */
public class GroupRecord implements Parcelable {
    public static final Parcelable.Creator<GroupRecord> CREATOR = new Parcelable.Creator<GroupRecord>() {
        /* class com.bytedance.scene.group.GroupRecord.C221841 */

        static {
            Covode.recordClassIndex(25989);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GroupRecord[] newArray(int i) {
            return new GroupRecord[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GroupRecord createFromParcel(Parcel parcel) {
            return new GroupRecord(parcel);
        }
    };

    /* renamed from: a */
    int f52438a = -1;

    /* renamed from: b */
    AbstractC22219j f52439b;

    /* renamed from: c */
    String f52440c;

    /* renamed from: d */
    public boolean f52441d;

    /* renamed from: e */
    boolean f52442e;

    /* renamed from: f */
    String f52443f;

    /* renamed from: g */
    Bundle f52444g;

    public int describeContents() {
        return 0;
    }

    public GroupRecord() {
    }

    static {
        Covode.recordClassIndex(25988);
    }

    protected GroupRecord(Parcel parcel) {
        boolean z;
        this.f52438a = parcel.readInt();
        this.f52440c = (String) C22171k.m41656a((Object) parcel.readString(), "tag not found in Parcel");
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f52441d = z;
        this.f52442e = parcel.readByte() == 0 ? false : z2;
        this.f52443f = (String) C22171k.m41656a((Object) parcel.readString(), "class name not found in Parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52438a);
        parcel.writeString(this.f52440c);
        parcel.writeByte(this.f52441d ? (byte) 1 : 0);
        parcel.writeByte(this.f52442e ? (byte) 1 : 0);
        parcel.writeString(this.f52443f);
    }
}

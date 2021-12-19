package com.bytedance.disk.parcel;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p966h.C14473c;

public class MigrationOpt implements Parcelable {
    public static final Parcelable.Creator<MigrationOpt> CREATOR = new Parcelable.Creator<MigrationOpt>() {
        /* class com.bytedance.disk.parcel.MigrationOpt.C144831 */

        static {
            Covode.recordClassIndex(16565);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MigrationOpt[] newArray(int i) {
            return new MigrationOpt[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MigrationOpt createFromParcel(Parcel parcel) {
            return new MigrationOpt(parcel);
        }
    };

    /* renamed from: a */
    public String f35019a = "";

    /* renamed from: b */
    public String f35020b = "";

    /* renamed from: c */
    public String f35021c = "";

    /* renamed from: d */
    public String f35022d = "";

    /* renamed from: e */
    public int f35023e = -1;

    /* renamed from: f */
    public int f35024f;

    /* renamed from: g */
    public long f35025g;

    /* renamed from: a */
    public static String m26485a(int i) {
        return i != 1 ? i != 2 ? "unknown" : "dir" : "normal";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.bytedance.disk.parcel.MigrationOpt$a */
    public static class C14484a {

        /* renamed from: a */
        private static C0693f.AbstractC0694a<MigrationOpt> f35026a = new C0693f.C0696c(20);

        static {
            Covode.recordClassIndex(16566);
        }

        /* renamed from: a */
        public static MigrationOpt m26488a() {
            MigrationOpt acquire = f35026a.acquire();
            if (acquire == null) {
                return new MigrationOpt();
            }
            return acquire;
        }

        /* renamed from: a */
        public static void m26489a(MigrationOpt migrationOpt) {
            if (migrationOpt != null) {
                migrationOpt.mo23322a();
                f35026a.release(migrationOpt);
            }
        }
    }

    static {
        Covode.recordClassIndex(16564);
    }

    public MigrationOpt() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23322a() {
        this.f35019a = "";
        this.f35020b = "";
        this.f35021c = "";
        this.f35022d = "";
        this.f35023e = -1;
        this.f35025g = -1;
        this.f35024f = 0;
    }

    public String toString() {
        return "MigrationOpt={dir->" + this.f35019a + " reason->" + this.f35020b + " from->" + this.f35021c + " to->" + this.f35022d + " option->" + this.f35023e + " fileLen->" + this.f35025g + " type->" + m26485a(this.f35024f) + "}";
    }

    public boolean equals(Object obj) {
        MigrationOpt migrationOpt = (MigrationOpt) obj;
        if (!TextUtils.equals(this.f35021c, migrationOpt.f35021c) || !TextUtils.equals(this.f35022d, migrationOpt.f35022d)) {
            return false;
        }
        return true;
    }

    protected MigrationOpt(Parcel parcel) {
        this.f35019a = parcel.readString();
        this.f35020b = parcel.readString();
        this.f35021c = parcel.readString();
        this.f35022d = parcel.readString();
        this.f35023e = parcel.readInt();
        this.f35025g = parcel.readLong();
        this.f35024f = parcel.readInt();
    }

    /* renamed from: a */
    public static MigrationOpt m26484a(MigrationOpt migrationOpt) {
        if (migrationOpt == null) {
            return null;
        }
        MigrationOpt a = C14484a.m26488a();
        a.f35020b = migrationOpt.f35020b;
        a.f35019a = C14473c.m26448c(migrationOpt.f35019a);
        a.f35021c = C14473c.m26448c(migrationOpt.f35021c);
        a.f35022d = C14473c.m26448c(migrationOpt.f35022d);
        a.f35023e = migrationOpt.f35023e;
        a.f35025g = migrationOpt.f35025g;
        a.f35024f = migrationOpt.f35024f;
        return a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35019a);
        parcel.writeString(this.f35020b);
        parcel.writeString(this.f35021c);
        parcel.writeString(this.f35022d);
        parcel.writeInt(this.f35023e);
        parcel.writeLong(this.f35025g);
        parcel.writeInt(this.f35024f);
    }

    /* renamed from: a */
    public static boolean m26486a(MigrationOpt migrationOpt, boolean z) {
        int i;
        if (migrationOpt != null && (i = migrationOpt.f35023e) >= 0 && i <= 4 && !TextUtils.isEmpty(migrationOpt.f35020b) && !TextUtils.isEmpty(migrationOpt.f35021c) && !TextUtils.isEmpty(migrationOpt.f35022d) && !TextUtils.equals(migrationOpt.f35021c, migrationOpt.f35022d) && C14473c.m26446a(migrationOpt.f35021c, z) && (TextUtils.equals("valid_path", migrationOpt.f35022d) || C14473c.m26446a(migrationOpt.f35022d, false))) {
            return true;
        }
        return false;
    }
}

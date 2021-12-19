package com.bytedance.disk.parcel;

import android.database.Cursor;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p961e.p962a.C14442a;
import com.bytedance.disk.p966h.C14473c;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicInteger;

public class MigrationItem implements Parcelable, Comparable {
    public static final Parcelable.Creator<MigrationItem> CREATOR = new Parcelable.Creator<MigrationItem>() {
        /* class com.bytedance.disk.parcel.MigrationItem.C144811 */

        static {
            Covode.recordClassIndex(16562);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MigrationItem[] newArray(int i) {
            return new MigrationItem[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MigrationItem createFromParcel(Parcel parcel) {
            return new MigrationItem(parcel);
        }
    };

    /* renamed from: a */
    public AtomicInteger f35010a = new AtomicInteger(1);

    /* renamed from: b */
    public long f35011b = -1;

    /* renamed from: c */
    public MigrationOpt f35012c;

    /* renamed from: d */
    public long f35013d = -1;

    /* renamed from: e */
    public long f35014e = -1;

    /* renamed from: f */
    public int f35015f = -1;

    /* renamed from: g */
    public boolean f35016g = false;

    /* renamed from: h */
    public ConditionVariable f35017h = new ConditionVariable(true);

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.bytedance.disk.parcel.MigrationItem$a */
    public static class C14482a {

        /* renamed from: a */
        private static C0693f.AbstractC0694a<MigrationItem> f35018a = new C0693f.C0696c(20);

        static {
            Covode.recordClassIndex(16563);
        }

        /* renamed from: a */
        public static MigrationItem m26482a() {
            MigrationItem acquire = f35018a.acquire();
            if (acquire == null) {
                return new MigrationItem();
            }
            return acquire;
        }

        /* renamed from: a */
        public static void m26483a(MigrationItem migrationItem) {
            if (migrationItem != null) {
                if (migrationItem.f35012c != null) {
                    MigrationOpt.C14484a.m26489a(migrationItem.f35012c);
                }
                migrationItem.mo23309b();
                f35018a.release(migrationItem);
            }
        }
    }

    static {
        Covode.recordClassIndex(16561);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23309b() {
        this.f35017h.open();
        this.f35010a.set(1);
        this.f35011b = -1;
        this.f35012c = null;
        this.f35013d = 0;
        this.f35014e = 0;
        this.f35015f = -1;
        this.f35016g = false;
    }

    /* renamed from: c */
    public final boolean mo23312c() {
        boolean z;
        MethodCollector.m26663i(1843);
        synchronized (this.f35010a) {
            try {
                if ((this.f35010a.get() & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(1843);
            }
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo23314d() {
        boolean z;
        MethodCollector.m26663i(1910);
        synchronized (this.f35010a) {
            try {
                if ((this.f35010a.get() & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(1910);
            }
        }
        return z;
    }

    public MigrationItem() {
    }

    /* renamed from: a */
    public final void mo23306a() {
        MigrationOpt migrationOpt = this.f35012c;
        if (migrationOpt != null && migrationOpt.f35024f == 0) {
            MigrationOpt migrationOpt2 = this.f35012c;
            migrationOpt2.f35024f = C14473c.m26441a(migrationOpt2.f35021c);
            if (this.f35012c.f35024f == 2 && TextUtils.isEmpty(this.f35012c.f35019a)) {
                MigrationOpt migrationOpt3 = this.f35012c;
                migrationOpt3.f35019a = migrationOpt3.f35021c;
            }
            MigrationOpt migrationOpt4 = this.f35012c;
            migrationOpt4.f35025g = C14473c.m26447b(migrationOpt4.f35021c);
        }
    }

    /* renamed from: e */
    public final boolean mo23316e() {
        boolean z;
        MethodCollector.m26663i(1914);
        synchronized (this.f35010a) {
            try {
                if ((this.f35010a.get() & 32768) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(1914);
            }
        }
        return z;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder append = new StringBuilder("MigrationItem{hash=").append(hashCode()).append(", _id=").append(this.f35011b).append(", ").append(this.f35012c).append(", stat=");
        int i = this.f35010a.get();
        if ((32768 & i) != 0) {
            str = "<delayDel>";
        } else {
            str = "<quickDel>";
        }
        if ((i & 1) != 0) {
            str2 = "normal".concat(str);
        } else if ((i & 2) != 0) {
            str2 = "suspend".concat(str);
        } else if ((i & 4) != 0) {
            str2 = "canceled".concat(str);
        } else {
            str2 = "unknown";
        }
        return append.append(str2).append(", eventTime=").append(this.f35013d).append(", elapsedTime=").append(this.f35014e).append(", event=").append(C14442a.m26374a(this.f35015f)).append(", deleted=").append(this.f35016g).append('}').toString();
    }

    /* renamed from: a */
    public final void mo23307a(long j) {
        this.f35017h.block(j);
    }

    public boolean equals(Object obj) {
        return this.f35012c.equals(((MigrationItem) obj).f35012c);
    }

    /* renamed from: b */
    public final void mo23310b(boolean z) {
        int i;
        MethodCollector.m26663i(1920);
        synchronized (this.f35010a) {
            try {
                int i2 = this.f35010a.get() & 32768;
                if (z) {
                    i = i2 | 2;
                } else {
                    i = i2 | 1;
                }
                this.f35010a.set(i);
            } finally {
                MethodCollector.m26664o(1920);
            }
        }
    }

    /* renamed from: c */
    public final void mo23311c(boolean z) {
        int i;
        MethodCollector.m26663i(1925);
        synchronized (this.f35010a) {
            try {
                int i2 = this.f35010a.get();
                if (z) {
                    i = 32768 | i2;
                } else {
                    i = -32769 & i2;
                }
                this.f35010a.set(i);
            } finally {
                MethodCollector.m26664o(1925);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        MigrationItem migrationItem = (MigrationItem) obj;
        MigrationOpt migrationOpt = this.f35012c;
        if (migrationOpt == null || migrationItem.f35012c == null) {
            return Long.valueOf(this.f35013d).compareTo(Long.valueOf(this.f35013d));
        }
        return Long.valueOf(migrationOpt.f35025g).compareTo(Long.valueOf(migrationItem.f35012c.f35025g));
    }

    protected MigrationItem(Parcel parcel) {
        boolean z = true;
        this.f35011b = parcel.readLong();
        this.f35012c = (MigrationOpt) parcel.readParcelable(MigrationOpt.class.getClassLoader());
        this.f35013d = parcel.readLong();
        this.f35014e = parcel.readLong();
        this.f35015f = parcel.readInt();
        this.f35016g = parcel.readInt() != 1 ? false : z;
        this.f35010a.set(parcel.readInt());
    }

    /* renamed from: a */
    public static MigrationItem m26471a(Cursor cursor) {
        MigrationOpt a = MigrationOpt.C14484a.m26488a();
        MigrationItem a2 = C14482a.m26482a();
        a2.f35012c = a;
        boolean z = false;
        a2.f35011b = cursor.getLong(0);
        a.f35019a = cursor.getString(1);
        a.f35020b = cursor.getString(2);
        a.f35025g = cursor.getLong(3);
        a.f35021c = cursor.getString(4);
        a.f35022d = cursor.getString(5);
        try {
            if (!TextUtils.isEmpty(a.f35019a)) {
                a.f35019a = C14473c.m26443a(a.f35019a, 0);
            }
            a.f35021c = C14473c.m26443a(a.f35021c, 0);
            a.f35022d = C14473c.m26443a(a.f35022d, 0);
        } catch (Exception unused) {
        }
        a.f35023e = cursor.getInt(6);
        a.f35024f = cursor.getInt(7);
        a2.f35015f = cursor.getInt(8);
        a2.f35013d = cursor.getLong(9);
        a2.f35014e = cursor.getLong(10);
        if (cursor.getInt(11) == 1) {
            z = true;
        }
        a2.f35016g = z;
        return a2;
    }

    /* renamed from: a */
    public final void mo23308a(boolean z) {
        int i;
        MethodCollector.m26663i(1917);
        synchronized (this.f35010a) {
            try {
                int i2 = this.f35010a.get() & 32768;
                if (z) {
                    i = i2 | 4;
                } else {
                    i = i2 | 1;
                }
                this.f35010a.set(i);
            } finally {
                MethodCollector.m26664o(1917);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f35011b);
        parcel.writeParcelable(this.f35012c, i);
        parcel.writeLong(this.f35013d);
        parcel.writeLong(this.f35014e);
        parcel.writeInt(this.f35015f);
        parcel.writeInt(this.f35016g ? 1 : 0);
        parcel.writeInt(this.f35010a.get());
    }

    /* renamed from: a */
    public static MigrationItem m26472a(MigrationItem migrationItem, boolean z) {
        long j;
        int i;
        long j2;
        if (migrationItem == null) {
            return null;
        }
        MigrationItem a = C14482a.m26482a();
        a.f35012c = MigrationOpt.m26484a(migrationItem.f35012c);
        long j3 = -1;
        if (z) {
            j = -1;
        } else {
            j = migrationItem.f35011b;
        }
        a.f35011b = j;
        if (z) {
            i = -1;
        } else {
            i = migrationItem.f35015f;
        }
        a.f35015f = i;
        if (z) {
            j2 = System.currentTimeMillis();
        } else {
            j2 = migrationItem.f35013d;
        }
        a.f35013d = j2;
        if (!z) {
            j3 = migrationItem.f35014e;
        }
        a.f35014e = j3;
        a.f35010a.set(migrationItem.f35010a.get());
        a.f35016g = migrationItem.f35016g;
        return a;
    }
}

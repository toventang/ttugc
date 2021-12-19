package com.p2082ss.android.socialbase.downloader.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.C30409f;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2188j.RunnableC30514b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.socialbase.downloader.model.DownloadChunk */
public class DownloadChunk implements Parcelable {
    public static final Parcelable.Creator<DownloadChunk> CREATOR = new Parcelable.Creator<DownloadChunk>() {
        /* class com.p2082ss.android.socialbase.downloader.model.DownloadChunk.C305821 */

        static {
            Covode.recordClassIndex(37111);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DownloadChunk[] newArray(int i) {
            return new DownloadChunk[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DownloadChunk createFromParcel(Parcel parcel) {
            return new DownloadChunk(parcel);
        }
    };

    /* renamed from: l */
    private static final String f72911l = DownloadChunk.class.getSimpleName();

    /* renamed from: a */
    public int f72912a;

    /* renamed from: b */
    public long f72913b;

    /* renamed from: c */
    public long f72914c;

    /* renamed from: d */
    public long f72915d;

    /* renamed from: e */
    public int f72916e;

    /* renamed from: f */
    public long f72917f;

    /* renamed from: g */
    public List<DownloadChunk> f72918g;

    /* renamed from: h */
    public DownloadChunk f72919h;

    /* renamed from: i */
    public int f72920i;

    /* renamed from: j */
    public boolean f72921j;

    /* renamed from: k */
    public AtomicBoolean f72922k;

    /* renamed from: m */
    private AtomicLong f72923m;

    /* renamed from: n */
    private AtomicInteger f72924n;

    /* renamed from: o */
    private RunnableC30514b f72925o;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.socialbase.downloader.model.DownloadChunk$a */
    public static class C30583a {

        /* renamed from: a */
        public int f72926a;

        /* renamed from: b */
        public long f72927b;

        /* renamed from: c */
        public long f72928c;

        /* renamed from: d */
        public long f72929d;

        /* renamed from: e */
        public long f72930e;

        /* renamed from: f */
        public int f72931f;

        /* renamed from: g */
        public long f72932g;

        /* renamed from: h */
        public DownloadChunk f72933h;

        static {
            Covode.recordClassIndex(37112);
        }

        /* renamed from: a */
        public final DownloadChunk mo54416a() {
            return new DownloadChunk(this, (byte) 0);
        }

        public C30583a(int i) {
            this.f72926a = i;
        }
    }

    /* renamed from: b */
    public final boolean mo54403b() {
        if (mo54396a() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo54405d() {
        List<DownloadChunk> list = this.f72918g;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final long mo54410h() {
        AtomicLong atomicLong = this.f72923m;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(37110);
    }

    /* renamed from: a */
    public final int mo54396a() {
        AtomicInteger atomicInteger = this.f72924n;
        if (atomicInteger == null) {
            return -1;
        }
        return atomicInteger.get();
    }

    /* renamed from: c */
    public final DownloadChunk mo54404c() {
        DownloadChunk downloadChunk;
        if (!mo54403b()) {
            downloadChunk = this.f72919h;
            if (downloadChunk == null) {
                return null;
            }
        } else {
            downloadChunk = this;
        }
        if (!downloadChunk.mo54405d()) {
            return null;
        }
        return downloadChunk.f72918g.get(0);
    }

    /* renamed from: f */
    public final boolean mo54408f() {
        long j = this.f72913b;
        if (mo54403b()) {
            long j2 = this.f72917f;
            if (j2 > this.f72913b) {
                j = j2;
            }
        }
        if (mo54411i() - j >= this.f72915d) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo54407e() {
        DownloadChunk downloadChunk = this.f72919h;
        if (downloadChunk == null) {
            return true;
        }
        if (!downloadChunk.mo54405d()) {
            return false;
        }
        for (int i = 0; i < this.f72919h.f72918g.size(); i++) {
            DownloadChunk downloadChunk2 = this.f72919h.f72918g.get(i);
            if (downloadChunk2 != null) {
                int indexOf = this.f72919h.f72918g.indexOf(this);
                if (indexOf > i && !downloadChunk2.mo54408f()) {
                    return false;
                }
                if (indexOf == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final long mo54409g() {
        List<DownloadChunk> list;
        DownloadChunk downloadChunk = this.f72919h;
        if (!(downloadChunk == null || (list = downloadChunk.f72918g) == null)) {
            int indexOf = list.indexOf(this);
            boolean z = false;
            for (int i = 0; i < this.f72919h.f72918g.size(); i++) {
                DownloadChunk downloadChunk2 = this.f72919h.f72918g.get(i);
                if (downloadChunk2 != null) {
                    if (z) {
                        return downloadChunk2.mo54411i();
                    }
                    if (indexOf == i) {
                        z = true;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final long mo54412j() {
        long i = mo54411i() - this.f72913b;
        if (mo54405d()) {
            i = 0;
            for (int i2 = 0; i2 < this.f72918g.size(); i2++) {
                DownloadChunk downloadChunk = this.f72918g.get(i2);
                if (downloadChunk != null) {
                    i += downloadChunk.mo54411i() - downloadChunk.f72913b;
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final long mo54411i() {
        if (!mo54403b() || !mo54405d()) {
            return mo54410h();
        }
        long j = 0;
        for (int i = 0; i < this.f72918g.size(); i++) {
            DownloadChunk downloadChunk = this.f72918g.get(i);
            if (downloadChunk != null) {
                if (!downloadChunk.mo54408f()) {
                    return downloadChunk.mo54410h();
                }
                if (j < downloadChunk.mo54410h()) {
                    j = downloadChunk.mo54410h();
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    private void m62701a(int i) {
        AtomicInteger atomicInteger = this.f72924n;
        if (atomicInteger == null) {
            this.f72924n = new AtomicInteger(i);
        } else {
            atomicInteger.set(i);
        }
    }

    protected DownloadChunk(Parcel parcel) {
        this.f72912a = parcel.readInt();
        this.f72913b = parcel.readLong();
        this.f72923m = new AtomicLong(parcel.readLong());
        this.f72914c = parcel.readLong();
        this.f72915d = parcel.readLong();
        this.f72916e = parcel.readInt();
        this.f72924n = new AtomicInteger(parcel.readInt());
    }

    /* renamed from: a */
    public final void mo54398a(long j) {
        AtomicLong atomicLong = this.f72923m;
        if (atomicLong != null) {
            atomicLong.set(j);
        } else {
            this.f72923m = new AtomicLong(j);
        }
    }

    private DownloadChunk(C30583a aVar) {
        if (aVar != null) {
            this.f72912a = aVar.f72926a;
            this.f72913b = aVar.f72927b;
            this.f72923m = new AtomicLong(aVar.f72928c);
            this.f72914c = aVar.f72929d;
            this.f72915d = aVar.f72930e;
            this.f72916e = aVar.f72931f;
            this.f72917f = aVar.f72932g;
            this.f72924n = new AtomicInteger(-1);
            mo54400a(aVar.f72933h);
            this.f72922k = new AtomicBoolean(false);
        }
    }

    /* renamed from: a */
    public final void mo54399a(RunnableC30514b bVar) {
        this.f72925o = bVar;
        this.f72917f = mo54411i();
    }

    /* renamed from: b */
    public final long mo54402b(boolean z) {
        long i = mo54411i();
        long j = this.f72915d;
        long j2 = this.f72917f;
        long j3 = j - (i - j2);
        if (!z && i == j2) {
            j3 = j - (i - this.f72913b);
        }
        C30434a.m62027b("DownloadChunk", "contentLength:" + this.f72915d + " curOffset:" + mo54411i() + " oldOffset:" + this.f72917f + " retainLen:" + j3);
        if (j3 < 0) {
            return 0;
        }
        return j3;
    }

    public DownloadChunk(Cursor cursor) {
        if (cursor != null) {
            this.f72912a = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f72916e = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
            this.f72913b = cursor.getLong(cursor.getColumnIndex("startOffset"));
            int columnIndex = cursor.getColumnIndex("curOffset");
            if (columnIndex != -1) {
                this.f72923m = new AtomicLong(cursor.getLong(columnIndex));
            } else {
                this.f72923m = new AtomicLong(0);
            }
            this.f72914c = cursor.getLong(cursor.getColumnIndex("endOffset"));
            int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
            if (columnIndex2 != -1) {
                this.f72924n = new AtomicInteger(cursor.getInt(columnIndex2));
            } else {
                this.f72924n = new AtomicInteger(-1);
            }
            int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
            if (columnIndex3 != -1) {
                this.f72915d = cursor.getLong(columnIndex3);
            }
            this.f72922k = new AtomicBoolean(false);
        }
    }

    /* renamed from: a */
    public final void mo54400a(DownloadChunk downloadChunk) {
        this.f72919h = downloadChunk;
        if (downloadChunk != null) {
            m62701a(downloadChunk.f72916e);
        }
    }

    /* renamed from: a */
    public final void mo54401a(boolean z) {
        AtomicBoolean atomicBoolean = this.f72922k;
        if (atomicBoolean == null) {
            this.f72922k = new AtomicBoolean(z);
        } else {
            atomicBoolean.set(z);
        }
        this.f72925o = null;
    }

    /* synthetic */ DownloadChunk(C30583a aVar, byte b) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        long j;
        parcel.writeInt(this.f72912a);
        parcel.writeLong(this.f72913b);
        AtomicLong atomicLong = this.f72923m;
        if (atomicLong != null) {
            j = atomicLong.get();
        } else {
            j = 0;
        }
        parcel.writeLong(j);
        parcel.writeLong(this.f72914c);
        parcel.writeLong(this.f72915d);
        parcel.writeInt(this.f72916e);
        int i2 = -1;
        AtomicInteger atomicInteger = this.f72924n;
        if (atomicInteger != null) {
            i2 = atomicInteger.get();
        }
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public final List<DownloadChunk> mo54397a(int i, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        DownloadChunk downloadChunk = this;
        if (!mo54403b() || mo54405d()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long h = mo54410h();
        int i2 = 1;
        long b = downloadChunk.mo54402b(true);
        long j6 = b / ((long) i);
        C30434a.m62027b(f72911l, "retainLen:" + b + " divideChunkForReuse chunkSize:" + j6 + " current host downloadChunk index:" + downloadChunk.f72916e);
        int i3 = 0;
        while (i3 < i) {
            if (i3 == 0) {
                j3 = downloadChunk.f72913b;
                i3 = 0;
            } else {
                int i4 = i - 1;
                if (i3 == i4) {
                    j4 = downloadChunk.f72914c;
                    if (j4 > h) {
                        j5 = (j4 - h) + 1;
                    } else {
                        j5 = b - (((long) i4) * j6);
                    }
                    j3 = h;
                    C30583a aVar = new C30583a(downloadChunk.f72912a);
                    aVar.f72931f = (-i3) - i2;
                    aVar.f72927b = j3;
                    aVar.f72928c = h;
                    aVar.f72932g = h;
                    aVar.f72929d = j4;
                    aVar.f72930e = j5;
                    aVar.f72933h = downloadChunk;
                    DownloadChunk a = aVar.mo54416a();
                    C30434a.m62027b(f72911l, "divide sub chunk : " + i3 + " startOffset:" + j3 + " curOffset:" + h + " endOffset:" + j4 + " contentLen:" + j5);
                    arrayList.add(a);
                    h += j6;
                    i3++;
                    i2 = 1;
                    downloadChunk = this;
                } else {
                    j3 = h;
                }
            }
            j4 = (h + j6) - 1;
            j5 = j6;
            C30583a aVar2 = new C30583a(downloadChunk.f72912a);
            aVar2.f72931f = (-i3) - i2;
            aVar2.f72927b = j3;
            aVar2.f72928c = h;
            aVar2.f72932g = h;
            aVar2.f72929d = j4;
            aVar2.f72930e = j5;
            aVar2.f72933h = downloadChunk;
            DownloadChunk a2 = aVar2.mo54416a();
            C30434a.m62027b(f72911l, "divide sub chunk : " + i3 + " startOffset:" + j3 + " curOffset:" + h + " endOffset:" + j4 + " contentLen:" + j5);
            arrayList.add(a2);
            h += j6;
            i3++;
            i2 = 1;
            downloadChunk = this;
        }
        long j7 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            DownloadChunk downloadChunk2 = (DownloadChunk) arrayList.get(size);
            if (downloadChunk2 != null) {
                j7 += downloadChunk2.f72915d;
            }
        }
        C30434a.m62027b(f72911l, "reuseChunkContentLen:".concat(String.valueOf(j7)));
        DownloadChunk downloadChunk3 = (DownloadChunk) arrayList.get(0);
        if (downloadChunk3 != null) {
            long j8 = this.f72914c;
            if (j8 == 0) {
                j2 = j - this.f72913b;
            } else {
                j2 = (j8 - this.f72913b) + 1;
            }
            downloadChunk3.f72915d = j2 - j7;
            downloadChunk3.f72916e = this.f72916e;
            RunnableC30514b bVar = this.f72925o;
            if (bVar != null) {
                long j9 = downloadChunk3.f72914c;
                long j10 = this.f72915d - j7;
                if (bVar.f72762a != null) {
                    C30409f fVar = bVar.f72762a;
                    fVar.f72475d = j9;
                    fVar.f72476e = j10;
                }
            }
        }
        this.f72918g = arrayList;
        return arrayList;
    }
}

package com.p2082ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.segment.i */
public final class C30607i {

    /* renamed from: a */
    public final long f73068a;

    /* renamed from: b */
    final AtomicLong f73069b;

    /* renamed from: c */
    public long f73070c;

    /* renamed from: d */
    public int f73071d;

    /* renamed from: e */
    volatile RunnableC30613l f73072e;

    /* renamed from: f */
    public int f73073f;

    /* renamed from: g */
    public JSONObject f73074g;

    /* renamed from: h */
    private volatile long f73075h;

    static {
        Covode.recordClassIndex(37142);
    }

    /* renamed from: a */
    public final long mo54837a() {
        return this.f73069b.get() - this.f73068a;
    }

    /* renamed from: d */
    public final long mo54843d() {
        RunnableC30613l lVar = this.f73072e;
        if (lVar != null) {
            long j = lVar.f73130g;
            if (j > this.f73075h) {
                return j;
            }
        }
        return this.f73075h;
    }

    /* renamed from: b */
    public final long mo54839b() {
        long j = this.f73070c;
        if (j >= this.f73068a) {
            return (j - mo54843d()) + 1;
        }
        return -1;
    }

    /* renamed from: c */
    public final long mo54841c() {
        long j = this.f73069b.get();
        long j2 = this.f73070c;
        if (j2 > 0) {
            long j3 = j2 + 1;
            if (j > j3) {
                return j3;
            }
        }
        return j;
    }

    public final String toString() {
        return "Segment{startOffset=" + this.f73068a + ",\t currentOffset=" + this.f73069b + ",\t currentOffsetRead=" + mo54843d() + ",\t endOffset=" + this.f73070c + '}';
    }

    /* renamed from: c */
    public final void mo54842c(long j) {
        if (j >= this.f73069b.get()) {
            this.f73075h = j;
        }
    }

    /* renamed from: a */
    public final void mo54838a(long j) {
        long j2 = this.f73068a;
        if (j < j2) {
            j = j2;
        }
        long j3 = this.f73070c;
        if (j3 > 0) {
            long j4 = j3 + 1;
            if (j > j4) {
                j = j4;
            }
        }
        this.f73069b.set(j);
    }

    public C30607i(C30607i iVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.f73069b = atomicLong;
        this.f73073f = 0;
        this.f73068a = iVar.f73068a;
        this.f73070c = iVar.f73070c;
        atomicLong.set(iVar.f73069b.get());
        this.f73075h = atomicLong.get();
        this.f73071d = iVar.f73071d;
    }

    /* renamed from: a */
    public static String m62805a(List<C30607i> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Collections.sort(list, new Comparator<C30607i>() {
            /* class com.p2082ss.android.socialbase.downloader.segment.C30607i.C306081 */

            static {
                Covode.recordClassIndex(37143);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C30607i iVar, C30607i iVar2) {
                return (int) (iVar.f73068a - iVar2.f73068a);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (C30607i iVar : list) {
            sb.append(iVar).append("\r\n");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54840b(long j) {
        if (j >= this.f73068a) {
            this.f73070c = j;
        } else if (j == -1) {
            this.f73070c = j;
        }
    }

    public C30607i(JSONObject jSONObject) {
        this.f73069b = new AtomicLong();
        this.f73073f = 0;
        this.f73068a = jSONObject.optLong("st");
        mo54840b(jSONObject.optLong("en"));
        mo54838a(jSONObject.optLong("cu"));
        mo54842c(mo54841c());
    }

    public C30607i(long j, long j2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f73069b = atomicLong;
        this.f73073f = 0;
        this.f73068a = j;
        atomicLong.set(j);
        this.f73075h = j;
        if (j2 >= j) {
            this.f73070c = j2;
        } else {
            this.f73070c = -1;
        }
    }
}

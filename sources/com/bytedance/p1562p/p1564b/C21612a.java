package com.bytedance.p1562p.p1564b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.p.b.a */
public final class C21612a implements Comparable<C21612a> {

    /* renamed from: a */
    public String f51250a;

    /* renamed from: b */
    public long f51251b;

    static {
        Covode.recordClassIndex(25253);
    }

    public final String toString() {
        return "AnrEntry{stack='" + this.f51250a + '\'' + " stackCost=" + this.f51251b + '}';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C21612a aVar) {
        long j = this.f51251b;
        long j2 = aVar.f51251b;
        if (j > j2) {
            return -1;
        }
        if (j < j2) {
            return 1;
        }
        return 0;
    }

    public C21612a(String str, long j) {
        this.f51250a = str;
        this.f51251b = j;
    }
}

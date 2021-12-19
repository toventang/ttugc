package com.bytedance.geckox.policy.p1029c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.geckox.policy.c.c */
public abstract class AbstractRunnableC14985c implements Comparable<AbstractRunnableC14985c>, Runnable {

    /* renamed from: e */
    public int f36602e;

    /* renamed from: f */
    public String f36603f;

    static {
        Covode.recordClassIndex(17122);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(AbstractRunnableC14985c cVar) {
        int i = this.f36602e;
        int i2 = cVar.f36602e;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    public AbstractRunnableC14985c(int i, String str) {
        this.f36602e = i;
        this.f36603f = str;
    }
}

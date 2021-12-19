package com.p2082ss.android.ugc.aweme.feed.p2968t;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.t.d */
public final class C49935d {

    /* renamed from: a */
    public static final C49935d f115106a = new C49935d();

    /* renamed from: b */
    private SparseArray<AbstractC49934c> f115107b = new SparseArray<>();

    static {
        Covode.recordClassIndex(59046);
    }

    private C49935d() {
        m93767a(4, new C49936e());
        m93767a(5, new C49943i());
    }

    /* renamed from: a */
    public final AbstractC49934c mo84986a(int i) {
        AbstractC49934c cVar = this.f115107b.get(i);
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    /* renamed from: a */
    private void m93767a(int i, AbstractC49934c cVar) {
        this.f115107b.put(i, cVar);
    }
}

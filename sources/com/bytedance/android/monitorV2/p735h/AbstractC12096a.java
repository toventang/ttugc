package com.bytedance.android.monitorV2.p735h;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.bytedance.android.monitorV2.h.a */
public abstract class AbstractC12096a {

    /* renamed from: a */
    private Vector<AbstractC12112e> f29028a = new Vector<>();

    static {
        Covode.recordClassIndex(13825);
    }

    /* renamed from: a */
    public final void mo19448a(AbstractC12112e eVar) {
        this.f29028a.add(eVar);
    }

    /* renamed from: a */
    public final void mo19447a(int i) {
        Iterator<AbstractC12112e> it = this.f29028a.iterator();
        while (it.hasNext()) {
            it.next().mo19486a(i);
        }
    }
}

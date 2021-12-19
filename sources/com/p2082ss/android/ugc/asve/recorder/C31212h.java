package com.p2082ss.android.ugc.asve.recorder;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.h */
public final class C31212h implements AbstractC31213i {

    /* renamed from: a */
    public final CopyOnWriteArrayList<AbstractC31213i> f74810a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final AbstractC31191d f74811b;

    static {
        Covode.recordClassIndex(37858);
    }

    public C31212h(AbstractC31191d dVar) {
        C89219l.m154721d(dVar, "");
        this.f74811b = dVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        Iterator<T> it = this.f74810a.iterator();
        while (it.hasNext()) {
            it.next().onCallback(i, i2, f, str);
        }
    }
}

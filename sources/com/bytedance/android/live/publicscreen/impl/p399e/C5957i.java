package com.bytedance.android.live.publicscreen.impl.p399e;

import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.i */
final /* synthetic */ class C5957i implements Comparator {

    /* renamed from: a */
    static final Comparator f14943a = new C5957i();

    static {
        Covode.recordClassIndex(6565);
    }

    private C5957i() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC5873h hVar = (AbstractC5873h) obj;
        AbstractC5873h hVar2 = (AbstractC5873h) obj2;
        if (hVar.mo11690p() == hVar2.mo11690p()) {
            return 0;
        }
        return hVar.mo11690p() - hVar2.mo11690p() < 0 ? -1 : 1;
    }
}

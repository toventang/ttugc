package com.facebook.imagepipeline.p1879d;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;

/* renamed from: com.facebook.imagepipeline.d.k */
public final class C24390k implements AbstractC24093k<C24398q> {
    static {
        Covode.recordClassIndex(28533);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.p1832d.AbstractC24093k
    /* renamed from: b */
    public final /* synthetic */ C24398q mo34217b() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 1048576;
        } else if (min < 33554432) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        return new C24398q(i, Integer.MAX_VALUE, i, i / 8);
    }
}

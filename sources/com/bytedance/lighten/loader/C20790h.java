package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.imagepipeline.p1879d.C24398q;

/* renamed from: com.bytedance.lighten.loader.h */
public final class C20790h implements AbstractC24093k<C24398q> {

    /* renamed from: a */
    private int f49197a;

    static {
        Covode.recordClassIndex(24366);
    }

    public C20790h() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.p1832d.AbstractC24093k
    /* renamed from: b */
    public final /* synthetic */ C24398q mo34217b() {
        int i = this.f49197a;
        if (i <= 0) {
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min < 16777216) {
                i = 1048576;
            } else if (min < 33554432) {
                i = 2097152;
            } else {
                i = 4194304;
            }
        }
        return new C24398q(i, Integer.MAX_VALUE, i, i / 8);
    }

    public C20790h(int i) {
        this.f49197a = i;
    }
}

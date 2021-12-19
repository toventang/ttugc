package com.facebook.imagepipeline.p1882g;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.p1885j.AbstractC24459h;
import com.facebook.imagepipeline.p1885j.C24458g;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.g.g */
public final class C24447g implements AbstractC24445e {

    /* renamed from: a */
    private final AbstractC24449b f58086a;

    /* renamed from: com.facebook.imagepipeline.g.g$b */
    public interface AbstractC24449b {
        static {
            Covode.recordClassIndex(28592);
        }

        /* renamed from: a */
        List<Integer> mo40288a();
    }

    static {
        Covode.recordClassIndex(28590);
    }

    /* renamed from: com.facebook.imagepipeline.g.g$a */
    static class C24448a implements AbstractC24449b {
        static {
            Covode.recordClassIndex(28591);
        }

        private C24448a() {
        }

        @Override // com.facebook.imagepipeline.p1882g.C24447g.AbstractC24449b
        /* renamed from: a */
        public final List<Integer> mo40288a() {
            return Collections.EMPTY_LIST;
        }

        /* synthetic */ C24448a(byte b) {
            this();
        }
    }

    public C24447g() {
        this(new C24448a((byte) 0));
    }

    @Override // com.facebook.imagepipeline.p1882g.AbstractC24445e
    /* renamed from: b */
    public final AbstractC24459h mo40286b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        return C24458g.m46700a(i, z, false);
    }

    private C24447g(AbstractC24449b bVar) {
        this.f58086a = (AbstractC24449b) C24091i.m45617a(bVar);
    }

    @Override // com.facebook.imagepipeline.p1882g.AbstractC24445e
    /* renamed from: a */
    public final int mo40285a(int i) {
        List<Integer> a = this.f58086a.mo40288a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (a.get(i2).intValue() > i) {
                return a.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}

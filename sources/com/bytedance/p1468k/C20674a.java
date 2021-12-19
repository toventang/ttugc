package com.bytedance.p1468k;

import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.k.a */
public final class C20674a {
    static {
        Covode.recordClassIndex(24212);
    }

    /* renamed from: com.bytedance.k.a$a */
    public static final class C20675a implements AbstractC1214u<X> {

        /* renamed from: a */
        public boolean f48884a = true;

        /* renamed from: b */
        final /* synthetic */ C1210r f48885b;

        static {
            Covode.recordClassIndex(24213);
        }

        C20675a(C1210r rVar) {
            this.f48885b = rVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(X x) {
            Object value = this.f48885b.getValue();
            if (!this.f48884a) {
                if (value == null) {
                    if (x == null) {
                        return;
                    }
                } else if (!(!C89219l.m154714a(value, (Object) x))) {
                    return;
                }
            }
            this.f48884a = false;
            this.f48885b.setValue(x);
        }
    }

    /* renamed from: a */
    public static final <X> LiveData<X> m38925a(LiveData<X> liveData) {
        C89219l.m154721d(liveData, "");
        C1210r rVar = new C1210r();
        rVar.mo4026a(liveData, new C20675a(rVar));
        return rVar;
    }
}

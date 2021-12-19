package androidx.lifecycle;

import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.lifecycle.aa */
public final class C1169aa {
    static {
        Covode.recordClassIndex(1276);
    }

    /* renamed from: a */
    public static <X, Y> LiveData<Y> m3869a(LiveData<X> liveData, final AbstractC0189a<X, Y> aVar) {
        final C1210r rVar = new C1210r();
        rVar.mo4026a(liveData, new AbstractC1214u<X>() {
            /* class androidx.lifecycle.C1169aa.C11701 */

            static {
                Covode.recordClassIndex(1277);
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final void onChanged(X x) {
                rVar.setValue(aVar.mo365a(x));
            }
        });
        return rVar;
    }
}

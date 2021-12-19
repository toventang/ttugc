package android.p003ss.com.vboost.p007d;

import android.p003ss.com.vboost.p006c.C0029c;
import android.p003ss.com.vboost.p007d.C0051f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: android.ss.com.vboost.d.b */
public class CallableC0046b implements Callable<Integer> {

    /* renamed from: a */
    private static final String f161a = CallableC0046b.class.getSimpleName();

    /* renamed from: b */
    private final C0048d f162b;

    static {
        Covode.recordClassIndex(49);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Integer call() {
        if (C0029c.m64a().mo30a(this.f162b)) {
            if (!this.f162b.f176i) {
                C0029c.m64a().mo31b(this.f162b);
            } else {
                C0029c.m64a().mo32c(this.f162b);
            }
        }
        C0051f.C0054a.f206a.mo42a(this.f162b, false);
        return null;
    }

    public CallableC0046b(C0048d dVar) {
        this.f162b = dVar;
    }
}

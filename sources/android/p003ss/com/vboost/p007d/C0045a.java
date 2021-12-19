package android.p003ss.com.vboost.p007d;

import android.p003ss.com.vboost.p006c.C0029c;
import android.p003ss.com.vboost.p007d.C0051f;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: android.ss.com.vboost.d.a */
public class C0045a {

    /* renamed from: a */
    private static final String f160a = C0045a.class.getSimpleName();

    C0045a() {
    }

    static {
        Covode.recordClassIndex(48);
    }

    /* renamed from: a */
    static Object m84a(C0048d dVar) {
        Object obj;
        if (!C0029c.m64a().mo30a(dVar)) {
            obj = null;
        } else if (!dVar.f176i) {
            obj = C0029c.m64a().mo31b(dVar);
        } else {
            obj = C0029c.m64a().mo32c(dVar);
        }
        C0051f fVar = C0051f.C0054a.f206a;
        fVar.f194c.lock();
        try {
            fVar.f198g.remove(dVar);
            fVar.f196e.remove(dVar.f168a);
            return obj;
        } finally {
            fVar.f194c.unlock();
        }
    }
}

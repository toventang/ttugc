package p4640l.p4641a.p4642a;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import okhttp3.AbstractC90031ad;
import p4640l.AbstractC89744e;

/* renamed from: l.a.a.c */
final class C89712c<T> implements AbstractC89744e<AbstractC90031ad, T> {

    /* renamed from: a */
    private final C27910f f203487a;

    /* renamed from: b */
    private final AbstractC28031v<T> f203488b;

    static {
        Covode.recordClassIndex(105806);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo144266a(AbstractC90031ad adVar) {
        try {
            return this.f203488b.read(this.f203487a.mo46659a(adVar.charStream()));
        } finally {
            adVar.close();
        }
    }

    C89712c(C27910f fVar, AbstractC28031v<T> vVar) {
        this.f203487a = fVar;
        this.f203488b = vVar;
    }
}

package androidx.room;

import androidx.p054j.p055a.AbstractC1069f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.n */
public abstract class AbstractC1542n {

    /* renamed from: a */
    private final AtomicBoolean f5076a = new AtomicBoolean(false);

    /* renamed from: b */
    private final AbstractC1533j f5077b;

    /* renamed from: c */
    private volatile AbstractC1069f f5078c;

    static {
        Covode.recordClassIndex(1681);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo5043a();

    /* renamed from: c */
    private AbstractC1069f m5211c() {
        return this.f5077b.mo5083a(mo5043a());
    }

    /* renamed from: b */
    public final AbstractC1069f mo5109b() {
        this.f5077b.mo5089c();
        if (!this.f5076a.compareAndSet(false, true)) {
            return m5211c();
        }
        if (this.f5078c == null) {
            this.f5078c = m5211c();
        }
        return this.f5078c;
    }

    public AbstractC1542n(AbstractC1533j jVar) {
        this.f5077b = jVar;
    }

    /* renamed from: a */
    public final void mo5108a(AbstractC1069f fVar) {
        if (fVar == this.f5078c) {
            this.f5076a.set(false);
        }
    }
}

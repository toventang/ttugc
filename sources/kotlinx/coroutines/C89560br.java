package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

/* renamed from: kotlinx.coroutines.br */
public final class C89560br extends AbstractC89559bq {

    /* renamed from: a */
    private final Executor f203279a;

    static {
        Covode.recordClassIndex(105651);
    }

    @Override // kotlinx.coroutines.AbstractC89556bp
    /* renamed from: a */
    public final Executor mo144131a() {
        return this.f203279a;
    }

    public C89560br(Executor executor) {
        this.f203279a = executor;
        mo144132b();
    }
}

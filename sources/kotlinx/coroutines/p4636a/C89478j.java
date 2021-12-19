package kotlinx.coroutines.p4636a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.a.j */
public final class C89478j {
    static {
        Covode.recordClassIndex(105567);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.concurrent.CancellationException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m155384a(AbstractC89494u<?> uVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = th;
            }
            cancellationException = cancellationException;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        uVar.mo144039a(cancellationException);
    }
}

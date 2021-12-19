package p4632k;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.Flushable;

/* renamed from: k.y */
public interface AbstractC89447y extends Closeable, Flushable {
    static {
        Covode.recordClassIndex(105531);
    }

    /* renamed from: a */
    void mo22060a(C89420f fVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    C89409ab timeout();
}

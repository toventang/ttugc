package androidx.core.p036g;

import com.bytedance.covode.number.Covode;
import java.io.Writer;

/* renamed from: androidx.core.g.c */
public final class C0690c extends Writer {

    /* renamed from: a */
    private final String f2748a;

    /* renamed from: b */
    private StringBuilder f2749b = new StringBuilder(128);

    static {
        Covode.recordClassIndex(769);
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public final void close() {
        m2446a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m2446a();
    }

    /* renamed from: a */
    private void m2446a() {
        if (this.f2749b.length() > 0) {
            StringBuilder sb = this.f2749b;
            sb.delete(0, sb.length());
        }
    }

    public C0690c(String str) {
        this.f2748a = str;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2446a();
            } else {
                this.f2749b.append(c);
            }
        }
    }
}

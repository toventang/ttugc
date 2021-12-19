package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Objects;
import okhttp3.internal.C90084c;
import p4600h.p4611f.p4613b.C89219l;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: okhttp3.ad */
public abstract class AbstractC90031ad implements Closeable {
    private Reader reader;

    static {
        Covode.recordClassIndex(106203);
    }

    public abstract long contentLength();

    public abstract C90204w contentType();

    public abstract AbstractC89426h source();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C90084c.m156415a(source());
    }

    private Charset charset() {
        C90204w contentType = contentType();
        if (contentType != null) {
            return contentType.mo145074a(C90084c.f204450e);
        }
        return C90084c.f204450e;
    }

    public final InputStream byteStream() {
        return source().mo143819f();
    }

    /* renamed from: okhttp3.ad$a */
    static final class C90033a extends Reader {

        /* renamed from: a */
        private final AbstractC89426h f204133a;

        /* renamed from: b */
        private final Charset f204134b;

        /* renamed from: c */
        private boolean f204135c;

        /* renamed from: d */
        private Reader f204136d;

        static {
            Covode.recordClassIndex(106205);
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public final void close() {
            this.f204135c = true;
            Reader reader = this.f204136d;
            if (reader != null) {
                reader.close();
            } else {
                this.f204133a.close();
            }
        }

        C90033a(AbstractC89426h hVar, Charset charset) {
            this.f204133a = hVar;
            this.f204134b = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            MethodCollector.m26663i(9461);
            if (!this.f204135c) {
                Reader reader = this.f204136d;
                if (reader == null) {
                    reader = new InputStreamReader(this.f204133a.mo143819f(), C90084c.m156409a(this.f204133a, this.f204134b));
                    this.f204136d = reader;
                }
                int read = reader.read(cArr, i, i2);
                MethodCollector.m26664o(9461);
                return read;
            }
            IOException iOException = new IOException("Stream closed");
            MethodCollector.m26664o(9461);
            throw iOException;
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        C90033a aVar = new C90033a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    public final String string() {
        AbstractC89426h source = source();
        try {
            return source.mo143799a(C90084c.m156409a(source, charset()));
        } finally {
            C90084c.m156415a(source);
        }
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            AbstractC89426h source = source();
            try {
                byte[] u = source.mo143853u();
                C90084c.m156415a(source);
                if (contentLength == -1 || contentLength == ((long) u.length)) {
                    return u;
                }
                throw new IOException("Content-Length (" + contentLength + ") and stream length (" + u.length + ") disagree");
            } catch (Throwable th) {
                C90084c.m156415a(source);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: ".concat(String.valueOf(contentLength)));
        }
    }

    public static AbstractC90031ad create(C90204w wVar, C89427i iVar) {
        return create(wVar, (long) iVar.size(), new C89420f().mo68850a(iVar));
    }

    public static AbstractC90031ad create(C90204w wVar, byte[] bArr) {
        return create(wVar, (long) bArr.length, new C89420f().mo68851a(bArr));
    }

    public static AbstractC90031ad create(C90204w wVar, String str) {
        Charset charset = C90084c.f204450e;
        if (wVar != null && (charset = wVar.mo145074a((Charset) null)) == null) {
            charset = C90084c.f204450e;
            wVar = C90204w.m156843b(wVar + "; charset=utf-8");
        }
        C89420f fVar = new C89420f();
        C89219l.m154719c(str, "");
        C89219l.m154719c(charset, "");
        C89420f a = fVar.mo143802a(str, 0, str.length(), charset);
        return create(wVar, a.f203091b, a);
    }

    public static AbstractC90031ad create(final C90204w wVar, final long j, final AbstractC89426h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        return new AbstractC90031ad() {
            /* class okhttp3.AbstractC90031ad.C900321 */

            static {
                Covode.recordClassIndex(106204);
            }

            @Override // okhttp3.AbstractC90031ad
            public final long contentLength() {
                return j;
            }

            @Override // okhttp3.AbstractC90031ad
            public final C90204w contentType() {
                return wVar;
            }

            @Override // okhttp3.AbstractC90031ad
            public final AbstractC89426h source() {
                return hVar;
            }
        };
    }
}

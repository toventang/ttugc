package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Objects;
import okhttp3.internal.C90084c;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.C89427i;
import p4632k.C89436q;

/* renamed from: okhttp3.ab */
public abstract class AbstractC90025ab {
    static {
        Covode.recordClassIndex(106197);
    }

    public long contentLength() {
        return -1;
    }

    public abstract C90204w contentType();

    public abstract void writeTo(AbstractC89425g gVar);

    public static AbstractC90025ab create(final C90204w wVar, final C89427i iVar) {
        return new AbstractC90025ab() {
            /* class okhttp3.AbstractC90025ab.C900261 */

            static {
                Covode.recordClassIndex(106198);
            }

            @Override // okhttp3.AbstractC90025ab
            public final C90204w contentType() {
                return wVar;
            }

            @Override // okhttp3.AbstractC90025ab
            public final long contentLength() {
                return (long) iVar.size();
            }

            @Override // okhttp3.AbstractC90025ab
            public final void writeTo(AbstractC89425g gVar) {
                gVar.mo68850a(iVar);
            }
        };
    }

    public static AbstractC90025ab create(final C90204w wVar, final File file) {
        Objects.requireNonNull(file, "file == null");
        return new AbstractC90025ab() {
            /* class okhttp3.AbstractC90025ab.C900283 */

            static {
                Covode.recordClassIndex(106200);
            }

            @Override // okhttp3.AbstractC90025ab
            public final C90204w contentType() {
                return wVar;
            }

            @Override // okhttp3.AbstractC90025ab
            public final long contentLength() {
                return file.length();
            }

            @Override // okhttp3.AbstractC90025ab
            public final void writeTo(AbstractC89425g gVar) {
                AbstractC89408aa aaVar = null;
                try {
                    aaVar = C89436q.m155168c(file);
                    gVar.mo68845a(aaVar);
                } finally {
                    C90084c.m156415a(aaVar);
                }
            }
        };
    }

    public static AbstractC90025ab create(C90204w wVar, byte[] bArr) {
        return create(wVar, bArr, 0, bArr.length);
    }

    public static AbstractC90025ab create(C90204w wVar, String str) {
        Charset charset = C90084c.f204450e;
        if (wVar != null && (charset = wVar.mo145074a((Charset) null)) == null) {
            charset = C90084c.f204450e;
            wVar = C90204w.m156843b(wVar + "; charset=utf-8");
        }
        return create(wVar, str.getBytes(charset));
    }

    public static AbstractC90025ab create(final C90204w wVar, final byte[] bArr, final int i, final int i2) {
        Objects.requireNonNull(bArr, "content == null");
        C90084c.m156414a((long) bArr.length, (long) i, (long) i2);
        return new AbstractC90025ab() {
            /* class okhttp3.AbstractC90025ab.C900272 */

            static {
                Covode.recordClassIndex(106199);
            }

            @Override // okhttp3.AbstractC90025ab
            public final long contentLength() {
                return (long) i2;
            }

            @Override // okhttp3.AbstractC90025ab
            public final C90204w contentType() {
                return wVar;
            }

            @Override // okhttp3.AbstractC90025ab
            public final void writeTo(AbstractC89425g gVar) {
                gVar.mo68852a(bArr, i, i2);
            }
        };
    }
}

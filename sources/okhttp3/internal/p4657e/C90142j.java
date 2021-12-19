package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4657e.C90112d;
import p4632k.AbstractC89425g;
import p4632k.C89420f;

/* access modifiers changed from: package-private */
/* renamed from: okhttp3.internal.e.j */
public final class C90142j implements Closeable {

    /* renamed from: c */
    private static final Logger f204675c = Logger.getLogger(C90115e.class.getName());

    /* renamed from: a */
    public int f204676a = 16384;

    /* renamed from: b */
    final C90112d.C90114b f204677b;

    /* renamed from: d */
    private final AbstractC89425g f204678d;

    /* renamed from: e */
    private final boolean f204679e;

    /* renamed from: f */
    private final C89420f f204680f;

    /* renamed from: g */
    private boolean f204681g;

    /* renamed from: a */
    public final synchronized void mo144923a(boolean z, int i, List<C90110c> list) {
        MethodCollector.m26663i(7618);
        if (!this.f204681g) {
            this.f204677b.mo144874a(list);
            long j = this.f204680f.f203091b;
            int min = (int) Math.min((long) this.f204676a, j);
            long j2 = (long) min;
            byte b = j == j2 ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m156589a(i, min, (byte) 1, b);
            this.f204678d.mo22060a(this.f204680f, j2);
            if (j > j2) {
                m156591b(i, j - j2);
            }
            MethodCollector.m26664o(7618);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7618);
            throw iOException;
        }
    }

    /* renamed from: a */
    public final synchronized void mo144924a(boolean z, int i, C89420f fVar, int i2) {
        MethodCollector.m26663i(7621);
        if (!this.f204681g) {
            m156589a(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.f204678d.mo22060a(fVar, (long) i2);
            }
            MethodCollector.m26664o(7621);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7621);
            throw iOException;
        }
    }

    /* renamed from: a */
    public final synchronized void mo144922a(boolean z, int i, int i2) {
        MethodCollector.m26663i(7922);
        if (!this.f204681g) {
            m156589a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f204678d.mo68857c(i);
            this.f204678d.mo68857c(i2);
            this.f204678d.flush();
            MethodCollector.m26664o(7922);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7922);
            throw iOException;
        }
    }

    static {
        Covode.recordClassIndex(106314);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(8082);
        this.f204681g = true;
        this.f204678d.close();
        MethodCollector.m26664o(8082);
    }

    /* renamed from: b */
    public final synchronized void mo144925b() {
        MethodCollector.m26663i(7617);
        if (!this.f204681g) {
            this.f204678d.flush();
            MethodCollector.m26664o(7617);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7617);
            throw iOException;
        }
    }

    /* renamed from: a */
    public final synchronized void mo144917a() {
        MethodCollector.m26663i(7465);
        if (this.f204681g) {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7465);
            throw iOException;
        } else if (!this.f204679e) {
            MethodCollector.m26664o(7465);
        } else {
            Logger logger = f204675c;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C90084c.m156407a(">> CONNECTION %s", C90115e.f204553a.hex()));
            }
            this.f204678d.mo68851a(C90115e.f204553a.toByteArray());
            this.f204678d.flush();
            MethodCollector.m26664o(7465);
        }
    }

    /* renamed from: b */
    public final synchronized void mo144926b(C90147m mVar) {
        int i;
        MethodCollector.m26663i(7784);
        if (!this.f204681g) {
            int i2 = 0;
            m156589a(0, Integer.bitCount(mVar.f204690a) * 6, (byte) 4, (byte) 0);
            while (true) {
                if (mVar.mo144932a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 4;
                    } else {
                        i = i2;
                    }
                    this.f204678d.mo68854b(i);
                    this.f204678d.mo68857c(mVar.f204691b[i2]);
                }
                i2++;
                if (i2 >= 10) {
                    this.f204678d.flush();
                    MethodCollector.m26664o(7784);
                }
            }
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7784);
            throw iOException;
        }
    }

    /* renamed from: a */
    public final synchronized void mo144921a(C90147m mVar) {
        MethodCollector.m26663i(7466);
        if (!this.f204681g) {
            int i = this.f204676a;
            if ((mVar.f204690a & 32) != 0) {
                i = mVar.f204691b[5];
            }
            this.f204676a = i;
            if (mVar.mo144930a() != -1) {
                this.f204677b.mo144873a(mVar.mo144930a());
            }
            m156589a(0, 0, (byte) 4, (byte) 1);
            this.f204678d.flush();
            MethodCollector.m26664o(7466);
        } else {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7466);
            throw iOException;
        }
    }

    C90142j(AbstractC89425g gVar, boolean z) {
        this.f204678d = gVar;
        this.f204679e = z;
        C89420f fVar = new C89420f();
        this.f204680f = fVar;
        this.f204677b = new C90112d.C90114b(fVar);
    }

    /* renamed from: a */
    private static void m156590a(AbstractC89425g gVar, int i) {
        gVar.mo68847a((i >>> 16) & 255);
        gVar.mo68847a((i >>> 8) & 255);
        gVar.mo68847a(i & 255);
    }

    /* renamed from: b */
    private void m156591b(int i, long j) {
        byte b;
        while (j > 0) {
            int min = (int) Math.min((long) this.f204676a, j);
            long j2 = (long) min;
            j -= j2;
            if (j == 0) {
                b = 4;
            } else {
                b = 0;
            }
            m156589a(i, min, (byte) 9, b);
            this.f204678d.mo22060a(this.f204680f, j2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo144919a(int i, EnumC90109b bVar) {
        MethodCollector.m26663i(7620);
        if (this.f204681g) {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7620);
            throw iOException;
        } else if (bVar.httpCode != -1) {
            m156589a(i, 4, (byte) 3, (byte) 0);
            this.f204678d.mo68857c(bVar.httpCode);
            this.f204678d.flush();
            MethodCollector.m26664o(7620);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            MethodCollector.m26664o(7620);
            throw illegalArgumentException;
        }
    }

    /* renamed from: a */
    public final synchronized void mo144918a(int i, long j) {
        MethodCollector.m26663i(7926);
        if (this.f204681g) {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7926);
            throw iOException;
        } else if (j == 0 || j > 2147483647L) {
            IllegalArgumentException a = C90115e.m156502a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            MethodCollector.m26664o(7926);
            throw a;
        } else {
            m156589a(i, 4, (byte) 8, (byte) 0);
            this.f204678d.mo68857c((int) j);
            this.f204678d.flush();
            MethodCollector.m26664o(7926);
        }
    }

    /* renamed from: a */
    public final synchronized void mo144920a(int i, EnumC90109b bVar, byte[] bArr) {
        MethodCollector.m26663i(7924);
        if (this.f204681g) {
            IOException iOException = new IOException("closed");
            MethodCollector.m26664o(7924);
            throw iOException;
        } else if (bVar.httpCode != -1) {
            m156589a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f204678d.mo68857c(i);
            this.f204678d.mo68857c(bVar.httpCode);
            if (bArr.length > 0) {
                this.f204678d.mo68851a(bArr);
            }
            this.f204678d.flush();
            MethodCollector.m26664o(7924);
        } else {
            IllegalArgumentException a = C90115e.m156502a("errorCode.httpCode == -1", new Object[0]);
            MethodCollector.m26664o(7924);
            throw a;
        }
    }

    /* renamed from: a */
    private void m156589a(int i, int i2, byte b, byte b2) {
        Logger logger = f204675c;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C90115e.m156503a(false, i, i2, b, b2));
        }
        int i3 = this.f204676a;
        if (i2 > i3) {
            throw C90115e.m156502a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m156590a(this.f204678d, i2);
            this.f204678d.mo68847a(b & 255);
            this.f204678d.mo68847a(b2 & 255);
            this.f204678d.mo68857c(i & Integer.MAX_VALUE);
        } else {
            throw C90115e.m156502a("reserved bit set: %s", Integer.valueOf(i));
        }
    }
}

package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.r */
public class C87779r implements Closeable {

    /* renamed from: c */
    private static final Logger f199371c = Logger.getLogger(C87779r.class.getName());

    /* renamed from: a */
    public final RandomAccessFile f199372a;

    /* renamed from: b */
    int f199373b;

    /* renamed from: d */
    private int f199374d;

    /* renamed from: e */
    private C87781a f199375e;

    /* renamed from: f */
    private C87781a f199376f;

    /* renamed from: g */
    private final byte[] f199377g;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$c */
    public interface AbstractC87783c {
        static {
            Covode.recordClassIndex(103781);
        }

        /* renamed from: a */
        void mo142250a(InputStream inputStream, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$a */
    public static class C87781a {

        /* renamed from: a */
        static final C87781a f199381a = new C87781a(0, 0);

        /* renamed from: b */
        final int f199382b;

        /* renamed from: c */
        final int f199383c;

        static {
            Covode.recordClassIndex(103779);
        }

        public final String toString() {
            return getClass().getSimpleName() + "[position = " + this.f199382b + ", length = " + this.f199383c + "]";
        }

        C87781a(int i, int i2) {
            this.f199382b = i;
            this.f199383c = i2;
        }
    }

    static {
        Covode.recordClassIndex(103777);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        MethodCollector.m26663i(4543);
        this.f199372a.close();
        MethodCollector.m26664o(4543);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.twitter.sdk.android.core.internal.scribe.r$b */
    public final class C87782b extends InputStream {

        /* renamed from: b */
        private int f199385b;

        /* renamed from: c */
        private int f199386c;

        static {
            Covode.recordClassIndex(103780);
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f199386c == 0) {
                return -1;
            }
            C87779r.this.f199372a.seek((long) this.f199385b);
            int read = C87779r.this.f199372a.read();
            this.f199385b = C87779r.this.mo142244a(this.f199385b + 1);
            this.f199386c--;
            return read;
        }

        private C87782b(C87781a aVar) {
            MethodCollector.m26663i(6834);
            this.f199385b = C87779r.this.mo142244a(aVar.f199382b + 4);
            this.f199386c = aVar.f199383c;
            MethodCollector.m26664o(6834);
        }

        /* synthetic */ C87782b(C87779r rVar, C87781a aVar, byte b) {
            this(aVar);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            C87779r.m152774a(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f199386c;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C87779r rVar = C87779r.this;
            int a = rVar.mo142244a(this.f199385b);
            if (a + i2 <= rVar.f199373b) {
                rVar.f199372a.seek((long) a);
                rVar.f199372a.readFully(bArr, i, i2);
            } else {
                int i4 = rVar.f199373b - a;
                rVar.f199372a.seek((long) a);
                rVar.f199372a.readFully(bArr, i, i4);
                rVar.f199372a.seek(16);
                rVar.f199372a.readFully(bArr, i + i4, i2 - i4);
            }
            this.f199385b = C87779r.this.mo142244a(this.f199385b + i2);
            this.f199386c -= i2;
            return i2;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo142247b() {
        MethodCollector.m26663i(4527);
        if (this.f199374d == 0) {
            MethodCollector.m26664o(4527);
            return true;
        }
        MethodCollector.m26664o(4527);
        return false;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append('[');
        sb.append("fileLength=").append(this.f199373b);
        sb.append(", size=").append(this.f199374d);
        sb.append(", first=").append(this.f199375e);
        sb.append(", last=").append(this.f199376f);
        sb.append(", element lengths=[");
        try {
            mo142245a(new AbstractC87783c() {
                /* class com.twitter.sdk.android.core.internal.scribe.C87779r.C877801 */

                /* renamed from: a */
                boolean f199378a = true;

                static {
                    Covode.recordClassIndex(103778);
                }

                @Override // com.twitter.sdk.android.core.internal.scribe.C87779r.AbstractC87783c
                /* renamed from: a */
                public final void mo142250a(InputStream inputStream, int i) {
                    if (this.f199378a) {
                        this.f199378a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f199371c.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo142243a() {
        if (this.f199374d == 0) {
            return 16;
        }
        if (this.f199376f.f199382b >= this.f199375e.f199382b) {
            return (this.f199376f.f199382b - this.f199375e.f199382b) + 4 + this.f199376f.f199383c + 16;
        }
        return (((this.f199376f.f199382b + 4) + this.f199376f.f199383c) + this.f199373b) - this.f199375e.f199382b;
    }

    /* renamed from: a */
    private static RandomAccessFile m152773a(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: b */
    private C87781a m152780b(int i) {
        if (i == 0) {
            return C87781a.f199381a;
        }
        this.f199372a.seek((long) i);
        return new C87781a(i, this.f199372a.readInt());
    }

    public C87779r(File file) {
        MethodCollector.m26663i(4400);
        byte[] bArr = new byte[16];
        this.f199377g = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile a = m152773a(file2);
            try {
                a.setLength(4096);
                a.seek(0);
                byte[] bArr2 = new byte[16];
                m152778a(bArr2, 4096, 0, 0, 0);
                a.write(bArr2);
                a.close();
                if (!file2.renameTo(file)) {
                    IOException iOException = new IOException("Rename failed!");
                    MethodCollector.m26664o(4400);
                    throw iOException;
                }
            } catch (Throwable th) {
                a.close();
                MethodCollector.m26664o(4400);
                throw th;
            }
        }
        RandomAccessFile a2 = m152773a(file);
        this.f199372a = a2;
        a2.seek(0);
        a2.readFully(bArr);
        int b = m152779b(bArr, 0);
        this.f199373b = b;
        if (((long) b) <= a2.length()) {
            this.f199374d = m152779b(bArr, 4);
            int b2 = m152779b(bArr, 8);
            int b3 = m152779b(bArr, 12);
            this.f199375e = m152780b(b2);
            this.f199376f = m152780b(b3);
            MethodCollector.m26664o(4400);
            return;
        }
        IOException iOException2 = new IOException("File is truncated. Expected length: " + this.f199373b + ", Actual length: " + a2.length());
        MethodCollector.m26664o(4400);
        throw iOException2;
    }

    /* renamed from: c */
    private void m152781c(int i) {
        int i2 = i + 4;
        int a = this.f199373b - mo142243a();
        if (a < i2) {
            int i3 = this.f199373b;
            do {
                a += i3;
                i3 <<= 1;
            } while (a < i2);
            this.f199372a.setLength((long) i3);
            this.f199372a.getChannel().force(true);
            int a2 = mo142244a(this.f199376f.f199382b + 4 + this.f199376f.f199383c);
            if (a2 < this.f199375e.f199382b) {
                FileChannel channel = this.f199372a.getChannel();
                channel.position((long) this.f199373b);
                long j = (long) (a2 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f199376f.f199382b < this.f199375e.f199382b) {
                int i4 = (this.f199373b + this.f199376f.f199382b) - 16;
                m152775a(i3, this.f199374d, this.f199375e.f199382b, i4);
                this.f199376f = new C87781a(i4, this.f199376f.f199383c);
            } else {
                m152775a(i3, this.f199374d, this.f199375e.f199382b, this.f199376f.f199382b);
            }
            this.f199373b = i3;
        }
    }

    /* renamed from: a */
    public final int mo142244a(int i) {
        int i2 = this.f199373b;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    /* renamed from: a */
    public final synchronized void mo142245a(AbstractC87783c cVar) {
        MethodCollector.m26663i(4540);
        int i = this.f199375e.f199382b;
        for (int i2 = 0; i2 < this.f199374d; i2++) {
            C87781a b = m152780b(i);
            cVar.mo142250a(new C87782b(this, b, (byte) 0), b.f199383c);
            i = mo142244a(b.f199382b + 4 + b.f199383c);
        }
        MethodCollector.m26664o(4540);
    }

    /* renamed from: a */
    public static <T> T m152774a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    private static void m152778a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            m152777a(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    /* renamed from: b */
    private static int m152779b(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    public final synchronized void mo142246a(byte[] bArr, int i) {
        int i2;
        int i3;
        MethodCollector.m26663i(4426);
        m152774a(bArr, "buffer");
        if ((i | 0) < 0 || i > bArr.length - 0) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.m26664o(4426);
            throw indexOutOfBoundsException;
        }
        m152781c(i);
        boolean b = mo142247b();
        if (b) {
            i2 = 16;
        } else {
            i2 = mo142244a(this.f199376f.f199382b + 4 + this.f199376f.f199383c);
        }
        C87781a aVar = new C87781a(i2, i);
        m152777a(this.f199377g, 0, i);
        m152776a(aVar.f199382b, this.f199377g, 4);
        m152776a(aVar.f199382b + 4, bArr, i);
        if (b) {
            i3 = aVar.f199382b;
        } else {
            i3 = this.f199375e.f199382b;
        }
        m152775a(this.f199373b, this.f199374d + 1, i3, aVar.f199382b);
        this.f199376f = aVar;
        this.f199374d++;
        if (b) {
            this.f199375e = aVar;
        }
        MethodCollector.m26664o(4426);
    }

    /* renamed from: a */
    private static void m152777a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    private void m152776a(int i, byte[] bArr, int i2) {
        int a = mo142244a(i);
        int i3 = a + i2;
        int i4 = this.f199373b;
        if (i3 <= i4) {
            this.f199372a.seek((long) a);
            this.f199372a.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - a;
        this.f199372a.seek((long) a);
        this.f199372a.write(bArr, 0, i5);
        this.f199372a.seek(16);
        this.f199372a.write(bArr, i5 + 0, i2 - i5);
    }

    /* renamed from: a */
    private void m152775a(int i, int i2, int i3, int i4) {
        m152778a(this.f199377g, i, i2, i3, i4);
        this.f199372a.seek(0);
        this.f199372a.write(this.f199377g);
    }
}

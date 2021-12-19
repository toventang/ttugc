package com.p2082ss.android.ugc.aweme.compliance.business.p2651d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.d.a */
public final class C39404a implements AbstractC89425g {

    /* renamed from: e */
    private static final byte[] f93005e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    public final C89420f f93006a = new C89420f();

    /* renamed from: b */
    public final C39406b f93007b;

    /* renamed from: c */
    public final AbstractC89447y f93008c;

    /* renamed from: d */
    boolean f93009d;

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final C89420f mo68846a() {
        return this.f93006a;
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: d */
    public final OutputStream mo68859d() {
        return new OutputStream() {
            /* class com.p2082ss.android.ugc.aweme.compliance.business.p2651d.C39404a.C394051 */

            static {
                Covode.recordClassIndex(47092);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
            }

            public final String toString() {
                return this + ".outputStream()";
            }

            {
                MethodCollector.m26663i(10104);
                MethodCollector.m26664o(10104);
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                if (!C39404a.this.f93009d) {
                    C39404a.this.f93006a.mo68847a((int) ((byte) i));
                    return;
                }
                throw new IOException("closed");
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                if (!C39404a.this.f93009d) {
                    C39404a.this.f93006a.mo68852a(bArr, i, i2);
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    public final boolean isOpen() {
        if (!this.f93009d) {
            return true;
        }
        return false;
    }

    @Override // p4632k.AbstractC89447y
    public final C89409ab timeout() {
        return this.f93008c.timeout();
    }

    static {
        Covode.recordClassIndex(47091);
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: b */
    public final AbstractC89425g mo68853b() {
        if (!this.f93009d) {
            long g = this.f93006a.mo143821g();
            if (g > 0) {
                this.f93008c.mo22060a(this.f93006a, g);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: c */
    public final AbstractC89425g mo68856c() {
        if (!this.f93009d) {
            long j = this.f93006a.f203091b;
            if (j > 0) {
                this.f93008c.mo22060a(this.f93006a, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.f93008c + ")";
    }

    @Override // java.io.Closeable, p4632k.AbstractC89447y, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f93009d) {
            Throwable th = null;
            try {
                if (this.f93006a.f203091b > 0) {
                    AbstractC89447y yVar = this.f93008c;
                    C89420f fVar = this.f93006a;
                    yVar.mo22060a(fVar, fVar.f203091b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f93008c.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f93009d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // p4632k.AbstractC89425g, p4632k.AbstractC89447y, java.io.Flushable
    public final void flush() {
        if (!this.f93009d) {
            if (this.f93006a.f203091b > 0) {
                AbstractC89447y yVar = this.f93008c;
                C89420f fVar = this.f93006a;
                yVar.mo22060a(fVar, fVar.f203091b);
            }
            this.f93008c.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68850a(C89427i iVar) {
        write(iVar.asByteBuffer());
        return this;
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final long mo68845a(AbstractC89408aa aaVar) {
        if (aaVar != null) {
            return 0;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: e */
    private boolean m80101e(int i) {
        if (this.f93007b.mo68870b(1) <= 0) {
            return false;
        }
        this.f93006a.mo68847a(i);
        return true;
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68847a(int i) {
        if (!this.f93009d) {
            m80101e(i);
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: d */
    public final AbstractC89425g mo68860d(int i) {
        return mo68857c(((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68851a(byte[] bArr) {
        return mo68852a(bArr, 0, bArr.length);
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: b */
    public final AbstractC89425g mo68854b(int i) {
        if (!this.f93009d) {
            long b = this.f93007b.mo68870b(2);
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    long j = (long) i2;
                    if (j >= b) {
                        break;
                    }
                    this.f93006a.mo68847a((int) ((byte) ((i >> ((int) ((b - j) * 8))) & 255)));
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: c */
    public final AbstractC89425g mo68857c(int i) {
        if (!this.f93009d) {
            long b = this.f93007b.mo68870b(4);
            if (b > 0) {
                int i2 = 0;
                while (true) {
                    long j = (long) i2;
                    if (j >= b) {
                        break;
                    }
                    this.f93006a.mo68847a((int) ((byte) ((i >> ((int) ((b - j) * 8))) & 255)));
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.f93009d) {
            int b = (int) this.f93007b.mo68870b((long) byteBuffer.remaining());
            if (b > 0) {
                int i = b;
                do {
                    int min = Math.min(i, 4096);
                    byte[] bArr = new byte[min];
                    byteBuffer.get(bArr, 0, min);
                    i -= min;
                    this.f93006a.mo68851a(bArr);
                } while (i > 0);
                mo68853b();
            }
            return b;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68848a(long j) {
        long j2 = ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        if (!this.f93009d) {
            long b = this.f93007b.mo68870b(8);
            if (b > 0) {
                int i = 0;
                while (true) {
                    long j3 = (long) i;
                    if (j3 >= b) {
                        break;
                    }
                    this.f93006a.mo68847a((int) ((byte) ((int) ((j2 >> ((int) ((b - j3) * 8))) & 255))));
                    i++;
                }
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: c */
    public final AbstractC89425g mo68858c(long j) {
        if (this.f93009d) {
            throw new IllegalStateException("closed");
        } else if (j == 0 && m80101e(48)) {
            return mo68853b();
        } else {
            long b = this.f93007b.mo68870b((long) ((Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1));
            if (b > 0) {
                for (int i = (int) (b - 1); i >= 0; i--) {
                    this.f93006a.mo68847a((int) f93005e[(int) (15 & j)]);
                    j >>>= 4;
                }
            }
            return this;
        }
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68849a(String str) {
        char c;
        char charAt;
        int length = str.length();
        if (this.f93009d) {
            throw new IllegalStateException("closed");
        } else if (length < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
        } else if (length <= str.length()) {
            int i = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    int min = Math.min(length, 4096);
                    byte[] bArr = new byte[min];
                    int i2 = -i;
                    int i3 = i + 1;
                    bArr[i + i2] = (byte) charAt2;
                    while (true) {
                        i = i3;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            long b = this.f93007b.mo68870b((long) (i2 + i));
                        } else {
                            i3 = i + 1;
                            bArr[i + i2] = (byte) charAt;
                        }
                    }
                    long b2 = this.f93007b.mo68870b((long) (i2 + i));
                    if (b2 > 0) {
                        this.f93006a.mo68852a(bArr, 0, (int) b2);
                    }
                } else {
                    if (charAt2 < 2048) {
                        m80101e((charAt2 >> 6) | 192);
                        m80101e((charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        m80101e((charAt2 >> '\f') | 224);
                        m80101e(((charAt2 >> 6) & 63) | 128);
                        m80101e((charAt2 & '?') | 128);
                    } else {
                        int i4 = i + 1;
                        if (i4 < length) {
                            c = str.charAt(i4);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || c < 56320 || c > 57343) {
                            m80101e(63);
                            i = i4;
                        } else {
                            int i5 = (((charAt2 & 10239) << 10) | (9215 & c)) + 65536;
                            m80101e((i5 >> 18) | 240);
                            m80101e(((i5 >> 12) & 63) | 128);
                            m80101e(((i5 >> 6) & 63) | 128);
                            m80101e((i5 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: b */
    public final AbstractC89425g mo68855b(long j) {
        int i;
        if (this.f93009d) {
            throw new IllegalStateException("closed");
        } else if (j == 0 && m80101e(48)) {
            return mo68853b();
        } else {
            int i2 = 0;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    return mo68849a("-9223372036854775808");
                }
                i2 = 1;
            }
            if (j < 100000000) {
                if (j < 10000) {
                    if (j < 100) {
                        if (j < 10) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                    } else if (j < 1000) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                } else if (j < 1000000) {
                    if (j < 100000) {
                        i = 5;
                    } else {
                        i = 6;
                    }
                } else if (j < 10000000) {
                    i = 7;
                } else {
                    i = 8;
                }
            } else if (j < 1000000000000L) {
                if (j < 10000000000L) {
                    if (j < 1000000000) {
                        i = 9;
                    } else {
                        i = 10;
                    }
                } else if (j < 100000000000L) {
                    i = 11;
                } else {
                    i = 12;
                }
            } else if (j < 1000000000000000L) {
                if (j < 10000000000000L) {
                    i = 13;
                } else if (j < 100000000000000L) {
                    i = 14;
                } else {
                    i = 15;
                }
            } else if (j < 100000000000000000L) {
                if (j < 10000000000000000L) {
                    i = 16;
                } else {
                    i = 17;
                }
            } else if (j < 1000000000000000000L) {
                i = 18;
            } else {
                i = 19;
            }
            if (i2 != 0) {
                i++;
            }
            long b = this.f93007b.mo68870b((long) i);
            if (b > 0) {
                int i3 = (int) b;
                byte[] bArr = new byte[i3];
                int i4 = i3 - 1;
                while (j != 0 && i4 > i2) {
                    i4--;
                    bArr[i4] = f93005e[(int) (j % 10)];
                    j /= 10;
                }
                if (i2 != 0) {
                    bArr[i4 - 1] = 45;
                }
                this.f93006a.mo68851a(bArr);
            }
            return this;
        }
    }

    public C39404a(AbstractC89447y yVar, C39406b bVar) {
        Objects.requireNonNull(yVar, "sink == null");
        this.f93008c = yVar;
        this.f93007b = bVar;
    }

    @Override // p4632k.AbstractC89447y
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        if (!this.f93009d) {
            long b = this.f93007b.mo68870b((long) ((int) j));
            if (b > 0) {
                this.f93006a.mo22060a(fVar, b);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final AbstractC89425g mo68852a(byte[] bArr, int i, int i2) {
        if (!this.f93009d) {
            long b = this.f93007b.mo68870b((long) i2);
            if (b > 0) {
                this.f93006a.mo68852a(bArr, i, (int) b);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }
}

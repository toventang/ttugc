package com.squareup.p2075a.p2076a.p2077a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.p2075a.p2076a.p2077a.AbstractC29101b;
import com.squareup.p2075a.p2076a.p2077a.C29125h;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: com.squareup.a.a.a.i */
public final class C29128i implements AbstractC29145p {

    /* renamed from: a */
    public static final Logger f68912a = Logger.getLogger(C29130b.class.getName());

    /* renamed from: b */
    public static final C89427i f68913b = C89427i.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.a.i$b */
    public static final class C29130b {

        /* renamed from: a */
        private static final String[] f68920a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f68921b = new String[64];

        /* renamed from: c */
        private static final String[] f68922c = new String[256];

        C29130b() {
        }

        static {
            Covode.recordClassIndex(35479);
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f68922c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = C1764a.m5928a("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f68921b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 <= 0; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = f68921b;
                strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
            }
            String[] strArr4 = f68921b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            int i5 = 0;
            do {
                int i6 = iArr2[i5];
                int i7 = 0;
                do {
                    int i8 = iArr[i7];
                    String[] strArr5 = f68921b;
                    int i9 = i8 | i6;
                    strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                    strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
                    i7++;
                } while (i7 <= 0);
                i5++;
            } while (i5 < 3);
            while (true) {
                String[] strArr6 = f68921b;
                if (i < strArr6.length) {
                    if (strArr6[i] == null) {
                        strArr6[i] = f68922c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private static String m58183a(byte b, byte b2) {
            String str;
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        return "ACK";
                    }
                    return f68922c[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr = f68921b;
                    if (b2 < strArr.length) {
                        str = strArr[b2];
                    } else {
                        str = f68922c[b2];
                    }
                    if (b == 5) {
                        if ((b2 & 4) != 0) {
                            return str.replace("HEADERS", "PUSH_PROMISE");
                        }
                    } else if (b == 0 && (b2 & 32) != 0) {
                        return str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            }
            return f68922c[b2];
        }

        /* renamed from: a */
        static String m58184a(boolean z, int i, int i2, byte b, byte b2) {
            String a;
            String str;
            String[] strArr = f68920a;
            if (b < strArr.length) {
                a = strArr[b];
            } else {
                a = C1764a.m5928a("0x%02x", new Object[]{Byte.valueOf(b)});
            }
            String a2 = m58183a(b, b2);
            Object[] objArr = new Object[5];
            if (z) {
                str = "<<";
            } else {
                str = ">>";
            }
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = a;
            objArr[4] = a2;
            return C1764a.m5928a("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: com.squareup.a.a.a.i$d */
    static final class C29132d implements AbstractC29103c {

        /* renamed from: a */
        private final AbstractC89425g f68927a;

        /* renamed from: b */
        private final boolean f68928b;

        /* renamed from: c */
        private final C89420f f68929c;

        /* renamed from: d */
        private final C29125h.C29127b f68930d;

        /* renamed from: e */
        private int f68931e = 16384;

        /* renamed from: f */
        private boolean f68932f;

        static {
            Covode.recordClassIndex(35481);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: c */
        public final int mo50775c() {
            return this.f68931e;
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50772a(boolean z, boolean z2, int i, List<C29123f> list) {
            MethodCollector.m26663i(1367);
            if (!this.f68932f) {
                this.f68930d.mo50819a(list);
                long j = this.f68929c.f203091b;
                int min = (int) Math.min((long) this.f68931e, j);
                long j2 = (long) min;
                byte b = j == j2 ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                m58189a(i, min, (byte) 1, b);
                this.f68927a.mo22060a(this.f68929c, j2);
                if (j > j2) {
                    m58190b(i, j - j2);
                }
                MethodCollector.m26664o(1367);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1367);
                throw iOException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50771a(boolean z, int i, C89420f fVar, int i2) {
            MethodCollector.m26663i(1425);
            if (!this.f68932f) {
                m58189a(i, i2, (byte) 0, z ? (byte) 1 : 0);
                if (i2 > 0) {
                    this.f68927a.mo22060a(fVar, (long) i2);
                }
                MethodCollector.m26664o(1425);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1425);
                throw iOException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50770a(boolean z, int i, int i2) {
            MethodCollector.m26663i(1630);
            if (!this.f68932f) {
                m58189a(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f68927a.mo68857c(i);
                this.f68927a.mo68857c(i2);
                this.f68927a.flush();
                MethodCollector.m26664o(1630);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1630);
                throw iOException;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.m26663i(1769);
            this.f68932f = true;
            this.f68927a.close();
            MethodCollector.m26664o(1769);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: b */
        public final synchronized void mo50773b() {
            MethodCollector.m26663i(1277);
            if (!this.f68932f) {
                this.f68927a.flush();
                MethodCollector.m26664o(1277);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1277);
                throw iOException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50765a() {
            MethodCollector.m26663i(1294);
            if (this.f68932f) {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1294);
                throw iOException;
            } else if (!this.f68928b) {
                MethodCollector.m26664o(1294);
            } else {
                if (C29128i.f68912a.isLoggable(Level.FINE)) {
                    C29128i.f68912a.fine(C1764a.m5928a(">> CONNECTION %s", new Object[]{C29128i.f68913b.hex()}));
                }
                this.f68927a.mo68851a(C29128i.f68913b.toByteArray());
                this.f68927a.flush();
                MethodCollector.m26664o(1294);
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: b */
        public final synchronized void mo50774b(C29141n nVar) {
            int i;
            MethodCollector.m26663i(1589);
            if (!this.f68932f) {
                int i2 = 0;
                m58189a(0, Integer.bitCount(nVar.f68949a) * 6, (byte) 4, (byte) 0);
                while (true) {
                    if (nVar.mo50831a(i2)) {
                        if (i2 == 4) {
                            i = 3;
                        } else if (i2 == 7) {
                            i = 4;
                        } else {
                            i = i2;
                        }
                        this.f68927a.mo68854b(i);
                        this.f68927a.mo68857c(nVar.f68952d[i2]);
                    }
                    i2++;
                    if (i2 >= 10) {
                        this.f68927a.flush();
                        MethodCollector.m26664o(1589);
                    }
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1589);
                throw iOException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50769a(C29141n nVar) {
            MethodCollector.m26663i(1281);
            if (!this.f68932f) {
                int i = this.f68931e;
                if ((nVar.f68949a & 32) != 0) {
                    i = nVar.f68952d[5];
                }
                this.f68931e = i;
                m58189a(0, 0, (byte) 4, (byte) 1);
                this.f68927a.flush();
                MethodCollector.m26664o(1281);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1281);
                throw iOException;
            }
        }

        C29132d(AbstractC89425g gVar, boolean z) {
            this.f68927a = gVar;
            this.f68928b = z;
            C89420f fVar = new C89420f();
            this.f68929c = fVar;
            this.f68930d = new C29125h.C29127b(fVar);
        }

        /* renamed from: b */
        private void m58190b(int i, long j) {
            byte b;
            while (j > 0) {
                int min = (int) Math.min((long) this.f68931e, j);
                long j2 = (long) min;
                j -= j2;
                if (j == 0) {
                    b = 4;
                } else {
                    b = 0;
                }
                m58189a(i, min, (byte) 9, b);
                this.f68927a.mo22060a(this.f68929c, j2);
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50767a(int i, EnumC29100a aVar) {
            MethodCollector.m26663i(1395);
            if (this.f68932f) {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1395);
                throw iOException;
            } else if (aVar.httpCode != -1) {
                m58189a(i, 4, (byte) 3, (byte) 0);
                this.f68927a.mo68857c(aVar.httpCode);
                this.f68927a.flush();
                MethodCollector.m26664o(1395);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                MethodCollector.m26664o(1395);
                throw illegalArgumentException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50766a(int i, long j) {
            MethodCollector.m26663i(1664);
            if (this.f68932f) {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1664);
                throw iOException;
            } else if (j == 0 || j > 2147483647L) {
                IllegalArgumentException a = C29128i.m58178a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
                MethodCollector.m26664o(1664);
                throw a;
            } else {
                m58189a(i, 4, (byte) 8, (byte) 0);
                this.f68927a.mo68857c((int) j);
                this.f68927a.flush();
                MethodCollector.m26664o(1664);
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50768a(int i, EnumC29100a aVar, byte[] bArr) {
            MethodCollector.m26663i(1637);
            if (this.f68932f) {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(1637);
                throw iOException;
            } else if (aVar.httpCode != -1) {
                m58189a(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f68927a.mo68857c(i);
                this.f68927a.mo68857c(aVar.httpCode);
                if (bArr.length > 0) {
                    this.f68927a.mo68851a(bArr);
                }
                this.f68927a.flush();
                MethodCollector.m26664o(1637);
            } else {
                IllegalArgumentException a = C29128i.m58178a("errorCode.httpCode == -1", new Object[0]);
                MethodCollector.m26664o(1637);
                throw a;
            }
        }

        /* renamed from: a */
        private void m58189a(int i, int i2, byte b, byte b2) {
            if (C29128i.f68912a.isLoggable(Level.FINE)) {
                C29128i.f68912a.fine(C29130b.m58184a(false, i, i2, b, b2));
            }
            int i3 = this.f68931e;
            if (i2 > i3) {
                throw C29128i.m58178a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C29128i.m58179a(this.f68927a, i2);
                this.f68927a.mo68847a(b & 255);
                this.f68927a.mo68847a(b2 & 255);
                this.f68927a.mo68857c(i & Integer.MAX_VALUE);
            } else {
                throw C29128i.m58178a("reserved bit set: %s", Integer.valueOf(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.a.i$a */
    public static final class C29129a implements AbstractC89408aa {

        /* renamed from: a */
        int f68914a;

        /* renamed from: b */
        byte f68915b;

        /* renamed from: c */
        int f68916c;

        /* renamed from: d */
        int f68917d;

        /* renamed from: e */
        short f68918e;

        /* renamed from: f */
        private final AbstractC89426h f68919f;

        static {
            Covode.recordClassIndex(35478);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // p4632k.AbstractC89408aa
        public final C89409ab timeout() {
            return this.f68919f.timeout();
        }

        public C29129a(AbstractC89426h hVar) {
            this.f68919f = hVar;
        }

        @Override // p4632k.AbstractC89408aa
        public final long read(C89420f fVar, long j) {
            int i;
            int j2;
            do {
                int i2 = this.f68917d;
                if (i2 == 0) {
                    this.f68919f.mo143838l((long) this.f68918e);
                    this.f68918e = 0;
                    if ((this.f68915b & 4) != 0) {
                        return -1;
                    }
                    i = this.f68916c;
                    int a = C29128i.m58177a(this.f68919f);
                    this.f68917d = a;
                    this.f68914a = a;
                    byte h = (byte) (this.f68919f.mo143824h() & 255);
                    this.f68915b = (byte) (this.f68919f.mo143824h() & 255);
                    if (C29128i.f68912a.isLoggable(Level.FINE)) {
                        C29128i.f68912a.fine(C29130b.m58184a(true, this.f68916c, this.f68914a, h, this.f68915b));
                    }
                    j2 = this.f68919f.mo143832j() & Integer.MAX_VALUE;
                    this.f68916c = j2;
                    if (h != 9) {
                        throw C29128i.m58180b("%s != TYPE_CONTINUATION", Byte.valueOf(h));
                    }
                } else {
                    long read = this.f68919f.read(fVar, Math.min(j, (long) i2));
                    if (read == -1) {
                        return -1;
                    }
                    this.f68917d = (int) (((long) this.f68917d) - read);
                    return read;
                }
            } while (j2 == i);
            throw C29128i.m58180b("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
    }

    /* renamed from: com.squareup.a.a.a.i$c */
    static final class C29131c implements AbstractC29101b {

        /* renamed from: a */
        final C29125h.C29126a f68923a;

        /* renamed from: b */
        private final AbstractC89426h f68924b;

        /* renamed from: c */
        private final C29129a f68925c;

        /* renamed from: d */
        private final boolean f68926d;

        static {
            Covode.recordClassIndex(35480);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f68924b.close();
        }

        /* renamed from: b */
        private void m58186b() {
            this.f68924b.mo143832j();
            this.f68924b.mo143824h();
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b
        /* renamed from: a */
        public final void mo50755a() {
            if (!this.f68926d) {
                C89427i g = this.f68924b.mo143823g((long) C29128i.f68913b.size());
                if (C29128i.f68912a.isLoggable(Level.FINE)) {
                    C29128i.f68912a.fine(C1764a.m5928a("<< CONNECTION %s", new Object[]{g.hex()}));
                }
                if (!C29128i.f68913b.equals(g)) {
                    throw C29128i.m58180b("Expected a connection header but was %s", g.utf8());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v76, resolved type: boolean */
        /* JADX DEBUG: Multi-variable search result rejected for r0v91, resolved type: boolean */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b
        /* renamed from: a */
        public final boolean mo50756a(AbstractC29101b.AbstractC29102a aVar) {
            boolean z;
            boolean z2;
            short s = 0;
            boolean z3 = false;
            short s2 = 0;
            short s3 = 0;
            try {
                this.f68924b.mo143813d(9);
                int a = C29128i.m58177a(this.f68924b);
                if (a < 0 || a > 16384) {
                    throw C29128i.m58180b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
                }
                byte h = (byte) (this.f68924b.mo143824h() & 255);
                byte h2 = (byte) (this.f68924b.mo143824h() & 255);
                int j = this.f68924b.mo143832j() & Integer.MAX_VALUE;
                if (C29128i.f68912a.isLoggable(Level.FINE)) {
                    C29128i.f68912a.fine(C29130b.m58184a(true, j, a, h, h2));
                }
                switch (h) {
                    case 0:
                        if ((h2 & 1) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((h2 & 32) == 0) {
                            if ((h2 & 8) != 0) {
                                s = (short) (this.f68924b.mo143824h() & 255);
                            }
                            aVar.mo50762a(z, j, this.f68924b, C29128i.m58176a(a, h2, s));
                            this.f68924b.mo143838l((long) s);
                            break;
                        } else {
                            throw C29128i.m58180b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                    case 1:
                        if (j != 0) {
                            if ((h2 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((h2 & 8) != 0) {
                                s3 = (short) (this.f68924b.mo143824h() & 255);
                            }
                            if ((h2 & 32) != 0) {
                                m58186b();
                                a -= 5;
                            }
                            aVar.mo50764a(false, z2, j, m58185a(C29128i.m58176a(a, h2, s3), s3, h2, j), EnumC29124g.HTTP_20_HEADERS);
                            break;
                        } else {
                            throw C29128i.m58180b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                    case 2:
                        if (a != 5) {
                            throw C29128i.m58180b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        } else if (j != 0) {
                            m58186b();
                            break;
                        } else {
                            throw C29128i.m58180b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case 3:
                        if (a != 4) {
                            throw C29128i.m58180b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                        } else if (j != 0) {
                            int j2 = this.f68924b.mo143832j();
                            EnumC29100a fromHttp2 = EnumC29100a.fromHttp2(j2);
                            if (fromHttp2 != null) {
                                aVar.mo50758a(j, fromHttp2);
                                break;
                            } else {
                                throw C29128i.m58180b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(j2));
                            }
                        } else {
                            throw C29128i.m58180b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case 4:
                        if (j != 0) {
                            throw C29128i.m58180b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((h2 & 1) != 0) {
                            if (a != 0) {
                                throw C29128i.m58180b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (a % 6 == 0) {
                            C29141n nVar = new C29141n();
                            for (int i = 0; i < a; i += 6) {
                                short i2 = this.f68924b.mo143830i();
                                int j3 = this.f68924b.mo143832j();
                                switch (i2) {
                                    case 1:
                                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                        break;
                                    case 2:
                                        if (!(j3 == 0 || j3 == 1)) {
                                            throw C29128i.m58180b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                        }
                                    case 3:
                                        i2 = 4;
                                        break;
                                    case 4:
                                        i2 = 7;
                                        if (j3 >= 0) {
                                            break;
                                        } else {
                                            throw C29128i.m58180b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                        if (j3 >= 16384 && j3 <= 16777215) {
                                            break;
                                        } else {
                                            throw C29128i.m58180b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(j3));
                                        }
                                        break;
                                    default:
                                        throw C29128i.m58180b("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(i2));
                                }
                                nVar.mo50830a(i2, 0, j3);
                            }
                            aVar.mo50763a(false, nVar);
                            if (nVar.mo50829a() >= 0) {
                                C29125h.C29126a aVar2 = this.f68923a;
                                int a2 = nVar.mo50829a();
                                aVar2.f68903a = a2;
                                aVar2.f68904b = a2;
                                aVar2.mo50816a();
                                break;
                            }
                        } else {
                            throw C29128i.m58180b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                        }
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        if (j != 0) {
                            if ((h2 & 8) != 0) {
                                s2 = (short) (this.f68924b.mo143824h() & 255);
                            }
                            aVar.mo50759a(this.f68924b.mo143832j() & Integer.MAX_VALUE, m58185a(C29128i.m58176a(a - 4, h2, s2), s2, h2, j));
                            break;
                        } else {
                            throw C29128i.m58180b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (a != 8) {
                            throw C29128i.m58180b("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        } else if (j == 0) {
                            int j4 = this.f68924b.mo143832j();
                            int j5 = this.f68924b.mo143832j();
                            if ((h2 & 1) != 0) {
                                z3 = true;
                            }
                            aVar.mo50761a(z3, j4, j5);
                            break;
                        } else {
                            throw C29128i.m58180b("TYPE_PING streamId != 0", new Object[0]);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        if (a < 8) {
                            throw C29128i.m58180b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        } else if (j == 0) {
                            int j6 = this.f68924b.mo143832j();
                            int j7 = this.f68924b.mo143832j();
                            int i3 = a - 8;
                            if (EnumC29100a.fromHttp2(j7) != null) {
                                C89427i iVar = C89427i.EMPTY;
                                if (i3 > 0) {
                                    iVar = this.f68924b.mo143823g((long) i3);
                                }
                                aVar.mo50760a(j6, iVar);
                                break;
                            } else {
                                throw C29128i.m58180b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(j7));
                            }
                        } else {
                            throw C29128i.m58180b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        if (a == 4) {
                            long j8 = ((long) this.f68924b.mo143832j()) & 2147483647L;
                            if (j8 != 0) {
                                aVar.mo50757a(j, j8);
                                break;
                            } else {
                                throw C29128i.m58180b("windowSizeIncrement was 0", Long.valueOf(j8));
                            }
                        } else {
                            throw C29128i.m58180b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                        }
                    default:
                        this.f68924b.mo143838l((long) a);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        C29131c(AbstractC89426h hVar, boolean z) {
            this.f68924b = hVar;
            this.f68926d = z;
            C29129a aVar = new C29129a(hVar);
            this.f68925c = aVar;
            this.f68923a = new C29125h.C29126a(aVar);
        }

        /* renamed from: a */
        private List<C29123f> m58185a(int i, short s, byte b, int i2) {
            C29129a aVar = this.f68925c;
            aVar.f68917d = i;
            aVar.f68914a = i;
            this.f68925c.f68918e = s;
            this.f68925c.f68915b = b;
            this.f68925c.f68916c = i2;
            this.f68923a.mo50817b();
            return this.f68923a.mo50818c();
        }
    }

    static {
        Covode.recordClassIndex(35477);
    }

    /* renamed from: a */
    public static int m58177a(AbstractC89426h hVar) {
        return (hVar.mo143824h() & 255) | ((hVar.mo143824h() & 255) << 16) | ((hVar.mo143824h() & 255) << 8);
    }

    @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29145p
    /* renamed from: a */
    public final AbstractC29101b mo50820a(AbstractC89426h hVar, boolean z) {
        return new C29131c(hVar, z);
    }

    /* renamed from: a */
    public static IllegalArgumentException m58178a(String str, Object... objArr) {
        throw new IllegalArgumentException(C1764a.m5928a(str, objArr));
    }

    /* renamed from: b */
    public static IOException m58180b(String str, Object... objArr) {
        throw new IOException(C1764a.m5928a(str, objArr));
    }

    /* renamed from: a */
    public static void m58179a(AbstractC89425g gVar, int i) {
        gVar.mo68847a((i >>> 16) & 255);
        gVar.mo68847a((i >>> 8) & 255);
        gVar.mo68847a(i & 255);
    }

    @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29145p
    /* renamed from: a */
    public final AbstractC29103c mo50821a(AbstractC89425g gVar, boolean z) {
        return new C29132d(gVar, z);
    }

    /* renamed from: a */
    public static int m58176a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw m58180b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}

package com.squareup.p2075a.p2076a.p2077a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2077a.AbstractC29101b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89420f;
import p4632k.C89427i;
import p4632k.C89429j;
import p4632k.C89436q;

/* renamed from: com.squareup.a.a.a.o */
public final class C29142o implements AbstractC29145p {

    /* renamed from: a */
    static final byte[] f68953a;

    /* renamed from: com.squareup.a.a.a.o$b */
    static final class C29144b implements AbstractC29103c {

        /* renamed from: a */
        private final AbstractC89425g f68957a;

        /* renamed from: b */
        private final C89420f f68958b;

        /* renamed from: c */
        private final AbstractC89425g f68959c;

        /* renamed from: d */
        private final boolean f68960d;

        /* renamed from: e */
        private boolean f68961e;

        static {
            Covode.recordClassIndex(35493);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final void mo50769a(C29141n nVar) {
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: c */
        public final int mo50775c() {
            return 16383;
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50772a(boolean z, boolean z2, int i, List<C29123f> list) {
            MethodCollector.m26663i(4503);
            if (!this.f68961e) {
                m58222a(list);
                int i2 = (int) (this.f68958b.f203091b + 10);
                int i3 = z ? 1 : 0;
                this.f68957a.mo68857c(-2147287039);
                this.f68957a.mo68857c((((i3 | 0) & 255) << 24) | (i2 & 16777215));
                this.f68957a.mo68857c(i & Integer.MAX_VALUE);
                this.f68957a.mo68857c(0);
                this.f68957a.mo68854b(0);
                this.f68957a.mo68845a(this.f68958b);
                this.f68957a.flush();
                MethodCollector.m26664o(4503);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4503);
                throw iOException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50771a(boolean z, int i, C89420f fVar, int i2) {
            MethodCollector.m26663i(4514);
            int i3 = z ? 1 : 0;
            if (!this.f68961e) {
                long j = (long) i2;
                if (j <= 16777215) {
                    this.f68957a.mo68857c(i & Integer.MAX_VALUE);
                    this.f68957a.mo68857c(((i3 & 255) << 24) | (16777215 & i2));
                    if (i2 > 0) {
                        this.f68957a.mo22060a(fVar, j);
                    }
                    MethodCollector.m26664o(4514);
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: ".concat(String.valueOf(i2)));
                    MethodCollector.m26664o(4514);
                    throw illegalArgumentException;
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4514);
                throw iOException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50765a() {
            MethodCollector.m26663i(4498);
            MethodCollector.m26664o(4498);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: b */
        public final synchronized void mo50773b() {
            MethodCollector.m26663i(4499);
            if (!this.f68961e) {
                this.f68957a.flush();
                MethodCollector.m26664o(4499);
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4499);
                throw iOException;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.m26663i(4864);
            this.f68961e = true;
            AbstractC89425g gVar = this.f68957a;
            AbstractC89425g gVar2 = this.f68959c;
            Error th = null;
            try {
                gVar.close();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                gVar2.close();
                if (th == null) {
                    MethodCollector.m26664o(4864);
                } else if (th instanceof IOException) {
                    IOException iOException = (IOException) th;
                    MethodCollector.m26664o(4864);
                    throw iOException;
                } else if (th instanceof RuntimeException) {
                    RuntimeException runtimeException = (RuntimeException) th;
                    MethodCollector.m26664o(4864);
                    throw runtimeException;
                } else if (th instanceof Error) {
                    Error error = th;
                    MethodCollector.m26664o(4864);
                    throw error;
                } else {
                    AssertionError assertionError = new AssertionError(th);
                    MethodCollector.m26664o(4864);
                    throw assertionError;
                }
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
        }

        /* renamed from: a */
        private void m58222a(List<C29123f> list) {
            this.f68959c.mo68857c(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C89427i iVar = list.get(i).f68897h;
                this.f68959c.mo68857c(iVar.size());
                this.f68959c.mo68850a(iVar);
                C89427i iVar2 = list.get(i).f68898i;
                this.f68959c.mo68857c(iVar2.size());
                this.f68959c.mo68850a(iVar2);
            }
            this.f68959c.flush();
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: b */
        public final synchronized void mo50774b(C29141n nVar) {
            MethodCollector.m26663i(4617);
            if (!this.f68961e) {
                int bitCount = Integer.bitCount(nVar.f68949a);
                this.f68957a.mo68857c(-2147287036);
                int i = 0;
                this.f68957a.mo68857c((((bitCount * 8) + 4) & 16777215) | 0);
                this.f68957a.mo68857c(bitCount);
                while (true) {
                    if (nVar.mo50831a(i)) {
                        this.f68957a.mo68857c(((nVar.mo50833b(i) & 255) << 24) | (i & 16777215));
                        this.f68957a.mo68857c(nVar.f68952d[i]);
                    }
                    i++;
                    if (i > 10) {
                        this.f68957a.flush();
                        MethodCollector.m26664o(4617);
                    }
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4617);
                throw iOException;
            }
        }

        C29144b(AbstractC89425g gVar, boolean z) {
            this.f68957a = gVar;
            this.f68960d = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(C29142o.f68953a);
            C89420f fVar = new C89420f();
            this.f68958b = fVar;
            this.f68959c = C89436q.m155159a(new C89429j((AbstractC89447y) fVar, deflater));
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50766a(int i, long j) {
            MethodCollector.m26663i(4861);
            if (this.f68961e) {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4861);
                throw iOException;
            } else if (j == 0 || j > 2147483647L) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: ".concat(String.valueOf(j)));
                MethodCollector.m26664o(4861);
                throw illegalArgumentException;
            } else {
                this.f68957a.mo68857c(-2147287031);
                this.f68957a.mo68857c(8);
                this.f68957a.mo68857c(i);
                this.f68957a.mo68857c((int) j);
                this.f68957a.flush();
                MethodCollector.m26664o(4861);
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50767a(int i, EnumC29100a aVar) {
            MethodCollector.m26663i(4505);
            if (this.f68961e) {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4505);
                throw iOException;
            } else if (aVar.spdyRstCode != -1) {
                this.f68957a.mo68857c(-2147287037);
                this.f68957a.mo68857c(8);
                this.f68957a.mo68857c(i & Integer.MAX_VALUE);
                this.f68957a.mo68857c(aVar.spdyRstCode);
                this.f68957a.flush();
                MethodCollector.m26664o(4505);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                MethodCollector.m26664o(4505);
                throw illegalArgumentException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50768a(int i, EnumC29100a aVar, byte[] bArr) {
            MethodCollector.m26663i(4636);
            if (this.f68961e) {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4636);
                throw iOException;
            } else if (aVar.spdyGoAwayCode != -1) {
                this.f68957a.mo68857c(-2147287033);
                this.f68957a.mo68857c(8);
                this.f68957a.mo68857c(i);
                this.f68957a.mo68857c(aVar.spdyGoAwayCode);
                this.f68957a.flush();
                MethodCollector.m26664o(4636);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
                MethodCollector.m26664o(4636);
                throw illegalArgumentException;
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29103c
        /* renamed from: a */
        public final synchronized void mo50770a(boolean z, int i, int i2) {
            boolean z2;
            MethodCollector.m26663i(4624);
            if (!this.f68961e) {
                boolean z3 = this.f68960d;
                boolean z4 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 != z2) {
                    z4 = true;
                }
                if (z == z4) {
                    this.f68957a.mo68857c(-2147287034);
                    this.f68957a.mo68857c(4);
                    this.f68957a.mo68857c(i);
                    this.f68957a.flush();
                    MethodCollector.m26664o(4624);
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("payload != reply");
                    MethodCollector.m26664o(4624);
                    throw illegalArgumentException;
                }
            } else {
                IOException iOException = new IOException("closed");
                MethodCollector.m26664o(4624);
                throw iOException;
            }
        }
    }

    /* renamed from: com.squareup.a.a.a.o$a */
    static final class C29143a implements AbstractC29101b {

        /* renamed from: a */
        private final AbstractC89426h f68954a;

        /* renamed from: b */
        private final boolean f68955b;

        /* renamed from: c */
        private final C29135k f68956c;

        static {
            Covode.recordClassIndex(35492);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b
        /* renamed from: a */
        public final void mo50755a() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f68956c.f68941b.close();
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b
        /* renamed from: a */
        public final boolean mo50756a(AbstractC29101b.AbstractC29102a aVar) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7 = false;
            try {
                int j = this.f68954a.mo143832j();
                int j2 = this.f68954a.mo143832j();
                if ((Integer.MIN_VALUE & j) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = (-16777216 & j2) >>> 24;
                int i2 = j2 & 16777215;
                if (z) {
                    int i3 = (2147418112 & j) >>> 16;
                    int i4 = j & 65535;
                    if (i3 == 3) {
                        switch (i4) {
                            case 1:
                                int j3 = this.f68954a.mo143832j();
                                this.f68954a.mo143832j();
                                int i5 = j3 & Integer.MAX_VALUE;
                                this.f68954a.mo143830i();
                                List<C29123f> a = this.f68956c.mo50825a(i2 - 10);
                                if ((i & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((i & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                aVar.mo50764a(z3, z2, i5, a, EnumC29124g.SPDY_SYN_STREAM);
                                return true;
                            case 2:
                                int j4 = this.f68954a.mo143832j() & Integer.MAX_VALUE;
                                List<C29123f> a2 = this.f68956c.mo50825a(i2 - 4);
                                if ((i & 1) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                aVar.mo50764a(false, z4, j4, a2, EnumC29124g.SPDY_REPLY);
                                return true;
                            case 3:
                                if (i2 == 8) {
                                    int j5 = this.f68954a.mo143832j() & Integer.MAX_VALUE;
                                    int j6 = this.f68954a.mo143832j();
                                    EnumC29100a fromSpdy3Rst = EnumC29100a.fromSpdy3Rst(j6);
                                    if (fromSpdy3Rst != null) {
                                        aVar.mo50758a(j5, fromSpdy3Rst);
                                        return true;
                                    }
                                    throw m58218a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(j6));
                                }
                                throw m58218a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
                            case 4:
                                m58219a(aVar, i, i2);
                                return true;
                            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            default:
                                this.f68954a.mo143838l((long) i2);
                                return true;
                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                if (i2 == 4) {
                                    int j7 = this.f68954a.mo143832j();
                                    boolean z8 = this.f68955b;
                                    if ((j7 & 1) == 1) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z8 == z5) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    aVar.mo50761a(z6, j7, 0);
                                    return true;
                                }
                                throw m58218a("TYPE_PING length: %d != 4", Integer.valueOf(i2));
                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                if (i2 == 8) {
                                    int j8 = this.f68954a.mo143832j() & Integer.MAX_VALUE;
                                    int j9 = this.f68954a.mo143832j();
                                    if (EnumC29100a.fromSpdyGoAway(j9) != null) {
                                        aVar.mo50760a(j8, C89427i.EMPTY);
                                        return true;
                                    }
                                    throw m58218a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(j9));
                                }
                                throw m58218a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                aVar.mo50764a(false, false, this.f68954a.mo143832j() & Integer.MAX_VALUE, this.f68956c.mo50825a(i2 - 4), EnumC29124g.SPDY_HEADERS);
                                return true;
                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                if (i2 == 8) {
                                    int j10 = this.f68954a.mo143832j() & Integer.MAX_VALUE;
                                    long j11 = (long) (this.f68954a.mo143832j() & Integer.MAX_VALUE);
                                    if (j11 != 0) {
                                        aVar.mo50757a(j10, j11);
                                        return true;
                                    }
                                    throw m58218a("windowSizeIncrement was 0", Long.valueOf(j11));
                                }
                                throw m58218a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
                        }
                    } else {
                        throw new ProtocolException("version != 3: ".concat(String.valueOf(i3)));
                    }
                } else {
                    int i6 = j & Integer.MAX_VALUE;
                    if ((i & 1) != 0) {
                        z7 = true;
                    }
                    aVar.mo50762a(z7, i6, this.f68954a, i2);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        C29143a(AbstractC89426h hVar, boolean z) {
            this.f68954a = hVar;
            this.f68956c = new C29135k(hVar);
            this.f68955b = z;
        }

        /* renamed from: a */
        private static IOException m58218a(String str, Object... objArr) {
            throw new IOException(C1764a.m5928a(str, objArr));
        }

        /* renamed from: a */
        private void m58219a(AbstractC29101b.AbstractC29102a aVar, int i, int i2) {
            int j = this.f68954a.mo143832j();
            boolean z = false;
            if (i2 == (j * 8) + 4) {
                C29141n nVar = new C29141n();
                for (int i3 = 0; i3 < j; i3++) {
                    int j2 = this.f68954a.mo143832j();
                    int i4 = j2 & 16777215;
                    nVar.mo50830a(i4, (-16777216 & j2) >>> 24, this.f68954a.mo143832j());
                }
                if ((i & 1) != 0) {
                    z = true;
                }
                aVar.mo50763a(z, nVar);
                return;
            }
            throw m58218a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(j));
        }
    }

    static {
        Covode.recordClassIndex(35491);
        try {
            f68953a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(C29206j.f69178c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29145p
    /* renamed from: a */
    public final AbstractC29101b mo50820a(AbstractC89426h hVar, boolean z) {
        return new C29143a(hVar, z);
    }

    @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29145p
    /* renamed from: a */
    public final AbstractC29103c mo50821a(AbstractC89425g gVar, boolean z) {
        return new C29144b(gVar, z);
    }
}

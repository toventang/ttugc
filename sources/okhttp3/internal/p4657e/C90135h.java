package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.p4657e.C90112d;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89426h;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: okhttp3.internal.e.h */
final class C90135h implements Closeable {

    /* renamed from: a */
    static final Logger f204638a = Logger.getLogger(C90115e.class.getName());

    /* renamed from: b */
    final AbstractC89426h f204639b;

    /* renamed from: c */
    final boolean f204640c;

    /* renamed from: d */
    final C90112d.C90113a f204641d;

    /* renamed from: e */
    private final C90136a f204642e;

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.h$b */
    public interface AbstractC90137b {
        static {
            Covode.recordClassIndex(106309);
        }

        /* renamed from: a */
        void mo144893a(int i, long j);

        /* renamed from: a */
        void mo144894a(int i, List<C90110c> list);

        /* renamed from: a */
        void mo144895a(int i, C89427i iVar);

        /* renamed from: a */
        void mo144896a(int i, EnumC90109b bVar);

        /* renamed from: a */
        void mo144897a(C90147m mVar);

        /* renamed from: a */
        void mo144898a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo144899a(boolean z, int i, List<C90110c> list);

        /* renamed from: a */
        void mo144900a(boolean z, int i, AbstractC89426h hVar, int i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.h$a */
    public static final class C90136a implements AbstractC89408aa {

        /* renamed from: a */
        int f204643a;

        /* renamed from: b */
        byte f204644b;

        /* renamed from: c */
        int f204645c;

        /* renamed from: d */
        int f204646d;

        /* renamed from: e */
        short f204647e;

        /* renamed from: f */
        private final AbstractC89426h f204648f;

        static {
            Covode.recordClassIndex(106308);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // p4632k.AbstractC89408aa
        public final C89409ab timeout() {
            return this.f204648f.timeout();
        }

        C90136a(AbstractC89426h hVar) {
            this.f204648f = hVar;
        }

        @Override // p4632k.AbstractC89408aa
        public final long read(C89420f fVar, long j) {
            int i;
            int j2;
            do {
                int i2 = this.f204646d;
                if (i2 == 0) {
                    this.f204648f.mo143838l((long) this.f204647e);
                    this.f204647e = 0;
                    if ((this.f204644b & 4) != 0) {
                        return -1;
                    }
                    i = this.f204645c;
                    int a = C90135h.m156557a(this.f204648f);
                    this.f204646d = a;
                    this.f204643a = a;
                    byte h = (byte) (this.f204648f.mo143824h() & 255);
                    this.f204644b = (byte) (this.f204648f.mo143824h() & 255);
                    if (C90135h.f204638a.isLoggable(Level.FINE)) {
                        C90135h.f204638a.fine(C90115e.m156503a(true, this.f204645c, this.f204643a, h, this.f204644b));
                    }
                    j2 = this.f204648f.mo143832j() & Integer.MAX_VALUE;
                    this.f204645c = j2;
                    if (h != 9) {
                        throw C90115e.m156504b("%s != TYPE_CONTINUATION", Byte.valueOf(h));
                    }
                } else {
                    long read = this.f204648f.read(fVar, Math.min(j, (long) i2));
                    if (read == -1) {
                        return -1;
                    }
                    this.f204646d = (int) (((long) this.f204646d) - read);
                    return read;
                }
            } while (j2 == i);
            throw C90115e.m156504b("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f204639b.close();
    }

    /* renamed from: a */
    private void m156559a() {
        this.f204639b.mo143832j();
        this.f204639b.mo143824h();
    }

    static {
        Covode.recordClassIndex(106307);
    }

    /* renamed from: a */
    static int m156557a(AbstractC89426h hVar) {
        return (hVar.mo143824h() & 255) | ((hVar.mo143824h() & 255) << 16) | ((hVar.mo143824h() & 255) << 8);
    }

    C90135h(AbstractC89426h hVar, boolean z) {
        this.f204639b = hVar;
        this.f204640c = z;
        C90136a aVar = new C90136a(hVar);
        this.f204642e = aVar;
        this.f204641d = new C90112d.C90113a(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v74, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v26, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean mo144901a(boolean z, AbstractC90137b bVar) {
        boolean z2;
        boolean z3;
        short s = 0;
        boolean z4 = false;
        short s2 = 0;
        short s3 = 0;
        try {
            this.f204639b.mo143813d(9);
            int a = m156557a(this.f204639b);
            if (a < 0 || a > 16384) {
                throw C90115e.m156504b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
            }
            byte h = (byte) (this.f204639b.mo143824h() & 255);
            if (!z || h == 4) {
                byte h2 = (byte) (this.f204639b.mo143824h() & 255);
                int j = this.f204639b.mo143832j() & Integer.MAX_VALUE;
                Logger logger = f204638a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C90115e.m156503a(true, j, a, h, h2));
                }
                switch (h) {
                    case 0:
                        if (j != 0) {
                            if ((h2 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((h2 & 32) == 0) {
                                if ((h2 & 8) != 0) {
                                    s = (short) (this.f204639b.mo143824h() & 255);
                                }
                                bVar.mo144900a(z2, j, this.f204639b, m156556a(a, h2, s));
                                this.f204639b.mo143838l((long) s);
                                break;
                            } else {
                                throw C90115e.m156504b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            }
                        } else {
                            throw C90115e.m156504b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        }
                    case 1:
                        if (j != 0) {
                            if ((h2 & 1) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if ((h2 & 8) != 0) {
                                s3 = (short) (this.f204639b.mo143824h() & 255);
                            }
                            if ((h2 & 32) != 0) {
                                m156559a();
                                a -= 5;
                            }
                            bVar.mo144899a(z3, j, m156558a(m156556a(a, h2, s3), s3, h2, j));
                            break;
                        } else {
                            throw C90115e.m156504b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                    case 2:
                        if (a != 5) {
                            throw C90115e.m156504b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a));
                        } else if (j != 0) {
                            m156559a();
                            break;
                        } else {
                            throw C90115e.m156504b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case 3:
                        if (a != 4) {
                            throw C90115e.m156504b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a));
                        } else if (j != 0) {
                            int j2 = this.f204639b.mo143832j();
                            EnumC90109b fromHttp2 = EnumC90109b.fromHttp2(j2);
                            if (fromHttp2 != null) {
                                bVar.mo144896a(j, fromHttp2);
                                break;
                            } else {
                                throw C90115e.m156504b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(j2));
                            }
                        } else {
                            throw C90115e.m156504b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case 4:
                        if (j != 0) {
                            throw C90115e.m156504b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((h2 & 1) != 0) {
                            if (a != 0) {
                                throw C90115e.m156504b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (a % 6 == 0) {
                            C90147m mVar = new C90147m();
                            for (int i = 0; i < a; i += 6) {
                                int i2 = this.f204639b.mo143830i() & 65535;
                                int j3 = this.f204639b.mo143832j();
                                if (i2 != 2) {
                                    if (i2 == 3) {
                                        i2 = 4;
                                    } else if (i2 == 4) {
                                        i2 = 7;
                                        if (j3 < 0) {
                                            throw C90115e.m156504b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                    } else if (i2 == 5 && (j3 < 16384 || j3 > 16777215)) {
                                        throw C90115e.m156504b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(j3));
                                    }
                                } else if (!(j3 == 0 || j3 == 1)) {
                                    throw C90115e.m156504b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                                mVar.mo144931a(i2, j3);
                            }
                            bVar.mo144897a(mVar);
                            break;
                        } else {
                            throw C90115e.m156504b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a));
                        }
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        if (j != 0) {
                            if ((h2 & 8) != 0) {
                                s2 = (short) (this.f204639b.mo143824h() & 255);
                            }
                            bVar.mo144894a(this.f204639b.mo143832j() & Integer.MAX_VALUE, m156558a(m156556a(a - 4, h2, s2), s2, h2, j));
                            break;
                        } else {
                            throw C90115e.m156504b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        if (a != 8) {
                            throw C90115e.m156504b("TYPE_PING length != 8: %s", Integer.valueOf(a));
                        } else if (j == 0) {
                            int j4 = this.f204639b.mo143832j();
                            int j5 = this.f204639b.mo143832j();
                            if ((h2 & 1) != 0) {
                                z4 = true;
                            }
                            bVar.mo144898a(z4, j4, j5);
                            break;
                        } else {
                            throw C90115e.m156504b("TYPE_PING streamId != 0", new Object[0]);
                        }
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        if (a < 8) {
                            throw C90115e.m156504b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a));
                        } else if (j == 0) {
                            int j6 = this.f204639b.mo143832j();
                            int j7 = this.f204639b.mo143832j();
                            int i3 = a - 8;
                            if (EnumC90109b.fromHttp2(j7) != null) {
                                C89427i iVar = C89427i.EMPTY;
                                if (i3 > 0) {
                                    iVar = this.f204639b.mo143823g((long) i3);
                                }
                                bVar.mo144895a(j6, iVar);
                                break;
                            } else {
                                throw C90115e.m156504b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(j7));
                            }
                        } else {
                            throw C90115e.m156504b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        if (a == 4) {
                            long j8 = ((long) this.f204639b.mo143832j()) & 2147483647L;
                            if (j8 != 0) {
                                bVar.mo144893a(j, j8);
                                break;
                            } else {
                                throw C90115e.m156504b("windowSizeIncrement was 0", Long.valueOf(j8));
                            }
                        } else {
                            throw C90115e.m156504b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a));
                        }
                    default:
                        this.f204639b.mo143838l((long) a);
                        break;
                }
                return true;
            }
            throw C90115e.m156504b("Expected a SETTINGS frame but was %s", Byte.valueOf(h));
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static int m156556a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C90115e.m156504b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: a */
    private List<C90110c> m156558a(int i, short s, byte b, int i2) {
        C90136a aVar = this.f204642e;
        aVar.f204646d = i;
        aVar.f204643a = i;
        this.f204642e.f204647e = s;
        this.f204642e.f204644b = b;
        this.f204642e.f204645c = i2;
        this.f204641d.mo144871a();
        return this.f204641d.mo144872b();
    }
}

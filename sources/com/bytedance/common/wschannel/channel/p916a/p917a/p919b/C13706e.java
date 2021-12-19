package com.bytedance.common.wschannel.channel.p916a.p917a.p919b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.e */
final class C13706e {

    /* renamed from: a */
    final long f33302a;

    /* renamed from: b */
    final boolean f33303b;

    /* renamed from: c */
    final AbstractC89426h f33304c;

    /* renamed from: d */
    final AbstractC13707a f33305d;

    /* renamed from: e */
    boolean f33306e;

    /* renamed from: f */
    int f33307f;

    /* renamed from: g */
    long f33308g;

    /* renamed from: h */
    boolean f33309h;

    /* renamed from: i */
    boolean f33310i;

    /* renamed from: j */
    final C89420f f33311j = new C89420f();

    /* renamed from: k */
    private final C89420f f33312k = new C89420f();

    /* renamed from: l */
    private final byte[] f33313l;

    /* renamed from: m */
    private final C89420f.C89422b f33314m;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.e$a */
    public interface AbstractC13707a {
        static {
            Covode.recordClassIndex(15741);
        }

        /* renamed from: a */
        void mo22033a(int i, String str);

        /* renamed from: a */
        void mo22035a(String str);

        /* renamed from: a */
        void mo22037a(C89427i iVar);

        /* renamed from: b */
        void mo22039b(C89427i iVar);

        /* renamed from: d */
        void mo22046d();
    }

    static {
        Covode.recordClassIndex(15740);
    }

    /* renamed from: d */
    private void m24690d() {
        while (!this.f33306e) {
            mo22054a();
            long j = this.f33308g;
            if (j > this.f33302a) {
                mo22055a(j);
                return;
            } else if (this.f33310i) {
                mo22056b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22057c() {
        while (!this.f33306e) {
            long j = this.f33308g;
            if (j > 0) {
                this.f33304c.mo143807b(this.f33311j, j);
                if (!this.f33303b) {
                    this.f33311j.mo143800a(this.f33314m);
                    this.f33314m.mo143859a(this.f33311j.f203091b - this.f33308g);
                    C13705d.m24688a(this.f33314m, this.f33313l);
                    this.f33314m.close();
                }
            }
            if (!this.f33309h) {
                m24690d();
                if (this.f33307f != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f33307f));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22056b() {
        String str;
        long j = this.f33308g;
        if (j > 0) {
            this.f33304c.mo143807b(this.f33312k, j);
            if (!this.f33303b) {
                this.f33312k.mo143800a(this.f33314m);
                this.f33314m.mo143859a(0);
                C13705d.m24688a(this.f33314m, this.f33313l);
                this.f33314m.close();
            }
        }
        int i = this.f33307f;
        if (i == 9) {
            this.f33305d.mo22039b(this.f33312k.mo143847q());
        } else if (i == 10) {
            AbstractC13707a aVar = this.f33305d;
            this.f33312k.mo143847q();
            aVar.mo22046d();
        } else if (i == 8) {
            short s = 1005;
            long j2 = this.f33312k.f203091b;
            if (j2 != 1) {
                if (j2 != 0) {
                    s = this.f33312k.mo143830i();
                    str = this.f33312k.mo143848r();
                    String a = C13705d.m24687a(s);
                    if (a != null) {
                        throw new ProtocolException(a);
                    }
                } else {
                    str = "";
                }
                this.f33305d.mo22033a(s, str);
                this.f33306e = true;
                return;
            }
            throw new ProtocolException("Malformed close payload length of 1.");
        } else {
            throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f33307f));
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22054a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.f33306e) {
            long P_ = this.f33304c.timeout().mo143779P_();
            this.f33304c.timeout().mo143782S_();
            try {
                int h = this.f33304c.mo143824h() & 255;
                this.f33304c.timeout().mo143784a(P_, TimeUnit.NANOSECONDS);
                this.f33307f = h & 15;
                boolean z6 = true;
                if ((h & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f33309h = z;
                if ((h & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f33310i = z2;
                if (!z2 || z) {
                    if ((h & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((h & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((h & 16) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int h2 = this.f33304c.mo143824h() & 255;
                    if ((h2 & 128) == 0) {
                        z6 = false;
                    }
                    if (z6 == this.f33303b) {
                        if (this.f33303b) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j = (long) (h2 & 127);
                    this.f33308g = j;
                    if (j == 126) {
                        this.f33308g = ((long) this.f33304c.mo143830i()) & 65535;
                    } else if (j == 127) {
                        long k = this.f33304c.mo143835k();
                        this.f33308g = k;
                        if (k < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f33308g) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.f33310i && this.f33308g > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.f33304c.mo143808b(this.f33313l);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f33304c.timeout().mo143784a(P_, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22055a(long j) {
        try {
            this.f33304c.mo143838l(j);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    C13706e(boolean z, AbstractC89426h hVar, AbstractC13707a aVar, long j) {
        byte[] bArr;
        Objects.requireNonNull(hVar, "source == null");
        this.f33303b = z;
        this.f33304c = hVar;
        this.f33305d = aVar;
        this.f33302a = j;
        C89420f.C89422b bVar = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f33313l = bArr;
        this.f33314m = !z ? new C89420f.C89422b() : bVar;
    }
}

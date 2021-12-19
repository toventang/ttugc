package okhttp3.internal.p4662j;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;

/* access modifiers changed from: package-private */
/* renamed from: okhttp3.internal.j.c */
public final class C90176c {

    /* renamed from: a */
    final boolean f204762a;

    /* renamed from: b */
    final AbstractC89426h f204763b;

    /* renamed from: c */
    final AbstractC90177a f204764c;

    /* renamed from: d */
    boolean f204765d;

    /* renamed from: e */
    int f204766e;

    /* renamed from: f */
    long f204767f;

    /* renamed from: g */
    boolean f204768g;

    /* renamed from: h */
    boolean f204769h;

    /* renamed from: i */
    final C89420f f204770i = new C89420f();

    /* renamed from: j */
    private final C89420f f204771j = new C89420f();

    /* renamed from: k */
    private final byte[] f204772k;

    /* renamed from: l */
    private final C89420f.C89422b f204773l;

    /* renamed from: okhttp3.internal.j.c$a */
    public interface AbstractC90177a {
        static {
            Covode.recordClassIndex(106349);
        }

        /* renamed from: a */
        void mo144976a(int i, String str);

        /* renamed from: a */
        void mo144978a(String str);

        /* renamed from: a */
        void mo144980a(C89427i iVar);

        /* renamed from: b */
        void mo144983b(C89427i iVar);

        /* renamed from: c */
        void mo144984c();
    }

    static {
        Covode.recordClassIndex(106348);
    }

    /* renamed from: d */
    private void m156722d() {
        while (!this.f204765d) {
            mo144989a();
            if (this.f204769h) {
                mo144990b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo144991c() {
        while (!this.f204765d) {
            long j = this.f204767f;
            if (j > 0) {
                this.f204763b.mo143807b(this.f204770i, j);
                if (!this.f204762a) {
                    this.f204770i.mo143800a(this.f204773l);
                    this.f204773l.mo143859a(this.f204770i.f203091b - this.f204767f);
                    C90175b.m156720a(this.f204773l, this.f204772k);
                    this.f204773l.close();
                }
            }
            if (!this.f204768g) {
                m156722d();
                if (this.f204766e != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f204766e));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo144990b() {
        String str;
        long j = this.f204767f;
        if (j > 0) {
            this.f204763b.mo143807b(this.f204771j, j);
            if (!this.f204762a) {
                this.f204771j.mo143800a(this.f204773l);
                this.f204773l.mo143859a(0);
                C90175b.m156720a(this.f204773l, this.f204772k);
                this.f204773l.close();
            }
        }
        switch (this.f204766e) {
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                short s = 1005;
                long j2 = this.f204771j.f203091b;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = this.f204771j.mo143830i();
                        str = this.f204771j.mo143848r();
                        String a = C90175b.m156719a(s);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    } else {
                        str = "";
                    }
                    this.f204764c.mo144976a(s, str);
                    this.f204765d = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                this.f204764c.mo144983b(this.f204771j.mo143847q());
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                AbstractC90177a aVar = this.f204764c;
                this.f204771j.mo143847q();
                aVar.mo144984c();
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f204766e));
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144989a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.f204765d) {
            long P_ = this.f204763b.timeout().mo143779P_();
            this.f204763b.timeout().mo143782S_();
            try {
                int h = this.f204763b.mo143824h() & 255;
                this.f204763b.timeout().mo143784a(P_, TimeUnit.NANOSECONDS);
                this.f204766e = h & 15;
                boolean z6 = true;
                if ((h & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f204768g = z;
                if ((h & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f204769h = z2;
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
                    int h2 = this.f204763b.mo143824h() & 255;
                    if ((h2 & 128) == 0) {
                        z6 = false;
                    }
                    if (z6 == this.f204762a) {
                        if (this.f204762a) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j = (long) (h2 & 127);
                    this.f204767f = j;
                    if (j == 126) {
                        this.f204767f = ((long) this.f204763b.mo143830i()) & 65535;
                    } else if (j == 127) {
                        long k = this.f204763b.mo143835k();
                        this.f204767f = k;
                        if (k < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f204767f) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.f204769h && this.f204767f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.f204763b.mo143808b(this.f204772k);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f204763b.timeout().mo143784a(P_, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    C90176c(boolean z, AbstractC89426h hVar, AbstractC90177a aVar) {
        byte[] bArr;
        Objects.requireNonNull(hVar, "source == null");
        this.f204762a = z;
        this.f204763b = hVar;
        this.f204764c = aVar;
        C89420f.C89422b bVar = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f204772k = bArr;
        this.f204773l = !z ? new C89420f.C89422b() : bVar;
    }
}

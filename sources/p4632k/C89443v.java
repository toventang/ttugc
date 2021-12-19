package p4632k;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.v */
public final class C89443v {

    /* renamed from: h */
    public static final C89444a f203130h = new C89444a((byte) 0);

    /* renamed from: a */
    public final byte[] f203131a;

    /* renamed from: b */
    public int f203132b;

    /* renamed from: c */
    public int f203133c;

    /* renamed from: d */
    public boolean f203134d;

    /* renamed from: e */
    public boolean f203135e;

    /* renamed from: f */
    public C89443v f203136f;

    /* renamed from: g */
    public C89443v f203137g;

    static {
        Covode.recordClassIndex(105527);
    }

    /* renamed from: k.v$a */
    public static final class C89444a {
        static {
            Covode.recordClassIndex(105528);
        }

        private C89444a() {
        }

        public /* synthetic */ C89444a(byte b) {
            this();
        }
    }

    public C89443v() {
        this.f203131a = new byte[8192];
        this.f203135e = true;
    }

    /* renamed from: a */
    public final C89443v mo143947a() {
        this.f203134d = true;
        return new C89443v(this.f203131a, this.f203132b, this.f203133c, true, false);
    }

    /* renamed from: b */
    public final C89443v mo143951b() {
        byte[] bArr = this.f203131a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C89219l.m154709a((Object) copyOf, "");
        return new C89443v(copyOf, this.f203132b, this.f203133c, false, true);
    }

    /* renamed from: c */
    public final C89443v mo143952c() {
        C89443v vVar = this.f203136f;
        if (vVar == this) {
            vVar = null;
        }
        C89443v vVar2 = this.f203137g;
        if (vVar2 == null) {
            C89219l.m154707a();
        }
        vVar2.f203136f = this.f203136f;
        C89443v vVar3 = this.f203136f;
        if (vVar3 == null) {
            C89219l.m154707a();
        }
        vVar3.f203137g = this.f203137g;
        this.f203136f = null;
        this.f203137g = null;
        return vVar;
    }

    /* renamed from: d */
    public final void mo143953d() {
        C89443v vVar = this.f203137g;
        int i = 0;
        if (vVar != this) {
            if (vVar == null) {
                C89219l.m154707a();
            }
            if (vVar.f203135e) {
                int i2 = this.f203133c - this.f203132b;
                C89443v vVar2 = this.f203137g;
                if (vVar2 == null) {
                    C89219l.m154707a();
                }
                int i3 = 8192 - vVar2.f203133c;
                C89443v vVar3 = this.f203137g;
                if (vVar3 == null) {
                    C89219l.m154707a();
                }
                if (!vVar3.f203134d) {
                    C89443v vVar4 = this.f203137g;
                    if (vVar4 == null) {
                        C89219l.m154707a();
                    }
                    i = vVar4.f203132b;
                }
                if (i2 <= i3 + i) {
                    C89443v vVar5 = this.f203137g;
                    if (vVar5 == null) {
                        C89219l.m154707a();
                    }
                    mo143950a(vVar5, i2);
                    mo143952c();
                    C89445w.m155223a(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: a */
    public final C89443v mo143949a(C89443v vVar) {
        C89219l.m154719c(vVar, "");
        vVar.f203137g = this;
        vVar.f203136f = this.f203136f;
        C89443v vVar2 = this.f203136f;
        if (vVar2 == null) {
            C89219l.m154707a();
        }
        vVar2.f203137g = vVar;
        this.f203136f = vVar;
        return vVar;
    }

    /* renamed from: a */
    public final C89443v mo143948a(int i) {
        C89443v a;
        if (i <= 0 || i > this.f203133c - this.f203132b) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i >= 1024) {
            a = mo143947a();
        } else {
            a = C89445w.m155222a();
            C89412b.m154996a(this.f203131a, this.f203132b, a.f203131a, 0, i);
        }
        a.f203133c = a.f203132b + i;
        this.f203132b += i;
        C89443v vVar = this.f203137g;
        if (vVar == null) {
            C89219l.m154707a();
        }
        vVar.mo143949a(a);
        return a;
    }

    /* renamed from: a */
    public final void mo143950a(C89443v vVar, int i) {
        C89219l.m154719c(vVar, "");
        if (vVar.f203135e) {
            int i2 = vVar.f203133c;
            if (i2 + i > 8192) {
                if (!vVar.f203134d) {
                    int i3 = vVar.f203132b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = vVar.f203131a;
                        C89412b.m154996a(bArr, i3, bArr, 0, i2 - i3);
                        vVar.f203133c -= vVar.f203132b;
                        vVar.f203132b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            C89412b.m154996a(this.f203131a, this.f203132b, vVar.f203131a, vVar.f203133c, i);
            vVar.f203133c += i;
            this.f203132b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C89443v(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C89219l.m154719c(bArr, "");
        this.f203131a = bArr;
        this.f203132b = i;
        this.f203133c = i2;
        this.f203134d = z;
        this.f203135e = z2;
    }
}

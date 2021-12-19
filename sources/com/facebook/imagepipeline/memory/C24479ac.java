package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1835g.AbstractC24104a;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1835g.C24116l;

/* renamed from: com.facebook.imagepipeline.memory.ac */
public final class C24479ac {

    /* renamed from: a */
    private final C24477ab f58159a;

    /* renamed from: b */
    private AbstractC24485d f58160b;

    /* renamed from: c */
    private C24492j f58161c;

    /* renamed from: d */
    private C24496n f58162d;

    /* renamed from: e */
    private C24509x f58163e;

    /* renamed from: f */
    private AbstractC24113i f58164f;

    /* renamed from: g */
    private C24116l f58165g;

    /* renamed from: h */
    private AbstractC24104a f58166h;

    static {
        Covode.recordClassIndex(28623);
    }

    /* renamed from: c */
    public final int mo40356c() {
        return this.f58159a.f58139c.f58173g;
    }

    /* renamed from: f */
    private C24492j m46751f() {
        if (this.f58161c == null) {
            this.f58161c = new C24492j(this.f58159a.f58140d, this.f58159a.f58141e, this.f58159a.f58142f);
        }
        return this.f58161c;
    }

    /* renamed from: g */
    private C24509x m46752g() {
        if (this.f58163e == null) {
            this.f58163e = new C24509x(this.f58159a.f58140d, this.f58159a.f58141e, this.f58159a.f58142f);
        }
        return this.f58163e;
    }

    /* renamed from: d */
    public final C24116l mo40357d() {
        if (this.f58165g == null) {
            this.f58165g = new C24116l(mo40358e());
        }
        return this.f58165g;
    }

    /* renamed from: e */
    public final AbstractC24104a mo40358e() {
        if (this.f58166h == null) {
            this.f58166h = new C24499o(this.f58159a.f58140d, this.f58159a.f58143g, this.f58159a.f58144h);
        }
        return this.f58166h;
    }

    /* renamed from: b */
    public final C24496n mo40355b() {
        if (this.f58162d == null) {
            this.f58162d = new C24496n(this.f58159a.f58140d, this.f58159a.f58139c);
        }
        return this.f58162d;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final AbstractC24485d mo40354a() {
        if (this.f58160b == null) {
            String str = this.f58159a.f58145i;
            switch (str.hashCode()) {
                case -1868884870:
                    if (str.equals("legacy_default_params")) {
                        this.f58160b = new C24490h(this.f58159a.f58140d, C24493k.m46791a(), this.f58159a.f58138b);
                        break;
                    }
                    this.f58160b = new C24490h(this.f58159a.f58140d, this.f58159a.f58137a, this.f58159a.f58138b);
                    break;
                case -1106578487:
                    if (str.equals("legacy")) {
                    }
                    this.f58160b = new C24490h(this.f58159a.f58140d, this.f58159a.f58137a, this.f58159a.f58138b);
                    break;
                case -404562712:
                    if (str.equals("experimental")) {
                        this.f58160b = new C24500p(this.f58159a.f58146j, this.f58159a.f58147k, C24510y.m46846a());
                        break;
                    }
                    this.f58160b = new C24490h(this.f58159a.f58140d, this.f58159a.f58137a, this.f58159a.f58138b);
                    break;
                case 95945896:
                    if (str.equals("dummy")) {
                        this.f58160b = new C24495m();
                        break;
                    }
                    this.f58160b = new C24490h(this.f58159a.f58140d, this.f58159a.f58137a, this.f58159a.f58138b);
                    break;
                default:
                    this.f58160b = new C24490h(this.f58159a.f58140d, this.f58159a.f58137a, this.f58159a.f58138b);
                    break;
            }
        }
        return this.f58160b;
    }

    public C24479ac(C24477ab abVar) {
        this.f58159a = (C24477ab) C24091i.m45617a(abVar);
    }

    /* renamed from: b */
    private AbstractC24503s m46750b(int i) {
        if (i == 0) {
            return m46752g();
        }
        if (i == 1) {
            return m46751f();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* renamed from: a */
    public final AbstractC24113i mo40353a(int i) {
        if (this.f58164f == null) {
            this.f58164f = new C24506v(m46750b(i), mo40357d());
        }
        return this.f58164f;
    }
}

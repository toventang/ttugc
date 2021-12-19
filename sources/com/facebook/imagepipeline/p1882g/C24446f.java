package com.facebook.imagepipeline.p1882g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24083b;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1832d.C24098m;
import com.facebook.common.p1835g.AbstractC24104a;
import com.facebook.common.p1835g.C24110g;
import com.facebook.common.p1839k.C24131e;
import com.facebook.imagepipeline.p1885j.C24456e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.g.f */
public final class C24446f {

    /* renamed from: a */
    public int f58078a = 0;

    /* renamed from: b */
    public int f58079b = 0;

    /* renamed from: c */
    public boolean f58080c;

    /* renamed from: d */
    private int f58081d = 0;

    /* renamed from: e */
    private int f58082e = 0;

    /* renamed from: f */
    private int f58083f = 0;

    /* renamed from: g */
    private int f58084g = 0;

    /* renamed from: h */
    private final AbstractC24104a f58085h;

    static {
        Covode.recordClassIndex(28589);
    }

    /* renamed from: a */
    private void m46652a(int i) {
        int i2 = this.f58084g;
        if (i2 > 0) {
            this.f58079b = i;
        }
        this.f58084g = i2 + 1;
        this.f58078a = i2;
    }

    public C24446f(AbstractC24104a aVar) {
        this.f58085h = (AbstractC24104a) C24091i.m45617a(aVar);
    }

    /* renamed from: a */
    public final boolean mo40287a(C24456e eVar) {
        if (this.f58081d == 6 || eVar.mo40309h() <= this.f58083f) {
            return false;
        }
        C24110g gVar = new C24110g(eVar.mo40301b(), (byte[]) this.f58085h.mo39664a(16384), this.f58085h);
        try {
            C24131e.m45733a(gVar, (long) this.f58083f);
            return m46653a(gVar);
        } catch (IOException e) {
            C24098m.m45632b(e);
            return false;
        } finally {
            C24083b.m45600a((InputStream) gVar);
        }
    }

    /* renamed from: a */
    private boolean m46653a(InputStream inputStream) {
        int read;
        MethodCollector.m26663i(6742);
        int i = this.f58078a;
        while (this.f58081d != 6 && (read = inputStream.read()) != -1) {
            try {
                int i2 = this.f58083f + 1;
                this.f58083f = i2;
                if (this.f58080c) {
                    this.f58081d = 6;
                    this.f58080c = false;
                    MethodCollector.m26664o(6742);
                    return false;
                }
                int i3 = this.f58081d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    this.f58081d = 5;
                                } else if (i3 != 5) {
                                    C24091i.m45622b(false);
                                } else {
                                    int i4 = ((this.f58082e << 8) + read) - 2;
                                    C24131e.m45733a(inputStream, (long) i4);
                                    this.f58083f += i4;
                                    this.f58081d = 2;
                                }
                            } else if (read == 255) {
                                this.f58081d = 3;
                            } else if (read == 0) {
                                this.f58081d = 2;
                            } else if (read == 217) {
                                this.f58080c = true;
                                m46652a(i2 - 2);
                                this.f58081d = 2;
                            } else {
                                if (read == 218) {
                                    m46652a(i2 - 2);
                                } else if (read == 1 || ((read >= 208 && read <= 215) || read == 217 || read == 216)) {
                                    this.f58081d = 2;
                                }
                                this.f58081d = 4;
                            }
                        } else if (read == 255) {
                            this.f58081d = 3;
                        }
                    } else if (read == 216) {
                        this.f58081d = 2;
                    } else {
                        this.f58081d = 6;
                    }
                } else if (read == 255) {
                    this.f58081d = 1;
                } else {
                    this.f58081d = 6;
                }
                this.f58082e = read;
            } catch (IOException e) {
                C24098m.m45632b(e);
            }
        }
        if (this.f58081d == 6 || this.f58078a == i) {
            MethodCollector.m26664o(6742);
            return false;
        }
        MethodCollector.m26664o(6742);
        return true;
    }
}

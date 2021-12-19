package com.lynx.component.svg.p2042a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.lynx.component.svg.C28321d;
import com.lynx.component.svg.p2042a.C28253d;
import com.lynx.component.svg.p2042a.C28257f;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.lynx.component.svg.a.g */
public final class C28305g {

    /* renamed from: a */
    public float f66389a;

    /* renamed from: b */
    public float f66390b;

    /* renamed from: c */
    C28309b f66391c;

    /* renamed from: d */
    private Canvas f66392d;

    /* renamed from: e */
    private C28321d f66393e;

    /* renamed from: f */
    private C28257f f66394f;

    /* renamed from: g */
    private Stack<C28309b> f66395g;

    /* renamed from: h */
    private Stack<C28257f.AbstractC28269ae> f66396h;

    /* renamed from: i */
    private Stack<Matrix> f66397i;

    static {
        Covode.recordClassIndex(34263);
    }

    /* renamed from: a */
    private static int m56499a(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C28257f.C28259a mo48360a() {
        if (this.f66391c.f66413g != null) {
            return this.f66391c.f66413g;
        }
        return this.f66391c.f66412f;
    }

    /* renamed from: a */
    public final void mo48362a(C28257f fVar, C28256e eVar) {
        Objects.requireNonNull(eVar, "renderOptions shouldn't be null");
        this.f66394f = fVar;
        C28257f.C28267ac acVar = fVar.f66242a;
        if (acVar == null) {
            m56530a("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        C28257f.C28259a aVar = acVar.f66309r;
        C28253d dVar = acVar.f66303q;
        m56538b();
        m56541b((C28257f.C28273ai) acVar);
        m56544c();
        m56512a(acVar, new C28257f.C28259a(eVar.f66240b), aVar, dVar);
        m56548d();
    }

    /* renamed from: a */
    private void m56519a(C28257f.C28273ai aiVar) {
        float a;
        if (!(aiVar instanceof C28257f.AbstractC28295q)) {
            m56544c();
            m56541b(aiVar);
            if (aiVar instanceof C28257f.C28267ac) {
                C28257f.C28267ac acVar = (C28257f.C28267ac) aiVar;
                m56512a(acVar, m56508a(acVar.f66286a, acVar.f66287b, acVar.f66288c, acVar.f66289d), acVar.f66309r, acVar.f66303q);
            } else {
                float f = 0.0f;
                if (aiVar instanceof C28257f.C28279ao) {
                    C28257f.C28279ao aoVar = (C28257f.C28279ao) aiVar;
                    m56547c("Use render", new Object[0]);
                    if ((aoVar.f66325e == null || !aoVar.f66325e.mo48345a()) && (aoVar.f66326f == null || !aoVar.f66326f.mo48345a())) {
                        m56528a(this.f66391c, aoVar);
                        if (m56552h()) {
                            C28257f.C28273ai b = aoVar.f66301o.mo48330b(aoVar.f66322a);
                            if (b == null) {
                                m56542b("Use reference '%s' not found", aoVar.f66322a);
                            } else {
                                if (aoVar.f66353b != null) {
                                    this.f66392d.concat(aoVar.f66353b);
                                }
                                float a2 = aoVar.f66323c != null ? aoVar.f66323c.mo48344a(this) : 0.0f;
                                if (aoVar.f66324d != null) {
                                    f = aoVar.f66324d.mo48346b(this);
                                }
                                this.f66392d.translate(a2, f);
                                m56545c((C28257f.AbstractC28270af) aoVar);
                                boolean f2 = m56550f();
                                m56539b((C28257f.AbstractC28269ae) aoVar);
                                if (b instanceof C28257f.C28267ac) {
                                    C28257f.C28267ac acVar2 = (C28257f.C28267ac) b;
                                    C28257f.C28259a a3 = m56508a((C28257f.C28293o) null, (C28257f.C28293o) null, aoVar.f66325e, aoVar.f66326f);
                                    m56544c();
                                    m56512a(acVar2, a3, acVar2.f66309r, acVar2.f66303q);
                                    m56548d();
                                } else {
                                    m56519a(b);
                                }
                                m56549e();
                                if (f2) {
                                    m56548d();
                                }
                                m56514a((C28257f.AbstractC28270af) aoVar);
                            }
                        }
                    }
                } else if (aiVar instanceof C28257f.C28290l) {
                    C28257f.C28290l lVar = (C28257f.C28290l) aiVar;
                    m56547c(lVar.mo48335a() + " render", new Object[0]);
                    m56528a(this.f66391c, lVar);
                    if (m56552h()) {
                        if (lVar.f66353b != null) {
                            this.f66392d.concat(lVar.f66353b);
                        }
                        m56545c((C28257f.AbstractC28270af) lVar);
                        boolean f3 = m56550f();
                        m56513a((C28257f.AbstractC28269ae) lVar);
                        if (f3) {
                            m56548d();
                        }
                        m56514a((C28257f.AbstractC28270af) lVar);
                    }
                } else if (aiVar instanceof C28257f.C28292n) {
                    final C28257f.C28292n nVar = (C28257f.C28292n) aiVar;
                    m56547c("Image render", new Object[0]);
                    if (!(nVar.f66357d == null || nVar.f66357d.mo48345a() || nVar.f66358e == null || nVar.f66358e.mo48345a() || nVar.f66354a == null)) {
                        final C28253d dVar = nVar.f66303q != null ? nVar.f66303q : C28253d.f66228e;
                        Bitmap a4 = m56501a(nVar.f66354a);
                        if (a4 == null) {
                            C28321d dVar2 = this.f66393e;
                            String str = nVar.f66354a;
                            C283061 r4 = new C28321d.AbstractC28325a() {
                                /* class com.lynx.component.svg.p2042a.C28305g.C283061 */

                                static {
                                    Covode.recordClassIndex(34264);
                                }

                                @Override // com.lynx.component.svg.C28321d.AbstractC28325a
                                /* renamed from: a */
                                public final void mo48363a(Bitmap bitmap) {
                                    C28305g.this.mo48361a(nVar, dVar, bitmap);
                                }
                            };
                            AbstractC24157c<C24117a<AbstractC24454c>> a5 = C24428k.m46551a().mo40247e().mo40224a(C24639c.m47149a(Uri.parse(C28621a.m57207a(dVar2.f66520a, str))).mo40483a(), "lynx_SvgResourceManager");
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            a5.mo39739a(new AbstractC24435b(a5, r4, countDownLatch) {
                                /* class com.lynx.component.svg.C28321d.C283221 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC24157c f66523a;

                                /* renamed from: b */
                                final /* synthetic */ AbstractC28325a f66524b;

                                /* renamed from: c */
                                final /* synthetic */ CountDownLatch f66525c;

                                static {
                                    Covode.recordClassIndex(34280);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.d.c] */
                                @Override // com.facebook.p1844d.AbstractC24156b
                                public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                                    if (cVar != null) {
                                        cVar.mo39750g();
                                    }
                                    this.f66525c.countDown();
                                }

                                @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
                                /* renamed from: a */
                                public final void mo9033a(Bitmap bitmap) {
                                    MethodCollector.m26663i(13025);
                                    if (this.f66523a.mo39745b() && bitmap != null) {
                                        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                                        C28321d.this.f66521b.add(createBitmap);
                                        this.f66524b.mo48363a(createBitmap);
                                        this.f66523a.mo39750g();
                                        this.f66525c.countDown();
                                    }
                                    MethodCollector.m26664o(13025);
                                }

                                {
                                    this.f66523a = r2;
                                    this.f66524b = r3;
                                    this.f66525c = r4;
                                }
                            }, C24065a.f56998a);
                            try {
                                countDownLatch.await(3, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            mo48361a(nVar, dVar, a4);
                        }
                    }
                } else if (aiVar instanceof C28257f.C28297s) {
                    C28257f.C28297s sVar = (C28257f.C28297s) aiVar;
                    m56547c("Path render", new Object[0]);
                    if (sVar.f66368a != null) {
                        m56528a(this.f66391c, sVar);
                        if (m56552h() && m56553i() && (this.f66391c.f66409c || this.f66391c.f66408b)) {
                            if (sVar.f66352e != null) {
                                this.f66392d.concat(sVar.f66352e);
                            }
                            Path path = new C28308a(sVar.f66368a).f66404a;
                            if (sVar.f66292j == null) {
                                sVar.f66292j = m56537b(path);
                            }
                            m56514a((C28257f.AbstractC28270af) sVar);
                            m56540b((C28257f.AbstractC28270af) sVar);
                            m56545c((C28257f.AbstractC28270af) sVar);
                            boolean f4 = m56550f();
                            if (this.f66391c.f66408b) {
                                path.setFillType(m56554j());
                                m56515a(sVar, path);
                            }
                            if (this.f66391c.f66409c) {
                                m56511a(path);
                            }
                            if (f4) {
                                m56548d();
                            }
                        }
                    }
                } else if (aiVar instanceof C28257f.C28303y) {
                    C28257f.C28303y yVar = (C28257f.C28303y) aiVar;
                    m56547c("Rect render", new Object[0]);
                    if (yVar.f66385c != null && yVar.f66386d != null && !yVar.f66385c.mo48345a() && !yVar.f66386d.mo48345a()) {
                        m56528a(this.f66391c, yVar);
                        if (m56552h() && m56553i()) {
                            if (yVar.f66352e != null) {
                                this.f66392d.concat(yVar.f66352e);
                            }
                            Path a6 = m56507a(yVar);
                            m56514a((C28257f.AbstractC28270af) yVar);
                            m56540b((C28257f.AbstractC28270af) yVar);
                            m56545c((C28257f.AbstractC28270af) yVar);
                            boolean f5 = m56550f();
                            if (this.f66391c.f66408b) {
                                m56515a(yVar, a6);
                            }
                            if (this.f66391c.f66409c) {
                                m56511a(a6);
                            }
                            if (f5) {
                                m56548d();
                            }
                        }
                    }
                } else if (aiVar instanceof C28257f.C28281c) {
                    C28257f.C28281c cVar = (C28257f.C28281c) aiVar;
                    m56547c("Circle render", new Object[0]);
                    if (cVar.f66333c != null && !cVar.f66333c.mo48345a()) {
                        m56528a(this.f66391c, cVar);
                        if (m56552h() && m56553i()) {
                            if (cVar.f66352e != null) {
                                this.f66392d.concat(cVar.f66352e);
                            }
                            Path a7 = m56504a(cVar);
                            m56514a((C28257f.AbstractC28270af) cVar);
                            m56540b((C28257f.AbstractC28270af) cVar);
                            m56545c((C28257f.AbstractC28270af) cVar);
                            boolean f6 = m56550f();
                            if (this.f66391c.f66408b) {
                                m56515a(cVar, a7);
                            }
                            if (this.f66391c.f66409c) {
                                m56511a(a7);
                            }
                            if (f6) {
                                m56548d();
                            }
                        }
                    }
                } else if (aiVar instanceof C28257f.C28286h) {
                    C28257f.C28286h hVar = (C28257f.C28286h) aiVar;
                    m56547c("Ellipse render", new Object[0]);
                    if (hVar.f66341c != null && hVar.f66342d != null && !hVar.f66341c.mo48345a() && !hVar.f66342d.mo48345a()) {
                        m56528a(this.f66391c, hVar);
                        if (m56552h() && m56553i()) {
                            if (hVar.f66352e != null) {
                                this.f66392d.concat(hVar.f66352e);
                            }
                            Path a8 = m56505a(hVar);
                            m56514a((C28257f.AbstractC28270af) hVar);
                            m56540b((C28257f.AbstractC28270af) hVar);
                            m56545c((C28257f.AbstractC28270af) hVar);
                            boolean f7 = m56550f();
                            if (this.f66391c.f66408b) {
                                m56515a(hVar, a8);
                            }
                            if (this.f66391c.f66409c) {
                                m56511a(a8);
                            }
                            if (f7) {
                                m56548d();
                            }
                        }
                    }
                } else if (aiVar instanceof C28257f.C28294p) {
                    C28257f.C28294p pVar = (C28257f.C28294p) aiVar;
                    m56547c("Line render", new Object[0]);
                    m56528a(this.f66391c, pVar);
                    if (m56552h() && m56553i() && this.f66391c.f66409c) {
                        if (pVar.f66352e != null) {
                            this.f66392d.concat(pVar.f66352e);
                        }
                        if (pVar.f66362a == null) {
                            a = 0.0f;
                        } else {
                            a = pVar.f66362a.mo48344a(this);
                        }
                        float b2 = pVar.f66363b == null ? 0.0f : pVar.f66363b.mo48346b(this);
                        float a9 = pVar.f66364c == null ? 0.0f : pVar.f66364c.mo48344a(this);
                        if (pVar.f66365d != null) {
                            f = pVar.f66365d.mo48346b(this);
                        }
                        if (pVar.f66292j == null) {
                            pVar.f66292j = new C28257f.C28259a(Math.min(a, a9), Math.min(b2, f), Math.abs(a9 - a), Math.abs(f - b2));
                        }
                        Path path2 = new Path();
                        path2.moveTo(a, b2);
                        path2.lineTo(a9, f);
                        m56514a((C28257f.AbstractC28270af) pVar);
                        m56540b((C28257f.AbstractC28270af) pVar);
                        m56545c((C28257f.AbstractC28270af) pVar);
                        boolean f8 = m56550f();
                        m56511a(path2);
                        if (f8) {
                            m56548d();
                        }
                    }
                } else if (aiVar instanceof C28257f.C28302x) {
                    C28257f.C28302x xVar = (C28257f.C28302x) aiVar;
                    m56547c("Polygon render", new Object[0]);
                    m56528a(this.f66391c, xVar);
                    if (m56552h() && m56553i() && (this.f66391c.f66409c || this.f66391c.f66408b)) {
                        if (xVar.f66352e != null) {
                            this.f66392d.concat(xVar.f66352e);
                        }
                        if (xVar.f66382a.length >= 2) {
                            Path a10 = m56506a((C28257f.C28301w) xVar);
                            m56514a((C28257f.AbstractC28270af) xVar);
                            m56540b((C28257f.AbstractC28270af) xVar);
                            m56545c((C28257f.AbstractC28270af) xVar);
                            boolean f9 = m56550f();
                            if (this.f66391c.f66408b) {
                                m56515a(xVar, a10);
                            }
                            if (this.f66391c.f66409c) {
                                m56511a(a10);
                            }
                            if (f9) {
                                m56548d();
                            }
                        }
                    }
                } else if (aiVar instanceof C28257f.C28301w) {
                    C28257f.C28301w wVar = (C28257f.C28301w) aiVar;
                    m56547c("PolyLine render", new Object[0]);
                    m56528a(this.f66391c, wVar);
                    if (m56552h() && m56553i() && (this.f66391c.f66409c || this.f66391c.f66408b)) {
                        if (wVar.f66352e != null) {
                            this.f66392d.concat(wVar.f66352e);
                        }
                        if (wVar.f66382a.length >= 2) {
                            Path a11 = m56506a(wVar);
                            m56514a((C28257f.AbstractC28270af) wVar);
                            a11.setFillType(m56554j());
                            m56540b((C28257f.AbstractC28270af) wVar);
                            m56545c((C28257f.AbstractC28270af) wVar);
                            boolean f10 = m56550f();
                            if (this.f66391c.f66408b) {
                                m56515a(wVar, a11);
                            }
                            if (this.f66391c.f66409c) {
                                m56511a(a11);
                            }
                            if (f10) {
                                m56548d();
                            }
                        }
                    }
                }
            }
            m56548d();
        }
    }

    /* renamed from: a */
    private void m56513a(C28257f.AbstractC28269ae aeVar) {
        m56539b(aeVar);
        for (C28257f.C28273ai aiVar : aeVar.mo48337b()) {
            m56519a(aiVar);
        }
        m56549e();
    }

    /* renamed from: a */
    private void m56528a(C28309b bVar, C28257f.AbstractC28271ag agVar) {
        bVar.f66407a.mo48338a(agVar.f66302p == null);
        if (agVar.f66295m != null) {
            m56527a(bVar, agVar.f66295m);
        }
        if (agVar.f66296n != null) {
            m56527a(bVar, agVar.f66296n);
        }
    }

    /* renamed from: a */
    private void m56515a(C28257f.AbstractC28270af afVar, Path path) {
        if (this.f66391c.f66407a.f66256b instanceof C28257f.C28296r) {
            C28257f.C28273ai b = this.f66394f.mo48330b(((C28257f.C28296r) this.f66391c.f66407a.f66256b).f66366a);
            if (b instanceof C28257f.C28300v) {
                m56516a(afVar, path, (C28257f.C28300v) b);
                return;
            }
        }
        this.f66392d.drawPath(path, this.f66391c.f66410d);
    }

    /* renamed from: a */
    private void m56511a(Path path) {
        if (this.f66391c.f66407a.f66253A == C28257f.C28261ab.EnumC28266e.NonScalingStroke) {
            Matrix matrix = this.f66392d.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f66392d.setMatrix(new Matrix());
            Shader shader = this.f66391c.f66411e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f66392d.drawPath(path2, this.f66391c.f66411e);
            this.f66392d.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f66392d.drawPath(path, this.f66391c.f66411e);
    }

    /* renamed from: a */
    private static void m56530a(String str, Object... objArr) {
        LLog.m56856a(5, "SVGAndroidRenderer", C1764a.m5928a(str, objArr));
    }

    /* renamed from: a */
    private void m56512a(C28257f.C28267ac acVar, C28257f.C28259a aVar, C28257f.C28259a aVar2, C28253d dVar) {
        m56547c("Svg render", new Object[0]);
        if (aVar.f66250c != 0.0f && aVar.f66251d != 0.0f) {
            if (dVar == null) {
                dVar = acVar.f66303q != null ? acVar.f66303q : new C28253d(C28253d.EnumC28254a.none, C28253d.EnumC28255b.meet);
            }
            m56528a(this.f66391c, acVar);
            if (m56552h()) {
                this.f66391c.f66412f = aVar;
                if (!this.f66391c.f66407a.f66269o.booleanValue()) {
                    m56510a(this.f66391c.f66412f.f66248a, this.f66391c.f66412f.f66249b, this.f66391c.f66412f.f66250c, this.f66391c.f66412f.f66251d);
                }
                m56517a(acVar, this.f66391c.f66412f);
                if (aVar2 != null) {
                    this.f66392d.concat(m56502a(this.f66391c.f66412f, aVar2, dVar));
                    this.f66391c.f66413g = acVar.f66309r;
                } else {
                    this.f66392d.translate(this.f66391c.f66412f.f66248a, this.f66391c.f66412f.f66249b);
                }
                boolean f = m56550f();
                m56555k();
                m56513a((C28257f.AbstractC28269ae) acVar);
                if (f) {
                    m56548d();
                }
                m56514a((C28257f.AbstractC28270af) acVar);
            }
        }
    }

    /* renamed from: a */
    private C28257f.C28259a m56508a(C28257f.C28293o oVar, C28257f.C28293o oVar2, C28257f.C28293o oVar3, C28257f.C28293o oVar4) {
        float f = 0.0f;
        float a = oVar != null ? oVar.mo48344a(this) : 0.0f;
        if (oVar2 != null) {
            f = oVar2.mo48346b(this);
        }
        C28257f.C28259a a2 = mo48360a();
        return new C28257f.C28259a(a, f, oVar3 != null ? oVar3.mo48344a(this) : a2.f66250c, oVar4 != null ? oVar4.mo48346b(this) : a2.f66251d);
    }

    /* renamed from: a */
    private void m56514a(C28257f.AbstractC28270af afVar) {
        if (afVar.f66302p != null && afVar.f66292j != null) {
            Matrix matrix = new Matrix();
            if (this.f66397i.peek().invert(matrix)) {
                int i = 2;
                float[] fArr = {afVar.f66292j.f66248a, afVar.f66292j.f66249b, afVar.f66292j.mo48331a(), afVar.f66292j.f66249b, afVar.f66292j.mo48331a(), afVar.f66292j.mo48333b(), afVar.f66292j.f66248a, afVar.f66292j.mo48333b()};
                matrix.preConcat(this.f66392d.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                do {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                    i += 2;
                } while (i <= 6);
                C28257f.AbstractC28270af afVar2 = (C28257f.AbstractC28270af) this.f66396h.peek();
                if (afVar2.f66292j == null) {
                    afVar2.f66292j = C28257f.C28259a.m56438a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    afVar2.f66292j.mo48332a(C28257f.C28259a.m56438a(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48361a(C28257f.C28292n nVar, C28253d dVar, Bitmap bitmap) {
        int i = 0;
        if (bitmap == null) {
            m56542b("Could not locate image '%s'", nVar.f66354a);
            return;
        }
        C28257f.C28259a aVar = new C28257f.C28259a(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        m56528a(this.f66391c, nVar);
        if (m56552h() && m56553i()) {
            if (nVar.f66359f != null) {
                this.f66392d.concat(nVar.f66359f);
            }
            this.f66391c.f66412f = new C28257f.C28259a(nVar.f66355b != null ? nVar.f66355b.mo48344a(this) : 0.0f, nVar.f66356c != null ? nVar.f66356c.mo48346b(this) : 0.0f, nVar.f66357d.mo48344a(this), nVar.f66358e.mo48344a(this));
            if (!this.f66391c.f66407a.f66269o.booleanValue()) {
                m56510a(this.f66391c.f66412f.f66248a, this.f66391c.f66412f.f66249b, this.f66391c.f66412f.f66250c, this.f66391c.f66412f.f66251d);
            }
            nVar.f66292j = this.f66391c.f66412f;
            m56514a((C28257f.AbstractC28270af) nVar);
            m56545c((C28257f.AbstractC28270af) nVar);
            boolean f = m56550f();
            m56555k();
            this.f66392d.save();
            this.f66392d.concat(m56502a(this.f66391c.f66412f, aVar, dVar));
            if (this.f66391c.f66407a.f66254B != C28257f.C28261ab.EnumC28265d.optimizeSpeed) {
                i = 2;
            }
            this.f66392d.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(i));
            this.f66392d.restore();
            if (f) {
                m56548d();
            }
        }
    }

    /* renamed from: a */
    private static boolean m56535a(C28257f.C28261ab abVar, long j) {
        return (j & abVar.f66255a) != 0;
    }

    /* renamed from: a */
    private void m56527a(C28309b bVar, C28257f.C28261ab abVar) {
        if (m56535a(abVar, 4096)) {
            bVar.f66407a.f66268n = abVar.f66268n;
        }
        if (m56535a(abVar, 2048)) {
            bVar.f66407a.f66267m = abVar.f66267m;
        }
        if (m56535a(abVar, 1)) {
            bVar.f66407a.f66256b = abVar.f66256b;
            bVar.f66408b = (abVar.f66256b == null || abVar.f66256b == C28257f.C28283e.f66336c) ? false : true;
        }
        if (m56535a(abVar, 4)) {
            bVar.f66407a.f66258d = abVar.f66258d;
        }
        if (m56535a(abVar, 6149)) {
            m56529a(bVar, true, bVar.f66407a.f66256b);
        }
        if (m56535a(abVar, 2)) {
            bVar.f66407a.f66257c = abVar.f66257c;
        }
        if (m56535a(abVar, 8)) {
            bVar.f66407a.f66259e = abVar.f66259e;
            bVar.f66409c = (abVar.f66259e == null || abVar.f66259e == C28257f.C28283e.f66336c) ? false : true;
        }
        if (m56535a(abVar, 16)) {
            bVar.f66407a.f66260f = abVar.f66260f;
        }
        if (m56535a(abVar, 6168)) {
            m56529a(bVar, false, bVar.f66407a.f66259e);
        }
        if (m56535a(abVar, 34359738368L)) {
            bVar.f66407a.f66253A = abVar.f66253A;
        }
        if (m56535a(abVar, 32)) {
            bVar.f66407a.f66261g = abVar.f66261g;
            bVar.f66411e.setStrokeWidth(bVar.f66407a.f66261g.mo48348c(this));
        }
        if (m56535a(abVar, 64)) {
            bVar.f66407a.f66262h = abVar.f66262h;
            int i = C283072.f66402b[abVar.f66262h.ordinal()];
            if (i == 1) {
                bVar.f66411e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                bVar.f66411e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                bVar.f66411e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m56535a(abVar, 128)) {
            bVar.f66407a.f66263i = abVar.f66263i;
            int i2 = C283072.f66403c[abVar.f66263i.ordinal()];
            if (i2 == 1) {
                bVar.f66411e.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                bVar.f66411e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                bVar.f66411e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m56535a(abVar, 256)) {
            bVar.f66407a.f66264j = abVar.f66264j;
            bVar.f66411e.setStrokeMiter(abVar.f66264j.floatValue());
        }
        if (m56535a(abVar, 512)) {
            bVar.f66407a.f66265k = abVar.f66265k;
        }
        if (m56535a(abVar, 1024)) {
            bVar.f66407a.f66266l = abVar.f66266l;
        }
        if (m56535a(abVar, 1536)) {
            if (bVar.f66407a.f66265k == null) {
                bVar.f66411e.setPathEffect(null);
            } else {
                int length = bVar.f66407a.f66265k.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    fArr[i4] = bVar.f66407a.f66265k[i4 % length].mo48348c(this);
                    f += fArr[i4];
                }
                if (f == 0.0f) {
                    bVar.f66411e.setPathEffect(null);
                } else {
                    float c = bVar.f66407a.f66266l.mo48348c(this);
                    if (c < 0.0f) {
                        c = (c % f) + f;
                    }
                    bVar.f66411e.setPathEffect(new DashPathEffect(fArr, c));
                }
            }
        }
        if (m56535a(abVar, 524288)) {
            bVar.f66407a.f66269o = abVar.f66269o;
        }
        if (m56535a(abVar, 16777216)) {
            bVar.f66407a.f66271q = abVar.f66271q;
        }
        if (m56535a(abVar, 33554432)) {
            bVar.f66407a.f66272r = abVar.f66272r;
        }
        if (m56535a(abVar, 1048576)) {
            bVar.f66407a.f66270p = abVar.f66270p;
        }
        if (m56535a(abVar, 268435456)) {
            bVar.f66407a.f66275u = abVar.f66275u;
        }
        if (m56535a(abVar, 536870912)) {
            bVar.f66407a.f66276v = abVar.f66276v;
        }
        if (m56535a(abVar, 67108864)) {
            bVar.f66407a.f66273s = abVar.f66273s;
        }
        if (m56535a(abVar, 134217728)) {
            bVar.f66407a.f66274t = abVar.f66274t;
        }
        if (m56535a(abVar, 8589934592L)) {
            bVar.f66407a.f66279y = abVar.f66279y;
        }
        if (m56535a(abVar, 17179869184L)) {
            bVar.f66407a.f66280z = abVar.f66280z;
        }
        if (m56535a(abVar, 137438953472L)) {
            bVar.f66407a.f66254B = abVar.f66254B;
        }
    }

    /* renamed from: a */
    private static void m56529a(C28309b bVar, boolean z, C28257f.AbstractC28274aj ajVar) {
        int i;
        C28257f.C28261ab abVar = bVar.f66407a;
        float floatValue = (z ? abVar.f66258d : abVar.f66260f).floatValue();
        if (ajVar instanceof C28257f.C28283e) {
            i = ((C28257f.C28283e) ajVar).f66337a;
        } else if (ajVar instanceof C28257f.C28284f) {
            i = bVar.f66407a.f66268n.f66337a;
        } else {
            return;
        }
        int a = m56500a(i, floatValue);
        if (z) {
            bVar.f66410d.setColor(a);
        } else {
            bVar.f66411e.setColor(a);
        }
    }

    /* renamed from: a */
    private void m56510a(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        if (this.f66391c.f66407a.f66270p != null) {
            f += this.f66391c.f66407a.f66270p.f66330d.mo48344a(this);
            f2 += this.f66391c.f66407a.f66270p.f66327a.mo48346b(this);
            f5 -= this.f66391c.f66407a.f66270p.f66328b.mo48344a(this);
            f6 -= this.f66391c.f66407a.f66270p.f66329c.mo48346b(this);
        }
        this.f66392d.clipRect(f, f2, f5, f6);
    }

    /* renamed from: a */
    private C28309b m56509a(C28257f.C28273ai aiVar, C28309b bVar) {
        ArrayList<C28257f.AbstractC28271ag> arrayList = new ArrayList();
        while (true) {
            if (aiVar instanceof C28257f.AbstractC28271ag) {
                arrayList.add(0, aiVar);
            }
            if (aiVar.f66302p == null) {
                break;
            }
            aiVar = (C28257f.C28273ai) aiVar.f66302p;
        }
        for (C28257f.AbstractC28271ag agVar : arrayList) {
            m56528a(bVar, agVar);
        }
        bVar.f66413g = this.f66391c.f66413g;
        bVar.f66412f = this.f66391c.f66412f;
        return bVar;
    }

    /* renamed from: a */
    private void m56533a(boolean z, C28257f.C28259a aVar, C28257f.C28296r rVar) {
        C28257f.C28273ai b = this.f66394f.mo48330b(rVar.f66366a);
        if (b == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = rVar.f66366a;
            m56542b("%s reference '%s' not found", objArr);
            if (rVar.f66367b != null) {
                m56529a(this.f66391c, z, rVar.f66367b);
            } else if (z) {
                this.f66391c.f66408b = false;
            } else {
                this.f66391c.f66409c = false;
            }
        } else if (b instanceof C28257f.C28272ah) {
            m56531a(z, aVar, (C28257f.C28272ah) b);
        } else if (b instanceof C28257f.C28276al) {
            m56532a(z, aVar, (C28257f.C28276al) b);
        } else if (b instanceof C28257f.C28304z) {
            m56534a(z, (C28257f.C28304z) b);
        }
    }

    /* renamed from: a */
    private void m56531a(boolean z, C28257f.C28259a aVar, C28257f.C28272ah ahVar) {
        float f;
        float f2;
        float f3;
        float f4;
        if (ahVar.f66347e != null) {
            m56523a(ahVar, ahVar.f66347e);
        }
        int i = 0;
        boolean z2 = ahVar.f66344b != null && ahVar.f66344b.booleanValue();
        C28309b bVar = this.f66391c;
        Paint paint = z ? bVar.f66410d : bVar.f66411e;
        if (z2) {
            C28257f.C28259a a = mo48360a();
            f2 = ahVar.f66297f != null ? ahVar.f66297f.mo48344a(this) : 0.0f;
            f = ahVar.f66298g != null ? ahVar.f66298g.mo48346b(this) : 0.0f;
            f3 = ahVar.f66299h != null ? ahVar.f66299h.mo48344a(this) : a.f66250c;
            if (ahVar.f66300i != null) {
                f4 = ahVar.f66300i.mo48346b(this);
            }
            f4 = 0.0f;
        } else {
            f2 = ahVar.f66297f != null ? ahVar.f66297f.mo48349d(this) : 0.0f;
            f = ahVar.f66298g != null ? ahVar.f66298g.mo48349d(this) : 0.0f;
            f3 = ahVar.f66299h != null ? ahVar.f66299h.mo48349d(this) : 1.0f;
            if (ahVar.f66300i != null) {
                f4 = ahVar.f66300i.mo48349d(this);
            }
            f4 = 0.0f;
        }
        m56544c();
        this.f66391c = m56543c(ahVar);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(aVar.f66248a, aVar.f66249b);
            matrix.preScale(aVar.f66250c, aVar.f66251d);
        }
        if (ahVar.f66345c != null) {
            matrix.preConcat(ahVar.f66345c);
        }
        int size = ahVar.f66343a.size();
        if (size == 0) {
            m56548d();
            if (z) {
                this.f66391c.f66408b = false;
            } else {
                this.f66391c.f66409c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f5 = -1.0f;
            for (C28257f.C28273ai aiVar : ahVar.f66343a) {
                C28257f.C28260aa aaVar = (C28257f.C28260aa) aiVar;
                float floatValue = aaVar.f66252a != null ? aaVar.f66252a.floatValue() : 0.0f;
                if (i == 0 || floatValue >= f5) {
                    fArr[i] = floatValue;
                    f5 = floatValue;
                } else {
                    fArr[i] = f5;
                }
                m56544c();
                m56528a(this.f66391c, aaVar);
                C28257f.C28283e eVar = (C28257f.C28283e) this.f66391c.f66407a.f66273s;
                if (eVar == null) {
                    eVar = C28257f.C28283e.f66335b;
                }
                iArr[i] = m56500a(eVar.f66337a, this.f66391c.f66407a.f66274t.floatValue());
                i++;
                m56548d();
            }
            if ((f2 == f3 && f == f4) || size == 1) {
                m56548d();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (ahVar.f66346d != null) {
                if (ahVar.f66346d == C28257f.EnumC28288j.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (ahVar.f66346d == C28257f.EnumC28288j.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m56548d();
            LinearGradient linearGradient = new LinearGradient(f2, f, f3, f4, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m56499a(this.f66391c.f66407a.f66258d.floatValue()));
        }
    }

    /* renamed from: a */
    private void m56532a(boolean z, C28257f.C28259a aVar, C28257f.C28276al alVar) {
        float f;
        float d;
        float d2;
        if (alVar.f66347e != null) {
            m56523a(alVar, alVar.f66347e);
        }
        int i = 0;
        boolean z2 = alVar.f66344b != null && alVar.f66344b.booleanValue();
        C28309b bVar = this.f66391c;
        Paint paint = z ? bVar.f66410d : bVar.f66411e;
        if (z2) {
            C28257f.C28293o oVar = new C28257f.C28293o(50.0f, C28257f.EnumC28278an.percent);
            d = alVar.f66304f != null ? alVar.f66304f.mo48344a(this) : oVar.mo48344a(this);
            d2 = alVar.f66305g != null ? alVar.f66305g.mo48346b(this) : oVar.mo48346b(this);
            if (alVar.f66306h != null) {
                oVar = alVar.f66306h;
            }
            f = oVar.mo48348c(this);
        } else {
            f = 0.5f;
            d = alVar.f66304f != null ? alVar.f66304f.mo48349d(this) : 0.5f;
            d2 = alVar.f66305g != null ? alVar.f66305g.mo48349d(this) : 0.5f;
            if (alVar.f66306h != null) {
                f = alVar.f66306h.mo48349d(this);
            }
        }
        m56544c();
        this.f66391c = m56543c(alVar);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(aVar.f66248a, aVar.f66249b);
            matrix.preScale(aVar.f66250c, aVar.f66251d);
        }
        if (alVar.f66345c != null) {
            matrix.preConcat(alVar.f66345c);
        }
        int size = alVar.f66343a.size();
        if (size == 0) {
            m56548d();
            if (z) {
                this.f66391c.f66408b = false;
            } else {
                this.f66391c.f66409c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f2 = -1.0f;
            Iterator it = alVar.f66343a.iterator();
            while (true) {
                float f3 = 0.0f;
                if (!it.hasNext()) {
                    break;
                }
                C28257f.C28260aa aaVar = (C28257f.C28260aa) ((C28257f.C28273ai) it.next());
                if (aaVar.f66252a != null) {
                    f3 = aaVar.f66252a.floatValue();
                }
                if (i == 0 || f3 >= f2) {
                    fArr[i] = f3;
                    f2 = f3;
                } else {
                    fArr[i] = f2;
                }
                m56544c();
                m56528a(this.f66391c, aaVar);
                C28257f.C28283e eVar = (C28257f.C28283e) this.f66391c.f66407a.f66273s;
                if (eVar == null) {
                    eVar = C28257f.C28283e.f66335b;
                }
                iArr[i] = m56500a(eVar.f66337a, this.f66391c.f66407a.f66274t.floatValue());
                i++;
                m56548d();
            }
            if (f == 0.0f || size == 1) {
                m56548d();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (alVar.f66346d != null) {
                if (alVar.f66346d == C28257f.EnumC28288j.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (alVar.f66346d == C28257f.EnumC28288j.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m56548d();
            RadialGradient radialGradient = new RadialGradient(d, d2, f, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(m56499a(this.f66391c.f66407a.f66258d.floatValue()));
        }
    }

    /* renamed from: a */
    private static void m56523a(C28257f.AbstractC28287i iVar, String str) {
        while (true) {
            C28257f.C28273ai b = iVar.f66301o.mo48330b(str);
            if (b == null) {
                m56530a("Gradient reference '%s' not found", str);
                return;
            } else if (!(b instanceof C28257f.AbstractC28287i)) {
                m56542b("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            } else if (b == iVar) {
                m56542b("Circular reference in gradient href attribute '%s'", str);
                return;
            } else {
                C28257f.AbstractC28287i iVar2 = (C28257f.AbstractC28287i) b;
                if (iVar.f66344b == null) {
                    iVar.f66344b = iVar2.f66344b;
                }
                if (iVar.f66345c == null) {
                    iVar.f66345c = iVar2.f66345c;
                }
                if (iVar.f66346d == null) {
                    iVar.f66346d = iVar2.f66346d;
                }
                if (iVar.f66343a.isEmpty()) {
                    iVar.f66343a = iVar2.f66343a;
                }
                try {
                    if (iVar instanceof C28257f.C28272ah) {
                        m56518a((C28257f.C28272ah) iVar, (C28257f.C28272ah) b);
                    } else {
                        m56521a((C28257f.C28276al) iVar, (C28257f.C28276al) b);
                    }
                } catch (ClassCastException unused) {
                }
                if (iVar2.f66347e != null) {
                    str = iVar2.f66347e;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m56518a(C28257f.C28272ah ahVar, C28257f.C28272ah ahVar2) {
        if (ahVar.f66297f == null) {
            ahVar.f66297f = ahVar2.f66297f;
        }
        if (ahVar.f66298g == null) {
            ahVar.f66298g = ahVar2.f66298g;
        }
        if (ahVar.f66299h == null) {
            ahVar.f66299h = ahVar2.f66299h;
        }
        if (ahVar.f66300i == null) {
            ahVar.f66300i = ahVar2.f66300i;
        }
    }

    /* renamed from: a */
    private static void m56521a(C28257f.C28276al alVar, C28257f.C28276al alVar2) {
        if (alVar.f66304f == null) {
            alVar.f66304f = alVar2.f66304f;
        }
        if (alVar.f66305g == null) {
            alVar.f66305g = alVar2.f66305g;
        }
        if (alVar.f66306h == null) {
            alVar.f66306h = alVar2.f66306h;
        }
        if (alVar.f66307i == null) {
            alVar.f66307i = alVar2.f66307i;
        }
        if (alVar.f66308j == null) {
            alVar.f66308j = alVar2.f66308j;
        }
    }

    /* renamed from: a */
    private void m56534a(boolean z, C28257f.C28304z zVar) {
        boolean z2 = true;
        if (z) {
            if (m56535a(zVar.f66295m, 2147483648L)) {
                this.f66391c.f66407a.f66256b = zVar.f66295m.f66277w;
                C28309b bVar = this.f66391c;
                if (zVar.f66295m.f66277w == null) {
                    z2 = false;
                }
                bVar.f66408b = z2;
            }
            if (m56535a(zVar.f66295m, 4294967296L)) {
                this.f66391c.f66407a.f66258d = zVar.f66295m.f66278x;
            }
            if (m56535a(zVar.f66295m, 6442450944L)) {
                C28309b bVar2 = this.f66391c;
                m56529a(bVar2, z, bVar2.f66407a.f66256b);
                return;
            }
            return;
        }
        if (m56535a(zVar.f66295m, 2147483648L)) {
            this.f66391c.f66407a.f66259e = zVar.f66295m.f66277w;
            C28309b bVar3 = this.f66391c;
            if (zVar.f66295m.f66277w == null) {
                z2 = false;
            }
            bVar3.f66409c = z2;
        }
        if (m56535a(zVar.f66295m, 4294967296L)) {
            this.f66391c.f66407a.f66260f = zVar.f66295m.f66278x;
        }
        if (m56535a(zVar.f66295m, 6442450944L)) {
            C28309b bVar4 = this.f66391c;
            m56529a(bVar4, z, bVar4.f66407a.f66259e);
        }
    }

    /* renamed from: a */
    private void m56517a(C28257f.AbstractC28270af afVar, C28257f.C28259a aVar) {
        if (this.f66391c.f66407a.f66275u != null) {
            int i = Build.VERSION.SDK_INT;
            Path b = m56536b(afVar, aVar);
            if (b != null) {
                this.f66392d.clipPath(b);
            }
        }
    }

    /* renamed from: a */
    private void m56520a(C28257f.C28273ai aiVar, boolean z, Path path, Matrix matrix) {
        if (m56552h()) {
            m56556l();
            if (aiVar instanceof C28257f.C28279ao) {
                if (z) {
                    m56522a((C28257f.C28279ao) aiVar, path, matrix);
                } else {
                    m56542b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (aiVar instanceof C28257f.C28297s) {
                m56525a((C28257f.C28297s) aiVar, path, matrix);
            } else if (aiVar instanceof C28257f.AbstractC28289k) {
                m56524a((C28257f.AbstractC28289k) aiVar, path, matrix);
            } else {
                m56542b("Invalid %s element found in clipPath definition", aiVar.toString());
            }
            m56557m();
        }
    }

    /* renamed from: a */
    private void m56525a(C28257f.C28297s sVar, Path path, Matrix matrix) {
        m56528a(this.f66391c, sVar);
        if (m56552h() && m56553i()) {
            if (sVar.f66352e != null) {
                matrix.preConcat(sVar.f66352e);
            }
            Path path2 = new C28308a(sVar.f66368a).f66404a;
            if (sVar.f66292j == null) {
                sVar.f66292j = m56537b(path2);
            }
            m56545c((C28257f.AbstractC28270af) sVar);
            path.setFillType(m56558n());
            path.addPath(path2, matrix);
        }
    }

    /* renamed from: a */
    private void m56524a(C28257f.AbstractC28289k kVar, Path path, Matrix matrix) {
        Path a;
        m56528a(this.f66391c, kVar);
        if (m56552h() && m56553i()) {
            if (kVar.f66352e != null) {
                matrix.preConcat(kVar.f66352e);
            }
            if (kVar instanceof C28257f.C28303y) {
                a = m56507a((C28257f.C28303y) kVar);
            } else if (kVar instanceof C28257f.C28281c) {
                a = m56504a((C28257f.C28281c) kVar);
            } else if (kVar instanceof C28257f.C28286h) {
                a = m56505a((C28257f.C28286h) kVar);
            } else if (kVar instanceof C28257f.C28301w) {
                a = m56506a((C28257f.C28301w) kVar);
            } else {
                return;
            }
            m56545c((C28257f.AbstractC28270af) kVar);
            path.setFillType(m56558n());
            path.addPath(a, matrix);
        }
    }

    /* renamed from: a */
    private void m56522a(C28257f.C28279ao aoVar, Path path, Matrix matrix) {
        m56528a(this.f66391c, aoVar);
        if (m56552h() && m56553i()) {
            if (aoVar.f66353b != null) {
                matrix.preConcat(aoVar.f66353b);
            }
            C28257f.C28273ai b = aoVar.f66301o.mo48330b(aoVar.f66322a);
            if (b == null) {
                m56542b("Use reference '%s' not found", aoVar.f66322a);
                return;
            }
            m56545c((C28257f.AbstractC28270af) aoVar);
            m56520a(b, false, path, matrix);
        }
    }

    /* renamed from: a */
    private Path m56507a(C28257f.C28303y yVar) {
        float a;
        float b;
        if (yVar.f66387f == null && yVar.f66388g == null) {
            a = 0.0f;
            b = 0.0f;
        } else {
            if (yVar.f66387f == null) {
                a = yVar.f66388g.mo48346b(this);
            } else if (yVar.f66388g == null) {
                a = yVar.f66387f.mo48344a(this);
            } else {
                a = yVar.f66387f.mo48344a(this);
                b = yVar.f66388g.mo48346b(this);
            }
            b = a;
        }
        float min = Math.min(a, yVar.f66385c.mo48344a(this) / 2.0f);
        float min2 = Math.min(b, yVar.f66386d.mo48346b(this) / 2.0f);
        float a2 = yVar.f66383a != null ? yVar.f66383a.mo48344a(this) : 0.0f;
        float b2 = yVar.f66384b != null ? yVar.f66384b.mo48346b(this) : 0.0f;
        float a3 = yVar.f66385c.mo48344a(this);
        float b3 = yVar.f66386d.mo48346b(this);
        if (yVar.f66292j == null) {
            yVar.f66292j = new C28257f.C28259a(a2, b2, a3, b3);
        }
        float f = a2 + a3;
        float f2 = b2 + b3;
        Path path = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path.addRect(a2, b2, f, f2, Path.Direction.CW);
            return path;
        }
        float f3 = min * 0.5522848f;
        float f4 = 0.5522848f * min2;
        float f5 = b2 + min2;
        path.moveTo(a2, f5);
        float f6 = f5 - f4;
        float f7 = a2 + min;
        float f8 = f7 - f3;
        path.cubicTo(a2, f6, f8, b2, f7, b2);
        float f9 = f - min;
        path.lineTo(f9, b2);
        float f10 = f9 + f3;
        path.cubicTo(f10, b2, f, f6, f, f5);
        float f11 = f2 - min2;
        path.lineTo(f, f11);
        float f12 = f11 + f4;
        path.cubicTo(f, f12, f10, f2, f9, f2);
        path.lineTo(f7, f2);
        path.cubicTo(f8, f2, a2, f12, a2, f11);
        path.lineTo(a2, f5);
        path.close();
        return path;
    }

    /* renamed from: a */
    private void m56516a(C28257f.AbstractC28270af afVar, Path path, C28257f.C28300v vVar) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = vVar.f66374a != null && vVar.f66374a.booleanValue();
        if (vVar.f66381h != null) {
            m56526a(vVar, vVar.f66381h);
        }
        if (z) {
            f = vVar.f66377d != null ? vVar.f66377d.mo48344a(this) : 0.0f;
            f2 = vVar.f66378e != null ? vVar.f66378e.mo48346b(this) : 0.0f;
            f3 = vVar.f66379f != null ? vVar.f66379f.mo48344a(this) : 0.0f;
            f4 = vVar.f66380g != null ? vVar.f66380g.mo48346b(this) : 0.0f;
        } else {
            float d = vVar.f66377d != null ? vVar.f66377d.mo48349d(this) : 0.0f;
            float d2 = vVar.f66378e != null ? vVar.f66378e.mo48349d(this) : 0.0f;
            float d3 = vVar.f66379f != null ? vVar.f66379f.mo48349d(this) : 0.0f;
            float d4 = vVar.f66380g != null ? vVar.f66380g.mo48349d(this) : 0.0f;
            f = (d * afVar.f66292j.f66250c) + afVar.f66292j.f66248a;
            f2 = (d2 * afVar.f66292j.f66251d) + afVar.f66292j.f66249b;
            f3 = d3 * afVar.f66292j.f66250c;
            f4 = d4 * afVar.f66292j.f66251d;
        }
        if (!(f3 == 0.0f || f4 == 0.0f)) {
            C28253d dVar = vVar.f66303q != null ? vVar.f66303q : C28253d.f66228e;
            m56544c();
            this.f66392d.clipPath(path);
            C28309b bVar = new C28309b();
            m56527a(bVar, C28257f.C28261ab.m56445a());
            bVar.f66407a.f66269o = false;
            this.f66391c = m56509a(vVar, bVar);
            C28257f.C28259a aVar = afVar.f66292j;
            if (vVar.f66376c != null) {
                this.f66392d.concat(vVar.f66376c);
                Matrix matrix = new Matrix();
                if (vVar.f66376c.invert(matrix)) {
                    float[] fArr = {afVar.f66292j.f66248a, afVar.f66292j.f66249b, afVar.f66292j.mo48331a(), afVar.f66292j.f66249b, afVar.f66292j.mo48331a(), afVar.f66292j.mo48333b(), afVar.f66292j.f66248a, afVar.f66292j.mo48333b()};
                    matrix.mapPoints(fArr);
                    RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                    int i = 2;
                    do {
                        if (fArr[i] < rectF.left) {
                            rectF.left = fArr[i];
                        }
                        if (fArr[i] > rectF.right) {
                            rectF.right = fArr[i];
                        }
                        int i2 = i + 1;
                        if (fArr[i2] < rectF.top) {
                            rectF.top = fArr[i2];
                        }
                        if (fArr[i2] > rectF.bottom) {
                            rectF.bottom = fArr[i2];
                        }
                        i += 2;
                    } while (i <= 6);
                    aVar = new C28257f.C28259a(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                }
            }
            float floor = f + (((float) Math.floor((double) ((aVar.f66248a - f) / f3))) * f3);
            float a = aVar.mo48331a();
            float b = aVar.mo48333b();
            C28257f.C28259a aVar2 = new C28257f.C28259a(0.0f, 0.0f, f3, f4);
            boolean f5 = m56550f();
            for (float floor2 = f2 + (((float) Math.floor((double) ((aVar.f66249b - f2) / f4))) * f4); floor2 < b; floor2 += f4) {
                for (float f6 = floor; f6 < a; f6 += f3) {
                    aVar2.f66248a = f6;
                    aVar2.f66249b = floor2;
                    m56544c();
                    if (!this.f66391c.f66407a.f66269o.booleanValue()) {
                        m56510a(aVar2.f66248a, aVar2.f66249b, aVar2.f66250c, aVar2.f66251d);
                    }
                    if (vVar.f66309r != null) {
                        this.f66392d.concat(m56502a(aVar2, vVar.f66309r, dVar));
                    } else {
                        boolean z2 = vVar.f66375b == null || vVar.f66375b.booleanValue();
                        this.f66392d.translate(f6, floor2);
                        if (!z2) {
                            this.f66392d.scale(afVar.f66292j.f66250c, afVar.f66292j.f66251d);
                        }
                    }
                    for (C28257f.C28273ai aiVar : vVar.f66291i) {
                        m56519a(aiVar);
                    }
                    m56548d();
                }
            }
            if (f5) {
                m56548d();
            }
            m56548d();
        }
    }

    /* renamed from: a */
    private static void m56526a(C28257f.C28300v vVar, String str) {
        while (true) {
            C28257f.C28273ai b = vVar.f66301o.mo48330b(str);
            if (b == null) {
                m56530a("Pattern reference '%s' not found", str);
                return;
            } else if (!(b instanceof C28257f.C28300v)) {
                m56542b("Pattern href attributes must point to other pattern elements", new Object[0]);
                return;
            } else if (b == vVar) {
                m56542b("Circular reference in pattern href attribute '%s'", str);
                return;
            } else {
                C28257f.C28300v vVar2 = (C28257f.C28300v) b;
                if (vVar.f66374a == null) {
                    vVar.f66374a = vVar2.f66374a;
                }
                if (vVar.f66375b == null) {
                    vVar.f66375b = vVar2.f66375b;
                }
                if (vVar.f66376c == null) {
                    vVar.f66376c = vVar2.f66376c;
                }
                if (vVar.f66377d == null) {
                    vVar.f66377d = vVar2.f66377d;
                }
                if (vVar.f66378e == null) {
                    vVar.f66378e = vVar2.f66378e;
                }
                if (vVar.f66379f == null) {
                    vVar.f66379f = vVar2.f66379f;
                }
                if (vVar.f66380g == null) {
                    vVar.f66380g = vVar2.f66380g;
                }
                if (vVar.f66291i.isEmpty()) {
                    vVar.f66291i = vVar2.f66291i;
                }
                if (vVar.f66309r == null) {
                    vVar.f66309r = vVar2.f66309r;
                }
                if (vVar.f66303q == null) {
                    vVar.f66303q = vVar2.f66303q;
                }
                if (vVar2.f66381h != null) {
                    str = vVar2.f66381h;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.lynx.component.svg.a.g$a */
    public static class C28308a implements C28257f.AbstractC28299u {

        /* renamed from: a */
        public Path f66404a = new Path();

        /* renamed from: b */
        float f66405b;

        /* renamed from: c */
        float f66406c;

        static {
            Covode.recordClassIndex(34266);
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48352a() {
            this.f66404a.close();
        }

        C28308a(C28257f.C28298t tVar) {
            if (tVar != null) {
                tVar.mo48358a(this);
            }
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48354a(float f, float f2) {
            this.f66404a.moveTo(f, f2);
            this.f66405b = f;
            this.f66406c = f2;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: b */
        public final void mo48359b(float f, float f2) {
            this.f66404a.lineTo(f, f2);
            this.f66405b = f;
            this.f66406c = f2;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48355a(float f, float f2, float f3, float f4) {
            this.f66404a.quadTo(f, f2, f3, f4);
            this.f66405b = f3;
            this.f66406c = f4;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48356a(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f66404a.cubicTo(f, f2, f3, f4, f5, f6);
            this.f66405b = f5;
            this.f66406c = f6;
        }

        @Override // com.lynx.component.svg.p2042a.C28257f.AbstractC28299u
        /* renamed from: a */
        public final void mo48357a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            double d;
            double d2;
            double d3;
            double acos;
            C28308a aVar = this;
            float f6 = aVar.f66405b;
            float f7 = aVar.f66406c;
            if (!(f6 == f4 && f7 == f5)) {
                if (f == 0.0f) {
                    aVar = this;
                } else if (f2 != 0.0f) {
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(f2);
                    double d4 = (double) f3;
                    Double.isNaN(d4);
                    double radians = Math.toRadians(d4 % 360.0d);
                    double cos = Math.cos(radians);
                    double sin = Math.sin(radians);
                    double d5 = (double) (f6 - f4);
                    Double.isNaN(d5);
                    double d6 = d5 / 2.0d;
                    double d7 = (double) (f7 - f5);
                    Double.isNaN(d7);
                    double d8 = d7 / 2.0d;
                    double d9 = (cos * d6) + (sin * d8);
                    double d10 = ((-sin) * d6) + (d8 * cos);
                    double d11 = (double) (abs * abs);
                    double d12 = (double) (abs2 * abs2);
                    double d13 = d9 * d9;
                    double d14 = d10 * d10;
                    Double.isNaN(d11);
                    Double.isNaN(d12);
                    double d15 = (d13 / d11) + (d14 / d12);
                    if (d15 > 0.99999d) {
                        double sqrt = Math.sqrt(d15) * 1.00001d;
                        double d16 = (double) abs;
                        Double.isNaN(d16);
                        abs = (float) (d16 * sqrt);
                        double d17 = (double) abs2;
                        Double.isNaN(d17);
                        abs2 = (float) (sqrt * d17);
                        d11 = (double) (abs * abs);
                        d12 = (double) (abs2 * abs2);
                    }
                    if (z == z2) {
                        d = -1.0d;
                    } else {
                        d = 1.0d;
                    }
                    double d18 = d11 * d12;
                    double d19 = d11 * d14;
                    double d20 = d12 * d13;
                    double d21 = ((d18 - d19) - d20) / (d19 + d20);
                    if (d21 < 0.0d) {
                        d21 = 0.0d;
                    }
                    double sqrt2 = d * Math.sqrt(d21);
                    double d22 = (double) abs;
                    Double.isNaN(d22);
                    double d23 = (double) abs2;
                    Double.isNaN(d23);
                    double d24 = ((d22 * d10) / d23) * sqrt2;
                    Double.isNaN(d23);
                    Double.isNaN(d22);
                    double d25 = sqrt2 * (-((d23 * d9) / d22));
                    double d26 = (double) (f6 + f4);
                    Double.isNaN(d26);
                    double d27 = d26 / 2.0d;
                    double d28 = (double) (f7 + f5);
                    Double.isNaN(d28);
                    double d29 = d27 + ((cos * d24) - (sin * d25));
                    double d30 = (d28 / 2.0d) + (sin * d24) + (cos * d25);
                    Double.isNaN(d22);
                    double d31 = (d9 - d24) / d22;
                    Double.isNaN(d23);
                    double d32 = (d10 - d25) / d23;
                    Double.isNaN(d22);
                    double d33 = ((-d9) - d24) / d22;
                    Double.isNaN(d23);
                    double d34 = ((-d10) - d25) / d23;
                    double d35 = (d31 * d31) + (d32 * d32);
                    double sqrt3 = Math.sqrt(d35);
                    if (d32 < 0.0d) {
                        d2 = -1.0d;
                    } else {
                        d2 = 1.0d;
                    }
                    double acos2 = d2 * Math.acos(d31 / sqrt3);
                    double sqrt4 = Math.sqrt(d35 * ((d33 * d33) + (d34 * d34)));
                    double d36 = (d31 * d33) + (d32 * d34);
                    if ((d31 * d34) - (d32 * d33) < 0.0d) {
                        d3 = -1.0d;
                    } else {
                        d3 = 1.0d;
                    }
                    double d37 = d36 / sqrt4;
                    if (d37 < -1.0d) {
                        acos = 3.141592653589793d;
                    } else if (d37 > 1.0d) {
                        acos = 0.0d;
                    } else {
                        acos = Math.acos(d37);
                    }
                    double d38 = d3 * acos;
                    if (d38 == 0.0d) {
                        aVar = this;
                        aVar.mo48359b(f4, f5);
                    } else {
                        if (!z2) {
                            if (d38 > 0.0d) {
                                d38 -= 6.283185307179586d;
                            }
                        } else if (d38 < 0.0d) {
                            d38 += 6.283185307179586d;
                        }
                        double d39 = d38 % 6.283185307179586d;
                        double d40 = acos2 % 6.283185307179586d;
                        int ceil = (int) Math.ceil((Math.abs(d39) * 2.0d) / 3.141592653589793d);
                        double d41 = (double) ceil;
                        Double.isNaN(d41);
                        double d42 = d39 / d41;
                        double d43 = d42 / 2.0d;
                        double sin2 = (Math.sin(d43) * 1.3333333333333333d) / (Math.cos(d43) + 1.0d);
                        int i = ceil * 6;
                        float[] fArr = new float[i];
                        int i2 = 0;
                        for (int i3 = 0; i3 < ceil; i3++) {
                            double d44 = (double) i3;
                            Double.isNaN(d44);
                            double d45 = d40 + (d44 * d42);
                            double cos2 = Math.cos(d45);
                            double sin3 = Math.sin(d45);
                            int i4 = i2 + 1;
                            fArr[i2] = (float) (cos2 - (sin2 * sin3));
                            int i5 = i4 + 1;
                            fArr[i4] = (float) (sin3 + (cos2 * sin2));
                            double d46 = d45 + d42;
                            double cos3 = Math.cos(d46);
                            double sin4 = Math.sin(d46);
                            int i6 = i5 + 1;
                            fArr[i5] = (float) (cos3 + (sin2 * sin4));
                            int i7 = i6 + 1;
                            fArr[i6] = (float) (sin4 - (sin2 * cos3));
                            int i8 = i7 + 1;
                            fArr[i7] = (float) cos3;
                            i2 = i8 + 1;
                            fArr[i8] = (float) sin4;
                        }
                        Matrix matrix = new Matrix();
                        matrix.postScale(abs, abs2);
                        matrix.postRotate(f3);
                        matrix.postTranslate((float) d29, (float) d30);
                        matrix.mapPoints(fArr);
                        fArr[i - 2] = f4;
                        fArr[i - 1] = f5;
                        for (int i9 = 0; i9 < i; i9 += 6) {
                            mo48356a(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]);
                        }
                        aVar = this;
                    }
                }
                aVar.mo48359b(f4, f5);
            }
            aVar.f66405b = f4;
            aVar.f66406c = f5;
        }
    }

    /* renamed from: d */
    private void m56548d() {
        this.f66392d.restore();
        this.f66391c = this.f66395g.pop();
    }

    /* renamed from: e */
    private void m56549e() {
        this.f66396h.pop();
        this.f66397i.pop();
    }

    /* renamed from: m */
    private void m56557m() {
        this.f66392d.restore();
        this.f66391c = this.f66395g.pop();
    }

    /* renamed from: g */
    private boolean m56551g() {
        if (this.f66391c.f66407a.f66267m.floatValue() < 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m56552h() {
        if (this.f66391c.f66407a.f66271q != null) {
            return this.f66391c.f66407a.f66271q.booleanValue();
        }
        return true;
    }

    /* renamed from: i */
    private boolean m56553i() {
        if (this.f66391c.f66407a.f66272r != null) {
            return this.f66391c.f66407a.f66272r.booleanValue();
        }
        return true;
    }

    /* renamed from: j */
    private Path.FillType m56554j() {
        if (this.f66391c.f66407a.f66257c == null || this.f66391c.f66407a.f66257c != C28257f.C28261ab.EnumC28262a.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: l */
    private void m56556l() {
        C28251b.m56429a(this.f66392d, C28251b.f66221a);
        this.f66395g.push(this.f66391c);
        this.f66391c = new C28309b(this.f66391c);
    }

    /* renamed from: n */
    private Path.FillType m56558n() {
        if (this.f66391c.f66407a.f66276v == null || this.f66391c.f66407a.f66276v != C28257f.C28261ab.EnumC28262a.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    /* renamed from: b */
    private void m56538b() {
        this.f66391c = new C28309b();
        this.f66395g = new Stack<>();
        m56527a(this.f66391c, C28257f.C28261ab.m56445a());
        this.f66391c.f66412f = null;
        this.f66391c.f66414h = false;
        this.f66395g.push(new C28309b(this.f66391c));
        this.f66397i = new Stack<>();
        this.f66396h = new Stack<>();
    }

    /* renamed from: c */
    private void m56544c() {
        this.f66392d.save();
        this.f66395g.push(this.f66391c);
        this.f66391c = new C28309b(this.f66391c);
    }

    /* renamed from: f */
    private boolean m56550f() {
        if (!m56551g()) {
            return false;
        }
        this.f66392d.saveLayerAlpha(null, m56499a(this.f66391c.f66407a.f66267m.floatValue()), 31);
        this.f66395g.push(this.f66391c);
        this.f66391c = new C28309b(this.f66391c);
        return true;
    }

    /* renamed from: k */
    private void m56555k() {
        int i;
        if (this.f66391c.f66407a.f66279y instanceof C28257f.C28283e) {
            i = ((C28257f.C28283e) this.f66391c.f66407a.f66279y).f66337a;
        } else if (this.f66391c.f66407a.f66279y instanceof C28257f.C28284f) {
            i = this.f66391c.f66407a.f66268n.f66337a;
        } else {
            return;
        }
        if (this.f66391c.f66407a.f66280z != null) {
            i = m56500a(i, this.f66391c.f66407a.f66280z.floatValue());
        }
        this.f66392d.drawColor(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.g$2 */
    public static /* synthetic */ class C283072 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66401a;

        /* renamed from: b */
        static final /* synthetic */ int[] f66402b;

        /* renamed from: c */
        static final /* synthetic */ int[] f66403c;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a4 */
        static {
            /*
            // Method dump skipped, instructions count: 177
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28305g.C283072.<clinit>():void");
        }
    }

    /* renamed from: c */
    private void m56545c(C28257f.AbstractC28270af afVar) {
        m56517a(afVar, afVar.f66292j);
    }

    /* renamed from: b */
    private static C28257f.C28259a m56537b(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C28257f.C28259a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: c */
    private C28309b m56543c(C28257f.C28273ai aiVar) {
        C28309b bVar = new C28309b();
        m56527a(bVar, C28257f.C28261ab.m56445a());
        return m56509a(aiVar, bVar);
    }

    /* renamed from: a */
    private static Path m56506a(C28257f.C28301w wVar) {
        Path path = new Path();
        path.moveTo(wVar.f66382a[0], wVar.f66382a[1]);
        for (int i = 2; i < wVar.f66382a.length; i += 2) {
            path.lineTo(wVar.f66382a[i], wVar.f66382a[i + 1]);
        }
        if (wVar instanceof C28257f.C28302x) {
            path.close();
        }
        if (wVar.f66292j == null) {
            wVar.f66292j = m56537b(path);
        }
        return path;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.g$b */
    public class C28309b {

        /* renamed from: a */
        C28257f.C28261ab f66407a;

        /* renamed from: b */
        boolean f66408b;

        /* renamed from: c */
        boolean f66409c;

        /* renamed from: d */
        Paint f66410d;

        /* renamed from: e */
        Paint f66411e;

        /* renamed from: f */
        C28257f.C28259a f66412f;

        /* renamed from: g */
        C28257f.C28259a f66413g;

        /* renamed from: h */
        boolean f66414h;

        static {
            Covode.recordClassIndex(34267);
        }

        C28309b() {
            Paint paint = new Paint();
            this.f66410d = paint;
            paint.setFlags(193);
            int i = Build.VERSION.SDK_INT;
            this.f66410d.setHinting(0);
            this.f66410d.setStyle(Paint.Style.FILL);
            this.f66410d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f66411e = paint2;
            paint2.setFlags(193);
            int i2 = Build.VERSION.SDK_INT;
            this.f66411e.setHinting(0);
            this.f66411e.setStyle(Paint.Style.STROKE);
            this.f66411e.setTypeface(Typeface.DEFAULT);
            this.f66407a = C28257f.C28261ab.m56445a();
        }

        C28309b(C28309b bVar) {
            this.f66408b = bVar.f66408b;
            this.f66409c = bVar.f66409c;
            this.f66410d = new Paint(bVar.f66410d);
            this.f66411e = new Paint(bVar.f66411e);
            if (bVar.f66412f != null) {
                this.f66412f = new C28257f.C28259a(bVar.f66412f);
            }
            if (bVar.f66413g != null) {
                this.f66413g = new C28257f.C28259a(bVar.f66413g);
            }
            this.f66414h = bVar.f66414h;
            try {
                this.f66407a = (C28257f.C28261ab) bVar.f66407a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f66407a = C28257f.C28261ab.m56445a();
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m56501a(String str) {
        MethodCollector.m26663i(8131);
        if (!str.startsWith("data:")) {
            MethodCollector.m26664o(8131);
            return null;
        } else if (str.length() < 14) {
            MethodCollector.m26664o(8131);
            return null;
        } else {
            int indexOf = str.indexOf(44);
            if (indexOf < 12) {
                MethodCollector.m26664o(8131);
                return null;
            } else if (!";base64".equals(str.substring(indexOf - 7, indexOf))) {
                MethodCollector.m26664o(8131);
                return null;
            } else {
                try {
                    byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    MethodCollector.m26664o(8131);
                    return decodeByteArray;
                } catch (Exception unused) {
                    MethodCollector.m26664o(8131);
                    return null;
                }
            }
        }
    }

    /* renamed from: b */
    private void m56539b(C28257f.AbstractC28269ae aeVar) {
        this.f66396h.push(aeVar);
        this.f66397i.push(this.f66392d.getMatrix());
    }

    /* renamed from: b */
    private void m56540b(C28257f.AbstractC28270af afVar) {
        if (this.f66391c.f66407a.f66256b instanceof C28257f.C28296r) {
            m56533a(true, afVar.f66292j, (C28257f.C28296r) this.f66391c.f66407a.f66256b);
        }
        if (this.f66391c.f66407a.f66259e instanceof C28257f.C28296r) {
            m56533a(false, afVar.f66292j, (C28257f.C28296r) this.f66391c.f66407a.f66259e);
        }
    }

    /* renamed from: a */
    private Path m56504a(C28257f.C28281c cVar) {
        float f;
        float f2 = 0.0f;
        if (cVar.f66331a != null) {
            f = cVar.f66331a.mo48344a(this);
        } else {
            f = 0.0f;
        }
        if (cVar.f66332b != null) {
            f2 = cVar.f66332b.mo48346b(this);
        }
        float c = cVar.f66333c.mo48348c(this);
        float f3 = f - c;
        float f4 = f2 - c;
        float f5 = f + c;
        float f6 = f2 + c;
        if (cVar.f66292j == null) {
            float f7 = 2.0f * c;
            cVar.f66292j = new C28257f.C28259a(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * c;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* renamed from: b */
    private void m56541b(C28257f.C28273ai aiVar) {
        if (aiVar instanceof C28257f.AbstractC28271ag) {
            C28257f.AbstractC28271ag agVar = (C28257f.AbstractC28271ag) aiVar;
            if (agVar.f66294l != null) {
                this.f66391c.f66414h = agVar.f66294l.booleanValue();
            }
        }
    }

    /* renamed from: a */
    private Path m56505a(C28257f.C28286h hVar) {
        float f;
        float f2 = 0.0f;
        if (hVar.f66339a != null) {
            f = hVar.f66339a.mo48344a(this);
        } else {
            f = 0.0f;
        }
        if (hVar.f66340b != null) {
            f2 = hVar.f66340b.mo48346b(this);
        }
        float a = hVar.f66341c.mo48344a(this);
        float b = hVar.f66342d.mo48346b(this);
        float f3 = f - a;
        float f4 = f2 - b;
        float f5 = f + a;
        float f6 = f2 + b;
        if (hVar.f66292j == null) {
            hVar.f66292j = new C28257f.C28259a(f3, f4, a * 2.0f, 2.0f * b);
        }
        float f7 = a * 0.5522848f;
        float f8 = 0.5522848f * b;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f7;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f8 + f2;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* renamed from: b */
    private static void m56542b(String str, Object... objArr) {
        LLog.m56856a(6, "SVGAndroidRenderer", C1764a.m5928a(str, objArr));
    }

    /* renamed from: c */
    private static void m56547c(String str, Object... objArr) {
        LLog.m56856a(3, "SVGAndroidRenderer", C1764a.m5928a(str, objArr));
    }

    /* renamed from: a */
    private static int m56500a(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: b */
    private Path m56536b(C28257f.AbstractC28270af afVar, C28257f.C28259a aVar) {
        Path a;
        C28257f.C28273ai b = afVar.f66301o.mo48330b(this.f66391c.f66407a.f66275u);
        boolean z = false;
        if (b == null) {
            m56542b("ClipPath reference '%s' not found", this.f66391c.f66407a.f66275u);
            return null;
        }
        C28257f.C28282d dVar = (C28257f.C28282d) b;
        this.f66395g.push(this.f66391c);
        this.f66391c = m56543c((C28257f.C28273ai) dVar);
        if (dVar.f66334a == null || dVar.f66334a.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.f66248a, aVar.f66249b);
            matrix.preScale(aVar.f66250c, aVar.f66251d);
        }
        if (dVar.f66353b != null) {
            matrix.preConcat(dVar.f66353b);
        }
        Path path = new Path();
        for (C28257f.C28273ai aiVar : dVar.f66291i) {
            if ((aiVar instanceof C28257f.AbstractC28270af) && (a = m56503a((C28257f.AbstractC28270af) aiVar, true)) != null) {
                path.op(a, Path.Op.UNION);
            }
        }
        if (this.f66391c.f66407a.f66275u != null) {
            if (dVar.f66292j == null) {
                dVar.f66292j = m56537b(path);
            }
            Path b2 = m56536b(dVar, dVar.f66292j);
            if (b2 != null) {
                path.op(b2, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f66391c = this.f66395g.pop();
        return path;
    }

    /* renamed from: c */
    private void m56546c(C28257f.AbstractC28270af afVar, C28257f.C28259a aVar) {
        boolean z;
        C28257f.C28273ai b = afVar.f66301o.mo48330b(this.f66391c.f66407a.f66275u);
        if (b == null) {
            m56542b("ClipPath reference '%s' not found", this.f66391c.f66407a.f66275u);
            return;
        }
        C28257f.C28282d dVar = (C28257f.C28282d) b;
        if (dVar.f66291i.isEmpty()) {
            this.f66392d.clipRect(0, 0, 0, 0);
            return;
        }
        if (dVar.f66334a == null || dVar.f66334a.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!(afVar instanceof C28257f.C28290l) || z) {
            m56556l();
            if (!z) {
                Matrix matrix = new Matrix();
                matrix.preTranslate(aVar.f66248a, aVar.f66249b);
                matrix.preScale(aVar.f66250c, aVar.f66251d);
                this.f66392d.concat(matrix);
            }
            if (dVar.f66353b != null) {
                this.f66392d.concat(dVar.f66353b);
            }
            this.f66391c = m56543c((C28257f.C28273ai) dVar);
            m56545c((C28257f.AbstractC28270af) dVar);
            Path path = new Path();
            for (C28257f.C28273ai aiVar : dVar.f66291i) {
                m56520a(aiVar, true, path, new Matrix());
            }
            this.f66392d.clipPath(path);
            m56557m();
            return;
        }
        m56530a("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", afVar.mo48335a());
    }

    /* renamed from: a */
    private Path m56503a(C28257f.AbstractC28270af afVar, boolean z) {
        Path path;
        Path b;
        this.f66395g.push(this.f66391c);
        C28309b bVar = new C28309b(this.f66391c);
        this.f66391c = bVar;
        m56528a(bVar, afVar);
        if (!m56552h() || !m56553i()) {
            this.f66391c = this.f66395g.pop();
            return null;
        }
        if (afVar instanceof C28257f.C28279ao) {
            if (!z) {
                m56542b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C28257f.C28279ao aoVar = (C28257f.C28279ao) afVar;
            C28257f.C28273ai b2 = afVar.f66301o.mo48330b(aoVar.f66322a);
            if (b2 == null) {
                m56542b("Use reference '%s' not found", aoVar.f66322a);
                this.f66391c = this.f66395g.pop();
                return null;
            } else if (!(b2 instanceof C28257f.AbstractC28270af)) {
                this.f66391c = this.f66395g.pop();
                return null;
            } else {
                path = m56503a((C28257f.AbstractC28270af) b2, false);
                if (path == null) {
                    return null;
                }
                if (aoVar.f66292j == null) {
                    aoVar.f66292j = m56537b(path);
                }
                if (aoVar.f66353b != null) {
                    path.transform(aoVar.f66353b);
                }
            }
        } else if (afVar instanceof C28257f.AbstractC28289k) {
            C28257f.AbstractC28289k kVar = (C28257f.AbstractC28289k) afVar;
            if (afVar instanceof C28257f.C28297s) {
                path = new C28308a(((C28257f.C28297s) afVar).f66368a).f66404a;
                if (afVar.f66292j == null) {
                    afVar.f66292j = m56537b(path);
                }
            } else if (afVar instanceof C28257f.C28303y) {
                path = m56507a((C28257f.C28303y) afVar);
            } else if (afVar instanceof C28257f.C28281c) {
                path = m56504a((C28257f.C28281c) afVar);
            } else if (afVar instanceof C28257f.C28286h) {
                path = m56505a((C28257f.C28286h) afVar);
            } else {
                if (afVar instanceof C28257f.C28301w) {
                    path = m56506a((C28257f.C28301w) afVar);
                }
                return null;
            }
            if (path != null) {
                if (kVar.f66292j == null) {
                    kVar.f66292j = m56537b(path);
                }
                if (kVar.f66352e != null) {
                    path.transform(kVar.f66352e);
                }
                path.setFillType(m56558n());
            }
            return null;
        } else {
            m56542b("Invalid %s element found in clipPath definition", afVar.mo48335a());
            return null;
        }
        if (!(this.f66391c.f66407a.f66275u == null || (b = m56536b(afVar, afVar.f66292j)) == null)) {
            path.op(b, Path.Op.INTERSECT);
        }
        this.f66391c = this.f66395g.pop();
        return path;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r6 != 8) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Matrix m56502a(com.lynx.component.svg.p2042a.C28257f.C28259a r9, com.lynx.component.svg.p2042a.C28257f.C28259a r10, com.lynx.component.svg.p2042a.C28253d r11) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.p2042a.C28305g.m56502a(com.lynx.component.svg.a.f$a, com.lynx.component.svg.a.f$a, com.lynx.component.svg.a.d):android.graphics.Matrix");
    }

    public C28305g(Canvas canvas, float f, float f2, C28321d dVar) {
        this.f66392d = canvas;
        this.f66389a = f;
        this.f66390b = f2;
        this.f66393e = dVar;
    }
}

package com.facebook.drawee.p1855f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.drawee.p1854e.AbstractC24213c;
import com.facebook.drawee.p1854e.C24216f;
import com.facebook.drawee.p1854e.C24217g;
import com.facebook.drawee.p1854e.C24228p;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1857h.AbstractC24257c;
import com.facebook.imagepipeline.p1891p.C24644b;

/* renamed from: com.facebook.drawee.f.a */
public class C24246a implements AbstractC24257c {

    /* renamed from: a */
    public C24250e f57470a;

    /* renamed from: b */
    public final C24249d f57471b;

    /* renamed from: c */
    public final C24217g f57472c;

    /* renamed from: d */
    private final Drawable f57473d;

    /* renamed from: e */
    private final Resources f57474e;

    /* renamed from: f */
    private final C24216f f57475f;

    static {
        Covode.recordClassIndex(28377);
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24256b
    /* renamed from: a */
    public final Drawable mo39950a() {
        return this.f57471b;
    }

    /* renamed from: a */
    public final void mo39959a(C24250e eVar) {
        this.f57470a = eVar;
        C24252f.m46070a((AbstractC24213c) this.f57471b, eVar);
        for (int i = 0; i < this.f57475f.f57344a.length; i++) {
            C24252f.m46071a(m46018h(i), this.f57470a, this.f57474e);
        }
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24257c
    /* renamed from: b */
    public final void mo39960b() {
        this.f57472c.setDrawable(this.f57473d);
        m46014e();
    }

    /* renamed from: e */
    private void m46014e() {
        C24216f fVar = this.f57475f;
        if (fVar != null) {
            fVar.mo39874a();
            this.f57475f.mo39877c();
            m46015f();
            m46016f(1);
            this.f57475f.mo39879d();
            this.f57475f.mo39875b();
        }
    }

    /* renamed from: f */
    private void m46015f() {
        m46017g(1);
        m46017g(2);
        m46017g(3);
        m46017g(4);
        m46017g(5);
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24257c
    /* renamed from: c */
    public final void mo39965c() {
        this.f57475f.mo39874a();
        m46015f();
        if (this.f57475f.mo39842a(5) != null) {
            m46016f(5);
        } else {
            m46016f(1);
        }
        this.f57475f.mo39875b();
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24257c
    /* renamed from: d */
    public final void mo39969d() {
        this.f57475f.mo39874a();
        m46015f();
        if (this.f57475f.mo39842a(4) != null) {
            m46016f(4);
        } else {
            m46016f(1);
        }
        this.f57475f.mo39875b();
    }

    /* renamed from: f */
    private void m46016f(int i) {
        if (i >= 0) {
            this.f57475f.mo39878c(i);
        }
    }

    /* renamed from: g */
    private void m46017g(int i) {
        if (i >= 0) {
            this.f57475f.mo39880d(i);
        }
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24257c
    /* renamed from: a */
    public final void mo39955a(Drawable drawable) {
        C24249d dVar = this.f57471b;
        dVar.f57497a = drawable;
        dVar.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo39961b(int i) {
        this.f57475f.mo39876b(i);
    }

    /* renamed from: c */
    public final void mo39968c(Drawable drawable) {
        mo39953a(5, drawable);
    }

    /* renamed from: e */
    public final void mo39972e(int i) {
        mo39953a(4, this.f57474e.getDrawable(i));
    }

    /* renamed from: a */
    private void m46011a(float f) {
        Drawable a = this.f57475f.mo39842a(3);
        if (a != null) {
            if (f >= 0.999f) {
                if (a instanceof Animatable) {
                    ((Animatable) a).stop();
                }
                m46017g(3);
            } else {
                if (a instanceof Animatable) {
                    ((Animatable) a).start();
                }
                m46016f(3);
            }
            a.setLevel(Math.round(f * 10000.0f));
        }
    }

    /* renamed from: b */
    public final void mo39963b(Drawable drawable) {
        mo39953a(1, drawable);
    }

    /* renamed from: c */
    public final void mo39966c(int i) {
        mo39953a(1, this.f57474e.getDrawable(i));
    }

    /* renamed from: d */
    public final void mo39970d(int i) {
        mo39953a(5, this.f57474e.getDrawable(i));
    }

    /* renamed from: h */
    private AbstractC24213c m46018h(int i) {
        boolean z;
        C24216f fVar = this.f57475f;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (i >= fVar.f57345b.length) {
            z2 = false;
        }
        C24091i.m45620a(z2);
        if (fVar.f57345b[i] == null) {
            fVar.f57345b[i] = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: APUT  
                  (wrap: com.facebook.drawee.e.c[] : 0x0018: IGET  (r1v9 com.facebook.drawee.e.c[]) = (r2v0 'fVar' com.facebook.drawee.e.f) com.facebook.drawee.e.a.b com.facebook.drawee.e.c[])
                  (r4v0 'i' int)
                  (wrap: com.facebook.drawee.e.a$1 : 0x001c: CONSTRUCTOR  (r0v12 com.facebook.drawee.e.a$1) = (r2v0 'fVar' com.facebook.drawee.e.f), (r4v0 'i' int) call: com.facebook.drawee.e.a.1.<init>(com.facebook.drawee.e.a, int):void type: CONSTRUCTOR)
                 in method: com.facebook.drawee.f.a.h(int):com.facebook.drawee.e.c, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r0v12 com.facebook.drawee.e.a$1) = (r2v0 'fVar' com.facebook.drawee.e.f), (r4v0 'i' int) call: com.facebook.drawee.e.a.1.<init>(com.facebook.drawee.e.a, int):void type: CONSTRUCTOR in method: com.facebook.drawee.f.a.h(int):com.facebook.drawee.e.c, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.drawee.e.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 23 more
                */
            /*
                this = this;
                com.facebook.drawee.e.f r2 = r3.f57475f
                r1 = 1
                r0 = 0
                if (r4 < 0) goto L_0x0044
                r0 = 1
            L_0x0007:
                com.facebook.common.p1832d.C24091i.m45620a(r0)
                com.facebook.drawee.e.c[] r0 = r2.f57345b
                int r0 = r0.length
                if (r4 >= r0) goto L_0x0042
            L_0x000f:
                com.facebook.common.p1832d.C24091i.m45620a(r1)
                com.facebook.drawee.e.c[] r0 = r2.f57345b
                r0 = r0[r4]
                if (r0 != 0) goto L_0x0021
                com.facebook.drawee.e.c[] r1 = r2.f57345b
                com.facebook.drawee.e.a$1 r0 = new com.facebook.drawee.e.a$1
                r0.<init>(r4)
                r1[r4] = r0
            L_0x0021:
                com.facebook.drawee.e.c[] r0 = r2.f57345b
                r1 = r0[r4]
                android.graphics.drawable.Drawable r0 = r1.getDrawable()
                boolean r0 = r0 instanceof com.facebook.drawee.p1854e.C24218h
                if (r0 == 0) goto L_0x0033
                android.graphics.drawable.Drawable r1 = r1.getDrawable()
                com.facebook.drawee.e.g r1 = (com.facebook.drawee.p1854e.C24217g) r1
            L_0x0033:
                android.graphics.drawable.Drawable r0 = r1.getDrawable()
                boolean r0 = r0 instanceof com.facebook.drawee.p1854e.C24228p
                if (r0 == 0) goto L_0x0041
                android.graphics.drawable.Drawable r1 = r1.getDrawable()
                com.facebook.drawee.e.g r1 = (com.facebook.drawee.p1854e.C24217g) r1
            L_0x0041:
                return r1
            L_0x0042:
                r1 = 0
                goto L_0x000f
            L_0x0044:
                r0 = 0
                goto L_0x0007
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.p1855f.C24246a.m46018h(int):com.facebook.drawee.e.c");
        }

        /* renamed from: a */
        public final C24228p mo39951a(int i) {
            AbstractC24213c h = m46018h(i);
            if (h instanceof C24228p) {
                return (C24228p) h;
            }
            Drawable a = C24252f.m46066a(h.setDrawable(C24252f.f57508a), C24229q.AbstractC24231b.f57452b, (PointF) null);
            h.setDrawable(a);
            C24091i.m45618a(a, "Parent has no child drawable!");
            return (C24228p) a;
        }

        /* renamed from: d */
        public final void mo39971d(Drawable drawable) {
            boolean z;
            if (6 < this.f57475f.f57344a.length) {
                z = true;
            } else {
                z = false;
            }
            C24091i.m45621a(z, "The given index does not correspond to an overlay image.");
            mo39953a(6, drawable);
        }

        C24246a(C24247b bVar) {
            int i;
            int i2;
            int i3 = 0;
            ColorDrawable colorDrawable = new ColorDrawable(0);
            this.f57473d = colorDrawable;
            C24644b.m47156a();
            this.f57474e = bVar.f57478c;
            this.f57470a = bVar.f57495t;
            C24217g gVar = new C24217g(colorDrawable);
            this.f57472c = gVar;
            int i4 = 1;
            if (bVar.f57493r != null) {
                i = bVar.f57493r.size();
            } else {
                i = 1;
            }
            if (bVar.f57494s != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            Drawable[] drawableArr = new Drawable[(i5 + 6)];
            drawableArr[0] = m46012c(bVar.f57492q, (C24229q.AbstractC24231b) null);
            drawableArr[1] = m46012c(bVar.f57481f, bVar.f57482g);
            C24229q.AbstractC24231b bVar2 = bVar.f57489n;
            PointF pointF = bVar.f57490o;
            gVar.setColorFilter(bVar.f57491p);
            drawableArr[2] = C24252f.m46066a(gVar, bVar2, pointF);
            drawableArr[3] = m46012c(bVar.f57487l, bVar.f57488m);
            drawableArr[4] = m46012c(bVar.f57483h, bVar.f57484i);
            drawableArr[5] = m46012c(bVar.f57485j, bVar.f57486k);
            if (i5 > 0) {
                if (bVar.f57493r != null) {
                    for (Drawable drawable : bVar.f57493r) {
                        drawableArr[i3 + 6] = m46012c(drawable, (C24229q.AbstractC24231b) null);
                        i3++;
                    }
                    i4 = i3;
                }
                if (bVar.f57494s != null) {
                    drawableArr[i4 + 6] = m46012c(bVar.f57494s, (C24229q.AbstractC24231b) null);
                }
            }
            C24216f fVar = new C24216f(drawableArr);
            this.f57475f = fVar;
            fVar.mo39876b(bVar.f57479d);
            C24249d dVar = new C24249d(C24252f.m46067a(fVar, this.f57470a));
            this.f57471b = dVar;
            dVar.mutate();
            m46014e();
            C24644b.m47156a();
        }

        /* renamed from: a */
        public final void mo39958a(C24229q.AbstractC24231b bVar) {
            C24091i.m45617a(bVar);
            mo39951a(2).mo39935a(bVar);
        }

        /* renamed from: c */
        private Drawable m46012c(Drawable drawable, C24229q.AbstractC24231b bVar) {
            return C24252f.m46066a(C24252f.m46068a(drawable, this.f57470a, this.f57474e), bVar, (PointF) null);
        }

        /* renamed from: d */
        private void m46013d(Drawable drawable, C24229q.AbstractC24231b bVar) {
            mo39953a(4, drawable);
            mo39951a(4).mo39935a(bVar);
        }

        /* renamed from: a */
        public final void mo39954a(int i, C24229q.AbstractC24231b bVar) {
            mo39957a(this.f57474e.getDrawable(i), bVar);
        }

        @Override // com.facebook.drawee.p1857h.AbstractC24257c
        /* renamed from: a */
        public final void mo39952a(float f, boolean z) {
            if (this.f57475f.mo39842a(3) != null) {
                this.f57475f.mo39874a();
                m46011a(f);
                if (z) {
                    this.f57475f.mo39879d();
                }
                this.f57475f.mo39875b();
            }
        }

        /* renamed from: b */
        public final void mo39962b(int i, C24229q.AbstractC24231b bVar) {
            mo39964b(this.f57474e.getDrawable(i), bVar);
        }

        /* renamed from: b */
        public final void mo39964b(Drawable drawable, C24229q.AbstractC24231b bVar) {
            mo39953a(5, drawable);
            mo39951a(5).mo39935a(bVar);
        }

        /* renamed from: c */
        public final void mo39967c(int i, C24229q.AbstractC24231b bVar) {
            m46013d(this.f57474e.getDrawable(i), bVar);
        }

        /* renamed from: a */
        public final void mo39953a(int i, Drawable drawable) {
            if (drawable == null) {
                this.f57475f.mo39843a(i, null);
                return;
            }
            m46018h(i).setDrawable(C24252f.m46068a(drawable, this.f57470a, this.f57474e));
        }

        /* renamed from: a */
        public final void mo39957a(Drawable drawable, C24229q.AbstractC24231b bVar) {
            mo39953a(1, drawable);
            mo39951a(1).mo39935a(bVar);
        }

        @Override // com.facebook.drawee.p1857h.AbstractC24257c
        /* renamed from: a */
        public final void mo39956a(Drawable drawable, float f, boolean z) {
            Drawable a = C24252f.m46068a(drawable, this.f57470a, this.f57474e);
            a.mutate();
            this.f57472c.setDrawable(a);
            this.f57475f.mo39874a();
            m46015f();
            m46016f(2);
            m46011a(f);
            if (z) {
                this.f57475f.mo39879d();
            }
            this.f57475f.mo39875b();
        }
    }

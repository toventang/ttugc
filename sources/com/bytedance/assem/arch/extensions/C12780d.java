package com.bytedance.assem.arch.extensions;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.p795b.AbstractC12656g;
import com.bytedance.covode.number.Covode;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.assem.arch.extensions.d */
public final class C12780d {
    static {
        Covode.recordClassIndex(14608);
    }

    /* renamed from: com.bytedance.assem.arch.extensions.d$a */
    public static final class C12781a extends AbstractC0952i.AbstractC0954b {

        /* renamed from: a */
        final /* synthetic */ AssemSupervisor f31093a;

        /* renamed from: b */
        final /* synthetic */ Fragment f31094b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f31095c;

        /* renamed from: d */
        final /* synthetic */ C12753e f31096d;

        /* renamed from: e */
        final /* synthetic */ Assembler f31097e;

        static {
            Covode.recordClassIndex(14609);
        }

        @Override // androidx.fragment.app.AbstractC0952i.AbstractC0954b
        public final void onFragmentViewDestroyed(AbstractC0952i iVar, Fragment fragment) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(fragment, "");
            super.onFragmentViewDestroyed(iVar, fragment);
            if (fragment == this.f31094b) {
                this.f31093a.mo20571c();
                this.f31097e.mo20585d(fragment);
            }
        }

        C12781a(AssemSupervisor assemSupervisor, Fragment fragment, C89233z.C89238e eVar, C12753e eVar2, Assembler assembler) {
            this.f31093a = assemSupervisor;
            this.f31094b = fragment;
            this.f31095c = eVar;
            this.f31096d = eVar2;
            this.f31097e = assembler;
        }
    }

    /* renamed from: a */
    public static final void m23007a(AbstractC12766p pVar, AbstractC89172b<? super Assembler, C89391z> bVar) {
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(bVar, "");
        ActivityC0945e b = C12777b.m23004b(pVar);
        if (b != null) {
            AbstractC1174ac a = C1181ae.m3881a(b, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
            C89219l.m154709a((Object) a, "");
            Assembler assembler = (Assembler) a;
            C12752d b2 = assembler.mo20583b(pVar);
            if (b2 == null) {
                b2 = new C12752d(assembler.mo20583b(pVar.bD_().f30982d));
                assembler.mo20578a(pVar, b2);
            }
            C12753e c = assembler.mo20584c(pVar);
            if (c == null) {
                c = new C12753e(assembler.mo20584c(pVar.bD_().f30982d));
                assembler.mo20579a(pVar, c);
            }
            if (assembler.mo20573a(pVar) == null) {
                AssemSupervisor a2 = AssemSupervisor.C12742a.m22921a(pVar, b, b2, c);
                View t = pVar.mo20528t();
                if (t != null) {
                    a2.mo20568a(t);
                    assembler.mo20577a(pVar, a2);
                    pVar.f31000d.mo4012a(new AssembleExtKt$assemble$3(pVar, assembler));
                } else {
                    throw new IllegalArgumentException("The UIAssem's root view is null, check if it has no layout or the assemble called before UIAssem#onViewCreated}.".toString());
                }
            }
            bVar.invoke(assembler);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008a, code lost:
        if (r11.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r3, null)) == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r4 = r5.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        if (r4 == java.lang.Object.class) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        r9 = r4.getInterfaces();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r9, "");
        r8 = new java.util.ArrayList();
        r7 = r9.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a2, code lost:
        if (r3 >= r7) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        r1 = r9[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        if (com.bytedance.assem.arch.service.AbstractC12800c.class.isAssignableFrom(r1) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        r8.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r1 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        if (r1.hasNext() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c0, code lost:
        r0 = (java.lang.Class) r1.next();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r11.mo20612a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        r4 = r4.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dd, code lost:
        if (r4 != null) goto L_0x0090;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m23005a(androidx.fragment.app.Fragment r13, p4600h.p4611f.p4612a.AbstractC89172b<? super com.bytedance.assem.arch.core.Assembler, p4600h.C89391z> r14) {
        /*
        // Method dump skipped, instructions count: 308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.assem.arch.extensions.C12780d.m23005a(androidx.fragment.app.Fragment, h.f.a.b):void");
    }

    /* renamed from: a */
    public static final void m23006a(AbstractC12656g gVar, AbstractC89172b<? super Assembler, C89391z> bVar) {
        C12752d dVar;
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(bVar, "");
        ActivityC0945e aL_ = gVar.aL_();
        if (aL_ != null) {
            C12753e eVar = null;
            AbstractC1174ac a = C1181ae.m3881a(aL_, (C1175ad.AbstractC1177b) null).mo3983a(Assembler.class);
            C89219l.m154709a((Object) a, "");
            Assembler assembler = (Assembler) a;
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = (T) assembler.mo20583b(gVar);
            if (eVar2.element == null) {
                AbstractC1204m aN_ = gVar.aN_();
                if (aN_ instanceof AbstractC12748a) {
                    AbstractC1204m aN_2 = gVar.aN_();
                    if (aN_2 != null) {
                        dVar = ((AbstractC12748a) aN_2).bD_().f30984f;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    if (aN_ instanceof Fragment) {
                        AbstractC1204m aN_3 = gVar.aN_();
                        if (aN_3 != null) {
                            AssemSupervisor a2 = C12777b.m23000a((Fragment) aN_3);
                            if (a2 != null) {
                                dVar = a2.f30984f;
                            }
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else if (aN_ instanceof ActivityC0945e) {
                        AbstractC1204m aN_4 = gVar.aN_();
                        if (aN_4 != null) {
                            AssemSupervisor a3 = C12777b.m23001a((ActivityC0945e) aN_4);
                            if (a3 != null) {
                                dVar = a3.f30984f;
                            }
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else if (aN_ instanceof AbstractC12656g) {
                        AbstractC1204m aN_5 = gVar.aN_();
                        if (aN_5 != null) {
                            AssemSupervisor a4 = C12777b.m23002a((AbstractC12656g) aN_5);
                            if (a4 != null) {
                                dVar = a4.f30984f;
                            }
                        } else {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                    } else {
                        throw new IllegalStateException("Don't support this LifecycleOwner.");
                    }
                    dVar = null;
                }
                eVar2.element = (T) new C12752d(dVar);
                assembler.mo20578a((AbstractC1204m) gVar, (C12752d) eVar2.element);
            }
            C12753e c = assembler.mo20584c(gVar);
            if (c == null) {
                AbstractC1204m aN_6 = gVar.aN_();
                if (aN_6 instanceof AbstractC12748a) {
                    AbstractC1204m aN_7 = gVar.aN_();
                    if (aN_7 != null) {
                        eVar = ((AbstractC12748a) aN_7).bD_().f30985g;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (aN_6 instanceof Fragment) {
                    AbstractC1204m aN_8 = gVar.aN_();
                    if (aN_8 != null) {
                        AssemSupervisor a5 = C12777b.m23000a((Fragment) aN_8);
                        if (a5 != null) {
                            eVar = a5.f30985g;
                        }
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (aN_6 instanceof ActivityC0945e) {
                    AbstractC1204m aN_9 = gVar.aN_();
                    if (aN_9 != null) {
                        AssemSupervisor a6 = C12777b.m23001a((ActivityC0945e) aN_9);
                        if (a6 != null) {
                            eVar = a6.f30985g;
                        }
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else if (aN_6 instanceof AbstractC12656g) {
                    AbstractC1204m aN_10 = gVar.aN_();
                    if (aN_10 != null) {
                        AssemSupervisor a7 = C12777b.m23002a((AbstractC12656g) aN_10);
                        if (a7 != null) {
                            eVar = a7.f30985g;
                        }
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new IllegalStateException("Don't support this LifecycleOwner.");
                }
                c = new C12753e(eVar);
                assembler.mo20579a(gVar, c);
            }
            if (assembler.mo20573a(gVar) == null) {
                AssemSupervisor a8 = AssemSupervisor.C12742a.m22921a(gVar, gVar.aL_(), eVar2.element, c);
                a8.mo20568a(gVar.aM_());
                assembler.mo20577a(gVar, a8);
                gVar.getLifecycle().mo4012a(new AssembleExtKt$assemble$$inlined$let$lambda$1(gVar, eVar2, c, assembler));
            }
            bVar.invoke(assembler);
        }
    }
}

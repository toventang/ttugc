package com.lynx.tasm.navigator;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.p2049b.C28471b;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.navigator.C28834e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.lynx.tasm.navigator.a */
public final class C28825a implements C28834e.AbstractC28835a {

    /* renamed from: a */
    public Stack<C28833d> f68051a = new Stack<>();

    /* renamed from: b */
    WeakReference<LynxView> f68052b;

    /* renamed from: c */
    HashMap<String, Object> f68053c;

    /* renamed from: d */
    public C28834e f68054d;

    /* renamed from: e */
    private WeakReference<AbstractC28831b> f68055e;

    static {
        Covode.recordClassIndex(34933);
    }

    /* renamed from: a */
    public final AbstractC28831b mo49954a() {
        WeakReference<AbstractC28831b> weakReference = this.f68055e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final LynxView mo49958b() {
        WeakReference<LynxView> weakReference = this.f68052b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.lynx.tasm.navigator.C28834e.AbstractC28835a
    /* renamed from: c */
    public final void mo49959c(LynxView lynxView) {
        AbstractC28831b a = mo49954a();
        if (a != null) {
            a.mo26060b(lynxView);
        }
        lynxView.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo49955a(String str) {
        HashMap<String, Object> hashMap = this.f68053c;
        if (hashMap != null) {
            Object obj = hashMap.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return str;
    }

    /* renamed from: b */
    public static void m57710b(LynxView lynxView) {
        if (lynxView != null) {
            for (LynxUI lynxUI : C28471b.C28474a.f66975a.f66965d.keySet()) {
                if (lynxUI.mContext.f67068i.f67258a == lynxView) {
                    lynxUI.execPauseAnim();
                }
            }
            lynxView.onEnterBackground();
        }
    }

    /* renamed from: a */
    public final void mo49956a(final LynxView lynxView) {
        if (lynxView != null) {
            C28471b bVar = C28471b.C28474a.f66975a;
            C288294 r4 = new C28471b.AbstractC28476c() {
                /* class com.lynx.tasm.navigator.C28825a.C288294 */

                static {
                    Covode.recordClassIndex(34937);
                }

                @Override // com.lynx.tasm.behavior.p2049b.C28471b.AbstractC28476c
                /* renamed from: a */
                public final void mo48987a() {
                    AbstractC28831b a = C28825a.this.mo49954a();
                    if (a != null) {
                        a.mo26060b(lynxView);
                    }
                    lynxView.destroy();
                }
            };
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (LynxUI lynxUI : bVar.f66962a.keySet()) {
                if (lynxUI.mContext.f67068i.f67258a == lynxView) {
                    atomicInteger.incrementAndGet();
                    lynxUI.execExitAnim(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0036: INVOKE  
                          (r1v5 'lynxUI' com.lynx.tasm.behavior.ui.LynxUI)
                          (wrap: com.lynx.tasm.behavior.b.b$2 : 0x0033: CONSTRUCTOR  (r0v17 com.lynx.tasm.behavior.b.b$2) = 
                          (r5v0 'bVar' com.lynx.tasm.behavior.b.b)
                          (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger)
                          (r4v0 'r4' com.lynx.tasm.navigator.a$4)
                         call: com.lynx.tasm.behavior.b.b.2.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.lynx.tasm.behavior.ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void in method: com.lynx.tasm.navigator.a.a(com.lynx.tasm.LynxView):void, file: classes9.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: CONSTRUCTOR  (r0v17 com.lynx.tasm.behavior.b.b$2) = 
                          (r5v0 'bVar' com.lynx.tasm.behavior.b.b)
                          (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger)
                          (r4v0 'r4' com.lynx.tasm.navigator.a$4)
                         call: com.lynx.tasm.behavior.b.b.2.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR in method: com.lynx.tasm.navigator.a.a(com.lynx.tasm.LynxView):void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 31 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 37 more
                        */
                    /*
                    // Method dump skipped, instructions count: 139
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.navigator.C28825a.mo49956a(com.lynx.tasm.LynxView):void");
                }

                C28825a(AbstractC28831b bVar, int i) {
                    this.f68055e = new WeakReference<>(bVar);
                    this.f68054d = new C28834e(i, this);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final void mo49957a(final C28833d dVar, final AbstractC28837g gVar) {
                    AbstractC28831b a = mo49954a();
                    if (a != null) {
                        a.mo26057a(dVar, new AbstractC28837g() {
                            /* class com.lynx.tasm.navigator.C28825a.C288283 */

                            static {
                                Covode.recordClassIndex(34936);
                            }

                            @Override // com.lynx.tasm.navigator.AbstractC28837g
                            /* renamed from: a */
                            public final void mo49960a(LynxView lynxView) {
                                if (lynxView != null) {
                                    C28825a.this.f68054d.put(dVar, lynxView);
                                    gVar.mo49960a(lynxView);
                                }
                            }
                        });
                    }
                }
            }

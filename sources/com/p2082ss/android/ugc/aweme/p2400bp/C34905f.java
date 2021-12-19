package com.p2082ss.android.ugc.aweme.p2400bp;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C47000gy;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4586g.AbstractC88922b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.bp.f */
public final /* synthetic */ class C34905f implements AbstractC88433f {

    /* renamed from: a */
    private final C34902e f82359a;

    /* renamed from: b */
    private final C47000gy f82360b;

    static {
        Covode.recordClassIndex(41916);
    }

    C34905f(C34902e eVar, C47000gy gyVar) {
        this.f82359a = eVar;
        this.f82360b = gyVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C34902e eVar = this.f82359a;
        C47000gy gyVar = this.f82360b;
        Activity activity = (Activity) obj;
        if ((activity.getComponentName().getClassName().contains(gyVar.f109513b) || activity.getComponentName().getClassName().contains(gyVar.f109514c) || activity.getComponentName().getClassName().contains(gyVar.f109515d)) && !C34902e.f82353c) {
            activity.getComponentName().getClassName();
            if (gyVar.f109517f > 0) {
                long j = gyVar.f109517f;
                if (eVar.f82355b != null) {
                    eVar.f82355b.dispose();
                    eVar.f82355b = null;
                }
                eVar.f82355b = (AbstractC88922b) AbstractC88979t.m154307b(j, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143288c(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0072: IPUT  
                      (wrap: f.a.g.b<java.lang.Long> : 0x0070: CHECK_CAST (r0v14 f.a.g.b<java.lang.Long>) = (f.a.g.b) (wrap: f.a.z : 0x006c: INVOKE  (r0v13 f.a.z) = 
                      (wrap: f.a.t<java.lang.Long> : 0x0063: INVOKE  (r1v4 f.a.t<java.lang.Long>) = 
                      (wrap: f.a.t<java.lang.Long> : 0x0059: INVOKE  (r1v3 f.a.t<java.lang.Long>) = 
                      (r1v2 'j' long)
                      (wrap: java.util.concurrent.TimeUnit : 0x0057: SGET  (r0v9 java.util.concurrent.TimeUnit) =  java.util.concurrent.TimeUnit.MILLISECONDS java.util.concurrent.TimeUnit)
                     type: STATIC call: f.a.t.b(long, java.util.concurrent.TimeUnit):f.a.t)
                      (wrap: f.a.aa : 0x005f: INVOKE  (r0v11 f.a.aa) = (wrap: f.a.aa : 0x005d: SGET  (r0v10 f.a.aa) =  f.a.a.b.a.a f.a.aa) type: STATIC call: f.a.a.a.a.a(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.a(f.a.aa):f.a.t)
                      (wrap: com.ss.android.ugc.aweme.bp.e$1 : 0x0069: CONSTRUCTOR  (r0v12 com.ss.android.ugc.aweme.bp.e$1) = (r3v0 'eVar' com.ss.android.ugc.aweme.bp.e) call: com.ss.android.ugc.aweme.bp.e.1.<init>(com.ss.android.ugc.aweme.bp.e):void type: CONSTRUCTOR)
                     type: VIRTUAL call: f.a.t.c(f.a.z):f.a.z))
                      (r3v0 'eVar' com.ss.android.ugc.aweme.bp.e)
                     com.ss.android.ugc.aweme.bp.e.b f.a.g.b in method: com.ss.android.ugc.aweme.bp.f.accept(java.lang.Object):void, file: classes7.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0070: CHECK_CAST (r0v14 f.a.g.b<java.lang.Long>) = (f.a.g.b) (wrap: f.a.z : 0x006c: INVOKE  (r0v13 f.a.z) = 
                      (wrap: f.a.t<java.lang.Long> : 0x0063: INVOKE  (r1v4 f.a.t<java.lang.Long>) = 
                      (wrap: f.a.t<java.lang.Long> : 0x0059: INVOKE  (r1v3 f.a.t<java.lang.Long>) = 
                      (r1v2 'j' long)
                      (wrap: java.util.concurrent.TimeUnit : 0x0057: SGET  (r0v9 java.util.concurrent.TimeUnit) =  java.util.concurrent.TimeUnit.MILLISECONDS java.util.concurrent.TimeUnit)
                     type: STATIC call: f.a.t.b(long, java.util.concurrent.TimeUnit):f.a.t)
                      (wrap: f.a.aa : 0x005f: INVOKE  (r0v11 f.a.aa) = (wrap: f.a.aa : 0x005d: SGET  (r0v10 f.a.aa) =  f.a.a.b.a.a f.a.aa) type: STATIC call: f.a.a.a.a.a(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.a(f.a.aa):f.a.t)
                      (wrap: com.ss.android.ugc.aweme.bp.e$1 : 0x0069: CONSTRUCTOR  (r0v12 com.ss.android.ugc.aweme.bp.e$1) = (r3v0 'eVar' com.ss.android.ugc.aweme.bp.e) call: com.ss.android.ugc.aweme.bp.e.1.<init>(com.ss.android.ugc.aweme.bp.e):void type: CONSTRUCTOR)
                     type: VIRTUAL call: f.a.t.c(f.a.z):f.a.z) in method: com.ss.android.ugc.aweme.bp.f.accept(java.lang.Object):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: INVOKE  (r0v13 f.a.z) = 
                      (wrap: f.a.t<java.lang.Long> : 0x0063: INVOKE  (r1v4 f.a.t<java.lang.Long>) = 
                      (wrap: f.a.t<java.lang.Long> : 0x0059: INVOKE  (r1v3 f.a.t<java.lang.Long>) = 
                      (r1v2 'j' long)
                      (wrap: java.util.concurrent.TimeUnit : 0x0057: SGET  (r0v9 java.util.concurrent.TimeUnit) =  java.util.concurrent.TimeUnit.MILLISECONDS java.util.concurrent.TimeUnit)
                     type: STATIC call: f.a.t.b(long, java.util.concurrent.TimeUnit):f.a.t)
                      (wrap: f.a.aa : 0x005f: INVOKE  (r0v11 f.a.aa) = (wrap: f.a.aa : 0x005d: SGET  (r0v10 f.a.aa) =  f.a.a.b.a.a f.a.aa) type: STATIC call: f.a.a.a.a.a(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.a(f.a.aa):f.a.t)
                      (wrap: com.ss.android.ugc.aweme.bp.e$1 : 0x0069: CONSTRUCTOR  (r0v12 com.ss.android.ugc.aweme.bp.e$1) = (r3v0 'eVar' com.ss.android.ugc.aweme.bp.e) call: com.ss.android.ugc.aweme.bp.e.1.<init>(com.ss.android.ugc.aweme.bp.e):void type: CONSTRUCTOR)
                     type: VIRTUAL call: f.a.t.c(f.a.z):f.a.z in method: com.ss.android.ugc.aweme.bp.f.accept(java.lang.Object):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: CONSTRUCTOR  (r0v12 com.ss.android.ugc.aweme.bp.e$1) = (r3v0 'eVar' com.ss.android.ugc.aweme.bp.e) call: com.ss.android.ugc.aweme.bp.e.1.<init>(com.ss.android.ugc.aweme.bp.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.bp.f.accept(java.lang.Object):void, file: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.bp.e, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 40 more
                    */
                /*
                // Method dump skipped, instructions count: 133
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2400bp.C34905f.accept(java.lang.Object):void");
            }
        }

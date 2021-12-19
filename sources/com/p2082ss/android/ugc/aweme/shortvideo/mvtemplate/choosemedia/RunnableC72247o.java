package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o */
public final /* synthetic */ class RunnableC72247o implements Runnable {

    /* renamed from: a */
    private final C72235n f161977a;

    static {
        Covode.recordClassIndex(84912);
    }

    RunnableC72247o(C72235n nVar) {
        this.f161977a = nVar;
    }

    public final void run() {
        C72235n nVar = this.f161977a;
        nVar.f161953k = true;
        nVar.f161948f = nVar.f161947e.animate().translationX(C13628n.m24520b(C63238c.f143574a, nVar.f161957o)).alpha(0.0f).setDuration(300).setStartDelay((long) (nVar.f161960r ? 150 : 0)).setListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0036: IPUT  
              (wrap: android.view.ViewPropertyAnimator : 0x0032: INVOKE  (r0v9 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x0029: INVOKE  (r1v1 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x0024: INVOKE  (r2v2 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x001e: INVOKE  (r2v1 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x0019: INVOKE  (r0v5 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x000d: INVOKE  (r2v0 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.View : 0x000b: IGET  (r0v2 android.view.View) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.e android.view.View)
             type: VIRTUAL call: android.view.View.animate():android.view.ViewPropertyAnimator)
              (wrap: float : 0x0015: INVOKE  (r0v4 float) = 
              (wrap: android.app.Application : 0x0011: SGET  (r1v0 android.app.Application) =  com.ss.android.ugc.aweme.port.in.c.a android.app.Application)
              (wrap: float : 0x0013: IGET  (r0v3 float) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.o float)
             type: STATIC call: com.bytedance.common.utility.n.b(android.content.Context, float):float)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.translationX(float):android.view.ViewPropertyAnimator)
              (0.0f float)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.alpha(float):android.view.ViewPropertyAnimator)
              (300 long)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.setDuration(long):android.view.ViewPropertyAnimator)
              (wrap: long : 0x0028: CAST (r0v7 long) = (long) (wrap: int : ?: TERNARY(r5v1 int) = ((wrap: boolean : 0x0005: IGET  (r0v1 boolean) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.r boolean) != false) ? (150 int) : (0 int)))
             type: VIRTUAL call: android.view.ViewPropertyAnimator.setStartDelay(long):android.view.ViewPropertyAnimator)
              (wrap: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$5 : 0x002f: CONSTRUCTOR  (r0v8 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$5) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) call: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.5.<init>(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener):android.view.ViewPropertyAnimator)
              (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n)
             com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.f android.view.ViewPropertyAnimator in method: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o.run():void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE  (r0v9 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x0029: INVOKE  (r1v1 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x0024: INVOKE  (r2v2 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x001e: INVOKE  (r2v1 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x0019: INVOKE  (r0v5 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.ViewPropertyAnimator : 0x000d: INVOKE  (r2v0 android.view.ViewPropertyAnimator) = 
              (wrap: android.view.View : 0x000b: IGET  (r0v2 android.view.View) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.e android.view.View)
             type: VIRTUAL call: android.view.View.animate():android.view.ViewPropertyAnimator)
              (wrap: float : 0x0015: INVOKE  (r0v4 float) = 
              (wrap: android.app.Application : 0x0011: SGET  (r1v0 android.app.Application) =  com.ss.android.ugc.aweme.port.in.c.a android.app.Application)
              (wrap: float : 0x0013: IGET  (r0v3 float) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.o float)
             type: STATIC call: com.bytedance.common.utility.n.b(android.content.Context, float):float)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.translationX(float):android.view.ViewPropertyAnimator)
              (0.0f float)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.alpha(float):android.view.ViewPropertyAnimator)
              (300 long)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.setDuration(long):android.view.ViewPropertyAnimator)
              (wrap: long : 0x0028: CAST (r0v7 long) = (long) (wrap: int : ?: TERNARY(r5v1 int) = ((wrap: boolean : 0x0005: IGET  (r0v1 boolean) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.r boolean) != false) ? (150 int) : (0 int)))
             type: VIRTUAL call: android.view.ViewPropertyAnimator.setStartDelay(long):android.view.ViewPropertyAnimator)
              (wrap: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$5 : 0x002f: CONSTRUCTOR  (r0v8 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$5) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) call: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.5.<init>(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.view.ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener):android.view.ViewPropertyAnimator in method: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o.run():void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR  (r0v8 com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$5) = (r4v0 'nVar' com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n) call: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.5.<init>(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o.run():void, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n r4 = r6.f161977a
            r0 = 1
            r4.f161953k = r0
            boolean r0 = r4.f161960r
            if (r0 == 0) goto L_0x0058
            r5 = 150(0x96, float:2.1E-43)
        L_0x000b:
            android.view.View r0 = r4.f161947e
            android.view.ViewPropertyAnimator r2 = r0.animate()
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.f143574a
            float r0 = r4.f161957o
            float r0 = com.bytedance.common.utility.C13628n.m24520b(r1, r0)
            android.view.ViewPropertyAnimator r0 = r2.translationX(r0)
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r0.alpha(r3)
            r0 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            long r0 = (long) r5
            android.view.ViewPropertyAnimator r1 = r2.setStartDelay(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$5 r0 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$5
            r0.<init>()
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r4.f161948f = r0
            boolean r0 = r4.f161960r
            if (r0 == 0) goto L_0x0057
            android.widget.TextView r0 = r4.f161946d
            android.view.ViewPropertyAnimator r2 = r0.animate()
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.f143574a
            float r0 = r4.f161956n
            float r0 = com.bytedance.common.utility.C13628n.m24520b(r1, r0)
            android.view.ViewPropertyAnimator r0 = r2.translationX(r0)
            android.view.ViewPropertyAnimator r2 = r0.alpha(r3)
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
        L_0x0057:
            return
        L_0x0058:
            r5 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.RunnableC72247o.run():void");
    }
}

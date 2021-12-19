package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.ui.c */
public final /* synthetic */ class CallableC34683c implements Callable {

    /* renamed from: a */
    private final AudioControlView.HandlerC34657a f81940a;

    static {
        Covode.recordClassIndex(41670);
    }

    CallableC34683c(AudioControlView.HandlerC34657a aVar) {
        this.f81940a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AudioControlView.HandlerC34657a aVar = this.f81940a;
        AudioControlView audioControlView = aVar.f81854a.get();
        if (audioControlView == null) {
            return null;
        }
        audioControlView.setProgress(((float) aVar.f81856c) / ((float) aVar.f81855b));
        if (audioControlView.f81846f) {
            return null;
        }
        audioControlView.invalidate();
        audioControlView.mo61268d();
        if (audioControlView.f81843c != null) {
            audioControlView.f81843c.mo61284b();
        }
        audioControlView.f81844d = ValueAnimator.ofFloat(1.0f, 0.0f);
        audioControlView.f81844d.setDuration(1400L);
        audioControlView.f81844d.addListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  
              (wrap: android.animation.ValueAnimator : 0x003c: IGET  (r1v2 android.animation.ValueAnimator) = (r3v1 'audioControlView' com.ss.android.ugc.aweme.base.ui.AudioControlView) com.ss.android.ugc.aweme.base.ui.AudioControlView.d android.animation.ValueAnimator)
              (wrap: com.ss.android.ugc.aweme.base.ui.AudioControlView$1 : 0x0040: CONSTRUCTOR  (r0v12 com.ss.android.ugc.aweme.base.ui.AudioControlView$1) = (r3v1 'audioControlView' com.ss.android.ugc.aweme.base.ui.AudioControlView) call: com.ss.android.ugc.aweme.base.ui.AudioControlView.1.<init>(com.ss.android.ugc.aweme.base.ui.AudioControlView):void type: CONSTRUCTOR)
             type: VIRTUAL call: android.animation.ValueAnimator.addListener(android.animation.Animator$AnimatorListener):void in method: com.ss.android.ugc.aweme.base.ui.c.call():java.lang.Object, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r0v12 com.ss.android.ugc.aweme.base.ui.AudioControlView$1) = (r3v1 'audioControlView' com.ss.android.ugc.aweme.base.ui.AudioControlView) call: com.ss.android.ugc.aweme.base.ui.AudioControlView.1.<init>(com.ss.android.ugc.aweme.base.ui.AudioControlView):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.base.ui.c.call():java.lang.Object, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 22 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.base.ui.AudioControlView, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 28 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.base.ui.AudioControlView$a r2 = r4.f81940a
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.base.ui.AudioControlView> r0 = r2.f81854a
            java.lang.Object r3 = r0.get()
            com.ss.android.ugc.aweme.base.ui.AudioControlView r3 = (com.p2082ss.android.ugc.aweme.base.p2379ui.AudioControlView) r3
            if (r3 == 0) goto L_0x004b
            int r0 = r2.f81856c
            float r1 = (float) r0
            int r0 = r2.f81855b
            float r0 = (float) r0
            float r1 = r1 / r0
            r3.setProgress(r1)
            boolean r0 = r3.f81846f
            if (r0 != 0) goto L_0x004b
            r3.invalidate()
            r3.mo61268d()
            com.ss.android.ugc.aweme.base.ui.AudioControlView$b r0 = r3.f81843c
            if (r0 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.base.ui.AudioControlView$b r0 = r3.f81843c
            r0.mo61284b()
        L_0x0029:
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x004e: FILL_ARRAY_DATA  , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.f81844d = r0
            android.animation.ValueAnimator r2 = r3.f81844d
            r0 = 1400(0x578, double:6.917E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r3.f81844d
            com.ss.android.ugc.aweme.base.ui.AudioControlView$1 r0 = new com.ss.android.ugc.aweme.base.ui.AudioControlView$1
            r0.<init>()
            r1.addListener(r0)
            android.animation.ValueAnimator r0 = r3.f81844d
            r0.start()
        L_0x004b:
            r0 = 0
            return r0
            fill-array 0x004e: FILL_ARRAY_DATA  , data: [1065353216, 0]
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2379ui.CallableC34683c.call():java.lang.Object");
    }
}

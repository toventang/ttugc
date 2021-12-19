package com.bytedance.ies.xelement.picker.p1389f;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.view.WheelView;

/* renamed from: com.bytedance.ies.xelement.picker.f.b */
public final class HandlerC19348b extends Handler {

    /* renamed from: a */
    private final WheelView f45754a;

    static {
        Covode.recordClassIndex(22136);
    }

    public HandlerC19348b(WheelView wheelView) {
        this.f45754a = wheelView;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.f45754a.invalidate();
        } else if (i == 2000) {
            this.f45754a.mo30815a(WheelView.EnumC19352a.FLING);
        } else if (i == 3000) {
            WheelView wheelView = this.f45754a;
            if (wheelView.f45782a != null) {
                wheelView.postDelayed(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: INVOKE  
                      (r3v0 'wheelView' com.bytedance.ies.xelement.picker.view.WheelView)
                      (wrap: com.bytedance.ies.xelement.picker.view.WheelView$1 : 0x0017: CONSTRUCTOR  (r2v0 com.bytedance.ies.xelement.picker.view.WheelView$1) = (r3v0 'wheelView' com.bytedance.ies.xelement.picker.view.WheelView) call: com.bytedance.ies.xelement.picker.view.WheelView.1.<init>(com.bytedance.ies.xelement.picker.view.WheelView):void type: CONSTRUCTOR)
                      (200 long)
                     type: VIRTUAL call: com.bytedance.ies.xelement.picker.view.WheelView.postDelayed(java.lang.Runnable, long):boolean in method: com.bytedance.ies.xelement.picker.f.b.handleMessage(android.os.Message):void, file: classes9.dex
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
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: CONSTRUCTOR  (r2v0 com.bytedance.ies.xelement.picker.view.WheelView$1) = (r3v0 'wheelView' com.bytedance.ies.xelement.picker.view.WheelView) call: com.bytedance.ies.xelement.picker.view.WheelView.1.<init>(com.bytedance.ies.xelement.picker.view.WheelView):void type: CONSTRUCTOR in method: com.bytedance.ies.xelement.picker.f.b.handleMessage(android.os.Message):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.xelement.picker.view.WheelView, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 36 more
                    */
                /*
                    this = this;
                    int r1 = r5.what
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r1 == r0) goto L_0x0028
                    r0 = 2000(0x7d0, float:2.803E-42)
                    if (r1 == r0) goto L_0x0020
                    r0 = 3000(0xbb8, float:4.204E-42)
                    if (r1 == r0) goto L_0x000f
                L_0x000e:
                    return
                L_0x000f:
                    com.bytedance.ies.xelement.picker.view.WheelView r3 = r4.f45754a
                    com.bytedance.ies.xelement.picker.e.f r0 = r3.f45782a
                    if (r0 == 0) goto L_0x000e
                    com.bytedance.ies.xelement.picker.view.WheelView$1 r2 = new com.bytedance.ies.xelement.picker.view.WheelView$1
                    r2.<init>()
                    r0 = 200(0xc8, double:9.9E-322)
                    r3.postDelayed(r2, r0)
                    goto L_0x000e
                L_0x0020:
                    com.bytedance.ies.xelement.picker.view.WheelView r1 = r4.f45754a
                    com.bytedance.ies.xelement.picker.view.WheelView$a r0 = com.bytedance.ies.xelement.picker.view.WheelView.EnumC19352a.FLING
                    r1.mo30815a(r0)
                    return
                L_0x0028:
                    com.bytedance.ies.xelement.picker.view.WheelView r0 = r4.f45754a
                    r0.invalidate()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.picker.p1389f.HandlerC19348b.handleMessage(android.os.Message):void");
            }
        }

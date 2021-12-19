package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC70630dc;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gd */
public final /* synthetic */ class RunnableC73697gd implements Runnable {

    /* renamed from: a */
    private final VideoRecordNewActivity f165536a;

    static {
        Covode.recordClassIndex(86435);
    }

    RunnableC73697gd(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165536a = videoRecordNewActivity;
    }

    public final void run() {
        C70625d dVar;
        C69905c cVar;
        VideoRecordNewActivity videoRecordNewActivity = this.f165536a;
        C69926ch chVar = videoRecordNewActivity.f164826u;
        C84911q.m145921a("addFragment onFragmentActivityCreated PlanC");
        C73657f.m129769a(videoRecordNewActivity.f164829x);
        if (chVar instanceof AbstractC70630dc) {
            videoRecordNewActivity.f164818m = (FrameLayout) videoRecordNewActivity.findViewById(R.id.c5m);
            C84911q.m145921a("addFragment onFragmentActivityCreated initFilterModule");
            videoRecordNewActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: INVOKE  
                  (wrap: android.view.ViewTreeObserver : 0x002a: INVOKE  (r1v1 android.view.ViewTreeObserver) = 
                  (wrap: android.view.View : 0x0026: INVOKE  (r0v8 android.view.View) = 
                  (wrap: android.view.Window : 0x0022: INVOKE  (r0v7 android.view.Window) = (r2v0 'videoRecordNewActivity' com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity) type: VIRTUAL call: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.getWindow():android.view.Window)
                 type: VIRTUAL call: android.view.Window.getDecorView():android.view.View)
                 type: VIRTUAL call: android.view.View.getViewTreeObserver():android.view.ViewTreeObserver)
                  (wrap: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$2 : 0x0030: CONSTRUCTOR  (r0v9 com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$2) = (r2v0 'videoRecordNewActivity' com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity) call: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.2.<init>(com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener):void in method: com.ss.android.ugc.aweme.shortvideo.ui.gd.run():void, file: classes10.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: CONSTRUCTOR  (r0v9 com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity$2) = (r2v0 'videoRecordNewActivity' com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity) call: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity.2.<init>(com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.ui.gd.run():void, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 487
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.RunnableC73697gd.run():void");
        }
    }

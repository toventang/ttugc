package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.h */
public final /* synthetic */ class View$OnClickListenerC46223h implements View.OnClickListener {

    /* renamed from: a */
    private final C46220g f107676a;

    /* renamed from: b */
    private final C46219f f107677b;

    static {
        Covode.recordClassIndex(54785);
    }

    View$OnClickListenerC46223h(C46220g gVar, C46219f fVar) {
        this.f107676a = gVar;
        this.f107677b = fVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C46220g gVar = this.f107676a;
        C46219f fVar = this.f107677b;
        if (fVar.getFontData() != null) {
            gVar.f107669b = fVar.getFontData().f107121e;
        }
        if (fVar.f107660a != null) {
            if (fVar.f107660a.mo77602b()) {
                gVar.mo78482a(fVar.getFontData());
            } else if (fVar.f107660a.f107124h == 3) {
                fVar.mo78474b();
            } else if (!C72829c.m128602a(fVar.getContext())) {
                C45866d.m88492e().mo77255a(fVar.getContext(), R.string.b1d);
            } else {
                C45989b a = C45989b.m88764a();
                Context context = fVar.getContext();
                C45995c cVar = fVar.f107660a;
                if (context != null) {
                    C45890g.m88536b().mo78915b(cVar.f107125i, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE  
                          (wrap: com.ss.android.ugc.tools.b.a.d : 0x005c: INVOKE  (r2v1 com.ss.android.ugc.tools.b.a.d) =  type: STATIC call: com.ss.android.ugc.aweme.editSticker.g.b():com.ss.android.ugc.tools.b.a.d)
                          (wrap: com.ss.android.ugc.effectmanager.effect.model.Effect : 0x0060: IGET  (r1v2 com.ss.android.ugc.effectmanager.effect.model.Effect) = (r0v9 'cVar' com.ss.android.ugc.aweme.editSticker.text.a.c) com.ss.android.ugc.aweme.editSticker.text.a.c.i com.ss.android.ugc.effectmanager.effect.model.Effect)
                          (wrap: com.ss.android.ugc.aweme.editSticker.text.a.b$4 : 0x0064: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.editSticker.text.a.b$4) = 
                          (r3v0 'a' com.ss.android.ugc.aweme.editSticker.text.a.b)
                          (r5v0 'fVar' com.ss.android.ugc.aweme.editSticker.text.view.f)
                         call: com.ss.android.ugc.aweme.editSticker.text.a.b.4.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.a):void type: CONSTRUCTOR)
                         type: INTERFACE call: com.ss.android.ugc.tools.b.a.d.b(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener):void in method: com.ss.android.ugc.aweme.editSticker.text.view.h.onClick(android.view.View):void, file: classes8.dex
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0064: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.editSticker.text.a.b$4) = 
                          (r3v0 'a' com.ss.android.ugc.aweme.editSticker.text.a.b)
                          (r5v0 'fVar' com.ss.android.ugc.aweme.editSticker.text.view.f)
                         call: com.ss.android.ugc.aweme.editSticker.text.a.b.4.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.editSticker.text.view.h.onClick(android.view.View):void, file: classes8.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 33 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.editSticker.text.a.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                    // Method dump skipped, instructions count: 114
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.view.View$OnClickListenerC46223h.onClick(android.view.View):void");
                }
            }

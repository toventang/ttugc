package com.bytedance.android.livesdk.feed.p533i;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;
import com.C1764a;
import com.bytedance.android.live.base.model.live.C2980c;
import com.bytedance.android.live.base.model.p179a.C2960a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.livesdk.feed.banner.C8498a;
import com.bytedance.android.livesdk.feed.feed.C8588g;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.i.ac */
public final class C8600ac extends AbstractC10937b<FeedItem> {

    /* renamed from: a */
    ViewFlipper f21263a;

    /* renamed from: b */
    private boolean f21264b = false;

    static {
        Covode.recordClassIndex(9457);
    }

    public C8600ac(View view) {
        super(view);
        this.f21263a = (ViewFlipper) view.findViewById(R.id.beo);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final /* synthetic */ void mo9329a(FeedItem feedItem, int i) {
        int i2;
        C8498a aVar;
        int size;
        MethodCollector.m26663i(1160);
        C2960a aVar2 = ((C8588g) feedItem.item).f21227a;
        if (aVar2 == null || C13617h.m24465a(aVar2.f8710b)) {
            this.f21263a.stopFlipping();
            this.f21263a.setVisibility(8);
            MethodCollector.m26664o(1160);
            return;
        }
        int i3 = 0;
        while (i3 < aVar2.f8710b.size()) {
            if (i3 >= this.f21263a.getChildCount()) {
                View a = C1764a.m5927a(LayoutInflater.from(this.itemView.getContext()), R.layout.b7z, this.f21263a, false);
                this.f21263a.addView(a);
                aVar = new C8498a(a, this.f21264b);
                a.setTag(R.id.epx, aVar);
            } else {
                aVar = (C8498a) this.f21263a.getChildAt(i3).getTag(R.id.epx);
            }
            C2980c cVar = aVar2.f8710b.get(i3);
            if (aVar.f21016e) {
                C3951p.m9630b(aVar.f21013b, cVar.f8750e);
            }
            C3951p.m9630b(aVar.f21012a, cVar.f8746a);
            aVar.f21014c.setText(cVar.f8747b);
            aVar.f21017f.setOnClickListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0086: INVOKE  
                  (wrap: android.view.View : 0x007f: IGET  (r2v6 android.view.View) = (r0v26 'aVar' com.bytedance.android.livesdk.feed.banner.a) com.bytedance.android.livesdk.feed.banner.a.f android.view.View)
                  (wrap: com.bytedance.android.livesdk.feed.banner.a$1 : 0x0083: CONSTRUCTOR  (r1v7 com.bytedance.android.livesdk.feed.banner.a$1) = (r0v26 'aVar' com.bytedance.android.livesdk.feed.banner.a), (r8v1 'cVar' com.bytedance.android.live.base.model.live.c) call: com.bytedance.android.livesdk.feed.banner.a.1.<init>(com.bytedance.android.livesdk.feed.banner.a, com.bytedance.android.live.base.model.live.c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void in method: com.bytedance.android.livesdk.feed.i.ac.a(com.bytedance.android.livesdk.model.FeedItem, int):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:239)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0083: CONSTRUCTOR  (r1v7 com.bytedance.android.livesdk.feed.banner.a$1) = (r0v26 'aVar' com.bytedance.android.livesdk.feed.banner.a), (r8v1 'cVar' com.bytedance.android.live.base.model.live.c) call: com.bytedance.android.livesdk.feed.banner.a.1.<init>(com.bytedance.android.livesdk.feed.banner.a, com.bytedance.android.live.base.model.live.c):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.i.ac.a(com.bytedance.android.livesdk.model.FeedItem, int):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.feed.banner.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 300
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.p533i.C8600ac.mo9329a(java.lang.Object, int):void");
        }
    }

package com.bytedance.android.live.liveinteract.multiguest.p333g.p336c;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3933f;
import com.bytedance.android.live.liveinteract.api.C4438i;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.C4418g;
import com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.c.g */
public final /* synthetic */ class RunnableC5270g implements Runnable {

    /* renamed from: a */
    private final C5259b f13629a;

    static {
        Covode.recordClassIndex(5862);
    }

    RunnableC5270g(C5259b bVar) {
        this.f13629a = bVar;
    }

    public final void run() {
        int i;
        C5259b bVar = this.f13629a;
        int size = bVar.f13592d.size();
        int i2 = 0;
        float f = 2.14748365E9f;
        for (int i3 = 0; i3 < size; i3++) {
            C5235a aVar = bVar.f13592d.get(i3);
            if (aVar != null && aVar.getY() < f) {
                f = aVar.getY();
            }
        }
        if (2.14748365E9f == f || f < 10.0f) {
            i = bVar.f13595g;
        } else {
            i = (int) (((bVar.f13590b.getY() + ((float) bVar.f13590b.getHeight())) - f) + ((float) bVar.f13594f));
        }
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC11229b.LINK_MIC)) {
            LiveAppBundleUtils.ensurePluginAvailable(bVar.f13589a, EnumC11229b.LINK_MIC);
            bVar.f13591c.setVisibility(4);
            C5736v.m12593b();
            if (bVar.f13601m != null) {
                if (size > 0) {
                    i2 = bVar.f13594f;
                }
                bVar.f13601m.mo28315b(C4438i.class, new C4418g(size, i + i2));
                return;
            }
            return;
        }
        int f2 = bVar.f13593e.mo10909f();
        if (bVar.f13598j) {
            String quantityString = bVar.f13591c.getContext().getResources().getQuantityString(R.plurals.fl, f2, Integer.valueOf(f2));
            C3933f.m9582a(R.string.e3b, Integer.valueOf(f2));
            bVar.f13591c.setText(quantityString);
            bVar.mo11097h();
            bVar.f13591c.setVisibility(0);
        } else {
            int intValue = C4386c.m10499a().f17248n.intValue();
            if (intValue == 0) {
                bVar.f13591c.setText(R.string.dv0);
                bVar.mo11098i();
                bVar.f13591c.setVisibility(0);
            } else if (intValue != 2) {
                bVar.f13591c.setText(bVar.f13591c.getContext().getResources().getQuantityString(R.plurals.fl, f2, Integer.valueOf(f2)));
                bVar.mo11097h();
                bVar.f13591c.setVisibility(0);
            } else {
                bVar.f13591c.setText(R.string.dv0);
                bVar.mo11098i();
                bVar.f13591c.setVisibility(8);
            }
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bVar.f13591c.getLayoutParams();
        layoutParams.bottomMargin = i;
        bVar.f13591c.setLayoutParams(layoutParams);
        if (bVar.f13601m != null) {
            bVar.f13591c.post(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d1: INVOKE  
                  (wrap: android.widget.TextView : 0x00ca: IGET  (r1v6 android.widget.TextView) = (r5v0 'bVar' com.bytedance.android.live.liveinteract.multiguest.g.c.b) com.bytedance.android.live.liveinteract.multiguest.g.c.b.c android.widget.TextView)
                  (wrap: com.bytedance.android.live.liveinteract.multiguest.g.c.b$5 : 0x00ce: CONSTRUCTOR  (r0v22 com.bytedance.android.live.liveinteract.multiguest.g.c.b$5) = (r5v0 'bVar' com.bytedance.android.live.liveinteract.multiguest.g.c.b), (r4v0 'size' int), (r3v2 'i' int) call: com.bytedance.android.live.liveinteract.multiguest.g.c.b.5.<init>(com.bytedance.android.live.liveinteract.multiguest.g.c.b, int, int):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.widget.TextView.post(java.lang.Runnable):boolean in method: com.bytedance.android.live.liveinteract.multiguest.g.c.g.run():void, file: classes6.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ce: CONSTRUCTOR  (r0v22 com.bytedance.android.live.liveinteract.multiguest.g.c.b$5) = (r5v0 'bVar' com.bytedance.android.live.liveinteract.multiguest.g.c.b), (r4v0 'size' int), (r3v2 'i' int) call: com.bytedance.android.live.liveinteract.multiguest.g.c.b.5.<init>(com.bytedance.android.live.liveinteract.multiguest.g.c.b, int, int):void type: CONSTRUCTOR in method: com.bytedance.android.live.liveinteract.multiguest.g.c.g.run():void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 25 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.live.liveinteract.multiguest.g.c.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 31 more
                */
            /*
            // Method dump skipped, instructions count: 299
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.p333g.p336c.RunnableC5270g.run():void");
        }
    }

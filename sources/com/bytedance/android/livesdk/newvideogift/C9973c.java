package com.bytedance.android.livesdk.newvideogift;

import android.content.res.Resources;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.message.C9888r;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.newvideogift.c */
final /* synthetic */ class C9973c implements AbstractC89172b {

    /* renamed from: a */
    private final LiveNewVideoGiftWidget f24179a;

    static {
        Covode.recordClassIndex(11525);
    }

    C9973c(LiveNewVideoGiftWidget liveNewVideoGiftWidget) {
        this.f24179a = liveNewVideoGiftWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        String str;
        String a;
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.f24179a;
        C9895y yVar = (C9895y) obj;
        User owner = liveNewVideoGiftWidget.f24081c.getOwner();
        long j = 0;
        if (yVar.f23930a || !(yVar.getMessageId() == 0 || yVar.f23932g == null)) {
            C9904t tVar = yVar.f23945t;
            if (yVar.f23930a || tVar != null) {
                String c = C9462a.m17766c(yVar.f23930a ? yVar.f23934i : tVar.f24009n);
                if (yVar.f23930a) {
                    tVar = new C9904t();
                    tVar.f24009n = yVar.f23934i;
                    str = "";
                } else if (yVar.f23933h == null || yVar.f23933h.getId() <= 0 || (owner != null && yVar.f23933h.getId() == owner.getId())) {
                    str = tVar.f23998c;
                } else {
                    Resources a2 = C3966y.m9655a();
                    Object[] objArr = new Object[1];
                    if (C6581g.m14075a(yVar.f23933h) == null) {
                        a = "";
                    } else {
                        a = C6581g.m14075a(yVar.f23933h);
                    }
                    objArr[0] = a;
                    str = a2.getString(R.string.glb, objArr);
                }
                C9888r rVar = new C9888r();
                rVar.f23899a = yVar.getMessageId();
                rVar.f23900b = tVar.f24009n;
                rVar.f23901c = tVar.f24001f;
                rVar.f23902d = c;
                rVar.f23903e = yVar.f23943r;
                rVar.f23904f = yVar.f23933h;
                rVar.f23905g = yVar.f23932g;
                rVar.f23906h = str;
                rVar.f23907i = yVar.f23942q;
                rVar.f23908j = tVar.f23999d;
                rVar.f23912n = yVar.f23944s;
                rVar.f23909k = yVar.f23935j;
                Long valueOf = Long.valueOf(rVar.f23900b);
                if (valueOf != null) {
                    j = valueOf.longValue();
                }
                boolean b = C9462a.m17765b(j);
                C10731d dVar = C10731d.C10732a.C10733a.f25859a;
                dVar.f25853c = rVar.f23900b;
                dVar.f25852b = rVar.f23912n;
                dVar.f25854d = C11200a.m19851a();
                dVar.f25851a = b;
                LiveNewVideoGiftWidget.C99441 r8 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c7: CONSTRUCTOR  (r8v2 'r8' com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget$1) = 
                      (r5v0 'liveNewVideoGiftWidget' com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget)
                      (r2v0 'rVar' com.bytedance.android.livesdk.model.message.r)
                     call: com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget.1.<init>(com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget, com.bytedance.android.livesdk.model.message.r):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.newvideogift.c.invoke(java.lang.Object):java.lang.Object, file: classes6.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 393
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.C9973c.invoke(java.lang.Object):java.lang.Object");
            }
        }

package com.bytedance.android.livesdk.chatroom.p492g;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.C24161f;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.g.h */
public final /* synthetic */ class C7583h implements AbstractC88983w {

    /* renamed from: a */
    private final ImageModel f18809a;

    static {
        Covode.recordClassIndex(8356);
    }

    C7583h(ImageModel imageModel) {
        this.f18809a = imageModel;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        AbstractC24157c a;
        ExecutorService executorService;
        ImageModel imageModel = this.f18809a;
        C24636b[] b = C7577g.m15576b(imageModel);
        if (!(b == null || b.length == 0)) {
            ArrayList arrayList = new ArrayList();
            for (C24636b bVar : b) {
                if (bVar != null) {
                    arrayList.add(C24428k.m46551a().mo40247e().mo40223a(bVar, C24636b.EnumC24638b.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty() && (a = C24161f.m45794a(arrayList).mo34217b()) != null) {
                C7577g.C75781 r1 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r1v1 'r1' com.bytedance.android.livesdk.chatroom.g.g$1) = (r9v0 'vVar' f.a.v), (r6v0 'imageModel' com.bytedance.android.live.base.model.ImageModel) call: com.bytedance.android.livesdk.chatroom.g.g.1.<init>(f.a.v, com.bytedance.android.live.base.model.ImageModel):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.g.h.subscribe(f.a.v):void, file: classes5.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.g.g, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 120
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p492g.C7583h.subscribe(f.a.v):void");
            }
        }

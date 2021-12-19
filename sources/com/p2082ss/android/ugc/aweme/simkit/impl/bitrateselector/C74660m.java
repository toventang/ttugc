package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34849b;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.p2392a.C34848f;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.AbstractC63057c;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.EnumC63056b;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.m */
public final class C74660m implements AbstractC74603b {

    /* renamed from: a */
    private static int f167814a = -1;

    /* renamed from: b */
    private static ConcurrentHashMap<String, Float> f167815b = new ConcurrentHashMap<>(50);

    /* renamed from: c */
    private static ConcurrentLinkedQueue<String> f167816c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private C74655h f167817d = new C74655h();

    /* renamed from: e */
    private C74653f f167818e;

    /* renamed from: f */
    private AbstractC34849b f167819f;

    static {
        Covode.recordClassIndex(87483);
    }

    C74660m(AbstractC34849b bVar) {
        this.f167819f = bVar;
        if (bVar != null) {
            C74653f fVar = new C74653f(bVar);
            this.f167818e = fVar;
            fVar.mo117462a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b
    /* renamed from: a */
    public final EnumC63056b mo117325a(String str, AbstractC63057c cVar) {
        C34848f a;
        if (cVar == null || !this.f167818e.mo117462a()) {
            return null;
        }
        int a2 = (int) AbstractC74616d.m131036a().mo117294f().mo118391a();
        if (AbstractC74616d.m131036a().mo117290b().getCommonConfig().isUseLastNetworkSpeed()) {
            if (((double) a2) <= 0.0d) {
                a2 = f167814a;
                if (a2 <= 0) {
                    a2 = AbstractC74616d.m131036a().mo117290b().getCommonConfig().getLastNetworkSpeed();
                }
                AbstractC74616d.m131036a().mo117294f().mo118392a((double) a2);
            } else {
                f167814a = a2;
            }
        }
        List<Pair<EnumC63056b, Integer>> a3 = cVar.mo101162a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<EnumC63056b, Integer> pair : a3) {
            C84237e eVar = new C84237e();
            eVar.setBitRate(((Integer) pair.second).intValue());
            arrayList.add(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: INVOKE  
                  (r6v0 'arrayList' java.util.ArrayList)
                  (wrap: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$d$2 : 0x0073: CONSTRUCTOR  (r0v34 com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$d$2) = (r1v9 'eVar' com.ss.android.ugc.playerkit.simapicommon.a.e) call: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.d.2.<init>(com.ss.android.ugc.f.a.a.a.a.c):void type: CONSTRUCTOR)
                 type: INTERFACE call: java.util.List.add(java.lang.Object):boolean in method: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.m.a(java.lang.String, com.ss.android.ugc.aweme.player.sdk.b.c):com.ss.android.ugc.aweme.player.sdk.b.b, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0073: CONSTRUCTOR  (r0v34 com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a$d$2) = (r1v9 'eVar' com.ss.android.ugc.playerkit.simapicommon.a.e) call: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a.d.2.<init>(com.ss.android.ugc.f.a.a.a.a.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.m.a(java.lang.String, com.ss.android.ugc.aweme.player.sdk.b.c):com.ss.android.ugc.aweme.player.sdk.b.b, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 276
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74660m.mo117325a(java.lang.String, com.ss.android.ugc.aweme.player.sdk.b.c):com.ss.android.ugc.aweme.player.sdk.b.b");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
            if (r2.size() != 0) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x029e, code lost:
            if (r0 == null) goto L_0x02a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a0, code lost:
            r11 = r0.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a4, code lost:
            r25 = r18;
            r26 = "use_cache1";
         */
        @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74603b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c mo117326a(com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i r31, boolean r32) {
            /*
            // Method dump skipped, instructions count: 1186
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.C74660m.mo117326a(com.ss.android.ugc.playerkit.simapicommon.a.i, boolean):com.ss.android.ugc.f.a.a.a.a.c");
        }
    }

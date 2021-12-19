package com.p2082ss.android.ugc.aweme.feed.p2968t;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.FeedApiService;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.t.h */
final /* synthetic */ class CallableC49942h implements Callable {

    /* renamed from: a */
    private final C49936e f115125a;

    static {
        Covode.recordClassIndex(59053);
    }

    CallableC49942h(C49936e eVar) {
        this.f115125a = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C49936e eVar = this.f115125a;
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C49936e.m93770d();
        }
        if (!C58029j.f132256h) {
            return null;
        }
        if (eVar.f115109b) {
            eVar.f115109b = false;
            return null;
        }
        int i = C49710k.m93129e() ? 4 : 0;
        System.currentTimeMillis();
        System.currentTimeMillis();
        C58945a.C58947b.f134185a.mo96429b("app_start_to_preload_first_request", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_first_request_to_get_did", false);
        if (C46807cw.m90144a()) {
            C58945a.C58947b.f134185a.mo96425a("feed_preload_retrofit_start", false);
            C58945a.C58947b.f134185a.mo96429b("feed_preload_retrofit_start", false);
        }
        FeedItemList fetchFeedList = FeedApiService.m91022a().fetchFeedList(0, 0, 0, 6, null, null, i, 0, "", null, null, 0, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0079: INVOKE  (r3v4 'fetchFeedList' com.ss.android.ugc.aweme.feed.model.FeedItemList) = 
              (wrap: com.ss.android.ugc.aweme.feed.cache.IFeedApi : 0x0058: INVOKE  (r3v3 com.ss.android.ugc.aweme.feed.cache.IFeedApi) =  type: STATIC call: com.ss.android.ugc.aweme.feed.FeedApiService.a():com.ss.android.ugc.aweme.feed.cache.IFeedApi)
              (0 int)
              (0 long)
              (0 long)
              (6 int)
              (null java.lang.Integer)
              (null java.lang.String)
              (r12v1 'i' int)
              (0 int)
              ("")
              (null java.lang.String)
              (null java.lang.String)
              (0 long)
              (wrap: com.ss.android.ugc.aweme.feed.t.e$1 : 0x006c: CONSTRUCTOR  (r2v5 com.ss.android.ugc.aweme.feed.t.e$1) = (r0v1 'eVar' com.ss.android.ugc.aweme.feed.t.e) call: com.ss.android.ugc.aweme.feed.t.e.1.<init>(com.ss.android.ugc.aweme.feed.t.e):void type: CONSTRUCTOR)
              (null android.os.Bundle)
              false
             type: INTERFACE call: com.ss.android.ugc.aweme.feed.cache.IFeedApi.fetchFeedList(int, long, long, int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.feed.cache.j, android.os.Bundle, java.lang.Boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList in method: com.ss.android.ugc.aweme.feed.t.h.call():java.lang.Object, file: classes4.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: CONSTRUCTOR  (r2v5 com.ss.android.ugc.aweme.feed.t.e$1) = (r0v1 'eVar' com.ss.android.ugc.aweme.feed.t.e) call: com.ss.android.ugc.aweme.feed.t.e.1.<init>(com.ss.android.ugc.aweme.feed.t.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.t.h.call():java.lang.Object, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 22 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.feed.t.e, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 28 more
            */
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2968t.CallableC49942h.call():java.lang.Object");
    }
}

package com.p2082ss.android.ugc.aweme.live.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.live.AbstractC58719m;
import com.p2082ss.android.ugc.aweme.live.Live;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.live.settings.a */
public final class C58758a implements AbstractC58719m {

    /* renamed from: a */
    public static C58758a f133725a = new C58758a();

    /* renamed from: b */
    private LiveSDKSettingApi f133726b = ((LiveSDKSettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://" + Live.getLiveDomain()).create(LiveSDKSettingApi.class));

    static {
        Covode.recordClassIndex(69065);
    }

    private C58758a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58719m
    /* renamed from: a */
    public final void mo96122a(Context context) {
        HashMap hashMap = new HashMap();
        
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: INVOKE  
              (wrap: com.bytedance.android.livesdk.feed.network.a$1 : 0x0007: CONSTRUCTOR  (r0v0 com.bytedance.android.livesdk.feed.network.a$1) =  call: com.bytedance.android.livesdk.feed.network.a.1.<init>():void type: CONSTRUCTOR)
              (r1v0 'hashMap' java.util.HashMap)
             type: INTERFACE call: com.bytedance.android.livesdk.feed.network.a.a.a(java.util.Map):void in method: com.ss.android.ugc.aweme.live.settings.a.a(android.content.Context):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: CONSTRUCTOR  (r0v0 com.bytedance.android.livesdk.feed.network.a$1) =  call: com.bytedance.android.livesdk.feed.network.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.live.settings.a.a(android.content.Context):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.feed.network.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bytedance.android.livesdk.feed.network.a$1 r0 = new com.bytedance.android.livesdk.feed.network.a$1
            r0.<init>()
            r0.mo14952a(r1)
            com.ss.android.ugc.aweme.live.settings.LiveSDKSettingApi r0 = r2.f133726b
            b.i r1 = r0.querySettings(r1)
            com.ss.android.ugc.aweme.live.settings.b r0 = new com.ss.android.ugc.aweme.live.settings.b
            r0.<init>(r3)
            r1.mo5532a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.settings.C58758a.mo96122a(android.content.Context):void");
    }
}

package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.f */
final /* synthetic */ class CallableC58432f implements Callable {

    /* renamed from: a */
    private final InitAppsFlyer f133039a;

    /* renamed from: b */
    private final InstallReferrerClient f133040b;

    /* renamed from: c */
    private final Context f133041c;

    /* renamed from: d */
    private final AppsFlyerConversionListener f133042d;

    static {
        Covode.recordClassIndex(68688);
    }

    CallableC58432f(InitAppsFlyer initAppsFlyer, InstallReferrerClient installReferrerClient, Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        this.f133039a = initAppsFlyer;
        this.f133040b = installReferrerClient;
        this.f133041c = context;
        this.f133042d = appsFlyerConversionListener;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InitAppsFlyer initAppsFlyer = this.f133039a;
        InstallReferrerClient installReferrerClient = this.f133040b;
        installReferrerClient.mo6229a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE  
              (r3v0 'installReferrerClient' com.android.installreferrer.api.InstallReferrerClient)
              (wrap: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$2 : 0x000a: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$2) = 
              (r4v0 'initAppsFlyer' com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer)
              (r3v0 'installReferrerClient' com.android.installreferrer.api.InstallReferrerClient)
              (wrap: android.content.Context : 0x0004: IGET  (r2v0 android.content.Context) = (r5v0 'this' com.ss.android.ugc.aweme.legoImp.task.f A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.legoImp.task.f.c android.content.Context)
              (wrap: com.appsflyer.AppsFlyerConversionListener : 0x0006: IGET  (r1v0 com.appsflyer.AppsFlyerConversionListener) = (r5v0 'this' com.ss.android.ugc.aweme.legoImp.task.f A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.legoImp.task.f.d com.appsflyer.AppsFlyerConversionListener)
             call: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer.2.<init>(com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer, com.android.installreferrer.api.InstallReferrerClient, android.content.Context, com.appsflyer.AppsFlyerConversionListener):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.android.installreferrer.api.InstallReferrerClient.a(com.android.installreferrer.api.InstallReferrerStateListener):void in method: com.ss.android.ugc.aweme.legoImp.task.f.call():java.lang.Object, file: classes6.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$2) = 
              (r4v0 'initAppsFlyer' com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer)
              (r3v0 'installReferrerClient' com.android.installreferrer.api.InstallReferrerClient)
              (wrap: android.content.Context : 0x0004: IGET  (r2v0 android.content.Context) = (r5v0 'this' com.ss.android.ugc.aweme.legoImp.task.f A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.legoImp.task.f.c android.content.Context)
              (wrap: com.appsflyer.AppsFlyerConversionListener : 0x0006: IGET  (r1v0 com.appsflyer.AppsFlyerConversionListener) = (r5v0 'this' com.ss.android.ugc.aweme.legoImp.task.f A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.legoImp.task.f.d com.appsflyer.AppsFlyerConversionListener)
             call: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer.2.<init>(com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer, com.android.installreferrer.api.InstallReferrerClient, android.content.Context, com.appsflyer.AppsFlyerConversionListener):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.f.call():java.lang.Object, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer r4 = r5.f133039a
            com.android.installreferrer.api.InstallReferrerClient r3 = r5.f133040b
            android.content.Context r2 = r5.f133041c
            com.appsflyer.AppsFlyerConversionListener r1 = r5.f133042d
            com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$2 r0 = new com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer$2
            r0.<init>(r3, r2, r1)
            r3.mo6229a(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.CallableC58432f.call():java.lang.Object");
    }
}

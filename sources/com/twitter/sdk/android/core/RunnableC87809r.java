package com.twitter.sdk.android.core;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.C87708a;
import com.twitter.sdk.android.core.internal.C87733l;
import com.twitter.sdk.android.core.internal.C87734m;
import com.twitter.sdk.android.core.internal.scribe.C87754a;
import com.twitter.sdk.android.core.internal.scribe.C87760ad;
import com.twitter.sdk.android.core.internal.scribe.C87786u;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.r */
public final /* synthetic */ class RunnableC87809r implements Runnable {

    /* renamed from: a */
    static final Runnable f199469a = new RunnableC87809r();

    static {
        Covode.recordClassIndex(103810);
    }

    private RunnableC87809r() {
    }

    public final void run() {
        C87808q qVar = C87808q.f199460a;
        qVar.f199461b.mo142121a();
        qVar.f199462c.mo142121a();
        qVar.mo142272b();
        Context context = qVar.f199465f;
        AbstractC87793j<C87814u> jVar = qVar.f199461b;
        C87686e b = qVar.mo142272b();
        C87733l lVar = C87794k.m152808a().f199421d;
        String str = "";
        if (TextUtils.isEmpty(str)) {
            str = "https://syndication.twitter.com";
        }
        C87760ad.f199335a = new C87754a(context, jVar, b, lVar, new C87786u(true, str, "i", "sdk", "", "TwitterKit/3.0 (Android " + Build.VERSION.SDK_INT + ") " + "TwitterCore" + "/" + "3.2.0.11"));
        C87734m<C87814u> mVar = qVar.f199463d;
        C87708a aVar = C87794k.m152808a().f199424g;
        C87734m.C877351 r3 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006c: CONSTRUCTOR  (r3v1 'r3' com.twitter.sdk.android.core.internal.m$1) = (r2v1 'mVar' com.twitter.sdk.android.core.internal.m<com.twitter.sdk.android.core.u>) call: com.twitter.sdk.android.core.internal.m.1.<init>(com.twitter.sdk.android.core.internal.m):void type: CONSTRUCTOR in method: com.twitter.sdk.android.core.r.run():void, file: classes9.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.twitter.sdk.android.core.internal.m, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.core.RunnableC87809r.run():void");
    }
}

package com.bytedance.push.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.PushBody;
import com.bytedance.push.notification.AbstractC21861a;
import com.bytedance.push.p1589b.AbstractC21762a;
import com.bytedance.push.p1589b.C21764c;
import com.bytedance.push.p1590c.AbstractC21783n;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.push.notification.h */
public final class C21879h extends AbstractC21861a {

    /* renamed from: a */
    private final AbstractC21783n f51826a;

    /* renamed from: b */
    private final C21864b f51827b;

    static {
        Covode.recordClassIndex(25532);
    }

    public C21879h(AbstractC21783n nVar, AbstractC21762a aVar) {
        this.f51826a = nVar;
        this.f51827b = new C21864b(aVar);
    }

    @Override // com.bytedance.push.notification.AbstractC21861a
    /* renamed from: a */
    public final void mo35547a(String str, AbstractC21861a.AbstractC21863a aVar) {
        C21864b bVar = this.f51827b;
        C21764c cVar = new C21764c(Uri.parse(str));
        if (bVar.f51792b == null) {
            bVar.f51792b = new Handler(Looper.getMainLooper(), bVar);
        }
        RunnableC13596e.m24423a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: INVOKE  
              (wrap: com.bytedance.push.notification.b$1 : 0x001c: CONSTRUCTOR  (r0v2 com.bytedance.push.notification.b$1) = 
              (r3v0 'bVar' com.bytedance.push.notification.b)
              (r2v0 'cVar' com.bytedance.push.b.c)
              (r6v0 'aVar' com.bytedance.push.notification.a$a)
             call: com.bytedance.push.notification.b.1.<init>(com.bytedance.push.notification.b, com.bytedance.push.b.c, com.bytedance.push.notification.a$a):void type: CONSTRUCTOR)
             type: STATIC call: com.bytedance.common.utility.b.e.a(java.lang.Runnable):void in method: com.bytedance.push.notification.h.a(java.lang.String, com.bytedance.push.notification.a$a):void, file: classes2.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: CONSTRUCTOR  (r0v2 com.bytedance.push.notification.b$1) = 
              (r3v0 'bVar' com.bytedance.push.notification.b)
              (r2v0 'cVar' com.bytedance.push.b.c)
              (r6v0 'aVar' com.bytedance.push.notification.a$a)
             call: com.bytedance.push.notification.b.1.<init>(com.bytedance.push.notification.b, com.bytedance.push.b.c, com.bytedance.push.notification.a$a):void type: CONSTRUCTOR in method: com.bytedance.push.notification.h.a(java.lang.String, com.bytedance.push.notification.a$a):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.push.notification.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.push.notification.b r3 = r4.f51827b
            com.bytedance.push.b.c r2 = new com.bytedance.push.b.c
            android.net.Uri r0 = android.net.Uri.parse(r5)
            r2.<init>(r0)
            android.os.Handler r0 = r3.f51792b
            if (r0 != 0) goto L_0x001a
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0, r3)
            r3.f51792b = r1
        L_0x001a:
            com.bytedance.push.notification.b$1 r0 = new com.bytedance.push.notification.b$1
            r0.<init>(r2, r6)
            com.bytedance.common.utility.p907b.RunnableC13596e.m24423a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.C21879h.mo35547a(java.lang.String, com.bytedance.push.notification.a$a):void");
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.push.notification.AbstractC21861a
    /* renamed from: a */
    public final void mo35545a(Context context, int i, PushBody pushBody) {
        AbstractC21783n nVar = this.f51826a;
        if (nVar == null || !nVar.mo35461a(context, i, pushBody)) {
            super.mo35545a(context, i, pushBody);
        }
    }

    @Override // com.bytedance.push.notification.AbstractC21861a
    /* renamed from: b */
    public final Intent mo35549b(Context context, int i, PushBody pushBody) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        Intent intent = new Intent(applicationContext, PushActivity.class);
        intent.putExtra("push_body", pushBody.mo35387a());
        intent.putExtra("from_notification", true);
        intent.putExtra("message_from", i);
        intent.addFlags(268435456);
        return intent;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.notification.AbstractC21861a
    /* renamed from: b */
    public final Notification mo35548b(Context context, int i, PushBody pushBody, Bitmap bitmap) {
        if (this.f51826a != null) {
            return null;
        }
        return super.mo35548b(context, i, pushBody, bitmap);
    }
}

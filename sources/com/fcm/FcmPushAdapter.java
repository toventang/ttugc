package com.fcm;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.bytedance.push.p1600k.C21853a;
import com.bytedance.push.p1600k.C21857c;
import com.bytedance.push.third.AbstractC21918b;
import com.bytedance.push.third.C21922f;
import com.bytedance.push_3rd_fcm_androidx.R$string;
import com.google.firebase.C27695b;
import com.google.firebase.iid.FirebaseInstanceId;
import com.p2082ss.android.message.C30061a;
import java.util.Arrays;
import java.util.Collections;

public class FcmPushAdapter implements AbstractC21918b {
    private static int FCM_PUSH = -1;

    @Override // com.bytedance.push.third.AbstractC21918b
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    public boolean requestNotificationPermission(int i) {
        return false;
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void setAlias(Context context, String str, int i) {
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void trackPush(Context context, int i, Object obj) {
    }

    static {
        Covode.recordClassIndex(30396);
    }

    public static int getFcmPush() {
        if (FCM_PUSH == -1) {
            FCM_PUSH = C21922f.m41214a(C30061a.f71748a).mo35671a(FcmPushAdapter.class.getName());
        }
        return FCM_PUSH;
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void unregisterPush(Context context, int i) {
        if (context != null) {
            getFcmPush();
        }
    }

    @Override // com.bytedance.push.third.AbstractC21918b
    public void registerPush(Context context, int i) {
        String str;
        if (context != null) {
            if (i != getFcmPush()) {
                str = null;
                if (context != null) {
                    if (i != getFcmPush()) {
                        str = "register sender error";
                    }
                    C21798f.m40816d().mo35422a(i, 101, "0", str);
                }
            } else {
                try {
                    FirebaseInstanceId.getInstance(C27695b.m55376d()).mo46400d().mo41869a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: INVOKE  
                          (wrap: com.google.android.gms.d.h<com.google.firebase.iid.v> : 0x002a: INVOKE  (r1v1 com.google.android.gms.d.h<com.google.firebase.iid.v>) = 
                          (wrap: com.google.firebase.iid.FirebaseInstanceId : 0x0026: INVOKE  (r0v3 com.google.firebase.iid.FirebaseInstanceId) = 
                          (wrap: com.google.firebase.b : 0x0022: INVOKE  (r0v2 com.google.firebase.b) =  type: STATIC call: com.google.firebase.b.d():com.google.firebase.b)
                         type: STATIC call: com.google.firebase.iid.FirebaseInstanceId.getInstance(com.google.firebase.b):com.google.firebase.iid.FirebaseInstanceId)
                         type: VIRTUAL call: com.google.firebase.iid.FirebaseInstanceId.d():com.google.android.gms.d.h)
                          (wrap: com.fcm.a.a$1 : 0x0030: CONSTRUCTOR  (r0v4 com.fcm.a.a$1) = (r5v0 'context' android.content.Context) call: com.fcm.a.a.1.<init>(android.content.Context):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.google.android.gms.d.h.a(com.google.android.gms.d.c):com.google.android.gms.d.h in method: com.fcm.FcmPushAdapter.registerPush(android.content.Context, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: CONSTRUCTOR  (r0v4 com.fcm.a.a$1) = (r5v0 'context' android.content.Context) call: com.fcm.a.a.1.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.fcm.FcmPushAdapter.registerPush(android.content.Context, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.fcm.a.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                        this = this;
                        if (r5 == 0) goto L_0x000b
                        int r0 = getFcmPush()
                        if (r6 == r0) goto L_0x0022
                        r3 = 0
                        if (r5 != 0) goto L_0x0019
                    L_0x000b:
                        java.lang.String r3 = "context is null"
                    L_0x000d:
                        com.bytedance.push.c.e r2 = com.bytedance.push.C21798f.m40816d()
                        r1 = 101(0x65, float:1.42E-43)
                        java.lang.String r0 = "0"
                        r2.mo35422a(r6, r1, r0, r3)
                        return
                    L_0x0019:
                        int r0 = getFcmPush()
                        if (r6 == r0) goto L_0x000d
                        java.lang.String r3 = "register sender error"
                        goto L_0x000d
                    L_0x0022:
                        com.google.firebase.b r0 = com.google.firebase.C27695b.m55376d()     // Catch:{ all -> 0x0036 }
                        com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)     // Catch:{ all -> 0x0036 }
                        com.google.android.gms.d.h r1 = r0.mo46400d()     // Catch:{ all -> 0x0036 }
                        com.fcm.a.a$1 r0 = new com.fcm.a.a$1     // Catch:{ all -> 0x0036 }
                        r0.<init>(r5)     // Catch:{ all -> 0x0036 }
                        r1.mo41869a(r0)     // Catch:{ all -> 0x0036 }
                    L_0x0036:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.fcm.FcmPushAdapter.registerPush(android.content.Context, int):void");
                }

                @Override // com.bytedance.push.third.AbstractC21918b
                public boolean checkThirdPushConfig(String str, Context context) {
                    boolean z;
                    String string = context.getResources().getString(R$string.google_api_key);
                    String string2 = context.getResources().getString(R$string.google_app_id);
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    return z & C21857c.m40944b(context, "Fcm Push error", Arrays.asList(C21853a.C21854a.m40935c("com.fcm.service.SSGcmListenerService").mo35531a(context.getPackageName()).mo35530a(new C21853a.C21855b(Collections.singletonList("com.google.firebase.MESSAGING_EVENT"))).f51771a, C21853a.C21854a.m40935c("com.fcm.service.FcmRegistrationJobIntentService").mo35531a(context.getPackageName()).mo35532b("android.permission.BIND_JOB_SERVICE").f51771a));
                }
            }

package com.p2082ss.android.ttve.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.common.IESAppLogger;
import com.p2082ss.android.vesdk.C85315al;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ttve.monitor.b */
public final class C30683b {

    /* renamed from: a */
    private static boolean f73387a;

    /* renamed from: b */
    private static AbstractC30684a f73388b;

    /* renamed from: com.ss.android.ttve.monitor.b$a */
    public interface AbstractC30684a {
        static {
            Covode.recordClassIndex(37254);
        }

        /* renamed from: a */
        void mo55062a(String str, JSONObject jSONObject, String str2);
    }

    static {
        Covode.recordClassIndex(37253);
    }

    /* renamed from: a */
    public static synchronized void m63030a(AbstractC30684a aVar) {
        synchronized (C30683b.class) {
            MethodCollector.m26663i(534);
            f73388b = aVar;
            IESAppLogger.sharedInstance().setAppLogCallback("", 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: INVOKE  
                  (wrap: com.bytedance.ies.common.IESAppLogger : 0x000c: INVOKE  (r2v0 com.bytedance.ies.common.IESAppLogger) =  type: STATIC call: com.bytedance.ies.common.IESAppLogger.sharedInstance():com.bytedance.ies.common.IESAppLogger)
                  ("")
                  (wrap: com.ss.android.ttve.monitor.a$1 : 0x0012: CONSTRUCTOR  (r1v0 com.ss.android.ttve.monitor.a$1) = (r6v0 'aVar' com.ss.android.ttve.monitor.b$a) call: com.ss.android.ttve.monitor.a.1.<init>(com.ss.android.ttve.monitor.b$a):void type: CONSTRUCTOR)
                  true
                 type: VIRTUAL call: com.bytedance.ies.common.IESAppLogger.setAppLogCallback(java.lang.String, com.bytedance.ies.common.IESAppLogger$a, boolean):void in method: com.ss.android.ttve.monitor.b.a(com.ss.android.ttve.monitor.b$a):void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r1v0 com.ss.android.ttve.monitor.a$1) = (r6v0 'aVar' com.ss.android.ttve.monitor.b$a) call: com.ss.android.ttve.monitor.a.1.<init>(com.ss.android.ttve.monitor.b$a):void type: CONSTRUCTOR in method: com.ss.android.ttve.monitor.b.a(com.ss.android.ttve.monitor.b$a):void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttve.monitor.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                java.lang.Class<com.ss.android.ttve.monitor.b> r5 = com.p2082ss.android.ttve.monitor.C30683b.class
                monitor-enter(r5)
                r4 = 534(0x216, float:7.48E-43)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)     // Catch:{ all -> 0x001e }
                com.p2082ss.android.ttve.monitor.C30683b.f73388b = r6     // Catch:{ all -> 0x001e }
                java.lang.String r3 = ""
                com.bytedance.ies.common.IESAppLogger r2 = com.bytedance.ies.common.IESAppLogger.sharedInstance()     // Catch:{ all -> 0x001e }
                com.ss.android.ttve.monitor.a$1 r1 = new com.ss.android.ttve.monitor.a$1     // Catch:{ all -> 0x001e }
                r1.<init>(r6)     // Catch:{ all -> 0x001e }
                r0 = 1
                r2.setAppLogCallback(r3, r1, r0)     // Catch:{ all -> 0x001e }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)     // Catch:{ all -> 0x001e }
                monitor-exit(r5)
                return
            L_0x001e:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttve.monitor.C30683b.m63030a(com.ss.android.ttve.monitor.b$a):void");
        }

        /* renamed from: a */
        public static void m63032a(String str, JSONObject jSONObject, String str2) {
            m63033a(str, jSONObject, str2, true, false);
        }

        /* renamed from: a */
        private static void m63031a(String str, String str2, JSONObject jSONObject, boolean z) {
            C85315al.m146639b("ApplogUtils", "onEventReport " + str + ": " + jSONObject);
            C30681a.m63028a(str, jSONObject, str2, z);
        }

        /* renamed from: a */
        public static void m63033a(String str, JSONObject jSONObject, String str2, boolean z, boolean z2) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("sdkVersion", "10.5.0.161-mt");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (f73387a || z2) {
                m63031a(str, str2, jSONObject, true);
            }
            if (z) {
                try {
                    jSONObject.put("second_appid", "2780");
                    jSONObject.put("second_appname", "vesdk_abroad");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                m63031a(str, str2, jSONObject, false);
            }
        }
    }

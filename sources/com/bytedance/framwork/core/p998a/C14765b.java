package com.bytedance.framwork.core.p998a;

import com.bytedance.apm.C12290b;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.a.b */
public final class C14765b {
    static {
        Covode.recordClassIndex(16865);
    }

    /* renamed from: a */
    public static void m27094a(String str, JSONObject jSONObject) {
        C12290b.m22064a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m27093a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        JSONObject a = C12290b.m22057a(jSONObject);
        C12560b.C12564a.f30567a.mo20387a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x0004: SGET  (r0v0 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.b$1 : 0x0008: CONSTRUCTOR  (r1v0 com.bytedance.apm.b$1) = 
              (r2v0 'j' long)
              (r4v0 'j2' long)
              (r6v0 'str' java.lang.String)
              (r7v0 'str2' java.lang.String)
              (r8v0 'str3' java.lang.String)
              (r9v0 'i' int)
              (r10v1 'a' org.json.JSONObject)
             call: com.bytedance.apm.b.1.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.bytedance.framwork.core.a.b.a(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r1v0 com.bytedance.apm.b$1) = 
              (r2v0 'j' long)
              (r4v0 'j2' long)
              (r6v0 'str' java.lang.String)
              (r7v0 'str2' java.lang.String)
              (r8v0 'str3' java.lang.String)
              (r9v0 'i' int)
              (r10v1 'a' org.json.JSONObject)
             call: com.bytedance.apm.b.1.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void type: CONSTRUCTOR in method: com.bytedance.framwork.core.a.b.a(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            org.json.JSONObject r10 = com.bytedance.apm.C12290b.m22057a(r10)
            com.bytedance.apm.p.b r0 = com.bytedance.apm.p788p.C12560b.C12564a.f30567a
            com.bytedance.apm.b$1 r1 = new com.bytedance.apm.b$1
            r1.<init>(r2, r4, r6, r7, r8, r9, r10)
            r0.mo20387a(r1)
            boolean r0 = com.bytedance.apm.C12397c.f29933c
            if (r0 == 0) goto L_0x001e
            com.bytedance.apm.p.c r0 = com.bytedance.apm.p788p.C12566c.m22611a()
            com.bytedance.apm.b$8 r1 = new com.bytedance.apm.b$8
            r1.<init>(r2, r4, r6, r7, r8, r9, r10)
            r0.mo20395a(r1)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p998a.C14765b.m27093a(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void");
    }

    /* renamed from: b */
    public static void m27095b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        JSONObject a = C12290b.m22057a(jSONObject);
        C12560b.C12564a.f30567a.mo20387a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x0004: SGET  (r0v0 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.b$15 : 0x0008: CONSTRUCTOR  (r1v0 com.bytedance.apm.b$15) = 
              (r2v0 'j' long)
              (r4v0 'j2' long)
              (r6v0 'str' java.lang.String)
              (r7v0 'str2' java.lang.String)
              (r8v0 'str3' java.lang.String)
              (r9v0 'i' int)
              (r10v1 'a' org.json.JSONObject)
             call: com.bytedance.apm.b.15.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.bytedance.framwork.core.a.b.b(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r1v0 com.bytedance.apm.b$15) = 
              (r2v0 'j' long)
              (r4v0 'j2' long)
              (r6v0 'str' java.lang.String)
              (r7v0 'str2' java.lang.String)
              (r8v0 'str3' java.lang.String)
              (r9v0 'i' int)
              (r10v1 'a' org.json.JSONObject)
             call: com.bytedance.apm.b.15.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void type: CONSTRUCTOR in method: com.bytedance.framwork.core.a.b.b(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            org.json.JSONObject r10 = com.bytedance.apm.C12290b.m22057a(r10)
            com.bytedance.apm.p.b r0 = com.bytedance.apm.p788p.C12560b.C12564a.f30567a
            com.bytedance.apm.b$15 r1 = new com.bytedance.apm.b$15
            r1.<init>(r2, r4, r6, r7, r8, r9, r10)
            r0.mo20387a(r1)
            boolean r0 = com.bytedance.apm.C12397c.f29933c
            if (r0 == 0) goto L_0x001e
            com.bytedance.apm.p.c r0 = com.bytedance.apm.p788p.C12566c.m22611a()
            com.bytedance.apm.b$18 r1 = new com.bytedance.apm.b$18
            r1.<init>(r2, r4, r6, r7, r8, r9, r10)
            r0.mo20395a(r1)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p998a.C14765b.m27095b(long, long, java.lang.String, java.lang.String, java.lang.String, int, org.json.JSONObject):void");
    }
}

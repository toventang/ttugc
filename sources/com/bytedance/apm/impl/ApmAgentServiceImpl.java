package com.bytedance.apm.impl;

import android.content.Context;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.config.C12422d;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22709b;
import com.bytedance.services.apm.api.IApmAgent;
import org.json.JSONObject;

public class ApmAgentServiceImpl implements IApmAgent {
    static {
        Covode.recordClassIndex(14303);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void reportLegacyMonitorLog(Context context, long j, long j2, boolean z) {
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(C22709b bVar) {
        C12422d.C12423a a = C12422d.m22362a();
        a.f30138a = bVar.f53666a;
        a.f30139b = bVar.f53667b;
        a.f30140c = bVar.f53668c;
        a.f30141d = bVar.f53669d;
        a.f30142e = bVar.f53670e;
        a.f30143f = bVar.f53671f;
        C12290b.m22059a(a.mo20217a());
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C12290b.m22064a(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorLog(String str, JSONObject jSONObject) {
        C12290b.m22064a(str, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorExceptionLog(String str, JSONObject jSONObject) {
        JSONObject a = C12290b.m22057a(jSONObject);
        C12560b.C12564a.f30567a.mo20387a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x0004: SGET  (r1v0 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.b$7 : 0x0008: CONSTRUCTOR  (r0v0 com.bytedance.apm.b$7) = (r4v0 'str' java.lang.String), (r2v0 'a' org.json.JSONObject) call: com.bytedance.apm.b.7.<init>(java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.bytedance.apm.impl.ApmAgentServiceImpl.monitorExceptionLog(java.lang.String, org.json.JSONObject):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r0v0 com.bytedance.apm.b$7) = (r4v0 'str' java.lang.String), (r2v0 'a' org.json.JSONObject) call: com.bytedance.apm.b.7.<init>(java.lang.String, org.json.JSONObject):void type: CONSTRUCTOR in method: com.bytedance.apm.impl.ApmAgentServiceImpl.monitorExceptionLog(java.lang.String, org.json.JSONObject):void, file: classes.dex
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
            this = this;
            org.json.JSONObject r2 = com.bytedance.apm.C12290b.m22057a(r5)
            com.bytedance.apm.p.b r1 = com.bytedance.apm.p788p.C12560b.C12564a.f30567a
            com.bytedance.apm.b$7 r0 = new com.bytedance.apm.b$7
            r0.<init>(r4, r2)
            r1.mo20387a(r0)
            boolean r0 = com.bytedance.apm.C12397c.f29933c
            if (r0 == 0) goto L_0x001e
            com.bytedance.apm.p.c r1 = com.bytedance.apm.p788p.C12566c.m22611a()
            com.bytedance.apm.b$9 r0 = new com.bytedance.apm.b$9
            r0.<init>(r4, r2)
            r1.mo20395a(r0)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.impl.ApmAgentServiceImpl.monitorExceptionLog(java.lang.String, org.json.JSONObject):void");
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        C12290b.m22065a(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C12290b.m22060a(str, i, jSONObject);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C12290b.m22066a(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // com.bytedance.services.apm.api.IApmAgent
    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C12290b.m22061a(str, i, jSONObject, jSONObject2);
    }
}

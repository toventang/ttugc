package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.AbstractC22713f;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.app.p2333k.C33799a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask */
public final class RheaTraceUploadTask implements AbstractC58264w {

    /* renamed from: a */
    public static final C58385a f132939a = new C58385a((byte) 0);

    static {
        Covode.recordClassIndex(68590);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$a */
    public static final class C58385a {
        static {
            Covode.recordClassIndex(68591);
        }

        private C58385a() {
        }

        public /* synthetic */ C58385a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BOOT_FINISH;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d */
    public static final class C58388d implements AbstractC22713f {

        /* renamed from: a */
        final /* synthetic */ File f132944a;

        static {
            Covode.recordClassIndex(68594);
        }

        @Override // com.bytedance.services.apm.api.AbstractC22713f
        /* renamed from: a */
        public final void mo37000a(String str) {
            C89219l.m154721d(str, "");
        }

        @Override // com.bytedance.services.apm.api.AbstractC22713f
        /* renamed from: a */
        public final void mo36999a() {
            m106488a(this.f132944a);
        }

        C58388d(File file) {
            this.f132944a = file;
        }

        /* renamed from: a */
        private static boolean m106488a(File file) {
            MethodCollector.m26663i(4309);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(4309);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(4309);
            return delete;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$b */
    static final class CallableC58386b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ RheaTraceUploadTask f132940a;

        /* renamed from: b */
        final /* synthetic */ File f132941b;

        static {
            Covode.recordClassIndex(68592);
        }

        CallableC58386b(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f132940a = rheaTraceUploadTask;
            this.f132941b = file;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                RheaTraceUploadTask.m106477a(this.f132941b, "_atrace");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$c */
    static final class CallableC58387c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ RheaTraceUploadTask f132942a;

        /* renamed from: b */
        final /* synthetic */ File f132943b;

        static {
            Covode.recordClassIndex(68593);
        }

        CallableC58387c(RheaTraceUploadTask rheaTraceUploadTask, File file) {
            this.f132942a = rheaTraceUploadTask;
            this.f132943b = file;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                RheaTraceUploadTask.m106477a(this.f132943b, "_fake_trace");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    private static JSONObject m106479c() {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> h = C12397c.m22291h();
        C89219l.m154716b(h, "");
        for (Map.Entry<String, String> entry : h.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static File m106478b(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        try {
            if (C89361p.m154872a("ATrace", C33799a.f80046a, true) || C89361p.m154872a("MTrace", C33799a.f80046a, true)) {
                String a = LauncherServiceImpl.m104924b().mo95571a();
                int hashCode = a.hashCode();
                if (hashCode != -2009454344) {
                    if (hashCode == 1941963140 && a.equals("ATrace")) {
                        File a2 = m106476a("ATrace", context);
                        if (a2.exists() && NetworkUtils.isWifi(context) && ApmDelegate.C12507a.f30372a.mo20331b("upload_rhea_atrace_file")) {
                            C1731i.m5640b(new CallableC58386b(this, a2), C1731i.f5562a);
                        }
                    }
                } else if (a.equals("MTrace")) {
                    File a3 = m106476a("MTrace", context);
                    if (a3.exists() && NetworkUtils.isWifi(context) && ApmDelegate.C12507a.f30372a.mo20331b("upload_rhea_fake_trace_file")) {
                        C1731i.m5640b(new CallableC58387c(this, a3), C1731i.f5562a);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static File m106476a(String str, Context context) {
        StringBuilder sb = new StringBuilder();
        File b = m106478b(context);
        C89219l.m154716b(b, "");
        String sb2 = sb.append(b.getAbsolutePath()).append("/rhea").toString();
        if (C89219l.m154714a((Object) str, (Object) "ATrace")) {
            return new File(sb2, "rhea_startup.trace");
        }
        return new File(sb2, "rhea_startup.fake");
    }

    /* renamed from: a */
    public static void m106477a(File file, String str) {
        C12560b.C12564a.f30567a.mo20391b(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x003e: SGET  (r0v7 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.l.a$1 : 0x0046: CONSTRUCTOR  (r2v1 com.bytedance.apm.l.a$1) = 
              (wrap: com.bytedance.apm.l.a : 0x0002: CONSTRUCTOR  (r3v0 com.bytedance.apm.l.a) =  call: com.bytedance.apm.l.a.<init>():void type: CONSTRUCTOR)
              (wrap: java.lang.String : ?: STR_CONCAT  
              (wrap: java.lang.String : 0x0021: INVOKE  (wrap: int : 0x001f: SGET   com.ss.android.deviceregister.a.d.e int) type: STATIC call: java.lang.String.valueOf(int):java.lang.String)
            )
              ("66812471934")
              (wrap: java.lang.String : ?: STR_CONCAT  (r6v0 java.lang.String) = 
              (wrap: long : 0x000a: INVOKE   type: STATIC call: com.bytedance.ies.ugc.appcontext.d.d():long)
              (r12v0 'str' java.lang.String)
            )
              (wrap: java.util.List : 0x0031: INVOKE  (r7v0 java.util.List) = 
              (wrap: java.lang.String : 0x002d: INVOKE  (r0v6 java.lang.String) = (r11v0 'file' java.io.File) type: VIRTUAL call: java.io.File.getAbsolutePath():java.lang.String)
             type: STATIC call: h.a.n.a(java.lang.Object):java.util.List)
              ("rhea_trace_upload")
              (wrap: org.json.JSONObject : 0x0035: INVOKE  (r9v0 org.json.JSONObject) =  type: STATIC call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.c():org.json.JSONObject)
              (wrap: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d : 0x003b: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d) = (r11v0 'file' java.io.File) call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.d.<init>(java.io.File):void type: CONSTRUCTOR)
             call: com.bytedance.apm.l.a.1.<init>(com.bytedance.apm.l.a, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, org.json.JSONObject, com.bytedance.services.apm.api.f):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.b(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.a(java.io.File, java.lang.String):void, file: classes2.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: CONSTRUCTOR  (r2v1 com.bytedance.apm.l.a$1) = 
              (wrap: com.bytedance.apm.l.a : 0x0002: CONSTRUCTOR  (r3v0 com.bytedance.apm.l.a) =  call: com.bytedance.apm.l.a.<init>():void type: CONSTRUCTOR)
              (wrap: java.lang.String : ?: STR_CONCAT  
              (wrap: java.lang.String : 0x0021: INVOKE  (wrap: int : 0x001f: SGET   com.ss.android.deviceregister.a.d.e int) type: STATIC call: java.lang.String.valueOf(int):java.lang.String)
            )
              ("66812471934")
              (wrap: java.lang.String : ?: STR_CONCAT  (r6v0 java.lang.String) = 
              (wrap: long : 0x000a: INVOKE   type: STATIC call: com.bytedance.ies.ugc.appcontext.d.d():long)
              (r12v0 'str' java.lang.String)
            )
              (wrap: java.util.List : 0x0031: INVOKE  (r7v0 java.util.List) = 
              (wrap: java.lang.String : 0x002d: INVOKE  (r0v6 java.lang.String) = (r11v0 'file' java.io.File) type: VIRTUAL call: java.io.File.getAbsolutePath():java.lang.String)
             type: STATIC call: h.a.n.a(java.lang.Object):java.util.List)
              ("rhea_trace_upload")
              (wrap: org.json.JSONObject : 0x0035: INVOKE  (r9v0 org.json.JSONObject) =  type: STATIC call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.c():org.json.JSONObject)
              (wrap: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d : 0x003b: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d) = (r11v0 'file' java.io.File) call: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.d.<init>(java.io.File):void type: CONSTRUCTOR)
             call: com.bytedance.apm.l.a.1.<init>(com.bytedance.apm.l.a, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, org.json.JSONObject, com.bytedance.services.apm.api.f):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.a(java.io.File, java.lang.String):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.l.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            com.bytedance.apm.l.a r3 = new com.bytedance.apm.l.a
            r3.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r0 = com.bytedance.ies.ugc.appcontext.C17867d.m33083d()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r6 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = com.p2082ss.android.deviceregister.p2134a.C29869d.f71251e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = r11.getAbsolutePath()
            java.util.List r7 = p4600h.p4601a.C89070n.m154516a(r0)
            org.json.JSONObject r9 = m106479c()
            com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d r10 = new com.ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask$d
            r10.<init>(r11)
            com.bytedance.apm.p.b r0 = com.bytedance.apm.p788p.C12560b.C12564a.f30567a
            com.bytedance.apm.l.a$1 r2 = new com.bytedance.apm.l.a$1
            java.lang.String r5 = "66812471934"
            java.lang.String r8 = "rhea_trace_upload"
            r2.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.mo20391b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.RheaTraceUploadTask.m106477a(java.io.File, java.lang.String):void");
    }
}

package com.bytedance.crash.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14052g;

/* renamed from: com.bytedance.crash.entity.d */
public class C13866d extends C13864b {
    static {
        Covode.recordClassIndex(15925);
    }

    /* renamed from: c */
    public boolean mo22352c() {
        return false;
    }

    private C13866d() {
    }

    /* synthetic */ C13866d(byte b) {
        this();
    }

    /* renamed from: a */
    public static C13866d m25084a(StackTraceElement stackTraceElement, String str, String str2, String str3, String str4) {
        C13866d dVar = new C13866d();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        dVar.mo22346a("event_type", (Object) "exception");
        dVar.mo22346a("log_type", (Object) "core_exception_monitor");
        dVar.mo22346a("timestamp", Long.valueOf(System.currentTimeMillis()));
        dVar.mo22346a("crash_time", Long.valueOf(System.currentTimeMillis()));
        dVar.mo22346a("class_ref", (Object) className);
        dVar.mo22346a("method", (Object) methodName);
        dVar.mo22346a("line_num", Integer.valueOf(lineNumber));
        dVar.mo22346a("stack", (Object) str);
        dVar.mo22346a("exception_type", (Object) 1);
        dVar.mo22346a("ensure_type", (Object) str4);
        dVar.mo22346a("is_core", (Object) 0);
        dVar.mo22346a("message", (Object) str2);
        dVar.mo22346a("process_name", (Object) C14044b.m25520c(C13933m.f33936a));
        dVar.mo22346a("crash_thread_name", (Object) str3);
        C13868e.m25088a(dVar.f33757a);
        return dVar;
    }

    /* renamed from: a */
    public static C13866d m25085a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C13866d dVar = new C13866d();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        dVar.mo22346a("event_type", (Object) "exception");
        dVar.mo22346a("log_type", (Object) str5);
        dVar.mo22346a("timestamp", Long.valueOf(System.currentTimeMillis()));
        dVar.mo22346a("crash_time", Long.valueOf(System.currentTimeMillis()));
        dVar.mo22346a("class_ref", (Object) className);
        dVar.mo22346a("method", (Object) methodName);
        dVar.mo22346a("line_num", Integer.valueOf(lineNumber));
        dVar.mo22346a("stack", (Object) str);
        dVar.mo22346a("crash_md5", (Object) C14052g.m25539a(str));
        dVar.mo22346a("exception_type", (Object) 1);
        dVar.mo22346a("ensure_type", (Object) str4);
        dVar.mo22346a("is_core", Integer.valueOf(z ? 1 : 0));
        dVar.mo22346a("message", (Object) str2);
        dVar.mo22346a("process_name", (Object) C14044b.m25520c(C13933m.f33936a));
        dVar.mo22346a("crash_thread_name", (Object) str3);
        C13868e.m25088a(dVar.f33757a);
        return dVar;
    }
}

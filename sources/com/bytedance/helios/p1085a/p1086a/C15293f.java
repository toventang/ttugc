package com.bytedance.helios.p1085a.p1086a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.a.a.f */
public final class C15293f {

    /* renamed from: a */
    public static final C15293f f37313a = new C15293f();

    private C15293f() {
    }

    static {
        Covode.recordClassIndex(17523);
    }

    /* renamed from: a */
    public static String m28200a(Throwable th) {
        String str = "";
        C89219l.m154719c(th, str);
        String message = th.getMessage();
        if (message != null) {
            str = message;
        }
        return m28201a(th, str);
    }

    /* renamed from: b */
    public static String m28202b(Throwable th) {
        C89219l.m154719c(th, "");
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName()).append(": ").append(th.getMessage()).append('\n');
        StackTraceElement[] stackTrace = th.getStackTrace();
        C89219l.m154709a((Object) stackTrace, "");
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("at ").append(stackTraceElement.toString()).append('\n');
        }
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public static String m28201a(Throwable th, String str) {
        String fileName;
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        ArrayList<StackTraceElement> arrayList = new ArrayList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        C89219l.m154709a((Object) stackTrace, "");
        for (StackTraceElement stackTraceElement : stackTrace) {
            C89219l.m154709a((Object) stackTraceElement, "");
            String className = stackTraceElement.getClassName();
            if (!(className == null || className.length() == 0 || (fileName = stackTraceElement.getFileName()) == null || fileName.length() == 0)) {
                String className2 = stackTraceElement.getClassName();
                C89219l.m154709a((Object) className2, "");
                if (!C89361p.m154874b(className2, "com.bytedance.helios.sdk.ActionInvokeEntrance", false)) {
                    arrayList.add(stackTraceElement);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName()).append(": ").append(str).append('\n');
        for (StackTraceElement stackTraceElement2 : arrayList) {
            sb.append("at ").append(stackTraceElement2.toString()).append('\n');
        }
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }
}

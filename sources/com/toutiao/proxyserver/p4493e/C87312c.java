package com.toutiao.proxyserver.p4493e;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.toutiao.proxyserver.e.c */
public final class C87312c {

    /* renamed from: a */
    public static AbstractC87310a f197906a;

    /* renamed from: b */
    public static boolean f197907b;

    static {
        Covode.recordClassIndex(103208);
    }

    /* renamed from: a */
    public static String m151522a(Throwable th) {
        if (th == null) {
            return "";
        }
        Throwable th2 = th;
        while (!(th2 instanceof UnknownHostException)) {
            th2 = th2.getCause();
            if (th2 == null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                return stringWriter.toString();
            }
        }
        return "UnknownHostException";
    }

    /* renamed from: a */
    public static void m151523a(String str, String str2, String str3) {
        AbstractC87310a aVar = f197906a;
        if (aVar != null && f197907b) {
            aVar.mo124047a(str, str2, str3);
        }
    }

    /* renamed from: b */
    public static void m151524b(String str, String str2, String str3) {
        AbstractC87310a aVar = f197906a;
        if (aVar != null && f197907b) {
            aVar.mo124048b(str, str2, str3);
        }
    }

    /* renamed from: c */
    public static void m151525c(String str, String str2, String str3) {
        AbstractC87310a aVar = f197906a;
        if (aVar != null && f197907b) {
            aVar.mo124049c(str, str2, str3);
        }
    }

    /* renamed from: d */
    public static void m151526d(String str, String str2, String str3) {
        AbstractC87310a aVar = f197906a;
        if (aVar != null && f197907b) {
            aVar.mo124050d(str, str2, str3);
        }
    }
}

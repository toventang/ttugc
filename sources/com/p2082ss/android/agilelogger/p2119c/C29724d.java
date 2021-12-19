package com.p2082ss.android.agilelogger.p2119c;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.agilelogger.c.d */
public final class C29724d {
    static {
        Covode.recordClassIndex(36121);
    }

    /* renamed from: a */
    public static String m59905a(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "ALOG:UnknownHostException";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
        } catch (Throwable unused) {
        }
        printWriter.flush();
        return stringWriter.toString();
    }
}

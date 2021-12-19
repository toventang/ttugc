package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import java.util.List;
import p4600h.C89032a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.cm */
public final class C80304cm {

    /* renamed from: a */
    public static final C80304cm f179829a = new C80304cm();

    private C80304cm() {
    }

    static {
        Covode.recordClassIndex(93572);
    }

    /* renamed from: a */
    private static Throwable m139208a(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace.length > 3) {
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[3];
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 0, 3);
            exc.setStackTrace(stackTraceElementArr);
        }
        return exc;
    }

    /* renamed from: a */
    private static String m139207a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List<String> b = C89361p.m154915b(str, new String[]{"\n"});
        if (b.isEmpty()) {
            return "";
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (String str2 : b) {
            if (i == 3) {
                break;
            }
            sb.append(str2 + "\n");
            i++;
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public final void mo123693a(String str, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(str, "");
        if (aVar != null) {
            try {
                aVar.invoke();
            } catch (Exception e) {
                m139210a(e, "executeMethodSafely", str, "executeMethodSafely", "");
            }
        }
    }

    /* renamed from: a */
    public static void m139210a(Exception exc, String str, String str2, String str3, String str4) {
        C89219l.m154721d(exc, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        String b = C49907s.m93688b();
        StackTraceElement stackTraceElement = new StackTraceElement(str2, str3, str4, 0);
        String a = m139207a(C89032a.m154602a(exc));
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        C13866d a2 = C13866d.m25084a(stackTraceElement, a, str, currentThread.getName(), "EnsureNotReachHere");
        C89219l.m154716b(a2, "");
        a2.mo22350c("activity", b);
        C13913i.m25188a(a2);
        C22708a.m42803a(m139208a(exc), str);
    }
}

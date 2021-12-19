package com.p2082ss.android.ugc.aweme.tools.extract.p4117b;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.b.c */
public final class C78524c {

    /* renamed from: a */
    public static final C78524c f176466a = new C78524c();

    private C78524c() {
    }

    static {
        Covode.recordClassIndex(91656);
    }

    /* renamed from: a */
    public static final void m137095a(C78521a aVar, String str, String str2, String str3) {
        String str4;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        aVar.f176451b.f176463a = str2;
        StackTraceElement stackTraceElement = new StackTraceElement(f176466a.getClass().getName(), "", "", 0);
        if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
            str4 = "MainThread";
        } else {
            str4 = "SubThread";
        }
        C13866d a = C13866d.m25085a(stackTraceElement, str, str2, str4, true, "EnsureNotReachHere", str3);
        C89219l.m154716b(a, "");
        for (T t : aVar.f176450a) {
            String str5 = t.f176463a;
            if (str5 != null) {
                a.mo22350c(t.f176464b, str5);
                if (t.f176465c) {
                    a.mo22340a(t.f176464b, str5);
                }
            }
        }
        C13913i.m25188a(a);
    }
}

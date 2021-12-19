package com.p2082ss.android.ugc.aweme.kids.common.p3330c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.c.f */
public final class C57355f {

    /* renamed from: a */
    public static final C57355f f130733a = new C57355f();

    /* renamed from: b */
    private static ExecutorService f130734b;

    private C57355f() {
    }

    static {
        Covode.recordClassIndex(67266);
    }

    /* renamed from: a */
    public static ExecutorService m103959a() {
        MethodCollector.m26663i(5105);
        if (f130734b == null) {
            synchronized (C57355f.class) {
                try {
                    if (f130734b == null) {
                        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
                        a.f95504b = "EventUpload";
                        f130734b = C40780g.m82242a(a.mo70028a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5105);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f130734b;
        MethodCollector.m26664o(5105);
        return executorService;
    }

    /* renamed from: a */
    public static void m103961a(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        try {
            C29819a.m60076a(str, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m103962a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        try {
            C29819a.m60077a(str, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

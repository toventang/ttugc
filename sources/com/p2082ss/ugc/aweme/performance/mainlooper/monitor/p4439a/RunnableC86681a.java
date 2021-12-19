package com.p2082ss.ugc.aweme.performance.mainlooper.monitor.p4439a;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.performance.p3543a.C62833a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86666b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4434c.C86668a;
import com.p2082ss.ugc.aweme.performance.mainlooper.monitor.work.C86682a;
import com.p2082ss.ugc.aweme.performance.mainlooper.p4438a.C86680a;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.a.a */
public final class RunnableC86681a implements Runnable {

    /* renamed from: a */
    public String f195386a;

    /* renamed from: b */
    public String f195387b;

    static {
        Covode.recordClassIndex(101910);
    }

    public /* synthetic */ RunnableC86681a() {
        this("");
    }

    public final void run() {
        MethodCollector.m26663i(8491);
        C86682a a = C86682a.C86683a.m150159a();
        String str = this.f195387b;
        C89219l.m154719c(str, "");
        C86666b bVar = a.f195370a.get(str);
        if (bVar == null) {
            C86680a.f195383a.mo137961a(this);
            MethodCollector.m26664o(8491);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (C86682a.C86683a.m150159a().f195373d) {
            Activity activity = C86668a.f195363a.get();
            if (activity != null) {
                StringBuilder append = sb.append("\nlayer info : \n");
                View decorView = activity.getWindow().getDecorView();
                C89219l.m154709a((Object) decorView, "");
                C89219l.m154719c(decorView, "");
                append.append((String) null).append("\n");
            }
            synchronized (C62833a.f142488b) {
                try {
                    Iterator<T> it = C62833a.f142487a.iterator();
                    while (it.hasNext()) {
                        sb.append("draw leak stack：\n").append((String) it.next()).append("\n");
                    }
                    C62833a.f142487a.clear();
                } catch (Throwable th) {
                    MethodCollector.m26664o(8491);
                    throw th;
                }
            }
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            bVar.f195356i = sb2;
        }
        C86680a.f195383a.mo137961a(this);
        MethodCollector.m26664o(8491);
    }

    private RunnableC86681a(String str) {
        C89219l.m154719c(str, "");
        this.f195387b = str;
        this.f195386a = "";
    }
}

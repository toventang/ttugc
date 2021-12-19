package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.statisticlogger.C18230f;
import com.bytedance.ies.ugc.statisticlogger.RunnableC18231g;
import com.bytedance.ies.ugc.statisticlogger.p1278b.C18214a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.p2144h.C29913a;
import com.p2082ss.android.p2144h.C29920c;
import com.p2082ss.android.p2144h.C29921d;
import com.p2082ss.android.p2144h.RunnableC29924e;
import com.p2082ss.android.p2144h.p2145a.C29916a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class LazyLoadLegoTask implements AbstractC58264w {

    /* renamed from: a */
    public final Application f43406a;

    static {
        Covode.recordClassIndex(20876);
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    public LazyLoadLegoTask(Application application) {
        C89219l.m154721d(application, "");
        this.f43406a = application;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        LinkedList linkedList;
        MethodCollector.m26663i(1654);
        C89219l.m154721d(context, "");
        C29913a.C29915b bVar = new C29913a.C29915b();
        String str = C17867d.f42591o;
        String str2 = C17867d.f42592p;
        bVar.f71362a = str;
        bVar.f71363b = str2;
        bVar.f71365d = C17867d.f42595s;
        bVar.f71364c = C29913a.EnumC29914a.RELEASE;
        bVar.f71366e = AppLog.getServerDeviceId();
        bVar.f71368g = C17867d.m33085f();
        bVar.f71369h = (int) C17867d.m33084e();
        bVar.f71370i = C17867d.f42590n;
        C29913a aVar = new C29913a();
        if (!TextUtils.isEmpty(bVar.f71362a)) {
            aVar.f71351a = bVar.f71362a;
        }
        if (!TextUtils.isEmpty(bVar.f71363b)) {
            aVar.f71352b = bVar.f71363b;
        }
        if (bVar.f71364c != null) {
            aVar.f71353c = bVar.f71364c;
        }
        if (!TextUtils.isEmpty(bVar.f71365d)) {
            aVar.f71354d = bVar.f71365d;
        }
        if (!TextUtils.isEmpty(bVar.f71366e)) {
            aVar.f71355e = bVar.f71366e;
        }
        if (!TextUtils.isEmpty(bVar.f71367f)) {
            aVar.f71360j = bVar.f71367f;
        }
        if (!TextUtils.isEmpty(bVar.f71368g)) {
            aVar.f71356f = bVar.f71368g;
        }
        if (bVar.f71369h != 0) {
            aVar.f71357g = bVar.f71369h;
        }
        aVar.f71359i = bVar.f71371j;
        aVar.f71358h = bVar.f71370i;
        C89219l.m154716b(aVar, "");
        Application application = this.f43406a;
        boolean a = C29843f.m60129a(context);
        C29921d dVar = C29921d.C29923a.f71406a;
        dVar.f71402f = application;
        dVar.f71403g = aVar;
        C29916a aVar2 = new C29916a();
        String a2 = aVar2.mo52223a();
        if (!TextUtils.isEmpty(a2) && a) {
            if (!(dVar.f71402f == null || dVar.f71403g == null)) {
                aVar2.mo52224a(dVar.f71402f, dVar.f71403g);
            }
            dVar.f71398a.put(a2, aVar2);
        }
        if (C18214a.m33891b()) {
            dVar.f71400c.set(true);
            if (dVar.f71399b.get() && !dVar.f71401e.isEmpty()) {
                synchronized (dVar.f71401e) {
                    try {
                        linkedList = new LinkedList(dVar.f71401e);
                        dVar.f71401e.clear();
                        C29921d.f71397d.clear();
                    } catch (Throwable th) {
                        MethodCollector.m26664o(1654);
                        throw th;
                    }
                }
                long j = 0;
                while (!linkedList.isEmpty()) {
                    j += 100;
                    C29920c cVar = (C29920c) linkedList.poll();
                    if (C18214a.m33892c()) {
                        C58254p.f132679a.postDelayed(new RunnableC29924e(dVar, cVar), j);
                    } else {
                        dVar.mo52231a(cVar);
                    }
                }
            }
            C58254p.f132679a.postDelayed(new Runnable() {
                /* class com.p2082ss.android.p2144h.C29921d.RunnableC299221 */

                static {
                    Covode.recordClassIndex(36333);
                }

                public final void run() {
                    C29921d.this.f71399b.set(true);
                    C29921d.this.mo52228a();
                }
            }, 5000);
        } else {
            dVar.f71399b.set(true);
            dVar.mo52228a();
        }
        C18230f.f43422a = true;
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(RunnableC18231g.f43424a);
        MethodCollector.m26664o(1654);
    }
}

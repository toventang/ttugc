package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.C61411k;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40782h;
import com.p2082ss.android.ugc.aweme.p2719cv.C40784i;
import com.p2082ss.android.ugc.aweme.p2719cv.C40785j;
import com.p2082ss.android.ugc.aweme.p2719cv.C40786k;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p2719cv.RunnableC40773e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask */
public final class ThreadPoolInjectTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68643);
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
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return C58444q.f133061a;
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

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        C58945a.C58947b.f134185a.mo96425a("method_thread_pool_inject_duration", false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC40793o.IO);
        arrayList.add(EnumC40793o.DEFAULT);
        arrayList.add(EnumC40793o.SERIAL);
        arrayList.add(EnumC40793o.BACKGROUND);
        C40782h.C40783a a = C40782h.m82258a();
        a.f95488a = false;
        a.f95489b = (List) C40782h.m82259a(arrayList);
        a.f95490c = (List) C40782h.m82259a(C40784i.f95494a);
        a.f95491d = C40782h.m82257a(TimeUnit.MINUTES.toMillis(5));
        a.f95492e = C40782h.m82257a(TimeUnit.MINUTES.toMillis(5));
        a.f95493f = C40782h.m82257a(TimeUnit.MINUTES.toMillis(15));
        C40780g.f95475a = a.mo70024a();
        C40780g.f95476b = new C40786k();
        C61411k.f139438a = C40780g.m82241a();
        C29339a.m58752a(RunnableC40773e.f95452a);
        ExecutorService a2 = C40780g.m82241a();
        RunnableC13596e.f33067b = a2;
        RunnableC13596e.f33068c = a2;
        C13590c.f33035a = C40780g.m82245b();
        AbstractC88434g<? super AbstractC88398aa, ? extends AbstractC88398aa> gVar = C40785j.f95495a;
        if (!C88925a.f201955w) {
            C88925a.f201941i = gVar;
            C58945a.C58947b.f134185a.mo96429b("method_thread_pool_inject_duration", false);
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}

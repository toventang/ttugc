package com.bytedance.geckox.p1017e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.p1029c.AbstractRunnableC14985c;
import com.bytedance.p1603q.AbstractC21931b;
import com.bytedance.p1603q.AbstractC21935d;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.geckox.e.l */
public class C14923l extends AbstractC21935d<List<UpdatePackage>, UpdatePackage> {

    /* renamed from: a */
    public static AtomicInteger f36463a = new AtomicInteger(1);

    /* renamed from: b */
    public static AtomicInteger f36464b = new AtomicInteger(0);

    /* renamed from: j */
    private Executor f36465j;

    /* renamed from: k */
    private OptionCheckUpdateParams f36466k;

    static {
        Covode.recordClassIndex(17036);
    }

    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final void mo24021a(Object... objArr) {
        super.mo24021a(objArr);
        if (objArr == null) {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95505c = 2;
            this.f36465j = C40780g.m82242a(a.mo70028a());
        } else if (objArr[0] instanceof Executor) {
            this.f36465j = (Executor) objArr[0];
            if (objArr[1] == null) {
                this.f36466k = null;
            } else {
                this.f36466k = (OptionCheckUpdateParams) objArr[1];
            }
        } else {
            throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.p1603q.AbstractC21935d
    /* renamed from: a */
    public final /* synthetic */ Object mo24020a(final AbstractC21931b<UpdatePackage> bVar, List<UpdatePackage> list) {
        final int i;
        List<UpdatePackage> list2 = list;
        OptionCheckUpdateParams optionCheckUpdateParams = this.f36466k;
        if (optionCheckUpdateParams != null) {
            i = optionCheckUpdateParams.getChannelUpdatePriority();
        } else {
            i = 1;
        }
        f36464b.addAndGet(list2.size());
        for (final UpdatePackage updatePackage : list2) {
            this.f36465j.execute(new AbstractRunnableC14985c(((3 - i) * 100000) + f36463a.getAndIncrement(), updatePackage.getAccessKey() + "-" + updatePackage.getChannel()) {
                /* class com.bytedance.geckox.p1017e.C14923l.C149241 */

                static {
                    Covode.recordClassIndex(17037);
                }

                public final void run() {
                    try {
                        bVar.mo35694a("update_priority", Integer.valueOf(i));
                        bVar.mo35692a(updatePackage);
                        if (C14923l.f36464b.decrementAndGet() == 0) {
                            C14923l.f36463a.set(0);
                        }
                    } catch (Throwable th) {
                        C14923l lVar = C14923l.this;
                        if (lVar.f51921g != null) {
                            lVar.f51921g.mo35696c(lVar.f51922h, lVar, th);
                        }
                    }
                }
            });
        }
        return null;
    }
}

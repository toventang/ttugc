package com.bytedance.android.live.copyrightreview.helper;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.live.copyrightreview.helper.a */
final /* synthetic */ class RunnableC3815a implements Runnable {

    /* renamed from: a */
    private final CopyrightViolationHelper f10552a;

    static {
        Covode.recordClassIndex(4344);
    }

    RunnableC3815a(CopyrightViolationHelper copyrightViolationHelper) {
        this.f10552a = copyrightViolationHelper;
    }

    public final void run() {
        CopyrightViolationHelper copyrightViolationHelper = this.f10552a;
        copyrightViolationHelper.f10546b.show();
        copyrightViolationHelper.f10547c = AbstractC88979t.m154307b(20000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C3817c(copyrightViolationHelper));
    }
}

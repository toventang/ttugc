package com.p2082ss.android.ugc.aweme.initializer;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.port.p3561in.ISchedulerService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.initializer.c */
final /* synthetic */ class C56773c implements ISchedulerService {

    /* renamed from: a */
    static final ISchedulerService f129332a = new C56773c();

    static {
        Covode.recordClassIndex(66638);
    }

    private C56773c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.ISchedulerService
    public final void schedule(Handler handler, Callable callable, int i) {
        C34608n.m70658a().mo61083a(handler, callable, i);
    }
}

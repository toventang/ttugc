package android.p003ss.com.vboost.p007d;

import android.p003ss.com.vboost.p006c.C0029c;
import android.p003ss.com.vboost.p007d.C0051f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* renamed from: android.ss.com.vboost.d.h */
public final class CallableC0056h implements Callable<Integer> {

    /* renamed from: a */
    public ScheduledFuture<Integer> f208a;

    /* renamed from: b */
    private final C0048d f209b;

    static {
        Covode.recordClassIndex(59);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Integer call() {
        if (!(this.f209b.f178k == EnumC0055g.USER_CANCEL || this.f209b.f178k == EnumC0055g.USE_PROVIDERS)) {
            this.f209b.f176i = true;
            C0029c.m64a().mo32c(this.f209b);
        }
        C0051f.C0054a.f206a.mo42a(this.f209b, true);
        return null;
    }

    CallableC0056h(C0048d dVar) {
        this.f209b = dVar;
    }
}

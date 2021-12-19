package com.bytedance.sdk.p1625a.p1657l.p1658a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.a.l.a.a */
public abstract class AbstractC22484a<T> {

    /* renamed from: a */
    private static ExecutorService f53152a;

    /* renamed from: e */
    static final Handler f53153e = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo36768a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36769a(T t) {
    }

    /* renamed from: b */
    public final void mo36770b() {
        f53152a.execute(new Runnable() {
            /* class com.bytedance.sdk.p1625a.p1657l.p1658a.AbstractC22484a.RunnableC224851 */

            static {
                Covode.recordClassIndex(26301);
            }

            public final void run() {
                try {
                    AbstractC22484a aVar = AbstractC22484a.this;
                    AbstractC22484a.f53153e.post(new Runnable(aVar.mo36768a()) {
                        /* class com.bytedance.sdk.p1625a.p1657l.p1658a.AbstractC22484a.RunnableC224862 */

                        /* renamed from: a */
                        final /* synthetic */ Object f53155a;

                        static {
                            Covode.recordClassIndex(26302);
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.sdk.a.l.a.a */
                        /* JADX WARN: Multi-variable type inference failed */
                        public final void run() {
                            AbstractC22484a.this.mo36769a(this.f53155a);
                        }

                        {
                            this.f53155a = r2;
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    static {
        Covode.recordClassIndex(26300);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        f53152a = C40780g.m82242a(a.mo70028a());
    }
}

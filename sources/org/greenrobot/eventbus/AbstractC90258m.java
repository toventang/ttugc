package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

/* renamed from: org.greenrobot.eventbus.m */
public interface AbstractC90258m {
    static {
        Covode.recordClassIndex(106529);
    }

    /* renamed from: a */
    AbstractC90263q mo145417a(EventBus eventBus);

    /* renamed from: a */
    boolean mo145418a();

    /* renamed from: org.greenrobot.eventbus.m$a */
    public static class C90259a implements AbstractC90258m {

        /* renamed from: a */
        private final Looper f205024a;

        static {
            Covode.recordClassIndex(106530);
        }

        @Override // org.greenrobot.eventbus.AbstractC90258m
        /* renamed from: a */
        public final boolean mo145418a() {
            if (this.f205024a == Looper.myLooper()) {
                return true;
            }
            return false;
        }

        public C90259a(Looper looper) {
            this.f205024a = looper;
        }

        @Override // org.greenrobot.eventbus.AbstractC90258m
        /* renamed from: a */
        public final AbstractC90263q mo145417a(EventBus eventBus) {
            return new HandlerC90251h(eventBus, this.f205024a);
        }
    }
}

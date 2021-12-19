package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import java.util.Date;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.t */
public abstract class AbstractC87655t {

    /* renamed from: com.ttnet.org.chromium.net.t$b */
    public static abstract class AbstractC87657b {
        static {
            Covode.recordClassIndex(103639);
        }

        /* renamed from: a */
        public abstract Date mo141931a();

        /* renamed from: b */
        public abstract Date mo141932b();

        /* renamed from: c */
        public abstract Date mo141933c();

        /* renamed from: d */
        public abstract Date mo141934d();

        /* renamed from: e */
        public abstract Date mo141935e();

        /* renamed from: f */
        public abstract Date mo141936f();

        /* renamed from: g */
        public abstract Date mo141937g();

        /* renamed from: h */
        public abstract Date mo141938h();

        /* renamed from: i */
        public abstract Date mo141939i();

        /* renamed from: j */
        public abstract Date mo141940j();

        /* renamed from: k */
        public abstract Date mo141941k();

        /* renamed from: l */
        public abstract Date mo141942l();

        /* renamed from: m */
        public abstract Date mo141943m();

        /* renamed from: n */
        public abstract boolean mo141944n();

        /* renamed from: o */
        public abstract Long mo141945o();

        /* renamed from: p */
        public abstract Long mo141946p();

        /* renamed from: q */
        public abstract Long mo141947q();

        /* renamed from: r */
        public abstract Long mo141948r();

        /* renamed from: s */
        public abstract Date mo141949s();

        /* renamed from: t */
        public abstract String mo141950t();

        /* renamed from: u */
        public abstract Long mo141951u();

        /* renamed from: v */
        public abstract Long mo141952v();

        /* renamed from: w */
        public abstract String mo141953w();

        /* renamed from: x */
        public abstract String mo141954x();
    }

    static {
        Covode.recordClassIndex(103637);
    }

    /* renamed from: a */
    public abstract String mo141996a();

    /* renamed from: b */
    public abstract AbstractC87657b mo141997b();

    /* renamed from: c */
    public abstract int mo141998c();

    /* renamed from: d */
    public abstract AbstractC87533ac mo141999d();

    /* renamed from: e */
    public abstract AbstractC87540d mo142000e();

    /* renamed from: com.ttnet.org.chromium.net.t$a */
    public static abstract class AbstractC87656a {
        private final Executor mExecutor;

        static {
            Covode.recordClassIndex(103638);
        }

        public abstract void onRequestFinished(AbstractC87655t tVar);

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public AbstractC87656a(Executor executor) {
            if (executor != null) {
                this.mExecutor = executor;
                return;
            }
            throw new IllegalStateException("Executor must not be null");
        }
    }
}

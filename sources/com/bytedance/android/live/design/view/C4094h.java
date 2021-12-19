package com.bytedance.android.live.design.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.design.view.h */
public class C4094h {

    /* renamed from: a */
    protected Context f11336a;

    /* renamed from: b */
    protected View f11337b;

    /* renamed from: c */
    protected View f11338c;

    /* renamed from: d */
    protected int f11339d;

    /* renamed from: e */
    protected int f11340e;

    /* renamed from: f */
    protected int f11341f;

    /* renamed from: g */
    protected long f11342g;

    /* renamed from: h */
    protected int f11343h;

    /* renamed from: i */
    protected boolean f11344i;

    /* renamed from: j */
    protected AbstractC4085c f11345j;

    /* renamed from: k */
    protected AbstractC4084b f11346k;

    static {
        Covode.recordClassIndex(4639);
    }

    /* renamed from: com.bytedance.android.live.design.view.h$a */
    public static class C4095a<T extends C4095a<T>> {

        /* renamed from: b */
        protected Context f11347b;

        /* renamed from: c */
        protected View f11348c;

        /* renamed from: d */
        protected View f11349d;

        /* renamed from: e */
        protected int f11350e = 48;

        /* renamed from: f */
        protected int f11351f;

        /* renamed from: g */
        protected int f11352g;

        /* renamed from: h */
        protected long f11353h;

        /* renamed from: i */
        protected boolean f11354i;

        /* renamed from: j */
        protected int f11355j;

        /* renamed from: k */
        protected boolean f11356k;

        /* renamed from: l */
        protected AbstractC4085c f11357l;

        /* renamed from: m */
        protected AbstractC4084b f11358m;

        /* renamed from: n */
        protected boolean f11359n = true;

        static {
            Covode.recordClassIndex(4640);
        }

        /* renamed from: d */
        public final T mo9559d() {
            this.f11359n = false;
            return this;
        }

        /* renamed from: c */
        public final T mo9558c() {
            this.f11350e = 80;
            return this;
        }

        /* renamed from: b */
        public C4094h mo9530b() {
            return new C4094h(this);
        }

        /* renamed from: a */
        public T mo9529a(View view) {
            this.f11349d = view;
            return this;
        }

        /* renamed from: a */
        public final T mo9554a(long j) {
            this.f11353h = j;
            this.f11354i = true;
            return this;
        }

        /* renamed from: b */
        public final T mo9557b(int i) {
            this.f11355j = i;
            this.f11356k = true;
            return this;
        }

        /* renamed from: a */
        public final T mo9555a(AbstractC4084b bVar) {
            this.f11358m = bVar;
            return this;
        }

        public C4095a(View view) {
            this.f11348c = view;
            if (view != null) {
                this.f11347b = view.getContext();
            }
        }

        /* renamed from: a */
        public final T mo9556a(AbstractC4085c cVar) {
            this.f11357l = cVar;
            return this;
        }
    }

    protected C4094h(C4095a<?> aVar) {
        Context context = aVar.f11347b;
        this.f11336a = context;
        if (context != null) {
            if (!aVar.f11354i) {
                this.f11342g = (long) m9910a(this.f11336a.getResources());
            } else {
                this.f11342g = aVar.f11353h;
            }
            if (!aVar.f11356k) {
                this.f11343h = this.f11336a.getResources().getDimensionPixelSize(R.dimen.z5);
            } else {
                this.f11343h = aVar.f11355j;
            }
        }
        this.f11337b = aVar.f11348c;
        this.f11338c = aVar.f11349d;
        this.f11339d = aVar.f11350e;
        this.f11340e = aVar.f11351f;
        this.f11341f = aVar.f11352g;
        this.f11344i = aVar.f11359n;
        this.f11345j = aVar.f11357l;
        this.f11346k = aVar.f11358m;
    }

    /* renamed from: a */
    private static int m9910a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.bi);
        if (matchConfig == null) {
            return resources.getInteger(R.integer.bi);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(R.integer.bi);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i = 0; i < min; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(R.integer.bi);
        }
    }
}

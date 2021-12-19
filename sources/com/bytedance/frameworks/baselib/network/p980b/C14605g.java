package com.bytedance.frameworks.baselib.network.p980b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.frameworks.baselib.network.b.g */
public final class C14605g {

    /* renamed from: a */
    public ThreadPoolExecutor f35304a;

    /* renamed from: b */
    public ThreadPoolExecutor f35305b;

    /* renamed from: c */
    public int f35306c;

    /* renamed from: d */
    public int f35307d;

    /* renamed from: e */
    public int f35308e;

    /* renamed from: f */
    public int f35309f;

    /* renamed from: g */
    public long f35310g;

    /* renamed from: h */
    public long f35311h;

    /* renamed from: i */
    public long f35312i;

    /* renamed from: j */
    public boolean f35313j;

    static {
        Covode.recordClassIndex(16696);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.b.g$a */
    public static final class C14606a {

        /* renamed from: a */
        public ThreadPoolExecutor f35314a;

        /* renamed from: b */
        public ThreadPoolExecutor f35315b;

        /* renamed from: c */
        public int f35316c;

        /* renamed from: d */
        public int f35317d;

        /* renamed from: e */
        public int f35318e;

        /* renamed from: f */
        public int f35319f;

        /* renamed from: g */
        public long f35320g;

        /* renamed from: h */
        public long f35321h;

        /* renamed from: i */
        public long f35322i;

        /* renamed from: j */
        public boolean f35323j = true;

        static {
            Covode.recordClassIndex(16697);
        }

        /* renamed from: a */
        public final C14606a mo23483a() {
            this.f35316c = 8;
            this.f35318e = 8;
            return this;
        }

        /* renamed from: b */
        public final C14606a mo23484b() {
            this.f35317d = 8;
            this.f35319f = 8;
            return this;
        }

        /* renamed from: c */
        public final C14606a mo23485c() {
            this.f35320g = 30;
            return this;
        }

        /* renamed from: d */
        public final C14606a mo23486d() {
            this.f35321h = 10;
            return this;
        }

        /* renamed from: e */
        public final C14606a mo23487e() {
            this.f35322i = 10;
            return this;
        }

        /* renamed from: f */
        public final C14605g mo23488f() {
            return new C14605g(this, (byte) 0);
        }
    }

    private C14605g(C14606a aVar) {
        this.f35306c = 8;
        this.f35307d = 8;
        this.f35308e = 8;
        this.f35309f = 8;
        this.f35310g = 30;
        this.f35311h = 10;
        this.f35312i = 10;
        this.f35313j = true;
        if (aVar.f35315b != null) {
            this.f35304a = aVar.f35315b;
        }
        if (aVar.f35314a != null) {
            this.f35305b = aVar.f35314a;
        }
        if (aVar.f35316c > 0) {
            this.f35306c = aVar.f35316c;
        }
        if (aVar.f35317d > 0) {
            this.f35307d = aVar.f35317d;
        }
        if (aVar.f35318e > 0) {
            this.f35308e = aVar.f35318e;
        }
        if (aVar.f35319f > 0) {
            this.f35309f = aVar.f35319f;
        }
        if (aVar.f35320g > 0) {
            this.f35310g = aVar.f35320g;
        }
        if (aVar.f35321h > 0) {
            this.f35311h = aVar.f35321h;
        }
        if (aVar.f35322i > 0) {
            this.f35312i = aVar.f35322i;
        }
        this.f35313j = aVar.f35323j;
    }

    /* synthetic */ C14605g(C14606a aVar, byte b) {
        this(aVar);
    }
}

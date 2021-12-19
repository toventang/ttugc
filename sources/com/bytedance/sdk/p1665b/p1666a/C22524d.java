package com.bytedance.sdk.p1665b.p1666a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1667b.C22533d;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.b.a.d */
public final class C22524d {

    /* renamed from: a */
    public Context f53234a;

    /* renamed from: b */
    public boolean f53235b;

    /* renamed from: c */
    public AbstractC22523c f53236c;

    /* renamed from: d */
    public AbstractC22522b f53237d;

    /* renamed from: e */
    public AbstractC22521a f53238e;

    /* renamed from: f */
    public Set<String> f53239f;

    /* renamed from: g */
    public String f53240g;

    /* renamed from: h */
    public ExecutorService f53241h;

    /* renamed from: i */
    public int f53242i;

    /* renamed from: j */
    public C22533d f53243j;

    /* renamed from: k */
    public boolean f53244k;

    /* renamed from: com.bytedance.sdk.b.a.d$a */
    public static final class C22525a {

        /* renamed from: a */
        public AbstractC22523c f53245a;

        /* renamed from: b */
        public Context f53246b;

        /* renamed from: c */
        public boolean f53247c;

        /* renamed from: d */
        public AbstractC22522b f53248d;

        /* renamed from: e */
        public AbstractC22521a f53249e;

        /* renamed from: f */
        public Set<String> f53250f;

        /* renamed from: g */
        public String f53251g;

        /* renamed from: h */
        public ExecutorService f53252h;

        /* renamed from: i */
        public int f53253i;

        /* renamed from: j */
        public boolean f53254j = true;

        static {
            Covode.recordClassIndex(26341);
        }
    }

    static {
        Covode.recordClassIndex(26340);
    }

    private C22524d() {
        this.f53244k = true;
    }

    private C22524d(C22525a aVar) {
        this.f53244k = true;
        this.f53236c = aVar.f53245a;
        this.f53234a = aVar.f53246b;
        this.f53235b = aVar.f53247c;
        this.f53237d = aVar.f53248d;
        this.f53238e = aVar.f53249e;
        this.f53239f = aVar.f53250f;
        this.f53240g = aVar.f53251g;
        this.f53241h = aVar.f53252h;
        int i = aVar.f53253i;
        this.f53242i = i;
        if (i <= 0) {
            this.f53242i = 1800;
        }
        this.f53244k = aVar.f53254j;
    }

    public /* synthetic */ C22524d(C22525a aVar, byte b) {
        this(aVar);
    }
}

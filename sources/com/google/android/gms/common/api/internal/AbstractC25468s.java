package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25335a.AbstractC25337b;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.common.api.internal.s */
public abstract class AbstractC25468s<A extends C25335a.AbstractC25337b, ResultT> {

    /* renamed from: a */
    public final Feature[] f60455a;

    /* renamed from: b */
    public final boolean f60456b;

    static {
        Covode.recordClassIndex(30867);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41631a(A a, C25632i<ResultT> iVar);

    public AbstractC25468s() {
    }

    /* renamed from: com.google.android.gms.common.api.internal.s$a */
    public static class C25469a<A extends C25335a.AbstractC25337b, ResultT> {

        /* renamed from: a */
        public AbstractC25464o<A, C25632i<ResultT>> f60457a;

        /* renamed from: b */
        public boolean f60458b;

        /* renamed from: c */
        public Feature[] f60459c;

        static {
            Covode.recordClassIndex(30868);
        }

        private C25469a() {
            this.f60458b = true;
        }

        /* renamed from: a */
        public final AbstractC25468s<A, ResultT> mo41715a() {
            boolean z;
            if (this.f60457a != null) {
                z = true;
            } else {
                z = false;
            }
            C25565r.m49325b(z, "execute parameter required");
            return new C25411bu(this, this.f60459c, this.f60458b);
        }

        /* synthetic */ C25469a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static <A extends C25335a.AbstractC25337b, ResultT> C25469a<A, ResultT> m49130a() {
        return new C25469a<>((byte) 0);
    }

    private AbstractC25468s(Feature[] featureArr, boolean z) {
        this.f60455a = featureArr;
        this.f60456b = z;
    }

    /* synthetic */ AbstractC25468s(Feature[] featureArr, boolean z, byte b) {
        this(featureArr, z);
    }
}

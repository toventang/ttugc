package com.airbnb.epoxy;

import com.airbnb.epoxy.AbstractC1944n;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.epoxy.s */
public abstract class AbstractC1956s<T> {

    /* renamed from: h */
    private static long f5837h = -1;

    /* renamed from: a */
    public long f5838a;

    /* renamed from: b */
    public boolean f5839b;

    /* renamed from: c */
    boolean f5840c;

    /* renamed from: d */
    AbstractC1944n f5841d;

    /* renamed from: e */
    public boolean f5842e;

    /* renamed from: f */
    public int f5843f;

    /* renamed from: g */
    public boolean f5844g;

    /* renamed from: i */
    private int f5845i;

    /* renamed from: j */
    private AbstractC1944n f5846j;

    /* renamed from: k */
    private AbstractC1958a f5847k;

    /* renamed from: com.airbnb.epoxy.s$a */
    public interface AbstractC1958a {
        static {
            Covode.recordClassIndex(2149);
        }

        /* renamed from: a */
        int mo5804a();
    }

    /* renamed from: a */
    public void mo5788a(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo5792b();

    /* renamed from: b */
    public void mo5794b(T t) {
    }

    /* renamed from: c */
    public boolean mo5796c(T t) {
        return false;
    }

    /* renamed from: f */
    public int mo5800f() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5783a() {
        return mo5795c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo5797d() {
        if (this.f5846j != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(2147);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractC1956s() {
        /*
            r6 = this;
            long r4 = com.airbnb.epoxy.AbstractC1956s.f5837h
            r2 = 1
            long r0 = r4 - r2
            com.airbnb.epoxy.AbstractC1956s.f5837h = r0
            r6.<init>(r4)
            r0 = 1
            r6.f5844g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.AbstractC1956s.<init>():void");
    }

    /* renamed from: c */
    public final int mo5795c() {
        int i = this.f5845i;
        if (i == 0) {
            return mo5792b();
        }
        return i;
    }

    /* renamed from: g */
    public final int mo5801g() {
        AbstractC1958a aVar = this.f5847k;
        if (aVar != null) {
            return aVar.mo5804a();
        }
        return mo5800f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo5798e() {
        if (!mo5797d() || this.f5842e) {
            AbstractC1944n nVar = this.f5841d;
            if (nVar != null) {
                nVar.setStagedModel(this);
                return;
            }
            return;
        }
        throw new C1979z(this, m6194a(this.f5846j, (AbstractC1956s<?>) this));
    }

    public int hashCode() {
        long j = this.f5838a;
        return (((((int) (j ^ (j >>> 32))) * 31) + mo5795c()) * 31) + (this.f5839b ? 1 : 0);
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.f5838a + ", viewType=" + mo5795c() + ", shown=" + this.f5839b + ", addedToAdapter=" + this.f5840c + '}';
    }

    /* renamed from: a */
    public void mo5787a(AbstractC1944n nVar) {
        nVar.addInternal(this);
    }

    /* renamed from: a */
    public AbstractC1956s<T> mo5784a(int i) {
        mo5798e();
        this.f5845i = i;
        return this;
    }

    private AbstractC1956s(long j) {
        this.f5839b = true;
        mo5785a(j);
    }

    /* renamed from: a */
    public AbstractC1956s<T> mo5785a(long j) {
        if ((this.f5840c || this.f5846j != null) && j != this.f5838a) {
            throw new C1978y("Cannot change a model's id after it has been added to the adapter.");
        }
        this.f5844g = false;
        this.f5838a = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5793b(AbstractC1944n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        } else if (nVar.isModelAddedMultipleTimes(this)) {
            throw new C1978y("This model was already added to the controller at position " + nVar.getFirstIndexOfModelInBuildingList(this));
        } else if (this.f5846j == null) {
            this.f5846j = nVar;
            this.f5843f = hashCode();
            nVar.addAfterInterceptorCallback(new AbstractC1944n.AbstractC1950c() {
                /* class com.airbnb.epoxy.AbstractC1956s.C19571 */

                static {
                    Covode.recordClassIndex(2148);
                }

                @Override // com.airbnb.epoxy.AbstractC1944n.AbstractC1950c
                /* renamed from: a */
                public final void mo5779a() {
                    AbstractC1956s.this.f5842e = true;
                }

                @Override // com.airbnb.epoxy.AbstractC1944n.AbstractC1950c
                /* renamed from: b */
                public final void mo5780b() {
                    AbstractC1956s sVar = AbstractC1956s.this;
                    sVar.f5843f = sVar.hashCode();
                    AbstractC1956s.this.f5842e = false;
                }
            });
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1956s)) {
            return false;
        }
        AbstractC1956s sVar = (AbstractC1956s) obj;
        if (this.f5838a == sVar.f5838a && mo5795c() == sVar.mo5795c() && this.f5839b == sVar.f5839b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC1956s<T> mo5786a(CharSequence charSequence) {
        long j;
        if (charSequence == null) {
            j = 0;
        } else {
            j = -3750763034362895579L;
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                j = (j ^ ((long) charSequence.charAt(i))) * 1099511628211L;
            }
        }
        mo5785a(j);
        return this;
    }

    /* renamed from: a */
    private static int m6194a(AbstractC1944n nVar, AbstractC1956s<?> sVar) {
        if (nVar.isBuildingModels()) {
            return nVar.getFirstIndexOfModelInBuildingList(sVar);
        }
        return nVar.getAdapter().mo5713a(sVar);
    }

    /* renamed from: a */
    public void mo5789a(T t, AbstractC1956s<?> sVar) {
        mo5788a((Object) t);
    }

    /* renamed from: a */
    public void mo5790a(T t, List<Object> list) {
        mo5788a((Object) t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5791a(String str, int i) {
        if (mo5797d() && !this.f5842e && this.f5843f != hashCode()) {
            throw new C1979z(this, str, i);
        }
    }
}

package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28017j;
import com.google.gson.AbstractC28018k;
import com.google.gson.AbstractC28019l;
import com.google.gson.AbstractC28026s;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C28021n;
import com.google.gson.internal.C27921a;
import com.google.gson.internal.C28009k;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends AbstractC28031v<T> {

    /* renamed from: a */
    final C27910f f65629a;

    /* renamed from: b */
    private final AbstractC28026s<T> f65630b;

    /* renamed from: c */
    private final AbstractC28018k<T> f65631c;

    /* renamed from: d */
    private final C27895a<T> f65632d;

    /* renamed from: e */
    private final AbstractC28033w f65633e;

    /* renamed from: f */
    private final TreeTypeAdapter<T>.C27934a f65634f = new C27934a(this, (byte) 0);

    /* renamed from: g */
    private AbstractC28031v<T> f65635g;

    static {
        Covode.recordClassIndex(33538);
    }

    /* renamed from: a */
    private AbstractC28031v<T> m55998a() {
        AbstractC28031v<T> vVar = this.f65635g;
        if (vVar != null) {
            return vVar;
        }
        AbstractC28031v<T> a = this.f65629a.mo46664a(this.f65633e, this.f65632d);
        this.f65635g = a;
        return a;
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$a */
    final class C27934a implements AbstractC28017j {
        static {
            Covode.recordClassIndex(33540);
        }

        private C27934a() {
        }

        /* synthetic */ C27934a(TreeTypeAdapter treeTypeAdapter, byte b) {
            this();
        }

        @Override // com.google.gson.AbstractC28017j
        /* renamed from: a */
        public final <R> R mo46724a(AbstractC28019l lVar, Type type) {
            return (R) TreeTypeAdapter.this.f65629a.mo46668a(lVar, type);
        }
    }

    @Override // com.google.gson.AbstractC28031v
    public final T read(C27897a aVar) {
        if (this.f65631c == null) {
            return m55998a().read(aVar);
        }
        AbstractC28019l a = C28009k.m56099a(aVar);
        if (a instanceof C28021n) {
            return null;
        }
        return this.f65631c.mo11581a(a, this.f65632d.type, this.f65634f);
    }

    /* renamed from: a */
    public static AbstractC28033w m56000a(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    /* renamed from: a */
    public static AbstractC28033w m55999a(C27895a<?> aVar, Object obj) {
        boolean z;
        if (aVar.type == aVar.rawType) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, aVar, z, null);
    }

    @Override // com.google.gson.AbstractC28031v
    public final void write(C27900c cVar, T t) {
        AbstractC28026s<T> sVar = this.f65630b;
        if (sVar == null) {
            m55998a().write(cVar, t);
        } else if (t == null) {
            cVar.mo46654f();
        } else {
            C28009k.m56101a(sVar.mo16610a(t), cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class SingleTypeFactory implements AbstractC28033w {

        /* renamed from: a */
        private final C27895a<?> f65636a;

        /* renamed from: b */
        private final boolean f65637b;

        /* renamed from: c */
        private final Class<?> f65638c;

        /* renamed from: d */
        private final AbstractC28026s<?> f65639d;

        /* renamed from: e */
        private final AbstractC28018k<?> f65640e;

        static {
            Covode.recordClassIndex(33539);
        }

        @Override // com.google.gson.AbstractC28033w
        public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
            C27895a<?> aVar2 = this.f65636a;
            if (aVar2 != null) {
                if (!aVar2.equals(aVar) && (!this.f65637b || this.f65636a.type != aVar.rawType)) {
                    return null;
                }
            } else if (!this.f65638c.isAssignableFrom(aVar.rawType)) {
                return null;
            }
            return new TreeTypeAdapter(this.f65639d, this.f65640e, fVar, aVar, this);
        }

        SingleTypeFactory(Object obj, C27895a<?> aVar, boolean z, Class<?> cls) {
            AbstractC28026s<?> sVar;
            boolean z2;
            AbstractC28018k<?> kVar = null;
            if (obj instanceof AbstractC28026s) {
                sVar = (AbstractC28026s) obj;
            } else {
                sVar = null;
            }
            this.f65639d = sVar;
            kVar = obj instanceof AbstractC28018k ? (AbstractC28018k) obj : kVar;
            this.f65640e = kVar;
            if (sVar == null && kVar == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C27921a.m55969a(z2);
            this.f65636a = aVar;
            this.f65637b = z;
            this.f65638c = cls;
        }
    }

    public TreeTypeAdapter(AbstractC28026s<T> sVar, AbstractC28018k<T> kVar, C27910f fVar, C27895a<T> aVar, AbstractC28033w wVar) {
        this.f65630b = sVar;
        this.f65631c = kVar;
        this.f65629a = fVar;
        this.f65632d = aVar;
        this.f65633e = wVar;
    }
}

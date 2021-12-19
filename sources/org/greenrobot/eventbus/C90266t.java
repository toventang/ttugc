package org.greenrobot.eventbus;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;

/* renamed from: org.greenrobot.eventbus.t */
public class C90266t {

    /* renamed from: c */
    protected Method f205037c;

    /* renamed from: d */
    final ThreadMode f205038d;

    /* renamed from: e */
    final Class<?> f205039e;

    /* renamed from: f */
    final int f205040f;

    /* renamed from: g */
    final boolean f205041g;

    /* renamed from: h */
    String f205042h;

    static {
        Covode.recordClassIndex(106537);
    }

    /* renamed from: b */
    public Method mo145413b() {
        return this.f205037c;
    }

    public int hashCode() {
        return this.f205037c.hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo145412a() {
        MethodCollector.m26663i(12308);
        if (this.f205042h == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f205037c.getDeclaringClass().getName());
            sb.append('#').append(this.f205037c.getName());
            sb.append('(').append(this.f205039e.getName());
            this.f205042h = sb.toString();
        }
        MethodCollector.m26664o(12308);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C90266t)) {
            return false;
        }
        mo145412a();
        C90266t tVar = (C90266t) obj;
        tVar.mo145412a();
        return this.f205042h.equals(tVar.f205042h);
    }

    public C90266t(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f205037c = method;
        this.f205038d = threadMode;
        this.f205039e = cls;
        this.f205040f = i;
        this.f205041g = z;
    }
}

package com.bytedance.p1559o;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.o.d */
public final class C21580d implements Type {

    /* renamed from: a */
    final Class<?> f51186a;

    static {
        Covode.recordClassIndex(25221);
    }

    public final int hashCode() {
        return Objects.hash(this.f51186a);
    }

    public final String toString() {
        return "List<" + this.f51186a.toString() + ">";
    }

    C21580d(Class<?> cls) {
        this.f51186a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f51186a.equals(((C21580d) obj).f51186a);
    }
}

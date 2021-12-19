package com.bytedance.p1559o;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.o.e */
public final class C21581e implements Type {

    /* renamed from: a */
    final Class<?> f51187a;

    /* renamed from: b */
    final Class<?> f51188b;

    static {
        Covode.recordClassIndex(25222);
    }

    public final int hashCode() {
        return Objects.hash(this.f51187a, this.f51188b);
    }

    public final String toString() {
        return "Map<" + this.f51187a.toString() + "," + this.f51188b.toString() + ">";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C21581e eVar = (C21581e) obj;
            if (!this.f51187a.equals(eVar.f51187a) || !this.f51188b.equals(eVar.f51188b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    C21581e(Class<?> cls, Class<?> cls2) {
        this.f51187a = cls;
        this.f51188b = cls2;
    }
}

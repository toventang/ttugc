package com.bytedance.p1559o;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.o.r */
public final class C21605r implements Type {

    /* renamed from: a */
    final Class<?> f51242a;

    static {
        Covode.recordClassIndex(25246);
    }

    public final int hashCode() {
        return Objects.hash(this.f51242a);
    }

    public final String toString() {
        return "Set<" + this.f51242a.toString() + ">";
    }

    C21605r(Class<?> cls) {
        this.f51242a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f51242a.equals(((C21605r) obj).f51242a);
    }
}

package com.bytedance.p802b.p803a.p804a;

import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: com.bytedance.b.a.a.a */
public final class C12920a {

    /* renamed from: a */
    private Set<String> f31443a;

    /* renamed from: b */
    private Set<String> f31444b;

    static {
        Covode.recordClassIndex(14756);
    }

    public final String toString() {
        return "CommonEventConfig{sampledService=" + this.f31443a + ", sampledLogType=" + this.f31444b + '}';
    }

    /* renamed from: a */
    public final boolean mo20766a(String str) {
        Set<String> set = this.f31443a;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo20767b(String str) {
        Set<String> set = this.f31444b;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    public C12920a(Set<String> set, Set<String> set2) {
        this.f31443a = set;
        this.f31444b = set2;
    }
}

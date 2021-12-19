package com.bytedance.helios.api.p1088b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.d */
public final class C15306d {

    /* renamed from: a */
    public Object[] f37325a;

    /* renamed from: b */
    public String f37326b;

    /* renamed from: c */
    public Pair<Boolean, Object> f37327c;

    /* renamed from: d */
    public Object f37328d;

    /* renamed from: e */
    public Object f37329e;

    /* renamed from: f */
    public Set<String> f37330f;

    /* renamed from: g */
    public Set<Object> f37331g;

    static {
        Covode.recordClassIndex(17536);
    }

    public C15306d() {
        this(null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15306d)) {
            return false;
        }
        C15306d dVar = (C15306d) obj;
        return C89219l.m154714a(this.f37325a, dVar.f37325a) && C89219l.m154714a(this.f37326b, dVar.f37326b) && C89219l.m154714a(this.f37327c, dVar.f37327c) && C89219l.m154714a(this.f37328d, dVar.f37328d) && C89219l.m154714a(this.f37329e, dVar.f37329e) && C89219l.m154714a(this.f37330f, dVar.f37330f) && C89219l.m154714a(this.f37331g, dVar.f37331g);
    }

    public final int hashCode() {
        Object[] objArr = this.f37325a;
        int i = 0;
        int hashCode = (objArr != null ? Arrays.hashCode(objArr) : 0) * 31;
        String str = this.f37326b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Pair<Boolean, Object> pair = this.f37327c;
        int hashCode3 = (hashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        Object obj = this.f37328d;
        int hashCode4 = (hashCode3 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f37329e;
        int hashCode5 = (hashCode4 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Set<String> set = this.f37330f;
        int hashCode6 = (hashCode5 + (set != null ? set.hashCode() : 0)) * 31;
        Set<Object> set2 = this.f37331g;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "ControlExtra(parameters=" + Arrays.toString(this.f37325a) + ", returnType=" + this.f37326b + ", interceptResult=" + this.f37327c + ", apiInfo=" + this.f37328d + ", controlConfig=" + this.f37329e + ", eventRuleNames=" + this.f37330f + ", hitControlConfigs=" + this.f37331g + ")";
    }

    /* renamed from: a */
    public final void mo24825a(Pair<Boolean, Object> pair) {
        C89219l.m154719c(pair, "");
        this.f37327c = pair;
    }

    private C15306d(Object[] objArr, Pair<Boolean, Object> pair, Set<String> set, Set<Object> set2) {
        C89219l.m154719c(pair, "");
        C89219l.m154719c(set, "");
        C89219l.m154719c(set2, "");
        this.f37325a = objArr;
        this.f37326b = null;
        this.f37327c = pair;
        this.f37328d = null;
        this.f37329e = null;
        this.f37330f = set;
        this.f37331g = set2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15306d(Object[] objArr, Pair pair, Set set, Set set2, int i) {
        this((i & 1) != 0 ? null : objArr, (i & 4) != 0 ? new Pair(false, null) : pair, (i & 32) != 0 ? new LinkedHashSet() : set, (i & 64) != 0 ? new LinkedHashSet() : set2);
    }
}

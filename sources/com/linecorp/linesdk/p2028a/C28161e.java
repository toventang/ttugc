package com.linecorp.linesdk.p2028a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* renamed from: com.linecorp.linesdk.a.e */
public final class C28161e {

    /* renamed from: a */
    public final C28160d f65895a;

    /* renamed from: b */
    public final List<String> f65896b;

    static {
        Covode.recordClassIndex(34102);
    }

    public final int hashCode() {
        return (this.f65895a.hashCode() * 31) + this.f65896b.hashCode();
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=" + ((Object) "#####") + ", permissions=" + this.f65896b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28161e eVar = (C28161e) obj;
        if (!this.f65895a.equals(eVar.f65895a)) {
            return false;
        }
        return this.f65896b.equals(eVar.f65896b);
    }

    public C28161e(C28160d dVar, List<String> list) {
        this.f65895a = dVar;
        this.f65896b = Collections.unmodifiableList(list);
    }
}

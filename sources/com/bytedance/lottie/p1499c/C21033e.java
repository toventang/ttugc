package com.bytedance.lottie.p1499c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.e */
public final class C21033e {

    /* renamed from: a */
    public AbstractC21034f f49914a;

    /* renamed from: b */
    private final List<String> f49915b;

    static {
        Covode.recordClassIndex(24649);
    }

    /* renamed from: a */
    private boolean m39601a() {
        List<String> list = this.f49915b;
        return list.get(list.size() - 1).equals("**");
    }

    public final String toString() {
        boolean z;
        StringBuilder append = new StringBuilder("KeyPath{keys=").append(this.f49915b).append(",resolved=");
        if (this.f49914a != null) {
            z = true;
        } else {
            z = false;
        }
        return append.append(z).append('}').toString();
    }

    /* renamed from: a */
    public final C21033e mo34503a(AbstractC21034f fVar) {
        C21033e eVar = new C21033e(this);
        eVar.f49914a = fVar;
        return eVar;
    }

    public C21033e(String... strArr) {
        this.f49915b = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final C21033e mo34504a(String str) {
        C21033e eVar = new C21033e(this);
        eVar.f49915b.add(str);
        return eVar;
    }

    private C21033e(C21033e eVar) {
        this.f49915b = new ArrayList(eVar.f49915b);
        this.f49914a = eVar.f49914a;
    }

    /* renamed from: b */
    public final int mo34506b(String str, int i) {
        if (str.equals("__container")) {
            return 0;
        }
        if (!this.f49915b.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f49915b.size() - 1 && this.f49915b.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo34508d(String str, int i) {
        if (!str.equals("__container") && i >= this.f49915b.size() - 1 && !this.f49915b.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo34505a(String str, int i) {
        if (str.equals("__container")) {
            return true;
        }
        if (i >= this.f49915b.size()) {
            return false;
        }
        if (this.f49915b.get(i).equals(str) || this.f49915b.get(i).equals("**") || this.f49915b.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo34507c(String str, int i) {
        boolean z;
        boolean z2;
        if (i >= this.f49915b.size()) {
            return false;
        }
        if (i == this.f49915b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f49915b.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || (i == this.f49915b.size() - 2 && m39601a())) && z2) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            if (!this.f49915b.get(i + 1).equals(str)) {
                int i2 = i + 1;
                if (i2 < this.f49915b.size() - 1) {
                    return false;
                }
                return this.f49915b.get(i2).equals(str);
            } else if (i == this.f49915b.size() - 2 || (i == this.f49915b.size() - 3 && m39601a())) {
                return true;
            } else {
                return false;
            }
        }
    }
}

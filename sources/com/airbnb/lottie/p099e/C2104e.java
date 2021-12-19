package com.airbnb.lottie.p099e;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.e */
public final class C2104e {

    /* renamed from: a */
    public AbstractC2105f f6358a;

    /* renamed from: b */
    private final List<String> f6359b;

    static {
        Covode.recordClassIndex(2299);
    }

    /* renamed from: a */
    private boolean m6575a() {
        List<String> list = this.f6359b;
        return list.get(list.size() - 1).equals("**");
    }

    public final String toString() {
        boolean z;
        StringBuilder append = new StringBuilder("KeyPath{keys=").append(this.f6359b).append(",resolved=");
        if (this.f6358a != null) {
            z = true;
        } else {
            z = false;
        }
        return append.append(z).append('}').toString();
    }

    /* renamed from: a */
    public final C2104e mo5976a(AbstractC2105f fVar) {
        C2104e eVar = new C2104e(this);
        eVar.f6358a = fVar;
        return eVar;
    }

    public C2104e(String... strArr) {
        this.f6359b = Arrays.asList(strArr);
    }

    /* renamed from: a */
    public final C2104e mo5977a(String str) {
        C2104e eVar = new C2104e(this);
        eVar.f6359b.add(str);
        return eVar;
    }

    private C2104e(C2104e eVar) {
        this.f6359b = new ArrayList(eVar.f6359b);
        this.f6358a = eVar.f6358a;
    }

    /* renamed from: b */
    public final int mo5979b(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f6359b.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f6359b.size() - 1 && this.f6359b.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo5981d(String str, int i) {
        if (!"__container".equals(str) && i >= this.f6359b.size() - 1 && !this.f6359b.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5978a(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f6359b.size()) {
            return false;
        }
        if (this.f6359b.get(i).equals(str) || this.f6359b.get(i).equals("**") || this.f6359b.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo5980c(String str, int i) {
        boolean z;
        boolean z2;
        if (i >= this.f6359b.size()) {
            return false;
        }
        if (i == this.f6359b.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f6359b.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || (i == this.f6359b.size() - 2 && m6575a())) && z2) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            if (!this.f6359b.get(i + 1).equals(str)) {
                int i2 = i + 1;
                if (i2 < this.f6359b.size() - 1) {
                    return false;
                }
                return this.f6359b.get(i2).equals(str);
            } else if (i == this.f6359b.size() - 2 || (i == this.f6359b.size() - 3 && m6575a())) {
                return true;
            } else {
                return false;
            }
        }
    }
}

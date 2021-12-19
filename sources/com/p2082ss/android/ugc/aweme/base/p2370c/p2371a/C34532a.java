package com.p2082ss.android.ugc.aweme.base.p2370c.p2371a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.c.a.a */
public class C34532a<T> {

    /* renamed from: a */
    public final String f81533a;

    /* renamed from: b */
    public final T[] f81534b;

    static {
        Covode.recordClassIndex(41490);
    }

    /* renamed from: a */
    public final T mo60999a() {
        if (mo61000b()) {
            return this.f81534b[0];
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo61000b() {
        T[] tArr = this.f81534b;
        if (tArr == null || tArr.length == 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("action = [").append(this.f81533a).append("], args = ");
        if (this.f81534b != null) {
            sb.append("[");
            int i = 0;
            while (true) {
                T[] tArr = this.f81534b;
                if (i >= tArr.length) {
                    break;
                }
                sb.append((Object) tArr[i]);
                if (i != this.f81534b.length - 1) {
                    sb.append(",");
                }
                i++;
            }
            sb.append("]");
        } else {
            sb.append("null");
        }
        return sb.toString();
    }

    public C34532a(String str, T... tArr) {
        this.f81533a = str;
        this.f81534b = tArr;
    }
}

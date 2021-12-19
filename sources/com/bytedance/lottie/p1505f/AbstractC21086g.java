package com.bytedance.lottie.p1505f;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lottie.f.g */
public abstract class AbstractC21086g<T> {

    /* renamed from: a */
    private T[] f49962a = mo34556a();

    static {
        Covode.recordClassIndex(24702);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T[] mo34556a();

    /* renamed from: b */
    public final T mo34558b() {
        T[] tArr = this.f49962a;
        if (tArr[0] != null) {
            T t = tArr[0];
            tArr[0] = null;
            return t;
        } else if (tArr[1] != null) {
            T t2 = tArr[1];
            tArr[1] = null;
            return t2;
        } else if (tArr[2] == null) {
            return null;
        } else {
            T t3 = tArr[2];
            tArr[2] = null;
            return t3;
        }
    }

    /* renamed from: a */
    public final void mo34557a(T t) {
        T[] tArr = this.f49962a;
        if (tArr[0] == null) {
            tArr[0] = t;
        } else if (tArr[1] == null) {
            tArr[1] = t;
        } else if (tArr[2] == null) {
            tArr[2] = t;
        }
    }
}

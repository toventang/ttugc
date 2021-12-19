package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.utils.q */
public final class C11282q<E> {

    /* renamed from: a */
    public final List<E> f26985a;

    /* renamed from: b */
    private final int f26986b;

    static {
        Covode.recordClassIndex(12914);
    }

    /* renamed from: e */
    public final boolean mo18044e() {
        return this.f26985a.isEmpty();
    }

    /* renamed from: d */
    public final int mo18043d() {
        List<E> list = this.f26985a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo18039a() {
        List<E> list = this.f26985a;
        if (list != null && list.size() > 0) {
            this.f26985a.remove(0);
        }
    }

    /* renamed from: b */
    public final E mo18041b() {
        List<E> list = this.f26985a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<E> list2 = this.f26985a;
        return list2.get(list2.size() - 1);
    }

    /* renamed from: c */
    public final E mo18042c() {
        List<E> list = this.f26985a;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f26985a.get(0);
    }

    /* renamed from: a */
    public final void mo18040a(E e) {
        List<E> list = this.f26985a;
        if (list != null) {
            list.add(e);
            while (this.f26985a.size() > this.f26986b) {
                this.f26985a.remove(0);
            }
        }
    }

    public C11282q(Integer num, List<E> list) {
        int i;
        if (num.intValue() > 0) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.f26986b = i;
        this.f26985a = list;
    }
}

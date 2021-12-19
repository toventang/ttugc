package com.bytedance.lottie.p1495a.p1497b;

import android.graphics.Path;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.p1501b.C20998g;
import com.bytedance.lottie.p1499c.p1501b.C21006l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.g */
public final class C20961g {

    /* renamed from: a */
    public final List<AbstractC20954a<C21006l, Path>> f49672a;

    /* renamed from: b */
    public final List<AbstractC20954a<Integer, Integer>> f49673b;

    /* renamed from: c */
    public final List<C20998g> f49674c;

    static {
        Covode.recordClassIndex(24577);
    }

    public C20961g(List<C20998g> list) {
        this.f49674c = list;
        this.f49672a = new ArrayList(list.size());
        this.f49673b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f49672a.add(list.get(i).f49767b.mo34480a());
            this.f49673b.add(list.get(i).f49768c.mo34480a());
        }
    }
}

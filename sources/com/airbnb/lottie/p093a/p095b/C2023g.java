package com.airbnb.lottie.p093a.p095b;

import android.graphics.Path;
import com.airbnb.lottie.p099e.p101b.C2069g;
import com.airbnb.lottie.p099e.p101b.C2077l;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.g */
public final class C2023g {

    /* renamed from: a */
    public final List<AbstractC2012a<C2077l, Path>> f6081a;

    /* renamed from: b */
    public final List<AbstractC2012a<Integer, Integer>> f6082b;

    /* renamed from: c */
    public final List<C2069g> f6083c;

    static {
        Covode.recordClassIndex(2218);
    }

    public C2023g(List<C2069g> list) {
        this.f6083c = list;
        this.f6081a = new ArrayList(list.size());
        this.f6082b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f6081a.add(list.get(i).f6210b.mo5947a());
            this.f6082b.add(list.get(i).f6211c.mo5947a());
        }
    }
}

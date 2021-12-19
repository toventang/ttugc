package com.p2082ss.android.ttve.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttve.model.g */
public class C30679g {

    /* renamed from: a */
    public List<MVResourceBean> f73379a = new ArrayList();

    static {
        Covode.recordClassIndex(37246);
    }

    /* renamed from: a */
    public final int mo55058a() {
        return this.f73379a.size();
    }

    /* renamed from: a */
    public final MVResourceBean mo55059a(int i) {
        if (i < 0) {
            return null;
        }
        return this.f73379a.get(i);
    }

    /* renamed from: a */
    public final boolean mo55060a(int i, MVResourceBean mVResourceBean) {
        if (i < 0) {
            return false;
        }
        this.f73379a.set(i, mVResourceBean);
        return true;
    }
}

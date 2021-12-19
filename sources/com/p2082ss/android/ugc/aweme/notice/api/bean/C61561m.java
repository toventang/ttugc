package com.p2082ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.m */
public final class C61561m implements AbstractC81914b {

    /* renamed from: a */
    public int f139735a;

    /* renamed from: b */
    public int f139736b;

    /* renamed from: c */
    public HashMap<Integer, Integer> f139737c;

    static {
        Covode.recordClassIndex(72236);
    }

    public C61561m() {
    }

    public C61561m(int i) {
        this.f139735a = i;
    }

    public C61561m(HashMap<Integer, Integer> hashMap) {
        this.f139737c = hashMap;
    }

    /* renamed from: a */
    public final int mo99295a(int i) {
        try {
            return this.f139737c.get(Integer.valueOf(i)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final boolean mo99296b(int i) {
        HashMap<Integer, Integer> hashMap = this.f139737c;
        if ((hashMap == null || hashMap.size() <= 0 || !this.f139737c.containsKey(Integer.valueOf(i))) && this.f139735a != i) {
            return false;
        }
        return true;
    }

    public C61561m(int i, int i2) {
        this.f139735a = i;
        this.f139736b = i2;
    }
}

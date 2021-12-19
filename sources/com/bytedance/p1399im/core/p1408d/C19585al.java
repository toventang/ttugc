package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.d.al */
public final class C19585al {

    /* renamed from: a */
    public List<Long> f46493a = new ArrayList();

    /* renamed from: b */
    public List<Long> f46494b = new ArrayList();

    /* renamed from: c */
    public String f46495c = "";

    /* renamed from: d */
    public long f46496d;

    /* renamed from: e */
    public long f46497e;

    /* renamed from: f */
    public int f46498f;

    /* renamed from: g */
    public int f46499g;

    static {
        Covode.recordClassIndex(22429);
    }

    public final String toString() {
        return "MessageReadStatusModel{readUidList=" + this.f46493a + ", allUidList=" + this.f46494b + ", conId='" + this.f46495c + '\'' + '}';
    }

    public C19585al(List<Long> list, List<Long> list2, String str, long j, long j2) {
        this.f46493a = list;
        this.f46494b = list2;
        this.f46495c = str;
        this.f46496d = j;
        this.f46497e = j2;
        this.f46498f = list.size();
        this.f46499g = list2.size();
    }
}

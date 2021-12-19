package com.p2082ss.android.ugc.aweme.discover.hitrank;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.hitrank.a */
public final class C42063a implements Serializable {
    @AbstractC27891c(mo46611a = "compeleted_task_cnt")

    /* renamed from: a */
    private int f98059a;
    @AbstractC27891c(mo46611a = "total_task_cnt")

    /* renamed from: b */
    private int f98060b;

    static {
        Covode.recordClassIndex(49997);
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_hitrank_HitTaskInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m84189x225b681f(int i) {
        return i;
    }

    public static /* synthetic */ C42063a copy$default(C42063a aVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aVar.f98059a;
        }
        if ((i3 & 2) != 0) {
            i2 = aVar.f98060b;
        }
        return aVar.copy(i, i2);
    }

    public final int component1() {
        return this.f98059a;
    }

    public final int component2() {
        return this.f98060b;
    }

    public final C42063a copy(int i, int i2) {
        return new C42063a(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42063a)) {
            return false;
        }
        C42063a aVar = (C42063a) obj;
        return this.f98059a == aVar.f98059a && this.f98060b == aVar.f98060b;
    }

    public final int hashCode() {
        return (m84189x225b681f(this.f98059a) * 31) + m84189x225b681f(this.f98060b);
    }

    public final String toString() {
        return "HitTaskInfo(compeletedTaskCnt=" + this.f98059a + ", totalTaskCnt=" + this.f98060b + ")";
    }

    public final int getCompeletedTaskCnt() {
        return this.f98059a;
    }

    public final int getTotalTaskCnt() {
        return this.f98060b;
    }

    public final void setCompeletedTaskCnt(int i) {
        this.f98059a = i;
    }

    public final void setTotalTaskCnt(int i) {
        this.f98060b = i;
    }

    public C42063a(int i, int i2) {
        this.f98059a = i;
        this.f98060b = i2;
    }
}

package com.bytedance.android.livesdk.rank.impl.p608a;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.android.livesdk.rank.api.model.AbstractC10351e;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.impl.a.a */
public final class C10360a extends C1445j.AbstractC1447a {

    /* renamed from: a */
    private final List<?> f25038a;

    /* renamed from: b */
    private final List<?> f25039b;

    static {
        Covode.recordClassIndex(11928);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        List<?> list = this.f25038a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        List<?> list = this.f25039b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C10360a(List<?> list, List<?> list2) {
        this.f25038a = list;
        this.f25039b = list2;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        if ((this.f25038a.get(i) instanceof AbstractC10351e) && (this.f25039b.get(i2) instanceof AbstractC10351e)) {
            return ((AbstractC10351e) this.f25038a.get(i)).mo17142a(this.f25039b.get(i2));
        }
        if (this.f25038a.get(i) == this.f25039b.get(i2)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        if (!(this.f25038a.get(i) instanceof AbstractC10351e) || !(this.f25039b.get(i2) instanceof AbstractC10351e)) {
            return false;
        }
        return ((AbstractC10351e) this.f25038a.get(i)).mo17143b(this.f25039b.get(i2));
    }
}

package com.bytedance.android.livesdk.gift.model.p553a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.a.b */
public abstract class AbstractC8812b<T extends C9543b> {

    /* renamed from: a */
    public final int f21694a;

    /* renamed from: b */
    public T f21695b;

    static {
        Covode.recordClassIndex(9693);
    }

    /* renamed from: a */
    public abstract String mo14673a();

    /* renamed from: b */
    public abstract String mo14674b();

    /* renamed from: c */
    public abstract ImageModel mo14675c();

    /* renamed from: d */
    public abstract long mo14676d();

    /* renamed from: f */
    public ImageModel mo14678f() {
        return null;
    }

    /* renamed from: g */
    public boolean mo14679g() {
        return false;
    }

    public AbstractC8812b(int i, T t) {
        this.f21694a = i;
        this.f21695b = t;
    }
}

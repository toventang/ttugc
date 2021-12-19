package com.bytedance.android.livesdk.service.animation;

import com.bytedance.android.livesdk.gift.model.EnumC8850n;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8782a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.service.animation.a */
public final class C10644a {

    /* renamed from: b */
    private static C10644a f25650b;

    /* renamed from: a */
    public Map<EnumC8850n, AbstractC8782a> f25651a = new HashMap();

    static {
        Covode.recordClassIndex(12234);
    }

    private C10644a() {
    }

    /* renamed from: a */
    public static C10644a m19200a() {
        if (f25650b == null) {
            f25650b = new C10644a();
        }
        return f25650b;
    }
}

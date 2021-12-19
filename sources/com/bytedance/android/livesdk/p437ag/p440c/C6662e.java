package com.bytedance.android.livesdk.p437ag.p440c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ag.c.e */
public final class C6662e implements AbstractC6660c {

    /* renamed from: b */
    private static final Map<String, AbstractC6660c> f16557b;

    /* renamed from: a */
    AbstractC6660c f16558a;

    /* renamed from: com.bytedance.android.livesdk.ag.c.e$a */
    public static final class C6663a {

        /* renamed from: a */
        public static final AbstractC6660c f16559a = new C6662e();

        static {
            Covode.recordClassIndex(7401);
        }
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: b */
    public final boolean mo12807b() {
        return m14167c().mo12807b();
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final boolean mo12806a() {
        return m14167c().mo12806a();
    }

    static {
        Covode.recordClassIndex(7400);
        HashMap hashMap = new HashMap();
        f16557b = hashMap;
        hashMap.put("VIVO", new C6665g());
        hashMap.put("MEIZU", new C6661d());
        hashMap.put("HUAWEI", new C6659b());
        hashMap.put("XIAOMI", new C6666h());
        hashMap.put("OPPO", new C6664f());
    }

    /* renamed from: c */
    private AbstractC6660c m14167c() {
        if (this.f16558a == null) {
            this.f16558a = new C6658a();
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase();
                Map<String, AbstractC6660c> map = f16557b;
                if (map.containsKey(upperCase)) {
                    this.f16558a = map.get(upperCase);
                }
            }
        }
        return this.f16558a;
    }

    @Override // com.bytedance.android.livesdk.p437ag.p440c.AbstractC6660c
    /* renamed from: a */
    public final Intent mo12805a(Context context) {
        return m14167c().mo12805a(context);
    }
}

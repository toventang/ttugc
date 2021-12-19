package com.bytedance.android.livesdk.p437ag.p438a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ag.a.e */
public final class C6647e implements AbstractC6646d {

    /* renamed from: a */
    private Map<String, AbstractC6646d> f16540a;

    /* renamed from: b */
    private AbstractC6646d f16541b = new C6645c();

    static {
        Covode.recordClassIndex(7385);
    }

    /* renamed from: com.bytedance.android.livesdk.ag.a.e$a */
    public static final class C6648a {

        /* renamed from: a */
        public static final C6647e f16542a = new C6647e();

        static {
            Covode.recordClassIndex(7386);
        }
    }

    C6647e() {
        HashMap hashMap = new HashMap();
        this.f16540a = hashMap;
        hashMap.put("android.permission.CAMERA", new C6644b());
        this.f16540a.put("android.permission.RECORD_AUDIO", new C6643a());
    }

    @Override // com.bytedance.android.livesdk.p437ag.p438a.AbstractC6646d
    /* renamed from: a */
    public final boolean mo12792a(Context context, String str) {
        if (this.f16540a.containsKey(str)) {
            return this.f16540a.get(str).mo12792a(context, str);
        }
        return this.f16541b.mo12792a(context, str);
    }

    /* renamed from: a */
    public final boolean mo12793a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (!mo12792a(context, str)) {
                return false;
            }
        }
        return true;
    }
}

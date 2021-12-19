package com.bytedance.android.live.network;

import com.bytedance.android.live.base.model.C2959a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.network.b */
public interface AbstractC5799b {
    static {
        Covode.recordClassIndex(6399);
    }

    /* renamed from: a */
    C5800a mo11566a(C5800a aVar);

    /* renamed from: a */
    void mo11567a(Map<String, String> map);

    /* renamed from: com.bytedance.android.live.network.b$a */
    public static class C5800a {

        /* renamed from: a */
        public String f14640a;

        /* renamed from: b */
        public List<C2959a> f14641b;

        static {
            Covode.recordClassIndex(6400);
        }

        public C5800a(String str, List<C2959a> list) {
            this.f14640a = str;
            this.f14641b = list;
        }
    }
}

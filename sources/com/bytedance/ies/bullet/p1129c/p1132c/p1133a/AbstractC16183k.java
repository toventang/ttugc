package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.c.c.a.k */
public interface AbstractC16183k extends AbstractC16192q {

    /* renamed from: com.bytedance.ies.bullet.c.c.a.k$a */
    public enum EnumC16184a {
        PUBLIC,
        PRIVATE,
        PROTECT;

        static {
            Covode.recordClassIndex(18477);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.a.k$b */
    public interface AbstractC16185b extends AbstractC16192q.AbstractC16193a {
        static {
            Covode.recordClassIndex(18478);
        }

        /* renamed from: a */
        void mo25702a(int i, String str);

        /* renamed from: a */
        void mo25703a(int i, String str, JSONObject jSONObject);

        /* renamed from: a */
        void mo25704a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(18476);
    }

    /* renamed from: a */
    void mo25748a(JSONObject jSONObject, AbstractC16185b bVar);
}

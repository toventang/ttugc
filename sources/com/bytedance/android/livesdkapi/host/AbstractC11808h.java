package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdkapi.host.h */
public interface AbstractC11808h extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.host.h$a */
    public interface AbstractC11809a {
        static {
            Covode.recordClassIndex(13507);
        }

        /* renamed from: a */
        void mo16953a(JSONObject jSONObject);
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.h$b */
    public interface AbstractC11810b {
        static {
            Covode.recordClassIndex(13508);
        }

        /* renamed from: a */
        void mo16952a(double d);
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.h$c */
    public interface AbstractC11811c {
        static {
            Covode.recordClassIndex(13509);
        }

        /* renamed from: a */
        void mo16948a();

        /* renamed from: a */
        void mo16949a(AbstractC11809a aVar);

        /* renamed from: a */
        void mo16950a(AbstractC11810b bVar);

        /* renamed from: b */
        void mo16951b();
    }

    static {
        Covode.recordClassIndex(13506);
    }

    /* renamed from: a */
    AbstractC11811c mo18866a(String str, boolean z);

    /* renamed from: a */
    Map<String, Double> mo18867a();

    /* renamed from: a */
    Map<String, String> mo18868a(Context context);

    /* renamed from: a */
    void mo18869a(AbstractC11795a aVar);

    /* renamed from: b */
    Map<String, Long> mo18870b();

    /* renamed from: c */
    void mo18871c();

    /* renamed from: d */
    void mo18872d();

    /* renamed from: e */
    void mo18873e();

    /* renamed from: f */
    double mo18874f();

    /* renamed from: g */
    void mo18875g();
}

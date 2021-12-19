package com.p2082ss.android.ugc.aweme.player.sdk.api;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.api.g */
public interface AbstractC63037g {

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.g$a */
    public interface AbstractC63038a {
        static {
            Covode.recordClassIndex(73877);
        }

        /* renamed from: a */
        void mo101101a(JSONObject jSONObject, C63039b bVar);
    }

    static {
        Covode.recordClassIndex(73876);
    }

    /* renamed from: a */
    Map<String, String> mo101167a();

    /* renamed from: a */
    void mo101168a(String str, AbstractC63038a aVar);

    /* renamed from: a */
    void mo101169a(String str, Map<String, String> map, AbstractC63038a aVar);

    /* renamed from: a */
    void mo101170a(String str, Map<String, String> map, JSONObject jSONObject, int i, AbstractC63038a aVar);

    /* renamed from: b */
    void mo101171b();

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.api.g$b */
    public static class C63039b extends Error {
        public int code;

        static {
            Covode.recordClassIndex(73878);
        }

        public C63039b(int i, String str, Throwable th) {
            super(str, th);
            this.code = i;
        }
    }
}

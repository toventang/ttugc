package com.p2082ss.android.ugc.aweme.awemeservice.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService */
public interface IRequestIdService {
    static {
        Covode.recordClassIndex(41229);
    }

    /* renamed from: a */
    C34287a mo60692a(String str);

    /* renamed from: a */
    String mo60693a(Aweme aweme, int i);

    /* renamed from: a */
    void mo60694a(String str, String str2, int i);

    /* renamed from: b */
    JSONObject mo60695b(Aweme aweme, int i);

    /* renamed from: com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService$a */
    public static class C34287a {

        /* renamed from: a */
        public final String f81071a;

        /* renamed from: b */
        public final Integer f81072b;

        static {
            Covode.recordClassIndex(41230);
        }

        public C34287a() {
        }

        public C34287a(String str, int i) {
            this.f81071a = str;
            this.f81072b = Integer.valueOf(i);
        }
    }
}

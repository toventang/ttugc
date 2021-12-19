package com.p2082ss.android.account;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1664o.AbstractC22511d;
import com.p2082ss.android.AbstractC29903e;
import com.p2082ss.android.C29908f;
import com.p2082ss.android.token.C30630f;
import com.p2082ss.android.token.C30633g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.account.f */
public final class C29351f {

    /* renamed from: a */
    public static volatile AbstractC29903e f69671a;

    /* renamed from: b */
    public static volatile C29908f f69672b;

    /* renamed from: c */
    public static volatile AbstractC22511d f69673c;

    /* renamed from: d */
    public static Handler f69674d = new HandlerC29354a(Looper.getMainLooper());

    /* renamed from: a */
    public static AbstractC29903e m58781a() {
        if (f69671a != null) {
            return f69671a;
        }
        throw new IllegalStateException("not init TTAccount config");
    }

    static {
        Covode.recordClassIndex(35739);
    }

    /* renamed from: com.ss.android.account.f$a */
    static class HandlerC29354a extends Handler {
        static {
            Covode.recordClassIndex(35742);
        }

        public HandlerC29354a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i;
            if (message.what == 2001 && !C30630f.f73197f) {
                boolean a = C30633g.m62953a(C29351f.f69671a.mo52210b());
                JSONObject jSONObject = new JSONObject();
                if (a) {
                    i = 1;
                } else {
                    i = 0;
                }
                try {
                    jSONObject.put("is_main_process", i);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C22455a.m42377b("never_call_token_init", jSONObject);
            }
        }
    }
}

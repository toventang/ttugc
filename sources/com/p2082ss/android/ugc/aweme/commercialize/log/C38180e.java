package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.e */
public final class C38180e {

    /* renamed from: a */
    private String f90191a;

    /* renamed from: b */
    private String f90192b;

    /* renamed from: c */
    private String f90193c;

    /* renamed from: d */
    private long f90194d;

    /* renamed from: e */
    private String f90195e;

    /* renamed from: f */
    private long f90196f;

    /* renamed from: g */
    private JSONObject f90197g;

    /* renamed from: h */
    private JSONObject f90198h;

    /* renamed from: i */
    private String f90199i;

    static {
        Covode.recordClassIndex(45659);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.e$a */
    public static class C38181a {

        /* renamed from: a */
        String f90200a;

        /* renamed from: b */
        String f90201b;

        /* renamed from: c */
        String f90202c;

        /* renamed from: d */
        long f90203d;

        /* renamed from: e */
        long f90204e;

        /* renamed from: f */
        JSONObject f90205f;

        /* renamed from: g */
        private String f90206g;

        /* renamed from: h */
        private String f90207h;

        /* renamed from: i */
        private JSONObject f90208i;

        static {
            Covode.recordClassIndex(45660);
        }

        /* renamed from: a */
        public final C38180e mo66481a() {
            if (TextUtils.isEmpty(this.f90200a)) {
                this.f90200a = "event_v1";
            }
            return new C38180e(this.f90200a, this.f90201b, this.f90202c, this.f90206g, this.f90203d, this.f90207h, this.f90204e, this.f90208i, this.f90205f);
        }
    }

    /* renamed from: a */
    public final void mo66480a() {
        Object opt;
        Bundle bundle = new Bundle();
        bundle.putString("category", this.f90191a);
        Context a = C17867d.m33078a();
        if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132251c = C13624l.m24488d(a);
        }
        bundle.putLong("nt", (long) C58029j.f132251c.getValue());
        bundle.putString("tag", this.f90193c);
        bundle.putString("label", this.f90199i);
        bundle.putString("value", String.valueOf(this.f90194d));
        bundle.putString("log_extra", this.f90195e);
        bundle.putString("ext_value", String.valueOf(this.f90196f));
        bundle.putString("is_ad_event", "1");
        JSONObject jSONObject = this.f90197g;
        if (jSONObject != null) {
            bundle.putString("ad_extra_data", String.valueOf(jSONObject));
        }
        JSONObject jSONObject2 = this.f90198h;
        if (jSONObject2 != null) {
            try {
                if (this.f90197g == null && (opt = jSONObject2.opt("ad_extra_data")) != null) {
                    bundle.putString("ad_extra_data", opt.toString());
                }
                Iterator<String> keys = this.f90198h.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, this.f90198h.getString(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C29819a.m60076a(this.f90192b, bundle);
    }

    C38180e(String str, String str2, String str3, String str4, long j, String str5, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f90191a = str;
        this.f90192b = str2;
        this.f90193c = str3;
        this.f90199i = str4;
        this.f90194d = j;
        this.f90195e = str5;
        this.f90196f = j2;
        this.f90197g = jSONObject;
        this.f90198h = jSONObject2;
    }
}

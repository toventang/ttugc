package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.b */
public final class C38174b {

    /* renamed from: a */
    private String f90156a;

    /* renamed from: b */
    private String f90157b;

    /* renamed from: c */
    private String f90158c;

    /* renamed from: d */
    private long f90159d;

    /* renamed from: e */
    private String f90160e;

    /* renamed from: f */
    private long f90161f;

    /* renamed from: g */
    private JSONObject f90162g;

    /* renamed from: h */
    private JSONObject f90163h;

    /* renamed from: i */
    private String f90164i;

    static {
        Covode.recordClassIndex(45653);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.b$a */
    public static class C38175a {

        /* renamed from: a */
        public String f90165a;

        /* renamed from: b */
        public String f90166b;

        /* renamed from: c */
        public String f90167c;

        /* renamed from: d */
        public String f90168d;

        /* renamed from: e */
        public long f90169e;

        /* renamed from: f */
        public String f90170f;

        /* renamed from: g */
        public long f90171g;

        /* renamed from: h */
        public JSONObject f90172h;

        /* renamed from: i */
        public JSONObject f90173i;

        static {
            Covode.recordClassIndex(45654);
        }

        /* renamed from: a */
        public final C38174b mo66470a() {
            if (TextUtils.isEmpty(this.f90165a)) {
                this.f90165a = "event_v1";
            }
            return new C38174b(this);
        }
    }

    /* renamed from: a */
    public final void mo66469a() {
        Object opt;
        if (C16091a.f38741a != null) {
            Bundle bundle = new Bundle();
            bundle.putString("category", this.f90156a);
            Context a = C17867d.m33078a();
            if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132251c = C13624l.m24488d(a);
            }
            bundle.putLong("nt", (long) C58029j.f132251c.getValue());
            bundle.putString("tag", this.f90158c);
            bundle.putString("label", this.f90164i);
            bundle.putString("value", String.valueOf(this.f90159d));
            bundle.putString("log_extra", this.f90160e);
            bundle.putString("ext_value", String.valueOf(this.f90161f));
            bundle.putString("is_ad_event", "1");
            JSONObject jSONObject = this.f90162g;
            if (jSONObject != null) {
                bundle.putString("ad_extra_data", String.valueOf(jSONObject));
            }
            JSONObject jSONObject2 = this.f90163h;
            if (jSONObject2 != null) {
                try {
                    if (this.f90162g == null && (opt = jSONObject2.opt("ad_extra_data")) != null) {
                        bundle.putString("ad_extra_data", opt.toString());
                    }
                    Iterator<String> keys = this.f90163h.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle.putString(next, this.f90163h.getString(next));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            C16091a.f38741a.onEventV3Bundle(this.f90157b, bundle);
        }
    }

    C38174b(C38175a aVar) {
        this.f90156a = aVar.f90165a;
        this.f90157b = aVar.f90166b;
        this.f90158c = aVar.f90167c;
        this.f90164i = aVar.f90168d;
        this.f90159d = aVar.f90169e;
        this.f90160e = aVar.f90170f;
        this.f90161f = aVar.f90171g;
        this.f90162g = aVar.f90172h;
        this.f90163h = aVar.f90173i;
    }
}

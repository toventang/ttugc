package com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33740a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a */
public abstract class AbstractC72729a {

    /* renamed from: e */
    public static final C72730a f163058e = new C72730a((byte) 0);

    /* renamed from: c */
    long f163059c;

    /* renamed from: d */
    public final String f163060d;

    static {
        Covode.recordClassIndex(85414);
    }

    /* renamed from: a */
    public void mo113578a(int i, long j, long j2) {
    }

    /* renamed from: a */
    public boolean mo113581a() {
        return false;
    }

    /* renamed from: b */
    public abstract String mo115012b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.a.a$a */
    public static final class C72730a {
        static {
            Covode.recordClassIndex(85415);
        }

        private C72730a() {
        }

        public /* synthetic */ C72730a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static boolean m128221c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m128222d() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean c = m128221c();
        C58029j.f132256h = c;
        return c;
    }

    public AbstractC72729a(String str) {
        this.f163060d = str;
    }

    /* renamed from: a */
    public void mo113580a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C17867d.m33078a();
        if (m128222d()) {
            C12290b.m22060a("aweme_download_error_rate", 0, new C33743c().mo59975a("duration", Long.valueOf(System.currentTimeMillis() - this.f163059c)).mo59971a("tools_use_downloader", (Boolean) true).mo59976a("from", this.f163060d).mo59976a("url", mo115012b()).mo59976a("cur_url", str).mo59977a());
        }
    }

    /* renamed from: a */
    public void mo113579a(Exception exc, String str, Integer num) {
        int i;
        String c;
        C17867d.m33078a();
        if (m128222d()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", mo115012b());
                jSONObject.put("from", this.f163060d);
                jSONObject.put("tools_use_downloader", true);
                if (exc == null) {
                    c = "null exception";
                } else {
                    c = C24098m.m45633c(exc);
                }
                jSONObject.put("exception", c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C12290b.m22060a("aweme_download_error_rate", 1, jSONObject);
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C33740a.m69068a("aweme_movie_download_log", "", str, i, mo115012b(), this.f163060d);
    }
}

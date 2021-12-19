package com.p2082ss.android.ugc.aweme.main.replace;

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

/* renamed from: com.ss.android.ugc.aweme.main.replace.a */
public abstract class AbstractC59115a {

    /* renamed from: c */
    public static final C59116a f134519c = new C59116a((byte) 0);

    /* renamed from: a */
    long f134520a;

    /* renamed from: b */
    public final String f134521b;

    static {
        Covode.recordClassIndex(69469);
    }

    /* renamed from: a */
    public abstract String mo96624a();

    /* renamed from: a */
    public void mo96625a(int i, long j, long j2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.a$a */
    public static final class C59116a {
        static {
            Covode.recordClassIndex(69470);
        }

        private C59116a() {
        }

        public /* synthetic */ C59116a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private static boolean m108605b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m108606c() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean b = m108605b();
        C58029j.f132256h = b;
        return b;
    }

    public AbstractC59115a(String str) {
        this.f134521b = str;
    }

    /* renamed from: a */
    public void mo96627a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C17867d.m33078a();
        if (m108606c()) {
            C12290b.m22060a("aweme_download_error_rate", 0, new C33743c().mo59975a("duration", Long.valueOf(System.currentTimeMillis() - this.f134520a)).mo59971a("tools_use_downloader", (Boolean) true).mo59976a("from", this.f134521b).mo59976a("url", mo96624a()).mo59976a("cur_url", str).mo59977a());
        }
    }

    /* renamed from: a */
    public void mo96626a(Exception exc, String str, Integer num) {
        int i;
        String c;
        C17867d.m33078a();
        if (m108606c()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", mo96624a());
                jSONObject.put("from", this.f134521b);
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
        C33740a.m69068a("aweme_movie_download_log", "", str, i, mo96624a(), this.f134521b);
    }
}

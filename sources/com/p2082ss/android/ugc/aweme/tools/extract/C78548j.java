package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.j */
public final class C78548j {

    /* renamed from: a */
    public String f176534a = "";

    /* renamed from: b */
    public int f176535b;

    /* renamed from: c */
    public Integer f176536c;

    /* renamed from: d */
    public Boolean f176537d;

    /* renamed from: e */
    public Boolean f176538e;

    /* renamed from: f */
    public Integer f176539f;

    /* renamed from: g */
    public int f176540g;

    /* renamed from: h */
    public Boolean f176541h = false;

    /* renamed from: i */
    public long f176542i;

    /* renamed from: j */
    public String f176543j = "";

    static {
        Covode.recordClassIndex(91680);
    }

    /* renamed from: a */
    public final JSONObject mo122479a() {
        int i;
        C69840ar a = new C69840ar().mo110187a("stage", (Integer) 2).mo110189a("aweme_id", this.f176534a).mo110187a("match_factors", Integer.valueOf(this.f176535b)).mo110187a("origin", this.f176536c).mo110185a("is_draft", this.f176537d).mo110185a("is_backup", this.f176538e);
        Integer num = this.f176539f;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        JSONObject a2 = a.mo110187a("err_code", Integer.valueOf(i)).mo110187a("status", Integer.valueOf(this.f176540g)).mo110185a("is_retry", this.f176541h).mo110188a("upload_err_code", Long.valueOf(this.f176542i)).mo110189a("description", this.f176543j).mo110191a();
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: a */
    public final void mo122480a(String str) {
        C89219l.m154721d(str, "");
        this.f176543j = str;
    }
}

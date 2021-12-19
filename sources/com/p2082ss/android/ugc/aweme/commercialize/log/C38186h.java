package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.log.h */
public final /* synthetic */ class C38186h implements RawURLGetter.AbstractC38144a {

    /* renamed from: a */
    private final AbstractC38162ah f90218a;

    /* renamed from: b */
    private final String f90219b;

    /* renamed from: c */
    private final long f90220c;

    /* renamed from: d */
    private final JSONObject f90221d;

    static {
        Covode.recordClassIndex(45665);
    }

    C38186h(AbstractC38162ah ahVar, String str, long j, JSONObject jSONObject) {
        this.f90218a = ahVar;
        this.f90219b = str;
        this.f90220c = j;
        this.f90221d = jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter.AbstractC38144a
    /* renamed from: a */
    public final void mo66440a(int i, boolean z, Exception exc) {
        AbstractC38162ah ahVar = this.f90218a;
        String str = this.f90219b;
        long j = this.f90220c;
        JSONObject jSONObject = this.f90221d;
        if (ahVar != null) {
            ahVar.mo66465a(str, String.valueOf(i), j);
        }
        if (exc != null) {
            C51423a.m95788a("", exc);
            try {
                jSONObject.put("error_message", exc.getMessage());
            } catch (JSONException unused) {
            }
        }
        try {
            jSONObject.put("status_code", i);
        } catch (JSONException unused2) {
        }
        C12290b.m22060a("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject);
    }
}

package com.p2082ss.android.ugc.aweme.commercialize.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.track.c */
public final /* synthetic */ class C38527c implements RawURLGetter.AbstractC38519a {

    /* renamed from: a */
    private final AbstractC38530e f91040a;

    /* renamed from: b */
    private final String f91041b;

    /* renamed from: c */
    private final long f91042c;

    /* renamed from: d */
    private final JSONObject f91043d;

    static {
        Covode.recordClassIndex(46057);
    }

    C38527c(AbstractC38530e eVar, String str, long j, JSONObject jSONObject) {
        this.f91040a = eVar;
        this.f91041b = str;
        this.f91042c = j;
        this.f91043d = jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.RawURLGetter.AbstractC38519a
    /* renamed from: a */
    public final void mo67055a(int i, boolean z, Exception exc) {
        AbstractC38530e eVar = this.f91040a;
        String str = this.f91041b;
        long j = this.f91042c;
        JSONObject jSONObject = this.f91043d;
        if (eVar != null) {
            eVar.mo59217a(str, String.valueOf(i), j);
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
        if (C16091a.f38742b != null) {
            C16091a.f38742b.monitorStatusRate("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject);
        }
    }
}

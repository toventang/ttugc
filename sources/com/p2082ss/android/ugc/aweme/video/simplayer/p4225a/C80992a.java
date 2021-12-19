package com.p2082ss.android.ugc.aweme.video.simplayer.p4225a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.a.a */
public final class C80992a implements AbstractC63050k {

    /* renamed from: a */
    public int f181031a;

    /* renamed from: b */
    public long f181032b;

    /* renamed from: c */
    public long f181033c;

    /* renamed from: d */
    public long f181034d;

    /* renamed from: e */
    public long f181035e;

    /* renamed from: f */
    public long f181036f;

    /* renamed from: g */
    public long f181037g;

    /* renamed from: h */
    public long f181038h;

    static {
        Covode.recordClassIndex(94310);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: c */
    public final void mo101188c() {
        this.f181036f = SystemClock.elapsedRealtime();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: d */
    public final void mo101190d() {
        this.f181037g = SystemClock.elapsedRealtime();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: e */
    public final void mo101192e() {
        this.f181034d = SystemClock.elapsedRealtime();
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: a */
    public final void mo101182a() {
        this.f181038h = SystemClock.elapsedRealtime();
        C58945a.C58947b.f134185a.mo96429b("player_precreate_to_prerender", false);
        C58945a.C58947b.f134185a.mo96425a("player_prerender_duration", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: b */
    public final void mo101185b() {
        this.f181035e = SystemClock.elapsedRealtime();
        C58945a.C58947b.f134185a.mo96429b("player_prerender_duration", false);
        C58945a.C58947b.f134185a.mo96425a("player_prerender_to_focus", false);
        C58945a.C58947b.f134185a.mo96425a("player_prerender_to_ui", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: c */
    public final void mo101189c(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C39162r.m79461a("pre_start_end_time", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: d */
    public final void mo101191d(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C39162r.m79461a("pre_on_prepared_time", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: e */
    public final void mo101193e(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C39162r.m79461a("pre_on_render_start_time", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: a */
    public final void mo101183a(int i) {
        this.f181031a = i;
        this.f181032b = SystemClock.elapsedRealtime();
        C58945a.C58947b.f134185a.mo96429b("cold_boot_start_to_precreate", false);
        C58945a.C58947b.f134185a.mo96429b("player_init_to_precreate", false);
        C58945a.C58947b.f134185a.mo96425a("player_precreate_duration", false);
        C58945a.C58947b.f134185a.mo96423a("player_precreate_start_type", (long) i);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: b */
    public final void mo101186b(int i) {
        this.f181031a = i;
        this.f181033c = SystemClock.elapsedRealtime();
        C58945a.C58947b.f134185a.mo96429b("player_precreate_duration", false);
        C58945a.C58947b.f134185a.mo96425a("player_precreate_to_prerender", false);
        C58945a.C58947b.f134185a.mo96423a("player_precreate_end_type", (long) i);
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: a */
    public final void mo101184a(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C39162r.m79461a("pre_pause_end_time", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63050k
    /* renamed from: b */
    public final void mo101187b(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C39162r.m79461a("pre_set_surface_end_time", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

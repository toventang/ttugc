package com.p2082ss.android.ugc.aweme.bullet.business.p2414a;

import android.content.Context;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20751h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.a.a */
public final class C35124a {

    /* renamed from: a */
    public long f82908a;

    /* renamed from: b */
    public int f82909b = -1;

    /* renamed from: c */
    public long f82910c;

    /* renamed from: d */
    public boolean f82911d;

    /* renamed from: e */
    public boolean f82912e;

    /* renamed from: f */
    public boolean f82913f;

    /* renamed from: g */
    public String f82914g;

    /* renamed from: h */
    public String f82915h;

    /* renamed from: i */
    public boolean f82916i;

    static {
        Covode.recordClassIndex(42279);
    }

    /* renamed from: a */
    private static C13624l.EnumC13625a m71853a(Context context) {
        if (C58029j.f132251c != C13624l.EnumC13625a.UNKNOWN && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132251c;
        }
        C13624l.EnumC13625a d = C13624l.m24488d(context);
        C58029j.f132251c = d;
        return d;
    }

    /* renamed from: a */
    public final void mo61982a(String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        long j2;
        if (this.f82908a != 0 && j > 0) {
            String str3 = "load";
            if (this.f82911d || !this.f82912e || this.f82913f) {
                str2 = str3;
            } else {
                if (C33113b.m67826a() != null) {
                    C33113b.m67826a().mo58949c();
                }
                str2 = "load_finish";
            }
            try {
                C13624l.EnumC13625a a = m71853a(C20751h.f48987a);
                if (a != C13624l.EnumC13625a.NONE) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("ac", C13624l.m24481a(a));
                    if (this.f82913f) {
                        str3 = "load_fail";
                    } else {
                        long j3 = this.f82910c;
                        if (j3 > 0) {
                            str3 = str2;
                        }
                        if (j3 > 0) {
                            j2 = this.f82908a;
                        } else {
                            j3 = System.currentTimeMillis();
                            j2 = this.f82908a;
                        }
                        long j4 = j3 - j2;
                        if (a == C13624l.EnumC13625a.WIFI) {
                            if (j4 < 1) {
                                return;
                            }
                        } else if (j4 < 1) {
                            return;
                        }
                        if (j4 > 0) {
                            jSONObject.put("duration", Math.min(j4, 90000L));
                        } else {
                            return;
                        }
                    }
                    if (str == null) {
                        str = this.f82914g;
                        if (str == null) {
                            return;
                        }
                    }
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("tag", "draw_ad");
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    jSONObject2.put("next_url", str);
                    int i = this.f82909b;
                    if (i != -1) {
                        jSONObject2.put("preload_status", i);
                    }
                    jSONObject2.put("container_type", "bullet");
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    if (!this.f82916i) {
                        this.f82916i = true;
                        C39162r.onEvent(MobClick.obtain().setLabelName(str3).setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(jSONObject));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}

package com.bytedance.push.p1593f;

import android.app.NotificationChannel;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f.a */
public final class C21799a {

    /* renamed from: a */
    public String f51656a;

    /* renamed from: b */
    public boolean f51657b = true;

    /* renamed from: c */
    public String f51658c;

    /* renamed from: d */
    public String f51659d;

    /* renamed from: e */
    public int f51660e;

    /* renamed from: f */
    public boolean f51661f;

    /* renamed from: g */
    public int f51662g;

    /* renamed from: h */
    public boolean f51663h;

    /* renamed from: i */
    public boolean f51664i;

    /* renamed from: j */
    public boolean f51665j;

    static {
        Covode.recordClassIndex(25448);
    }

    public C21799a(NotificationChannel notificationChannel) {
        this.f51658c = notificationChannel.getId();
        this.f51659d = String.valueOf(notificationChannel.getName());
        this.f51660e = notificationChannel.getImportance();
        this.f51661f = notificationChannel.canBypassDnd();
        this.f51662g = notificationChannel.getLockscreenVisibility();
        this.f51663h = notificationChannel.shouldShowLights();
        this.f51664i = notificationChannel.shouldVibrate();
        this.f51665j = notificationChannel.canShowBadge();
        this.f51656a = notificationChannel.getDescription();
    }

    public C21799a(JSONObject jSONObject) {
        this.f51658c = jSONObject.optString("id");
        this.f51659d = jSONObject.optString(StringSet.name);
        this.f51660e = jSONObject.optInt("importance", 3);
        this.f51661f = jSONObject.optBoolean("bypassDnd", true);
        this.f51662g = jSONObject.optInt("lockscreenVisibility", -1);
        this.f51663h = jSONObject.optBoolean("lights", true);
        this.f51664i = jSONObject.optBoolean("vibration", true);
        this.f51665j = jSONObject.optBoolean("showBadge", true);
        this.f51657b = jSONObject.optBoolean("enable", true);
        this.f51656a = jSONObject.optString("desc");
    }
}

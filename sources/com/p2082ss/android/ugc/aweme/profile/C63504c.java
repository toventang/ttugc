package com.p2082ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.c */
public class C63504c {

    /* renamed from: k */
    private static C63504c f144125k;

    /* renamed from: a */
    public int f144126a = 11;

    /* renamed from: b */
    public Keva f144127b = Keva.getRepo("ug_coupon_repo");

    /* renamed from: c */
    private final String f144128c = "ug_coupon_repo";

    /* renamed from: d */
    private final String f144129d = "show_bubble";

    /* renamed from: e */
    private final String f144130e = "show_bar";

    /* renamed from: f */
    private final String f144131f = "show_star";

    /* renamed from: g */
    private final String f144132g = "show_bar_time";

    /* renamed from: h */
    private DateFormat f144133h = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: i */
    private String f144134i = C63504c.class.getSimpleName();

    /* renamed from: j */
    private int f144135j = 24;

    static {
        Covode.recordClassIndex(74812);
    }

    /* renamed from: b */
    public final boolean mo102139b() {
        if (!this.f144127b.getBoolean("show_bubble", true)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo102140c() {
        return this.f144127b.getInt("show_bar_time", 0);
    }

    /* renamed from: e */
    public final boolean mo102142e() {
        if (mo102140c() >= this.f144126a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo102141d() {
        this.f144127b.storeInt("show_bar_time", this.f144127b.getInt("show_bar_time", 0) + 1);
    }

    /* renamed from: f */
    public final void mo102143f() {
        if (!this.f144127b.getBoolean("show_star", false)) {
            this.f144127b.storeBoolean("show_star", false);
        }
    }

    /* renamed from: a */
    public static C63504c m115069a() {
        MethodCollector.m26663i(8056);
        if (f144125k == null) {
            synchronized (C63504c.class) {
                try {
                    if (f144125k == null) {
                        f144125k = new C63504c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8056);
                    throw th;
                }
            }
        }
        C63504c cVar = f144125k;
        MethodCollector.m26664o(8056);
        return cVar;
    }

    /* renamed from: g */
    public final boolean mo102144g() {
        if (!this.f144127b.contains("show_bubble")) {
            return false;
        }
        if (!this.f144127b.contains("show_star") || !this.f144127b.getBoolean("show_star", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo102135a(JSONObject jSONObject) {
        try {
            this.f144127b.storeString(jSONObject.getString("activity_id"), this.f144133h.format(new Date()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo102138b(boolean z) {
        if (z || !this.f144127b.getBoolean("show_bar", false)) {
            this.f144127b.storeBoolean("show_bar", z);
        }
    }

    /* renamed from: a */
    public final void mo102136a(boolean z) {
        if (z || !this.f144127b.getBoolean("show_bubble", false)) {
            this.f144127b.storeBoolean("show_bubble", z);
        }
    }

    /* renamed from: a */
    public final boolean mo102137a(String str, int i) {
        String string = this.f144127b.getString(str, "");
        if (!TextUtils.equals(string, "")) {
            try {
                if ((new Date().getTime() - this.f144133h.parse(string).getTime()) / TimeUnit.DAYS.toMillis(1) < ((long) i)) {
                    return true;
                }
                return false;
            } catch (ParseException e) {
                e.printStackTrace();
                this.f144127b.storeString(str, "");
            }
        }
        return false;
    }
}

package com.bytedance.android.livesdk.p458b.p459a;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.b.a.d */
public final class C6894d extends AbstractC6891a<Boolean> {

    /* renamed from: y */
    private static C6894d f17255y;

    /* renamed from: a */
    public AbstractC6895a f17256a;

    /* renamed from: b */
    public boolean f17257b;

    /* renamed from: c */
    public boolean f17258c;

    /* renamed from: d */
    public String f17259d;

    /* renamed from: e */
    public String f17260e;

    /* renamed from: f */
    public int f17261f;

    /* renamed from: g */
    public String f17262g;

    /* renamed from: h */
    public C6896e f17263h;

    /* renamed from: i */
    public long f17264i;

    /* renamed from: j */
    public long f17265j;

    /* renamed from: k */
    public boolean f17266k;

    /* renamed from: l */
    public boolean f17267l = true;

    /* renamed from: o */
    public boolean f17268o;

    /* renamed from: p */
    public boolean f17269p;

    /* renamed from: q */
    public int f17270q = 1;

    /* renamed from: r */
    public SurfaceView f17271r;

    /* renamed from: s */
    public Set<Long> f17272s = new HashSet();

    /* renamed from: t */
    public int f17273t = 0;

    /* renamed from: u */
    public String f17274u;

    /* renamed from: v */
    public int f17275v = 2;

    /* renamed from: w */
    public volatile boolean f17276w;

    /* renamed from: x */
    public volatile boolean f17277x;

    /* renamed from: com.bytedance.android.livesdk.b.a.d$a */
    public interface AbstractC6895a {
        static {
            Covode.recordClassIndex(7633);
        }

        /* renamed from: a */
        void mo10647a(boolean z);
    }

    static {
        Covode.recordClassIndex(7632);
    }

    /* renamed from: a */
    public static C6894d m14753a() {
        if (f17255y == null) {
            f17255y = new C6894d();
        }
        return f17255y;
    }

    private C6894d() {
        this.f17248n = false;
        this.f17263h = new C6896e();
    }

    /* renamed from: b */
    public final void mo13188b() {
        C6555i.m14021b();
        C6555i.m9463b("invite_issue_check", "rtcExtInfo reset");
        this.f17248n = false;
        this.f17260e = null;
        this.f17261f = 0;
        this.f17259d = null;
        this.f17262g = "";
        this.f17266k = false;
        this.f17276w = false;
        this.f17267l = true;
        this.f17264i = 0;
        this.f17270q = 1;
        this.f17271r = null;
        this.f17272s.clear();
        this.f17273t = 0;
        this.f17274u = null;
        this.f17258c = false;
        C6898g.C6899a.f17285a.mo13197a();
        this.f17275v = 2;
    }

    /* renamed from: b */
    public final long mo13187b(long j) {
        return this.f17263h.mo13190a(j);
    }

    /* renamed from: b */
    public final void mo13189b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17274u = str;
        }
    }

    /* renamed from: a */
    public final void mo13184a(long j) {
        this.f17263h.mo13192b(j, System.currentTimeMillis());
    }

    /* renamed from: c */
    private static int m14754c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("live_rtc_engine_config")) {
                return 0;
            }
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
                if (optJSONObject.has("rtc_vendor")) {
                    return optJSONObject.optInt("rtc_vendor");
                }
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo13185a(String str) {
        this.f17262g = str;
        int c = m14754c(str);
        if (c > 0) {
            this.f17261f = c;
        }
    }

    /* renamed from: a */
    public final void mo13186a(boolean z) {
        this.f17258c = z;
        AbstractC6895a aVar = this.f17256a;
        if (aVar != null) {
            aVar.mo10647a(z);
        }
    }
}

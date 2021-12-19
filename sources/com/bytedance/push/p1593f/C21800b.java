package com.bytedance.push.p1593f;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f.b */
public final class C21800b {

    /* renamed from: a */
    public List<C21801a> f51666a;

    /* renamed from: b */
    public C21802b f51667b;

    static {
        Covode.recordClassIndex(25449);
    }

    /* renamed from: com.bytedance.push.f.b$c */
    public static class C21803c {

        /* renamed from: a */
        public int f51673a;

        /* renamed from: b */
        public int f51674b;

        static {
            Covode.recordClassIndex(25452);
        }

        public final String toString() {
            return mo35482a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final String mo35482a() {
            return C1764a.m5929a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(this.f51673a), Integer.valueOf(this.f51674b)});
        }
    }

    /* renamed from: com.bytedance.push.f.b$a */
    public static class C21801a {

        /* renamed from: a */
        public String f51668a;

        /* renamed from: b */
        public boolean f51669b;

        static {
            Covode.recordClassIndex(25450);
        }

        public final String toString() {
            return "ChildSwitcher{tag='" + this.f51668a + '\'' + ", isOpen=" + this.f51669b + '}';
        }
    }

    /* renamed from: com.bytedance.push.f.b$b */
    public static class C21802b {

        /* renamed from: a */
        public boolean f51670a;

        /* renamed from: b */
        public C21803c f51671b;

        /* renamed from: c */
        public C21803c f51672c;

        static {
            Covode.recordClassIndex(25451);
        }

        public final String toString() {
            return "MuteConfig{isMute=" + this.f51670a + ", from=" + this.f51671b + ", to=" + this.f51672c + '}';
        }
    }

    /* renamed from: a */
    public final String mo35478a() {
        int i;
        C21802b bVar = this.f51667b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (bVar.f51670a) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_mute", i);
            if (bVar.f51670a) {
                jSONObject.put("start_time", bVar.f51671b.mo35482a());
                jSONObject.put("end_time", bVar.f51672c.mo35482a());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public final String mo35479b() {
        int i;
        ArrayList<C21801a> arrayList = this.f51666a == null ? null : new ArrayList(this.f51666a);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C21801a aVar : arrayList) {
            if (aVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (aVar.f51669b) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    jSONObject.put("is_close", i);
                    jSONObject.put(StringSet.name, aVar.f51668a);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray.toString();
    }
}

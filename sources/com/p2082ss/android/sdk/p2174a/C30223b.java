package com.p2082ss.android.sdk.p2174a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.a.b */
public final class C30223b {

    /* renamed from: a */
    public static volatile C30223b f72086a = new C30223b();

    /* renamed from: b */
    public final C30224c[] f72087b = C30224c.f72090a;

    /* renamed from: c */
    public final C30224c[] f72088c = C30224c.f72091b;

    /* renamed from: d */
    private boolean f72089d;

    static {
        Covode.recordClassIndex(36730);
    }

    private C30223b() {
    }

    /* renamed from: a */
    public final boolean mo53667a() {
        if (mo53669b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C30224c mo53669b() {
        m61159b(C31291a.f74991a);
        C30224c[] cVarArr = this.f72088c;
        for (C30224c cVar : cVarArr) {
            if (cVar.f72104o) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo53668a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        m61159b(C31291a.f74991a);
        C30224c[] cVarArr = this.f72087b;
        for (C30224c cVar : cVarArr) {
            if (cVar.f72104o && !TextUtils.isEmpty(cVar.f72101l) && cVar.f72101l.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53666a(Context context) {
        if (context != null) {
            JSONObject jSONObject = new JSONObject();
            C30224c[] cVarArr = this.f72088c;
            for (C30224c cVar : cVarArr) {
                if (cVar.f72110u > 0) {
                    try {
                        jSONObject.put(cVar.f72101l, cVar.f72110u);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            C30224c[] cVarArr2 = this.f72088c;
            boolean z = true;
            for (C30224c cVar2 : cVarArr2) {
                if (cVar2.f72104o) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(cVar2.f72101l);
                    z = false;
                }
            }
            String sb2 = sb.toString();
            SharedPreferences.Editor edit = C34822d.m71158a(context, "com.ss.spipe_setting", 0).edit();
            edit.putString("expire_platforms", jSONObject.toString());
            edit.putString("bind_platforms", sb2);
            C13611a.m24460a(edit);
        }
    }

    /* renamed from: b */
    private void m61159b(Context context) {
        JSONObject jSONObject;
        String[] split;
        if (!this.f72089d && context != null) {
            this.f72089d = true;
            SharedPreferences a = C34822d.m71158a(context, "com.ss.spipe_setting", 0);
            try {
                HashMap hashMap = new HashMap();
                String string = a.getString("expire_platforms", null);
                String string2 = a.getString("bind_platforms", "");
                if (TextUtils.isEmpty(string)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(string);
                }
                C30224c[] cVarArr = this.f72088c;
                for (C30224c cVar : cVarArr) {
                    if (!jSONObject.isNull(cVar.f72101l)) {
                        cVar.f72110u = jSONObject.optLong(cVar.f72101l, -1);
                    }
                }
                hashMap.clear();
                if (!(TextUtils.isEmpty(string2) || (split = string2.split(",")) == null || split.length <= 0)) {
                    for (String str : split) {
                        hashMap.put(str, str);
                    }
                    C30224c[] cVarArr2 = this.f72088c;
                    for (C30224c cVar2 : cVarArr2) {
                        if (hashMap.containsKey(cVar2.f72101l)) {
                            cVar2.f72104o = true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}

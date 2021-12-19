package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.measurement.internal.en */
public final class C26362en {

    /* renamed from: a */
    private final String f61926a;

    /* renamed from: b */
    private final Bundle f61927b = new Bundle();

    /* renamed from: c */
    private boolean f61928c;

    /* renamed from: d */
    private Bundle f61929d;

    /* renamed from: e */
    private final /* synthetic */ C26361em f61930e;

    static {
        Covode.recordClassIndex(31784);
    }

    /* renamed from: a */
    public final Bundle mo43203a() {
        if (!this.f61928c) {
            this.f61928c = true;
            String string = this.f61930e.mo43196f().getString(this.f61926a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string2 = jSONObject.getString("n");
                        String string3 = jSONObject.getString("t");
                        char c = 65535;
                        int hashCode = string3.hashCode();
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c = 0;
                                }
                            } else if (string3.equals("l")) {
                                c = 2;
                            }
                        } else if (string3.equals("d")) {
                            c = 1;
                        }
                        if (c == 0) {
                            bundle.putString(string2, jSONObject.getString("v"));
                        } else if (c == 1) {
                            bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                        } else if (c != 2) {
                            try {
                                this.f61930e.mo43016q().f61827c.mo43170a("Unrecognized persisted bundle type. Type", string3);
                            } catch (NumberFormatException | JSONException unused) {
                                this.f61930e.mo43016q().f61827c.mo43169a("Error reading value from SharedPreferences. Value dropped");
                            }
                        } else {
                            bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                        }
                    }
                    this.f61929d = bundle;
                } catch (JSONException unused2) {
                    this.f61930e.mo43016q().f61827c.mo43169a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f61929d == null) {
                this.f61929d = this.f61927b;
            }
        }
        return this.f61929d;
    }

    /* renamed from: a */
    public final void mo43204a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f61930e.mo43196f().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f61926a);
        } else {
            edit.putString(this.f61926a, m51814b(bundle));
        }
        edit.apply();
        this.f61929d = bundle;
    }

    /* renamed from: b */
    private final String m51814b(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object a = m51813a(bundle, str);
            if (a != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    jSONObject.put("v", String.valueOf(a));
                    if (a instanceof String) {
                        jSONObject.put("t", "s");
                    } else if (a instanceof Long) {
                        jSONObject.put("t", "l");
                    } else if (a instanceof Double) {
                        jSONObject.put("t", "d");
                    } else {
                        this.f61930e.mo43016q().f61827c.mo43170a("Cannot serialize bundle value to SharedPreferences. Type", a.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.f61930e.mo43016q().f61827c.mo43170a("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    private static Object m51813a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public C26362en(C26361em emVar, String str) {
        this.f61930e = emVar;
        C25565r.m49316a(str);
        this.f61926a = str;
    }
}

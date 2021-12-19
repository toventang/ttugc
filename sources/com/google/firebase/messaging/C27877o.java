package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.o */
public final class C27877o {

    /* renamed from: a */
    private final Bundle f65461a;

    static {
        Covode.recordClassIndex(33470);
    }

    /* renamed from: c */
    public final Bundle mo46576c() {
        Bundle bundle = new Bundle(this.f65461a);
        for (String str : this.f65461a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: d */
    public final Bundle mo46578d() {
        Bundle bundle = new Bundle(this.f65461a);
        for (String str : this.f65461a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final long[] mo46573a() {
        JSONArray g = m55802g("gcm.n.vibrate_timings");
        if (g == null) {
            return null;
        }
        try {
            if (g.length() > 1) {
                int length = g.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = g.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String.valueOf(String.valueOf(g)).length();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int[] mo46575b() {
        JSONArray g = m55802g("gcm.n.light_settings");
        if (g == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (g.length() == 3) {
                int parseColor = Color.parseColor(g.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = g.optInt(1);
                    iArr[2] = g.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String.valueOf(String.valueOf(g)).length();
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(g);
            String message = e.getMessage();
            String.valueOf(valueOf).length();
            String.valueOf(message).length();
            return null;
        }
    }

    public C27877o(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f65461a = new Bundle(bundle);
    }

    /* renamed from: h */
    private static String m55803h(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: i */
    private static String m55804i(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: a */
    public static boolean m55798a(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m55804i("gcm.n.e")))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private String m55800e(String str) {
        if (!this.f65461a.containsKey(str) && str.startsWith("gcm.n.")) {
            String i = m55804i(str);
            if (this.f65461a.containsKey(i)) {
                return i;
            }
        }
        return str;
    }

    /* renamed from: b */
    public final boolean mo46574b(String str) {
        String a = mo46572a(str);
        if ("1".equals(a) || Boolean.parseBoolean(a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private Object[] m55801f(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if ("_loc_args".length() != 0) {
            str2 = valueOf.concat("_loc_args");
        } else {
            str2 = new String(valueOf);
        }
        JSONArray g = m55802g(str2);
        if (g == null) {
            return null;
        }
        int length = g.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = g.optString(i);
        }
        return strArr;
    }

    /* renamed from: g */
    private JSONArray m55802g(String str) {
        String a = mo46572a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return new JSONArray(a);
        } catch (JSONException unused) {
            String.valueOf(m55803h(str)).length();
            String.valueOf(a).length();
            return null;
        }
    }

    /* renamed from: a */
    public final String mo46572a(String str) {
        return this.f65461a.getString(m55800e(str));
    }

    /* renamed from: c */
    public final Integer mo46577c(String str) {
        String a = mo46572a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException unused) {
            String.valueOf(m55803h(str)).length();
            String.valueOf(a).length();
            return null;
        }
    }

    /* renamed from: d */
    public final Long mo46579d(String str) {
        String a = mo46572a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(a));
        } catch (NumberFormatException unused) {
            String.valueOf(m55803h(str)).length();
            String.valueOf(a).length();
            return null;
        }
    }

    /* renamed from: a */
    public final String mo46571a(Resources resources, String str, String str2) {
        String a = mo46572a(str2);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return m55799b(resources, str, str2);
    }

    /* renamed from: b */
    private String m55799b(Resources resources, String str, String str2) {
        String str3;
        String str4;
        String valueOf = String.valueOf(str2);
        if ("_loc_key".length() != 0) {
            str3 = valueOf.concat("_loc_key");
        } else {
            str3 = new String(valueOf);
        }
        String a = mo46572a(str3);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        int identifier = resources.getIdentifier(a, "string", str);
        if (identifier == 0) {
            String valueOf2 = String.valueOf(str2);
            if ("_loc_key".length() != 0) {
                str4 = valueOf2.concat("_loc_key");
            } else {
                str4 = new String(valueOf2);
            }
            String.valueOf(m55803h(str4)).length();
            String.valueOf(str2).length();
            return null;
        }
        Object[] f = m55801f(str2);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException unused) {
            String h = m55803h(str2);
            String arrays = Arrays.toString(f);
            String.valueOf(h).length();
            String.valueOf(arrays).length();
            return null;
        }
    }
}

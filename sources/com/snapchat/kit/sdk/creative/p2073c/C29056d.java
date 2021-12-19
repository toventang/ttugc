package com.snapchat.kit.sdk.creative.p2073c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.snapchat.kit.sdk.creative.c.d */
public final class C29056d {

    /* renamed from: a */
    public final File f68630a;

    /* renamed from: b */
    public float f68631b;

    /* renamed from: c */
    public float f68632c;

    /* renamed from: d */
    public float f68633d;

    /* renamed from: e */
    public float f68634e;

    /* renamed from: f */
    public float f68635f;

    /* renamed from: g */
    public float f68636g;

    /* renamed from: h */
    public float f68637h;

    /* renamed from: i */
    private boolean f68638i;

    static {
        Covode.recordClassIndex(35403);
    }

    /* renamed from: a */
    public final JSONObject mo50724a(Uri uri, Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uri", uri);
            jSONObject.put("posX", (double) this.f68632c);
            jSONObject.put("posY", (double) this.f68633d);
            jSONObject.put("rotation", (double) this.f68631b);
            float f2 = this.f68636g;
            if (f2 != 0.0f) {
                jSONObject.put("widthDp", (double) f2);
                jSONObject.put("width", (double) (this.f68636g * f));
            } else {
                jSONObject.put("width", (double) this.f68634e);
            }
            float f3 = this.f68637h;
            if (f3 != 0.0f) {
                jSONObject.put("heightDp", (double) f3);
                jSONObject.put("height", (double) (this.f68637h * f));
            } else {
                jSONObject.put("height", (double) this.f68635f);
            }
            jSONObject.put("isAnimated", this.f68638i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

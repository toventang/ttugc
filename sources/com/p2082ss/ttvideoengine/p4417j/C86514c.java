package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.c */
public final class C86514c {

    /* renamed from: a */
    public int f194717a;

    /* renamed from: b */
    public String f194718b;

    /* renamed from: c */
    public String f194719c;

    /* renamed from: d */
    public int f194720d = -1;

    /* renamed from: e */
    public int f194721e;

    /* renamed from: f */
    public float f194722f;

    /* renamed from: g */
    public float f194723g;

    /* renamed from: h */
    public String f194724h;

    /* renamed from: com.ss.ttvideoengine.j.c$a */
    public static class C86515a {

        /* renamed from: a */
        public int f194725a;

        /* renamed from: b */
        public String f194726b;

        /* renamed from: c */
        public String f194727c;

        /* renamed from: d */
        public int f194728d = -1;

        /* renamed from: e */
        public int f194729e;

        /* renamed from: f */
        public float f194730f;

        /* renamed from: g */
        public float f194731g;

        /* renamed from: h */
        public String f194732h;

        static {
            Covode.recordClassIndex(101743);
        }
    }

    static {
        Covode.recordClassIndex(101742);
    }

    /* renamed from: a */
    public final JSONObject mo137764a() {
        try {
            if (TextUtils.isEmpty(this.f194718b)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("main_url", this.f194718b);
            jSONObject.put("check_info", this.f194719c);
            jSONObject.put("info_id", this.f194720d);
            jSONObject.put("bitrate", this.f194721e);
            jSONObject.put("loudness", (double) this.f194722f);
            jSONObject.put("peak", (double) this.f194723g);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

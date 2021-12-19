package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.model.f */
public final class C84202f {

    /* renamed from: a */
    public int f188008a;

    /* renamed from: b */
    public Object f188009b;

    /* renamed from: c */
    public int f188010c;

    /* renamed from: d */
    public int f188011d;

    static {
        Covode.recordClassIndex(98109);
    }

    /* renamed from: a */
    public final boolean mo128999a(Object obj) {
        if (obj != null) {
            try {
                switch (this.f188010c) {
                    case 1:
                        this.f188009b = Integer.valueOf(Integer.parseInt(obj.toString()));
                        break;
                    case 2:
                        this.f188009b = Long.valueOf(Long.parseLong(obj.toString()));
                        break;
                    case 3:
                        this.f188009b = Float.valueOf(Float.parseFloat(obj.toString()));
                        break;
                    case 4:
                        this.f188009b = obj.toString();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        this.f188009b = new JSONObject((String) obj);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        this.f188009b = new JSONArray((String) obj);
                        break;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f188009b != null) {
            return true;
        }
        return false;
    }
}

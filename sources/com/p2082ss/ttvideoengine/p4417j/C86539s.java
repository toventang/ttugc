package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.s */
public final class C86539s {

    /* renamed from: A */
    private int f194943A;

    /* renamed from: B */
    private int f194944B;

    /* renamed from: C */
    private double f194945C;

    /* renamed from: D */
    private String f194946D;

    /* renamed from: a */
    public int f194947a;

    /* renamed from: b */
    public String f194948b;

    /* renamed from: c */
    public String f194949c;

    /* renamed from: d */
    public int f194950d;

    /* renamed from: e */
    public int f194951e;

    /* renamed from: f */
    public int f194952f;

    /* renamed from: g */
    public int f194953g;

    /* renamed from: h */
    public double f194954h;

    /* renamed from: i */
    public double f194955i;

    /* renamed from: j */
    public String f194956j;

    /* renamed from: k */
    public ArrayList<String> f194957k;

    /* renamed from: l */
    public int f194958l = 1;

    /* renamed from: m */
    private int f194959m;

    /* renamed from: n */
    private String f194960n;

    /* renamed from: o */
    private String f194961o;

    /* renamed from: p */
    private int f194962p;

    /* renamed from: q */
    private int f194963q;

    /* renamed from: r */
    private int f194964r;

    /* renamed from: s */
    private int f194965s;

    /* renamed from: t */
    private double f194966t;

    /* renamed from: u */
    private double f194967u;

    /* renamed from: v */
    private String f194968v;

    /* renamed from: w */
    private int f194969w;

    /* renamed from: x */
    private ArrayList<String> f194970x;

    /* renamed from: y */
    private int f194971y;

    /* renamed from: z */
    private int f194972z;

    static {
        Covode.recordClassIndex(101767);
    }

    /* renamed from: a */
    public final void mo137802a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("img_num")) {
                if (this.f194958l != 3) {
                    this.f194958l = 1;
                }
            } else if (jSONObject.has("ImgUrl")) {
                this.f194958l = 2;
            }
            int i = this.f194958l;
            int i2 = 0;
            if (i == 1 || i == 3) {
                try {
                    this.f194947a = jSONObject.getInt("img_num");
                    String optString = jSONObject.optString("uri");
                    this.f194948b = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.f194948b = jSONObject.optString("img_uri");
                    }
                    this.f194949c = jSONObject.optString("img_url");
                    this.f194950d = jSONObject.optInt("img_x_size");
                    this.f194951e = jSONObject.optInt("img_y_size");
                    this.f194952f = jSONObject.optInt("img_x_len");
                    this.f194953g = jSONObject.optInt("img_y_len");
                    this.f194954h = jSONObject.optDouble("duration");
                    this.f194955i = jSONObject.optDouble("interval");
                    this.f194956j = jSONObject.optString("fext");
                    JSONArray optJSONArray = jSONObject.optJSONArray("img_urls");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        this.f194957k = new ArrayList<>();
                        while (i2 < optJSONArray.length()) {
                            this.f194957k.add(optJSONArray.optString(i2));
                            i2++;
                        }
                    }
                } catch (JSONException unused) {
                }
            } else if (i == 2) {
                try {
                    this.f194959m = jSONObject.getInt("ImgNum");
                    this.f194960n = jSONObject.optString("Uri");
                    this.f194961o = jSONObject.optString("ImgUrl");
                    this.f194962p = jSONObject.optInt("ImgXSize");
                    this.f194963q = jSONObject.optInt("ImgYSize");
                    this.f194964r = jSONObject.optInt("ImgXLen");
                    this.f194965s = jSONObject.optInt("ImgYLen");
                    this.f194966t = jSONObject.optDouble("Duration");
                    this.f194967u = jSONObject.optDouble("Interval");
                    this.f194968v = jSONObject.optString("Fext");
                } catch (JSONException unused2) {
                }
            } else if (i == 4) {
                this.f194969w = jSONObject.optInt("CaptureNum");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("StoreUrls");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    this.f194970x = new ArrayList<>();
                    while (i2 < optJSONArray2.length()) {
                        this.f194970x.add(optJSONArray2.optString(i2));
                        i2++;
                    }
                }
                this.f194971y = jSONObject.optInt("CellWidth");
                this.f194972z = jSONObject.optInt("CellHeight");
                this.f194943A = jSONObject.optInt("ImgXLen");
                this.f194944B = jSONObject.optInt("ImgYLen");
                this.f194945C = jSONObject.optDouble("Interval");
                this.f194946D = jSONObject.optString("Format");
            }
        }
    }
}

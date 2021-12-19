package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.q */
public class C86537q {

    /* renamed from: a */
    public static int f194867a;

    /* renamed from: b */
    public static int f194868b = 1;

    /* renamed from: A */
    public String f194869A;

    /* renamed from: B */
    public String f194870B;

    /* renamed from: C */
    public String f194871C;

    /* renamed from: D */
    boolean f194872D = false;

    /* renamed from: E */
    HashMap<String, EnumC86649v> f194873E;

    /* renamed from: F */
    HashMap<String, EnumC86649v> f194874F;

    /* renamed from: G */
    public int f194875G;

    /* renamed from: H */
    public JSONObject f194876H;

    /* renamed from: I */
    long f194877I;

    /* renamed from: J */
    public String f194878J;

    /* renamed from: K */
    public float f194879K;

    /* renamed from: L */
    public float f194880L;

    /* renamed from: M */
    public String f194881M;

    /* renamed from: N */
    public int[] f194882N;

    /* renamed from: O */
    long f194883O;

    /* renamed from: P */
    private ArrayList<EnumC86649v> f194884P = new ArrayList<>();

    /* renamed from: Q */
    private ArrayList<String> f194885Q = new ArrayList<>();

    /* renamed from: R */
    private String[] f194886R = null;

    /* renamed from: S */
    private String f194887S = "";

    /* renamed from: T */
    private String f194888T = "mp4";

    /* renamed from: U */
    private String f194889U = "";

    /* renamed from: V */
    private boolean f194890V = false;

    /* renamed from: W */
    private boolean f194891W = false;

    /* renamed from: X */
    private boolean f194892X = false;

    /* renamed from: Y */
    private boolean f194893Y = false;

    /* renamed from: Z */
    private boolean f194894Z = false;

    /* renamed from: aa */
    private boolean f194895aa = false;

    /* renamed from: ab */
    private boolean f194896ab = false;

    /* renamed from: ac */
    private boolean f194897ac = false;

    /* renamed from: ad */
    private String f194898ad;

    /* renamed from: ae */
    private String f194899ae;

    /* renamed from: af */
    private List<C86534o> f194900af;

    /* renamed from: ag */
    private int f194901ag;

    /* renamed from: ah */
    private int f194902ah;

    /* renamed from: ai */
    private String f194903ai;

    /* renamed from: aj */
    private String f194904aj;

    /* renamed from: ak */
    private int f194905ak;

    /* renamed from: al */
    private C86538r f194906al;

    /* renamed from: am */
    private C86532m f194907am;

    /* renamed from: an */
    private List<C86539s> f194908an;

    /* renamed from: ao */
    private int f194909ao;

    /* renamed from: ap */
    private String f194910ap;

    /* renamed from: aq */
    private String f194911aq;

    /* renamed from: ar */
    private int f194912ar;

    /* renamed from: as */
    private C86532m f194913as;

    /* renamed from: c */
    public int f194914c = 1;

    /* renamed from: d */
    public EnumC86649v[] f194915d;

    /* renamed from: e */
    public String[] f194916e;

    /* renamed from: f */
    public int[] f194917f = {-1, -1};

    /* renamed from: g */
    public String f194918g;

    /* renamed from: h */
    public String f194919h;

    /* renamed from: i */
    public String f194920i;

    /* renamed from: j */
    public String f194921j;

    /* renamed from: k */
    public boolean f194922k;

    /* renamed from: l */
    public boolean f194923l;

    /* renamed from: m */
    public String f194924m;

    /* renamed from: n */
    public int f194925n;

    /* renamed from: o */
    public List<C86534o> f194926o;

    /* renamed from: p */
    public List<C86534o> f194927p;

    /* renamed from: q */
    public List<C86534o> f194928q;

    /* renamed from: r */
    public List<C86534o> f194929r;

    /* renamed from: s */
    public String f194930s;

    /* renamed from: t */
    public String f194931t;

    /* renamed from: u */
    public String[] f194932u;

    /* renamed from: v */
    public int f194933v;

    /* renamed from: w */
    public int f194934w;

    /* renamed from: x */
    public C86538r f194935x;

    /* renamed from: y */
    public List<C86539s> f194936y;

    /* renamed from: z */
    public List<C86530k> f194937z;

    /* renamed from: a */
    public final void mo137796a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONArray optJSONArray3;
        int i;
        boolean z;
        JSONArray optJSONArray4;
        JSONArray optJSONArray5;
        JSONObject optJSONObject2;
        JSONArray optJSONArray6;
        JSONArray optJSONArray7;
        int i2;
        boolean z2;
        JSONArray optJSONArray8;
        JSONArray optJSONArray9;
        JSONObject optJSONObject3;
        if (jSONObject != null) {
            JSONArray optJSONArray10 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray10 == null || optJSONArray10.length() <= 0) && TextUtils.isEmpty(jSONObject.optString("VideoID")) && TextUtils.isEmpty(jSONObject.optString("Vid"))) {
                if (!TextUtils.isEmpty(jSONObject.optString("video_id"))) {
                    if (jSONObject.optInt("version") == 3) {
                        this.f194914c = 3;
                    } else {
                        this.f194914c = 1;
                    }
                }
            } else if (jSONObject.optInt("Version") == 4) {
                this.f194914c = 4;
            } else {
                this.f194914c = 2;
            }
            int i3 = this.f194914c;
            if (i3 == 1 || i3 == 3) {
                if (jSONObject.has("volume") && (optJSONObject3 = jSONObject.optJSONObject("volume")) != null && (optJSONObject3.has("loudness") || optJSONObject3.has("peak"))) {
                    this.f194879K = (float) optJSONObject3.optDouble("loudness");
                    this.f194880L = (float) optJSONObject3.optDouble("peak");
                }
                this.f194881M = jSONObject.optString("full_screen_strategy");
            }
            int i4 = this.f194914c;
            if (i4 == 1) {
                JSONObject optJSONObject4 = jSONObject.optJSONObject("video_list");
                this.f194934w = jSONObject.optInt("video_duration");
                this.f194933v = jSONObject.optInt("status");
                this.f194920i = jSONObject.optString("validate");
                this.f194921j = jSONObject.optString("auto_definition");
                this.f194922k = jSONObject.optBoolean("enable_ssl");
                this.f194923l = jSONObject.optBoolean("enable_adaptive");
                this.f194918g = jSONObject.optString("user_id");
                this.f194919h = jSONObject.optString("video_id");
                this.f194924m = jSONObject.optString("video_name");
                this.f194925n = jSONObject.optInt("popularity_level");
                this.f194869A = jSONObject.optString("media_type");
                this.f194878J = jSONObject.optString("optimal_decoding_mode");
                if (jSONObject.has("subtitle_langs") && (optJSONArray9 = jSONObject.optJSONArray("subtitle_langs")) != null && optJSONArray9.length() > 0) {
                    this.f194882N = new int[optJSONArray9.length()];
                    for (int i5 = 0; i5 < optJSONArray9.length(); i5++) {
                        this.f194882N[i5] = optJSONArray9.optInt(i5);
                    }
                }
                String optString = jSONObject.optString("key_seed");
                if (!TextUtils.isEmpty(optString)) {
                    this.f194870B = optString;
                }
                String optString2 = jSONObject.optString("barrage_mask_url");
                if (!TextUtils.isEmpty(optString2)) {
                    this.f194910ap = C86640h.m150083a(optString2, this.f194872D ? this.f194870B : null);
                }
                if (jSONObject.has("subtitle_infos") && (optJSONArray8 = jSONObject.optJSONArray("subtitle_infos")) != null && optJSONArray8.length() > 0) {
                    this.f194937z = new ArrayList();
                    for (int i6 = 0; i6 < optJSONArray8.length(); i6++) {
                        C86530k kVar = new C86530k();
                        kVar.mo137780a(optJSONArray8.getJSONObject(i6));
                        this.f194937z.add(kVar);
                    }
                }
                this.f194897ac = jSONObject.optBoolean("has_embedded_subtitle");
                this.f194871C = jSONObject.optString("fallback_api");
                if (this.f194869A.equals("video")) {
                    this.f194875G = f194867a;
                } else if (this.f194869A.equals(DataType.AUDIO)) {
                    this.f194875G = f194868b;
                }
                if (optJSONObject4 != null) {
                    this.f194926o = new ArrayList();
                    if (optJSONObject4.has("video_1")) {
                        C86534o a = m149760a(optJSONObject4.getJSONObject("video_1"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a.f194802P = this.f194934w;
                        this.f194926o.add(a);
                    }
                    if (optJSONObject4.has("video_2")) {
                        C86534o a2 = m149760a(optJSONObject4.getJSONObject("video_2"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a2.f194802P = this.f194934w;
                        this.f194926o.add(a2);
                    }
                    if (optJSONObject4.has("video_3")) {
                        C86534o a3 = m149760a(optJSONObject4.getJSONObject("video_3"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a3.f194802P = this.f194934w;
                        this.f194926o.add(a3);
                    }
                    if (optJSONObject4.has("video_4")) {
                        C86534o a4 = m149760a(optJSONObject4.getJSONObject("video_4"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a4.f194802P = this.f194934w;
                        this.f194926o.add(a4);
                    }
                    if (optJSONObject4.has("video_5")) {
                        C86534o a5 = m149760a(optJSONObject4.getJSONObject("video_5"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a5.f194802P = this.f194934w;
                        this.f194926o.add(a5);
                    }
                    if (optJSONObject4.has("video_6")) {
                        C86534o a6 = m149760a(optJSONObject4.getJSONObject("video_6"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a6.f194802P = this.f194934w;
                        this.f194926o.add(a6);
                    }
                    if (optJSONObject4.has("video_7")) {
                        C86534o a7 = m149760a(optJSONObject4.getJSONObject("video_7"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a7.f194802P = this.f194934w;
                        this.f194926o.add(a7);
                    }
                    if (optJSONObject4.has("video_8")) {
                        C86534o a8 = m149760a(optJSONObject4.getJSONObject("video_8"), this.f194875G, this.f194872D ? this.f194870B : null);
                        a8.f194802P = this.f194934w;
                        this.f194926o.add(a8);
                    }
                }
                this.f194876H = jSONObject.optJSONObject("dns_info");
                this.f194877I = jSONObject.optLong("dns_time");
                JSONObject optJSONObject5 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject5 != null) {
                    String optString3 = optJSONObject5.optString("main_url");
                    if (!TextUtils.isEmpty(optString3)) {
                        this.f194930s = C86640h.m150083a(optString3, this.f194872D ? this.f194870B : null);
                    }
                    String optString4 = optJSONObject5.optString("backup_url_1");
                    if (!TextUtils.isEmpty(optString4)) {
                        this.f194931t = C86640h.m150083a(optString4, this.f194872D ? this.f194870B : null);
                    }
                    this.f194887S = optJSONObject5.optString("dynamic_type");
                    this.f194927p = new ArrayList();
                    JSONArray optJSONArray11 = optJSONObject5.optJSONArray("dynamic_video_list");
                    if (optJSONArray11 == null || optJSONArray11.length() <= 0) {
                        i2 = 0;
                    } else {
                        int i7 = 0;
                        i2 = 0;
                        while (i7 < optJSONArray11.length()) {
                            C86534o a9 = m149760a(optJSONArray11.getJSONObject(i7), f194867a, this.f194872D ? this.f194870B : null);
                            a9.f194811Y = i2;
                            this.f194927p.add(a9);
                            i7++;
                            i2++;
                        }
                    }
                    JSONArray optJSONArray12 = optJSONObject5.optJSONArray("dynamic_dubbed_audios");
                    if (optJSONArray12 == null || optJSONArray12.length() <= 0) {
                        z2 = false;
                    } else {
                        this.f194928q = new ArrayList();
                        int i8 = 0;
                        z2 = false;
                        while (i8 < optJSONArray12.length()) {
                            C86534o a10 = m149760a(optJSONArray12.getJSONObject(i8), f194868b, this.f194872D ? this.f194870B : null);
                            a10.f194811Y = i2;
                            this.f194927p.add(a10);
                            this.f194928q.add(a10);
                            i8++;
                            i2++;
                            z2 = true;
                        }
                    }
                    JSONArray optJSONArray13 = optJSONObject5.optJSONArray("dynamic_audio_list");
                    int i9 = Integer.MAX_VALUE;
                    if (optJSONArray13 != null && optJSONArray13.length() > 0) {
                        this.f194929r = new ArrayList();
                        int i10 = 0;
                        while (i10 < optJSONArray13.length()) {
                            C86534o a11 = m149760a(optJSONArray13.getJSONObject(i10), f194868b, this.f194872D ? this.f194870B : null);
                            int i11 = i2 + 1;
                            a11.f194811Y = i2;
                            if (z2 && i9 > a11.f194789C) {
                                this.f194917f[f194868b] = a11.f194811Y;
                                i9 = a11.f194789C;
                            }
                            this.f194927p.add(a11);
                            this.f194929r.add(a11);
                            i10++;
                            i2 = i11;
                        }
                    }
                    if (this.f194927p.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(this.f194930s)) {
                            arrayList.add(this.f194930s);
                        }
                        if (!TextUtils.isEmpty(this.f194931t)) {
                            arrayList.add(this.f194931t);
                        }
                        String[] strArr = new String[arrayList.size()];
                        this.f194932u = strArr;
                        arrayList.toArray(strArr);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    C86538r rVar = new C86538r();
                    this.f194935x = rVar;
                    rVar.mo137801a(jSONObject.getJSONObject("seek_ts"));
                }
                if (jSONObject.has("big_thumbs") && (optJSONArray7 = jSONObject.optJSONArray("big_thumbs")) != null && optJSONArray7.length() > 0) {
                    this.f194936y = new ArrayList();
                    for (int i12 = 0; i12 < optJSONArray7.length(); i12++) {
                        C86539s sVar = new C86539s();
                        sVar.f194958l = this.f194914c;
                        sVar.mo137802a(optJSONArray7.getJSONObject(i12));
                        this.f194936y.add(sVar);
                    }
                }
            } else if (i4 == 2) {
                this.f194901ag = jSONObject.optInt("Status");
                this.f194899ae = jSONObject.optString("VideoID");
                this.f194903ai = jSONObject.optString("CoverUrl");
                this.f194902ah = jSONObject.optInt("Duration");
                this.f194904aj = jSONObject.optString("MediaType");
                this.f194909ao = jSONObject.optInt("TotalCount");
                this.f194922k = jSONObject.optBoolean("EnableSSL");
                this.f194923l = jSONObject.optBoolean("EnableAdaptive");
                if (this.f194904aj.equals("video")) {
                    this.f194905ak = f194867a;
                } else if (this.f194904aj.equals(DataType.AUDIO)) {
                    this.f194905ak = f194868b;
                }
                if (jSONObject.has("Seekts")) {
                    C86538r rVar2 = new C86538r();
                    this.f194906al = rVar2;
                    rVar2.mo137801a(jSONObject.getJSONObject("Seekts"));
                }
                if (jSONObject.has("BigThumbs") && (optJSONArray6 = jSONObject.optJSONArray("BigThumbs")) != null && optJSONArray6.length() > 0) {
                    this.f194908an = new ArrayList();
                    for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                        try {
                            C86539s sVar2 = new C86539s();
                            sVar2.f194958l = this.f194914c;
                            sVar2.mo137802a(optJSONArray6.getJSONObject(i13));
                            this.f194908an.add(sVar2);
                        } catch (JSONException unused) {
                        }
                    }
                }
                if (optJSONArray10 != null && optJSONArray10.length() > 0) {
                    this.f194900af = new ArrayList();
                    for (int i14 = 0; i14 < optJSONArray10.length(); i14++) {
                        this.f194900af.add(m149760a(optJSONArray10.getJSONObject(i14), this.f194905ak, this.f194872D ? this.f194870B : null));
                    }
                }
                if (jSONObject.has("AdaptiveInfo") && (optJSONObject2 = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                    C86532m mVar = new C86532m();
                    this.f194907am = mVar;
                    mVar.mo137782a(optJSONObject2);
                    this.f194887S = this.f194907am.mo137781a(215);
                    this.f194930s = this.f194907am.mo137781a(108);
                    this.f194931t = this.f194907am.mo137781a(109);
                    ArrayList arrayList2 = new ArrayList();
                    if (!TextUtils.isEmpty(this.f194930s)) {
                        arrayList2.add(this.f194930s);
                    }
                    if (!TextUtils.isEmpty(this.f194931t)) {
                        arrayList2.add(this.f194931t);
                    }
                    String[] strArr2 = new String[arrayList2.size()];
                    this.f194932u = strArr2;
                    arrayList2.toArray(strArr2);
                }
            } else if (i4 == 3) {
                this.f194934w = jSONObject.optInt("video_duration");
                this.f194933v = jSONObject.optInt("status");
                this.f194919h = jSONObject.optString("video_id");
                this.f194883O = jSONObject.optLong("url_expire");
                this.f194922k = jSONObject.optBoolean("enable_ssl");
                this.f194923l = jSONObject.optBoolean("enable_adaptive");
                this.f194869A = jSONObject.optString("media_type");
                this.f194878J = jSONObject.optString("optimal_decoding_mode");
                this.f194910ap = jSONObject.optString("barrage_mask_url");
                this.f194925n = jSONObject.optInt("popularity_level");
                if (this.f194869A.equals("video")) {
                    this.f194875G = f194867a;
                } else if (this.f194869A.equals(DataType.AUDIO)) {
                    this.f194875G = f194868b;
                }
                if (jSONObject.has("subtitle_langs") && (optJSONArray5 = jSONObject.optJSONArray("subtitle_langs")) != null && optJSONArray5.length() > 0) {
                    this.f194882N = new int[optJSONArray5.length()];
                    for (int i15 = 0; i15 < optJSONArray5.length(); i15++) {
                        this.f194882N[i15] = optJSONArray5.optInt(i15);
                    }
                }
                if (jSONObject.has("subtitle_infos") && (optJSONArray4 = jSONObject.optJSONArray("subtitle_infos")) != null && optJSONArray4.length() > 0) {
                    this.f194937z = new ArrayList();
                    for (int i16 = 0; i16 < optJSONArray4.length(); i16++) {
                        C86530k kVar2 = new C86530k();
                        kVar2.mo137780a(optJSONArray4.getJSONObject(i16));
                        this.f194937z.add(kVar2);
                    }
                }
                this.f194897ac = jSONObject.optBoolean("has_embedded_subtitle");
                JSONObject optJSONObject6 = jSONObject.optJSONObject("fallback_api");
                if (optJSONObject6 != null) {
                    this.f194871C = optJSONObject6.optString("fallback_api");
                    String optString5 = optJSONObject6.optString("key_seed");
                    if (!TextUtils.isEmpty(optString5)) {
                        this.f194870B = optString5;
                    }
                }
                this.f194926o = new ArrayList();
                JSONArray optJSONArray14 = jSONObject.optJSONArray("video_list");
                if (optJSONArray14 != null && optJSONArray14.length() > 0) {
                    for (int i17 = 0; i17 < optJSONArray14.length(); i17++) {
                        this.f194926o.add(m149760a(optJSONArray14.getJSONObject(i17), this.f194875G, this.f194872D ? this.f194870B : null));
                    }
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject7 != null) {
                    this.f194930s = optJSONObject7.optString("main_url");
                    this.f194931t = optJSONObject7.optString("backup_url");
                    this.f194887S = optJSONObject7.optString("dynamic_type");
                    this.f194927p = new ArrayList();
                    JSONArray optJSONArray15 = optJSONObject7.optJSONArray("dynamic_video_list");
                    if (optJSONArray15 == null || optJSONArray15.length() <= 0) {
                        i = 0;
                    } else {
                        int i18 = 0;
                        i = 0;
                        while (i18 < optJSONArray15.length()) {
                            C86534o a12 = m149760a(optJSONArray15.getJSONObject(i18), f194867a, this.f194872D ? this.f194870B : null);
                            a12.f194811Y = i;
                            this.f194927p.add(a12);
                            i18++;
                            i++;
                        }
                    }
                    JSONArray optJSONArray16 = optJSONObject7.optJSONArray("dynamic_dubbed_audios");
                    if (optJSONArray16 == null || optJSONArray16.length() <= 0) {
                        z = false;
                    } else {
                        this.f194928q = new ArrayList();
                        int i19 = 0;
                        z = false;
                        while (i19 < optJSONArray16.length()) {
                            C86534o a13 = m149760a(optJSONArray16.getJSONObject(i19), f194868b, this.f194872D ? this.f194870B : null);
                            a13.f194811Y = i;
                            this.f194927p.add(a13);
                            this.f194928q.add(a13);
                            i19++;
                            i++;
                            z = true;
                        }
                    }
                    JSONArray optJSONArray17 = optJSONObject7.optJSONArray("dynamic_audio_list");
                    int i20 = Integer.MAX_VALUE;
                    if (optJSONArray17 != null && optJSONArray17.length() > 0) {
                        this.f194929r = new ArrayList();
                        int i21 = 0;
                        while (i21 < optJSONArray17.length()) {
                            C86534o a14 = m149760a(optJSONArray17.getJSONObject(i21), f194868b, this.f194872D ? this.f194870B : null);
                            int i22 = i + 1;
                            a14.f194811Y = i;
                            if (z && i20 > a14.f194789C) {
                                this.f194917f[f194868b] = a14.f194811Y;
                                i20 = a14.f194789C;
                            }
                            this.f194927p.add(a14);
                            this.f194929r.add(a14);
                            i21++;
                            i = i22;
                        }
                    }
                    if (this.f194927p.size() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        if (!TextUtils.isEmpty(this.f194930s)) {
                            arrayList3.add(this.f194930s);
                        }
                        if (!TextUtils.isEmpty(this.f194931t)) {
                            arrayList3.add(this.f194931t);
                        }
                        String[] strArr3 = new String[arrayList3.size()];
                        this.f194932u = strArr3;
                        arrayList3.toArray(strArr3);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    C86538r rVar3 = new C86538r();
                    this.f194935x = rVar3;
                    rVar3.mo137801a(jSONObject.getJSONObject("seek_ts"));
                }
                this.f194876H = jSONObject.optJSONObject("dns_info");
                this.f194877I = jSONObject.optLong("dns_time");
                if (jSONObject.has("big_thumbs") && (optJSONArray3 = jSONObject.optJSONArray("big_thumbs")) != null && optJSONArray3.length() > 0) {
                    this.f194936y = new ArrayList();
                    for (int i23 = 0; i23 < optJSONArray3.length(); i23++) {
                        C86539s sVar3 = new C86539s();
                        sVar3.f194958l = this.f194914c;
                        sVar3.mo137802a(optJSONArray3.getJSONObject(i23));
                        this.f194936y.add(sVar3);
                    }
                }
            } else if (i4 == 4) {
                this.f194933v = jSONObject.optInt("Status");
                this.f194919h = jSONObject.optString("Vid");
                this.f194911aq = jSONObject.optString("PosterUrl");
                this.f194934w = jSONObject.optInt("Duration");
                this.f194869A = jSONObject.optString("FileType");
                this.f194912ar = jSONObject.optInt("TotalCount");
                this.f194922k = jSONObject.optBoolean("EnableSSL");
                this.f194923l = jSONObject.optBoolean("EnableAdaptive");
                this.f194910ap = jSONObject.optString("BarrageMaskUrl");
                if (this.f194869A.equals("video")) {
                    this.f194875G = f194867a;
                } else if (this.f194869A.equals(DataType.AUDIO)) {
                    this.f194875G = f194868b;
                }
                if (optJSONArray10 != null && optJSONArray10.length() > 0) {
                    this.f194926o = new ArrayList();
                    for (int i24 = 0; i24 < optJSONArray10.length(); i24++) {
                        this.f194926o.add(m149760a(optJSONArray10.getJSONObject(i24), this.f194875G, this.f194872D ? this.f194870B : null));
                    }
                }
                if (jSONObject.has("AdaptiveInfo") && (optJSONObject = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                    C86532m mVar2 = new C86532m();
                    this.f194913as = mVar2;
                    mVar2.mo137782a(optJSONObject);
                    this.f194887S = this.f194913as.mo137781a(215);
                    this.f194930s = this.f194913as.mo137781a(108);
                    this.f194931t = this.f194913as.mo137781a(109);
                    ArrayList arrayList4 = new ArrayList();
                    if (!TextUtils.isEmpty(this.f194930s)) {
                        arrayList4.add(this.f194930s);
                    }
                    if (!TextUtils.isEmpty(this.f194931t)) {
                        arrayList4.add(this.f194931t);
                    }
                    String[] strArr4 = new String[arrayList4.size()];
                    this.f194932u = strArr4;
                    arrayList4.toArray(strArr4);
                }
                if (jSONObject.has("SubtitleInfoList") && (optJSONArray2 = jSONObject.optJSONArray("SubtitleInfoList")) != null && optJSONArray2.length() > 0) {
                    this.f194937z = new ArrayList();
                    for (int i25 = 0; i25 < optJSONArray2.length(); i25++) {
                        C86530k kVar3 = new C86530k();
                        kVar3.mo137780a(optJSONArray2.getJSONObject(i25));
                        this.f194937z.add(kVar3);
                    }
                }
                if (jSONObject.has("ThumbInfoList") && (optJSONArray = jSONObject.optJSONArray("ThumbInfoList")) != null && optJSONArray.length() > 0) {
                    this.f194936y = new ArrayList();
                    for (int i26 = 0; i26 < optJSONArray.length(); i26++) {
                        C86539s sVar4 = new C86539s();
                        sVar4.f194958l = this.f194914c;
                        sVar4.mo137802a(optJSONArray.getJSONObject(i26));
                        this.f194936y.add(sVar4);
                    }
                }
            }
            List<C86534o> a15 = mo137794a();
            if (a15 != null && a15.size() > 0) {
                Iterator<C86534o> it = a15.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C86534o next = it.next();
                    int a16 = next.mo137723a();
                    int i27 = f194867a;
                    if (a16 == i27) {
                        this.f194905ak = i27;
                        this.f194875G = i27;
                        break;
                    }
                    int a17 = next.mo137723a();
                    int i28 = f194868b;
                    if (a17 == i28) {
                        this.f194905ak = i28;
                        this.f194875G = i28;
                    }
                }
            }
            JSONObject d = m149761d();
            this.f194889U = d != null ? d.toString() : "";
            EnumC86649v[] vVarArr = new EnumC86649v[this.f194884P.size()];
            this.f194915d = vVarArr;
            this.f194884P.toArray(vVarArr);
            String[] strArr5 = new String[this.f194885Q.size()];
            this.f194916e = strArr5;
            this.f194885Q.toArray(strArr5);
        }
    }

    static {
        Covode.recordClassIndex(101765);
    }

    /* renamed from: b */
    public final List<C86539s> mo137798b() {
        if (this.f194914c == 2) {
            return this.f194908an;
        }
        return this.f194936y;
    }

    /* renamed from: a */
    public final List<C86534o> mo137794a() {
        if (this.f194914c == 2) {
            return this.f194900af;
        }
        List<C86534o> list = null;
        List<C86534o> list2 = this.f194926o;
        if (list2 != null && list2.size() > 0) {
            list = this.f194926o;
        }
        List<C86534o> list3 = this.f194927p;
        if (list3 == null || list3.size() <= 0) {
            return list;
        }
        return this.f194927p;
    }

    /* renamed from: d */
    private JSONObject m149761d() {
        JSONObject d;
        try {
            List<C86534o> a = mo137794a();
            if (a != null) {
                if (a.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (C86534o oVar : a) {
                        if (!(oVar == null || (d = oVar.mo137730d()) == null)) {
                            if (oVar.mo137723a() == f194867a) {
                                jSONArray.put(d);
                            } else if (oVar.mo137723a() == f194868b) {
                                jSONArray2.put(d);
                            }
                        }
                    }
                    if (jSONArray.length() > 0 || jSONArray2.length() > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("dynamic_video_list", jSONArray);
                        jSONObject.put("dynamic_audio_list", jSONArray2);
                        return jSONObject;
                    }
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final String[] mo137800c() {
        if (this.f194886R == null) {
            List<C86534o> a = mo137794a();
            ArrayList arrayList = new ArrayList();
            if (a != null && a.size() > 0) {
                for (C86534o oVar : a) {
                    if (oVar != null) {
                        String b = oVar.mo137726b(8);
                        if (!TextUtils.isEmpty(b) && !arrayList.contains(b)) {
                            arrayList.add(b);
                        }
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            this.f194886R = strArr;
            arrayList.toArray(strArr);
        }
        return this.f194886R;
    }

    public C86537q() {
        HashMap<String, EnumC86649v> hashMap = new HashMap<>();
        hashMap.put("240p", EnumC86649v.L_Standard);
        hashMap.put("360p", EnumC86649v.Standard);
        hashMap.put("480p", EnumC86649v.High);
        hashMap.put("540p", EnumC86649v.H_High);
        hashMap.put("720p", EnumC86649v.SuperHigh);
        hashMap.put("1080p", EnumC86649v.ExtremelyHigh);
        hashMap.put("2k", EnumC86649v.TwoK);
        hashMap.put("4k", EnumC86649v.FourK);
        hashMap.put("hdr", EnumC86649v.HDR);
        hashMap.put("1080p 50fps", EnumC86649v.ExtremelyHigh_50F);
        hashMap.put("2k 50fps", EnumC86649v.TwoK_50F);
        hashMap.put("4k 50fps", EnumC86649v.FourK_50F);
        hashMap.put("1080p 60fps", EnumC86649v.ExtremelyHigh_60F);
        hashMap.put("2k 60fps", EnumC86649v.TwoK_60F);
        hashMap.put("4k 60fps", EnumC86649v.FourK_60F);
        hashMap.put("1080p 120fps", EnumC86649v.ExtremelyHigh_120F);
        hashMap.put("2k 120fps", EnumC86649v.TwoK_120F);
        hashMap.put("4k 120fps", EnumC86649v.FourK_120F);
        hashMap.put("240p HDR", EnumC86649v.L_Standard_HDR);
        hashMap.put("360p HDR", EnumC86649v.Standard_HDR);
        hashMap.put("480p HDR", EnumC86649v.High_HDR);
        hashMap.put("540p HDR", EnumC86649v.H_High_HDR);
        hashMap.put("720p HDR", EnumC86649v.SuperHigh_HDR);
        hashMap.put("1080p HDR", EnumC86649v.ExtremelyHigh_HDR);
        hashMap.put("2k HDR", EnumC86649v.TwoK_HDR);
        hashMap.put("4k HDR", EnumC86649v.FourK_HDR);
        this.f194873E = hashMap;
        HashMap<String, EnumC86649v> hashMap2 = new HashMap<>();
        hashMap2.put("medium", EnumC86649v.Standard);
        hashMap2.put("higher", EnumC86649v.High);
        hashMap2.put("highest", EnumC86649v.SuperHigh);
        hashMap2.put("original", EnumC86649v.ExtremelyHigh);
        this.f194874F = hashMap2;
        int i = f194867a;
        this.f194875G = i;
        this.f194879K = 0.0f;
        this.f194880L = 0.0f;
        this.f194898ad = null;
        this.f194900af = null;
        this.f194905ak = i;
        this.f194883O = 0;
    }

    /* renamed from: a */
    public final int mo137790a(int i) {
        int i2 = this.f194914c;
        if (i2 == 2) {
            if (i == 3) {
                return this.f194902ah;
            }
            if (i == 4) {
                return this.f194901ag;
            }
            if (i == 7) {
                return this.f194905ak;
            }
            if (i == 209) {
                return this.f194909ao;
            }
            if (i != 230) {
                return 0;
            }
            return this.f194917f[f194868b];
        } else if (i == 3) {
            return this.f194934w;
        } else {
            if (i == 4) {
                return this.f194933v;
            }
            if (i == 7) {
                return this.f194875G;
            }
            if (i == 9) {
                return i2;
            }
            if (i == 209) {
                return this.f194912ar;
            }
            if (i == 227) {
                return this.f194925n;
            }
            if (i != 230) {
                return 0;
            }
            return this.f194917f[f194868b];
        }
    }

    /* renamed from: c */
    public final Boolean mo137799c(int i) {
        if (i == 106) {
            return Boolean.valueOf(this.f194922k);
        }
        if (i == 222) {
            return Boolean.valueOf(this.f194923l);
        }
        if (i == 228) {
            return Boolean.valueOf(this.f194891W);
        }
        if (i == 229) {
            return Boolean.valueOf(this.f194897ac);
        }
        switch (i) {
            case 203:
                return Boolean.valueOf(this.f194892X);
            case 204:
                return Boolean.valueOf(this.f194890V);
            case 205:
                return Boolean.valueOf(this.f194893Y);
            case 206:
                return Boolean.valueOf(this.f194895aa);
            case 207:
                return Boolean.valueOf(this.f194894Z);
            case 208:
                return Boolean.valueOf(this.f194896ab);
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final String mo137797b(int i) {
        if (i == 211) {
            return this.f194888T;
        }
        if (i == 215) {
            return this.f194887S;
        }
        if (i == 8) {
            return this.f194889U;
        }
        if (i == 233) {
            return this.f194898ad;
        }
        if (this.f194914c == 2) {
            if (i == 2) {
                return this.f194899ae;
            }
            if (i == 7) {
                return this.f194904aj;
            }
            if (i != 201) {
                return "";
            }
            return this.f194903ai;
        } else if (i == 1) {
            return this.f194918g;
        } else {
            if (i == 2) {
                return this.f194919h;
            }
            if (i == 7) {
                return this.f194869A;
            }
            if (i == 201) {
                return this.f194911aq;
            }
            if (i == 221) {
                return this.f194910ap;
            }
            if (i == 223) {
                return this.f194878J;
            }
            if (i == 226) {
                return this.f194881M;
            }
            if (i == 104) {
                return this.f194924m;
            }
            if (i == 105) {
                return this.f194920i;
            }
            if (i == 217) {
                return this.f194871C;
            }
            if (i == 218) {
                return this.f194870B;
            }
            switch (i) {
                case 107:
                    return this.f194921j;
                case 108:
                    return this.f194930s;
                case 109:
                    return this.f194931t;
                default:
                    return "";
            }
        }
    }

    /* renamed from: a */
    public final C86534o mo137793a(Map<Integer, String> map) {
        List<C86534o> a = mo137794a();
        if (!(a == null || a.size() == 0)) {
            for (C86534o oVar : a) {
                if (oVar != null) {
                    if (!(map == null || map.size() == 0)) {
                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
                            int intValue = entry.getKey().intValue();
                            String value = entry.getValue();
                            if (TextUtils.isEmpty(value) || value.equals(oVar.mo137726b(intValue))) {
                            }
                        }
                    }
                    return oVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo137795a(HashMap<String, EnumC86649v> hashMap) {
        int a = mo137790a(7);
        if (hashMap == null || hashMap.size() <= 0) {
            if (a == f194868b) {
                hashMap = this.f194874F;
            } else {
                hashMap = this.f194873E;
            }
        } else if (a == f194868b) {
            this.f194874F = hashMap;
        } else {
            this.f194873E = hashMap;
        }
        List<C86534o> a2 = mo137794a();
        if (a2 != null) {
            for (int i = 0; i < a2.size(); i++) {
                C86534o oVar = a2.get(i);
                if (oVar != null && oVar.mo137723a() == a) {
                    oVar.mo137784a(hashMap);
                    EnumC86649v c = oVar.mo137729c();
                    String b = oVar.mo137726b(32);
                    if (!this.f194885Q.contains(b)) {
                        this.f194885Q.add(b);
                    }
                    if (!this.f194884P.contains(c)) {
                        this.f194884P.add(c);
                    }
                }
            }
        }
        EnumC86649v[] vVarArr = new EnumC86649v[this.f194884P.size()];
        this.f194915d = vVarArr;
        this.f194884P.toArray(vVarArr);
        String[] strArr = new String[this.f194885Q.size()];
        this.f194916e = strArr;
        this.f194885Q.toArray(strArr);
    }

    /* renamed from: a */
    public final C86534o mo137792a(EnumC86649v vVar, Map<Integer, String> map) {
        return mo137791a(vVar, mo137790a(7), map);
    }

    /* renamed from: a */
    public final C86534o mo137791a(EnumC86649v vVar, int i, Map<Integer, String> map) {
        List<C86534o> a = mo137794a();
        if (!(a == null || a.size() == 0)) {
            for (C86534o oVar : a) {
                if (oVar != null && i == oVar.mo137723a()) {
                    if (map != null && map.containsKey(32)) {
                        String str = map.get(32);
                        if (!TextUtils.isEmpty(oVar.mo137726b(32)) && oVar.mo137726b(32).equals(str)) {
                            return oVar;
                        }
                    }
                    if (vVar != oVar.mo137729c()) {
                        continue;
                    } else {
                        if (!(map == null || map.size() == 0)) {
                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                int intValue = entry.getKey().intValue();
                                String value = entry.getValue();
                                if (TextUtils.isEmpty(value) || value.equals(oVar.mo137726b(intValue))) {
                                }
                            }
                        }
                        return oVar;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private C86534o m149760a(JSONObject jSONObject, int i, String str) {
        String str2;
        C86534o oVar = new C86534o(str);
        oVar.f194848s = this.f194914c;
        oVar.f194807U = i;
        oVar.mo137783a(39, this.f194879K);
        oVar.mo137783a(40, this.f194880L);
        oVar.mo137785b(jSONObject);
        EnumC86649v vVar = EnumC86649v.Standard;
        int a = oVar.mo137723a();
        if (a == f194868b) {
            str2 = oVar.mo137726b(18);
        } else if (a == f194867a) {
            str2 = oVar.mo137726b(7);
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.equals(EnumC86649v.L_Standard.toString(a))) {
                vVar = EnumC86649v.L_Standard;
            } else if (str2.equals(EnumC86649v.Standard.toString(a))) {
                vVar = EnumC86649v.Standard;
            } else if (str2.equals(EnumC86649v.High.toString(a))) {
                vVar = EnumC86649v.High;
            } else if (str2.equals(EnumC86649v.H_High.toString(a))) {
                vVar = EnumC86649v.H_High;
            } else if (str2.equals(EnumC86649v.SuperHigh.toString(a))) {
                vVar = EnumC86649v.SuperHigh;
            } else if (str2.equals(EnumC86649v.ExtremelyHigh.toString(a))) {
                vVar = EnumC86649v.ExtremelyHigh;
            } else if (str2.equals(EnumC86649v.TwoK.toString(a))) {
                vVar = EnumC86649v.TwoK;
            } else if (str2.equals(EnumC86649v.FourK.toString(a))) {
                vVar = EnumC86649v.FourK;
            } else if (str2.equals(EnumC86649v.HDR.toString(a))) {
                vVar = EnumC86649v.HDR;
            } else if (str2.equals(EnumC86649v.ExtremelyHigh_50F.toString(a))) {
                vVar = EnumC86649v.ExtremelyHigh_50F;
            } else if (str2.equals(EnumC86649v.TwoK_50F.toString(a))) {
                vVar = EnumC86649v.TwoK_50F;
            } else if (str2.equals(EnumC86649v.FourK_50F.toString(a))) {
                vVar = EnumC86649v.FourK_50F;
            } else if (str2.equals(EnumC86649v.ExtremelyHigh_60F.toString(a))) {
                vVar = EnumC86649v.ExtremelyHigh_60F;
            } else if (str2.equals(EnumC86649v.TwoK_60F.toString(a))) {
                vVar = EnumC86649v.TwoK_60F;
            } else if (str2.equals(EnumC86649v.FourK_60F.toString(a))) {
                vVar = EnumC86649v.FourK_60F;
            } else if (str2.equals(EnumC86649v.ExtremelyHigh_120F.toString(a))) {
                vVar = EnumC86649v.ExtremelyHigh_120F;
            } else if (str2.equals(EnumC86649v.TwoK_120F.toString(a))) {
                vVar = EnumC86649v.TwoK_120F;
            } else if (str2.equals(EnumC86649v.FourK_120F.toString(a))) {
                vVar = EnumC86649v.FourK_120F;
            } else if (str2.equals(EnumC86649v.L_Standard_HDR.toString(a))) {
                vVar = EnumC86649v.L_Standard_HDR;
            } else if (str2.equals(EnumC86649v.Standard_HDR.toString(a))) {
                vVar = EnumC86649v.Standard_HDR;
            } else if (str2.equals(EnumC86649v.High_HDR.toString(a))) {
                vVar = EnumC86649v.High_HDR;
            } else if (str2.equals(EnumC86649v.H_High_HDR.toString(a))) {
                vVar = EnumC86649v.H_High_HDR;
            } else if (str2.equals(EnumC86649v.SuperHigh_HDR.toString(a))) {
                vVar = EnumC86649v.SuperHigh_HDR;
            } else if (str2.equals(EnumC86649v.ExtremelyHigh_HDR.toString(a))) {
                vVar = EnumC86649v.ExtremelyHigh_HDR;
            } else if (str2.equals(EnumC86649v.TwoK_HDR.toString(a))) {
                vVar = EnumC86649v.TwoK_HDR;
            } else if (str2.equals(EnumC86649v.FourK_HDR.toString(a))) {
                vVar = EnumC86649v.FourK_HDR;
            }
        }
        oVar.f194849t = vVar;
        oVar.f194850u = str2;
        String b = oVar.mo137726b(6);
        if (!TextUtils.isEmpty(b)) {
            this.f194888T = b;
        }
        if (!this.f194894Z && this.f194888T.equals("mpd")) {
            this.f194894Z = true;
        } else if (!this.f194893Y && this.f194888T.equals("dash")) {
            this.f194893Y = true;
        } else if (!this.f194895aa && this.f194888T.equals("mp4")) {
            this.f194895aa = true;
        } else if (!this.f194896ab && this.f194888T.equals("hls")) {
            this.f194896ab = true;
        }
        String b2 = oVar.mo137726b(8);
        if (!this.f194892X && b2.equals("h264")) {
            this.f194892X = true;
        } else if (!this.f194890V && b2.equals("bytevc1")) {
            this.f194890V = true;
        } else if (!this.f194891W && b2.equals("bytevc2")) {
            this.f194891W = true;
        }
        return oVar;
    }
}

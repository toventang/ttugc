package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.o */
public class C86534o implements AbstractC86516d {

    /* renamed from: A */
    public int f194787A;

    /* renamed from: B */
    public int f194788B;

    /* renamed from: C */
    public int f194789C;

    /* renamed from: D */
    public int f194790D;

    /* renamed from: E */
    public boolean f194791E = false;

    /* renamed from: F */
    public String f194792F = null;

    /* renamed from: G */
    public String f194793G;

    /* renamed from: H */
    public String f194794H;

    /* renamed from: I */
    public String f194795I;

    /* renamed from: J */
    public String f194796J;

    /* renamed from: K */
    public String f194797K;

    /* renamed from: L */
    public int f194798L;

    /* renamed from: M */
    public int f194799M;

    /* renamed from: N */
    public int f194800N;

    /* renamed from: O */
    public long f194801O = 0;

    /* renamed from: P */
    public int f194802P = 0;

    /* renamed from: Q */
    public int f194803Q = 0;

    /* renamed from: R */
    public int f194804R = 1;

    /* renamed from: S */
    public boolean f194805S = false;

    /* renamed from: T */
    public String f194806T;

    /* renamed from: U */
    public int f194807U = 0;

    /* renamed from: V */
    public float f194808V = 0.0f;

    /* renamed from: W */
    public float f194809W = 0.0f;

    /* renamed from: X */
    public HashMap<Double, Long> f194810X;

    /* renamed from: Y */
    public int f194811Y = -1;

    /* renamed from: Z */
    public int f194812Z = -1;

    /* renamed from: a */
    private String f194813a = null;

    /* renamed from: aa */
    public String f194814aa = "";

    /* renamed from: ab */
    public String f194815ab = "";

    /* renamed from: ac */
    private String f194816ac;

    /* renamed from: ad */
    private String f194817ad = null;

    /* renamed from: ae */
    private String f194818ae;

    /* renamed from: af */
    private int f194819af;

    /* renamed from: ag */
    private int f194820ag;

    /* renamed from: ah */
    private int f194821ah;

    /* renamed from: ai */
    private int f194822ai = 0;

    /* renamed from: aj */
    private long f194823aj = 0;

    /* renamed from: ak */
    private String f194824ak = null;

    /* renamed from: al */
    private String f194825al = null;

    /* renamed from: am */
    private String f194826am = null;

    /* renamed from: an */
    private String f194827an = null;

    /* renamed from: ao */
    private String f194828ao = null;

    /* renamed from: ap */
    private C86528i f194829ap = null;

    /* renamed from: aq */
    private String f194830aq;

    /* renamed from: b */
    private String f194831b = null;

    /* renamed from: c */
    private long f194832c = 0;

    /* renamed from: d */
    private String f194833d = null;

    /* renamed from: e */
    private int f194834e = 0;

    /* renamed from: f */
    private String f194835f;

    /* renamed from: g */
    private String f194836g;

    /* renamed from: h */
    private String f194837h;

    /* renamed from: i */
    private String f194838i;

    /* renamed from: j */
    private String f194839j;

    /* renamed from: k */
    private int f194840k = 0;

    /* renamed from: l */
    private String[] f194841l = null;

    /* renamed from: m */
    private String f194842m;

    /* renamed from: n */
    private String f194843n;

    /* renamed from: o */
    private int f194844o;

    /* renamed from: p */
    private int f194845p;

    /* renamed from: q */
    private int f194846q;

    /* renamed from: r */
    private String f194847r = null;

    /* renamed from: s */
    public int f194848s = 1;

    /* renamed from: t */
    public EnumC86649v f194849t = EnumC86649v.Standard;

    /* renamed from: u */
    String f194850u = EnumC86649v.Standard.toString(C86537q.f194867a);

    /* renamed from: v */
    public String[] f194851v;

    /* renamed from: w */
    public String f194852w;

    /* renamed from: x */
    public String f194853x;

    /* renamed from: y */
    public String f194854y;

    /* renamed from: z */
    public String f194855z;

    static {
        Covode.recordClassIndex(101762);
    }

    /* renamed from: a */
    public int mo137725a(JSONObject jSONObject) {
        return -1;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: a */
    public int mo137723a() {
        return this.f194807U;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: c */
    public EnumC86649v mo137729c() {
        return this.f194849t;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: e */
    public C86528i mo137731e() {
        return this.f194829ap;
    }

    /* renamed from: b */
    public final void mo137785b(JSONObject jSONObject) {
        int i;
        JSONObject optJSONObject;
        int i2;
        JSONObject optJSONObject2;
        if (jSONObject != null) {
            if (!TextUtils.isEmpty(jSONObject.optString("main_url"))) {
                if (this.f194848s != 3) {
                    this.f194848s = 1;
                }
            } else if (!TextUtils.isEmpty(jSONObject.optString("MainPlayUrl")) && this.f194848s != 4) {
                this.f194848s = 2;
            }
            int i3 = this.f194848s;
            if (i3 == 1) {
                ArrayList arrayList = new ArrayList();
                this.f194852w = C86640h.m150083a(jSONObject.optString("main_url"), this.f194833d);
                this.f194853x = C86640h.m150083a(jSONObject.optString("backup_url_1"), this.f194833d);
                this.f194854y = C86640h.m150083a(jSONObject.optString("backup_url_2"), this.f194833d);
                this.f194855z = C86640h.m150083a(jSONObject.optString("backup_url_3"), this.f194833d);
                if (!TextUtils.isEmpty(this.f194852w)) {
                    arrayList.add(this.f194852w);
                }
                if (!TextUtils.isEmpty(this.f194853x)) {
                    arrayList.add(this.f194853x);
                }
                if (!TextUtils.isEmpty(this.f194854y)) {
                    arrayList.add(this.f194854y);
                }
                if (!TextUtils.isEmpty(this.f194855z)) {
                    arrayList.add(this.f194855z);
                }
                String[] strArr = new String[arrayList.size()];
                this.f194851v = strArr;
                arrayList.toArray(strArr);
                try {
                    this.f194787A = Integer.parseInt(jSONObject.optString("vwidth"));
                } catch (NumberFormatException unused) {
                    this.f194787A = 0;
                }
                try {
                    this.f194788B = Integer.parseInt(jSONObject.optString("vheight"));
                    i2 = 0;
                } catch (NumberFormatException unused2) {
                    i2 = 0;
                    this.f194788B = 0;
                }
                try {
                    this.f194789C = jSONObject.optInt("bitrate");
                } catch (Exception unused3) {
                    this.f194789C = i2;
                }
                try {
                    this.f194840k = jSONObject.optInt("quality_type");
                } catch (Exception unused4) {
                    this.f194840k = 0;
                }
                this.f194791E = jSONObject.optBoolean("encrypt");
                this.f194792F = jSONObject.optString("spade_a");
                this.f194790D = jSONObject.optInt("gbr");
                this.f194793G = jSONObject.optString("storePath");
                this.f194794H = jSONObject.optString("vtype");
                this.f194797K = jSONObject.optString("definition");
                this.f194795I = jSONObject.optString("codec_type");
                try {
                    this.f194801O = jSONObject.optLong("size", 0);
                } catch (Exception unused5) {
                    this.f194801O = 0;
                }
                if (jSONObject.has("volume") && (optJSONObject2 = jSONObject.optJSONObject("volume")) != null && (optJSONObject2.has("loudness") || optJSONObject2.has("peak"))) {
                    this.f194808V = (float) optJSONObject2.optDouble("loudness");
                    this.f194809W = (float) optJSONObject2.optDouble("peak");
                }
                this.f194798L = jSONObject.optInt("preload_size");
                this.f194799M = jSONObject.optInt("play_load_min_step");
                this.f194800N = jSONObject.optInt("play_load_max_step");
                this.f194803Q = jSONObject.optInt("preload_interval", -1);
                this.f194804R = jSONObject.optInt("use_video_proxy", 1);
                this.f194834e = jSONObject.optInt("socket_buffer", 0);
                this.f194796J = jSONObject.optString("file_hash");
                this.f194806T = jSONObject.optString("quality");
                this.f194827an = jSONObject.optString("quality_desc");
                this.f194835f = jSONObject.optString("logo_type");
                String optString = jSONObject.optString("file_id");
                this.f194813a = optString;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(this.f194794H) && (this.f194794H.equals("hls") || this.f194794H.equals("m3u8"))) {
                    this.f194796J = "fileid" + this.f194813a;
                }
                this.f194831b = C86640h.m150083a(jSONObject.optString("p2p_verify_url"), (String) null);
                this.f194832c = jSONObject.optLong("url_expire");
                this.f194836g = jSONObject.optString("check_info");
                this.f194837h = jSONObject.optString("init_range");
                this.f194838i = jSONObject.optString("index_range");
                this.f194839j = jSONObject.optString("kid");
                this.f194830aq = C86640h.m150083a(jSONObject.optString("barrage_mask_url"), this.f194833d);
                if (jSONObject.has("fitter_info")) {
                    C86528i iVar = new C86528i();
                    this.f194829ap = iVar;
                    iVar.mo137779a(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray.length() > 0) {
                            this.f194810X = new HashMap<>();
                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                JSONArray optJSONArray = jSONArray.optJSONArray(i4);
                                if (optJSONArray != null && optJSONArray.length() == 2) {
                                    this.f194810X.put(Double.valueOf(optJSONArray.optDouble(0)), Long.valueOf(optJSONArray.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    this.f194812Z = jSONObject.optInt("language_id", -1);
                    this.f194814aa = jSONObject.optString("language_code", "");
                    this.f194815ab = jSONObject.optString("dub_version", "");
                } catch (Exception unused6) {
                    this.f194812Z = -1;
                    this.f194814aa = "";
                    this.f194815ab = "";
                }
            } else if (i3 == 2) {
                this.f194846q = jSONObject.optInt("Bitrate");
                this.f194843n = jSONObject.optString("FileHash");
                this.f194823aj = jSONObject.optLong("Size");
                this.f194845p = jSONObject.optInt("Height");
                this.f194844o = jSONObject.optInt("Width");
                this.f194816ac = jSONObject.optString("Format");
                this.f194817ad = jSONObject.optString("Codec");
                this.f194824ak = jSONObject.optString("Logo");
                this.f194818ae = jSONObject.optString("Definition");
                this.f194825al = jSONObject.optString("Quality");
                this.f194847r = jSONObject.optString("PlayAuth");
                this.f194842m = jSONObject.optString("MainPlayUrl");
                this.f194826am = jSONObject.optString("BackupPlayUrl");
                String optString2 = jSONObject.optString("MediaType");
                try {
                    this.f194840k = jSONObject.optInt("QualityType");
                } catch (Exception unused7) {
                    this.f194840k = 0;
                }
                if (!TextUtils.isEmpty(optString2)) {
                    if (optString2.equals("video")) {
                        this.f194807U = C86537q.f194867a;
                    } else if (optString2.equals(DataType.AUDIO)) {
                        this.f194807U = C86537q.f194868b;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(this.f194842m)) {
                    arrayList2.add(this.f194842m);
                }
                if (!TextUtils.isEmpty(this.f194826am)) {
                    arrayList2.add(this.f194826am);
                }
                String[] strArr2 = new String[arrayList2.size()];
                this.f194841l = strArr2;
                arrayList2.toArray(strArr2);
                this.f194822ai = jSONObject.optInt("PreloadInterval", -1);
                this.f194820ag = jSONObject.optInt("PreloadMinStep");
                this.f194821ah = jSONObject.optInt("PreloadMaxStep");
                this.f194819af = jSONObject.optInt("PreloadSize");
                String optString3 = jSONObject.optString("FileID");
                this.f194813a = optString3;
                if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(this.f194816ac) && (this.f194816ac.equals("hls") || this.f194816ac.equals("m3u8"))) {
                    this.f194843n = "fileid" + this.f194813a;
                }
                this.f194831b = jSONObject.optString("P2pVerifyURL");
                this.f194836g = jSONObject.optString("CheckInfo");
                this.f194837h = jSONObject.optString("InitRange");
                this.f194838i = jSONObject.optString("IndexRange");
                this.f194839j = jSONObject.optString("PlayAuthID");
                if (jSONObject.has("fitter_info")) {
                    C86528i iVar2 = new C86528i();
                    this.f194829ap = iVar2;
                    iVar2.mo137779a(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray2 = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray2.length() > 0) {
                            this.f194810X = new HashMap<>();
                            for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                                JSONArray optJSONArray2 = jSONArray2.optJSONArray(i5);
                                if (optJSONArray2 != null && optJSONArray2.length() == 2) {
                                    this.f194810X.put(Double.valueOf(optJSONArray2.optDouble(0)), Long.valueOf(optJSONArray2.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                try {
                    this.f194812Z = jSONObject.optInt("LanguageId", -1);
                    this.f194814aa = jSONObject.optString("LanguageCode", "");
                    this.f194815ab = jSONObject.optString("DubVersion", "");
                } catch (Exception unused8) {
                    this.f194812Z = -1;
                    this.f194814aa = "";
                    this.f194815ab = "";
                }
            } else if (i3 == 3) {
                ArrayList arrayList3 = new ArrayList();
                this.f194852w = jSONObject.optString("main_url");
                this.f194853x = jSONObject.optString("backup_url");
                arrayList3.add(this.f194852w);
                arrayList3.add(this.f194853x);
                String[] strArr3 = new String[arrayList3.size()];
                this.f194851v = strArr3;
                arrayList3.toArray(strArr3);
                if (jSONObject.has("volume") && (optJSONObject = jSONObject.optJSONObject("volume")) != null && (optJSONObject.has("loudness") || optJSONObject.has("peak"))) {
                    this.f194808V = (float) optJSONObject.optDouble("loudness");
                    this.f194809W = (float) optJSONObject.optDouble("peak");
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("video_meta");
                if (optJSONObject3 != null) {
                    this.f194835f = optJSONObject3.optString("logo_type");
                    this.f194827an = optJSONObject3.optString("quality_desc");
                    this.f194794H = optJSONObject3.optString("vtype");
                    this.f194797K = optJSONObject3.optString("definition");
                    this.f194795I = optJSONObject3.optString("codec_type");
                    try {
                        this.f194787A = Integer.parseInt(optJSONObject3.optString("vwidth"));
                    } catch (NumberFormatException unused9) {
                        this.f194787A = 0;
                    }
                    try {
                        this.f194788B = Integer.parseInt(optJSONObject3.optString("vheight"));
                        i = 0;
                    } catch (NumberFormatException unused10) {
                        i = 0;
                        this.f194788B = 0;
                    }
                    try {
                        this.f194789C = optJSONObject3.optInt("bitrate");
                    } catch (Exception unused11) {
                        this.f194789C = i;
                    }
                    try {
                        this.f194840k = optJSONObject3.optInt("quality_type");
                    } catch (Exception unused12) {
                        this.f194840k = 0;
                    }
                    this.f194806T = optJSONObject3.optString("quality");
                    this.f194813a = optJSONObject3.optString("file_id");
                    this.f194796J = optJSONObject3.optString("file_hash");
                    if (!TextUtils.isEmpty(this.f194813a) && !TextUtils.isEmpty(this.f194794H) && (this.f194794H.equals("hls") || this.f194794H.equals("m3u8") || TextUtils.isEmpty(this.f194796J))) {
                        this.f194796J = "fileid" + this.f194813a;
                    }
                    try {
                        this.f194801O = optJSONObject3.optLong("size", 0);
                    } catch (Exception unused13) {
                        this.f194801O = 0;
                    }
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("audio_meta");
                if (optJSONObject4 != null) {
                    this.f194827an = optJSONObject4.optString("quality_desc");
                    this.f194794H = optJSONObject4.optString("atype");
                    this.f194797K = optJSONObject4.optString("definition");
                    this.f194806T = optJSONObject4.optString("quality");
                    this.f194795I = optJSONObject4.optString("codec_type");
                    try {
                        this.f194789C = optJSONObject4.optInt("bitrate");
                    } catch (Exception unused14) {
                        this.f194789C = 0;
                    }
                    this.f194813a = optJSONObject4.optString("file_id");
                    this.f194796J = optJSONObject4.optString("file_hash");
                    if (!TextUtils.isEmpty(this.f194813a) && TextUtils.isEmpty(this.f194796J)) {
                        this.f194796J = "fileid" + this.f194813a;
                    }
                    try {
                        this.f194801O = optJSONObject4.optLong("size", 0);
                    } catch (Exception unused15) {
                        this.f194801O = 0;
                    }
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("encrypt_info");
                if (optJSONObject5 != null) {
                    this.f194791E = optJSONObject5.optBoolean("encrypt");
                    this.f194792F = optJSONObject5.optString("spade_a");
                    this.f194839j = optJSONObject5.optString("kid");
                }
                JSONObject optJSONObject6 = jSONObject.optJSONObject("p2p_info");
                if (optJSONObject6 != null) {
                    this.f194831b = optJSONObject6.optString("p2p_verify_url");
                }
                JSONObject optJSONObject7 = jSONObject.optJSONObject("check_info");
                if (optJSONObject7 != null) {
                    this.f194836g = optJSONObject7.optString("check_info");
                }
                JSONObject optJSONObject8 = jSONObject.optJSONObject("base_range_info");
                if (optJSONObject8 != null) {
                    this.f194837h = optJSONObject8.optString("init_range");
                    this.f194838i = optJSONObject8.optString("index_range");
                }
                JSONObject optJSONObject9 = jSONObject.optJSONObject("barrage_info");
                if (optJSONObject9 != null) {
                    this.f194828ao = optJSONObject9.optString("barrage_mask_offset");
                }
                if (jSONObject.has("fitter_info")) {
                    C86528i iVar3 = new C86528i();
                    this.f194829ap = iVar3;
                    iVar3.mo137779a(jSONObject.optJSONObject("fitter_info"));
                }
                if (jSONObject.has("pkt_offset")) {
                    try {
                        JSONArray jSONArray3 = new JSONArray(jSONObject.optString("pkt_offset"));
                        if (jSONArray3.length() > 0) {
                            this.f194810X = new HashMap<>();
                            for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                                JSONArray optJSONArray3 = jSONArray3.optJSONArray(i6);
                                if (optJSONArray3 != null && optJSONArray3.length() == 2) {
                                    this.f194810X.put(Double.valueOf(optJSONArray3.optDouble(0)), Long.valueOf(optJSONArray3.optLong(1)));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                try {
                    this.f194812Z = jSONObject.optInt("language_id", -1);
                    this.f194814aa = jSONObject.optString("language_code", "");
                    this.f194815ab = jSONObject.optString("dub_version", "");
                } catch (Exception unused16) {
                    this.f194812Z = -1;
                    this.f194814aa = "";
                    this.f194815ab = "";
                }
            } else if (i3 == 4) {
                this.f194789C = jSONObject.optInt("Bitrate");
                this.f194796J = jSONObject.optString("Md5");
                this.f194801O = jSONObject.optLong("Size");
                this.f194788B = jSONObject.optInt("Height");
                this.f194787A = jSONObject.optInt("Width");
                this.f194794H = jSONObject.optString("Format");
                this.f194795I = jSONObject.optString("Codec");
                this.f194835f = jSONObject.optString("LogoType");
                this.f194797K = jSONObject.optString("Definition");
                this.f194806T = jSONObject.optString("Quality");
                this.f194792F = jSONObject.optString("PlayAuth");
                this.f194852w = jSONObject.optString("MainPlayUrl");
                this.f194853x = jSONObject.optString("BackupPlayUrl");
                try {
                    this.f194840k = jSONObject.optInt("QualityType");
                } catch (Exception unused17) {
                    this.f194840k = 0;
                }
                String optString4 = jSONObject.optString("FileType");
                if (!TextUtils.isEmpty(optString4)) {
                    if (optString4.equals("video")) {
                        this.f194807U = C86537q.f194867a;
                    } else if (optString4.equals(DataType.AUDIO)) {
                        this.f194807U = C86537q.f194868b;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                if (!TextUtils.isEmpty(this.f194852w)) {
                    arrayList4.add(this.f194852w);
                }
                if (!TextUtils.isEmpty(this.f194853x)) {
                    arrayList4.add(this.f194853x);
                }
                String[] strArr4 = new String[arrayList4.size()];
                this.f194851v = strArr4;
                arrayList4.toArray(strArr4);
                String optString5 = jSONObject.optString("FileId");
                this.f194813a = optString5;
                if (!TextUtils.isEmpty(optString5) && !TextUtils.isEmpty(this.f194794H) && (this.f194794H.equals("hls") || this.f194794H.equals("m3u8"))) {
                    this.f194796J = "fileid" + this.f194813a;
                }
                this.f194836g = jSONObject.optString("CheckInfo");
                this.f194837h = jSONObject.optString("InitRange");
                this.f194838i = jSONObject.optString("IndexRange");
                this.f194839j = jSONObject.optString("PlayAuthId");
                try {
                    this.f194812Z = jSONObject.optInt("LanguageId", -1);
                    this.f194814aa = jSONObject.optString("LanguageCode", "");
                    this.f194815ab = jSONObject.optString("DubVersion", "");
                } catch (Exception unused18) {
                    this.f194812Z = -1;
                    this.f194814aa = "";
                    this.f194815ab = "";
                }
            }
        }
    }

    /* renamed from: b */
    public String[] mo137727b() {
        if (this.f194848s == 2) {
            return this.f194841l;
        }
        return this.f194851v;
    }

    /* renamed from: d */
    public JSONObject mo137730d() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            String[] b = mo137727b();
            if (b != null) {
                if (b.length > 0) {
                    jSONObject.put("main_url", b[0]);
                    if (b.length > 1) {
                        str = b[1];
                    } else {
                        str = "";
                    }
                    jSONObject.put("backup_url_1", str);
                    jSONObject.put("bitrate", mo137724a(3));
                    jSONObject.put("vwidth", mo137724a(1));
                    jSONObject.put("vheight", mo137724a(2));
                    jSONObject.put("init_range", mo137726b(34));
                    jSONObject.put("index_range", mo137726b(35));
                    jSONObject.put("check_info", mo137726b(31));
                    jSONObject.put("kid", mo137726b(36));
                    jSONObject.put("loudness", (double) mo137786d(39));
                    jSONObject.put("peak", (double) mo137786d(40));
                    jSONObject.put("info_id", mo137724a(42));
                    return jSONObject;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public Map<String, Object> mo137732f() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", mo137726b(28));
        if (mo137723a() == C86537q.f194867a) {
            str = "video";
        } else {
            str = DataType.AUDIO;
        }
        hashMap.put("media_type", str);
        hashMap.put("file_size", Long.valueOf(mo137728c(12)));
        hashMap.put("bitrate", Integer.valueOf(mo137724a(3)));
        hashMap.put("quality", mo137726b(18));
        hashMap.put("definition", mo137726b(7));
        hashMap.put("width", Integer.valueOf(mo137724a(1)));
        hashMap.put("height", Integer.valueOf(mo137724a(2)));
        hashMap.put("codec", mo137726b(8));
        hashMap.put("urls", mo137727b());
        hashMap.put("file_hash", mo137726b(15));
        String b = mo137726b(29);
        if (b == null) {
            b = "";
        }
        hashMap.put("p2p_crc", C86640h.m150106h(b));
        return hashMap;
    }

    /* renamed from: d */
    public final float mo137786d(int i) {
        if (i == 39) {
            return this.f194808V;
        }
        if (i != 40) {
            return 0.0f;
        }
        return this.f194809W;
    }

    /* renamed from: c */
    public long mo137728c(int i) {
        if (this.f194848s == 2) {
            if (i != 12) {
                return -1;
            }
            return this.f194823aj;
        } else if (i == 12) {
            return this.f194801O;
        } else {
            if (i != 30) {
                return -1;
            }
            return this.f194832c;
        }
    }

    public C86534o(String str) {
        this.f194833d = str;
    }

    /* renamed from: a */
    public final void mo137784a(HashMap<String, EnumC86649v> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            String str = null;
            if (this.f194807U == C86537q.f194868b) {
                str = mo137726b(18);
                if (TextUtils.isEmpty(str)) {
                    str = EnumC86649v.Standard.toString(this.f194807U);
                }
            } else if (this.f194807U == C86537q.f194867a) {
                str = mo137726b(7);
                if (TextUtils.isEmpty(str)) {
                    str = EnumC86649v.Standard.toString(this.f194807U);
                }
            }
            EnumC86649v vVar = hashMap.get(str);
            this.f194849t = vVar;
            if (vVar == null) {
                this.f194849t = EnumC86649v.Standard;
            }
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: a */
    public int mo137724a(int i) {
        if (i == 38) {
            C86528i iVar = this.f194829ap;
            if (iVar != null) {
                return iVar.f194760b;
            }
            return 0;
        } else if (this.f194848s == 2) {
            if (i == 1) {
                return this.f194844o;
            }
            if (i == 2) {
                return this.f194845p;
            }
            if (i == 3) {
                return this.f194846q;
            }
            if (i == 13) {
                return this.f194822ai;
            }
            if (i == 41) {
                return this.f194840k;
            }
            if (i == 42) {
                return this.f194811Y;
            }
            switch (i) {
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return this.f194819af;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return this.f194820ag;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return this.f194821ah;
                default:
                    return -1;
            }
        } else if (i == 1) {
            return this.f194787A;
        } else {
            if (i == 2) {
                return this.f194788B;
            }
            if (i == 3) {
                return this.f194789C;
            }
            if (i == 13) {
                return this.f194803Q;
            }
            if (i == 27) {
                return this.f194802P;
            }
            if (i == 41) {
                return this.f194840k;
            }
            if (i == 42) {
                return this.f194811Y;
            }
            switch (i) {
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return this.f194798L;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return this.f194799M;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return this.f194800N;
                default:
                    switch (i) {
                        case C84224v.f188239U:
                            return this.f194790D;
                        case 21:
                            return this.f194804R;
                        case 22:
                            return this.f194834e;
                        default:
                            return -1;
                    }
            }
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86516d
    /* renamed from: b */
    public String mo137726b(int i) {
        switch (i) {
            case 26:
                return this.f194850u;
            case 27:
            case 30:
            case 32:
            case 33:
            default:
                if (this.f194848s == 2) {
                    if (i == 0) {
                        return this.f194842m;
                    }
                    if (i == 15) {
                        return this.f194843n;
                    }
                    if (i == 5) {
                        return this.f194847r;
                    }
                    if (i == 6) {
                        return this.f194816ac;
                    }
                    if (i == 7) {
                        return this.f194818ae;
                    }
                    if (i == 8) {
                        return this.f194817ad;
                    }
                    switch (i) {
                        case 17:
                            return this.f194826am;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            return this.f194825al;
                        case 19:
                            return this.f194824ak;
                        default:
                            return "";
                    }
                } else if (i == 0) {
                    return this.f194852w;
                } else {
                    if (i == 15) {
                        return this.f194796J;
                    }
                    if (i == 37) {
                        return this.f194830aq;
                    }
                    if (i == 5) {
                        return this.f194792F;
                    }
                    if (i == 6) {
                        return this.f194794H;
                    }
                    if (i == 7) {
                        return this.f194797K;
                    }
                    if (i == 8) {
                        return this.f194795I;
                    }
                    if (i == 32) {
                        return this.f194827an;
                    }
                    if (i == 33) {
                        return this.f194828ao;
                    }
                    switch (i) {
                        case 17:
                            return this.f194853x;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            return this.f194806T;
                        case 19:
                            return this.f194835f;
                        default:
                            switch (i) {
                                case 23:
                                    return this.f194854y;
                                case 24:
                                    return this.f194855z;
                                case 25:
                                    return this.f194793G;
                                default:
                                    return "";
                            }
                    }
                }
            case 28:
                return this.f194813a;
            case 29:
                return this.f194831b;
            case 31:
                return this.f194836g;
            case 34:
                return this.f194837h;
            case 35:
                return this.f194838i;
            case 36:
                return this.f194839j;
        }
    }

    /* renamed from: a */
    public final void mo137783a(int i, float f) {
        if (i == 39) {
            this.f194808V = f;
        } else if (i == 40) {
            this.f194809W = f;
        }
    }
}

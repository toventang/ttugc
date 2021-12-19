package com.p2082ss.ttvideoengine.p4411e;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86385d;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.JniUtils;
import com.p2082ss.ttvideoengine.p4412f.C86437e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86535p;
import com.p2082ss.ttvideoengine.p4417j.C86537q;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import com.p2082ss.ttvideoengine.p4430s.C86643k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.c */
public class C86416c extends C86412a {

    /* renamed from: A */
    public Map<Integer, String> f193724A;

    /* renamed from: B */
    public HashMap<String, EnumC86649v> f193725B;

    /* renamed from: C */
    public EnumC86649v f193726C;

    /* renamed from: D */
    public String f193727D;

    /* renamed from: E */
    public String f193728E;

    /* renamed from: F */
    Context f193729F;

    /* renamed from: G */
    public AbstractC86561j f193730G;

    /* renamed from: H */
    public AbstractC86422e f193731H;

    /* renamed from: I */
    private String f193732I = "h264";

    /* renamed from: J */
    private C86437e f193733J;

    /* renamed from: K */
    private String f193734K;

    /* renamed from: L */
    private String f193735L;

    /* renamed from: M */
    private int f193736M;

    /* renamed from: u */
    public EnumC86649v f193737u;

    /* renamed from: v */
    public boolean f193738v;

    /* renamed from: w */
    public boolean f193739w;

    /* renamed from: x */
    public boolean f193740x;

    /* renamed from: y */
    public C86535p f193741y;

    /* renamed from: z */
    public int f193742z;

    static {
        Covode.recordClassIndex(101644);
    }

    private C86416c() {
    }

    /* renamed from: e */
    static C86416c m149095e() {
        C86416c cVar = new C86416c();
        cVar.mo137436b();
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: b */
    public final void mo137436b() {
        super.mo137436b();
        this.f193736M = 0;
        this.f193701c = "vid_task";
        this.f193742z = 0;
        this.f193737u = EnumC86649v.Standard;
    }

    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: a */
    public final void mo137432a() {
        C86641i.m150113b("TTVideoEngine.DownloadVidTask", "[downloader] did call resume, videoId = " + this.f193711m);
        if (this.f193710l) {
            C86641i.m150113b("TTVideoEngine.DownloadVidTask", "[downloader] task did canceled");
        } else if (this.f193704f == 2) {
            C86641i.m150113b("TTVideoEngine.DownloadVidTask", "[downloader] state is running");
        } else {
            super.mo137432a();
            if (this.f193712n == null || this.f193712n.mo137450a(this)) {
                this.f193736M = 0;
                mo137433a(2);
                C86535p pVar = this.f193741y;
                if (pVar != null) {
                    mo137444b(pVar);
                } else {
                    m149096f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: c */
    public final JSONObject mo137438c() {
        HashMap hashMap = new HashMap();
        m149077a(hashMap, "base_json", super.mo137439d());
        m149075a(hashMap, "codec_type", this.f193732I);
        m149078a(hashMap, "base_dash", this.f193738v);
        m149078a(hashMap, "https", this.f193739w);
        m149078a(hashMap, "boe", this.f193740x);
        m149075a(hashMap, "resolution", EnumC86649v.toString(this.f193737u));
        m149077a(hashMap, "param", this.f193724A);
        HashMap<String, EnumC86649v> hashMap2 = this.f193725B;
        if (hashMap2 != null && hashMap2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            for (String str : this.f193725B.keySet()) {
                hashMap3.put(str, EnumC86649v.toString(this.f193725B.get(str)));
            }
            m149077a(hashMap, "resolution_map", hashMap3);
        }
        m149073a((Map) hashMap, "api_version", this.f193742z);
        m149075a(hashMap, "curr_resolution", EnumC86649v.toString(this.f193726C));
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            C86535p pVar = this.f193741y;
            if (pVar != null) {
                jSONObject.putOpt("video_model", pVar.f194861f);
            }
            return jSONObject;
        } catch (JSONException unused) {
            C86641i.m150117e("TTVideoEngine.DownloadVidTask", "[downloader] jsonObject fail.");
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    /* renamed from: f */
    private void m149096f() {
        int i;
        this.f193727D = null;
        this.f193728E = null;
        this.f193733J = null;
        C86437e eVar = new C86437e(this.f193729F, this.f193730G);
        this.f193733J = eVar;
        eVar.f193803e = new C86417a(this);
        this.f193733J.f193804f = this.f193725B;
        this.f193733J.f193805g = this.f193711m;
        this.f193733J.mo137476a(true);
        if (!TextUtils.isEmpty(this.f193734K)) {
            try {
                i = JniUtils.m148584b();
            } catch (Exception unused) {
                i = 0;
            }
            String a = C1764a.m5928a("%s&method=%d", new Object[]{this.f193734K, Integer.valueOf(i)});
            this.f193727D = a;
            if (this.f193740x) {
                this.f193727D = C86640h.m150097c(a);
            }
            String a2 = C86643k.m150120a(this.f193727D);
            this.f193727D = a2;
            C86641i.m150110a("TTVideoEngine.DownloadVidTask", C1764a.m5928a("[downloader] api string from fallback api:%s ,keySeed = %s", new Object[]{a2, this.f193735L}));
            this.f193733J.mo137471a((Boolean) true);
            this.f193733J.mo137474a(this.f193727D, null, 0, this.f193735L);
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.f193732I.equals("bytevc2")) {
            hashMap.put("codec_type", "4");
        } else if (this.f193732I.equals("bytevc1")) {
            hashMap.put("codec_type", "3");
        }
        if (this.f193738v) {
            hashMap.put("format_type", "dash");
        }
        if (this.f193739w) {
            hashMap.put("ssl", "1");
        }
        AbstractC86422e eVar2 = this.f193731H;
        if (eVar2 != null) {
            this.f193727D = eVar2.mo137454a();
            this.f193728E = this.f193731H.mo137455b();
            if (this.f193740x) {
                this.f193727D = C86640h.m150097c(this.f193727D);
            } else {
                this.f193727D = this.f193727D;
            }
        }
        String a3 = C86643k.m150120a(this.f193727D);
        this.f193727D = a3;
        this.f193733J.mo137473a(a3, this.f193728E, this.f193742z);
        C86641i.m150110a("TTVideoEngine.DownloadVidTask", "[downloader] fetch videoModel, apiString = " + this.f193727D);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: a */
    public final void mo137434a(C86633c cVar) {
        if (mo137437b(cVar)) {
            this.f193736M++;
            m149096f();
            return;
        }
        super.mo137434a(cVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: b */
    public final boolean mo137437b(C86633c cVar) {
        if (super.mo137437b(cVar) && this.f193736M < 10) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo137444b(C86535p pVar) {
        this.f193707i.clear();
        this.f193708j = new HashMap();
        String h = pVar.mo137755h();
        if (TextUtils.isEmpty(h) || !h.equals("segment_base")) {
            C86534o a = pVar.mo137739a(this.f193737u, this.f193724A, true);
            if (m149094a(a)) {
                this.f193726C = a.mo137729c();
            } else {
                return;
            }
        } else {
            C86534o a2 = pVar.mo137737a(this.f193737u, C86537q.f194868b, this.f193724A, true);
            if (a2 != null) {
                if (m149094a(a2)) {
                    this.f193726C = a2.mo137729c();
                } else {
                    return;
                }
            }
            C86534o a3 = pVar.mo137737a(this.f193737u, C86537q.f194867a, this.f193724A, true);
            if (a3 != null) {
                if (m149094a(a3)) {
                    this.f193726C = a3.mo137729c();
                } else {
                    return;
                }
            }
        }
        if (this.f193712n != null) {
            this.f193712n.mo137451b(this);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(C86416c.class)) {
            return false;
        }
        C86416c cVar = (C86416c) obj;
        if (this.f193707i != null && this.f193707i.size() > 0 && cVar.f193707i != null) {
            return this.f193707i.equals(cVar.f193707i);
        }
        if (this.f193711m == null || cVar.f193711m == null ? this.f193711m == null && cVar.f193711m == null : this.f193711m.equals(cVar.f193711m)) {
            if (this.f193738v == cVar.f193738v && this.f193732I.equals(cVar.f193732I) && this.f193737u == cVar.f193737u) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m149094a(C86534o oVar) {
        String[] b = oVar.mo137727b();
        String b2 = oVar.mo137726b(15);
        if (b == null || b.length <= 0 || TextUtils.isEmpty(b2)) {
            mo137434a(new C86633c("kTTVideoErrorDomainFetchingInfo", -9996, 0, "error info  urls or filehash is null: apiString = " + this.f193727D + " authString = " + this.f193728E + " filehash = " + b2));
            return false;
        }
        C86641i.m150113b("TTVideoEngine.DownloadVidTask", "[downloader] download urlinfo videoId = " + this.f193711m + " " + oVar.mo137729c().toString() + " filehash = " + b2);
        this.f193707i.add(b2);
        this.f193708j.put(b2, Arrays.asList(b));
        String a = C86385d.C86400h.f193679a.mo137359a(b2, this.f193711m, b, this.f193718t.version);
        if (C86385d.C86400h.f193679a.mo137396l(a)) {
            return true;
        }
        mo137434a(new C86633c("kTTVideoErrorDomainDownload", -9996, 0, "resume download fail. url = " + a + " dataloader state is " + C86385d.C86400h.f193679a.mo137380c()));
        return false;
    }

    /* renamed from: a */
    public final void mo137443a(C86535p pVar) {
        this.f193741y = pVar;
        String b = pVar.mo137744b(217);
        String b2 = pVar.mo137744b(218);
        if (!TextUtils.isEmpty(b)) {
            this.f193734K = b;
            C86641i.m150110a("TTVideoEngine.DownloadVidTask", "[downloader] set fallbackapi ".concat(String.valueOf(b)));
        }
        if (!TextUtils.isEmpty(b2)) {
            this.f193735L = b2;
            C86641i.m150110a("TTVideoEngine.DownloadVidTask", "[downloader] set keyseed " + this.f193735L);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.ttvideoengine.p4411e.C86412a
    /* renamed from: a */
    public final void mo137435a(JSONObject jSONObject) {
        super.mo137435a(jSONObject.optJSONObject("base_json"));
        this.f193732I = jSONObject.optString("codec_type");
        this.f193738v = jSONObject.optBoolean("base_dash");
        this.f193739w = jSONObject.optBoolean("https");
        this.f193740x = jSONObject.optBoolean("boe");
        EnumC86649v forString = EnumC86649v.forString(jSONObject.optString("resolution"));
        this.f193737u = forString;
        if (forString == EnumC86649v.Undefine) {
            this.f193737u = EnumC86649v.Standard;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("param");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            this.f193724A = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f193724A.put(Integer.valueOf(next), optJSONObject.optString(next));
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("resolution_map");
        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
            this.f193725B = new HashMap<>();
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                this.f193725B.put(next2, EnumC86649v.forString(optJSONObject2.optString(next2)));
            }
        }
        this.f193742z = jSONObject.optInt("api_version");
        this.f193726C = EnumC86649v.forString(jSONObject.optString("curr_resolution"));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("video_model");
        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
            C86535p pVar = new C86535p();
            try {
                pVar.mo137789a(optJSONObject3);
            } catch (Throwable unused) {
                C86641i.m150117e("TTVideoEngine.DownloadVidTask", "[downloader] ssignWithJson fail.");
                pVar = null;
            } finally {
                mo137443a(pVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.e.c$a */
    public class C86417a implements C86437e.AbstractC86441a {

        /* renamed from: b */
        private final WeakReference<C86416c> f193744b;

        static {
            Covode.recordClassIndex(101645);
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137285a(C86633c cVar) {
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137286a(String str) {
        }

        public C86417a(C86416c cVar) {
            this.f193744b = new WeakReference<>(cVar);
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137283a(int i, String str) {
            C86416c cVar = this.f193744b.get();
            if (cVar != null) {
                cVar.mo137434a(new C86633c("kTTVideoErrorDomainFetchingInfo", -9996, i, "error info: apiString = " + C86416c.this.f193727D + " authString = " + C86416c.this.f193728E + " apiVersion = " + C86416c.this.f193742z + " state = " + i));
            }
        }

        @Override // com.p2082ss.ttvideoengine.p4412f.C86437e.AbstractC86441a
        /* renamed from: a */
        public final void mo137284a(C86535p pVar, C86633c cVar) {
            C86416c cVar2 = this.f193744b.get();
            if (cVar2 != null) {
                C86641i.m150113b("TTVideoEngine.DownloadVidTask", "did fetch video modeo, videoId is " + cVar2.f193711m);
                if (cVar2.f193704f == 4 || cVar2.f193704f == 5) {
                    C86641i.m150113b("TTVideoEngine.DownloadVidTask", "but state is canceled. videoId = " + cVar2.f193711m);
                } else if (pVar != null) {
                    cVar2.mo137443a(pVar);
                    if (cVar2.f193704f == 3) {
                        C86641i.m150113b("TTVideoEngine.DownloadVidTask", "but state is suspended. videoId = " + cVar2.f193711m);
                    } else {
                        cVar2.mo137444b(pVar);
                    }
                } else if (cVar != null) {
                    cVar2.mo137434a(cVar);
                }
            }
        }
    }
}

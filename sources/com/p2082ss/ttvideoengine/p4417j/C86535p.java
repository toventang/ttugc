package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.p */
public class C86535p implements AbstractC86517e {

    /* renamed from: a */
    public C86537q f194856a;

    /* renamed from: b */
    public List<C86531l> f194857b;

    /* renamed from: c */
    public C86527h f194858c;

    /* renamed from: d */
    public C86537q f194859d;

    /* renamed from: e */
    public int f194860e = 1;

    /* renamed from: f */
    public JSONObject f194861f;

    /* renamed from: g */
    public boolean f194862g;

    /* renamed from: h */
    public String f194863h;

    /* renamed from: i */
    private int f194864i = 1;

    /* renamed from: j */
    private HashMap<String, EnumC86649v> f194865j;

    static {
        Covode.recordClassIndex(101763);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final int mo137735a(String str) {
        return -1;
    }

    /* renamed from: a */
    public final void mo137789a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f194861f = new JSONObject(jSONObject.toString());
            } catch (Throwable unused) {
                C86641i.m150117e("VideoModel", "generate mJsonInfo error");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                this.f194864i = 1;
                C86537q qVar = new C86537q();
                qVar.f194914c = this.f194864i;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("data");
                qVar.f194872D = this.f194862g;
                qVar.f194870B = this.f194863h;
                qVar.mo137796a(optJSONObject2);
                this.f194856a = qVar;
                this.f194859d = qVar;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("video_ad_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f194857b = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        C86531l lVar = new C86531l();
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        lVar.f194775e = jSONObject2.optLong("id");
                        lVar.f194771a = jSONObject2.optString("log_extra");
                        lVar.f194772b = jSONObject2.optInt("skip_time");
                        lVar.f194773c = jSONObject2.optInt("patch_position");
                        lVar.f194774d = jSONObject2.optInt("duration");
                        lVar.f194776f = jSONObject2.optString("external_url");
                        try {
                            JSONArray jSONArray = jSONObject2.getJSONArray("play_track_url_list");
                            if (jSONArray != null) {
                                lVar.f194777g = C86531l.m149712a(jSONArray, new String[1]);
                            }
                        } catch (JSONException unused2) {
                        }
                        try {
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("playover_track_url_list");
                            if (jSONArray2 != null) {
                                lVar.f194778h = C86531l.m149712a(jSONArray2, new String[1]);
                            }
                        } catch (JSONException unused3) {
                        }
                        try {
                            JSONArray jSONArray3 = jSONObject2.getJSONArray("action_track_url_list");
                            if (jSONArray3 != null) {
                                lVar.f194779i = C86531l.m149712a(jSONArray3, new String[1]);
                            }
                        } catch (JSONException unused4) {
                        }
                        this.f194857b.add(lVar);
                    } catch (Exception unused5) {
                    }
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("live_info");
            if (optJSONObject3 != null) {
                this.f194860e = 0;
                this.f194858c = new C86527h();
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("data");
                C86527h hVar = this.f194858c;
                if (optJSONObject4 != null) {
                    JSONObject optJSONObject5 = optJSONObject4.optJSONObject("live_info");
                    try {
                        if (optJSONObject5.has("live_0")) {
                            hVar.f194757h = new C86526g();
                            hVar.f194757h.mo137777a(optJSONObject5.getJSONObject("live_0"));
                        }
                        if (optJSONObject5.has("live_1")) {
                            hVar.f194758i = new C86526g();
                            hVar.f194758i.mo137777a(optJSONObject5.getJSONObject("live_1"));
                        }
                        hVar.f194752c = optJSONObject5.optInt("backup_status");
                        hVar.f194753d = optJSONObject5.optInt("live_status");
                        hVar.f194754e = optJSONObject5.optInt("status");
                        hVar.f194755f = optJSONObject5.optLong("start_time");
                        hVar.f194756g = optJSONObject5.optLong("end_time");
                    } catch (JSONException unused6) {
                    }
                    hVar.f194750a = optJSONObject4.optString("user_id");
                    hVar.f194751b = optJSONObject4.optString("live_id");
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray2 != null && optJSONArray2.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID")) || !TextUtils.isEmpty(jSONObject.optString("Vid"))) {
                if (jSONObject.optInt("Version") == 4) {
                    this.f194864i = 4;
                } else {
                    this.f194864i = 2;
                }
                C86537q qVar2 = new C86537q();
                this.f194859d = qVar2;
                qVar2.f194914c = this.f194864i;
                this.f194859d.mo137796a(jSONObject);
            }
            mo137741a(this.f194865j);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final boolean mo137743a(AbstractC86517e.EnumC86518a aVar) {
        if (this.f194859d == null) {
            return false;
        }
        int i = C865361.f194866a[aVar.ordinal()];
        if (i == 1) {
            return this.f194859d.mo137799c(208).booleanValue();
        }
        if (i == 2) {
            return this.f194859d.mo137799c(206).booleanValue();
        }
        if (i != 3) {
            return false;
        }
        return this.f194859d.mo137799c(205).booleanValue();
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final boolean mo137742a() {
        return (this.f194859d == null && this.f194858c == null) ? false : true;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: c */
    public final List<C86530k> mo137747c() {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.f194937z;
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: d */
    public final AbstractC86517e.EnumC86519b mo137750d() {
        AbstractC86517e.EnumC86519b bVar = AbstractC86517e.EnumC86519b.None;
        int i = this.f194860e;
        if (i == 0) {
            return AbstractC86517e.EnumC86519b.LIVE;
        }
        if (i != 1) {
            return bVar;
        }
        return AbstractC86517e.EnumC86519b.VOD;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: f */
    public final String[] mo137753f() {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137800c();
        }
        return new String[0];
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: g */
    public final String mo137754g() {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137797b(211);
        }
        return "mp4";
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: h */
    public final String mo137755h() {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137797b(215);
        }
        return "";
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: i */
    public final EnumC86649v[] mo137756i() {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.f194915d;
        }
        return new EnumC86649v[0];
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: j */
    public final JSONObject mo137757j() {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.f194876H;
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: m */
    public final String mo137760m() {
        JSONObject n = mo137761n();
        if (n != null) {
            return n.toString();
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: b */
    public final List<C86534o> mo137745b() {
        C86537q qVar = this.f194859d;
        if (qVar == null) {
            return Collections.emptyList();
        }
        return qVar.mo137794a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.j.p$1 */
    public static /* synthetic */ class C865361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f194866a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 101764(0x18d84, float:1.42602E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.ttvideoengine.j.e$a[] r0 = com.p2082ss.ttvideoengine.p4417j.AbstractC86517e.EnumC86518a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.ttvideoengine.p4417j.C86535p.C865361.f194866a = r2
                com.ss.ttvideoengine.j.e$a r0 = com.p2082ss.ttvideoengine.p4417j.AbstractC86517e.EnumC86518a.HLS     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.ttvideoengine.p4417j.C86535p.C865361.f194866a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.ttvideoengine.j.e$a r0 = com.p2082ss.ttvideoengine.p4417j.AbstractC86517e.EnumC86518a.MP4     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.ttvideoengine.p4417j.C86535p.C865361.f194866a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.ttvideoengine.j.e$a r0 = com.p2082ss.ttvideoengine.p4417j.AbstractC86517e.EnumC86518a.DASH     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.ttvideoengine.p4417j.C86535p.C865361.f194866a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.ttvideoengine.j.e$a r0 = com.p2082ss.ttvideoengine.p4417j.AbstractC86517e.EnumC86518a.NONE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4417j.C86535p.C865361.<clinit>():void");
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: e */
    public final String mo137752e() {
        List<C86534o> a;
        C86537q qVar = this.f194859d;
        if (qVar == null || (a = qVar.mo137794a()) == null || a.size() == 0) {
            return null;
        }
        for (C86534o oVar : a) {
            String b = oVar.mo137726b(5);
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: l */
    public final boolean mo137759l() {
        if (!TextUtils.isEmpty(mo137744b(8)) && mo137743a(AbstractC86517e.EnumC86518a.HLS) && mo137748c(222)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo137758k() {
        /*
            r4 = this;
            r0 = 8
            java.lang.String r0 = r4.mo137744b(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r0 == 0) goto L_0x000e
            return r3
        L_0x000e:
            com.ss.ttvideoengine.j.e$a r0 = com.p2082ss.ttvideoengine.p4417j.AbstractC86517e.EnumC86518a.DASH
            boolean r0 = r4.mo137743a(r0)
            r2 = 1
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r4.mo137755h()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "segment_base"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0045
            return r2
        L_0x002a:
            com.ss.ttvideoengine.j.e$a r0 = com.p2082ss.ttvideoengine.p4417j.AbstractC86517e.EnumC86518a.MP4
            boolean r0 = r4.mo137743a(r0)
            if (r0 == 0) goto L_0x0045
            r0 = 222(0xde, float:3.11E-43)
            boolean r0 = r4.mo137748c(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r4.mo137752e()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0045
            return r2
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4417j.C86535p.mo137758k():boolean");
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: n */
    public final JSONObject mo137761n() {
        String b = mo137744b(211);
        String b2 = mo137744b(2);
        int a = mo137734a(3);
        List<C86534o> b3 = mo137745b();
        if (b3 == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C86534o oVar : b3) {
                arrayList.add(oVar.mo137732f());
            }
            hashMap.put("format", b);
            hashMap.put("vid", b2);
            hashMap.put("category", Integer.valueOf(mo137734a(232)));
            hashMap.put("frt_sub_vid", mo137744b(233));
            hashMap.put("duration", Integer.valueOf(a));
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo137788a(C86537q qVar) {
        this.f194859d = qVar;
        mo137741a(this.f194865j);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final int mo137734a(int i) {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137790a(i);
        }
        return -1;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: b */
    public final String mo137744b(int i) {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137797b(i);
        }
        return "";
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: c */
    public final boolean mo137748c(int i) {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137799c(i).booleanValue();
        }
        return false;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: d */
    public final long mo137749d(int i) {
        C86537q qVar = this.f194859d;
        if (qVar == null) {
            return 0;
        }
        if (i == 216) {
            return qVar.f194877I;
        }
        if (i != 220) {
            return 0;
        }
        return qVar.f194883O;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: e */
    public final float mo137751e(int i) {
        C86537q qVar = this.f194859d;
        if (qVar == null) {
            return 0.0f;
        }
        if (i == 224) {
            return qVar.f194879K;
        }
        if (i != 225) {
            return 0.0f;
        }
        return qVar.f194880L;
    }

    /* renamed from: a */
    public final C86534o mo137787a(Map<Integer, String> map) {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137793a(map);
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final String mo137740a(EnumC86649v vVar) {
        HashMap<String, EnumC86649v> hashMap;
        C86537q qVar = this.f194859d;
        if (qVar == null) {
            return vVar.toString(C86537q.f194867a);
        }
        int a = qVar.mo137790a(7);
        if (a == C86537q.f194868b) {
            hashMap = qVar.f194874F;
        } else {
            hashMap = qVar.f194873E;
        }
        String str = null;
        Iterator<Map.Entry<String, EnumC86649v>> it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, EnumC86649v> next = it.next();
            if (next.getValue().getIndex() == vVar.getIndex()) {
                str = next.getKey();
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return vVar.toString(a);
        }
        return str;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final void mo137741a(HashMap<String, EnumC86649v> hashMap) {
        this.f194865j = hashMap;
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            qVar.mo137795a(hashMap);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137738a(EnumC86649v vVar, Map<Integer, String> map) {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137792a(vVar, map);
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: b */
    public final String[] mo137746b(EnumC86649v vVar, Map<Integer, String> map) {
        C86526g gVar;
        C86537q qVar = this.f194859d;
        if (qVar == null) {
            C86527h hVar = this.f194858c;
            if (hVar != null) {
                if (hVar.f194757h != null) {
                    gVar = hVar.f194757h;
                } else if (hVar.f194758i != null) {
                    gVar = hVar.f194758i;
                }
                if (gVar != null) {
                    return gVar.f194749c;
                }
            }
            return new String[0];
        } else if (qVar.f194932u != null && qVar.f194932u.length > 0) {
            return qVar.f194932u;
        } else {
            C86534o a = qVar.mo137792a(vVar, map);
            if (a == null) {
                return new String[0];
            }
            return a.mo137727b();
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137736a(EnumC86649v vVar, int i, Map<Integer, String> map) {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return qVar.mo137791a(vVar, i, map);
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137739a(EnumC86649v vVar, Map<Integer, String> map, boolean z) {
        C86537q qVar = this.f194859d;
        if (qVar != null) {
            return mo137737a(vVar, qVar.mo137790a(7), map, z);
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137737a(EnumC86649v vVar, int i, Map<Integer, String> map, boolean z) {
        String str;
        C86534o a = mo137736a(vVar, i, map);
        if (!z) {
            return a;
        }
        String[] strArr = C86313ai.f192852cj;
        int i2 = 0;
        if (strArr.length > 0 && map != null && map.containsKey(32)) {
            int length = strArr.length - 1;
            if (a == null && (str = map.get(32)) != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= strArr.length) {
                        break;
                    } else if (strArr[i3].equals(str)) {
                        length = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                int i4 = length;
                do {
                    map.put(32, strArr[i4]);
                    a = mo137736a(vVar, i, map);
                    if (a != null) {
                        return a;
                    }
                    i4 = ((i4 + strArr.length) - 1) % strArr.length;
                } while (i4 != length);
            }
        }
        EnumC86649v[] allResolutions = EnumC86649v.getAllResolutions();
        if (allResolutions.length <= 0) {
            return a;
        }
        int length2 = allResolutions.length - 1;
        if (vVar != null) {
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i2].getIndex() == vVar.getIndex()) {
                    length2 = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i5 = length2;
        if (a == null) {
            do {
                a = mo137736a(allResolutions[i5], i, (Map<Integer, String>) null);
                if (a != null) {
                    break;
                }
                i5 = ((i5 + allResolutions.length) - 1) % allResolutions.length;
            } while (i5 != length2);
        }
        return a;
    }
}

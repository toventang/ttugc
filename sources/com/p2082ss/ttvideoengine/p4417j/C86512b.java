package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86510a;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.b */
public final class C86512b implements AbstractC86517e {

    /* renamed from: a */
    public String f194701a;

    /* renamed from: b */
    public long f194702b;

    /* renamed from: c */
    public float f194703c;

    /* renamed from: d */
    public float f194704d;

    /* renamed from: e */
    public List<C86534o> f194705e;

    /* renamed from: f */
    public int f194706f;

    /* renamed from: g */
    public String f194707g;

    /* renamed from: h */
    public boolean f194708h;

    static {
        Covode.recordClassIndex(101740);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final void mo137741a(HashMap<String, EnumC86649v> hashMap) {
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: c */
    public final List<C86530k> mo137747c() {
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: c */
    public final boolean mo137748c(int i) {
        return false;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: d */
    public final long mo137749d(int i) {
        return 0;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: g */
    public final String mo137754g() {
        return "mp4";
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: h */
    public final String mo137755h() {
        return "";
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: j */
    public final JSONObject mo137757j() {
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: k */
    public final boolean mo137758k() {
        return false;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: l */
    public final boolean mo137759l() {
        return false;
    }

    private C86512b() {
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: b */
    public final List<C86534o> mo137745b() {
        return this.f194705e;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final boolean mo137743a(AbstractC86517e.EnumC86518a aVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(AbstractC86517e.EnumC86518a.MP4);
        return hashSet.contains(aVar);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: d */
    public final AbstractC86517e.EnumC86519b mo137750d() {
        return AbstractC86517e.EnumC86519b.BARE;
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
    /* renamed from: e */
    public final String mo137752e() {
        for (C86534o oVar : this.f194705e) {
            String b = oVar.mo137726b(5);
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: com.ss.ttvideoengine.j.b$a */
    public static class C86513a {

        /* renamed from: a */
        public String f194709a;

        /* renamed from: b */
        public long f194710b;

        /* renamed from: c */
        private boolean f194711c;

        /* renamed from: d */
        private float f194712d;

        /* renamed from: e */
        private float f194713e;

        /* renamed from: f */
        private int f194714f;

        /* renamed from: g */
        private String f194715g;

        /* renamed from: h */
        private List<C86534o> f194716h;

        static {
            Covode.recordClassIndex(101741);
        }

        /* renamed from: a */
        public final C86512b mo137763a() {
            C86512b bVar = new C86512b((byte) 0);
            bVar.f194701a = this.f194709a;
            bVar.f194702b = this.f194710b;
            bVar.f194708h = this.f194711c;
            bVar.f194703c = this.f194712d;
            bVar.f194704d = this.f194713e;
            bVar.f194706f = this.f194714f;
            bVar.f194707g = this.f194715g;
            if (this.f194716h == null) {
                this.f194716h = new ArrayList();
            }
            bVar.f194705e = this.f194716h;
            return bVar;
        }

        /* renamed from: a */
        public final C86513a mo137762a(C86534o oVar) {
            if (this.f194716h == null) {
                this.f194716h = new ArrayList();
            }
            this.f194716h.add(oVar);
            return this;
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: f */
    public final String[] mo137753f() {
        HashSet hashSet = new HashSet();
        for (C86534o oVar : this.f194705e) {
            String b = oVar.mo137726b(8);
            if (!TextUtils.isEmpty(b)) {
                hashSet.add(b);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: i */
    public final EnumC86649v[] mo137756i() {
        HashSet hashSet = new HashSet();
        for (C86534o oVar : this.f194705e) {
            hashSet.add(oVar.mo137729c());
        }
        return (EnumC86649v[]) hashSet.toArray(new EnumC86649v[0]);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: n */
    public final JSONObject mo137761n() {
        String str;
        if (mo137743a(AbstractC86517e.EnumC86518a.MP4)) {
            str = "mp4";
        } else if (mo137743a(AbstractC86517e.EnumC86518a.MP3)) {
            str = "mp3";
        } else {
            str = "";
        }
        String b = mo137744b(2);
        long j = this.f194702b;
        List<C86534o> list = this.f194705e;
        if (list == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C86534o oVar : list) {
                arrayList.add(oVar.mo137732f());
            }
            hashMap.put("format", str);
            hashMap.put("vid", b);
            hashMap.put("category", Integer.valueOf(mo137734a(232)));
            hashMap.put("frt_sub_vid", mo137744b(233));
            hashMap.put("duration", Long.valueOf(j));
            hashMap.put("infos", arrayList);
            return new JSONObject(hashMap);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final boolean mo137742a() {
        List<C86534o> list = this.f194705e;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* synthetic */ C86512b(byte b) {
        this();
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final String mo137740a(EnumC86649v vVar) {
        return vVar.toString(C86537q.f194867a);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: b */
    public final String mo137744b(int i) {
        if (i == 2) {
            return this.f194701a;
        }
        if (i != 233) {
            return null;
        }
        return this.f194707g;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: e */
    public final float mo137751e(int i) {
        if (i == 224) {
            return this.f194703c;
        }
        if (i != 225) {
            return 0.0f;
        }
        return this.f194704d;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final int mo137734a(int i) {
        if (i == 3) {
            return (int) this.f194702b;
        }
        if (i == 7) {
            return C86537q.f194867a;
        }
        if (i != 232) {
            return 0;
        }
        return this.f194706f;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final int mo137735a(String str) {
        try {
            return m149630a(new JSONObject(str));
        } catch (Exception e) {
            C86641i.m150110a("TTVideoEngine.BareVideoModel", "[GearStrategy]fromMediaInfoJsonString exception=".concat(String.valueOf(e)));
            return -1;
        }
    }

    /* renamed from: a */
    private int m149630a(JSONObject jSONObject) {
        try {
            this.f194701a = jSONObject.optString("vid");
            this.f194706f = jSONObject.optInt("category");
            this.f194702b = jSONObject.optLong("duration");
            JSONArray jSONArray = jSONObject.getJSONArray("infos");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    C86510a a = new C86510a.C86511a().mo137733a();
                    a.mo137725a(jSONArray.getJSONObject(i));
                    if (this.f194705e == null) {
                        this.f194705e = new ArrayList();
                    }
                    this.f194705e.add(a);
                }
            }
            return 0;
        } catch (Exception e) {
            C86641i.m150110a("TTVideoEngine.BareVideoModel", "[GearStrategy]fromMediaInfoJsonObject exception=".concat(String.valueOf(e)));
            return -1;
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137738a(EnumC86649v vVar, Map<Integer, String> map) {
        return mo137736a(vVar, mo137734a(7), map);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: b */
    public final String[] mo137746b(EnumC86649v vVar, Map<Integer, String> map) {
        C86534o a = mo137738a(vVar, map);
        if (a == null) {
            return new String[0];
        }
        return a.mo137727b();
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137736a(EnumC86649v vVar, int i, Map<Integer, String> map) {
        Iterator<C86534o> it = this.f194705e.iterator();
        while (it.hasNext()) {
            C86534o next = it.next();
            if (next != null && vVar == next.mo137729c() && i == next.mo137723a()) {
                if (map == null || map.isEmpty()) {
                    return next;
                }
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    String value = entry.getValue();
                    if (TextUtils.isEmpty(value) || value.equals(next.mo137726b(intValue))) {
                    }
                }
                return next;
            }
        }
        return null;
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137739a(EnumC86649v vVar, Map<Integer, String> map, boolean z) {
        return mo137737a(vVar, mo137734a(7), map, z);
    }

    @Override // com.p2082ss.ttvideoengine.p4417j.AbstractC86517e
    /* renamed from: a */
    public final C86534o mo137737a(EnumC86649v vVar, int i, Map<Integer, String> map, boolean z) {
        C86534o a = mo137736a(vVar, i, map);
        if (!z) {
            return a;
        }
        String[] strArr = C86313ai.f192852cj;
        int i2 = 0;
        if (strArr.length > 0 && map != null && map.containsKey(32)) {
            int length = strArr.length - 1;
            if (a == null) {
                while (true) {
                    String str = map.get(32);
                    if (str != null) {
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
                            C86534o a2 = mo137736a(vVar, i, map);
                            if (a2 != null) {
                                return a2;
                            }
                            i4 = ((i4 + strArr.length) - 1) % strArr.length;
                        } while (i4 != length);
                        length = i4;
                    }
                }
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

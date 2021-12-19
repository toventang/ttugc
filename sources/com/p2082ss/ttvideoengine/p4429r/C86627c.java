package com.p2082ss.ttvideoengine.p4429r;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.r.c */
public final class C86627c {

    /* renamed from: a */
    public C86628d f195210a = new C86628d();

    /* renamed from: b */
    public AbstractC86626b f195211b = null;

    /* renamed from: c */
    public int f195212c = 1;

    /* renamed from: d */
    public boolean f195213d = false;

    /* renamed from: e */
    public boolean f195214e = false;

    /* renamed from: f */
    public int f195215f = 0;

    /* renamed from: g */
    public int f195216g = -1;

    /* renamed from: h */
    public int f195217h = -1;

    /* renamed from: i */
    public Map<Integer, List<Integer>> f195218i = new HashMap();

    /* renamed from: j */
    public EnumC86649v f195219j = EnumC86649v.Standard;

    /* renamed from: k */
    public EnumC86649v f195220k = EnumC86649v.Standard;

    /* renamed from: l */
    private int f195221l = 0;

    static {
        Covode.recordClassIndex(101855);
    }

    /* renamed from: b */
    public final boolean mo137886b() {
        Boolean bool = this.f195210a.f195222a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo137883a() {
        this.f195210a.mo137889a();
        this.f195213d = false;
        this.f195214e = false;
        this.f195215f = 0;
        this.f195216g = -1;
        this.f195217h = -1;
        this.f195221l = new Random().nextInt(100);
        this.f195219j = EnumC86649v.Standard;
        this.f195220k = EnumC86649v.Standard;
    }

    public C86627c() {
        this.f195210a.mo137893b();
        this.f195210a.f195222a = false;
        this.f195210a.f195233l = false;
        this.f195210a.mo137892b(false);
        this.f195211b = null;
        this.f195212c = 1;
        this.f195213d = false;
        this.f195214e = false;
        this.f195215f = 0;
        this.f195216g = -1;
        this.f195217h = -1;
        this.f195221l = new Random().nextInt(100);
        this.f195219j = EnumC86649v.Standard;
        this.f195220k = EnumC86649v.Standard;
        this.f195218i.put(Integer.valueOf(EnumC86649v.Standard.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(EnumC86649v.High.getIndex()))));
        this.f195218i.put(Integer.valueOf(EnumC86649v.High.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(EnumC86649v.H_High.getIndex()))));
        this.f195218i.put(Integer.valueOf(EnumC86649v.H_High.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(EnumC86649v.SuperHigh.getIndex()))));
        this.f195218i.put(Integer.valueOf(EnumC86649v.SuperHigh.getIndex()), new ArrayList(Arrays.asList(Integer.valueOf(EnumC86649v.ExtremelyHigh.getIndex()))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r2.compareTo(java.lang.Integer.valueOf(r3.intValue() & r2.intValue())) != 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d1, code lost:
        if (r2.compareTo(java.lang.Integer.valueOf(r3.intValue() & r2.intValue())) != 0) goto L_0x00d3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m150029c() {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4429r.C86627c.m150029c():void");
    }

    /* renamed from: a */
    public final void mo137885a(C86628d dVar) {
        C86641i.m150110a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig cfg=".concat(String.valueOf(dVar)));
        if (dVar != null) {
            this.f195210a.mo137890a(dVar);
            String str = dVar.f195244w;
            if (str != null && !str.isEmpty()) {
                String lowerCase = str.toLowerCase();
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(lowerCase).getJSONObject("sr").getJSONObject("benchmark");
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int parseInt = Integer.parseInt(next);
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
                        }
                        hashMap.put(Integer.valueOf(parseInt), arrayList);
                    }
                    this.f195218i = hashMap;
                    C86641i.m150110a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig mSRBenchmark=" + this.f195218i);
                } catch (Exception e) {
                    C86641i.m150110a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig exception=".concat(String.valueOf(e)));
                    e.printStackTrace();
                }
            }
            C86641i.m150110a("TTVideoEngine.SRStrategy", "[SRLog]updateConfig after mSRConfig=" + this.f195210a);
            m150029c();
            AbstractC86626b bVar = this.f195211b;
            if (bVar != null) {
                bVar.mo137298a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo137884a(int i, int i2) {
        int i3 = this.f195216g;
        if (i != i3) {
            if (i != 0 || 2 != i3) {
                C86641i.m150113b("TTVideoEngine.SRStrategy", "[SRLog]onSRStatus status=" + i + " reason=" + i2);
                this.f195216g = i;
                if (2 == i) {
                    this.f195215f = i2;
                }
                AbstractC86626b bVar = this.f195211b;
                if (bVar != null) {
                    bVar.mo137298a(this);
                }
            }
        }
    }
}

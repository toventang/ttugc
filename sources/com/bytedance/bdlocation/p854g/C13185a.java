package com.bytedance.bdlocation.p854g;

import com.bytedance.bdlocation.AbstractC13164d;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdlocation.g.a */
public class C13185a implements AbstractC13164d {

    /* renamed from: a */
    public final String f32191a;

    /* renamed from: b */
    public long f32192b;

    /* renamed from: c */
    public C13154c f32193c;

    /* renamed from: d */
    public List<Throwable> f32194d = Collections.synchronizedList(new ArrayList(3));

    /* renamed from: e */
    public long f32195e;

    /* renamed from: f */
    public AbstractC13186b f32196f;

    /* renamed from: g */
    private boolean f32197g;

    /* renamed from: h */
    private long f32198h;

    /* renamed from: i */
    private long f32199i;

    /* renamed from: j */
    private BDLocation f32200j;

    static {
        Covode.recordClassIndex(15132);
    }

    /* renamed from: b */
    public final void mo21291b() {
        mo21292c();
    }

    /* renamed from: a */
    public final void mo21288a() {
        this.f32192b = System.currentTimeMillis();
        if (C13153b.f32045d) {
            C13162b.m23690d("BDRegionLocation", this.f32191a);
        }
    }

    public String toString() {
        return "LocationTrace{mTag='" + this.f32191a + '\'' + ", mStartTimeMs=" + this.f32192b + ", isCache=" + this.f32197g + ", mStopTimeMs=" + this.f32198h + ", mLocation=" + this.f32200j + ", mError=" + this.f32193c + '}';
    }

    /* renamed from: c */
    public final void mo21292c() {
        int i;
        this.f32198h = System.currentTimeMillis();
        BDLocation bDLocation = this.f32200j;
        C13154c cVar = this.f32193c;
        if (this.f32199i == 0) {
            this.f32199i = System.currentTimeMillis();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("biz_module", this.f32191a);
            if (C13153b.f32065x.f32339b) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("background", i);
            if (bDLocation != null) {
                jSONObject.put("total_duration", this.f32199i - this.f32192b);
                jSONObject.put("reverse_geo_cost", this.f32195e);
                jSONObject.put("reduce", false);
                jSONObject.put("status", 1);
            } else if (cVar != null) {
                jSONObject.put("total_duration", this.f32199i - this.f32192b);
                jSONObject.put("status", 0);
                jSONObject.put("reduce", false);
                jSONObject2.put("locate_fail_code", cVar.getCode());
                jSONObject2.put("locate_fail_reason", cVar.getMessage());
                for (Map.Entry<String, String> entry : cVar.getExtra().entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            C13153b.m23675c();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateStart(String str) {
        AbstractC13186b bVar = this.f32196f;
        if (bVar != null) {
            bVar.onLocateStart(str);
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateStop(String str) {
        AbstractC13186b bVar = this.f32196f;
        if (bVar != null) {
            bVar.onLocateStop(str);
        }
    }

    public C13185a(String str) {
        this.f32191a = str;
    }

    /* renamed from: a */
    public final void mo21289a(BDLocation bDLocation) {
        if (this.f32196f != null) {
            new BDLocation(bDLocation);
        }
        this.f32200j = bDLocation;
        this.f32197g = bDLocation.f31994F;
        if (this.f32199i == 0) {
            this.f32199i = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo21290a(C13154c cVar) {
        this.f32193c = cVar;
        try {
            if (this.f32194d.size() < 16) {
                this.f32194d.add(cVar);
            }
        } catch (Exception unused) {
        }
        if (this.f32199i == 0) {
            this.f32199i = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateChange(String str, BDLocation bDLocation) {
        AbstractC13186b bVar = this.f32196f;
        if (bVar != null) {
            bVar.onLocateChange(str, bDLocation);
        }
    }

    @Override // com.bytedance.bdlocation.AbstractC13164d
    public void onLocateError(String str, C13154c cVar) {
        AbstractC13186b bVar = this.f32196f;
        if (bVar != null) {
            bVar.onLocateError(str, cVar);
        }
    }
}

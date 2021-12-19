package com.p2082ss.ttvideoengine.p4418k;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86313ai;
import com.p2082ss.ttvideoengine.p4418k.C86550f;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.k.c */
public final class C86544c extends C86541a implements AbstractC86543b {

    /* renamed from: f */
    public int f194979f;

    /* renamed from: g */
    public int[] f194980g;

    /* renamed from: h */
    public boolean f194981h;

    /* renamed from: i */
    public boolean f194982i;

    /* renamed from: j */
    public boolean f194983j;

    /* renamed from: k */
    public int f194984k = 120;

    /* renamed from: l */
    public boolean f194985l;

    /* renamed from: m */
    public boolean f194986m;

    /* renamed from: n */
    private int f194987n;

    /* renamed from: o */
    private C86541a f194988o;

    /* renamed from: p */
    private Context f194989p;

    /* renamed from: q */
    private boolean f194990q;

    /* renamed from: r */
    private C86550f f194991r;

    /* renamed from: s */
    private JSONObject f194992s;

    /* renamed from: t */
    private long f194993t;

    /* renamed from: u */
    private long f194994u;

    static {
        Covode.recordClassIndex(101772);
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86543b
    /* renamed from: a */
    public final void mo137278a() {
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86543b
    /* renamed from: a */
    public final void mo137279a(C86633c cVar) {
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.C86541a
    /* renamed from: c */
    public final void mo137806c() {
        if (!this.f194974b) {
            this.f194974b = true;
            C86541a aVar = this.f194988o;
            if (aVar != null) {
                aVar.mo137806c();
            }
        }
    }

    /* renamed from: f */
    private void m149791f() {
        int i = this.f194980g[this.f194979f];
        if (i == 0) {
            this.f194988o = new C86552g(this.f194975c);
        } else if (i == 1) {
            this.f194988o = new C86547e(this.f194975c, this.f194977e, 1);
        } else if (i == 2) {
            this.f194988o = new C86547e(this.f194975c, this.f194977e, 2);
        }
        C86541a aVar = this.f194988o;
        if (aVar != null) {
            aVar.f194976d = this;
            this.f194988o.mo137804b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b3, code lost:
        if (r0 > 0) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b6, code lost:
        if (r12 == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r1 = r13.f194991r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
        if (r1.f195004c == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00be, code lost:
        r1.f195004c.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c3, code lost:
        com.p2082ss.ttvideoengine.p4418k.C86550f.f195002b = r8;
        com.p2082ss.ttvideoengine.p4418k.C86550f.f195001a = r9;
        m149791f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ca, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    @Override // com.p2082ss.ttvideoengine.p4418k.C86541a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137804b() {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4418k.C86544c.mo137804b():void");
    }

    /* renamed from: a */
    public final void mo137811a(JSONObject jSONObject, Long l) {
        this.f194992s = jSONObject;
        this.f194993t = l.longValue();
    }

    /* renamed from: a */
    private void m149790a(JSONObject jSONObject, long j) {
        if (this.f194991r != null) {
            C86550f.C86551a aVar = new C86550f.C86551a();
            aVar.f195005a = jSONObject;
            aVar.f195006b = SystemClock.elapsedRealtime() + (j * 1000);
            this.f194991r.mo137814a(this.f194975c, aVar);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86543b
    /* renamed from: a */
    public final void mo137280a(JSONObject jSONObject, C86633c cVar) {
        if (this.f194974b) {
            if (!this.f194990q || this.f194981h) {
                mo137809e();
            }
        } else if (cVar == null) {
            JSONArray jSONArray = null;
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("ips");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                if (this.f194980g[this.f194979f] == 0) {
                    mo137807c(new C86633c("kTTVideoErrorDomainLocalDNS", -9997, "dns result empty,type:" + this.f194980g[this.f194979f]));
                } else {
                    mo137807c(new C86633c("kTTVideoErrorDomainHTTPDNS", -9997, "dns result empty,type:" + this.f194980g[this.f194979f]));
                }
                C86641i.m150113b("DNSParser", "ips empty");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ip", jSONArray.optString(0));
            } catch (Exception unused) {
            }
            long optLong = jSONObject.optLong("ttl");
            if (optLong == 0) {
                optLong = (long) this.f194984k;
            }
            m149790a(jSONObject2, optLong);
            if (!this.f194990q || this.f194981h) {
                try {
                    jSONObject2.put("time", jSONObject.optLong("time"));
                    jSONObject2.put("dns_type", jSONObject.optString("dns_type"));
                } catch (Exception e) {
                    C86641i.m150113b("DNSParser", e.toString());
                }
                mo137803a(jSONObject2);
            }
        } else if (this.f194979f != this.f194987n - 1) {
            if (!this.f194990q || this.f194981h) {
                mo137805b(cVar);
            }
            this.f194979f++;
            mo137804b();
        } else if (!this.f194990q || this.f194981h) {
            mo137807c(cVar);
        }
    }

    public C86544c(Context context, String str, AbstractC86561j jVar) {
        super(str, jVar);
        int[] iArr = {0, 2};
        this.f194980g = iArr;
        this.f194989p = context;
        this.f194987n = iArr.length;
        int[] iArr2 = C86313ai.f192861j;
        if (iArr2 != null && iArr2.length > 0) {
            for (int i = 0; i < iArr2.length; i++) {
                int i2 = iArr2[i];
                if (i2 != 0) {
                    if (i2 == 1) {
                        this.f194980g[i] = 2;
                    } else if (i2 != 2) {
                    }
                }
                this.f194980g[i] = iArr2[i];
            }
        } else if (C86313ai.f192860i) {
            int[] iArr3 = this.f194980g;
            iArr3[0] = 2;
            iArr3[1] = 0;
        }
        C86641i.m150110a("DNSParser", "DNSType:" + Arrays.toString(this.f194980g));
        this.f194991r = C86550f.m149805a();
    }
}

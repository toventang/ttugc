package com.bytedance.apm.block.p766a;

import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p789q.C12582f;
import com.bytedance.apm.trace.p791b.C12612a;
import com.bytedance.apm.trace.p791b.C12616b;
import com.bytedance.apm.trace.p791b.C12625c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.block.a.b */
public final class C12352b extends AbstractC12351a {

    /* renamed from: b */
    public final ArrayList<C12625c> f29759b = new ArrayList<>();

    /* renamed from: c */
    public C12356a f29760c = new C12356a();

    /* renamed from: d */
    private final long f29761d = 10000;

    /* renamed from: e */
    private HashMap<String, C12357b> f29762e = new HashMap<>();

    static {
        Covode.recordClassIndex(14158);
    }

    public C12352b() {
        C12364f.f29788r.f29793e = true;
        C12616b.f30682c = true;
    }

    /* renamed from: com.bytedance.apm.block.a.b$b */
    class C12357b {

        /* renamed from: a */
        String f29773a;

        /* renamed from: b */
        long f29774b;

        /* renamed from: c */
        int f29775c;

        /* renamed from: d */
        int f29776d;

        /* renamed from: e */
        int[] f29777e;

        /* renamed from: f */
        int f29778f;

        static {
            Covode.recordClassIndex(14163);
        }

        public final String toString() {
            return "visibleScene=" + this.f29773a + ", sumFrame=" + this.f29775c + ", sumDroppedFrames=" + this.f29776d + ", sumFrameCost=" + this.f29774b + ", dropLevel=" + Arrays.toString(this.f29777e);
        }

        C12357b(String str) {
            this.f29773a = str;
            int i = C12582f.f30617b - 1;
            this.f29778f = i;
            this.f29777e = new int[(i + 0 + 1)];
        }
    }

    /* renamed from: com.bytedance.apm.block.a.b$a */
    public static class C12356a {

        /* renamed from: a */
        public int f29770a;

        /* renamed from: b */
        public int f29771b;

        /* renamed from: c */
        public long f29772c;

        static {
            Covode.recordClassIndex(14162);
        }

        /* renamed from: a */
        public final void mo20114a(long j, boolean z) {
            if (z) {
                this.f29770a++;
            }
            this.f29771b++;
            this.f29772c += j;
        }
    }

    @Override // com.bytedance.apm.block.AbstractC12350a
    /* renamed from: a */
    public final void mo20107a(String str, long j, long j2) {
        super.mo20107a(str, j, j2);
        long j3 = j2 - j;
        int i = (int) j3;
        if (i > 0) {
            C12357b bVar = this.f29762e.get(str);
            if (bVar == null) {
                bVar = new C12357b(str);
                this.f29762e.put(str, bVar);
            }
            float f = C12582f.f30616a;
            bVar.f29774b += j3;
            int min = Math.min(Math.max((int) (((float) j3) / f), 0), bVar.f29778f);
            int[] iArr = bVar.f29777e;
            iArr[min] = iArr[min] + 1;
            bVar.f29776d += min;
            bVar.f29775c++;
            if (bVar.f29774b >= 10000) {
                this.f29762e.remove(str);
                try {
                    float f2 = C12582f.f30616a;
                    JSONObject jSONObject = new JSONObject();
                    for (int i2 = 0; i2 <= bVar.f29778f; i2++) {
                        if (bVar.f29777e[i2] > 0) {
                            jSONObject.put(String.valueOf(i2), bVar.f29777e[i2]);
                        }
                    }
                    int i3 = ((bVar.f29775c * 100) * C12582f.f30617b) / (bVar.f29775c + bVar.f29776d);
                    C12612a aVar = C12612a.C12615b.f30681a;
                    String str2 = bVar.f29773a;
                    double d = (double) i3;
                    Double.isNaN(d);
                    aVar.mo20425a(str2, (float) (d / 100.0d));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", bVar.f29773a);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("total_scroll_time", bVar.f29774b);
                    jSONObject3.put("drop_time_rate", (double) (1.0f - ((((float) bVar.f29775c) * 1.0f) / ((float) ((int) (((float) bVar.f29774b) / f2))))));
                    jSONObject3.put("refresh_rate", bVar.f29778f + 1);
                    C12401a.m22303b().mo20179a(new C12412f("fps_drop", bVar.f29773a, jSONObject, jSONObject2, jSONObject3, (byte) 0));
                } catch (Throwable unused) {
                }
                bVar.f29775c = 0;
                bVar.f29776d = 0;
                bVar.f29774b = 0;
            }
        }
        for (int i4 = 0; i4 < this.f29759b.size(); i4++) {
            C12625c cVar = this.f29759b.get(i4);
            if (cVar.f30727n == 0) {
                cVar.f30727n = j;
            }
            if (j3 >= 0) {
                synchronized (cVar) {
                    if (cVar.f30721h.size() > 20000) {
                        cVar.f30721h.poll();
                    }
                    cVar.f30721h.add(Integer.valueOf(i * 100));
                }
            }
        }
    }
}

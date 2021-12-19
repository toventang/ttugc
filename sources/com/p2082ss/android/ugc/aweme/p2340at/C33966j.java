package com.p2082ss.android.ugc.aweme.p2340at;

import com.bytedance.apm.p789q.C12582f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.at.j */
public final class C33966j {

    /* renamed from: a */
    public static final C33966j f80336a = new C33966j();

    private C33966j() {
    }

    static {
        Covode.recordClassIndex(40892);
    }

    /* renamed from: com.ss.android.ugc.aweme.at.j$a */
    static final class RunnableC33967a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39163s f80337a;

        /* renamed from: b */
        final /* synthetic */ String f80338b;

        /* renamed from: c */
        final /* synthetic */ long f80339c;

        /* renamed from: d */
        final /* synthetic */ double f80340d;

        /* renamed from: e */
        final /* synthetic */ JSONObject f80341e;

        static {
            Covode.recordClassIndex(40893);
        }

        RunnableC33967a(C39163s sVar, String str, long j, double d, JSONObject jSONObject) {
            this.f80337a = sVar;
            this.f80338b = str;
            this.f80339c = j;
            this.f80340d = d;
            this.f80341e = jSONObject;
        }

        public final void run() {
            C33966j.m69558a(this.f80337a, this.f80338b, this.f80339c, this.f80340d, this.f80341e);
            C39162r.m79461a("ui_sample_report", this.f80337a.mo67942a());
        }
    }

    /* renamed from: a */
    private static void m69559a(JSONObject jSONObject, C39163s sVar) {
        Iterator<String> keys;
        if (jSONObject != null && (keys = jSONObject.keys()) != null) {
            float f = C12582f.f30616a;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                C89219l.m154716b(next, "");
                int parseInt = Integer.parseInt(next);
                int optInt = jSONObject.optInt(next);
                if (optInt > 0) {
                    if (i3 < parseInt) {
                        i3 = parseInt;
                    }
                    if (parseInt >= 3) {
                        i2 += (int) (((float) (optInt * parseInt)) * f);
                    }
                    if (parseInt != 0) {
                        if (parseInt < 3) {
                            i4 += optInt;
                        } else if (parseInt < 7) {
                            i5 += optInt;
                        } else if (parseInt < 14) {
                            i6 += optInt;
                        } else {
                            i7 += optInt;
                        }
                    }
                    i += optInt;
                }
            }
            sVar.mo67941a("all_frame", String.valueOf(i));
            sVar.mo67941a("block_duration", String.valueOf(i2));
            sVar.mo67941a("drop_max", String.valueOf(i3));
            sVar.mo67941a("drop_x_count", String.valueOf((float) ((i4 * 0) + (i5 * 1) + (i6 * 1) + (i7 * 1))));
            sVar.mo67941a("level_1", String.valueOf(i4));
            sVar.mo67941a("level_2", String.valueOf(i5));
            sVar.mo67941a("level_3", String.valueOf(i6));
            sVar.mo67941a("level_4", String.valueOf(i7));
        }
    }

    /* renamed from: a */
    public static void m69558a(C39163s sVar, String str, long j, double d, JSONObject jSONObject) {
        String valueOf;
        sVar.mo67941a("ui_scene", str);
        sVar.mo67941a("duration", String.valueOf(j));
        if (d > 60.0d) {
            valueOf = "60";
        } else {
            double d2 = (double) ((int) (d * 100.0d));
            Double.isNaN(d2);
            valueOf = String.valueOf(d2 / 100.0d);
        }
        sVar.mo67941a("ui_fps", valueOf);
        m69559a(jSONObject, sVar);
    }
}

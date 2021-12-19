package com.bytedance.android.livesdk.performance;

import com.bytedance.android.live.broadcast.p196e.C3227a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.AbstractC11808h;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.performance.b */
public final class C10085b implements AbstractC11808h.AbstractC11811c {

    /* renamed from: a */
    public double f24495a;

    /* renamed from: b */
    public JSONObject f24496b;

    /* renamed from: c */
    public boolean f24497c;

    /* renamed from: d */
    public boolean f24498d;

    /* renamed from: e */
    public long f24499e;

    /* renamed from: f */
    public final String f24500f;

    /* renamed from: g */
    private final AbstractC11808h.AbstractC11811c f24501g;

    static {
        Covode.recordClassIndex(11648);
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
    /* renamed from: a */
    public final void mo16949a(AbstractC11808h.AbstractC11809a aVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
    /* renamed from: a */
    public final void mo16950a(AbstractC11808h.AbstractC11810b bVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
    /* renamed from: a */
    public final void mo16948a() {
        this.f24501g.mo16948a();
        this.f24498d = true;
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11811c
    /* renamed from: b */
    public final void mo16951b() {
        this.f24498d = false;
        this.f24501g.mo16951b();
    }

    public C10085b(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f24500f = str;
        AbstractC11808h.AbstractC11811c a = ((AbstractC11808h) C6193a.m13435a(AbstractC11808h.class)).mo18866a("live_fluency_" + str, z);
        this.f24501g = a;
        a.mo16950a(new AbstractC11808h.AbstractC11810b(this) {
            /* class com.bytedance.android.livesdk.performance.C10085b.C100861 */

            /* renamed from: a */
            final /* synthetic */ C10085b f24502a;

            static {
                Covode.recordClassIndex(11649);
            }

            {
                this.f24502a = r1;
            }

            @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11810b
            /* renamed from: a */
            public final void mo16952a(double d) {
                this.f24502a.f24495a = d;
            }
        });
        a.mo16949a(new AbstractC11808h.AbstractC11809a(this) {
            /* class com.bytedance.android.livesdk.performance.C10085b.C100872 */

            /* renamed from: a */
            final /* synthetic */ C10085b f24503a;

            static {
                Covode.recordClassIndex(11650);
            }

            {
                this.f24503a = r1;
            }

            @Override // com.bytedance.android.livesdkapi.host.AbstractC11808h.AbstractC11809a
            /* renamed from: a */
            public final void mo16953a(JSONObject jSONObject) {
                this.f24503a.f24496b = jSONObject;
                C10085b bVar = this.f24503a;
                JSONObject jSONObject2 = bVar.f24496b;
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    C89219l.m154716b(keys, "");
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int optInt = jSONObject2.optInt(next);
                        C89219l.m154716b(next, "");
                        Integer e = C89361p.m154863e(next);
                        if (e != null) {
                            int intValue = e.intValue();
                            if (3 <= intValue && 6 >= intValue) {
                                i += optInt;
                                i3 += intValue * optInt;
                            } else if (7 <= intValue && 15 >= intValue) {
                                i5 += optInt;
                                i6 += intValue * optInt;
                            } else if (16 <= intValue && 24 >= intValue) {
                                i7 += optInt;
                                i8 += intValue * optInt;
                            } else if (25 <= intValue && 40 >= intValue) {
                                i9 += optInt;
                                i10 += intValue * optInt;
                            } else if (intValue >= 41) {
                                i11 += optInt;
                                i12 += intValue * optInt;
                            }
                            i2 += optInt;
                            i4 += (intValue + 1) * optInt;
                        }
                    }
                    float f = (float) i4;
                    C6501b.C6502a.m13948a("livesdk_fluency").mo12639a().mo12651a("scene", bVar.f24500f).mo12648a("fps", Double.valueOf(bVar.f24495a)).mo12645a("drop_3", i).mo12649a("drop_3_percent", Float.valueOf(((float) i3) / f)).mo12645a("drop_7", i5).mo12649a("drop_7_percent", Float.valueOf(((float) i6) / f)).mo12645a("drop_16", i7).mo12649a("drop_16_percent", Float.valueOf(((float) i8) / f)).mo12645a("drop_25", i9).mo12649a("drop_25_percent", Float.valueOf(((float) i10) / f)).mo12645a("drop_41", i11).mo12649a("drop_41_percent", Float.valueOf(((float) i12) / f)).mo12645a("drop_total", i2).mo12646a("gift_id", bVar.f24499e).mo12645a("is_anchor", C11279p.m20012a(Boolean.valueOf(bVar.f24497c)) ? 1 : 0).mo12652a(C3227a.f9267a).mo12655b();
                }
            }
        });
    }
}

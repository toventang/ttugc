package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.k */
public final class C3142k implements AbstractC3143l {

    /* renamed from: a */
    public C3147p f9097a;

    /* renamed from: b */
    private C3148q f9098b;

    /* renamed from: c */
    private C3148q f9099c;

    static {
        Covode.recordClassIndex(3623);
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.AbstractC3143l
    /* renamed from: b */
    public final void mo8472b() {
        C3148q qVar = this.f9098b;
        if (qVar == null) {
            C89219l.m154710a("snapped");
        }
        qVar.mo8477b();
        C3148q qVar2 = this.f9099c;
        if (qVar2 == null) {
            C89219l.m154710a("floating");
        }
        qVar2.mo8477b();
        m8540f();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.AbstractC3143l
    /* renamed from: c */
    public final void mo8473c() {
        C3148q qVar = this.f9098b;
        if (qVar == null) {
            C89219l.m154710a("snapped");
        }
        qVar.mo8477b();
        C3148q qVar2 = this.f9099c;
        if (qVar2 == null) {
            C89219l.m154710a("floating");
        }
        qVar2.mo8476a();
        m8540f();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.AbstractC3143l
    /* renamed from: d */
    public final void mo8474d() {
        C3148q qVar = this.f9098b;
        if (qVar == null) {
            C89219l.m154710a("snapped");
        }
        qVar.mo8476a();
        C3148q qVar2 = this.f9099c;
        if (qVar2 == null) {
            C89219l.m154710a("floating");
        }
        qVar2.mo8477b();
        m8540f();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.AbstractC3143l
    /* renamed from: e */
    public final void mo8475e() {
        m8540f();
        C3148q qVar = this.f9098b;
        if (qVar == null) {
            C89219l.m154710a("snapped");
        }
        qVar.mo8478c();
        C3148q qVar2 = this.f9099c;
        if (qVar2 == null) {
            C89219l.m154710a("floating");
        }
        qVar2.mo8478c();
    }

    @Override // com.bytedance.android.live.broadcast.bgbroadcast.p189a.AbstractC3143l
    /* renamed from: a */
    public final void mo8471a() {
        this.f9098b = new C3148q();
        this.f9099c = new C3148q();
        this.f9097a = new C3147p();
    }

    /* renamed from: f */
    private final void m8540f() {
        C3147p pVar = this.f9097a;
        if (pVar != null) {
            C3148q qVar = this.f9098b;
            if (qVar == null) {
                C89219l.m154710a("snapped");
            }
            pVar.f9107b = qVar.f9111a;
            C3148q qVar2 = this.f9099c;
            if (qVar2 == null) {
                C89219l.m154710a("floating");
            }
            pVar.f9109d = qVar2.f9111a;
            pVar.f9106a = pVar.f9107b + pVar.f9109d;
            if (pVar.f9106a > 0) {
                pVar.f9108c = m8539a(((float) pVar.f9107b) / ((float) pVar.f9106a));
                pVar.f9110e = m8539a(((float) pVar.f9109d) / ((float) pVar.f9106a));
            }
            C3854a.m9453a(3, "GameUiTimeLogger", pVar.toString());
        }
    }

    /* renamed from: a */
    private static float m8539a(float f) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            String format = decimalFormat.format(Float.valueOf(f));
            C89219l.m154716b(format, "");
            return Float.parseFloat(format);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}

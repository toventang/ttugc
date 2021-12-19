package com.bytedance.android.live.broadcast.p192c;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.c.a */
public abstract class AbstractC3185a {

    /* renamed from: e */
    private static float[] f9193e = {0.0f, 0.3f, 0.43f, 0.57f, 0.7f, 0.8f};

    /* renamed from: a */
    public float f9194a = AbstractC6804a.f16888Q.mo13066a().floatValue();

    /* renamed from: b */
    public float f9195b = AbstractC6804a.f16889R.mo13066a().floatValue();

    /* renamed from: c */
    public float f9196c = AbstractC6804a.f16890S.mo13066a().floatValue();

    /* renamed from: d */
    public int f9197d = AbstractC6804a.f16891T.mo13066a().intValue();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo8535d(float f);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo8536e(float f);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo8537f(float f);

    static {
        Covode.recordClassIndex(3666);
    }

    public AbstractC3185a() {
        m8649a();
    }

    /* renamed from: a */
    public static void m8649a() {
        if (AbstractC6804a.f16888Q.mo13066a().floatValue() < 0.0f) {
            C6806c.m14603a(AbstractC6804a.f16888Q, Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23107b));
        }
        if (AbstractC6804a.f16889R.mo13066a().floatValue() < 0.0f) {
            C6806c.m14603a(AbstractC6804a.f16889R, Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23107b));
        }
        if (AbstractC6804a.f16890S.mo13066a().floatValue() < 0.0f) {
            C6806c.m14603a(AbstractC6804a.f16890S, Float.valueOf(LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23107b));
        }
    }

    /* renamed from: a */
    public final void mo8531a(float f) {
        if (AbstractC6804a.f16888Q.mo13066a().floatValue() != f) {
            C6806c.m14603a(AbstractC6804a.f16888Q, Float.valueOf(f));
            this.f9194a = LiveBeautyParamSetting.INSTANCE.getValue().f23102b.f23106a * f;
        }
        mo8535d(this.f9194a);
    }

    /* renamed from: b */
    public final void mo8533b(float f) {
        if (AbstractC6804a.f16889R.mo13066a().floatValue() != f) {
            C6806c.m14603a(AbstractC6804a.f16889R, Float.valueOf(f));
            this.f9195b = LiveBeautyParamSetting.INSTANCE.getValue().f23103c.f23106a * f;
        }
        mo8536e(this.f9195b);
    }

    /* renamed from: c */
    public final void mo8534c(float f) {
        if (AbstractC6804a.f16890S.mo13066a().floatValue() != f) {
            C6806c.m14603a(AbstractC6804a.f16890S, Float.valueOf(f));
            this.f9196c = LiveBeautyParamSetting.INSTANCE.getValue().f23104d.f23106a * f;
        }
        mo8537f(this.f9196c);
    }

    /* renamed from: a */
    public final void mo8532a(int i) {
        if (AbstractC6804a.f16891T.mo13066a().intValue() != i) {
            C6806c.m14603a(AbstractC6804a.f16891T, Integer.valueOf(i));
            this.f9197d = i;
        }
        mo8535d(f9193e[i]);
    }
}

package com.p2082ss.texturerender.p4404a;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.texturerender.C86203l;

/* renamed from: com.ss.texturerender.a.b */
public final class C86172b extends AbstractC86171a {

    /* renamed from: i */
    private C86173c f192180i;

    /* renamed from: j */
    private int f192181j = 1920;

    /* renamed from: k */
    private int f192182k = 1080;

    /* renamed from: l */
    private int f192183l;

    /* renamed from: m */
    private int f192184m;

    /* renamed from: n */
    private float f192185n = -1.0f;

    /* renamed from: o */
    private float f192186o = -1.0f;

    /* renamed from: p */
    private float f192187p = -1.0f;

    /* renamed from: q */
    private int f192188q = -1;

    /* renamed from: r */
    private float[] f192189r;

    /* renamed from: s */
    private boolean f192190s;

    /* renamed from: t */
    private int f192191t = Integer.MIN_VALUE;

    static {
        Covode.recordClassIndex(101315);
    }

    public C86172b() {
        super(1);
        C86203l.m148116a("TR_AdaptiveSharpenEffect", "new AdaptiveSharpenEffect");
        this.f192174c = 10;
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final AbstractC86171a mo136470a() {
        C86173c cVar = this.f192180i;
        if (cVar != null) {
            cVar.mo136479a();
            this.f192180i = null;
            C86203l.m148116a("TR_AdaptiveSharpenEffect", "sharpen released");
        }
        return super.mo136470a();
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final int mo136468a(int i) {
        switch (i) {
            case 10001:
                return this.f192181j;
            case 10002:
                return this.f192182k;
            case 10003:
                return this.f192183l;
            case 10004:
                return this.f192173b;
            default:
                return super.mo136468a(i);
        }
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final int mo136469a(Bundle bundle) {
        boolean z;
        Object a;
        super.mo136469a(bundle);
        int i = bundle.getInt("texture_type");
        if (!((this.f192183l == bundle.getInt("power_level") && this.f192173b == i) || this.f192180i == null)) {
            C86203l.m148116a("TR_AdaptiveSharpenEffect", "release prev sharpen instance");
            this.f192180i.mo136479a();
            this.f192180i = null;
        }
        int i2 = 0;
        if (this.f192180i == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f192173b = i;
            if (this.f192173b == 36197 && this.f192189r == null) {
                this.f192189r = new float[16];
            }
            this.f192181j = bundle.getInt("max_width");
            this.f192182k = bundle.getInt("max_height");
            this.f192183l = bundle.getInt("power_level");
            C86173c cVar = new C86173c();
            this.f192180i = cVar;
            if (this.f192173b == 36197) {
                z = true;
            } else {
                z = false;
            }
            int i3 = this.f192181j;
            int i4 = this.f192182k;
            int i5 = this.f192183l;
            if (cVar.f192192a == null || cVar.f192193b == null || (a = C86173c.m148017a(cVar.f192193b, cVar.f192192a, Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5))) == null || !((Boolean) a).booleanValue()) {
                i2 = -1;
            }
            C86203l.m148116a("TR_AdaptiveSharpenEffect", "init sharpen, ret:" + i2 + ",cost:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            if (i2 != 0) {
                this.f192190s = true;
                this.f192180i.mo136479a();
                this.f192180i = null;
                C86203l.m148116a("TR_AdaptiveSharpenEffect", "init sharpen fail, release");
            }
        }
        C86203l.m148116a("TR_AdaptiveSharpenEffect", "sharpen init,ret:".concat(String.valueOf(i2)));
        return i2;
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final void mo136472a(int i, float f) {
        switch (i) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                this.f192185n = f;
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                this.f192186o = f;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                this.f192187p = f;
                break;
            default:
                super.mo136472a(i, f);
                break;
        }
        C86203l.m148116a("TR_AdaptiveSharpenEffect", "setOption float, key:" + i + ",value:" + f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0168  */
    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.texturerender.p4404a.C86176f mo136471a(com.p2082ss.texturerender.p4404a.C86176f r19, com.p2082ss.texturerender.p4404a.C86179i r20) {
        /*
        // Method dump skipped, instructions count: 455
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.texturerender.p4404a.C86172b.mo136471a(com.ss.texturerender.a.f, com.ss.texturerender.a.i):com.ss.texturerender.a.f");
    }

    @Override // com.p2082ss.texturerender.p4404a.AbstractC86171a
    /* renamed from: a */
    public final void mo136473a(int i, int i2) {
        if (i == 14) {
            this.f192188q = i2;
            C86203l.m148116a("TR_AdaptiveSharpenEffect", "set DiffImgSmoothEnable:".concat(String.valueOf(i2)));
        } else if (i != 17) {
            super.mo136473a(i, i2);
        } else {
            this.f192184m = i2;
            C86203l.m148116a("TR_AdaptiveSharpenEffect", "set SceneMode:".concat(String.valueOf(i2)));
        }
    }
}

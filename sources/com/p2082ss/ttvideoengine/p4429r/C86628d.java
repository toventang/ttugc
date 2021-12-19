package com.p2082ss.ttvideoengine.p4429r;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttvideoengine.r.d */
public final class C86628d {

    /* renamed from: a */
    public Boolean f195222a;

    /* renamed from: b */
    public Integer f195223b;

    /* renamed from: c */
    public Long f195224c;

    /* renamed from: d */
    public Long f195225d;

    /* renamed from: e */
    public Integer f195226e;

    /* renamed from: f */
    public Integer f195227f;

    /* renamed from: g */
    public Boolean f195228g;

    /* renamed from: h */
    public Integer f195229h;

    /* renamed from: i */
    public Integer f195230i;

    /* renamed from: j */
    public Integer f195231j;

    /* renamed from: k */
    public Float f195232k;

    /* renamed from: l */
    public Boolean f195233l;

    /* renamed from: m */
    public Integer f195234m;

    /* renamed from: n */
    public Integer f195235n;

    /* renamed from: o */
    public Integer f195236o;

    /* renamed from: p */
    public Boolean f195237p;

    /* renamed from: q */
    public Integer f195238q;

    /* renamed from: r */
    public Boolean f195239r;

    /* renamed from: s */
    public Integer f195240s;

    /* renamed from: t */
    public Integer f195241t;

    /* renamed from: u */
    public Float f195242u;

    /* renamed from: v */
    public Boolean f195243v;

    /* renamed from: w */
    public String f195244w;

    /* renamed from: x */
    public AbstractC86625a f195245x;

    static {
        Covode.recordClassIndex(101856);
    }

    public C86628d() {
        mo137893b();
    }

    /* renamed from: a */
    public final void mo137889a() {
        this.f195232k = null;
        this.f195234m = null;
        this.f195235n = null;
        this.f195240s = null;
        this.f195241t = null;
        this.f195242u = null;
        this.f195243v = null;
    }

    /* renamed from: b */
    public final void mo137893b() {
        this.f195222a = null;
        this.f195223b = null;
        this.f195224c = null;
        this.f195225d = null;
        this.f195226e = null;
        this.f195227f = null;
        this.f195228g = null;
        this.f195229h = null;
        this.f195230i = null;
        this.f195231j = null;
        this.f195232k = null;
        this.f195233l = null;
        this.f195234m = null;
        this.f195235n = null;
        this.f195236o = null;
        this.f195237p = null;
        this.f195238q = null;
        this.f195239r = null;
        this.f195240s = null;
        this.f195241t = null;
        this.f195242u = null;
        this.f195243v = null;
        this.f195244w = null;
        this.f195245x = null;
    }

    public final String toString() {
        String str = "SRStrategyConfig{";
        if (this.f195222a != null) {
            str = str + ", mEnableSR=" + this.f195222a;
        }
        if (this.f195223b != null) {
            str = str + ", mVideoFormatType=" + this.f195223b;
        }
        if (this.f195224c != null) {
            str = str + ", mMinDuration=" + this.f195224c;
        }
        if (this.f195225d != null) {
            str = str + ", mMaxDuration=" + this.f195225d;
        }
        if (this.f195226e != null) {
            str = str + ", mMinPower=" + this.f195226e;
        }
        if (this.f195227f != null) {
            str = str + ", mSupportScene=" + this.f195227f;
        }
        if (this.f195228g != null) {
            str = str + ", mEnableSpeed=" + this.f195228g;
        }
        if (this.f195229h != null) {
            str = str + ", mSRPercent=" + this.f195229h;
        }
        if (this.f195230i != null) {
            str = str + ", mMaxWidth=" + this.f195230i;
        }
        if (this.f195231j != null) {
            str = str + ", mMaxHeight=" + this.f195231j;
        }
        if (this.f195232k != null) {
            str = str + ", mMaxFps=" + this.f195232k;
        }
        if (this.f195233l != null) {
            str = str + ", mEnableHdr=" + this.f195233l;
        }
        if (this.f195234m != null) {
            str = str + ", mCurrentVideoFormatType=" + this.f195234m;
        }
        if (this.f195235n != null) {
            str = str + ", mCurrentDuration=" + this.f195235n;
        }
        if (this.f195236o != null) {
            str = str + ", mCurrentPower=" + this.f195236o;
        }
        if (this.f195237p != null) {
            str = str + ", mIsCharging=" + this.f195237p;
        }
        if (this.f195238q != null) {
            str = str + ", mCurrentScene=" + this.f195238q;
        }
        if (this.f195239r != null) {
            str = str + ", mIsSpeed=" + this.f195239r;
        }
        if (this.f195240s != null) {
            str = str + ", mCurrentWidth=" + this.f195240s;
        }
        if (this.f195241t != null) {
            str = str + ", mCurrentHeight=" + this.f195241t;
        }
        if (this.f195242u != null) {
            str = str + ", mCurrentFps=" + this.f195242u;
        }
        if (this.f195243v != null) {
            str = str + ", mIsHdr=" + this.f195243v;
        }
        if (this.f195245x != null) {
            str = str + ", mStatusListener=" + this.f195245x;
        }
        if (this.f195244w != null) {
            str = str + ", mExtraConfig='" + this.f195245x + "'";
        }
        return str + '}';
    }

    /* renamed from: a */
    public final C86628d mo137887a(int i) {
        this.f195230i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public final C86628d mo137891b(int i) {
        this.f195231j = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final void mo137894c(int i) {
        this.f195234m = Integer.valueOf(i);
    }

    /* renamed from: d */
    public final void mo137895d(int i) {
        this.f195235n = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final C86628d mo137888a(boolean z) {
        this.f195243v = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final C86628d mo137892b(boolean z) {
        this.f195239r = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final void mo137890a(C86628d dVar) {
        if (dVar != null) {
            Boolean bool = dVar.f195222a;
            if (bool != null) {
                this.f195222a = bool;
            }
            Integer num = dVar.f195223b;
            if (num != null) {
                this.f195223b = num;
            }
            Long l = dVar.f195224c;
            if (l != null) {
                this.f195224c = l;
            }
            Long l2 = dVar.f195225d;
            if (l2 != null) {
                this.f195225d = l2;
            }
            Integer num2 = dVar.f195226e;
            if (num2 != null) {
                this.f195226e = num2;
            }
            Integer num3 = dVar.f195227f;
            if (num3 != null) {
                this.f195227f = num3;
            }
            Boolean bool2 = dVar.f195228g;
            if (bool2 != null) {
                this.f195228g = bool2;
            }
            Integer num4 = dVar.f195229h;
            if (num4 != null) {
                this.f195229h = num4;
            }
            Integer num5 = dVar.f195230i;
            if (num5 != null) {
                this.f195230i = num5;
            }
            Integer num6 = dVar.f195231j;
            if (num6 != null) {
                this.f195231j = num6;
            }
            Float f = dVar.f195232k;
            if (f != null) {
                this.f195232k = f;
            }
            Boolean bool3 = dVar.f195233l;
            if (bool3 != null) {
                this.f195233l = bool3;
            }
            Integer num7 = dVar.f195234m;
            if (num7 != null) {
                this.f195234m = num7;
            }
            Integer num8 = dVar.f195235n;
            if (num8 != null) {
                this.f195235n = num8;
            }
            Integer num9 = dVar.f195236o;
            if (num9 != null) {
                this.f195236o = num9;
            }
            Boolean bool4 = dVar.f195237p;
            if (bool4 != null) {
                this.f195237p = bool4;
            }
            Integer num10 = dVar.f195238q;
            if (num10 != null) {
                this.f195238q = num10;
            }
            Boolean bool5 = dVar.f195239r;
            if (bool5 != null) {
                this.f195239r = bool5;
            }
            Integer num11 = dVar.f195240s;
            if (num11 != null) {
                this.f195240s = num11;
            }
            Integer num12 = dVar.f195241t;
            if (num12 != null) {
                this.f195241t = num12;
            }
            Float f2 = dVar.f195242u;
            if (f2 != null) {
                this.f195242u = f2;
            }
            Boolean bool6 = dVar.f195243v;
            if (bool6 != null) {
                this.f195243v = bool6;
            }
            AbstractC86625a aVar = dVar.f195245x;
            if (aVar != null) {
                this.f195245x = aVar;
            }
        }
    }
}

package com.p2082ss.android.ugc.aweme.editSticker.text.p2886b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46239q;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.b.d */
public final class C46048d {

    /* renamed from: a */
    public float f107267a;

    /* renamed from: b */
    public float f107268b;

    /* renamed from: c */
    public float f107269c;

    /* renamed from: d */
    public float f107270d;

    /* renamed from: e */
    public float f107271e;

    /* renamed from: f */
    public float f107272f;

    /* renamed from: g */
    public boolean f107273g;

    /* renamed from: h */
    public boolean f107274h;

    /* renamed from: i */
    public float f107275i;

    /* renamed from: j */
    public float f107276j;

    /* renamed from: k */
    public float f107277k;

    /* renamed from: l */
    public float f107278l;

    /* renamed from: m */
    public int f107279m = 15;

    /* renamed from: n */
    public C46239q f107280n;

    static {
        Covode.recordClassIndex(54583);
    }

    /* renamed from: c */
    private boolean m88895c(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        float f5 = this.f107277k;
        if (f5 < 0.0f ? f2 > f5 : f2 < f5) {
            z = false;
        } else {
            z = true;
        }
        float f6 = this.f107278l;
        if (f6 < 1.0f ? f > f6 : f < f6) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2 || f3 != this.f107275i || f4 != this.f107276j) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m88896d(float f, float f2, float f3, float f4) {
        if (this.f107277k >= 0.0f) {
            if (f > 1.0f || f2 > 0.0f || f3 != this.f107271e || f4 != this.f107272f) {
                return false;
            }
            return true;
        } else if (f > 1.0f || f2 < 0.0f || f3 != this.f107271e || f4 != this.f107272f) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo77727a(float f, float f2, float f3, float f4) {
        if (this.f107274h) {
            if (m88895c(f, f2, f3, f4)) {
                this.f107274h = false;
                this.f107273g = false;
                this.f107280n.mo78545b(this.f107278l);
                this.f107280n.mo78548c(this.f107277k);
                this.f107280n.setCenterX(this.f107275i);
                this.f107280n.setCenterY(this.f107276j);
                this.f107280n.invalidate();
                return;
            }
            float f5 = this.f107278l;
            if (f <= f5) {
                float f6 = f - this.f107267a;
                if (f6 <= f5) {
                    f5 = f6;
                }
                this.f107280n.mo78545b(f5);
            } else {
                float f7 = f + this.f107267a;
                if (f7 >= f5) {
                    f5 = f7;
                }
                this.f107280n.mo78545b(f5);
            }
            float f8 = this.f107277k;
            if (f8 > 0.0f) {
                if (f2 <= f8) {
                    float f9 = f2 - this.f107268b;
                    if (f9 <= f8) {
                        f8 = f9;
                    }
                    this.f107280n.mo78548c(f8);
                }
            } else if (f2 >= f8) {
                float f10 = f2 - this.f107268b;
                if (f10 >= f8) {
                    f8 = f10;
                }
                this.f107280n.mo78548c(f8);
            }
            float f11 = this.f107275i;
            if (f11 > this.f107271e) {
                if (f3 < f11) {
                    float f12 = f3 - this.f107269c;
                    if (f12 <= f11) {
                        f11 = f12;
                    }
                    this.f107280n.setCenterX(f11);
                }
            } else if (f3 > f11) {
                float f13 = f3 - this.f107269c;
                if (f13 >= f11) {
                    f11 = f13;
                }
                this.f107280n.setCenterX(f11);
            }
            float f14 = this.f107276j;
            if (f14 > this.f107272f) {
                if (f4 < f14) {
                    float f15 = f4 - this.f107270d;
                    if (f15 <= f14) {
                        f14 = f15;
                    }
                    this.f107280n.setCenterY(f14);
                }
            } else if (f4 > f14) {
                float f16 = f4 - this.f107270d;
                if (f16 >= f14) {
                    f14 = f16;
                }
                this.f107280n.setCenterY(f14);
            }
            this.f107280n.invalidate();
        }
    }

    /* renamed from: b */
    public final void mo77728b(float f, float f2, float f3, float f4) {
        if (this.f107273g) {
            float f5 = 1.0f;
            float f6 = 0.0f;
            if (m88896d(f, f2, f3, f4)) {
                this.f107273g = false;
                this.f107274h = false;
                this.f107280n.mo78545b(1.0f);
                this.f107280n.mo78548c(0.0f);
                this.f107280n.setCenterX(this.f107271e);
                this.f107280n.setCenterY(this.f107272f);
                this.f107280n.invalidate();
                return;
            }
            if (f > 1.0f) {
                float f7 = f - this.f107267a;
                if (f7 >= 1.0f) {
                    f5 = f7;
                }
                this.f107280n.mo78545b(f5);
            } else {
                float f8 = f + this.f107267a;
                if (f8 <= 1.0f) {
                    f5 = f8;
                }
                this.f107280n.mo78545b(f5);
            }
            if (this.f107277k > 0.0f) {
                if (f2 >= 0.0f) {
                    float f9 = f2 - this.f107268b;
                    if (f9 >= 0.0f) {
                        f6 = f9;
                    }
                    this.f107280n.mo78548c(f6);
                }
            } else if (f2 <= 0.0f) {
                float f10 = f2 - this.f107268b;
                if (f10 <= 0.0f) {
                    f6 = f10;
                }
                this.f107280n.mo78548c(f6);
            }
            float f11 = this.f107275i;
            float f12 = this.f107271e;
            if (f11 > f12) {
                if (f3 > f12) {
                    float f13 = f3 - this.f107269c;
                    if (f13 >= f12) {
                        f12 = f13;
                    }
                    this.f107280n.setCenterX(f12);
                }
            } else if (f3 < f12) {
                float f14 = f3 - this.f107269c;
                if (f14 <= f12) {
                    f12 = f14;
                }
                this.f107280n.setCenterX(f12);
            }
            float f15 = this.f107276j;
            float f16 = this.f107272f;
            if (f15 > f16) {
                if (f4 > f16) {
                    float f17 = f4 - this.f107270d;
                    if (f17 >= f16) {
                        f16 = f17;
                    }
                    this.f107280n.setCenterY(f16);
                }
            } else if (f4 < f16) {
                float f18 = f4 - this.f107270d;
                if (f18 <= f16) {
                    f16 = f18;
                }
                this.f107280n.setCenterY(f16);
            }
            this.f107280n.invalidate();
        }
    }
}

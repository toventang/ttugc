package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttm.player.LoadControl;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.c */
public final class C62964c extends LoadControl {

    /* renamed from: a */
    public int f142911a = 200;

    /* renamed from: b */
    public int f142912b = 1000;

    /* renamed from: c */
    public int f142913c = 5000;

    /* renamed from: d */
    public float f142914d = 9.0f;

    /* renamed from: e */
    public int f142915e = 200;

    /* renamed from: f */
    boolean f142916f;

    /* renamed from: g */
    public boolean f142917g;

    /* renamed from: h */
    public int f142918h;

    /* renamed from: i */
    public int f142919i;

    /* renamed from: j */
    public int f142920j;

    /* renamed from: k */
    public int f142921k;

    /* renamed from: m */
    private int f142922m;

    /* renamed from: n */
    private boolean f142923n;

    /* renamed from: o */
    private boolean f142924o;

    /* renamed from: p */
    private long f142925p = -1;

    /* renamed from: q */
    private int f142926q;

    static {
        Covode.recordClassIndex(73801);
    }

    /* renamed from: a */
    public final void mo100967a() {
        this.f142922m = 0;
        this.f142916f = false;
        this.f142923n = false;
        this.f142924o = false;
        this.f142925p = -1;
        this.f142918h = 0;
        this.f142917g = false;
    }

    @Override // com.p2082ss.ttm.player.LoadControl
    public final int onFilterStackSelected(int i) {
        if (i != 2) {
            return 0;
        }
        return this.f142921k;
    }

    /* renamed from: a */
    public final void mo100968a(int i) {
        if (i == 1) {
            this.f142926q = 1;
        } else {
            this.f142926q = 0;
        }
    }

    @Override // com.p2082ss.ttm.player.LoadControl
    public final int onCodecStackSelected(int i) {
        if (i == 1) {
            return this.f142919i;
        }
        if (i != 2) {
            return 0;
        }
        return this.f142920j;
    }

    @Override // com.p2082ss.ttm.player.LoadControl
    public final int onTrackSelected(int i) {
        if (this.f142917g) {
            return this.f142918h;
        }
        return 0;
    }

    @Override // com.p2082ss.ttm.player.LoadControl
    public final boolean shouldStartPlayback(long j, float f, boolean z) {
        int i;
        if (z) {
            if (this.f142925p == -1) {
                if (this.f142926q == 0) {
                    int i2 = this.f142915e;
                    this.f142925p = (long) Math.min(((float) i2) + (((float) this.f142922m) * this.f142914d * ((float) i2)), (float) this.f142913c);
                } else {
                    double d = (double) this.f142915e;
                    double pow = Math.pow((double) (this.f142922m + 1), (double) this.f142914d);
                    Double.isNaN(d);
                    this.f142925p = (long) Math.min(d * pow, (double) this.f142913c);
                }
            }
            if (j > this.f142925p) {
                this.f142923n = false;
                this.f142925p = -1;
            } else {
                if (!this.f142923n) {
                    this.f142922m++;
                }
                this.f142923n = true;
                return false;
            }
        } else {
            if (this.f142916f) {
                i = this.f142911a;
            } else {
                i = this.f142912b;
            }
            if (j > ((long) i)) {
                this.f142924o = false;
            } else if (this.f142924o) {
                return false;
            } else {
                this.f142924o = true;
                return false;
            }
        }
        return true;
    }
}

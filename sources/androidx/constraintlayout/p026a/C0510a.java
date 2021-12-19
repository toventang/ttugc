package androidx.constraintlayout.p026a;

import androidx.constraintlayout.p026a.C0545h;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.a.a */
public final class C0510a {

    /* renamed from: a */
    int f1934a;

    /* renamed from: b */
    final C0536b f1935b;

    /* renamed from: c */
    final C0537c f1936c;

    /* renamed from: d */
    int[] f1937d = new int[8];

    /* renamed from: e */
    int[] f1938e = new int[8];

    /* renamed from: f */
    float[] f1939f = new float[8];

    /* renamed from: g */
    int f1940g = -1;

    /* renamed from: h */
    private int f1941h = 8;

    /* renamed from: i */
    private C0545h f1942i;

    /* renamed from: j */
    private int f1943j = -1;

    /* renamed from: k */
    private boolean f1944k;

    static {
        Covode.recordClassIndex(577);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2270a(C0545h hVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f1940g;
            if (i == -1) {
                this.f1940g = 0;
                this.f1939f[0] = f;
                this.f1937d[0] = hVar.f2191c;
                this.f1938e[this.f1940g] = -1;
                hVar.f2199k++;
                hVar.mo2386a(this.f1935b);
                this.f1934a++;
                if (!this.f1944k) {
                    int i2 = this.f1943j + 1;
                    this.f1943j = i2;
                    int[] iArr = this.f1937d;
                    if (i2 >= iArr.length) {
                        this.f1944k = true;
                        this.f1943j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f1934a) {
                if (this.f1937d[i] == hVar.f2191c) {
                    float[] fArr = this.f1939f;
                    fArr[i] = fArr[i] + f;
                    if (fArr[i] == 0.0f) {
                        if (i == this.f1940g) {
                            this.f1940g = this.f1938e[i];
                        } else {
                            int[] iArr2 = this.f1938e;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            hVar.mo2387b(this.f1935b);
                        }
                        if (this.f1944k) {
                            this.f1943j = i;
                        }
                        hVar.f2199k--;
                        this.f1934a--;
                        return;
                    }
                    return;
                }
                if (this.f1937d[i] < hVar.f2191c) {
                    i4 = i;
                }
                i = this.f1938e[i];
                i3++;
            }
            int i5 = this.f1943j;
            int i6 = i5 + 1;
            if (this.f1944k) {
                int[] iArr3 = this.f1937d;
                if (iArr3[i5] != -1) {
                    i5 = iArr3.length;
                }
            } else {
                i5 = i6;
            }
            int[] iArr4 = this.f1937d;
            if (i5 >= iArr4.length && this.f1934a < iArr4.length) {
                int i7 = 0;
                while (true) {
                    int[] iArr5 = this.f1937d;
                    if (i7 >= iArr5.length) {
                        break;
                    } else if (iArr5[i7] == -1) {
                        i5 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            int[] iArr6 = this.f1937d;
            if (i5 >= iArr6.length) {
                i5 = iArr6.length;
                int i8 = this.f1941h * 2;
                this.f1941h = i8;
                this.f1944k = false;
                this.f1943j = i5 - 1;
                this.f1939f = Arrays.copyOf(this.f1939f, i8);
                this.f1937d = Arrays.copyOf(this.f1937d, this.f1941h);
                this.f1938e = Arrays.copyOf(this.f1938e, this.f1941h);
            }
            this.f1937d[i5] = hVar.f2191c;
            this.f1939f[i5] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f1938e;
                iArr7[i5] = iArr7[i4];
                iArr7[i4] = i5;
            } else {
                this.f1938e[i5] = this.f1940g;
                this.f1940g = i5;
            }
            hVar.f2199k++;
            hVar.mo2386a(this.f1935b);
            this.f1934a++;
            if (!this.f1944k) {
                this.f1943j++;
            }
            int i9 = this.f1943j;
            int[] iArr8 = this.f1937d;
            if (i9 >= iArr8.length) {
                this.f1944k = true;
                this.f1943j = iArr8.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final void mo2266a() {
        int i = this.f1940g;
        int i2 = 0;
        while (i != -1 && i2 < this.f1934a) {
            C0545h hVar = this.f1936c.f2134c[this.f1937d[i]];
            if (hVar != null) {
                hVar.mo2387b(this.f1935b);
            }
            i = this.f1938e[i];
            i2++;
        }
        this.f1940g = -1;
        this.f1943j = -1;
        this.f1944k = false;
        this.f1934a = 0;
    }

    public final String toString() {
        int i = this.f1940g;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f1934a) {
            str = ((str + " -> ") + this.f1939f[i] + " : ") + this.f1936c.f2134c[this.f1937d[i]];
            i = this.f1938e[i];
            i2++;
        }
        return str;
    }

    /* renamed from: a */
    static boolean m1893a(C0545h hVar) {
        if (hVar.f2199k <= 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0545h mo2264a(int i) {
        int i2 = this.f1940g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f1934a) {
            if (i3 == i) {
                return this.f1936c.f2134c[this.f1937d[i2]];
            }
            i2 = this.f1938e[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo2271b(int i) {
        int i2 = this.f1940g;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f1934a) {
            if (i3 == i) {
                return this.f1939f[i2];
            }
            i2 = this.f1938e[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo2272b(C0545h hVar) {
        int i = this.f1940g;
        int i2 = 0;
        while (i != -1 && i2 < this.f1934a) {
            if (this.f1937d[i] == hVar.f2191c) {
                return this.f1939f[i];
            }
            i = this.f1938e[i];
            i2++;
        }
        return 0.0f;
    }

    C0510a(C0536b bVar, C0537c cVar) {
        this.f1935b = bVar;
        this.f1936c = cVar;
    }

    /* renamed from: a */
    public final float mo2263a(C0545h hVar, boolean z) {
        if (this.f1942i == hVar) {
            this.f1942i = null;
        }
        int i = this.f1940g;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f1934a) {
            if (this.f1937d[i] == hVar.f2191c) {
                if (i == this.f1940g) {
                    this.f1940g = this.f1938e[i];
                } else {
                    int[] iArr = this.f1938e;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hVar.mo2387b(this.f1935b);
                }
                hVar.f2199k--;
                this.f1934a--;
                this.f1937d[i] = -1;
                if (this.f1944k) {
                    this.f1943j = i;
                }
                return this.f1939f[i];
            }
            i2++;
            i3 = i;
            i = this.f1938e[i];
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0545h mo2265a(boolean[] zArr, C0545h hVar) {
        int i = this.f1940g;
        int i2 = 0;
        C0545h hVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f1934a) {
            if (this.f1939f[i] < 0.0f) {
                C0545h hVar3 = this.f1936c.f2134c[this.f1937d[i]];
                if ((zArr == null || !zArr[hVar3.f2191c]) && hVar3 != hVar && (hVar3.f2196h == C0545h.EnumC0546a.SLACK || hVar3.f2196h == C0545h.EnumC0546a.ERROR)) {
                    float f2 = this.f1939f[i];
                    if (f2 < f) {
                        hVar2 = hVar3;
                        f = f2;
                    }
                }
            }
            i = this.f1938e[i];
            i2++;
        }
        return hVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2267a(C0536b bVar, C0536b bVar2) {
        int i = this.f1940g;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f1934a) {
                if (this.f1937d[i] == bVar2.f2127a.f2191c) {
                    float f = this.f1939f[i];
                    mo2263a(bVar2.f2127a, false);
                    C0510a aVar = bVar2.f2130d;
                    int i3 = aVar.f1940g;
                    int i4 = 0;
                    while (i3 != -1 && i4 < aVar.f1934a) {
                        mo2270a(this.f1936c.f2134c[aVar.f1937d[i3]], aVar.f1939f[i3] * f, false);
                        i3 = aVar.f1938e[i3];
                        i4++;
                    }
                    bVar.f2128b += bVar2.f2128b * f;
                    i = this.f1940g;
                } else {
                    i = this.f1938e[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2268a(C0536b bVar, C0536b[] bVarArr) {
        int i = this.f1940g;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f1934a) {
                C0545h hVar = this.f1936c.f2134c[this.f1937d[i]];
                if (hVar.f2192d != -1) {
                    float f = this.f1939f[i];
                    mo2263a(hVar, true);
                    C0536b bVar2 = bVarArr[hVar.f2192d];
                    if (!bVar2.f2131e) {
                        C0510a aVar = bVar2.f2130d;
                        int i3 = aVar.f1940g;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f1934a) {
                            mo2270a(this.f1936c.f2134c[aVar.f1937d[i3]], aVar.f1939f[i3] * f, true);
                            i3 = aVar.f1938e[i3];
                            i4++;
                        }
                    }
                    bVar.f2128b += bVar2.f2128b * f;
                    bVar2.f2127a.mo2387b(bVar);
                    i = this.f1940g;
                } else {
                    i = this.f1938e[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void mo2269a(C0545h hVar, float f) {
        if (f == 0.0f) {
            mo2263a(hVar, true);
            return;
        }
        int i = this.f1940g;
        if (i == -1) {
            this.f1940g = 0;
            this.f1939f[0] = f;
            this.f1937d[0] = hVar.f2191c;
            this.f1938e[this.f1940g] = -1;
            hVar.f2199k++;
            hVar.mo2386a(this.f1935b);
            this.f1934a++;
            if (!this.f1944k) {
                int i2 = this.f1943j + 1;
                this.f1943j = i2;
                int[] iArr = this.f1937d;
                if (i2 >= iArr.length) {
                    this.f1944k = true;
                    this.f1943j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f1934a) {
            if (this.f1937d[i] == hVar.f2191c) {
                this.f1939f[i] = f;
                return;
            }
            if (this.f1937d[i] < hVar.f2191c) {
                i4 = i;
            }
            i = this.f1938e[i];
            i3++;
        }
        int i5 = this.f1943j;
        int i6 = i5 + 1;
        if (this.f1944k) {
            int[] iArr2 = this.f1937d;
            if (iArr2[i5] != -1) {
                i5 = iArr2.length;
            }
        } else {
            i5 = i6;
        }
        int[] iArr3 = this.f1937d;
        if (i5 >= iArr3.length && this.f1934a < iArr3.length) {
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f1937d;
                if (i7 >= iArr4.length) {
                    break;
                } else if (iArr4[i7] == -1) {
                    i5 = i7;
                    break;
                } else {
                    i7++;
                }
            }
        }
        int[] iArr5 = this.f1937d;
        if (i5 >= iArr5.length) {
            i5 = iArr5.length;
            int i8 = this.f1941h * 2;
            this.f1941h = i8;
            this.f1944k = false;
            this.f1943j = i5 - 1;
            this.f1939f = Arrays.copyOf(this.f1939f, i8);
            this.f1937d = Arrays.copyOf(this.f1937d, this.f1941h);
            this.f1938e = Arrays.copyOf(this.f1938e, this.f1941h);
        }
        this.f1937d[i5] = hVar.f2191c;
        this.f1939f[i5] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f1938e;
            iArr6[i5] = iArr6[i4];
            iArr6[i4] = i5;
        } else {
            this.f1938e[i5] = this.f1940g;
            this.f1940g = i5;
        }
        hVar.f2199k++;
        hVar.mo2386a(this.f1935b);
        int i9 = this.f1934a + 1;
        this.f1934a = i9;
        if (!this.f1944k) {
            this.f1943j++;
        }
        int[] iArr7 = this.f1937d;
        if (i9 >= iArr7.length) {
            this.f1944k = true;
        }
        if (this.f1943j >= iArr7.length) {
            this.f1944k = true;
            this.f1943j = iArr7.length - 1;
        }
    }
}

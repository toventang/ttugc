package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c.a */
public final class C58522a {

    /* renamed from: a */
    public boolean f133233a;

    /* renamed from: b */
    public boolean f133234b;

    /* renamed from: c */
    public String f133235c;

    /* renamed from: d */
    public long f133236d;

    /* renamed from: e */
    public boolean f133237e = true;

    /* renamed from: f */
    private C58524b f133238f;

    /* renamed from: g */
    private C58524b f133239g;

    static {
        Covode.recordClassIndex(68813);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c.a$a */
    public static final class C58523a {

        /* renamed from: a */
        public float f133240a;

        /* renamed from: b */
        public float f133241b;

        /* renamed from: c */
        public float f133242c;

        /* renamed from: d */
        public float f133243d;

        static {
            Covode.recordClassIndex(68814);
        }

        public C58523a() {
        }

        /* renamed from: a */
        public final float mo95923a() {
            return this.f133242c - this.f133240a;
        }

        /* renamed from: b */
        public final float mo95929b() {
            return this.f133243d - this.f133241b;
        }

        /* renamed from: c */
        public final void mo95932c() {
            mo95928a(2.0f);
            mo95930b(2.0f);
        }

        /* renamed from: d */
        public final void mo95933d() {
            this.f133241b = -this.f133241b;
            this.f133243d = -this.f133243d;
        }

        /* renamed from: e */
        public final boolean mo95934e() {
            if (this.f133240a > this.f133242c || this.f133241b > this.f133243d) {
                return false;
            }
            return true;
        }

        public C58523a(int[] iArr) {
            this((float) iArr[0], (float) iArr[1], (float) (iArr[0] + iArr[2]), (float) (iArr[1] + iArr[3]));
        }

        /* renamed from: b */
        public final void mo95930b(float f) {
            if (f != 1.0f) {
                this.f133241b *= f;
                this.f133243d *= f;
            }
        }

        /* renamed from: a */
        public final C58523a mo95926a(int[] iArr) {
            this.f133240a = (float) iArr[0];
            this.f133241b = (float) iArr[1];
            this.f133242c = (float) (iArr[0] + iArr[2]);
            this.f133243d = (float) (iArr[1] + iArr[3]);
            return this;
        }

        /* renamed from: a */
        public final void mo95928a(float f) {
            if (f != 1.0f) {
                this.f133240a *= f;
                this.f133242c *= f;
            }
        }

        /* renamed from: a */
        public final C58523a mo95924a(float f, float f2) {
            if (f == 0.0f || f2 == 0.0f) {
                return this;
            }
            return mo95925a(this.f133240a, this.f133241b, this.f133242c, this.f133243d, f, f2);
        }

        /* renamed from: b */
        public final void mo95931b(float f, float f2) {
            this.f133240a += f;
            this.f133241b += f2;
            this.f133242c += f;
            this.f133243d += f2;
        }

        /* renamed from: a */
        public final C58523a mo95927a(int[] iArr, float f, float f2) {
            if (f == 0.0f || f2 == 0.0f || iArr == null || iArr.length != 4) {
                return this;
            }
            return mo95925a((float) iArr[0], (float) iArr[1], (float) (iArr[0] + iArr[2]), (float) (iArr[1] + iArr[3]), f, f2);
        }

        public C58523a(float f, float f2, float f3, float f4) {
            this.f133240a = f;
            this.f133241b = f2;
            this.f133242c = f3;
            this.f133243d = f4;
        }

        /* renamed from: a */
        public final C58523a mo95925a(float f, float f2, float f3, float f4, float f5, float f6) {
            if (!(f5 == 0.0f || f6 == 0.0f)) {
                this.f133240a = f / f5;
                this.f133241b = f2 / f6;
                this.f133242c = f3 / f5;
                this.f133243d = f4 / f6;
            }
            return this;
        }
    }

    /* renamed from: a */
    private void m107455a() {
        this.f133233a = m107456c(this.f133238f);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c.a$b */
    public static class C58524b {

        /* renamed from: a */
        public String f133244a;

        /* renamed from: b */
        public EnumC58526d f133245b = EnumC58526d.ScaleAspectFill;

        /* renamed from: c */
        public int f133246c;

        /* renamed from: d */
        public C58523a f133247d;

        /* renamed from: e */
        public C58523a f133248e;

        /* renamed from: f */
        public int f133249f;

        /* renamed from: g */
        public int f133250g;

        /* renamed from: h */
        public int f133251h;

        /* renamed from: i */
        public int f133252i;

        /* renamed from: j */
        public int f133253j;

        /* renamed from: k */
        public Map<String, Map<String, C58525c>> f133254k;

        static {
            Covode.recordClassIndex(68815);
        }

        /* renamed from: a */
        public final boolean mo95938a() {
            if (this.f133253j != 1 || this.f133248e == null || this.f133247d == null) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo95941b() {
            Map<String, Map<String, C58525c>> map;
            if (this.f133253j != 1 || (map = this.f133254k) == null || map.isEmpty()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final C58524b mo95936a(Map<String, Map<String, C58525c>> map) {
            this.f133254k = map;
            return this;
        }

        /* renamed from: b */
        public final C58524b mo95939b(int i) {
            this.f133253j = i;
            return this;
        }

        /* renamed from: c */
        public final C58524b mo95942c(int i) {
            this.f133246c = i;
            return this;
        }

        /* renamed from: d */
        public final C58524b mo95943d(int i) {
            this.f133249f = i;
            return this;
        }

        /* renamed from: e */
        public final C58524b mo95944e(int i) {
            this.f133250g = i;
            return this;
        }

        /* renamed from: f */
        public final C58524b mo95945f(int i) {
            this.f133251h = i;
            return this;
        }

        /* renamed from: g */
        public final C58524b mo95946g(int i) {
            this.f133252i = i;
            return this;
        }

        /* renamed from: a */
        public final C58524b mo95935a(int i) {
            this.f133245b = EnumC58526d.convertFrom(i);
            return this;
        }

        public C58524b(String str) {
            this.f133244a = str;
        }

        /* renamed from: a */
        public final C58524b mo95937a(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.f133247d = new C58523a(iArr);
            }
            return this;
        }

        /* renamed from: b */
        public final C58524b mo95940b(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.f133248e = new C58523a(iArr);
            }
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c.a$c */
    public static final class C58525c {

        /* renamed from: a */
        public int f133255a;

        /* renamed from: b */
        public int f133256b;

        /* renamed from: c */
        public int[] f133257c;

        /* renamed from: d */
        public int[] f133258d;

        static {
            Covode.recordClassIndex(68816);
        }

        /* renamed from: a */
        public final boolean mo95947a() {
            int[] iArr;
            int[] iArr2;
            int i = this.f133255a;
            if (i != 0 && i != 1) {
                return false;
            }
            int i2 = this.f133256b;
            if ((i2 == 0 || i2 == 1) && (iArr = this.f133257c) != null && iArr.length == 4 && (iArr2 = this.f133258d) != null && iArr2.length == 4) {
                return true;
            }
            return false;
        }

        public final String toString() {
            return "Element{type=" + this.f133255a + ", fitType=" + this.f133256b + ", sourceFrame=" + Arrays.toString(this.f133257c) + ", renderFrame=" + Arrays.toString(this.f133258d) + '}';
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c.a$d */
    public enum EnumC58526d {
        ScaleToFill(0),
        ScaleAspectFitCenter(1),
        ScaleAspectFill(2),
        TopFill(3),
        BottomFill(4),
        LeftFill(5),
        RightFill(6),
        TopFit(7),
        BottomFit(8),
        LeftFit(9),
        RightFit(10);
        

        /* renamed from: a */
        int f133260a;

        static {
            Covode.recordClassIndex(68817);
        }

        public static EnumC58526d convertFrom(int i) {
            switch (i) {
                case 0:
                    return ScaleToFill;
                case 1:
                    return ScaleAspectFitCenter;
                case 2:
                    return ScaleAspectFill;
                case 3:
                    return TopFill;
                case 4:
                    return BottomFill;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return LeftFill;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return RightFill;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return TopFit;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return BottomFit;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return LeftFit;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return RightFit;
                default:
                    return ScaleAspectFill;
            }
        }

        private EnumC58526d(int i) {
            this.f133260a = i;
        }
    }

    /* renamed from: a */
    public final C58522a mo95920a(boolean z) {
        this.f133234b = z;
        return this;
    }

    /* renamed from: b */
    public final C58522a mo95922b(boolean z) {
        this.f133237e = z;
        return this;
    }

    /* renamed from: a */
    public final C58522a mo95919a(C58524b bVar) {
        this.f133238f = bVar;
        m107455a();
        return this;
    }

    /* renamed from: b */
    public final C58522a mo95921b(C58524b bVar) {
        this.f133239g = bVar;
        m107455a();
        return this;
    }

    /* renamed from: a */
    public final C58524b mo95918a(int i) {
        if (1 == i) {
            return this.f133238f;
        }
        return this.f133239g;
    }

    /* renamed from: c */
    private boolean m107456c(C58524b bVar) {
        if (bVar == null) {
            this.f133235c = "dataInfo is null.";
            return false;
        } else if (TextUtils.isEmpty(bVar.f133244a)) {
            this.f133235c = "dataPath is empty.";
            return false;
        } else if (!new File(bVar.f133244a).exists()) {
            this.f133235c = "dataPath is not exist, path: " + bVar.f133244a;
            return false;
        } else if (bVar.f133253j <= 0) {
            return true;
        } else {
            if (bVar.f133247d == null || bVar.f133248e == null) {
                this.f133235c = "area is empty";
                return false;
            } else if (!bVar.f133247d.mo95934e() || !bVar.f133248e.mo95934e()) {
                this.f133235c = "area is invalid";
                return false;
            } else if (bVar.f133249f <= 0 || bVar.f133250g <= 0) {
                this.f133235c = "video size is wrong";
                return false;
            } else if (bVar.f133251h <= 0 || bVar.f133252i <= 0) {
                this.f133235c = "actual size is wrong";
                return false;
            } else if (bVar.f133248e.mo95923a() == ((float) bVar.f133251h) && bVar.f133248e.mo95929b() == ((float) bVar.f133252i)) {
                return true;
            } else {
                this.f133235c = "rgb area is not equal to actual size";
                return false;
            }
        }
    }
}

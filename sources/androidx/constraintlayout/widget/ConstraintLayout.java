package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.p026a.C0541f;
import androidx.constraintlayout.p026a.p027a.C0520f;
import androidx.constraintlayout.p026a.p027a.C0523g;
import androidx.constraintlayout.p026a.p027a.C0525i;
import androidx.constraintlayout.widget.C0550b;
import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.trill.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f2204a = new SparseArray<>();

    /* renamed from: b */
    C0523g f2205b = new C0523g();

    /* renamed from: c */
    int f2206c = -1;

    /* renamed from: d */
    int f2207d = -1;

    /* renamed from: e */
    int f2208e = 0;

    /* renamed from: f */
    int f2209f = 0;

    /* renamed from: g */
    private ArrayList<AbstractC0549a> f2210g = new ArrayList<>(4);

    /* renamed from: h */
    private final ArrayList<C0520f> f2211h = new ArrayList<>(100);

    /* renamed from: i */
    private int f2212i = 0;

    /* renamed from: j */
    private int f2213j = 0;

    /* renamed from: k */
    private int f2214k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f2215l = Integer.MAX_VALUE;

    /* renamed from: m */
    private boolean f2216m = true;

    /* renamed from: n */
    private int f2217n = 7;

    /* renamed from: o */
    private C0550b f2218o = null;

    /* renamed from: p */
    private int f2219p = -1;

    /* renamed from: q */
    private HashMap<String, Integer> f2220q = new HashMap<>();

    /* renamed from: r */
    private int f2221r = -1;

    /* renamed from: s */
    private int f2222s = -1;

    /* renamed from: t */
    private C0541f f2223t;

    static {
        Covode.recordClassIndex(615);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getMaxHeight() {
        return this.f2215l;
    }

    public int getMaxWidth() {
        return this.f2214k;
    }

    public int getMinHeight() {
        return this.f2213j;
    }

    public int getMinWidth() {
        return this.f2212i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08e1, code lost:
        if (r6.f2232I != 1) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0d5b, code lost:
        if (r2 != false) goto L_0x0d0a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x07b2  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x07e6  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x07f0  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0808  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x080c  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0839  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0841  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0843  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x084f  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x092f  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0933  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r33, int r34) {
        /*
        // Method dump skipped, instructions count: 3496
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    protected static C0547a bu_() {
        return new C0547a(-2, -2);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return bu_();
    }

    public int getOptimizationLevel() {
        return this.f2205b.f2067aL;
    }

    /* renamed from: b */
    private void mo9139b() {
        this.f2205b.mo2331z();
        C0541f fVar = this.f2223t;
        if (fVar != null) {
            fVar.f2159c++;
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f2216m = true;
        this.f2221r = -1;
        this.f2222s = -1;
        this.f2206c = -1;
        this.f2207d = -1;
        this.f2208e = 0;
        this.f2209f = 0;
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0547a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2224A = 0.5f;

        /* renamed from: B */
        public String f2225B;

        /* renamed from: C */
        float f2226C;

        /* renamed from: D */
        int f2227D = 1;

        /* renamed from: E */
        public float f2228E = -1.0f;

        /* renamed from: F */
        public float f2229F = -1.0f;

        /* renamed from: G */
        public int f2230G;

        /* renamed from: H */
        public int f2231H;

        /* renamed from: I */
        public int f2232I;

        /* renamed from: J */
        public int f2233J;

        /* renamed from: K */
        public int f2234K;

        /* renamed from: L */
        public int f2235L;

        /* renamed from: M */
        public int f2236M;

        /* renamed from: N */
        public int f2237N;

        /* renamed from: O */
        public float f2238O = 1.0f;

        /* renamed from: P */
        public float f2239P = 1.0f;

        /* renamed from: Q */
        public int f2240Q = -1;

        /* renamed from: R */
        public int f2241R = -1;

        /* renamed from: S */
        public int f2242S = -1;

        /* renamed from: T */
        public boolean f2243T;

        /* renamed from: U */
        public boolean f2244U;

        /* renamed from: V */
        boolean f2245V = true;

        /* renamed from: W */
        boolean f2246W = true;

        /* renamed from: X */
        boolean f2247X;

        /* renamed from: Y */
        boolean f2248Y;

        /* renamed from: Z */
        boolean f2249Z;

        /* renamed from: a */
        public int f2250a = -1;

        /* renamed from: aa */
        boolean f2251aa;

        /* renamed from: ab */
        int f2252ab = -1;

        /* renamed from: ac */
        int f2253ac = -1;

        /* renamed from: ad */
        int f2254ad = -1;

        /* renamed from: ae */
        int f2255ae = -1;

        /* renamed from: af */
        int f2256af = -1;

        /* renamed from: ag */
        int f2257ag = -1;

        /* renamed from: ah */
        float f2258ah = 0.5f;

        /* renamed from: ai */
        int f2259ai;

        /* renamed from: aj */
        int f2260aj;

        /* renamed from: ak */
        float f2261ak;

        /* renamed from: al */
        C0520f f2262al = new C0520f();

        /* renamed from: am */
        public boolean f2263am = false;

        /* renamed from: b */
        public int f2264b = -1;

        /* renamed from: c */
        public float f2265c = -1.0f;

        /* renamed from: d */
        public int f2266d = -1;

        /* renamed from: e */
        public int f2267e = -1;

        /* renamed from: f */
        public int f2268f = -1;

        /* renamed from: g */
        public int f2269g = -1;

        /* renamed from: h */
        public int f2270h = -1;

        /* renamed from: i */
        public int f2271i = -1;

        /* renamed from: j */
        public int f2272j = -1;

        /* renamed from: k */
        public int f2273k = -1;

        /* renamed from: l */
        public int f2274l = -1;

        /* renamed from: m */
        public int f2275m = -1;

        /* renamed from: n */
        public int f2276n;

        /* renamed from: o */
        public float f2277o;

        /* renamed from: p */
        public int f2278p = -1;

        /* renamed from: q */
        public int f2279q = -1;

        /* renamed from: r */
        public int f2280r = -1;

        /* renamed from: s */
        public int f2281s = -1;

        /* renamed from: t */
        public int f2282t = -1;

        /* renamed from: u */
        public int f2283u = -1;

        /* renamed from: v */
        public int f2284v = -1;

        /* renamed from: w */
        public int f2285w = -1;

        /* renamed from: x */
        public int f2286x = -1;

        /* renamed from: y */
        public int f2287y = -1;

        /* renamed from: z */
        public float f2288z = 0.5f;

        static {
            Covode.recordClassIndex(616);
        }

        /* renamed from: a */
        public final void mo2422a() {
            this.f2248Y = false;
            this.f2245V = true;
            this.f2246W = true;
            if (this.width == -2 && this.f2243T) {
                this.f2245V = false;
                this.f2232I = 1;
            }
            if (this.height == -2 && this.f2244U) {
                this.f2246W = false;
                this.f2233J = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f2245V = false;
                if (this.width == 0 && this.f2232I == 1) {
                    this.width = -2;
                    this.f2243T = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f2246W = false;
                if (this.height == 0 && this.f2233J == 1) {
                    this.height = -2;
                    this.f2244U = true;
                }
            }
            if (this.f2265c != -1.0f || this.f2250a != -1 || this.f2264b != -1) {
                this.f2248Y = true;
                this.f2245V = true;
                this.f2246W = true;
                if (!(this.f2262al instanceof C0525i)) {
                    this.f2262al = new C0525i();
                }
                ((C0525i) this.f2262al).mo2330h(this.f2242S);
            }
        }

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        static class C0548a {

            /* renamed from: a */
            public static final SparseIntArray f2289a;

            static {
                Covode.recordClassIndex(617);
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2289a = sparseIntArray;
                sparseIntArray.append(34, 8);
                sparseIntArray.append(35, 9);
                sparseIntArray.append(37, 10);
                sparseIntArray.append(38, 11);
                sparseIntArray.append(43, 12);
                sparseIntArray.append(42, 13);
                sparseIntArray.append(16, 14);
                sparseIntArray.append(15, 15);
                sparseIntArray.append(13, 16);
                sparseIntArray.append(17, 2);
                sparseIntArray.append(19, 3);
                sparseIntArray.append(18, 4);
                sparseIntArray.append(51, 49);
                sparseIntArray.append(52, 50);
                sparseIntArray.append(23, 5);
                sparseIntArray.append(24, 6);
                sparseIntArray.append(25, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(39, 17);
                sparseIntArray.append(40, 18);
                sparseIntArray.append(22, 19);
                sparseIntArray.append(21, 20);
                sparseIntArray.append(55, 21);
                sparseIntArray.append(58, 22);
                sparseIntArray.append(56, 23);
                sparseIntArray.append(53, 24);
                sparseIntArray.append(57, 25);
                sparseIntArray.append(54, 26);
                sparseIntArray.append(30, 29);
                sparseIntArray.append(44, 30);
                sparseIntArray.append(20, 44);
                sparseIntArray.append(32, 45);
                sparseIntArray.append(46, 46);
                sparseIntArray.append(31, 47);
                sparseIntArray.append(45, 48);
                sparseIntArray.append(11, 27);
                sparseIntArray.append(10, 28);
                sparseIntArray.append(47, 31);
                sparseIntArray.append(26, 32);
                sparseIntArray.append(49, 33);
                sparseIntArray.append(48, 34);
                sparseIntArray.append(50, 35);
                sparseIntArray.append(28, 36);
                sparseIntArray.append(27, 37);
                sparseIntArray.append(29, 38);
                sparseIntArray.append(33, 39);
                sparseIntArray.append(41, 40);
                sparseIntArray.append(36, 41);
                sparseIntArray.append(14, 42);
                sparseIntArray.append(12, 43);
            }
        }

        public C0547a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0547a(C0547a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f2250a = aVar.f2250a;
            this.f2264b = aVar.f2264b;
            this.f2265c = aVar.f2265c;
            this.f2266d = aVar.f2266d;
            this.f2267e = aVar.f2267e;
            this.f2268f = aVar.f2268f;
            this.f2269g = aVar.f2269g;
            this.f2270h = aVar.f2270h;
            this.f2271i = aVar.f2271i;
            this.f2272j = aVar.f2272j;
            this.f2273k = aVar.f2273k;
            this.f2274l = aVar.f2274l;
            this.f2275m = aVar.f2275m;
            this.f2276n = aVar.f2276n;
            this.f2277o = aVar.f2277o;
            this.f2278p = aVar.f2278p;
            this.f2279q = aVar.f2279q;
            this.f2280r = aVar.f2280r;
            this.f2281s = aVar.f2281s;
            this.f2282t = aVar.f2282t;
            this.f2283u = aVar.f2283u;
            this.f2284v = aVar.f2284v;
            this.f2285w = aVar.f2285w;
            this.f2286x = aVar.f2286x;
            this.f2287y = aVar.f2287y;
            this.f2288z = aVar.f2288z;
            this.f2224A = aVar.f2224A;
            this.f2225B = aVar.f2225B;
            this.f2226C = aVar.f2226C;
            this.f2227D = aVar.f2227D;
            this.f2228E = aVar.f2228E;
            this.f2229F = aVar.f2229F;
            this.f2230G = aVar.f2230G;
            this.f2231H = aVar.f2231H;
            this.f2243T = aVar.f2243T;
            this.f2244U = aVar.f2244U;
            this.f2232I = aVar.f2232I;
            this.f2233J = aVar.f2233J;
            this.f2234K = aVar.f2234K;
            this.f2236M = aVar.f2236M;
            this.f2235L = aVar.f2235L;
            this.f2237N = aVar.f2237N;
            this.f2238O = aVar.f2238O;
            this.f2239P = aVar.f2239P;
            this.f2240Q = aVar.f2240Q;
            this.f2241R = aVar.f2241R;
            this.f2242S = aVar.f2242S;
            this.f2245V = aVar.f2245V;
            this.f2246W = aVar.f2246W;
            this.f2247X = aVar.f2247X;
            this.f2248Y = aVar.f2248Y;
            this.f2252ab = aVar.f2252ab;
            this.f2253ac = aVar.f2253ac;
            this.f2254ad = aVar.f2254ad;
            this.f2255ae = aVar.f2255ae;
            this.f2256af = aVar.f2256af;
            this.f2257ag = aVar.f2257ag;
            this.f2258ah = aVar.f2258ah;
            this.f2262al = aVar.f2262al;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r8) {
            /*
            // Method dump skipped, instructions count: 260
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0547a.resolveLayoutDirection(int):void");
        }

        public C0547a(int i, int i2) {
            super(i, i2);
        }

        public C0547a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.jq, R.attr.jr, R.attr.ml, R.attr.pf, R.attr.pg, R.attr.zm, R.attr.zn, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0w, R.attr.a0x, R.attr.a11, R.attr.a12, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a1f});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0548a.f2289a.get(index);
                switch (i3) {
                    case 1:
                        this.f2242S = obtainStyledAttributes.getInt(index, this.f2242S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2275m);
                        this.f2275m = resourceId;
                        if (resourceId == -1) {
                            this.f2275m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2276n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2276n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2277o) % 360.0f;
                        this.f2277o = f;
                        if (f < 0.0f) {
                            this.f2277o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        this.f2250a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2250a);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        this.f2264b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2264b);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        this.f2265c = obtainStyledAttributes.getFloat(index, this.f2265c);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2266d);
                        this.f2266d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2266d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2267e);
                        this.f2267e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2267e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2268f);
                        this.f2268f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2268f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2269g);
                        this.f2269g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2269g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2270h);
                        this.f2270h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2270h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2271i);
                        this.f2271i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2271i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2272j);
                        this.f2272j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2272j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2273k);
                        this.f2273k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2273k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2274l);
                        this.f2274l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2274l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2278p);
                        this.f2278p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2278p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2279q);
                        this.f2279q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2279q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2280r);
                        this.f2280r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2280r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2281s);
                        this.f2281s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2281s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2282t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2282t);
                        break;
                    case 22:
                        this.f2283u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2283u);
                        break;
                    case 23:
                        this.f2284v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2284v);
                        break;
                    case 24:
                        this.f2285w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2285w);
                        break;
                    case 25:
                        this.f2286x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2286x);
                        break;
                    case 26:
                        this.f2287y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2287y);
                        break;
                    case 27:
                        this.f2243T = obtainStyledAttributes.getBoolean(index, this.f2243T);
                        break;
                    case 28:
                        this.f2244U = obtainStyledAttributes.getBoolean(index, this.f2244U);
                        break;
                    case 29:
                        this.f2288z = obtainStyledAttributes.getFloat(index, this.f2288z);
                        break;
                    case 30:
                        this.f2224A = obtainStyledAttributes.getFloat(index, this.f2224A);
                        break;
                    case 31:
                        this.f2232I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f2233J = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f2234K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2234K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2234K) == -2) {
                                this.f2234K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2236M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2236M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2236M) == -2) {
                                this.f2236M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f2238O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2238O));
                        break;
                    case 36:
                        try {
                            this.f2235L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2235L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2235L) == -2) {
                                this.f2235L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2237N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2237N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2237N) == -2) {
                                this.f2237N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f2239P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2239P));
                        break;
                    default:
                        switch (i3) {
                            case BuildConfig.VERSION_CODE /*{ENCODED_INT: 44}*/:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2225B = string;
                                this.f2226C = Float.NaN;
                                this.f2227D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f2225B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f2225B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2227D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2227D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2225B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f2225B.substring(i);
                                        if (substring2.length() > 0) {
                                            this.f2226C = Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f2225B.substring(i, indexOf2);
                                        String substring4 = this.f2225B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f2227D == 1) {
                                                        this.f2226C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f2226C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f2228E = obtainStyledAttributes.getFloat(index, this.f2228E);
                                continue;
                            case 46:
                                this.f2229F = obtainStyledAttributes.getFloat(index, this.f2229F);
                                continue;
                            case 47:
                                this.f2230G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f2231H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f2240Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2240Q);
                                continue;
                            case 50:
                                this.f2241R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2241R);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo2422a();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0547a;
    }

    public void setConstraintSet(C0550b bVar) {
        this.f2218o = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0547a(layoutParams);
    }

    public void removeView(View view) {
        super.removeView(view);
        int i = Build.VERSION.SDK_INT;
    }

    public void setOptimizationLevel(int i) {
        this.f2205b.f2067aL = i;
    }

    /* renamed from: a */
    public final View mo2394a(int i) {
        return this.f2204a.get(i);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0547a(getContext(), attributeSet);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2215l) {
            this.f2215l = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2214k) {
            this.f2214k = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2213j) {
            this.f2213j = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2212i) {
            this.f2212i = i;
            requestLayout();
        }
    }

    /* renamed from: a */
    public final C0520f mo2395a(View view) {
        if (view == this) {
            return this.f2205b;
        }
        if (view == null) {
            return null;
        }
        return ((C0547a) view.getLayoutParams()).f2262al;
    }

    public void setId(int i) {
        this.f2204a.remove(getId());
        super.setId(i);
        this.f2204a.put(getId(), this);
    }

    /* renamed from: b */
    private final C0520f mo9603b(int i) {
        if (i == 0) {
            return this.f2205b;
        }
        View view = this.f2204a.get(i);
        if (view == null) {
            view = findViewById(i);
            if (view == null) {
                return null;
            }
            if (view != this && view.getParent() == this) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f2205b;
        }
        if (view == null) {
            return null;
        }
        return ((C0547a) view.getLayoutParams()).f2262al;
    }

    public void onViewRemoved(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewRemoved(view);
        this.f2204a.remove(view.getId());
        C0520f a = mo2395a(view);
        this.f2205b.mo2352a(a);
        this.f2210g.remove(view);
        this.f2211h.remove(a);
        this.f2216m = true;
    }

    public ConstraintLayout(Context context) {
        super(context);
        m2074a((AttributeSet) null);
    }

    /* renamed from: a */
    public final Object mo2396a(Object obj) {
        HashMap<String, Integer> hashMap;
        if (!(obj instanceof String) || (hashMap = this.f2220q) == null || !hashMap.containsKey(obj)) {
            return null;
        }
        return this.f2220q.get(obj);
    }

    public void onViewAdded(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewAdded(view);
        C0520f a = mo2395a(view);
        if ((view instanceof Guideline) && !(a instanceof C0525i)) {
            C0547a aVar = (C0547a) view.getLayoutParams();
            aVar.f2262al = new C0525i();
            aVar.f2248Y = true;
            ((C0525i) aVar.f2262al).mo2330h(aVar.f2242S);
        }
        if (view instanceof AbstractC0549a) {
            AbstractC0549a aVar2 = (AbstractC0549a) view;
            aVar2.mo2437a();
            ((C0547a) view.getLayoutParams()).f2249Z = true;
            if (!this.f2210g.contains(aVar2)) {
                this.f2210g.add(aVar2);
            }
        }
        this.f2204a.put(view.getId(), view);
        this.f2216m = true;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        Canvas canvas2 = canvas;
        super.dispatchDraw(canvas2);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i2;
                        float f2 = (float) i3;
                        float f3 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas2.drawLine(f, f2, f3, f2, paint);
                        float f4 = (float) (i3 + ((int) ((((float) parseInt4) / 1920.0f) * height)));
                        canvas2.drawLine(f3, f2, f3, f4, paint);
                        canvas2.drawLine(f3, f4, f, f4, paint);
                        canvas2.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas2.drawLine(f, f2, f3, f4, paint);
                        canvas2 = canvas2;
                        canvas2.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2074a(AttributeSet attributeSet) {
        IOException e;
        this.f2205b.f2009ae = this;
        this.f2204a.put(getId(), this);
        C0550b bVar = null;
        this.f2218o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842948, 16843039, 16843040, 16843071, 16843072, R.attr.jq, R.attr.jr, R.attr.ml, R.attr.pf, R.attr.pg, R.attr.zm, R.attr.zn, R.attr.zo, R.attr.zp, R.attr.zq, R.attr.zr, R.attr.zs, R.attr.zt, R.attr.zu, R.attr.zv, R.attr.zw, R.attr.zx, R.attr.zy, R.attr.zz, R.attr.a00, R.attr.a01, R.attr.a02, R.attr.a03, R.attr.a04, R.attr.a05, R.attr.a06, R.attr.a07, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a0g, R.attr.a0h, R.attr.a0i, R.attr.a0j, R.attr.a0k, R.attr.a0l, R.attr.a0m, R.attr.a0n, R.attr.a0o, R.attr.a0p, R.attr.a0w, R.attr.a0x, R.attr.a11, R.attr.a12, R.attr.a13, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a1f});
            int indexCount = obtainStyledAttributes.getIndexCount();
            int i = 0;
            int i2 = 0;
            while (i2 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i2);
                char c = 3;
                if (index == 3) {
                    this.f2212i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2212i);
                } else if (index == 4) {
                    this.f2213j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2213j);
                } else {
                    boolean z = true;
                    if (index == 1) {
                        this.f2214k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2214k);
                    } else {
                        int i3 = 2;
                        if (index == 2) {
                            this.f2215l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2215l);
                        } else if (index == 59) {
                            this.f2217n = obtainStyledAttributes.getInt(index, this.f2217n);
                        } else if (index == 8) {
                            int i4 = i == 1 ? 1 : 0;
                            int i5 = i == 1 ? 1 : 0;
                            int i6 = i == 1 ? 1 : 0;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                            try {
                                C0550b bVar2 = new C0550b();
                                this.f2218o = bVar2;
                                Context context = getContext();
                                try {
                                    XmlResourceParser xml = context.getResources().getXml(resourceId);
                                    try {
                                        int eventType = xml.getEventType();
                                        while (eventType != z) {
                                            if (eventType == 0) {
                                                xml.getName();
                                            } else if (eventType == i3) {
                                                String name = xml.getName();
                                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                                byte b = i == 1 ? (byte) 1 : 0;
                                                byte b2 = i == 1 ? (byte) 1 : 0;
                                                C0550b.C0551a aVar = new C0550b.C0551a(b);
                                                int[] iArr = new int[80];
                                                char c2 = i == 1 ? 1 : 0;
                                                char c3 = i == 1 ? 1 : 0;
                                                iArr[c2] = 16842948;
                                                char c4 = z ? 1 : 0;
                                                char c5 = z ? 1 : 0;
                                                char c6 = z ? 1 : 0;
                                                char c7 = z ? 1 : 0;
                                                iArr[c4] = 16842960;
                                                iArr[i3] = 16842972;
                                                iArr[c] = 16842996;
                                                iArr[4] = 16842997;
                                                iArr[5] = 16842999;
                                                iArr[6] = 16843000;
                                                iArr[7] = 16843001;
                                                iArr[8] = 16843002;
                                                iArr[9] = 16843039;
                                                iArr[10] = 16843040;
                                                iArr[11] = 16843071;
                                                iArr[12] = 16843072;
                                                iArr[13] = 16843551;
                                                iArr[14] = 16843552;
                                                iArr[15] = 16843553;
                                                iArr[16] = 16843554;
                                                iArr[17] = 16843555;
                                                iArr[18] = 16843556;
                                                iArr[19] = 16843557;
                                                iArr[20] = 16843558;
                                                iArr[21] = 16843559;
                                                iArr[22] = 16843560;
                                                iArr[23] = 16843701;
                                                iArr[24] = 16843702;
                                                iArr[25] = 16843770;
                                                iArr[26] = 16843840;
                                                iArr[27] = R.attr.jq;
                                                iArr[28] = R.attr.jr;
                                                iArr[29] = R.attr.ml;
                                                iArr[30] = R.attr.pg;
                                                iArr[31] = R.attr.zm;
                                                iArr[32] = R.attr.zn;
                                                iArr[33] = R.attr.zo;
                                                iArr[34] = R.attr.zp;
                                                iArr[35] = R.attr.zq;
                                                iArr[36] = R.attr.zr;
                                                iArr[37] = R.attr.zs;
                                                iArr[38] = R.attr.zt;
                                                iArr[39] = R.attr.zu;
                                                iArr[40] = R.attr.zv;
                                                iArr[41] = R.attr.zw;
                                                iArr[42] = R.attr.zx;
                                                iArr[43] = R.attr.zy;
                                                iArr[44] = R.attr.zz;
                                                iArr[45] = R.attr.a00;
                                                iArr[46] = R.attr.a01;
                                                iArr[47] = R.attr.a02;
                                                iArr[48] = R.attr.a03;
                                                iArr[49] = R.attr.a04;
                                                iArr[50] = R.attr.a05;
                                                iArr[51] = R.attr.a06;
                                                iArr[52] = R.attr.a07;
                                                iArr[53] = R.attr.a08;
                                                iArr[54] = R.attr.a09;
                                                iArr[55] = R.attr.a0_;
                                                iArr[56] = R.attr.a0a;
                                                iArr[57] = R.attr.a0b;
                                                iArr[58] = R.attr.a0c;
                                                iArr[59] = R.attr.a0d;
                                                try {
                                                    iArr[60] = R.attr.a0e;
                                                    iArr[61] = R.attr.a0f;
                                                    iArr[62] = R.attr.a0g;
                                                    iArr[63] = R.attr.a0h;
                                                    iArr[64] = R.attr.a0i;
                                                    iArr[65] = R.attr.a0j;
                                                    iArr[66] = R.attr.a0k;
                                                    iArr[67] = R.attr.a0l;
                                                    iArr[68] = R.attr.a0m;
                                                    iArr[69] = R.attr.a0n;
                                                    iArr[70] = R.attr.a0o;
                                                    iArr[71] = R.attr.a0p;
                                                    iArr[72] = R.attr.a0w;
                                                    iArr[73] = R.attr.a0x;
                                                    iArr[74] = R.attr.a11;
                                                    iArr[75] = R.attr.a12;
                                                    iArr[76] = R.attr.a13;
                                                    iArr[77] = R.attr.a14;
                                                    iArr[78] = R.attr.a15;
                                                    iArr[79] = R.attr.a16;
                                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, iArr);
                                                    int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                                    while (i < indexCount2) {
                                                        int index2 = obtainStyledAttributes2.getIndex(i == 1 ? 1 : 0);
                                                        int i7 = C0550b.f2300c.get(index2);
                                                        switch (i7) {
                                                            case 1:
                                                                aVar.f2365p = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2365p);
                                                                break;
                                                            case 2:
                                                                aVar.f2308G = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2308G);
                                                                break;
                                                            case 3:
                                                                aVar.f2364o = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2364o);
                                                                break;
                                                            case 4:
                                                                aVar.f2363n = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2363n);
                                                                break;
                                                            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                                                aVar.f2372w = obtainStyledAttributes2.getString(index2);
                                                                break;
                                                            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                                                aVar.f2302A = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.f2302A);
                                                                break;
                                                            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                                                aVar.f2303B = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.f2303B);
                                                                break;
                                                            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                                                aVar.f2309H = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2309H);
                                                                break;
                                                            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                                                aVar.f2369t = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2369t);
                                                                break;
                                                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                                                aVar.f2368s = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2368s);
                                                                break;
                                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                                                aVar.f2315N = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2315N);
                                                                break;
                                                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                                                aVar.f2316O = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2316O);
                                                                break;
                                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                                                aVar.f2312K = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2312K);
                                                                break;
                                                            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                                                aVar.f2314M = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2314M);
                                                                break;
                                                            case 15:
                                                                aVar.f2317P = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2317P);
                                                                break;
                                                            case 16:
                                                                aVar.f2313L = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2313L);
                                                                break;
                                                            case 17:
                                                                aVar.f2354e = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.f2354e);
                                                                break;
                                                            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                                                                aVar.f2355f = obtainStyledAttributes2.getDimensionPixelOffset(index2, aVar.f2355f);
                                                                break;
                                                            case 19:
                                                                aVar.f2356g = obtainStyledAttributes2.getFloat(index2, aVar.f2356g);
                                                                break;
                                                            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                                                                aVar.f2370u = obtainStyledAttributes2.getFloat(index2, aVar.f2370u);
                                                                break;
                                                            case 21:
                                                                aVar.f2352c = obtainStyledAttributes2.getLayoutDimension(index2, aVar.f2352c);
                                                                break;
                                                            case 22:
                                                                aVar.f2311J = obtainStyledAttributes2.getInt(index2, aVar.f2311J);
                                                                aVar.f2311J = C0550b.f2299a[aVar.f2311J];
                                                                break;
                                                            case 23:
                                                                aVar.f2351b = obtainStyledAttributes2.getLayoutDimension(index2, aVar.f2351b);
                                                                break;
                                                            case 24:
                                                                aVar.f2305D = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2305D);
                                                                break;
                                                            case 25:
                                                                aVar.f2357h = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2357h);
                                                                break;
                                                            case 26:
                                                                aVar.f2358i = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2358i);
                                                                break;
                                                            case 27:
                                                                aVar.f2304C = obtainStyledAttributes2.getInt(index2, aVar.f2304C);
                                                                break;
                                                            case 28:
                                                                aVar.f2306E = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2306E);
                                                                break;
                                                            case 29:
                                                                aVar.f2359j = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2359j);
                                                                break;
                                                            case 30:
                                                                aVar.f2360k = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2360k);
                                                                break;
                                                            case 31:
                                                                aVar.f2310I = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2310I);
                                                                break;
                                                            case 32:
                                                                aVar.f2366q = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2366q);
                                                                break;
                                                            case 33:
                                                                aVar.f2367r = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2367r);
                                                                break;
                                                            case 34:
                                                                aVar.f2307F = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2307F);
                                                                break;
                                                            case 35:
                                                                aVar.f2362m = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2362m);
                                                                break;
                                                            case 36:
                                                                aVar.f2361l = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2361l);
                                                                break;
                                                            case 37:
                                                                aVar.f2371v = obtainStyledAttributes2.getFloat(index2, aVar.f2371v);
                                                                break;
                                                            case 38:
                                                                aVar.f2353d = obtainStyledAttributes2.getResourceId(index2, aVar.f2353d);
                                                                break;
                                                            case 39:
                                                                aVar.f2319R = obtainStyledAttributes2.getFloat(index2, aVar.f2319R);
                                                                break;
                                                            case 40:
                                                                aVar.f2318Q = obtainStyledAttributes2.getFloat(index2, aVar.f2318Q);
                                                                break;
                                                            case 41:
                                                                aVar.f2320S = obtainStyledAttributes2.getInt(index2, aVar.f2320S);
                                                                break;
                                                            case 42:
                                                                aVar.f2321T = obtainStyledAttributes2.getInt(index2, aVar.f2321T);
                                                                break;
                                                            case 43:
                                                                aVar.f2322U = obtainStyledAttributes2.getFloat(index2, aVar.f2322U);
                                                                break;
                                                            case BuildConfig.VERSION_CODE /*{ENCODED_INT: 44}*/:
                                                                aVar.f2323V = z;
                                                                aVar.f2324W = obtainStyledAttributes2.getDimension(index2, aVar.f2324W);
                                                                break;
                                                            case 45:
                                                                aVar.f2326Y = obtainStyledAttributes2.getFloat(index2, aVar.f2326Y);
                                                                break;
                                                            case 46:
                                                                aVar.f2327Z = obtainStyledAttributes2.getFloat(index2, aVar.f2327Z);
                                                                break;
                                                            case 47:
                                                                aVar.f2329aa = obtainStyledAttributes2.getFloat(index2, aVar.f2329aa);
                                                                break;
                                                            case 48:
                                                                aVar.f2330ab = obtainStyledAttributes2.getFloat(index2, aVar.f2330ab);
                                                                break;
                                                            case 49:
                                                                aVar.f2331ac = obtainStyledAttributes2.getFloat(index2, aVar.f2331ac);
                                                                break;
                                                            case 50:
                                                                aVar.f2332ad = obtainStyledAttributes2.getFloat(index2, aVar.f2332ad);
                                                                break;
                                                            case 51:
                                                                aVar.f2333ae = obtainStyledAttributes2.getDimension(index2, aVar.f2333ae);
                                                                break;
                                                            case 52:
                                                                aVar.f2334af = obtainStyledAttributes2.getDimension(index2, aVar.f2334af);
                                                                break;
                                                            case 53:
                                                                aVar.f2335ag = obtainStyledAttributes2.getDimension(index2, aVar.f2335ag);
                                                                break;
                                                            default:
                                                                switch (i7) {
                                                                    case AudiencePingIntervalSetting.DEFAULT /*{ENCODED_INT: 60}*/:
                                                                        aVar.f2325X = obtainStyledAttributes2.getFloat(index2, aVar.f2325X);
                                                                        break;
                                                                    case 61:
                                                                        aVar.f2373x = C0550b.m2091a(obtainStyledAttributes2, index2, aVar.f2373x);
                                                                        break;
                                                                    case 62:
                                                                        aVar.f2374y = obtainStyledAttributes2.getDimensionPixelSize(index2, aVar.f2374y);
                                                                        break;
                                                                    case 63:
                                                                        aVar.f2375z = obtainStyledAttributes2.getFloat(index2, aVar.f2375z);
                                                                        break;
                                                                    default:
                                                                        switch (i7) {
                                                                            case 69:
                                                                                aVar.f2344ap = obtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                                break;
                                                                            case 70:
                                                                                aVar.f2345aq = obtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                                break;
                                                                            case 71:
                                                                                break;
                                                                            case 72:
                                                                                aVar.f2347as = obtainStyledAttributes2.getInt(index2, aVar.f2347as);
                                                                                break;
                                                                            case 73:
                                                                                aVar.f2350av = obtainStyledAttributes2.getString(index2);
                                                                                break;
                                                                            case 74:
                                                                                aVar.f2346ar = obtainStyledAttributes2.getBoolean(index2, aVar.f2346ar);
                                                                                break;
                                                                            case 75:
                                                                                Integer.toHexString(index2);
                                                                                C0550b.f2300c.get(index2);
                                                                                break;
                                                                            default:
                                                                                Integer.toHexString(index2);
                                                                                C0550b.f2300c.get(index2);
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                        i++;
                                                        z = true;
                                                    }
                                                    obtainStyledAttributes2.recycle();
                                                    if (name.equalsIgnoreCase("Guideline")) {
                                                        aVar.f2328a = true;
                                                    }
                                                    bVar2.f2301b.put(Integer.valueOf(aVar.f2353d), aVar);
                                                } catch (XmlPullParserException unused) {
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    try {
                                                        e.printStackTrace();
                                                        bVar = null;
                                                    } catch (Resources.NotFoundException unused2) {
                                                    }
                                                    this.f2219p = resourceId;
                                                    i2++;
                                                    i = 0;
                                                }
                                            }
                                            eventType = xml.next();
                                            i = 0;
                                            c = 3;
                                            z = true;
                                            i3 = 2;
                                        }
                                    } catch (XmlPullParserException unused3) {
                                    } catch (IOException e3) {
                                        e = e3;
                                        e.printStackTrace();
                                    }
                                    bVar = null;
                                } catch (Resources.NotFoundException unused4) {
                                    bVar = null;
                                    this.f2218o = bVar;
                                    this.f2219p = resourceId;
                                    i2++;
                                    i = 0;
                                }
                            } catch (Resources.NotFoundException unused5) {
                                this.f2218o = bVar;
                                this.f2219p = resourceId;
                                i2++;
                                i = 0;
                            }
                            this.f2219p = resourceId;
                        }
                    }
                }
                i2++;
                i = 0;
            }
            obtainStyledAttributes.recycle();
        }
        this.f2205b.f2067aL = this.f2217n;
    }

    /* renamed from: a */
    private void m2075a(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2220q == null) {
                this.f2220q = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2220q.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2074a(attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        int i2 = Build.VERSION.SDK_INT;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2074a(attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C0547a aVar = (C0547a) childAt.getLayoutParams();
            C0520f fVar = aVar.f2262al;
            if ((childAt.getVisibility() != 8 || aVar.f2248Y || aVar.f2249Z || isInEditMode) && !aVar.f2251aa) {
                int m = fVar.mo2312m();
                int n = fVar.mo2313n();
                int k = fVar.mo2310k() + m;
                int l = fVar.mo2311l() + n;
                childAt.layout(m, n, k, l);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m, n, k, l);
                }
            }
        }
        int size = this.f2210g.size();
        if (size > 0) {
            do {
                this.f2210g.get(i5).mo2425b();
                i5++;
            } while (i5 < size);
        }
    }
}

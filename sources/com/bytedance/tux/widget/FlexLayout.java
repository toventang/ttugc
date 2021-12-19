package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class FlexLayout extends ViewGroup {

    /* renamed from: A */
    private static final C23388i f55389A;

    /* renamed from: B */
    private static final C23386g f55390B;

    /* renamed from: C */
    private static final C23366ag f55391C;

    /* renamed from: D */
    private static final C23361ab f55392D;

    /* renamed from: E */
    private static final C23360aa f55393E;

    /* renamed from: F */
    private static final C23365af f55394F;

    /* renamed from: G */
    private static final C23364ae f55395G;

    /* renamed from: H */
    private static final C23363ad f55396H;

    /* renamed from: I */
    private static final C23362ac f55397I;

    /* renamed from: J */
    private static final C23395p f55398J;

    /* renamed from: K */
    private static final C23396q f55399K;

    /* renamed from: L */
    private static final C23399t f55400L;

    /* renamed from: M */
    private static final C23393n f55401M;

    /* renamed from: N */
    private static final C23394o f55402N;

    /* renamed from: O */
    private static final C23392m f55403O;

    /* renamed from: P */
    private static final C23397r f55404P;

    /* renamed from: Q */
    private static final C23398s f55405Q;

    /* renamed from: R */
    private static final C23367ah f55406R;

    /* renamed from: S */
    private static final C23369aj f55407S;

    /* renamed from: T */
    private static final C23371al f55408T;

    /* renamed from: a */
    public static Boolean f55409a;

    /* renamed from: b */
    public static Map<String, Integer> f55410b;

    /* renamed from: c */
    public static int f55411c = 251789312;

    /* renamed from: d */
    public static final C23389j f55412d;

    /* renamed from: e */
    public static final C23387h f55413e;

    /* renamed from: f */
    public static final C23385f f55414f;

    /* renamed from: g */
    public static final C23390k f55415g;

    /* renamed from: h */
    public static final C23400u f55416h;

    /* renamed from: i */
    public static final C23401v f55417i;

    /* renamed from: j */
    public static final C23382c f55418j;

    /* renamed from: k */
    public static final C23383d f55419k;

    /* renamed from: l */
    public static final C23384e f55420l;

    /* renamed from: m */
    public static final C23368ai f55421m;

    /* renamed from: n */
    public static final C23370ak f55422n;

    /* renamed from: o */
    public static final List<AbstractC23374an> f55423o;

    /* renamed from: p */
    public static final C23359a f55424p = new C23359a((byte) 0);

    /* renamed from: u */
    private static final C23402w f55425u;

    /* renamed from: v */
    private static final C23391l f55426v;

    /* renamed from: w */
    private static final C23404y f55427w;

    /* renamed from: x */
    private static final C23381b f55428x;

    /* renamed from: y */
    private static final C23405z f55429y;

    /* renamed from: z */
    private static final C23403x f55430z;

    /* renamed from: q */
    private int f55431q;

    /* renamed from: r */
    private int f55432r;

    /* renamed from: s */
    private int f55433s;

    /* renamed from: t */
    private int f55434t;

    /* renamed from: com.bytedance.tux.widget.FlexLayout$am */
    public static final class C23372am extends ViewGroup.LayoutParams {

        /* renamed from: u */
        public static final int[] f55435u = {16842996, 16842997};

        /* renamed from: v */
        public static final C23373a f55436v = new C23373a((byte) 0);

        /* renamed from: a */
        public C23376ao f55437a;

        /* renamed from: b */
        public C23376ao f55438b;

        /* renamed from: c */
        public C23376ao f55439c;

        /* renamed from: d */
        public C23376ao f55440d;

        /* renamed from: e */
        public C23376ao f55441e;

        /* renamed from: f */
        public C23376ao f55442f;

        /* renamed from: g */
        public C23376ao f55443g;

        /* renamed from: h */
        public C23376ao f55444h;

        /* renamed from: i */
        public float f55445i;

        /* renamed from: j */
        public float f55446j;

        /* renamed from: k */
        public float f55447k;

        /* renamed from: l */
        public float f55448l;

        /* renamed from: m */
        public float f55449m;

        /* renamed from: n */
        public float f55450n;

        /* renamed from: o */
        public float f55451o;

        /* renamed from: p */
        public float f55452p;

        /* renamed from: q */
        public int f55453q;

        /* renamed from: r */
        public int f55454r;

        /* renamed from: s */
        public int f55455s;

        /* renamed from: t */
        public String f55456t = "";

        /* renamed from: com.bytedance.tux.widget.FlexLayout$am$a */
        public static final class C23373a {
            static {
                Covode.recordClassIndex(27329);
            }

            private C23373a() {
            }

            public /* synthetic */ C23373a(byte b) {
                this();
            }
        }

        /* renamed from: g */
        public final boolean mo38092g() {
            if (!m44014h() || !m44015i()) {
                return false;
            }
            return true;
        }

        static {
            Covode.recordClassIndex(27328);
        }

        /* renamed from: h */
        private final boolean m44014h() {
            int i;
            float f = this.f55445i;
            if (f == f) {
                i = 1;
            } else {
                i = 0;
            }
            float f2 = this.f55446j;
            if (f2 == f2) {
                i++;
            }
            float f3 = this.f55451o;
            if (f3 == f3) {
                i++;
            }
            float f4 = this.f55449m;
            if (f4 == f4) {
                i++;
            }
            if (i >= 2) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        private final boolean m44015i() {
            int i;
            float f = this.f55447k;
            if (f == f) {
                i = 1;
            } else {
                i = 0;
            }
            float f2 = this.f55448l;
            if (f2 == f2) {
                i++;
            }
            float f3 = this.f55452p;
            if (f3 == f3) {
                i++;
            }
            float f4 = this.f55450n;
            if (f4 == f4) {
                i++;
            }
            if (i >= 2) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final float mo38086a() {
            float f = this.f55445i;
            if (f == f) {
                return f;
            }
            float f2 = this.f55451o;
            if (f2 == f2) {
                float f3 = this.f55446j;
                if (f3 == f3) {
                    return f3 - f2;
                }
                float f4 = this.f55449m;
                if (f4 == f4) {
                    return f4 - (f2 / 2.0f);
                }
            }
            float f5 = this.f55449m;
            if (f5 != f5) {
                return Float.NaN;
            }
            float f6 = this.f55446j;
            if (f6 == f6) {
                return (f5 * 2.0f) - f6;
            }
            return Float.NaN;
        }

        /* renamed from: b */
        public final float mo38087b() {
            float f = this.f55446j;
            if (f == f) {
                return f;
            }
            float f2 = this.f55451o;
            if (f2 == f2) {
                float f3 = this.f55445i;
                if (f3 == f3) {
                    return f3 + f2;
                }
                float f4 = this.f55449m;
                if (f4 == f4) {
                    return f4 + (f2 / 2.0f);
                }
            }
            float f5 = this.f55449m;
            if (f5 != f5) {
                return Float.NaN;
            }
            float f6 = this.f55445i;
            if (f6 == f6) {
                return (f5 * 2.0f) - f6;
            }
            return Float.NaN;
        }

        /* renamed from: c */
        public final float mo38088c() {
            float f = this.f55447k;
            if (f == f) {
                return f;
            }
            float f2 = this.f55452p;
            if (f2 == f2) {
                float f3 = this.f55448l;
                if (f3 == f3) {
                    return f3 - f2;
                }
                float f4 = this.f55450n;
                if (f4 == f4) {
                    return f4 - (f2 / 2.0f);
                }
            }
            float f5 = this.f55450n;
            if (f5 != f5) {
                return Float.NaN;
            }
            float f6 = this.f55448l;
            if (f6 == f6) {
                return (f5 * 2.0f) - f6;
            }
            return Float.NaN;
        }

        /* renamed from: d */
        public final float mo38089d() {
            float f = this.f55448l;
            if (f == f) {
                return f;
            }
            float f2 = this.f55452p;
            if (f2 == f2) {
                float f3 = this.f55447k;
                if (f3 == f3) {
                    return f3 + f2;
                }
                float f4 = this.f55450n;
                if (f4 == f4) {
                    return f4 + (f2 / 2.0f);
                }
            }
            float f5 = this.f55450n;
            if (f5 != f5) {
                return Float.NaN;
            }
            float f6 = this.f55447k;
            if (f6 == f6) {
                return (f5 * 2.0f) - f6;
            }
            return Float.NaN;
        }

        /* renamed from: e */
        public final float mo38090e() {
            float f = this.f55451o;
            if (f == f) {
                return f;
            }
            float f2 = this.f55445i;
            if (f2 == f2) {
                float f3 = this.f55446j;
                if (f3 == f3) {
                    return f3 - f2;
                }
                float f4 = this.f55449m;
                if (f4 == f4) {
                    return (f4 - f2) * 2.0f;
                }
            }
            float f5 = this.f55446j;
            if (f5 != f5) {
                return Float.NaN;
            }
            float f6 = this.f55449m;
            if (f6 == f6) {
                return (f5 - f6) * 2.0f;
            }
            return Float.NaN;
        }

        /* renamed from: f */
        public final float mo38091f() {
            float f = this.f55452p;
            if (f == f) {
                return f;
            }
            float f2 = this.f55447k;
            if (f2 == f2) {
                float f3 = this.f55448l;
                if (f3 == f3) {
                    return f3 - f2;
                }
                float f4 = this.f55450n;
                if (f4 == f4) {
                    return (f4 - f2) * 2.0f;
                }
            }
            float f5 = this.f55448l;
            if (f5 != f5) {
                return Float.NaN;
            }
            float f6 = this.f55450n;
            if (f6 == f6) {
                return (f5 - f6) * 2.0f;
            }
            return Float.NaN;
        }

        public C23372am(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C23372am(int i) {
            super(i, -2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23372am(Context context, AttributeSet attributeSet) {
            super(0, 0);
            String attributeValue;
            String sb;
            C89219l.m154719c(context, "");
            C89219l.m154719c(attributeSet, "");
            if (!(FlexLayout.f55410b == null || (attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "id")) == null)) {
                if (C89361p.m154874b(attributeValue, "@+id/", false)) {
                    sb = attributeValue.substring(5);
                    C89219l.m154709a((Object) sb, "");
                } else if (C89361p.m154874b(attributeValue, "@id/", false)) {
                    sb = attributeValue.substring(4);
                    C89219l.m154709a((Object) sb, "");
                } else if (C89361p.m154874b(attributeValue, "@android:id/", false)) {
                    StringBuilder sb2 = new StringBuilder("android:");
                    String substring = attributeValue.substring(12);
                    C89219l.m154709a((Object) substring, "");
                    sb = sb2.append(substring).toString();
                } else {
                    throw new IllegalArgumentException("unidentified id ".concat(String.valueOf(attributeValue)));
                }
                this.f55455s = C23359a.m43997a(sb);
            }
            if (C23359a.m43999a(context)) {
                String positionDescription = attributeSet.getPositionDescription();
                C89219l.m154709a((Object) positionDescription, "");
                this.f55456t = positionDescription;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f55435u);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            this.width = obtainStyledAttributes.getLayoutDimension(0, -5);
            this.height = obtainStyledAttributes.getLayoutDimension(1, -5);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ze, R.attr.zf, R.attr.zg, R.attr.a18, R.attr.a1a, R.attr.a1h, R.attr.a1p, R.attr.a1q});
            C89219l.m154709a((Object) obtainStyledAttributes2, "");
            this.f55437a = C23376ao.C23377a.m44026a(context, obtainStyledAttributes2.getString(4), "layout_left");
            this.f55439c = C23376ao.C23377a.m44026a(context, obtainStyledAttributes2.getString(6), "layout_top");
            this.f55438b = C23376ao.C23377a.m44026a(context, obtainStyledAttributes2.getString(5), "layout_right");
            this.f55440d = C23376ao.C23377a.m44026a(context, obtainStyledAttributes2.getString(0), "layout_bottom");
            this.f55441e = C23376ao.C23377a.m44026a(context, obtainStyledAttributes2.getString(1), "layout_centerX");
            this.f55442f = C23376ao.C23377a.m44026a(context, obtainStyledAttributes2.getString(2), "layout_centerY");
            String string = obtainStyledAttributes2.getString(7);
            if (C89219l.m154714a((Object) string, (Object) "match_parent") || C89219l.m154714a((Object) string, (Object) "fill_parent")) {
                this.width = -1;
            } else if (C89219l.m154714a((Object) string, (Object) "wrap_content")) {
                this.width = -2;
            } else {
                this.f55443g = C23376ao.C23377a.m44026a(context, string, "layout_width");
            }
            String string2 = obtainStyledAttributes2.getString(3);
            if (C89219l.m154714a((Object) string2, (Object) "match_parent") || C89219l.m154714a((Object) string2, (Object) "fill_parent")) {
                this.height = -1;
            } else if (C89219l.m154714a((Object) string2, (Object) "wrap_content")) {
                this.height = -2;
            } else {
                this.f55444h = C23376ao.C23377a.m44026a(context, string2, "layout_height");
            }
            obtainStyledAttributes2.recycle();
            if (this.f55437a == null && this.f55438b == null && this.f55441e == null && this.f55443g == null && this.width == -5) {
                throw new IllegalArgumentException("no LayoutParams in layout_left|layout_right|layout_centerX|layout_width");
            } else if (this.f55439c == null && this.f55440d == null && this.f55442f == null && this.f55444h == null && this.height == -5) {
                throw new IllegalArgumentException("no LayoutParams in layout_top|layout_bottom|layout_centerY|layout_height");
            }
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$an */
    public static abstract class AbstractC23374an {

        /* renamed from: f */
        public static final C23375a f55457f = new C23375a((byte) 0);

        /* renamed from: a */
        public final String f55458a;

        /* renamed from: b */
        public final int f55459b;

        /* renamed from: c */
        public final int f55460c;

        /* renamed from: d */
        public final int f55461d;

        /* renamed from: e */
        public final int f55462e;

        static {
            Covode.recordClassIndex(27330);
        }

        /* renamed from: a */
        public abstract float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2);

        /* renamed from: com.bytedance.tux.widget.FlexLayout$an$a */
        public static final class C23375a {
            static {
                Covode.recordClassIndex(27331);
            }

            private C23375a() {
            }

            public /* synthetic */ C23375a(byte b) {
                this();
            }
        }

        public String toString() {
            return this.f55458a;
        }

        public AbstractC23374an(String str, int i, int i2, int i3, int i4) {
            C89219l.m154719c(str, "");
            this.f55458a = str;
            this.f55459b = i;
            this.f55460c = i2;
            this.f55461d = i3;
            this.f55462e = i4;
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ao */
    public static final class C23376ao {

        /* renamed from: b */
        public static final C23377a f55463b = new C23377a((byte) 0);

        /* renamed from: a */
        public final List<Object> f55464a;

        /* renamed from: c */
        private final String f55465c;

        static {
            Covode.recordClassIndex(27332);
        }

        /* renamed from: com.bytedance.tux.widget.FlexLayout$ao$a */
        public static final class C23377a {
            static {
                Covode.recordClassIndex(27333);
            }

            private C23377a() {
            }

            public /* synthetic */ C23377a(byte b) {
                this();
            }

            /* renamed from: a */
            public static C23376ao m44026a(Context context, String str, String str2) {
                C89219l.m154719c(context, "");
                C89219l.m154719c(str2, "");
                String str3 = null;
                if (str == null || str.length() == 0) {
                    return null;
                }
                C23380aq aqVar = new C23380aq(str, str2);
                ArrayList arrayList = new ArrayList();
                Stack stack = new Stack();
                while (true) {
                    Object a = aqVar.mo38098a(context);
                    if (a == null) {
                        while (!stack.empty()) {
                            AbstractC23374an anVar = (AbstractC23374an) stack.pop();
                            if (C89219l.m154714a(anVar, FlexLayout.f55418j)) {
                                throw new IllegalArgumentException("parentheses mismatched: " + str2 + '=' + str);
                            } else if (anVar.f55460c != 0) {
                                C89219l.m154709a((Object) anVar, "");
                                arrayList.add(anVar);
                            } else {
                                throw new IllegalArgumentException("syntax error: " + str2 + '=' + str);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        if (C23359a.m43999a((Context) null)) {
                            str3 = str2 + '=' + str;
                        }
                        return new C23376ao(arrayList, str3);
                    } else if (a instanceof Number) {
                        arrayList.add(a);
                    } else if (a instanceof C23378ap) {
                        arrayList.add(a);
                    } else if (a instanceof AbstractC23374an) {
                        AbstractC23374an anVar2 = (AbstractC23374an) a;
                        if ((anVar2.f55462e & 1) != 0) {
                            stack.push(anVar2);
                        } else if (C89219l.m154714a(anVar2, FlexLayout.f55420l)) {
                            while (!stack.empty() && (!C89219l.m154714a(stack.peek(), FlexLayout.f55418j))) {
                                Object pop = stack.pop();
                                C89219l.m154709a(pop, "");
                                arrayList.add(pop);
                            }
                            if (stack.empty()) {
                                throw new IllegalArgumentException("comma misplaced or parentheses mismatched: " + str2 + '=' + str);
                            }
                        } else if (C89219l.m154714a(anVar2, FlexLayout.f55418j)) {
                            stack.push(anVar2);
                        } else if (C89219l.m154714a(anVar2, FlexLayout.f55419k)) {
                            while (!stack.empty() && (!C89219l.m154714a(stack.peek(), FlexLayout.f55418j))) {
                                Object pop2 = stack.pop();
                                C89219l.m154709a(pop2, "");
                                arrayList.add(pop2);
                            }
                            if (!stack.empty()) {
                                stack.pop();
                                if (!stack.empty() && (((AbstractC23374an) stack.peek()).f55462e & 1) != 0) {
                                    Object pop3 = stack.pop();
                                    C89219l.m154709a(pop3, "");
                                    arrayList.add(pop3);
                                }
                            } else {
                                throw new IllegalArgumentException("parentheses mismatched: " + str2 + '=' + str);
                            }
                        } else if (anVar2.f55461d == 0) {
                            arrayList.add(anVar2);
                        } else {
                            while (!stack.empty()) {
                                AbstractC23374an anVar3 = (AbstractC23374an) stack.peek();
                                if ((anVar2.f55460c != 1 || anVar2.f55459b > anVar3.f55459b) && (anVar2.f55460c != 2 || anVar2.f55459b >= anVar3.f55459b)) {
                                    break;
                                }
                                Object pop4 = stack.pop();
                                C89219l.m154709a(pop4, "");
                                arrayList.add(pop4);
                            }
                            stack.push(anVar2);
                        }
                    } else {
                        throw new IllegalArgumentException("unknown token " + a + ", " + str2 + '=' + str);
                    }
                }
            }
        }

        public final String toString() {
            return this.f55464a.toString();
        }

        /* renamed from: a */
        private final boolean m44024a(String str) {
            if (str == null || this.f55465c == null) {
                return true;
            }
            return false;
        }

        public C23376ao(List<? extends Object> list, String str) {
            C89219l.m154719c(list, "");
            this.f55464a = list;
            this.f55465c = str;
        }

        /* renamed from: a */
        public final float mo38094a(FlexLayout flexLayout, int i, int i2, String str) {
            int i3;
            int i4;
            float f;
            float f2;
            String str2 = "";
            C89219l.m154719c(flexLayout, str2);
            float[] fArr = new float[this.f55464a.size()];
            int i5 = 0;
            for (Object obj : this.f55464a) {
                if (obj instanceof AbstractC23374an) {
                    AbstractC23374an anVar = (AbstractC23374an) obj;
                    if (i5 < anVar.f55461d) {
                        StringBuilder append = new StringBuilder("arg error ").append(obj);
                        if (!(str == null || this.f55465c == null)) {
                            str2 = " (" + str + ':' + this.f55465c + ')';
                        }
                        throw new IllegalArgumentException(append.append(str2).toString());
                    }
                    float f3 = Float.NaN;
                    if (anVar.f55461d == 0) {
                        i4 = i5;
                        f = Float.NaN;
                    } else if (anVar.f55461d == 1) {
                        i4 = i5 - 1;
                        f = fArr[i4];
                    } else if (anVar.f55461d == 2) {
                        int i6 = i5 - 1;
                        f2 = fArr[i6];
                        i4 = i6 - 1;
                        f = fArr[i4];
                        i5 = i4 + 1;
                        fArr[i4] = anVar.mo38085a(flexLayout, i, i2, f, f2);
                    } else if (C89219l.m154714a(obj, FlexLayout.f55421m)) {
                        int i7 = i5 - 1;
                        float f4 = fArr[i7];
                        int i8 = i7 - 1;
                        float f5 = fArr[i8];
                        int i9 = i8 - 1;
                        float f6 = fArr[i9];
                        if (f6 == f6) {
                            if (f6 != 0.0f) {
                                f3 = f5;
                            } else {
                                f3 = f4;
                            }
                        }
                        i5 = i9 + 1;
                        fArr[i9] = f3;
                    } else {
                        StringBuilder sb = new StringBuilder("argc>2 not supported");
                        if (!m44024a(str)) {
                            str2 = " (" + str + ':' + this.f55465c + ')';
                        }
                        throw new IllegalArgumentException(sb.append(str2).toString());
                    }
                    f2 = Float.NaN;
                    i5 = i4 + 1;
                    fArr[i4] = anVar.mo38085a(flexLayout, i, i2, f, f2);
                } else {
                    if (obj instanceof Float) {
                        i3 = i5 + 1;
                        fArr[i5] = ((Number) obj).floatValue();
                    } else if (obj instanceof C23378ap) {
                        i3 = i5 + 1;
                        fArr[i5] = ((C23378ap) obj).mo38096a(flexLayout, i, (str == null || this.f55465c == null) ? null : str + ':' + this.f55465c);
                    } else {
                        StringBuilder append2 = new StringBuilder("unknown token ").append(obj);
                        if (!m44024a(str)) {
                            str2 = " (" + str + ':' + this.f55465c + ')';
                        }
                        throw new IllegalArgumentException(append2.append(str2).toString());
                    }
                    i5 = i3;
                }
            }
            if (i5 == 1) {
                return fArr[0];
            }
            StringBuilder sb2 = new StringBuilder("syntax error");
            if (!m44024a(str)) {
                str2 = " (" + str + ':' + this.f55465c + ')';
            }
            throw new IllegalArgumentException(sb2.append(str2).toString());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ap */
    public static final class C23378ap {

        /* renamed from: b */
        public static final C23379a f55466b = new C23379a((byte) 0);

        /* renamed from: a */
        public final int f55467a;

        /* renamed from: c */
        private final int f55468c;

        static {
            Covode.recordClassIndex(27334);
        }

        /* renamed from: com.bytedance.tux.widget.FlexLayout$ap$a */
        public static final class C23379a {
            static {
                Covode.recordClassIndex(27335);
            }

            private C23379a() {
            }

            public /* synthetic */ C23379a(byte b) {
                this();
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            int i = this.f55467a;
            if (i == 0) {
                sb.append("this");
            } else if (i == 1) {
                sb.append("prev");
            } else if (i == 2) {
                sb.append("next");
            } else if (i == 3) {
                sb.append("parent");
            } else if (i != 4) {
                sb.append("?");
            } else {
                sb.append("screen");
            }
            sb.append(".");
            int i2 = this.f55468c;
            if (i2 == 10) {
                sb.append("visible");
            } else if (i2 != 15) {
                switch (i2) {
                    case 0:
                        sb.append("left");
                        break;
                    case 1:
                        sb.append("top");
                        break;
                    case 2:
                        sb.append("right");
                        break;
                    case 3:
                        sb.append("bottom");
                        break;
                    case 4:
                        sb.append("centerX");
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        sb.append("centerY");
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        sb.append("width");
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        sb.append("height");
                        break;
                    default:
                        sb.append("?");
                        break;
                }
            } else {
                sb.append("tag");
            }
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            return sb2;
        }

        public C23378ap(int i, int i2) {
            this.f55467a = i;
            this.f55468c = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (r2 == 5) goto L_0x0065;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final float mo38096a(com.bytedance.tux.widget.FlexLayout r18, int r19, java.lang.String r20) {
            /*
            // Method dump skipped, instructions count: 804
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.FlexLayout.C23378ap.mo38096a(com.bytedance.tux.widget.FlexLayout, int, java.lang.String):float");
        }
    }

    public FlexLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$a */
    public static final class C23359a {
        static {
            Covode.recordClassIndex(27315);
        }

        private C23359a() {
        }

        public /* synthetic */ C23359a(byte b) {
            this();
        }

        /* renamed from: a */
        private static boolean m44000a(C23376ao aoVar) {
            if (aoVar == null) {
                return true;
            }
            for (Object obj : aoVar.f55464a) {
                if ((obj instanceof C23378ap) && ((C23378ap) obj).f55467a != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        public static int m43997a(String str) {
            Integer num;
            C89219l.m154719c(str, "");
            Map<String, Integer> map = FlexLayout.f55410b;
            if (map != null && (num = map.get(str)) != null) {
                return num.intValue();
            }
            int i = FlexLayout.f55411c;
            FlexLayout.f55411c = i + 1;
            Map<String, Integer> map2 = FlexLayout.f55410b;
            if (map2 != null) {
                map2.put(str, Integer.valueOf(i));
            }
            return i;
        }

        /* renamed from: a */
        public static String m43998a(int i) {
            Set<Map.Entry<String, Integer>> entrySet;
            T t;
            Map<String, Integer> map = FlexLayout.f55410b;
            if (!(map == null || (entrySet = map.entrySet()) == null)) {
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((Number) t.getValue()).intValue() == i) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    return (String) t2.getKey();
                }
            }
            return null;
        }

        /* renamed from: a */
        public static boolean m43999a(Context context) {
            boolean z;
            if (FlexLayout.f55409a == null && context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                FlexLayout.f55409a = Boolean.valueOf(z);
            }
            return C89219l.m154714a((Object) FlexLayout.f55409a, (Object) true);
        }

        /* renamed from: a */
        public static boolean m44001a(FlexLayout flexLayout, View view, C23372am amVar, int i, int i2) {
            int childMeasureSpec;
            int childMeasureSpec2;
            C89219l.m154719c(flexLayout, "");
            C89219l.m154719c(view, "");
            C89219l.m154719c(amVar, "");
            if (i == -5) {
                float e = amVar.mo38090e();
                if (e == e) {
                    i = Math.round(e);
                } else if (!m44000a(amVar.f55443g) || !m44000a(amVar.f55437a) || !m44000a(amVar.f55438b) || !m44000a(amVar.f55441e)) {
                    return false;
                } else {
                    i = -2;
                }
            }
            if (i2 == -5) {
                float f = amVar.mo38091f();
                if (f == f) {
                    i2 = Math.round(f);
                } else if (!m44000a(amVar.f55444h) || !m44000a(amVar.f55439c) || !m44000a(amVar.f55440d) || !m44000a(amVar.f55442f)) {
                    return false;
                } else {
                    i2 = -2;
                }
            }
            if (flexLayout.getMyWidth() == -1) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(flexLayout.getMyWidthMeasureSpec(), flexLayout.getPaddingLeft() + flexLayout.getPaddingRight(), i);
            } else {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(flexLayout.getMyWidth(), 1073741824), 0, i);
            }
            if (flexLayout.getMyHeight() == -1) {
                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(flexLayout.getMyHeightMeasureSpec(), flexLayout.getPaddingTop() + flexLayout.getPaddingBottom(), i2);
            } else {
                childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(flexLayout.getMyHeight(), 1073741824), 0, i2);
            }
            view.measure(childMeasureSpec, childMeasureSpec2);
            amVar.f55453q = view.getMeasuredWidth();
            amVar.f55454r = view.getMeasuredHeight();
            return true;
        }
    }

    public final int getMyHeight() {
        return this.f55434t;
    }

    public final int getMyHeightMeasureSpec() {
        return this.f55432r;
    }

    public final int getMyWidth() {
        return this.f55433s;
    }

    public final int getMyWidthMeasureSpec() {
        return this.f55431q;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C23372am(-2);
    }

    static {
        Covode.recordClassIndex(27314);
        C23402w wVar = new C23402w("*");
        f55425u = wVar;
        C23391l lVar = new C23391l("/");
        f55426v = lVar;
        C23404y yVar = new C23404y("%");
        f55427w = yVar;
        C23381b bVar = new C23381b("+");
        f55428x = bVar;
        C23405z zVar = new C23405z("-");
        f55429y = zVar;
        C23403x xVar = new C23403x("!");
        f55430z = xVar;
        C23388i iVar = new C23388i("<");
        f55389A = iVar;
        C23389j jVar = new C23389j("<=");
        f55412d = jVar;
        C23386g gVar = new C23386g(">");
        f55390B = gVar;
        C23387h hVar = new C23387h(">=");
        f55413e = hVar;
        C23385f fVar = new C23385f("==");
        f55414f = fVar;
        C23390k kVar = new C23390k("!=");
        f55415g = kVar;
        C23400u uVar = new C23400u("&&");
        f55416h = uVar;
        C23401v vVar = new C23401v("||");
        f55417i = vVar;
        C23382c cVar = new C23382c("(");
        f55418j = cVar;
        C23383d dVar = new C23383d(")");
        f55419k = dVar;
        C23384e eVar = new C23384e(",");
        f55420l = eVar;
        C23366ag agVar = new C23366ag("sp");
        f55391C = agVar;
        C23361ab abVar = new C23361ab("dp");
        f55392D = abVar;
        C23360aa aaVar = new C23360aa("dip");
        f55393E = aaVar;
        C23365af afVar = new C23365af("px");
        f55394F = afVar;
        C23364ae aeVar = new C23364ae("pt");
        f55395G = aeVar;
        C23363ad adVar = new C23363ad("mm");
        f55396H = adVar;
        C23362ac acVar = new C23362ac("in");
        f55397I = acVar;
        C23395p pVar = new C23395p("max");
        f55398J = pVar;
        C23396q qVar = new C23396q("min");
        f55399K = qVar;
        C23399t tVar = new C23399t("round");
        f55400L = tVar;
        C23393n nVar = new C23393n("ceil");
        f55401M = nVar;
        C23394o oVar = new C23394o("floor");
        f55402N = oVar;
        C23392m mVar = new C23392m("abs");
        f55403O = mVar;
        C23397r rVar = new C23397r("mod");
        f55404P = rVar;
        C23398s sVar = new C23398s("pow");
        f55405Q = sVar;
        C23367ah ahVar = new C23367ah("?");
        f55406R = ahVar;
        C23368ai aiVar = new C23368ai(":");
        f55421m = aiVar;
        C23370ak akVar = new C23370ak("match_parent");
        f55422n = akVar;
        C23369aj ajVar = new C23369aj("fill_parent");
        f55407S = ajVar;
        C23371al alVar = new C23371al("wrap_content");
        f55408T = alVar;
        f55423o = C89070n.m154522b(bVar, zVar, lVar, wVar, yVar, xVar, iVar, jVar, gVar, hVar, fVar, kVar, uVar, vVar, cVar, dVar, eVar, agVar, abVar, aaVar, afVar, aeVar, adVar, acVar, pVar, qVar, tVar, nVar, oVar, mVar, rVar, sVar, ahVar, aiVar, akVar, ajVar, alVar);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C23372am;
    }

    public final void setMyHeight(int i) {
        this.f55434t = i;
    }

    public final void setMyHeightMeasureSpec(int i) {
        this.f55432r = i;
    }

    public final void setMyWidth(int i) {
        this.f55433s = i;
    }

    public final void setMyWidthMeasureSpec(int i) {
        this.f55431q = i;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C23372am(layoutParams);
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$aa */
    public static final class C23360aa extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27316);
        }

        C23360aa(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ab */
    public static final class C23361ab extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27317);
        }

        C23361ab(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ac */
    public static final class C23362ac extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27318);
        }

        C23362ac(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            return TypedValue.applyDimension(4, f, resources.getDisplayMetrics());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ad */
    public static final class C23363ad extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27319);
        }

        C23363ad(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            return TypedValue.applyDimension(5, f, resources.getDisplayMetrics());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ae */
    public static final class C23364ae extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27320);
        }

        C23364ae(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            return TypedValue.applyDimension(3, f, resources.getDisplayMetrics());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$af */
    public static final class C23365af extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27321);
        }

        C23365af(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            return TypedValue.applyDimension(0, f, resources.getDisplayMetrics());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ag */
    public static final class C23366ag extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27322);
        }

        C23366ag(String str) {
            super(str, 10, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            Resources resources = flexLayout.getResources();
            C89219l.m154709a((Object) resources, "");
            return TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ah */
    public static final class C23367ah extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27323);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return f;
        }

        C23367ah(String str) {
            super(str, 2, 2, 1, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ai */
    public static final class C23368ai extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27324);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return Float.NaN;
        }

        C23368ai(String str) {
            super(str, 1, 1, 3, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$aj */
    public static final class C23369aj extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27325);
        }

        C23369aj(String str) {
            super(str, 0, 0, 0, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return FlexLayout.f55422n.mo38085a(flexLayout, i, i2, f, f2);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$ak */
    public static final class C23370ak extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27326);
        }

        C23370ak(String str) {
            super(str, 0, 0, 0, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            int myHeight;
            C89219l.m154719c(flexLayout, "");
            if (i2 == 0) {
                if (flexLayout.getMyWidth() == -1) {
                    return Float.NaN;
                }
                myHeight = flexLayout.getMyWidth();
            } else if (flexLayout.getMyHeight() == -1) {
                return Float.NaN;
            } else {
                myHeight = flexLayout.getMyHeight();
            }
            return (float) myHeight;
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$al */
    public static final class C23371al extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27327);
        }

        C23371al(String str) {
            super(str, 0, 0, 0, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            int i3;
            C89219l.m154719c(flexLayout, "");
            View childAt = flexLayout.getChildAt(i);
            C89219l.m154709a((Object) childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                C23372am amVar = (C23372am) layoutParams;
                if (i2 == 0) {
                    if (amVar.f55453q == -1) {
                        C23359a.m44001a(flexLayout, childAt, amVar, -2, amVar.height);
                        amVar.f55454r = -1;
                    }
                    if (amVar.f55453q == -1) {
                        return Float.NaN;
                    }
                    i3 = amVar.f55453q;
                } else {
                    if (amVar.f55454r == -1) {
                        C23359a.m44001a(flexLayout, childAt, amVar, amVar.width, -2);
                        amVar.f55453q = -1;
                    }
                    if (amVar.f55454r == -1) {
                        return Float.NaN;
                    }
                    i3 = amVar.f55454r;
                }
                return (float) i3;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$b */
    public static final class C23381b extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27337);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return f + f2;
        }

        C23381b(String str) {
            super(str, 7, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$c */
    public static final class C23382c extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27338);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return Float.NaN;
        }

        C23382c(String str) {
            super(str, 0, 0, 0, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$d */
    public static final class C23383d extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27339);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return Float.NaN;
        }

        C23383d(String str) {
            super(str, 0, 0, 0, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$e */
    public static final class C23384e extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27340);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return Float.NaN;
        }

        C23384e(String str) {
            super(str, 0, 1, 0, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$f */
    public static final class C23385f extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27341);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return f == f2 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        C23385f(String str) {
            super(str, 5, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$g */
    public static final class C23386g extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27342);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return f > f2 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        C23386g(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$h */
    public static final class C23387h extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27343);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return f >= f2 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        C23387h(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$i */
    public static final class C23388i extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27344);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return f < f2 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        C23388i(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$j */
    public static final class C23389j extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27345);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return f <= f2 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        C23389j(String str) {
            super(str, 6, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$k */
    public static final class C23390k extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27346);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return f != f2 ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        C23390k(String str) {
            super(str, 5, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$l */
    public static final class C23391l extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27347);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return f / f2;
        }

        C23391l(String str) {
            super(str, 8, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$m */
    public static final class C23392m extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27348);
        }

        C23392m(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return Math.abs(f);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$n */
    public static final class C23393n extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27349);
        }

        C23393n(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return (float) Math.ceil((double) f);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$o */
    public static final class C23394o extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27350);
        }

        C23394o(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return (float) Math.floor((double) f);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$p */
    public static final class C23395p extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27351);
        }

        C23395p(String str) {
            super(str, 0, 0, 2, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return Math.max(f, f2);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$q */
    public static final class C23396q extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27352);
        }

        C23396q(String str) {
            super(str, 0, 0, 2, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return Math.min(f, f2);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$r */
    public static final class C23397r extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27353);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return f % f2;
        }

        C23397r(String str) {
            super(str, 0, 0, 2, 1);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$s */
    public static final class C23398s extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27354);
        }

        C23398s(String str) {
            super(str, 0, 0, 2, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return (float) Math.pow((double) f, (double) f2);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$t */
    public static final class C23399t extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27355);
        }

        C23399t(String str) {
            super(str, 0, 0, 1, 1);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return (float) Math.rint((double) f);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$u */
    public static final class C23400u extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27356);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return (f == 0.0f || f2 == 0.0f) ? 0.0f : 1.0f;
            }
            return Float.NaN;
        }

        C23400u(String str) {
            super(str, 4, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$v */
    public static final class C23401v extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27357);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f && f2 == f2) {
                return (f == 0.0f && f2 == 0.0f) ? 0.0f : 1.0f;
            }
            return Float.NaN;
        }

        C23401v(String str) {
            super(str, 3, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$w */
    public static final class C23402w extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27358);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return f * f2;
        }

        C23402w(String str) {
            super(str, 8, 1, 2, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$x */
    public static final class C23403x extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27359);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            if (f == f) {
                return f == 0.0f ? 1.0f : 0.0f;
            }
            return Float.NaN;
        }

        C23403x(String str) {
            super(str, 9, 2, 1, 0);
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$y */
    public static final class C23404y extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27360);
        }

        C23404y(String str) {
            super(str, 8, 2, 1, 0);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            int i3;
            C89219l.m154719c(flexLayout, "");
            if (i2 == 0) {
                if (flexLayout.getMyWidth() == -1) {
                    return Float.NaN;
                }
                i3 = flexLayout.getMyWidth();
            } else if (flexLayout.getMyHeight() == -1) {
                return Float.NaN;
            } else {
                i3 = flexLayout.getMyHeight();
            }
            return ((float) i3) * f * 0.01f;
        }
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$z */
    public static final class C23405z extends AbstractC23374an {
        static {
            Covode.recordClassIndex(27361);
        }

        @Override // com.bytedance.tux.widget.FlexLayout.AbstractC23374an
        /* renamed from: a */
        public final float mo38085a(FlexLayout flexLayout, int i, int i2, float f, float f2) {
            C89219l.m154719c(flexLayout, "");
            return f - f2;
        }

        C23405z(String str) {
            super(str, 7, 1, 2, 0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C89219l.m154719c(attributeSet, "");
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        return new C23372am(context, attributeSet);
    }

    /* renamed from: com.bytedance.tux.widget.FlexLayout$aq */
    public static final class C23380aq {

        /* renamed from: a */
        public final String f55469a;

        /* renamed from: b */
        private final char[] f55470b;

        /* renamed from: c */
        private final int f55471c;

        /* renamed from: d */
        private int f55472d;

        /* renamed from: e */
        private final String f55473e;

        static {
            Covode.recordClassIndex(27336);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b1, code lost:
            return java.lang.Float.valueOf(m44029b(r17, r9, r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x01bb, code lost:
            return m44028a(r17, r8, r2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo38098a(android.content.Context r17) {
            /*
            // Method dump skipped, instructions count: 498
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.FlexLayout.C23380aq.mo38098a(android.content.Context):java.lang.Object");
        }

        public C23380aq(String str, String str2) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            this.f55473e = str;
            this.f55469a = str2;
            if (str != null) {
                char[] charArray = str.toCharArray();
                C89219l.m154709a((Object) charArray, "");
                this.f55470b = charArray;
                this.f55471c = str.length();
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        /* renamed from: b */
        private final float m44029b(Context context, StringBuilder sb, int i) {
            String str;
            if (i != -1) {
                String substring = sb.substring(1, i);
                String substring2 = sb.substring(i + 1);
                if (substring != null) {
                    int hashCode = substring.hashCode();
                    if (hashCode != -1750660506) {
                        if (hashCode == 95588145 && substring.equals("dimen")) {
                            str = context.getPackageName();
                        }
                    } else if (substring.equals("android:dimen")) {
                        str = "android";
                    }
                    int identifier = context.getResources().getIdentifier(substring2, "dimen", str);
                    if (identifier != 0) {
                        return context.getResources().getDimension(identifier);
                    }
                    if (FlexLayout.f55410b != null) {
                        throw new IllegalStateException(((Object) sb) + " is not supported in AndroidStudio Preview, " + this.f55469a + '=' + this.f55473e);
                    }
                    throw new IllegalArgumentException("unknown identifier " + ((Object) sb) + ", " + this.f55469a + '=' + this.f55473e);
                }
                throw new IllegalArgumentException("unknown identifier " + ((Object) sb) + ", " + this.f55469a + '=' + this.f55473e);
            }
            throw new IllegalArgumentException("unknown token " + ((Object) sb) + ", " + this.f55469a + '=' + this.f55473e);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
            if (r7.equals("left") != false) goto L_0x012d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.Object m44028a(android.content.Context r12, java.lang.StringBuilder r13, int r14) {
            /*
            // Method dump skipped, instructions count: 494
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.widget.FlexLayout.C23380aq.m44028a(android.content.Context, java.lang.StringBuilder, int):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        MethodCollector.m26663i(11614);
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f55431q = i;
        this.f55432r = i2;
        int i11 = -1;
        if (mode == Integer.MIN_VALUE) {
            i3 = (size - paddingLeft) - paddingRight;
            this.f55433s = -1;
        } else if (mode != 1073741824) {
            this.f55433s = -1;
            i3 = -1;
        } else {
            i3 = (size - paddingLeft) - paddingRight;
            this.f55433s = i3;
        }
        if (mode2 == Integer.MIN_VALUE) {
            i4 = (size2 - paddingTop) - paddingBottom;
            this.f55434t = -1;
        } else if (mode2 != 1073741824) {
            this.f55434t = -1;
            i4 = -1;
        } else {
            i4 = (size2 - paddingTop) - paddingBottom;
            this.f55434t = i4;
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            C89219l.m154709a((Object) childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                C23372am amVar = (C23372am) layoutParams;
                amVar.f55445i = Float.NaN;
                amVar.f55446j = Float.NaN;
                amVar.f55447k = Float.NaN;
                amVar.f55448l = Float.NaN;
                amVar.f55449m = Float.NaN;
                amVar.f55450n = Float.NaN;
                amVar.f55451o = Float.NaN;
                amVar.f55452p = Float.NaN;
                amVar.f55453q = i11;
                amVar.f55454r = i11;
                if (childAt.getVisibility() == 8) {
                    amVar.f55451o = 0.0f;
                    amVar.f55452p = 0.0f;
                }
                if (amVar.f55437a == null) {
                    if (amVar.f55438b != null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (amVar.f55441e != null) {
                        i10++;
                    }
                    if (!(amVar.f55443g == null && amVar.width == -5)) {
                        i10++;
                    }
                    if (i10 < 2) {
                        amVar.f55445i = 0.0f;
                    }
                }
                if (amVar.f55439c == null) {
                    if (amVar.f55440d != null) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    if (amVar.f55442f != null) {
                        i9++;
                    }
                    if (!(amVar.f55444h == null && amVar.height == -5)) {
                        i9++;
                    }
                    if (i9 < 2) {
                        amVar.f55447k = 0.0f;
                    }
                }
                i12++;
                i11 = -1;
            } else {
                C89388w wVar = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(11614);
                throw wVar;
            }
        }
        if (childCount == 0) {
            z = true;
        } else {
            z = false;
        }
        int i13 = childCount * 4;
        int i14 = 0;
        while (true) {
            if (i14 < i13) {
                int i15 = -1;
                int i16 = 0;
                int i17 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt2 = getChildAt(i18);
                    C89219l.m154709a((Object) childAt2, "");
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    if (layoutParams2 != null) {
                        C23372am amVar2 = (C23372am) layoutParams2;
                        C23376ao aoVar = amVar2.f55437a;
                        if (!(aoVar == null || amVar2.f55445i == amVar2.f55445i)) {
                            float a = aoVar.mo38094a(this, i18, 0, amVar2.f55456t);
                            if (a == a) {
                                amVar2.f55445i = a;
                                i17++;
                            }
                        }
                        C23376ao aoVar2 = amVar2.f55438b;
                        if (!(aoVar2 == null || amVar2.f55446j == amVar2.f55446j)) {
                            float a2 = aoVar2.mo38094a(this, i18, 0, amVar2.f55456t);
                            if (a2 == a2) {
                                amVar2.f55446j = a2;
                                i17++;
                            }
                        }
                        C23376ao aoVar3 = amVar2.f55439c;
                        if (!(aoVar3 == null || amVar2.f55447k == amVar2.f55447k)) {
                            float a3 = aoVar3.mo38094a(this, i18, 1, amVar2.f55456t);
                            if (a3 == a3) {
                                amVar2.f55447k = a3;
                                i17++;
                            }
                        }
                        C23376ao aoVar4 = amVar2.f55440d;
                        if (!(aoVar4 == null || amVar2.f55448l == amVar2.f55448l)) {
                            float a4 = aoVar4.mo38094a(this, i18, 1, amVar2.f55456t);
                            if (a4 == a4) {
                                amVar2.f55448l = a4;
                                i17++;
                            }
                        }
                        C23376ao aoVar5 = amVar2.f55441e;
                        if (!(aoVar5 == null || amVar2.f55449m == amVar2.f55449m)) {
                            float a5 = aoVar5.mo38094a(this, i18, 0, amVar2.f55456t);
                            if (a5 == a5) {
                                amVar2.f55449m = a5;
                                i17++;
                            }
                        }
                        C23376ao aoVar6 = amVar2.f55442f;
                        if (!(aoVar6 == null || amVar2.f55450n == amVar2.f55450n)) {
                            float a6 = aoVar6.mo38094a(this, i18, 1, amVar2.f55456t);
                            if (a6 == a6) {
                                amVar2.f55450n = a6;
                                i17++;
                            }
                        }
                        if (amVar2.f55451o != amVar2.f55451o) {
                            C23376ao aoVar7 = amVar2.f55443g;
                            if (aoVar7 != null) {
                                float a7 = aoVar7.mo38094a(this, i18, 0, amVar2.f55456t);
                                if (a7 == a7) {
                                    amVar2.f55451o = a7;
                                }
                            } else if (amVar2.width != -5) {
                                if (amVar2.width == -1 && (i8 = this.f55433s) != -1) {
                                    amVar2.f55451o = (float) i8;
                                } else if (amVar2.width >= 0) {
                                    amVar2.f55451o = (float) amVar2.width;
                                } else {
                                    if (amVar2.f55453q == -1 && C23359a.m44001a(this, childAt2, amVar2, amVar2.width, amVar2.height)) {
                                        i17++;
                                    }
                                    if (amVar2.f55453q != -1 && amVar2.width == -2) {
                                        amVar2.f55451o = (float) amVar2.f55453q;
                                    }
                                }
                            }
                            i17++;
                        }
                        if (amVar2.f55452p != amVar2.f55452p) {
                            C23376ao aoVar8 = amVar2.f55444h;
                            if (aoVar8 != null) {
                                float a8 = aoVar8.mo38094a(this, i18, 1, amVar2.f55456t);
                                if (a8 == a8) {
                                    amVar2.f55452p = a8;
                                }
                            } else if (amVar2.height != -5) {
                                if (amVar2.height == -1 && (i7 = this.f55434t) != -1) {
                                    amVar2.f55452p = (float) i7;
                                } else if (amVar2.height >= 0) {
                                    amVar2.f55452p = (float) amVar2.height;
                                } else {
                                    if (amVar2.f55454r == -1 && C23359a.m44001a(this, childAt2, amVar2, amVar2.width, amVar2.height)) {
                                        i17++;
                                    }
                                    if (amVar2.f55454r != -1 && amVar2.height == -2) {
                                        amVar2.f55452p = (float) amVar2.f55454r;
                                    }
                                }
                            }
                            i17++;
                        }
                        if (amVar2.mo38092g()) {
                            i16++;
                        } else if (i15 == -1) {
                            i15 = i18;
                        }
                    } else {
                        C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(11614);
                        throw wVar2;
                    }
                }
                if (i16 == childCount) {
                    i6 = -1;
                    if (!(this.f55433s == -1 || this.f55434t == -1)) {
                        break;
                    }
                } else {
                    i6 = -1;
                }
                if (i17 == 0) {
                    if (this.f55433s == i6 || this.f55434t == i6) {
                        int i19 = 0;
                        int i20 = 0;
                        for (int i21 = 0; i21 < childCount; i21++) {
                            View childAt3 = getChildAt(i21);
                            C89219l.m154709a((Object) childAt3, "");
                            ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                            if (layoutParams3 != null) {
                                C23372am amVar3 = (C23372am) layoutParams3;
                                float b = amVar3.mo38087b();
                                if (b == b) {
                                    i19 = Math.max(i19, Math.round(b));
                                } else if (amVar3.f55453q != -1) {
                                    float a9 = amVar3.mo38086a();
                                    if (a9 == a9) {
                                        i19 = Math.max(i19, Math.round(a9 + ((float) amVar3.f55453q)));
                                    } else {
                                        i19 = Math.max(i19, amVar3.f55453q);
                                    }
                                }
                                float d = amVar3.mo38089d();
                                if (d == d) {
                                    i20 = Math.max(i20, Math.round(d));
                                } else if (amVar3.f55454r != -1) {
                                    float c = amVar3.mo38088c();
                                    if (c == c) {
                                        i20 = Math.max(i20, Math.round(c + ((float) amVar3.f55454r)));
                                    } else {
                                        i20 = Math.max(i20, amVar3.f55454r);
                                    }
                                }
                                amVar3.f55453q = -1;
                                amVar3.f55454r = -1;
                            } else {
                                C89388w wVar3 = new C89388w("null cannot be cast to non-null type");
                                MethodCollector.m26664o(11614);
                                throw wVar3;
                            }
                        }
                        if (this.f55433s == -1) {
                            if (i3 != -1) {
                                i19 = Math.min(i19, i3);
                            }
                            this.f55433s = i19;
                        }
                        if (this.f55434t == -1) {
                            if (i4 != -1) {
                                i20 = Math.min(i20, i4);
                            }
                            this.f55434t = i20;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("incomplete layout, circular dependency? (index=" + i15 + ')');
                        MethodCollector.m26664o(11614);
                        throw illegalStateException;
                    }
                }
                i14++;
            } else if (!z) {
                StringBuilder sb = new StringBuilder();
                for (int i22 = 0; i22 < childCount; i22++) {
                    View childAt4 = getChildAt(i22);
                    C89219l.m154709a((Object) childAt4, "");
                    ViewGroup.LayoutParams layoutParams4 = childAt4.getLayoutParams();
                    if (layoutParams4 != null) {
                        if (!((C23372am) layoutParams4).mo38092g()) {
                            if (sb.length() > 0) {
                                sb.append(',');
                            }
                            sb.append(i22);
                        }
                    } else {
                        C89388w wVar4 = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(11614);
                        throw wVar4;
                    }
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("incomplete layout, circular dependency? (index=" + ((Object) sb) + ')');
                MethodCollector.m26664o(11614);
                throw illegalStateException2;
            }
        }
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt5 = getChildAt(i23);
            C89219l.m154709a((Object) childAt5, "");
            ViewGroup.LayoutParams layoutParams5 = childAt5.getLayoutParams();
            if (layoutParams5 != null) {
                C23372am amVar4 = (C23372am) layoutParams5;
                if (amVar4.f55443g != null && amVar4.f55451o == amVar4.f55451o) {
                    i5 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.f55451o), 1073741824);
                } else if (amVar4.width == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f55433s, Integer.MIN_VALUE);
                    i5 = 1073741824;
                } else if (amVar4.width == -1) {
                    i5 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f55433s, 1073741824);
                } else {
                    i5 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.mo38090e()), 1073741824);
                }
                if (amVar4.f55444h != null && amVar4.f55452p == amVar4.f55452p) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.f55452p), i5);
                } else if (amVar4.height == -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f55434t, Integer.MIN_VALUE);
                } else if (amVar4.height == -1) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f55434t, 1073741824);
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.round(amVar4.mo38091f()), 1073741824);
                }
                childAt5.measure(makeMeasureSpec, makeMeasureSpec2);
            } else {
                C89388w wVar5 = new C89388w("null cannot be cast to non-null type");
                MethodCollector.m26664o(11614);
                throw wVar5;
            }
        }
        setMeasuredDimension(this.f55433s + paddingLeft + paddingRight, this.f55434t + paddingTop + paddingBottom);
        MethodCollector.m26664o(11614);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlexLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FlexLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(11761);
        if (isInEditMode()) {
            f55409a = true;
            if (f55410b == null) {
                f55410b = new LinkedHashMap();
            }
        }
        MethodCollector.m26664o(11761);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C89219l.m154709a((Object) childAt, "");
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    C23372am amVar = (C23372am) layoutParams;
                    int i6 = Build.VERSION.SDK_INT;
                    if (getLayoutDirection() == 1) {
                        int i7 = (i3 - i) - paddingLeft;
                        childAt.layout(i7 - Math.round(amVar.mo38087b()), Math.round(amVar.mo38088c()) + paddingTop, i7 - Math.round(amVar.mo38086a()), Math.round(amVar.mo38089d()) + paddingTop);
                    } else {
                        childAt.layout(Math.round(amVar.mo38086a()) + paddingLeft, Math.round(amVar.mo38088c()) + paddingTop, Math.round(amVar.mo38087b()) + paddingLeft, Math.round(amVar.mo38089d()) + paddingTop);
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }
}

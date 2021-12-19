package com.bytedance.tux.p1722h;

import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Pair;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.h.b */
public final class C23152b {

    /* renamed from: b */
    public static final C23153a f54801b = new C23153a((byte) 0);

    /* renamed from: k */
    private static final ConcurrentHashMap<String, Method> f54802k = new ConcurrentHashMap<>();

    /* renamed from: a */
    public boolean f54803a;

    /* renamed from: c */
    private boolean f54804c;

    /* renamed from: d */
    private int f54805d = -1;

    /* renamed from: e */
    private int f54806e = -1;

    /* renamed from: f */
    private final int f54807f = 1;

    /* renamed from: g */
    private final RectF f54808g = new RectF();

    /* renamed from: h */
    private int[] f54809h = new int[0];

    /* renamed from: i */
    private TextPaint f54810i;

    /* renamed from: j */
    private final TextView f54811j;

    /* renamed from: a */
    private static Object m43631a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_tux_tools_TuxAutoSizeHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_tux_tools_TuxAutoSizeHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: com.bytedance.tux.h.b$a */
    public static final class C23153a {
        static {
            Covode.recordClassIndex(27082);
        }

        private C23153a() {
        }

        public /* synthetic */ C23153a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo37650a(int i, int i2) {
        m43635b(i, i2);
        if (m43636c()) {
            mo37651b();
        }
    }

    /* renamed from: a */
    private final boolean m43634a(int i, RectF rectF) {
        StaticLayout a;
        CharSequence transformation;
        CharSequence text = this.f54811j.getText();
        TransformationMethod transformationMethod = this.f54811j.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f54811j)) == null)) {
            text = transformation;
        }
        int maxLines = this.f54811j.getMaxLines();
        TextPaint textPaint = this.f54810i;
        if (textPaint == null) {
            textPaint = new TextPaint();
        }
        textPaint.reset();
        textPaint.set(this.f54811j.getPaint());
        textPaint.setTextSize((float) i);
        this.f54810i = textPaint;
        Layout.Alignment alignment = (Layout.Alignment) m43630a(this.f54811j, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            C89219l.m154709a((Object) text, "");
            a = m43629a(text, alignment, C89241a.m154730a(rectF.right), maxLines);
        } else {
            C89219l.m154709a((Object) text, "");
            a = m43628a(text, alignment, C89241a.m154730a(rectF.right));
        }
        if (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo37649a() {
        this.f54805d = -1;
        this.f54806e = -1;
        this.f54809h = new int[0];
        this.f54804c = false;
    }

    static {
        Covode.recordClassIndex(27081);
    }

    /* renamed from: c */
    private final boolean m43636c() {
        int i = this.f54805d;
        int i2 = 1;
        while (true) {
            int i3 = this.f54807f;
            if (i + i3 > this.f54806e) {
                break;
            }
            i2++;
            i += i3;
        }
        int[] iArr = new int[i2];
        int i4 = this.f54805d;
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = i4;
            i4 += this.f54807f;
        }
        this.f54809h = iArr;
        this.f54804c = true;
        return true;
    }

    /* renamed from: b */
    public final void mo37651b() {
        int measuredWidth;
        MethodCollector.m26663i(7182);
        if (this.f54804c) {
            if (this.f54811j.getMeasuredHeight() <= 0 || this.f54811j.getMeasuredWidth() <= 0) {
                MethodCollector.m26664o(7182);
                return;
            }
            if (((Boolean) m43630a((Object) this.f54811j, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                measuredWidth = 1048576;
            } else {
                measuredWidth = (this.f54811j.getMeasuredWidth() - this.f54811j.getTotalPaddingLeft()) - this.f54811j.getTotalPaddingRight();
            }
            if (!this.f54803a || this.f54811j.getMinWidth() == this.f54811j.getMeasuredWidth()) {
                int height = (this.f54811j.getHeight() - this.f54811j.getCompoundPaddingBottom()) - this.f54811j.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    MethodCollector.m26664o(7182);
                    return;
                }
                synchronized (this.f54808g) {
                    try {
                        this.f54808g.setEmpty();
                        this.f54808g.right = (float) measuredWidth;
                        this.f54808g.bottom = (float) height;
                        float a = (float) m43627a(this.f54808g);
                        if (a != this.f54811j.getTextSize()) {
                            m43633a(a);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(7182);
                        throw th;
                    }
                }
            } else {
                MethodCollector.m26664o(7182);
                return;
            }
        }
        this.f54804c = true;
        MethodCollector.m26664o(7182);
    }

    public C23152b(TextView textView) {
        C89219l.m154719c(textView, "");
        this.f54811j = textView;
    }

    /* renamed from: a */
    private final int m43627a(RectF rectF) {
        int length = this.f54809h.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m43634a(this.f54809h[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f54809h[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.".toString());
    }

    /* renamed from: a */
    private static Method m43632a(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f54802k;
            Method method = concurrentHashMap.get(str);
            if (method != null) {
                return method;
            }
            Method declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0]);
            if (declaredMethod == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final void m43633a(float f) {
        TextPaint paint = this.f54811j.getPaint();
        C89219l.m154709a((Object) paint, "");
        if (f != paint.getTextSize()) {
            TextPaint paint2 = this.f54811j.getPaint();
            C89219l.m154709a((Object) paint2, "");
            paint2.setTextSize(f);
            int i = Build.VERSION.SDK_INT;
            boolean isInLayout = this.f54811j.isInLayout();
            if (this.f54811j.getLayout() != null) {
                this.f54804c = false;
                try {
                    Method a = m43632a("nullLayouts");
                    if (a != null) {
                        m43631a(a, this.f54811j, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f54811j.requestLayout();
                } else {
                    this.f54811j.forceLayout();
                }
                this.f54811j.invalidate();
            }
        }
    }

    /* renamed from: b */
    private final void m43635b(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException(("Minimum auto-size text size ( " + i + " px) is less or equal to (0px)").toString());
        } else if (i2 > i) {
            this.f54805d = i;
            this.f54806e = i2;
        } else {
            throw new IllegalArgumentException(("Maximum auto-size text size ( " + i2 + " px) is less or equal to minimum auto-size text size ( " + i + " px)").toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m43630a(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            java.lang.reflect.Method r1 = m43632a(r3)     // Catch:{ Exception -> 0x000f, all -> 0x0015 }
            if (r1 != 0) goto L_0x0007
            goto L_0x000f
        L_0x0007:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000f, all -> 0x0015 }
            java.lang.Object r0 = m43631a(r1, r2, r0)     // Catch:{ Exception -> 0x000f, all -> 0x0015 }
            goto L_0x0010
        L_0x000f:
            r0 = r4
        L_0x0010:
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            return r4
        L_0x0013:
            r4 = r0
            goto L_0x0012
        L_0x0015:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.p1722h.C23152b.m43630a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    private final StaticLayout m43628a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float lineSpacingMultiplier = this.f54811j.getLineSpacingMultiplier();
        float lineSpacingExtra = this.f54811j.getLineSpacingExtra();
        boolean includeFontPadding = this.f54811j.getIncludeFontPadding();
        TextPaint textPaint = this.f54810i;
        if (textPaint == null) {
            textPaint = new TextPaint();
        }
        return new StaticLayout(charSequence, textPaint, i, alignment, lineSpacingMultiplier, lineSpacingExtra, includeFontPadding);
    }

    /* renamed from: a */
    private final StaticLayout m43629a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m43630a(this.f54811j, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        int length = charSequence.length();
        TextPaint textPaint = this.f54810i;
        if (textPaint == null) {
            textPaint = new TextPaint();
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i);
        C89219l.m154709a((Object) obtain, "");
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f54811j.getLineSpacingExtra(), this.f54811j.getLineSpacingMultiplier()).setIncludePad(this.f54811j.getIncludeFontPadding()).setBreakStrategy(this.f54811j.getBreakStrategy()).setHyphenationFrequency(this.f54811j.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        StaticLayout build = hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
        C89219l.m154709a((Object) build, "");
        return build;
    }
}

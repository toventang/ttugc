package com.p2082ss.android.ugc.tools.view.style;

import android.graphics.drawable.GradientDrawable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.style.b */
public final class C84966b {

    /* renamed from: a */
    public static final C84967a f189892a = new C84967a((byte) 0);

    /* renamed from: l */
    private static final float[] f189893l = new float[0];

    /* renamed from: b */
    private Integer f189894b;

    /* renamed from: c */
    private Integer f189895c;

    /* renamed from: d */
    private int[] f189896d;

    /* renamed from: e */
    private Integer f189897e;

    /* renamed from: f */
    private Integer f189898f;

    /* renamed from: g */
    private Integer f189899g;

    /* renamed from: h */
    private Integer f189900h;

    /* renamed from: i */
    private Float f189901i;

    /* renamed from: j */
    private float[] f189902j;

    /* renamed from: k */
    private GradientDrawable.Orientation f189903k;

    /* renamed from: com.ss.android.ugc.tools.view.style.b$a */
    public static final class C84967a {
        static {
            Covode.recordClassIndex(98972);
        }

        private C84967a() {
        }

        /* renamed from: a */
        public static C84966b m146038a() {
            return new C84966b((byte) 0);
        }

        public /* synthetic */ C84967a(byte b) {
            this();
        }
    }

    private C84966b() {
        this.f189902j = f189893l;
    }

    static {
        Covode.recordClassIndex(98971);
    }

    /* renamed from: a */
    public final GradientDrawable mo129750a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.f189894b;
        if (num != null) {
            gradientDrawable.setShape(num.intValue());
        }
        Integer num2 = this.f189895c;
        if (num2 != null) {
            gradientDrawable.setColor(num2.intValue());
        }
        int[] iArr = this.f189896d;
        if (iArr != null) {
            gradientDrawable.setColors(iArr);
        }
        Integer num3 = this.f189897e;
        if (num3 != null) {
            int intValue = num3.intValue();
            Integer num4 = this.f189898f;
            if (num4 == null) {
                C89219l.m154715b();
            }
            gradientDrawable.setStroke(num4.intValue(), intValue);
        }
        Integer num5 = this.f189899g;
        if (num5 != null) {
            int intValue2 = num5.intValue();
            Integer num6 = this.f189900h;
            if (num6 == null) {
                C89219l.m154715b();
            }
            gradientDrawable.setSize(intValue2, num6.intValue());
        }
        Float f = this.f189901i;
        if (f != null) {
            gradientDrawable.setCornerRadius(f.floatValue());
        }
        float[] fArr = this.f189902j;
        if (fArr != f189893l) {
            gradientDrawable.setCornerRadii(fArr);
        }
        GradientDrawable.Orientation orientation = this.f189903k;
        if (orientation != null) {
            gradientDrawable.setOrientation(orientation);
        }
        return gradientDrawable;
    }

    public /* synthetic */ C84966b(byte b) {
        this();
    }

    /* renamed from: a */
    public final C84966b mo129754a(float[] fArr) {
        this.f189902j = fArr;
        return this;
    }

    /* renamed from: a */
    public final C84966b mo129751a(float f) {
        this.f189901i = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    public final C84966b mo129755b(int i) {
        this.f189895c = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final C84966b mo129752a(int i) {
        this.f189894b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final C84966b mo129753a(int i, int i2) {
        this.f189897e = Integer.valueOf(i);
        this.f189898f = Integer.valueOf(i2);
        return this;
    }
}

package androidx.p063m.p064a.p065a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.content.p032a.C0628b;
import androidx.core.content.p032a.C0637f;
import androidx.core.content.p032a.C0642h;
import androidx.core.graphics.C0702d;
import androidx.core.graphics.drawable.C0705a;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.m.a.a.i */
public final class C1261i extends AbstractC1260h {

    /* renamed from: a */
    static final PorterDuff.Mode f4118a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    C1268g f4119c;

    /* renamed from: d */
    public boolean f4120d;

    /* renamed from: e */
    private PorterDuffColorFilter f4121e;

    /* renamed from: f */
    private ColorFilter f4122f;

    /* renamed from: g */
    private boolean f4123g;

    /* renamed from: h */
    private Drawable.ConstantState f4124h;

    /* renamed from: i */
    private final float[] f4125i;

    /* renamed from: j */
    private final Matrix f4126j;

    /* renamed from: k */
    private final Rect f4127k;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$a */
    public static class C1262a extends AbstractC1266e {
        static {
            Covode.recordClassIndex(1371);
        }

        @Override // androidx.p063m.p064a.p065a.C1261i.AbstractC1266e
        /* renamed from: a */
        public final boolean mo4187a() {
            return true;
        }

        public C1262a() {
        }

        public C1262a(C1262a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4186a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4155n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4154m = C0702d.m2476b(string2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$b */
    public static class C1263b extends AbstractC1266e {

        /* renamed from: a */
        C0628b f4128a;

        /* renamed from: b */
        float f4129b;

        /* renamed from: c */
        C0628b f4130c;

        /* renamed from: d */
        float f4131d = 1.0f;

        /* renamed from: e */
        int f4132e;

        /* renamed from: f */
        float f4133f = 1.0f;

        /* renamed from: g */
        float f4134g;

        /* renamed from: h */
        float f4135h = 1.0f;

        /* renamed from: i */
        float f4136i;

        /* renamed from: j */
        Paint.Cap f4137j = Paint.Cap.BUTT;

        /* renamed from: k */
        Paint.Join f4138k = Paint.Join.MITER;

        /* renamed from: l */
        float f4139l = 4.0f;

        /* renamed from: p */
        private int[] f4140p;

        static {
            Covode.recordClassIndex(1372);
        }

        /* access modifiers changed from: package-private */
        public final float getFillAlpha() {
            return this.f4133f;
        }

        /* access modifiers changed from: package-private */
        public final float getStrokeAlpha() {
            return this.f4131d;
        }

        /* access modifiers changed from: package-private */
        public final float getStrokeWidth() {
            return this.f4129b;
        }

        /* access modifiers changed from: package-private */
        public final float getTrimPathEnd() {
            return this.f4135h;
        }

        /* access modifiers changed from: package-private */
        public final float getTrimPathOffset() {
            return this.f4136i;
        }

        /* access modifiers changed from: package-private */
        public final float getTrimPathStart() {
            return this.f4134g;
        }

        /* access modifiers changed from: package-private */
        public final int getFillColor() {
            return this.f4130c.f2623b;
        }

        /* access modifiers changed from: package-private */
        public final int getStrokeColor() {
            return this.f4128a.f2623b;
        }

        public C1263b() {
        }

        @Override // androidx.p063m.p064a.p065a.C1261i.AbstractC1265d
        /* renamed from: b */
        public final boolean mo4190b() {
            if (this.f4130c.mo2669b() || this.f4128a.mo2669b()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void setFillAlpha(float f) {
            this.f4133f = f;
        }

        /* access modifiers changed from: package-private */
        public final void setStrokeAlpha(float f) {
            this.f4131d = f;
        }

        /* access modifiers changed from: package-private */
        public final void setStrokeWidth(float f) {
            this.f4129b = f;
        }

        /* access modifiers changed from: package-private */
        public final void setTrimPathEnd(float f) {
            this.f4135h = f;
        }

        /* access modifiers changed from: package-private */
        public final void setTrimPathOffset(float f) {
            this.f4136i = f;
        }

        /* access modifiers changed from: package-private */
        public final void setTrimPathStart(float f) {
            this.f4134g = f;
        }

        /* access modifiers changed from: package-private */
        public final void setFillColor(int i) {
            this.f4130c.f2623b = i;
        }

        /* access modifiers changed from: package-private */
        public final void setStrokeColor(int i) {
            this.f4128a.f2623b = i;
        }

        @Override // androidx.p063m.p064a.p065a.C1261i.AbstractC1265d
        /* renamed from: a */
        public final boolean mo4189a(int[] iArr) {
            return this.f4128a.mo2668a(iArr) | this.f4130c.mo2668a(iArr);
        }

        public C1263b(C1263b bVar) {
            super(bVar);
            this.f4140p = bVar.f4140p;
            this.f4128a = bVar.f4128a;
            this.f4129b = bVar.f4129b;
            this.f4131d = bVar.f4131d;
            this.f4130c = bVar.f4130c;
            this.f4132e = bVar.f4132e;
            this.f4133f = bVar.f4133f;
            this.f4134g = bVar.f4134g;
            this.f4135h = bVar.f4135h;
            this.f4136i = bVar.f4136i;
            this.f4137j = bVar.f4137j;
            this.f4138k = bVar.f4138k;
            this.f4139l = bVar.f4139l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4188a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4140p = null;
            if (C0642h.m2364a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4155n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4154m = C0702d.m2476b(string2);
                }
                this.f4130c = C0642h.m2363a(typedArray, xmlPullParser, theme, "fillColor", 1);
                this.f4133f = C0642h.m2358a(typedArray, xmlPullParser, "fillAlpha", 12, this.f4133f);
                int a = C0642h.m2360a(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
                Paint.Cap cap = this.f4137j;
                if (a == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (a == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (a == 2) {
                    cap = Paint.Cap.SQUARE;
                }
                this.f4137j = cap;
                int a2 = C0642h.m2360a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
                Paint.Join join = this.f4138k;
                if (a2 == 0) {
                    join = Paint.Join.MITER;
                } else if (a2 == 1) {
                    join = Paint.Join.ROUND;
                } else if (a2 == 2) {
                    join = Paint.Join.BEVEL;
                }
                this.f4138k = join;
                this.f4139l = C0642h.m2358a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4139l);
                this.f4128a = C0642h.m2363a(typedArray, xmlPullParser, theme, "strokeColor", 3);
                this.f4131d = C0642h.m2358a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4131d);
                this.f4129b = C0642h.m2358a(typedArray, xmlPullParser, "strokeWidth", 4, this.f4129b);
                this.f4135h = C0642h.m2358a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4135h);
                this.f4136i = C0642h.m2358a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4136i);
                this.f4134g = C0642h.m2358a(typedArray, xmlPullParser, "trimPathStart", 5, this.f4134g);
                this.f4132e = C0642h.m2360a(typedArray, xmlPullParser, "fillType", 13, this.f4132e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$c */
    public static class C1264c extends AbstractC1265d {

        /* renamed from: a */
        final Matrix f4141a;

        /* renamed from: b */
        final ArrayList<AbstractC1265d> f4142b;

        /* renamed from: c */
        float f4143c;

        /* renamed from: d */
        float f4144d;

        /* renamed from: e */
        float f4145e;

        /* renamed from: f */
        float f4146f;

        /* renamed from: g */
        float f4147g;

        /* renamed from: h */
        float f4148h;

        /* renamed from: i */
        float f4149i;

        /* renamed from: j */
        final Matrix f4150j;

        /* renamed from: k */
        int f4151k;

        /* renamed from: l */
        int[] f4152l;

        /* renamed from: m */
        String f4153m;

        static {
            Covode.recordClassIndex(1373);
        }

        public final String getGroupName() {
            return this.f4153m;
        }

        public final Matrix getLocalMatrix() {
            return this.f4150j;
        }

        public final float getPivotX() {
            return this.f4144d;
        }

        public final float getPivotY() {
            return this.f4145e;
        }

        public final float getRotation() {
            return this.f4143c;
        }

        public final float getScaleX() {
            return this.f4146f;
        }

        public final float getScaleY() {
            return this.f4147g;
        }

        public final float getTranslateX() {
            return this.f4148h;
        }

        public final float getTranslateY() {
            return this.f4149i;
        }

        @Override // androidx.p063m.p064a.p065a.C1261i.AbstractC1265d
        /* renamed from: b */
        public final boolean mo4190b() {
            for (int i = 0; i < this.f4142b.size(); i++) {
                if (this.f4142b.get(i).mo4190b()) {
                    return true;
                }
            }
            return false;
        }

        public C1264c() {
            super((byte) 0);
            this.f4141a = new Matrix();
            this.f4142b = new ArrayList<>();
            this.f4143c = 0.0f;
            this.f4144d = 0.0f;
            this.f4145e = 0.0f;
            this.f4146f = 1.0f;
            this.f4147g = 1.0f;
            this.f4148h = 0.0f;
            this.f4149i = 0.0f;
            this.f4150j = new Matrix();
            this.f4153m = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4207a() {
            this.f4150j.reset();
            this.f4150j.postTranslate(-this.f4144d, -this.f4145e);
            this.f4150j.postScale(this.f4146f, this.f4147g);
            this.f4150j.postRotate(this.f4143c, 0.0f, 0.0f);
            this.f4150j.postTranslate(this.f4148h + this.f4144d, this.f4149i + this.f4145e);
        }

        public final void setPivotX(float f) {
            if (f != this.f4144d) {
                this.f4144d = f;
                mo4207a();
            }
        }

        public final void setPivotY(float f) {
            if (f != this.f4145e) {
                this.f4145e = f;
                mo4207a();
            }
        }

        public final void setRotation(float f) {
            if (f != this.f4143c) {
                this.f4143c = f;
                mo4207a();
            }
        }

        public final void setScaleX(float f) {
            if (f != this.f4146f) {
                this.f4146f = f;
                mo4207a();
            }
        }

        public final void setScaleY(float f) {
            if (f != this.f4147g) {
                this.f4147g = f;
                mo4207a();
            }
        }

        public final void setTranslateX(float f) {
            if (f != this.f4148h) {
                this.f4148h = f;
                mo4207a();
            }
        }

        public final void setTranslateY(float f) {
            if (f != this.f4149i) {
                this.f4149i = f;
                mo4207a();
            }
        }

        @Override // androidx.p063m.p064a.p065a.C1261i.AbstractC1265d
        /* renamed from: a */
        public final boolean mo4189a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f4142b.size(); i++) {
                z |= this.f4142b.get(i).mo4189a(iArr);
            }
            return z;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1264c(C1264c cVar, C0484a<String, Object> aVar) {
            super((byte) 0);
            AbstractC1266e aVar2;
            this.f4141a = new Matrix();
            this.f4142b = new ArrayList<>();
            this.f4143c = 0.0f;
            this.f4144d = 0.0f;
            this.f4145e = 0.0f;
            this.f4146f = 1.0f;
            this.f4147g = 1.0f;
            this.f4148h = 0.0f;
            this.f4149i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4150j = matrix;
            this.f4153m = null;
            this.f4143c = cVar.f4143c;
            this.f4144d = cVar.f4144d;
            this.f4145e = cVar.f4145e;
            this.f4146f = cVar.f4146f;
            this.f4147g = cVar.f4147g;
            this.f4148h = cVar.f4148h;
            this.f4149i = cVar.f4149i;
            this.f4152l = cVar.f4152l;
            String str = cVar.f4153m;
            this.f4153m = str;
            this.f4151k = cVar.f4151k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(cVar.f4150j);
            ArrayList<AbstractC1265d> arrayList = cVar.f4142b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1265d dVar = arrayList.get(i);
                if (dVar instanceof C1264c) {
                    this.f4142b.add(new C1264c((C1264c) dVar, aVar));
                } else {
                    if (dVar instanceof C1263b) {
                        aVar2 = new C1263b((C1263b) dVar);
                    } else if (dVar instanceof C1262a) {
                        aVar2 = new C1262a((C1262a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4142b.add(aVar2);
                    if (aVar2.f4155n != null) {
                        aVar.put(aVar2.f4155n, aVar2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$d */
    public static abstract class AbstractC1265d {
        static {
            Covode.recordClassIndex(1374);
        }

        /* renamed from: a */
        public boolean mo4189a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo4190b() {
            return false;
        }

        private AbstractC1265d() {
        }

        /* synthetic */ AbstractC1265d(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$e */
    public static abstract class AbstractC1266e extends AbstractC1265d {

        /* renamed from: m */
        protected C0702d.C0704b[] f4154m;

        /* renamed from: n */
        String f4155n;

        /* renamed from: o */
        int f4156o;

        static {
            Covode.recordClassIndex(1375);
        }

        /* renamed from: a */
        public boolean mo4187a() {
            return false;
        }

        public C0702d.C0704b[] getPathData() {
            return this.f4154m;
        }

        public String getPathName() {
            return this.f4155n;
        }

        public AbstractC1266e() {
            super((byte) 0);
        }

        /* renamed from: a */
        public final void mo4224a(Path path) {
            path.reset();
            C0702d.C0704b[] bVarArr = this.f4154m;
            if (bVarArr != null) {
                C0702d.C0704b.m2480a(bVarArr, path);
            }
        }

        public AbstractC1266e(AbstractC1266e eVar) {
            super((byte) 0);
            this.f4155n = eVar.f4155n;
            this.f4156o = eVar.f4156o;
            this.f4154m = C0702d.m2475a(eVar.f4154m);
        }

        public void setPathData(C0702d.C0704b[] bVarArr) {
            if (!C0702d.m2473a(this.f4154m, bVarArr)) {
                this.f4154m = C0702d.m2475a(bVarArr);
                return;
            }
            C0702d.C0704b[] bVarArr2 = this.f4154m;
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr2[i].f2766a = bVarArr[i].f2766a;
                for (int i2 = 0; i2 < bVarArr[i].f2767b.length; i2++) {
                    bVarArr2[i].f2767b[i2] = bVarArr[i].f2767b[i2];
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$f */
    public static class C1267f {

        /* renamed from: n */
        private static final Matrix f4157n = new Matrix();

        /* renamed from: a */
        Paint f4158a;

        /* renamed from: b */
        Paint f4159b;

        /* renamed from: c */
        final C1264c f4160c;

        /* renamed from: d */
        float f4161d;

        /* renamed from: e */
        float f4162e;

        /* renamed from: f */
        float f4163f;

        /* renamed from: g */
        float f4164g;

        /* renamed from: h */
        int f4165h;

        /* renamed from: i */
        String f4166i;

        /* renamed from: j */
        Boolean f4167j;

        /* renamed from: k */
        final C0484a<String, Object> f4168k;

        /* renamed from: l */
        private final Path f4169l;

        /* renamed from: m */
        private final Path f4170m;

        /* renamed from: o */
        private final Matrix f4171o;

        /* renamed from: p */
        private PathMeasure f4172p;

        /* renamed from: q */
        private int f4173q;

        public final int getRootAlpha() {
            return this.f4165h;
        }

        static {
            Covode.recordClassIndex(1376);
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        /* renamed from: a */
        public final boolean mo4229a() {
            if (this.f4167j == null) {
                this.f4167j = Boolean.valueOf(this.f4160c.mo4190b());
            }
            return this.f4167j.booleanValue();
        }

        public C1267f() {
            this.f4171o = new Matrix();
            this.f4161d = 0.0f;
            this.f4162e = 0.0f;
            this.f4163f = 0.0f;
            this.f4164g = 0.0f;
            this.f4165h = 255;
            this.f4166i = null;
            this.f4167j = null;
            this.f4168k = new C0484a<>();
            this.f4160c = new C1264c();
            this.f4169l = new Path();
            this.f4170m = new Path();
        }

        public final void setRootAlpha(int i) {
            this.f4165h = i;
        }

        public final void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public C1267f(C1267f fVar) {
            this.f4171o = new Matrix();
            this.f4161d = 0.0f;
            this.f4162e = 0.0f;
            this.f4163f = 0.0f;
            this.f4164g = 0.0f;
            this.f4165h = 255;
            this.f4166i = null;
            this.f4167j = null;
            C0484a<String, Object> aVar = new C0484a<>();
            this.f4168k = aVar;
            this.f4160c = new C1264c(fVar.f4160c, aVar);
            this.f4169l = new Path(fVar.f4169l);
            this.f4170m = new Path(fVar.f4170m);
            this.f4161d = fVar.f4161d;
            this.f4162e = fVar.f4162e;
            this.f4163f = fVar.f4163f;
            this.f4164g = fVar.f4164g;
            this.f4173q = fVar.f4173q;
            this.f4165h = fVar.f4165h;
            this.f4166i = fVar.f4166i;
            String str = fVar.f4166i;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4167j = fVar.f4167j;
        }

        /* renamed from: a */
        public final void mo4228a(Canvas canvas, int i, int i2) {
            m4030a(this.f4160c, f4157n, canvas, i, i2, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: android.graphics.PathMeasure */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m4030a(androidx.p063m.p064a.p065a.C1261i.C1264c r21, android.graphics.Matrix r22, android.graphics.Canvas r23, int r24, int r25, android.graphics.ColorFilter r26) {
            /*
            // Method dump skipped, instructions count: 526
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p063m.p064a.p065a.C1261i.C1267f.m4030a(androidx.m.a.a.i$c, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$g */
    public static class C1268g extends Drawable.ConstantState {

        /* renamed from: a */
        int f4174a;

        /* renamed from: b */
        C1267f f4175b;

        /* renamed from: c */
        ColorStateList f4176c;

        /* renamed from: d */
        PorterDuff.Mode f4177d;

        /* renamed from: e */
        boolean f4178e;

        /* renamed from: f */
        Bitmap f4179f;

        /* renamed from: g */
        ColorStateList f4180g;

        /* renamed from: h */
        PorterDuff.Mode f4181h;

        /* renamed from: i */
        int f4182i;

        /* renamed from: j */
        boolean f4183j;

        /* renamed from: k */
        boolean f4184k;

        /* renamed from: l */
        Paint f4185l;

        static {
            Covode.recordClassIndex(1377);
        }

        public final int getChangingConfigurations() {
            return this.f4174a;
        }

        public final Drawable newDrawable() {
            return new C1261i(this);
        }

        public C1268g() {
            this.f4177d = C1261i.f4118a;
            this.f4175b = new C1267f();
        }

        public final Drawable newDrawable(Resources resources) {
            return new C1261i(this);
        }

        public C1268g(C1268g gVar) {
            this.f4177d = C1261i.f4118a;
            if (gVar != null) {
                this.f4174a = gVar.f4174a;
                this.f4175b = new C1267f(gVar.f4175b);
                if (gVar.f4175b.f4159b != null) {
                    this.f4175b.f4159b = new Paint(gVar.f4175b.f4159b);
                }
                if (gVar.f4175b.f4158a != null) {
                    this.f4175b.f4158a = new Paint(gVar.f4175b.f4158a);
                }
                this.f4176c = gVar.f4176c;
                this.f4177d = gVar.f4177d;
                this.f4178e = gVar.f4178e;
            }
        }

        /* renamed from: a */
        public final void mo4234a(int i, int i2) {
            this.f4179f.eraseColor(0);
            this.f4175b.mo4228a(new Canvas(this.f4179f), i, i2);
        }
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.i$h */
    public static class C1269h extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4186a;

        static {
            Covode.recordClassIndex(1378);
        }

        public final boolean canApplyTheme() {
            return this.f4186a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f4186a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C1261i iVar = new C1261i();
            iVar.f4117b = this.f4186a.newDrawable();
            return iVar;
        }

        public C1269h(Drawable.ConstantState constantState) {
            this.f4186a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            C1261i iVar = new C1261i();
            iVar.f4117b = this.f4186a.newDrawable(resources);
            return iVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1261i iVar = new C1261i();
            iVar.f4117b = this.f4186a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    static {
        Covode.recordClassIndex(1370);
    }

    public final boolean canApplyTheme() {
        if (this.f4117b == null) {
            return false;
        }
        C0705a.m2504c(this.f4117b);
        return false;
    }

    public final int getOpacity() {
        if (this.f4117b != null) {
            return this.f4117b.getOpacity();
        }
        return -3;
    }

    public final void invalidateSelf() {
        if (this.f4117b != null) {
            this.f4117b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        if (this.f4117b != null) {
            return C0705a.m2501a(this.f4117b);
        }
        return this.f4119c.f4178e;
    }

    public final int getAlpha() {
        if (this.f4117b != null) {
            return C0705a.m2502b(this.f4117b);
        }
        return this.f4119c.f4175b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.f4117b != null) {
            return this.f4117b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4119c.getChangingConfigurations();
    }

    public final int getIntrinsicHeight() {
        if (this.f4117b != null) {
            return this.f4117b.getIntrinsicHeight();
        }
        return (int) this.f4119c.f4175b.f4162e;
    }

    public final int getIntrinsicWidth() {
        if (this.f4117b != null) {
            return this.f4117b.getIntrinsicWidth();
        }
        return (int) this.f4119c.f4175b.f4161d;
    }

    C1261i() {
        this.f4120d = true;
        this.f4125i = new float[9];
        this.f4126j = new Matrix();
        this.f4127k = new Rect();
        this.f4119c = new C1268g();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f4117b != null && Build.VERSION.SDK_INT >= 24) {
            return new C1269h(this.f4117b.getConstantState());
        }
        this.f4119c.f4174a = getChangingConfigurations();
        return this.f4119c;
    }

    public final boolean isStateful() {
        if (this.f4117b != null) {
            return this.f4117b.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C1268g gVar = this.f4119c;
        if (gVar == null) {
            return false;
        }
        if (gVar.f4175b.mo4229a()) {
            return true;
        }
        if (this.f4119c.f4176c == null || !this.f4119c.f4176c.isStateful()) {
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        if (this.f4117b != null) {
            this.f4117b.mutate();
            return this;
        }
        if (!this.f4123g && super.mutate() == this) {
            this.f4119c = new C1268g(this.f4119c);
            this.f4123g = true;
        }
        return this;
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final void onBoundsChange(Rect rect) {
        if (this.f4117b != null) {
            this.f4117b.setBounds(rect);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f4117b != null) {
            C0705a.m2500a(this.f4117b, z);
        } else {
            this.f4119c.f4178e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4117b != null) {
            this.f4117b.setColorFilter(colorFilter);
            return;
        }
        this.f4122f = colorFilter;
        invalidateSelf();
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.f4117b != null) {
            this.f4117b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final void setAlpha(int i) {
        if (this.f4117b != null) {
            this.f4117b.setAlpha(i);
        } else if (this.f4119c.f4175b.getRootAlpha() != i) {
            this.f4119c.f4175b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTint(int i) {
        if (this.f4117b != null) {
            C0705a.m2494a(this.f4117b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4117b != null) {
            C0705a.m2496a(this.f4117b, colorStateList);
            return;
        }
        C1268g gVar = this.f4119c;
        if (gVar.f4176c != colorStateList) {
            gVar.f4176c = colorStateList;
            this.f4121e = m4014a(colorStateList, gVar.f4177d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4117b != null) {
            C0705a.m2499a(this.f4117b, mode);
            return;
        }
        C1268g gVar = this.f4119c;
        if (gVar.f4177d != mode) {
            gVar.f4177d = mode;
            this.f4121e = m4014a(gVar.f4176c, mode);
            invalidateSelf();
        }
    }

    C1261i(C1268g gVar) {
        this.f4120d = true;
        this.f4125i = new float[9];
        this.f4126j = new Matrix();
        this.f4127k = new Rect();
        this.f4119c = gVar;
        this.f4121e = m4014a(gVar.f4176c, gVar.f4177d);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f4117b != null) {
            return this.f4117b.setState(iArr);
        }
        boolean z = false;
        C1268g gVar = this.f4119c;
        if (!(gVar.f4176c == null || gVar.f4177d == null)) {
            this.f4121e = m4014a(gVar.f4176c, gVar.f4177d);
            invalidateSelf();
            z = true;
        }
        if (gVar.f4175b.mo4229a()) {
            boolean a = gVar.f4175b.f4160c.mo4189a(iArr);
            gVar.f4184k |= a;
            if (a) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        if (this.f4117b != null) {
            this.f4117b.draw(canvas);
            return;
        }
        copyBounds(this.f4127k);
        if (this.f4127k.width() > 0 && this.f4127k.height() > 0) {
            ColorFilter colorFilter = this.f4122f;
            if (colorFilter == null) {
                colorFilter = this.f4121e;
            }
            canvas.getMatrix(this.f4126j);
            this.f4126j.getValues(this.f4125i);
            boolean z = false;
            float abs = Math.abs(this.f4125i[0]);
            float abs2 = Math.abs(this.f4125i[4]);
            float abs3 = Math.abs(this.f4125i[1]);
            float abs4 = Math.abs(this.f4125i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f4127k.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f4127k.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f4127k.left, (float) this.f4127k.top);
                int i = Build.VERSION.SDK_INT;
                if (isAutoMirrored() && C0705a.m2507f(this) == 1) {
                    canvas.translate((float) this.f4127k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f4127k.offsetTo(0, 0);
                C1268g gVar = this.f4119c;
                if (!(gVar.f4179f != null && min == gVar.f4179f.getWidth() && min2 == gVar.f4179f.getHeight())) {
                    gVar.f4179f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    gVar.f4184k = true;
                }
                if (!this.f4120d) {
                    this.f4119c.mo4234a(min, min2);
                } else {
                    C1268g gVar2 = this.f4119c;
                    if (!(!gVar2.f4184k && gVar2.f4180g == gVar2.f4176c && gVar2.f4181h == gVar2.f4177d && gVar2.f4183j == gVar2.f4178e && gVar2.f4182i == gVar2.f4175b.getRootAlpha())) {
                        this.f4119c.mo4234a(min, min2);
                        C1268g gVar3 = this.f4119c;
                        gVar3.f4180g = gVar3.f4176c;
                        gVar3.f4181h = gVar3.f4177d;
                        gVar3.f4182i = gVar3.f4175b.getRootAlpha();
                        gVar3.f4183j = gVar3.f4178e;
                        gVar3.f4184k = false;
                    }
                }
                C1268g gVar4 = this.f4119c;
                Rect rect = this.f4127k;
                if (gVar4.f4175b.getRootAlpha() < 255) {
                    z = true;
                }
                if (z || colorFilter != null) {
                    if (gVar4.f4185l == null) {
                        gVar4.f4185l = new Paint();
                        gVar4.f4185l.setFilterBitmap(true);
                    }
                    gVar4.f4185l.setAlpha(gVar4.f4175b.getRootAlpha());
                    gVar4.f4185l.setColorFilter(colorFilter);
                    paint = gVar4.f4185l;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(gVar4.f4179f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    /* renamed from: a */
    static int m4013a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.f4117b != null) {
            this.f4117b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f4117b != null) {
            return this.f4117b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m4014a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f4117b != null) {
            this.f4117b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* renamed from: a */
    public static C1261i m4015a(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1261i iVar = new C1261i();
            iVar.f4117b = C0637f.m2348a(resources, i, theme);
            iVar.f4124h = new C1269h(iVar.f4117b.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    return m4016a(resources, xml, asAttributeSet, theme);
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C1261i m4016a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1261i iVar = new C1261i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: b */
    private void m4017b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1268g gVar = this.f4119c;
        C1267f fVar = gVar.f4175b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f4160c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1264c cVar = (C1264c) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1263b bVar = new C1263b();
                    TypedArray a = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4092c);
                    bVar.mo4188a(a, xmlPullParser, theme);
                    a.recycle();
                    cVar.f4142b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f4168k.put(bVar.getPathName(), bVar);
                    }
                    gVar.f4174a = bVar.f4156o | gVar.f4174a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C1262a aVar = new C1262a();
                    if (C0642h.m2364a(xmlPullParser, "pathData")) {
                        TypedArray a2 = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4093d);
                        aVar.mo4186a(a2);
                        a2.recycle();
                    }
                    cVar.f4142b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f4168k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f4174a = aVar.f4156o | gVar.f4174a;
                } else if ("group".equals(name)) {
                    C1264c cVar2 = new C1264c();
                    TypedArray a3 = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4091b);
                    cVar2.f4152l = null;
                    cVar2.f4143c = C0642h.m2358a(a3, xmlPullParser, "rotation", 5, cVar2.f4143c);
                    cVar2.f4144d = a3.getFloat(1, cVar2.f4144d);
                    cVar2.f4145e = a3.getFloat(2, cVar2.f4145e);
                    cVar2.f4146f = C0642h.m2358a(a3, xmlPullParser, "scaleX", 3, cVar2.f4146f);
                    cVar2.f4147g = C0642h.m2358a(a3, xmlPullParser, "scaleY", 4, cVar2.f4147g);
                    cVar2.f4148h = C0642h.m2358a(a3, xmlPullParser, "translateX", 6, cVar2.f4148h);
                    cVar2.f4149i = C0642h.m2358a(a3, xmlPullParser, "translateY", 7, cVar2.f4149i);
                    String string = a3.getString(0);
                    if (string != null) {
                        cVar2.f4153m = string;
                    }
                    cVar2.mo4207a();
                    a3.recycle();
                    cVar.f4142b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f4168k.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f4174a = cVar2.f4151k | gVar.f4174a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f4117b != null) {
            C0705a.m2498a(this.f4117b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1268g gVar = this.f4119c;
        gVar.f4175b = new C1267f();
        TypedArray a = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4090a);
        C1268g gVar2 = this.f4119c;
        C1267f fVar = gVar2.f4175b;
        int a2 = C0642h.m2360a(a, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (a2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (a2 == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (a2 != 9) {
            switch (a2) {
                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        gVar2.f4177d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            gVar2.f4176c = colorStateList;
        }
        boolean z = gVar2.f4178e;
        if (C0642h.m2364a(xmlPullParser, "autoMirrored")) {
            z = a.getBoolean(5, z);
        }
        gVar2.f4178e = z;
        fVar.f4163f = C0642h.m2358a(a, xmlPullParser, "viewportWidth", 7, fVar.f4163f);
        fVar.f4164g = C0642h.m2358a(a, xmlPullParser, "viewportHeight", 8, fVar.f4164g);
        if (fVar.f4163f <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (fVar.f4164g > 0.0f) {
            fVar.f4161d = a.getDimension(3, fVar.f4161d);
            fVar.f4162e = a.getDimension(2, fVar.f4162e);
            if (fVar.f4161d <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (fVar.f4162e > 0.0f) {
                fVar.setAlpha(C0642h.m2358a(a, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = a.getString(0);
                if (string != null) {
                    fVar.f4166i = string;
                    fVar.f4168k.put(string, fVar);
                }
                a.recycle();
                gVar.f4174a = getChangingConfigurations();
                gVar.f4184k = true;
                m4017b(resources, xmlPullParser, attributeSet, theme);
                this.f4121e = m4014a(gVar.f4176c, gVar.f4177d);
            } else {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }
}

package androidx.appcompat.p019b.p020a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.p019b.p020a.C0264b;
import androidx.appcompat.p019b.p020a.C0270e;
import androidx.core.content.p032a.C0642h;
import androidx.p025c.C0489d;
import androidx.p025c.C0498h;
import androidx.p063m.p064a.p065a.C1251c;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.covode.number.Covode;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.b.a.a */
public class C0257a extends C0270e {

    /* renamed from: c */
    private static final String f808c = C0257a.class.getSimpleName();

    /* renamed from: d */
    private C0259b f809d;

    /* renamed from: e */
    private AbstractC0263f f810e;

    /* renamed from: f */
    private int f811f;

    /* renamed from: g */
    private int f812g;

    /* renamed from: h */
    private boolean f813h;

    @Override // androidx.appcompat.p019b.p020a.C0264b, androidx.appcompat.p019b.p020a.C0270e
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.a$d */
    public static class C0261d extends AbstractC0263f {

        /* renamed from: a */
        private final ObjectAnimator f818a;

        /* renamed from: b */
        private final boolean f819b;

        static {
            Covode.recordClassIndex(295);
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: c */
        public final boolean mo671c() {
            return this.f819b;
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: a */
        public final void mo663a() {
            this.f818a.start();
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: b */
        public final void mo664b() {
            this.f818a.cancel();
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: d */
        public final void mo672d() {
            this.f818a.reverse();
        }

        C0261d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super((byte) 0);
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C0262e eVar = new C0262e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            int i3 = Build.VERSION.SDK_INT;
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) eVar.f820a);
            ofInt.setInterpolator(eVar);
            this.f819b = z2;
            this.f818a = ofInt;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.a$f */
    public static abstract class AbstractC0263f {
        static {
            Covode.recordClassIndex(297);
        }

        /* renamed from: a */
        public abstract void mo663a();

        /* renamed from: b */
        public abstract void mo664b();

        /* renamed from: c */
        public boolean mo671c() {
            return false;
        }

        /* renamed from: d */
        public void mo672d() {
        }

        private AbstractC0263f() {
        }

        /* synthetic */ AbstractC0263f(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.a$a */
    public static class C0258a extends AbstractC0263f {

        /* renamed from: a */
        private final Animatable f814a;

        static {
            Covode.recordClassIndex(292);
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: a */
        public final void mo663a() {
            this.f814a.start();
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: b */
        public final void mo664b() {
            this.f814a.stop();
        }

        C0258a(Animatable animatable) {
            super((byte) 0);
            this.f814a = animatable;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.a$b */
    public static class C0259b extends C0270e.C0271a {

        /* renamed from: a */
        C0489d<Long> f815a;

        /* renamed from: b */
        C0498h<Integer> f816b;

        static {
            Covode.recordClassIndex(293);
        }

        /* renamed from: a */
        static long m896a(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        @Override // androidx.appcompat.p019b.p020a.C0270e.C0271a
        public final Drawable newDrawable() {
            return new C0257a(this, null);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.p019b.p020a.C0270e.C0271a, androidx.appcompat.p019b.p020a.C0264b.AbstractC0267b
        /* renamed from: a */
        public final void mo668a() {
            this.f815a = this.f815a.clone();
            this.f816b = this.f816b.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo667a(int[] iArr) {
            int b = super.mo735b(iArr);
            if (b >= 0) {
                return b;
            }
            return super.mo735b(StateSet.WILD_CARD);
        }

        @Override // androidx.appcompat.p019b.p020a.C0270e.C0271a
        public final Drawable newDrawable(Resources resources) {
            return new C0257a(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo665a(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f816b.mo2183a(i, 0).intValue();
        }

        C0259b(C0259b bVar, C0257a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f815a = bVar.f815a;
                this.f816b = bVar.f816b;
                return;
            }
            this.f815a = new C0489d<>();
            this.f816b = new C0498h<>();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo666a(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int a = super.mo685a(drawable);
            long a2 = m896a(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = (long) a;
            this.f815a.mo2087c(a2, Long.valueOf(j2 | j));
            if (z) {
                this.f815a.mo2087c(m896a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.a$c */
    public static class C0260c extends AbstractC0263f {

        /* renamed from: a */
        private final C1251c f817a;

        static {
            Covode.recordClassIndex(294);
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: a */
        public final void mo663a() {
            this.f817a.start();
        }

        @Override // androidx.appcompat.p019b.p020a.C0257a.AbstractC0263f
        /* renamed from: b */
        public final void mo664b() {
            this.f817a.stop();
        }

        C0260c(C1251c cVar) {
            super((byte) 0);
            this.f817a = cVar;
        }
    }

    public C0257a() {
        this(null, null);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    static {
        Covode.recordClassIndex(291);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C0259b mo631b() {
        return new C0259b(this.f809d, this, null);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0263f fVar = this.f810e;
        if (fVar != null) {
            fVar.mo664b();
            this.f810e = null;
            mo676a(this.f811f);
            this.f811f = -1;
            this.f812g = -1;
        }
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b, androidx.appcompat.p019b.p020a.C0270e
    public Drawable mutate() {
        if (!this.f813h && super.mutate() == this) {
            this.f809d.mo668a();
            this.f813h = true;
        }
        return this;
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b, androidx.appcompat.p019b.p020a.C0270e
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.p019b.p020a.C0264b, androidx.appcompat.p019b.p020a.C0270e
    /* renamed from: a */
    public final void mo629a(C0264b.AbstractC0267b bVar) {
        super.mo629a(bVar);
        if (bVar instanceof C0259b) {
            this.f809d = (C0259b) bVar;
        }
    }

    /* renamed from: androidx.appcompat.b.a.a$e */
    static class C0262e implements TimeInterpolator {

        /* renamed from: a */
        public int f820a;

        /* renamed from: b */
        private int[] f821b;

        /* renamed from: c */
        private int f822c;

        static {
            Covode.recordClassIndex(296);
        }

        public final float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f820a)) + 0.5f);
            int i2 = this.f822c;
            int[] iArr = this.f821b;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f820a);
            } else {
                f2 = 0.0f;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }

        C0262e(AnimationDrawable animationDrawable, boolean z) {
            m907a(animationDrawable, z);
        }

        /* renamed from: a */
        private int m907a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f822c = numberOfFrames;
            int[] iArr = this.f821b;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f821b = new int[numberOfFrames];
            }
            int[] iArr2 = this.f821b;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f820a = i;
            return i;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (mo676a(r6) != false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.appcompat.p019b.p020a.C0264b, androidx.appcompat.p019b.p020a.C0270e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r19) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.p019b.p020a.C0257a.onStateChange(int[]):boolean");
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C0257a(C0259b bVar, Resources resources) {
        super((byte) 0);
        this.f811f = -1;
        this.f812g = -1;
        mo629a(new C0259b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC0263f fVar = this.f810e;
        if (fVar != null && (visible || z2)) {
            if (z) {
                fVar.mo663a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    @Override // androidx.appcompat.p019b.p020a.C0264b
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C0257a m887a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0257a aVar = new C0257a();
            TypedArray a = C0642h.m2361a(resources, theme, attributeSet, new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533});
            aVar.setVisible(a.getBoolean(1, true), true);
            C0259b bVar = aVar.f809d;
            if (Build.VERSION.SDK_INT >= 21) {
                bVar.f852f |= a.getChangingConfigurations();
            }
            bVar.f857k = a.getBoolean(2, bVar.f857k);
            bVar.f860n = a.getBoolean(3, bVar.f860n);
            bVar.f840C = a.getInt(4, bVar.f840C);
            bVar.f841D = a.getInt(5, bVar.f841D);
            aVar.setDither(a.getBoolean(0, bVar.f872z));
            aVar.mo674a(resources);
            a.recycle();
            aVar.m888b(context, resources, xmlPullParser, attributeSet, theme);
            aVar.onStateChange(aVar.getState());
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: c */
    private int m889c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray a = C0642h.m2361a(resources, theme, attributeSet, new int[]{16843161, 16843849, 16843850, 16843851});
        int resourceId = a.getResourceId(2, -1);
        int resourceId2 = a.getResourceId(1, -1);
        int resourceId3 = a.getResourceId(0, -1);
        if (resourceId3 > 0) {
            drawable = C0196a.m619b(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = a.getBoolean(3, false);
        a.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = C1251c.m3998a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
                if (drawable == null) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f809d.mo666a(resourceId, resourceId2, drawable, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* renamed from: b */
    private void m888b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1 && ((depth = xmlPullParser.getDepth()) >= depth2 || next2 != 3)) {
                if (next2 == 2 && depth <= depth2) {
                    if (xmlPullParser.getName().equals("item")) {
                        TypedArray a = C0642h.m2361a(resources, theme, attributeSet, new int[]{16842960, 16843161});
                        int resourceId = a.getResourceId(0, 0);
                        Drawable drawable = null;
                        int resourceId2 = a.getResourceId(1, -1);
                        if (resourceId2 > 0) {
                            drawable = C0196a.m619b(context, resourceId2);
                        }
                        a.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i);
                        if (drawable == null) {
                            do {
                                next = xmlPullParser.next();
                            } while (next == 4);
                            if (next == 2) {
                                if (xmlPullParser.getName().equals("vector")) {
                                    drawable = C1261i.m4016a(resources, xmlPullParser, attributeSet, theme);
                                } else if (Build.VERSION.SDK_INT >= 21) {
                                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                                } else {
                                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                                }
                                if (drawable == null) {
                                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                            } else {
                                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        C0259b bVar = this.f809d;
                        int a2 = bVar.mo685a(drawable);
                        bVar.f889L[a2] = trimStateSet;
                        bVar.f816b.mo2186b(a2, Integer.valueOf(resourceId));
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m889c(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            }
        }
    }
}

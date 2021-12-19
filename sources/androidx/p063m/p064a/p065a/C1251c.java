package androidx.p063m.p064a.p065a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p032a.C0642h;
import androidx.core.graphics.drawable.C0705a;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.m.a.a.c */
public final class C1251c extends AbstractC1260h implements AbstractC1250b {

    /* renamed from: a */
    final Drawable.Callback f4102a;

    /* renamed from: c */
    private C1253a f4103c;

    /* renamed from: d */
    private Context f4104d;

    /* renamed from: e */
    private ArgbEvaluator f4105e;

    static {
        Covode.recordClassIndex(1360);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.m.a.a.c$a */
    public static class C1253a extends Drawable.ConstantState {

        /* renamed from: a */
        int f4107a;

        /* renamed from: b */
        C1261i f4108b;

        /* renamed from: c */
        AnimatorSet f4109c;

        /* renamed from: d */
        ArrayList<Animator> f4110d;

        /* renamed from: e */
        C0484a<Animator, String> f4111e;

        static {
            Covode.recordClassIndex(1362);
        }

        public final int getChangingConfigurations() {
            return this.f4107a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
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

    /* renamed from: androidx.m.a.a.c$b */
    static class C1254b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f4112a;

        static {
            Covode.recordClassIndex(1363);
        }

        public final boolean canApplyTheme() {
            return this.f4112a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f4112a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C1251c cVar = new C1251c();
            cVar.f4117b = this.f4112a.newDrawable();
            cVar.f4117b.setCallback(cVar.f4102a);
            return cVar;
        }

        public C1254b(Drawable.ConstantState constantState) {
            this.f4112a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            C1251c cVar = new C1251c();
            cVar.f4117b = this.f4112a.newDrawable(resources);
            cVar.f4117b.setCallback(cVar.f4102a);
            return cVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1251c cVar = new C1251c();
            cVar.f4117b = this.f4112a.newDrawable(resources, theme);
            cVar.f4117b.setCallback(cVar.f4102a);
            return cVar;
        }
    }

    C1251c() {
        this(null, (byte) 0);
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

    public final boolean canApplyTheme() {
        if (this.f4117b != null) {
            return C0705a.m2504c(this.f4117b);
        }
        return false;
    }

    public final Drawable mutate() {
        if (this.f4117b != null) {
            this.f4117b.mutate();
        }
        return this;
    }

    public final int getAlpha() {
        if (this.f4117b != null) {
            return C0705a.m2502b(this.f4117b);
        }
        return this.f4103c.f4108b.getAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.f4117b != null) {
            return this.f4117b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4103c.f4107a;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f4117b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1254b(this.f4117b.getConstantState());
    }

    public final int getIntrinsicHeight() {
        if (this.f4117b != null) {
            return this.f4117b.getIntrinsicHeight();
        }
        return this.f4103c.f4108b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.f4117b != null) {
            return this.f4117b.getIntrinsicWidth();
        }
        return this.f4103c.f4108b.getIntrinsicWidth();
    }

    public final int getOpacity() {
        if (this.f4117b != null) {
            return this.f4117b.getOpacity();
        }
        return this.f4103c.f4108b.getOpacity();
    }

    public final boolean isAutoMirrored() {
        if (this.f4117b != null) {
            return C0705a.m2501a(this.f4117b);
        }
        return this.f4103c.f4108b.isAutoMirrored();
    }

    public final boolean isRunning() {
        if (this.f4117b != null) {
            return ((AnimatedVectorDrawable) this.f4117b).isRunning();
        }
        return this.f4103c.f4109c.isRunning();
    }

    public final boolean isStateful() {
        if (this.f4117b != null) {
            return this.f4117b.isStateful();
        }
        return this.f4103c.f4108b.isStateful();
    }

    public final void stop() {
        if (this.f4117b != null) {
            ((AnimatedVectorDrawable) this.f4117b).stop();
        } else {
            this.f4103c.f4109c.end();
        }
    }

    public final void start() {
        if (this.f4117b != null) {
            ((AnimatedVectorDrawable) this.f4117b).start();
        } else if (!this.f4103c.f4109c.isStarted()) {
            this.f4103c.f4109c.start();
            invalidateSelf();
        }
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

    private C1251c(Context context) {
        this(context, (byte) 0);
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final void applyTheme(Resources.Theme theme) {
        if (this.f4117b != null) {
            C0705a.m2497a(this.f4117b, theme);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f4117b != null) {
            this.f4117b.draw(canvas);
            return;
        }
        this.f4103c.f4108b.draw(canvas);
        if (this.f4103c.f4109c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final void onBoundsChange(Rect rect) {
        if (this.f4117b != null) {
            this.f4117b.setBounds(rect);
        } else {
            this.f4103c.f4108b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final boolean onLevelChange(int i) {
        if (this.f4117b != null) {
            return this.f4117b.setLevel(i);
        }
        return this.f4103c.f4108b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f4117b != null) {
            return this.f4117b.setState(iArr);
        }
        return this.f4103c.f4108b.setState(iArr);
    }

    public final void setAlpha(int i) {
        if (this.f4117b != null) {
            this.f4117b.setAlpha(i);
        } else {
            this.f4103c.f4108b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f4117b != null) {
            C0705a.m2500a(this.f4117b, z);
        } else {
            this.f4103c.f4108b.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4117b != null) {
            this.f4117b.setColorFilter(colorFilter);
        } else {
            this.f4103c.f4108b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTint(int i) {
        if (this.f4117b != null) {
            C0705a.m2494a(this.f4117b, i);
        } else {
            this.f4103c.f4108b.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4117b != null) {
            C0705a.m2496a(this.f4117b, colorStateList);
        } else {
            this.f4103c.f4108b.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0710e
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4117b != null) {
            C0705a.m2499a(this.f4117b, mode);
        } else {
            this.f4103c.f4108b.setTintMode(mode);
        }
    }

    /* renamed from: a */
    private void m3999a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m3999a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4105e == null) {
                    this.f4105e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4105e);
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

    private C1251c(Context context, byte b) {
        this.f4102a = new Drawable.Callback() {
            /* class androidx.p063m.p064a.p065a.C1251c.C12521 */

            static {
                Covode.recordClassIndex(1361);
            }

            public final void invalidateDrawable(Drawable drawable) {
                C1251c.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C1251c.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C1251c.this.scheduleSelf(runnable, j);
            }
        };
        this.f4104d = context;
        this.f4103c = new C1253a();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f4117b != null) {
            return this.f4117b.setVisible(z, z2);
        }
        this.f4103c.f4108b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // androidx.p063m.p064a.p065a.AbstractC1260h
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator a;
        if (this.f4117b != null) {
            C0705a.m2498a(this.f4117b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a2 = C0642h.m2361a(resources, theme, attributeSet, C1249a.f4094e);
                    int resourceId = a2.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1261i a3 = C1261i.m4015a(resources, resourceId, theme);
                        a3.f4120d = false;
                        a3.setCallback(this.f4102a);
                        if (this.f4103c.f4108b != null) {
                            this.f4103c.f4108b.setCallback(null);
                        }
                        this.f4103c.f4108b = a3;
                    }
                    a2.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1249a.f4095f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4104d;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                a = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                a = C1256e.m4001a(context, context.getResources(), context.getTheme(), resourceId2);
                            }
                            a.setTarget(this.f4103c.f4108b.f4119c.f4175b.f4168k.get(string));
                            if (Build.VERSION.SDK_INT < 21) {
                                m3999a(a);
                            }
                            if (this.f4103c.f4110d == null) {
                                this.f4103c.f4110d = new ArrayList<>();
                                this.f4103c.f4111e = new C0484a<>();
                            }
                            this.f4103c.f4110d.add(a);
                            this.f4103c.f4111e.put(a, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C1253a aVar = this.f4103c;
        if (aVar.f4109c == null) {
            aVar.f4109c = new AnimatorSet();
        }
        aVar.f4109c.playTogether(aVar.f4110d);
    }

    /* renamed from: a */
    public static C1251c m3998a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1251c cVar = new C1251c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }
}

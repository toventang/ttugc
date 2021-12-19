package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24088h;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.p1857h.AbstractC24256b;
import com.facebook.drawee.view.C24259a;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.facebook.drawee.view.c */
public class C24262c<DH extends AbstractC24256b> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled;
    private float mAspectRatio = 0.0f;
    private C24261b<DH> mDraweeHolder;
    private boolean mInitialised = false;
    private boolean mLegacyVisibilityHandlingEnabled = false;
    private final C24259a.C24260a mMeasureSpec = new C24259a.C24260a();

    static {
        Covode.recordClassIndex(28394);
    }

    public void DraweeView__onDraw$___twin___(Canvas canvas) {
        MethodCollector.m26663i(9360);
        super.onDraw(canvas);
        MethodCollector.m26664o(9360);
    }

    public void onDetachedFromWindow() {
        m46112x12a2cff3(this);
    }

    public void onDraw(Canvas canvas) {
        m46111xa2419451(this, canvas);
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    /* access modifiers changed from: protected */
    public void onAttach() {
        doAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetach() {
        doDetach();
    }

    /* access modifiers changed from: protected */
    public void doAttach() {
        this.mDraweeHolder.mo40003b();
    }

    /* access modifiers changed from: protected */
    public void doDetach() {
        this.mDraweeHolder.mo40005c();
    }

    public AbstractC24255a getController() {
        return this.mDraweeHolder.f57519b;
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.mo40006d();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.mo40008f();
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.mo40007e();
    }

    public void DraweeView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    public boolean hasController() {
        if (this.mDraweeHolder.f57519b != null) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled && (drawable = getDrawable()) != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public String toString() {
        String str;
        C24088h.C24089a a = C24088h.m45610a(this);
        C24261b<DH> bVar = this.mDraweeHolder;
        if (bVar != null) {
            str = bVar.toString();
        } else {
            str = "<no holder set>";
        }
        return a.mo39647a("holder", str).toString();
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    /* renamed from: com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_simpleDraweeViewOnDetachedFromWindow */
    public static void m46112x12a2cff3(C24262c cVar) {
        cVar.DraweeView__onDetachedFromWindow$___twin___();
        C58030k.m104850a(cVar);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.mo40002a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        if (f != this.mAspectRatio) {
            this.mAspectRatio = f;
            requestLayout();
        }
    }

    public void setController(AbstractC24255a aVar) {
        this.mDraweeHolder.mo40001a(aVar);
        super.setImageDrawable(this.mDraweeHolder.mo40008f());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.mo40004b(dh);
        super.setImageDrawable(this.mDraweeHolder.mo40008f());
    }

    public C24262c(Context context) {
        super(context);
        MethodCollector.m26663i(8893);
        init(context);
        MethodCollector.m26664o(8893);
    }

    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.mo40001a((AbstractC24255a) null);
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.mo40001a((AbstractC24255a) null);
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.mo40001a((AbstractC24255a) null);
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.mo40001a((AbstractC24255a) null);
        super.setImageURI(uri);
    }

    /* JADX INFO: finally extract failed */
    private void init(Context context) {
        try {
            C24644b.m47156a();
            if (this.mInitialised) {
                C24644b.m47156a();
                return;
            }
            boolean z = true;
            this.mInitialised = true;
            this.mDraweeHolder = C24261b.m46095a((AbstractC24256b) null);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    C24644b.m47156a();
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z;
            C24644b.m47156a();
        } catch (Throwable th) {
            C24644b.m47156a();
            throw th;
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    public C24262c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(9050);
        init(context);
        MethodCollector.m26664o(9050);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m46111xa2419451(com.facebook.drawee.view.C24262c r7, android.graphics.Canvas r8) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.view.C24262c.m46111xa2419451(com.facebook.drawee.view.c, android.graphics.Canvas):void");
    }

    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9210);
        this.mMeasureSpec.f57516a = i;
        this.mMeasureSpec.f57517b = i2;
        C24259a.C24260a aVar = this.mMeasureSpec;
        float f = this.mAspectRatio;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (f > 0.0f && layoutParams != null) {
            if (C24259a.m46094a(layoutParams.height)) {
                aVar.f57517b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f57516a) - paddingLeft)) / f) + ((float) paddingTop)), aVar.f57517b), 1073741824);
            } else if (C24259a.m46094a(layoutParams.width)) {
                aVar.f57516a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f57517b) - paddingTop)) * f) + ((float) paddingLeft)), aVar.f57516a), 1073741824);
            }
        }
        super.onMeasure(this.mMeasureSpec.f57516a, this.mMeasureSpec.f57517b);
        MethodCollector.m26664o(9210);
    }

    public C24262c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(9051);
        init(context);
        MethodCollector.m26664o(9051);
    }

    public C24262c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        MethodCollector.m26663i(9206);
        init(context);
        MethodCollector.m26664o(9206);
    }
}

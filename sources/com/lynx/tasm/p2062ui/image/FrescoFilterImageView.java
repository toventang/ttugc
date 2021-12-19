package com.lynx.tasm.p2062ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.imagepipeline.p1890o.AbstractC24635a;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import com.facebook.p1826c.p1827a.C24031j;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import java.util.List;

/* renamed from: com.lynx.tasm.ui.image.FrescoFilterImageView */
public class FrescoFilterImageView extends FrescoImageView {
    private int mBlurRadius;
    private C24117a<AbstractC24454c> mShadowBitmapRef;
    private C24031j mShadowCacheKey;
    private int mShadowColor;
    private int mShadowOffsetX;
    private int mShadowOffsetY;
    private int mShadowRadius;

    static {
        Covode.recordClassIndex(34972);
    }

    public void FrescoFilterImageView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
    }

    public void markShadowDirty() {
        this.mIsDirty = true;
    }

    @Override // com.facebook.drawee.view.C24262c, com.lynx.tasm.p2062ui.image.FrescoImageView
    public void onDetachedFromWindow() {
        m57806x9ceb8b9c(this);
    }

    public boolean isShadowDirty() {
        return this.mIsDirty;
    }

    @Override // com.lynx.tasm.p2062ui.image.FrescoImageView
    public void maybeUpdateView() {
        if (isShadowDirty() && getSrc() != null) {
            this.mShadowCacheKey = new C24031j(generateShadowCacheKey());
        }
        super.maybeUpdateView();
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.p2062ui.image.FrescoImageView
    public void onImageRequestLoaded() {
        if (this.mShadowCacheKey != null) {
            this.mShadowBitmapRef = C24117a.m45711b(C24428k.m46551a().mo40245c().mo40201a(this.mShadowCacheKey));
            invalidate();
        }
    }

    /* renamed from: com.lynx.tasm.ui.image.FrescoFilterImageView$a */
    static class C28860a extends AbstractC24635a {

        /* renamed from: a */
        private int f68141a;

        /* renamed from: b */
        private int f68142b;

        /* renamed from: c */
        private int f68143c;

        /* renamed from: d */
        private int f68144d;

        /* renamed from: e */
        private int f68145e;

        /* renamed from: f */
        private int f68146f;

        /* renamed from: g */
        private int f68147g;

        /* renamed from: h */
        private int f68148h;

        /* renamed from: i */
        private int f68149i;

        /* renamed from: j */
        private int f68150j;

        /* renamed from: k */
        private int f68151k;

        /* renamed from: l */
        private AbstractC24026e f68152l;

        /* renamed from: m */
        private C24229q.AbstractC24231b f68153m;

        static {
            Covode.recordClassIndex(34973);
        }

        @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
        public final String getName() {
            return "ShadowPostProcessor";
        }

        @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
        public final AbstractC24026e getPostprocessorCacheKey() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f68141a);
            sb.append(this.f68142b);
            sb.append(this.f68145e);
            sb.append(this.f68146f);
            sb.append(this.f68143c);
            sb.append(this.f68144d);
            sb.append(this.f68153m);
            sb.append(this.f68147g);
            sb.append(this.f68148h);
            sb.append(this.f68149i);
            sb.append(this.f68150j);
            sb.append(this.f68151k);
            return new C24031j(sb.toString());
        }

        @Override // com.facebook.imagepipeline.p1890o.AbstractC24635a
        public final void process(Bitmap bitmap, Bitmap bitmap2) {
            int i;
            Throwable th;
            RectF rectF;
            MethodCollector.m26663i(8682);
            super.process(bitmap, bitmap2);
            int i2 = this.f68141a;
            if (i2 == 0 || (i = this.f68142b) == 0 || (this.f68150j == 0 && this.f68149i == 0 && this.f68151k == 0)) {
                MethodCollector.m26664o(8682);
                return;
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i2, i, bitmap2.getConfig());
                Matrix matrix = new Matrix();
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate((float) this.f68143c, (float) this.f68146f);
                canvas.clipRect(0, 0, i2 - this.f68144d, i - this.f68145e);
                canvas.drawARGB(0, 0, 0, 0);
                Paint paint = new Paint(1);
                float f = (float) ((i2 - this.f68143c) - this.f68144d);
                float f2 = (float) ((i - this.f68146f) - this.f68145e);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                float width = (float) bitmap2.getWidth();
                float height = (float) bitmap2.getHeight();
                if (this.f68153m == C24229q.AbstractC24231b.f57452b) {
                    matrix.setScale(f / width, f2 / height);
                    matrix.postTranslate(0.0f, 0.0f);
                    rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
                } else if (this.f68153m == C24229q.AbstractC24231b.f57454d) {
                    float f3 = f / width;
                    float f4 = f2 / height;
                    if (f3 > f4) {
                        float f5 = width * f4;
                        float f6 = ((f - f5) / 2.0f) + 0.0f;
                        rectF = new RectF(f6, 0.0f, f5 + f6, f2 + 0.0f);
                        matrix.setScale(f4, f4);
                        matrix.postTranslate(f6, 0.0f);
                    } else {
                        float f7 = height * f3;
                        float f8 = ((f2 - f7) / 2.0f) + 0.0f;
                        rectF = new RectF(0.0f, f8, f + 0.0f, f7 + f8);
                        matrix.setScale(f3, f3);
                        matrix.postTranslate(0.0f, f8);
                    }
                } else if (this.f68153m == C24229q.AbstractC24231b.f57458h) {
                    float f9 = f / width;
                    float f10 = f2 / height;
                    if (f9 > f10) {
                        rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
                        matrix.setScale(f9, f9);
                        matrix.postTranslate(0.0f, ((f2 - (height * f9)) / 2.0f) + 0.0f);
                    } else {
                        rectF = new RectF(0.0f, 0.0f, f + 0.0f, f2 + 0.0f);
                        matrix.setScale(f10, f10);
                        matrix.postTranslate(((f - (width * f10)) / 2.0f) + 0.0f, 0.0f);
                    }
                } else {
                    rectF = new RectF(0.0f, 0.0f, f, f2);
                    matrix.setTranslate((float) Math.round((f - width) * 0.5f), (float) Math.round((f2 - height) * 0.5f));
                }
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                paint.setFilterBitmap(true);
                canvas.drawRect(rectF, paint);
                C24117a<Bitmap> a = C24428k.m46551a().mo40248f().mo40148a(this.f68141a, this.f68142b, bitmap2.getConfig());
                try {
                    Canvas canvas2 = new Canvas(a.mo39695a());
                    if (this.f68149i != 0) {
                        Paint paint2 = new Paint();
                        paint2.setFlags(3);
                        paint2.setColorFilter(new PorterDuffColorFilter(this.f68149i, PorterDuff.Mode.SRC_IN));
                        canvas2.drawBitmap(createBitmap, (float) this.f68147g, (float) this.f68148h, paint2);
                    }
                    if (this.f68150j != 0) {
                        NativeBlurFilter.iterativeBoxBlur(a.mo39695a(), 3, this.f68150j);
                    }
                    canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                    if (this.f68151k != 0) {
                        NativeBlurFilter.iterativeBoxBlur(a.mo39695a(), 3, this.f68151k);
                    }
                    C24117a<AbstractC24454c> a2 = C24117a.m45706a(new C24455d(a, C24458g.f58105a));
                    C24428k.m46551a().mo40245c().mo40202a(this.f68152l, a2);
                    C24117a.m45712c(a);
                    if (a2 != null) {
                        C24117a.m45712c(a2);
                        MethodCollector.m26664o(8682);
                        return;
                    }
                    MethodCollector.m26664o(8682);
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        C24117a.m45712c(a);
                    }
                    if (0 != 0) {
                        C24117a.m45712c(null);
                    }
                    MethodCollector.m26664o(8682);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(8682);
                throw th;
            }
        }

        C28860a(int i, int i2, int i3, int i4, int i5, int i6, C24229q.AbstractC24231b bVar, int i7, int i8, int i9, int i10, int i11, AbstractC24026e eVar) {
            this.f68141a = i;
            this.f68142b = i2;
            this.f68143c = i3;
            this.f68146f = i4;
            this.f68144d = i5;
            this.f68145e = i6;
            this.f68153m = bVar;
            this.f68147g = i7;
            this.f68148h = i8;
            this.f68149i = i9;
            this.f68150j = i10;
            this.f68151k = i11;
            this.f68152l = eVar;
        }
    }

    /* access modifiers changed from: package-private */
    public String generateShadowCacheKey() {
        return getSrc() + getWidth() + getHeight() + getPaddingBottom() + getPaddingTop() + getPaddingLeft() + getPaddingRight() + getFrescoScaleType() + this.mShadowOffsetX + this.mShadowOffsetY + this.mShadowColor + this.mShadowRadius;
    }

    @Override // com.lynx.tasm.p2062ui.image.FrescoImageView
    public void setBorderRadius(C28683b bVar) {
        super.setBorderRadius(bVar);
    }

    /* renamed from: com_lynx_tasm_ui_image_FrescoFilterImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow */
    public static void m57806x9ceb8b9c(FrescoFilterImageView frescoFilterImageView) {
        frescoFilterImageView.FrescoFilterImageView__onDetachedFromWindow$___twin___();
        C58030k.m104850a(frescoFilterImageView);
    }

    @Override // com.lynx.tasm.p2062ui.image.FrescoImageView
    public void setBlurRadius(int i) {
        if (this.mBlurRadius != i) {
            this.mBlurRadius = i;
            markShadowDirty();
        }
    }

    public void setShadowColor(int i) {
        if (this.mShadowColor != i) {
            this.mShadowColor = i;
            markShadowDirty();
        }
    }

    public void setShadowOffsetX(int i) {
        if (this.mShadowOffsetX != i) {
            this.mShadowOffsetX = i;
            markShadowDirty();
        }
    }

    public void setShadowOffsetY(int i) {
        if (this.mShadowOffsetY != i) {
            this.mShadowOffsetY = i;
            markShadowDirty();
        }
    }

    public void setShadowRadius(int i) {
        if (this.mShadowRadius != i) {
            this.mShadowRadius = i;
            markShadowDirty();
        }
    }

    @Override // com.facebook.drawee.view.C24262c, com.lynx.tasm.p2062ui.image.FrescoImageView
    public void onDraw(Canvas canvas) {
        C24117a<AbstractC24454c> aVar = this.mShadowBitmapRef;
        if (aVar != null && aVar.mo39700d() && this.mShadowBitmapRef.mo39695a() != null && getWidth() != 0 && getHeight() != 0) {
            canvas.drawBitmap(((C24455d) this.mShadowBitmapRef.mo39695a()).f58089a, 0.0f, 0.0f, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.p2062ui.image.FrescoImageView
    public void onPostprocessorPreparing(List<AbstractC24641d> list) {
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.mShadowRadius != 0 || this.mShadowColor != 0 || this.mBlurRadius != 0) {
                C24117a<AbstractC24454c> aVar = this.mShadowBitmapRef;
                if (aVar != null) {
                    C24117a.m45712c(aVar);
                    this.mShadowBitmapRef = null;
                }
                list.add(new C28860a(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), getFrescoScaleType(), this.mShadowOffsetX, this.mShadowOffsetY, this.mShadowColor, this.mShadowRadius, this.mBlurRadius, this.mShadowCacheKey));
            }
        }
    }

    public FrescoFilterImageView(Context context, AbstractC24198b bVar, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, bVar, globalImageLoadListener, obj);
    }
}

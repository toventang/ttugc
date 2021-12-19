package com.lynx.tasm.p2062ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1851c.C24205f;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1854e.RunnableC24212b;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1878c.AbstractC24357f;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1888m.C24471b;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.lynx.tasm.p2062ui.image.p2063a.C28873b;
import com.lynx.tasm.p2062ui.image.p2063a.C28874c;
import com.lynx.tasm.p2062ui.image.p2063a.C28875d;
import com.lynx.tasm.p2062ui.image.p2064b.C28877a;
import com.lynx.tasm.p2062ui.image.p2064b.C28884b;
import com.lynx.tasm.p2062ui.image.p2064b.C28885c;
import com.lynx.tasm.p2062ui.image.p2064b.C28886d;
import com.lynx.tasm.p2062ui.image.p2064b.C28888e;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.lynx.tasm.ui.image.FrescoImageView */
public class FrescoImageView extends SimpleDraweeView {
    public static ConcurrentHashMap<String, C28865b> sUrlImageSizeMap = new ConcurrentHashMap<>();
    private C28877a mBigImageHelper;
    private Bitmap.Config mBitmapConfig = null;
    private C28683b mBorderRadii = null;
    private C28885c mCachedImageSource;
    private final Object mCallerContext;
    private String mCapInsets = null;
    private String mCapInsetsScale = null;
    private AbstractC24203d mControllerForTesting;
    private AbstractC24203d mControllerListener;
    private boolean mCoverStart;
    private C24636b mCurImageRequest;
    public boolean mDisableDefaultPlaceholder = false;
    private final AbstractC24198b mDraweeControllerBuilder;
    private int mFadeDurationMs = -1;
    private boolean mFixFrescoBug;
    private boolean mFrescoNinePatch = false;
    private GlobalImageLoadListener mGlobalImageLoadListener;
    private ReadableMap mHeaders;
    private C28885c mImagePlaceholder;
    public C28885c mImageSource;
    protected boolean mIsBorderRadiusDirty;
    protected boolean mIsDirty;
    public boolean mIsFrescoAttach = false;
    public boolean mIsFrescoVisible = false;
    private boolean mIsNoSubSampleMode = false;
    private C24471b mIterativeBoxBlurPostProcessor;
    public C28890d mLoaderCallback;
    private Drawable mLoadingImageDrawable;
    private int mLoopCount = 0;
    private int mOverlayColor;
    private float mPreFetchHeight = -1.0f;
    private float mPreFetchWidth = -1.0f;
    private boolean mProgressiveRenderingEnabled;
    private String mRawSrc;
    public C24117a<?> mRef = null;
    private boolean mRepeat;
    private EnumC28893f mResizeMethod = EnumC28893f.AUTO;
    private int mRetryCount;
    private C24229q.AbstractC24231b mScaleType = C24229q.AbstractC24231b.f57452b;
    private int mShowCnt;
    public int mSourceImageHeight = 0;
    public int mSourceImageWidth = 0;
    private final List<C28885c> mSources;
    public C24117a<Bitmap> mTempPlaceHolder = null;
    private boolean mUseLocalCache = false;

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void markDirty() {
        this.mIsDirty = true;
    }

    /* access modifiers changed from: protected */
    public void onImageRequestLoaded() {
    }

    /* access modifiers changed from: protected */
    public void onPostprocessorPreparing(List<AbstractC24641d> list) {
    }

    public C24229q.AbstractC24231b getFrescoScaleType() {
        return this.mScaleType;
    }

    /* access modifiers changed from: protected */
    public int getLoopCount() {
        return this.mLoopCount;
    }

    public void setFrescoAttach() {
        doAttach();
    }

    static {
        Covode.recordClassIndex(34974);
    }

    private boolean hasMultipleSources() {
        if (this.mSources.size() > 1) {
            return true;
        }
        return false;
    }

    private void onSourceSetted() {
        int i = this.mShowCnt + 1;
        this.mShowCnt = i;
        C28877a aVar = this.mBigImageHelper;
        if (aVar != null) {
            aVar.mo50091a(i);
        }
    }

    public void setFrescoVisible() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    /* renamed from: com.lynx.tasm.ui.image.FrescoImageView$a */
    class C28864a implements C28877a.AbstractC28882b {
        static {
            Covode.recordClassIndex(34978);
        }

        @Override // com.lynx.tasm.p2062ui.image.p2064b.C28877a.AbstractC28882b
        /* renamed from: a */
        public final void mo50009a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                FrescoImageView.this.invalidate();
            } else {
                FrescoImageView.this.postInvalidate();
            }
        }

        C28864a() {
        }
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsFrescoVisible) {
            setFrescoVisible();
        }
        if (this.mIsFrescoAttach) {
            setFrescoAttach();
        }
    }

    private boolean isSupportPostProcess() {
        String lowerCase = this.mImageSource.mo50100a().toString().toLowerCase();
        if (lowerCase.endsWith(".gif") || lowerCase.endsWith(".apng")) {
            return false;
        }
        return true;
    }

    private void setSourceImage() {
        this.mImageSource = null;
        if (!this.mSources.isEmpty()) {
            if (hasMultipleSources()) {
                C28886d.C28887a a = C28886d.m57866a(getWidth(), getHeight(), this.mSources);
                this.mImageSource = a.f68255a;
                this.mCachedImageSource = a.f68256b;
                return;
            }
            this.mImageSource = this.mSources.get(0);
        }
    }

    public void destroy() {
        C28877a aVar = this.mBigImageHelper;
        if (aVar != null) {
            aVar.mo50090a();
        }
        C24117a<?> aVar2 = this.mRef;
        if (aVar2 != null) {
            aVar2.close();
            this.mRef = null;
        }
        if (this.mTempPlaceHolder != null) {
            C24246a aVar3 = (C24246a) getHierarchy();
            if (aVar3 != null) {
                aVar3.mo39953a(1, (Drawable) null);
            }
            this.mTempPlaceHolder.close();
            this.mTempPlaceHolder = null;
        }
    }

    public String getSrc() {
        List<C28885c> list = this.mSources;
        if (list == null || list.size() <= 0 || this.mSources.get(0) == null) {
            return null;
        }
        return this.mSources.get(0).mo50100a().toString();
    }

    public void maybeUpdateView() {
        if ((this.mIsDirty && !hasMultipleSources() && getWidth() > 0 && getHeight() > 0) || this.mPreFetchWidth > 0.0f || this.mPreFetchHeight > 0.0f) {
            if (getWidth() <= 0 || getHeight() <= 0) {
                tryFetchImage((int) this.mPreFetchWidth, (int) this.mPreFetchHeight, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            } else {
                maybeUpdateViewInternal(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
    }

    public void fixFrescoWebPBug(boolean z) {
        this.mFixFrescoBug = z;
    }

    public void setBorderColor(int i) {
        this.mIsDirty = true;
    }

    public void setBorderWidth(float f) {
        this.mIsDirty = true;
    }

    public void setDisableDefaultPlaceHolder(boolean z) {
        this.mDisableDefaultPlaceholder = z;
    }

    public void setFadeDuration(int i) {
        this.mFadeDurationMs = i;
    }

    public void setFrescoNinePatch(boolean z) {
        this.mFrescoNinePatch = z;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    public void setImageLoaderCallback(C28890d dVar) {
        this.mLoaderCallback = dVar;
    }

    public void setLocalCache(boolean z) {
        this.mUseLocalCache = z;
    }

    public void setLoopCount(int i) {
        this.mLoopCount = i;
    }

    public void setNoSubSampleMode(boolean z) {
        this.mIsNoSubSampleMode = z;
    }

    public void setPreFetchHeight(float f) {
        this.mPreFetchHeight = f;
    }

    public void setPreFetchWidth(float f) {
        this.mPreFetchWidth = f;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public void setRepeat(boolean z) {
        this.mRepeat = z;
    }

    /* access modifiers changed from: protected */
    public C24639c createImageRequestBuilder(Uri uri) {
        C24639c a = C24639c.m47149a(uri);
        C28884b.m57860a(a);
        return a;
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        this.mIsDirty = true;
    }

    public void setBorderRadius(C28683b bVar) {
        this.mBorderRadii = bVar;
        this.mIsDirty = true;
        this.mIsBorderRadiusDirty = true;
    }

    public void setCapInsets(String str) {
        this.mCapInsets = str;
        this.mIsDirty = true;
    }

    public void setCapInsetsScale(String str) {
        this.mCapInsetsScale = str;
        this.mIsDirty = true;
    }

    public void setCoverStart(boolean z) {
        this.mCoverStart = z;
        this.mIsDirty = true;
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
        this.mIsDirty = true;
    }

    public void setPlaceholder(String str) {
        setPlaceholder(str, true);
    }

    public void setResizeMethod(EnumC28893f fVar) {
        this.mResizeMethod = fVar;
        this.mIsDirty = true;
    }

    public void setScaleType(C24229q.AbstractC24231b bVar) {
        this.mScaleType = bVar;
        this.mIsDirty = true;
    }

    public void setSrcSkippingRedirection(String str) {
        setSrc(str, false);
    }

    public void setControllerListener(AbstractC24203d dVar) {
        this.mControllerForTesting = dVar;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    public void setSrc(String str) {
        this.mRawSrc = str;
        this.mRetryCount = 1;
        setSrc(str, true);
    }

    private static C24246a buildHierarchy(Context context) {
        C24247b bVar = new C24247b(context.getResources());
        bVar.f57495t = C24250e.m46055b(0.0f);
        return bVar.mo39973a();
    }

    private void warnImageSource(String str) {
        LLog.m56861c("Lynx", "Warning: Image source \"" + str + "\" doesn't exist");
    }

    @Override // com.facebook.drawee.view.C24262c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            LLog.m56862d("Lynx FrescoImageView", "catch onTouchEvent exception: " + th.toString());
            return false;
        }
    }

    public void setBlurRadius(int i) {
        if (i == 0) {
            this.mIterativeBoxBlurPostProcessor = null;
        } else {
            this.mIterativeBoxBlurPostProcessor = new C24471b(i);
        }
        this.mIsDirty = true;
    }

    private boolean shouldResize(C28885c cVar) {
        if (cVar == null) {
            return false;
        }
        if (this.mResizeMethod == EnumC28893f.AUTO) {
            if (C24134g.m45739d(cVar.mo50100a()) || C24134g.m45738c(cVar.mo50100a())) {
                return true;
            }
            return false;
        } else if (this.mResizeMethod == EnumC28893f.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean retryWithRawSrc(String str) {
        if (str != null && str.equals(this.mRawSrc) && str.startsWith("http")) {
            int i = this.mRetryCount;
            this.mRetryCount = i - 1;
            if (i > 0) {
                setSrc(str, false);
                maybeUpdateView();
                return true;
            }
        }
        return false;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable drawable;
        C28888e a = C28888e.m57867a();
        Context context = getContext();
        int a2 = a.mo50101a(context, str);
        RunnableC24212b bVar = null;
        if (a2 > 0 && (drawable = context.getResources().getDrawable(a2)) != null) {
            bVar = new RunnableC24212b(drawable, 1000);
        }
        this.mLoadingImageDrawable = bVar;
        this.mIsDirty = true;
    }

    public void setSource(String str) {
        this.mSources.clear();
        if (str != null) {
            C28885c cVar = new C28885c(getContext(), str);
            this.mSources.add(cVar);
            if (Uri.EMPTY.equals(cVar.mo50100a())) {
                warnImageSource(str);
            }
        }
        onSourceSetted();
        this.mIsDirty = true;
    }

    private float[] adjustBorderRadiusArrayWithPadding(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return null;
        }
        int i = 0;
        float[] fArr2 = {(float) getPaddingLeft(), (float) getPaddingTop(), (float) getPaddingRight(), (float) getPaddingTop(), (float) getPaddingRight(), (float) getPaddingBottom(), (float) getPaddingLeft(), (float) getPaddingBottom()};
        do {
            fArr2[i] = Math.max(0.0f, fArr[i] - fArr2[i]);
            i++;
        } while (i < 8);
        return fArr2;
    }

    public void setSource(ReadableArray readableArray) {
        this.mSources.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                C28885c cVar = new C28885c(getContext(), string);
                this.mSources.add(cVar);
                if (Uri.EMPTY.equals(cVar.mo50100a())) {
                    warnImageSource(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString("uri");
                    C28885c cVar2 = new C28885c(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    this.mSources.add(cVar2);
                    if (Uri.EMPTY.equals(cVar2.mo50100a())) {
                        warnImageSource(string2);
                    }
                }
            }
        }
        onSourceSetted();
        this.mIsDirty = true;
    }

    @Override // com.facebook.drawee.view.C24262c
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        C28890d dVar = this.mLoaderCallback;
        if (dVar != null) {
            dVar.mo50080b(getWidth(), getHeight());
        }
        C24117a<?> aVar = this.mRef;
        if (aVar != null && aVar.mo39700d() && this.mUseLocalCache) {
            Object a = this.mRef.mo39695a();
            if (a instanceof AbstractC24453b) {
                bitmap = ((AbstractC24453b) a).mo40296d();
            } else if (a instanceof Bitmap) {
                bitmap = (Bitmap) a;
            }
            if (bitmap != null) {
                LLog.m56856a(4, "Lynx Android Image", "draw image from local cache");
                if (C28873b.m57836a(canvas.getWidth(), canvas.getHeight(), bitmap.getWidth(), bitmap.getHeight(), this.mScaleType, this.mCapInsets, this.mCapInsetsScale, canvas, bitmap)) {
                    return;
                }
            }
        }
        if (!this.mFrescoNinePatch && this.mCapInsets != null) {
            LLog.m56856a(4, "Lynx Android Image", "load origin bitmap to draw image with cap-insets");
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new C28877a(new C28864a(), this.mShowCnt);
            }
            if (this.mBigImageHelper.mo50095a(getContext(), canvas, this.mCurImageRequest, new C28877a.C28881a(this.mShowCnt, (float) getWidth(), (float) getHeight(), this.mRepeat, this.mScaleType, getSrc(), C28877a.m57843a(canvas), this.mCapInsets, this.mCapInsetsScale))) {
                return;
            }
        }
        TraceEvent.m56864a(0, "FrescoImageView.onDraw");
        if (this.mIsNoSubSampleMode || (getController() != null && getController().mo39821i() == null && this.mCapInsets == null)) {
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new C28877a(new C28864a(), this.mShowCnt);
            }
            C28877a.C28881a aVar2 = new C28877a.C28881a(this.mShowCnt, (float) getWidth(), (float) getHeight(), this.mRepeat, this.mScaleType, getSrc(), C28877a.m57843a(canvas), this.mCapInsets, this.mCapInsetsScale);
            if (this.mIsNoSubSampleMode) {
                C28877a aVar3 = this.mBigImageHelper;
                Context context = getContext();
                C24636b bVar = this.mCurImageRequest;
                aVar3.f68221c = true;
                if (aVar3.f68220b == null || aVar3.f68220b.f68245d == null || aVar3.f68220b.f68247f.f68233a != aVar2.f68233a) {
                    aVar3.mo50090a();
                    aVar3.mo50092a(context, bVar, aVar2);
                }
                aVar3.mo50093a(canvas, aVar3.f68220b);
                TraceEvent.m56869b(0, "FrescoImageView.onDraw");
                return;
            }
            C28877a aVar4 = this.mBigImageHelper;
            Context context2 = getContext();
            C24636b bVar2 = this.mCurImageRequest;
            if (DisplayMetricsHolder.m57911a() != null && (aVar2.f68234b > ((float) (DisplayMetricsHolder.m57911a().widthPixels * 3)) || aVar2.f68235c > ((float) DisplayMetricsHolder.m57911a().heightPixels) || aVar2.f68236d)) {
                aVar4.f68221c = false;
                LLog.m56859a("LynxImageHelper", "drawBigImage: w:" + aVar2.f68234b + ", h:" + aVar2.f68235c);
                if (aVar4.f68220b == null || aVar4.f68220b.f68245d == null || aVar4.f68220b.f68247f.f68233a != aVar2.f68233a) {
                    aVar4.mo50090a();
                    aVar4.mo50092a(context2, bVar2, aVar2);
                }
                aVar4.mo50093a(canvas, aVar4.f68220b);
                TraceEvent.m56869b(0, "FrescoImageView.onDraw");
                return;
            }
        }
        super.onDraw(canvas);
        TraceEvent.m56869b(0, "FrescoImageView.onDraw");
    }

    /* renamed from: com.lynx.tasm.ui.image.FrescoImageView$b */
    public static class C28865b {

        /* renamed from: a */
        public int f68162a;

        /* renamed from: b */
        public int f68163b;

        static {
            Covode.recordClassIndex(34979);
        }

        public C28865b(int i, int i2) {
            this.f68162a = i;
            this.f68163b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.ui.image.FrescoImageView$c */
    public static class C28866c extends C28873b {

        /* renamed from: a */
        private String f68164a;

        static {
            Covode.recordClassIndex(34980);
        }

        @Override // com.lynx.tasm.p2062ui.image.p2063a.C28873b, com.facebook.imagepipeline.p1890o.AbstractC24635a, com.facebook.imagepipeline.p1890o.AbstractC24641d
        public final C24117a<Bitmap> process(Bitmap bitmap, AbstractC24357f fVar) {
            if (!FrescoImageView.sUrlImageSizeMap.containsKey(this.f68164a)) {
                FrescoImageView.sUrlImageSizeMap.put(this.f68164a, new C28865b(bitmap.getWidth(), bitmap.getHeight()));
            }
            return super.process(bitmap, fVar);
        }

        C28866c(String str, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, C24229q.AbstractC24231b bVar, String str2, String str3, Bitmap.Config config) {
            super(str, i, i2, i3, i4, i5, i6, fArr, bVar, str2, str3, config);
            this.f68164a = str;
        }
    }

    private void setPlaceholder(String str, boolean z) {
        if (z) {
            str = C28621a.m57207a(getContext(), str);
        }
        if (str != null && !str.isEmpty()) {
            C28885c cVar = new C28885c(getContext(), str);
            this.mImagePlaceholder = cVar;
            if (Uri.EMPTY.equals(cVar.mo50100a())) {
                warnImageSource(str);
            }
        }
        this.mIsDirty = true;
    }

    public void tryFetchImageFromLocalCache(int i, int i2) {
        C28885c cVar = this.mImageSource;
        if (cVar != null && cVar.f68251a != null && this.mUseLocalCache && getContext() != null) {
            final String str = this.mImageSource.f68251a;
            C28621a.m57209a(getContext(), str, (float) i, (float) i2, new AbstractC28510f.AbstractC28511a() {
                /* class com.lynx.tasm.p2062ui.image.FrescoImageView.C288622 */

                static {
                    Covode.recordClassIndex(34976);
                }

                @Override // com.lynx.tasm.behavior.AbstractC28510f.AbstractC28511a
                /* renamed from: a */
                public final void mo49016a(final Object obj, Throwable th) {
                    if (obj instanceof C24117a) {
                        RunnableC288631 r2 = new Runnable() {
                            /* class com.lynx.tasm.p2062ui.image.FrescoImageView.C288622.RunnableC288631 */

                            static {
                                Covode.recordClassIndex(34977);
                            }

                            public final void run() {
                                if (FrescoImageView.this.mImageSource != null && str.equals(FrescoImageView.this.mImageSource.f68251a)) {
                                    FrescoImageView.this.mRef = ((C24117a) obj).clone();
                                    FrescoImageView.this.postInvalidate();
                                }
                            }
                        };
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            r2.run();
                        } else {
                            FrescoImageView.this.post(r2);
                        }
                    }
                }
            });
        }
    }

    private void setSrc(String str, boolean z) {
        if (z) {
            str = C28621a.m57207a(getContext(), str);
        }
        this.mSources.clear();
        if (str == null || str.isEmpty()) {
            setController(null);
        } else {
            C28885c cVar = new C28885c(getContext(), str);
            this.mSources.add(cVar);
            if (Uri.EMPTY.equals(cVar.mo50100a())) {
                warnImageSource(str);
            }
        }
        onSourceSetted();
        C24117a<?> aVar = this.mRef;
        if (aVar != null) {
            aVar.close();
            this.mRef = null;
        }
        if (this.mTempPlaceHolder != null) {
            C24246a aVar2 = (C24246a) getHierarchy();
            if (aVar2 != null) {
                aVar2.mo39953a(1, (Drawable) null);
            }
            this.mTempPlaceHolder.close();
            this.mTempPlaceHolder = null;
        }
        this.mIsDirty = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.mIsDirty || hasMultipleSources()) {
                z = true;
            } else {
                z = false;
            }
            this.mIsDirty = z;
            maybeUpdateView();
        }
    }

    public FrescoImageView(Context context, AbstractC24198b bVar, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, buildHierarchy(context));
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
        this.mSources = new LinkedList();
        this.mShowCnt = 0;
        this.mRepeat = false;
        this.mCoverStart = false;
    }

    public void tryFetchImage(int i, int i2, int i3, int i4, int i5, int i6) {
        maybeUpdateViewInternal(i, i2, i3, i4, i5, i6);
    }

    private void maybeUpdateViewInternal(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z;
        C28885c cVar;
        C24250e b;
        boolean z2;
        setSourceImage();
        C28885c cVar2 = this.mImageSource;
        if (cVar2 != null || this.mImagePlaceholder != null) {
            if (!shouldResize(cVar2) || (i > 0 && i2 > 0)) {
                tryFetchImageFromLocalCache(i, i2);
                C24246a aVar = (C24246a) getHierarchy();
                if (!this.mFixFrescoBug) {
                    aVar.mo39958a(this.mScaleType);
                }
                if (this.mScaleType == C24229q.AbstractC24231b.f57458h && this.mCoverStart) {
                    C28895h hVar = new C28895h();
                    this.mScaleType = hVar;
                    aVar.mo39958a(hVar);
                }
                Drawable drawable = this.mLoadingImageDrawable;
                if (drawable != null) {
                    aVar.mo39957a(drawable, C24229q.AbstractC24231b.f57456f);
                }
                if (this.mScaleType == C24229q.AbstractC24231b.f57458h || this.mScaleType == C24229q.AbstractC24231b.f57459i) {
                    z = false;
                } else {
                    z = true;
                }
                float[] fArr = null;
                C28683b bVar = this.mBorderRadii;
                if (bVar != null) {
                    if (bVar.mo49768a((float) (i + i3 + i5), (float) (i2 + i4 + i6))) {
                        this.mIsBorderRadiusDirty = true;
                    }
                    fArr = adjustBorderRadiusArrayWithPadding(this.mBorderRadii.mo49770a());
                }
                if (this.mIsBorderRadiusDirty) {
                    if (z || fArr == null) {
                        b = C24250e.m46055b(0.0f);
                    } else {
                        b = new C24250e();
                        C24091i.m45617a(fArr);
                        if (fArr.length == 8) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C24091i.m45621a(z2, "radii should have exactly 8 values");
                        System.arraycopy(fArr, 0, b.mo39983a(), 0, 8);
                    }
                    int i7 = this.mOverlayColor;
                    if (i7 != 0) {
                        b.mo39980a(i7);
                    } else {
                        b.f57499a = C24250e.EnumC24251a.BITMAP_ONLY;
                    }
                    aVar.mo39959a(b);
                    this.mIsBorderRadiusDirty = true;
                }
                int i8 = this.mFadeDurationMs;
                if (i8 < 0) {
                    i8 = 0;
                }
                aVar.mo39961b(i8);
                REQUEST request = (REQUEST) createImageRequest(this.mImageSource, i, i2, 0, 0, 0, 0, fArr, this.mScaleType);
                this.mCurImageRequest = request;
                REQUEST request2 = (REQUEST) createImageRequest(this.mCachedImageSource, i, i2, 0, 0, 0, 0, fArr, this.mScaleType);
                C24636b createImageRequest = createImageRequest(this.mImagePlaceholder, i, i2, 0, 0, 0, 0, fArr, this.mScaleType);
                if (request2 == null) {
                    request2 = (REQUEST) createImageRequest;
                }
                GlobalImageLoadListener globalImageLoadListener = this.mGlobalImageLoadListener;
                if (!(globalImageLoadListener == null || (cVar = this.mImageSource) == null)) {
                    globalImageLoadListener.onLoadAttempt(cVar.mo50100a());
                }
                this.mDraweeControllerBuilder.mo39825b();
                final WeakReference weakReference = new WeakReference(this);
                AbstractC24198b bVar2 = this.mDraweeControllerBuilder;
                bVar2.f57306j = true;
                bVar2.f57298b = this.mCallerContext;
                bVar2.f57309m = getController();
                bVar2.f57299c = request;
                bVar2.f57300d = request2;
                final String str = this.mRawSrc;
                C288611 r3 = new C24202c<AbstractC24457f>() {
                    /* class com.lynx.tasm.p2062ui.image.FrescoImageView.C288611 */

                    static {
                        Covode.recordClassIndex(34975);
                    }

                    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                    public final void onSubmit(String str, Object obj) {
                        LLog.m56856a(6, "FrescoImageView", "onFinalImageSet");
                    }

                    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                    public final void onFailure(String str, Throwable th) {
                        if (!FrescoImageView.this.retryWithRawSrc(str)) {
                            FrescoImageView.this.mIsDirty = true;
                            if (FrescoImageView.this.mLoaderCallback != null) {
                                FrescoImageView.this.mLoaderCallback.mo50007a("Android FrescoImageView loading image failed, and the url is " + FrescoImageView.this.getSrc() + ". The Fresco throw error msg is " + th.getMessage());
                            }
                            LLog.m56862d("FrescoImageView", "onFailed src:" + str + "with reason" + th.getMessage());
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                    @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                    public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                        AbstractC24457f fVar2 = fVar;
                        if (weakReference.get() != null) {
                            ((FrescoImageView) weakReference.get()).onImageRequestLoaded();
                        }
                        if (FrescoImageView.this.mDisableDefaultPlaceholder && (fVar2 instanceof C24455d)) {
                            FrescoImageView.this.mTempPlaceHolder = ((C24455d) fVar2).mo40299f();
                            C24246a aVar = (C24246a) FrescoImageView.this.getHierarchy();
                            if (!(aVar == null || FrescoImageView.this.mTempPlaceHolder == null || FrescoImageView.this.mTempPlaceHolder.mo39695a() == null)) {
                                aVar.mo39953a(1, new BitmapDrawable(FrescoImageView.this.getResources(), FrescoImageView.this.mTempPlaceHolder.mo39695a()));
                            }
                        }
                        if (FrescoImageView.sUrlImageSizeMap.containsKey(FrescoImageView.this.mImageSource.mo50100a().toString())) {
                            C28865b bVar = FrescoImageView.sUrlImageSizeMap.get(FrescoImageView.this.mImageSource.mo50100a().toString());
                            FrescoImageView.this.mSourceImageHeight = bVar.f68163b;
                            FrescoImageView.this.mSourceImageWidth = bVar.f68162a;
                        } else {
                            FrescoImageView.this.mSourceImageWidth = fVar2.getWidth();
                            FrescoImageView.this.mSourceImageHeight = fVar2.getHeight();
                        }
                        if (FrescoImageView.this.mLoaderCallback != null) {
                            FrescoImageView.this.mLoaderCallback.mo50006a(FrescoImageView.this.mSourceImageWidth, FrescoImageView.this.mSourceImageHeight);
                        }
                        if (animatable instanceof C24290a) {
                            C24290a aVar2 = (C24290a) animatable;
                            aVar2.mo40069a(new C28874c(aVar2.f57588d, FrescoImageView.this.getLoopCount()));
                            C28884b.m57862a(aVar2);
                        }
                        LLog.m56862d("FrescoImageView", "onFinalImageSet");
                    }
                };
                this.mControllerListener = r3;
                if (this.mControllerForTesting == null) {
                    this.mDraweeControllerBuilder.f57303g = r3;
                } else {
                    C24205f fVar = new C24205f();
                    fVar.mo39830a(this.mControllerListener);
                    fVar.mo39830a(this.mControllerForTesting);
                    this.mDraweeControllerBuilder.f57303g = fVar;
                }
                setController(this.mDraweeControllerBuilder.mo39827e());
                this.mIsDirty = false;
                this.mDraweeControllerBuilder.mo39825b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public C24636b createImageRequest(C28885c cVar, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, C24229q.AbstractC24231b bVar) {
        boolean z;
        C24363d dVar;
        if (cVar == null) {
            return null;
        }
        boolean shouldResize = shouldResize(cVar);
        if (bVar == C24229q.AbstractC24231b.f57458h || bVar == C24229q.AbstractC24231b.f57459i) {
            z = false;
        } else {
            z = true;
        }
        LinkedList linkedList = new LinkedList();
        if (z) {
            linkedList.add(new C28866c(cVar.mo50100a().toString(), i, i2, i3, i4, i5, i6, fArr, bVar, this.mCapInsets, this.mCapInsetsScale, this.mBitmapConfig));
        }
        C24471b bVar2 = this.mIterativeBoxBlurPostProcessor;
        if (bVar2 != null) {
            linkedList.add(bVar2);
        }
        onPostprocessorPreparing(linkedList);
        AbstractC24641d a = C28910k.m57905a(linkedList);
        if (shouldResize) {
            dVar = new C24363d(i, i2);
        } else {
            dVar = null;
        }
        C24639c createImageRequestBuilder = createImageRequestBuilder(cVar.mo50100a());
        createImageRequestBuilder.f58553d = dVar;
        C24639c a2 = createImageRequestBuilder.mo40486a(true);
        a2.f58557h = this.mProgressiveRenderingEnabled;
        if (isSupportPostProcess()) {
            a2.f58560k = a;
        }
        return C28875d.m57840a(a2, this.mHeaders);
    }
}

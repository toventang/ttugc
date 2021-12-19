package com.bytedance.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.C21088g;
import com.bytedance.lottie.C21094h;
import com.bytedance.lottie.C21106i;
import com.bytedance.lottie.C21122n;
import com.bytedance.lottie.p1499c.C21033e;
import com.bytedance.lottie.p1505f.C21080b;
import com.bytedance.lottie.p1505f.Choreographer$FrameCallbackC21082d;
import com.bytedance.lottie.p1506g.C21091c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

public class LottieAnimationView extends AppCompatImageView implements AbstractC33974au {

    /* renamed from: c */
    private static final String f49502c = LottieAnimationView.class.getSimpleName();

    /* renamed from: r */
    private static boolean f49503r;

    /* renamed from: a */
    public boolean f49504a;

    /* renamed from: b */
    public boolean f49505b;

    /* renamed from: d */
    private final AbstractC21119k<C21088g> f49506d = new AbstractC21119k<C21088g>() {
        /* class com.bytedance.lottie.LottieAnimationView.C209281 */

        static {
            Covode.recordClassIndex(24543);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.lottie.AbstractC21119k
        /* renamed from: a */
        public final /* synthetic */ void mo34447a(C21088g gVar) {
            LottieAnimationView.this.setComposition(gVar);
        }
    };

    /* renamed from: e */
    private final AbstractC21119k<Throwable> f49507e = new AbstractC21119k<Throwable>() {
        /* class com.bytedance.lottie.LottieAnimationView.C209292 */

        static {
            Covode.recordClassIndex(24544);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.lottie.AbstractC21119k
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo34447a(Throwable th) {
        }
    };

    /* renamed from: f */
    private final C21106i f49508f;

    /* renamed from: g */
    private String f49509g;

    /* renamed from: h */
    private int f49510h;

    /* renamed from: i */
    private boolean f49511i;

    /* renamed from: j */
    private boolean f49512j;

    /* renamed from: k */
    private boolean f49513k;

    /* renamed from: l */
    private boolean f49514l;

    /* renamed from: m */
    private Set<AbstractC21120l> f49515m;

    /* renamed from: n */
    private EnumC21130r f49516n;

    /* renamed from: o */
    private int f49517o;

    /* renamed from: p */
    private C21123o<C21088g> f49518p;

    /* renamed from: q */
    private C21088g f49519q;

    /* renamed from: s */
    private boolean f49520s;

    /* renamed from: t */
    private boolean f49521t;

    /* renamed from: u */
    private AbstractC1204m f49522u;

    /* renamed from: v */
    private boolean f49523v;

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    public C21088g getComposition() {
        return this.f49519q;
    }

    public boolean getUseHardwareAcceleration() {
        return this.f49513k;
    }

    /* renamed from: e */
    public final void mo34400e() {
        this.f49508f.f50033b.removeAllUpdateListeners();
    }

    /* renamed from: f */
    public final void mo34401f() {
        this.f49508f.f50033b.removeAllListeners();
    }

    public int getFrame() {
        return (int) this.f49508f.f50033b.f49952c;
    }

    public String getImageAssetsFolder() {
        return this.f49508f.f50037f;
    }

    public float getScale() {
        return this.f49508f.f50034c;
    }

    public float getSpeed() {
        return this.f49508f.f50033b.f49950a;
    }

    /* renamed from: j */
    public final void mo34419j() {
        this.f49515m.clear();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.bytedance.lottie.LottieAnimationView.SavedState.C209311 */

            static {
                Covode.recordClassIndex(24547);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a */
        String f49527a;

        /* renamed from: b */
        int f49528b;

        /* renamed from: c */
        float f49529c;

        /* renamed from: d */
        boolean f49530d;

        /* renamed from: e */
        String f49531e;

        /* renamed from: f */
        int f49532f;

        /* renamed from: g */
        int f49533g;

        static {
            Covode.recordClassIndex(24546);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f49527a = parcel.readString();
            this.f49529c = parcel.readFloat();
            this.f49530d = parcel.readInt() != 1 ? false : true;
            this.f49531e = parcel.readString();
            this.f49532f = parcel.readInt();
            this.f49533g = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f49527a);
            parcel.writeFloat(this.f49529c);
            parcel.writeInt(this.f49530d ? 1 : 0);
            parcel.writeString(this.f49531e);
            parcel.writeInt(this.f49532f);
            parcel.writeInt(this.f49533g);
        }
    }

    static {
        Covode.recordClassIndex(24542);
    }

    /* renamed from: k */
    private void m39384k() {
        if (this.f49504a) {
            this.f49508f.mo34580a();
        }
    }

    /* renamed from: b */
    public final void mo34396b() {
        if (!this.f49513k) {
            this.f49513k = true;
            m39386m();
        }
    }

    /* renamed from: c */
    public final void mo34398c() {
        this.f49505b = true;
        this.f49508f.mo34591d();
        this.f49520s = true;
        m39386m();
    }

    /* renamed from: d */
    public final void mo34399d() {
        this.f49508f.mo34595e();
        m39386m();
    }

    /* renamed from: g */
    public final boolean mo34402g() {
        return this.f49508f.f50033b.isRunning();
    }

    public long getDuration() {
        C21088g gVar = this.f49519q;
        if (gVar != null) {
            return (long) gVar.mo34559a();
        }
        return 0;
    }

    public float getMaxFrame() {
        return this.f49508f.f50033b.mo34554k();
    }

    public float getMinFrame() {
        return this.f49508f.f50033b.mo34553j();
    }

    public C21127q getPerformanceTracker() {
        C21106i iVar = this.f49508f;
        if (iVar.f50032a != null) {
            return iVar.f50032a.f49969a;
        }
        return null;
    }

    public float getProgress() {
        return this.f49508f.f50033b.mo34542d();
    }

    public int getRepeatCount() {
        return this.f49508f.f50033b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f49508f.f50033b.getRepeatMode();
    }

    /* renamed from: h */
    public final void mo34416h() {
        this.f49505b = false;
        this.f49508f.mo34602h();
        m39386m();
    }

    /* renamed from: i */
    public final void mo34417i() {
        this.f49508f.mo34603i();
        m39386m();
    }

    /* renamed from: l */
    private void m39385l() {
        C21123o<C21088g> oVar = this.f49518p;
        if (oVar != null) {
            oVar.mo34621b(this.f49506d);
            this.f49518p.mo34623d(this.f49507e);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        if (!this.f49521t) {
            this.f49521t = true;
            boolean isRunning = this.f49508f.f50033b.isRunning();
            if (this.f49523v) {
                this.f49520s = isRunning;
            }
            if (isRunning) {
                mo34417i();
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        if (this.f49521t) {
            this.f49521t = false;
            if (this.f49520s && this.f49523v) {
                mo34399d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.LottieAnimationView$3 */
    public static /* synthetic */ class C209303 {

        /* renamed from: a */
        static final /* synthetic */ int[] f49526a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 24545(0x5fe1, float:3.4395E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.r[] r0 = com.bytedance.lottie.EnumC21130r.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.LottieAnimationView.C209303.f49526a = r2
                com.bytedance.lottie.r r0 = com.bytedance.lottie.EnumC21130r.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.LottieAnimationView.C209303.f49526a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.r r0 = com.bytedance.lottie.EnumC21130r.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.lottie.LottieAnimationView.C209303.f49526a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.lottie.r r0 = com.bytedance.lottie.EnumC21130r.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.LottieAnimationView.C209303.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo34390a() {
        this.f49514l = true;
        setAutoRecycleBitmap(false);
        this.f49508f.f50046o = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f49512j && this.f49511i) {
            mo34398c();
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
        AbstractC1204m mVar = this.f49522u;
        if (mVar != null) {
            mVar.getLifecycle().mo4012a(this);
            return;
        }
        Activity a = C21080b.m39686a(getContext());
        if (a instanceof AbstractC1204m) {
            ((AbstractC1204m) a).getLifecycle().mo4012a(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f49527a = this.f49509g;
        savedState.f49528b = this.f49510h;
        savedState.f49529c = this.f49508f.f50033b.mo34542d();
        savedState.f49530d = this.f49508f.f50033b.isRunning();
        savedState.f49531e = this.f49508f.f50037f;
        savedState.f49532f = this.f49508f.f50033b.getRepeatMode();
        savedState.f49533g = this.f49508f.f50033b.getRepeatCount();
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (android.os.Build.VERSION.SDK_INT < 23) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r2 == false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m39386m() {
        /*
            r4 = this;
            int[] r1 = com.bytedance.lottie.LottieAnimationView.C209303.f49526a
            com.bytedance.lottie.r r0 = r4.f49516n
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r3 = 2
            r1 = 1
            if (r2 == r1) goto L_0x0039
            if (r2 == r3) goto L_0x0038
            r0 = 3
            if (r2 == r0) goto L_0x001e
        L_0x0013:
            int r0 = r4.getLayerType()
            if (r1 == r0) goto L_0x001d
            r0 = 0
            r4.setLayerType(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            com.bytedance.lottie.g r1 = r4.f49519q
            r0 = 0
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.f49983o
            if (r0 == 0) goto L_0x003e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x003e
        L_0x002d:
            r2 = 0
        L_0x002e:
            boolean r0 = com.bytedance.lottie.LottieAnimationView.f49503r
            if (r0 == 0) goto L_0x003b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x003b
        L_0x0038:
            r3 = 1
        L_0x0039:
            r1 = r3
            goto L_0x0013
        L_0x003b:
            if (r2 == 0) goto L_0x0038
            goto L_0x0039
        L_0x003e:
            com.bytedance.lottie.g r0 = r4.f49519q
            if (r0 == 0) goto L_0x0048
            int r1 = r0.f49984p
            r0 = 4
            if (r1 <= r0) goto L_0x0048
            goto L_0x002d
        L_0x0048:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 >= r0) goto L_0x004f
            goto L_0x002d
        L_0x004f:
            r2 = 1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.LottieAnimationView.m39386m():void");
    }

    public void onDetachedFromWindow() {
        if (this.f49508f.f50033b.isRunning()) {
            mo34416h();
            this.f49511i = true;
        }
        Activity a = C21080b.m39686a(getContext());
        if (!this.f49514l && (this.f49504a || (a != null && a.isFinishing()))) {
            this.f49508f.mo34580a();
        }
        super.onDetachedFromWindow();
        AbstractC1204m mVar = this.f49522u;
        if (mVar != null) {
            mVar.getLifecycle().mo4013b(this);
            return;
        }
        Activity a2 = C21080b.m39686a(getContext());
        if (a2 instanceof AbstractC1204m) {
            ((AbstractC1204m) a2).getLifecycle().mo4013b(this);
        }
    }

    public static void setOnlyAboveMUseHardware(boolean z) {
        f49503r = z;
    }

    public void setAnimationFromJson(String str) {
        mo34393a(str);
    }

    /* renamed from: a */
    public final void mo34391a(Animator.AnimatorListener animatorListener) {
        this.f49508f.f50033b.addListener(animatorListener);
    }

    public void setAutoRecycleBitmap(boolean z) {
        this.f49504a = z;
        this.f49508f.f50045n = z;
    }

    public void setFrame(int i) {
        this.f49508f.mo34590c(i);
    }

    public void setImageAssetsFolder(String str) {
        this.f49508f.f50037f = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        m39382a(drawable, true);
    }

    public void setMaxFrame(int i) {
        this.f49508f.mo34587b(i);
    }

    public void setMaxProgress(float f) {
        this.f49508f.mo34586b(f);
    }

    public void setMinFrame(int i) {
        this.f49508f.mo34582a(i);
    }

    public void setMinProgress(float f) {
        this.f49508f.mo34581a(f);
    }

    public void setProgress(float f) {
        this.f49508f.mo34589c(f);
    }

    public void setRenderMode(EnumC21130r rVar) {
        this.f49516n = rVar;
        m39386m();
    }

    public void setRepeatCount(int i) {
        this.f49508f.mo34593d(i);
    }

    public void setRepeatMode(int i) {
        this.f49508f.f50033b.setRepeatMode(i);
    }

    public void setSpeed(float f) {
        this.f49508f.f50033b.f49950a = f;
    }

    public void setTextDelegate(C21132t tVar) {
        this.f49508f.f50041j = tVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C21106i iVar = this.f49508f;
        if (drawable2 == iVar) {
            super.invalidateDrawable(iVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setFontAssetDelegate(C20971b bVar) {
        C21106i iVar = this.f49508f;
        iVar.f50040i = bVar;
        if (iVar.f50039h != null) {
            iVar.f50039h.f49697c = bVar;
        }
    }

    public void setImageAssetDelegate(AbstractC20975c cVar) {
        C21106i iVar = this.f49508f;
        iVar.f50038g = cVar;
        if (iVar.f50036e != null) {
            iVar.f50036e.f49703b = cVar;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        m39384k();
        m39385l();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i) {
        m39384k();
        m39385l();
        super.setImageResource(i);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C21106i iVar = this.f49508f;
        iVar.f50044m = z;
        if (iVar.f50032a != null) {
            iVar.f50032a.mo34563a(z);
        }
    }

    /* renamed from: a */
    private void m39383a(JsonReader jsonReader) {
        setCompositionTask(C21094h.m39739a(jsonReader, (String) null));
    }

    private void setCompositionTask(C21123o<C21088g> oVar) {
        this.f49519q = null;
        this.f49508f.mo34588c();
        m39385l();
        this.f49518p = oVar.mo34617a(this.f49506d).mo34622c(this.f49507e);
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && getHeight() != 0) {
            super.onDraw(canvas);
        }
    }

    public void setAnimation(int i) {
        this.f49510h = i;
        this.f49509g = null;
        setCompositionTask(C21094h.m39740a(C21094h.m39741a(i), new Callable<C21122n<C21088g>>(C21094h.m39732a(getContext()), i) {
            /* class com.bytedance.lottie.C21094h.CallableC211059 */

            /* renamed from: a */
            final /* synthetic */ Context f50029a;

            /* renamed from: b */
            final /* synthetic */ int f50030b;

            static {
                Covode.recordClassIndex(24721);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C21122n<C21088g> call() {
                return C21094h.m39734a(this.f50029a, this.f50030b);
            }

            {
                this.f50029a = r1;
                this.f50030b = r2;
            }
        }));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(new C21123o<>(new Callable<C21122n<C21088g>>() {
            /* class com.bytedance.lottie.p1503d.C21040c.CallableC210411 */

            static {
                Covode.recordClassIndex(24657);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C21122n<C21088g> call() {
                C21122n<C21088g> a;
                V v;
                MethodCollector.m26663i(10231);
                C21040c cVar = C21040c.this;
                C0692e<EnumC21038a, InputStream> a2 = cVar.f49924b.mo34517a();
                if (a2 != null) {
                    F f = a2.f2750a;
                    S s = a2.f2751b;
                    if (f == EnumC21038a.Zip) {
                        a = C21094h.m39738a(new ZipInputStream(s), cVar.f49923a);
                    } else {
                        a = C21094h.m39737a((InputStream) s, cVar.f49923a, true);
                    }
                    if (!(a.f50100a == null || (v = a.f50100a) == null)) {
                        C21122n nVar = new C21122n((Object) v);
                        MethodCollector.m26664o(10231);
                        return nVar;
                    }
                }
                C21122n<C21088g> a3 = cVar.mo34518a();
                MethodCollector.m26664o(10231);
                return a3;
            }
        }));
    }

    public void setScale(float f) {
        this.f49508f.mo34592d(f);
        if (getDrawable() == this.f49508f) {
            m39382a(null, false);
            m39382a(this.f49508f, false);
        }
    }

    public void buildDrawingCache(boolean z) {
        this.f49517o++;
        super.buildDrawingCache(z);
        if (this.f49517o == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(EnumC21130r.HARDWARE);
        }
        this.f49517o--;
    }

    public void setAnimation(String str) {
        this.f49509g = str;
        this.f49510h = 0;
        setCompositionTask(C21094h.m39740a(str, new Callable<C21122n<C21088g>>(C21094h.m39732a(getContext()), str) {
            /* class com.bytedance.lottie.C21094h.CallableC210951 */

            /* renamed from: a */
            final /* synthetic */ Context f50010a;

            /* renamed from: b */
            final /* synthetic */ String f50011b;

            static {
                Covode.recordClassIndex(24711);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C21122n<C21088g> call() {
                return C21094h.m39735a(this.f50010a, this.f50011b);
            }

            {
                this.f50010a = r1;
                this.f50011b = r2;
            }
        }));
    }

    /* renamed from: a */
    public final void mo34392a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f49508f.f50033b.addUpdateListener(animatorUpdateListener);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f49527a;
        this.f49509g = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f49509g);
        }
        int i = savedState.f49528b;
        this.f49510h = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f49529c);
        if (savedState.f49530d) {
            mo34398c();
        }
        this.f49508f.f50037f = savedState.f49531e;
        setRepeatMode(savedState.f49532f);
        setRepeatCount(savedState.f49533g);
    }

    /* renamed from: a */
    public final void mo34393a(String str) {
        m39383a(new JsonReader(new StringReader(str)));
    }

    public void setComposition(C21088g gVar) {
        this.f49508f.setCallback(this);
        this.f49519q = gVar;
        C21106i iVar = this.f49508f;
        boolean z = true;
        boolean z2 = false;
        if (iVar.f50032a == gVar) {
            z = false;
        } else {
            iVar.mo34588c();
            iVar.f50032a = gVar;
            iVar.mo34585b();
            Choreographer$FrameCallbackC21082d dVar = iVar.f50033b;
            if (dVar.f49955f == null) {
                z2 = true;
            }
            dVar.f49955f = gVar;
            if (z2) {
                dVar.mo34537a((int) Math.max(dVar.f49953d, gVar.f49977i), (int) Math.min(dVar.f49954e, gVar.f49978j));
            } else {
                dVar.mo34537a((int) gVar.f49977i, (int) gVar.f49978j);
            }
            dVar.mo34536a((int) dVar.f49952c);
            dVar.f49951b = System.nanoTime();
            iVar.mo34589c(iVar.f50033b.getAnimatedFraction());
            iVar.mo34592d(iVar.f50034c);
            iVar.mo34597g();
            Iterator it = new ArrayList(iVar.f50035d).iterator();
            while (it.hasNext()) {
                ((C21106i.AbstractC21117a) it.next()).mo34614a();
                it.remove();
            }
            iVar.f50035d.clear();
            gVar.mo34563a(iVar.f50044m);
        }
        m39386m();
        if (getDrawable() != this.f49508f || z) {
            setImageDrawable(null);
            setImageDrawable(this.f49508f);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (AbstractC21120l lVar : this.f49515m) {
                lVar.mo30320a(gVar);
            }
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        String string;
        C21106i iVar = new C21106i();
        this.f49508f = iVar;
        this.f49511i = false;
        this.f49512j = false;
        this.f49513k = false;
        this.f49504a = true;
        this.f49514l = false;
        this.f49515m = new HashSet();
        this.f49516n = EnumC21130r.AUTOMATIC;
        this.f49517o = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.js, R.attr.a3w, R.attr.a3x, R.attr.a3y, R.attr.a3z, R.attr.a40, R.attr.a41, R.attr.a42, R.attr.a43, R.attr.a44, R.attr.a45, R.attr.a46, R.attr.a47, R.attr.a48, R.attr.a49});
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(10);
            boolean hasValue2 = obtainStyledAttributes.hasValue(6);
            boolean hasValue3 = obtainStyledAttributes.hasValue(14);
            if (hasValue) {
                if (!hasValue2) {
                    int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(6);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(14)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.f49511i = true;
            this.f49512j = true;
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        this.f49504a = z;
        iVar.f50045n = z;
        if (obtainStyledAttributes.getBoolean(8, false)) {
            iVar.mo34593d(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(7));
        setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
        mo34394a(obtainStyledAttributes.getBoolean(5, false));
        if (obtainStyledAttributes.hasValue(4)) {
            iVar.mo34583a(new C21033e("**"), AbstractC21121m.f50099x, new C21091c(new C21131s(obtainStyledAttributes.getColor(4, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            iVar.mo34592d(obtainStyledAttributes.getFloat(13, 1.0f));
        }
        obtainStyledAttributes.recycle();
        m39386m();
    }

    /* renamed from: a */
    public final void mo34394a(boolean z) {
        this.f49508f.mo34584a(z);
    }

    /* renamed from: a */
    public final boolean mo34395a(AbstractC21120l lVar) {
        return this.f49515m.add(lVar);
    }

    /* renamed from: a */
    private void m39382a(Drawable drawable, boolean z) {
        if (z && drawable != this.f49508f) {
            m39384k();
        }
        m39385l();
        super.setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f49508f == null) {
            return;
        }
        if (i != 0 || !isShown()) {
            if (this.f49523v) {
                this.f49523v = false;
                boolean isRunning = this.f49508f.f50033b.isRunning();
                if (!this.f49521t) {
                    this.f49520s = isRunning;
                }
                if (isRunning) {
                    mo34417i();
                }
            }
        } else if (!this.f49523v) {
            this.f49523v = true;
            if (!this.f49521t && this.f49520s) {
                mo34399d();
            }
        }
    }
}

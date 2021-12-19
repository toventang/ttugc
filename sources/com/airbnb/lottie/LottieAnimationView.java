package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.p037h.C0792v;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.C2199j;
import com.airbnb.lottie.p096b.C2034a;
import com.airbnb.lottie.p097c.C2039a;
import com.airbnb.lottie.p097c.C2040b;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.C2106g;
import com.airbnb.lottie.p099e.p102c.C2091b;
import com.airbnb.lottie.p103f.C2120c;
import com.airbnb.lottie.p104g.C2139a;
import com.airbnb.lottie.p104g.C2142b;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p105h.C2176q;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: a */
    public static final EnumC1987a f5898a = EnumC1987a.Weak;

    /* renamed from: e */
    private static final String f5899e = LottieAnimationView.class.getSimpleName();

    /* renamed from: b */
    public final C2122g f5900b = new C2122g();

    /* renamed from: c */
    public boolean f5901c = false;

    /* renamed from: d */
    public boolean f5902d = false;

    /* renamed from: f */
    private final AbstractC2186i<C2044e> f5903f = new AbstractC2186i<C2044e>() {
        /* class com.airbnb.lottie.LottieAnimationView.C19801 */

        static {
            Covode.recordClassIndex(2174);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.AbstractC2186i
        /* renamed from: a */
        public final /* synthetic */ void mo5889a(C2044e eVar) {
            LottieAnimationView.this.setComposition(eVar);
        }
    };

    /* renamed from: g */
    private final AbstractC2186i<Throwable> f5904g = new AbstractC2186i<Throwable>() {
        /* class com.airbnb.lottie.LottieAnimationView.C19812 */

        static {
            Covode.recordClassIndex(2175);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.AbstractC2186i
        /* renamed from: a */
        public final /* synthetic */ void mo5889a(Throwable th) {
            Throwable th2 = th;
            if (!C2144d.C2145a.f6479a || (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException))) {
                C2199j a = C2199j.C2200a.m6800a();
                IllegalStateException illegalStateException = new IllegalStateException("Unable to parse composition", th2);
                C2106g.f6360a.f6361b.mo2098c().keySet();
                if (C2108f.f6364a != null) {
                    C2108f.f6364a.keySet();
                }
                a.mo6120a(illegalStateException);
            }
        }
    };

    /* renamed from: h */
    private boolean f5905h;

    /* renamed from: i */
    private EnumC1987a f5906i;

    /* renamed from: j */
    private String f5907j;

    /* renamed from: k */
    private int f5908k;

    /* renamed from: l */
    private boolean f5909l = false;

    /* renamed from: m */
    private boolean f5910m = false;

    /* renamed from: n */
    private boolean f5911n = false;

    /* renamed from: o */
    private boolean f5912o = false;

    /* renamed from: p */
    private boolean f5913p = false;

    /* renamed from: q */
    private boolean f5914q = false;

    /* renamed from: r */
    private boolean f5915r = false;

    /* renamed from: s */
    private EnumC2215p f5916s = EnumC2215p.AUTOMATIC;

    /* renamed from: t */
    private int f5917t = 0;

    /* renamed from: u */
    private final Set<Object> f5918u = new HashSet();

    /* renamed from: v */
    private C2208m f5919v;

    /* renamed from: w */
    private C2044e f5920w;

    public String getAnimationName() {
        return this.f5907j;
    }

    public C2044e getComposition() {
        return this.f5920w;
    }

    public boolean getUseHardwareAcceleration() {
        return this.f5901c;
    }

    /* renamed from: g */
    private void mo85726g() {
        C2122g gVar = this.f5900b;
        if (gVar != null) {
            gVar.mo6004a();
        }
    }

    public int getFrame() {
        return (int) this.f5900b.f6397b.f6538b;
    }

    public String getImageAssetsFolder() {
        return this.f5900b.f6402g;
    }

    public float getScale() {
        return this.f5900b.f6398c;
    }

    public float getSpeed() {
        return this.f5900b.f6397b.f6537a;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.airbnb.lottie.LottieAnimationView.SavedState.C19861 */

            static {
                Covode.recordClassIndex(2181);
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
        String f5929a;

        /* renamed from: b */
        int f5930b;

        /* renamed from: c */
        float f5931c;

        /* renamed from: d */
        boolean f5932d;

        /* renamed from: e */
        String f5933e;

        /* renamed from: f */
        int f5934f;

        /* renamed from: g */
        int f5935g;

        static {
            Covode.recordClassIndex(2180);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f5929a = parcel.readString();
            this.f5931c = parcel.readFloat();
            this.f5932d = parcel.readInt() != 1 ? false : true;
            this.f5933e = parcel.readString();
            this.f5934f = parcel.readInt();
            this.f5935g = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5929a);
            parcel.writeFloat(this.f5931c);
            parcel.writeInt(this.f5932d ? 1 : 0);
            parcel.writeString(this.f5933e);
            parcel.writeInt(this.f5934f);
            parcel.writeInt(this.f5935g);
        }
    }

    /* renamed from: i */
    private boolean m6286i() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m6287j() {
        this.f5920w = null;
        this.f5900b.mo6019d();
    }

    public long getDuration() {
        C2044e eVar = this.f5920w;
        if (eVar != null) {
            return (long) eVar.mo5941a();
        }
        return 0;
    }

    public float getMaxFrame() {
        return this.f5900b.f6397b.mo6113k();
    }

    public float getMinFrame() {
        return this.f5900b.f6397b.mo6112j();
    }

    public C2213o getPerformanceTracker() {
        C2122g gVar = this.f5900b;
        if (gVar.f6396a != null) {
            return gVar.f6396a.f6137a;
        }
        return null;
    }

    public float getProgress() {
        return this.f5900b.f6397b.mo6101d();
    }

    public int getRepeatCount() {
        return this.f5900b.f6397b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f5900b.f6397b.getRepeatMode();
    }

    static {
        Covode.recordClassIndex(2173);
    }

    /* renamed from: h */
    private void mo85727h() {
        C2208m mVar = this.f5919v;
        if (mVar != null) {
            mVar.mo6135b((AbstractC2186i) this.f5903f);
            this.f5919v.mo6137d(this.f5904g);
        }
    }

    /* renamed from: c */
    public final void mo5835c() {
        C2122g gVar = this.f5900b;
        gVar.f6397b.removeAllListeners();
        if (gVar.f6416u != null) {
            gVar.f6397b.addListener(gVar.f6416u);
        }
    }

    /* renamed from: d */
    public final void mo5836d() {
        this.f5913p = false;
        this.f5912o = false;
        this.f5909l = false;
        this.f5911n = false;
        this.f5910m = false;
        this.f5900b.mo6031i();
        mo5838f();
    }

    /* renamed from: e */
    public final void mo5837e() {
        this.f5914q = false;
        this.f5913p = false;
        this.f5912o = false;
        this.f5909l = false;
        this.f5911n = false;
        this.f5910m = false;
        this.f5900b.mo6035j();
        mo5838f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$6 */
    public static /* synthetic */ class C19856 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5928a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 2179(0x883, float:3.053E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.p[] r0 = com.airbnb.lottie.EnumC2215p.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.LottieAnimationView.C19856.f5928a = r2
                com.airbnb.lottie.p r0 = com.airbnb.lottie.EnumC2215p.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.LottieAnimationView.C19856.f5928a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.p r0 = com.airbnb.lottie.EnumC2215p.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.airbnb.lottie.LottieAnimationView.C19856.f5928a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.airbnb.lottie.p r0 = com.airbnb.lottie.EnumC2215p.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C19856.<clinit>():void");
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public enum EnumC1987a {
        None,
        Weak,
        Strong;

        static {
            Covode.recordClassIndex(2182);
        }
    }

    /* renamed from: b */
    public final void mo5831b() {
        if (C2144d.C2145a.f6479a) {
            if (m6286i()) {
                Drawable drawable = getDrawable();
                C2122g gVar = this.f5900b;
                if (drawable != gVar) {
                    this.f5911n = true;
                    return;
                } else {
                    gVar.mo6024f();
                    mo5838f();
                }
            } else {
                this.f5909l = false;
                this.f5912o = true;
            }
            this.f5910m = false;
            this.f5911n = false;
            return;
        }
        this.f5900b.mo6024f();
        mo5838f();
    }

    public void onDetachedFromWindow() {
        C2122g gVar = this.f5900b;
        if (C2144d.f6474a) {
            isShown();
            getVisibility();
            hashCode();
            if (gVar != null) {
                Integer.valueOf(gVar.hashCode());
            }
            isShown();
            C2144d.m6678a();
        }
        if (this.f5900b.mo6025g()) {
            mo5836d();
            this.f5913p = true;
        }
        if (!this.f5915r) {
            try {
                mo85726g();
            } catch (Exception unused) {
            }
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo5826a() {
        if (C2144d.C2145a.f6479a) {
            if (m6286i()) {
                Drawable drawable = getDrawable();
                C2122g gVar = this.f5900b;
                if (drawable != gVar) {
                    this.f5910m = true;
                    return;
                } else {
                    gVar.mo6023e();
                    mo5838f();
                }
            } else {
                this.f5909l = true;
            }
            this.f5910m = false;
            this.f5911n = false;
            return;
        }
        this.f5900b.mo6023e();
        mo5838f();
    }

    /* renamed from: f */
    public final void mo5838f() {
        boolean z;
        try {
            int i = 2;
            int i2 = 1;
            if (!C2144d.C2145a.f6479a || this.f5902d || !C2144d.C2145a.f6483e) {
                if (!this.f5901c || !this.f5900b.mo6025g()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!C2144d.C2145a.f6479a || !C2144d.C2145a.f6482d || !this.f5900b.f6415t) {
                    if (z) {
                        setLayerType(i, null);
                        return;
                    }
                }
                i = 1;
                setLayerType(i, null);
                return;
            }
            int i3 = C19856.f5928a[this.f5916s.ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 == 3) {
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                }
                i = 1;
            }
            if (!C2144d.C2145a.f6482d || !this.f5900b.f6415t) {
                i2 = i;
            }
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        } catch (Throwable unused) {
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2122g gVar = this.f5900b;
        if (C2144d.f6474a) {
            isShown();
            getVisibility();
            hashCode();
            if (gVar != null) {
                Integer.valueOf(gVar.hashCode());
            }
            isShown();
            C2144d.m6678a();
        }
        if (C2144d.C2145a.f6479a) {
            if (!isInEditMode() && (this.f5914q || this.f5913p)) {
                mo5826a();
                this.f5914q = false;
                this.f5913p = false;
            }
            if (Build.VERSION.SDK_INT < 23) {
                onVisibilityChanged(this, getVisibility());
            }
        } else if (this.f5914q || this.f5913p) {
            mo5826a();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5929a = this.f5907j;
        savedState.f5930b = this.f5908k;
        savedState.f5931c = this.f5900b.f6397b.mo6101d();
        if (C2144d.C2145a.f6479a) {
            if (this.f5900b.mo6025g() || (!C0792v.m2791y(this) && this.f5913p)) {
                z = true;
            } else {
                z = false;
            }
            savedState.f5932d = z;
        } else {
            savedState.f5932d = this.f5900b.mo6025g();
        }
        savedState.f5933e = this.f5900b.f6402g;
        savedState.f5934f = this.f5900b.f6397b.getRepeatMode();
        savedState.f5935g = this.f5900b.f6397b.getRepeatCount();
        return savedState;
    }

    /* renamed from: b */
    public final void mo5832b(Animator.AnimatorListener animatorListener) {
        this.f5900b.f6397b.removeListener(animatorListener);
    }

    public void setAnimation(JsonReader jsonReader) {
        mo5829a(jsonReader, (String) null);
    }

    public void setFrame(int i) {
        this.f5900b.mo6018c(i);
    }

    public void setImageAssetsFolder(String str) {
        this.f5900b.f6402g = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        m6281a(drawable, true);
    }

    public void setMaxFrame(int i) {
        this.f5900b.mo6015b(i);
    }

    public void setMaxProgress(float f) {
        this.f5900b.mo6014b(f);
    }

    public void setMinFrame(int i) {
        this.f5900b.mo6006a(i);
    }

    public void setMinProgress(float f) {
        this.f5900b.mo6005a(f);
    }

    public void setProgress(float f) {
        this.f5900b.mo6017c(f);
    }

    public void setRenderMode(EnumC2215p pVar) {
        this.f5916s = pVar;
        mo5838f();
    }

    public void setRepeatCount(int i) {
        this.f5900b.mo6021d(i);
    }

    public void setRepeatMode(int i) {
        this.f5900b.f6397b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f5900b.f6400e = z;
    }

    public void setSpeed(float f) {
        this.f5900b.f6397b.f6537a = f;
    }

    public void setTextDelegate(C2217r rVar) {
        this.f5900b.f6406k = rVar;
    }

    /* renamed from: b */
    public final void mo5833b(boolean z) {
        int i;
        C2122g gVar = this.f5900b;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        gVar.mo6021d(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C2122g gVar = this.f5900b;
        if (drawable2 == gVar) {
            super.invalidateDrawable(gVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setFailureListener(AbstractC2186i<Throwable> iVar) {
        C2208m mVar = this.f5919v;
        if (mVar != null) {
            mVar.mo6137d(this.f5904g);
            this.f5919v.mo6136c(iVar);
        }
    }

    public void setFontAssetDelegate(C2033b bVar) {
        C2122g gVar = this.f5900b;
        gVar.f6405j = bVar;
        if (gVar.f6404i != null) {
            gVar.f6404i.f6130e = bVar;
        }
    }

    public void setImageAssetDelegate(AbstractC2038c cVar) {
        C2122g gVar = this.f5900b;
        gVar.f6403h = cVar;
        if (gVar.f6401f != null) {
            gVar.f6401f.f6134b = cVar;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        try {
            mo85726g();
        } catch (Exception unused) {
        }
        mo85727h();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i) {
        try {
            mo85726g();
        } catch (Exception unused) {
        }
        mo85727h();
        super.setImageResource(i);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C2122g gVar = this.f5900b;
        gVar.f6409n = z;
        if (gVar.f6396a != null) {
            gVar.f6396a.mo5944a(z);
        }
    }

    /* renamed from: a */
    public final void mo5828a(Animator.AnimatorListener animatorListener) {
        this.f5900b.f6397b.addListener(animatorListener);
    }

    public void setAnimation(JSONObject jSONObject) {
        C2144d.m6679a(this, this.f5900b, "json object");
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    public void setAnimationFromJson(String str) {
        C2144d.m6679a(this, this.f5900b, "jsonString");
        mo5829a(new JsonReader(new StringReader(str)), (String) null);
    }

    public void setDrawFpsTracerOutputListener(C2139a.AbstractC2141b bVar) {
        C2122g gVar = this.f5900b;
        if (C2142b.f6470c) {
            C2142b.m6674a(gVar);
            if (gVar != null) {
                if (gVar.f6410o != null) {
                    gVar.f6410o.mo6058a(bVar);
                }
            } else if (C2142b.f6468a != null) {
                C2142b.f6468a.mo6058a(bVar);
            }
        }
    }

    public void setScale(float f) {
        this.f5900b.mo6020d(f);
        if (getDrawable() == this.f5900b) {
            m6281a((Drawable) null, false);
            m6281a((Drawable) this.f5900b, false);
        }
    }

    public void unscheduleDrawable(Drawable drawable) {
        if (C2144d.C2145a.f6479a && drawable != this.f5900b && (drawable instanceof C2122g)) {
            C2122g gVar = (C2122g) drawable;
            if (gVar.mo6025g()) {
                gVar.mo6031i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context) {
        super(context);
        m6282a((AttributeSet) null);
    }

    public void setAnimationFromUrl(String str) {
        C2144d.m6679a(this, this.f5900b, str);
        m6287j();
        mo85727h();
        this.f5919v = C2120c.m6608a(getContext(), str).mo6130a(this.f5903f).mo6136c(this.f5904g);
    }

    public void buildDrawingCache(boolean z) {
        if (!C2144d.C2145a.f6479a) {
            super.buildDrawingCache(z);
        } else if (!this.f5900b.mo6038m()) {
            C2041d.m6462b("buildDrawingCache");
            this.f5917t++;
            super.buildDrawingCache(z);
            if (this.f5917t == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
                setRenderMode(EnumC2215p.HARDWARE);
            }
            this.f5917t--;
            C2041d.m6463c("buildDrawingCache");
        }
    }

    public Bitmap getDrawingCache(boolean z) {
        if (C2144d.C2145a.f6479a && this.f5900b.mo6038m()) {
            C2122g gVar = this.f5900b;
            if (gVar.f6411p != null) {
                C2034a aVar = gVar.f6411p;
                Bitmap bitmap = gVar.f6417v;
                Bitmap a = C2040b.m6459a(aVar.f6106a);
                if (a != null) {
                    if (!(bitmap == null || aVar.f6108c == null)) {
                        aVar.f6108c.post(new Runnable(bitmap) {
                            /* class com.airbnb.lottie.p096b.C2034a.RunnableC20351 */

                            /* renamed from: a */
                            final /* synthetic */ Bitmap f6112a;

                            static {
                                Covode.recordClassIndex(2230);
                            }

                            public final void run() {
                                MethodCollector.m26663i(13297);
                                C2122g gVar = C2034a.this.f6106a;
                                Bitmap bitmap = this.f6112a;
                                C89219l.m154719c(gVar, "");
                                C89219l.m154719c(bitmap, "");
                                ArrayList<Bitmap> arrayList = C2039a.f6116a.get(Integer.valueOf(gVar.hashCode()));
                                if (arrayList != null) {
                                    synchronized (arrayList) {
                                        try {
                                            if (!arrayList.contains(bitmap)) {
                                                arrayList.add(bitmap);
                                            }
                                        } finally {
                                            MethodCollector.m26664o(13297);
                                        }
                                    }
                                    return;
                                }
                                MethodCollector.m26664o(13297);
                            }

                            {
                                this.f6112a = r2;
                            }
                        });
                    }
                    C2142b.m6675a(aVar.f6106a, true);
                    bitmap = a;
                } else {
                    C2142b.m6675a(aVar.f6106a, false);
                }
                gVar.f6417v = bitmap;
                gVar.f6399d = false;
                if (bitmap != null) {
                    return bitmap;
                }
            }
        }
        return super.getDrawingCache(z);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            if (!(parcelable instanceof SavedState)) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            String str = savedState.f5929a;
            this.f5907j = str;
            if (!TextUtils.isEmpty(str)) {
                setAnimation(this.f5907j);
            }
            int i = savedState.f5930b;
            this.f5908k = i;
            if (i != 0) {
                setAnimation(i);
            }
            setProgress(savedState.f5931c);
            if (savedState.f5932d) {
                mo5826a();
            }
            this.f5900b.f6402g = savedState.f5933e;
            setRepeatMode(savedState.f5934f);
            setRepeatCount(savedState.f5935g);
        } catch (Throwable unused) {
        }
    }

    public void setAnimation(final int i) {
        C2144d.m6679a(this, this.f5900b, Integer.valueOf(i));
        this.f5908k = i;
        this.f5907j = null;
        C2044e a = C2106g.f6360a.mo5983a(Integer.toString(i));
        if (a != null) {
            setComposition(a);
            return;
        }
        m6287j();
        mo85727h();
        this.f5919v = C2108f.m6594a(C2108f.m6595a(i), new Callable<C2207l<C2044e>>(C2108f.m6598b(getContext()), i) {
            /* class com.airbnb.lottie.C2108f.CallableC21135 */

            /* renamed from: a */
            final /* synthetic */ Context f6371a;

            /* renamed from: b */
            final /* synthetic */ int f6372b;

            static {
                Covode.recordClassIndex(2308);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C2207l<C2044e> call() {
                return C2108f.m6588a(this.f6371a, this.f6372b);
            }

            {
                this.f6371a = r1;
                this.f6372b = r2;
            }
        }).mo6130a((AbstractC2186i<C2044e>) new AbstractC2186i<C2044e>() {
            /* class com.airbnb.lottie.LottieAnimationView.C19823 */

            static {
                Covode.recordClassIndex(2176);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.airbnb.lottie.AbstractC2186i
            /* renamed from: a */
            public final /* synthetic */ void mo5889a(C2044e eVar) {
                C2106g.f6360a.mo5984a(Integer.toString(i), eVar);
            }
        }).mo6130a(this.f5903f).mo6136c(this.f5904g);
    }

    public void setCompositionAfter(boolean z) {
        mo5838f();
        if (getDrawable() != this.f5900b || z) {
            if (C2144d.C2145a.f6479a) {
                m6281a((Drawable) null, false);
                m6281a((Drawable) this.f5900b, false);
                onVisibilityChanged(this, getVisibility());
            } else {
                setImageDrawable(null);
                setImageDrawable(this.f5900b);
            }
            requestLayout();
            if (!C2144d.C2145a.f6489k) {
                Iterator<Object> it = this.f5918u.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } else if (this.f5918u.size() > 0) {
                this.f5918u.toArray();
            }
        } else if (C2144d.C2145a.f6479a) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void setAnimation(final String str) {
        C2144d.m6679a(this, this.f5900b, str);
        this.f5907j = str;
        this.f5908k = 0;
        C2044e a = C2106g.f6360a.mo5983a(str);
        if (a != null) {
            setComposition(a);
            return;
        }
        m6287j();
        mo85727h();
        this.f5919v = C2108f.m6594a(str, new Callable<C2207l<C2044e>>(C2108f.m6598b(getContext()), str) {
            /* class com.airbnb.lottie.C2108f.CallableC21124 */

            /* renamed from: a */
            final /* synthetic */ Context f6369a;

            /* renamed from: b */
            final /* synthetic */ String f6370b;

            static {
                Covode.recordClassIndex(2307);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ C2207l<C2044e> call() {
                return C2108f.m6599b(this.f6369a, this.f6370b);
            }

            {
                this.f6369a = r1;
                this.f6370b = r2;
            }
        }).mo6130a((AbstractC2186i<C2044e>) new AbstractC2186i<C2044e>() {
            /* class com.airbnb.lottie.LottieAnimationView.C19834 */

            static {
                Covode.recordClassIndex(2177);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.airbnb.lottie.AbstractC2186i
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo5889a(C2044e eVar) {
                C2106g.f6360a.mo5984a(str, eVar);
            }
        }).mo6130a(this.f5903f).mo6136c(this.f5904g);
    }

    public void setComposition(C2044e eVar) {
        this.f5900b.setCallback(this);
        this.f5920w = eVar;
        boolean z = false;
        if (!C2144d.C2145a.f6479a || !C2144d.C2145a.f6480b || !(getDrawable() == null || getDrawable() == this.f5900b)) {
            C2122g gVar = this.f5900b;
            if (C2144d.f6474a) {
                gVar.hashCode();
                gVar.isVisible();
                C2144d.m6678a();
            }
            if (gVar.f6396a != eVar) {
                if (C2144d.C2145a.f6479a) {
                    gVar.f6399d = false;
                }
                gVar.mo6019d();
                gVar.f6396a = eVar;
                gVar.mo6036k();
                gVar.mo6016c();
                gVar.mo6013b();
                z = true;
            }
            setCompositionAfter(z);
            return;
        }
        C2122g gVar2 = this.f5900b;
        C19845 r1 = new C2144d.AbstractC2147c() {
            /* class com.airbnb.lottie.LottieAnimationView.C19845 */

            static {
                Covode.recordClassIndex(2178);
            }

            @Override // com.airbnb.lottie.p104g.C2144d.AbstractC2147c
            /* renamed from: a */
            public final void mo5890a(boolean z) {
                LottieAnimationView.this.setCompositionAfter(z);
            }
        };
        if (C2144d.f6474a) {
            gVar2.hashCode();
            gVar2.isVisible();
            C2144d.m6678a();
        }
        if (gVar2.f6396a == eVar) {
            r1.mo5890a(false);
            return;
        }
        if (C2144d.C2145a.f6479a) {
            gVar2.f6399d = false;
        }
        gVar2.mo6037l();
        gVar2.f6396a = eVar;
        gVar2.mo6036k();
        C2208m.f6623a.execute(new Runnable(eVar, new C2144d.AbstractC2148d(eVar, r1) {
            /* class com.airbnb.lottie.C2122g.C21325 */

            /* renamed from: a */
            final /* synthetic */ C2044e f6441a;

            /* renamed from: b */
            final /* synthetic */ C2144d.AbstractC2147c f6442b;

            static {
                Covode.recordClassIndex(2327);
            }

            @Override // com.airbnb.lottie.p104g.C2144d.AbstractC2148d
            /* renamed from: a */
            public final void mo6049a(C2091b bVar) {
                if (!C2122g.this.mo6012a(this.f6441a)) {
                    C2122g.this.invalidateSelf();
                    if (bVar != null) {
                        C2122g.this.f6408m = bVar;
                        if (C2144d.C2145a.f6479a) {
                            C2122g.this.mo6040o();
                        }
                    } else {
                        C2122g.this.mo6016c();
                    }
                    C2122g.this.mo6013b();
                    C2144d.AbstractC2147c cVar = this.f6442b;
                    if (cVar != null) {
                        cVar.mo5890a(true);
                    }
                }
            }

            {
                this.f6441a = r2;
                this.f6442b = r3;
            }
        }) {
            /* class com.airbnb.lottie.C2122g.RunnableC21336 */

            /* renamed from: a */
            final /* synthetic */ C2044e f6444a;

            /* renamed from: b */
            final /* synthetic */ C2144d.AbstractC2148d f6445b;

            static {
                Covode.recordClassIndex(2328);
            }

            public final void run() {
                final C2091b bVar;
                if (!C2122g.this.mo6012a(this.f6444a)) {
                    try {
                        bVar = new C2091b(C2122g.this, C2176q.m6746a(this.f6444a), this.f6444a.f6143g, this.f6444a);
                    } catch (Throwable unused) {
                        bVar = null;
                    }
                    if (!C2122g.this.mo6012a(this.f6444a)) {
                        if (C2144d.f6477d == null) {
                            C2144d.f6477d = new Handler(Looper.getMainLooper());
                        }
                        C2144d.f6477d.post(new Runnable() {
                            /* class com.airbnb.lottie.C2122g.RunnableC21336.RunnableC21341 */

                            static {
                                Covode.recordClassIndex(2329);
                            }

                            public final void run() {
                                RunnableC21336.this.f6445b.mo6049a(bVar);
                            }
                        });
                    }
                }
            }

            {
                this.f6444a = r2;
                this.f6445b = r3;
            }
        });
    }

    /* renamed from: a */
    private void m6282a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a3t, R.attr.a3u, R.attr.a3v, R.attr.a4_, R.attr.a4a, R.attr.a4b, R.attr.a4c, R.attr.a4d, R.attr.a4e, R.attr.a4f, R.attr.a4g, R.attr.a4h, R.attr.a4i});
        this.f5906i = EnumC1987a.values()[obtainStyledAttributes.getInt(1, f5898a.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(12);
            if (hasValue) {
                if (!hasValue2) {
                    int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(4);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(12)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f5913p = true;
            this.f5914q = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f5900b.mo6021d(-1);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatMode(obtainStyledAttributes.getInt(10, 1));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            setRepeatCount(obtainStyledAttributes.getInt(9, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(5));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        mo5830a(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            m6283a(new C2104e("**"), AbstractC2206k.f6593C, new C2204c(new C2216q(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f5900b.mo6020d(obtainStyledAttributes.getFloat(11, 1.0f));
        }
        if (C2144d.C2145a.f6479a && C2144d.C2145a.f6482d) {
            this.f5900b.mo6009a(this);
        }
        obtainStyledAttributes.recycle();
        mo5838f();
        if (C2144d.C2145a.f6479a) {
            this.f5905h = true;
            C2108f.m6597a(getContext());
        }
    }

    /* renamed from: a */
    public final void mo5830a(boolean z) {
        this.f5900b.mo6011a(z);
    }

    /* renamed from: a */
    public final void mo5827a(int i, int i2) {
        this.f5900b.mo6007a(i, i2);
    }

    /* renamed from: a */
    private void m6281a(Drawable drawable, boolean z) {
        C2122g gVar;
        if (z && drawable != this.f5900b) {
            try {
                mo85726g();
            } catch (Exception unused) {
            }
        }
        mo85727h();
        super.setImageDrawable(drawable);
        if (C2144d.C2145a.f6479a && this.f5905h && drawable == (gVar = this.f5900b)) {
            if (!gVar.mo6025g()) {
                if (this.f5910m) {
                    mo5826a();
                } else if (this.f5911n) {
                    mo5831b();
                }
            }
            this.f5910m = false;
            this.f5911n = false;
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6282a(attributeSet);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (C2144d.C2145a.f6479a && this.f5905h) {
            if (m6286i()) {
                if (this.f5912o) {
                    mo5831b();
                } else if (this.f5909l) {
                    mo5826a();
                }
                this.f5912o = false;
                this.f5909l = false;
            } else if (this.f5900b.mo6025g()) {
                mo5837e();
                this.f5912o = true;
            }
            C2122g gVar = this.f5900b;
            if (C2144d.f6474a) {
                isShown();
                getVisibility();
                hashCode();
                if (gVar != null) {
                    Integer.valueOf(gVar.hashCode());
                }
                isShown();
                C2144d.m6678a();
            }
        }
    }

    /* renamed from: a */
    public final void mo5829a(JsonReader jsonReader, String str) {
        C2144d.m6679a(this, this.f5900b, "jsonReader");
        m6287j();
        mo85727h();
        this.f5919v = C2108f.m6592a(jsonReader, str).mo6130a(this.f5903f).mo6136c(this.f5904g);
    }

    /* renamed from: a */
    private <T> void m6283a(C2104e eVar, T t, C2204c<T> cVar) {
        this.f5900b.mo6010a(eVar, t, cVar);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        m6282a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C2122g gVar;
        super.onSizeChanged(i, i2, i3, i4);
        if (C2144d.C2145a.f6479a && C2144d.C2145a.f6482d && (gVar = this.f5900b) != null) {
            if (C2144d.f6474a) {
                gVar.hashCode();
                gVar.isVisible();
                C2144d.m6678a();
            }
            gVar.f6418w = i;
            gVar.f6419x = i2;
        }
    }
}

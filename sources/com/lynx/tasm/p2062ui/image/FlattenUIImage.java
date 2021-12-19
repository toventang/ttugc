package com.lynx.tasm.p2062ui.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1888m.C24471b;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.AbstractC28618d;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.behavior.p2052ui.utils.C28683b;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.p2054c.C28728f;
import com.lynx.tasm.p2062ui.image.C28901j;
import com.lynx.tasm.p2062ui.image.p2063a.C28873b;
import com.lynx.tasm.p2062ui.image.p2064b.C28877a;
import com.lynx.tasm.p2062ui.image.p2064b.C28885c;
import com.lynx.tasm.utils.C28929m;
import com.lynx.tasm.utils.C28930n;

/* renamed from: com.lynx.tasm.ui.image.FlattenUIImage */
public class FlattenUIImage extends LynxFlattenUI implements Drawable.Callback, C28901j.AbstractC28908a {

    /* renamed from: b */
    protected final C28901j f68121b;

    /* renamed from: c */
    final Handler f68122c;

    /* renamed from: d */
    public Drawable f68123d;

    /* renamed from: e */
    String f68124e;

    /* renamed from: f */
    String f68125f;

    /* renamed from: g */
    public String f68126g;

    /* renamed from: h */
    private C28877a f68127h;

    /* renamed from: i */
    private int f68128i;

    /* renamed from: j */
    private boolean f68129j;

    /* renamed from: k */
    private float f68130k = -1.0f;

    /* renamed from: l */
    private float f68131l = -1.0f;

    /* renamed from: m */
    private boolean f68132m;

    /* renamed from: n */
    private C24117a<?> f68133n;

    /* renamed from: o */
    private C24229q.AbstractC24231b f68134o = C24229q.AbstractC24231b.f57452b;

    /* renamed from: p */
    private boolean f68135p;

    /* renamed from: q */
    private boolean f68136q;

    /* renamed from: r */
    private boolean f68137r;

    static {
        Covode.recordClassIndex(34966);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.LynxFlattenUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            switch (nextKey.hashCode()) {
                case -1937917490:
                    if (nextKey.equals("cap-insets-scale")) {
                        setCapInsetsScale(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1338903714:
                    if (nextKey.equals("skip-redirection")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSkipRedirection(z);
                        continue;
                    }
                    break;
                case -1138223116:
                    if (nextKey.equals("image-config")) {
                        setImageConfig(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -934531685:
                    if (nextKey.equals("repeat")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setRepeat(z3);
                        continue;
                    }
                    break;
                case -629825370:
                    if (nextKey.equals("loop-count")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setLoopCount(i);
                        continue;
                    }
                    break;
                case -602643660:
                    if (nextKey.equals("fresco-nine-patch")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setFrescoNinePatch(z2);
                        continue;
                    }
                    break;
                case -256430480:
                    if (nextKey.equals("prefetch-width")) {
                        setPreFetchWidth(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSource(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 207594941:
                    if (nextKey.equals("prefetch-height")) {
                        setPreFetchHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 313009824:
                    if (nextKey.equals("local-cache")) {
                        setLocalCache(readableMap.isNull(nextKey) ? null : Boolean.valueOf(readableMap.getBoolean(nextKey, false)));
                        continue;
                    }
                    break;
                case 516005201:
                    if (nextKey.equals("cap-insets")) {
                        setCapInsetsBackUp(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 598246771:
                    if (nextKey.equals("placeholder")) {
                        setPlaceholder(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 681292984:
                    if (nextKey.equals("blur-radius")) {
                        setBlurRadius(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1515751784:
                    if (nextKey.equals("capInsets")) {
                        setCapInsets(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.p2062ui.image.C28901j.AbstractC28908a
    /* renamed from: O_ */
    public final void mo49986O_() {
        m57798c();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void renderIfNeeded() {
        m57797b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        this.f68121b.mo50111b();
        C28877a aVar = this.f68127h;
        if (aVar != null) {
            aVar.mo50090a();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        m57798c();
        m57797b();
    }

    /* renamed from: c */
    private void m57798c() {
        Drawable drawable = this.f68123d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        this.f68121b.mo50111b();
        C28877a aVar = this.f68127h;
        if (aVar != null) {
            aVar.mo50090a();
        }
        C24117a<?> aVar2 = this.f68133n;
        if (aVar2 != null) {
            aVar2.close();
            this.f68133n = null;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.LynxFlattenUI
    public void onAttach() {
        super.onAttach();
        this.f68121b.mo50106a();
        this.f68121b.f68300n = true;
        m57797b();
    }

    /* renamed from: com.lynx.tasm.ui.image.FlattenUIImage$a */
    class C28859a implements C28877a.AbstractC28882b {
        static {
            Covode.recordClassIndex(34971);
        }

        @Override // com.lynx.tasm.p2062ui.image.p2064b.C28877a.AbstractC28882b
        /* renamed from: a */
        public final void mo50009a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                FlattenUIImage.this.invalidate();
                return;
            }
            FlattenUIImage flattenUIImage = FlattenUIImage.this;
            if (flattenUIImage.f68122c != null) {
                flattenUIImage.f68122c.post(new Runnable() {
                    /* class com.lynx.tasm.p2062ui.image.FlattenUIImage.RunnableC288582 */

                    static {
                        Covode.recordClassIndex(34970);
                    }

                    public final void run() {
                        FlattenUIImage.this.invalidate();
                    }
                });
            }
        }

        C28859a() {
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.f68136q) {
            if (this.f68137r) {
                this.f68121b.mo50110a(this.f68126g, false);
            } else {
                this.f68121b.mo50109a(this.f68126g);
            }
            this.f68136q = false;
        }
        m57797b();
    }

    /* renamed from: b */
    private void m57797b() {
        if (getWidth() <= 0 && getHeight() <= 0) {
            float f = this.f68130k;
            if (f > 0.0f) {
                float f2 = this.f68131l;
                if (f2 > 0.0f) {
                    this.f68121b.mo50107a((int) f, (int) f2, this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
                    return;
                }
            }
        }
        this.f68121b.mo50107a(getWidth(), getHeight(), this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @AbstractC28525m(mo49059a = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @AbstractC28525m(mo49059a = "fresco-nine-patch", mo49064f = false)
    public void setFrescoNinePatch(boolean z) {
        this.f68135p = z;
    }

    @AbstractC28525m(mo49059a = "repeat", mo49064f = false)
    public void setRepeat(boolean z) {
        this.f68129j = z;
    }

    @AbstractC28525m(mo49059a = "skip-redirection", mo49064f = false)
    public void setSkipRedirection(boolean z) {
        this.f68137r = z;
    }

    @AbstractC28525m(mo49059a = "loop-count")
    public void setLoopCount(int i) {
        if (i <= 0) {
            i = 0;
        }
        this.f68121b.f68281E = i;
    }

    @Override // com.lynx.tasm.p2062ui.image.C28901j.AbstractC28908a
    /* renamed from: a */
    public final void mo49987a(Drawable drawable) {
        this.f68123d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        m57798c();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        this.f68121b.mo50108a(this.mBitmapConfig);
    }

    @AbstractC28525m(mo49059a = "mode")
    public void setObjectFit(String str) {
        C24229q.AbstractC24231b a = C28894g.m57881a(str);
        this.f68134o = a;
        C28901j jVar = this.f68121b;
        jVar.f68299m = a;
        jVar.f68300n = true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setParent(AbstractC28618d dVar) {
        super.setParent(dVar);
        this.f68121b.mo50106a();
    }

    @Override // com.lynx.tasm.p2062ui.image.C28901j.AbstractC28908a
    /* renamed from: a */
    public final void mo49988a(C24117a<?> aVar) {
        if (aVar != null && this.f68132m) {
            this.f68133n = aVar.clone();
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i) {
        C28901j jVar = this.f68121b;
        C28683b d = this.mLynxBackground.mo49780d();
        if (jVar.f68301o != d) {
            jVar.f68301o = d;
            jVar.f68300n = true;
        } else if (d == null || d.f67646d == null) {
            jVar.f68300n = true;
        }
    }

    @AbstractC28525m(mo49059a = "capInsets")
    public void setCapInsets(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.f68124e = null;
        } else {
            this.f68124e = str;
        }
        C28901j jVar = this.f68121b;
        jVar.f68279C = this.f68124e;
        jVar.f68300n = true;
    }

    @AbstractC28525m(mo49059a = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.f68125f = null;
        } else {
            this.f68125f = str;
        }
        C28901j jVar = this.f68121b;
        jVar.f68280D = this.f68125f;
        jVar.f68300n = true;
    }

    @AbstractC28525m(mo49059a = "local-cache")
    public void setLocalCache(Boolean bool) {
        if (this.f68121b != null) {
            if (bool == null) {
                this.f68132m = false;
            }
            boolean booleanValue = bool.booleanValue();
            this.f68132m = booleanValue;
            this.f68121b.f68282F = booleanValue;
        }
    }

    @AbstractC28525m(mo49059a = "prefetch-height")
    public void setPreFetchHeight(String str) {
        this.f68131l = C28930n.m57955a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.f67075p);
    }

    @AbstractC28525m(mo49059a = "prefetch-width")
    public void setPreFetchWidth(String str) {
        this.f68130k = C28930n.m57955a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.f67075p);
    }

    public FlattenUIImage(AbstractC28520j jVar) {
        super(jVar);
        C28901j jVar2 = new C28901j(jVar, C24182c.m45843b(), this, false);
        this.f68121b = jVar2;
        jVar2.f68306u = new C28890d() {
            /* class com.lynx.tasm.p2062ui.image.FlattenUIImage.C288571 */

            static {
                Covode.recordClassIndex(34969);
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50007a(String str) {
                C28725c cVar = new C28725c(FlattenUIImage.this.getSign(), "error");
                cVar.mo49838a("errMsg", str);
                FlattenUIImage.this.mContext.f67064e.mo49834a(cVar);
                FlattenUIImage.this.mContext.f67064e.mo49835a(new C28728f(FlattenUIImage.this.getSign()));
                FlattenUIImage.this.mContext.mo49039a(FlattenUIImage.this.f68126g, "image", str);
            }

            @Override // com.lynx.tasm.p2062ui.image.C28890d
            /* renamed from: a */
            public final void mo50006a(int i, int i2) {
                if (FlattenUIImage.this.mEvents != null && FlattenUIImage.this.mEvents.containsKey("load")) {
                    C28725c cVar = new C28725c(FlattenUIImage.this.getSign(), "load");
                    cVar.mo49838a("height", Integer.valueOf(i2));
                    cVar.mo49838a("width", Integer.valueOf(i));
                    FlattenUIImage.this.mContext.f67064e.mo49834a(cVar);
                }
            }
        };
        this.f68122c = new Handler(Looper.getMainLooper());
        this.f68128i = 0;
        this.f68129j = false;
    }

    @AbstractC28525m(mo49059a = "blur-radius")
    public void setBlurRadius(String str) {
        UIBody uIBody = this.mContext.f67068i;
        C28901j jVar = this.f68121b;
        int round = Math.round(C28930n.m57956a(str, uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), this.mContext.f67075p));
        if (round == 0) {
            jVar.f68291e = null;
        } else {
            jVar.f68291e = new C24471b(round);
        }
        jVar.f68300n = true;
    }

    @AbstractC28525m(mo49059a = "placeholder")
    public void setPlaceholder(String str) {
        C28901j jVar = this.f68121b;
        String a = C28621a.m57207a(jVar.f68287a, str);
        if (jVar.f68289c == null || !jVar.f68289c.f68251a.equals(a)) {
            if (a != null && !a.isEmpty()) {
                C28885c cVar = new C28885c(jVar.f68287a, a);
                jVar.f68289c = cVar;
                if (Uri.EMPTY.equals(cVar.mo50100a())) {
                    C28901j.m57892b(a);
                }
            }
            jVar.f68300n = true;
        }
    }

    @AbstractC28525m(mo49059a = "src")
    public void setSource(String str) {
        if (!TextUtils.equals(str, this.f68121b.mo50112c())) {
            this.f68123d = null;
            C24117a<?> aVar = this.f68133n;
            if (aVar != null) {
                aVar.close();
                this.f68133n = null;
            }
        }
        this.f68126g = str;
        this.f68136q = true;
        int i = this.f68128i + 1;
        this.f68128i = i;
        C28877a aVar2 = this.f68127h;
        if (aVar2 != null) {
            aVar2.mo50091a(i);
        }
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxFlattenUI
    /* renamed from: c */
    public final void mo49320c(Canvas canvas) {
        Bitmap bitmap;
        super.mo49320c(canvas);
        if (this.f68123d != null || this.f68133n != null) {
            C24117a<?> aVar = this.f68133n;
            if (aVar != null && aVar.mo39700d() && this.f68132m) {
                Object a = this.f68133n.mo39695a();
                if (a instanceof AbstractC24453b) {
                    bitmap = ((AbstractC24453b) a).mo40296d();
                } else if (a instanceof Bitmap) {
                    bitmap = (Bitmap) a;
                }
                if (bitmap != null) {
                    LLog.m56856a(4, "Lynx Android Flatten Image", "draw image from local cache");
                    if (C28873b.m57836a(getWidth(), getHeight(), bitmap.getWidth(), bitmap.getHeight(), this.f68134o, this.f68124e, this.f68125f, canvas, bitmap)) {
                        return;
                    }
                }
            }
            if (!this.f68135p && this.f68124e != null) {
                LLog.m56856a(4, "Lynx Android Flatten Image", "load origin bitmap to draw image with cap-insets");
                if (this.f68127h == null) {
                    this.f68127h = new C28877a(new C28859a(), this.f68128i);
                }
                if (this.f68127h.mo50095a(this.mContext, canvas, this.f68121b.f68305s, new C28877a.C28881a(this.f68128i, (float) getWidth(), (float) getHeight(), this.f68129j, this.f68134o, this.f68121b.mo50112c(), C28877a.m57843a(canvas), this.f68124e, this.f68125f))) {
                    return;
                }
            }
            this.f68123d.draw(canvas);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C28929m.m57948a(runnable, drawable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C28929m.m57949a(runnable, drawable, j);
    }
}

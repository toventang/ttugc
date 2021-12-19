package com.lynx.tasm.behavior.p2052ui.swiper;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.swiper.C28669c;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.ui.swiper.XSwiperUI */
public class XSwiperUI extends UISimpleView<C28668b> {

    /* renamed from: a */
    static final int f67516a = Color.argb(255, 255, 255, 255);

    /* renamed from: b */
    static final int f67517b = Color.argb(89, 255, 255, 255);

    /* renamed from: c */
    public boolean f67518c;

    /* renamed from: d */
    public boolean f67519d;

    /* renamed from: e */
    public int f67520e = 5000;

    /* renamed from: f */
    public boolean f67521f = true;

    /* renamed from: g */
    public boolean f67522g;

    /* renamed from: h */
    public boolean f67523h;

    /* renamed from: i */
    public boolean f67524i;

    /* renamed from: j */
    public boolean f67525j;

    /* renamed from: k */
    public boolean f67526k;

    /* renamed from: l */
    public final Handler f67527l = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    public final List<View> f67528m = new ArrayList();

    /* renamed from: n */
    public float f67529n = 0.6f;

    /* renamed from: o */
    public float f67530o = 1.0f;

    /* renamed from: p */
    public float f67531p = 0.6f;

    /* renamed from: q */
    public float f67532q = 1.0f;

    /* renamed from: r */
    public Runnable f67533r = new Runnable() {
        /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.RunnableC286647 */

        static {
            Covode.recordClassIndex(34732);
        }

        public final void run() {
            if (XSwiperUI.this.f67523h && XSwiperUI.this.f67518c) {
                C28669c cVar = ((C28668b) XSwiperUI.this.mView).f67555a;
                int i = cVar.f67562a + 1;
                if (XSwiperUI.this.f67519d && i == XSwiperUI.this.f67528m.size()) {
                    i = 0;
                }
                cVar.mo49698a(i, XSwiperUI.this.f67521f);
                XSwiperUI.this.f67527l.postDelayed(this, (long) XSwiperUI.this.f67520e);
            }
        }
    };

    /* renamed from: s */
    private String f67534s = "normal";

    /* renamed from: t */
    private int f67535t;

    /* renamed from: u */
    private int f67536u;

    /* renamed from: v */
    private int f67537v = -1;

    /* renamed from: w */
    private int f67538w = -1;

    /* renamed from: x */
    private C28669c.AbstractC28673c f67539x = new C28669c.AbstractC28673c() {
        /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.C286625 */

        static {
            Covode.recordClassIndex(34730);
        }

        @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28673c
        /* renamed from: a */
        public final void mo49685a(View view) {
            view.setRotationY(0.0f);
        }

        @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28673c
        /* renamed from: a */
        public final void mo49686a(View view, int i) {
            float f;
            int a = ((C28668b) XSwiperUI.this.mView).f67555a.mo49694a();
            if (a != 0) {
                f = ((float) i) / ((float) a);
            } else {
                f = 0.0f;
            }
            float a2 = XSwiperUI.m57331a(f * 9.0f, -9.0f, 9.0f);
            view.setCameraDistance(1280.0f);
            view.setRotationY(-a2);
        }
    };

    /* renamed from: y */
    private C28669c.AbstractC28673c f67540y = new C28669c.AbstractC28673c() {
        /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.C286636 */

        static {
            Covode.recordClassIndex(34731);
        }

        @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28673c
        /* renamed from: a */
        public final void mo49685a(View view) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }

        @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28673c
        /* renamed from: a */
        public final void mo49686a(View view, int i) {
            float f;
            float abs = (float) Math.abs(i);
            int a = ((C28668b) XSwiperUI.this.mView).f67555a.mo49694a();
            float f2 = 1.0f;
            if (a != 0) {
                float f3 = (float) a;
                f2 = XSwiperUI.this.f67530o - (((XSwiperUI.this.f67530o - XSwiperUI.this.f67529n) * abs) / f3);
                f = XSwiperUI.this.f67532q - ((abs * (XSwiperUI.this.f67532q - XSwiperUI.this.f67531p)) / f3);
            } else {
                f = 1.0f;
            }
            float a2 = XSwiperUI.m57331a(f2, XSwiperUI.this.f67529n, XSwiperUI.this.f67530o);
            float a3 = XSwiperUI.m57331a(f, XSwiperUI.this.f67531p, XSwiperUI.this.f67532q);
            view.setScaleX(a2);
            view.setScaleY(a3);
        }
    };

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            double d = 0.0d;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            int i = 0;
            boolean z4 = false;
            boolean z5 = false;
            switch (nextKey.hashCode()) {
                case -1992012396:
                    if (nextKey.equals("duration")) {
                        int i2 = 500;
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 500);
                        }
                        setDuration(i2);
                        continue;
                    }
                    break;
                case -1596393144:
                    if (nextKey.equals("indicator-dots")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setIndicator(z);
                        continue;
                    }
                    break;
                case -1498085729:
                    if (nextKey.equals("circular")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setCircular(z5);
                        continue;
                    }
                    break;
                case -1439500848:
                    if (nextKey.equals("orientation")) {
                        setOrientation(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1363870918:
                    if (nextKey.equals("min-x-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMinXScale(d);
                        continue;
                    }
                    break;
                case -1029251878:
                    if (nextKey.equals("indicator-active-color")) {
                        setIndicatorActiveColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -686438324:
                    if (nextKey.equals("max-x-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMaxXScale(d);
                        continue;
                    }
                    break;
                case -476367237:
                    if (nextKey.equals("min-y-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMinYScale(d);
                        continue;
                    }
                    break;
                case -111166008:
                    if (nextKey.equals("next-margin")) {
                        setNextMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 24002884:
                    if (nextKey.equals("previous-margin")) {
                        setPreviousMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 201065357:
                    if (nextKey.equals("max-y-scale")) {
                        if (!readableMap.isNull(nextKey)) {
                            d = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setMaxYScale(d);
                        continue;
                    }
                    break;
                case 364166425:
                    if (nextKey.equals("touchable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setTouchable(z4);
                        continue;
                    }
                    break;
                case 570418373:
                    if (nextKey.equals("interval")) {
                        int i3 = 5000;
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 5000);
                        }
                        setInterval(i3);
                        continue;
                    }
                    break;
                case 1126940025:
                    if (nextKey.equals("current")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setCurrentIndex(i);
                        continue;
                    }
                    break;
                case 1127093697:
                    if (nextKey.equals("current-item-id")) {
                        setCurrentItemId(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1439562083:
                    if (nextKey.equals("autoplay")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setAutoPlay(z3);
                        continue;
                    }
                    break;
                case 1599847372:
                    if (nextKey.equals("smooth-scroll")) {
                        boolean z6 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, true);
                        }
                        setSmoothScroll(z6);
                        continue;
                    }
                    break;
                case 1665556140:
                    if (nextKey.equals("page-margin")) {
                        setPageMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1696908181:
                    if (nextKey.equals("finish-reset")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setFinishReset(z2);
                        continue;
                    }
                    break;
                case 2050488869:
                    if (nextKey.equals("indicator-color")) {
                        setIndicatorColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void destroy() {
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void onDetach() {
        super.onDetach();
    }

    static {
        Covode.recordClassIndex(34723);
    }

    /* renamed from: a */
    private void m57332a() {
        ((C28668b) this.mView).f67555a.mo49699a(new AbstractC28667a() {
            /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.C286614 */

            static {
                Covode.recordClassIndex(34729);
            }

            @Override // com.lynx.tasm.behavior.p2052ui.swiper.AbstractC28667a
            /* renamed from: a */
            public final int mo49683a() {
                return XSwiperUI.this.f67528m.size();
            }

            @Override // com.lynx.tasm.behavior.p2052ui.swiper.AbstractC28667a
            /* renamed from: a */
            public final View mo49684a(int i) {
                return XSwiperUI.this.f67528m.get(i);
            }
        });
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f67528m.clear();
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            this.f67528m.add(((LynxUI) lynxBaseUI).mView);
        }
        m57332a();
        setMode(this.f67534s);
        ((C28668b) this.mView).mo49691a(isRtl());
        if (getOverflow() != 0) {
            ((C28668b) this.mView).setClipChildren(false);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void removeChildV2(LynxBaseUI lynxBaseUI) {
        removeChild(lynxBaseUI);
    }

    @AbstractC28525m(mo49059a = "finish-reset", mo49064f = false)
    public void setFinishReset(boolean z) {
        this.f67519d = z;
    }

    @AbstractC28525m(mo49059a = "interval", mo49063e = 5000)
    public void setInterval(int i) {
        this.f67520e = i;
    }

    @AbstractC28525m(mo49059a = "max-x-scale")
    public void setMaxXScale(double d) {
        this.f67530o = (float) d;
    }

    @AbstractC28525m(mo49059a = "max-y-scale")
    public void setMaxYScale(double d) {
        this.f67532q = (float) d;
    }

    @AbstractC28525m(mo49059a = "min-x-scale")
    public void setMinXScale(double d) {
        this.f67529n = (float) d;
    }

    @AbstractC28525m(mo49059a = "min-y-scale")
    public void setMinYScale(double d) {
        this.f67531p = (float) d;
    }

    @AbstractC28525m(mo49059a = "circular", mo49064f = false)
    public void setCircular(boolean z) {
        ((C28668b) this.mView).f67555a.f67565d = z;
    }

    @AbstractC28525m(mo49059a = "indicator-dots", mo49064f = false)
    public void setIndicator(boolean z) {
        int i;
        LinearLayout linearLayout = ((C28668b) this.mView).f67556b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    @AbstractC28525m(mo49059a = "touchable", mo49064f = false)
    public void setTouchable(boolean z) {
        ((C28668b) this.mView).f67555a.f67575n = z;
    }

    @AbstractC28525m(mo49059a = "autoplay", mo49064f = false)
    public void setAutoPlay(boolean z) {
        this.f67518c = z;
        this.f67527l.removeCallbacks(this.f67533r);
        if (this.f67518c) {
            this.f67527l.postDelayed(this.f67533r, (long) this.f67520e);
        }
    }

    @AbstractC28525m(mo49059a = "current", mo49063e = 0)
    public void setCurrentIndex(final int i) {
        C28669c cVar = ((C28668b) this.mView).f67555a;
        if (cVar.getChildCount() <= 0) {
            cVar.post(new Runnable() {
                /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.RunnableC286658 */

                static {
                    Covode.recordClassIndex(34733);
                }

                public final void run() {
                    XSwiperUI xSwiperUI = XSwiperUI.this;
                    xSwiperUI.mo49654a(i, xSwiperUI.f67521f);
                }
            });
        } else {
            mo49654a(i, this.f67521f);
        }
    }

    @AbstractC28525m(mo49059a = "current-item-id")
    public void setCurrentItemId(final String str) {
        if (str != null) {
            final C28669c cVar = ((C28668b) this.mView).f67555a;
            if (cVar.getChildCount() <= 0) {
                cVar.post(new Runnable() {
                    /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.RunnableC286669 */

                    static {
                        Covode.recordClassIndex(34734);
                    }

                    public final void run() {
                        XSwiperUI.this.mo49655a(str);
                    }
                });
            } else {
                mo49655a(str);
            }
        }
    }

    @AbstractC28525m(mo49059a = "duration", mo49063e = 500)
    public void setDuration(int i) {
        this.f67535t = i;
        if (this.f67521f) {
            ((C28668b) this.mView).f67555a.f67563b = i;
        } else {
            ((C28668b) this.mView).f67555a.f67563b = 0;
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setLynxDirection(int i) {
        super.setLynxDirection(i);
        if (i == 2 || i == 2) {
            ((C28668b) this.mView).mo49691a(true);
        } else {
            ((C28668b) this.mView).mo49691a(false);
        }
        setMode(this.f67534s);
    }

    @AbstractC28525m(mo49059a = "smooth-scroll", mo49064f = true)
    public void setSmoothScroll(boolean z) {
        this.f67521f = z;
        if (z) {
            ((C28668b) this.mView).f67555a.f67563b = this.f67535t;
            return;
        }
        ((C28668b) this.mView).f67555a.f67563b = 0;
    }

    /* renamed from: a */
    private boolean m57333a(C28669c cVar) {
        int width;
        if (cVar.mo49706d()) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        int i = this.f67537v;
        int i2 = this.f67538w;
        int i3 = this.f67536u;
        int i4 = (((width - i) - i2) - i3) - i3;
        if (i < 0 || i2 < 0 || i4 <= 0) {
            return true;
        }
        int i5 = i + i3;
        if (isRtl()) {
            cVar.mo49703b(-i5);
        } else {
            cVar.mo49703b(i5);
        }
        cVar.mo49697a(i4);
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        final C28668b bVar = new C28668b(context);
        bVar.f67555a.f67570i = new C28669c.AbstractC28672b() {
            /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.C286581 */

            static {
                Covode.recordClassIndex(34726);
            }

            @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28672b
            /* renamed from: a */
            public final void mo49677a(int i) {
                ((C28668b) XSwiperUI.this.mView).mo49692b(i);
                if (XSwiperUI.this.f67522g) {
                    C28725c cVar = new C28725c(XSwiperUI.this.getSign(), "change");
                    cVar.mo49838a("current", Integer.valueOf(i));
                    XSwiperUI.this.mContext.f67064e.mo49834a(cVar);
                }
            }
        };
        C28669c cVar = bVar.f67555a;
        cVar.f67572k.add(new C28669c.AbstractC28674d() {
            /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.C286592 */

            /* renamed from: b */
            boolean f67542b;

            static {
                Covode.recordClassIndex(34727);
            }

            /* access modifiers changed from: package-private */
            @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28674d
            /* renamed from: b */
            public final void mo49678b() {
                this.f67542b = true;
                if (XSwiperUI.this.f67524i) {
                    C28725c cVar = new C28725c(XSwiperUI.this.getSign(), "scrollstart");
                    cVar.mo49838a("current", Integer.valueOf(bVar.f67555a.f67562a));
                    XSwiperUI.this.mContext.f67064e.mo49834a(cVar);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28674d
            /* renamed from: c */
            public final void mo49679c() {
                this.f67542b = false;
                if (XSwiperUI.this.f67525j) {
                    C28725c cVar = new C28725c(XSwiperUI.this.getSign(), "scrollend");
                    cVar.mo49838a("current", Integer.valueOf(bVar.f67555a.f67562a));
                    XSwiperUI.this.mContext.f67064e.mo49834a(cVar);
                }
            }

            /* access modifiers changed from: package-private */
            @Override // com.lynx.tasm.behavior.p2052ui.swiper.C28669c.AbstractC28674d
            /* renamed from: d */
            public final void mo49680d() {
                if (this.f67542b && XSwiperUI.this.f67526k) {
                    XSwiperUI.this.mContext.f67064e.mo49834a(new C28725c(XSwiperUI.this.getSign(), "transition"));
                }
            }
        });
        bVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.View$OnAttachStateChangeListenerC286603 */

            static {
                Covode.recordClassIndex(34728);
            }

            public final void onViewDetachedFromWindow(View view) {
                XSwiperUI.this.f67523h = false;
                XSwiperUI.this.f67527l.removeCallbacks(XSwiperUI.this.f67533r);
            }

            public final void onViewAttachedToWindow(View view) {
                XSwiperUI.this.f67523h = true;
                if (XSwiperUI.this.f67518c) {
                    XSwiperUI.this.f67527l.removeCallbacks(XSwiperUI.this.f67533r);
                    XSwiperUI.this.f67527l.postDelayed(XSwiperUI.this.f67533r, (long) XSwiperUI.this.f67520e);
                }
            }
        });
        return bVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        MethodCollector.m26663i(1230);
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            this.f67528m.remove(((LynxUI) lynxBaseUI).mView);
            m57332a();
            C28668b bVar = (C28668b) this.mView;
            bVar.f67556b.removeViewAt(0);
            bVar.mo49692b(bVar.f67560f);
        }
        MethodCollector.m26664o(1230);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f67522g = map.containsKey("change");
            this.f67524i = map.containsKey("scrollstart");
            this.f67525j = map.containsKey("scrollend");
            this.f67526k = map.containsKey("transition");
        }
    }

    @AbstractC28525m(mo49059a = "indicator-active-color")
    public void setIndicatorActiveColor(String str) {
        int i;
        try {
            i = ColorUtils.m57910a(str);
        } catch (Exception unused) {
            i = f67516a;
        }
        C28668b bVar = (C28668b) this.mView;
        bVar.f67558d = i;
        for (int childCount = bVar.f67556b.getChildCount() - 1; childCount >= 0; childCount--) {
            if (childCount == bVar.f67560f) {
                bVar.f67556b.getChildAt(childCount).setBackground(C28668b.m57348a(bVar.f67558d));
                return;
            }
        }
    }

    @AbstractC28525m(mo49059a = "indicator-color")
    public void setIndicatorColor(String str) {
        int i;
        try {
            i = ColorUtils.m57910a(str);
        } catch (Exception unused) {
            i = f67517b;
        }
        C28668b bVar = (C28668b) this.mView;
        bVar.f67559e = i;
        for (int childCount = bVar.f67556b.getChildCount() - 1; childCount >= 0; childCount--) {
            if (childCount != bVar.f67560f) {
                bVar.f67556b.getChildAt(childCount).setBackground(C28668b.m57348a(bVar.f67559e));
            }
        }
    }

    @AbstractC28525m(mo49059a = "next-margin")
    public void setNextMargin(AbstractC28367a aVar) {
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            if (e.endsWith("px") || e.endsWith("rpx")) {
                int b = (int) C28930n.m57958b(e, -1.0f);
                if (b >= 0) {
                    this.f67538w = b;
                } else {
                    this.f67538w = -1;
                }
                setMode(this.f67534s);
            }
        }
    }

    @AbstractC28525m(mo49059a = "orientation")
    public void setOrientation(String str) {
        if ("vertical".equals(str)) {
            ((C28668b) this.mView).mo49693c(1);
        } else if ("horizontal".equals(str)) {
            ((C28668b) this.mView).mo49693c(0);
        }
    }

    @AbstractC28525m(mo49059a = "previous-margin")
    public void setPreviousMargin(AbstractC28367a aVar) {
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            if (e.endsWith("px") || e.endsWith("rpx")) {
                int b = (int) C28930n.m57958b(e, -1.0f);
                if (b >= 0) {
                    this.f67537v = b;
                } else {
                    this.f67537v = -1;
                }
                setMode(this.f67534s);
            }
        }
    }

    public XSwiperUI(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "page-margin")
    public void setPageMargin(AbstractC28367a aVar) {
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            if (e.endsWith("px") || e.endsWith("rpx")) {
                int b = (int) C28930n.m57958b(e, 10.0f);
                int i = 0;
                if (b > 0) {
                    this.f67536u = b;
                } else {
                    this.f67536u = 0;
                }
                C28669c cVar = ((C28668b) this.mView).f67555a;
                int i2 = this.f67536u;
                if (i2 >= 0) {
                    i = i2;
                }
                cVar.f67566e = i;
                cVar.mo49699a(cVar.f67571j);
                setMode(this.f67534s);
            }
        }
    }

    /* renamed from: a */
    public final void mo49655a(String str) {
        for (int i = 0; i < this.mChildren.size(); i++) {
            if (str.equals(((LynxBaseUI) this.mChildren.get(i)).mName)) {
                mo49654a(i, this.f67521f);
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @com.lynx.tasm.behavior.AbstractC28525m(mo49059a = "mode")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMode(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.swiper.XSwiperUI.setMode(java.lang.String):void");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateAttributes(C28716v vVar) {
        super.updateAttributes(vVar);
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (nextKey.hashCode()) {
                    case -1992012396:
                        if (nextKey.equals("duration")) {
                            setDuration(readableMap.getInt(nextKey));
                        } else {
                            continue;
                        }
                    case -1596393144:
                        if (nextKey.equals("indicator-dots")) {
                            setIndicator(readableMap.getBoolean(nextKey));
                        } else {
                            continue;
                        }
                    case -1498085729:
                        if (nextKey.equals("circular")) {
                            setCircular(readableMap.getBoolean(nextKey));
                        } else {
                            continue;
                        }
                    case -1439500848:
                        if (!nextKey.equals("orientation")) {
                            continue;
                        }
                        break;
                    case -1029251878:
                        if (nextKey.equals("indicator-active-color")) {
                            setIndicatorActiveColor(readableMap.getString(nextKey));
                        } else {
                            continue;
                        }
                    case -111166008:
                        if (nextKey.equals("next-margin")) {
                            setNextMargin(readableMap.getDynamic(nextKey));
                        } else {
                            continue;
                        }
                    case 3357091:
                        if (nextKey.equals("mode")) {
                            setMode(readableMap.getString(nextKey));
                        } else {
                            continue;
                        }
                    case 24002884:
                        if (nextKey.equals("previous-margin")) {
                            setPreviousMargin(readableMap.getDynamic(nextKey));
                        } else {
                            continue;
                        }
                    case 364166425:
                        if (nextKey.equals("touchable")) {
                            setTouchable(readableMap.getBoolean(nextKey));
                        } else {
                            continue;
                        }
                    case 570418373:
                        if (nextKey.equals("interval")) {
                            setInterval(readableMap.getInt(nextKey));
                        } else {
                            continue;
                        }
                    case 1126940025:
                        if (nextKey.equals("current")) {
                            setCurrentIndex(readableMap.getInt(nextKey));
                        } else {
                            continue;
                        }
                    case 1127093697:
                        if (nextKey.equals("current-item-id")) {
                            setCurrentItemId(readableMap.getString(nextKey));
                        } else {
                            continue;
                        }
                    case 1439562083:
                        if (nextKey.equals("autoplay")) {
                            setAutoPlay(readableMap.getBoolean(nextKey));
                        } else {
                            continue;
                        }
                    case 1599847372:
                        if (nextKey.equals("smooth-scroll")) {
                            setSmoothScroll(readableMap.getBoolean(nextKey));
                        } else {
                            continue;
                        }
                    case 1665556140:
                        if (nextKey.equals("page-margin")) {
                            setPageMargin(readableMap.getDynamic(nextKey));
                        } else {
                            continue;
                        }
                    case 1696908181:
                        if (nextKey.equals("finish-reset")) {
                            setFinishReset(readableMap.getBoolean(nextKey));
                            break;
                        } else {
                            continue;
                        }
                    case 2050488869:
                        if (nextKey.equals("indicator-color")) {
                            setIndicatorColor(readableMap.getString(nextKey));
                        } else {
                            continue;
                        }
                    default:
                        continue;
                }
                setOrientation(readableMap.getString(nextKey));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void insertChildV2(LynxBaseUI lynxBaseUI, int i) {
        insertChild(lynxBaseUI, i);
    }

    /* renamed from: a */
    public final void mo49654a(int i, boolean z) {
        C28669c cVar = ((C28668b) this.mView).f67555a;
        if (i >= 0 && i < cVar.f67573l) {
            cVar.mo49698a(i, z);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        MethodCollector.m26663i(1225);
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i, lynxBaseUI);
            lynxBaseUI.setParent(this);
            this.f67528m.add(i, ((LynxUI) lynxBaseUI).mView);
            m57332a();
            C28668b bVar = (C28668b) this.mView;
            View view = new View(bVar.getContext());
            view.setClickable(false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bVar.f67557c, bVar.f67557c);
            if (bVar.f67561g == 1) {
                int i2 = bVar.f67557c / 2;
                layoutParams.bottomMargin = i2;
                layoutParams.topMargin = i2;
            } else {
                int i3 = bVar.f67557c / 2;
                layoutParams.rightMargin = i3;
                layoutParams.leftMargin = i3;
            }
            bVar.f67556b.addView(view, layoutParams);
            if (bVar.f67556b.getChildCount() == bVar.f67558d) {
                view.setBackground(C28668b.m57348a(bVar.f67558d));
                MethodCollector.m26664o(1225);
                return;
            }
            view.setBackground(C28668b.m57348a(bVar.f67559e));
        }
        MethodCollector.m26664o(1225);
    }

    /* renamed from: a */
    public static float m57331a(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f2, f));
    }
}

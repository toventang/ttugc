package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.utils.C28926j;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public class LynxSwiperView extends UISimpleView<C19016a> {

    /* renamed from: f */
    public static final C19014a f44983f = new C19014a((byte) 0);

    /* renamed from: a */
    public boolean f44984a;

    /* renamed from: b */
    public boolean f44985b;

    /* renamed from: c */
    public boolean f44986c;

    /* renamed from: d */
    public boolean f44987d;

    /* renamed from: e */
    public int f44988e;

    static {
        Covode.recordClassIndex(21767);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            int i = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
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
                case -1597449863:
                    if (nextKey.equals("start-margin")) {
                        setStartMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -1596393144:
                    if (nextKey.equals("indicator-dots")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setIndicator(z2);
                        continue;
                    }
                    break;
                case -1498085729:
                    if (nextKey.equals("circular")) {
                        if (!readableMap.isNull(nextKey)) {
                            z6 = readableMap.getBoolean(nextKey, false);
                        }
                        setCircular(z6);
                        continue;
                    }
                    break;
                case -1235498272:
                    if (nextKey.equals("end-margin")) {
                        setEndMargin(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -1029251878:
                    if (nextKey.equals("indicator-active-color")) {
                        setIndicatorActiveColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -313198140:
                    if (nextKey.equals("hardware_texture")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setRenderHardwareTexture(z5);
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
                case 914875020:
                    if (nextKey.equals("item-width")) {
                        setItemWidth(readableMap.getDynamic(nextKey));
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
                case 1255595234:
                    if (nextKey.equals("hideshadow")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setHideShadow(z);
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
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setSmoothScroll(z);
                        continue;
                    }
                    break;
                case 1616798838:
                    if (nextKey.equals("shadow-color")) {
                        setShadowColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1665556140:
                    if (nextKey.equals("page-margin")) {
                        setPageMargin(readableMap.getDynamic(nextKey));
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

    /* renamed from: com.bytedance.ies.xelement.banner.LynxSwiperView$a */
    public static final class C19014a {
        static {
            Covode.recordClassIndex(21770);
        }

        private C19014a() {
        }

        public /* synthetic */ C19014a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((C19016a) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
        ((C19016a) this.mView).mo30246m(getWidth());
        ((C19016a) this.mView).mo30226a();
    }

    /* renamed from: com.bytedance.ies.xelement.banner.LynxSwiperView$b */
    public static final class C19015b implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ LynxSwiperView f44989a;

        static {
            Covode.recordClassIndex(21771);
        }

        C19015b(LynxSwiperView lynxSwiperView) {
            this.f44989a = lynxSwiperView;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            this.f44989a.f44988e = i;
            if (this.f44989a.f44984a) {
                AbstractC28520j jVar = this.f44989a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f44989a.getSign(), "change");
                cVar2.mo49838a("current", Integer.valueOf(i));
                cVar.mo49834a(cVar2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f44989a.recognizeGesturere();
            }
            if (this.f44989a.f44986c && i == 1) {
                AbstractC28520j jVar = this.f44989a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f44989a.getSign(), "scrollstart");
                cVar2.mo49838a("current", Integer.valueOf(this.f44989a.f44988e));
                cVar.mo49834a(cVar2);
            }
            if (this.f44989a.f44987d && i == 0) {
                AbstractC28520j jVar2 = this.f44989a.mContext;
                C89219l.m154709a((Object) jVar2, "");
                C28719c cVar3 = jVar2.f67064e;
                C28725c cVar4 = new C28725c(this.f44989a.getSign(), "scrollend");
                cVar4.mo49838a("current", Integer.valueOf(this.f44989a.f44988e));
                cVar3.mo49834a(cVar4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f44989a.f44985b) {
                AbstractC28520j jVar = this.f44989a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f44989a.getSign(), "transition");
                cVar2.mo49838a("current", Integer.valueOf(i));
                cVar2.mo49838a("positionOffset", Float.valueOf(f));
                cVar2.mo49838a("dx", Float.valueOf(C28926j.m57940c((float) i2)));
                cVar.mo49834a(cVar2);
            }
        }
    }

    @AbstractC28525m(mo49059a = "autoplay", mo49064f = false)
    public final void setAutoPlay(boolean z) {
        ((C19016a) this.mView).mo30232c(z);
    }

    @AbstractC28525m(mo49059a = "circular", mo49064f = false)
    public final void setCircular(boolean z) {
        ((C19016a) this.mView).mo30225a(z);
    }

    @AbstractC28525m(mo49059a = "current", mo49063e = 0)
    public final void setCurrentIndex(int i) {
        ((C19016a) this.mView).mo30233d(i);
    }

    @AbstractC28525m(mo49059a = "duration", mo49063e = 500)
    public final void setDuration(int i) {
        ((C19016a) this.mView).mo30236e(i);
    }

    @AbstractC28525m(mo49059a = "hideshadow", mo49064f = true)
    public final void setHideShadow(boolean z) {
        ((C19016a) this.mView).mo30228b(z);
    }

    @AbstractC28525m(mo49059a = "indicator-dots", mo49064f = false)
    public final void setIndicator(boolean z) {
        ((C19016a) this.mView).mo30234d(z);
    }

    @AbstractC28525m(mo49059a = "interval", mo49063e = 5000)
    public final void setInterval(int i) {
        ((C19016a) this.mView).mo30238f(i);
    }

    @AbstractC28525m(mo49059a = "smooth-scroll", mo49064f = true)
    public final void setSmoothScroll(boolean z) {
        ((C19016a) this.mView).mo30239f(z);
    }

    @AbstractC28525m(mo49059a = "touchable", mo49064f = false)
    public final void setTouchable(boolean z) {
        ((C19016a) this.mView).mo30237e(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxSwiperView(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void removeChildV2(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        removeChild(lynxBaseUI);
    }

    @AbstractC28525m(mo49059a = "mode")
    public final void setMode(String str) {
        C89219l.m154719c(str, "");
        ((C19016a) this.mView).mo30224a(str);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setOverflow(int i) {
        super.setOverflow(i);
        ((C19016a) this.mView).setOverflow(i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        C89219l.m154719c(context, "");
        C19016a aVar = new C19016a(context);
        aVar.setTwoItemCircularSwipe(false);
        aVar.setOnPageChangeListener(new C19015b(this));
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            ((C19016a) this.mView).mo30229b((LynxUI) lynxBaseUI);
        }
    }

    @AbstractC28525m(mo49059a = "end-margin")
    public final void setEndMargin(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ((C19016a) this.mView).mo30245l(m35317a(aVar));
    }

    @AbstractC28525m(mo49059a = "indicator-active-color")
    public final void setIndicatorActiveColor(String str) {
        C89219l.m154719c(str, "");
        try {
            ((C19016a) this.mView).mo30222a(ColorUtils.m57910a(str));
        } catch (Exception unused) {
        }
    }

    @AbstractC28525m(mo49059a = "indicator-color")
    public final void setIndicatorColor(String str) {
        C89219l.m154719c(str, "");
        try {
            ((C19016a) this.mView).mo30227b(ColorUtils.m57910a(str));
        } catch (Exception unused) {
        }
    }

    @AbstractC28525m(mo49059a = "item-width")
    public final void setItemWidth(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ((C19016a) this.mView).mo30243j(m35317a(aVar));
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setOverflowFiber(int i) {
        int i2;
        super.setOverflowFiber(i);
        if (i == 3) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        ((C19016a) this.mView).setOverflow(i2);
    }

    @AbstractC28525m(mo49059a = "hardware_texture")
    public final void setRenderHardwareTexture(boolean z) {
        if (z) {
            ((C19016a) this.mView).setLayerTextureType(2);
        } else {
            ((C19016a) this.mView).setLayerTextureType(0);
        }
    }

    @AbstractC28525m(mo49059a = "shadow-color")
    public final void setShadowColor(String str) {
        C89219l.m154719c(str, "");
        try {
            ((C19016a) this.mView).mo30231c(ColorUtils.m57910a(str));
        } catch (Exception unused) {
        }
    }

    @AbstractC28525m(mo49059a = "start-margin")
    public final void setStartMargin(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ((C19016a) this.mView).mo30244k(m35317a(aVar));
    }

    @AbstractC28525m(mo49059a = "current-item-id")
    public final void setCurrentItemId(String str) {
        C89219l.m154719c(str, "");
        List list = this.mChildren;
        C89219l.m154709a((Object) list, "");
        for (Object obj : list) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) obj;
            C89219l.m154709a((Object) lynxBaseUI, "");
            if (C89219l.m154714a((Object) lynxBaseUI.mName, (Object) str)) {
                if (obj != null) {
                    ((C19016a) this.mView).mo30233d(this.mChildren.indexOf(obj));
                    return;
                }
                return;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f44984a = map.containsKey("change");
            this.f44985b = map.containsKey("transition");
            this.f44986c = map.containsKey("scrollstart");
            this.f44987d = map.containsKey("scrollend");
        }
    }

    /* renamed from: a */
    private static int m35317a(AbstractC28367a aVar) {
        Integer valueOf;
        int intValue;
        C89219l.m154719c(aVar, "");
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if ((C89361p.m154876c(e, "px", false) || C89361p.m154876c(e, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) C28930n.m57953a(e, 10.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.m57911a().widthPixels && valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    @AbstractC28525m(mo49059a = "next-margin")
    public final void setNextMargin(AbstractC28367a aVar) {
        Integer valueOf;
        int intValue;
        C89219l.m154719c(aVar, "");
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if ((C89361p.m154876c(e, "px", false) || C89361p.m154876c(e, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) C28930n.m57953a(e, -1.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.m57911a().widthPixels && valueOf != null) {
                ((C19016a) this.mView).mo30242i(valueOf.intValue());
            }
        }
    }

    @AbstractC28525m(mo49059a = "page-margin")
    public final void setPageMargin(AbstractC28367a aVar) {
        Integer valueOf;
        int intValue;
        C89219l.m154719c(aVar, "");
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if ((C89361p.m154876c(e, "px", false) || C89361p.m154876c(e, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) C28930n.m57953a(e, 10.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.m57911a().widthPixels && valueOf != null) {
                ((C19016a) this.mView).mo30240g(valueOf.intValue());
            }
        }
    }

    @AbstractC28525m(mo49059a = "previous-margin")
    public final void setPreviousMargin(AbstractC28367a aVar) {
        Integer valueOf;
        int intValue;
        C89219l.m154719c(aVar, "");
        if (aVar.mo48559h() == ReadableType.String) {
            String e = aVar.mo48556e();
            C89219l.m154709a((Object) e, "");
            if ((C89361p.m154876c(e, "px", false) || C89361p.m154876c(e, "rpx", false)) && (intValue = (valueOf = Integer.valueOf((int) C28930n.m57953a(e, -1.0f))).intValue()) >= 0 && intValue <= DisplayMetricsHolder.m57911a().widthPixels && valueOf != null) {
                ((C19016a) this.mView).mo30241h(valueOf.intValue());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateAttributes(C28716v vVar) {
        C89219l.m154719c(vVar, "");
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey != null) {
                try {
                    switch (nextKey.hashCode()) {
                        case -1992012396:
                            if (nextKey.equals("duration")) {
                                setDuration(readableMap.getInt(nextKey, 500));
                                break;
                            } else {
                                continue;
                            }
                        case -1597449863:
                            if (nextKey.equals("start-margin")) {
                                AbstractC28367a dynamic = readableMap.getDynamic(nextKey);
                                C89219l.m154709a((Object) dynamic, "");
                                setStartMargin(dynamic);
                                break;
                            } else {
                                continue;
                            }
                        case -1596393144:
                            if (nextKey.equals("indicator-dots")) {
                                setIndicator(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case -1498085729:
                            if (nextKey.equals("circular")) {
                                setCircular(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case -1235498272:
                            if (nextKey.equals("end-margin")) {
                                AbstractC28367a dynamic2 = readableMap.getDynamic(nextKey);
                                C89219l.m154709a((Object) dynamic2, "");
                                setEndMargin(dynamic2);
                                break;
                            } else {
                                continue;
                            }
                        case -1029251878:
                            if (nextKey.equals("indicator-active-color")) {
                                String string = readableMap.getString(nextKey);
                                C89219l.m154709a((Object) string, "");
                                setIndicatorActiveColor(string);
                                break;
                            } else {
                                continue;
                            }
                        case -111166008:
                            if (nextKey.equals("next-margin")) {
                                AbstractC28367a dynamic3 = readableMap.getDynamic(nextKey);
                                C89219l.m154709a((Object) dynamic3, "");
                                setNextMargin(dynamic3);
                                break;
                            } else {
                                continue;
                            }
                        case 3357091:
                            if (nextKey.equals("mode")) {
                                String string2 = readableMap.getString(nextKey);
                                C89219l.m154709a((Object) string2, "");
                                setMode(string2);
                                break;
                            } else {
                                continue;
                            }
                        case 24002884:
                            if (nextKey.equals("previous-margin")) {
                                AbstractC28367a dynamic4 = readableMap.getDynamic(nextKey);
                                C89219l.m154709a((Object) dynamic4, "");
                                setPreviousMargin(dynamic4);
                                break;
                            } else {
                                continue;
                            }
                        case 364166425:
                            if (nextKey.equals("touchable")) {
                                setTouchable(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case 570418373:
                            if (nextKey.equals("interval")) {
                                setInterval(readableMap.getInt(nextKey, 5000));
                                break;
                            } else {
                                continue;
                            }
                        case 914875020:
                            if (nextKey.equals("item-width")) {
                                AbstractC28367a dynamic5 = readableMap.getDynamic(nextKey);
                                C89219l.m154709a((Object) dynamic5, "");
                                setItemWidth(dynamic5);
                                break;
                            } else {
                                continue;
                            }
                        case 1126940025:
                            if (nextKey.equals("current")) {
                                setCurrentIndex(readableMap.getInt(nextKey, 0));
                                break;
                            } else {
                                continue;
                            }
                        case 1127093697:
                            if (nextKey.equals("current-item-id")) {
                                String string3 = readableMap.getString(nextKey);
                                C89219l.m154709a((Object) string3, "");
                                setCurrentItemId(string3);
                                break;
                            } else {
                                continue;
                            }
                        case 1255595234:
                            if (nextKey.equals("hideshadow")) {
                                setHideShadow(readableMap.getBoolean(nextKey, true));
                                break;
                            } else {
                                continue;
                            }
                        case 1439562083:
                            if (nextKey.equals("autoplay")) {
                                setAutoPlay(readableMap.getBoolean(nextKey, false));
                                break;
                            } else {
                                continue;
                            }
                        case 1599847372:
                            if (nextKey.equals("smooth-scroll")) {
                                setSmoothScroll(readableMap.getBoolean(nextKey, true));
                                break;
                            } else {
                                continue;
                            }
                        case 1616798838:
                            if (nextKey.equals("shadow-color")) {
                                String string4 = readableMap.getString(nextKey);
                                C89219l.m154709a((Object) string4, "");
                                setShadowColor(string4);
                                break;
                            } else {
                                continue;
                            }
                        case 1665556140:
                            if (nextKey.equals("page-margin")) {
                                AbstractC28367a dynamic6 = readableMap.getDynamic(nextKey);
                                C89219l.m154709a((Object) dynamic6, "");
                                setPageMargin(dynamic6);
                                break;
                            } else {
                                continue;
                            }
                        case 2050488869:
                            if (nextKey.equals("indicator-color")) {
                                String string5 = readableMap.getString(nextKey);
                                C89219l.m154709a((Object) string5, "");
                                setIndicatorColor(string5);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException("setProperty error: " + nextKey + '\n' + e);
                }
            }
        }
        super.updateAttributes(vVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void insertChildV2(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        C89219l.m154719c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.add(i, lynxBaseUI);
            ((C19016a) this.mView).mo30223a((LynxUI) lynxBaseUI);
            lynxBaseUI.setParent(this);
        }
    }
}

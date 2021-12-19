package com.lynx.tasm.behavior.p2052ui.scroll;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;

/* renamed from: com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll */
public abstract class AbsLynxUIScroll<T extends ViewGroup> extends UISimpleView<T> {
    static {
        Covode.recordClassIndex(34707);
    }

    /* renamed from: a */
    public void mo29934a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    /* renamed from: a */
    public void mo29935a(LynxBaseUI lynxBaseUI, boolean z, String str, String str2, int i) {
    }

    /* renamed from: a */
    public abstract void mo29936a(boolean z);

    /* renamed from: b */
    public abstract void mo29937b(boolean z);

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            switch (nextKey.hashCode()) {
                case -2032847360:
                    if (nextKey.equals("scroll-to-index")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        scrollToIndex(i);
                        continue;
                    }
                    break;
                case -1571036001:
                    if (nextKey.equals("lower-threshold")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setLowerThreshole(i5);
                        continue;
                    }
                    break;
                case -402166408:
                    if (nextKey.equals("scroll-x")) {
                        setScrollX(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -402166407:
                    if (nextKey.equals("scroll-y")) {
                        setScrollY(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -169901481:
                    if (nextKey.equals("enable-scroll")) {
                        boolean z3 = true;
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, true);
                        }
                        setEnableScroll(z3);
                        continue;
                    }
                    break;
                case 65137827:
                    if (nextKey.equals("scroll-tap")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setScrollTap(z2);
                        continue;
                    }
                    break;
                case 65138261:
                    if (nextKey.equals("scroll-top")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setScrollTop(i4);
                        continue;
                    }
                    break;
                case 660290816:
                    if (nextKey.equals("upper-threshold")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 0);
                        }
                        setUpperThreshole(i3);
                        continue;
                    }
                    break;
                case 1751260029:
                    if (nextKey.equals("scroll-bar-enable")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setScrollBarEnable(z);
                        continue;
                    }
                    break;
                case 2019037959:
                    if (nextKey.equals("scroll-left")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setScrollLeft(i2);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @AbstractC28525m(mo49059a = "scroll-to-index", mo49063e = 0)
    public abstract void scrollToIndex(int i);

    @AbstractC28525m(mo49059a = "enable-scroll", mo49064f = true)
    public void setEnableScroll(boolean z) {
    }

    @AbstractC28525m(mo49059a = "lower-threshold", mo49063e = 0)
    public abstract void setLowerThreshole(int i);

    @AbstractC28525m(mo49059a = "scroll-bar-enable", mo49064f = false)
    public abstract void setScrollBarEnable(boolean z);

    @AbstractC28525m(mo49059a = "scroll-left", mo49063e = 0)
    public abstract void setScrollLeft(int i);

    @AbstractC28525m(mo49059a = "scroll-tap", mo49064f = false)
    public abstract void setScrollTap(boolean z);

    @AbstractC28525m(mo49059a = "scroll-top", mo49063e = 0)
    public abstract void setScrollTop(int i);

    @AbstractC28525m(mo49059a = "upper-threshold", mo49063e = 0)
    public abstract void setUpperThreshole(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$1 */
    public static /* synthetic */ class C286481 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67475a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 34710(0x8796, float:4.8639E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll.C286481.f67475a = r2
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll.C286481.f67475a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll.C286481.<clinit>():void");
        }
    }

    public AbsLynxUIScroll(AbstractC28520j jVar) {
        super(jVar);
    }

    @AbstractC28525m(mo49059a = "scroll-x")
    public void setScrollX(AbstractC28367a aVar) {
        if (aVar == null) {
            mo29937b(false);
            return;
        }
        int i = C286481.f67475a[aVar.mo48559h().ordinal()];
        if (i == 1) {
            mo29937b(aVar.mo48553b());
        } else if (i == 2) {
            mo29937b("true".equals(aVar.mo48556e()));
        }
    }

    @AbstractC28525m(mo49059a = "scroll-y")
    public void setScrollY(AbstractC28367a aVar) {
        if (aVar == null) {
            mo29936a(true);
            return;
        }
        int i = C286481.f67475a[aVar.mo48559h().ordinal()];
        if (i == 1) {
            mo29936a(aVar.mo48553b());
        } else if (i == 2) {
            mo29936a("true".equals(aVar.mo48556e()));
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateAttributes(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (nextKey.hashCode()) {
                    case -1571036001:
                        if (!nextKey.equals("lower-threshold")) {
                            break;
                        } else {
                            setLowerThreshole(readableMap.getInt(nextKey, 0));
                            break;
                        }
                    case -402166408:
                        if (!nextKey.equals("scroll-x")) {
                            break;
                        } else {
                            setScrollX(readableMap.getDynamic(nextKey));
                            break;
                        }
                    case -402166407:
                        if (!nextKey.equals("scroll-y")) {
                            break;
                        } else {
                            setScrollY(readableMap.getDynamic(nextKey));
                            break;
                        }
                    case -169901481:
                        if (!nextKey.equals("enable-scroll")) {
                            break;
                        } else {
                            setEnableScroll(readableMap.getBoolean(nextKey, true));
                            break;
                        }
                    case 65137827:
                        if (!nextKey.equals("scroll-tap")) {
                            break;
                        } else {
                            setScrollTap(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 65138261:
                        if (!nextKey.equals("scroll-top")) {
                            break;
                        } else {
                            setScrollTop(readableMap.getInt(nextKey, 0));
                            break;
                        }
                    case 660290816:
                        if (!nextKey.equals("upper-threshold")) {
                            break;
                        } else {
                            setUpperThreshole(readableMap.getInt(nextKey, 0));
                            break;
                        }
                    case 1751260029:
                        if (!nextKey.equals("scroll-bar-enable")) {
                            break;
                        } else {
                            setScrollBarEnable(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 2019037959:
                        if (!nextKey.equals("scroll-left")) {
                            break;
                        } else {
                            setScrollLeft(readableMap.getInt(nextKey, 0));
                            break;
                        }
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.updateAttributes(vVar);
    }
}

package com.lynx.tasm.behavior.p2052ui.list;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.C28781g;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.view.UIComponent;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView;

/* renamed from: com.lynx.tasm.behavior.ui.list.AbsLynxList */
public abstract class AbsLynxList<T extends ViewGroup> extends UISimpleView<T> {

    /* renamed from: a */
    C28781g f67353a;

    /* renamed from: b */
    LynxBaseUI f67354b;

    /* renamed from: c */
    private int[] f67355c = new int[2];

    /* renamed from: d */
    private int[] f67356d = new int[2];

    static {
        Covode.recordClassIndex(34672);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -1571036001:
                    if (nextKey.equals("lower-threshold")) {
                        setLowerThreshold(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -1554128936:
                    if (nextKey.equals("column-count")) {
                        int i = 1;
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 1);
                        }
                        setColumnCount(i);
                        continue;
                    }
                    break;
                case -1270238455:
                    if (nextKey.equals("list-type")) {
                        setListType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -892259863:
                    if (nextKey.equals("sticky")) {
                        setEnableSticky(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -592430592:
                    if (nextKey.equals("paging-enabled")) {
                        setEnablePagerSnap(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -505303290:
                    if (nextKey.equals("needs-visible-cells")) {
                        boolean z = false;
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setNeedVisibleCells(z);
                        continue;
                    }
                    break;
                case -411446853:
                    if (nextKey.equals("initial-scroll-index")) {
                        setInitialScrollIndex(readableMap.getDynamic(nextKey));
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
                        setScrollEnable(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -137292606:
                    if (nextKey.equals("upper-threshold-item-count")) {
                        setUpperThresholdItemCount(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 10993126:
                    if (nextKey.equals("over-scroll")) {
                        setOverScroll(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 660290816:
                    if (nextKey.equals("upper-threshold")) {
                        setUpperThreshold(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 693516932:
                    if (nextKey.equals("cache-queue-ratio")) {
                        setCacheQueueRatio(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 875338749:
                    if (nextKey.equals("scroll-event-throttle")) {
                        setScrollEventThrottle(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1191691203:
                    if (nextKey.equals("lower-threshold-item-count")) {
                        setLowerThresholdItemCount(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 1861761406:
                    if (nextKey.equals("scroll-state-change-event-throttle")) {
                        setScrollStateChangeEventThrottle(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1883148160:
                    if (nextKey.equals("update-animation")) {
                        setUpdateAnimation(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.UIGroup
    public void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
    }

    @AbstractC28525m(mo49059a = "cache-queue-ratio", mo49060b = "1")
    public abstract void setCacheQueueRatio(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "column-count", mo49063e = 1)
    public abstract void setColumnCount(int i);

    @AbstractC28525m(mo49059a = "paging-enabled", mo49060b = "false")
    public abstract void setEnablePagerSnap(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "sticky")
    public abstract void setEnableSticky(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "initial-scroll-index", mo49060b = "0")
    public abstract void setInitialScrollIndex(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "list-type", mo49060b = "single")
    public abstract void setListType(String str);

    @AbstractC28525m(mo49059a = "lower-threshold", mo49063e = 50)
    public abstract void setLowerThreshold(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "lower-threshold-item-count", mo49063e = 0)
    public void setLowerThresholdItemCount(AbstractC28367a aVar) {
    }

    @AbstractC28525m(mo49059a = "needs-visible-cells", mo49064f = false)
    public abstract void setNeedVisibleCells(boolean z);

    @AbstractC28525m(mo49059a = "enable-scroll", mo49060b = "true")
    public abstract void setScrollEnable(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "scroll-event-throttle", mo49060b = "200")
    public abstract void setScrollEventThrottle(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "scroll-state-change-event-throttle", mo49060b = "10")
    public abstract void setScrollStateChangeEventThrottle(String str);

    @AbstractC28525m(mo49059a = "scroll-x", mo49060b = "false")
    public abstract void setScrollX(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "scroll-y", mo49060b = "true")
    public abstract void setScrollY(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "update-animation", mo49060b = "none")
    public abstract void setUpdateAnimation(String str);

    @AbstractC28525m(mo49059a = "upper-threshold", mo49063e = 50)
    public abstract void setUpperThreshold(AbstractC28367a aVar);

    @AbstractC28525m(mo49059a = "upper-threshold-item-count", mo49063e = 0)
    public void setUpperThresholdItemCount(AbstractC28367a aVar) {
    }

    /* renamed from: a */
    public final JavaOnlyMap mo49525a() {
        C28781g gVar = this.f67353a;
        int sign = getSign();
        if (gVar.f67869a == null) {
            return null;
        }
        TemplateAssembler templateAssembler = gVar.f67869a;
        if (!templateAssembler.f66692g) {
            return templateAssembler.nativeGetListPlatformInfo(templateAssembler.f66686a, sign);
        }
        LLog.m56856a(6, "TemplateAssembler", "getListPlatformInfo while tasm is destoryed: listSign ".concat(String.valueOf(sign)));
        return null;
    }

    public AbsLynxList(AbstractC28520j jVar) {
        super(jVar);
        this.f67353a = jVar.f67066g;
        this.f67354b = null;
    }

    /* renamed from: b */
    public final void mo49529b(LynxUI lynxUI) {
        C28781g gVar = this.f67353a;
        int sign = getSign();
        int sign2 = lynxUI.getSign();
        if (gVar.f67869a != null) {
            TemplateAssembler templateAssembler = gVar.f67869a;
            if (templateAssembler.f66692g) {
                LLog.m56856a(6, "TemplateAssembler", "recycleChild: listSign " + sign + ", childSign " + sign2);
            } else {
                templateAssembler.nativeRecycleChild(templateAssembler.f66686a, sign, sign2);
            }
        }
    }

    @AbstractC28525m(mo49059a = "over-scroll", mo49060b = "true")
    public void setOverScroll(AbstractC28367a aVar) {
        boolean b;
        ReadableType h = aVar.mo48559h();
        if (h == ReadableType.String) {
            b = "true".equals(aVar.mo48556e());
        } else {
            if (h == ReadableType.Boolean) {
                b = aVar.mo48553b();
            }
            ((ViewGroup) this.mView).setOverScrollMode(0);
        }
        if (!b) {
            ((ViewGroup) this.mView).setOverScrollMode(2);
            return;
        }
        ((ViewGroup) this.mView).setOverScrollMode(0);
    }

    /* renamed from: a */
    public final void mo49527a(LynxUI lynxUI) {
        C28781g gVar = this.f67353a;
        int sign = getSign();
        int sign2 = lynxUI.getSign();
        if (gVar.f67869a != null) {
            TemplateAssembler templateAssembler = gVar.f67869a;
            if (templateAssembler.f66692g) {
                LLog.m56856a(6, "TemplateAssembler", "removeChild: listSign " + sign + ", childSign " + sign2);
            } else {
                templateAssembler.nativeRemoveChild(templateAssembler.f66686a, sign, sign2);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void insertChildV2(LynxBaseUI lynxBaseUI, int i) {
        insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.UIGroup
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.f67354b = lynxBaseUI;
        lynxBaseUI.setParent(this);
        this.mChildren.add(this.mChildren.size(), lynxBaseUI);
        onInsertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void insertChildFiber(LynxBaseUI lynxBaseUI, int i) {
        this.f67354b = lynxBaseUI;
        lynxBaseUI.setParent(this);
        this.mChildren.add(this.mChildren.size(), lynxBaseUI);
        onInsertChild(lynxBaseUI, i);
    }

    /* renamed from: a */
    public final LynxUI mo49526a(int i, long j) {
        LynxBaseUI a;
        C28781g gVar = this.f67353a;
        int sign = getSign();
        if (gVar.f67869a == null) {
            return null;
        }
        TemplateAssembler templateAssembler = gVar.f67869a;
        if (templateAssembler.f66692g) {
            LLog.m56856a(6, "TemplateAssembler", "obtainChild: listSign " + sign + ", index " + i);
            return null;
        }
        int nativeObtainChild = templateAssembler.nativeObtainChild(templateAssembler.f66686a, sign, i, j);
        if (nativeObtainChild <= 0 || (a = this.mContext.mo49034a(nativeObtainChild)) == null || !(a instanceof UIComponent)) {
            return null;
        }
        return (LynxUI) a;
    }

    /* renamed from: a */
    public final void mo49528a(LynxUI lynxUI, int i, long j) {
        C28781g gVar = this.f67353a;
        int sign = getSign();
        int sign2 = lynxUI.getSign();
        if (gVar.f67869a != null) {
            TemplateAssembler templateAssembler = gVar.f67869a;
            if (templateAssembler.f66692g) {
                LLog.m56856a(6, "TemplateAssembler", "renderChild: listSign " + sign + ", oldSign " + sign2 + ", newIndex " + i);
            } else {
                templateAssembler.nativeUpdateChild(templateAssembler.f66686a, sign, sign2, i, j);
            }
        }
    }
}

package com.lynx.tasm.behavior.p2052ui.list;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

/* renamed from: com.lynx.tasm.behavior.ui.list.AbsLynxList$$PropsSetter */
public class AbsLynxList$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(34674);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        AbsLynxList absLynxList = (AbsLynxList) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1571036001:
                if (str.equals("lower-threshold")) {
                    absLynxList.setLowerThreshold(vVar.mo49827f(str));
                    return;
                }
                break;
            case -1554128936:
                if (str.equals("column-count")) {
                    absLynxList.setColumnCount(vVar.mo49820a(str, 1));
                    return;
                }
                break;
            case -1270238455:
                if (str.equals("list-type")) {
                    absLynxList.setListType(vVar.mo49824c(str));
                    return;
                }
                break;
            case -892259863:
                if (str.equals("sticky")) {
                    absLynxList.setEnableSticky(vVar.mo49827f(str));
                    return;
                }
                break;
            case -592430592:
                if (str.equals("paging-enabled")) {
                    absLynxList.setEnablePagerSnap(vVar.mo49827f(str));
                    return;
                }
                break;
            case -505303290:
                if (str.equals("needs-visible-cells")) {
                    absLynxList.setNeedVisibleCells(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -411446853:
                if (str.equals("initial-scroll-index")) {
                    absLynxList.setInitialScrollIndex(vVar.mo49827f(str));
                    return;
                }
                break;
            case -402166408:
                if (str.equals("scroll-x")) {
                    absLynxList.setScrollX(vVar.mo49827f(str));
                    return;
                }
                break;
            case -402166407:
                if (str.equals("scroll-y")) {
                    absLynxList.setScrollY(vVar.mo49827f(str));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    absLynxList.setScrollEnable(vVar.mo49827f(str));
                    return;
                }
                break;
            case -137292606:
                if (str.equals("upper-threshold-item-count")) {
                    absLynxList.setUpperThresholdItemCount(vVar.mo49827f(str));
                    return;
                }
                break;
            case 10993126:
                if (str.equals("over-scroll")) {
                    absLynxList.setOverScroll(vVar.mo49827f(str));
                    return;
                }
                break;
            case 660290816:
                if (str.equals("upper-threshold")) {
                    absLynxList.setUpperThreshold(vVar.mo49827f(str));
                    return;
                }
                break;
            case 693516932:
                if (str.equals("cache-queue-ratio")) {
                    absLynxList.setCacheQueueRatio(vVar.mo49827f(str));
                    return;
                }
                break;
            case 875338749:
                if (str.equals("scroll-event-throttle")) {
                    absLynxList.setScrollEventThrottle(vVar.mo49827f(str));
                    return;
                }
                break;
            case 1191691203:
                if (str.equals("lower-threshold-item-count")) {
                    absLynxList.setLowerThresholdItemCount(vVar.mo49827f(str));
                    return;
                }
                break;
            case 1861761406:
                if (str.equals("scroll-state-change-event-throttle")) {
                    absLynxList.setScrollStateChangeEventThrottle(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1883148160:
                if (str.equals("update-animation")) {
                    absLynxList.setUpdateAnimation(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}

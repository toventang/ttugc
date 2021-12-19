package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter;

public class LynxPullRefreshView$$PropsSetter extends UIGroup$$PropsSetter {
    static {
        Covode.recordClassIndex(21641);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxPullRefreshView lynxPullRefreshView = (LynxPullRefreshView) lynxBaseUI;
        str.hashCode();
        if (str.equals("enable-loadmore")) {
            lynxPullRefreshView.setEnableLoadMore(vVar.mo49822a(str, true));
        } else if (!str.equals("enable-refresh")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxPullRefreshView.setEnableRefresh(vVar.mo49822a(str, true));
        }
    }
}

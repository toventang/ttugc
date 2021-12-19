package com.bytedance.apm.agent.helper;

import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.p757v2.InstructOperationSwitch;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class PageShowCallback {
    static {
        Covode.recordClassIndex(14013);
    }

    public static void onPageShowHideAction(Object obj, boolean z) {
        String name;
        String str;
        if (InstructOperationSwitch.sUiSwitch) {
            if (obj instanceof String) {
                name = (String) obj;
            } else {
                name = obj.getClass().getName();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (obj instanceof IPageMonitor) {
                    jSONObject.put("label", ((IPageMonitor) obj).getMonitorLabel());
                }
            } catch (Exception unused) {
            }
            if (z) {
                str = "page_show";
                if (ApmDelegate.C12507a.f30372a.mo20330b().f30037e != null) {
                    ApmDelegate.C12507a.f30372a.mo20330b();
                }
            } else {
                str = "page_hide";
            }
            MonitorTool.monitorUIAction(str, name, jSONObject);
        }
    }
}

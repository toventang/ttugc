package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

public class LynxNestedScrollView$$MethodInvoker implements AbstractC28700a<LynxNestedScrollView> {
    static {
        Covode.recordClassIndex(21636);
    }

    public void invoke(LynxNestedScrollView lynxNestedScrollView, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode != 1419773105) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            lynxNestedScrollView.scrollIntoView(readableMap);
                            return;
                        }
                    }
                } else if (str.equals("requestUIInfo")) {
                    lynxNestedScrollView.requestUIInfo(readableMap, callback);
                    return;
                }
            } else if (str.equals("boundingClientRect")) {
                lynxNestedScrollView.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}

package com.bytedance.ies.xelement.text.text;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

public class LynxTextUI$$MethodInvoker implements AbstractC28700a<LynxTextUI> {
    static {
        Covode.recordClassIndex(22244);
    }

    public void invoke(LynxTextUI lynxTextUI, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode != 1419773105) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            lynxTextUI.scrollIntoView(readableMap);
                            return;
                        }
                    }
                } else if (str.equals("requestUIInfo")) {
                    lynxTextUI.requestUIInfo(readableMap, callback);
                    return;
                }
            } else if (str.equals("boundingClientRect")) {
                lynxTextUI.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}

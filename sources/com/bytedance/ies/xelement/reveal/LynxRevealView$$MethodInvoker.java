package com.bytedance.ies.xelement.reveal;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

public class LynxRevealView$$MethodInvoker implements AbstractC28700a<LynxRevealView> {
    static {
        Covode.recordClassIndex(22214);
    }

    public void invoke(LynxRevealView lynxRevealView, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode != 589715322) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            lynxRevealView.scrollIntoView(readableMap);
                            return;
                        }
                    }
                } else if (str.equals("toggleActive")) {
                    lynxRevealView.toggleActive(readableMap);
                    return;
                }
            } else if (str.equals("boundingClientRect")) {
                lynxRevealView.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}

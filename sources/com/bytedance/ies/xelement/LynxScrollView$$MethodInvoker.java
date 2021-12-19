package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

public class LynxScrollView$$MethodInvoker implements AbstractC28700a<LynxScrollView> {
    static {
        Covode.recordClassIndex(21653);
    }

    public void invoke(LynxScrollView lynxScrollView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -716578934:
                    if (str.equals("scrollToIndex")) {
                        lynxScrollView.scrollToIndex(readableMap, callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxScrollView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxScrollView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxScrollView.scrollIntoView(readableMap);
                        return;
                    }
                    break;
            }
            callback.invoke(3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}

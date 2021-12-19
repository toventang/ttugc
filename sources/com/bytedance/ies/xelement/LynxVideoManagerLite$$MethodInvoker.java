package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

public class LynxVideoManagerLite$$MethodInvoker implements AbstractC28700a<LynxVideoManagerLite> {
    static {
        Covode.recordClassIndex(21676);
    }

    public void invoke(LynxVideoManagerLite lynxVideoManagerLite, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxVideoManagerLite.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 85887754:
                    if (str.equals("getDuration")) {
                        lynxVideoManagerLite.getDuration(callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxVideoManagerLite.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxVideoManagerLite.scrollIntoView(readableMap);
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

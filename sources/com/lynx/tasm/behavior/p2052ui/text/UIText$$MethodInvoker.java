package com.lynx.tasm.behavior.p2052ui.text;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

/* renamed from: com.lynx.tasm.behavior.ui.text.UIText$$MethodInvoker */
public class UIText$$MethodInvoker implements AbstractC28700a<UIText> {
    static {
        Covode.recordClassIndex(34749);
    }

    public void invoke(UIText uIText, String str, ReadableMap readableMap, Callback callback) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -357431021) {
                if (hashCode != 1419773105) {
                    if (hashCode == 1908871954) {
                        if (str.equals("scrollIntoView")) {
                            uIText.scrollIntoView(readableMap);
                            return;
                        }
                    }
                } else if (str.equals("requestUIInfo")) {
                    uIText.requestUIInfo(readableMap, callback);
                    return;
                }
            } else if (str.equals("boundingClientRect")) {
                uIText.boundingClientRect(readableMap, callback);
                return;
            }
            callback.invoke(3);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("invokeMethod error: " + str + "\n" + e.toString());
        }
    }
}

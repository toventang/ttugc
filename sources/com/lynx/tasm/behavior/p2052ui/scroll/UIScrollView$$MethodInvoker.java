package com.lynx.tasm.behavior.p2052ui.scroll;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

/* renamed from: com.lynx.tasm.behavior.ui.scroll.UIScrollView$$MethodInvoker */
public class UIScrollView$$MethodInvoker implements AbstractC28700a<UIScrollView> {
    static {
        Covode.recordClassIndex(34712);
    }

    public void invoke(UIScrollView uIScrollView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -402165208:
                    if (str.equals("scrollTo")) {
                        uIScrollView.scrollTo(readableMap);
                        return;
                    }
                    break;
                case -398364324:
                    if (str.equals("autoScroll")) {
                        uIScrollView.autoScroll(readableMap);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        uIScrollView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        uIScrollView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        uIScrollView.scrollIntoView(readableMap);
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

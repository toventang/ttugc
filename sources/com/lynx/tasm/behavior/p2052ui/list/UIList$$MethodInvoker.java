package com.lynx.tasm.behavior.p2052ui.list;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

/* renamed from: com.lynx.tasm.behavior.ui.list.UIList$$MethodInvoker */
public class UIList$$MethodInvoker implements AbstractC28700a<UIList> {
    static {
        Covode.recordClassIndex(34680);
    }

    public void invoke(UIList uIList, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -980170895:
                    if (str.equals("scrollToPosition")) {
                        uIList.scrollToPosition(readableMap, callback);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        uIList.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 1363070069:
                    if (str.equals("getVisibleCells")) {
                        uIList.getVisibleCells(callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        uIList.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        uIList.scrollIntoView(readableMap);
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

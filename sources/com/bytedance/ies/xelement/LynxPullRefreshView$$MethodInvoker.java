package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.utils.AbstractC28700a;

public class LynxPullRefreshView$$MethodInvoker implements AbstractC28700a<LynxPullRefreshView> {
    static {
        Covode.recordClassIndex(21640);
    }

    public void invoke(LynxPullRefreshView lynxPullRefreshView, String str, ReadableMap readableMap, Callback callback) {
        try {
            switch (str.hashCode()) {
                case -1890175128:
                    if (str.equals("autoStartRefresh")) {
                        lynxPullRefreshView.autoStartRefresh(readableMap);
                        return;
                    }
                    break;
                case -1662894322:
                    if (str.equals("finishLoadMore")) {
                        lynxPullRefreshView.finishLoadMore(readableMap);
                        return;
                    }
                    break;
                case -828841272:
                    if (str.equals("finishRefresh")) {
                        lynxPullRefreshView.finishRefresh(readableMap);
                        return;
                    }
                    break;
                case -357431021:
                    if (str.equals("boundingClientRect")) {
                        lynxPullRefreshView.boundingClientRect(readableMap, callback);
                        return;
                    }
                    break;
                case 1419773105:
                    if (str.equals("requestUIInfo")) {
                        lynxPullRefreshView.requestUIInfo(readableMap, callback);
                        return;
                    }
                    break;
                case 1908871954:
                    if (str.equals("scrollIntoView")) {
                        lynxPullRefreshView.scrollIntoView(readableMap);
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

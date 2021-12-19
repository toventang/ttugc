package com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton;

import android.app.Activity;
import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2142f.AbstractC29909a;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate */
public final class TroubleshootingLogDelegate {
    public static final TroubleshootingLogDelegate INSTANCE = new TroubleshootingLogDelegate();
    private static AbstractC29909a mLogVisualPanelImpl;

    private final void getLogVisualPanelImpl() {
    }

    public final void awesomeSplashLog(String str) {
        awesomeSplashLog$default(this, str, null, 0, 6, null);
    }

    public final void awesomeSplashLog(String str, String str2) {
        awesomeSplashLog$default(this, str, str2, 0, 4, null);
    }

    public final void ordinarySplashLog(String str) {
        ordinarySplashLog$default(this, str, null, 0, 6, null);
    }

    public final void ordinarySplashLog(String str, String str2) {
        ordinarySplashLog$default(this, str, str2, 0, 4, null);
    }

    private TroubleshootingLogDelegate() {
    }

    static {
        Covode.recordClassIndex(46658);
    }

    private final void appLogV1Log(String str) {
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#BBC1E3");
        }
    }

    private final void appLogV3Log(String str) {
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#359E7E");
        }
    }

    public static final void showLogVisualPanel(Activity activity) {
        C89219l.m154721d(activity, "");
        INSTANCE.getLogVisualPanelImpl();
    }

    public final void handleV3Log(String str, JSONObject jSONObject) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("event_name:" + str + '\n');
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                C89219l.m154716b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    sb.append(next + ':' + jSONObject.opt(next) + '\n');
                }
            }
            String sb2 = sb.toString();
            C89219l.m154716b(sb2, "");
            appLogV3Log(sb2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void awesomeSplashLog(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#B6ACB1");
        }
    }

    public final void ordinarySplashLog(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        getLogVisualPanelImpl();
        if (mLogVisualPanelImpl != null) {
            Color.parseColor("#fdcb6e");
        }
    }

    public final void handleV1Log(String str, String str2, Long l, Long l2, JSONObject jSONObject) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("tag:" + str + '\n');
            sb.append("label:" + str2 + '\n');
            sb.append("value:" + l + '\n');
            sb.append("ext_value:" + l2 + '\n');
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                C89219l.m154716b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    sb.append(next + ':' + jSONObject.opt(next) + '\n');
                }
            }
            String sb2 = sb.toString();
            C89219l.m154716b(sb2, "");
            appLogV1Log(sb2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void awesomeSplashLog$default(TroubleshootingLogDelegate troubleshootingLogDelegate, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 3;
        }
        troubleshootingLogDelegate.awesomeSplashLog(str, str2, i);
    }

    public static /* synthetic */ void ordinarySplashLog$default(TroubleshootingLogDelegate troubleshootingLogDelegate, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 3;
        }
        troubleshootingLogDelegate.ordinarySplashLog(str, str2, i);
    }
}

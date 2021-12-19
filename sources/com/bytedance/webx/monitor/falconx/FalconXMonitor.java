package com.bytedance.webx.monitor.falconx;

import android.webkit.WebView;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.C14570e;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

public class FalconXMonitor {
    private static volatile FalconXMonitor instance;
    private boolean hasSetMonitor;

    static {
        Covode.recordClassIndex(27760);
    }

    public void beginMonitor() {
        if (!this.hasSetMonitor) {
            this.hasSetMonitor = true;
            C14570e.f35236a = new C14570e.AbstractC14571a() {
                /* class com.bytedance.webx.monitor.falconx.FalconXMonitor.C236611 */

                static {
                    Covode.recordClassIndex(27761);
                }

                @Override // com.bytedance.falconx.C14570e.AbstractC14571a
                /* renamed from: a */
                public final void mo23443a(final WebView webView, final InterceptorModel interceptorModel, final boolean z) {
                    if (webView != null && interceptorModel != null) {
                        C11929a.m21040a().execute(new Runnable() {
                            /* class com.bytedance.webx.monitor.falconx.FalconXMonitor.C236611.RunnableC236621 */

                            static {
                                Covode.recordClassIndex(27762);
                            }

                            public final void run() {
                                int i;
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (z) {
                                        i = 0;
                                    } else {
                                        i = 1;
                                    }
                                    C11950d.m21098a(jSONObject, "is_custom_interceptor", i);
                                    C11950d.m21101a(jSONObject, "resource_url", interceptorModel.url);
                                    C11950d.m21101a(jSONObject, "offline_rule", interceptorModel.offlineRule);
                                    C11950d.m21100a(jSONObject, "offline_status", interceptorModel.offlineStatus);
                                    C11950d.m21100a(jSONObject, "offline_duration", interceptorModel.offlineDuration);
                                    C11950d.m21101a(jSONObject, "channel", interceptorModel.channel);
                                    C11950d.m21101a(jSONObject, "mime_type", interceptorModel.mimeType);
                                    C11950d.m21101a(jSONObject, "error_code", interceptorModel.errCode);
                                    C11950d.m21100a(jSONObject, "package_version", interceptorModel.pkgVersion);
                                    C11950d.m21101a(jSONObject, "ac", interceptorModel.f35238ac);
                                    C12044i.f28862a.mo19235a(webView, "falconPerf", jSONObject);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    }
                }
            };
        }
    }

    public static FalconXMonitor getInstance() {
        MethodCollector.m26663i(10355);
        if (instance == null) {
            synchronized (FalconXMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new FalconXMonitor();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10355);
                    throw th;
                }
            }
        }
        FalconXMonitor falconXMonitor = instance;
        MethodCollector.m26664o(10355);
        return falconXMonitor;
    }
}

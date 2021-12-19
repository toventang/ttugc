package com.bytedance.falconx;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.C14570e;
import com.bytedance.falconx.p973a.C14557a;
import com.bytedance.falconx.p973a.C14560b;
import com.bytedance.falconx.p975b.AbstractC14564c;
import com.bytedance.falconx.p975b.C14562a;
import com.bytedance.falconx.p975b.C14563b;
import com.bytedance.falconx.p976c.C14566a;
import com.bytedance.falconx.p976c.C14567b;
import com.bytedance.falconx.statistic.C14574c;
import com.bytedance.falconx.statistic.C14575d;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.utils.C15059j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.bytedance.falconx.a */
final class C14553a implements AbstractC14561b {

    /* renamed from: a */
    private C14568d f35179a;

    /* renamed from: b */
    private List<AbstractC14564c> f35180b = new ArrayList();

    /* renamed from: c */
    private Handler f35181c;

    static {
        Covode.recordClassIndex(16640);
    }

    /* renamed from: a */
    private static long m26628a(InterceptorModel interceptorModel) {
        if (interceptorModel != null) {
            return interceptorModel.getVersion();
        }
        return -1;
    }

    C14553a(C14568d dVar) {
        String lowerCase;
        this.f35179a = dVar;
        this.f35181c = new Handler(this.f35179a.f35214a.getMainLooper());
        for (Uri uri : this.f35179a.f35217d) {
            String scheme = uri.getScheme();
            if (scheme == null) {
                lowerCase = "";
            } else {
                lowerCase = scheme.toLowerCase();
            }
            if ("".equals(lowerCase) || "file".equals(lowerCase)) {
                this.f35180b.add(new C14563b(dVar.f35214a, dVar.f35215b, new File(uri.getPath())));
            } else if ("asset".equals(lowerCase)) {
                String path = uri.getPath();
                this.f35180b.add(new C14562a(dVar.f35214a, new File(path.startsWith("/") ? path.substring(1) : path)));
            } else {
                C14957a.m27544b();
            }
        }
    }

    @Override // com.bytedance.falconx.AbstractC14561b
    /* renamed from: a */
    public final WebResourceResponse mo23432a(WebView webView, String str) {
        try {
            List<Pattern> list = this.f35179a.f35216c;
            if (list != null && !list.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    InterceptorModel interceptorModel = new InterceptorModel();
                    interceptorModel.url = str;
                    WebResourceResponse a = m26629a(webView, str, interceptorModel);
                    if (a == null && interceptorModel.offlineRule != null) {
                        mo23433a(webView, interceptorModel);
                    }
                    return a;
                }
            }
            return null;
        } catch (Exception unused) {
            C14957a.m27542a();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo23433a(final WebView webView, final InterceptorModel interceptorModel) {
        this.f35181c.post(new Runnable() {
            /* class com.bytedance.falconx.C14553a.RunnableC145563 */

            static {
                Covode.recordClassIndex(16643);
            }

            public final void run() {
                C14575d a = C14575d.m26653a();
                WebView webView = webView;
                a.f35241a.execute(new Runnable(interceptorModel, webView) {
                    /* class com.bytedance.falconx.statistic.C14575d.RunnableC145772 */

                    /* renamed from: a */
                    final /* synthetic */ InterceptorModel f35244a;

                    /* renamed from: b */
                    final /* synthetic */ WebView f35245b;

                    static {
                        Covode.recordClassIndex(16667);
                    }

                    public final void run() {
                        String str;
                        String str2;
                        String str3;
                        long j;
                        long j2;
                        try {
                            this.f35244a.f35238ac = C15059j.m27729a(C14575d.this.f35242b.f35214a);
                            C14570e.m26650a(this.f35245b, this.f35244a, true);
                            C14957a.m27543a("falconx intercept data:", this.f35244a);
                            C14575d dVar = C14575d.this;
                            String str4 = dVar.f35242b.f35222i;
                            String str5 = C14575d.this.f35242b.f35219f;
                            String str6 = C14575d.this.f35242b.f35224k;
                            InterceptorModel interceptorModel = this.f35244a;
                            try {
                                if (!TextUtils.isEmpty(dVar.f35242b.f35223j) && interceptorModel != null) {
                                    StatisticData statisticData = new StatisticData();
                                    statisticData.mCommon = new Common();
                                    statisticData.mCommon.appVersion = str4;
                                    statisticData.mCommon.deviceId = str5;
                                    statisticData.mCommon.region = str6;
                                    String uuid = UUID.randomUUID().toString();
                                    interceptorModel.startTime = null;
                                    interceptorModel.logId = uuid;
                                    AbstractC14573b bVar = dVar.f35242b.f35220g;
                                    if (bVar != null) {
                                        Common common = statisticData.mCommon;
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("params_for_special", "gecko");
                                        String str7 = "";
                                        if (interceptorModel.pageUrl == null) {
                                            str = str7;
                                        } else {
                                            str = interceptorModel.pageUrl;
                                        }
                                        jSONObject.put("page_url", str);
                                        if (interceptorModel.resRootDir == null) {
                                            str2 = str7;
                                        } else {
                                            str2 = interceptorModel.resRootDir;
                                        }
                                        jSONObject.put("res_root_dir", str2);
                                        if (interceptorModel.url == null) {
                                            str3 = str7;
                                        } else {
                                            str3 = interceptorModel.url;
                                        }
                                        jSONObject.put("resource_url", str3);
                                        if (interceptorModel.offlineRule != null) {
                                            str7 = interceptorModel.offlineRule;
                                        }
                                        jSONObject.put("offline_rule", str7);
                                        jSONObject.put("mime_type", interceptorModel.mimeType);
                                        jSONObject.put("offline_status", interceptorModel.offlineStatus);
                                        long j3 = 0;
                                        if (interceptorModel.offlineDuration == null) {
                                            j = 0;
                                        } else {
                                            j = interceptorModel.offlineDuration.longValue();
                                        }
                                        jSONObject.put("offline_duration", j);
                                        if (interceptorModel.onlineDuration == null) {
                                            j2 = 0;
                                        } else {
                                            j2 = interceptorModel.onlineDuration.longValue();
                                        }
                                        jSONObject.put("online_duration", j2);
                                        jSONObject.put("app_version", common.appVersion);
                                        jSONObject.put("sdk_version", common.sdkVersion);
                                        if (interceptorModel.pkgVersion != null) {
                                            j3 = interceptorModel.pkgVersion.longValue();
                                        }
                                        jSONObject.put("pkg_version", j3);
                                        jSONObject.put("access_key", interceptorModel.accessKey);
                                        jSONObject.put("channel", interceptorModel.channel);
                                        jSONObject.put("os", common.f35237os);
                                        jSONObject.put("device_id", common.deviceId);
                                        jSONObject.put("device_model", common.deviceModel);
                                        jSONObject.put("region", common.region);
                                        jSONObject.put("ac", interceptorModel.f35238ac);
                                        jSONObject.put("err_code", interceptorModel.errCode);
                                        jSONObject.put("err_msg", interceptorModel.errMsg);
                                        jSONObject.put("log_id", interceptorModel.logId);
                                        C14957a.m27543a("geckosdk_falcon_update_stats", jSONObject);
                                        if ((bVar instanceof AbstractC14572a) && interceptorModel.offlineStatus.intValue() == 1) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("aid", String.valueOf(C14930f.m27473a().mo24031b().aid));
                                            jSONObject2.put("gecko_sdk_version", "3.0.0-rc.0-mt");
                                            jSONObject2.put("access_key", interceptorModel.accessKey);
                                            jSONObject2.put("channel", interceptorModel.channel);
                                            jSONObject2.put("package_id", interceptorModel.pkgVersion);
                                            jSONObject2.put("from", "1");
                                            jSONObject2.put("isCombo", interceptorModel.isCombo);
                                            if (!TextUtils.isEmpty(interceptorModel.channel) && !TextUtils.isEmpty(interceptorModel.url)) {
                                                String[] split = interceptorModel.url.split(interceptorModel.channel + "/");
                                                if (split.length == 2) {
                                                    jSONObject2.put("path", split[1]);
                                                }
                                            }
                                            new JSONObject().put("read_duration", interceptorModel.offlineDuration);
                                            Boolean.valueOf(false);
                                            C14957a.m27543a("geckosdk_resource_load_event", jSONObject2);
                                        }
                                    }
                                }
                            } catch (Throwable unused) {
                                C14957a.m27542a();
                            }
                        } catch (Exception unused2) {
                            C14957a.m27542a();
                        }
                    }

                    {
                        this.f35244a = r2;
                        this.f35245b = r3;
                    }
                });
            }
        });
    }

    /* renamed from: a */
    private void m26631a(final WebView webView, final InterceptorModel interceptorModel, WebResourceResponse webResourceResponse) {
        InputStream data = webResourceResponse.getData();
        if (data != null) {
            webResourceResponse.setData(new C14574c(data) {
                /* class com.bytedance.falconx.C14553a.C145552 */

                static {
                    Covode.recordClassIndex(16642);
                }

                @Override // com.bytedance.falconx.statistic.C14574c, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
                public final void close() {
                    super.close();
                    interceptorModel.loadFinish(true);
                    C14553a.this.mo23433a(webView, interceptorModel);
                }

                @Override // com.bytedance.falconx.statistic.C14574c
                /* renamed from: a */
                public final void mo23435a(IOException iOException) {
                    super.mo23435a(iOException);
                    interceptorModel.setErrorCode("101");
                    interceptorModel.setErrorMsg(iOException.getMessage());
                    interceptorModel.loadFinish(false);
                    C14553a.this.mo23433a(webView, interceptorModel);
                }
            });
        }
    }

    /* renamed from: a */
    private WebResourceResponse m26629a(final WebView webView, String str, final InterceptorModel interceptorModel) {
        String substring;
        MethodCollector.m26663i(382);
        interceptorModel.accessKey = this.f35179a.f35215b;
        if (webView != null) {
            webView.post(new Runnable() {
                /* class com.bytedance.falconx.C14553a.RunnableC145541 */

                static {
                    Covode.recordClassIndex(16641);
                }

                public final void run() {
                    try {
                        interceptorModel.pageUrl = webView.getUrl();
                    } catch (Exception unused) {
                        C14957a.m27542a();
                    }
                }
            });
        }
        for (Pattern pattern : this.f35179a.f35216c) {
            if (pattern != null) {
                WebResourceResponse a = m26630a(pattern, str, interceptorModel);
                if (a != null) {
                    m26631a(webView, interceptorModel, a);
                    MethodCollector.m26664o(382);
                    return a;
                }
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    interceptorModel.offlineRule = pattern.pattern();
                    int indexOf = str.indexOf("?");
                    int indexOf2 = str.indexOf("#");
                    int min = Math.min(indexOf, indexOf2);
                    if (min == -1) {
                        min = Math.max(indexOf, indexOf2);
                    }
                    if (min != -1) {
                        substring = str.substring(matcher.end(), min);
                    } else {
                        substring = str.substring(matcher.end());
                    }
                    if (substring.endsWith("/")) {
                        substring = substring.substring(0, substring.length() - 1);
                    }
                    if (substring.startsWith("/")) {
                        substring = substring.substring(1);
                    }
                    for (AbstractC14564c cVar : this.f35180b) {
                        String a2 = C14566a.m26647a(substring);
                        try {
                            interceptorModel.resRootDir = cVar.mo23439a();
                            Map<String, Long> b = cVar.mo23440b();
                            String substring2 = substring.substring(0, substring.indexOf("/"));
                            interceptorModel.channel = substring2;
                            interceptorModel.pkgVersion = b.get(substring2);
                            interceptorModel.mimeType = a2;
                            WebResourceResponse a3 = C14567b.m26648a(a2, "", cVar.mo23438a(substring));
                            if (a3 != null) {
                                String concat = "path:".concat(String.valueOf(substring));
                                long a4 = m26628a(interceptorModel);
                                if (C14560b.f35205a) {
                                    synchronized (C14557a.f35192b) {
                                        try {
                                            C14557a.f35192b.add(new C14557a.C14558a(true, str, concat, a4));
                                        } catch (Throwable th) {
                                            MethodCollector.m26664o(382);
                                            throw th;
                                        }
                                    }
                                }
                                m26631a(webView, interceptorModel, a3);
                            } else {
                                C14557a.m26635a(str, "not found local resource", m26628a(interceptorModel));
                            }
                            MethodCollector.m26664o(382);
                            return a3;
                        } catch (FileNotFoundException unused) {
                            C14557a.m26635a(str, "not found local resource", m26628a(interceptorModel));
                            C14957a.m27542a();
                        } catch (Throwable th2) {
                            C14557a.m26635a(str, "not found local resource".concat(String.valueOf(th2)), m26628a(interceptorModel));
                            C14957a.m27542a();
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        interceptorModel.setErrorCode("100");
        interceptorModel.setErrorMsg("not found");
        interceptorModel.loadFinish(false);
        MethodCollector.m26664o(382);
        return null;
    }

    /* renamed from: a */
    private WebResourceResponse m26630a(Pattern pattern, String str, InterceptorModel interceptorModel) {
        InputStream inputStream;
        MethodCollector.m26663i(404);
        Matcher matcher = Pattern.compile(pattern.pattern() + "??").matcher(str);
        if (!matcher.find()) {
            MethodCollector.m26664o(404);
            return null;
        }
        interceptorModel.offlineRule = pattern.pattern();
        int indexOf = str.indexOf("??");
        if (indexOf <= 0) {
            MethodCollector.m26664o(404);
            return null;
        }
        String substring = str.substring(matcher.end() + 1, indexOf);
        String[] split = str.substring(indexOf + 2).split(",");
        if (split.length <= 1) {
            MethodCollector.m26664o(404);
            return null;
        }
        split[0] = substring + split[0];
        String a = C14566a.m26647a(split[0]);
        for (int i = 1; i < split.length; i++) {
            split[i] = substring + split[i];
            if (!TextUtils.equals(C14566a.m26647a(split[i]), a)) {
                MethodCollector.m26664o(404);
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            Iterator<AbstractC14564c> it = this.f35180b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    inputStream = null;
                    break;
                }
                AbstractC14564c next = it.next();
                try {
                    interceptorModel.resRootDir = next.mo23439a();
                    Map<String, Long> b = next.mo23440b();
                    interceptorModel.channel = substring;
                    interceptorModel.mimeType = a;
                    interceptorModel.pkgVersion = b.get(substring);
                    interceptorModel.isCombo = true;
                    inputStream = next.mo23438a(str2);
                    break;
                } catch (Throwable unused) {
                    C14957a.m27542a();
                }
            }
            if (inputStream == null) {
                MethodCollector.m26664o(404);
                return null;
            }
            arrayList.add(inputStream);
        }
        WebResourceResponse a2 = C14567b.m26648a(a, "", new SequenceInputStream(Collections.enumeration(arrayList)));
        MethodCollector.m26664o(404);
        return a2;
    }
}

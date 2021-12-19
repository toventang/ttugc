package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.v */
public class C40556v {

    /* renamed from: g */
    private static C40556v f94894g;

    /* renamed from: a */
    public List<SingleWebView> f94895a = new ArrayList();

    /* renamed from: b */
    public LinkedList<SingleWebView> f94896b = new LinkedList<>();

    /* renamed from: c */
    public Map<String, SingleWebView> f94897c = new HashMap();

    /* renamed from: d */
    public int f94898d = 2;

    /* renamed from: e */
    public final Object f94899e = new Object();

    /* renamed from: f */
    private List<String> f94900f;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.v$a */
    public interface AbstractC40558a {
        static {
            Covode.recordClassIndex(48379);
        }

        /* renamed from: a */
        void mo67526a();
    }

    static {
        Covode.recordClassIndex(48377);
    }

    /* renamed from: f */
    private static boolean m81853f() {
        return C16048b.m29633a().mo25421a(true, "enable_webview_cache", false);
    }

    /* renamed from: b */
    public final SingleWebView mo69681b() {
        if (this.f94896b.size() > 0) {
            return this.f94896b.poll();
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo69683c() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (!C34717d.m70908a(this.f94900f) || m81853f() || m81854g()) {
            return false;
        }
        return true;
    }

    private C40556v() {
        try {
            this.f94900f = C52912c.f121688a.f121689b.getWebviewCachePoolSwitch();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C40556v m81851a() {
        MethodCollector.m26663i(6956);
        if (f94894g == null) {
            synchronized (C40556v.class) {
                try {
                    if (f94894g == null) {
                        f94894g = new C40556v();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6956);
                    throw th;
                }
            }
        }
        C40556v vVar = f94894g;
        MethodCollector.m26664o(6956);
        return vVar;
    }

    /* renamed from: g */
    private static boolean m81854g() {
        WebViewPreloadEntry webViewPreloadEntry;
        try {
            webViewPreloadEntry = (WebViewPreloadEntry) C16048b.m29633a().mo25415a(true, "webview_preload_entry_ab", WebViewPreloadEntry.class);
            if (webViewPreloadEntry == null) {
                try {
                    webViewPreloadEntry = (WebViewPreloadEntry) SettingsManager.m29616a().mo25396a("webview_preload_entry", WebViewPreloadEntry.class);
                } catch (Throwable unused) {
                }
                if (webViewPreloadEntry == null) {
                    return false;
                }
            }
        } catch (Throwable unused2) {
            webViewPreloadEntry = null;
        }
        if (webViewPreloadEntry.isUsePool()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ boolean mo69684d() {
        MethodCollector.m26663i(7116);
        SystemClock.uptimeMillis();
        synchronized (this.f94899e) {
            for (int i = 0; i < this.f94898d - this.f94895a.size(); i++) {
                try {
                    this.f94895a.add(new SingleWebView(new MutableContextWrapper(C17867d.m33078a())));
                } catch (Throwable th) {
                    MethodCollector.m26664o(7116);
                    throw th;
                }
            }
        }
        SystemClock.uptimeMillis();
        MethodCollector.m26664o(7116);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ boolean mo69685e() {
        MethodCollector.m26663i(7263);
        SystemClock.uptimeMillis();
        synchronized (this.f94899e) {
            for (int i = 0; i < this.f94898d - this.f94895a.size(); i++) {
                try {
                    this.f94895a.add(new SingleWebView(new MutableContextWrapper(C17867d.m33078a())));
                } catch (Throwable th) {
                    MethodCollector.m26664o(7263);
                    throw th;
                }
            }
        }
        SystemClock.uptimeMillis();
        MethodCollector.m26664o(7263);
        return false;
    }

    /* renamed from: b */
    public static boolean m81852b(C40618a aVar) {
        if (aVar == null) {
            return false;
        }
        String str = aVar.f95068a.f95054c;
        if (!TextUtils.isEmpty(str) && str.contains("/ies-cdn-alisg/tiktok_activities/covid19") && str.contains("cov19_render_no_need_load=1")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final SingleWebView mo69677a(Activity activity) {
        MethodCollector.m26663i(6961);
        SingleWebView singleWebView = null;
        if (mo69683c()) {
            MethodCollector.m26664o(6961);
            return null;
        }
        synchronized (this.f94899e) {
            try {
                if (this.f94895a.size() > 0) {
                    singleWebView = this.f94895a.get(0);
                    this.f94895a.remove(0);
                    if (singleWebView != null) {
                        Context context = singleWebView.getContext();
                        if (context instanceof MutableContextWrapper) {
                            ((MutableContextWrapper) context).setBaseContext(activity);
                        }
                        singleWebView.initWeb(activity);
                    }
                }
            } finally {
                MethodCollector.m26664o(6961);
            }
        }
        return singleWebView;
    }

    /* renamed from: b */
    public final SingleWebView mo69682b(Activity activity) {
        SingleWebView singleWebView;
        MethodCollector.m26663i(7113);
        synchronized (this.f94899e) {
            try {
                if (this.f94895a.size() > 0) {
                    singleWebView = this.f94895a.get(0);
                    this.f94895a.remove(0);
                    if (singleWebView == null) {
                        return new SingleWebView(new MutableContextWrapper(activity));
                    }
                    singleWebView.setTag("cachedWebView");
                    Context context = singleWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(activity);
                    }
                } else {
                    singleWebView = new SingleWebView(new MutableContextWrapper(activity));
                }
                singleWebView.initWeb(activity);
                MethodCollector.m26664o(7113);
                return singleWebView;
            } finally {
                MethodCollector.m26664o(7113);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo69679a(C40618a aVar) {
        if (aVar == null) {
            return false;
        }
        String str = aVar.f95068a.f95054c;
        if (TextUtils.isEmpty(str) || mo69680a(str)) {
            return false;
        }
        if (m81853f() || m81854g() || str.contains("need_webview_pool=1")) {
            return true;
        }
        if (!C34717d.m70908a(this.f94900f)) {
            for (String str2 : this.f94900f) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo69680a(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (str.contains("need_webview_pool=1") || !C34717d.m70908a(this.f94900f) || m81853f() || m81854g()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final SingleWebView mo69678a(Activity activity, C40618a aVar) {
        SingleWebView singleWebView;
        MethodCollector.m26663i(6959);
        synchronized (this.f94899e) {
            singleWebView = null;
            if (aVar != null) {
                try {
                    String str = aVar.f95068a.f95054c;
                    if (!TextUtils.isEmpty(str) && this.f94897c.containsKey("/ies-cdn-alisg/tiktok_activities/covid19") && str.contains("/ies-cdn-alisg/tiktok_activities/covid19")) {
                        singleWebView = this.f94897c.get("/ies-cdn-alisg/tiktok_activities/covid19");
                        this.f94897c.remove("/ies-cdn-alisg/tiktok_activities/covid19");
                        if (singleWebView != null) {
                            aVar.f95068a.f95054c += "&cov19_render_no_need_load=1";
                            singleWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            Context context = singleWebView.getContext();
                            if (context instanceof MutableContextWrapper) {
                                ((MutableContextWrapper) context).setBaseContext(activity);
                            }
                            singleWebView.initWeb(activity);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("click_btn_timestamp", System.currentTimeMillis());
                                jSONObject.put("cold_boot_begin_timestamp", C58945a.C58947b.f134185a.f134181h);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            singleWebView.sendEventToWebView("cov_pre_render_show", jSONObject);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6959);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(6959);
        return singleWebView;
    }
}

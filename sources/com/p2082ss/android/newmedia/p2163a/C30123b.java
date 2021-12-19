package com.p2082ss.android.newmedia.p2163a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.example.p1811a.C23833c;
import com.p2082ss.android.agilelogger.p2119c.C29724d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.newmedia.C30144g;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import java.util.HashSet;

/* renamed from: com.ss.android.newmedia.a.b */
public final class C30123b {

    /* renamed from: a */
    static Handler f71865a = null;

    /* renamed from: b */
    static final HashSet<String> f71866b;

    /* renamed from: c */
    static final HashSet<String> f71867c;

    /* renamed from: d */
    private static final boolean f71868d;

    /* renamed from: e */
    private static final boolean f71869e;

    /* renamed from: f */
    private static int f71870f = -1;

    /* renamed from: g */
    private static int f71871g = -1;

    /* renamed from: h */
    private static int f71872h = -1;

    static {
        boolean z;
        Covode.recordClassIndex(36622);
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (C29843f.m60136c()) {
            z = true;
        } else {
            z = false;
        }
        f71868d = z;
        if (z || (Build.VERSION.SDK_INT == 16 && "ZTE N5".equals(Build.MODEL))) {
            z2 = true;
        }
        f71869e = z2;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f71866b = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f71867c = hashSet2;
    }

    /* renamed from: a */
    public static void m60933a(WebView webView) {
        MethodCollector.m26663i(6468);
        if (webView == null) {
            MethodCollector.m26664o(6468);
            return;
        }
        C33830n.m69192a("webview_anr_log", "common_msg", new C33743c().mo59974a("layerType", Integer.valueOf(webView.getLayerType())).mo59976a("stackTrace", C29724d.m59905a(new Throwable())).mo59977a());
        webView.setWebChromeClient(null);
        C84367b.m145126a();
        webView.setWebViewClient(C23833c.m45038a(null));
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
            try {
                webView.destroy();
                MethodCollector.m26664o(6468);
                return;
            } catch (Throwable th) {
                C33830n.m69192a("webview_anr_log", "destroy_exception", new C33743c().mo59976a("stacktrace", C29724d.m59905a(th)).mo59977a());
            }
        }
        MethodCollector.m26664o(6468);
    }

    /* renamed from: a */
    public static void m60932a(Context context, WebView webView) {
        int i;
        MethodCollector.m26663i(6318);
        if (context == null || webView == null) {
            MethodCollector.m26664o(6318);
        } else if (CrossPlatformLegacyServiceImpl.m65225f().mo57043b() != 0 || ((i = f71870f) >= 0 ? i > 0 : f71869e)) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing()) {
                    try {
                        C30144g.m60968a(webView, "about:blank");
                        if (f71872h > 0) {
                            View rootView = webView.getRootView();
                            if (rootView instanceof ViewGroup) {
                                View childAt = ((ViewGroup) rootView).getChildAt(0);
                                childAt.setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                                childAt.setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(activity);
                                imageView.setImageBitmap(createBitmap);
                                imageView.setVisibility(0);
                                ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    Logger.debug();
                }
            }
            MethodCollector.m26664o(6318);
        } else {
            MethodCollector.m26664o(6318);
        }
    }
}

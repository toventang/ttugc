package com.p2082ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.C38975c;
import com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.widget.CommonWebPageWidget;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.b */
public final class C39041b {

    /* renamed from: a */
    static WeakReference<CommonWebPageWidget> f92201a = new WeakReference<>(null);

    /* renamed from: b */
    static boolean f92202b;

    /* renamed from: c */
    public static final C39041b f92203c = new C39041b();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.b$a */
    public static final class C39042a implements IInterceptor {
        static {
            Covode.recordClassIndex(46643);
        }

        C39042a() {
        }

        /* renamed from: a */
        private static Bundle m79225a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String str;
            if (routeIntent != null) {
                str = routeIntent.getHost();
            } else {
                str = null;
            }
            if (!C89219l.m154714a((Object) str, (Object) "overlay_webview") || C39041b.f92201a.get() == null) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            String str;
            String str2;
            CommonPopUpWebPageView b;
            ActivityC0945e activity;
            Fragment fragment;
            Context context2;
            Intent extra;
            Bundle a;
            MethodCollector.m26663i(8562);
            Activity activity2 = null;
            String originUrl = routeIntent != null ? routeIntent.getOriginUrl() : null;
            if (!C80538hl.m139614a(originUrl)) {
                originUrl = null;
            }
            if (originUrl == null) {
                MethodCollector.m26664o(8562);
                return false;
            }
            String queryParameter = Uri.parse(originUrl).getQueryParameter("url");
            if (!C80538hl.m139614a(queryParameter) || queryParameter == null) {
                MethodCollector.m26664o(8562);
                return false;
            }
            C89219l.m154716b(queryParameter, "");
            HashMap hashMap = new HashMap();
            if (!(routeIntent == null || (extra = routeIntent.getExtra()) == null || (a = m79225a(extra)) == null)) {
                for (String str3 : a.keySet()) {
                    C89219l.m154716b(str3, "");
                    String string = a.getString(str3);
                    if (string == null) {
                        string = "";
                    }
                    hashMap.put(str3, string);
                }
            }
            CommonWebPageWidget commonWebPageWidget = C39041b.f92201a.get();
            if (commonWebPageWidget != null) {
                C89219l.m154721d(hashMap, "");
                String str4 = commonWebPageWidget.f92083q;
                if (str4 == null) {
                    str4 = "";
                }
                hashMap.put("enter_from", str4);
                Aweme aweme = commonWebPageWidget.f92081o;
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = "";
                }
                hashMap.put("group_id", str);
                Aweme aweme2 = commonWebPageWidget.f92081o;
                if (aweme2 == null || (str2 = aweme2.getAuthorUid()) == null) {
                    str2 = "";
                }
                hashMap.put("author_id", str2);
                hashMap.put("music_id", String.valueOf(C59208ac.m108767c(commonWebPageWidget.f92081o).longValue()));
                C89219l.m154721d(queryParameter, "");
                Fragment fragment2 = commonWebPageWidget.f92082p;
                if (!(fragment2 == null || (activity = fragment2.getActivity()) == null || (fragment = commonWebPageWidget.f92082p) == null || (context2 = fragment.getContext()) == null)) {
                    C38618ac.C38619a a2 = new C38618ac.C38619a().mo67199a(queryParameter).mo67197a(commonWebPageWidget.f92082p);
                    C89219l.m154721d(context2, "");
                    C38618ac a3 = a2.mo67195a(C89241a.m154729a((double) C13628n.m24525e(context2))).mo67201b("").mo67196a(new Bundle()).mo67200a();
                    CommonWebPageWidget.C39036b bVar = commonWebPageWidget.f92192i;
                    CommonWebPageWidget.C39037c cVar = commonWebPageWidget.f92194k;
                    C89219l.m154721d(activity, "");
                    C89219l.m154721d(a3, "");
                    CommonPopUpWebPageView b2 = CommonWebPageWidget.C39034a.m79220b(activity);
                    if (b2 == null) {
                        b2 = new CommonPopUpWebPageView(activity, (byte) 0);
                        b2.setId(R.id.abl);
                        b2.setParams(a3);
                        b2.setMBehaviorCallback(bVar);
                        b2.setKeyDownCallBack(cVar);
                        FrameLayout a4 = CommonWebPageWidget.C39034a.m79217a(activity);
                        if (a4 != null) {
                            a4.addView(b2);
                        }
                    }
                    commonWebPageWidget.f92190a = b2;
                    CommonPopUpWebPageView commonPopUpWebPageView = commonWebPageWidget.f92190a;
                    if (commonPopUpWebPageView != null) {
                        commonPopUpWebPageView.setTitleBarCallback(commonWebPageWidget.f92193j);
                    }
                    commonWebPageWidget.hashCode();
                }
                C38975c.C38976a aVar = new C38975c.C38976a();
                aVar.f92078a = context;
                C89219l.m154721d(queryParameter, "");
                aVar.f92079b = queryParameter;
                C89219l.m154721d(hashMap, "");
                aVar.f92080c.putAll(hashMap);
                C38975c cVar2 = new C38975c(aVar.f92078a, aVar.f92079b, aVar.f92080c, (byte) 0);
                Context context3 = cVar2.f92073a;
                if (context3 instanceof Activity) {
                    activity2 = context3;
                }
                Activity activity3 = activity2;
                if (!(activity3 == null || (b = CommonWebPageWidget.C39034a.m79220b(activity3)) == null || b.mo67658a())) {
                    CommonWebPageWidget.C39034a.C39035a aVar2 = new CommonWebPageWidget.C39034a.C39035a(cVar2, b);
                    if (b.mo67655a(R.id.cyh) == null) {
                        b.f92024h = aVar2;
                    } else {
                        aVar2.invoke();
                    }
                }
            }
            MethodCollector.m26664o(8562);
            return true;
        }
    }

    private C39041b() {
    }

    static {
        Covode.recordClassIndex(46642);
    }
}

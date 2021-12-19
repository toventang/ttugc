package com.p2082ss.android.ugc.aweme.p2479ck;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.i */
public final class C36107i implements IInterceptor {

    /* renamed from: a */
    public static final C36108a f85313a = new C36108a((byte) 0);

    static {
        Covode.recordClassIndex(43360);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.i$a */
    public static final class C36108a {
        static {
            Covode.recordClassIndex(43361);
        }

        private C36108a() {
        }

        public /* synthetic */ C36108a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        String str2 = null;
        if (routeIntent == null || (uri2 = routeIntent.getUri()) == null) {
            str = null;
        } else {
            str = uri2.getHost();
        }
        if (C89219l.m154714a((Object) str, (Object) "feedback_input")) {
            return true;
        }
        if (!(routeIntent == null || (uri = routeIntent.getUri()) == null)) {
            str2 = uri.getHost();
        }
        if (C89219l.m154714a((Object) str2, (Object) "i18n_feedback_input")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            C89219l.m154716b(feedbackConf, "");
            C36131u a = C36131u.m73602a(feedbackConf.getFeHelp());
            if (routeIntent != null) {
                str = routeIntent.getOriginUrl();
            } else {
                str = null;
            }
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            for (String str2 : parse.getQueryParameterNames()) {
                a.mo63248a(str2, parse.getQueryParameter(str2));
            }
            C36125t.m73598a(C36125t.m73591a(), a.f85356a.mo52126a());
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}

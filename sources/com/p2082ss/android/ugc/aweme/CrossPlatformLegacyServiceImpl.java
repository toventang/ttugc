package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.newmedia.AbstractC30133e;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.AwemeAppData;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37866av;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38663a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a.C38668c;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40593h;
import com.p2082ss.android.ugc.aweme.crossplatform.business.C40589e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl */
public class CrossPlatformLegacyServiceImpl implements ICrossPlatformLegacyService {
    static {
        Covode.recordClassIndex(37922);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final void mo57034a() {
        C37866av.m76518a();
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final boolean mo57042a(Uri uri) {
        return C38669b.m78463a(uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: d */
    public final String mo57049d() {
        return C53438a.m98623b();
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: e */
    public final String mo57051e() {
        return AbstractC68041bz.f152407a.f152410d;
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: c */
    public final Locale mo57046c() {
        return C53438a.m98619a((String) null, (String) null, C17867d.m33078a());
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: b */
    public final int mo57043b() {
        AwemeAppData a = AbstractC30133e.m60956a();
        if (a.f71887e == 1 || a.f71887e == 0 || a.f71887e == 2) {
            return a.f71887e;
        }
        return 2;
    }

    /* renamed from: f */
    public static ICrossPlatformLegacyService m65225f() {
        MethodCollector.m26663i(6280);
        Object a = C81908b.m141854a(ICrossPlatformLegacyService.class, false);
        if (a != null) {
            ICrossPlatformLegacyService iCrossPlatformLegacyService = (ICrossPlatformLegacyService) a;
            MethodCollector.m26664o(6280);
            return iCrossPlatformLegacyService;
        }
        if (C81908b.f183406o == null) {
            synchronized (ICrossPlatformLegacyService.class) {
                try {
                    if (C81908b.f183406o == null) {
                        C81908b.f183406o = new CrossPlatformLegacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6280);
                    throw th;
                }
            }
        }
        CrossPlatformLegacyServiceImpl crossPlatformLegacyServiceImpl = (CrossPlatformLegacyServiceImpl) C81908b.f183406o;
        MethodCollector.m26664o(6280);
        return crossPlatformLegacyServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final String mo57033a(String str) {
        return C58939a.C58940a.f134171a.f134170a.appendDeviceId(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final boolean mo57039a(Context context) {
        return C38669b.m78459a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final void mo57035a(Activity activity, Uri.Builder builder) {
        C39223a.m79587a().mo68688a(activity, builder);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: b */
    public final boolean mo57045b(Context context, Uri uri) {
        return C38663a.m78443a(context, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: c */
    public final boolean mo57048c(Context context, Uri uri) {
        return C38663a.m78449d(context, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: f */
    public final boolean mo57053f(Context context, Uri uri) {
        return C38669b.m78464b(context, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: d */
    public final boolean mo57050d(Context context, Uri uri) {
        return C38663a.m78446b(context, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: e */
    public final boolean mo57052e(Context context, Uri uri) {
        return C38669b.m78460a(context, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final <T> T mo57032a(Object obj, Class<T> cls) {
        if (!(obj instanceof C40589e)) {
            return null;
        }
        C40589e eVar = (C40589e) obj;
        if (cls != AbstractC40593h.class) {
            return null;
        }
        T t = (T) eVar.mo69748a(DownloadBusiness.class);
        if (t instanceof AbstractC40593h) {
            return t;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final void mo57037a(Activity activity, String str) {
        Aweme d = AwemeService.m70060b().mo60690d(str);
        C39223a.m79587a().mo68693a(C67105b.m118761a(d, "homepage_hot"));
        C39223a.m79587a().mo68694b(activity, C67105b.m118760a(d, "landing_page", "ad"));
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final boolean mo57040a(Context context, Uri uri) {
        return C38663a.m78448c(context, uri);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final boolean mo57041a(Context context, String str) {
        return C38668c.m78458a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: b */
    public final void mo57044b(Context context, Aweme aweme, String str) {
        C38663a.m78441a(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: c */
    public final void mo57047c(Context context, Aweme aweme, String str) {
        C38663a.m78447c(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final void mo57038a(Context context, Aweme aweme, String str) {
        C38663a.m78444b(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICrossPlatformLegacyService
    /* renamed from: a */
    public final void mo57036a(Activity activity, View view, float f, String... strArr) {
        HeaderDetailActivity.m115632a(activity, view, f, null, false, false, strArr);
    }
}

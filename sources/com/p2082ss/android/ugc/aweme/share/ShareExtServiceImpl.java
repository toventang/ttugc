package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1722h.C23159f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68023bi;
import com.p2082ss.android.ugc.aweme.setting.C68055cg;
import com.p2082ss.android.ugc.aweme.share.gif.C68932a;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69011av;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69067i;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69070j;
import com.p2082ss.android.ugc.aweme.share.p3744b.C68877a;
import com.p2082ss.android.ugc.aweme.share.p3754i.C68960a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ShareExtServiceImpl */
public final class ShareExtServiceImpl extends AbstractC69270j {
    static {
        Covode.recordClassIndex(81116);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
        if (r5 != null) goto L_0x0039;
     */
    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo109364a(com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71900f r21, android.app.Activity r22) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl.mo109364a(com.ss.android.ugc.aweme.shortvideo.j.f, android.app.Activity):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final AbstractC68023bi mo109355a() {
        return new C68055cg();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: c */
    public final String mo109367c() {
        String a = C34597d.m70636c().mo61051a("last_share_way", "outside_channel");
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: e */
    public static ShareExtService m121353e() {
        MethodCollector.m26663i(8585);
        Object a = C81908b.m141854a(ShareExtService.class, false);
        if (a != null) {
            ShareExtService shareExtService = (ShareExtService) a;
            MethodCollector.m26664o(8585);
            return shareExtService;
        }
        if (C81908b.f183322dS == null) {
            synchronized (ShareExtService.class) {
                try {
                    if (C81908b.f183322dS == null) {
                        C81908b.f183322dS = new ShareExtServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8585);
                    throw th;
                }
            }
        }
        AbstractC69270j jVar = (AbstractC69270j) C81908b.f183322dS;
        MethodCollector.m26664o(8585);
        return jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: d */
    public final String mo109368d() {
        String[] a;
        C68960a a2 = C68960a.m121644a();
        if (a2.mo109508c() == 0 || (a = a2.mo109505a(a2.mo109509d(), 100)) == null || a.length <= 0) {
            return null;
        }
        for (String str : a) {
            AbstractC69581b bVar = C68963a.C68964a.m121652a(str, C17873f.m33102j());
            if (bVar != null && bVar.mo109557b(C17867d.m33078a())) {
                return str;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: b */
    public final String[] mo109366b() {
        String[] strArr;
        C89219l.m154716b(C68960a.m121644a(), "");
        if (C68932a.f154210a == null || C68932a.f154210a.isEmpty()) {
            strArr = new String[0];
        } else {
            ArrayList arrayList = new ArrayList();
            for (C68862ag agVar : C68932a.f154210a) {
                arrayList.add(agVar.f154008a);
            }
            if (!IMAdapterServiceImpl.m101068d().mo90129a()) {
                arrayList.remove("chat_merge");
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        C89219l.m154716b(strArr, "");
        return strArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final void mo109360a(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C12290b.m22060a("save_video_success_rate", 4, new C33743c().mo59976a("errorDesc", "url is illegal").mo59976a("url", str).mo59977a());
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: b */
    public final String mo109365b(Activity activity) {
        AbstractC69581b a;
        C89219l.m154721d(activity, "");
        C68960a.m121644a();
        String c = C48314ai.m91750c();
        String str = "download";
        if (!TextUtils.equals(c, str)) {
            if ("more".equalsIgnoreCase(c)) {
                c = "";
            }
            AbstractC69581b a2 = C68963a.C68964a.m121652a(c, activity);
            if (a2 == null || !a2.mo109557b(activity)) {
                List asList = Arrays.asList(C68960a.m121644a().mo109507b());
                if (!C13603b.m24435a((Collection) asList)) {
                    Iterator it = asList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        if (!TextUtils.equals(str2, "chat_merge") && (a = C68963a.C68964a.m121652a(str2, activity)) != null && a.mo109557b(activity)) {
                            str = a.mo109548a();
                            break;
                        }
                    }
                }
                str = "more";
            } else {
                str = c;
            }
        }
        C89219l.m154716b(str, "");
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final Drawable mo109353a(Activity activity) {
        Drawable a;
        AbstractC69581b a2;
        C89219l.m154721d(activity, "");
        C68960a.m121644a();
        String c = C48314ai.m91750c();
        if (TextUtils.equals(c, "download")) {
            C23001b bVar = new C23001b(activity, R.raw.icon_2pt_arrow_to_bottom);
            bVar.mo37372a(activity, R.attr.bc);
            int b = C23159f.m43650b(32);
            bVar.mo37371a(b);
            bVar.mo37375b(b);
            C23008e eVar = new C23008e();
            int b2 = C23159f.m43650b(48);
            eVar.f54469h = b2;
            eVar.f54468g = b2;
            eVar.f54464c = Float.valueOf(((float) b2) / 2.0f);
            eVar.f54467f = Integer.valueOf((int) R.attr.bc);
            eVar.f54465d = Integer.valueOf(C23159f.m43650b(1));
            eVar.f54463b = Integer.valueOf((int) R.attr.m);
            a = new LayerDrawable(new Drawable[]{eVar.mo37389a(activity), bVar});
        } else {
            if ("more".equalsIgnoreCase(c)) {
                c = "";
            }
            AbstractC69581b a3 = C68963a.C68964a.m121652a(c, activity);
            if (a3 == null || !a3.mo109557b(activity)) {
                List asList = Arrays.asList(C68960a.m121644a().mo109507b());
                if (!C13603b.m24435a((Collection) asList)) {
                    Iterator it = asList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        if (!TextUtils.equals(str, "chat_merge") && (a2 = C68963a.C68964a.m121652a(str, activity)) != null && a2.mo109557b(activity)) {
                            a = a2.mo109547a(activity);
                            break;
                        }
                    }
                }
                C22999a aVar = new C22999a();
                aVar.f54431a = R.raw.icon_color_ellipsis_circle;
                a = aVar.mo37368a(activity);
            } else {
                a = a3.mo109547a(activity);
            }
        }
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final Drawable mo109354a(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        AbstractC69581b a = C68963a.C68964a.m121652a(str, activity);
        if (a != null) {
            return a.mo109547a(activity);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final void mo109361a(String str, int i) {
        C89219l.m154721d(str, "");
        C68960a.m121644a().mo109504a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final boolean mo109363a(Aweme aweme, Context context) {
        C89219l.m154721d(context, "");
        return C69011av.m121895a(aweme, context);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final AbstractC69693h mo109357a(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        if (str == null) {
            str = "";
        }
        return new C69067i(aweme, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final void mo109362a(String str, Aweme aweme, Bundle bundle) {
        C89219l.m154721d(str, "");
        C68877a.C68878a.m121551a(str, aweme, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareExtService
    /* renamed from: a */
    public final AbstractC69693h mo109356a(Activity activity, Aweme aweme, String str, String str2) {
        String str3 = str;
        String str4 = "";
        C89219l.m154721d(activity, str4);
        C89219l.m154721d(aweme, str4);
        if (str3 == null) {
            str3 = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        return new C69070j(activity, aweme, str3, str4, "");
    }
}

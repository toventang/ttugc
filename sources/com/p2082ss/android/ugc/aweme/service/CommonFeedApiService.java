package com.p2082ss.android.ugc.aweme.service;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.p2082ss.android.newmedia.C30147h;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33739f;
import com.p2082ss.android.ugc.aweme.app.C33856v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService;
import com.p2082ss.android.ugc.aweme.feed.C49710k;
import com.p2082ss.android.ugc.aweme.feed.assem.C48342a;
import com.p2082ss.android.ugc.aweme.feed.assem.digg.C48665a;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49528s;
import com.p2082ss.android.ugc.aweme.feed.guide.C49594i;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2948h.C49610a;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.push.C65724g;
import java.util.List;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.service.CommonFeedApiService */
public final class CommonFeedApiService implements ICommonFeedApiService {
    static {
        Covode.recordClassIndex(79507);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: e */
    public final boolean mo61331e() {
        return C49710k.f114396d;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: a */
    public final AbstractC89277c<? extends AbstractC12693u<? extends AbstractC22876d>> mo61325a() {
        return C89204ab.m154669a(C48665a.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: b */
    public final long mo61328b() {
        return C33856v.C33858a.f80147a.f80142a;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: c */
    public final boolean mo61329c() {
        return C49594i.m93009b();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: d */
    public final boolean mo61330d() {
        if (!C48342a.f112042a || !C49528s.f113906a) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: f */
    public final void mo61332f() {
        C58945a.C58947b.f134185a.mo96425a("feed_player_to_render", false);
        if (SettingsRequestServiceImpl.m65417i().mo57288f() == 1) {
            C49301e.m92366b(true);
        }
    }

    /* renamed from: g */
    public static ICommonFeedApiService m120037g() {
        MethodCollector.m26663i(3453);
        Object a = C81908b.m141854a(ICommonFeedApiService.class, false);
        if (a != null) {
            ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) a;
            MethodCollector.m26664o(3453);
            return iCommonFeedApiService;
        }
        if (C81908b.f183338di == null) {
            synchronized (ICommonFeedApiService.class) {
                try {
                    if (C81908b.f183338di == null) {
                        C81908b.f183338di = new CommonFeedApiService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3453);
                    throw th;
                }
            }
        }
        CommonFeedApiService commonFeedApiService = (CommonFeedApiService) C81908b.f183338di;
        MethodCollector.m26664o(3453);
        return commonFeedApiService;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: a */
    public final List<AnchorCommonStruct> mo61326a(Aweme aweme) {
        return C49912a.m93713a().mo84955b(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.ICommonFeedApiService
    /* renamed from: a */
    public final void mo61327a(Uri uri, boolean z) {
        String str;
        MethodCollector.m26663i(3300);
        C89219l.m154721d(uri, "");
        if (C33739f.m69067b(uri)) {
            C65724g a = C65724g.m117661a();
            for (String str2 : C33739f.m69066a(uri)) {
                if (!TextUtils.isEmpty(str2)) {
                    C65724g.C65725a aVar = new C65724g.C65725a((byte) 0);
                    aVar.f148112a = str2;
                    synchronized (a) {
                        try {
                            if (!a.f148110a.contains(aVar)) {
                                a.f148110a.add(aVar);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(3300);
                            throw th;
                        }
                    }
                }
            }
            C65724g.m117661a().f148111b = true;
            try {
                if (!C30147h.f71913a || !z) {
                    MethodCollector.m26664o(3300);
                    return;
                }
                if (uri != null) {
                    String path = uri.getPath();
                    if (C33739f.m69067b(uri) && !C13627m.m24498a(path) && path.startsWith("/detail/")) {
                        str = uri.getLastPathSegment();
                        C49610a.m93030a().mo81403a(str, System.currentTimeMillis());
                        MethodCollector.m26664o(3300);
                        return;
                    }
                }
                str = "";
                C49610a.m93030a().mo81403a(str, System.currentTimeMillis());
                MethodCollector.m26664o(3300);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(3300);
    }
}

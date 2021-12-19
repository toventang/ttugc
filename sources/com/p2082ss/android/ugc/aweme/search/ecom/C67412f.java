package com.p2082ss.android.ugc.aweme.search.ecom;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67400a;
import com.p2082ss.android.ugc.aweme.search.ecom.p3689b.C67404c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.f */
public final class C67412f implements AbstractC67393a {

    /* renamed from: f */
    private static final C67413a f151014f = new C67413a((byte) 0);

    /* renamed from: a */
    public final AbstractC89171a<Context> f151015a;

    /* renamed from: b */
    public final AbstractC89171a<User> f151016b;

    /* renamed from: c */
    public final AbstractC89171a<C67568r> f151017c;

    /* renamed from: d */
    public final AbstractC89171a<String> f151018d;

    /* renamed from: e */
    public final AbstractC89171a<String> f151019e;

    static {
        Covode.recordClassIndex(79045);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.f$a */
    static final class C67413a {
        static {
            Covode.recordClassIndex(79046);
        }

        private C67413a() {
        }

        public /* synthetic */ C67413a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static Uri m119450a(Uri uri, String str) {
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        if (!(!queryParameterNames.isEmpty()) || queryParameterNames == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!C89219l.m154714a((Object) str2, (Object) str)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        Uri build = clearQuery.build();
        C89219l.m154716b(build, "");
        return build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (0 != 0) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039 A[LOOP:0: B:10:0x0033->B:12:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0096  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m119451a(com.p2082ss.android.ugc.aweme.search.ecom.p3688a.C67394a r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.ecom.C67412f.m119451a(com.ss.android.ugc.aweme.search.ecom.a.a, java.util.Map):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.search.ecom.AbstractC67393a
    /* renamed from: a */
    public final void mo106300a(C67394a aVar, int i) {
        String str = "";
        C89219l.m154721d(aVar, str);
        C67568r invoke = this.f151017c.invoke();
        Map<String, String> a = C67404c.m119439a(this.f151016b.invoke(), aVar, invoke);
        a.put("item_order", String.valueOf(i + 1));
        String str2 = aVar.f150992h;
        String str3 = null;
        if (str2 == null || str2.length() <= 0) {
            String builder = Uri.parse("aweme://webview/").buildUpon().appendQueryParameter("url", aVar.f150993i).appendQueryParameter("title", aVar.f150986b).toString();
            C89219l.m154716b(builder, str);
            SmartRouter.buildRoute(this.f151015a.invoke(), builder).open();
        } else {
            C89219l.m154721d(a, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(a);
            String remove = linkedHashMap.remove("enter_from");
            if (remove != null) {
                str = remove;
            }
            linkedHashMap.put("enter_from_info", str);
            linkedHashMap.remove("page_name");
            linkedHashMap.put("source_page_type", "show_window");
            m119451a(aVar, linkedHashMap);
        }
        new C67400a().mo106450b(a).mo96792f();
        C67542d dVar = (C67542d) ((C67542d) ((C67542d) ((C67542d) C42317b.m84680b(invoke).mo106487g(invoke.f151319n)).mo106497x(this.f151018d.invoke())).mo106496w(this.f151019e.invoke())).mo106491r("mt_goods");
        User invoke2 = this.f151016b.invoke();
        if (invoke2 != null) {
            str3 = invoke2.getUid();
        }
        ((C67542d) ((C67542d) dVar.mo106495v(str3)).mo106492s(aVar.f150986b)).mo106490d(Integer.valueOf(i)).mo96792f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends android.content.Context> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public C67412f(AbstractC89171a<? extends Context> aVar, AbstractC89171a<? extends User> aVar2, AbstractC89171a<C67568r> aVar3, AbstractC89171a<String> aVar4, AbstractC89171a<String> aVar5) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        C89219l.m154721d(aVar5, "");
        this.f151015a = aVar;
        this.f151016b = aVar2;
        this.f151017c = aVar3;
        this.f151018d = aVar4;
        this.f151019e = aVar5;
    }
}

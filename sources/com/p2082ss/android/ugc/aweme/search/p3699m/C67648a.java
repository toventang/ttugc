package com.p2082ss.android.ugc.aweme.search.p3699m;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.search.m.a */
public final class C67648a {

    /* renamed from: a */
    public static final C67648a f151557a = new C67648a();

    private C67648a() {
    }

    static {
        Covode.recordClassIndex(79288);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0013 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m119791a(android.net.Uri r6, com.p2082ss.android.ugc.aweme.search.model.C67674b.C67675a r7) {
        /*
        // Method dump skipped, instructions count: 394
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.p3699m.C67648a.m119791a(android.net.Uri, com.ss.android.ugc.aweme.search.model.b$a):void");
    }

    /* renamed from: a */
    public static void m119792a(Uri uri, C67678d dVar) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        Integer e;
        String queryParameter9;
        String queryParameter10;
        String queryParameter11;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        dVar.setFilterOption(new C67437b());
        if (!(queryParameterNames == null || queryParameterNames.isEmpty())) {
            for (String str : queryParameterNames) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1841902086:
                            if (str.equals("is_filter_search") && (queryParameter = uri.getQueryParameter(str)) != null) {
                                dVar.getFilterOption().setDefaultOption(C89219l.m154714a((Object) "0", (Object) queryParameter));
                                break;
                            }
                        case -1780004746:
                            if (str.equals("pre_search_id") && (queryParameter2 = uri.getQueryParameter(str)) != null) {
                                dVar.setLastSearchId(queryParameter2);
                                break;
                            }
                        case -814408215:
                            if (str.equals("keyword") && (queryParameter3 = uri.getQueryParameter(str)) != null) {
                                if (!queryParameterNames.contains("display_keyword")) {
                                    dVar.setKeyword(queryParameter3);
                                    break;
                                } else {
                                    String queryParameter12 = uri.getQueryParameter("display_keyword");
                                    if (!TextUtils.isEmpty(queryParameter12)) {
                                        queryParameter3 = queryParameter12;
                                    }
                                    dVar.setKeyword(queryParameter3);
                                    break;
                                }
                            }
                        case -685906904:
                            if (str.equals("enter_method") && (queryParameter4 = uri.getQueryParameter(str)) != null) {
                                dVar.setEnterMethod(queryParameter4);
                                break;
                            }
                        case -539642911:
                            if (str.equals("search_from") && (queryParameter5 = uri.getQueryParameter(str)) != null) {
                                dVar.setSearchFrom(queryParameter5);
                                break;
                            }
                        case -429654716:
                            if (str.equals("event_keyword") && (queryParameter6 = uri.getQueryParameter(str)) != null) {
                                dVar.setEventKeyword(queryParameter6);
                                break;
                            }
                        case -346952694:
                            if (str.equals("switch_tab") && (queryParameter7 = uri.getQueryParameter(str)) != null) {
                                dVar.setSwitchTab(queryParameter7);
                                break;
                            }
                        case -11918021:
                            if (!(!str.equals("sort_type") || (queryParameter8 = uri.getQueryParameter(str)) == null || (e = C89361p.m154863e(queryParameter8)) == null)) {
                                dVar.getFilterOption().setSortType(e.intValue());
                                break;
                            }
                        case 3151786:
                            if (str.equals("from") && (queryParameter9 = uri.getQueryParameter(str)) != null && C89219l.m154714a((Object) queryParameter9, (Object) "push")) {
                                dVar.setSearchFrom("push");
                                break;
                            }
                        case 765499066:
                            if (str.equals("trending_event_id") && (queryParameter10 = uri.getQueryParameter(str)) != null) {
                                dVar.setTrendingEventId(queryParameter10);
                                break;
                            }
                        case 2071166924:
                            if (str.equals("utm_source") && (queryParameter11 = uri.getQueryParameter(str)) != null) {
                                dVar.setUtmSource(queryParameter11);
                                break;
                            }
                    }
                }
            }
        }
    }
}

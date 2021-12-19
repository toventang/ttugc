package com.p2082ss.android.ugc.aweme.p2404bs;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import java.util.ArrayList;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bs.a */
public final class C34931a {

    /* renamed from: a */
    public static final C27910f f82403a = new C27910f();

    /* renamed from: b */
    public static final String f82404b = "api_error_full_log";

    /* renamed from: c */
    public static final C34931a f82405c = new C34931a();

    /* renamed from: d */
    private static final String f82406d = "ApiErrorMonitor";

    /* renamed from: e */
    private static ArrayList<Integer> f82407e;

    /* renamed from: f */
    private static final ArrayList<String> f82408f = C89070n.m154525d("/service/1/update_token/", "/aweme/v1/aweme/detail/", "/aweme/v1/user/", "/aweme/v1/abtest/param/", "/aweme/v1/commerce/settings", "/aweme/v1/feed/", "/aweme/v1/settings/", "/aweme/v1/story/", "/aweme/v1/user/settings/", "/aweme/v1/im/cloud/token/", "/aweme/v1/upload/contacts/", "/aweme/v1/aweme/post/", "/aweme/v1/user/", "/aweme/v1/commit/follow/user/", "/aweme/v1/multi/aweme/detail/", "/aweme/v1/comment/publish/", "/aweme/v1/general/search/", "/passport/user/logout/", "/aweme/v1/commit/item/digg/", "/user/mobile/reset_password/", "/passport/auth/login/", "/aweme/v1/create/aweme/", "/aweme/v1/recommend/user/", "/aweme/v2/comment/list/", "/passport/mobile/login/", "/aweme/v1/user/follower/list/", "/aweme/v1/notice/count/", "/aweme/v1/friend/feed/", "/aweme/v1/aweme/stats/", "/aweme/v1/hot/search/list/", "/aweme/v1/recommend/challenge/");

    private C34931a() {
    }

    static {
        Covode.recordClassIndex(41952);
    }

    /* renamed from: a */
    public static ArrayList<Integer> m71317a() {
        MethodCollector.m26663i(9637);
        if (f82407e == null) {
            synchronized (f82405c) {
                try {
                    ArrayList<Integer> arrayList = f82407e;
                    if (arrayList != null) {
                        return arrayList;
                    }
                    f82407e = new ArrayList<>();
                    for (T t : f82408f) {
                        ArrayList<Integer> arrayList2 = f82407e;
                        if (arrayList2 == null) {
                            C89219l.m154715b();
                        }
                        arrayList2.add(Integer.valueOf(t.hashCode()));
                    }
                } finally {
                    MethodCollector.m26664o(9637);
                }
            }
        }
        ArrayList<Integer> arrayList3 = f82407e;
        MethodCollector.m26664o(9637);
        return arrayList3;
    }
}

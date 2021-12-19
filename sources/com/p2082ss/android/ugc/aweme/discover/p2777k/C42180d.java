package com.p2082ss.android.ugc.aweme.discover.p2777k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.k.d */
public final class C42180d {

    /* renamed from: a */
    public static final C42182b f98310a = null;

    /* renamed from: b */
    public static final C42180d f98311b = new C42180d();

    /* renamed from: com.ss.android.ugc.aweme.discover.k.d$a */
    public static final class C42181a implements Serializable {
        @AbstractC27891c(mo46611a = "search_type")

        /* renamed from: a */
        private String f98312a = "";
        @AbstractC27891c(mo46611a = "schema")

        /* renamed from: b */
        private String f98313b = "";

        static {
            Covode.recordClassIndex(50120);
        }

        public final String getSchema() {
            return this.f98313b;
        }

        public final String getSearchType() {
            return this.f98312a;
        }

        public final void setSchema(String str) {
            C89219l.m154721d(str, "");
            this.f98313b = str;
        }

        public final void setSearchType(String str) {
            C89219l.m154721d(str, "");
            this.f98312a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.k.d$b */
    public static final class C42182b implements Serializable {
        @AbstractC27891c(mo46611a = "feedback_list")

        /* renamed from: a */
        private List<C42181a> f98314a = new ArrayList();

        static {
            Covode.recordClassIndex(50121);
        }

        public final List<C42181a> getFeedbackList() {
            return this.f98314a;
        }

        public final void setFeedbackList(List<C42181a> list) {
            C89219l.m154721d(list, "");
            this.f98314a = list;
        }
    }

    private C42180d() {
    }

    static {
        Covode.recordClassIndex(50119);
    }

    /* renamed from: a */
    private static C42182b m84433a() {
        return (C42182b) SettingsManager.m29616a().mo25397a("search_user_feedback", C42182b.class, f98310a);
    }

    /* renamed from: a */
    public static final C42181a m84432a(String str) {
        List<C42181a> feedbackList;
        C89219l.m154721d(str, "");
        C42182b a = m84433a();
        if (a == null || (feedbackList = a.getFeedbackList()) == null) {
            return null;
        }
        for (T t : feedbackList) {
            if (C89219l.m154714a((Object) t.getSearchType(), (Object) str)) {
                return t;
            }
        }
        return null;
    }
}

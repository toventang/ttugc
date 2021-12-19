package com.p2082ss.android.ugc.aweme.discover.p2797ui.intermediate;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.lynx.container.C42201a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42345d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.a */
public final class C42869a {

    /* renamed from: a */
    public static C42870a f99964a;

    /* renamed from: b */
    public static final C42869a f99965b = new C42869a();

    /* renamed from: c */
    private static final List<C42201a> f99966c;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.intermediate.a$a */
    public static final class C42870a implements Serializable {
        @AbstractC27891c(mo46611a = "data_list")

        /* renamed from: a */
        private List<C42201a> f99967a = new ArrayList();

        static {
            Covode.recordClassIndex(50975);
        }

        public final List<C42201a> getDefaultConfigs() {
            return this.f99967a;
        }

        public final void setDefaultConfigs(List<C42201a> list) {
            C89219l.m154721d(list, "");
            this.f99967a = list;
        }
    }

    private C42869a() {
    }

    /* renamed from: a */
    public static List<C42201a> m85601a() {
        List<C42201a> defaultConfigs;
        try {
            f99964a = (C42870a) SettingsManager.m29616a().mo25397a("search_intermediate_config", C42870a.class, f99964a);
        } catch (Throwable unused) {
        }
        C42870a aVar = f99964a;
        if (aVar == null || (defaultConfigs = aVar.getDefaultConfigs()) == null) {
            return f99966c;
        }
        return defaultConfigs;
    }

    static {
        Covode.recordClassIndex(50974);
        C42345d dVar = new C42345d();
        dVar.setSchema("aweme://lynxview/?channel=fe_tiktok_lynx_search_transfer&bundle=template.js&group=fe_tiktok_lynx_search_transfer&ab_params=show_most_visited_account,show_suggest_search_words,intermediate_show_trending_billboard,is_lynx_request_suggest");
        f99966c = C89070n.m154524c(new C42201a(dVar));
    }
}

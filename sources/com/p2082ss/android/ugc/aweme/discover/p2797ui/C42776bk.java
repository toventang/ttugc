package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41549u;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bk */
public final class C42776bk {
    static {
        Covode.recordClassIndex(50880);
    }

    /* renamed from: c */
    public static final boolean m85483c(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(eVar).f100248a;
        if (bVar != null) {
            return bVar.isFromDiscoverSuggestSearch();
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m85481a(ActivityC0945e eVar) {
        String str;
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(eVar).f100248a;
        String str2 = null;
        if (bVar != null) {
            str = bVar.getEnterSearchFrom();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "homepage_hot")) {
            return true;
        }
        C67674b bVar2 = SearchEnterViewModel.C42997a.m85830a(eVar).f100248a;
        if (bVar2 != null) {
            str2 = bVar2.getEnterSearchFrom();
        }
        if (C89219l.m154714a((Object) str2, (Object) "homepage_follow")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m85482b(ActivityC0945e eVar) {
        String str;
        C89219l.m154721d(eVar, "");
        C67674b bVar = SearchEnterViewModel.C42997a.m85830a(eVar).f100248a;
        if (bVar != null) {
            str = bVar.getEnterSearchFrom();
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) str, (Object) "discovery")) {
            return true;
        }
        if (!m85481a(eVar) || !C41549u.m83484a()) {
            return false;
        }
        return true;
    }
}

package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.util.LinkedHashMap;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.o */
public final class C42433o {
    static {
        Covode.recordClassIndex(50379);
    }

    /* renamed from: a */
    public static final C1731i<C42426m> m84811a(C42427n nVar) {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        LinkedHashMap<String, Integer> linkedHashMap;
        C67678d dVar;
        C67678d dVar2;
        String str5 = "";
        C89219l.m154721d(nVar, str5);
        SearchApiNew.RealApi realApi = SearchApiNew.RealApi.C41840a.f97604a;
        String str6 = nVar.f98861b;
        int i3 = nVar.f98862c;
        int i4 = nVar.f98863d;
        if (!TextUtils.isEmpty(nVar.f98869j)) {
            str = nVar.f98869j;
        } else {
            str = null;
        }
        int i5 = nVar.f98870k;
        if (!TextUtils.isEmpty(nVar.f98865f)) {
            str2 = nVar.f98865f;
        } else {
            str2 = null;
        }
        String str7 = nVar.f98866g;
        int i6 = nVar.f98867h;
        int i7 = nVar.f98878s;
        String str8 = nVar.f98879t;
        String str9 = nVar.f98880u;
        Integer num = nVar.f98871l;
        int i8 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = nVar.f98873n;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        Integer num3 = nVar.f98872m;
        if (num3 != null) {
            i8 = num3.intValue();
        }
        String str10 = nVar.f98877r;
        C42174f fVar = nVar.f98882w;
        if (fVar == null || (dVar2 = fVar.f98301r) == null) {
            str3 = null;
        } else {
            str3 = dVar2.getGuideSearchBaseWord();
        }
        String str11 = nVar.f98881v;
        if (str11 == null) {
            C42174f fVar2 = nVar.f98882w;
            if (fVar2 == null || (dVar = fVar2.f98301r) == null) {
                str11 = null;
            } else {
                str11 = dVar.getWordType();
            }
        }
        String str12 = nVar.f98883x;
        if (str12 != null) {
            str5 = str12;
        }
        String a = RawURLGetter.m77316a("other");
        C67678d dVar3 = nVar.f98860a;
        if (dVar3 != null) {
            str4 = dVar3.getTrendingEventId();
        } else {
            str4 = null;
        }
        C67437b bVar = nVar.f98868i;
        if (bVar == null || (linkedHashMap = bVar.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        return realApi.searchMTMixFeedList(str6, i3, i4, str, i5, str2, str7, i6, i7, str8, str9, i, i2, i8, str10, str3, str11, str5, a, str4, linkedHashMap);
    }
}

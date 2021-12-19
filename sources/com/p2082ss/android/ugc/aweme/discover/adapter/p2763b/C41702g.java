package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67517bc;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67528bi;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67530bj;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67532bk;
import com.p2082ss.android.ugc.aweme.utils.C80514gu;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.g */
public final class C41702g {

    /* renamed from: a */
    public static String f97285a = "";

    /* renamed from: b */
    public static final C41702g f97286b = new C41702g();

    private C41702g() {
    }

    static {
        Covode.recordClassIndex(49615);
    }

    /* renamed from: a */
    public static void m83659a(String str) {
        C89219l.m154721d(str, "");
        f97285a = str;
    }

    /* renamed from: a */
    public static final void m83658a(int i, C67679e eVar) {
        String str;
        if (eVar != null) {
            C67517bc bcVar = new C67517bc();
            Word word = eVar.f151671f;
            String str2 = null;
            if (word != null) {
                str = word.getId();
            } else {
                str = null;
            }
            C67530bj bjVar = (C67530bj) bcVar.mo106453i(str);
            Word word2 = eVar.f151671f;
            if (word2 != null) {
                str2 = word2.getWord();
            }
            bjVar.mo106475w(str2).mo106474v("sug").mo106471d(Integer.valueOf(i)).mo106475w(eVar.f151667b).mo106473u("enrich_sug").mo96788a(eVar.f151676k).mo96792f();
        }
    }

    /* renamed from: a */
    public static final void m83660a(String str, int i, C67679e eVar, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        if (eVar != null && !eVar.f151675j) {
            eVar.f151675j = true;
            Map<String, String> map = eVar.f151676k;
            String str7 = null;
            if (map != null && C41708l.m83667a(eVar)) {
                C67684i iVar = eVar.f151672g;
                if (iVar != null) {
                    str5 = iVar.getUserId();
                } else {
                    str5 = null;
                }
                if (C80538hl.m139614a(str5)) {
                    C67684i iVar2 = eVar.f151672g;
                    if (iVar2 != null) {
                        str6 = iVar2.getUserId();
                    } else {
                        str6 = null;
                    }
                    map.put("sug_user_id", str6);
                }
            }
            C67532bk bkVar = new C67532bk();
            C67684i iVar3 = eVar.f151672g;
            if (iVar3 != null) {
                str3 = iVar3.getUserRelationType();
            } else {
                str3 = null;
            }
            C67530bj y = bkVar.mo106472t(str3).mo106477y(str);
            SearchResultActivity a = C80514gu.m139557a();
            if (a != null) {
                y.mo106469a(SearchEnterViewModel.C42997a.m85830a(a).mo73185b().obtainLogData("tab_name"));
            }
            Word word = eVar.f151671f;
            if (word != null) {
                str4 = word.getId();
            } else {
                str4 = null;
            }
            C67530bj bjVar = (C67530bj) y.mo106453i(str4);
            Word word2 = eVar.f151671f;
            if (word2 != null) {
                str7 = word2.getWord();
            }
            C67530bj bjVar2 = (C67530bj) bjVar.mo106475w(str7).mo106474v("sug").mo106475w(eVar.f151667b).mo106471d(Integer.valueOf(i)).mo106473u(str2).mo96788a(eVar.f151676k);
            String str8 = f97285a;
            if (str8 == null) {
                str8 = "";
            }
            bjVar2.mo106468E(str8).mo96792f();
        }
    }

    /* renamed from: b */
    public static final void m83661b(String str, int i, C67679e eVar, String str2) {
        String str3;
        String str4;
        Map<String, String> map;
        if (eVar != null) {
            if (!C41708l.m83667a(eVar) && (map = eVar.f151676k) != null) {
                map.remove("sug_user_id");
            }
            C67528bi biVar = new C67528bi();
            C67684i iVar = eVar.f151672g;
            String str5 = null;
            if (iVar != null) {
                str3 = iVar.getUserRelationType();
            } else {
                str3 = null;
            }
            C67530bj y = biVar.mo106472t(str3).mo106477y(str);
            SearchResultActivity a = C80514gu.m139557a();
            if (a != null) {
                y.mo106469a(SearchEnterViewModel.C42997a.m85830a(a).mo73185b().obtainLogData("tab_name"));
            }
            Word word = eVar.f151671f;
            if (word != null) {
                str4 = word.getId();
            } else {
                str4 = null;
            }
            C67530bj bjVar = (C67530bj) y.mo106453i(str4);
            Word word2 = eVar.f151671f;
            if (word2 != null) {
                str5 = word2.getWord();
            }
            C67530bj u = bjVar.mo106475w(str5).mo106474v("sug").mo106475w(eVar.f151667b).mo106471d(Integer.valueOf(i)).mo106473u(str2);
            String str6 = f97285a;
            if (str6 == null) {
                str6 = "";
            }
            u.mo106468E(str6).mo96788a(eVar.f151676k).mo96792f();
        }
    }
}

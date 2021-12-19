package com.p2082ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67504aw;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3700n.C67690d;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.n */
public final class C42466n implements ISearchResultStatistics {

    /* renamed from: a */
    public static final C42466n f98992a = new C42466n();

    private C42466n() {
    }

    static {
        Covode.recordClassIndex(50415);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    /* renamed from: a */
    public final void mo71656a(C42464l lVar) {
        C89219l.m154721d(lVar, "");
        ((C67540c) new C67504aw(lVar.f98987a).mo106459o(lVar.f98988b)).mo106483c(C48027ac.C48028a.f111257a.mo80055a(C42452d.m84857a())).mo106487g(C42452d.f98933e).mo96786a("music_id", lVar.f98989c).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    /* renamed from: a */
    public final void mo71655a(C42454f fVar) {
        String str;
        C89219l.m154721d(fVar, "");
        String a = C42452d.m84857a();
        C67540c g = ((C67540c) new C67504aw(fVar.f98959a).mo106459o(fVar.f98961c).mo106460p(fVar.f98963e)).mo106483c(C48027ac.C48028a.f111257a.mo80055a(a)).mo106487g(C42452d.f98933e);
        if (C89219l.m154714a((Object) C42452d.f98934f, (Object) "general_search")) {
            str = "general";
        } else {
            str = C42452d.f98934f;
        }
        C67504aw awVar = (C67504aw) g.mo106486f(str).mo106480a(a).mo106457m(fVar.f98964f);
        String str2 = fVar.f98965g;
        C89219l.m154721d(str2, "");
        awVar.mo106452c("follow_type", str2);
        C67504aw awVar2 = awVar;
        awVar2.mo106452c("is_search_scene", String.valueOf(Integer.valueOf(fVar.f98966h)));
        awVar2.mo96786a("to_user_id", fVar.f98960b).mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics
    /* renamed from: a */
    public final void mo71657a(C42470r rVar) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        C67469ad c;
        Video video;
        C67469ad c2;
        String str5 = "";
        C89219l.m154721d(rVar, str5);
        String a = C42452d.m84857a();
        C67511b o = new C67504aw(rVar.f99007a).mo106459o(rVar.f99009c);
        Aweme aweme = rVar.f99008b;
        String str6 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        C67511b j = o.mo106454j(str);
        Aweme aweme2 = rVar.f99008b;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        C67540c c3 = ((C67540c) j.mo106453i(str2)).mo106483c(C48027ac.C48028a.f111257a.mo80055a(a));
        AbstractC67567q a2 = C67486am.m119564a();
        int i2 = 0;
        if (a2 != null) {
            i = a2.mo106426a();
        } else {
            i = 0;
        }
        C67540c a3 = c3.mo106486f(C42465m.m84870b(i)).mo106487g(C42452d.f98933e).mo106484d(a).mo106479a(Integer.valueOf(C42452d.f98935g));
        C67568r rVar2 = C42452d.f98937i;
        if (rVar2 != null) {
            str3 = rVar2.f151315j;
        } else {
            str3 = null;
        }
        C67540c d = a3.mo106484d(str3);
        AbstractC67567q a4 = C67486am.m119564a();
        if (a4 == null || (c2 = a4.mo106431c()) == null) {
            str4 = null;
        } else {
            str4 = c2.f151151a;
        }
        C67540c cVar = (C67540c) d.mo106480a(str4).mo96788a(C80632w.m139800a(rVar.f99008b, rVar.f99007a, rVar.f99009c));
        if (rVar.f99010d >= 0) {
            cVar.mo96786a("duration", String.valueOf(rVar.f99010d));
            Aweme aweme3 = rVar.f99008b;
            if (aweme3 == null || (video = aweme3.getVideo()) == null || (i2 = video.getDuration()) >= 0) {
                double d2 = (double) rVar.f99010d;
                Double.isNaN(d2);
                double d3 = (double) i2;
                Double.isNaN(d3);
                cVar.mo96786a("percentage", String.valueOf((d2 * 1.0d) / d3));
            }
        }
        if (!TextUtils.isEmpty(rVar.f99012f)) {
            cVar.mo96786a("previous_page", rVar.f99012f);
        }
        if (C42452d.f98936h != null) {
            Map<String, String> map = C42452d.f98936h;
            if (map == null) {
                C89219l.m154715b();
            }
            cVar.mo106450b(map);
        }
        if (!TextUtils.isEmpty(rVar.f99013g)) {
            cVar.mo96786a("previous_page_position", rVar.f99013g);
        }
        if (C89219l.m154714a((Object) rVar.f99009c, (Object) "playlist")) {
            String str7 = rVar.f99012f;
            if (str7 == null) {
                str7 = str5;
            }
            Map<String, String> a5 = C67690d.C67691a.m119847a(str7);
            String str8 = a5.get("is_from_video");
            if (str8 != null) {
                str5 = str8;
            }
            String str9 = a5.get("list_item_id");
            if (str9 == null) {
                Aweme aweme4 = rVar.f99008b;
                if (aweme4 != null) {
                    str9 = aweme4.getAid();
                } else {
                    str9 = null;
                }
            }
            if (C89219l.m154714a((Object) str5, (Object) "0") || C89219l.m154714a((Object) str5, (Object) "2")) {
                Aweme aweme5 = rVar.f99008b;
                if (aweme5 != null) {
                    str6 = aweme5.getAid();
                }
                cVar.mo96786a("search_third_item_id", str6);
            }
            cVar.mo96786a("is_from_video", str5);
            cVar.mo96786a("list_item_id", str9);
            cVar.mo106479a(Integer.valueOf((int) rVar.f99014h));
            cVar.mo106487g(a5.get("search_result_id"));
        } else {
            AbstractC67567q a6 = C67486am.m119564a();
            if (!(a6 == null || (c = a6.mo106431c()) == null)) {
                str6 = c.f151152b;
            }
            cVar.mo106482b(str6);
        }
        cVar.mo96792f();
    }
}

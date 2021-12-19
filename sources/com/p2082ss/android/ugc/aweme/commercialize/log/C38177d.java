package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2554c.AbstractC37786a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.p2573l.C38032b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.d */
public final class C38177d implements AbstractC38157ad {

    /* renamed from: a */
    public static final C38177d f90185a = new C38177d();

    /* renamed from: b */
    private static final AbstractC89244h f90186b = C89250i.m154773a((AbstractC89171a) C38178a.f90189a);

    /* renamed from: c */
    private static final AbstractC89244h f90187c = C89250i.m154773a((AbstractC89171a) C38179b.f90190a);

    /* renamed from: d */
    private static final Set<String> f90188d = C89047am.m154438a((Object[]) new String[]{"card", "link", "egg"});

    /* renamed from: a */
    private static HashMap<String, Long> m77401a() {
        return (HashMap) f90186b.getValue();
    }

    private C38177d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38157ad
    /* renamed from: a */
    public final void mo66459a(Aweme aweme, C38214ac acVar) {
        if (aweme != null && acVar != null) {
            m77404a("link", "show_result", acVar.creativeId, acVar.logExtra, aweme.getAid(), 0);
        }
    }

    /* renamed from: a */
    public final void mo66479a(String str, String str2, Long l, String str3, String str4, int i) {
        String str5;
        if (l == null || (str5 = String.valueOf(l.longValue())) == null) {
            str5 = "-1";
        }
        m77404a(str, str2, str5, str3, str4, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38157ad
    /* renamed from: a */
    public final void mo66460a(List<? extends Aweme> list) {
        AwemeRawAd awemeRawAd;
        if (list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (!(!t2.isAd() || (awemeRawAd = t2.getAwemeRawAd()) == null || awemeRawAd.getCardInfos() == null)) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                C38177d dVar = f90185a;
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                Long creativeId = awemeRawAd2 != null ? awemeRawAd2.getCreativeId() : null;
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                dVar.mo66479a((C38177d) "card", "data_received", (String) creativeId, (Long) (awemeRawAd3 != null ? awemeRawAd3.getLogExtra() : null), aweme.getAid(), (String) -1);
            }
        }
        AbstractC37786a b = ((ICommerceEggService) f90187c.getValue()).mo65839b();
        b.mo65798a(list);
        b.mo65799b(list);
        m77407b(list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.d$a */
    static final class C38178a extends AbstractC89220m implements AbstractC89171a<HashMap<String, Long>> {

        /* renamed from: a */
        public static final C38178a f90189a = new C38178a();

        static {
            Covode.recordClassIndex(45657);
        }

        C38178a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, Long> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.d$b */
    static final class C38179b extends AbstractC89220m implements AbstractC89171a<ICommerceEggService> {

        /* renamed from: a */
        public static final C38179b f90190a = new C38179b();

        static {
            Covode.recordClassIndex(45658);
        }

        C38179b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ICommerceEggService invoke() {
            return CommerceEggServiceImpl.m76488c();
        }
    }

    static {
        Covode.recordClassIndex(45656);
    }

    /* renamed from: b */
    private static void m77407b(List<? extends Aweme> list) {
        UrlModel redImageUrl;
        if (list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (T t : list) {
                AwemeRawAd awemeRawAd = t.getAwemeRawAd();
                if (awemeRawAd != null && TextUtils.equals(awemeRawAd.getType(), "redpacket") && (redImageUrl = awemeRawAd.getRedImageUrl()) != null && !C13603b.m24435a((Collection) redImageUrl.getUrlList())) {
                    arrayList.add(t);
                }
            }
            for (Aweme aweme : arrayList) {
                C38177d dVar = f90185a;
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                String str = null;
                Long creativeId = awemeRawAd2 != null ? awemeRawAd2.getCreativeId() : null;
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    str = awemeRawAd3.getLogExtra();
                }
                dVar.mo66479a((C38177d) "redpacket", "data_received", (String) creativeId, (Long) str, aweme.getAid(), (String) -1);
            }
        }
    }

    /* renamed from: b */
    private final void m77406b(C38176c cVar) {
        if (C38032b.m77102a()) {
            String str = cVar.f90181h;
            String str2 = cVar.f90182i;
            String str3 = cVar.f90174a;
            String str4 = "-1";
            if (str3 == null) {
                str3 = str4;
            }
            HashMap<String, Object> a = m77402a(str, str2, str3, cVar.f90183j, cVar.f90184k);
            String str5 = cVar.f90177d;
            if (!(str5 == null || str5.length() == 0)) {
                a.put("reason", str5);
            }
            String str6 = cVar.f90178e;
            if (!(str6 == null || str6.length() == 0)) {
                a.put(StringSet.type, str6);
            }
            String str7 = cVar.f90179f;
            if (!(str7 == null || str7.length() == 0)) {
                a.put("extra_id", str7);
            }
            HashMap<String, String> hashMap = cVar.f90180g;
            if (hashMap != null) {
                a.put("play_fun_data", hashMap);
            }
            String str8 = cVar.f90175b;
            String str9 = cVar.f90182i;
            if (str8 == null || str8.length() == 0) {
                str8 = str4;
            }
            String str10 = cVar.f90176c;
            String str11 = cVar.f90174a;
            if (str11 != null) {
                str4 = str11;
            }
            C18129a.m33747a("component_monitor", str9, str8, str10, str4).mo28900b("refer", cVar.f90181h).mo28898a(a).mo28901b();
        }
    }

    /* renamed from: a */
    public final void mo66478a(C38176c cVar) {
        C89219l.m154721d(cVar, "");
        m77406b(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38157ad
    /* renamed from: a */
    public final void mo66457a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f90185a.mo66479a((C38177d) "card", "preload_start", (String) awemeRawAd.getCreativeId(), (Long) awemeRawAd.getLogExtra(), aweme.getAid(), (String) -1);
        }
    }

    /* renamed from: c */
    public static void m77408c(Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f90185a.mo66479a("redpacket", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38157ad
    /* renamed from: b */
    public final void mo66461b(Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f90185a.mo66479a("card", "show_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.log.AbstractC38157ad
    /* renamed from: a */
    public final void mo66458a(Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            f90185a.mo66479a("card", "preload_result", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid(), i);
        }
    }

    /* renamed from: a */
    private static int m77399a(String str, String str2, String str3) {
        if (m77401a().get(m77405b(str, str2, str3)) == null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    private static String m77405b(String str, String str2, String str3) {
        return str + '_' + str2 + '_' + str3;
    }

    /* renamed from: a */
    private static long m77400a(String str, String str2, String str3, long j) {
        m77401a().put(m77405b(str, str2, str3), Long.valueOf(j));
        int hashCode = str2.hashCode();
        String str4 = "preload_result";
        if (hashCode != -1942410580) {
            if (hashCode != -127128813) {
                if (hashCode != 497550239 || !str2.equals("show_result")) {
                    return 0;
                }
            } else if (!str2.equals(str4)) {
                return 0;
            } else {
                str4 = "preload_start";
            }
        } else if (!str2.equals("preload_start")) {
            return 0;
        } else {
            str4 = "data_received";
        }
        Long l = m77401a().get(m77405b(str, str4, str3));
        if (l != null) {
            return j - l.longValue();
        }
        return -1;
    }

    /* renamed from: a */
    private final HashMap<String, Object> m77402a(String str, String str2, String str3, int i, long j) {
        long j2;
        HashMap<String, Object> hashMap = new HashMap<>();
        int a = m77399a(str, str2, str3);
        hashMap.put("is_first", Integer.valueOf(a));
        if (a == 1) {
            j2 = m77400a(str, str2, str3, j);
        } else {
            j2 = 0;
        }
        hashMap.put("time_interval", Long.valueOf(j2));
        if (i != -1) {
            hashMap.put("result", Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m77404a(String str, String str2, String str3, String str4, String str5, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        mo66478a(new C38176c(str, str2, i, System.currentTimeMillis()).mo66471a(str5).mo66473b(str3).mo66474c(str4));
    }
}

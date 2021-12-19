package com.p2082ss.android.ugc.aweme.p2282ad.preload;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.commercialize.live.service.C38143a;
import com.p2082ss.android.ugc.aweme.commercialize.log.p2599a.C38151a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38241j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38243l;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38244m;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33378i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.preload.f */
public final class C33369f implements AbstractC33368e {

    /* renamed from: a */
    static final ConcurrentHashMap<String, C33377h> f79309a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C33369f f79310b = new C33369f();

    /* renamed from: c */
    private static final AbstractC89244h f79311c = C89250i.m154773a((AbstractC89171a) C33372c.f79314a);

    /* renamed from: d */
    private static final HashMap<String, C33376g> f79312d = new HashMap<>();

    /* renamed from: e */
    private static final C88958b<AbstractC33378i> f79313e;

    /* renamed from: d */
    private static List<String> m68448d() {
        return (List) f79311c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.f$a */
    public static final class C33370a extends C27895a<List<? extends String>> {
        static {
            Covode.recordClassIndex(40216);
        }

        C33370a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.f$b */
    public static final class C33371b extends C27895a<Boolean> {
        static {
            Covode.recordClassIndex(40217);
        }

        C33371b() {
        }
    }

    private C33369f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59412a(List<? extends Aweme> list) {
        if (list != null && !list.isEmpty()) {
            C1731i.m5640b(new CallableC33374e(list), C1731i.f5562a);
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33367d c = C33113b.m67828c();
            if (c != null) {
                c.mo59400a(list);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59407a(Integer num, long j, String str, String str2, C38220ag agVar) {
        List<String> geckoChannel;
        String str3 = null;
        if (num != null) {
            if (num.intValue() == 4) {
                IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                if (f != null) {
                    str3 = f.mo59391g("splash");
                }
                m68445a(str, str3, "splash");
                if (str != null) {
                    f79309a.put(str, new C33377h(j, str2, 4));
                }
                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
                if (f2 != null) {
                    f2.mo59379a(Long.valueOf(j), str);
                }
            } else if (num.intValue() == 9 && agVar != null && (geckoChannel = agVar.getGeckoChannel()) != null) {
                for (T t : geckoChannel) {
                    IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.m68380f();
                    m68445a((String) t, f3 != null ? f3.mo59391g("lynx_feed") : null, "lynx_feed");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59413a(List<? extends Pair<String, Long>> list, boolean z) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            Iterator<? extends Pair<String, Long>> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C33377h hVar = f79309a.get(pair.first);
                if (hVar != null) {
                    HashMap hashMap = new HashMap();
                    Object obj = pair.first;
                    C89219l.m154716b(obj, "");
                    hashMap.put("channel_name", obj);
                    if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                        Object obj2 = pair.first;
                        hashMap.put("landing_type", 2);
                    }
                    Object obj3 = pair.second;
                    C89219l.m154716b(obj3, "");
                    long longValue = ((Number) obj3).longValue();
                    if (z) {
                        i = 1;
                    } else if (longValue != 0) {
                        i = 2;
                    }
                    hashMap.put("response_status", Integer.valueOf(i));
                    Object obj4 = pair.first;
                    hashMap.get("response_status");
                    C38151a.C38153b a = C38151a.m77332a();
                    a.f90123b = "ad_landing_channel_query";
                    a.f90122a = "ad_wap_stat";
                    a.mo66446a(Long.valueOf(hVar.f79322c)).mo66454c(hVar.f79323d).mo66447a(hashMap).mo66450b().mo66455c();
                    C18129a.m33747a("ad_wap_stat", "ad_landing_channel_query", String.valueOf(hVar.f79322c), hVar.f79323d, null).mo28900b("ad_event_type", "debug").mo28898a(hashMap).mo28902c();
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59411a(String str, boolean z) {
        if (str != null) {
            if (m68448d().contains(str)) {
                C33377h hVar = new C33377h(0, (String) null, 7);
                hVar.f79320a = System.currentTimeMillis();
                f79309a.put(str, hVar);
                HashMap hashMap = new HashMap();
                hVar.f79321b = z;
                hashMap.put("is_diff", Integer.valueOf(hVar.f79321b));
                hashMap.put("channel", str);
                C38151a.C38153b a = C38151a.m77332a();
                a.f90122a = "draw_ad";
                a.f90123b = "download_start";
                a.mo66448a("card_common").mo66447a(hashMap).mo66450b().mo66455c();
                C18129a.m33747a("draw_ad", "download_start", "0", null, null).mo28900b("ad_event_type", "debug").mo28900b("refer", "card_common").mo28898a(hashMap).mo28902c();
                return;
            }
            C33377h hVar2 = f79309a.get(str);
            if (hVar2 != null) {
                hVar2.f79320a = System.currentTimeMillis();
                HashMap hashMap2 = new HashMap();
                hVar2.f79321b = z ? 1 : 0;
                hashMap2.put("is_diff", Integer.valueOf(hVar2.f79321b));
                hashMap2.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                    hashMap2.put("landing_type", 2);
                }
                C38151a.C38153b a2 = C38151a.m77332a();
                a2.f90123b = "ad_landing_channel_download_start";
                a2.f90122a = "ad_wap_stat";
                a2.mo66446a(Long.valueOf(hVar2.f79322c)).mo66454c(hVar2.f79323d).mo66447a(hashMap2).mo66450b().mo66455c();
                C18129a.m33747a("ad_wap_stat", "ad_landing_channel_download_start", String.valueOf(hVar2.f79322c), hVar2.f79323d, null).mo28900b("ad_event_type", "debug").mo28898a(hashMap2).mo28902c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59408a(String str) {
        if (str != null && m68448d().contains(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("active_status", 1);
            hashMap.put("channel", str);
            C38151a.C38153b a = C38151a.m77332a();
            a.f90122a = "draw_ad";
            a.f90123b = "active_finish";
            a.mo66448a("card_common").mo66447a(hashMap).mo66450b().mo66455c();
            C18129a.m33747a("draw_ad", "active_finish", "0", null, null).mo28900b("ad_event_type", "debug").mo28900b("refer", "card_common").mo28898a(hashMap).mo28902c();
            f79309a.remove(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59410a(String str, Throwable th) {
        String str2;
        if (str != null && m68448d().contains(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("active_status", 0);
            hashMap.put("channel", str);
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            hashMap.put("fail_reason", str2);
            C38151a.C38153b a = C38151a.m77332a();
            a.f90122a = "draw_ad";
            a.f90123b = "active_finish";
            a.mo66448a("card_common").mo66447a(hashMap).mo66450b().mo66455c();
            C18129a.m33747a("draw_ad", "active_finish", "0", null, null).mo28900b("ad_event_type", "debug").mo28900b("refer", "card_common").mo28898a(hashMap).mo28902c();
            f79309a.remove(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59409a(String str, String str2, int i, int i2, String str3, String str4, long j) {
        int i3 = 0;
        if (str != null && str.length() != 0) {
            HashMap hashMap = new HashMap();
            if (i2 == 1) {
                hashMap.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                    hashMap.put("landing_type", 2);
                }
                if (i == 4) {
                    i3 = j == -1 ? mo59403a(str, str2) : 3;
                }
                hashMap.put("preload_status", Integer.valueOf(i3));
            }
            C33376g gVar = f79312d.get(str);
            if (gVar != null) {
                hashMap.put("webview_init_duration", Long.valueOf(System.currentTimeMillis() - gVar.f79319b));
            }
            hashMap.put("is_web_url", Integer.valueOf(i2));
            hashMap.put("preload_webview_time", Long.valueOf(j));
            C38151a.C38153b a = C38151a.m77332a();
            a.f90123b = "ad_landing_webview_init";
            a.f90122a = "ad_wap_stat";
            C38151a.C38153b c = a.mo66454c(str3);
            c.f90124c = str4;
            c.mo66447a(hashMap).mo66455c();
            if (str4 == null) {
                str4 = "0";
            }
            C18129a.m33747a("ad_wap_stat", "ad_landing_webview_init", str4, str3, null).mo28900b("ad_event_type", "debug").mo28898a(hashMap).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: c */
    public final void mo59417c() {
        f79313e.onNext(AbstractC33378i.C33379a.f79325a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.f$c */
    static final class C33372c extends AbstractC89220m implements AbstractC89171a<List<? extends String>> {

        /* renamed from: a */
        public static final C33372c f79314a = new C33372c();

        static {
            Covode.recordClassIndex(40218);
        }

        C33372c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends String> invoke() {
            List<String> p;
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33117e b = C33113b.m67827b();
            if (b == null || (p = b.mo58986p()) == null) {
                return new ArrayList();
            }
            return p;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: b */
    public final AbstractC88979t<AbstractC33378i> mo59414b() {
        AbstractC88979t<AbstractC33378i> a = f79313e.mo143268a(C33373d.f79315a).mo143266a(C88446a.f200695a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.f$f */
    static final class CallableC33375f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f79317a;

        static {
            Covode.recordClassIndex(40221);
        }

        CallableC33375f(List list) {
            this.f79317a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<String> list = this.f79317a;
            if (list == null) {
                return null;
            }
            for (String str : list) {
                IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                C33369f.m68445a(str, f != null ? f.mo59391g("lynx_feed") : null, "lynx_feed");
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(40215);
        C88958b<AbstractC33378i> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        f79313e = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.f$e */
    static final class CallableC33374e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f79316a;

        static {
            Covode.recordClassIndex(40220);
        }

        CallableC33374e(List list) {
            this.f79316a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            C38241j lynxEntryData;
            List<String> geckoChannel;
            C38244m stickerData;
            List<String> geckoChannel2;
            Map<String, CardStruct> cardInfos;
            CardStruct cardStruct;
            List<String> geckoChannel3;
            C38243l adQuestionnaire;
            List<String> geckoChannel4;
            CardStruct cardStruct2;
            List<String> geckoChannel5;
            C37437a commerceVideoAuthInfo;
            DynamicVideo dynamicVideo;
            List<String> geckoChannel6;
            String str2;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f79316a.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                Aweme aweme = (Aweme) it.next();
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        C89219l.m154716b(awemeRawAd, "");
                        if (awemeRawAd.getPreloadWeb() == 4) {
                            String channelName = awemeRawAd.getChannelName();
                            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                            if (f != null) {
                                str2 = f.mo59391g("feed");
                            } else {
                                str2 = null;
                            }
                            C33369f.m68445a(channelName, str2, "feed");
                            if (channelName != null) {
                                ConcurrentHashMap<String, C33377h> concurrentHashMap = C33369f.f79309a;
                                Long creativeId = awemeRawAd.getCreativeId();
                                C89219l.m154716b(creativeId, "");
                                long longValue = creativeId.longValue();
                                String logExtra = awemeRawAd.getLogExtra();
                                if (awemeRawAd.getPreloadWebNew() != 1) {
                                    awemeRawAd = null;
                                }
                                concurrentHashMap.put(channelName, new C33377h(longValue, logExtra, awemeRawAd));
                            }
                        } else if (awemeRawAd.getPreloadWeb() == 9) {
                            C33369f.m68444a(awemeRawAd);
                        }
                    }
                    if (aweme != null) {
                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd2 == null || (dynamicVideo = awemeRawAd2.getDynamicVideo()) == null || (geckoChannel6 = dynamicVideo.getGeckoChannel()) == null || geckoChannel6.isEmpty())) {
                            C89219l.m154716b(C33113b.C33114a.f78704a, "");
                            AbstractC33367d c = C33113b.m67828c();
                            if (c != null) {
                                IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
                                if (f2 != null) {
                                    str = f2.mo59391g("dynamic_ad_feed");
                                }
                                c.mo59397a(aweme, geckoChannel6, str, "dynamic_ad_feed");
                            }
                        }
                        C89219l.m154716b(C33113b.C33114a.f78704a, "");
                        AbstractC33115c a = C33113b.m67826a();
                        if (!(((a == null || (cardStruct2 = a.mo58947c(aweme)) == null) && ((commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (cardStruct2 = commerceVideoAuthInfo.getCardStruct()) == null)) || (geckoChannel5 = cardStruct2.getGeckoChannel()) == null || geckoChannel5.isEmpty())) {
                            arrayList.addAll(geckoChannel5);
                        }
                        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd3 == null || (adQuestionnaire = awemeRawAd3.getAdQuestionnaire()) == null || (geckoChannel4 = adQuestionnaire.getGeckoChannel()) == null || geckoChannel4.isEmpty())) {
                            arrayList.addAll(geckoChannel4);
                        }
                        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd4 == null || (cardInfos = awemeRawAd4.getCardInfos()) == null || (cardStruct = cardInfos.get("5")) == null || (geckoChannel3 = cardStruct.getGeckoChannel()) == null || geckoChannel3.isEmpty())) {
                            arrayList.addAll(geckoChannel3);
                        }
                        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd5 == null || (stickerData = awemeRawAd5.getStickerData()) == null || (geckoChannel2 = stickerData.getGeckoChannel()) == null || geckoChannel2.isEmpty())) {
                            arrayList.addAll(geckoChannel2);
                        }
                        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
                        if (!(awemeRawAd6 == null || (lynxEntryData = awemeRawAd6.getLynxEntryData()) == null || (geckoChannel = lynxEntryData.getGeckoChannel()) == null || geckoChannel.isEmpty())) {
                            arrayList.addAll(geckoChannel);
                        }
                    }
                }
                if (C38143a.m77302a(aweme)) {
                    arrayList.add("card_liveshopping");
                }
                C33369f.m68446a(arrayList, aweme);
            }
            if (!arrayList.isEmpty()) {
                IAdLandPagePreloadService f3 = AdLandPagePreloadServiceImpl.m68380f();
                if (f3 != null) {
                    str = f3.mo59391g("lynx_feed");
                }
                C33369f.m68447a(arrayList, str, "lynx_feed");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59404a() {
        m68443a(AbstractC33378i.C33380b.f79326a);
        boolean z = false;
        for (Map.Entry<String, C33377h> entry : f79309a.entrySet()) {
            AwemeRawAd awemeRawAd = entry.getValue().f79324e;
            if (awemeRawAd != null) {
                entry.getValue().f79324e = null;
                if (!z && awemeRawAd.getPreloadWebNew() == 1) {
                    AdLandPagePreloadServiceImpl.m68380f().mo59378a(awemeRawAd);
                    z = true;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.preload.f$d */
    static final class C33373d<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C33373d f79315a = new C33373d();

        static {
            Covode.recordClassIndex(40219);
        }

        C33373d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89219l.m154721d(obj, "");
            return !C89219l.m154714a(obj, AbstractC33378i.C33379a.f79325a);
        }
    }

    /* renamed from: a */
    private static void m68443a(AbstractC33378i iVar) {
        C89219l.m154721d(iVar, "");
        f79313e.onNext(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: c */
    public final void mo59418c(List<String> list) {
        if (list != null) {
            m68443a(AbstractC33378i.C33381c.f79327a);
        }
        C1731i.m5640b(new CallableC33375f(list), C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: b */
    public final void mo59415b(String str) {
        if (str != null) {
            f79312d.put(str, new C33376g(str, System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public static void m68444a(AwemeRawAd awemeRawAd) {
        List<String> geckoChannel;
        List<String> geckoChannel2;
        if (awemeRawAd != null) {
            String str = null;
            if (C33362a.m68415a()) {
                C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (!(nativeSiteConfig == null || (geckoChannel2 = nativeSiteConfig.getGeckoChannel()) == null)) {
                    IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                    if (f != null) {
                        str = f.mo59391g("lynx_feed");
                    }
                    m68447a(geckoChannel2, str, "lynx_feed");
                    return;
                }
                return;
            }
            C38220ag nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
            if (!(nativeSiteConfig2 == null || (geckoChannel = nativeSiteConfig2.getGeckoChannel()) == null)) {
                for (T t : geckoChannel) {
                    IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.m68380f();
                    m68445a((String) t, f2 != null ? f2.mo59391g("lynx_feed") : null, "lynx_feed");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: b */
    public final void mo59416b(List<String> list) {
        String str;
        if (list != null) {
            for (T t : list) {
                IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                if (f != null) {
                    str = f.mo59391g("lynx_feed");
                } else {
                    str = null;
                }
                m68445a((String) t, str, "lynx_feed");
            }
        }
    }

    /* renamed from: a */
    public static void m68446a(List<String> list, Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List list2;
        if (!(aweme == null || (anchors = aweme.getAnchors()) == null)) {
            for (T t : anchors) {
                String extra = t.getExtra();
                if (!(extra == null || extra.length() == 0)) {
                    AbstractC28019l a = C28024q.m56139a(t.getExtra());
                    C89219l.m154716b(a, "");
                    C28022o j = a.mo46789j();
                    Boolean bool = (Boolean) new C27910f().mo46668a(j.mo46803c("is_schema_lynx"), new C33371b().type);
                    if (bool != null && bool.booleanValue() && (list2 = (List) new C27910f().mo46668a(j.mo46803c("gecko_channel"), new C33370a().type)) != null && !list2.isEmpty()) {
                        list.addAll(list2);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final int mo59403a(String str, String str2) {
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33367d c = C33113b.m67828c();
            if (c != null) {
                if (str2 == null) {
                    str2 = "";
                }
                if (c.mo59402a(f.mo59391g(str2), str)) {
                    return 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m68445a(String str, String str2, String str3) {
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33367d c = C33113b.m67828c();
        if (c != null) {
            c.mo59399a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public static void m68447a(List<String> list, String str, String str2) {
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33367d c = C33113b.m67828c();
        if (c != null) {
            c.mo59401a(list, str, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59405a(long j, String str, long j2) {
        if (str != null) {
            if (m68448d().contains(str)) {
                ConcurrentHashMap<String, C33377h> concurrentHashMap = f79309a;
                C33377h hVar = concurrentHashMap.get(str);
                if (hVar != null) {
                    C89219l.m154716b(hVar, "");
                    HashMap hashMap = new HashMap();
                    hashMap.put("download_status", 1);
                    hashMap.put("is_diff", Integer.valueOf(hVar.f79321b));
                    hashMap.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar.f79320a));
                    hashMap.put("download_size", Long.valueOf(j2));
                    hashMap.put("package_id", Long.valueOf(j));
                    hashMap.put("channel", str);
                    C38151a.C38153b a = C38151a.m77332a();
                    a.f90122a = "draw_ad";
                    a.f90123b = "download_finish";
                    a.mo66448a("card_common").mo66447a(hashMap).mo66450b().mo66455c();
                    C18129a.m33747a("draw_ad", "download_finish", "0", null, null).mo28900b("ad_event_type", "debug").mo28900b("refer", "card_common").mo28898a(hashMap).mo28902c();
                    concurrentHashMap.remove(str);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C33377h> concurrentHashMap2 = f79309a;
            C33377h hVar2 = concurrentHashMap2.get(str);
            if (hVar2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("download_status", 1);
                hashMap2.put("is_diff", Integer.valueOf(hVar2.f79321b));
                hashMap2.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                    hashMap2.put("landing_type", 2);
                }
                hashMap2.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar2.f79320a));
                hashMap2.put("download_size", Long.valueOf(j2));
                hashMap2.put("package_id", Long.valueOf(j));
                C38151a.C38153b a2 = C38151a.m77332a();
                a2.f90123b = "ad_landing_channel_download_finish";
                a2.f90122a = "ad_wap_stat";
                a2.mo66446a(Long.valueOf(hVar2.f79322c)).mo66454c(hVar2.f79323d).mo66450b().mo66447a(hashMap2).mo66455c();
                C18129a.m33747a("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(hVar2.f79322c), hVar2.f79323d, null).mo28900b("ad_event_type", "debug").mo28898a(hashMap2).mo28902c();
                concurrentHashMap2.remove(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e
    /* renamed from: a */
    public final void mo59406a(long j, String str, long j2, Throwable th) {
        String str2;
        String message;
        if (str != null) {
            String str3 = "";
            if (m68448d().contains(str)) {
                ConcurrentHashMap<String, C33377h> concurrentHashMap = f79309a;
                C33377h hVar = concurrentHashMap.get(str);
                if (hVar != null) {
                    C89219l.m154716b(hVar, str3);
                    HashMap hashMap = new HashMap();
                    hashMap.put("download_status", 0);
                    hashMap.put("is_diff", Integer.valueOf(hVar.f79321b));
                    hashMap.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar.f79320a));
                    hashMap.put("download_size", Long.valueOf(j2));
                    hashMap.put("package_id", Long.valueOf(j));
                    hashMap.put("channel", str);
                    if (!(th == null || (message = th.getMessage()) == null)) {
                        str3 = message;
                    }
                    hashMap.put("fail_reason", str3);
                    C38151a.C38153b a = C38151a.m77332a();
                    a.f90122a = "draw_ad";
                    a.f90123b = "download_finish";
                    a.mo66448a("card_common").mo66447a(hashMap).mo66450b().mo66455c();
                    C18129a.m33747a("draw_ad", "download_finish", "0", null, null).mo28900b("ad_event_type", "debug").mo28900b("refer", "card_common").mo28898a(hashMap).mo28902c();
                    concurrentHashMap.remove(str);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C33377h> concurrentHashMap2 = f79309a;
            C33377h hVar2 = concurrentHashMap2.get(str);
            if (hVar2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("download_status", 0);
                hashMap2.put("is_diff", Integer.valueOf(hVar2.f79321b));
                hashMap2.put("channel_name", str);
                if (AdLandPagePreloadServiceImpl.m68380f() != null) {
                    hashMap2.put("landing_type", 2);
                }
                hashMap2.put("download_duration", Long.valueOf(System.currentTimeMillis() - hVar2.f79320a));
                hashMap2.put("download_size", Long.valueOf(j2));
                if (th == null || (str2 = th.getMessage()) == null) {
                    str2 = str3;
                }
                hashMap2.put("download_fail_reason", str2);
                hashMap2.put("package_id", Long.valueOf(j));
                C38151a.C38153b a2 = C38151a.m77332a();
                a2.f90123b = "ad_landing_channel_download_finish";
                a2.f90122a = "ad_wap_stat";
                a2.mo66446a(Long.valueOf(hVar2.f79322c)).mo66454c(hVar2.f79323d).mo66447a(hashMap2).mo66450b().mo66455c();
                C18129a.m33747a("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(hVar2.f79322c), hVar2.f79323d, null).mo28900b("ad_event_type", "debug").mo28898a(hashMap2).mo28902c();
                concurrentHashMap2.remove(str);
            }
        }
    }
}

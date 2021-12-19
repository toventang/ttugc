package com.p2082ss.android.ugc.aweme.notification.redpoint;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61558j;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61559k;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61551c;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61560l;
import com.p2082ss.android.ugc.aweme.notice.api.bean.EnumC61563o;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p2082ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.f */
public final class C62221f {

    /* renamed from: a */
    static Map<Integer, C61558j> f141237a = new LinkedHashMap();

    /* renamed from: b */
    static List<C61559k> f141238b = C89086z.INSTANCE;

    /* renamed from: c */
    static final Keva f141239c = Keva.getRepo("keva_notice_count");

    /* renamed from: d */
    public static final C62221f f141240d = new C62221f();

    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.f$c */
    static final class CallableC62226c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC62226c f141243a = new CallableC62226c();

        static {
            Covode.recordClassIndex(72993);
        }

        CallableC62226c() {
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.f$c$a */
        public static final class C62227a extends C27895a<Map<Integer, ? extends C61558j>> {
            static {
                Covode.recordClassIndex(72994);
            }

            C62227a() {
            }
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                C62221f.f141239c.storeString("keva_name_notice_attr", C80342dg.m139300a().mo46675b(C62221f.f141237a, new C62227a().type));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.f$d */
    static final class CallableC62228d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f141244a;

        static {
            Covode.recordClassIndex(72995);
        }

        CallableC62228d(List list) {
            this.f141244a = list;
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.f$d$a */
        public static final class C62229a extends C27895a<List<? extends C61559k>> {
            static {
                Covode.recordClassIndex(72996);
            }

            C62229a() {
            }
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                C62221f.f141239c.storeString("keva_name_group_filter", C80342dg.m139300a().mo46675b(this.f141244a, new C62229a().type));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C89391z.f203057a;
        }
    }

    private C62221f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.f$b */
    public static final class CallableC62225b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f141242a;

        static {
            Covode.recordClassIndex(72992);
        }

        CallableC62225b(boolean z) {
            this.f141242a = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C51423a.m95787a("NoticeCountHelper " + this.f141242a + " log, noticeGroupAttrsHashMap: " + C62221f.f141237a.size() + ", noticeFilterGroups: " + C62221f.f141238b.size());
            return null;
        }
    }

    static {
        Covode.recordClassIndex(72988);
        C1731i.m5640b(CallableC62222a.f141241a, C1731i.f5562a);
    }

    /* renamed from: a */
    public static List<Integer> m112519a() {
        Map<Integer, C61558j> map = f141237a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, C61558j> entry : map.entrySet()) {
            if (entry.getValue().f139730b == EnumC61563o.ShowDot) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C89070n.m154590j(linkedHashMap.keySet());
    }

    /* renamed from: b */
    public static List<Integer> m112525b() {
        Map<Integer, C61558j> map = f141237a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, C61558j> entry : map.entrySet()) {
            if (entry.getValue().f139730b == EnumC61563o.ShowNum) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C89070n.m154590j(linkedHashMap.keySet());
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.redpoint.f$a */
    static final class CallableC62222a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC62222a f141241a = new CallableC62222a();

        static {
            Covode.recordClassIndex(72989);
        }

        CallableC62222a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String string = C62221f.f141239c.getString("keva_name_notice_attr", "");
            String string2 = C62221f.f141239c.getString("keva_name_group_filter", "");
            try {
                if (C62221f.f141237a.isEmpty()) {
                    Object a = C80342dg.m139300a().mo46671a(string, new C27895a<Map<Integer, ? extends C61558j>>() {
                        /* class com.p2082ss.android.ugc.aweme.notification.redpoint.C62221f.CallableC62222a.C622231 */

                        static {
                            Covode.recordClassIndex(72990);
                        }
                    }.type);
                    C89219l.m154716b(a, "");
                    C62221f.f141237a = (Map) a;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (C62221f.f141238b.isEmpty()) {
                    Object a2 = C80342dg.m139300a().mo46671a(string2, new C27895a<List<? extends C61559k>>() {
                        /* class com.p2082ss.android.ugc.aweme.notification.redpoint.C62221f.CallableC62222a.C622242 */

                        static {
                            Covode.recordClassIndex(72991);
                        }
                    }.type);
                    C89219l.m154716b(a2, "");
                    C62221f.f141238b = (List) a2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            C62221f.m112523a(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m112523a(boolean z) {
        C1731i.m5640b(new CallableC62225b(z), C1731i.f5562a);
    }

    /* renamed from: e */
    public static C61558j m112529e(int i) {
        return f141237a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static boolean m112524a(int i) {
        EnumC61563o oVar;
        C61558j jVar = f141237a.get(Integer.valueOf(i));
        if (jVar != null) {
            oVar = jVar.f139730b;
        } else {
            oVar = null;
        }
        if (oVar == EnumC61563o.ShowDot) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m112526b(int i) {
        EnumC61563o oVar;
        C61558j jVar = f141237a.get(Integer.valueOf(i));
        if (jVar != null) {
            oVar = jVar.f139730b;
        } else {
            oVar = null;
        }
        if (oVar == EnumC61563o.ShowNum) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static List<Integer> m112527c(int i) {
        List<Integer> a = m112520a(i, null);
        if (a == null || a.isEmpty()) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : a) {
            C61558j jVar = f141237a.get(Integer.valueOf(t.intValue()));
            if ((jVar != null ? jVar.f139730b : null) == EnumC61563o.ShowNum) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List<Integer> m112528d(int i) {
        List<Integer> a = m112520a(i, null);
        if (a == null || a.isEmpty()) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : a) {
            C61558j jVar = f141237a.get(Integer.valueOf(t.intValue()));
            if ((jVar != null ? jVar.f139730b : null) == EnumC61563o.ShowDot) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m112521a(NoticeList noticeList) {
        int ordinal;
        int ordinal2;
        C89219l.m154721d(noticeList, "");
        List<NoticeCount> items = noticeList.getItems();
        if (items != null) {
            for (T t : items) {
                EnumC61551c[] values = EnumC61551c.values();
                Integer clearOccasion = t.getClearOccasion();
                if (clearOccasion != null) {
                    ordinal = clearOccasion.intValue();
                } else {
                    ordinal = EnumC61551c.Normal.ordinal();
                }
                EnumC61551c cVar = values[ordinal];
                EnumC61563o[] values2 = EnumC61563o.values();
                Integer showType = t.getShowType();
                if (showType != null) {
                    ordinal2 = showType.intValue();
                } else {
                    ordinal2 = EnumC61563o.ShowDefault.ordinal();
                }
                f141237a.put(Integer.valueOf(t.getGroup()), new C61558j(cVar, values2[ordinal2]));
            }
            C1731i.m5640b(CallableC62226c.f141243a, C1731i.f5562a);
        }
        m112523a(false);
    }

    /* renamed from: a */
    public static void m112522a(List<C61559k> list) {
        int i;
        C89219l.m154721d(list, "");
        for (T t : list) {
            int i2 = t.f139732b;
            if (i2 == EnumC61560l.FilterTimelineAll.ordinal()) {
                i = 36;
            } else if (i2 == EnumC61560l.FilterLike.ordinal()) {
                i = 3;
            } else if (i2 == EnumC61560l.FilterComment.ordinal()) {
                i = 44;
            } else if (i2 == EnumC61560l.FilterMention.ordinal()) {
                i = 26;
            } else if (i2 == EnumC61560l.FilterFollow.ordinal()) {
                i = 7;
            } else if (i2 == EnumC61560l.FilterFromTiktok.ordinal()) {
                i = 37;
            } else if (i2 == EnumC61560l.FilterTypeQA.ordinal()) {
                i = 84;
            } else if (i2 == EnumC61560l.FilterTypeShop.ordinal()) {
                i = 599;
            } else if (i2 == EnumC61560l.FilterTypeAllExceptFollow.ordinal()) {
                i = 600;
            } else if (i2 == EnumC61560l.FilterTypeFollowAndFollowRequest.ordinal()) {
                i = 534;
            } else {
                i = 0;
            }
            t.f139733c = i;
        }
        f141238b = list;
        C1731i.m5640b(new CallableC62228d(list), C1731i.f5562a);
    }

    /* renamed from: a */
    public static List<Integer> m112520a(int i, EnumC61551c cVar) {
        T t;
        List<Integer> list;
        Iterator<T> it = f141238b.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (t.f139733c != i);
        T t2 = t;
        if (!(t2 == null || (list = t2.f139731a) == null)) {
            if (cVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (T t3 : list) {
                C61558j jVar = f141237a.get(Integer.valueOf(t3.intValue()));
                if (jVar != null && jVar.f139729a == cVar) {
                    arrayList.add(t3);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        return C89086z.INSTANCE;
    }
}

package com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61634i;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.p2082ss.android.ugc.aweme.notification.bean.C61886q;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61801c;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.a.d */
public final class C62394d {

    /* renamed from: a */
    public static final C62394d f141573a = new C62394d();

    /* renamed from: b */
    private static final Comparator<MusNotice> f141574b = C62397c.f141594a;

    private C62394d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.d$b */
    public static final class C62396b {

        /* renamed from: a */
        public long f141592a;

        /* renamed from: b */
        public long f141593b;

        static {
            Covode.recordClassIndex(73186);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62396b)) {
                return false;
            }
            C62396b bVar = (C62396b) obj;
            return this.f141592a == bVar.f141592a && this.f141593b == bVar.f141593b;
        }

        public final String toString() {
            return "TimeRange(maxTime=" + this.f141592a + ", minTime=" + this.f141593b + ")";
        }

        public /* synthetic */ C62396b() {
            this(0, 0);
        }

        public final int hashCode() {
            long j = this.f141592a;
            long j2 = this.f141593b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        /* renamed from: a */
        public final C62396b mo100391a(long j) {
            long max;
            if (j > 0) {
                long j2 = this.f141592a;
                if (j2 <= 0) {
                    max = j;
                } else {
                    max = Math.max(j2, j);
                }
                this.f141592a = max;
                long j3 = this.f141593b;
                if (j3 > 0) {
                    j = Math.min(j3, j);
                }
                this.f141593b = j;
            }
            return this;
        }

        public C62396b(long j, long j2) {
            this.f141592a = j;
            this.f141593b = j2;
        }
    }

    static {
        Covode.recordClassIndex(73184);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.d$a */
    public static final class C62395a {

        /* renamed from: a */
        public final List<MusNotice> f141575a;

        /* renamed from: b */
        public final Map<Integer, NoticeItems> f141576b;

        /* renamed from: c */
        public final List<MusNotice> f141577c;

        /* renamed from: d */
        public final LogPbBean f141578d;

        /* renamed from: e */
        public final long f141579e;

        /* renamed from: f */
        public final boolean f141580f;

        /* renamed from: g */
        public final int f141581g;

        /* renamed from: h */
        public final C62396b f141582h;

        /* renamed from: i */
        public final boolean f141583i;

        /* renamed from: j */
        public final boolean f141584j;

        /* renamed from: k */
        public final Set<String> f141585k;

        /* renamed from: l */
        public final Set<Integer> f141586l;

        /* renamed from: m */
        public final List<Integer> f141587m;

        /* renamed from: n */
        public final C62396b f141588n;

        /* renamed from: o */
        public final List<MusNotice> f141589o;

        /* renamed from: p */
        public final List<MusNotice> f141590p;

        /* renamed from: q */
        public final List<MusNotice> f141591q;

        static {
            Covode.recordClassIndex(73185);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62395a)) {
                return false;
            }
            C62395a aVar = (C62395a) obj;
            return C89219l.m154714a(this.f141575a, aVar.f141575a) && C89219l.m154714a(this.f141576b, aVar.f141576b) && C89219l.m154714a(this.f141577c, aVar.f141577c) && C89219l.m154714a(this.f141578d, aVar.f141578d) && this.f141579e == aVar.f141579e && this.f141580f == aVar.f141580f && this.f141581g == aVar.f141581g && C89219l.m154714a(this.f141582h, aVar.f141582h) && this.f141583i == aVar.f141583i && this.f141584j == aVar.f141584j && C89219l.m154714a(this.f141585k, aVar.f141585k) && C89219l.m154714a(this.f141586l, aVar.f141586l) && C89219l.m154714a(this.f141587m, aVar.f141587m) && C89219l.m154714a(this.f141588n, aVar.f141588n) && C89219l.m154714a(this.f141589o, aVar.f141589o) && C89219l.m154714a(this.f141590p, aVar.f141590p) && C89219l.m154714a(this.f141591q, aVar.f141591q);
        }

        public final String toString() {
            return "ProcessInfo(extraLiveData=" + this.f141575a + ", extraDataMap=" + this.f141576b + ", newData=" + this.f141577c + ", logPb=" + this.f141578d + ", lastReadTime=" + this.f141579e + ", isRefresh=" + this.f141580f + ", total=" + this.f141581g + ", nextTimeRange=" + this.f141582h + ", hasMore=" + this.f141583i + ", shouldCollapse=" + this.f141584j + ", nidSet=" + this.f141585k + ", typeSet=" + this.f141586l + ", timelineSet=" + this.f141587m + ", timeRange=" + this.f141588n + ", nextData=" + this.f141589o + ", data=" + this.f141590p + ", collapsedData=" + this.f141591q + ")";
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            List<MusNotice> list = this.f141575a;
            int i12 = 0;
            if (list != null) {
                i = list.hashCode();
            } else {
                i = 0;
            }
            int i13 = i * 31;
            Map<Integer, NoticeItems> map = this.f141576b;
            if (map != null) {
                i2 = map.hashCode();
            } else {
                i2 = 0;
            }
            int i14 = (i13 + i2) * 31;
            List<MusNotice> list2 = this.f141577c;
            if (list2 != null) {
                i3 = list2.hashCode();
            } else {
                i3 = 0;
            }
            int i15 = (i14 + i3) * 31;
            LogPbBean logPbBean = this.f141578d;
            if (logPbBean != null) {
                i4 = logPbBean.hashCode();
            } else {
                i4 = 0;
            }
            long j = this.f141579e;
            int i16 = (((i15 + i4) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            boolean z = this.f141580f;
            int i17 = 1;
            if (z) {
                z = true;
            }
            int i18 = z ? 1 : 0;
            int i19 = z ? 1 : 0;
            int i20 = z ? 1 : 0;
            int i21 = (((i16 + i18) * 31) + this.f141581g) * 31;
            C62396b bVar = this.f141582h;
            if (bVar != null) {
                i5 = bVar.hashCode();
            } else {
                i5 = 0;
            }
            int i22 = (i21 + i5) * 31;
            boolean z2 = this.f141583i;
            if (z2) {
                z2 = true;
            }
            int i23 = z2 ? 1 : 0;
            int i24 = z2 ? 1 : 0;
            int i25 = z2 ? 1 : 0;
            int i26 = (i22 + i23) * 31;
            if (!this.f141584j) {
                i17 = 0;
            }
            int i27 = (i26 + i17) * 31;
            Set<String> set = this.f141585k;
            if (set != null) {
                i6 = set.hashCode();
            } else {
                i6 = 0;
            }
            int i28 = (i27 + i6) * 31;
            Set<Integer> set2 = this.f141586l;
            if (set2 != null) {
                i7 = set2.hashCode();
            } else {
                i7 = 0;
            }
            int i29 = (i28 + i7) * 31;
            List<Integer> list3 = this.f141587m;
            if (list3 != null) {
                i8 = list3.hashCode();
            } else {
                i8 = 0;
            }
            int i30 = (i29 + i8) * 31;
            C62396b bVar2 = this.f141588n;
            if (bVar2 != null) {
                i9 = bVar2.hashCode();
            } else {
                i9 = 0;
            }
            int i31 = (i30 + i9) * 31;
            List<MusNotice> list4 = this.f141589o;
            if (list4 != null) {
                i10 = list4.hashCode();
            } else {
                i10 = 0;
            }
            int i32 = (i31 + i10) * 31;
            List<MusNotice> list5 = this.f141590p;
            if (list5 != null) {
                i11 = list5.hashCode();
            } else {
                i11 = 0;
            }
            int i33 = (i32 + i11) * 31;
            List<MusNotice> list6 = this.f141591q;
            if (list6 != null) {
                i12 = list6.hashCode();
            }
            return i33 + i12;
        }

        /* renamed from: a */
        public final void mo100385a(MusNotice musNotice) {
            C89219l.m154721d(musNotice, "");
            m112844a(musNotice, this.f141590p);
        }

        /* renamed from: b */
        public final void mo100386b(MusNotice musNotice) {
            C89219l.m154721d(musNotice, "");
            m112844a(musNotice, this.f141589o);
        }

        /* renamed from: c */
        public final boolean mo100387c(MusNotice musNotice) {
            C89219l.m154721d(musNotice, "");
            if (this.f141585k.contains(musNotice.nid) || ((musNotice.type == 1 || musNotice.type == 2) && this.f141586l.contains(Integer.valueOf(musNotice.type)))) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final void m112844a(MusNotice musNotice, List<MusNotice> list) {
            if (!musNotice.hasRead) {
                if (musNotice.noticeListType == 2) {
                    musNotice.priority = 3;
                } else {
                    musNotice.priority = 1;
                }
                musNotice.timeLineType = 0;
            } else {
                musNotice.timeLineType = C80566ib.m139649a(musNotice.createTime * 1000);
            }
            musNotice.lastReadTime = this.f141579e;
            if (musNotice.logPbBean == null) {
                musNotice.logPbBean = this.f141578d;
            }
            list.add(musNotice);
            Set<String> set = this.f141585k;
            String str = musNotice.nid;
            C89219l.m154716b(str, "");
            set.add(str);
            this.f141586l.add(Integer.valueOf(musNotice.type));
            if (!this.f141587m.contains(Integer.valueOf(musNotice.timeLineType))) {
                this.f141587m.add(Integer.valueOf(musNotice.timeLineType));
            }
            this.f141588n.mo100391a(musNotice.createTime);
        }

        public /* synthetic */ C62395a(List list, Map map, List list2, LogPbBean logPbBean, long j, boolean z, int i, C62396b bVar, boolean z2, boolean z3) {
            this(list, map, list2, logPbBean, j, z, i, bVar, z2, z3, new LinkedHashSet(), new LinkedHashSet(), new ArrayList(), new C62396b(), new ArrayList(), new ArrayList(), new ArrayList());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX WARN: Multi-variable type inference failed */
        private C62395a(List<? extends MusNotice> list, Map<Integer, NoticeItems> map, List<? extends MusNotice> list2, LogPbBean logPbBean, long j, boolean z, int i, C62396b bVar, boolean z2, boolean z3, Set<String> set, Set<Integer> set2, List<Integer> list3, C62396b bVar2, List<MusNotice> list4, List<MusNotice> list5, List<MusNotice> list6) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(set, "");
            C89219l.m154721d(set2, "");
            C89219l.m154721d(list3, "");
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(list4, "");
            C89219l.m154721d(list5, "");
            C89219l.m154721d(list6, "");
            this.f141575a = list;
            this.f141576b = map;
            this.f141577c = list2;
            this.f141578d = logPbBean;
            this.f141579e = j;
            this.f141580f = z;
            this.f141581g = i;
            this.f141582h = bVar;
            this.f141583i = z2;
            this.f141584j = z3;
            this.f141585k = set;
            this.f141586l = set2;
            this.f141587m = list3;
            this.f141588n = bVar2;
            this.f141589o = list4;
            this.f141590p = list5;
            this.f141591q = list6;
        }
    }

    /* renamed from: a */
    private static boolean m112840a(MusNotice musNotice) {
        String str;
        if (musNotice.createTime <= 0 || (str = musNotice.nid) == null || str.length() == 0 || C89219l.m154714a((Object) "0", (Object) musNotice.nid)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static void m112842c(C62395a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = aVar.f141590p.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            MusNotice musNotice = aVar.f141590p.get(i2);
            if (musNotice.timeLineType > i) {
                linkedHashMap.put(Integer.valueOf(linkedHashMap.size() + i2), Integer.valueOf(musNotice.timeLineType));
                i = musNotice.timeLineType;
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aVar.f141590p.add(((Number) entry.getKey()).intValue(), new C61634i(((Number) entry.getValue()).intValue()));
        }
    }

    /* renamed from: a */
    public static void m112838a(C62395a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        for (T t : aVar.f141577c) {
            if (m112840a((MusNotice) t)) {
                StringBuilder append = new StringBuilder("insertNewData but notice invalid:").append(((MusNotice) t).nid).append(", ").append(((MusNotice) t).type).append(", ");
                LogPbBean logPbBean = aVar.f141578d;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                } else {
                    str = null;
                }
                C39109f.m79404c("MiddleDataSource", append.append(str).toString());
            }
            if (!aVar.mo100387c(t)) {
                aVar.mo100386b(t);
            }
        }
        m112841b(aVar);
        C89070n.m154530a((List) aVar.f141589o, (Comparator) f141574b);
        aVar.f141590p.addAll(aVar.f141589o);
        m112842c(aVar);
        m112843d(aVar);
        m112839a(aVar.f141575a, aVar.f141590p);
        if (!aVar.f141591q.isEmpty()) {
            m112839a(aVar.f141575a, aVar.f141591q);
        }
    }

    /* renamed from: b */
    private static void m112841b(C62395a aVar) {
        MusNotice musNotice;
        C62396b bVar = aVar.f141588n;
        C62396b bVar2 = new C62396b(bVar.f141592a, bVar.f141593b);
        if (bVar2.f141592a == 0 || aVar.f141580f) {
            bVar2.f141592a = Long.MAX_VALUE;
        }
        if (!aVar.f141583i) {
            bVar2.f141593b = 0;
        }
        for (NoticeItems noticeItems : aVar.f141576b.values()) {
            List<MusNotice> items = noticeItems.getItems();
            if (!(items == null || (musNotice = (MusNotice) C89070n.m154583g((List) items)) == null)) {
                if (m112840a(musNotice)) {
                    C39109f.m79404c("MiddleDataSource", "insertExtra but notice invalid:" + noticeItems.getGroup() + ", " + musNotice.nid + ", " + musNotice.type);
                    String str = musNotice.nid;
                    if (str == null || str.length() == 0) {
                        musNotice.nid = String.valueOf(musNotice.hashCode());
                    }
                }
                long j = musNotice.createTime;
                long j2 = bVar2.f141593b;
                long j3 = bVar2.f141592a;
                if (((j2 <= j && j3 >= j) || (noticeItems.getListType() == 2 && !musNotice.hasRead)) && !aVar.mo100387c(musNotice)) {
                    musNotice.noticeListType = noticeItems.getListType();
                    C61630e eVar = musNotice.templateNotice;
                    if (eVar != null) {
                        eVar.f139897m = noticeItems.getGroup();
                    }
                    aVar.mo100386b(musNotice);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m112843d(C62395a aVar) {
        if (aVar.f141584j) {
            int size = aVar.f141590p.size();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                MusNotice musNotice = aVar.f141590p.get(i4);
                if (musNotice.type == 999) {
                    i3++;
                } else if (i2 <= 0) {
                    long j = musNotice.createTime * 1000;
                    int b = C61801c.m111864b();
                    if (b > 0) {
                        Calendar instance = Calendar.getInstance();
                        C89219l.m154716b(instance, "");
                        if (instance.getTimeInMillis() - j >= ((long) b) * 86400000) {
                            i = i4 - i3;
                            i2 = i4;
                        }
                    }
                }
            }
            if (aVar.f141581g - i > C61801c.m111865c()) {
                if (i < 10) {
                    i2 += 10 - i;
                }
                if (i2 >= aVar.f141590p.size()) {
                    C39109f.m79404c("MiddleDataSource", "collapseData but meet unexpected state");
                    return;
                }
                aVar.f141591q.addAll(aVar.f141590p.subList(0, i2));
                aVar.f141591q.add(new C61886q(2002, null, null, 0, 14));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.a.d$c */
    static final class C62397c<T> implements Comparator {

        /* renamed from: a */
        public static final C62397c f141594a = new C62397c();

        static {
            Covode.recordClassIndex(73187);
        }

        C62397c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0022 A[RETURN] */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int compare(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r8 = (com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r8
                com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r9 = (com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r9
                int r2 = r9.priority
                int r0 = r8.priority
                int r2 = r2 - r0
                int r1 = r8.priority
                int r0 = r9.priority
                r6 = -1
                r5 = 1
                if (r1 != r0) goto L_0x001d
                long r3 = r9.createTime
                long r0 = r8.createTime
                long r3 = r3 - r0
                r1 = 0
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0022
            L_0x001c:
                return r5
            L_0x001d:
                if (r2 <= 0) goto L_0x0020
                goto L_0x001c
            L_0x0020:
                if (r2 >= 0) goto L_0x0023
            L_0x0022:
                return r6
            L_0x0023:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62394d.C62397c.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: a */
    public static void m112839a(List<? extends MusNotice> list, List<MusNotice> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        if (!list.isEmpty()) {
            ListIterator<MusNotice> listIterator = list2.listIterator();
            while (listIterator.hasNext()) {
                MusNotice next = listIterator.next();
                if (next.type == 1001 || (next.type == 999 && next.timeLineType == 0)) {
                    listIterator.remove();
                }
            }
            list2.addAll(0, list);
            list2.add(0, new C61634i(0));
        }
    }
}

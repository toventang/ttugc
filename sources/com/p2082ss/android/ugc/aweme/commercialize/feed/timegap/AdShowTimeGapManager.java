package com.p2082ss.android.ugc.aweme.commercialize.feed.timegap;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.p2963q.C49888x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager */
public final class AdShowTimeGapManager implements AbstractC33974au {

    /* renamed from: a */
    public static boolean f89774a;

    /* renamed from: b */
    public static WeakReference<AbstractC49815a> f89775b;

    /* renamed from: c */
    public static int f89776c = -1;

    /* renamed from: d */
    public static long f89777d = -1;

    /* renamed from: e */
    public static long f89778e = -1;

    /* renamed from: f */
    public static ArrayList<Long> f89779f = new ArrayList<>();

    /* renamed from: g */
    public static ArrayList<C37991b> f89780g = new ArrayList<>();

    /* renamed from: h */
    public static int f89781h = -1;

    /* renamed from: i */
    public static int f89782i = -1;

    /* renamed from: j */
    public static int f89783j = -1;

    /* renamed from: k */
    public static C37991b f89784k;

    /* renamed from: l */
    public static ArrayList<C37990a> f89785l = new ArrayList<>();

    /* renamed from: m */
    public static int f89786m = -1;

    /* renamed from: n */
    public static C37992c f89787n;

    /* renamed from: o */
    public static boolean f89788o;

    /* renamed from: p */
    public static boolean f89789p;

    /* renamed from: q */
    public static boolean f89790q;

    /* renamed from: r */
    public static final AdShowTimeGapManager f89791r = new AdShowTimeGapManager();

    /* renamed from: s */
    private static ArrayList<Long> f89792s = new ArrayList<>();

    /* renamed from: a */
    private static boolean m77036a(int i, int i2) {
        return i >= 0 && i2 > i;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            unBind();
        }
    }

    private AdShowTimeGapManager() {
    }

    /* renamed from: a */
    public static boolean m77034a() {
        C37992c cVar = f89787n;
        if (cVar == null || !cVar.isEnableGapAdjust()) {
            return false;
        }
        return true;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void unBind() {
        f89782i = -1;
        f89783j = -1;
        f89786m = -1;
        f89779f.clear();
    }

    /* renamed from: g */
    private static int m77042g() {
        int i;
        C37992c cVar = f89787n;
        if (cVar != null) {
            i = cVar.getMinGap();
        } else {
            i = 0;
        }
        return Math.max(i + f89782i + 1, f89781h + 2);
    }

    static {
        Covode.recordClassIndex(45449);
    }

    /* renamed from: d */
    private static int m77039d() {
        AbstractC49815a aVar;
        AbstractC48191b bVar;
        List<Aweme> e;
        Aweme aweme;
        WeakReference<AbstractC49815a> weakReference = f89775b;
        if (!(weakReference == null || (aVar = weakReference.get()) == null || (bVar = aVar.f114768W) == null || (e = bVar.mo80288e()) == null)) {
            int size = e.size();
            do {
                size--;
                if (size >= 0) {
                    aweme = e.get(size);
                    C89219l.m154716b(aweme, "");
                }
            } while (!aweme.isAd());
            e.size();
            return e.size() - size;
        }
        return -1;
    }

    /* renamed from: e */
    private static boolean m77040e() {
        AbstractC49815a aVar;
        AbstractC48191b bVar;
        List<Aweme> e;
        WeakReference<AbstractC49815a> weakReference = f89775b;
        if (weakReference == null || (aVar = weakReference.get()) == null || (bVar = aVar.f114768W) == null || (e = bVar.mo80288e()) == null) {
            return false;
        }
        int size = e.size();
        for (int i = f89783j + 1; i < size; i++) {
            if (C37699a.m76251aW(e.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static int m77043h() {
        int i;
        AbstractC49815a aVar;
        C37992c cVar = f89787n;
        int i2 = 0;
        if (cVar != null) {
            i = cVar.getMinGap();
        } else {
            i = 0;
        }
        WeakReference<AbstractC49815a> weakReference = f89775b;
        AbstractC48191b bVar = null;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            bVar = aVar.f114768W;
        }
        if ((bVar instanceof AbstractC48191b) && bVar != null) {
            i2 = bVar.getCount();
        }
        int i3 = f89786m;
        if (i3 == -1) {
            return i2 - 1;
        }
        return (i3 - i) - 1;
    }

    /* renamed from: f */
    private static int m77041f() {
        ArrayList<Aweme> arrayList;
        AbstractC49815a aVar;
        WeakReference<AbstractC49815a> weakReference = f89775b;
        AbstractC48191b bVar = null;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            bVar = aVar.f114768W;
        }
        if (!(bVar instanceof AbstractC48191b) || bVar == null || (arrayList = bVar.f111623a.f111788a) == null) {
            return Integer.MAX_VALUE;
        }
        long j = f89778e - f89777d;
        int i = f89781h;
        int i2 = f89783j;
        if (i <= i2) {
            while (m77036a(i, arrayList.size())) {
                j += (long) arrayList.get(i).getPredPlaytime();
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return (int) j;
    }

    /* renamed from: i */
    private static boolean m77044i() {
        int i;
        C37992c cVar = f89787n;
        if (cVar == null || cVar.isUserFastBrowseModel() || f89781h < cVar.getViewVidNumForFastBrowse() || f89779f.size() < (i = f89781h)) {
            return false;
        }
        int i2 = f89781h;
        for (int viewVidNumForFastBrowse = i - cVar.getViewVidNumForFastBrowse(); viewVidNumForFastBrowse < i2; viewVidNumForFastBrowse++) {
            if (!m77036a(viewVidNumForFastBrowse, f89779f.size())) {
                return false;
            }
            if (f89779f.get(viewVidNumForFastBrowse).longValue() >= ((long) cVar.getSingleVidViewTime())) {
                f89779f.get(viewVidNumForFastBrowse);
                cVar.getSingleVidViewTime();
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final String mo66230b() {
        int i;
        AbstractC48191b bVar;
        AbstractC49815a aVar;
        AbstractC49815a aVar2;
        AbstractC49815a aVar3;
        WeakReference<AbstractC49815a> weakReference = f89775b;
        int i2 = -1;
        if (weakReference == null || (aVar3 = weakReference.get()) == null) {
            i = -1;
        } else {
            i = aVar3.mo81111aF();
        }
        WeakReference<AbstractC49815a> weakReference2 = f89775b;
        if (weakReference2 == null || (aVar2 = weakReference2.get()) == null) {
            bVar = null;
        } else {
            bVar = aVar2.f114768W;
        }
        if (!(bVar instanceof AbstractC48191b)) {
            return null;
        }
        if (i > f89776c) {
            f89783j = m77032a((List<? extends Aweme>) bVar.f111623a.f111788a, f89782i, true);
            f89786m = m77032a((List<? extends Aweme>) bVar.f111623a.f111788a, f89783j, false);
            m77038c();
        }
        C37991b bVar2 = f89784k;
        if (bVar2 != null && !f89780g.contains(bVar2)) {
            f89780g.add(bVar2);
        }
        Iterator<C37991b> it = f89780g.iterator();
        while (it.hasNext()) {
            C37991b next = it.next();
            if (!next.isDrop()) {
                next.setFinalPos(next.getFinalPos() - f89781h);
            }
        }
        C27910f fVar = new C27910f();
        WeakReference<AbstractC49815a> weakReference3 = f89775b;
        if (!(weakReference3 == null || (aVar = weakReference3.get()) == null)) {
            int aF = aVar.mo81111aF();
            int i3 = f89781h;
            if (i3 != -1) {
                i2 = (aF - i3) - 1;
            }
        }
        String b = fVar.mo46674b(new C37993d(i2, m77039d(), f89792s, f89780g));
        f89792s.clear();
        f89780g.clear();
        f89784k = null;
        f89785l.clear();
        return b;
    }

    /* renamed from: c */
    public static void m77038c() {
        int i;
        int i2;
        int i3;
        AbstractC49815a aVar;
        ArrayList<Aweme> arrayList;
        boolean z;
        C37992c cVar = f89787n;
        if (cVar != null && cVar.isEnableGapAdjust() && (i = f89782i) != -1 && (i2 = f89783j) != -1 && i != (i3 = f89781h) && i2 != i3 + 1) {
            WeakReference<AbstractC49815a> weakReference = f89775b;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            if (!(aVar instanceof C49888x)) {
                aVar = null;
            }
            C49888x xVar = (C49888x) aVar;
            if (xVar != null) {
                AbstractC48191b bVar = xVar.f114768W;
                if ((bVar instanceof AbstractC48191b) && bVar != null && (arrayList = bVar.f111623a.f111788a) != null && f89783j - f89781h <= cVar.getDownstreamRange() + 2) {
                    int i4 = Integer.MAX_VALUE;
                    if (f89783j != f89781h + 2 || !m77044i() || !cVar.isEnableFastBrowseAdjust()) {
                        if (cVar.isEnableShowTimeGap() && f89777d != -1) {
                            i4 = m77030a(m77041f(), m77042g(), m77043h());
                        }
                        z = false;
                    } else {
                        i4 = 1;
                        z = true;
                    }
                    if (m77035a(i4)) {
                        m77033a(i4, z);
                    } else if (m77036a(f89781h, arrayList.size()) && arrayList.get(f89783j).isEnableAdDrop() && z && cVar.isEnableFastBrowseAdjust() && f89783j == f89781h + 2 && m77040e()) {
                        f89792s.add(Long.valueOf(System.currentTimeMillis()));
                        C18129a.m33746a("draw_ad", "drop_ads", arrayList.get(f89783j).getAwemeRawAd()).mo28901b();
                        f89790q = true;
                        int i5 = f89783j;
                        xVar.mo84684a(i5, arrayList.get(i5));
                        f89785l.add(new C37990a(1, 2));
                        C37991b bVar2 = f89784k;
                        if (bVar2 == null) {
                            f89784k = new C37991b(3, f89785l, true);
                        } else {
                            bVar2.setFinalPos(3);
                            C37991b bVar3 = f89784k;
                            if (bVar3 != null) {
                                bVar3.setDrop(true);
                            }
                        }
                        C37991b bVar4 = f89784k;
                        if (bVar4 != null) {
                            f89780g.add(bVar4);
                        }
                        f89784k = null;
                        f89785l = new ArrayList<>();
                        int i6 = f89786m;
                        f89783j = i6;
                        f89786m = m77032a((List<? extends Aweme>) arrayList, i6, false);
                        f89790q = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m77035a(int i) {
        int g;
        int h;
        int i2;
        if (i == Integer.MAX_VALUE || i == 0 || (h = m77043h()) < (g = m77042g()) || g > (i2 = f89783j + i) || h < i2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static int m77037b(int i) {
        AbstractC49815a aVar;
        Aweme c;
        List<Integer> gapList;
        WeakReference<AbstractC49815a> weakReference = f89775b;
        if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
            int i2 = f89783j;
            if (!(aVar.f114768W == null || (c = aVar.f114768W.mo80287c(i2)) == null || (gapList = c.getGapList()) == null)) {
                for (Integer num : gapList) {
                    C89219l.m154716b(num, "");
                    i += num.intValue();
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m77031a(String str) {
        WeakReference<AbstractC49815a> weakReference;
        AbstractC49815a aVar;
        AbstractC48191b bVar;
        List<Aweme> e;
        if (f89782i == -1 || (weakReference = f89775b) == null || (aVar = weakReference.get()) == null || (bVar = aVar.f114768W) == null || (e = bVar.mo80288e()) == null || !m77036a(f89782i, e.size())) {
            return -1;
        }
        int size = e.size();
        for (int i = f89782i + 1; i < size; i++) {
            Aweme aweme = e.get(i);
            C89219l.m154716b(aweme, "");
            if (TextUtils.equals(aweme.getAid(), str)) {
                return i - f89782i;
            }
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.timegap.AdShowTimeGapManager$a */
    public static final class C37989a<T> implements Comparator {
        static {
            Covode.recordClassIndex(45450);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(Integer.parseInt((String) t.getKey())), Integer.valueOf(Integer.parseInt((String) t2.getKey())));
        }
    }

    /* renamed from: a */
    private static void m77033a(int i, boolean z) {
        AbstractC49815a aVar;
        WeakReference<AbstractC49815a> weakReference = f89775b;
        if (weakReference != null) {
            aVar = weakReference.get();
        } else {
            aVar = null;
        }
        if (!(aVar instanceof C49888x)) {
            aVar = null;
        }
        C49888x xVar = (C49888x) aVar;
        if (xVar != null) {
            AbstractC48191b bVar = xVar.f114768W;
            if ((bVar instanceof AbstractC48191b) && bVar != null && m77036a(f89783j, bVar.getCount())) {
                Aweme aweme = bVar.f111623a.f111788a.get(f89783j);
                Aweme c = bVar.mo80287c(f89783j + i);
                if (c != null) {
                    c.getAid();
                }
                int i2 = 1;
                f89790q = true;
                xVar.mo84684a(f89783j, aweme);
                xVar.mo84721b(aweme, f89783j + i);
                f89790q = false;
                Aweme c2 = bVar.mo80287c(f89783j + i);
                if (c2 != null) {
                    c2.getAid();
                }
                f89783j += i;
                ArrayList<C37990a> arrayList = f89785l;
                if (z) {
                    i2 = 2;
                }
                arrayList.add(new C37990a(i, i2));
                C37991b bVar2 = f89784k;
                if (bVar2 == null) {
                    f89784k = new C37991b(f89783j, f89785l, false);
                } else {
                    bVar2.setFinalPos(f89783j);
                }
            }
        }
    }

    /* renamed from: a */
    private static int m77030a(int i, int i2, int i3) {
        String str;
        if (i == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        HashMap hashMap = new HashMap();
        C27910f fVar = new C27910f();
        C37992c cVar = f89787n;
        if (cVar != null) {
            str = cVar.getDeltaGapTimeMap();
        } else {
            str = null;
        }
        Map map = (Map) fVar.mo46670a(str, (Class) hashMap.getClass());
        if (map == null) {
            return Integer.MAX_VALUE;
        }
        List<Map.Entry> a = C89070n.m154553a((Iterable) map.entrySet(), (Comparator) new C37989a());
        int i4 = 10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) a, 10)), 16));
        for (Map.Entry entry : a) {
            linkedHashMap.put(entry.getKey(), Double.valueOf(((Number) entry.getValue()).doubleValue()));
        }
        String str2 = "-1";
        for (String str3 : linkedHashMap.keySet()) {
            if (i < Integer.parseInt(str3)) {
                break;
            }
            str2 = str3;
        }
        Double d = (Double) linkedHashMap.get(str2);
        if (d == null) {
            return Integer.MAX_VALUE;
        }
        int b = m77037b((int) d.doubleValue());
        if (b == Integer.MAX_VALUE || b == 0) {
            return b;
        }
        if (b <= 10) {
            i4 = b;
        }
        while (true) {
            int i5 = f89783j;
            if ((i4 + i5 < i2 || i5 + i4 > i3) && i4 != 0) {
                i4 = i4 > 0 ? i4 - 1 : i4 + 1;
            }
        }
        return i4;
    }

    /* renamed from: a */
    public static int m77032a(List<? extends Aweme> list, int i, boolean z) {
        if (list == null || !m77036a(i, list.size())) {
            return -1;
        }
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (!z) {
                if (((Aweme) list.get(i2)).isAd()) {
                    return i2;
                }
            } else if (((Aweme) list.get(i2)).isAd() && ((Aweme) list.get(i2)).isEnablePosAdjust() && !C37699a.m76251aW((Aweme) list.get(i2))) {
                return i2;
            }
        }
        return -1;
    }
}

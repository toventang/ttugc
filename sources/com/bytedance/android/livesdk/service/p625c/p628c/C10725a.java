package com.bytedance.android.livesdk.service.p625c.p628c;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDialogUpDownSetting;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4601a.C89037ac;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.c.a */
public final class C10725a {

    /* renamed from: a */
    public static final C10726a f25834a = new C10726a((byte) 0);

    /* renamed from: b */
    private int f25835b;

    /* renamed from: c */
    private int f25836c;

    /* renamed from: d */
    private LongSparseArray<Long> f25837d;

    /* renamed from: e */
    private LongSparseArray<Long> f25838e;

    /* renamed from: f */
    private LongSparseArray<Integer> f25839f;

    /* renamed from: g */
    private LinkedList<AbstractC8812b<? extends C9543b>> f25840g;

    /* renamed from: h */
    private int f25841h;

    /* renamed from: i */
    private int f25842i;

    /* renamed from: j */
    private LinkedList<Long> f25843j;

    /* renamed from: k */
    private LinkedList<Long> f25844k;

    /* renamed from: l */
    private boolean f25845l;

    static {
        Covode.recordClassIndex(12322);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.c.a$a */
    public static final class C10726a {

        /* renamed from: com.bytedance.android.livesdk.service.c.c.a$a$a */
        public static final class C10727a {

            /* renamed from: a */
            public static final C10725a f25846a = new C10725a((byte) 0);

            /* renamed from: b */
            public static final C10728a f25847b = new C10728a((byte) 0);

            /* renamed from: com.bytedance.android.livesdk.service.c.c.a$a$a$a */
            public static final class C10728a {
                static {
                    Covode.recordClassIndex(12325);
                }

                private C10728a() {
                }

                public /* synthetic */ C10728a(byte b) {
                    this();
                }
            }

            static {
                Covode.recordClassIndex(12324);
            }
        }

        static {
            Covode.recordClassIndex(12323);
        }

        private C10726a() {
        }

        public /* synthetic */ C10726a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo17647a() {
        this.f25835b = -1;
        this.f25836c = -1;
        this.f25845l = true;
    }

    /* renamed from: f */
    private final int m19307f() {
        Iterator<Long> it = this.f25843j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f25844k.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    private C10725a() {
        this.f25835b = -1;
        this.f25836c = -1;
        this.f25837d = new LongSparseArray<>();
        this.f25838e = new LongSparseArray<>();
        this.f25839f = new LongSparseArray<>();
        this.f25840g = new LinkedList<>();
        this.f25843j = new LinkedList<>();
        this.f25844k = new LinkedList<>();
        this.f25845l = true;
    }

    /* renamed from: b */
    private final int m19303b() {
        Iterator<Long> it = this.f25843j.iterator();
        int i = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Long> longSparseArray = this.f25837d;
            C89219l.m154716b(next, "");
            if (longSparseArray.get(next.longValue()) != null || this.f25844k.contains(next)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private final void m19305d() {
        Iterator<Long> it = this.f25843j.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Integer> longSparseArray = this.f25839f;
            C89219l.m154716b(next, "");
            longSparseArray.put(next.longValue(), 1);
        }
    }

    /* renamed from: g */
    private final int m19308g() {
        Iterator<Long> it = this.f25843j.iterator();
        int i = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Integer> longSparseArray = this.f25839f;
            C89219l.m154716b(next, "");
            Integer num = longSparseArray.get(next.longValue());
            if (num != null && num.intValue() == 0) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private final long m19306e() {
        int g = m19308g();
        Iterator<Long> it = this.f25843j.iterator();
        long j = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Integer> longSparseArray = this.f25839f;
            C89219l.m154716b(next, "");
            Integer num = longSparseArray.get(next.longValue());
            if (num != null && num.intValue() == 0) {
                long longValue = this.f25837d.get(next.longValue()).longValue();
                Long l = this.f25838e.get(next.longValue());
                C89219l.m154716b(l, "");
                j += longValue - l.longValue();
            }
        }
        if (g != 0) {
            return j / ((long) g);
        }
        return 0;
    }

    /* renamed from: h */
    private final long m19309h() {
        Iterator<Long> it = this.f25843j.iterator();
        long j = 0;
        while (it.hasNext()) {
            Long next = it.next();
            LongSparseArray<Long> longSparseArray = this.f25837d;
            C89219l.m154716b(next, "");
            long longValue = longSparseArray.get(next.longValue()).longValue();
            Long l = this.f25838e.get(next.longValue());
            C89219l.m154716b(l, "");
            long longValue2 = longValue - l.longValue();
            if (longValue2 > j) {
                j = longValue2;
            }
        }
        return j;
    }

    /* renamed from: c */
    private final void m19304c() {
        int i;
        int i2;
        String str;
        if (m19308g() != 0) {
            C6501b a = C6501b.C6502a.m13948a("gift_panel_gift_icon_load");
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() > 0) {
                i = C8374a.C8375a.C8376a.f20718a.f20716j;
            } else {
                i = this.f25835b;
            }
            C6501b a2 = a.mo12645a("tab_id", i).mo12646a("gift_icon_load_duration_ms", m19309h());
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() > 0) {
                i2 = GiftManager.inst().getTabLocation(C8374a.C8375a.C8376a.f20718a.f20716j);
            } else {
                i2 = this.f25836c + 1;
            }
            C6501b a3 = a2.mo12645a("page_position", i2).mo12645a("gift_cnt", this.f25842i).mo12645a("no_cache_gift_cnt", m19308g()).mo12645a("no_cache_gift_fail_cnt", m19307f()).mo12646a("no_cache_gift_load_duration_ms_avg", m19306e());
            if (LiveGiftDialogUpDownSetting.INSTANCE.getValue() > 0) {
                str = "1";
            } else {
                str = "null";
            }
            a3.mo12651a("is_swipe", str).mo12639a().mo12655b();
            m19305d();
        }
    }

    public /* synthetic */ C10725a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo17650a(long j) {
        this.f25838e.put(j, Long.valueOf(C11200a.m19851a()));
    }

    /* renamed from: c */
    public final void mo17654c(long j) {
        this.f25837d.put(j, Long.valueOf(C11200a.m19851a()));
        if (this.f25843j.contains(Long.valueOf(j))) {
            this.f25841h++;
        }
        this.f25844k.add(Long.valueOf(j));
        if (this.f25841h == this.f25842i && this.f25845l) {
            this.f25845l = false;
            m19304c();
        }
    }

    /* renamed from: b */
    public final void mo17653b(long j) {
        this.f25837d.put(j, Long.valueOf(C11200a.m19851a()));
        if (this.f25843j.contains(Long.valueOf(j))) {
            this.f25841h++;
        }
        if (this.f25841h == this.f25842i && this.f25845l) {
            this.f25845l = false;
            m19304c();
        }
    }

    /* renamed from: a */
    public final void mo17648a(int i) {
        int i2;
        long j;
        if (this.f25836c != i) {
            this.f25836c = i;
            int size = ((this.f25840g.size() - 1) / 8) * 8;
            if (i == (((this.f25840g.size() - 1) / 8) + 1) - 1) {
                i2 = this.f25840g.size() - size;
            } else {
                i2 = 8;
            }
            this.f25842i = i2;
            this.f25843j.clear();
            for (C89037ac acVar : C89070n.m154593m(this.f25840g)) {
                if (acVar.f202766a >= i * 8 && acVar.f202766a < Math.min((i + 1) * 8, this.f25840g.size())) {
                    LinkedList<Long> linkedList = this.f25843j;
                    T t = acVar.f202767b;
                    if (t != null) {
                        j = t.mo14676d();
                    } else {
                        j = 0;
                    }
                    linkedList.add(Long.valueOf(j));
                }
            }
            int b = m19303b();
            this.f25841h = b;
            this.f25845l = true;
            if (b == this.f25842i) {
                this.f25845l = false;
                try {
                    m19304c();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17652a(List<Long> list) {
        Long l;
        long j;
        C89219l.m154721d(list, "");
        this.f25842i = list.size();
        this.f25843j.clear();
        for (C89037ac acVar : C89070n.m154593m(this.f25840g)) {
            T t = acVar.f202767b;
            if (t != null) {
                l = Long.valueOf(t.mo14676d());
            } else {
                l = null;
            }
            if (C89070n.m154556a((Iterable) list, (Object) l)) {
                LinkedList<Long> linkedList = this.f25843j;
                T t2 = acVar.f202767b;
                if (t2 != null) {
                    j = t2.mo14676d();
                } else {
                    j = 0;
                }
                linkedList.add(Long.valueOf(j));
            }
        }
        int b = m19303b();
        this.f25841h = b;
        this.f25845l = true;
        if (b == this.f25842i) {
            this.f25845l = false;
            try {
                m19304c();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo17649a(int i, LinkedList<AbstractC8812b<? extends C9543b>> linkedList) {
        C89219l.m154721d(linkedList, "");
        if (this.f25835b != i) {
            this.f25836c = -1;
            this.f25845l = true;
            this.f25835b = i;
            this.f25838e.clear();
            this.f25839f.clear();
            this.f25837d.clear();
            this.f25840g.clear();
            this.f25840g.addAll(linkedList);
        }
    }

    /* renamed from: a */
    public final void mo17651a(long j, boolean z) {
        this.f25839f.put(j, Integer.valueOf(z ? 1 : 0));
    }
}

package com.p2082ss.android.ugc.aweme.discover.p2767c;

import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.c.h */
public final class C41908h {

    /* renamed from: a */
    public static final C41909a f97773a = new C41909a((byte) 0);

    /* renamed from: b */
    private int f97774b = 100000;

    /* renamed from: c */
    private final LinkedList<Integer> f97775c = new LinkedList<>();

    static {
        Covode.recordClassIndex(49834);
    }

    /* renamed from: a */
    public static boolean m83951a(int i) {
        return 100000 <= i && 110000 >= i;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.c.h$a */
    public static final class C41909a {
        static {
            Covode.recordClassIndex(49835);
        }

        private C41909a() {
        }

        public /* synthetic */ C41909a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo71065a() {
        if (this.f97775c.size() > 0) {
            Integer removeFirst = this.f97775c.removeFirst();
            C89219l.m154716b(removeFirst, "");
            return removeFirst.intValue();
        }
        int i = this.f97774b;
        if (i <= 110000) {
            this.f97774b = i + 1;
            return i;
        }
        throw new IllegalStateException("Your viewType is too much,it's impossible in common");
    }

    /* renamed from: b */
    public final void mo71066b(int i) {
        this.f97775c.addLast(Integer.valueOf(i));
    }
}

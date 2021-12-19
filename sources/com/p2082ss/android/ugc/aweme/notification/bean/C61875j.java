package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.j */
public final class C61875j {

    /* renamed from: c */
    public static final C61876a f140466c = new C61876a((byte) 0);

    /* renamed from: a */
    public int f140467a;

    /* renamed from: b */
    public final List<MusNotice> f140468b = new ArrayList();

    static {
        Covode.recordClassIndex(72624);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.j$a */
    public static final class C61876a {
        static {
            Covode.recordClassIndex(72625);
        }

        private C61876a() {
        }

        public /* synthetic */ C61876a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo99970a(MusNotice musNotice) {
        C89219l.m154721d(musNotice, "");
        this.f140468b.add(musNotice);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.bean.j$b */
    public static final class C61877b<T> implements Comparator {

        /* renamed from: a */
        public static final C61877b f140469a = new C61877b();

        static {
            Covode.recordClassIndex(72626);
        }

        C61877b() {
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
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.bean.C61875j.C61877b.compare(java.lang.Object, java.lang.Object):int");
        }
    }
}

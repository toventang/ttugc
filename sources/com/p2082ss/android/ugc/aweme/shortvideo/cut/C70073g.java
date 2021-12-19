package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69842at;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.g */
public final class C70073g {

    /* renamed from: a */
    public static final C70073g f156696a = new C70073g();

    private C70073g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.g$a */
    static final class CallableC70074a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f156697a;

        static {
            Covode.recordClassIndex(82494);
        }

        CallableC70074a(List list) {
            this.f156697a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(C70073g.m123700a(this.f156697a));
        }
    }

    static {
        Covode.recordClassIndex(82493);
    }

    /* renamed from: a */
    public static int m123700a(List<? extends VideoSegment> list) {
        Object next;
        int i;
        int a = C69842at.m123410a();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.f156717i) {
                    arrayList.add(t);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int a2 = ((VideoSegment) next).mo110570a();
                    do {
                        Object next2 = it.next();
                        int a3 = ((VideoSegment) next2).mo110570a();
                        if (a2 < a3) {
                            next = next2;
                            a2 = a3;
                        }
                    } while (it.hasNext());
                }
            }
            VideoSegment videoSegment = (VideoSegment) next;
            if (videoSegment != null) {
                i = videoSegment.mo110570a();
            } else {
                i = 0;
            }
            int max = Math.max(30, i);
            if (a > 0) {
                if (max > a) {
                    return a;
                }
                return max;
            } else if (51 <= max && 74 >= max) {
                return max / 2;
            } else {
                if (max >= 75) {
                    return max / 3;
                }
                return max;
            }
        } else if (a > 0) {
            return a;
        } else {
            return 30;
        }
    }
}

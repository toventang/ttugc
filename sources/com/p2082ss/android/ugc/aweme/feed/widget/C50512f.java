package com.p2082ss.android.ugc.aweme.feed.widget;

import android.text.style.ClickableSpan;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50109bf;
import java.util.Comparator;
import p4600h.p4601a.C89064i;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.f */
public final class C50512f {

    /* renamed from: a */
    public static final C50512f f116747a = new C50512f();

    private C50512f() {
    }

    static {
        Covode.recordClassIndex(59659);
    }

    /* renamed from: a */
    public static final ClickableSpan m94695a(ClickableSpan[] clickableSpanArr) {
        C89219l.m154721d(clickableSpanArr, "");
        if (clickableSpanArr.length > 1) {
            C89064i.m154467a((Object[]) clickableSpanArr, (Comparator) new C50513a());
        }
        return clickableSpanArr[0];
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.f$a */
    public static final class C50513a<T> implements Comparator {
        static {
            Covode.recordClassIndex(59660);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            T t3 = t2;
            int i2 = 100;
            if (t3 instanceof AbstractC50109bf) {
                i = t3.f115672a;
            } else {
                i = 100;
            }
            Integer valueOf = Integer.valueOf(i);
            T t4 = t;
            if (t4 instanceof AbstractC50109bf) {
                i2 = t4.f115672a;
            }
            return C89090a.m154604a(valueOf, Integer.valueOf(i2));
        }
    }
}

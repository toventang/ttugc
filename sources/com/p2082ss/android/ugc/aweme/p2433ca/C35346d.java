package com.p2082ss.android.ugc.aweme.p2433ca;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ca.d */
public final class C35346d {

    /* renamed from: a */
    public static final List<Message> f83383a = new ArrayList();

    /* renamed from: b */
    public static final C35346d f83384b = new C35346d();

    private C35346d() {
    }

    static {
        Covode.recordClassIndex(42514);
    }

    /* renamed from: a */
    public static void m72339a() {
        for (T t : f83383a) {
            t.getTarget().sendMessageAtFrontOfQueue(t);
        }
        f83383a.clear();
    }
}

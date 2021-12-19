package com.p2082ss.android.ugc.aweme.search.theme.p3706a;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.search.theme.a.a */
public final class C67766a {

    /* renamed from: a */
    public static final C67766a f151865a = new C67766a();

    /* renamed from: b */
    private static WeakReference<Drawable> f151866b;

    /* renamed from: c */
    private static boolean f151867c;

    private C67766a() {
    }

    static {
        Covode.recordClassIndex(79417);
    }

    /* renamed from: a */
    public static void m119929a() {
        if (f151867c) {
            AbstractC81915c.m141874a(new C67767b());
            f151867c = false;
            f151866b = null;
        }
    }

    /* renamed from: a */
    public static void m119930a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            f151866b = new WeakReference<>(drawable);
        }
        boolean z2 = true;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        AbstractC81915c.m141874a(new C67767b(drawable, z));
        if (drawable == null) {
            z2 = false;
        }
        f151867c = z2;
    }
}

package com.p2082ss.android.ugc.aweme.p2433ca;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46748bt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ca.j */
public final class C35355j {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<Runnable> f83396a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public static int f83397b = 3;

    /* renamed from: c */
    public static final C35355j f83398c = new C35355j();

    /* renamed from: d */
    private static final CopyOnWriteArrayList<Runnable> f83399d = new CopyOnWriteArrayList<>();

    private C35355j() {
    }

    /* renamed from: c */
    public static void m72361c() {
        f83397b--;
    }

    /* renamed from: a */
    public static boolean m72358a() {
        if (C46748bt.m90114a() != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(42523);
    }

    /* renamed from: b */
    public static void m72359b() {
        Iterator<T> it = f83399d.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        f83399d.clear();
    }

    /* renamed from: b */
    private static void m72360b(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        f83399d.add(runnable);
    }

    /* renamed from: c */
    private static void m72362c(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        f83396a.add(runnable);
    }

    /* renamed from: a */
    public static void m72357a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        if (C46748bt.m90120g()) {
            m72360b(runnable);
        } else if (!C46748bt.m90121h() || f83397b == 0) {
            runnable.run();
        } else {
            m72362c(runnable);
        }
    }
}

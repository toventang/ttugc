package com.facebook.drawee.p1850b;

import com.bytedance.covode.number.Covode;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.facebook.drawee.b.b */
public class C24192b {

    /* renamed from: b */
    private static final C24192b f57262b = new C24192b();

    /* renamed from: c */
    private static boolean f57263c = true;

    /* renamed from: a */
    private final Queue<EnumC24193a> f57264a = new ArrayBlockingQueue(20);

    public String toString() {
        return this.f57264a.toString();
    }

    static {
        Covode.recordClassIndex(28323);
    }

    private C24192b() {
    }

    /* renamed from: a */
    public static C24192b m45880a() {
        if (f57263c) {
            return new C24192b();
        }
        return f57262b;
    }

    /* renamed from: com.facebook.drawee.b.b$a */
    public enum EnumC24193a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT;

        static {
            Covode.recordClassIndex(28324);
        }
    }

    /* renamed from: a */
    public final void mo39804a(EnumC24193a aVar) {
        if (f57263c) {
            if (this.f57264a.size() + 1 > 20) {
                this.f57264a.poll();
            }
            this.f57264a.add(aVar);
        }
    }
}

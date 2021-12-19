package org.greenrobot.eventbus;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.p4665b.AbstractC90245b;

/* renamed from: org.greenrobot.eventbus.c */
public class C90246c {

    /* renamed from: n */
    private static final ExecutorService f205001n = Executors.newCachedThreadPool();

    /* renamed from: a */
    boolean f205002a = true;

    /* renamed from: b */
    boolean f205003b = true;

    /* renamed from: c */
    boolean f205004c = true;

    /* renamed from: d */
    boolean f205005d = true;

    /* renamed from: e */
    boolean f205006e;

    /* renamed from: f */
    boolean f205007f = true;

    /* renamed from: g */
    boolean f205008g;

    /* renamed from: h */
    boolean f205009h;

    /* renamed from: i */
    ExecutorService f205010i = f205001n;

    /* renamed from: j */
    ExecutorService f205011j;

    /* renamed from: k */
    List<AbstractC90245b> f205012k;

    /* renamed from: l */
    AbstractC90255l f205013l;

    /* renamed from: m */
    AbstractC90258m f205014m;

    /* renamed from: a */
    static Object m156994a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(106517);
    }

    C90246c() {
    }
}

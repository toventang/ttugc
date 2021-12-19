package org.greenrobot.eventbus.p4664a;

import com.bytedance.covode.number.Covode;
import java.util.logging.Level;
import org.greenrobot.eventbus.AbstractC90255l;

/* renamed from: org.greenrobot.eventbus.a.a */
public final class C90242a implements AbstractC90255l {

    /* renamed from: a */
    public static final boolean f204996a;

    /* renamed from: b */
    private final String f204997b;

    @Override // org.greenrobot.eventbus.AbstractC90255l
    /* renamed from: a */
    public final void mo145405a(Level level, String str) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90255l
    /* renamed from: a */
    public final void mo145406a(Level level, String str, Throwable th) {
    }

    static {
        Covode.recordClassIndex(106513);
        boolean z = false;
        try {
            if (Class.forName("android.util.Log") != null) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        }
        f204996a = z;
    }

    public C90242a(String str) {
        this.f204997b = str;
    }
}

package com.facebook.drawee.p1856g;

import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.drawee.g.a */
public final class C24253a {

    /* renamed from: a */
    public AbstractC24254a f57509a;

    /* renamed from: b */
    public final float f57510b;

    /* renamed from: c */
    public boolean f57511c;

    /* renamed from: d */
    public boolean f57512d;

    /* renamed from: e */
    public long f57513e;

    /* renamed from: f */
    public float f57514f;

    /* renamed from: g */
    public float f57515g;

    /* renamed from: com.facebook.drawee.g.a$a */
    public interface AbstractC24254a {
        static {
            Covode.recordClassIndex(28385);
        }

        /* renamed from: h */
        boolean mo39820h();
    }

    static {
        Covode.recordClassIndex(28384);
    }

    /* renamed from: a */
    public final void mo39989a() {
        this.f57509a = null;
        mo39990b();
    }

    /* renamed from: b */
    public final void mo39990b() {
        this.f57511c = false;
        this.f57512d = false;
    }

    public C24253a(Context context) {
        this.f57510b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        mo39989a();
    }
}

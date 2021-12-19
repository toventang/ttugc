package com.p2082ss.android.newmedia;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.AwemeAppData;

/* renamed from: com.ss.android.newmedia.e */
public abstract class AbstractC30133e {

    /* renamed from: h */
    private static volatile AwemeAppData f71882h;

    /* renamed from: a */
    protected int f71883a = ((int) C17867d.m33084e());

    /* renamed from: b */
    protected final Context f71884b = C17867d.m33078a();

    /* renamed from: c */
    public long f71885c = -1;

    /* renamed from: d */
    public long f71886d = -1;

    /* renamed from: e */
    public int f71887e = 2;

    /* renamed from: f */
    private final Object f71888f = new Object();

    /* renamed from: g */
    private int f71889g = 1;

    static {
        Covode.recordClassIndex(36632);
    }

    /* renamed from: a */
    public static AwemeAppData m60956a() {
        if (f71882h == null) {
            synchronized (AbstractC30133e.class) {
                if (f71882h == null) {
                    f71882h = new AwemeAppData();
                }
            }
        }
        return f71882h;
    }

    /* renamed from: b */
    public final int mo53510b() {
        int i = this.f71883a;
        if (i == -1 || i == 0 || i == 1) {
            this.f71883a = (int) C17867d.m33084e();
        }
        return this.f71883a;
    }
}

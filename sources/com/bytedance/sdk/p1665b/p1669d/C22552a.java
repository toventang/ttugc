package com.bytedance.sdk.p1665b.p1669d;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1667b.C22530b;
import com.bytedance.sdk.p1665b.p1669d.p1670a.AbstractC22556a;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22558a;
import com.bytedance.sdk.p1665b.p1669d.p1673d.C22561a;
import com.bytedance.sdk.p1665b.p1676f.C22586c;

/* renamed from: com.bytedance.sdk.b.d.a */
public final class C22552a {

    /* renamed from: a */
    public final AbstractC22556a f53319a;

    /* renamed from: b */
    public Handler f53320b;

    static {
        Covode.recordClassIndex(26368);
    }

    /* renamed from: com.bytedance.sdk.b.d.a$a */
    public static class C22555a {

        /* renamed from: a */
        public static C22552a f53326a = new C22552a((byte) 0);

        static {
            Covode.recordClassIndex(26371);
        }
    }

    private C22552a() {
        this.f53319a = new C22561a();
        this.f53320b = new Handler(Looper.getMainLooper());
    }

    /* synthetic */ C22552a(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo36836a(Context context, AbstractC22558a<C22530b> aVar, boolean z) {
        this.f53319a.mo36841a(C22586c.m42622a(context, false), aVar, z);
    }
}

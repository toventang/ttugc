package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;

/* renamed from: com.android.billingclient.api.d */
public abstract class AbstractC2235d {
    static {
        Covode.recordClassIndex(2440);
    }

    /* renamed from: a */
    public abstract C2242h mo6190a(Activity activity, C2240g gVar);

    /* renamed from: a */
    public abstract C2242h mo6191a(String str);

    /* renamed from: a */
    public abstract void mo6192a(C2232b bVar, AbstractC2234c cVar);

    /* renamed from: a */
    public abstract void mo6193a(AbstractC2239f fVar);

    /* renamed from: a */
    public abstract void mo6194a(C2244i iVar, AbstractC2246j jVar);

    /* renamed from: a */
    public abstract void mo6195a(C2248l lVar, AbstractC2250m mVar);

    /* renamed from: a */
    public abstract boolean mo6196a();

    /* renamed from: b */
    public abstract Purchase.C2218a mo6197b(String str);

    /* renamed from: com.android.billingclient.api.d$a */
    public static final class C2236a {

        /* renamed from: a */
        public boolean f6690a;

        /* renamed from: b */
        public final Context f6691b;

        /* renamed from: c */
        public AbstractC2247k f6692c;

        static {
            Covode.recordClassIndex(2441);
        }

        private C2236a(Context context) {
            this.f6691b = context;
        }

        public /* synthetic */ C2236a(Context context, byte b) {
            this(context);
        }
    }
}

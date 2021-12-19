package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.g */
public final class C8590g {

    /* renamed from: a */
    final AbstractC8591a f21228a;

    /* renamed from: b */
    final boolean f21229b;

    /* renamed from: c */
    float f21230c;

    /* renamed from: d */
    float f21231d;

    /* renamed from: e */
    float f21232e;

    /* renamed from: f */
    final int f21233f;

    /* renamed from: g */
    final int f21234g = m16813a(8);

    /* renamed from: h */
    final int f21235h = m16813a(80);

    /* renamed from: i */
    final int f21236i = m16813a(150);

    /* renamed from: j */
    int f21237j;

    /* renamed from: k */
    boolean f21238k;

    /* renamed from: l */
    boolean f21239l;

    /* renamed from: m */
    public boolean f21240m;

    /* renamed from: n */
    VelocityTracker f21241n;

    /* renamed from: o */
    private final Context f21242o;

    /* renamed from: com.bytedance.android.livesdk.feed.g$a */
    public interface AbstractC8591a {
        static {
            Covode.recordClassIndex(9448);
        }

        /* renamed from: a */
        void mo14774a();

        /* renamed from: a */
        void mo14775a(int i, float f);

        /* renamed from: a */
        boolean mo14776a(int i);

        /* renamed from: b */
        boolean mo14777b(int i);

        /* renamed from: c */
        void mo14778c(int i);

        /* renamed from: d */
        void mo14779d(int i);
    }

    static {
        Covode.recordClassIndex(9447);
    }

    /* renamed from: a */
    private int m16813a(int i) {
        return (int) ((((float) i) * this.f21242o.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo14895a(float f) {
        if (f > 0.0f && this.f21228a.mo14777b(3)) {
            return true;
        }
        if (f >= 0.0f || !this.f21228a.mo14777b(5)) {
            return false;
        }
        return true;
    }

    public C8590g(Context context, AbstractC8591a aVar) {
        this.f21242o = context;
        this.f21228a = aVar;
        this.f21233f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f21229b = C6229a.m13521a(context);
    }
}

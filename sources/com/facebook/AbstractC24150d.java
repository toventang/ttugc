package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24699ae;

/* renamed from: com.facebook.d */
public abstract class AbstractC24150d {

    /* renamed from: a */
    public static final String f57116a = AbstractC24150d.class.getSimpleName();

    /* renamed from: b */
    public boolean f57117b;

    /* renamed from: c */
    private final BroadcastReceiver f57118c = new C24151a(this, (byte) 0);

    /* renamed from: d */
    private final C0998a f57119d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39735a();

    static {
        Covode.recordClassIndex(28281);
    }

    /* renamed from: b */
    public final void mo39736b() {
        if (!this.f57117b) {
            m45762d();
            this.f57117b = true;
        }
    }

    /* renamed from: c */
    public final void mo39737c() {
        if (this.f57117b) {
            this.f57119d.mo3692a(this.f57118c);
            this.f57117b = false;
        }
    }

    public AbstractC24150d() {
        C24699ae.m47299a();
        C24699ae.m47299a();
        this.f57119d = C0998a.m3454a(C24872m.f59047g);
        mo39736b();
    }

    /* renamed from: d */
    private void m45762d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f57119d.mo3693a(this.f57118c, intentFilter);
    }

    /* renamed from: com.facebook.d$a */
    class C24151a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(28282);
        }

        private C24151a() {
        }

        /* synthetic */ C24151a(AbstractC24150d dVar, byte b) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
                AbstractC24150d.this.mo39735a();
            }
        }
    }
}

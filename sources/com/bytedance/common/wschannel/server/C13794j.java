package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.server.AbstractC13783d;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.server.j */
public final class C13794j implements AbstractC13783d {

    /* renamed from: a */
    AbstractC13783d.AbstractC13784a f33539a;

    /* renamed from: b */
    boolean f33540b;

    /* renamed from: c */
    private final Handler f33541c;

    /* renamed from: d */
    private final Context f33542d;

    /* renamed from: e */
    private ContentObserver f33543e;

    static {
        Covode.recordClassIndex(15842);
    }

    @Override // com.bytedance.common.wschannel.server.AbstractC13783d
    /* renamed from: b */
    public final boolean mo22197b() {
        return this.f33540b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22201c() {
        try {
            boolean a = C13758l.m24811a(this.f33542d).mo22109a();
            Logger.debug();
            if (a != this.f33540b) {
                this.f33540b = a;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.server.AbstractC13783d
    /* renamed from: a */
    public final void mo22195a() {
        mo22201c();
        this.f33543e = new ContentObserver(this.f33541c) {
            /* class com.bytedance.common.wschannel.server.C13794j.C137951 */

            static {
                Covode.recordClassIndex(15843);
            }

            public final void onChange(boolean z) {
                Logger.debug();
                C13794j jVar = C13794j.this;
                try {
                    boolean z2 = jVar.f33540b;
                    jVar.mo22201c();
                    if (z2 != jVar.f33540b && jVar.f33539a != null) {
                        jVar.f33539a.mo22178a(jVar.f33540b);
                    }
                } catch (Exception unused) {
                }
            }
        };
        try {
            this.f33542d.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.m24549a(this.f33542d, "frontier_enabled", "boolean"), true, this.f33543e);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.server.AbstractC13783d
    /* renamed from: a */
    public final void mo22196a(AbstractC13783d.AbstractC13784a aVar) {
        this.f33539a = aVar;
    }

    C13794j(Context context, Handler handler) {
        this.f33541c = handler;
        this.f33542d = context;
    }
}

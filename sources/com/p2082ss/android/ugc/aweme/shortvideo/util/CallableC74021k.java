package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import java.util.concurrent.Callable;
import p077b.C1743j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.k */
public final /* synthetic */ class CallableC74021k implements Callable {

    /* renamed from: a */
    private final Context f166139a;

    /* renamed from: b */
    private final String f166140b;

    /* renamed from: c */
    private final boolean f166141c;

    /* renamed from: d */
    private final ProgressDialogC84958b f166142d;

    /* renamed from: e */
    private final C1743j f166143e;

    /* renamed from: f */
    private final int f166144f = 2;

    static {
        Covode.recordClassIndex(86771);
    }

    CallableC74021k(Context context, String str, boolean z, ProgressDialogC84958b bVar, C1743j jVar) {
        this.f166139a = context;
        this.f166140b = str;
        this.f166141c = z;
        this.f166142d = bVar;
        this.f166143e = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f166139a;
        String str = this.f166140b;
        boolean z = this.f166141c;
        ProgressDialogC84958b bVar = this.f166142d;
        C63238c.f143581h.mo101540a(context, str, z, bVar, new AbstractC63154aa.AbstractC63161f(this.f166143e, str, this.f166144f, bVar, context, z) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.C740157 */

            /* renamed from: a */
            final /* synthetic */ C1743j f166123a;

            /* renamed from: b */
            final /* synthetic */ String f166124b;

            /* renamed from: c */
            final /* synthetic */ int f166125c;

            /* renamed from: d */
            final /* synthetic */ ProgressDialogC84958b f166126d;

            /* renamed from: e */
            final /* synthetic */ Context f166127e;

            /* renamed from: f */
            final /* synthetic */ boolean f166128f;

            static {
                Covode.recordClassIndex(86765);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63161f
            /* renamed from: a */
            public final void mo101592a(Exception exc) {
                this.f166126d.dismiss();
                new Handler(Looper.getMainLooper()).post(new RunnableC74039u(this.f166127e));
                if (this.f166128f) {
                    this.f166123a.mo5554a(exc);
                } else {
                    this.f166123a.mo5555a(new Bundle());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63161f
            /* renamed from: a */
            public final void mo101593a(String str, C69905c cVar) {
                Bundle bundle = new Bundle();
                if (!AVCommerceServiceImpl.m102988h().mo93962a() || cVar.isCommerceMusic()) {
                    C75462e.m132332a(this.f166124b, str);
                    cVar.setMusicPriority(this.f166125c);
                    C70005cr.m123611a().mo70083a(cVar);
                    bundle.putString("path", str);
                    this.f166123a.mo5555a(bundle);
                    return;
                }
                this.f166123a.mo5555a(bundle);
            }

            {
                this.f166123a = r1;
                this.f166124b = r2;
                this.f166125c = r3;
                this.f166126d = r4;
                this.f166127e = r5;
                this.f166128f = r6;
            }
        });
        return null;
    }
}

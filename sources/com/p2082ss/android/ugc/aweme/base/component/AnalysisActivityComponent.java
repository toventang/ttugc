package com.p2082ss.android.ugc.aweme.base.component;

import android.app.Activity;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.lang.ref.WeakReference;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent */
public class AnalysisActivityComponent implements AbstractC1192f {

    /* renamed from: a */
    public long f81535a;

    /* renamed from: b */
    WeakReference<AbstractC33501c> f81536b;

    /* renamed from: c */
    Activity f81537c;

    static {
        Covode.recordClassIndex(41492);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent$1 */
    static /* synthetic */ class C345341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f81538a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 41493(0xa215, float:5.8144E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.base.component.AnalysisActivityComponent.C345341.f81538a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.base.component.AnalysisActivityComponent.C345341.f81538a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.component.AnalysisActivityComponent.C345341.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo61002a() {
        if (this.f81535a != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f81535a;
            if (currentTimeMillis > 0) {
                C1731i.m5640b(new CallableC34538a(this, currentTimeMillis), C39162r.m79452a());
            }
            this.f81535a = -1;
        }
    }

    public AnalysisActivityComponent(Activity activity) {
        this.f81537c = activity;
        if (activity instanceof AbstractC33501c) {
            this.f81536b = new WeakReference<>(activity);
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        int i = C345341.f81538a[aVar.ordinal()];
        if (i == 1) {
            this.f81535a = System.currentTimeMillis();
        } else if (i == 2) {
            mo61002a();
        }
    }
}

package com.p2082ss.android.ugc.aweme.adaptation.analysis;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.lang.ref.WeakReference;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent */
public class AnalysisActivityComponent implements AbstractC1192f {

    /* renamed from: a */
    Context f79360a;

    /* renamed from: b */
    private long f79361b;

    /* renamed from: c */
    private WeakReference<AbstractC33401b> f79362c;

    static {
        Covode.recordClassIndex(40255);
    }

    /* renamed from: a */
    private Analysis m68496a() {
        AbstractC33401b bVar;
        WeakReference<AbstractC33401b> weakReference = this.f79362c;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return null;
        }
        return bVar.mo59474f();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent$1 */
    static /* synthetic */ class C333991 {

        /* renamed from: a */
        static final /* synthetic */ int[] f79363a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 40256(0x9d40, float:5.641E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent.C333991.f79363a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent.C333991.f79363a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent.C333991.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo59472a(long j) {
        Analysis a = m68496a();
        if (a == null || TextUtils.isEmpty(a.getLabelName())) {
            return null;
        }
        C84425b a2 = new C84425b().mo129406a("enter_from", a.getLabelName()).mo129404a("duration", j);
        if (a.getExtraMap() != null && !a.getExtraMap().isEmpty()) {
            a2.mo129408a(a.getExtraMap());
        }
        C39162r.m79460a("stay_time", a2.f188764a);
        return null;
    }

    public AnalysisActivityComponent(Context context, AbstractC33401b bVar) {
        this.f79360a = context;
        this.f79362c = new WeakReference<>(bVar);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        int i = C333991.f79363a[aVar.ordinal()];
        if (i == 1) {
            this.f79361b = System.currentTimeMillis();
        } else if (i == 2 && this.f79361b != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f79361b;
            if (m68496a() != null && currentTimeMillis > m68496a().getMinValidStayDuration()) {
                C1731i.m5640b(new CallableC33400a(this, currentTimeMillis), C39162r.m79452a());
            }
            this.f79361b = -1;
        }
    }
}

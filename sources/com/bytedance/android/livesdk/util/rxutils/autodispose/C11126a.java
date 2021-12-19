package com.bytedance.android.livesdk.util.rxutils.autodispose;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11139a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11142d;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.C11143e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a */
public final class C11126a implements AbstractC11142d<AbstractC1196i.EnumC1198a> {

    /* renamed from: a */
    private static final AbstractC11139a<AbstractC1196i.EnumC1198a> f26745a = C11138b.f26757a;

    /* renamed from: b */
    private final AbstractC11139a<AbstractC1196i.EnumC1198a> f26746b;

    /* renamed from: c */
    private final LifecycleEventsObservable f26747c;

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11142d
    /* renamed from: a */
    public final AbstractC88979t<AbstractC1196i.EnumC1198a> mo17926a() {
        return this.f26747c;
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11142d
    /* renamed from: b */
    public final AbstractC11139a<AbstractC1196i.EnumC1198a> mo17927b() {
        return this.f26746b;
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11136ab
    /* renamed from: c */
    public final AbstractC88917f mo17928c() {
        return C11143e.m19782a(this);
    }

    static {
        Covode.recordClassIndex(12753);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11142d
    /* renamed from: d */
    public final /* synthetic */ AbstractC1196i.EnumC1198a mo17929d() {
        AbstractC1196i.EnumC1198a aVar;
        LifecycleEventsObservable lifecycleEventsObservable = this.f26747c;
        int i = LifecycleEventsObservable.C111251.f26741a[lifecycleEventsObservable.f26739a.mo4011a().ordinal()];
        if (i == 1) {
            aVar = AbstractC1196i.EnumC1198a.ON_CREATE;
        } else if (i == 2) {
            aVar = AbstractC1196i.EnumC1198a.ON_START;
        } else if (i == 3 || i == 4) {
            aVar = AbstractC1196i.EnumC1198a.ON_RESUME;
        } else {
            aVar = AbstractC1196i.EnumC1198a.ON_DESTROY;
        }
        lifecycleEventsObservable.f26740b.onNext(aVar);
        return this.f26747c.f26740b.mo143221i();
    }

    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a$1 */
    static /* synthetic */ class C111271 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26748a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 12754(0x31d2, float:1.7872E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a.C111271.f26748a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a.C111271.f26748a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a.C111271.f26748a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a.C111271.f26748a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a.C111271.f26748a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a.C111271.f26748a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.AbstractC1196i.EnumC1198a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a.C111271.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a$a */
    public static class C11128a implements AbstractC11139a<AbstractC1196i.EnumC1198a> {

        /* renamed from: a */
        private final AbstractC1196i.EnumC1198a f26749a;

        static {
            Covode.recordClassIndex(12755);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.p649b.AbstractC11139a, p4560f.p4561a.p4567d.AbstractC88434g
        public final /* bridge */ /* synthetic */ AbstractC1196i.EnumC1198a apply(AbstractC1196i.EnumC1198a aVar) {
            return this.f26749a;
        }

        C11128a(AbstractC1196i.EnumC1198a aVar) {
            this.f26749a = aVar;
        }
    }

    /* renamed from: a */
    private static C11126a m19762a(AbstractC1196i iVar, AbstractC11139a<AbstractC1196i.EnumC1198a> aVar) {
        return new C11126a(iVar, aVar);
    }

    private C11126a(AbstractC1196i iVar, AbstractC11139a<AbstractC1196i.EnumC1198a> aVar) {
        this.f26747c = new LifecycleEventsObservable(iVar);
        this.f26746b = aVar;
    }

    /* renamed from: a */
    private static C11126a m19761a(AbstractC1196i iVar, AbstractC1196i.EnumC1198a aVar) {
        return m19762a(iVar, new C11128a(aVar));
    }

    /* renamed from: a */
    public static C11126a m19763a(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        return m19761a(mVar.getLifecycle(), aVar);
    }
}

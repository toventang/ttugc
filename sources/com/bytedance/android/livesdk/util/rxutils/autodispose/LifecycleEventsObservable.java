package com.bytedance.android.livesdk.util.rxutils.autodispose;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p647a.C11129a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p647a.p648a.C11130a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.AbstractC88389a;
import p4560f.p4561a.p4591l.C88958b;

/* access modifiers changed from: package-private */
public final class LifecycleEventsObservable extends AbstractC88979t<AbstractC1196i.EnumC1198a> {

    /* renamed from: a */
    final AbstractC1196i f26739a;

    /* renamed from: b */
    final C88958b<AbstractC1196i.EnumC1198a> f26740b = new C88958b<>();

    static {
        Covode.recordClassIndex(12750);
    }

    static final class ArchLifecycleObserver extends AbstractC88389a implements AbstractC1203l {

        /* renamed from: a */
        private final AbstractC1196i f26742a;

        /* renamed from: b */
        private final AbstractC88986z<? super AbstractC1196i.EnumC1198a> f26743b;

        /* renamed from: c */
        private final C88958b<AbstractC1196i.EnumC1198a> f26744c;

        static {
            Covode.recordClassIndex(12752);
        }

        @Override // p4560f.p4561a.p4562a.AbstractC88389a
        /* renamed from: a */
        public final void mo17923a() {
            this.f26742a.mo4013b(this);
        }

        /* access modifiers changed from: package-private */
        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_ANY)
        public final void onStateChange(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (!isDisposed()) {
                if (!(aVar == AbstractC1196i.EnumC1198a.ON_CREATE && this.f26744c.mo143221i() == aVar)) {
                    this.f26744c.onNext(aVar);
                }
                this.f26743b.onNext(aVar);
            }
        }

        ArchLifecycleObserver(AbstractC1196i iVar, AbstractC88986z<? super AbstractC1196i.EnumC1198a> zVar, C88958b<AbstractC1196i.EnumC1198a> bVar) {
            this.f26742a = iVar;
            this.f26743b = zVar;
            this.f26744c = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable$1 */
    static /* synthetic */ class C111251 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26741a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 12751(0x31cf, float:1.7868E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.C111251.f26741a = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.C111251.f26741a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.C111251.f26741a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.STARTED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.C111251.f26741a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.C111251.f26741a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.AbstractC1196i.EnumC1199b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.C111251.<clinit>():void");
        }
    }

    LifecycleEventsObservable(AbstractC1196i iVar) {
        this.f26739a = iVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super AbstractC1196i.EnumC1198a> zVar) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f26739a, zVar, this.f26740b);
        zVar.onSubscribe(archLifecycleObserver);
        if (!C11129a.m19768a(C11130a.f26751a)) {
            zVar.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f26739a.mo4012a(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.f26739a.mo4013b(archLifecycleObserver);
        }
    }
}

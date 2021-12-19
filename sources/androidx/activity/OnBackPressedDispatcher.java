package androidx.activity;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayDeque;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    final Runnable f497a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0194c> f498b;

    static {
        Covode.recordClassIndex(217);
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    class C0190a implements AbstractC0191a {

        /* renamed from: b */
        private final AbstractC0194c f504b;

        static {
            Covode.recordClassIndex(219);
        }

        @Override // androidx.activity.AbstractC0191a
        /* renamed from: a */
        public final void mo367a() {
            OnBackPressedDispatcher.this.f498b.remove(this.f504b);
            this.f504b.mo376a(this);
        }

        C0190a(AbstractC0194c cVar) {
            this.f504b = cVar;
        }
    }

    class LifecycleOnBackPressedCancellable implements AbstractC0191a, AbstractC1202k {

        /* renamed from: a */
        final /* synthetic */ OnBackPressedDispatcher f499a;

        /* renamed from: b */
        private final AbstractC1196i f500b;

        /* renamed from: c */
        private final AbstractC0194c f501c;

        /* renamed from: d */
        private AbstractC0191a f502d;

        static {
            Covode.recordClassIndex(218);
        }

        @Override // androidx.activity.AbstractC0191a
        /* renamed from: a */
        public final void mo367a() {
            this.f500b.mo4013b(this);
            this.f501c.mo376a(this);
            AbstractC0191a aVar = this.f502d;
            if (aVar != null) {
                aVar.mo367a();
                this.f502d = null;
            }
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = this.f499a;
                AbstractC0194c cVar = this.f501c;
                onBackPressedDispatcher.f498b.add(cVar);
                C0190a aVar2 = new C0190a(cVar);
                cVar.f513b.add(aVar2);
                this.f502d = aVar2;
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                AbstractC0191a aVar3 = this.f502d;
                if (aVar3 != null) {
                    aVar3.mo367a();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
                mo367a();
            }
        }
    }
}

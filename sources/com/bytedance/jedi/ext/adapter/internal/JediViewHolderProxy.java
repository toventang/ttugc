package com.bytedance.jedi.ext.adapter.internal;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1194h;
import androidx.lifecycle.C1205n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20366ad;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.AbstractC20640c;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Collection;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

public final class JediViewHolderProxy implements AbstractC20366ad, AbstractC20640c, AbstractC33974au {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f48839a = {new C89232y(C89204ab.m154669a(JediViewHolderProxy.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;")};

    /* renamed from: b */
    public JediViewHolder<? extends AbstractC20467g, ?> f48840b;

    /* renamed from: c */
    public boolean f48841c;

    /* renamed from: d */
    public C20662d f48842d;

    /* renamed from: e */
    public boolean f48843e;

    /* renamed from: f */
    private boolean f48844f = true;

    /* renamed from: g */
    private final AbstractC89244h<C1194h> f48845g = C89250i.m154773a((AbstractC89171a) C20656b.f48849a);

    /* renamed from: h */
    private boolean f48846h;

    /* renamed from: i */
    private final AbstractC89244h f48847i = C89250i.m154773a((AbstractC89171a) new C20655a(this));

    /* renamed from: d */
    private final C1205n m38894d() {
        return (C1205n) this.f48847i.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20366ad
    /* renamed from: a */
    public final boolean mo33697a() {
        return this.f48844f;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy$a */
    static final class C20655a extends AbstractC89220m implements AbstractC89171a<C1205n> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolderProxy f48848a;

        static {
            Covode.recordClassIndex(24190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20655a(JediViewHolderProxy jediViewHolderProxy) {
            super(0);
            this.f48848a = jediViewHolderProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1205n invoke() {
            return new C1205n(this.f48848a);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy$b */
    static final class C20656b extends AbstractC89220m implements AbstractC89171a<C1194h> {

        /* renamed from: a */
        public static final C20656b f48849a = new C20656b();

        static {
            Covode.recordClassIndex(24191);
        }

        C20656b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1194h invoke() {
            return new C1194h();
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return m38894d();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public JediViewHolder<? extends AbstractC20467g, ?> getReceiver() {
        if (this.f48841c) {
            return null;
        }
        return this.f48840b;
    }

    @Override // com.bytedance.jedi.ext.adapter.AbstractC20640c
    /* renamed from: b */
    public final C1194h mo33900b() {
        return this.f48845g.getValue();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        this.f48843e = false;
        m38894d().mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        if (getReceiver() != null) {
            mo33903a(true);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        if (getReceiver() != null) {
            mo33904b(true);
        }
    }

    static {
        Covode.recordClassIndex(24189);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        m38894d().mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        if (this.f48845g.isInitialized()) {
            C1194h b = mo33900b();
            Collection<AbstractC1174ac> values = b.mo4010a().values();
            C89219l.m154709a((Object) values, "");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                it.next().onCleared();
            }
            b.mo4010a().clear();
        }
        this.f48843e = true;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Proxy@").append(Integer.toHexString(hashCode())).append('(').append("holder@");
        JediViewHolder<? extends AbstractC20467g, ?> jediViewHolder = this.f48840b;
        if (jediViewHolder != null) {
            str = Integer.toHexString(jediViewHolder.hashCode());
        } else {
            str = null;
        }
        return append.append(str).append(",detached:").append(this.f48841c).append(",state:").append(getLifecycle().mo4011a()).append(')').toString();
    }

    /* renamed from: b */
    public final void mo33904b(boolean z) {
        this.f48844f = z;
        m38894d().mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }

    /* renamed from: a */
    public final void mo33903a(boolean z) {
        this.f48844f = z;
        if (!z) {
            this.f48846h = true;
        }
        if (this.f48846h) {
            m38894d().mo4016a(AbstractC1196i.EnumC1198a.ON_START);
        }
    }

    /* renamed from: a */
    public final void mo33902a(C20662d dVar, JediViewHolder<? extends AbstractC20467g, ?> jediViewHolder) {
        C89219l.m154719c(dVar, "");
        if (jediViewHolder != null) {
            this.f48840b = jediViewHolder;
            jediViewHolder.f48646d = this;
            this.f48841c = false;
            dVar.mo33918a(this);
            return;
        }
        this.f48840b = null;
    }
}

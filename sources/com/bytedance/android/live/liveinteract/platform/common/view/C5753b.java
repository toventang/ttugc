package com.bytedance.android.live.liveinteract.platform.common.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17853m;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.b */
public final class C5753b<V extends View> {

    /* renamed from: a */
    DataChannel f14597a;

    /* renamed from: b */
    public V f14598b;

    /* renamed from: c */
    Map<Class<? extends C17853m>, AbstractC5756b> f14599c;

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.b$b */
    public interface AbstractC5756b<V extends View, T> {
        static {
            Covode.recordClassIndex(6355);
        }

        /* renamed from: a */
        void mo10550a(V v, T t);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.b$c */
    public interface AbstractC5757c<V extends View> {
        static {
            Covode.recordClassIndex(6356);
        }

        /* renamed from: a */
        void mo10557a(V v);
    }

    static {
        Covode.recordClassIndex(6352);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.b$a */
    public static final class C5754a<V extends View> {

        /* renamed from: a */
        public C5754a<V> f14600a;

        /* renamed from: b */
        public AbstractC5757c<V> f14601b;

        /* renamed from: c */
        public C5755a f14602c;

        /* renamed from: d */
        private C5752a f14603d;

        /* renamed from: e */
        private DataChannel f14604e;

        /* renamed from: f */
        private V f14605f;

        static {
            Covode.recordClassIndex(6353);
        }

        /* renamed from: b */
        private C5754a<V> m12626b() {
            C5754a<V> aVar = new C5754a<>(this.f14604e, this.f14605f, this.f14603d);
            aVar.f14600a = this;
            aVar.f14601b = this.f14601b;
            return aVar;
        }

        /* renamed from: a */
        public final C5753b<V> mo11505a() {
            C5753b<V> bVar = new C5753b<>(this.f14604e, this.f14605f, this.f14600a, (byte) 0);
            this.f14603d.mo11502a(bVar);
            return bVar;
        }

        /* renamed from: a */
        public final <T> C5754a<V> mo11504a(Class<? extends C17853m> cls, AbstractC5756b<V, T> bVar) {
            this.f14602c = new C5755a(cls, bVar, false, (byte) 0);
            return m12626b();
        }

        /* renamed from: b */
        public final <T> C5754a<V> mo11506b(Class<? extends C17853m> cls, AbstractC5756b<V, T> bVar) {
            this.f14602c = new C5755a(cls, bVar, true, (byte) 0);
            return m12626b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.view.b$a$a */
        public static final class C5755a<V extends View, T> {

            /* renamed from: a */
            public Class<? extends C17853m> f14606a;

            /* renamed from: b */
            public AbstractC5756b<V, T> f14607b;

            /* renamed from: c */
            public boolean f14608c;

            /* renamed from: d */
            private boolean f14609d;

            static {
                Covode.recordClassIndex(6354);
            }

            private C5755a(Class<? extends C17853m> cls, AbstractC5756b<V, T> bVar, boolean z) {
                this.f14606a = cls;
                this.f14607b = bVar;
                this.f14608c = z;
                this.f14609d = false;
            }

            /* synthetic */ C5755a(Class cls, AbstractC5756b bVar, boolean z, byte b) {
                this(cls, bVar, z);
            }
        }

        C5754a(DataChannel dataChannel, V v, C5752a aVar) {
            this.f14604e = dataChannel;
            this.f14605f = v;
            this.f14603d = aVar;
        }
    }

    /* renamed from: a */
    public final void mo11503a(Class<? extends C17853m> cls, Object obj) {
        if (cls != null && obj != null && this.f14599c.keySet().contains(cls)) {
            this.f14599c.get(cls).mo10550a(this.f14598b, obj);
        }
    }

    private C5753b(DataChannel dataChannel, V v, C5754a<V> aVar) {
        this.f14599c = new HashMap();
        this.f14597a = dataChannel;
        this.f14598b = v;
        if (aVar.f14601b != null) {
            aVar.f14601b.mo10557a(this.f14598b);
        }
        do {
            C5754a.C5755a aVar2 = aVar.f14602c;
            this.f14599c.put(aVar2.f14606a, aVar2.f14607b);
            if (aVar2.f14608c) {
                this.f14597a.mo28312a(this, aVar2.f14606a, new C5758c(this, aVar2));
            } else {
                this.f14597a.mo28310a((Class) aVar2.f14606a, (AbstractC89172b) new C5759d(this, aVar2));
            }
            aVar = aVar.f14600a;
        } while (aVar != null);
    }

    /* synthetic */ C5753b(DataChannel dataChannel, View view, C5754a aVar, byte b) {
        this(dataChannel, view, aVar);
    }
}

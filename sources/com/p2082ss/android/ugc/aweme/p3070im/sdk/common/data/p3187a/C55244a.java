package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a */
public final class C55244a<T> extends C1210r<T> {

    /* renamed from: b */
    public static final C55246a f126337b = new C55246a((byte) 0);

    /* renamed from: a */
    public final C1213t<T> f126338a;

    /* renamed from: c */
    private final AbstractC89244h f126339c = C89250i.m154773a((AbstractC89171a) C55247b.f126341a);

    static {
        Covode.recordClassIndex(64991);
    }

    /* renamed from: a */
    public final Handler mo92220a() {
        return (Handler) this.f126339c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a$a */
    public static final class C55246a {
        static {
            Covode.recordClassIndex(64993);
        }

        private C55246a() {
        }

        public /* synthetic */ C55246a(byte b) {
            this();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final T getValue() {
        return this.f126338a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a$b */
    static final class C55247b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C55247b f126341a = new C55247b();

        static {
            Covode.recordClassIndex(64994);
        }

        C55247b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a$c */
    public static final class RunnableC55248c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C55244a f126342a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f126343b;

        static {
            Covode.recordClassIndex(64995);
        }

        public RunnableC55248c(C55244a aVar, AbstractC89171a aVar2) {
            this.f126342a = aVar;
            this.f126343b = aVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.t<T> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void run() {
            this.f126342a.f126338a.setValue(this.f126343b.invoke());
        }
    }

    /* renamed from: a */
    public final void mo92221a(T t) {
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void postValue(T t) {
        super.postValue(t);
        this.f126338a.postValue(t);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
    public final void setValue(T t) {
        super.setValue(t);
        this.f126338a.setValue(t);
    }

    public C55244a(C1213t<T> tVar) {
        C89219l.m154721d(tVar, "");
        this.f126338a = tVar;
        mo4026a(tVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.C55244a.C552451 */

            /* renamed from: a */
            final /* synthetic */ C55244a f126340a;

            static {
                Covode.recordClassIndex(64992);
            }

            {
                this.f126340a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final void onChanged(T t) {
                this.f126340a.mo92221a(t);
            }
        });
    }
}

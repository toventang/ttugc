package com.bytedance.android.live.liveinteract.cohost.p263a.p264a;

import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4480f;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4588x;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11164m;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11126a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.d */
public final class C4469d {

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.d$b */
    public static abstract class AbstractC4471b<T extends AbstractC4470a> extends C10935a {

        /* renamed from: a */
        public AbstractC4474e f12055a;

        /* renamed from: b */
        public T f12056b;

        /* renamed from: c */
        protected final C4384b f12057c = C4384b.C4385a.m10496a();

        static {
            Covode.recordClassIndex(5047);
        }

        /* renamed from: d */
        public abstract C4480f.C4481a mo10252d();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.d$c */
    public static abstract class AbstractC4472c {

        /* renamed from: c */
        public DataChannel f12058c;

        static {
            Covode.recordClassIndex(5048);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.d$d */
    public interface AbstractC4473d {
        static {
            Covode.recordClassIndex(5049);
        }

        /* renamed from: d */
        C4588x.EnumC4589a mo10253d();

        void dismiss();

        boolean isVisible();

        void show(AbstractC0952i iVar, String str);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.d$e */
    public interface AbstractC4474e {
        static {
            Covode.recordClassIndex(5050);
        }

        /* renamed from: a */
        void mo10257a(C4480f.C4481a aVar);

        /* renamed from: a */
        void mo10258a(C4588x.EnumC4589a aVar, AbstractC4472c cVar);

        void dismiss();

        /* renamed from: e */
        AbstractC1204m mo10260e();
    }

    static {
        Covode.recordClassIndex(5045);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.a.d$a */
    public static abstract class AbstractC4470a<V extends AbstractC4471b> {

        /* renamed from: g */
        final String f12052g = getClass().getSimpleName();

        /* renamed from: h */
        public V f12053h;

        /* renamed from: i */
        protected final C4384b f12054i = C4384b.C4385a.m10496a();

        static {
            Covode.recordClassIndex(5046);
        }

        /* renamed from: g */
        public void mo10251g() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final <R> AbstractC11164m<R> mo10250f() {
            return C11152e.m19792a(C11126a.m19763a(this.f12053h.f12055a.mo10260e(), AbstractC1196i.EnumC1198a.ON_DESTROY), new C11191f());
        }

        /* renamed from: a */
        public final void mo10249a(Throwable th) {
            C3854a.m9455a(6, this.f12052g, th.getStackTrace());
        }

        public AbstractC4470a(V v) {
            this.f12053h = v;
        }
    }
}

package com.bytedance.ies.bullet.p1184ui.common.p1187c;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.p1131b.C16153b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.C17022c;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17018b;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.c.c */
public abstract class AbstractC17026c<T extends View> extends AbstractC16222r implements AbstractC17024b<T> {

    /* renamed from: H */
    public final List<C17029d<T>> f40544H = new ArrayList();

    /* renamed from: I */
    public AtomicBoolean f40545I = new AtomicBoolean(false);

    /* renamed from: J */
    public AtomicBoolean f40546J = new AtomicBoolean(false);

    /* renamed from: K */
    public final AbstractC16654o f40547K = ((AbstractC16654o) mo25790b_(AbstractC16654o.class));

    static {
        Covode.recordClassIndex(19475);
    }

    /* renamed from: a */
    public abstract void mo26053a(Activity activity);

    /* renamed from: a */
    public abstract void mo26058a(AbstractC89172b<? super List<C17029d<T>>, C89391z> bVar);

    /* renamed from: b */
    public abstract void mo26059b(Activity activity);

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: q */
    public void mo25803q() {
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17024b
    /* renamed from: u */
    public String mo26062u() {
        return "DebugView";
    }

    /* renamed from: t */
    private final AbstractC17018b mo26061t() {
        return (AbstractC17018b) this.f38994i.mo25832c(AbstractC17018b.class);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: r */
    public void mo25804r() {
        AbstractC17045g z = mo26902z();
        if (z != null) {
            z.mo26824a(new C17028b(this));
        }
    }

    /* renamed from: z */
    public final AbstractC17045g mo26902z() {
        return (AbstractC17045g) this.f38994i.mo25832c(AbstractC17045g.class);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: j */
    public final void mo25775j() {
        AbstractC17018b t = mo26061t();
        if (t == null || !t.mo26883p()) {
            AbstractC16576j.C16578b.m30778a(this, "onShow success", null, null, 6);
            mo26053a((Activity) null);
            return;
        }
        AbstractC16576j.C16578b.m30778a(this, "onShow is intercepted", null, null, 6);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: k */
    public final void mo25776k() {
        AbstractC17018b t = mo26061t();
        if (t == null || !t.mo26884q()) {
            AbstractC16576j.C16578b.m30778a(this, "onHide success", null, null, 6);
            mo26059b((Activity) null);
            return;
        }
        AbstractC16576j.C16578b.m30778a(this, "onHide is intercepted", null, null, 6);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17023a
    /* renamed from: q_ */
    public final C17029d<T> mo26900q_() {
        if (!this.f40544H.isEmpty()) {
            return this.f40544H.get(0);
        }
        return null;
    }

    /* renamed from: y */
    public final void mo26901y() {
        this.f40546J.getAndSet(true);
        if (this.f40545I.compareAndSet(true, true)) {
            mo25775j();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.c.c$b */
    public static final class C17028b extends C17022c {

        /* renamed from: a */
        final /* synthetic */ AbstractC17026c f40550a;

        static {
            Covode.recordClassIndex(19477);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C17028b(AbstractC17026c cVar) {
            this.f40550a = cVar;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
        /* renamed from: b */
        public final void mo26222b(Activity activity) {
            C89219l.m154719c(activity, "");
            this.f40550a.f40545I.getAndSet(true);
            if (this.f40550a.f40546J.compareAndSet(true, true)) {
                this.f40550a.mo25775j();
            }
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
        /* renamed from: c */
        public final void mo26223c(Activity activity) {
            C89219l.m154719c(activity, "");
            this.f40550a.f40545I.getAndSet(false);
            if (this.f40550a.f40546J.compareAndSet(true, true)) {
                this.f40550a.mo25776k();
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.c.c$a */
    public static final class C17027a extends AbstractC89220m implements AbstractC89172b<List<? extends C17029d<T>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC17026c f40548a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f40549b;

        static {
            Covode.recordClassIndex(19476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17027a(AbstractC17026c cVar, AbstractC89172b bVar) {
            super(1);
            this.f40548a = cVar;
            this.f40549b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            List list = (List) obj;
            C89219l.m154719c(list, "");
            List<C17029d<T>> list2 = this.f40548a.f40544H;
            list2.clear();
            list2.addAll(list);
            this.f40549b.invoke(list);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25766a(Throwable th) {
        super.mo25766a(th);
        this.f40544H.clear();
    }

    /* renamed from: a */
    public void mo26218a(C17029d<T> dVar, Uri uri) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(uri, "");
        m30144a(dVar.f40551a);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25765a(String str, List<String> list, List<? extends JSONObject> list2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        this.f38992g.clear();
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            this.f38992g.add(new C16153b(str, list.get(i), (JSONObject) list2.get(i), getLoggerWrapper()));
            i = i2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC17026c(AbstractC16203d<?, ?, ?, ?> dVar, C16238z zVar, List<String> list, AbstractC16253f fVar, C16248b bVar) {
        super(dVar, zVar, list, fVar, bVar);
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(bVar, "");
    }
}

package com.bytedance.ies.bullet.p1141e;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.AbstractC16245e;
import com.bytedance.ies.bullet.p1129c.C16156c;
import com.bytedance.ies.bullet.p1141e.C16279c;
import com.bytedance.ies.bullet.p1141e.p1143b.C16276b;
import com.bytedance.ies.bullet.p1141e.p1143b.C16278c;
import com.bytedance.ies.bullet.p1141e.p1144c.C16285a;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.EnumC17055m;
import com.bytedance.ies.bullet.service.base.AbstractC16657r;
import com.bytedance.ies.bullet.service.base.AbstractC16668s;
import com.bytedance.ies.bullet.service.base.AbstractC16697x;
import com.bytedance.ies.bullet.service.base.C16615b;
import com.bytedance.ies.bullet.service.base.C16645f;
import com.bytedance.ies.bullet.service.base.EnumC16605al;
import com.bytedance.ies.bullet.service.base.EnumC16626c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.e.d */
public final class C16288d extends C16616a implements AbstractC16668s {

    /* renamed from: a */
    private final ConcurrentHashMap<AbstractC16239d.AbstractC16241b, C16279c> f39117a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final AbstractC16657r f39118b;

    static {
        Covode.recordClassIndex(18581);
    }

    /* renamed from: e */
    private final AbstractC16239d.AbstractC16241b m30277e() {
        AbstractC16245e a = C16156c.m29997a(this.f39774d);
        if (a != null) {
            return a.mo25652a();
        }
        return null;
    }

    /* renamed from: d */
    private final C16279c m30276d() {
        AbstractC16239d.AbstractC16241b e = m30277e();
        if (e == null) {
            return null;
        }
        return this.f39117a.get(e);
    }

    /* renamed from: b */
    private final void m30275b() {
        AbstractC16239d.AbstractC16241b e = m30277e();
        if (e != null && this.f39117a.get(e) == null) {
            AbstractC16576j.C16578b.m30778a(this, "create pool kit on bid: " + this.f39774d, null, null, 6);
            this.f39117a.put(e, new C16279c(this.f39118b, this.f39774d));
        }
    }

    public C16288d(AbstractC16657r rVar) {
        C89219l.m154719c(rVar, "");
        this.f39118b = rVar;
        m30275b();
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16668s
    /* renamed from: a */
    public final EnumC16605al mo25873a(Uri uri, View view) {
        BulletContainerView bulletContainerView;
        EnumC16605al alVar;
        C89219l.m154719c(uri, "");
        C89219l.m154719c(view, "");
        AbstractC16576j.C16578b.m30778a(this, "start to reUse on schema: ".concat(String.valueOf(uri)), null, null, 6);
        C16279c d = m30276d();
        if (!(view instanceof BulletContainerView) || view == null) {
            bulletContainerView = null;
        } else {
            bulletContainerView = (BulletContainerView) view;
        }
        if (d == null || bulletContainerView == null) {
            return EnumC16605al.FAIL_INVALID;
        }
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bulletContainerView, "");
        C16615b bVar = new C16615b(uri, d.mo25869a(uri), bulletContainerView, EnumC16626c.REUSE);
        C89219l.m154719c(bVar, "");
        C16278c cVar = d.f39099b;
        C89219l.m154719c(bVar, "");
        if (cVar.f39095a.mo25865a(bVar.f39769b)) {
            alVar = EnumC16605al.FAIL_EXISTS;
        } else {
            BulletContainerView a = C16285a.m30273a(bVar.f39770c);
            if (a == null || a.f40465k.get() == EnumC17055m.SUCCESS.ordinal()) {
                cVar.f39095a.mo25866a(bVar.f39769b, bVar);
                alVar = EnumC16605al.SUCCESS;
            } else {
                alVar = EnumC16605al.FAIL_LOAD_ERROR;
            }
        }
        AbstractC16576j.C16578b.m30778a(d, "reUse result: " + alVar + " on originSchema: " + bVar.f39768a + ", uniqueSchema: " + bVar.f39769b + ')', null, null, 6);
        if (alVar == EnumC16605al.SUCCESS) {
            d.f39100c.mo25861a(C16285a.m30272a(bVar));
        }
        return alVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16668s
    /* renamed from: a */
    public final C16615b mo25874a(Uri uri, boolean z, boolean z2, View view) {
        C16615b bVar;
        boolean z3;
        BulletContainerView a;
        BulletContainerView a2;
        MutableContextWrapper mutableContextWrapper;
        boolean z4;
        C89219l.m154719c(uri, "");
        C89219l.m154719c(view, "");
        AbstractC16576j.C16578b.m30778a(this, "start to fetch on schema: " + uri + ", openPreRender: " + z + ", openReUse: " + z2, null, null, 6);
        C16279c d = m30276d();
        if (!(d == null || uri == null)) {
            Uri a3 = d.mo25869a(uri);
            if (z) {
                C16276b bVar2 = d.f39098a;
                C89219l.m154719c(a3, "");
                bVar = (C16615b) bVar2.f39090a.mo25856a((Object) a3);
                StringBuilder sb = new StringBuilder("fetchPreRendered success: ");
                if (bVar != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC16576j.C16578b.m30778a(d, sb.append(z4).append(" with uniqueSchema:").append(a3).toString(), null, null, 6);
                if (bVar != null) {
                    d.f39100c.mo25863b(C16285a.m30272a(bVar));
                    View view2 = bVar.f39770c;
                    C89219l.m154719c(view, "");
                    a = C16285a.m30273a(view2);
                    a2 = C16285a.m30273a(view);
                    if (!(a == null || a2 == null)) {
                        a.getProviderFactory().mo25831b(Context.class, view.getContext());
                        Context context = view.getContext();
                        C89219l.m154709a((Object) context, "");
                        C89219l.m154719c(a, "");
                        C89219l.m154719c(context, "");
                        Context context2 = a.getContext();
                        if (!(context2 == null || !(context2 instanceof MutableContextWrapper) || (mutableContextWrapper = (MutableContextWrapper) context2) == null)) {
                            mutableContextWrapper.setBaseContext(context);
                        }
                        a2.mo25721a();
                        C89219l.m154719c(a, "");
                        C16285a.m30274a(a, new C16285a.C16286a(a));
                        C16285a.m30274a(a2, new C16285a.C16287b(a2, a));
                        AbstractC16576j.C16578b.m30778a(this, "fetch pool cache item success on item: ".concat(String.valueOf(bVar)), null, null, 6);
                        return bVar;
                    }
                }
            }
            if (z2) {
                C16278c cVar = d.f39099b;
                C89219l.m154719c(a3, "");
                bVar = (C16615b) cVar.f39095a.mo25856a((Object) a3);
                StringBuilder sb2 = new StringBuilder("fetchReUsed success: ");
                if (bVar != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC16576j.C16578b.m30778a(d, sb2.append(z3).append(" uniqueSchema:").append(a3).toString(), null, null, 6);
                if (bVar != null) {
                    d.f39100c.mo25863b(C16285a.m30272a(bVar));
                    View view22 = bVar.f39770c;
                    C89219l.m154719c(view, "");
                    a = C16285a.m30273a(view22);
                    a2 = C16285a.m30273a(view);
                    a.getProviderFactory().mo25831b(Context.class, view.getContext());
                    Context context3 = view.getContext();
                    C89219l.m154709a((Object) context3, "");
                    C89219l.m154719c(a, "");
                    C89219l.m154719c(context3, "");
                    Context context22 = a.getContext();
                    mutableContextWrapper.setBaseContext(context3);
                    a2.mo25721a();
                    C89219l.m154719c(a, "");
                    C16285a.m30274a(a, new C16285a.C16286a(a));
                    C16285a.m30274a(a2, new C16285a.C16287b(a2, a));
                    AbstractC16576j.C16578b.m30778a(this, "fetch pool cache item success on item: ".concat(String.valueOf(bVar)), null, null, 6);
                    return bVar;
                }
            }
            d.f39100c.mo25863b(new C16645f(uri, a3, EnumC16626c.NONE));
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16668s
    /* renamed from: a */
    public final void mo25875a(Uri uri, Context context, long j, AbstractC16697x xVar) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(context, "");
        C89219l.m154719c(xVar, "");
        AbstractC16576j.C16578b.m30778a(this, "start to preRender on schema: " + uri + ", duration: " + j, null, null, 6);
        m30275b();
        C16279c d = m30276d();
        AbstractC16239d.AbstractC16241b e = m30277e();
        if (d != null && e != null) {
            C16266a aVar = new C16266a(context, e);
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(aVar, "");
            if (uri != null) {
                Uri a = d.mo25869a(uri);
                C16276b bVar = d.f39098a;
                C16279c.C16283d dVar = new C16279c.C16283d(d, uri, a, xVar, j);
                C89219l.m154719c(uri, "");
                C89219l.m154719c(a, "");
                C89219l.m154719c(dVar, "");
                C89219l.m154719c(aVar, "");
                if (bVar.f39090a.mo25865a(a)) {
                    dVar.mo25871a(EnumC16605al.FAIL_EXISTS, null);
                    return;
                }
                try {
                    aVar.invoke(uri, a, new C16276b.C16277a(bVar, dVar, a));
                } catch (Exception e2) {
                    dVar.mo25871a(EnumC16605al.FAIL_EXCEPTION, e2.getMessage());
                }
            } else {
                xVar.mo25871a(EnumC16605al.FAIL_INVALID, null);
            }
        }
    }
}

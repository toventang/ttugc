package com.bytedance.ies.bullet.p1184ui.common;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.bytedance.ies.bullet.p1129c.C16257i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1135d.AbstractC16244c;
import com.bytedance.ies.bullet.p1129c.p1135d.C16242a;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.p1163a.C16583n;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.ui.common.e */
public final class C17041e implements AbstractC17049i {

    /* renamed from: a */
    final C16248b f40582a;

    /* renamed from: b */
    private final AbstractC16244c f40583b = new C16242a();

    /* renamed from: c */
    private volatile String f40584c = "";

    static {
        Covode.recordClassIndex(19490);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17049i
    /* renamed from: b */
    public final C16248b mo26916b() {
        return this.f40582a;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        this.f40583b.mo25721a();
        this.f40582a.mo25826a(Context.class);
        C16622e.C16623a.m30858a().mo26342c(this.f40584c);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final <T extends AbstractC16203d<?, ?, ?, ?>> AbstractC16208i mo25682a(Class<? extends T> cls) {
        C89219l.m154719c(cls, "");
        return this.f40583b.mo25682a(cls);
    }

    public C17041e(Context context) {
        C89219l.m154719c(context, "");
        C16248b bVar = new C16248b();
        bVar.mo25831b(Context.class, context);
        this.f40582a = bVar;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16212k
    /* renamed from: a */
    public final AbstractC16208i mo25683a(String str) {
        C89219l.m154719c(str, "");
        return this.f40583b.mo25683a(str);
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.e$a */
    static final class C17042a extends AbstractC89220m implements AbstractC89187q<AbstractC16208i, Uri, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C17041e f40585a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f40586b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f40587c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89187q f40588d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f40589e;

        static {
            Covode.recordClassIndex(19491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17042a(C17041e eVar, AbstractC89172b bVar, AbstractC89172b bVar2, AbstractC89187q qVar, AbstractC89172b bVar3) {
            super(3);
            this.f40585a = eVar;
            this.f40586b = bVar;
            this.f40587c = bVar2;
            this.f40588d = qVar;
            this.f40589e = bVar3;
        }

        /* renamed from: com.bytedance.ies.bullet.ui.common.e$a$a */
        static final class C17043a extends AbstractC89220m implements AbstractC89172b<List<? extends C17029d<View>>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC17026c f40590a;

            /* renamed from: b */
            final /* synthetic */ C17042a f40591b;

            /* renamed from: c */
            final /* synthetic */ boolean f40592c;

            /* renamed from: d */
            final /* synthetic */ Uri f40593d;

            static {
                Covode.recordClassIndex(19492);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17043a(AbstractC17026c cVar, C17042a aVar, boolean z, Uri uri) {
                super(1);
                this.f40590a = cVar;
                this.f40591b = aVar;
                this.f40592c = z;
                this.f40593d = uri;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends C17029d<View>> list) {
                List<? extends C17029d<View>> list2 = list;
                C89219l.m154719c(list2, "");
                if (!list2.isEmpty()) {
                    boolean z = false;
                    for (T t : list2) {
                        if (!z) {
                            this.f40590a.mo26218a(t, this.f40593d);
                            z = true;
                        }
                        this.f40590a.mo26054a((C17029d) t);
                        this.f40591b.f40587c.invoke(t);
                    }
                    this.f40591b.f40588d.invoke(this.f40590a, list2, Boolean.valueOf(this.f40592c));
                } else {
                    this.f40591b.f40589e.invoke(new IllegalStateException("initiateViewComponents failed for uri " + this.f40593d));
                }
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC16208i iVar, Uri uri, Boolean bool) {
            AbstractC17026c cVar;
            AbstractC16208i iVar2 = iVar;
            Uri uri2 = uri;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154719c(iVar2, "");
            C89219l.m154719c(uri2, "");
            if (!(!(iVar2 instanceof AbstractC17026c) || iVar2 == null || (cVar = (AbstractC17026c) iVar2) == null)) {
                if (booleanValue) {
                    this.f40586b.invoke(this.f40585a.f40582a);
                    C17043a aVar = new C17043a(cVar, this, booleanValue, uri2);
                    C89219l.m154719c(aVar, "");
                    cVar.mo26058a(new AbstractC17026c.C17027a(cVar, aVar));
                } else {
                    this.f40588d.invoke(cVar, cVar.f40544H, Boolean.valueOf(booleanValue));
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.AbstractC16239d.AbstractC16240a
    /* renamed from: a */
    public final void mo25820a(AbstractC16239d.AbstractC16241b bVar) {
        C89219l.m154719c(bVar, "");
        this.f40583b.mo25820a(bVar);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17049i
    /* renamed from: a */
    public final void mo26915a(Uri uri, C16248b bVar, AbstractC89172b<? super C16248b, C89391z> bVar2, AbstractC89172b<? super C17029d<? extends View>, C89391z> bVar3, AbstractC89187q<? super AbstractC16208i, ? super List<? extends C17029d<? extends View>>, ? super Boolean, C89391z> qVar, AbstractC89172b<? super Throwable, C89391z> bVar4) {
        String str;
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        C89219l.m154719c(bVar3, "");
        C89219l.m154719c(qVar, "");
        C89219l.m154719c(bVar4, "");
        C16248b bVar5 = this.f40582a;
        bVar5.mo25825a(bVar);
        bVar5.mo25831b(Uri.class, uri);
        C16257i iVar = (C16257i) this.f40582a.mo25832c(C16257i.class);
        if (iVar == null || (str = iVar.f39048a) == null) {
            str = C16583n.m30793a();
        }
        this.f40584c = str;
        Context context = (Context) this.f40582a.mo25832c(Context.class);
        if (context != null) {
            C16622e.C16623a.m30858a().mo26340a(this.f40584c, context);
        }
        AbstractC16244c cVar = this.f40583b;
        cVar.mo25822b(this.f40584c);
        cVar.mo25821a(uri, this.f40582a, new C17042a(this, bVar2, bVar3, qVar, bVar4), bVar4);
    }
}

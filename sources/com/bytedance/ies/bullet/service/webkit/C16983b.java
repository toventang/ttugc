package com.bytedance.ies.bullet.service.webkit;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.web.AbstractC16676d;
import com.bytedance.ies.bullet.service.base.web.AbstractC16678e;
import com.bytedance.ies.bullet.service.base.web.AbstractC16682i;
import com.bytedance.ies.bullet.service.base.web.AbstractC16683j;
import com.bytedance.ies.bullet.service.base.web.C16691m;
import com.bytedance.ies.bullet.service.base.web.C16692n;
import com.bytedance.ies.bullet.service.base.web.C16696q;
import com.bytedance.webx.C23612h;
import com.bytedance.webx.p1756e.p1757a.C23593e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.webkit.b */
public final class C16983b extends C16616a implements AbstractC16676d {
    static {
        Covode.recordClassIndex(19428);
    }

    /* renamed from: com.bytedance.ies.bullet.service.webkit.b$a */
    public static final class C16984a extends C23612h.AbstractC23617d {

        /* renamed from: a */
        final /* synthetic */ C16983b f40443a;

        static {
            Covode.recordClassIndex(19429);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16984a(C16983b bVar) {
            this.f40443a = bVar;
        }

        @Override // com.bytedance.webx.C23612h.AbstractC23617d
        /* renamed from: a */
        public final void mo26815a(C23612h.C23613a aVar) {
            C89219l.m154719c(aVar, "");
            AbstractC16683j jVar = (AbstractC16683j) this.f40443a.mo26380a(AbstractC16683j.class);
            if (jVar != null) {
                jVar.mo26503a(aVar);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16676d
    /* renamed from: a */
    public final AbstractC16682i mo26487a(C16696q qVar) {
        C89219l.m154719c(qVar, "");
        return new C16985c(this, qVar);
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16676d
    /* renamed from: a */
    public final void mo26488a(Context context, C16691m mVar) {
        AbstractC16678e eVar;
        C89219l.m154719c(context, "");
        C89219l.m154719c(mVar, "");
        C23612h.m44649a(context);
        C23612h.m44650a("webx_webkit", C23593e.class, new C16984a(this));
        mo26380a(AbstractC16683j.class);
        C16692n nVar = mVar.f39867a;
        if (nVar != null && (eVar = (AbstractC16678e) mo26380a(AbstractC16678e.class)) != null) {
            eVar.mo26490a(context, nVar);
        }
    }
}

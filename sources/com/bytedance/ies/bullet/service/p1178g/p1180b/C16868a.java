package com.bytedance.ies.bullet.service.p1178g.p1180b;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.web.AbstractC16678e;
import com.bytedance.ies.bullet.service.base.web.C16692n;
import com.bytedance.webx.p1764h.C23618a;
import com.bytedance.webx.p1764h.p1765a.AbstractC23621c;
import com.bytedance.webx.p1764h.p1766b.C23622a;
import com.bytedance.webx.p1764h.p1767c.C23625a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.g.b.a */
public final class C16868a extends C16616a implements AbstractC16678e {

    /* renamed from: a */
    public static final C16869a f40086a = new C16869a((byte) 0);

    static {
        Covode.recordClassIndex(19308);
    }

    /* renamed from: com.bytedance.ies.bullet.service.g.b.a$a */
    public static final class C16869a {
        static {
            Covode.recordClassIndex(19309);
        }

        private C16869a() {
        }

        public /* synthetic */ C16869a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.g.b.a$b */
    static final class C16870b implements AbstractC23621c {

        /* renamed from: a */
        final /* synthetic */ C16692n f40087a;

        static {
            Covode.recordClassIndex(19310);
        }

        C16870b(C16692n nVar) {
            this.f40087a = nVar;
        }

        @Override // com.bytedance.webx.p1764h.p1765a.AbstractC23621c
        /* renamed from: a */
        public final WebView mo26664a(Context context) {
            C16692n.AbstractC16693a aVar = this.f40087a.f39869b;
            if (aVar == null) {
                return null;
            }
            C89219l.m154709a((Object) context, "");
            return aVar.mo26169a(context);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16678e
    /* renamed from: a */
    public final WebView mo26489a(Context context, String str) {
        C89219l.m154719c(context, "");
        return C23618a.f55893b.mo39037a(context, "webx_bullet");
    }

    @Override // com.bytedance.ies.bullet.service.base.web.AbstractC16678e
    /* renamed from: a */
    public final void mo26490a(Context context, C16692n nVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(nVar, "");
        if (nVar.f39869b != null) {
            C23618a aVar = C23618a.f55893b;
            if (C23618a.f55892a == null) {
                C23618a.f55892a = new C23622a(context);
            }
            String str = nVar.f39868a;
            if (str == null) {
                str = "webx_bullet";
            }
            aVar.mo39038a(str, new C23625a.C23626a().mo39043a(new C16870b(nVar)).mo39042a(nVar.f39870c).mo39044a(nVar.f39871d).mo39045a());
        }
    }
}

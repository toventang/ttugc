package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38565b;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.c */
public final class C38573c implements AbstractC38579f {

    /* renamed from: a */
    public Context f91159a;

    /* renamed from: b */
    public List<AbstractC38555a> f91160b;

    /* renamed from: c */
    public C38565b f91161c;

    static {
        Covode.recordClassIndex(46105);
    }

    /* synthetic */ C38573c() {
        this(C17867d.m33078a(), new ArrayList(), new C38565b.C38566a().f91099a);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38579f
    /* renamed from: a */
    public final boolean mo67164a() {
        C38554a.f91082a.mo65603a("ad_lynx_download_AdRouterTask_execute", (JSONObject) null, "begin", String.valueOf(this.f91161c.f91093a.f91102c));
        for (AbstractC38555a aVar : this.f91160b) {
            Context context = this.f91159a;
            C89219l.m154721d(context, "");
            aVar.f91084b = context;
            C38565b bVar = this.f91161c;
            C89219l.m154721d(bVar, "");
            aVar.f91085c = bVar;
            if (aVar.mo65690a()) {
                boolean b = aVar.mo65691b();
                aVar.mo65609a(b, this.f91161c);
                if (b) {
                    C38554a.f91082a.mo65603a("ad_lynx_download_AdRouterTask_execute", (JSONObject) null, "success", String.valueOf(this.f91161c.f91093a.f91102c));
                    return true;
                }
            }
        }
        C38554a.f91082a.mo65603a("ad_lynx_download_AdRouterTask_execute", (JSONObject) null, "fail", String.valueOf(this.f91161c.f91093a.f91102c));
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.c$a */
    public static final class C38574a {

        /* renamed from: a */
        public C38573c f91162a = new C38573c();

        static {
            Covode.recordClassIndex(46106);
        }

        /* renamed from: a */
        public final C38574a mo67165a(Context context) {
            if (context != null) {
                C38573c cVar = this.f91162a;
                C89219l.m154721d(context, "");
                cVar.f91159a = context;
            }
            return this;
        }

        /* renamed from: a */
        public final C38574a mo67166a(AbstractC38555a aVar) {
            C89219l.m154721d(aVar, "");
            this.f91162a.f91160b.add(aVar);
            return this;
        }

        /* renamed from: a */
        public final C38574a mo67167a(C38565b bVar) {
            C89219l.m154721d(bVar, "");
            C38573c cVar = this.f91162a;
            C89219l.m154721d(bVar, "");
            cVar.f91161c = bVar;
            return this;
        }
    }

    private C38573c(Context context, List<AbstractC38555a> list, C38565b bVar) {
        this.f91159a = context;
        this.f91160b = list;
        this.f91161c = bVar;
    }
}

package com.bytedance.ies.bullet.kit.web;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.p1159a.AbstractC16482f;
import com.bytedance.ies.bullet.kit.web.p1159a.AbstractC16483g;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16206g;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16207h;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.web.AbstractC16676d;
import com.bytedance.ies.bullet.service.base.web.C16691m;
import com.bytedance.ies.bullet.service.base.web.C16692n;
import com.bytedance.webx.AbstractC23564d;
import com.bytedance.webx.C23609g;
import com.bytedance.webx.p1756e.p1757a.C23593e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class WebKitApi extends IWebKitApi<C16501j> {

    /* renamed from: a */
    public static final C16472a f39524a = new C16472a((byte) 0);

    /* renamed from: b */
    private final Class<C16501j> f39525b = C16501j.class;

    /* renamed from: c */
    private boolean f39526c;

    /* renamed from: d */
    private C16248b f39527d;

    /* renamed from: e */
    private AbstractC16496e f39528e;

    static {
        Covode.recordClassIndex(18902);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16216o, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: e */
    public final boolean mo25714e() {
        return true;
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$a */
    public static final class C16472a {
        static {
            Covode.recordClassIndex(18903);
        }

        private C16472a() {
        }

        public /* synthetic */ C16472a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: b */
    public final C16248b mo25711b() {
        return this.f39527d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: c */
    public final void mo25712c() {
        Application application;
        if (!this.f39526c) {
            int i = Build.VERSION.SDK_INT;
            C16248b bVar = this.f39527d;
            if (bVar != null) {
                bVar.mo25832c(C16148a.class);
            }
            C16248b bVar2 = this.f39527d;
            if (bVar2 != null && (application = (Application) bVar2.mo25832c(Application.class)) != null) {
                AbstractC16676d dVar = (AbstractC16676d) mo25790b_(AbstractC16676d.class);
                if (dVar != null) {
                    C16691m mVar = new C16691m();
                    C16692n nVar = new C16692n();
                    nVar.f39869b = new C16475d(this);
                    mVar.f39867a = nVar;
                    dVar.mo26488a(application, mVar);
                }
                this.f39526c = true;
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$b */
    public static final class C16473b implements AbstractC16207h<AbstractC16496e> {

        /* renamed from: a */
        final /* synthetic */ Object f39529a;

        static {
            Covode.recordClassIndex(18904);
        }

        C16473b(Object obj) {
            this.f39529a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.g' to match base method */
        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16207h
        /* renamed from: a */
        public final /* synthetic */ AbstractC16496e mo25761a(C16248b bVar) {
            C89219l.m154719c(bVar, "");
            return ((AbstractC16482f) this.f39529a).mo26187a();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$c */
    public static final class C16474c implements AbstractC16213l<AbstractC16497f, AbstractC16495d> {

        /* renamed from: a */
        final /* synthetic */ Object f39530a;

        static {
            Covode.recordClassIndex(18905);
        }

        C16474c(Object obj) {
            this.f39530a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.m' to match base method */
        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l
        /* renamed from: a */
        public final /* synthetic */ AbstractC16497f mo25785a(C16248b bVar) {
            C89219l.m154719c(bVar, "");
            return ((AbstractC16483g) this.f39530a).mo26188k(bVar);
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.e' to match base method */
        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l
        /* renamed from: b */
        public final /* synthetic */ AbstractC16495d mo25786b(C16248b bVar) {
            C89219l.m154719c(bVar, "");
            return ((AbstractC16483g) this.f39530a).mo26189l(bVar);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.WebKitApi$d */
    public static final class C16475d implements C16692n.AbstractC16693a {

        /* renamed from: a */
        final /* synthetic */ WebKitApi f39531a;

        static {
            Covode.recordClassIndex(18906);
        }

        C16475d(WebKitApi webKitApi) {
            this.f39531a = webKitApi;
        }

        @Override // com.bytedance.ies.bullet.service.base.web.C16692n.AbstractC16693a
        /* renamed from: a */
        public final WebView mo26169a(Context context) {
            C89219l.m154719c(context, "");
            return WebKitApi.m30568a(context);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: a */
    public final AbstractC16213l<AbstractC16497f, AbstractC16495d> mo25706a(Object obj) {
        C89219l.m154719c(obj, "");
        if (obj instanceof AbstractC16483g) {
            return new C16474c(obj);
        }
        return null;
    }

    /* renamed from: a */
    public static SSWebView m30568a(Context context) {
        C89219l.m154719c(context, "");
        try {
            AbstractC23564d a = ((C23593e) C23609g.m44643a("webx_webkit", C23593e.class)).mo39013a(context, SSWebView.class);
            C89219l.m154709a((Object) a, "");
            return (SSWebView) a;
        } catch (Throwable unused) {
            return new SSWebView(context, null, 6, (byte) 0);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: b */
    public final AbstractC16207h<AbstractC16496e> mo25710b(Object obj) {
        C89219l.m154719c(obj, "");
        if (obj instanceof AbstractC16482f) {
            return new C16473b(obj);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: a */
    public final /* synthetic */ void mo25709a(AbstractC16208i iVar) {
        C89219l.m154719c(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: a */
    public final /* synthetic */ void mo25708a(AbstractC16206g gVar, C16248b bVar) {
        C89219l.m154719c(bVar, "");
        this.f39528e = (AbstractC16496e) gVar;
        this.f39527d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C16501j mo25705a(C16238z zVar, List<String> list, AbstractC16253f fVar, C16248b bVar) {
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(bVar, "");
        mo25712c();
        return new C16501j(this, zVar, list, fVar, bVar);
    }
}

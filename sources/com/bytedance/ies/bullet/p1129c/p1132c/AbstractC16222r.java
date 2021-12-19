package com.bytedance.ies.bullet.p1129c.p1132c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.C16257i;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1130a.C16149b;
import com.bytedance.ies.bullet.p1129c.p1131b.C16153b;
import com.bytedance.ies.bullet.p1129c.p1131b.EnumC16152a;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16186l;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16190o;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16162c;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.C16168h;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1138b.AbstractC16252a;
import com.bytedance.ies.bullet.p1129c.p1139f.AbstractC16254a;
import com.bytedance.ies.bullet.service.base.AbstractC16652m;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16614as;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.C16566a;
import com.bytedance.ies.bullet.service.base.p1163a.C16587q;
import com.bytedance.ies.bullet.service.base.p1163a.EnumC16586p;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.bullet.service.base.p1168e.C16637a;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16727f;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16728g;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.c.c.r */
public abstract class AbstractC16222r implements AbstractC16208i, AbstractC16584o {

    /* renamed from: a */
    public AbstractC16210j f38986a;

    /* renamed from: b */
    public final List<AbstractC16210j> f38987b = new ArrayList();

    /* renamed from: c */
    public AbstractC16187m f38988c;

    /* renamed from: d */
    public boolean f38989d = true;

    /* renamed from: e */
    public final List<AbstractC89172b<Throwable, C89391z>> f38990e = new ArrayList();

    /* renamed from: f */
    public AbstractC16640d f38991f;

    /* renamed from: g */
    public final List<C16153b> f38992g = new ArrayList();

    /* renamed from: h */
    public final C16238z f38993h;

    /* renamed from: i */
    public final C16248b f38994i;

    /* renamed from: j */
    private final List<String> f38995j;

    /* renamed from: k */
    private Uri f38996k;

    /* renamed from: l */
    private AbstractC16253f f38997l;

    /* renamed from: m */
    private AbstractC16214m f38998m;

    /* renamed from: n */
    private AbstractC16204e f38999n;

    /* renamed from: o */
    private final List<AbstractC16214m> f39000o = new ArrayList();

    /* renamed from: p */
    private final List<AbstractC16204e> f39001p = new ArrayList();

    /* renamed from: q */
    private AbstractC16741q f39002q;

    /* renamed from: r */
    private final List<AbstractC16741q> f39003r = new ArrayList();

    /* renamed from: s */
    private boolean f39004s;

    /* renamed from: t */
    private final AbstractC89244h f39005t = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C16227e(this));

    /* renamed from: u */
    private final AbstractC89244h f39006u = C89250i.m154773a((AbstractC89171a) new C16224b(this));

    /* renamed from: v */
    private final AbstractC89244h f39007v;

    /* renamed from: w */
    private final AbstractC16203d<?, ?, ?, ?> f39008w;

    static {
        Covode.recordClassIndex(18515);
    }

    /* renamed from: a */
    public abstract void mo25793a(Uri uri, boolean z);

    /* renamed from: a */
    public abstract boolean mo25794a(Uri uri, AbstractC89172b<? super Throwable, C89391z> bVar);

    /* renamed from: b */
    public void mo25796b(Throwable th) {
    }

    /* renamed from: c */
    public abstract void mo25798c(Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    /* renamed from: c */
    public abstract void mo25800c(List<String> list, AbstractC16253f fVar);

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: f */
    public final String mo25791f() {
        return (String) this.f39006u.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: g */
    public final AbstractC16582m mo25792g() {
        return (AbstractC16582m) this.f39005t.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public C16587q getLoggerWrapper() {
        return (C16587q) this.f39007v.getValue();
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: j */
    public void mo25775j() {
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: k */
    public void mo25776k() {
    }

    /* renamed from: q */
    public abstract void mo25803q();

    /* renamed from: r */
    public abstract void mo25804r();

    /* renamed from: com.bytedance.ies.bullet.c.c.r$a */
    public static final class View$OnAttachStateChangeListenerC16223a implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(18516);
        }

        public final void onViewAttachedToWindow(View view) {
            C89219l.m154719c(view, "");
        }

        View$OnAttachStateChangeListenerC16223a() {
        }

        public final void onViewDetachedFromWindow(View view) {
            C89219l.m154719c(view, "");
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final C16238z mo25762a() {
        return this.f38993h;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: c */
    public final C16248b mo25770c() {
        return this.f38994i;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: d */
    public final List<String> mo25771d() {
        return this.f38995j;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: e */
    public final Uri mo25772e() {
        return this.f38996k;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: h */
    public final boolean mo25773h() {
        return this.f39004s;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: l */
    public void mo25777l() {
        AbstractC16208i.C16209a.m30120a(this);
    }

    /* renamed from: o */
    public final List<AbstractC16214m> mo25801o() {
        return this.f39000o;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: o_ */
    public final AbstractC16741q mo25778o_() {
        return this.f39002q;
    }

    /* renamed from: p */
    public final List<AbstractC16204e> mo25802p() {
        return this.f39001p;
    }

    /* renamed from: r_ */
    public final AbstractC16214m mo25805r_() {
        return this.f38998m;
    }

    /* renamed from: s */
    public final AbstractC16203d<?, ?, ?, ?> mo25806s() {
        return this.f39008w;
    }

    /* renamed from: s_ */
    public final AbstractC16204e mo25807s_() {
        return this.f38999n;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: b */
    public final EnumC16723b mo25769b() {
        return this.f39008w.mo25707a();
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.r$b */
    static final class C16224b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16222r f39009a;

        static {
            Covode.recordClassIndex(18517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16224b(AbstractC16222r rVar) {
            super(0);
            this.f39009a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String str;
            C16148a aVar = (C16148a) this.f39009a.f38994i.mo25832c(C16148a.class);
            if (aVar == null || (str = aVar.f38891a) == null) {
                return "default_bid";
            }
            return str;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.r$c */
    static final class C16225c extends AbstractC89220m implements AbstractC89171a<C16587q> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16222r f39010a;

        static {
            Covode.recordClassIndex(18518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16225c(AbstractC16222r rVar) {
            super(0);
            this.f39010a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16587q invoke() {
            return new C16587q((AbstractC16652m) this.f39010a.f38994i.mo25832c(AbstractC16652m.class), "InstanceKit");
        }
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.r$e */
    static final class C16227e extends AbstractC89220m implements AbstractC89171a<C16566a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16222r f39014a;

        static {
            Covode.recordClassIndex(18520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16227e(AbstractC16222r rVar) {
            super(0);
            this.f39014a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C16566a invoke() {
            boolean z;
            C16149b bVar;
            Context context = (Context) this.f39014a.f38994i.mo25832c(Context.class);
            C16148a aVar = (C16148a) this.f39014a.f38994i.mo25832c(C16148a.class);
            if (aVar == null || (bVar = aVar.f38892b) == null) {
                z = false;
            } else {
                z = bVar.f38894a;
            }
            return new C16566a(context, z);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: i */
    public final void mo25774i() {
        this.f39004s = true;
        mo25797b(this.f38995j, this.f38997l);
        mo25804r();
        Iterator<T> it = this.f38987b.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo25781a(this);
            } catch (C16614as unused) {
            }
        }
        AbstractC16210j jVar = this.f38986a;
        if (jVar != null) {
            try {
                jVar.mo25781a(this);
            } catch (C16614as unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m30144a(View view) {
        C89219l.m154719c(view, "");
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC16223a());
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: a_ */
    public final <T> T mo25789a_(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) AbstractC16584o.C16585a.m30801b(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o
    /* renamed from: b_ */
    public final <T extends AbstractC16568c> T mo25790b_(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) AbstractC16584o.C16585a.m30798a(this, cls);
    }

    /* renamed from: com.bytedance.ies.bullet.c.c.r$d */
    static final class C16226d extends AbstractC89220m implements AbstractC89172b<Uri, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16222r f39011a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f39012b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39013c;

        static {
            Covode.recordClassIndex(18519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16226d(AbstractC16222r rVar, AbstractC89172b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f39011a = rVar;
            this.f39012b = bVar;
            this.f39013c = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Uri uri) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            this.f39011a.mo25795b(uri2, this.f39012b, this.f39013c);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: b */
    public final <T extends AbstractC16568c> T mo25768b(Class<T> cls) {
        C89219l.m154719c(cls, "");
        return (T) C16622e.C16623a.m30858a().mo26347a(mo25791f(), cls);
    }

    /* renamed from: c */
    public final void mo25799c(Throwable th) {
        Iterator<T> it = this.f38990e.iterator();
        while (it.hasNext()) {
            it.next().invoke(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.c.r$f */
    public static final class C16228f extends AbstractC89220m implements AbstractC89172b<Uri, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC16222r f39015a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f39016b;

        static {
            Covode.recordClassIndex(18521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16228f(AbstractC16222r rVar, AbstractC89172b bVar) {
            super(1);
            this.f39015a = rVar;
            this.f39016b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Uri uri) {
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            this.f39016b.invoke(uri2);
            AbstractC16222r rVar = this.f39015a;
            rVar.mo25793a(uri2, false);
            Iterator<T> it = rVar.f38987b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo25782a(rVar, uri2);
                } catch (C16614as unused) {
                }
            }
            AbstractC16210j jVar = rVar.f38986a;
            if (jVar != null) {
                try {
                    jVar.mo25782a(rVar, uri2);
                } catch (C16614as unused2) {
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private void m30145a(AbstractC16186l lVar) {
        AbstractC16252a<C16162c> aVar;
        C89219l.m154719c(lVar, "");
        List<AbstractC16190o> invoke = lVar.mo25663a().invoke(this.f38994i);
        AbstractC89172b<C16248b, List<AbstractC16192q>> b = lVar.mo25664b();
        C16248b bVar = this.f38994i;
        try {
            aVar = lVar.mo25665c().invoke(this.f38994i);
        } catch (C16614as unused) {
            aVar = null;
        }
        C16168h hVar = new C16168h(invoke, b, bVar, aVar);
        AbstractC16187m mVar = this.f38988c;
        if (mVar == null) {
            this.f38988c = hVar;
        } else {
            mVar.mo25731a(hVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.c.c.r$g */
    public static final class C16229g extends AbstractC89220m implements AbstractC89172b<Uri, C16728g<Map<?, ?>>> {

        /* renamed from: a */
        public static final C16229g f39017a = new C16229g();

        static {
            Covode.recordClassIndex(18522);
        }

        C16229g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C16728g<Map<?, ?>> invoke(Uri uri) {
            Set<String> queryParameterNames;
            String queryParameter;
            Uri uri2 = uri;
            C89219l.m154719c(uri2, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("__AUTHORITY__", uri2.getAuthority());
            linkedHashMap.put("__PATH__", uri2.getPath());
            if (uri2.isHierarchical() && (queryParameterNames = uri2.getQueryParameterNames()) != null) {
                for (T t : queryParameterNames) {
                    if (!(t == null || (queryParameter = uri2.getQueryParameter(t)) == null)) {
                        linkedHashMap.put(t, queryParameter);
                    }
                }
            }
            return new C16728g(Map.class, linkedHashMap);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final <T extends AbstractC16741q> T mo25763a(Class<T> cls) {
        Object obj;
        C89219l.m154719c(cls, "");
        Iterator it = C89070n.m154590j(this.f39003r).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cls.isAssignableFrom(obj.getClass())) {
                break;
            }
        }
        T t = (T) ((AbstractC16741q) obj);
        if (t == null || !(t instanceof AbstractC16741q)) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public void mo25766a(Throwable th) {
        this.f39004s = false;
        EnumC16152a aVar = EnumC16152a.Closed;
        List<C16153b> list = this.f38992g;
        ArrayList<C16153b> arrayList = new ArrayList();
        for (T t : list) {
            if (C89219l.m154714a((Object) t.f38901b, (Object) aVar.getActionType())) {
                arrayList.add(t);
            }
        }
        for (C16153b bVar : arrayList) {
            bVar.onEvent(this.f38988c);
        }
        this.f38992g.clear();
        AbstractC16187m mVar = this.f38988c;
        if (mVar != null) {
            mVar.mo25721a();
        }
        mo25796b(th);
        Iterator<T> it = this.f38987b.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo25784a(this, th);
            } catch (C16614as unused) {
            }
        }
        AbstractC16210j jVar = this.f38986a;
        if (jVar != null) {
            try {
                jVar.mo25784a(this, th);
            } catch (C16614as unused2) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printReject(Throwable th, String str) {
        C89219l.m154719c(th, "");
        C89219l.m154719c(str, "");
        AbstractC16208i.C16209a.m30122a(this, th, str);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25767a(List<String> list, AbstractC16253f fVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        this.f38989d = false;
        this.f38995j.clear();
        this.f38995j.addAll(list);
        mo25800c(list, fVar);
        mo25797b(list, fVar);
    }

    /* renamed from: b */
    public void mo25797b(List<String> list, AbstractC16253f fVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        this.f38995j.clear();
        this.f38995j.addAll(list);
        this.f38998m = null;
        this.f38999n = null;
        this.f38986a = null;
        AbstractC16213l<?, ?> a = fVar.mo25833a();
        if (a != null) {
            AbstractC16214m a2 = a.mo25785a(this.f38994i);
            if (a2 != null) {
                this.f38998m = a2;
            }
            AbstractC16204e b = a.mo25786b(this.f38994i);
            if (b != null) {
                this.f38999n = b;
                AbstractC16210j a3 = b.mo25653a(this.f38994i);
                if (a3 != null) {
                    this.f38986a = a3;
                }
            }
        }
        this.f38992g.clear();
        this.f39000o.clear();
        this.f39001p.clear();
        this.f38987b.clear();
        for (T t : fVar.mo25834b()) {
            AbstractC16214m a4 = t.mo25785a(this.f38994i);
            if (a4 != null) {
                this.f39000o.add(a4);
            }
            AbstractC16204e b2 = t.mo25786b(this.f38994i);
            if (b2 != null) {
                this.f39001p.add(b2);
                AbstractC16210j a5 = b2.mo25653a(this.f38994i);
                if (a5 != null) {
                    this.f38987b.add(a5);
                }
            }
        }
        mo25803q();
        AbstractC16187m mVar = this.f38988c;
        if (mVar != null) {
            mVar.mo25721a();
        }
        this.f38988c = null;
        Iterator<T> it = fVar.mo25836d().iterator();
        while (it.hasNext()) {
            m30145a((AbstractC16186l) it.next());
        }
        AbstractC16186l c = fVar.mo25835c();
        if (c != null) {
            m30145a(c);
        }
        this.f38997l = fVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j
    public void printLog(String str, EnumC16586p pVar, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(pVar, "");
        C89219l.m154719c(str2, "");
        AbstractC16208i.C16209a.m30121a(this, str, pVar, str2);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: a */
    public final void mo25764a(Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        this.f38996k = uri;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f38987b);
        AbstractC16210j jVar = this.f38986a;
        if (jVar != null) {
            arrayList.add(jVar);
        }
        if (arrayList.isEmpty()) {
            mo25795b(uri, bVar, bVar2);
            return;
        }
        C16230s sVar = new C16230s(this, arrayList);
        C16226d dVar = new C16226d(this, bVar, bVar2);
        C89219l.m154719c(uri, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(bVar2, "");
        Iterator<AbstractC16210j> it = sVar.f39018a.iterator();
        if (!it.hasNext()) {
            bVar2.invoke(new Throwable("None of IKitInstanceApiLifecycleDelegate processor for uri ".concat(String.valueOf(uri))));
        } else {
            sVar.mo25810a(it, uri, dVar, bVar2);
        }
    }

    /* renamed from: b */
    public final void mo25795b(Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        AbstractC16741q qVar;
        Object a;
        C16202c cVar;
        Uri uri2;
        C16637a aVar = new C16637a(uri);
        String str = this.f38993h.f39033a;
        C89219l.m154719c(str, "");
        aVar.f39801a = str;
        this.f38991f = aVar;
        C16257i iVar = (C16257i) this.f38994i.mo25832c(C16257i.class);
        Object obj = null;
        if (!(iVar == null || (cVar = iVar.f39050c) == null || (uri2 = cVar.f38975a) == null)) {
            this.f38991f = new C16637a(uri2);
        }
        mo25792g().mo26326a(AbstractC16640d.class, this.f38991f);
        this.f38994i.mo25831b(AbstractC16640d.class, this.f38991f);
        this.f38994i.mo25831b(AbstractC16654o.class, mo25790b_(AbstractC16654o.class));
        AbstractC16254a aVar2 = (AbstractC16254a) this.f38994i.mo25832c(AbstractC16254a.class);
        AbstractC16214m mVar = (AbstractC16214m) C89070n.m154583g((List) this.f39000o);
        if (mVar == null && (mVar = this.f38998m) == null) {
            qVar = null;
        } else {
            qVar = mVar.mo25787a(this.f38994i);
            C16229g gVar = C16229g.f39017a;
            C89219l.m154719c(Uri.class, "");
            C89219l.m154719c(gVar, "");
            qVar.f39984as.put(Uri.class, gVar);
        }
        this.f39002q = qVar;
        this.f39003r.clear();
        Iterator<T> it = this.f38997l.mo25837e().iterator();
        while (it.hasNext()) {
            this.f39003r.addAll((Collection) it.next().invoke(this.f38994i));
        }
        if (!(aVar2 == null || (a = aVar2.mo25838a()) == null || !(a instanceof Bundle))) {
            obj = a;
        }
        AbstractC16727f fVar = (AbstractC16727f) this.f38994i.mo25832c(AbstractC16727f.class);
        AbstractC16741q qVar2 = this.f39002q;
        if (qVar2 != null) {
            if (obj != null) {
                qVar2.mo26572a(Bundle.class, obj, fVar);
            }
            qVar2.mo26572a(Uri.class, uri, fVar);
        }
        for (T t : this.f39003r) {
            if (obj != null) {
                t.mo26572a(Bundle.class, obj, fVar);
            }
            t.mo26572a(Uri.class, uri, fVar);
        }
        if (this.f39002q == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("params not found");
            printReject(illegalArgumentException, "");
            bVar2.invoke(illegalArgumentException);
        } else if (mo25794a(uri, bVar2)) {
            AbstractC16741q qVar3 = this.f39002q;
            if (!(qVar3 == null || aVar2 == null)) {
                aVar2.mo25839a(this, uri, qVar3);
            }
            mo25798c(uri, new C16228f(this, bVar), bVar2);
        }
    }

    public AbstractC16222r(AbstractC16203d<?, ?, ?, ?> dVar, C16238z zVar, List<String> list, AbstractC16253f fVar, C16248b bVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(bVar, "");
        this.f39008w = dVar;
        this.f38993h = zVar;
        this.f38994i = bVar;
        ArrayList arrayList = new ArrayList();
        this.f38995j = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        this.f38997l = fVar;
        bVar.mo25828a(AbstractC16208i.class, this);
        bVar.mo25831b(AbstractC16654o.class, mo25790b_(AbstractC16654o.class));
        this.f39007v = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C16225c(this));
    }
}

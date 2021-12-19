package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ax.a.k */
public final class C34337k extends AbstractC34293a implements AbstractC34341n, AbstractC34342o {

    /* renamed from: g */
    public static final Map<AbstractC89277c<? extends AbstractC34346s>, C34298aa<? extends AbstractC34346s>> f81202g = new LinkedHashMap();

    /* renamed from: h */
    public static final C34338a f81203h = new C34338a((byte) 0);

    /* renamed from: d */
    public AbstractC34349u f81204d;

    /* renamed from: e */
    public final AbstractC34358z f81205e;

    /* renamed from: f */
    public final AbstractC34299ab f81206f;

    /* renamed from: com.ss.android.ugc.aweme.ax.a.k$a */
    public static final class C34338a {
        static {
            Covode.recordClassIndex(41282);
        }

        private C34338a() {
        }

        public /* synthetic */ C34338a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m70252a(C34298aa<? extends AbstractC34346s> aaVar) {
            C34337k.f81202g.put(aaVar.f81132a, aaVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34293a, com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34345r
    /* renamed from: b */
    public final void mo60719b() {
        super.mo60719b();
        m70240a((AbstractC34349u) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34342o
    /* renamed from: c */
    public final String mo60798c() {
        return this.f81206f.mo60739e();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34342o
    /* renamed from: d */
    public final boolean mo60799d() {
        return this.f81206f.mo60737c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34342o
    /* renamed from: e */
    public final List<String> mo60800e() {
        return this.f81206f.mo60738d();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34342o
    /* renamed from: f */
    public final String mo60801f() {
        return this.f81206f.mo60735a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34342o
    /* renamed from: g */
    public final boolean mo60802g() {
        return this.f81206f.mo60736b();
    }

    static {
        Covode.recordClassIndex(41281);
        C34338a.m70252a(C34328i.f81182a);
        C34338a.m70252a(C34352x.f81213a);
    }

    /* renamed from: a */
    private void m70240a(AbstractC34349u uVar) {
        AbstractC34349u uVar2 = this.f81204d;
        if (uVar2 != null) {
            uVar2.mo60719b();
        }
        if (uVar != null) {
            uVar.mo60718a(bF_(), this.f81083b);
        }
        this.f81204d = uVar;
    }

    /* renamed from: a */
    public final <T extends AbstractC34346s> T mo60793a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        AbstractC34349u uVar = this.f81204d;
        if (uVar == null || !cls.isAssignableFrom(uVar.getClass())) {
            return null;
        }
        Objects.requireNonNull(uVar, "null cannot be cast to non-null type T");
        return (T) ((AbstractC34346s) uVar);
    }

    public C34337k(AbstractC34358z zVar, AbstractC34299ab abVar) {
        C89219l.m154721d(zVar, "");
        C89219l.m154721d(abVar, "");
        this.f81205e = zVar;
        this.f81206f = abVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34341n
    /* renamed from: a */
    public final void mo60797a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        try {
            this.f81205e.mo60806a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo60794a(Uri uri, View view, Map<String, String> map) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(map, "");
        C34324g gVar = new C34324g();
        gVar.mo60767a(AbstractC34341n.class, new C34307af(this));
        gVar.mo60767a(AbstractC34349u.class, new C34323f(this.f81204d));
        gVar.mo60767a(View.class, new C34307af(view));
        gVar.mo60767a(AbstractC34342o.class, new C34307af(this));
        Iterator<Map.Entry<AbstractC89277c<? extends AbstractC34346s>, C34298aa<? extends AbstractC34346s>>> it = f81202g.entrySet().iterator();
        T t = null;
        while (true) {
            if (it.hasNext()) {
                t = it.next().getValue().f81133b.invoke(uri, gVar, map);
                if (t != null) {
                    break;
                }
            } else if (t == null) {
                return;
            }
        }
        if (t instanceof AbstractC34349u) {
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.hybrid.monitor.IUnitSession");
            m70240a((AbstractC34349u) t);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34341n
    /* renamed from: a */
    public final void mo60795a(Exception exc, String str, Map<String, String> map) {
        C89219l.m154721d(exc, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        try {
            this.f81205e.mo60804a(exc, str, map);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34341n
    /* renamed from: a */
    public final void mo60796a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            this.f81205e.mo60805a(str, num, jSONObject, jSONObject2, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

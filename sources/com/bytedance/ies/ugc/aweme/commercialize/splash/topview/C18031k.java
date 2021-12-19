package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17975i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.k */
public final class C18031k {

    /* renamed from: a */
    public static final C18031k f42915a = new C18031k();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.k$b */
    public static final class C18033b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18033b f42917a = new C18033b();

        static {
            Covode.recordClassIndex(20659);
        }

        C18033b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.k$d */
    public static final class C18035d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18035d f42919a = new C18035d();

        static {
            Covode.recordClassIndex(20661);
        }

        C18035d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C18031k() {
    }

    static {
        Covode.recordClassIndex(20657);
    }

    /* renamed from: a */
    public static void m33600a() {
        C17873f.m33101i().mo143254a(C18034c.f42918a, C18035d.f42919a);
    }

    /* renamed from: b */
    public static void m33601b() {
        C17873f.m33099g().mo143254a(C18032a.f42916a, C18033b.f42917a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.k$c */
    public static final class C18034c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18034c f42918a = new C18034c();

        static {
            Covode.recordClassIndex(20660);
        }

        C18034c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C17975i.f42807g = false;
            C18027h.m33593a();
            if (C18027h.f42906a != null) {
                C18027h.f42906a.mo28756c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.k$a */
    public static final class C18032a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C18032a f42916a = new C18032a();

        static {
            Covode.recordClassIndex(20658);
        }

        C18032a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C18027h.m33593a();
                boolean a = C16048b.m29633a().mo25421a(true, "awesome_splash_preload_json_enabled", false);
                if (C18027h.f42906a != null) {
                    C18021e eVar = C18027h.f42906a;
                    if (eVar.f42897b != null) {
                        eVar.f42897b.edit().putBoolean("awesome_splash_preload_json", a).apply();
                    }
                }
            }
        }
    }
}

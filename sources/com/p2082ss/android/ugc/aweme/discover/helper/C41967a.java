package com.p2082ss.android.ugc.aweme.discover.helper;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.base.utils.C34712a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.a */
public final class C41967a implements C34712a.AbstractC34713a {

    /* renamed from: e */
    public static final C41968a f97879e = new C41968a((byte) 0);

    /* renamed from: a */
    final List<AbstractC41969b> f97880a = new ArrayList();

    /* renamed from: b */
    public boolean f97881b;

    /* renamed from: c */
    public boolean f97882c;

    /* renamed from: d */
    final List<AbstractC88412b> f97883d = new ArrayList();

    /* renamed from: f */
    private WeakReference<ActivityC0945e> f97884f;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$b */
    public interface AbstractC41969b {
        static {
            Covode.recordClassIndex(49899);
        }

        /* renamed from: a */
        void mo71141a();

        /* renamed from: b */
        void mo71142b();

        /* renamed from: c */
        void mo71143c();

        /* renamed from: d */
        void mo71144d();

        /* renamed from: e */
        void mo71145e();

        /* renamed from: f */
        void mo71146f();

        /* renamed from: g */
        void mo71147g();

        /* renamed from: h */
        void mo71148h();
    }

    static {
        Covode.recordClassIndex(49897);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$a */
    public static final class C41968a {
        static {
            Covode.recordClassIndex(49898);
        }

        private C41968a() {
        }

        public /* synthetic */ C41968a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$g */
    static final class C41974g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C41967a f97893a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97894b;

        static {
            Covode.recordClassIndex(49904);
        }

        C41974g(C41967a aVar, WeakReference weakReference) {
            this.f97893a = aVar;
            this.f97894b = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f97894b.get()) {
                this.f97893a.mo71138a(3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$h */
    static final class C41975h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C41967a f97895a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97896b;

        static {
            Covode.recordClassIndex(49905);
        }

        C41975h(C41967a aVar, WeakReference weakReference) {
            this.f97895a = aVar;
            this.f97896b = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f97896b.get()) {
                this.f97895a.mo71138a(4);
            }
        }
    }

    /* renamed from: a */
    public final void mo71139a(AbstractC41969b bVar) {
        C89219l.m154721d(bVar, "");
        this.f97880a.add(bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$c */
    static final class C41970c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C41967a f97885a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97886b;

        static {
            Covode.recordClassIndex(49900);
        }

        C41970c(C41967a aVar, WeakReference weakReference) {
            this.f97885a = aVar;
            this.f97886b = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Activity activity;
            C17873f.C17874a aVar = (C17873f.C17874a) obj;
            if (aVar != null) {
                activity = aVar.f42643a;
            } else {
                activity = null;
            }
            if (activity == this.f97886b.get()) {
                this.f97885a.mo71138a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$f */
    static final class C41973f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C41967a f97891a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97892b;

        static {
            Covode.recordClassIndex(49903);
        }

        C41973f(C41967a aVar, WeakReference weakReference) {
            this.f97891a = aVar;
            this.f97892b = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f97892b.get()) {
                this.f97891a.f97882c = false;
                if (this.f97891a.f97881b) {
                    this.f97891a.f97881b = false;
                } else {
                    this.f97891a.mo71138a(2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$i */
    static final class C41976i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C41967a f97897a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97898b;

        static {
            Covode.recordClassIndex(49906);
        }

        C41976i(C41967a aVar, WeakReference weakReference) {
            this.f97897a = aVar;
            this.f97898b = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f97898b.get()) {
                this.f97897a.f97882c = true;
                if (!this.f97897a.f97881b) {
                    this.f97897a.mo71138a(6);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$d */
    static final class C41971d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C41967a f97887a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97888b;

        static {
            Covode.recordClassIndex(49901);
        }

        C41971d(C41967a aVar, WeakReference weakReference) {
            this.f97887a = aVar;
            this.f97888b = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f97888b.get()) {
                this.f97887a.mo71138a(7);
                C41967a aVar = this.f97887a;
                for (T t : aVar.f97883d) {
                    if (t.isDisposed()) {
                        t.dispose();
                    }
                }
                C89219l.m154721d(aVar, "");
                C34712a.m70900a().remove(aVar);
                aVar.f97880a.clear();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$e */
    static final class C41972e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C41967a f97889a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f97890b;

        static {
            Covode.recordClassIndex(49902);
        }

        C41972e(C41967a aVar, WeakReference weakReference) {
            this.f97889a = aVar;
            this.f97890b = weakReference;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Activity activity;
            C17873f.C17875b bVar = (C17873f.C17875b) obj;
            if (bVar == null) {
                activity = null;
            } else if (bVar.f42646b) {
                if (!this.f97889a.f97882c) {
                    this.f97889a.f97881b = true;
                }
                if (bVar.f42645a == this.f97890b.get()) {
                    this.f97889a.mo71138a(5);
                    return;
                }
                return;
            } else {
                activity = bVar.f42645a;
            }
            if (activity == this.f97890b.get()) {
                this.f97889a.mo71138a(1);
            }
        }
    }

    /* renamed from: a */
    public final void mo71138a(int i) {
        for (T t : this.f97880a) {
            switch (i) {
                case 1:
                    t.mo71146f();
                    break;
                case 2:
                    t.mo71141a();
                    break;
                case 3:
                    t.mo71142b();
                    break;
                case 4:
                    t.mo71143c();
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    t.mo71145e();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    t.mo71144d();
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    t.mo71147g();
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    t.mo71148h();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo71140a(WeakReference<ActivityC0945e> weakReference) {
        C89219l.m154721d(weakReference, "");
        this.f97884f = weakReference;
        AbstractC88412b d = C17873f.m33092a().mo143289d(new C41970c(this, weakReference));
        if (d != null) {
            this.f97883d.add(d);
        }
        AbstractC88412b d2 = C17873f.m33094b().mo143289d(new C41973f(this, weakReference));
        if (d2 != null) {
            this.f97883d.add(d2);
        }
        AbstractC88412b d3 = C17873f.m33095c().mo143289d(new C41974g(this, weakReference));
        if (d3 != null) {
            this.f97883d.add(d3);
        }
        AbstractC88412b d4 = C17873f.m33096d().mo143289d(new C41975h(this, weakReference));
        if (d4 != null) {
            this.f97883d.add(d4);
        }
        AbstractC88412b d5 = C17873f.m33097e().mo143289d(new C41976i(this, weakReference));
        if (d5 != null) {
            this.f97883d.add(d5);
        }
        AbstractC88412b d6 = C17873f.m33098f().mo143289d(new C41971d(this, weakReference));
        if (d6 != null) {
            this.f97883d.add(d6);
        }
        AbstractC88412b d7 = C17873f.m33100h().mo143289d(new C41972e(this, weakReference));
        if (d7 != null) {
            this.f97883d.add(d7);
        }
        C34712a.m70901a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.utils.C34712a.AbstractC34713a
    /* renamed from: a */
    public final void mo61391a(Activity activity, boolean z) {
        ActivityC0945e eVar;
        C89219l.m154721d(activity, "");
        WeakReference<ActivityC0945e> weakReference = this.f97884f;
        if (weakReference != null) {
            eVar = weakReference.get();
        } else {
            eVar = null;
        }
        if (activity != eVar) {
            return;
        }
        if (z) {
            mo71138a(8);
        } else {
            mo71138a(9);
        }
    }
}

package com.facebook.drawee.p1851c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.drawee.p1850b.C24189a;
import com.facebook.drawee.p1850b.C24192b;
import com.facebook.drawee.p1850b.C24194c;
import com.facebook.drawee.p1856g.C24253a;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.p1857h.AbstractC24256b;
import com.facebook.drawee.p1857h.AbstractC24257c;
import com.facebook.imagepipeline.p1891p.C24644b;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.c.a */
public abstract class AbstractC24195a<T, INFO> implements C24189a.AbstractC24191a, C24253a.AbstractC24254a, AbstractC24255a {

    /* renamed from: a */
    private static final Class<?> f57269a = AbstractC24195a.class;

    /* renamed from: b */
    private final C24192b f57270b = C24192b.m45880a();

    /* renamed from: c */
    private final C24189a f57271c;

    /* renamed from: d */
    private final Executor f57272d;

    /* renamed from: e */
    private AbstractC24203d<INFO> f57273e;

    /* renamed from: f */
    C24194c f57274f;

    /* renamed from: g */
    public C24253a f57275g;

    /* renamed from: h */
    public AbstractC24204e f57276h;

    /* renamed from: i */
    public AbstractC24257c f57277i;

    /* renamed from: j */
    public Drawable f57278j;

    /* renamed from: k */
    public String f57279k;

    /* renamed from: l */
    public Object f57280l;

    /* renamed from: m */
    public boolean f57281m;

    /* renamed from: n */
    public boolean f57282n;

    /* renamed from: o */
    public boolean f57283o;

    /* renamed from: p */
    String f57284p;

    /* renamed from: q */
    private boolean f57285q;

    /* renamed from: r */
    private boolean f57286r;

    /* renamed from: s */
    private AbstractC24157c<T> f57287s;

    /* renamed from: t */
    private T f57288t;

    /* renamed from: u */
    private Drawable f57289u;

    /* renamed from: v */
    private boolean f57290v = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39779a(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39785a(T t);

    /* renamed from: a */
    public void mo39786a(String str, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC24157c<T> mo39788b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo39791c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract INFO mo39792c(T t);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Drawable mo39793d(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.drawee.c.a$a */
    public static class C24197a<INFO> extends C24205f<INFO> {
        static {
            Covode.recordClassIndex(28328);
        }

        private C24197a() {
        }

        /* renamed from: a */
        public static <INFO> C24197a<INFO> m45915a(AbstractC24203d<? super INFO> dVar, AbstractC24203d<? super INFO> dVar2) {
            C24644b.m47156a();
            C24197a<INFO> aVar = new C24197a<>();
            aVar.mo39830a(dVar);
            aVar.mo39830a(dVar2);
            C24644b.m47156a();
            return aVar;
        }
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24255a
    /* renamed from: e */
    public final AbstractC24256b mo39817e() {
        return this.f57277i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo39813a(String str, AbstractC24157c<T> cVar) {
        if (cVar == null && this.f57287s == null) {
            return true;
        }
        if (!str.equals(this.f57279k) || cVar != this.f57287s || !this.f57285q) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(28326);
    }

    /* renamed from: j */
    private AbstractC24203d<INFO> m45888j() {
        AbstractC24203d<INFO> dVar = this.f57273e;
        if (dVar == null) {
            return C24202c.getNoOpListener();
        }
        return dVar;
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24255a
    /* renamed from: i */
    public final Animatable mo39821i() {
        Drawable drawable = this.f57289u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    /* renamed from: k */
    private boolean m45889k() {
        C24194c cVar;
        if (!this.f57282n || (cVar = this.f57274f) == null || !cVar.mo39807b()) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.drawee.p1850b.C24189a.AbstractC24191a
    /* renamed from: d */
    public final void mo39803d() {
        this.f57270b.mo39804a(C24192b.EnumC24193a.ON_RELEASE_CONTROLLER);
        C24194c cVar = this.f57274f;
        if (cVar != null) {
            cVar.f57268c = 0;
        }
        C24253a aVar = this.f57275g;
        if (aVar != null) {
            aVar.mo39990b();
        }
        AbstractC24257c cVar2 = this.f57277i;
        if (cVar2 != null) {
            cVar2.mo39960b();
        }
        mo39778a();
    }

    /* renamed from: a */
    private void mo39778a() {
        boolean z = this.f57285q;
        this.f57285q = false;
        this.f57282n = false;
        AbstractC24157c<T> cVar = this.f57287s;
        if (cVar != null) {
            cVar.mo39750g();
            this.f57287s = null;
        }
        Drawable drawable = this.f57289u;
        if (drawable != null) {
            mo39779a(drawable);
        }
        if (this.f57284p != null) {
            this.f57284p = null;
        }
        this.f57289u = null;
        T t = this.f57288t;
        if (t != null) {
            m45886d("release", t);
            mo39785a((Object) this.f57288t);
            this.f57288t = null;
        }
        if (z) {
            m45888j().onRelease(this.f57279k);
        }
    }

    @Override // com.facebook.drawee.p1856g.C24253a.AbstractC24254a
    /* renamed from: h */
    public final boolean mo39820h() {
        if (C24099a.m45645a(2)) {
            C24099a.m45636a(f57269a, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f57279k);
        }
        if (!m45889k()) {
            return false;
        }
        this.f57274f.f57268c++;
        this.f57277i.mo39960b();
        m45890l();
        return true;
    }

    public String toString() {
        return C24088h.m45610a(this).mo39648a("isAttached", this.f57281m).mo39648a("isRequestSubmitted", this.f57285q).mo39648a("hasFetchFailed", this.f57282n).mo39646a("fetchedImage", mo39787b((Object) this.f57288t)).mo39647a("events", this.f57270b.toString()).toString();
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24255a
    /* renamed from: f */
    public final void mo39818f() {
        String str;
        C24644b.m47156a();
        if (C24099a.m45645a(2)) {
            Class<?> cls = f57269a;
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f57279k;
            if (this.f57285q) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            C24099a.m45637a(cls, "controller %x %s: onAttach: %s", valueOf, str2, str);
        }
        this.f57270b.mo39804a(C24192b.EnumC24193a.ON_ATTACH_CONTROLLER);
        C24091i.m45617a(this.f57277i);
        this.f57271c.mo39801a(this);
        this.f57281m = true;
        if (!this.f57285q) {
            m45890l();
        }
        C24644b.m47156a();
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24255a
    /* renamed from: g */
    public final void mo39819g() {
        C24644b.m47156a();
        if (C24099a.m45645a(2)) {
            C24099a.m45636a(f57269a, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f57279k);
        }
        this.f57270b.mo39804a(C24192b.EnumC24193a.ON_DETACH_CONTROLLER);
        this.f57281m = false;
        C24189a aVar = this.f57271c;
        C24189a.m45877b();
        if (aVar.f57258a.add(this) && aVar.f57258a.size() == 1) {
            aVar.f57259b.post(aVar.f57260c);
        }
        C24644b.m47156a();
    }

    /* renamed from: l */
    private void m45890l() {
        C24644b.m47156a();
        T c = mo39791c();
        if (c != null) {
            C24644b.m47156a();
            this.f57287s = null;
            this.f57285q = true;
            this.f57282n = false;
            this.f57270b.mo39804a(C24192b.EnumC24193a.ON_SUBMIT_CACHE_HIT);
            m45888j().onSubmit(this.f57279k, this.f57280l);
            mo39786a(this.f57279k, (Object) c);
            mo39809a(this.f57279k, this.f57287s, c, 1.0f, true, true, true);
            C24644b.m47156a();
            C24644b.m47156a();
            return;
        }
        this.f57270b.mo39804a(C24192b.EnumC24193a.ON_DATASOURCE_SUBMIT);
        m45888j().onSubmit(this.f57279k, this.f57280l);
        this.f57277i.mo39952a(0.0f, true);
        this.f57285q = true;
        this.f57282n = false;
        this.f57287s = mo39788b();
        if (C24099a.m45645a(2)) {
            C24099a.m45637a(f57269a, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f57279k, Integer.valueOf(System.identityHashCode(this.f57287s)));
        }
        final String str = this.f57279k;
        final boolean c2 = this.f57287s.mo39746c();
        this.f57287s.mo39739a(new AbstractC24156b<T>() {
            /* class com.facebook.drawee.p1851c.AbstractC24195a.C241961 */

            static {
                Covode.recordClassIndex(28327);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onFailureImpl(AbstractC24157c<T> cVar) {
                AbstractC24195a.this.mo39810a(str, cVar, cVar.mo39748e(), true);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onNewResultImpl(AbstractC24157c<T> cVar) {
                boolean b = cVar.mo39745b();
                float f = cVar.mo39749f();
                T d = cVar.mo39747d();
                if (d != null) {
                    AbstractC24195a.this.mo39809a(str, cVar, d, f, b, c2, false);
                } else if (b) {
                    AbstractC24195a.this.mo39810a(str, cVar, new NullPointerException(), true);
                }
            }

            @Override // com.facebook.p1844d.AbstractC24160e, com.facebook.p1844d.AbstractC24156b
            public final void onProgressUpdate(AbstractC24157c<T> cVar) {
                boolean b = cVar.mo39745b();
                float f = cVar.mo39749f();
                AbstractC24195a aVar = AbstractC24195a.this;
                if (!aVar.mo39813a(str, (AbstractC24157c) cVar)) {
                    aVar.mo39811a("ignore_old_datasource @ onProgress", (Throwable) null);
                    cVar.mo39750g();
                } else if (!b) {
                    aVar.f57277i.mo39952a(f, false);
                }
            }
        }, this.f57272d);
        C24644b.m47156a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo39787b(T t) {
        return System.identityHashCode(t);
    }

    /* renamed from: e */
    private static String m45887e(T t) {
        if (t != null) {
            return t.getClass().getSimpleName();
        }
        return "<null>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo39814b(Drawable drawable) {
        this.f57278j = drawable;
        AbstractC24257c cVar = this.f57277i;
        if (cVar != null) {
            cVar.mo39955a(drawable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.facebook.drawee.c.d<? super INFO> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo39808a(AbstractC24203d<? super INFO> dVar) {
        C24091i.m45617a(dVar);
        AbstractC24203d<INFO> dVar2 = this.f57273e;
        if (dVar2 instanceof C24197a) {
            ((C24205f) dVar2).mo39830a(dVar);
        } else if (dVar2 != null) {
            this.f57273e = C24197a.m45915a(dVar2, dVar);
        } else {
            this.f57273e = dVar;
        }
    }

    /* renamed from: b */
    public final void mo39815b(AbstractC24203d<? super INFO> dVar) {
        C24091i.m45617a(dVar);
        AbstractC24203d<INFO> dVar2 = this.f57273e;
        if (dVar2 instanceof C24197a) {
            ((C24205f) dVar2).mo39831b(dVar);
        } else if (dVar2 == dVar) {
            this.f57273e = null;
        }
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24255a
    /* renamed from: a */
    public void mo39783a(AbstractC24256b bVar) {
        C24192b.EnumC24193a aVar;
        if (C24099a.m45645a(2)) {
            C24099a.m45637a(f57269a, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f57279k, bVar);
        }
        C24192b bVar2 = this.f57270b;
        if (bVar != null) {
            aVar = C24192b.EnumC24193a.ON_SET_HIERARCHY;
        } else {
            aVar = C24192b.EnumC24193a.ON_CLEAR_HIERARCHY;
        }
        bVar2.mo39804a(aVar);
        if (this.f57285q) {
            this.f57271c.mo39801a(this);
            mo39803d();
        }
        AbstractC24257c cVar = this.f57277i;
        if (cVar != null) {
            cVar.mo39955a(null);
            this.f57277i = null;
        }
        if (bVar != null) {
            C24091i.m45620a(bVar instanceof AbstractC24257c);
            AbstractC24257c cVar2 = (AbstractC24257c) bVar;
            this.f57277i = cVar2;
            cVar2.mo39955a(this.f57278j);
        }
    }

    @Override // com.facebook.drawee.p1857h.AbstractC24255a
    /* renamed from: a */
    public final boolean mo39812a(MotionEvent motionEvent) {
        if (C24099a.m45645a(2)) {
            C24099a.m45637a(f57269a, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f57279k, motionEvent);
        }
        C24253a aVar = this.f57275g;
        if (aVar == null) {
            return false;
        }
        if (!aVar.f57511c && !m45889k()) {
            return false;
        }
        C24253a aVar2 = this.f57275g;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                aVar2.f57511c = false;
                if (Math.abs(motionEvent.getX() - aVar2.f57514f) > aVar2.f57510b || Math.abs(motionEvent.getY() - aVar2.f57515g) > aVar2.f57510b) {
                    aVar2.f57512d = false;
                }
                if (aVar2.f57512d && motionEvent.getEventTime() - aVar2.f57513e <= ((long) ViewConfiguration.getLongPressTimeout()) && aVar2.f57509a != null) {
                    aVar2.f57509a.mo39820h();
                }
            } else if (action != 2) {
                if (action == 3) {
                    aVar2.f57511c = false;
                }
            } else if (Math.abs(motionEvent.getX() - aVar2.f57514f) > aVar2.f57510b || Math.abs(motionEvent.getY() - aVar2.f57515g) > aVar2.f57510b) {
                aVar2.f57512d = false;
            }
            aVar2.f57512d = false;
        } else {
            aVar2.f57511c = true;
            aVar2.f57512d = true;
            aVar2.f57513e = motionEvent.getEventTime();
            aVar2.f57514f = motionEvent.getX();
            aVar2.f57515g = motionEvent.getY();
        }
        return true;
    }

    public AbstractC24195a(C24189a aVar, Executor executor) {
        this.f57271c = aVar;
        this.f57272d = executor;
        m45885c(null, null);
    }

    /* renamed from: d */
    private void m45886d(String str, T t) {
        if (C24099a.m45645a(2)) {
            C24099a.m45640a(f57269a, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f57279k, str, m45887e(t), Integer.valueOf(mo39787b((Object) t)));
        }
    }

    /* renamed from: b */
    public final void mo39816b(String str, Object obj) {
        m45885c(str, obj);
        this.f57290v = false;
    }

    /* renamed from: c */
    private synchronized void m45885c(String str, Object obj) {
        C24189a aVar;
        C24644b.m47156a();
        this.f57270b.mo39804a(C24192b.EnumC24193a.ON_INIT_CONTROLLER);
        if (!this.f57290v && (aVar = this.f57271c) != null) {
            aVar.mo39801a(this);
        }
        this.f57281m = false;
        this.f57286r = false;
        mo39778a();
        this.f57283o = false;
        C24194c cVar = this.f57274f;
        if (cVar != null) {
            cVar.mo39806a();
        }
        C24253a aVar2 = this.f57275g;
        if (aVar2 != null) {
            aVar2.mo39989a();
            this.f57275g.f57509a = this;
        }
        AbstractC24203d<INFO> dVar = this.f57273e;
        if (dVar instanceof C24197a) {
            ((C24197a) dVar).mo39829a();
        } else {
            this.f57273e = null;
        }
        this.f57276h = null;
        AbstractC24257c cVar2 = this.f57277i;
        if (cVar2 != null) {
            cVar2.mo39960b();
            this.f57277i.mo39955a(null);
            this.f57277i = null;
        }
        this.f57278j = null;
        if (C24099a.m45645a(2)) {
            C24099a.m45637a(f57269a, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f57279k, str);
        }
        this.f57279k = str;
        this.f57280l = obj;
        C24644b.m47156a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39811a(String str, Throwable th) {
        if (C24099a.m45645a(2)) {
            C24099a.m45638a(f57269a, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f57279k, str, th);
        }
    }

    /* renamed from: a */
    public final void mo39810a(String str, AbstractC24157c<T> cVar, Throwable th, boolean z) {
        C24192b.EnumC24193a aVar;
        Drawable drawable;
        C24644b.m47156a();
        if (!mo39813a(str, (AbstractC24157c) cVar)) {
            mo39811a("ignore_old_datasource @ onFailure", th);
            cVar.mo39750g();
            C24644b.m47156a();
            return;
        }
        C24192b bVar = this.f57270b;
        if (z) {
            aVar = C24192b.EnumC24193a.ON_DATASOURCE_FAILURE;
        } else {
            aVar = C24192b.EnumC24193a.ON_DATASOURCE_FAILURE_INT;
        }
        bVar.mo39804a(aVar);
        if (z) {
            mo39811a("final_failed @ onFailure", th);
            this.f57287s = null;
            this.f57282n = true;
            if (this.f57283o && (drawable = this.f57289u) != null) {
                this.f57277i.mo39956a(drawable, 1.0f, true);
            } else if (m45889k()) {
                this.f57277i.mo39969d();
            } else {
                this.f57277i.mo39965c();
            }
            m45888j().onFailure(this.f57279k, th);
        } else {
            mo39811a("intermediate_failed @ onFailure", th);
            m45888j().onIntermediateImageFailed(this.f57279k, th);
        }
        C24644b.m47156a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo39809a(String str, AbstractC24157c<T> cVar, T t, float f, boolean z, boolean z2, boolean z3) {
        C24192b.EnumC24193a aVar;
        try {
            C24644b.m47156a();
            if (!mo39813a(str, (AbstractC24157c) cVar)) {
                m45886d("ignore_old_datasource @ onNewResult", t);
                mo39785a((Object) t);
                cVar.mo39750g();
                C24644b.m47156a();
                return;
            }
            C24192b bVar = this.f57270b;
            if (z) {
                aVar = C24192b.EnumC24193a.ON_DATASOURCE_RESULT;
            } else {
                aVar = C24192b.EnumC24193a.ON_DATASOURCE_RESULT_INT;
            }
            bVar.mo39804a(aVar);
            try {
                Drawable d = mo39793d(t);
                T t2 = this.f57288t;
                Drawable drawable = this.f57289u;
                this.f57288t = t;
                this.f57289u = d;
                if (z) {
                    try {
                        m45886d("set_final_result @ onNewResult", t);
                        this.f57287s = null;
                        this.f57277i.mo39956a(d, 1.0f, z2);
                        m45888j().onFinalImageSet(str, mo39792c(t), mo39821i());
                    } catch (Throwable th) {
                        if (!(drawable == null || drawable == d)) {
                            mo39779a(drawable);
                        }
                        if (!(t2 == null || t2 == t)) {
                            m45886d("release_previous_result @ onNewResult", t2);
                            mo39785a((Object) t2);
                        }
                        throw th;
                    }
                } else if (z3) {
                    m45886d("set_temporary_result @ onNewResult", t);
                    this.f57277i.mo39956a(d, 1.0f, z2);
                    m45888j().onFinalImageSet(str, mo39792c(t), mo39821i());
                } else {
                    m45886d("set_intermediate_result @ onNewResult", t);
                    this.f57277i.mo39956a(d, f, z2);
                    m45888j().onIntermediateImageSet(str, mo39792c(t));
                }
                if (!(drawable == null || drawable == d)) {
                    mo39779a(drawable);
                }
                if (!(t2 == null || t2 == t)) {
                    m45886d("release_previous_result @ onNewResult", t2);
                    mo39785a((Object) t2);
                }
                C24644b.m47156a();
            } catch (Exception e) {
                m45886d("drawable_failed @ onNewResult", t);
                mo39785a((Object) t);
                mo39810a(str, cVar, e, z);
                C24644b.m47156a();
            }
        } catch (Throwable th2) {
            C24644b.m47156a();
            throw th2;
        }
    }
}

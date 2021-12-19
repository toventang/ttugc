package com.bytedance.als;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.als.dsl.C2554e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

public final class AlsLogicContainer implements AbstractC33974au {

    /* renamed from: a */
    public final AbstractC1196i f7693a;

    /* renamed from: b */
    public final LinkedHashSet<AbstractC2562j<?>> f7694b;

    /* renamed from: c */
    public final Set<AbstractC2562j<?>> f7695c;

    /* renamed from: d */
    public final C21597n f7696d;

    /* renamed from: e */
    public C21582f f7697e;

    /* renamed from: f */
    public final List<Class<AbstractC2562j<?>>> f7698f;

    /* renamed from: g */
    public final ApiCenter f7699g;

    /* renamed from: h */
    private C21582f f7700h;

    /* renamed from: i */
    private final C2554e f7701i;

    static {
        Covode.recordClassIndex(2923);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onActivityCreated();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroyView();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onActivityCreated() {
        Iterator<T> it = this.f7694b.iterator();
        while (it.hasNext()) {
            m7442a(it.next(), AbstractC1196i.EnumC1199b.CREATED);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroyView() {
        Iterator<T> it = this.f7694b.iterator();
        while (it.hasNext()) {
            m7442a(it.next(), AbstractC1196i.EnumC1199b.DESTROYED);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        Iterator<T> it = this.f7694b.iterator();
        while (it.hasNext()) {
            m7442a(it.next(), AbstractC1196i.EnumC1199b.STARTED);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        Iterator<T> it = this.f7694b.iterator();
        while (it.hasNext()) {
            m7442a(it.next(), AbstractC1196i.EnumC1199b.RESUMED);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        Iterator<T> it = this.f7694b.iterator();
        while (it.hasNext()) {
            m7442a(it.next(), AbstractC1196i.EnumC1199b.STARTED);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        Iterator<T> it = this.f7694b.iterator();
        while (it.hasNext()) {
            m7442a(it.next(), AbstractC1196i.EnumC1199b.CREATED);
        }
    }

    /* renamed from: com.bytedance.als.AlsLogicContainer$a */
    public static final class C2544a extends AbstractC21603p<A> {

        /* renamed from: a */
        final /* synthetic */ Class f7702a;

        static {
            Covode.recordClassIndex(2924);
        }

        C2544a(Class cls) {
            this.f7702a = cls;
        }

        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ Object get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return ((AbstractC2562j) fVar.mo35247a(this.f7702a)).getApiComponent();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.bytedance.o.n$a<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m7443a(Class<?> cls, C21597n.C21600a<?> aVar) {
        Class<?>[] interfaces = cls.getInterfaces();
        C89219l.m154716b(interfaces, "");
        for (Class<?> cls2 : interfaces) {
            if ((!C89219l.m154714a(cls2, AbstractC2547b.class)) && AbstractC2547b.class.isAssignableFrom(cls2)) {
                Objects.requireNonNull(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                aVar.mo35263a(cls2);
                m7443a(cls2, aVar);
            }
        }
    }

    /* renamed from: a */
    public final <A extends AbstractC2547b, B extends AbstractC2562j<A>> void mo7005a(Class<A> cls, Class<B> cls2) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(cls2, "");
        if (!C89219l.m154714a(cls, AbstractC2547b.class)) {
            C21597n.C21600a<?> a = this.f7696d.mo35259a(cls, new C2544a(cls2));
            C89219l.m154716b(a, "");
            m7443a((Class<?>) cls, a);
        }
        this.f7698f.add(cls2);
    }

    /* renamed from: a */
    private final void m7442a(AbstractC2562j<?> jVar, AbstractC1196i.EnumC1199b bVar) {
        int i = C2546a.f7710a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) >= 0) {
                            jVar.onPause();
                        }
                        if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) >= 0) {
                            jVar.onStop();
                        }
                        if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) >= 0) {
                            jVar.onDestroy();
                            AbstractC2547b apiComponent = jVar.getApiComponent();
                            if (!C89219l.m154714a(apiComponent, AbstractC2547b.class)) {
                                this.f7699g.mo7016b(apiComponent);
                            }
                        }
                    }
                } else if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.RESUMED) < 0) {
                    if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                        jVar.onCreate();
                    }
                    if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                        jVar.onStart();
                    }
                    jVar.onResume();
                }
            } else if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) < 0) {
                if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
                    jVar.onCreate();
                }
                jVar.onStart();
            } else if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                jVar.onPause();
            }
        } else if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
            jVar.onCreate();
        } else {
            if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.STARTED) > 0) {
                jVar.onPause();
            }
            if (jVar.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) > 0) {
                jVar.onStop();
            }
        }
    }

    public AlsLogicContainer(AbstractC1196i iVar, ApiCenter apiCenter, C21582f fVar, C2554e eVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(apiCenter, "");
        C89219l.m154721d(eVar, "");
        this.f7699g = apiCenter;
        this.f7700h = fVar;
        this.f7701i = eVar;
        this.f7693a = iVar;
        LinkedHashSet<AbstractC2562j<?>> linkedHashSet = new LinkedHashSet<>();
        this.f7694b = linkedHashSet;
        this.f7695c = linkedHashSet;
        iVar.mo4012a(this);
        if (this.f7700h == null) {
            this.f7700h = new C21597n(null, eVar.f7721a).mo35258a();
        }
        this.f7696d = new C21597n(this.f7700h, eVar.f7721a);
        this.f7698f = new ArrayList();
    }
}

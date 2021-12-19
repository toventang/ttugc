package com.bytedance.ui_component;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1184ah;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20371ai;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.ui_component.AbstractC23517a;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.ui_component.b */
public abstract class AbstractC23520b<T extends JediViewModel<? extends UiState> & AbstractC1204m & AbstractC2547b> extends AbstractC2562j<T> implements AbstractC20527q {

    /* renamed from: h */
    public static final AbstractC89244h f55721h = C89250i.m154773a((AbstractC89171a) C23522b.f55728a);

    /* renamed from: i */
    public static final AbstractC89244h f55722i = C89250i.m154773a((AbstractC89171a) C23523c.f55729a);

    /* renamed from: j */
    public static final C23521a f55723j = new C23521a((byte) 0);

    /* renamed from: a */
    private final AbstractC20534v f55724a = new C23529g(this);

    /* renamed from: b */
    private final AbstractC89244h f55725b = C89250i.m154774a(EnumC89331m.NONE, new C23524d(this));

    /* renamed from: c */
    private final AbstractC89244h f55726c = C89250i.m154774a(EnumC89331m.NONE, new C23525e(this));

    /* renamed from: g */
    public final AbstractC89171a<String> f55727g = C23528f.f55734a;

    /* renamed from: com.bytedance.ui_component.b$f */
    static final class C23528f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C23528f f55734a = new C23528f();

        static {
            Covode.recordClassIndex(27564);
        }

        C23528f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    /* renamed from: b */
    public abstract AbstractC89171a<T> mo23031b();

    /* renamed from: c */
    public abstract void mo23032c();

    /* renamed from: d */
    public void mo23033d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract AbstractC22186b mo23034e();

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: k */
    public final C1182af mo38335k() {
        return (C1182af) this.f55725b.getValue();
    }

    /* renamed from: l */
    public final T getApiComponent() {
        return (T) ((JediViewModel) this.f55726c.getValue());
    }

    /* renamed from: com.bytedance.ui_component.b$a */
    public static final class C23521a {
        static {
            Covode.recordClassIndex(27557);
        }

        private C23521a() {
        }

        public /* synthetic */ C23521a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ui_component.b$g */
    public static final class C23529g implements AbstractC20534v {

        /* renamed from: a */
        public final AbstractC23520b<T> f55735a;

        /* renamed from: b */
        final /* synthetic */ AbstractC23520b f55736b;

        static {
            Covode.recordClassIndex(27565);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20534v
        public final /* bridge */ /* synthetic */ AbstractC1204m getLifecycleOwner() {
            return this.f55735a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23529g(AbstractC23520b bVar) {
            this.f55736b = bVar;
            this.f55735a = bVar;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this.f55724a;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: j */
    public final T mo38334j() {
        return getApiComponent();
    }

    /* renamed from: com.bytedance.ui_component.b$b */
    static final class C23522b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C23522b f55728a = new C23522b();

        static {
            Covode.recordClassIndex(27558);
        }

        C23522b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.ui_component.b$d */
    static final class C23524d extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23520b f55730a;

        static {
            Covode.recordClassIndex(27560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23524d(AbstractC23520b bVar) {
            super(0);
            this.f55730a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1182af invoke() {
            return C1184ah.m3886a(C22228c.m41832b(this.f55730a.mo23034e()));
        }
    }

    static {
        Covode.recordClassIndex(27556);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        T l = getApiComponent();
        Objects.requireNonNull(l, "null cannot be cast to non-null type com.bytedance.ui_component.LifecycleAwareViewModel<com.bytedance.ui_component.UiState>");
        selectSubscribe((LifecycleAwareViewModel) l, C23532c.f55739a, C20371ai.m38578b(), new C23530h(this));
    }

    /* renamed from: com.bytedance.ui_component.b$c */
    static final class C23523c extends AbstractC89220m implements AbstractC89171a<Field> {

        /* renamed from: a */
        public static final C23523c f55729a = new C23523c();

        static {
            Covode.recordClassIndex(27559);
        }

        C23523c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Field invoke() {
            Type[] actualTypeArguments;
            Field[] declaredFields = C1182af.class.getDeclaredFields();
            C89219l.m154716b(declaredFields, "");
            for (Field field : declaredFields) {
                C89219l.m154716b(field, "");
                if (HashMap.class.isAssignableFrom(field.getType())) {
                    Type genericType = field.getGenericType();
                    if (!(genericType instanceof ParameterizedType)) {
                        genericType = null;
                    }
                    ParameterizedType parameterizedType = (ParameterizedType) genericType;
                    if (!(parameterizedType == null || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length == 0 || actualTypeArguments.length != 2)) {
                        Type type = actualTypeArguments[0];
                        Type type2 = actualTypeArguments[1];
                        if (C89219l.m154714a(type, String.class) && C89219l.m154714a(type2, AbstractC1174ac.class)) {
                            field.setAccessible(true);
                            C89219l.m154716b(field, "");
                            return field;
                        }
                    }
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    /* renamed from: com.bytedance.ui_component.b$e */
    static final class C23525e extends AbstractC89220m implements AbstractC89171a<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23520b f55731a;

        static {
            Covode.recordClassIndex(27561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23525e(AbstractC23520b bVar) {
            super(0);
            this.f55731a = bVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            JediViewModel jediViewModel = (JediViewModel) this.f55731a.mo23031b().invoke();
            if (jediViewModel instanceof LifecycleAwareViewModel) {
                AbstractC1196i lifecycle = this.f55731a.getLifecycle();
                C89219l.m154721d(lifecycle, "");
                ((LifecycleAwareViewModel) jediViewModel).f55719k = lifecycle;
            }
            C1175ad adVar = new C1175ad(this.f55731a.mo38335k(), new C23526a(jediViewModel));
            String invoke = this.f55731a.f55727g.invoke();
            if (invoke.length() == 0) {
                invoke = jediViewModel.getClass().getCanonicalName();
            }
            String str = invoke;
            Class<?> cls = jediViewModel.getClass();
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }

        /* renamed from: com.bytedance.ui_component.b$e$a */
        public static final class C23526a implements C1175ad.AbstractC1177b {

            /* renamed from: a */
            final /* synthetic */ JediViewModel f55732a;

            static {
                Covode.recordClassIndex(27562);
            }

            /* renamed from: com.bytedance.ui_component.b$e$a$a */
            static final class C23527a extends AbstractC89220m implements AbstractC89172b<UiState, UiState> {

                /* renamed from: a */
                public static final C23527a f55733a = new C23527a();

                static {
                    Covode.recordClassIndex(27563);
                }

                C23527a() {
                    super(1);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ UiState invoke(UiState uiState) {
                    C89219l.m154721d(uiState, "");
                    return uiState;
                }
            }

            C23526a(JediViewModel jediViewModel) {
                this.f55732a = jediViewModel;
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <VM extends AbstractC1174ac> VM mo3261a(Class<VM> cls) {
                C89219l.m154721d(cls, "");
                JediViewModel jediViewModel = this.f55732a;
                Objects.requireNonNull(jediViewModel, "null cannot be cast to non-null type com.bytedance.jedi.arch.JediViewModel<com.bytedance.ui_component.UiState>");
                jediViewModel.mo33686a_(C23527a.f55733a);
                return jediViewModel;
            }
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onDestroy() {
        super.onDestroy();
        C1182af k = mo38335k();
        C89219l.m154716b(k, "");
        String invoke = this.f55727g.invoke();
        if (invoke.length() == 0) {
            invoke = getApiComponent().getClass().getCanonicalName();
        }
        C89219l.m154716b(invoke, "");
        C89219l.m154721d(k, "");
        C89219l.m154721d(invoke, "");
        Object obj = ((Field) f55722i.getValue()).get(k);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.HashMap<*, *> /* = java.util.HashMap<*, *> */");
        HashMap hashMap = (HashMap) obj;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        C89206ad.m154686h(hashMap).remove(invoke);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.bytedance.ui_component.b$h */
    static final class C23530h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, AbstractC23517a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC23520b f55737a;

        static {
            Covode.recordClassIndex(27566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23530h(AbstractC23520b bVar) {
            super(2);
            this.f55737a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, AbstractC23517a aVar) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(aVar, "");
            try {
                if (aVar instanceof AbstractC23517a.C23519b) {
                    this.f55737a.mo23032c();
                } else {
                    this.f55737a.mo23033d();
                }
            } catch (Throwable th) {
                ((Handler) AbstractC23520b.f55721h.getValue()).post(new Runnable() {
                    /* class com.bytedance.ui_component.AbstractC23520b.C23530h.RunnableC235311 */

                    static {
                        Covode.recordClassIndex(27567);
                    }

                    public final void run() {
                        throw th;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

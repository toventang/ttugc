package com.bytedance.android.livesdk.p454aq;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.aq.a */
public final class C6814a<STATE, EVENT, SIDE_EFFECT> {

    /* renamed from: b */
    public static final C6815a f17087b = new C6815a((byte) 0);

    /* renamed from: a */
    public final C6816b<STATE, EVENT, SIDE_EFFECT> f17088a;

    /* renamed from: c */
    private final AtomicReference<STATE> f17089c;

    /* renamed from: com.bytedance.android.livesdk.aq.a$d */
    public static final class C6822d<T, R extends T> {

        /* renamed from: b */
        public static final C6823a f17104b = new C6823a((byte) 0);

        /* renamed from: a */
        public final Class<R> f17105a;

        /* renamed from: c */
        private final List<AbstractC89172b<T, Boolean>> f17106c;

        static {
            Covode.recordClassIndex(7560);
        }

        /* renamed from: com.bytedance.android.livesdk.aq.a$d$a */
        public static final class C6823a {
            static {
                Covode.recordClassIndex(7561);
            }

            private C6823a() {
            }

            public /* synthetic */ C6823a(byte b) {
                this();
            }

            /* renamed from: a */
            public static <T, R extends T> C6822d<T, R> m14611a(Class<R> cls) {
                C89219l.m154721d(cls, "");
                return new C6822d<>(cls, (byte) 0);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.aq.a$d$b */
        static final class C6824b extends AbstractC89220m implements AbstractC89172b<T, Boolean> {

            /* renamed from: a */
            final /* synthetic */ C6822d f17107a;

            static {
                Covode.recordClassIndex(7562);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6824b(C6822d dVar) {
                super(1);
                this.f17107a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(Object obj) {
                C89219l.m154721d(obj, "");
                return Boolean.valueOf(this.f17107a.f17105a.isInstance(obj));
            }
        }

        private C6822d(Class<R> cls) {
            this.f17105a = cls;
            this.f17106c = C89070n.m154524c(new C6824b(this));
        }

        /* renamed from: a */
        public final boolean mo13079a(T t) {
            C89219l.m154721d(t, "");
            List<AbstractC89172b<T, Boolean>> list = this.f17106c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next().invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ C6822d(Class cls, byte b) {
            this(cls);
        }
    }

    static {
        Covode.recordClassIndex(7552);
    }

    /* renamed from: com.bytedance.android.livesdk.aq.a$a */
    public static final class C6815a {
        static {
            Covode.recordClassIndex(7553);
        }

        private C6815a() {
        }

        public /* synthetic */ C6815a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.aq.a$e */
    public static abstract class AbstractC6825e<STATE, EVENT, SIDE_EFFECT> {
        static {
            Covode.recordClassIndex(7563);
        }

        private AbstractC6825e() {
        }

        /* renamed from: com.bytedance.android.livesdk.aq.a$e$a */
        public static final class C6826a<STATE, EVENT, SIDE_EFFECT> extends AbstractC6825e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            private final STATE f17108a;

            /* renamed from: b */
            private final EVENT f17109b;

            static {
                Covode.recordClassIndex(7564);
            }

            public final int hashCode() {
                int i;
                STATE state = this.f17108a;
                int i2 = 0;
                if (state != null) {
                    i = state.hashCode();
                } else {
                    i = 0;
                }
                int i3 = i * 31;
                EVENT event = this.f17109b;
                if (event != null) {
                    i2 = event.hashCode();
                }
                return i3 + i2;
            }

            public final String toString() {
                return "Invalid(fromState=" + ((Object) this.f17108a) + ", event=" + ((Object) this.f17109b) + ")";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6826a)) {
                    return false;
                }
                C6826a aVar = (C6826a) obj;
                if (!C89219l.m154714a((Object) this.f17108a, (Object) aVar.f17108a) || !C89219l.m154714a((Object) this.f17109b, (Object) aVar.f17109b)) {
                    return false;
                }
                return true;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6826a(STATE state, EVENT event) {
                super((byte) 0);
                C89219l.m154721d(state, "");
                C89219l.m154721d(event, "");
                this.f17108a = state;
                this.f17109b = event;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.aq.a$e$b */
        public static final class C6827b<STATE, EVENT, SIDE_EFFECT> extends AbstractC6825e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            final STATE f17110a;

            /* renamed from: b */
            public final STATE f17111b;

            /* renamed from: c */
            public final SIDE_EFFECT f17112c;

            /* renamed from: d */
            private final EVENT f17113d;

            static {
                Covode.recordClassIndex(7565);
            }

            public final int hashCode() {
                int i;
                int i2;
                int i3;
                STATE state = this.f17110a;
                int i4 = 0;
                if (state != null) {
                    i = state.hashCode();
                } else {
                    i = 0;
                }
                int i5 = i * 31;
                EVENT event = this.f17113d;
                if (event != null) {
                    i2 = event.hashCode();
                } else {
                    i2 = 0;
                }
                int i6 = (i5 + i2) * 31;
                STATE state2 = this.f17111b;
                if (state2 != null) {
                    i3 = state2.hashCode();
                } else {
                    i3 = 0;
                }
                int i7 = (i6 + i3) * 31;
                SIDE_EFFECT side_effect = this.f17112c;
                if (side_effect != null) {
                    i4 = side_effect.hashCode();
                }
                return i7 + i4;
            }

            public final String toString() {
                return "Valid(fromState=" + ((Object) this.f17110a) + ", event=" + ((Object) this.f17113d) + ", toState=" + ((Object) this.f17111b) + ", sideEffect=" + ((Object) this.f17112c) + ")";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6827b)) {
                    return false;
                }
                C6827b bVar = (C6827b) obj;
                if (!C89219l.m154714a((Object) this.f17110a, (Object) bVar.f17110a) || !C89219l.m154714a((Object) this.f17113d, (Object) bVar.f17113d) || !C89219l.m154714a((Object) this.f17111b, (Object) bVar.f17111b) || !C89219l.m154714a((Object) this.f17112c, (Object) bVar.f17112c)) {
                    return false;
                }
                return true;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C6827b(STATE state, EVENT event, STATE state2, SIDE_EFFECT side_effect) {
                super((byte) 0);
                C89219l.m154721d(state, "");
                C89219l.m154721d(event, "");
                C89219l.m154721d(state2, "");
                this.f17110a = state;
                this.f17113d = event;
                this.f17111b = state2;
                this.f17112c = side_effect;
            }
        }

        public /* synthetic */ AbstractC6825e(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.aq.a$c */
    public static final class C6819c<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        public STATE f17098a = null;

        /* renamed from: b */
        public final LinkedHashMap<C6822d<STATE, STATE>, C6816b.C6817a<STATE, EVENT, SIDE_EFFECT>> f17099b = new LinkedHashMap<>(C89041ag.m154415a());

        /* renamed from: c */
        public final ArrayList<AbstractC89172b<AbstractC6825e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C89391z>> f17100c = new ArrayList<>(C89086z.INSTANCE);

        static {
            Covode.recordClassIndex(7557);
        }

        /* JADX WARN: Unknown type variable: STATE in type: com.bytedance.android.livesdk.aq.a$b$a<STATE, EVENT, SIDE_EFFECT> */
        /* JADX WARN: Unknown type variable: EVENT in type: com.bytedance.android.livesdk.aq.a$b$a<STATE, EVENT, SIDE_EFFECT> */
        /* JADX WARN: Unknown type variable: SIDE_EFFECT in type: com.bytedance.android.livesdk.aq.a$b$a<STATE, EVENT, SIDE_EFFECT> */
        /* renamed from: com.bytedance.android.livesdk.aq.a$c$a */
        public final class C6820a<S extends STATE> {

            /* renamed from: a */
            public final C6816b.C6817a<STATE, EVENT, SIDE_EFFECT> f17101a = new C6816b.C6817a<>();

            static {
                Covode.recordClassIndex(7558);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            public C6820a() {
            }

            /* renamed from: com.bytedance.android.livesdk.aq.a$c$a$a */
            static final class C6821a extends AbstractC89220m implements AbstractC89183m<STATE, EVENT, C6816b.C6817a.C6818a<? extends STATE, ? extends SIDE_EFFECT>> {

                /* renamed from: a */
                final /* synthetic */ AbstractC89183m f17103a;

                static {
                    Covode.recordClassIndex(7559);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C6821a(AbstractC89183m mVar) {
                    super(2);
                    this.f17103a = mVar;
                }

                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    C89219l.m154721d(obj, "");
                    C89219l.m154721d(obj2, "");
                    return this.f17103a.invoke(obj, obj2);
                }
            }

            /* renamed from: a */
            public final <E extends EVENT> void mo13078a(C6822d<EVENT, ? extends E> dVar, AbstractC89183m<? super S, ? super E, ? extends C6816b.C6817a.C6818a<? extends STATE, ? extends SIDE_EFFECT>> mVar) {
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(mVar, "");
                this.f17101a.f17095c.put(dVar, new C6821a(mVar));
            }

            /* renamed from: a */
            public static C6816b.C6817a.C6818a<STATE, SIDE_EFFECT> m14608a(S s, STATE state, SIDE_EFFECT side_effect) {
                C89219l.m154721d(s, "");
                C89219l.m154721d(state, "");
                return new C6816b.C6817a.C6818a<>(state, side_effect);
            }
        }

        /* renamed from: a */
        public final <S extends STATE> void mo13077a(C6822d<STATE, ? extends S> dVar, AbstractC89172b<? super C6819c<STATE, EVENT, SIDE_EFFECT>.C6820a, C89391z> bVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(bVar, "");
            LinkedHashMap<C6822d<STATE, STATE>, C6816b.C6817a<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.f17099b;
            C6820a aVar = new C6820a();
            bVar.invoke(aVar);
            linkedHashMap.put(dVar, aVar.f17101a);
        }
    }

    private C6814a(C6816b<STATE, EVENT, SIDE_EFFECT> bVar) {
        this.f17088a = bVar;
        this.f17089c = new AtomicReference<>(bVar.f17090a);
    }

    /* renamed from: b */
    private final C6816b.C6817a<STATE, EVENT, SIDE_EFFECT> m14605b(STATE state) {
        Map<C6822d<STATE, STATE>, C6816b.C6817a<STATE, EVENT, SIDE_EFFECT>> map = this.f17088a.f17091b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<C6822d<STATE, STATE>, C6816b.C6817a<STATE, EVENT, SIDE_EFFECT>> entry : map.entrySet()) {
            if (entry.getKey().mo13079a(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(entry2.getValue());
        }
        C6816b.C6817a<STATE, EVENT, SIDE_EFFECT> aVar = (C6816b.C6817a) C89070n.m154583g((List) arrayList);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Missing definition for state " + state.getClass().getSimpleName() + '!').toString());
    }

    /* renamed from: a */
    public final AbstractC6825e<STATE, EVENT, SIDE_EFFECT> mo13070a(EVENT event) {
        AbstractC6825e<STATE, EVENT, SIDE_EFFECT> aVar;
        MethodCollector.m26663i(10807);
        C89219l.m154721d(event, "");
        synchronized (this) {
            try {
                STATE state = this.f17089c.get();
                C89219l.m154716b(state, "");
                Iterator<Map.Entry<C6822d<EVENT, EVENT>, AbstractC89183m<STATE, EVENT, C6816b.C6817a.C6818a<STATE, SIDE_EFFECT>>>> it = m14605b(state).f17095c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = new AbstractC6825e.C6826a<>(state, event);
                        break;
                    }
                    Map.Entry<C6822d<EVENT, EVENT>, AbstractC89183m<STATE, EVENT, C6816b.C6817a.C6818a<STATE, SIDE_EFFECT>>> next = it.next();
                    AbstractC89183m<STATE, EVENT, C6816b.C6817a.C6818a<STATE, SIDE_EFFECT>> value = next.getValue();
                    if (next.getKey().mo13079a(event)) {
                        C6816b.C6817a.C6818a<STATE, SIDE_EFFECT> invoke = value.invoke(state, event);
                        aVar = new AbstractC6825e.C6827b<>(state, event, invoke.f17096a, invoke.f17097b);
                        break;
                    }
                }
                if (aVar instanceof AbstractC6825e.C6827b) {
                    this.f17089c.set(((AbstractC6825e.C6827b) aVar).f17111b);
                }
            } finally {
                MethodCollector.m26664o(10807);
            }
        }
        Iterator<T> it2 = this.f17088a.f17092c.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(aVar);
        }
        if (aVar instanceof AbstractC6825e.C6827b) {
            AbstractC6825e.C6827b bVar = (AbstractC6825e.C6827b) aVar;
            STATE state2 = bVar.f17110a;
            Iterator<T> it3 = m14605b(state2).f17094b.iterator();
            while (it3.hasNext()) {
                it3.next().invoke(state2, event);
            }
            STATE state3 = bVar.f17111b;
            Iterator<T> it4 = m14605b(state3).f17093a.iterator();
            while (it4.hasNext()) {
                it4.next().invoke(state3, event);
            }
        }
        return aVar;
    }

    public /* synthetic */ C6814a(C6816b bVar, byte b) {
        this(bVar);
    }

    /* renamed from: com.bytedance.android.livesdk.aq.a$b */
    public static final class C6816b<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        public final STATE f17090a;

        /* renamed from: b */
        public final Map<C6822d<STATE, STATE>, C6817a<STATE, EVENT, SIDE_EFFECT>> f17091b;

        /* renamed from: c */
        public final List<AbstractC89172b<AbstractC6825e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C89391z>> f17092c;

        static {
            Covode.recordClassIndex(7554);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6816b)) {
                return false;
            }
            C6816b bVar = (C6816b) obj;
            return C89219l.m154714a(this.f17090a, bVar.f17090a) && C89219l.m154714a(this.f17091b, bVar.f17091b) && C89219l.m154714a(this.f17092c, bVar.f17092c);
        }

        public final int hashCode() {
            STATE state = this.f17090a;
            int i = 0;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            Map<C6822d<STATE, STATE>, C6817a<STATE, EVENT, SIDE_EFFECT>> map = this.f17091b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            List<AbstractC89172b<AbstractC6825e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C89391z>> list = this.f17092c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Graph(initialState=" + ((Object) this.f17090a) + ", stateDefinitions=" + this.f17091b + ", onTransitionListeners=" + this.f17092c + ")";
        }

        /* renamed from: com.bytedance.android.livesdk.aq.a$b$a */
        public static final class C6817a<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            public final List<AbstractC89183m<STATE, EVENT, C89391z>> f17093a = new ArrayList();

            /* renamed from: b */
            public final List<AbstractC89183m<STATE, EVENT, C89391z>> f17094b = new ArrayList();

            /* renamed from: c */
            public final LinkedHashMap<C6822d<EVENT, EVENT>, AbstractC89183m<STATE, EVENT, C6818a<STATE, SIDE_EFFECT>>> f17095c = new LinkedHashMap<>();

            static {
                Covode.recordClassIndex(7555);
            }

            /* renamed from: com.bytedance.android.livesdk.aq.a$b$a$a */
            public static final class C6818a<STATE, SIDE_EFFECT> {

                /* renamed from: a */
                public final STATE f17096a;

                /* renamed from: b */
                public final SIDE_EFFECT f17097b;

                static {
                    Covode.recordClassIndex(7556);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C6818a)) {
                        return false;
                    }
                    C6818a aVar = (C6818a) obj;
                    return C89219l.m154714a(this.f17096a, aVar.f17096a) && C89219l.m154714a(this.f17097b, aVar.f17097b);
                }

                public final int hashCode() {
                    STATE state = this.f17096a;
                    int i = 0;
                    int hashCode = (state != null ? state.hashCode() : 0) * 31;
                    SIDE_EFFECT side_effect = this.f17097b;
                    if (side_effect != null) {
                        i = side_effect.hashCode();
                    }
                    return hashCode + i;
                }

                public final String toString() {
                    return "TransitionTo(toState=" + ((Object) this.f17096a) + ", sideEffect=" + ((Object) this.f17097b) + ")";
                }

                public C6818a(STATE state, SIDE_EFFECT side_effect) {
                    C89219l.m154721d(state, "");
                    this.f17096a = state;
                    this.f17097b = side_effect;
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends h.f.a.b<? super com.bytedance.android.livesdk.aq.a$e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, h.z>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C6816b(STATE state, Map<C6822d<STATE, STATE>, C6817a<STATE, EVENT, SIDE_EFFECT>> map, List<? extends AbstractC89172b<? super AbstractC6825e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C89391z>> list) {
            C89219l.m154721d(state, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(list, "");
            this.f17090a = state;
            this.f17091b = map;
            this.f17092c = list;
        }
    }
}

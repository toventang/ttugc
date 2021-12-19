package com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88431d;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c */
public abstract class AbstractC76621c<SUBSCRIBE_DATA, OUTPUT_DATA> {

    /* renamed from: a */
    final ConcurrentHashMap<AbstractC76618d, Set<StoryReceiver>> f171954a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public AbstractC88431d<C76622a<SUBSCRIBE_DATA, OUTPUT_DATA>, C76622a<SUBSCRIBE_DATA, OUTPUT_DATA>> f171955b;

    /* renamed from: c */
    private final C88958b<C76622a<SUBSCRIBE_DATA, OUTPUT_DATA>> f171956c;

    static {
        Covode.recordClassIndex(89608);
    }

    /* renamed from: a */
    public abstract Object mo120327a(SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data);

    /* renamed from: b */
    public abstract List<AbstractC89290k<SUBSCRIBE_DATA, ?>> mo120330b(SUBSCRIBE_DATA subscribe_data, SUBSCRIBE_DATA subscribe_data2);

    /* renamed from: a */
    public final AbstractC88979t<C76622a<SUBSCRIBE_DATA, OUTPUT_DATA>> mo120326a() {
        AbstractC88979t<C76622a<SUBSCRIBE_DATA, OUTPUT_DATA>> c = this.f171956c.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    public AbstractC76621c() {
        C88958b<C76622a<SUBSCRIBE_DATA, OUTPUT_DATA>> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f171956c = bVar;
        this.f171955b = new C76623b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c$c */
    static final class C76624c extends AbstractC89220m implements AbstractC89172b<StoryReceiver, Boolean> {

        /* renamed from: a */
        final /* synthetic */ StoryReceiver f171962a;

        static {
            Covode.recordClassIndex(89611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76624c(StoryReceiver storyReceiver) {
            super(1);
            this.f171962a = storyReceiver;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(StoryReceiver storyReceiver) {
            boolean z;
            StoryReceiver storyReceiver2 = storyReceiver;
            C89219l.m154721d(storyReceiver2, "");
            if (C89219l.m154714a(storyReceiver2.f171951b, this.f171962a.f171951b)) {
                AbstractC88412b bVar = storyReceiver2.f171950a;
                if (bVar != null) {
                    bVar.dispose();
                }
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c$d */
    static final class C76625d extends AbstractC89220m implements AbstractC89172b<StoryReceiver, Boolean> {

        /* renamed from: a */
        final /* synthetic */ StoryReceiver f171963a;

        static {
            Covode.recordClassIndex(89612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76625d(StoryReceiver storyReceiver) {
            super(1);
            this.f171963a = storyReceiver;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(StoryReceiver storyReceiver) {
            boolean z;
            StoryReceiver storyReceiver2 = storyReceiver;
            C89219l.m154721d(storyReceiver2, "");
            if (C89219l.m154714a(storyReceiver2, this.f171963a) || C89219l.m154714a(storyReceiver2.f171951b, this.f171963a.f171951b)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c$b */
    static final class C76623b<T1, T2> implements AbstractC88431d {

        /* renamed from: a */
        final /* synthetic */ AbstractC76621c f171961a;

        static {
            Covode.recordClassIndex(89610);
        }

        C76623b(AbstractC76621c cVar) {
            this.f171961a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88431d
        /* renamed from: a */
        public final /* synthetic */ boolean mo20694a(Object obj, Object obj2) {
            C76622a aVar = (C76622a) obj;
            C76622a aVar2 = (C76622a) obj2;
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(aVar2, "");
            AbstractC89290k<SUBSCRIBE_DATA, ?>[] kVarArr = aVar2.f171960d;
            if (kVarArr == null) {
                return false;
            }
            for (AbstractC89290k<SUBSCRIBE_DATA, ?> kVar : kVarArr) {
                if (kVar != null && C89219l.m154714a(kVar.get(aVar2.f171958b), kVar.get(aVar.f171958b))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo120328a(AbstractC76618d dVar, StoryReceiver storyReceiver) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(storyReceiver, "");
        ConcurrentHashMap<AbstractC76618d, Set<StoryReceiver>> concurrentHashMap = this.f171954a;
        Set<StoryReceiver> set = concurrentHashMap.get(dVar);
        if (set == null) {
            set = new LinkedHashSet<>();
        }
        C89070n.m154532a((Iterable) set, (AbstractC89172b) new C76624c(storyReceiver));
        set.add(storyReceiver);
        concurrentHashMap.put(dVar, set);
    }

    /* renamed from: a */
    public final void mo120329a(SUBSCRIBE_DATA subscribe_data, SUBSCRIBE_DATA subscribe_data2, OUTPUT_DATA output_data) {
        List<AbstractC89290k<SUBSCRIBE_DATA, ?>> b = mo120330b(subscribe_data, subscribe_data2);
        if (!b.isEmpty()) {
            this.f171956c.onNext(new C76622a<>(b, subscribe_data2, output_data, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.distribution.dispatcher.c$a */
    public static final class C76622a<SUBSCRIBE_DATA, OUTPUT_DATA> {

        /* renamed from: a */
        public final List<AbstractC89290k<SUBSCRIBE_DATA, ?>> f171957a;

        /* renamed from: b */
        public final SUBSCRIBE_DATA f171958b;

        /* renamed from: c */
        public final OUTPUT_DATA f171959c;

        /* renamed from: d */
        public final AbstractC89290k<SUBSCRIBE_DATA, ?>[] f171960d;

        static {
            Covode.recordClassIndex(89609);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C76622a<SUBSCRIBE_DATA, OUTPUT_DATA> m134212a(List<? extends AbstractC89290k<SUBSCRIBE_DATA, ?>> list, SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data, AbstractC89290k<SUBSCRIBE_DATA, ?>[] kVarArr) {
            C89219l.m154721d(list, "");
            return new C76622a<>(list, subscribe_data, output_data, kVarArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C76622a)) {
                return false;
            }
            C76622a aVar = (C76622a) obj;
            return C89219l.m154714a(this.f171957a, aVar.f171957a) && C89219l.m154714a(this.f171958b, aVar.f171958b) && C89219l.m154714a(this.f171959c, aVar.f171959c) && C89219l.m154714a(this.f171960d, aVar.f171960d);
        }

        public final int hashCode() {
            List<AbstractC89290k<SUBSCRIBE_DATA, ?>> list = this.f171957a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            SUBSCRIBE_DATA subscribe_data = this.f171958b;
            int hashCode2 = (hashCode + (subscribe_data != null ? subscribe_data.hashCode() : 0)) * 31;
            OUTPUT_DATA output_data = this.f171959c;
            int hashCode3 = (hashCode2 + (output_data != null ? output_data.hashCode() : 0)) * 31;
            AbstractC89290k<SUBSCRIBE_DATA, ?>[] kVarArr = this.f171960d;
            if (kVarArr != null) {
                i = Arrays.hashCode(kVarArr);
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "StorySubscribeData(changedProperties=" + this.f171957a + ", updatedData=" + ((Object) this.f171958b) + ", outputData=" + ((Object) this.f171959c) + ", filterProperties=" + Arrays.toString(this.f171960d) + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends h.k.k<SUBSCRIBE_DATA, ?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C76622a(List<? extends AbstractC89290k<SUBSCRIBE_DATA, ?>> list, SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data, AbstractC89290k<SUBSCRIBE_DATA, ?>[] kVarArr) {
            C89219l.m154721d(list, "");
            this.f171957a = list;
            this.f171958b = subscribe_data;
            this.f171959c = output_data;
            this.f171960d = kVarArr;
        }
    }
}

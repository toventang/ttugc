package com.bytedance.ies.powerlist.optimize.p1233a;

import android.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.debug.C17648Dr;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89560br;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.C89624i;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.bytedance.ies.powerlist.optimize.a.b */
public final class C17664b extends RecyclerView.AbstractC1371n implements AbstractC89516am {

    /* renamed from: a */
    public final AtomicInteger f42238a = new AtomicInteger(0);

    /* renamed from: b */
    public final AbstractC89568bz f42239b;

    /* renamed from: c */
    final OptimizeAbility f42240c;

    /* renamed from: d */
    public final PowerList f42241d;

    /* renamed from: e */
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> f42242e;

    /* renamed from: f */
    private final AbstractC89127f f42243f;

    static {
        Covode.recordClassIndex(20221);
    }

    @Override // kotlinx.coroutines.AbstractC89516am
    /* renamed from: a */
    public final AbstractC89127f mo20678a() {
        return this.f42243f;
    }

    /* renamed from: b */
    public final void mo28153b() {
        RecyclerView.AbstractC1350a adapter = this.f42241d.getAdapter();
        if (!(adapter instanceof PowerAdapter)) {
            adapter = null;
        }
        PowerAdapter powerAdapter = (PowerAdapter) adapter;
        if (powerAdapter != null) {
            AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C17669d(this, powerAdapter, null), 3);
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.optimize.a.b$b */
    static final class ThreadFactoryC17666b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ C17664b f42246a;

        static {
            Covode.recordClassIndex(20223);
        }

        ThreadFactoryC17666b(C17664b bVar) {
            this.f42246a = bVar;
        }

        public final /* synthetic */ Thread newThread(Runnable runnable) {
            String str = "PowerList-" + this.f42246a.f42238a.incrementAndGet();
            return new Thread(runnable, str, runnable, str) {
                /* class com.bytedance.ies.powerlist.optimize.p1233a.C17664b.ThreadFactoryC17666b.C176671 */

                /* renamed from: a */
                final /* synthetic */ Runnable f42247a;

                /* renamed from: b */
                final /* synthetic */ String f42248b;

                static {
                    Covode.recordClassIndex(20224);
                }

                {
                    this.f42247a = r1;
                    this.f42248b = r2;
                }
            };
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.optimize.a.b$c */
    static final class C17668c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f42249a;

        /* renamed from: b */
        final /* synthetic */ C17664b f42250b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f42251c;

        /* renamed from: d */
        private AbstractC89516am f42252d;

        static {
            Covode.recordClassIndex(20225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17668c(C17664b bVar, RecyclerView recyclerView, AbstractC89124d dVar) {
            super(2, dVar);
            this.f42250b = bVar;
            this.f42251c = recyclerView;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C17668c cVar = new C17668c(this.f42250b, this.f42251c, dVar);
            cVar.f42252d = (AbstractC89516am) obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17668c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i;
            if (this.f42249a == 0) {
                C89382r.m154942a(obj);
                RecyclerView.AbstractC1362i layoutManager = this.f42251c.getLayoutManager();
                PowerList powerList = null;
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int i2 = -1;
                if (linearLayoutManager != null) {
                    i = C89108b.m154610a(linearLayoutManager.mo4371k()).intValue();
                } else {
                    i = -1;
                }
                RecyclerView.AbstractC1362i layoutManager2 = this.f42251c.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    layoutManager2 = null;
                }
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager2;
                if (linearLayoutManager2 != null) {
                    i2 = C89108b.m154610a(linearLayoutManager2.mo4373m()).intValue();
                }
                RecyclerView recyclerView = this.f42251c;
                if (recyclerView instanceof PowerList) {
                    powerList = recyclerView;
                }
                PowerList powerList2 = powerList;
                if (powerList2 != null) {
                    C17664b bVar = this.f42250b;
                    C89219l.m154719c(powerList2, "");
                    C17656f<AbstractC17641a> state = powerList2.getState();
                    int b = C89271h.m154769b(0, (i - bVar.f42240c.f42317b) - 1);
                    int c = C89271h.m154772c(state.mo28134b() - 1, (bVar.f42240c.f42317b + i2) - 1);
                    C89378p a = C89387v.m154943a(Integer.valueOf(b), Integer.valueOf(i - 1));
                    C89378p a2 = C89387v.m154943a(Integer.valueOf(i2 + 1), Integer.valueOf(c));
                    try {
                        int intValue = ((Number) a.getFirst()).intValue();
                        int intValue2 = ((Number) a.getSecond()).intValue();
                        if (intValue <= intValue2) {
                            while (true) {
                                bVar.mo28152a(powerList2, intValue);
                                if (intValue == intValue2) {
                                    break;
                                }
                                intValue++;
                            }
                        }
                        int intValue3 = ((Number) a2.getFirst()).intValue();
                        int intValue4 = ((Number) a2.getSecond()).intValue();
                        if (intValue3 <= intValue4) {
                            while (true) {
                                bVar.mo28152a(powerList2, intValue3);
                                if (intValue3 == intValue4) {
                                    break;
                                }
                                intValue3++;
                            }
                        }
                    } catch (Exception e) {
                        if (C17648Dr.f42204b) {
                            throw e;
                        }
                    }
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.optimize.a.b$d */
    public static final class C17669d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f42253a;

        /* renamed from: b */
        final /* synthetic */ C17664b f42254b;

        /* renamed from: c */
        final /* synthetic */ PowerAdapter f42255c;

        /* renamed from: d */
        private AbstractC89516am f42256d;

        static {
            Covode.recordClassIndex(20226);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17669d(C17664b bVar, PowerAdapter powerAdapter, AbstractC89124d dVar) {
            super(2, dVar);
            this.f42254b = bVar;
            this.f42255c = powerAdapter;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C17669d dVar2 = new C17669d(this.f42254b, this.f42255c, dVar);
            dVar2.f42256d = (AbstractC89516am) obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17669d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            int i;
            if (this.f42253a == 0) {
                C89382r.m154942a(obj);
                PowerAdapter powerAdapter = this.f42255c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                PowerStub powerStub = powerAdapter.f42110a;
                if (powerStub == null) {
                    C89219l.m154710a("mainStub");
                }
                for (PowerStub powerStub2 : C89070n.m154572d((Collection) C89070n.m154516a(powerStub), (Iterable) powerAdapter.f42111b)) {
                    for (Map.Entry<Type, Integer> entry : powerStub2.f42173e.entrySet()) {
                        int intValue = entry.getValue().intValue();
                        Integer num = powerAdapter.f42113d.get(powerStub2);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        linkedHashSet.add(Integer.valueOf(intValue + i));
                    }
                }
                for (Number number : C89070n.m154590j(linkedHashSet)) {
                    int intValue2 = number.intValue();
                    int i2 = this.f42254b.f42240c.f42317b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        C89108b.m154610a(i3).intValue();
                        C17664b bVar = this.f42254b;
                        RecyclerView.ViewHolder createViewHolder = this.f42255c.createViewHolder(bVar.f42241d, intValue2);
                        C89219l.m154709a((Object) createViewHolder, "");
                        bVar.mo28151a(createViewHolder, intValue2);
                    }
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.optimize.a.b$a */
    public final class C17665a extends RecyclerView.AbstractC1379t {

        /* renamed from: a */
        final /* synthetic */ C17664b f42244a;

        /* renamed from: b */
        private final C17664b f42245b;

        static {
            Covode.recordClassIndex(20222);
        }

        public C17665a(C17664b bVar, C17664b bVar2) {
            C89219l.m154719c(bVar2, "");
            this.f42244a = bVar;
            this.f42245b = bVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0044 A[Catch:{ all -> 0x004b }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[Catch:{ all -> 0x004b }] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1379t
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.View mo4785a(androidx.recyclerview.widget.RecyclerView.C1372o r5, int r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154719c(r5, r3)
                com.bytedance.ies.powerlist.optimize.a.b r0 = r4.f42245b
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<androidx.recyclerview.widget.RecyclerView$ViewHolder>> r1 = r0.f42242e
                java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                java.lang.Object r1 = r1.get(r0)
                java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
                r2 = 0
                if (r1 != 0) goto L_0x0022
            L_0x0016:
                r0 = r2
            L_0x0017:
                if (r0 == 0) goto L_0x0053
                int r1 = r0.getItemViewType()
                if (r1 != r6) goto L_0x0053
                android.view.View r1 = r0.itemView
                goto L_0x003a
            L_0x0022:
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r3)
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L_0x002c
                goto L_0x0016
            L_0x002c:
                java.util.Iterator r0 = r1.iterator()
                java.lang.Object r0 = r0.next()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r0
                r1.remove(r0)
                goto L_0x0017
            L_0x003a:
                com.bytedance.ies.powerlist.optimize.a.b r0 = r4.f42244a     // Catch:{ all -> 0x004b }
                com.bytedance.ies.powerlist.PowerList r0 = r0.f42241d     // Catch:{ all -> 0x004b }
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.mo4393a(r1)     // Catch:{ all -> 0x004b }
                if (r0 == 0) goto L_0x0045
                return r1
            L_0x0045:
                h.z r0 = p4600h.C89391z.f203057a     // Catch:{ all -> 0x004b }
                p4600h.C89379q.m157068constructorimpl(r0)     // Catch:{ all -> 0x004b }
                goto L_0x0053
            L_0x004b:
                r0 = move-exception
                java.lang.Object r0 = p4600h.C89382r.m154941a(r0)
                p4600h.C89379q.m157068constructorimpl(r0)
            L_0x0053:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.optimize.p1233a.C17664b.C17665a.mo4785a(androidx.recyclerview.widget.RecyclerView$o, int):android.view.View");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = r5.f42241d.getLayoutManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r2 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r1 = r6.itemView;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if ((!(r1.getLayoutParams() instanceof androidx.recyclerview.widget.RecyclerView.C1367j)) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r1 = r6.itemView;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r2 = r2.mo4317a(r1.getLayoutParams());
        r1 = r6.itemView;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r1.setLayoutParams(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        r1 = r6.itemView;
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        com.bytedance.common.utility.reflect.Reflect.m24529on(r1.getLayoutParams()).set("mViewHolder", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4267);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r0.printStackTrace();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4267);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28151a(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.optimize.p1233a.C17664b.mo28151a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo28152a(PowerList powerList, int i) {
        int i2;
        RecyclerView.ViewHolder createViewHolder;
        RecyclerView.AbstractC1350a adapter = powerList.getAdapter();
        if (adapter != null) {
            C89219l.m154709a((Object) adapter, "");
            int itemViewType = adapter.getItemViewType(i);
            CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.f42242e.get(Integer.valueOf(itemViewType));
            if (copyOnWriteArrayList != null) {
                i2 = copyOnWriteArrayList.size();
            } else {
                i2 = 0;
            }
            if (i2 < this.f42240c.f42317b) {
                if (powerList.getRecycledViewPool().getRecycledViewCount(itemViewType) > 1) {
                    createViewHolder = powerList.getRecycledViewPool().getRecycledView(itemViewType);
                    if (createViewHolder != null) {
                        Class<?> cls = createViewHolder.getClass();
                        while (true) {
                            if (cls == null) {
                                break;
                            } else if (C89219l.m154714a(cls, RecyclerView.ViewHolder.class)) {
                                Method[] declaredMethods = cls.getDeclaredMethods();
                                C89219l.m154709a((Object) declaredMethods, "");
                                int length = declaredMethods.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    }
                                    Method method = declaredMethods[i3];
                                    C89219l.m154709a((Object) method, "");
                                    if (C89219l.m154714a((Object) method.getName(), (Object) "resetInternal")) {
                                        method.setAccessible(true);
                                        Object[] objArr = new Object[0];
                                        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{createViewHolder, objArr}, 110000, "java.lang.Object", true, "com_bytedance_ies_powerlist_optimize_preload_ViewCacheAbility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                        if (((Boolean) a.first).booleanValue()) {
                                            Object obj = a.second;
                                        } else {
                                            C15346a.m28242a(method.invoke(createViewHolder, objArr), method, new Object[]{createViewHolder, objArr}, "com_bytedance_ies_powerlist_optimize_preload_ViewCacheAbility_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            } else {
                                cls = cls.getSuperclass();
                                C89219l.m154709a((Object) cls, "");
                            }
                        }
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    createViewHolder = adapter.createViewHolder(powerList, itemViewType);
                }
                mo28151a(createViewHolder, itemViewType);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        C89219l.m154719c(recyclerView, "");
        super.mo4754a(recyclerView, i, i2);
        AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C17668c(this, recyclerView, null), 3);
    }

    public C17664b(OptimizeAbility optimizeAbility, PowerList powerList, ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> concurrentHashMap) {
        C89219l.m154719c(optimizeAbility, "");
        C89219l.m154719c(powerList, "");
        C89219l.m154719c(concurrentHashMap, "");
        this.f42240c = optimizeAbility;
        this.f42241d = powerList;
        this.f42242e = concurrentHashMap;
        AbstractC89703z a = C89582cd.m155517a(null);
        this.f42239b = a;
        ExecutorService a2 = C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(1).mo70027a(new ThreadFactoryC17666b(this)).mo70028a());
        C89219l.m154709a((Object) a2, "");
        this.f42243f = new C89560br(a2).plus(a);
    }
}

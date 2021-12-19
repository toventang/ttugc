package com.p2082ss.android.ugc.aweme.tools.draft.p4102c;

import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.C41072a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41090d;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65336af;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b */
public final class C78215b {

    /* renamed from: b */
    public static final C78216a f175670b = new C78216a((byte) 0);

    /* renamed from: a */
    public final AbstractC89516am f175671a;

    /* renamed from: c */
    private final AbstractC89244h f175672c;

    /* renamed from: d */
    private final AbstractC89244h f175673d = C89250i.m154773a((AbstractC89171a) C78219d.f175681a);

    static {
        Covode.recordClassIndex(91330);
    }

    /* renamed from: a */
    private final AbstractC46415f m136696a() {
        return (AbstractC46415f) this.f175672c.getValue();
    }

    /* renamed from: b */
    private final C41072a<Effect, C89391z> m136699b() {
        return (C41072a) this.f175673d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$a */
    public static final class C78216a {
        static {
            Covode.recordClassIndex(91331);
        }

        private C78216a() {
        }

        /* renamed from: a */
        public static boolean m136704a() {
            if (C65336af.m117022a() == 1) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C78216a(byte b) {
            this();
        }

        /* renamed from: a */
        public static List<StickerItemModel> m136703a(C43223c cVar) {
            InfoStickerModel j;
            List<StickerItemModel> list;
            C89219l.m154721d(cVar, "");
            if (!(!cVar.f100900W.f100772aE || cVar == null || (j = cVar.mo73694j()) == null || (list = j.stickers) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    if (t2.type == 0 && !TextUtils.isEmpty(t2.stickerId)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 == null || arrayList2.isEmpty() || arrayList2 == null) {
                    return null;
                }
                return arrayList2;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$d */
    static final class C78219d extends AbstractC89220m implements AbstractC89171a<C41072a<Effect, C89391z>> {

        /* renamed from: a */
        public static final C78219d f175681a = new C78219d();

        static {
            Covode.recordClassIndex(91334);
        }

        C78219d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41072a<Effect, C89391z> invoke() {
            C41072a aVar = new C41072a(new C78214a());
            aVar.f96007a = 0;
            aVar.f96009c = true;
            aVar.f96008b = true;
            aVar.f96010d = new AbstractC41090d() {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b.C78219d.C782201 */

                static {
                    Covode.recordClassIndex(91335);
                }

                @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41090d
                /* renamed from: a */
                public final void mo70309a(Exception exc) {
                    C89219l.m154721d(exc, "");
                    C63244g.m114602a();
                    C73991bj.m130129a(exc);
                }
            };
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$e */
    static final class C78221e extends AbstractC89220m implements AbstractC89171a<AbstractC46415f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f175682a;

        static {
            Covode.recordClassIndex(91336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78221e(AbstractC1204m mVar) {
            super(0);
            this.f175682a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC46415f invoke() {
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            AbstractC46415f a = C46404c.m89554a(application, null);
            a.mo78886a(this.f175682a);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$b */
    public static final class C78217b implements AbstractC41085a<Effect, C89391z> {

        /* renamed from: a */
        final /* synthetic */ HashMap f175674a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f175675b;

        /* renamed from: c */
        final /* synthetic */ C78215b f175676c;

        /* renamed from: d */
        final /* synthetic */ C89378p f175677d;

        /* renamed from: e */
        final /* synthetic */ boolean f175678e;

        static {
            Covode.recordClassIndex(91332);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: a */
        public final /* synthetic */ void mo70298a(Effect effect) {
            C89219l.m154721d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: b */
        public final /* synthetic */ void mo70300b(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f175674a.put(effect, true);
            HashMap hashMap = this.f175674a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                this.f175675b.resumeWith(C89379q.m157068constructorimpl(C89387v.m154943a(this.f175677d.getFirst(), true)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Integer, java.lang.Exception] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: a */
        public final /* synthetic */ void mo70299a(Effect effect, Integer num, Exception exc) {
            C89219l.m154721d(effect, "");
            this.f175675b.resumeWith(C89379q.m157068constructorimpl(C89387v.m154943a(this.f175677d.getFirst(), false)));
        }

        C78217b(HashMap hashMap, AbstractC89124d dVar, C78215b bVar, C89378p pVar, boolean z) {
            this.f175674a = hashMap;
            this.f175675b = dVar;
            this.f175676c = bVar;
            this.f175677d = pVar;
            this.f175678e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$c */
    public static final class C78218c implements AbstractC41085a<Effect, C89391z> {

        /* renamed from: a */
        final /* synthetic */ HashMap f175679a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f175680b;

        static {
            Covode.recordClassIndex(91333);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: a */
        public final /* synthetic */ void mo70298a(Effect effect) {
            C89219l.m154721d(effect, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: b */
        public final /* synthetic */ void mo70300b(Effect effect) {
            C89219l.m154721d(effect, "");
            this.f175679a.put(effect, true);
            HashMap hashMap = this.f175679a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                this.f175680b.resumeWith(C89379q.m157068constructorimpl(true));
            }
        }

        C78218c(HashMap hashMap, AbstractC89124d dVar) {
            this.f175679a = hashMap;
            this.f175680b = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Integer, java.lang.Exception] */
        @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41085a
        /* renamed from: a */
        public final /* synthetic */ void mo70299a(Effect effect, Integer num, Exception exc) {
            C89219l.m154721d(effect, "");
            this.f175680b.resumeWith(C89379q.m157068constructorimpl(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$f */
    public static final class C78222f implements IFetchEffectListListener {

        /* renamed from: a */
        final /* synthetic */ List f175683a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f175684b;

        /* renamed from: c */
        final /* synthetic */ C78215b f175685c;

        /* renamed from: d */
        final /* synthetic */ Map f175686d;

        static {
            Covode.recordClassIndex(91337);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(List<Effect> list) {
            final List<Effect> list2 = list;
            C89219l.m154721d(list2, "");
            AbstractC89568bz unused = C89624i.m155555a(this.f175685c.f175671a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b.C78222f.C782231 */

                /* renamed from: a */
                int f175687a;

                /* renamed from: b */
                final /* synthetic */ C78222f f175688b;

                static {
                    Covode.recordClassIndex(91338);
                }

                {
                    this.f175688b = r2;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return 

                    /* renamed from: com.ss.android.ugc.aweme.tools.draft.c.b$g */
                    public static final class C78224g implements IFetchEffectListListener {

                        /* renamed from: a */
                        final /* synthetic */ List f175690a;

                        /* renamed from: b */
                        final /* synthetic */ AbstractC89124d f175691b;

                        /* renamed from: c */
                        final /* synthetic */ C78215b f175692c;

                        /* renamed from: d */
                        final /* synthetic */ List f175693d;

                        static {
                            Covode.recordClassIndex(91339);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            final List<Effect> list2 = list;
                            C89219l.m154721d(list2, "");
                            AbstractC89568bz unused = C89624i.m155555a(this.f175692c.f175671a, null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                /* class com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b.C78224g.C782251 */

                                /* renamed from: a */
                                int f175694a;

                                /* renamed from: b */
                                final /* synthetic */ C78224g f175695b;

                                static {
                                    Covode.recordClassIndex(91340);
                                }

                                {
                                    this.f175695b = r2;
                                }

                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                    C89219l.m154721d(dVar, "");
                                    return 

                                    public C78215b(AbstractC1204m mVar) {
                                        C89219l.m154721d(mVar, "");
                                        C63238c.m114590a(C71815es.m126788a());
                                        this.f175672c = C89250i.m154773a((AbstractC89171a) new C78221e(mVar));
                                        m136699b().mo70288b();
                                        this.f175671a = C78226c.m136712a();
                                    }

                                    /* renamed from: a */
                                    public static boolean m136698a(Effect effect) {
                                        File file = new File(effect.getUnzipPath());
                                        if (file.exists() && file.isDirectory()) {
                                            File[] listFiles = file.listFiles();
                                            C89219l.m154716b(listFiles, "");
                                            for (File file2 : listFiles) {
                                                C89219l.m154716b(file2, "");
                                                if (TextUtils.equals("config.json", file2.getName())) {
                                                    return true;
                                                }
                                            }
                                        }
                                        return false;
                                    }

                                    /* renamed from: a */
                                    public final Object mo122120a(List<? extends StickerItemModel> list, AbstractC89124d<? super List<Effect>> dVar) {
                                        C89134h hVar = new C89134h(C89099b.m154605a(dVar));
                                        ArrayList arrayList = new ArrayList();
                                        for (StickerItemModel stickerItemModel : list) {
                                            String str = stickerItemModel.stickerId;
                                            C89219l.m154716b(str, "");
                                            arrayList.add(str);
                                        }
                                        m136696a().mo78912a((List<String>) arrayList, (Map<String, String>) null, false, (IFetchEffectListListener) new C78224g(arrayList, hVar, this, list));
                                        Object a = hVar.mo143576a();
                                        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
                                            C89219l.m154721d(dVar, "");
                                        }
                                        return a;
                                    }

                                    /* renamed from: a */
                                    public final Object mo122121a(Map<C43223c, ? extends List<? extends StickerItemModel>> map, AbstractC89124d<? super Map<C43223c, ? extends List<? extends Effect>>> dVar) {
                                        C89134h hVar = new C89134h(C89099b.m154605a(dVar));
                                        LinkedHashSet<StickerItemModel> linkedHashSet = new LinkedHashSet();
                                        Iterator<T> it = map.values().iterator();
                                        while (it.hasNext()) {
                                            linkedHashSet.addAll(it.next());
                                        }
                                        ArrayList arrayList = new ArrayList(C89070n.m154526a(linkedHashSet, 10));
                                        for (StickerItemModel stickerItemModel : linkedHashSet) {
                                            arrayList.add(stickerItemModel.stickerId);
                                        }
                                        ArrayList arrayList2 = arrayList;
                                        m136696a().mo78912a((List<String>) arrayList2, (Map<String, String>) null, false, (IFetchEffectListListener) new C78222f(arrayList2, hVar, this, map));
                                        Object a = hVar.mo143576a();
                                        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
                                            C89219l.m154721d(dVar, "");
                                        }
                                        return a;
                                    }

                                    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
                                    /* JADX WARNING: Unknown variable types count: 1 */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public static /* synthetic */ java.lang.Object m136697a(com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b r6, java.util.List r7, p4600h.p4603c.AbstractC89124d r8) {
                                        /*
                                            h.c.h r5 = new h.c.h
                                            h.c.d r0 = p4600h.p4603c.p4604a.C89099b.m154605a(r8)
                                            r5.<init>(r0)
                                            java.util.HashMap r4 = new java.util.HashMap
                                            r4.<init>()
                                            com.ss.android.ugc.aweme.tools.draft.c.b$c r3 = new com.ss.android.ugc.aweme.tools.draft.c.b$c
                                            r3.<init>(r4, r5)
                                            java.util.Iterator r2 = r7.iterator()
                                        L_0x0017:
                                            boolean r0 = r2.hasNext()
                                            if (r0 == 0) goto L_0x002a
                                            java.lang.Object r1 = r2.next()
                                            r0 = 0
                                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                            r4.put(r1, r0)
                                            goto L_0x0017
                                        L_0x002a:
                                            java.util.Iterator r2 = r7.iterator()
                                        L_0x002e:
                                            boolean r0 = r2.hasNext()
                                            if (r0 == 0) goto L_0x0040
                                            java.lang.Object r1 = r2.next()
                                            com.ss.android.ugc.aweme.dependence.a.a.a r0 = r6.m136699b()
                                            r0.mo70285a(r1, r3)
                                            goto L_0x002e
                                        L_0x0040:
                                            java.lang.Object r1 = r5.mo143576a()
                                            h.c.a.a r0 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                                            if (r1 != r0) goto L_0x004d
                                            java.lang.String r0 = ""
                                            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
                                        L_0x004d:
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b.m136697a(com.ss.android.ugc.aweme.tools.draft.c.b, java.util.List, h.c.d):java.lang.Object");
                                    }

                                    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
                                    /* JADX WARNING: Unknown variable types count: 1 */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final java.lang.Object mo122119a(p4600h.C89378p<? extends com.p2082ss.android.ugc.aweme.draft.model.C43223c, ? extends java.util.List<? extends com.p2082ss.android.ugc.effectmanager.effect.model.Effect>> r11, boolean r12, p4600h.p4603c.AbstractC89124d<? super p4600h.C89378p<? extends com.p2082ss.android.ugc.aweme.draft.model.C43223c, java.lang.Boolean>> r13) {
                                        /*
                                        // Method dump skipped, instructions count: 111
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4102c.C78215b.mo122119a(h.p, boolean, h.c.d):java.lang.Object");
                                    }
                                }

package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46629g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.a */
public final class C46616a implements AbstractC46626d {

    /* renamed from: a */
    public static LinkedHashMap<C46516b, List<C46534a>> f108703a;

    /* renamed from: b */
    public static final List<AbstractC46626d> f108704b = new ArrayList();

    /* renamed from: c */
    public static final C46616a f108705c;

    /* renamed from: d */
    private static Map<String, String> f108706d = new ConcurrentHashMap();

    /* renamed from: e */
    private static Map<String, String> f108707e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final AbstractC89516am f108708f = C89517an.m155448a(C89546bf.f203266a);

    private C46616a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46626d
    /* renamed from: a */
    public final void mo79230a(LinkedHashMap<C46516b, List<C46534a>> linkedHashMap) {
        if (linkedHashMap != null) {
            f108703a = linkedHashMap;
        }
        AbstractC89568bz unused = C89624i.m155555a(f108708f, null, null, new C46619b(null), 3);
    }

    /* renamed from: b */
    public static boolean m89982b() {
        LinkedHashMap<C46516b, List<C46534a>> linkedHashMap = f108703a;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(55207);
        C46616a aVar = new C46616a();
        f108705c = aVar;
        C89219l.m154721d(aVar, "");
        if (!C46621b.f108716a.contains(aVar)) {
            C46621b.f108716a.add(aVar);
        }
    }

    /* renamed from: a */
    public static void m89978a() {
        int i;
        Collection<List<C46534a>> values;
        Collection<List<C46534a>> values2;
        f108706d.clear();
        f108707e.clear();
        LinkedHashMap<C46516b, List<C46534a>> linkedHashMap = f108703a;
        if (linkedHashMap == null || (values2 = linkedHashMap.values()) == null) {
            i = 0;
        } else {
            Iterator<T> it = values2.iterator();
            i = 0;
            while (it.hasNext()) {
                i += it.next().size();
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        f108706d = new ConcurrentHashMap(i);
        f108707e = new ConcurrentHashMap(i);
        LinkedHashMap<C46516b, List<C46534a>> linkedHashMap2 = f108703a;
        if (!(linkedHashMap2 == null || (values = linkedHashMap2.values()) == null)) {
            int i3 = 0;
            for (T<C46534a> t : values) {
                C89219l.m154716b(t, "");
                for (C46534a aVar : t) {
                    String a = C46459a.m89688a(aVar);
                    if (a == null) {
                        a = aVar.getDisplayName();
                    }
                    if (a == null || a.length() == 0) {
                        a = aVar.getDisplayName();
                    }
                    String str = f108706d.get(a);
                    if (TextUtils.isEmpty(str)) {
                        Map<String, String> map = f108706d;
                        C89219l.m154716b(a, "");
                        map.put(a, String.valueOf(i3));
                    } else {
                        Map<String, String> map2 = f108706d;
                        C89219l.m154716b(a, "");
                        map2.put(a, str + "," + i3);
                    }
                    String displayName = aVar.getDisplayName();
                    String str2 = f108707e.get(displayName);
                    if (TextUtils.isEmpty(str2)) {
                        Map<String, String> map3 = f108707e;
                        C89219l.m154716b(displayName, "");
                        map3.put(displayName, String.valueOf(i3));
                    } else {
                        Map<String, String> map4 = f108707e;
                        C89219l.m154716b(displayName, "");
                        map4.put(displayName, str2 + "," + i3);
                    }
                    i3++;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m89979a(AbstractC46626d dVar) {
        C89219l.m154721d(dVar, "");
        f108704b.remove(dVar);
    }

    /* renamed from: a */
    public static List<C46534a> m89976a(String str) {
        if (f108706d.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        List<C46534a> a = m89977a(f108707e, str);
        if (a == null) {
            return m89977a(f108706d, str);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.a$a */
    public static final class C46617a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108709a;

        /* renamed from: b */
        final /* synthetic */ C46516b f108710b;

        /* renamed from: c */
        final /* synthetic */ List f108711c;

        static {
            Covode.recordClassIndex(55208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46617a(C46516b bVar, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108710b = bVar;
            this.f108711c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46617a(this.f108710b, this.f108711c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46617a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f108709a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C46616a.m89978a();
                AbstractC89587ci ciVar = C89652o.f203399a;
                C466181 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a.C46617a.C466181 */

                    /* renamed from: a */
                    int f108712a;

                    /* renamed from: b */
                    final /* synthetic */ C46617a f108713b;

                    static {
                        Covode.recordClassIndex(55209);
                    }

                    {
                        this.f108713b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.a$b */
                        static final class C46619b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f108714a;

                            static {
                                Covode.recordClassIndex(55210);
                            }

                            C46619b(AbstractC89124d dVar) {
                                super(2, dVar);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C46619b(dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C46619b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f108714a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    C46616a.m89978a();
                                    AbstractC89587ci ciVar = C89652o.f203399a;
                                    C466201 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(null) {
                                        /* class com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a.C46619b.C466201 */

                                        /* renamed from: a */
                                        int f108715a;

                                        static {
                                            Covode.recordClassIndex(55211);
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return 

                                            /* renamed from: a */
                                            private static C46534a m89975a(int i) {
                                                Collection<List<C46534a>> values;
                                                LinkedHashMap<C46516b, List<C46534a>> linkedHashMap = f108703a;
                                                if (!(linkedHashMap == null || (values = linkedHashMap.values()) == null)) {
                                                    int i2 = 0;
                                                    for (List<C46534a> list : values) {
                                                        if (list.size() + i2 > i) {
                                                            return list.get(i - i2);
                                                        }
                                                        i2 += list.size();
                                                    }
                                                }
                                                return null;
                                            }

                                            /* renamed from: a */
                                            public static void m89980a(boolean z) {
                                                C46621b bVar = C46621b.f108717b;
                                                C89219l.m154721d("STICKER", "");
                                                AbstractC89568bz unused = C89624i.m155555a(bVar.f108733c, null, null, new C46629g.C46634d(bVar, "STICKER", z, null), 3);
                                            }

                                            /* renamed from: a */
                                            public static boolean m89981a(C46516b bVar) {
                                                C89219l.m154721d(bVar, "");
                                                return C46621b.f108717b.mo79235b(bVar);
                                            }

                                            /* renamed from: a */
                                            private static List<C46534a> m89977a(Map<String, String> map, String str) {
                                                String str2 = map.get(str);
                                                if (str2 == null || TextUtils.isEmpty(str2)) {
                                                    return null;
                                                }
                                                Object[] array = C89361p.m154915b(str2, new String[]{","}).toArray(new String[0]);
                                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                                                ArrayList arrayList = new ArrayList();
                                                for (String str3 : (String[]) array) {
                                                    C46534a a = m89975a(Integer.parseInt(str3));
                                                    if (a != null) {
                                                        arrayList.add(a);
                                                    }
                                                }
                                                return arrayList;
                                            }

                                            @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46626d
                                            /* renamed from: a */
                                            public final void mo79229a(C46516b bVar, List<? extends C46534a> list) {
                                                C89219l.m154721d(bVar, "");
                                                if (list == null || !(!list.isEmpty())) {
                                                    for (AbstractC46626d dVar : f108704b) {
                                                        dVar.mo79229a(bVar, list);
                                                    }
                                                    return;
                                                }
                                                LinkedHashMap<C46516b, List<C46534a>> linkedHashMap = f108703a;
                                                if (linkedHashMap == null) {
                                                    C89219l.m154715b();
                                                }
                                                linkedHashMap.put(bVar, list);
                                                AbstractC89568bz unused = C89624i.m155555a(f108708f, null, null, new C46617a(bVar, list, null), 3);
                                            }
                                        }

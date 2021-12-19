package com.p2082ss.android.ugc.asve.recorder.effect.composer;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85346av;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.d */
public final class C31209d implements AbstractC31206b {

    /* renamed from: a */
    final HashMap<Integer, List<ComposerInfo>> f74806a = new HashMap<>(8);

    /* renamed from: b */
    final C85346av f74807b;

    static {
        Covode.recordClassIndex(37855);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: e */
    public final AbstractC31208c mo56826e() {
        return new C31203a(this);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: f */
    public final void mo56827f() {
        this.f74806a.clear();
        mo56844a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56844a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<List<ComposerInfo>> values = this.f74806a.values();
        C89219l.m154716b(values, "");
        for (T<ComposerInfo> t : values) {
            C89219l.m154716b(t, "");
            for (ComposerInfo composerInfo : t) {
                arrayList.add(composerInfo.f74790a);
                arrayList2.add(composerInfo.f74791b);
            }
        }
        C85346av avVar = this.f74807b;
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int size = arrayList.size();
        Object[] array2 = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        avVar.mo130715a((String[]) array, size, (String[]) array2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: i */
    public final void mo56828i(boolean z) {
        this.f74807b.mo130795d(z ? 1 : 0);
    }

    public C31209d(C85346av avVar) {
        C89219l.m154721d(avVar, "");
        this.f74807b = avVar;
    }

    /* renamed from: b */
    private static String m64869b(String str) {
        List<String> b = C89361p.m154915b(str, new String[]{":"});
        if (b.size() >= 2) {
            return b.get(0) + ':' + b.get(1);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56845a(String str) {
        Iterator<ComposerInfo> it;
        Set<Integer> keySet = this.f74806a.keySet();
        C89219l.m154716b(keySet, "");
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            List<ComposerInfo> list = this.f74806a.get(it2.next());
            if (!(list == null || (it = list.iterator()) == null)) {
                while (it.hasNext()) {
                    if (C89219l.m154714a((Object) m64869b(str), (Object) m64869b(it.next().f74790a))) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56820a(List<ComposerInfo> list) {
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                arrayList.add(t.f74790a);
                mo56845a(t.f74790a);
            }
            C85346av avVar = this.f74807b;
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            avVar.mo130775b((String[]) array, arrayList.size());
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: d */
    public final void mo56825d(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        this.f74806a.clear();
        this.f74806a.put(Integer.valueOf(i), new ArrayList());
        for (T t : list) {
            List<ComposerInfo> list2 = this.f74806a.get(Integer.valueOf(i));
            if (list2 != null) {
                list2.add(t);
            }
        }
        mo56844a();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: b */
    public final void mo56823b(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        List<ComposerInfo> list2 = this.f74806a.get(Integer.valueOf(i));
        if (list2 != null) {
            list2.clear();
        } else {
            list2 = new ArrayList<>();
            this.f74806a.put(Integer.valueOf(i), list2);
        }
        list2.addAll(list);
        mo56844a();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: c */
    public final void mo56824c(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap<Integer, List<ComposerInfo>> hashMap = this.f74806a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, List<ComposerInfo>> entry : hashMap.entrySet()) {
            if (entry.getKey().intValue() == i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (List<ComposerInfo> list2 : linkedHashMap.values()) {
            for (ComposerInfo composerInfo : list2) {
                arrayList.add(composerInfo.f74790a);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t : list) {
            arrayList3.add(t.f74790a);
            arrayList2.add(t.f74791b);
        }
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            List<ComposerInfo> list3 = this.f74806a.get(Integer.valueOf(i));
            if (list3 != null) {
                list3.clear();
            } else {
                list3 = new ArrayList<>();
                this.f74806a.put(Integer.valueOf(i), list3);
            }
            list3.addAll(list);
            C85346av avVar = this.f74807b;
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            int size = arrayList.size();
            Object[] array2 = arrayList3.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            int size2 = arrayList3.size();
            Object[] array3 = arrayList2.toArray(new String[0]);
            Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
            avVar.mo130716a((String[]) array, size, (String[]) array2, size2, (String[]) array3);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56821a(List<ComposerInfo> list, int i) {
        C89219l.m154721d(list, "");
        List<ComposerInfo> list2 = this.f74806a.get(Integer.valueOf(i));
        if (list2 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.f74806a.put(Integer.valueOf(i), arrayList);
        } else {
            list2.removeAll(list);
            list2.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().f74790a);
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next().f74791b);
        }
        C85346av avVar = this.f74807b;
        Object[] array = arrayList3.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int size = arrayList3.size();
        Object[] array2 = arrayList4.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        avVar.mo130776b((String[]) array, size, (String[]) array2);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.effect.composer.AbstractC31206b
    /* renamed from: a */
    public final void mo56822a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        List<ComposerInfo> list3 = this.f74806a.get(Integer.valueOf(i));
        if (list3 == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.removeAll(list);
            arrayList.addAll(list2);
            this.f74806a.put(Integer.valueOf(i), arrayList);
        } else {
            list3.removeAll(list);
            list3.addAll(list2);
        }
        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(m64869b(it.next().f74790a));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next().f74790a);
        }
        ArrayList arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList6.add(it3.next().f74791b);
        }
        C85346av avVar = this.f74807b;
        Object[] array = arrayList3.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int size = arrayList3.size();
        Object[] array2 = arrayList5.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        int size2 = arrayList5.size();
        Object[] array3 = arrayList6.toArray(new String[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        avVar.mo130716a((String[]) array, size, (String[]) array2, size2, (String[]) array3);
    }
}

package com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a.g */
public final class C83926g implements AbstractC83906b {

    /* renamed from: a */
    public final C83938b f187346a;

    /* renamed from: b */
    private final ArrayList<C83938b> f187347b;

    /* renamed from: c */
    private C83938b f187348c;

    /* renamed from: d */
    private final List<AbstractC83906b.AbstractC83907a> f187349d;

    /* renamed from: e */
    private int f187350e;

    static {
        Covode.recordClassIndex(97817);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: a */
    public final List<C83938b> mo128791a() {
        return this.f187347b;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: b */
    public final C83938b mo128796b() {
        return this.f187348c;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: c */
    public final int mo128799c() {
        return this.f187350e;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: d */
    public final C83938b mo128801d() {
        return this.f187346a;
    }

    private /* synthetic */ C83926g() {
        this(null);
    }

    /* renamed from: a */
    private static <T> ArrayList<T> m144345a(ArrayList<T> arrayList) {
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: b */
    public final void mo128797b(AbstractC83906b.AbstractC83907a aVar) {
        C89219l.m154721d(aVar, "");
        this.f187349d.remove(aVar);
    }

    public C83926g(C83938b bVar) {
        this.f187346a = bVar;
        this.f187347b = new ArrayList<>();
        this.f187349d = new ArrayList();
        this.f187350e = Integer.MAX_VALUE;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: a */
    public final void mo128792a(int i) {
        this.f187350e = i;
        Iterator<T> it = this.f187349d.iterator();
        while (it.hasNext()) {
            it.next().mo128788b();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: a */
    public final void mo128793a(AbstractC83906b.AbstractC83907a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f187349d.contains(aVar)) {
            this.f187349d.add(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: b */
    public final void mo128798b(C83938b bVar) {
        C89219l.m154721d(bVar, "");
        if (this.f187347b.remove(bVar)) {
            Iterator<T> it = this.f187349d.iterator();
            while (it.hasNext()) {
                it.next().mo128789b(bVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: d */
    public final void mo128802d(C83938b bVar) {
        if (!C89219l.m154714a(this.f187348c, bVar)) {
            this.f187348c = bVar;
            Iterator<T> it = this.f187349d.iterator();
            while (it.hasNext()) {
                it.next().mo128785a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: a */
    public final void mo128794a(C83938b bVar) {
        C89219l.m154721d(bVar, "");
        this.f187347b.add(bVar);
        C89070n.m154531c((List) m144345a((ArrayList) this.f187347b));
        Iterator<T> it = this.f187349d.iterator();
        while (it.hasNext()) {
            this.f187347b.size();
            it.next().mo128786a(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: c */
    public final void mo128800c(C83938b bVar) {
        C89219l.m154721d(bVar, "");
        int i = 0;
        for (C83938b bVar2 : this.f187347b) {
            if (bVar2.f187373a != bVar.f187373a) {
                i++;
            } else if (i >= 0) {
                C83938b bVar3 = this.f187347b.get(i);
                C89219l.m154716b(bVar3, "");
                bVar3.f187384l = true;
                this.f187347b.set(i, bVar.clone());
                Iterator<T> it = this.f187349d.iterator();
                while (it.hasNext()) {
                    it.next().mo128790c(bVar);
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b
    /* renamed from: a */
    public final void mo128795a(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f187347b);
        this.f187347b.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f187347b.add(it.next().clone());
        }
        C89070n.m154531c((List) m144345a((ArrayList) this.f187347b));
        Iterator<T> it2 = this.f187349d.iterator();
        while (it2.hasNext()) {
            it2.next().mo128787a(arrayList, this.f187347b);
        }
    }
}

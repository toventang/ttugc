package com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.l.a.e */
public final class C52696e implements AbstractC52708i {

    /* renamed from: a */
    private final ArrayList<C83938b> f121299a = new ArrayList<>();

    /* renamed from: b */
    private C83938b f121300b;

    /* renamed from: c */
    private final List<AbstractC52708i.AbstractC52709a> f121301c = new ArrayList();

    /* renamed from: d */
    private int f121302d = Integer.MAX_VALUE;

    static {
        Covode.recordClassIndex(62092);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: a */
    public final List<C83938b> mo88379a() {
        return this.f121299a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: b */
    public final C83938b mo88384b() {
        return this.f121300b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: c */
    public final int mo88387c() {
        return this.f121302d;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: b */
    public final void mo88385b(AbstractC52708i.AbstractC52709a aVar) {
        C89219l.m154721d(aVar, "");
        this.f121301c.remove(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: a */
    public final void mo88380a(int i) {
        this.f121302d = i;
        Iterator<T> it = this.f121301c.iterator();
        while (it.hasNext()) {
            it.next().mo88369b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: a */
    public final void mo88381a(AbstractC52708i.AbstractC52709a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f121301c.contains(aVar)) {
            this.f121301c.add(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: b */
    public final void mo88386b(C83938b bVar) {
        if (!C89219l.m154714a(this.f121300b, bVar)) {
            this.f121300b = bVar;
            Iterator<T> it = this.f121301c.iterator();
            while (it.hasNext()) {
                it.next().mo88366a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: a */
    public final void mo88382a(C83938b bVar) {
        C89219l.m154721d(bVar, "");
        int i = 0;
        for (C83938b bVar2 : this.f121299a) {
            if (bVar2.f187373a != bVar.f187373a) {
                i++;
            } else if (i >= 0) {
                C83938b bVar3 = this.f121299a.get(i);
                C89219l.m154716b(bVar3, "");
                bVar3.f187384l = true;
                this.f121299a.set(i, bVar.clone());
                Iterator<T> it = this.f121301c.iterator();
                while (it.hasNext()) {
                    it.next().mo88367a(bVar);
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i
    /* renamed from: a */
    public final void mo88383a(List<? extends C83938b> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(this.f121299a);
        this.f121299a.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f121299a.add(it.next().clone());
        }
        ArrayList<C83938b> arrayList2 = this.f121299a;
        HashSet hashSet = new HashSet(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(hashSet);
        C89070n.m154531c((List) arrayList2);
        Iterator<T> it2 = this.f121301c.iterator();
        while (it2.hasNext()) {
            it2.next().mo88368a(arrayList, this.f121299a);
        }
    }
}

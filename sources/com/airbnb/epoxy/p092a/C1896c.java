package com.airbnb.epoxy.p092a;

import android.content.Context;
import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AbstractC1931d;
import com.airbnb.epoxy.AbstractC1942l;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.C1906aa;
import com.airbnb.epoxy.C1933e;
import com.airbnb.epoxy.C1974u;
import com.airbnb.epoxy.p092a.AbstractC1898d;
import com.airbnb.epoxy.p092a.C1901g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89266e;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.airbnb.epoxy.a.c */
public final class C1896c<P extends AbstractC1898d> extends RecyclerView.AbstractC1371n {

    /* renamed from: b */
    public static final C1897a f5729b = new C1897a((byte) 0);

    /* renamed from: a */
    public final C1899e<P> f5730a;

    /* renamed from: c */
    private C89269g f5731c;

    /* renamed from: d */
    private C89266e f5732d;

    /* renamed from: e */
    private int f5733e;

    /* renamed from: f */
    private int f5734f;

    /* renamed from: g */
    private final Map<Class<? extends AbstractC1956s<?>>, AbstractC1893a<?, ?, ? extends P>> f5735g;

    /* renamed from: h */
    private final C1901g f5736h;

    /* renamed from: i */
    private final AbstractC1931d f5737i;

    /* renamed from: j */
    private final int f5738j;

    static {
        Covode.recordClassIndex(2087);
    }

    /* renamed from: com.airbnb.epoxy.a.c$a */
    public static final class C1897a {
        static {
            Covode.recordClassIndex(2088);
        }

        private C1897a() {
        }

        public /* synthetic */ C1897a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static boolean m6076a(int i) {
        if (Math.abs(i) > 75) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m6077b(int i) {
        if (i == -1 || i >= this.f5733e) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final int m6078c(int i) {
        return Math.min(this.f5733e - 1, Math.max(i, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4753a(RecyclerView recyclerView, int i) {
        C89219l.m154719c(recyclerView, "");
        this.f5734f = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
    /* renamed from: a */
    public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        Object obj;
        View view;
        ArrayList arrayList;
        C1896c<P> cVar = this;
        C89219l.m154719c(recyclerView, "");
        if (!(i == 0 && i2 == 0) && !m6076a(i) && !m6076a(i2)) {
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i3 = adapter.getItemCount();
            } else {
                i3 = 0;
            }
            cVar.f5733e = i3;
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int k = linearLayoutManager.mo4371k();
                int m = linearLayoutManager.mo4373m();
                if (cVar.m6077b(k) || cVar.m6077b(m)) {
                    cVar.f5731c = C89269g.f202934e;
                    cVar.f5732d = C89269g.f202934e;
                    return;
                }
                C89269g gVar = new C89269g(k, m);
                if (!C89219l.m154714a(gVar, cVar.f5731c)) {
                    if (gVar.f202927a > cVar.f5731c.f202927a || gVar.f202928b > cVar.f5731c.f202928b) {
                        z = true;
                        i4 = m + 1;
                    } else {
                        z = false;
                        i4 = k - 1;
                    }
                    int i7 = cVar.f5738j;
                    if (z) {
                        i5 = i7 - 1;
                    } else {
                        i5 = 1 - i7;
                    }
                    int c = cVar.m6078c(i4);
                    int c2 = cVar.m6078c(i5 + i4);
                    if (z) {
                        i6 = 1;
                    } else {
                        i6 = -1;
                    }
                    C89266e a = C89266e.C89267a.m154754a(c, c2, i6);
                    for (Number number : C89070n.m154568c(a, cVar.f5732d)) {
                        int intValue = number.intValue();
                        AbstractC1931d dVar = cVar.f5737i;
                        C89219l.m154719c(dVar, "");
                        AbstractC1956s<?> a2 = dVar.mo5714a(intValue);
                        if ((a2 instanceof AbstractC1956s) && a2 != null) {
                            AbstractC1893a<?, ?, ? extends P> aVar = cVar.f5735g.get(a2.getClass());
                            if (!(aVar instanceof AbstractC1893a)) {
                                aVar = null;
                            }
                            AbstractC1893a<?, ?, ? extends P> aVar2 = aVar;
                            if (aVar2 != null) {
                                C1901g gVar2 = cVar.f5736h;
                                C89219l.m154719c(aVar2, "");
                                C89219l.m154719c(a2, "");
                                C1901g.C1902a a3 = gVar2.mo5644a(a2);
                                Map<C1901g.C1902a, List<C1903h<?>>> map = gVar2.f5740a;
                                ArrayList arrayList2 = map.get(a3);
                                if (arrayList2 == null) {
                                    C1933e a4 = C1906aa.m6085a(gVar2.f5741b);
                                    C89219l.m154709a((Object) a4, "");
                                    Iterator it = a4.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it.next();
                                        C1974u uVar = (C1974u) obj;
                                        C89219l.m154709a((Object) uVar, "");
                                        AbstractC1956s<?> b = uVar.mo5821b();
                                        if (C89219l.m154714a(C89204ab.m154669a(b.getClass()), C89204ab.m154669a(a2.getClass())) && C0792v.m2791y(uVar.itemView) && C0792v.m2788v(uVar.itemView)) {
                                            uVar.getAdapterPosition();
                                            if (C89219l.m154714a(gVar2.mo5644a(b), a3)) {
                                                break;
                                            }
                                        }
                                    }
                                    C1974u uVar2 = (C1974u) obj;
                                    if (uVar2 == null || (view = uVar2.itemView) == null) {
                                        arrayList2 = null;
                                    } else {
                                        C89219l.m154709a((Object) view, "");
                                        C89219l.m154719c(uVar2, "");
                                        Object a5 = uVar2.mo5819a();
                                        C89219l.m154709a(a5, "");
                                        if (!aVar2.f5728b.isEmpty()) {
                                            List<Integer> list = aVar2.f5728b;
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator<T> it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                int intValue2 = it2.next().intValue();
                                                View findViewById = view.findViewById(intValue2);
                                                if (findViewById == null) {
                                                    AbstractC89183m<Context, RuntimeException, C89391z> mVar = gVar2.f5742c;
                                                    Context context = view.getContext();
                                                    C89219l.m154709a((Object) context, "");
                                                    mVar.invoke(context, new C1895b("View with id " + intValue2 + " in " + a2.getClass().getSimpleName() + " could not be found."));
                                                } else {
                                                    arrayList3.add(findViewById);
                                                }
                                            }
                                            arrayList = arrayList3;
                                        } else if (view instanceof AbstractC1900f) {
                                            arrayList = ((AbstractC1900f) view).mo5643a();
                                        } else if (a5 instanceof AbstractC1900f) {
                                            arrayList = ((AbstractC1900f) a5).mo5643a();
                                        } else {
                                            arrayList = C89086z.INSTANCE;
                                        }
                                        if (arrayList.isEmpty()) {
                                            AbstractC89183m<Context, RuntimeException, C89391z> mVar2 = gVar2.f5742c;
                                            Context context2 = view.getContext();
                                            C89219l.m154709a((Object) context2, "");
                                            mVar2.invoke(context2, new C1895b("No preloadable views were found in " + a2.getClass().getSimpleName()));
                                        }
                                        ArrayList<View> arrayList4 = new ArrayList();
                                        for (View view2 : arrayList) {
                                            C89070n.m154535a((Collection) arrayList4, (Iterable) gVar2.mo5645a(view2));
                                        }
                                        ArrayList arrayList5 = new ArrayList();
                                        for (View view3 : arrayList4) {
                                            int width = (view3.getWidth() - view3.getPaddingLeft()) - view3.getPaddingRight();
                                            int height = (view3.getHeight() - view3.getPaddingTop()) - view3.getPaddingBottom();
                                            if (width <= 0 || height <= 0) {
                                                AbstractC89183m<Context, RuntimeException, C89391z> mVar3 = gVar2.f5742c;
                                                Context context3 = view3.getContext();
                                                C89219l.m154709a((Object) context3, "");
                                                mVar3.invoke(context3, new C1895b(view3.getClass().getSimpleName() + " in " + a2.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
                                            } else {
                                                arrayList5.add(new C1903h<>(view3.getId(), width, height, aVar2.mo5642a()));
                                            }
                                        }
                                        arrayList2 = arrayList5;
                                    }
                                    map.put(a3, arrayList2);
                                }
                                if (!(arrayList2 instanceof List)) {
                                    arrayList2 = null;
                                }
                                List<C1903h<?>> list2 = arrayList2;
                                if (list2 == null) {
                                    list2 = C89086z.INSTANCE;
                                }
                                Iterator<T> it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    it3.next();
                                    C1899e<P> eVar = this.f5730a;
                                    P poll = eVar.f5739a.poll();
                                    eVar.f5739a.offer(poll);
                                    C89219l.m154709a((Object) poll, "");
                                }
                                cVar = this;
                            }
                        }
                    }
                    cVar.f5731c = gVar;
                    cVar.f5732d = a;
                    return;
                }
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1896c(AbstractC1942l lVar, AbstractC89171a<? extends P> aVar, AbstractC89183m<? super Context, ? super RuntimeException, C89391z> mVar, int i, List<? extends AbstractC1893a<?, ?, ? extends P>> list) {
        this((AbstractC1931d) lVar, (AbstractC89171a) aVar, mVar, i, (List) list);
        C89219l.m154719c(lVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(list, "");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1896c(com.airbnb.epoxy.AbstractC1944n r7, p4600h.p4611f.p4612a.AbstractC89171a<? extends P> r8, p4600h.p4611f.p4612a.AbstractC89183m<? super android.content.Context, ? super java.lang.RuntimeException, p4600h.C89391z> r9, int r10, java.util.List<? extends com.airbnb.epoxy.p092a.AbstractC1893a<?, ?, ? extends P>> r11) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r7, r0)
            r2 = r8
            p4600h.p4611f.p4613b.C89219l.m154719c(r2, r0)
            r3 = r9
            p4600h.p4611f.p4613b.C89219l.m154719c(r3, r0)
            r5 = r11
            p4600h.p4611f.p4613b.C89219l.m154719c(r5, r0)
            com.airbnb.epoxy.o r1 = r7.getAdapter()
            p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
            r0 = r6
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.p092a.C1896c.<init>(com.airbnb.epoxy.n, h.f.a.a, h.f.a.m, int, java.util.List):void");
    }

    private C1896c(AbstractC1931d dVar, AbstractC89171a<? extends P> aVar, AbstractC89183m<? super Context, ? super RuntimeException, C89391z> mVar, int i, List<? extends AbstractC1893a<?, ?, ? extends P>> list) {
        this.f5737i = dVar;
        this.f5738j = i;
        this.f5731c = C89269g.f202934e;
        this.f5732d = C89269g.f202934e;
        this.f5733e = -1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) list, 10)), 16));
        for (T t : list) {
            linkedHashMap.put(t.f5727a, t);
        }
        this.f5735g = linkedHashMap;
        this.f5730a = new C1899e<>(this.f5738j, aVar);
        this.f5736h = new C1901g(this.f5737i, mVar);
        if (this.f5738j <= 0) {
            throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.f5738j).toString());
        }
    }
}

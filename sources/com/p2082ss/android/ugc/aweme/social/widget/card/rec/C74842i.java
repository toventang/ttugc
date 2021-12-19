package com.p2082ss.android.ugc.aweme.social.widget.card.rec;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74768b;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74772c;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74783e;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74787i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74762g;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74764h;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74825a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSquareCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.C74875a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i */
public final class C74842i {

    /* renamed from: e */
    public static final C74845b f168210e = new C74845b((byte) 0);

    /* renamed from: a */
    public final WeakReference<RecyclerView> f168211a;

    /* renamed from: b */
    public final C74743a f168212b;

    /* renamed from: c */
    public final C74765i f168213c;

    /* renamed from: d */
    public final AbstractC74841h f168214d;

    /* renamed from: f */
    private final AbstractC89244h f168215f = C89250i.m154773a((AbstractC89171a) new C74855i(this));

    /* renamed from: g */
    private final AbstractC89244h f168216g = C89250i.m154773a((AbstractC89171a) new C74854h(this));

    static {
        Covode.recordClassIndex(87700);
    }

    /* renamed from: a */
    public final SocialCardVM mo117897a() {
        return (SocialCardVM) this.f168215f.getValue();
    }

    /* renamed from: b */
    public final AbstractC17692b<Integer> mo117898b() {
        return (AbstractC17692b) this.f168216g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$b */
    public static final class C74845b {
        static {
            Covode.recordClassIndex(87703);
        }

        private C74845b() {
        }

        public /* synthetic */ C74845b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$a */
    public static final class C74843a implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f168217a;

        static {
            Covode.recordClassIndex(87701);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74842i.C74843a.C748441 */

                /* renamed from: a */
                public int f168218a;

                /* renamed from: b */
                final /* synthetic */ C74843a f168219b;

                static {
                    Covode.recordClassIndex(87702);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f168218a < this.f168219b.f168217a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f168219b.f168217a;
                    int i = this.f168218a;
                    this.f168218a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f168219b = r1;
                }
            };
        }

        public C74843a(ViewGroup viewGroup) {
            this.f168217a = viewGroup;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$f */
    public static final class C74851f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74842i f168225a;

        static {
            Covode.recordClassIndex(87709);
        }

        C74851f(C74842i iVar) {
            this.f168225a = iVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$f$a */
        static final class RunnableC74852a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f168226a;

            /* renamed from: b */
            final /* synthetic */ RecyclerView f168227b;

            static {
                Covode.recordClassIndex(87710);
            }

            RunnableC74852a(int i, RecyclerView recyclerView) {
                this.f168226a = i;
                this.f168227b = recyclerView;
            }

            public final void run() {
                this.f168227b.mo4395a(this.f168226a, 0);
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView recyclerView;
            View view;
            Integer num = (Integer) obj;
            WeakReference<RecyclerView> weakReference = this.f168225a.f168211a;
            if (weakReference != null && (recyclerView = weakReference.get()) != null) {
                C89219l.m154716b(num, "");
                RecyclerView.ViewHolder f = recyclerView.mo4451f(num.intValue());
                if (f != null && (view = f.itemView) != null) {
                    int width = view.getWidth();
                    recyclerView.mo4420b(50, 0);
                    recyclerView.postDelayed(new RunnableC74852a(width, recyclerView), 600);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$h */
    static final class C74854h extends AbstractC89220m implements AbstractC89171a<AbstractC17692b<Integer>> {

        /* renamed from: a */
        final /* synthetic */ C74842i f168229a;

        static {
            Covode.recordClassIndex(87712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74854h(C74842i iVar) {
            super(0);
            this.f168229a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC17692b<Integer> invoke() {
            return this.f168229a.mo117897a().f168280u.getValue();
        }
    }

    /* renamed from: c */
    public final void mo117899c() {
        m131417e();
        m131416d();
        m131418f();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$i */
    static final class C74855i extends AbstractC89220m implements AbstractC89171a<SocialCardVM> {

        /* renamed from: a */
        final /* synthetic */ C74842i f168230a;

        static {
            Covode.recordClassIndex(87713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74855i(C74842i iVar) {
            super(0);
            this.f168230a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SocialCardVM invoke() {
            AbstractC1174ac a = new C1175ad(this.f168230a.f168212b, new C74875a(this.f168230a.f168213c)).mo3983a(SocialCardVM.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: d */
    private final void m131416d() {
        RecyclerView recyclerView;
        RecyclerView.AbstractC1350a adapter;
        WeakReference<RecyclerView> weakReference = this.f168211a;
        if (weakReference != null && (recyclerView = weakReference.get()) != null) {
            C74764h hVar = this.f168213c.f168054c;
            EnumC74754a aVar = null;
            if (hVar != null) {
                aVar = hVar.f168048a;
            }
            if (aVar == EnumC74754a.SQUARE && (adapter = recyclerView.getAdapter()) != null) {
                adapter.registerAdapterDataObserver(new C74772c(this.f168211a));
            }
        }
    }

    /* renamed from: e */
    private final void m131417e() {
        Map<EnumC74761f, EnumC74754a> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C74762g gVar = this.f168213c.f168053b;
        if (!(gVar == null || (map = gVar.f168044a) == null)) {
            for (Map.Entry<EnumC74761f, EnumC74754a> entry : map.entrySet()) {
                Class<? extends PermissionCell<? extends C74808c>> a = C74783e.m131298a(entry.getKey(), entry.getValue());
                linkedHashMap.put(Integer.valueOf(a.hashCode()), a);
            }
        }
        C74764h hVar = this.f168213c.f168054c;
        if (hVar != null) {
            Class<? extends RecommendUserCell<C74825a>> a2 = C74783e.m131299a(hVar);
            linkedHashMap.put(Integer.valueOf(a2.hashCode()), a2);
        }
        this.f168214d.mo117895a(linkedHashMap);
        if (this.f168213c.f168057f) {
            this.f168214d.mo117894a(C74787i.f168102a.mo117805a().mo117845a(this.f168212b, this.f168213c.f168058g));
        }
    }

    /* renamed from: f */
    private final void m131418f() {
        EnumC74754a aVar;
        mo117897a().f168272m.observe(this.f168212b, new C74846c(this));
        mo117897a().f168277r.observe(this.f168212b, new C74847d(this));
        mo117897a().f168279t.observe(this.f168212b, new C74848e(this));
        C74764h hVar = this.f168213c.f168054c;
        if (hVar != null) {
            aVar = hVar.f168048a;
        } else {
            aVar = null;
        }
        if (aVar == EnumC74754a.SQUARE) {
            mo117897a().f168274o.observe(this.f168212b, new C74851f(this));
        }
        mo117897a().f168276q.observe(this.f168212b, new C74853g(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$d */
    public static final class C74847d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74842i f168221a;

        static {
            Covode.recordClassIndex(87705);
        }

        C74847d(C74842i iVar) {
            this.f168221a = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                Context context = this.f168221a.f168212b.f168002a;
                if (!(context instanceof ActivityC0945e)) {
                    context = null;
                }
                ActivityC0945e eVar = (ActivityC0945e) context;
                if (eVar != null) {
                    new C23144b(eVar).mo37640e(intValue).mo37637b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$g */
    public static final class C74853g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74842i f168228a;

        static {
            Covode.recordClassIndex(87711);
        }

        C74853g(C74842i iVar) {
            this.f168228a = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            RecyclerView recyclerView;
            C89378p pVar = (C89378p) obj;
            boolean booleanValue = ((Boolean) pVar.component1()).booleanValue();
            int intValue = ((Number) pVar.component2()).intValue();
            WeakReference<RecyclerView> weakReference = this.f168228a.f168211a;
            if (weakReference != null && (recyclerView = weakReference.get()) != null) {
                C89219l.m154716b(recyclerView, "");
                int childCount = recyclerView.getChildCount();
                if (intValue >= 0 && childCount > intValue) {
                    if (booleanValue) {
                        recyclerView.mo4435d(intValue);
                    } else {
                        recyclerView.mo4413b(intValue);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$e */
    public static final class C74848e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74842i f168222a;

        static {
            Covode.recordClassIndex(87706);
        }

        C74848e(C74842i iVar) {
            this.f168222a = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Context a = this.f168222a.f168212b.mo117794a();
            Class<? extends AbstractC79495a> a2 = C74783e.m131297a(((C74808c) obj).f168131a);
            User b = C80580in.m139683b();
            C89219l.m154716b(b, "");
            String uid = b.getUid();
            String str = this.f168222a.f168213c.f168055d.get("enter_from");
            if (str == null) {
                str = "";
            }
            AbstractC88412b a3 = C79515b.m138229a(a, a2, uid, str, "click", true, false, null).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C748491.f168223a, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.social.widget.card.rec.C74842i.C74848e.C748502 */

                /* renamed from: a */
                final /* synthetic */ C74848e f168224a;

                static {
                    Covode.recordClassIndex(87708);
                }

                {
                    this.f168224a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    ((Throwable) obj).getMessage();
                    this.f168224a.f168222a.mo117897a().mo117910a(R.string.mh);
                }
            });
            C89219l.m154716b(a3, "");
            C88934a.m154195a(a3, this.f168222a.mo117897a().f168261b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.i$c */
    public static final class C74846c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74842i f168220a;

        static {
            Covode.recordClassIndex(87704);
        }

        C74846c(C74842i iVar) {
            this.f168220a = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC74754a aVar;
            RecyclerView recyclerView;
            List<? extends AbstractC17641a> list = (List) obj;
            if (list != null) {
                C74842i iVar = this.f168220a;
                C74764h hVar = iVar.f168213c.f168054c;
                if (hVar != null) {
                    aVar = hVar.f168048a;
                } else {
                    aVar = null;
                }
                if (aVar == EnumC74754a.SQUARE) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t instanceof C74825a) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList<T> arrayList2 = arrayList;
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                    for (T t2 : arrayList2) {
                        arrayList3.add(t2.f168175a);
                    }
                    int a = RecUserSquareCell.C74819a.m131378a(arrayList3);
                    WeakReference<RecyclerView> weakReference = iVar.f168211a;
                    if (!(weakReference == null || (recyclerView = weakReference.get()) == null)) {
                        for (T t3 : new C74843a(recyclerView)) {
                            if (t3.getLayoutParams().height != a) {
                                ViewGroup.LayoutParams layoutParams = t3.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = a;
                                    t3.setLayoutParams(layoutParams);
                                } else {
                                    throw new C89388w("null cannot be cast to non-null type");
                                }
                            }
                        }
                        recyclerView.mo4422c();
                        recyclerView.mo4403a(new C74768b(a));
                    }
                    PermissionSquareCell.f168124l = a;
                }
                this.f168220a.f168214d.mo117896b(list);
            }
        }
    }

    public C74842i(C74743a aVar, C74765i iVar, AbstractC74841h hVar) {
        WeakReference<RecyclerView> weakReference;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(hVar, "");
        this.f168212b = aVar;
        this.f168213c = iVar;
        this.f168214d = hVar;
        hVar.getClass().getSimpleName();
        C74764h hVar2 = iVar.f168054c;
        if (hVar2 != null) {
            weakReference = hVar2.f168051d;
        } else {
            weakReference = null;
        }
        this.f168211a = weakReference;
    }
}

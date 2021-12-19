package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0803x;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12751c;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.widget.FlexLayout;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC64966a;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65024b;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e */
public class C64945e extends AbstractC12769a implements AbstractC64958g {

    /* renamed from: j */
    public final C64939a f146770j = new C64939a();

    /* renamed from: k */
    private final List<EnumC65077d> f146771k = new ArrayList();

    /* renamed from: l */
    private final List<EnumC65024b> f146772l = new ArrayList();

    /* renamed from: m */
    private final List<EnumC64966a> f146773m = new ArrayList();

    /* renamed from: n */
    private final Map<EnumC65077d, Boolean> f146774n = new LinkedHashMap();

    /* renamed from: o */
    private final Map<EnumC64966a, Boolean> f146775o = new LinkedHashMap();

    /* renamed from: p */
    private final Map<EnumC65024b, Boolean> f146776p = new LinkedHashMap();

    /* renamed from: q */
    private TuxNavBar f146777q;

    /* renamed from: r */
    private final TuxNavBar.C23179a f146778r = new TuxNavBar.C23179a();

    /* renamed from: s */
    private final C23194g f146779s = new C23194g();

    static {
        Covode.recordClassIndex(76413);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$g */
    static final class C64956g extends AbstractC89220m implements AbstractC89172b<AbstractC23189c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f146795a;

        static {
            Covode.recordClassIndex(76424);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64956g(AbstractC89172b bVar) {
            super(1);
            this.f146795a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC23189c cVar) {
            AbstractC23189c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            this.f146795a.invoke(cVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$a */
    public static final class C64946a extends AbstractC89220m implements AbstractC89172b<AbstractC23189c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64945e f146780a;

        /* renamed from: b */
        final /* synthetic */ AbstractC65076c f146781b;

        static {
            Covode.recordClassIndex(76414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64946a(C64945e eVar, AbstractC65076c cVar) {
            super(1);
            this.f146780a = eVar;
            this.f146781b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC23189c cVar) {
            AbstractC23189c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C64957f.m116706a(cVar2, false);
            this.f146780a.mo104277a(this.f146781b, false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$b */
    static final class C64947b extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64940b f146782a;

        /* renamed from: b */
        final /* synthetic */ C64945e f146783b;

        static {
            Covode.recordClassIndex(76415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64947b(C64940b bVar, C64945e eVar) {
            super(1);
            this.f146782a = bVar;
            this.f146783b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20574a(this.f146783b, (AbstractC89172b<? super C12751c, C89391z>) new AbstractC89172b<C12751c, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e.C64947b.C649481 */

                /* renamed from: a */
                final /* synthetic */ C64947b f146784a;

                static {
                    Covode.recordClassIndex(76416);
                }

                {
                    this.f146784a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12751c cVar) {
                    C12751c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    cVar2.mo20602a(this.f146784a.f146782a.f146762b);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$c */
    static final class C64949c extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64940b f146785a;

        /* renamed from: b */
        final /* synthetic */ C64945e f146786b;

        static {
            Covode.recordClassIndex(76417);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64949c(C64940b bVar, C64945e eVar) {
            super(1);
            this.f146785a = bVar;
            this.f146786b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20574a(this.f146786b, (AbstractC89172b<? super C12751c, C89391z>) new AbstractC89172b<C12751c, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e.C64949c.C649501 */

                /* renamed from: a */
                final /* synthetic */ C64949c f146787a;

                static {
                    Covode.recordClassIndex(76418);
                }

                {
                    this.f146787a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12751c cVar) {
                    C12751c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    cVar2.mo20602a(this.f146787a.f146785a.f146762b);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$d */
    static final class C64951d extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64940b f146788a;

        /* renamed from: b */
        final /* synthetic */ C64945e f146789b;

        static {
            Covode.recordClassIndex(76419);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64951d(C64940b bVar, C64945e eVar) {
            super(1);
            this.f146788a = bVar;
            this.f146789b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20574a(this.f146789b, (AbstractC89172b<? super C12751c, C89391z>) new AbstractC89172b<C12751c, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e.C64951d.C649521 */

                /* renamed from: a */
                final /* synthetic */ C64951d f146790a;

                static {
                    Covode.recordClassIndex(76420);
                }

                {
                    this.f146790a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12751c cVar) {
                    C12751c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    cVar2.mo20602a(this.f146790a.f146788a.f146762b);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$e */
    public static final class C64953e extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64945e f146791a;

        static {
            Covode.recordClassIndex(76421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64953e(C64945e eVar) {
            super(1);
            this.f146791a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20581a(this.f146791a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64945e.C64953e.C649541 */

                /* renamed from: a */
                final /* synthetic */ C64953e f146792a;

                static {
                    Covode.recordClassIndex(76422);
                }

                {
                    this.f146792a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(this.f146792a.f146791a.f146770j);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.e$f */
    static final class C64955f extends AbstractC89220m implements AbstractC89172b<AbstractC23189c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64945e f146793a;

        /* renamed from: b */
        final /* synthetic */ AbstractC65076c f146794b;

        static {
            Covode.recordClassIndex(76423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64955f(C64945e eVar, AbstractC65076c cVar) {
            super(1);
            this.f146793a = eVar;
            this.f146794b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC23189c cVar) {
            AbstractC23189c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C64957f.m116706a(cVar2, true);
            this.f146793a.mo104277a(this.f146794b, true);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public void mo20630b(View view) {
        C89219l.m154721d(view, "");
        if (view instanceof TuxNavBar) {
            this.f146777q = (TuxNavBar) view;
            C12780d.m23007a(this, new C64953e(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g
    /* renamed from: b */
    public final void mo104279b(AbstractC65076c cVar) {
        C89219l.m154721d(cVar, "");
        TuxNavBar tuxNavBar = this.f146777q;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.mo37726a(cVar, new C64946a(this, cVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g
    /* renamed from: c */
    public final boolean mo104284c(AbstractC65076c cVar) {
        Boolean bool;
        C89219l.m154721d(cVar, "");
        if (cVar instanceof EnumC65077d) {
            Boolean bool2 = this.f146774n.get(cVar);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return false;
        } else if (cVar instanceof EnumC64966a) {
            return true;
        } else {
            if (!(cVar instanceof EnumC65024b) || (bool = this.f146776p.get(cVar)) == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g
    /* renamed from: a */
    public final void mo104275a(AbstractC65076c cVar) {
        C89219l.m154721d(cVar, "");
        List<AbstractC65076c> list = this.f146770j.f146760b.get(cVar);
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = m116693e(cVar).iterator();
            while (it.hasNext()) {
                if (list.contains(it.next())) {
                    return;
                }
            }
        }
        List<AbstractC65076c> list2 = this.f146770j.f146759a.get(cVar);
        if (list2 != null && !list2.isEmpty()) {
            for (T t : m116693e(cVar)) {
                if (list2.contains(t)) {
                    mo104279b((AbstractC65076c) t);
                }
            }
        }
        TuxNavBar tuxNavBar = this.f146777q;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.mo37726a(cVar, new C64955f(this, cVar));
    }

    /* renamed from: c */
    public final void mo104283c(List<C64940b<EnumC65024b>> list) {
        C89219l.m154721d(list, "");
        this.f146772l.clear();
        this.f146776p.clear();
        for (T t : list) {
            this.f146772l.add(t.f146761a);
            this.f146776p.put(t.f146761a, false);
            TuxNavBar.C23179a aVar = this.f146778r;
            C23187b a = new C23187b().mo37738a(0);
            a.f54933e = false;
            aVar.mo37733b(a.mo37743a((Object) t.f146761a));
        }
        TuxNavBar tuxNavBar = this.f146777q;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.setNavActions(this.f146778r);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C12780d.m23007a(this, new C64949c(it.next(), this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g
    /* renamed from: d */
    public final View mo104285d(AbstractC65076c cVar) {
        Object obj;
        C89219l.m154721d(cVar, "");
        TuxNavBar tuxNavBar = this.f146777q;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        C89219l.m154719c(cVar, "");
        LinearLayout linearLayout = (LinearLayout) tuxNavBar.mo37723a(R.id.nav_start);
        C89219l.m154709a((Object) linearLayout, "");
        AbstractC89306h<View> a = C0803x.m2810a(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) tuxNavBar.mo37723a(R.id.nav_end);
        C89219l.m154709a((Object) linearLayout2, "");
        AbstractC89306h a2 = C89309k.m154800a((AbstractC89306h) a, (AbstractC89306h) C0803x.m2810a(linearLayout2));
        LinearLayout linearLayout3 = (LinearLayout) tuxNavBar.mo37723a(R.id.cpy);
        C89219l.m154709a((Object) linearLayout3, "");
        Iterator a3 = C89309k.m154800a(a2, (AbstractC89306h) C0803x.m2810a(linearLayout3)).mo2926a();
        while (true) {
            if (!a3.hasNext()) {
                obj = null;
                break;
            }
            obj = a3.next();
            if (TuxNavBar.m43699a((View) obj, cVar)) {
                break;
            }
        }
        return (View) obj;
    }

    /* renamed from: e */
    private final List<AbstractC65076c> m116693e(AbstractC65076c cVar) {
        if (cVar instanceof EnumC65077d) {
            Map<EnumC65077d, Boolean> map = this.f146774n;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<EnumC65077d, Boolean> entry : map.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList.add(entry2.getKey());
            }
            return arrayList;
        } else if (cVar instanceof EnumC64966a) {
            return C89086z.INSTANCE;
        } else {
            if (cVar instanceof EnumC65024b) {
                Map<EnumC65024b, Boolean> map2 = this.f146776p;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<EnumC65024b, Boolean> entry3 : map2.entrySet()) {
                    if (entry3.getValue().booleanValue()) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                    arrayList2.add(entry4.getKey());
                }
                return arrayList2;
            }
            throw new IllegalArgumentException("Not StartArea, CenterArea or EndArea");
        }
    }

    /* renamed from: a */
    public final void mo104278a(List<C64940b<EnumC65077d>> list) {
        C89219l.m154721d(list, "");
        this.f146774n.clear();
        this.f146771k.clear();
        for (T t : list) {
            this.f146771k.add(t.f146761a);
            this.f146774n.put(t.f146761a, false);
            TuxNavBar.C23179a aVar = this.f146778r;
            C23187b a = new C23187b().mo37738a(0);
            a.f54933e = false;
            aVar.mo37732a(a.mo37743a((Object) t.f146761a));
        }
        TuxNavBar tuxNavBar = this.f146777q;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.setNavActions(this.f146778r);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C12780d.m23007a(this, new C64951d(it.next(), this));
        }
    }

    /* renamed from: b */
    public final void mo104282b(List<C64940b<EnumC64966a>> list) {
        C89219l.m154721d(list, "");
        this.f146773m.clear();
        this.f146775o.clear();
        for (T t : list) {
            this.f146773m.add(t.f146761a);
            this.f146775o.put(t.f146761a, false);
            TuxNavBar.C23179a aVar = this.f146778r;
            C23194g gVar = this.f146779s;
            gVar.mo37752a((Object) t.f146761a);
            aVar.mo37731a(gVar);
            C12780d.m23007a(this, new C64947b(t, this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g
    /* renamed from: a */
    public final void mo104276a(AbstractC65076c cVar, AbstractC89172b<? super C23187b, C89391z> bVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        TuxNavBar tuxNavBar = this.f146777q;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.mo37726a(cVar, new C64956g(bVar));
    }

    /* renamed from: a */
    public final void mo104277a(AbstractC65076c cVar, boolean z) {
        if (cVar instanceof EnumC65077d) {
            this.f146774n.put(cVar, Boolean.valueOf(z));
        } else if (cVar instanceof EnumC65024b) {
            this.f146776p.put(cVar, Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g
    /* renamed from: b */
    public final void mo104280b(AbstractC65076c cVar, AbstractC89172b<? super C23194g, C89391z> bVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        bVar.invoke(this.f146779s);
        TuxNavBar tuxNavBar = this.f146777q;
        if (tuxNavBar == null) {
            C89219l.m154710a("navBar");
        }
        tuxNavBar.mo37725a(this.f146779s);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64958g
    /* renamed from: b */
    public final void mo104281b(AbstractC65076c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        if (z) {
            TuxNavBar tuxNavBar = this.f146777q;
            if (tuxNavBar == null) {
                C89219l.m154710a("navBar");
            }
            C89219l.m154719c(cVar, "");
            LinearLayout linearLayout = (LinearLayout) tuxNavBar.mo37723a(R.id.nav_start);
            C89219l.m154709a((Object) linearLayout, "");
            AbstractC89306h<View> a = C0803x.m2810a(linearLayout);
            LinearLayout linearLayout2 = (LinearLayout) tuxNavBar.mo37723a(R.id.nav_end);
            C89219l.m154709a((Object) linearLayout2, "");
            Iterator a2 = C89309k.m154800a((AbstractC89306h) a, (AbstractC89306h) C0803x.m2810a(linearLayout2)).mo2926a();
            while (a2.hasNext()) {
                View view = (View) a2.next();
                if (TuxNavBar.m43699a(view, cVar)) {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    float applyDimension = TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics());
                    Resources system3 = Resources.getSystem();
                    C89219l.m154709a((Object) system3, "");
                    C23163i.m43658a(view, a3, applyDimension, TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics()));
                    LinearLayout linearLayout3 = (LinearLayout) tuxNavBar.mo37723a(R.id.nav_start);
                    C89219l.m154709a((Object) linearLayout3, "");
                    LinearLayout linearLayout4 = (LinearLayout) tuxNavBar.mo37723a(R.id.nav_end);
                    C89219l.m154709a((Object) linearLayout4, "");
                    FlexLayout flexLayout = (FlexLayout) tuxNavBar.mo37723a(R.id.cq0);
                    C89219l.m154709a((Object) flexLayout, "");
                    for (ViewGroup viewGroup : C89070n.m154522b(linearLayout3, linearLayout4, flexLayout)) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                }
            }
            TuxTextView tuxTextView = (TuxTextView) tuxNavBar.mo37723a(R.id.cpx);
            C89219l.m154709a((Object) tuxTextView, "");
            if (TuxNavBar.m43699a(tuxTextView, cVar)) {
                TuxTextView tuxTextView2 = (TuxTextView) tuxNavBar.mo37723a(R.id.cpx);
                C89219l.m154709a((Object) tuxTextView2, "");
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                C23163i.m43658a(tuxTextView2, C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system4.getDisplayMetrics())), 0.0f, 0.0f);
                LinearLayout linearLayout5 = (LinearLayout) tuxNavBar.mo37723a(R.id.cpy);
                C89219l.m154709a((Object) linearLayout5, "");
                linearLayout5.setClipToPadding(false);
                LinearLayout linearLayout6 = (LinearLayout) tuxNavBar.mo37723a(R.id.cpy);
                C89219l.m154709a((Object) linearLayout6, "");
                linearLayout6.setClipChildren(false);
                FlexLayout flexLayout2 = (FlexLayout) tuxNavBar.mo37723a(R.id.cq0);
                C89219l.m154709a((Object) flexLayout2, "");
                flexLayout2.setClipToPadding(false);
                FlexLayout flexLayout3 = (FlexLayout) tuxNavBar.mo37723a(R.id.cq0);
                C89219l.m154709a((Object) flexLayout3, "");
                flexLayout3.setClipChildren(false);
                return;
            }
            return;
        }
        TuxNavBar tuxNavBar2 = this.f146777q;
        if (tuxNavBar2 == null) {
            C89219l.m154710a("navBar");
        }
        C89219l.m154719c(cVar, "");
        LinearLayout linearLayout7 = (LinearLayout) tuxNavBar2.mo37723a(R.id.nav_start);
        C89219l.m154709a((Object) linearLayout7, "");
        AbstractC89306h<View> a4 = C0803x.m2810a(linearLayout7);
        LinearLayout linearLayout8 = (LinearLayout) tuxNavBar2.mo37723a(R.id.nav_end);
        C89219l.m154709a((Object) linearLayout8, "");
        Iterator a5 = C89309k.m154800a((AbstractC89306h) a4, (AbstractC89306h) C0803x.m2810a(linearLayout8)).mo2926a();
        while (a5.hasNext()) {
            View view2 = (View) a5.next();
            if (TuxNavBar.m43699a(view2, cVar)) {
                C23163i.m43669c(view2);
            }
        }
        TuxTextView tuxTextView3 = (TuxTextView) tuxNavBar2.mo37723a(R.id.cpx);
        C89219l.m154709a((Object) tuxTextView3, "");
        if (TuxNavBar.m43699a(tuxTextView3, cVar)) {
            TuxTextView tuxTextView4 = (TuxTextView) tuxNavBar2.mo37723a(R.id.cpx);
            C89219l.m154709a((Object) tuxTextView4, "");
            C23163i.m43669c(tuxTextView4);
        }
    }
}

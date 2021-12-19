package com.p2082ss.android.ugc.aweme.homepage.story.container;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel */
public final class DrawerViewModel extends AbstractC1174ac {

    /* renamed from: k */
    public static final C53032a f121916k = new C53032a((byte) 0);

    /* renamed from: a */
    public C1213t<Boolean> f121917a;

    /* renamed from: b */
    public C1213t<Boolean> f121918b;

    /* renamed from: c */
    public C1213t<Boolean> f121919c;

    /* renamed from: d */
    public C1213t<Boolean> f121920d;

    /* renamed from: e */
    public List<AbstractC53047e> f121921e = new ArrayList();

    /* renamed from: f */
    public List<AbstractC53046d> f121922f = new ArrayList();

    /* renamed from: g */
    public C1213t<Integer> f121923g;

    /* renamed from: h */
    public String f121924h;

    /* renamed from: i */
    public String f121925i;

    /* renamed from: j */
    public String f121926j;

    static {
        Covode.recordClassIndex(62572);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.container.DrawerViewModel$a */
    public static final class C53032a {
        static {
            Covode.recordClassIndex(62573);
        }

        private C53032a() {
        }

        public /* synthetic */ C53032a(byte b) {
            this();
        }

        /* renamed from: a */
        public static DrawerViewModel m97961a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = new C1175ad(eVar).mo3983a(DrawerViewModel.class);
            C89219l.m154716b(a, "");
            return (DrawerViewModel) a;
        }
    }

    public DrawerViewModel() {
        C1213t<Boolean> tVar = new C1213t<>();
        tVar.setValue(false);
        this.f121917a = tVar;
        C1213t<Boolean> tVar2 = new C1213t<>();
        tVar2.setValue(false);
        this.f121918b = tVar2;
        C1213t<Boolean> tVar3 = new C1213t<>();
        tVar3.setValue(false);
        this.f121919c = tVar3;
        C1213t<Boolean> tVar4 = new C1213t<>();
        tVar4.setValue(null);
        this.f121920d = tVar4;
        C1213t<Integer> tVar5 = new C1213t<>();
        tVar5.setValue(0);
        this.f121923g = tVar5;
        this.f121924h = "";
        this.f121925i = "";
        this.f121926j = "";
    }

    /* renamed from: b */
    public final void mo89468b(AbstractC53041a aVar) {
        C89219l.m154721d(aVar, "");
        List<AbstractC53047e> list = this.f121921e;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        C89206ad.m154680b(list).remove(aVar);
        List<AbstractC53046d> list2 = this.f121922f;
        Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        C89206ad.m154680b(list2).remove(aVar);
    }

    /* renamed from: a */
    public final void mo89467a(AbstractC53041a aVar) {
        C89219l.m154721d(aVar, "");
        if (C89070n.m154556a((Iterable) this.f121921e, (Object) aVar) || C89070n.m154556a((Iterable) this.f121922f, (Object) aVar)) {
            throw new RuntimeException("have been added, cannot add again");
        } else if (aVar instanceof AbstractC53047e) {
            this.f121921e.add(aVar);
        } else if (aVar instanceof AbstractC53046d) {
            this.f121922f.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo89466a(int i, String str) {
        C89219l.m154721d(str, "");
        C53055h.m98052a("operateDrawer >>> operate:" + i + " , " + str);
        this.f121924h = str;
        this.f121923g.setValue(Integer.valueOf(i));
    }
}

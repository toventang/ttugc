package com.p2082ss.android.ugc.gamora.recorder.p4294b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.experiment.C46873ec;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72788f;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73989bh;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74294n;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.e */
public final class C83410e {

    /* renamed from: g */
    public static final C83411a f186287g = new C83411a((byte) 0);

    /* renamed from: a */
    public final List<C83414f> f186288a = new ArrayList();

    /* renamed from: b */
    public C2563k<C83408c> f186289b;

    /* renamed from: c */
    public C2563k<String> f186290c;

    /* renamed from: d */
    public TabHost f186291d;

    /* renamed from: e */
    public TabHost.AbstractC74261a f186292e;

    /* renamed from: f */
    public TabHost.AbstractC74262b f186293f;

    /* renamed from: h */
    private C72788f f186294h;

    /* renamed from: i */
    private ShortVideoContext f186295i;

    static {
        Covode.recordClassIndex(97296);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.e$a */
    public static final class C83411a {
        static {
            Covode.recordClassIndex(97297);
        }

        private C83411a() {
        }

        public /* synthetic */ C83411a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo128432b() {
        C72788f fVar = this.f186294h;
        if (fVar == null) {
            C89219l.m154710a("tabConfig");
        }
        AbstractC23317a aVar = fVar.f163216c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo128433c() {
        C72788f fVar = this.f186294h;
        if (fVar == null) {
            C89219l.m154710a("tabConfig");
        }
        C73989bh.m130124a(fVar.f163221h, fVar.f163218e, fVar.f163220g);
    }

    /* renamed from: g */
    private final void m143795g() {
        TabHost tabHost = this.f186291d;
        if (tabHost == null) {
            C89219l.m154710a("bottomTabHost");
        }
        tabHost.setOnIndexChangedListener(new C83412b(this));
        TabHost tabHost2 = this.f186291d;
        if (tabHost2 == null) {
            C89219l.m154710a("bottomTabHost");
        }
        tabHost2.setSharedARTabChangeListener(new C83413c(this));
    }

    /* renamed from: h */
    private final void m143796h() {
        if (this.f186295i == null) {
            C89219l.m154710a("shortVideoContext");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f186288a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f186299b.f186284d);
        }
        String arrayList2 = arrayList.toString();
        C89219l.m154716b(arrayList2, "");
        C89219l.m154721d(arrayList2, "");
    }

    /* renamed from: d */
    public final String mo128434d() {
        if (this.f186291d == null) {
            return "";
        }
        TabHost tabHost = this.f186291d;
        if (tabHost == null) {
            C89219l.m154710a("bottomTabHost");
        }
        TabHost tabHost2 = this.f186291d;
        if (tabHost2 == null) {
            C89219l.m154710a("bottomTabHost");
        }
        Object a = tabHost.mo116829a(tabHost2.getCurrentIndex());
        if (!(a instanceof String)) {
            a = null;
        }
        String str = (String) a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    private final C72788f m143794f() {
        TabHost tabHost = this.f186291d;
        if (tabHost == null) {
            C89219l.m154710a("bottomTabHost");
        }
        ShortVideoContext shortVideoContext = this.f186295i;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        C72788f fVar = new C72788f(tabHost, shortVideoContext);
        List<C83414f> list = this.f186288a;
        ArrayList<C83414f> arrayList = new ArrayList();
        for (T t : list) {
            if (t.f186299b.f186282b.length() > 0) {
                arrayList.add(t);
            }
        }
        for (C83414f fVar2 : arrayList) {
            fVar.mo115071a(-1, fVar2.f186299b.f186282b, fVar2.f186299b.f186281a, fVar2.f186299b.f186283c);
        }
        return fVar;
    }

    /* renamed from: e */
    public final void mo128435e() {
        C84911q.m145921a("BottomTabPresenter dispatchEvent BottomTabIndexChangeEvent");
        String string = C63238c.f143574a.getString(R.string.f7k);
        C89219l.m154716b(string, "");
        for (T t : this.f186288a) {
            if (t.f186299b.f186285e) {
                string = t.f186299b.f186283c;
            }
        }
        C83408c cVar = new C83408c(null, string, 0, false, false, 24);
        cVar.f186275a = true;
        mo128428a(cVar);
        C2563k<C83408c> kVar = this.f186289b;
        if (kVar == null) {
            C89219l.m154710a("bottomTabIndexChangeEvent");
        }
        kVar.mo6999a(cVar);
    }

    /* renamed from: a */
    public final void mo128425a() {
        C74294n nVar;
        C72788f fVar = this.f186294h;
        if (fVar == null) {
            C89219l.m154710a("tabConfig");
        }
        if (!fVar.f163215b.mo128696a() && fVar.f163215b.mo128697b() && fVar.f163217d != null && fVar.f163216c == null && C46873ec.m90188b() && (nVar = fVar.f163217d) != null) {
            fVar.f163215b.f186871a.storeBoolean("has_live_tab_pop_up_show".concat(String.valueOf(C63238c.f143594u.mo93904c())), true);
            Context context = nVar.getContext();
            C89219l.m154716b(context, "");
            fVar.f163216c = new C23329a(context).mo38023e(R.string.cx7).mo38030a(3000L).mo38041b(nVar).mo38034a(EnumC23352h.TOP).mo38012d();
            C74294n nVar2 = fVar.f163217d;
            if (nVar2 == null) {
                C89219l.m154715b();
            }
            nVar2.postDelayed(new C72788f.RunnableC72789a(fVar), 100);
        }
    }

    /* renamed from: a */
    public final void mo128431a(boolean z) {
        TabHost tabHost = this.f186291d;
        if (tabHost == null) {
            C89219l.m154710a("bottomTabHost");
        }
        tabHost.setUISwitchEnabled(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.b.e$c */
    public static final class C83413c implements TabHost.AbstractC74262b {

        /* renamed from: a */
        final /* synthetic */ C83410e f186297a;

        static {
            Covode.recordClassIndex(97299);
        }

        C83413c(C83410e eVar) {
            this.f186297a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost.AbstractC74262b
        /* renamed from: a */
        public final void mo116854a(String str) {
            if (!C89219l.m154714a((Object) str, (Object) "")) {
                C2563k<String> kVar = this.f186297a.f186290c;
                if (kVar == null) {
                    C89219l.m154710a("sharedARTabIndexChangeEvent");
                }
                kVar.mo6999a(str);
                TabHost.AbstractC74262b bVar = this.f186297a.f186293f;
                if (bVar != null) {
                    bVar.mo116854a(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo128428a(C83408c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC83468l.C83469a aVar = new AbstractC83468l.C83469a(cVar.f186275a);
        Object obj = cVar.f186277c;
        if (!(obj instanceof String)) {
            obj = null;
        }
        aVar.f186421e = (String) obj;
        aVar.f186420d = cVar.f186280f;
        for (C83414f fVar : this.f186288a) {
            C83409d dVar = fVar.f186299b;
            if (TextUtils.equals((CharSequence) cVar.f186276b, dVar.f186283c)) {
                fVar.f186298a.setValue(false);
                if (dVar.f186286f != null) {
                    dVar.f186286f.onTabUnselected(dVar, aVar);
                }
            }
            Object obj2 = cVar.f186277c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (TextUtils.equals((CharSequence) obj2, dVar.f186283c)) {
                fVar.f186298a.setValue(true);
                if (dVar.f186286f != null) {
                    if (C89219l.m154714a((Object) dVar.f186283c, (Object) "record_mode_mv")) {
                        aVar.f186418b = false;
                    }
                    aVar.f186420d = cVar.f186280f;
                    dVar.f186286f.onTabSelected(dVar, aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo128430a(Set<String> set) {
        Set b;
        C72788f fVar = this.f186294h;
        if (fVar == null) {
            C89219l.m154710a("tabConfig");
        }
        TabHost tabHost = fVar.f163221h;
        ScrollableLinearLayout scrollableLinearLayout = fVar.f163214a;
        C89219l.m154716b(scrollableLinearLayout, "");
        C73989bh.m130126a(set, tabHost, scrollableLinearLayout, fVar.f163218e, fVar.f163220g);
        if (set != null && (b = C89070n.m154563b((Iterable) set, (Iterable) fVar.f163218e)) != null && b.size() >= 2 && !fVar.f163219f.mo128692a()) {
            ScrollableLinearLayout scrollableLinearLayout2 = fVar.f163214a;
            C89219l.m154716b(scrollableLinearLayout2, "");
            View a = C73989bh.m130121a(scrollableLinearLayout2, b);
            ScrollableLinearLayout scrollableLinearLayout3 = fVar.f163214a;
            C89219l.m154716b(scrollableLinearLayout3, "");
            Context context = scrollableLinearLayout3.getContext();
            C89219l.m154716b(context, "");
            Activity a2 = C67279a.m119194a(context);
            if (a2 != null && !a2.isFinishing() && a != null) {
                ScrollableLinearLayout scrollableLinearLayout4 = fVar.f163214a;
                C89219l.m154716b(scrollableLinearLayout4, "");
                Context context2 = scrollableLinearLayout4.getContext();
                C89219l.m154716b(context2, "");
                Activity a3 = C67279a.m119194a(context2);
                if (a3 == null) {
                    C89219l.m154715b();
                }
                ((C23329a) new C23329a(a3).mo38041b(a).mo38034a(EnumC23352h.TOP)).mo38023e(R.string.aaf).mo38030a(5000L).mo38012d().mo38001a();
                fVar.f163219f.mo128693b();
            }
        }
    }

    /* renamed from: a */
    public final void mo128426a(ShortVideoContext shortVideoContext, TabHost tabHost) {
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(tabHost, "");
        this.f186295i = shortVideoContext;
        this.f186291d = tabHost;
        this.f186294h = m143794f();
        m143795g();
        m143796h();
    }

    /* renamed from: a */
    public final void mo128429a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C72788f fVar = this.f186294h;
        if (fVar == null) {
            C89219l.m154710a("tabConfig");
        }
        C89219l.m154721d(str, "");
        ScrollableLinearLayout scrollableLinearLayout = fVar.f163214a;
        C89219l.m154716b(scrollableLinearLayout, "");
        int i = 0;
        if (scrollableLinearLayout.getChildCount() > 0) {
            ScrollableLinearLayout scrollableLinearLayout2 = fVar.f163214a;
            C89219l.m154716b(scrollableLinearLayout2, "");
            int childCount = scrollableLinearLayout2.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = fVar.f163214a.getChildAt(i2);
                C89219l.m154716b(childAt, "");
                if (C89219l.m154714a((Object) str, childAt.getTag())) {
                    i = i2;
                    if (i < 0) {
                        return;
                    }
                } else {
                    i2++;
                }
            }
            TabHost tabHost = this.f186291d;
            if (tabHost == null) {
                C89219l.m154710a("bottomTabHost");
            }
            tabHost.mo116831a(i, true, z);
        }
    }

    /* renamed from: a */
    public final C83414f mo128424a(C82004a aVar, int i, AbstractC83405a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        aVar2.initialize(aVar);
        C83414f fVar = new C83414f(aVar2.createBottomTabItem(aVar), aVar2.provideScene());
        this.f186288a.add(i, fVar);
        String str = fVar.f186299b.f186282b;
        String str2 = fVar.f186299b.f186283c;
        C72788f fVar2 = this.f186294h;
        if (fVar2 == null) {
            C89219l.m154710a("tabConfig");
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        fVar2.mo115071a(i, str, 0, str2);
        TabHost tabHost = this.f186291d;
        if (tabHost == null) {
            C89219l.m154710a("bottomTabHost");
        }
        tabHost.requestLayout();
        return fVar;
    }

    /* renamed from: a */
    public final void mo128427a(C82004a aVar, List<? extends AbstractC83405a> list, C2563k<C83408c> kVar, C2563k<String> kVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        this.f186289b = kVar;
        this.f186290c = kVar2;
        for (T t : list) {
            t.initialize(aVar);
            this.f186288a.add(new C83414f(t.createBottomTabItem(aVar), t.provideScene()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.b.e$b */
    public static final class C83412b implements TabHost.AbstractC74261a {

        /* renamed from: a */
        final /* synthetic */ C83410e f186296a;

        static {
            Covode.recordClassIndex(97298);
        }

        C83412b(C83410e eVar) {
            this.f186296a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost.AbstractC74261a
        /* renamed from: a */
        public final void mo116853a(Object obj, int i, int i2, boolean z, boolean z2) {
            TabHost tabHost = this.f186296a.f186291d;
            if (tabHost == null) {
                C89219l.m154710a("bottomTabHost");
            }
            Object a = tabHost.mo116829a(i);
            if (a == null) {
                a = "";
            }
            C89219l.m154716b(a, "");
            C83408c cVar = new C83408c(obj, a, i2, false, z2, 8);
            this.f186296a.mo128428a(cVar);
            if (!C89219l.m154714a(a, (Object) "")) {
                C2563k<C83408c> kVar = this.f186296a.f186289b;
                if (kVar == null) {
                    C89219l.m154710a("bottomTabIndexChangeEvent");
                }
                kVar.mo6999a(cVar);
                TabHost.AbstractC74261a aVar = this.f186296a.f186292e;
                if (aVar != null) {
                    aVar.mo116853a(obj, i, i2, z, z2);
                }
            }
        }
    }
}

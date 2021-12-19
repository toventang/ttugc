package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel */
public final class HomeTabViewModel extends AbstractC1174ac {

    /* renamed from: b */
    public static final C53309a f122374b = new C53309a((byte) 0);

    /* renamed from: a */
    public final HashMap<String, AbstractC35329by> f122375a = new HashMap<>();

    /* renamed from: c */
    private final ActivityC0945e f122376c;

    /* renamed from: d */
    private final HashMap<AbstractC35329by, View> f122377d = new HashMap<>();

    /* renamed from: e */
    private List<? extends AbstractC35329by> f122378e;

    /* renamed from: f */
    private List<? extends AbstractC35329by> f122379f;

    static {
        Covode.recordClassIndex(62868);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel$a */
    public static final class C53309a {
        static {
            Covode.recordClassIndex(62869);
        }

        private C53309a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel$a$a */
        public static final class C53310a implements C1175ad.AbstractC1177b {

            /* renamed from: a */
            final /* synthetic */ ActivityC0945e f122380a;

            static {
                Covode.recordClassIndex(62870);
            }

            C53310a(ActivityC0945e eVar) {
                this.f122380a = eVar;
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new HomeTabViewModel(this.f122380a);
            }
        }

        public /* synthetic */ C53309a(byte b) {
            this();
        }

        /* renamed from: a */
        public static HomeTabViewModel m98315a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, new C53310a(eVar)).mo3983a(HomeTabViewModel.class);
            C89219l.m154716b(a, "");
            return (HomeTabViewModel) a;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.by>, java.util.List<com.ss.android.ugc.aweme.by> */
    /* renamed from: a */
    public final List<AbstractC35329by> mo89736a() {
        if (this.f122378e == null) {
            this.f122378e = C53311a.f122381a.mo62211a(this.f122376c);
        }
        List list = this.f122378e;
        if (list == null) {
            C89219l.m154715b();
        }
        return list;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.by>, java.util.List<com.ss.android.ugc.aweme.by> */
    /* renamed from: b */
    public final List<AbstractC35329by> mo89740b() {
        if (this.f122379f == null) {
            this.f122379f = C53312b.f122382a.mo62211a(this.f122376c);
        }
        List list = this.f122379f;
        if (list == null) {
            C89219l.m154715b();
        }
        return list;
    }

    /* renamed from: a */
    public final <T extends View> T mo89734a(AbstractC35329by byVar) {
        View view = this.f122377d.get(byVar);
        if (!(view instanceof View)) {
            view = null;
        }
        return (T) view;
    }

    public HomeTabViewModel(ActivityC0945e eVar) {
        if (eVar == null) {
            C89219l.m154715b();
        }
        this.f122376c = eVar;
    }

    /* renamed from: a */
    public final <T extends AbstractC35329by> T mo89735a(String str) {
        C89219l.m154721d(str, "");
        AbstractC35329by byVar = this.f122375a.get(str);
        if (!(byVar instanceof AbstractC35329by)) {
            byVar = null;
        }
        return (T) byVar;
    }

    /* renamed from: b */
    public final <T extends View> T mo89739b(String str) {
        View view = this.f122377d.get(this.f122375a.get(str));
        if (!(view instanceof View)) {
            view = null;
        }
        return (T) view;
    }

    /* renamed from: a */
    public final void mo89737a(AbstractC35329by byVar, View view) {
        C89219l.m154721d(view, "");
        this.f122377d.put(byVar, view);
    }

    /* renamed from: a */
    public final void mo89738a(String str, AbstractC35329by byVar) {
        C89219l.m154721d(str, "");
        this.f122375a.put(str, byVar);
    }
}

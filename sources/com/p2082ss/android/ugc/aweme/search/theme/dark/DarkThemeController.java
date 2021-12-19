package com.p2082ss.android.ugc.aweme.search.theme.dark;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.search.theme.C67757a;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import com.p2082ss.android.ugc.aweme.search.theme.dark.C67799c;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController */
public final class DarkThemeController implements View.OnAttachStateChangeListener, C67757a.AbstractC67759b, C67799c.AbstractC67802c, AbstractC80379eg {

    /* renamed from: h */
    public static final C67786a f151917h = new C67786a((byte) 0);

    /* renamed from: a */
    public boolean f151918a;

    /* renamed from: b */
    public boolean f151919b;

    /* renamed from: c */
    public boolean f151920c;

    /* renamed from: d */
    public C67782c f151921d;

    /* renamed from: e */
    public final ActivityC0945e f151922e;

    /* renamed from: f */
    public final RecyclerView f151923f;

    /* renamed from: g */
    public final AbstractC51043a f151924g;

    /* renamed from: i */
    private final AbstractC89244h f151925i = C89250i.m154773a((AbstractC89171a) new C67790e(this));

    /* renamed from: j */
    private final AbstractC89244h f151926j = C89250i.m154773a((AbstractC89171a) new C67788c(this));

    /* renamed from: k */
    private final AbstractC89244h f151927k = C89250i.m154773a((AbstractC89171a) new C67791f(this));

    /* renamed from: l */
    private final AbstractC89244h f151928l = C89250i.m154773a((AbstractC89171a) new C67787b(this));

    static {
        Covode.recordClassIndex(79437);
    }

    /* renamed from: g */
    private final C67796a m119957g() {
        return (C67796a) this.f151928l.getValue();
    }

    /* renamed from: a */
    public final C67757a mo106876a() {
        return (C67757a) this.f151925i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.theme.C67757a.AbstractC67759b
    /* renamed from: a */
    public final void mo106855a(float f) {
    }

    /* renamed from: b */
    public final C67799c mo106878b() {
        return (C67799c) this.f151926j.getValue();
    }

    /* renamed from: c */
    public final ThemeViewModel mo106879c() {
        return (ThemeViewModel) this.f151927k.getValue();
    }

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController$a */
    static final class C67786a {
        static {
            Covode.recordClassIndex(79438);
        }

        private C67786a() {
        }

        public /* synthetic */ C67786a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        AbstractC80379eg.C80380a.onCreate(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        AbstractC80379eg.C80380a.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        AbstractC80379eg.C80380a.onResume(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC80379eg.C80380a.onStart(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        AbstractC80379eg.C80380a.onStop(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController$c */
    static final class C67788c extends AbstractC89220m implements AbstractC89171a<C67799c> {

        /* renamed from: a */
        final /* synthetic */ DarkThemeController f151930a;

        static {
            Covode.recordClassIndex(79440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67788c(DarkThemeController darkThemeController) {
            super(0);
            this.f151930a = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67799c invoke() {
            return new C67799c(this.f151930a.f151923f, this.f151930a.f151924g, this.f151930a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController$e */
    static final class C67790e extends AbstractC89220m implements AbstractC89171a<C67757a> {

        /* renamed from: a */
        final /* synthetic */ DarkThemeController f151932a;

        static {
            Covode.recordClassIndex(79442);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67790e(DarkThemeController darkThemeController) {
            super(0);
            this.f151932a = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67757a invoke() {
            return new C67757a(this.f151932a.f151922e, this.f151932a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.theme.dark.C67799c.AbstractC67802c
    /* renamed from: f */
    public final void mo106882f() {
        C67782c cVar = this.f151921d;
        if (cVar != null) {
            m119957g().mo106892a(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController$f */
    static final class C67791f extends AbstractC89220m implements AbstractC89171a<ThemeViewModel> {

        /* renamed from: a */
        final /* synthetic */ DarkThemeController f151933a;

        static {
            Covode.recordClassIndex(79443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67791f(DarkThemeController darkThemeController) {
            super(0);
            this.f151933a = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ThemeViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3881a(this.f151933a.f151922e, (C1175ad.AbstractC1177b) null).mo3983a(ThemeViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: h */
    private void m119958h() {
        this.f151923f.removeOnAttachStateChangeListener(this);
        mo106876a().mo106854e();
        mo106878b().mo106899b();
    }

    /* renamed from: d */
    public final void mo106880d() {
        if (this.f151920c) {
            m119958h();
            this.f151921d = null;
            this.f151918a = false;
            mo106879c().mo106886a(new C67782c("light", -1, (Integer) null, 12));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.theme.dark.C67799c.AbstractC67802c
    /* renamed from: e */
    public final void mo106881e() {
        m119957g().mo106892a(new C67782c("light", -1, (Integer) null, 12));
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController$b */
    static final class C67787b extends AbstractC89220m implements AbstractC89171a<C67796a> {

        /* renamed from: a */
        final /* synthetic */ DarkThemeController f151929a;

        static {
            Covode.recordClassIndex(79439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67787b(DarkThemeController darkThemeController) {
            super(0);
            this.f151929a = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67796a invoke() {
            C67796a aVar = new C67796a(this.f151929a.mo106879c());
            aVar.setFloatValues(0.0f, 1.0f);
            aVar.setDuration(250L);
            return aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    public final void onDestroy() {
        Integer num;
        AbstractC80379eg.C80380a.onDestroy(this);
        Fragment g = this.f151924g.mo60503g();
        if (g != null) {
            num = Integer.valueOf(g.hashCode());
        } else {
            num = null;
        }
        ConcurrentHashMap<Integer, AbstractC67459a> concurrentHashMap = C67797b.m119978a().get(num);
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        m119958h();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.theme.C67757a.AbstractC67759b
    /* renamed from: a */
    public final void mo106856a(boolean z) {
        if (z) {
            mo106857b(true);
        } else {
            mo106858c(true);
        }
    }

    /* renamed from: a */
    public final void mo106877a(C67782c cVar) {
        C89219l.m154721d(cVar, "");
        this.f151921d = cVar;
        if (this.f151919b) {
            mo106879c().mo106886a(cVar);
            this.f151920c = true;
        } else {
            this.f151918a = true;
        }
        mo106879c().mo106887b().observe(this.f151922e, new C67789d(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.search.theme.C67757a.AbstractC67759b
    /* renamed from: b */
    public final void mo106857b(boolean z) {
        C67782c cVar;
        mo106878b().mo106898a();
        C67782c cVar2 = this.f151921d;
        if ((cVar2 != null && cVar2.f151912c != null && !mo106878b().mo106898a()) || (cVar = this.f151921d) == null) {
            return;
        }
        if (z) {
            m119957g().mo106892a(cVar);
        } else {
            mo106879c().mo106886a(cVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.theme.C67757a.AbstractC67759b
    /* renamed from: c */
    public final void mo106858c(boolean z) {
        mo106878b().mo106898a();
        C67782c cVar = this.f151921d;
        if (cVar == null || cVar.f151912c == null || mo106878b().mo106898a()) {
            C67782c cVar2 = new C67782c("light", -1, (Integer) null, 12);
            if (z) {
                m119957g().mo106892a(cVar2);
            } else {
                mo106879c().mo106886a(cVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.theme.dark.DarkThemeController$d */
    public static final class C67789d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ DarkThemeController f151931a;

        static {
            Covode.recordClassIndex(79441);
        }

        C67789d(DarkThemeController darkThemeController) {
            this.f151931a = darkThemeController;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            if (((Boolean) obj).booleanValue() && this.f151931a.f151921d != null) {
                this.f151931a.f151923f.removeOnAttachStateChangeListener(this.f151931a);
                this.f151931a.f151923f.addOnAttachStateChangeListener(this.f151931a);
                this.f151931a.mo106876a().mo106853d();
                C67782c cVar = this.f151931a.f151921d;
                if (cVar != null && (num = cVar.f151912c) != null) {
                    int intValue = num.intValue();
                    C67799c b = this.f151931a.mo106878b();
                    b.f151949b = Integer.valueOf(intValue);
                    b.f151950c.mo4418b(b);
                    b.f151950c.mo4405a(b);
                }
            }
        }
    }

    public DarkThemeController(ActivityC0945e eVar, RecyclerView recyclerView, AbstractC51043a aVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(aVar, "");
        this.f151922e = eVar;
        this.f151923f = recyclerView;
        this.f151924g = aVar;
        C80375ef.m139356a(eVar, this);
    }
}

package com.p2082ss.android.ugc.aweme.ftc.components.toolbar;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel */
public final class FTCEditToolbarViewModel extends LifecycleAwareViewModel<FTCEditToolbarState> implements AbstractC52410k {

    /* renamed from: a */
    private final C1213t<Integer> f120625a = new C1213t<>();

    /* renamed from: b */
    private final AbstractC89244h f120626b = C89250i.m154773a((AbstractC89171a) C52362b.f120633a);

    /* renamed from: c */
    private final AbstractC89244h f120627c = C89250i.m154773a((AbstractC89171a) C52376p.f120647a);

    /* renamed from: d */
    private final AbstractC89244h f120628d = C89250i.m154773a((AbstractC89171a) C52373m.f120644a);

    /* renamed from: e */
    private final AbstractC89244h f120629e = C89250i.m154773a((AbstractC89171a) C52375o.f120646a);

    /* renamed from: f */
    private final AbstractC89244h f120630f = C89250i.m154773a((AbstractC89171a) C52374n.f120645a);

    /* renamed from: g */
    private final AbstractC89244h f120631g = C89250i.m154773a((AbstractC89171a) C52372l.f120643a);

    static {
        Covode.recordClassIndex(61752);
    }

    /* renamed from: g */
    public final C1213t<Boolean> mo88158g() {
        return (C1213t) this.f120626b.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Map<Integer, C1213t<Boolean>> mo88159h() {
        return (Map) this.f120627c.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Map<Integer, C1213t<Boolean>> mo88160i() {
        return (Map) this.f120628d.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Map<Integer, C1213t<Boolean>> mo88161j() {
        return (Map) this.f120629e.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Map<Integer, C1213t<Boolean>> mo88162k() {
        return (Map) this.f120630f.getValue();
    }

    /* renamed from: l */
    public final C1213t<Boolean> mo88163l() {
        return (C1213t) this.f120631g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.toolbar.AbstractC52410k
    /* renamed from: b */
    public final LiveData<Integer> mo88154b() {
        return this.f120625a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$b */
    static final class C52362b extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C52362b f120633a = new C52362b();

        static {
            Covode.recordClassIndex(61754);
        }

        C52362b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$l */
    static final class C52372l extends AbstractC89220m implements AbstractC89171a<C1213t<Boolean>> {

        /* renamed from: a */
        public static final C52372l f120643a = new C52372l();

        static {
            Covode.recordClassIndex(61764);
        }

        C52372l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Boolean> invoke() {
            return new C1213t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.toolbar.AbstractC52410k
    /* renamed from: a */
    public final void mo88148a() {
        mo33689c(C52361a.f120632a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new FTCEditToolbarState(new AbstractC23517a.C23519b(), null, null, null, null, null, null, null, null, null, null, 2046, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$m */
    static final class C52373m extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C52373m f120644a = new C52373m();

        static {
            Covode.recordClassIndex(61765);
        }

        C52373m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$n */
    static final class C52374n extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C52374n f120645a = new C52374n();

        static {
            Covode.recordClassIndex(61766);
        }

        C52374n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$o */
    static final class C52375o extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C52375o f120646a = new C52375o();

        static {
            Covode.recordClassIndex(61767);
        }

        C52375o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$p */
    static final class C52376p extends AbstractC89220m implements AbstractC89171a<Map<Integer, ? extends C1213t<Boolean>>> {

        /* renamed from: a */
        public static final C52376p f120647a = new C52376p();

        static {
            Covode.recordClassIndex(61768);
        }

        C52376p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, ? extends C1213t<Boolean>> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Integer num : C83395y.f186260d) {
                linkedHashMap.put(Integer.valueOf(num.intValue()), new C1213t());
            }
            return C89041ag.m154429c(linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo88149a(int i) {
        this.f120625a.setValue(Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$a */
    static final class C52361a extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        public static final C52361a f120632a = new C52361a();

        static {
            Covode.recordClassIndex(61753);
        }

        C52361a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, new C20526p(), null, null, null, null, 1983, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$c */
    static final class C52363c extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ String f120634a;

        static {
            Covode.recordClassIndex(61755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52363c(String str) {
            super(1);
            this.f120634a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, this.f120634a, null, null, null, null, null, null, null, 2039, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$f */
    static final class C52366f extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f120637a;

        static {
            Covode.recordClassIndex(61758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52366f(List list) {
            super(1);
            this.f120637a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, this.f120637a, null, null, null, null, null, 2015, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$h */
    static final class C52368h extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ Drawable f120639a;

        static {
            Covode.recordClassIndex(61760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52368h(Drawable drawable) {
            super(1);
            this.f120639a = drawable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, null, this.f120639a, null, null, 1791, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$i */
    static final class C52369i extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ String f120640a;

        static {
            Covode.recordClassIndex(61761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52369i(String str) {
            super(1);
            this.f120640a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, this.f120640a, null, null, null, 1919, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$j */
    static final class C52370j extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ List f120641a;

        static {
            Covode.recordClassIndex(61762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52370j(List list) {
            super(1);
            this.f120641a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, this.f120641a, null, null, null, null, null, null, 2031, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$d */
    static final class C52364d extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f120635a;

        static {
            Covode.recordClassIndex(61756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52364d(boolean z) {
            super(1);
            this.f120635a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, Boolean.valueOf(this.f120635a), null, null, null, null, null, null, null, null, 2043, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$e */
    static final class C52365e extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ boolean f120636a;

        static {
            Covode.recordClassIndex(61757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52365e(boolean z) {
            super(1);
            this.f120636a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, Boolean.valueOf(this.f120636a), null, null, null, null, null, null, null, null, null, 2045, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$g */
    public static final class C52367g extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f120638a;

        static {
            Covode.recordClassIndex(61759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52367g(int i) {
            super(1);
            this.f120638a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f120638a), 1023, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel$k */
    public static final class C52371k extends AbstractC89220m implements AbstractC89172b<FTCEditToolbarState, FTCEditToolbarState> {

        /* renamed from: a */
        final /* synthetic */ int f120642a;

        static {
            Covode.recordClassIndex(61763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52371k(int i) {
            super(1);
            this.f120642a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FTCEditToolbarState invoke(FTCEditToolbarState fTCEditToolbarState) {
            FTCEditToolbarState fTCEditToolbarState2 = fTCEditToolbarState;
            C89219l.m154721d(fTCEditToolbarState2, "");
            return FTCEditToolbarState.copy$default(fTCEditToolbarState2, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.f120642a), null, 1535, null);
        }
    }

    /* renamed from: a */
    public final void mo88151a(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        mo33689c(new C52368h(drawable));
    }

    /* renamed from: a */
    public final void mo88152a(List<C83395y> list) {
        C89219l.m154721d(list, "");
        mo33689c(new C52366f(list));
    }

    /* renamed from: a */
    public final void mo88153a(boolean z) {
        mo33689c(new C52364d(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.toolbar.AbstractC52410k
    /* renamed from: a */
    public final void mo88150a(int i, boolean z) {
        C1213t<Boolean> tVar = mo88159h().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    public final void mo88155b(int i, boolean z) {
        C1213t<Boolean> tVar = mo88160i().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    public final void mo88156c(int i, boolean z) {
        C1213t<Boolean> tVar = mo88162k().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.postValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: d */
    public final void mo88157d(int i, boolean z) {
        C1213t<Boolean> tVar = mo88161j().get(Integer.valueOf(i));
        if (tVar != null) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}

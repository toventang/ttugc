package com.p2082ss.android.ugc.aweme.music.assem.search;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12749b;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.music.assem.AbstractC60416h;
import com.p2082ss.android.ugc.aweme.music.assem.C60394b;
import com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60622s;
import com.p2082ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel;
import com.p2082ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.p2082ss.android.ugc.aweme.music.search.SearchMusicActivity;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.io.Serializable;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.music.assem.search.a */
public final class C60626a extends AbstractC12769a {

    /* renamed from: j */
    public final int f137845j = 5;

    /* renamed from: k */
    public boolean f137846k;

    /* renamed from: l */
    public boolean f137847l;

    /* renamed from: m */
    private final C12786i f137848m = new C12786i(bW_(), new C60636ai(this, null));

    /* renamed from: n */
    private final C12814b f137849n;

    /* renamed from: o */
    private final C12814b f137850o;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$j */
    public static final class C60651j extends AbstractC89220m implements AbstractC89172b<C60622s, C60622s> {
        public static final C60651j INSTANCE = new C60651j();

        static {
            Covode.recordClassIndex(71206);
        }

        public C60651j() {
            super(1);
        }

        public final C60622s invoke(C60622s sVar) {
            C89219l.m154719c(sVar, "");
            return sVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$m */
    public static final class C60654m extends AbstractC89220m implements AbstractC89172b<C60670d, C60670d> {
        public static final C60654m INSTANCE = new C60654m();

        static {
            Covode.recordClassIndex(71209);
        }

        public C60654m() {
            super(1);
        }

        public final C60670d invoke(C60670d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(71181);
    }

    /* renamed from: v */
    public final OriginMusicArg mo98121v() {
        return (OriginMusicArg) this.f137848m.getValue();
    }

    /* renamed from: w */
    public final OriginMusicListViewModel mo98122w() {
        return (OriginMusicListViewModel) this.f137849n.getValue();
    }

    /* renamed from: x */
    public final MusicSearchViewModel mo98123x() {
        return (MusicSearchViewModel) this.f137850o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$g */
    public static final class C60648g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137872a;

        static {
            Covode.recordClassIndex(71203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60648g(AbstractC12748a aVar) {
            super(0);
            this.f137872a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137872a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$z */
    public static final class C60667z extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137885a;

        static {
            Covode.recordClassIndex(71222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60667z(AbstractC12748a aVar) {
            super(0);
            this.f137885a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f137885a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$aa */
    public static final class C60628aa extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137852a;

        static {
            Covode.recordClassIndex(71183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60628aa(AbstractC12748a aVar) {
            super(0);
            this.f137852a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137852a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ah */
    public static final class C60635ah extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60635ah INSTANCE = new C60635ah();

        static {
            Covode.recordClassIndex(71190);
        }

        public C60635ah() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$f */
    public static final class C60647f extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60647f INSTANCE = new C60647f();

        static {
            Covode.recordClassIndex(71202);
        }

        public C60647f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$h */
    public static final class C60649h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137873a;

        static {
            Covode.recordClassIndex(71204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60649h(AbstractC12748a aVar) {
            super(0);
            this.f137873a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f137873a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$n */
    public static final class C60655n extends AbstractC89220m implements AbstractC89171a<C12874b<C60670d>> {
        public static final C60655n INSTANCE = new C60655n();

        static {
            Covode.recordClassIndex(71210);
        }

        public C60655n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60670d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$s */
    public static final class C60660s extends AbstractC89220m implements AbstractC89171a<C12874b<C60670d>> {
        public static final C60660s INSTANCE = new C60660s();

        static {
            Covode.recordClassIndex(71215);
        }

        public C60660s() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60670d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$t */
    public static final class C60661t extends AbstractC89220m implements AbstractC89171a<C12874b<C60622s>> {
        public static final C60661t INSTANCE = new C60661t();

        static {
            Covode.recordClassIndex(71216);
        }

        public C60661t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60622s> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$y */
    public static final class C60666y extends AbstractC89220m implements AbstractC89171a<C12874b<C60670d>> {
        public static final C60666y INSTANCE = new C60666y();

        static {
            Covode.recordClassIndex(71221);
        }

        public C60666y() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60670d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ab */
    public static final class C60629ab extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137853a;

        static {
            Covode.recordClassIndex(71184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60629ab(AbstractC12748a aVar) {
            super(0);
            this.f137853a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137853a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ad */
    public static final class C60631ad extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137855a;

        static {
            Covode.recordClassIndex(71186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60631ad(AbstractC12748a aVar) {
            super(0);
            this.f137855a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137855a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$i */
    public static final class C60650i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137874a;

        static {
            Covode.recordClassIndex(71205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60650i(AbstractC12748a aVar) {
            super(0);
            this.f137874a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f137874a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$k */
    public static final class C60652k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137875a;

        static {
            Covode.recordClassIndex(71207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60652k(AbstractC12748a aVar) {
            super(0);
            this.f137875a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f137875a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$a */
    public static final class C60627a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137851a;

        static {
            Covode.recordClassIndex(71182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60627a(AbstractC89277c cVar) {
            super(0);
            this.f137851a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137851a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ac */
    public static final class C60630ac extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137854a;

        static {
            Covode.recordClassIndex(71185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60630ac(AbstractC12748a aVar) {
            super(0);
            this.f137854a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137854a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ae */
    public static final class C60632ae extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137856a;

        static {
            Covode.recordClassIndex(71187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60632ae(AbstractC12748a aVar) {
            super(0);
            this.f137856a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137856a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$af */
    public static final class C60633af extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137857a;

        static {
            Covode.recordClassIndex(71188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60633af(AbstractC12748a aVar) {
            super(0);
            this.f137857a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137857a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ag */
    public static final class C60634ag extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137858a;

        static {
            Covode.recordClassIndex(71189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60634ag(AbstractC12748a aVar) {
            super(0);
            this.f137858a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137858a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ai */
    public static final class C60636ai extends AbstractC89220m implements AbstractC89171a<OriginMusicArg> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137859a;

        /* renamed from: b */
        final /* synthetic */ String f137860b;

        static {
            Covode.recordClassIndex(71191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60636ai(AbstractC12748a aVar, String str) {
            super(0);
            this.f137859a = aVar;
            this.f137860b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.music.assem.OriginMusicArg] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f137859a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.music.assem.OriginMusicArg> r1 = com.p2082ss.android.ugc.aweme.music.assem.OriginMusicArg.class
                java.lang.String r0 = r3.f137860b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.search.C60626a.C60636ai.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$aj */
    static final class C60637aj extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60626a f137861a;

        static {
            Covode.recordClassIndex(71192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60637aj(C60626a aVar) {
            super(0);
            this.f137861a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137861a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$ak */
    static final class C60638ak extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C60626a f137862a;

        static {
            Covode.recordClassIndex(71193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60638ak(C60626a aVar) {
            super(0);
            this.f137862a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            Context az_ = this.f137862a.az_();
            Objects.requireNonNull(az_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad.AbstractC1177b a = C88098a.m153168a((ActivityC0945e) az_);
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$b */
    public static final class C60643b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137868a;

        static {
            Covode.recordClassIndex(71198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60643b(AbstractC12748a aVar) {
            super(0);
            this.f137868a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137868a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$c */
    public static final class C60644c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137869a;

        static {
            Covode.recordClassIndex(71199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60644c(AbstractC12748a aVar) {
            super(0);
            this.f137869a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137869a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$l */
    public static final class C60653l extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137876a;

        static {
            Covode.recordClassIndex(71208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60653l(AbstractC89277c cVar) {
            super(0);
            this.f137876a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137876a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$o */
    public static final class C60656o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137877a;

        static {
            Covode.recordClassIndex(71211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60656o(AbstractC12748a aVar) {
            super(0);
            this.f137877a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137877a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$p */
    public static final class C60657p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137878a;

        static {
            Covode.recordClassIndex(71212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60657p(AbstractC12748a aVar) {
            super(0);
            this.f137878a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137878a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$q */
    public static final class C60658q extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137879a;

        static {
            Covode.recordClassIndex(71213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60658q(AbstractC12748a aVar) {
            super(0);
            this.f137879a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137879a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$r */
    public static final class C60659r extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137880a;

        static {
            Covode.recordClassIndex(71214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60659r(AbstractC12748a aVar) {
            super(0);
            this.f137880a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f137880a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$u */
    public static final class C60662u extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137881a;

        static {
            Covode.recordClassIndex(71217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60662u(AbstractC12748a aVar) {
            super(0);
            this.f137881a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137881a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$v */
    public static final class C60663v extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137882a;

        static {
            Covode.recordClassIndex(71218);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60663v(AbstractC12748a aVar) {
            super(0);
            this.f137882a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137882a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$d */
    public static final class C60645d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137870a;

        static {
            Covode.recordClassIndex(71200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60645d(AbstractC12748a aVar) {
            super(0);
            this.f137870a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137870a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$e */
    public static final class C60646e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137871a;

        static {
            Covode.recordClassIndex(71201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60646e(AbstractC12748a aVar) {
            super(0);
            this.f137871a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137871a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$w */
    public static final class C60664w extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137883a;

        static {
            Covode.recordClassIndex(71219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60664w(AbstractC12748a aVar) {
            super(0);
            this.f137883a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137883a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$x */
    public static final class C60665x extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f137884a;

        static {
            Covode.recordClassIndex(71220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60665x(AbstractC12748a aVar) {
            super(0);
            this.f137884a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137884a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: y */
    public final void mo98124y() {
        String str;
        if (this.f137847l && this.f137846k) {
            MusicSearchViewModel x = mo98123x();
            C33744d a = new C33744d().mo59983a("enter_from", "personal_homepage");
            C60394b bVar = (C60394b) C12801d.m23016a(x, C89204ab.m154669a(AbstractC60416h.class));
            if (bVar != null) {
                str = bVar.f137576a;
            } else {
                str = null;
            }
            C39162r.m79460a("homepage_music_search_show", a.mo59983a("user_id", str).f79943a);
            this.f137847l = false;
        }
    }

    public C60626a() {
        C12814b bVar;
        C12814b bVar2;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C60637aj ajVar = new C60637aj(this);
        AbstractC89277c a = C89204ab.m154669a(OriginMusicListViewModel.class);
        C60627a aVar = new C60627a(a);
        C60651j jVar = C60651j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C60661t.INSTANCE, new C60630ac(this), new C60632ae(this), ajVar, jVar, new C60633af(this), new C60634ag(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C60635ah.INSTANCE, new C60643b(this), new C60644c(this), ajVar, jVar, new C60645d(this), new C60646e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C60647f.INSTANCE, new C60648g(this), new C60649h(this), ajVar, jVar, new C60650i(this), new C60652k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137849n = bVar;
        AbstractC12848i.C12852d dVar2 = AbstractC12848i.C12852d.f31278a;
        C60638ak akVar = new C60638ak(this);
        AbstractC89277c a2 = C89204ab.m154669a(MusicSearchViewModel.class);
        C60653l lVar = new C60653l(a2);
        C60654m mVar = C60654m.INSTANCE;
        if (C89219l.m154714a(dVar2, AbstractC12848i.C12849a.f31275a)) {
            bVar2 = new C12814b(a2, lVar, C60655n.INSTANCE, new C60656o(this), new C60657p(this), akVar, mVar, new C60658q(this), new C60659r(this));
        } else if (C89219l.m154714a(dVar2, AbstractC12848i.C12852d.f31278a)) {
            bVar2 = new C12814b(a2, lVar, C60660s.INSTANCE, new C60662u(this), new C60663v(this), akVar, mVar, new C60664w(this), new C60665x(this));
        } else if (dVar2 == null || C89219l.m154714a(dVar2, AbstractC12848i.C12850b.f31276a)) {
            bVar2 = new C12814b(a2, lVar, C60666y.INSTANCE, new C60667z(this), new C60628aa(this), akVar, mVar, new C60629ab(this), new C60631ad(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f137850o = bVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$an */
    static final class C60642an extends AbstractC89220m implements AbstractC89172b<C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60626a f137867a;

        static {
            Covode.recordClassIndex(71197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60642an(C60626a aVar) {
            super(1);
            this.f137867a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar) {
            T t;
            C12776a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                this.f137867a.f137846k = t.booleanValue();
                this.f137867a.mo98124y();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        ((LinearLayout) view.findViewById(R.id.cef)).setOnClickListener(new View$OnClickListenerC60639al(this));
        AbstractC12818f.C12819a.m23063a(this, mo98122w(), C60668b.f137886a, C12856l.m23100a(), new C60641am(this, view), 4);
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC60416h.class), C60669c.f137887a, new C60642an(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$al */
    static final class View$OnClickListenerC60639al implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C60626a f137863a;

        static {
            Covode.recordClassIndex(71194);
        }

        View$OnClickListenerC60639al(C60626a aVar) {
            this.f137863a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f137863a);
            if (a != null && a.getContext() != null) {
                Intent intent = new Intent(a.getContext(), SearchMusicActivity.class);
                intent.putExtra("is_me", this.f137863a.mo98121v().isMe());
                intent.putExtra("user_id", this.f137863a.mo98121v().getUserId());
                intent.putExtra("sec_user_id", this.f137863a.mo98121v().getSecUserID());
                intent.putExtra("previous_page", this.f137863a.mo98121v().getPreviousPage());
                intent.putExtra("pinned_music_list", this.f137863a.mo98122w().f137607k);
                C60626a aVar = this.f137863a;
                C60640a aVar2 = new C60640a(this);
                C89219l.m154719c(aVar, "");
                C89219l.m154719c(aVar, "");
                C89219l.m154719c(intent, "");
                ActivityC0945e b = C12777b.m23004b(aVar);
                if (b != null) {
                    C89219l.m154719c(b, "");
                    Fragment a2 = b.getSupportFragmentManager().mo3551a("AssemContainerBridge");
                    if (!(a2 instanceof C12749b)) {
                        a2 = null;
                    }
                    C12749b bVar = (C12749b) a2;
                    if (bVar == null) {
                        bVar = new C12749b();
                        AbstractC0976n a3 = b.getSupportFragmentManager().mo3552a();
                        a3.mo3456a(bVar, "AssemContainerBridge");
                        a3.mo3473c();
                    }
                    if (bVar.isAdded()) {
                        bVar.mo20600a(aVar, intent, 1, null, aVar2);
                    } else {
                        bVar.f31007c.add(new C12777b.C12778a(b, aVar, bVar, intent, aVar2));
                    }
                }
                this.f137863a.mo98123x();
                C39162r.m79460a("enter_search", new C33744d().mo59983a("enter_from", "personal_homepage").f79943a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$al$a */
        static final class C60640a extends AbstractC89220m implements AbstractC89187q<Integer, Integer, Intent, C89391z> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC60639al f137864a;

            static {
                Covode.recordClassIndex(71195);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C60640a(View$OnClickListenerC60639al alVar) {
                super(3);
                this.f137864a = alVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(Integer num, Integer num2, Intent intent) {
                Serializable serializable;
                num.intValue();
                Intent intent2 = intent;
                if (num2.intValue() == -1) {
                    if (intent2 == null || (serializable = intent2.getSerializableExtra("pinned_music_list")) == null) {
                        serializable = new PinnedMusicList();
                    }
                    Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.music.model.PinnedMusicList");
                    this.f137864a.f137863a.mo98122w().mo98054a((PinnedMusicList) serializable);
                }
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$am */
    static final class C60641am extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60626a f137865a;

        /* renamed from: b */
        final /* synthetic */ View f137866b;

        static {
            Covode.recordClassIndex(71196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60641am(C60626a aVar, View view) {
            super(2);
            this.f137865a = aVar;
            this.f137866b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Integer> aVar) {
            C12776a<? extends Integer> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            C60394b bVar = (C60394b) C12801d.m23016a(this.f137865a.mo98123x(), C89204ab.m154669a(AbstractC60416h.class));
            if (bVar != null && bVar.f137580e) {
                if (aVar2.f31085a.intValue() >= this.f137865a.f137845j) {
                    LinearLayout linearLayout = (LinearLayout) this.f137866b.findViewById(R.id.cef);
                    C89219l.m154716b(linearLayout, "");
                    linearLayout.setVisibility(0);
                    this.f137865a.f137847l = true;
                    this.f137865a.mo98124y();
                } else {
                    this.f137865a.f137847l = false;
                    LinearLayout linearLayout2 = (LinearLayout) this.f137866b.findViewById(R.id.cef);
                    C89219l.m154716b(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                }
            }
            return C89391z.f203057a;
        }
    }
}

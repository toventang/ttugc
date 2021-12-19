package com.p2082ss.android.ugc.aweme.ftc.p3040l;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.scene.navigation.C22239d;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31184c;
import com.p2082ss.android.ugc.aweme.beauty.C34805b;
import com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52454a;
import com.p2082ss.android.ugc.aweme.ftc.p3026a.AbstractC51821a;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a;
import com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a;
import com.p2082ss.android.ugc.aweme.ftc.p3039k.AbstractC52653d;
import com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52688c;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.servicimpl.EnumC67895ad;
import com.p2082ss.android.ugc.aweme.shortvideo.C71811eo;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.tools.C78599g;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.l.a */
public final class C52655a {

    /* renamed from: a */
    public final C52658b f121201a = new C52658b();

    /* renamed from: b */
    public AbstractC14177d f121202b;

    /* renamed from: c */
    public AbstractC14193m f121203c;

    /* renamed from: d */
    public ShortVideoContext f121204d;

    /* renamed from: e */
    public ActivityC0945e f121205e;

    /* renamed from: f */
    public boolean f121206f;

    /* renamed from: g */
    public final boolean f121207g = C65350at.m117036a();

    /* renamed from: h */
    public List<? extends CharSequence> f121208h;

    /* renamed from: i */
    private String f121209i;

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$b */
    public static final class C52658b {

        /* renamed from: a */
        public boolean f121212a;

        /* renamed from: b */
        public boolean f121213b;

        /* renamed from: c */
        public boolean f121214c;

        static {
            Covode.recordClassIndex(62054);
        }
    }

    static {
        Covode.recordClassIndex(62051);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$a */
    public static final class C52656a {

        /* renamed from: a */
        public final LinkedList<C83938b> f121210a = new LinkedList<>();

        static {
            Covode.recordClassIndex(62052);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$a$a */
        public static final class C52657a extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C52657a f121211a = new C52657a();

            static {
                Covode.recordClassIndex(62053);
            }

            C52657a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        /* renamed from: a */
        public final C52656a mo88364a(C83938b bVar, AbstractC89171a<Boolean> aVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(aVar, "");
            if (!aVar.invoke().booleanValue()) {
                return this;
            }
            this.f121210a.addLast(bVar);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$c */
    public static final class C52659c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C52655a f121215a;

        static {
            Covode.recordClassIndex(62055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52659c(C52655a aVar) {
            super(0);
            this.f121215a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f121215a.mo88363b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$f */
    public static final class C52662f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C52655a f121218a;

        static {
            Covode.recordClassIndex(62058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52662f(C52655a aVar) {
            super(0);
            this.f121218a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f121218a.mo88363b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$g */
    public static final class C52663g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C52655a f121219a;

        static {
            Covode.recordClassIndex(62059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52663g(C52655a aVar) {
            super(0);
            this.f121219a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f121219a.f121201a.f121212a);
        }
    }

    /* renamed from: a */
    public static int m97531a() {
        int i;
        if (C34805b.m71107a()) {
            i = 6;
        } else {
            i = 5;
        }
        return i + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$d */
    public static final class C52660d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f121216a;

        static {
            Covode.recordClassIndex(62056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52660d(boolean z) {
            super(0);
            this.f121216a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!C34805b.m71107a() || this.f121216a) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$e */
    public static final class C52661e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f121217a;

        static {
            Covode.recordClassIndex(62057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52661e(boolean z) {
            super(0);
            this.f121217a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (!C34805b.m71107a() || (C34805b.m71107a() && this.f121217a)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b */
    public final boolean mo88363b() {
        ShortVideoContext shortVideoContext = this.f121204d;
        if (shortVideoContext == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (!shortVideoContext.f155778aL) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f121204d;
        if (shortVideoContext2 == null) {
            C89219l.m154710a("shortVideoContext");
        }
        if (shortVideoContext2.f155752M) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$h */
    public static final class C52664h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52655a f121220a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121221b;

        /* renamed from: c */
        final /* synthetic */ C21582f f121222c;

        /* renamed from: d */
        final /* synthetic */ C52712c f121223d;

        static {
            Covode.recordClassIndex(62060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52664h(C52655a aVar, AbstractC22186b bVar, C21582f fVar, C52712c cVar) {
            super(0);
            this.f121220a = aVar;
            this.f121221b = bVar;
            this.f121222c = fVar;
            this.f121223d = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C2559g<C89391z> al;
            C52655a aVar = this.f121220a;
            AbstractC22186b bVar = this.f121221b;
            C21582f fVar = this.f121222c;
            C52712c cVar = this.f121223d;
            C22239d b = C22227b.m41826b(bVar);
            AbstractC14177d dVar = aVar.f121202b;
            if (dVar == null) {
                C89219l.m154710a("cameraApiComponent");
            }
            dVar.mo22828p().mo6997a(b, new C52667k(aVar, cVar, fVar));
            if (aVar.f121207g) {
                ((AbstractC52653d) fVar.mo35249a((Type) AbstractC52653d.class, (String) null)).mo88357b().mo6997a(b, new C52673o(cVar, fVar));
            } else {
                ((AbstractC52653d) fVar.mo35249a((Type) AbstractC52653d.class, (String) null)).mo88355a().mo6997a(b, new C52674p(cVar, fVar));
            }
            AbstractC14177d dVar2 = aVar.f121202b;
            if (dVar2 == null) {
                C89219l.m154710a("cameraApiComponent");
            }
            dVar2.mo22830r().mo6997a(b, new C52675q(cVar, fVar));
            ((AbstractC52535a) fVar.mo35249a((Type) AbstractC52535a.class, (String) null)).mo88306a().mo6997a(b, new C52676r(cVar, fVar));
            ((AbstractC51821a) fVar.mo35249a((Type) AbstractC51821a.class, (String) null)).mo87556a().mo6997a(b, new C52677s(aVar, cVar, fVar));
            AbstractC14177d dVar3 = aVar.f121202b;
            if (dVar3 == null) {
                C89219l.m154710a("cameraApiComponent");
            }
            dVar3.mo22824l().mo6997a(b, new C52679t(cVar, fVar));
            AbstractC14177d dVar4 = aVar.f121202b;
            if (dVar4 == null) {
                C89219l.m154710a("cameraApiComponent");
            }
            dVar4.mo22823k().mo6997a(b, new C52680u(cVar, fVar));
            ((AbstractC14177d) fVar.mo35249a((Type) AbstractC14177d.class, (String) null)).mo22833u().mo6997a(b, new C52681v(aVar, cVar, fVar, bVar));
            AbstractC51869a aVar2 = (AbstractC51869a) fVar.mo35249a((Type) AbstractC51869a.class, (String) null);
            aVar2.mo87570a().mo6997a(b, new C52665i(aVar, b, cVar, fVar));
            aVar2.mo87575b().mo6997a(b, new C52666j(aVar, b, cVar, fVar));
            ((AbstractC52454a) fVar.mo35249a((Type) AbstractC52454a.class, (String) null)).mo88228a().mo6997a(b, new C52668l(aVar, cVar, fVar));
            ((AbstractC14209z) fVar.mo35249a((Type) AbstractC14209z.class, (String) null)).mo22938ak().mo6997a(b, new C52669m(aVar, cVar, fVar));
            AbstractC14209z zVar = (AbstractC14209z) fVar.mo35252b(AbstractC14209z.class, null);
            if (!(zVar == null || (al = zVar.mo22939al()) == null)) {
                al.mo6997a(b, new C52671n(aVar, cVar, fVar));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$m */
    static final class C52669m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52655a f121238a;

        /* renamed from: b */
        final /* synthetic */ C52712c f121239b;

        /* renamed from: c */
        final /* synthetic */ C21582f f121240c;

        static {
            Covode.recordClassIndex(62065);
        }

        C52669m(C52655a aVar, C52712c cVar, C21582f fVar) {
            this.f121238a = aVar;
            this.f121239b = cVar;
            this.f121240c = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$m$a */
        static final class C52670a extends AbstractC89220m implements AbstractC89172b<Boolean, List<C83938b>> {

            /* renamed from: a */
            final /* synthetic */ List f121241a;

            /* renamed from: b */
            final /* synthetic */ List f121242b;

            static {
                Covode.recordClassIndex(62066);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52670a(List list, List list2) {
                super(1);
                this.f121241a = list;
                this.f121242b = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ List<C83938b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.f121241a;
                }
                return this.f121242b;
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            int i;
            C83938b i2 = this.f121239b.mo88398i();
            boolean z2 = true;
            if (!C52655a.m97534b(this.f121238a).mo22767U() || !C52655a.m97534b(this.f121238a).mo22770X()) {
                z = true;
            } else {
                z = false;
            }
            C21582f fVar = this.f121240c;
            if (this.f121238a.f121207g) {
                i = 2131232554;
            } else {
                i = 2131232553;
            }
            C52655a.m97533a(i2, z, fVar, i);
            C83938b j = this.f121239b.mo88399j();
            if (C52655a.m97534b(this.f121238a).mo22768V() && C31184c.m64611a(C52655a.m97532a(this.f121238a))) {
                z2 = false;
            }
            C52655a.m97533a(j, z2, this.f121240c, 2131232571);
            this.f121238a.f121201a.f121213b = C52655a.m97534b(this.f121238a).mo22792a(this.f121238a.f121201a.f121212a, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ((List) new C52670a(arrayList, arrayList2).invoke(Boolean.valueOf(this.f121238a.f121201a.f121213b))).add(this.f121239b.mo88399j());
            ((AbstractC52688c) this.f121240c.mo35247a(AbstractC52688c.class)).mo88374a(arrayList);
            ((AbstractC52688c) this.f121240c.mo35247a(AbstractC52688c.class)).mo88376b(arrayList2);
            ((AbstractC52688c) this.f121240c.mo35247a(AbstractC52688c.class)).mo88372a(C52655a.m97531a());
            if (C52655a.m97534b(this.f121238a).mo22759M()) {
                C52655a.m97534b(this.f121238a).mo22806b(5);
            }
            this.f121238a.mo88361a(this.f121239b, this.f121240c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$n */
    static final class C52671n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52655a f121243a;

        /* renamed from: b */
        final /* synthetic */ C52712c f121244b;

        /* renamed from: c */
        final /* synthetic */ C21582f f121245c;

        static {
            Covode.recordClassIndex(62067);
        }

        C52671n(C52655a aVar, C52712c cVar, C21582f fVar) {
            this.f121243a = aVar;
            this.f121244b = cVar;
            this.f121245c = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$n$a */
        static final class C52672a extends AbstractC89220m implements AbstractC89172b<Boolean, List<C83938b>> {

            /* renamed from: a */
            final /* synthetic */ List f121246a;

            /* renamed from: b */
            final /* synthetic */ List f121247b;

            static {
                Covode.recordClassIndex(62068);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52672a(List list, List list2) {
                super(1);
                this.f121246a = list;
                this.f121247b = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ List<C83938b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.f121246a;
                }
                return this.f121247b;
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121243a.f121201a.f121213b = C52655a.m97534b(this.f121243a).mo22792a(this.f121243a.f121201a.f121212a, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ((List) new C52672a(arrayList, arrayList2).invoke(Boolean.valueOf(this.f121243a.f121201a.f121213b))).add(this.f121244b.mo88399j());
            ((AbstractC52688c) this.f121245c.mo35247a(AbstractC52688c.class)).mo88374a(arrayList);
            ((AbstractC52688c) this.f121245c.mo35247a(AbstractC52688c.class)).mo88376b(arrayList2);
            ((AbstractC52688c) this.f121245c.mo35247a(AbstractC52688c.class)).mo88372a(C52655a.m97531a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$s */
    static final class C52677s<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52655a f121256a;

        /* renamed from: b */
        final /* synthetic */ C52712c f121257b;

        /* renamed from: c */
        final /* synthetic */ C21582f f121258c;

        static {
            Covode.recordClassIndex(62073);
        }

        C52677s(C52655a aVar, C52712c cVar, C21582f fVar) {
            this.f121256a = aVar;
            this.f121257b = cVar;
            this.f121258c = fVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$s$a */
        static final class C52678a extends AbstractC89220m implements AbstractC89172b<Boolean, List<C83938b>> {

            /* renamed from: a */
            final /* synthetic */ List f121259a;

            /* renamed from: b */
            final /* synthetic */ List f121260b;

            static {
                Covode.recordClassIndex(62074);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52678a(List list, List list2) {
                super(1);
                this.f121259a = list;
                this.f121260b = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ List<C83938b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.f121259a;
                }
                return this.f121260b;
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C52655a aVar = this.f121256a;
            ActivityC0945e a = C52655a.m97532a(aVar);
            Object obj2 = ((C83408c) obj).f186277c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (aVar.mo88362a(a, (CharSequence) obj2)) {
                boolean L = C52655a.m97534b(this.f121256a).mo22758L();
                this.f121256a.f121201a.f121213b = C52655a.m97534b(this.f121256a).mo22792a(L, false);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C52678a aVar2 = new C52678a(arrayList, arrayList2);
                arrayList.add(this.f121257b.mo88391b());
                ((List) aVar2.invoke(Boolean.valueOf(this.f121256a.f121201a.f121214c))).add(this.f121257b.mo88396g());
                arrayList.add(this.f121257b.mo88395f());
                ((List) aVar2.invoke(Boolean.valueOf(this.f121256a.f121201a.f121213b))).add(this.f121257b.mo88399j());
                ((AbstractC52688c) this.f121258c.mo35247a(AbstractC52688c.class)).mo88374a(arrayList);
                ((AbstractC52688c) this.f121258c.mo35247a(AbstractC52688c.class)).mo88376b(arrayList2);
                ((AbstractC52688c) this.f121258c.mo35247a(AbstractC52688c.class)).mo88372a(C52655a.m97531a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$v */
    static final class C52681v<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52655a f121265a;

        /* renamed from: b */
        final /* synthetic */ C52712c f121266b;

        /* renamed from: c */
        final /* synthetic */ C21582f f121267c;

        /* renamed from: d */
        final /* synthetic */ AbstractC22186b f121268d;

        static {
            Covode.recordClassIndex(62077);
        }

        C52681v(C52655a aVar, C52712c cVar, C21582f fVar, AbstractC22186b bVar) {
            this.f121265a = aVar;
            this.f121266b = cVar;
            this.f121267c = fVar;
            this.f121268d = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$v$a */
        static final class C52683a extends AbstractC89220m implements AbstractC89172b<Boolean, List<C83938b>> {

            /* renamed from: a */
            final /* synthetic */ List f121271a;

            /* renamed from: b */
            final /* synthetic */ List f121272b;

            static {
                Covode.recordClassIndex(62079);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C52683a(List list, List list2) {
                super(1);
                this.f121271a = list;
                this.f121272b = list2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ List<C83938b> invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    return this.f121271a;
                }
                return this.f121272b;
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            C78599g gVar = (C78599g) obj;
            C52658b bVar = this.f121265a.f121201a;
            C89219l.m154716b(gVar, "");
            bVar.f121212a = gVar.f176643a;
            this.f121265a.f121201a.f121213b = C52655a.m97534b(this.f121265a).mo22792a(this.f121265a.f121201a.f121212a, false);
            C83938b i2 = this.f121266b.mo88398i();
            if (this.f121265a.f121207g) {
                i = 2131232554;
            } else {
                i = 2131232553;
            }
            i2.f187374b = i;
            ((AbstractC52688c) this.f121267c.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(i2);
            final C83938b a = this.f121266b.mo88390a();
            a.f187378f = gVar.f176644b;
            C22228c.m41830a(this.f121268d, new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3040l.C52655a.C52681v.RunnableC526821 */

                /* renamed from: a */
                final /* synthetic */ C52681v f121269a;

                static {
                    Covode.recordClassIndex(62078);
                }

                {
                    this.f121269a = r1;
                }

                public final void run() {
                    ((AbstractC52688c) this.f121269a.f121267c.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(a);
                }
            });
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C52683a aVar = new C52683a(arrayList, arrayList2);
            ((List) aVar.invoke(Boolean.valueOf(!this.f121265a.f121201a.f121212a))).add(this.f121266b.mo88398i());
            ((List) aVar.invoke(Boolean.valueOf(this.f121265a.f121201a.f121213b))).add(this.f121266b.mo88399j());
            ((AbstractC52688c) this.f121267c.mo35247a(AbstractC52688c.class)).mo88374a(arrayList);
            ((AbstractC52688c) this.f121267c.mo35247a(AbstractC52688c.class)).mo88376b(arrayList2);
            ((AbstractC52688c) this.f121267c.mo35247a(AbstractC52688c.class)).mo88372a(C52655a.m97531a());
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC14177d m97534b(C52655a aVar) {
        AbstractC14177d dVar = aVar.f121202b;
        if (dVar == null) {
            C89219l.m154710a("cameraApiComponent");
        }
        return dVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ ActivityC0945e m97532a(C52655a aVar) {
        ActivityC0945e eVar = aVar.f121205e;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        return eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$i */
    static final class C52665i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52655a f121224a;

        /* renamed from: b */
        final /* synthetic */ C22239d f121225b;

        /* renamed from: c */
        final /* synthetic */ C52712c f121226c;

        /* renamed from: d */
        final /* synthetic */ C21582f f121227d;

        static {
            Covode.recordClassIndex(62061);
        }

        C52665i(C52655a aVar, C22239d dVar, C52712c cVar, C21582f fVar) {
            this.f121224a = aVar;
            this.f121225b = dVar;
            this.f121226c = cVar;
            this.f121227d = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121224a.f121201a.f121214c = true;
            ArrayList arrayList = new ArrayList();
            ShortVideoContext shortVideoContext = this.f121224a.f121204d;
            if (shortVideoContext == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (!shortVideoContext.mo110022c()) {
                arrayList.add(this.f121226c.mo88396g());
            }
            AbstractC52688c cVar = (AbstractC52688c) this.f121227d.mo35247a(AbstractC52688c.class);
            cVar.mo88374a(arrayList);
            cVar.mo88372a(C52655a.m97531a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$j */
    static final class C52666j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52655a f121228a;

        /* renamed from: b */
        final /* synthetic */ C22239d f121229b;

        /* renamed from: c */
        final /* synthetic */ C52712c f121230c;

        /* renamed from: d */
        final /* synthetic */ C21582f f121231d;

        static {
            Covode.recordClassIndex(62062);
        }

        C52666j(C52655a aVar, C22239d dVar, C52712c cVar, C21582f fVar) {
            this.f121228a = aVar;
            this.f121229b = dVar;
            this.f121230c = cVar;
            this.f121231d = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121228a.f121201a.f121214c = false;
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f121230c.mo88396g());
            AbstractC52688c cVar = (AbstractC52688c) this.f121231d.mo35247a(AbstractC52688c.class);
            cVar.mo88376b(arrayList);
            cVar.mo88372a(C52655a.m97531a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$l */
    public static final class C52668l implements AbstractC2565m<Integer> {

        /* renamed from: a */
        final /* synthetic */ C52655a f121235a;

        /* renamed from: b */
        final /* synthetic */ C52712c f121236b;

        /* renamed from: c */
        final /* synthetic */ C21582f f121237c;

        static {
            Covode.recordClassIndex(62064);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Integer num) {
            int i;
            Integer num2 = num;
            if (num2 != null) {
                C83938b f = this.f121236b.mo88395f();
                if (this.f121235a.f121207g) {
                    if (num2.intValue() == 10) {
                        i = 2131232584;
                    } else {
                        i = 2131232586;
                    }
                } else if (num2.intValue() == 10) {
                    i = 2131232583;
                } else {
                    i = 2131232585;
                }
                f.f187374b = i;
                ((AbstractC52688c) this.f121237c.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(f);
            }
        }

        C52668l(C52655a aVar, C52712c cVar, C21582f fVar) {
            this.f121235a = aVar;
            this.f121236b = cVar;
            this.f121237c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$p */
    static final class C52674p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52712c f121250a;

        /* renamed from: b */
        final /* synthetic */ C21582f f121251b;

        static {
            Covode.recordClassIndex(62070);
        }

        C52674p(C52712c cVar, C21582f fVar) {
            this.f121250a = cVar;
            this.f121251b = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C83938b b = this.f121250a.mo88391b();
            if (num != null && num.intValue() == 0) {
                b.f187374b = 2131232570;
                if (b.f187380h > 0) {
                    b.f187380h = R.string.fzy;
                }
            } else {
                b.f187374b = 2131232569;
                if (b.f187380h > 0) {
                    b.f187380h = R.string.fzx;
                }
            }
            ((AbstractC52688c) this.f121251b.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$q */
    static final class C52675q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52712c f121252a;

        /* renamed from: b */
        final /* synthetic */ C21582f f121253b;

        static {
            Covode.recordClassIndex(62071);
        }

        C52675q(C52712c cVar, C21582f fVar) {
            this.f121252a = cVar;
            this.f121253b = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C83938b j = this.f121252a.mo88399j();
            if (num != null) {
                if (num.intValue() == 2) {
                    j.f187374b = 2131232571;
                } else if (num.intValue() == 3) {
                    j.f187374b = 2131232572;
                }
            }
            j.f187380h = R.string.fph;
            ((AbstractC52688c) this.f121253b.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$r */
    static final class C52676r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52712c f121254a;

        /* renamed from: b */
        final /* synthetic */ C21582f f121255b;

        static {
            Covode.recordClassIndex(62072);
        }

        C52676r(C52712c cVar, C21582f fVar) {
            this.f121254a = cVar;
            this.f121255b = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83938b g = this.f121254a.mo88396g();
            if (!C89219l.m154714a(Boolean.valueOf(g.f187376d), bool)) {
                C89219l.m154716b(bool, "");
                g.f187376d = bool.booleanValue();
                ((AbstractC52688c) this.f121255b.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(g);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$t */
    static final class C52679t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52712c f121261a;

        /* renamed from: b */
        final /* synthetic */ C21582f f121262b;

        static {
            Covode.recordClassIndex(62075);
        }

        C52679t(C52712c cVar, C21582f fVar) {
            this.f121261a = cVar;
            this.f121262b = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83938b a = this.f121261a.mo88390a();
            if (!C89219l.m154714a(Boolean.valueOf(a.f187376d), bool)) {
                C89219l.m154716b(bool, "");
                a.f187376d = bool.booleanValue();
                ((AbstractC52688c) this.f121262b.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$k */
    static final class C52667k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52655a f121232a;

        /* renamed from: b */
        final /* synthetic */ C52712c f121233b;

        /* renamed from: c */
        final /* synthetic */ C21582f f121234c;

        static {
            Covode.recordClassIndex(62063);
        }

        C52667k(C52655a aVar, C52712c cVar, C21582f fVar) {
            this.f121232a = aVar;
            this.f121233b = cVar;
            this.f121234c = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            int i2;
            Integer num = (Integer) obj;
            C83938b i3 = this.f121233b.mo88398i();
            if (num != null) {
                if (num.intValue() == 0) {
                    if (this.f121232a.f121207g) {
                        i = 2131232554;
                    } else {
                        i = 2131232553;
                    }
                    i3.f187374b = i;
                } else if (num.intValue() == 5) {
                    i3.f187376d = false;
                } else if (num.intValue() == 6) {
                    i3.f187376d = true;
                }
                ((AbstractC52688c) this.f121234c.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(i3);
            }
            if (this.f121232a.f121207g) {
                i2 = 2131232556;
            } else {
                i2 = 2131232555;
            }
            i3.f187374b = i2;
            ((AbstractC52688c) this.f121234c.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(i3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$o */
    static final class C52673o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52712c f121248a;

        /* renamed from: b */
        final /* synthetic */ C21582f f121249b;

        static {
            Covode.recordClassIndex(62069);
        }

        C52673o(C52712c cVar, C21582f fVar) {
            this.f121248a = cVar;
            this.f121249b = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC78601i iVar = (EnumC78601i) obj;
            C83938b b = this.f121248a.mo88391b();
            int i = 2131232566;
            if (iVar != null) {
                int i2 = C52711b.f121325a[iVar.ordinal()];
                if (i2 == 1) {
                    i = 2131232564;
                } else if (i2 == 2) {
                    i = 2131232565;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        i = 2131232567;
                    } else if (i2 == 5) {
                        i = 2131232568;
                    }
                }
            }
            b.f187374b = i;
            ((AbstractC52688c) this.f121249b.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a$u */
    static final class C52680u<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52712c f121263a;

        /* renamed from: b */
        final /* synthetic */ C21582f f121264b;

        static {
            Covode.recordClassIndex(62076);
        }

        C52680u(C52712c cVar, C21582f fVar) {
            this.f121263a = cVar;
            this.f121264b = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83938b a = this.f121263a.mo88390a();
            if ((!C89219l.m154714a(Boolean.valueOf(a.f187376d), bool)) || (!C89219l.m154714a(Boolean.valueOf(a.f187382j), bool))) {
                C89219l.m154716b(bool, "");
                a.f187376d = bool.booleanValue();
                a.f187382j = bool.booleanValue();
                if (bool.booleanValue()) {
                    a.f187378f = false;
                }
                ((AbstractC52688c) this.f121264b.mo35249a((Type) AbstractC52688c.class, (String) null)).mo88373a(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo88361a(C52712c cVar, C21582f fVar) {
        boolean z = this.f121206f;
        ActivityC0945e eVar = this.f121205e;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        if (z != C71811eo.m126782a(eVar)) {
            ActivityC0945e eVar2 = this.f121205e;
            if (eVar2 == null) {
                C89219l.m154710a("activity");
            }
            this.f121206f = C71811eo.m126782a(eVar2);
            for (C83938b bVar : C89070n.m154522b(cVar.mo88390a(), cVar.mo88391b(), cVar.mo88392c(), cVar.mo88393d(), cVar.mo88394e(), cVar.mo88395f(), cVar.mo88396g(), cVar.mo88397h(), cVar.mo88398i(), cVar.mo88399j())) {
                bVar.mo128819a(this.f121206f);
                ((AbstractC52688c) fVar.mo35249a(AbstractC52688c.class, (String) null)).mo88373a(bVar);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo88362a(Activity activity, CharSequence charSequence) {
        if (this.f121208h == null) {
            List<Number> b = C89070n.m154522b(Integer.valueOf(EnumC67895ad.RECORD_COMBINE.getTagResId()), Integer.valueOf(EnumC67895ad.RECORD_COMBINE_15.getTagResId()), Integer.valueOf(EnumC67895ad.RECORD_COMBINE_60.getTagResId()), Integer.valueOf(EnumC67895ad.PHOTO_SHORT.getTagResId()));
            ArrayList arrayList = new ArrayList();
            for (Number number : b) {
                String string = activity.getResources().getString(number.intValue());
                C89219l.m154716b(string, "");
                arrayList.add(string);
            }
            this.f121208h = arrayList;
            String string2 = activity.getResources().getString(EnumC67895ad.PHOTO_SHORT.getTagResId());
            C89219l.m154716b(string2, "");
            this.f121209i = string2;
        }
        List<? extends CharSequence> list = this.f121208h;
        if (list == null) {
            C89219l.m154710a("tabs");
        }
        return list.contains(charSequence);
    }

    /* renamed from: a */
    public static void m97533a(C83938b bVar, boolean z, C21582f fVar, int i) {
        bVar.f187376d = z;
        if (!z) {
            bVar.f187374b = i;
        }
        ((AbstractC52688c) fVar.mo35249a(AbstractC52688c.class, (String) null)).mo88373a(bVar);
    }
}

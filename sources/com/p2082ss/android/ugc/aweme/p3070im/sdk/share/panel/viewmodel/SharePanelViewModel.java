package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55212h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55828f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56218d;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56214i;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79705a;
import com.p2082ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel */
public final class SharePanelViewModel implements AbstractC55764d<IMContact>, AbstractC55764d {

    /* renamed from: i */
    public static final C56071a f127869i = new C56071a((byte) 0);

    /* renamed from: a */
    public boolean f127870a;

    /* renamed from: b */
    public boolean f127871b;

    /* renamed from: c */
    public boolean f127872c;

    /* renamed from: d */
    public SharePackage f127873d;

    /* renamed from: e */
    public AbstractC56081a f127874e;

    /* renamed from: f */
    public final AbstractC89507ah f127875f;

    /* renamed from: g */
    public final AbstractC74745a f127876g;

    /* renamed from: h */
    public final C55219n f127877h;

    /* renamed from: j */
    private final AbstractC89244h f127878j;

    /* renamed from: k */
    private final AbstractC89244h f127879k;

    /* renamed from: l */
    private final AbstractC89244h f127880l;

    /* renamed from: m */
    private final AbstractC89244h f127881m;

    /* renamed from: n */
    private final AbstractC89516am f127882n;

    /* renamed from: o */
    private final List<C56253f> f127883o;

    /* renamed from: p */
    private final AbstractC55736a f127884p;

    /* renamed from: q */
    private final AbstractC89507ah f127885q;

    static {
        Covode.recordClassIndex(65869);
    }

    /* renamed from: a */
    public final List<IMContact> mo92935a() {
        return (List) this.f127878j.getValue();
    }

    /* renamed from: b */
    public final Set<IMContact> mo92938b() {
        return (Set) this.f127879k.getValue();
    }

    /* renamed from: c */
    public final Set<String> mo92939c() {
        return (Set) this.f127880l.getValue();
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$a */
    public static final class C56071a {
        static {
            Covode.recordClassIndex(65870);
        }

        private C56071a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$a$a */
        public static final class C56072a extends AbstractC89220m implements AbstractC89171a<C55828f> {

            /* renamed from: a */
            final /* synthetic */ SharePackage f127886a;

            /* renamed from: b */
            final /* synthetic */ C55732c.EnumC55734b f127887b;

            /* renamed from: c */
            final /* synthetic */ int f127888c;

            static {
                Covode.recordClassIndex(65871);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56072a(SharePackage sharePackage, C55732c.EnumC55734b bVar, int i) {
                super(0);
                this.f127886a = sharePackage;
                this.f127887b = bVar;
                this.f127888c = i;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C55828f invoke() {
                String str;
                AbstractC56220e b;
                AbstractC56218d familiarProxy;
                C55732c cVar = new C55732c(1, C55212h.m100953a(this.f127886a));
                SharePackage sharePackage = this.f127886a;
                String str2 = null;
                if (sharePackage != null) {
                    str = sharePackage.f155487d;
                } else {
                    str = null;
                }
                boolean a = C89219l.m154714a((Object) str, (Object) "aweme");
                boolean z = false;
                if (a && (b = C55076b.m100723b()) != null && (familiarProxy = b.getFamiliarProxy()) != null && familiarProxy.mo93040a()) {
                    z = true;
                }
                cVar.f127115f = z;
                cVar.f127120k = this.f127887b;
                SharePackage sharePackage2 = this.f127886a;
                if (sharePackage2 != null) {
                    str2 = sharePackage2.f155487d;
                }
                cVar.f127111b = str2;
                cVar.f127110a = true;
                return new C55828f(cVar, this.f127888c);
            }
        }

        public /* synthetic */ C56071a(byte b) {
            this();
        }

        /* renamed from: a */
        private static SharePanelViewModel m101974a(SharePackage sharePackage, AbstractC56081a aVar, List<C56253f> list, C55732c.EnumC55734b bVar, int i) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(bVar, "");
            return new SharePanelViewModel(sharePackage, aVar, list, (AbstractC55736a) C89250i.m154773a((AbstractC89171a) new C56072a(sharePackage, bVar, i)).getValue());
        }

        /* renamed from: a */
        public static /* synthetic */ SharePanelViewModel m101975a(SharePackage sharePackage, AbstractC56081a aVar, List list, C55732c.EnumC55734b bVar, int i, int i2) {
            if ((i2 & 8) != 0) {
                bVar = C55732c.EnumC55734b.NORMAL;
            }
            if ((i2 & 16) != 0) {
                i = 15;
            }
            return m101974a(sharePackage, aVar, list, bVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$b */
    public static final class C56073b extends AbstractC89220m implements AbstractC89171a<List<IMContact>> {

        /* renamed from: a */
        public static final C56073b f127889a = new C56073b();

        static {
            Covode.recordClassIndex(65872);
        }

        C56073b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<IMContact> invoke() {
            return new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$d */
    public static final class C56075d extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C56075d f127891a = new C56075d();

        static {
            Covode.recordClassIndex(65874);
        }

        C56075d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$e */
    public static final class C56076e extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C56076e f127892a = new C56076e();

        static {
            Covode.recordClassIndex(65875);
        }

        C56076e() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$h */
    public static final class C56080h extends AbstractC89220m implements AbstractC89171a<Set<IMContact>> {

        /* renamed from: a */
        public static final C56080h f127902a = new C56080h();

        static {
            Covode.recordClassIndex(65879);
        }

        C56080h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<IMContact> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: d */
    public final void mo92940d() {
        this.f127884p.mo92615a(this);
        this.f127884p.mo92621g();
    }

    public final void onDestroy() {
        C89517an.m155450b(this.f127882n);
        this.f127884p.mo92618d();
        this.f127874e = null;
        this.f127873d = null;
    }

    /* renamed from: e */
    public final Set<IMContact> mo92941e() {
        Set<IMContact> b = mo92938b();
        ArrayList arrayList = new ArrayList();
        for (T t : b) {
            if (!(t instanceof C74721a)) {
                arrayList.add(t);
            }
        }
        return C89070n.m154592l(arrayList);
    }

    /* renamed from: f */
    public final boolean mo92942f() {
        Bundle bundle;
        String str;
        int hashCode;
        boolean z;
        boolean z2;
        SharePackage sharePackage = this.f127873d;
        Integer num = null;
        if (sharePackage != null) {
            bundle = sharePackage.f155492i;
        } else {
            bundle = null;
        }
        boolean a = C79705a.m138533a();
        if (bundle != null) {
            str = bundle.getString("enter_from");
        } else {
            str = null;
        }
        if (str != null && ((hashCode = str.hashCode()) == -1572049565 ? str.equals("notification_page") : !(hashCode != 1691937916 || !str.equals("homepage_hot")))) {
            String string = bundle.getString("aid");
            if (string == null) {
                string = "";
            }
            C89219l.m154716b(string, "");
            num = UpvoteServiceImpl.m138748d().mo123483b(string);
        } else if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("upvote_permission", 1));
        }
        if (num != null && num.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (bundle == null || bundle.getInt("aweme_type") != 40) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!a || !z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$f */
    public static final class C56077f extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(65876);
        }

        public C56077f(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C56244a.m102191c("SharePanelViewModel", "Error loading recommended user ".concat(String.valueOf(th)));
        }
    }

    /* renamed from: a */
    public final void mo92936a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        AbstractC56081a aVar = this.f127874e;
        if (aVar != null) {
            aVar.mo92894a(iMContact);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: c */
    public final void mo92517c(Throwable th) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(th, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92510a(Throwable th) {
        C89219l.m154721d(th, "");
        C56244a.m102193e("SharePanelViewModel", "onLoadError: ".concat(String.valueOf(th)));
        mo92935a().clear();
        AbstractC56081a aVar = this.f127874e;
        if (aVar != null) {
            aVar.mo92895a(mo92935a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$g */
    public static final class C56078g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f127893a;

        /* renamed from: b */
        int f127894b;

        /* renamed from: c */
        final /* synthetic */ SharePanelViewModel f127895c;

        /* renamed from: d */
        private /* synthetic */ Object f127896d;

        static {
            Covode.recordClassIndex(65877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56078g(SharePanelViewModel sharePanelViewModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f127895c = sharePanelViewModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C56078g gVar = new C56078g(this.f127895c, dVar);
            gVar.f127896d = obj;
            return gVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C56078g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$g$a */
        public static final class C56079a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f127897a;

            /* renamed from: b */
            final /* synthetic */ List f127898b;

            /* renamed from: c */
            final /* synthetic */ C56078g f127899c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89516am f127900d;

            /* renamed from: e */
            private /* synthetic */ Object f127901e;

            static {
                Covode.recordClassIndex(65878);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56079a(List list, AbstractC89124d dVar, C56078g gVar, AbstractC89516am amVar) {
                super(2, dVar);
                this.f127898b = list;
                this.f127899c = gVar;
                this.f127900d = amVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                C56079a aVar = new C56079a(this.f127898b, dVar, this.f127899c, this.f127900d);
                aVar.f127901e = obj;
                return aVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C56079a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f127897a == 0) {
                    C89382r.m154942a(obj);
                    AbstractC89127f a = ((AbstractC89516am) this.f127901e).mo20678a();
                    AbstractC89568bz bzVar = (AbstractC89568bz) a.get(AbstractC89568bz.f203287c);
                    if (bzVar == null) {
                        throw new IllegalStateException("Context cannot be checked for liveness because it does not have a job: ".concat(String.valueOf(a)).toString());
                    } else if (bzVar.mo143993b()) {
                        AbstractC56081a aVar = this.f127899c.f127895c.f127874e;
                        if (aVar != null) {
                            aVar.mo92897b(this.f127898b);
                        }
                        return C89391z.f203057a;
                    } else {
                        throw bzVar.mo144009m();
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            AbstractC89516am amVar;
            AbstractC74745a aVar;
            EnumC89098a aVar2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f127894b;
            if (i == 0) {
                C89382r.m154942a(obj);
                amVar = (AbstractC89516am) this.f127896d;
                aVar = this.f127895c.f127876g;
                if (aVar != null) {
                    if (aVar.mo117798c() == -1 || aVar.mo117798c() >= 1800000) {
                        this.f127896d = amVar;
                        this.f127893a = aVar;
                        this.f127894b = 1;
                        if (aVar.mo117795a(this) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return C89391z.f203057a;
            } else if (i == 1) {
                aVar = (AbstractC74745a) this.f127893a;
                amVar = (AbstractC89516am) this.f127896d;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<User> b = aVar.mo117797b();
            ArrayList arrayList = new ArrayList();
            for (T t : b) {
                if (this.f127895c.f127877h.mo92201a(t.getUid()) < C56214i.f128216a) {
                    arrayList.add(t);
                }
            }
            List<User> d = C89070n.m154571d((Iterable) arrayList, 15 - this.f127895c.mo92935a().size());
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) d, 10));
            for (User user : d) {
                arrayList2.add(C74722b.m131181a(user));
            }
            ArrayList arrayList3 = arrayList2;
            this.f127895c.mo92935a().addAll(arrayList3);
            AbstractC89568bz unused = C89624i.m155555a(amVar, this.f127895c.f127875f, null, new C56079a(arrayList3, null, this, amVar), 2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$c */
    public static final class C56074c<T> implements Comparator {

        /* renamed from: a */
        public static final C56074c f127890a = new C56074c();

        static {
            Covode.recordClassIndex(65873);
        }

        C56074c() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C74721a) obj).getSortIndex() - ((C74721a) obj2).getSortIndex();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: b */
    public final void mo92515b(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list, "");
    }

    /* renamed from: a */
    public final boolean mo92937a(IMContact iMContact, boolean z) {
        C89219l.m154721d(iMContact, "");
        AbstractC56081a aVar = this.f127874e;
        if (aVar != null) {
            return aVar.mo92896a(iMContact, z);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92512a(List<IMContact> list, boolean z) {
        String str;
        String str2;
        Bundle bundle;
        C89219l.m154721d(list, "");
        C56244a.m102191c("SharePanelViewModel", "onLoadSuccess start: " + list.size() + ' ' + this.f127883o.size());
        try {
            mo92935a().clear();
            mo92935a().addAll(this.f127883o);
            C56244a.m102191c("SharePanelViewModel", "onLoadSuccess after add batch: " + mo92935a().size());
            C56244a.m102191c("SharePanelViewModel", "onLoadSuccess groupchat holdout: " + C56202c.m102111a());
            if (!C56202c.m102111a()) {
                mo92935a().addAll(list);
            } else {
                mo92935a().addAll(C55213i.m100954a(list));
            }
            SharePackage sharePackage = this.f127873d;
            if (sharePackage != null) {
                str = sharePackage.f155487d;
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) UGCMonitor.EVENT_COMMENT)) {
                SharePackage sharePackage2 = this.f127873d;
                if (sharePackage2 == null || (bundle = sharePackage2.f155492i) == null) {
                    str2 = null;
                } else {
                    str2 = bundle.getString("comment_author_id");
                }
                Iterator<IMContact> it = mo92935a().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    IMContact next = it.next();
                    if ((next instanceof IMUser) && C89219l.m154714a((Object) ((IMUser) next).getUid(), (Object) str2)) {
                        break;
                    }
                    i++;
                }
                Integer valueOf = Integer.valueOf(i);
                if (!(valueOf.intValue() == -1 || valueOf == null)) {
                    mo92935a().add(0, mo92935a().remove(valueOf.intValue()));
                }
            }
        } catch (Exception e) {
            C56244a.m102188a(e);
        }
        C56244a.m102191c("SharePanelViewModel", "onLoadSuccess finish: " + mo92935a().size());
        AbstractC56081a aVar = this.f127874e;
        if (aVar != null) {
            aVar.mo92895a(mo92935a());
        }
        int size = mo92935a().size();
        if (1 <= size && 15 > size && C56214i.m102128a()) {
            AbstractC89568bz unused = C89624i.m155555a(this.f127882n, this.f127885q.plus(new C56077f(CoroutineExceptionHandler.f203145c)), null, new C56078g(this, null), 2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SharePanelViewModel(com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage r10, com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a r11, java.util.List r12, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a r13) {
        /*
            r9 = this;
            kotlinx.coroutines.android.b r5 = com.p2082ss.android.ugc.aweme.p2304af.C33429a.f79465a
            kotlinx.coroutines.ah r6 = kotlinx.coroutines.C89546bf.f203267b
            com.bytedance.provider.impl.c r0 = com.bytedance.provider.impl.C21752c.f51535b
            com.bytedance.provider.g r2 = r0.mo35380a()
            java.lang.Class<com.ss.android.ugc.aweme.social.widget.b.a> r1 = com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a.class
            java.lang.String r0 = "source_default_key"
            com.bytedance.provider.b r0 = r2.mo35381a(r0, r1)
            if (r0 == 0) goto L_0x002c
            com.bytedance.provider.h r7 = r0.mo35378a()
            com.ss.android.ugc.aweme.social.widget.b.a r7 = (com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a) r7
        L_0x001a:
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n r8 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n.m100965a()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r8, r0)
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x002c:
            r7 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel.<init>(com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a, java.util.List, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a):void");
    }

    private SharePanelViewModel(SharePackage sharePackage, AbstractC56081a aVar, List<C56253f> list, AbstractC55736a aVar2, AbstractC89507ah ahVar, AbstractC89507ah ahVar2, AbstractC74745a aVar3, C55219n nVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(ahVar2, "");
        C89219l.m154721d(nVar, "");
        this.f127873d = sharePackage;
        this.f127874e = aVar;
        this.f127883o = list;
        this.f127884p = aVar2;
        this.f127875f = ahVar;
        this.f127885q = ahVar2;
        this.f127876g = aVar3;
        this.f127877h = nVar;
        this.f127878j = C89250i.m154773a((AbstractC89171a) C56073b.f127889a);
        this.f127879k = C89250i.m154773a((AbstractC89171a) C56080h.f127902a);
        this.f127880l = C89250i.m154773a((AbstractC89171a) C56075d.f127891a);
        this.f127881m = C89250i.m154773a((AbstractC89171a) C56076e.f127892a);
        this.f127882n = C89517an.m155448a(C89599cu.m155531a().plus(ahVar));
    }
}

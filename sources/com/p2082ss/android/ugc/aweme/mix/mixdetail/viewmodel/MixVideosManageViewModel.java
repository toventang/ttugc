package com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import android.app.Activity;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48257j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.AbstractC59400b;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59399e;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.C59774b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel */
public final class MixVideosManageViewModel extends AssemViewModel<C59853a> implements AbstractC59400b {

    /* renamed from: j */
    public String f136169j = "";

    /* renamed from: k */
    public String f136170k;

    /* renamed from: l */
    public String f136171l;

    /* renamed from: m */
    public boolean f136172m;

    /* renamed from: n */
    private final AbstractC89244h f136173n = C12646c.m22777a(this, C59793l.f136215a);

    /* renamed from: o */
    private final AbstractC89244h f136174o = C89250i.m154773a((AbstractC89171a) new C59780d(this));

    static {
        Covode.recordClassIndex(70180);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractC59400b
    /* renamed from: b */
    public final String mo97075b() {
        return "manage_video";
    }

    /* renamed from: h */
    public final AbstractC17692b<Long> mo23343h() {
        return (AbstractC17692b) this.f136174o.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractC59400b
    /* renamed from: a */
    public final String mo97073a() {
        return this.f136169j;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$l */
    static final class C59793l extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC59856c>> {

        /* renamed from: a */
        public static final C59793l f136215a = new C59793l();

        static {
            Covode.recordClassIndex(70197);
        }

        C59793l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12644a<AbstractC59856c> invoke() {
            return new C59854b();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C59853a mo20674f() {
        return new C59853a();
    }

    /* renamed from: g */
    public final String mo23342g() {
        String str = this.f136170k;
        if (str == null) {
            C89219l.m154710a("mMixId");
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$d */
    static final class C59780d extends AbstractC89220m implements AbstractC89171a<C597811> {

        /* renamed from: a */
        final /* synthetic */ MixVideosManageViewModel f136183a;

        static {
            Covode.recordClassIndex(70184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59780d(MixVideosManageViewModel mixVideosManageViewModel) {
            super(0);
            this.f136183a = mixVideosManageViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C597811 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42320b = false;
            cVar.f42319a = 4;
            return new AbstractC17692b<Long>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.C59780d.C597811 */

                /* renamed from: a */
                final /* synthetic */ C59780d f136184a;

                static {
                    Covode.recordClassIndex(70185);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
                    if (r1 != null) goto L_0x003c;
                 */
                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo23345a(p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<java.lang.Long>> r14) {
                    /*
                    // Method dump skipped, instructions count: 108
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.C59780d.C597811.mo23345a(h.c.d):void");
                }

                {
                    this.f136184a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    long longValue = ((Number) obj).longValue();
                    C89219l.m154721d(dVar, "");
                    MixVideosManageViewModel mixVideosManageViewModel = this.f136184a.f136183a;
                    C89219l.m154721d(dVar, "");
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    int i = C59860g.f136351c;
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = null;
                    MixFeedApi a = MixFeedApi.C59385a.m109095a();
                    String str = mixVideosManageViewModel.f136170k;
                    if (str == null) {
                        C89219l.m154710a("mMixId");
                    }
                    C89219l.m154716b(curUser, "");
                    String uid = curUser.getUid();
                    C89219l.m154716b(uid, "");
                    String secUid = curUser.getSecUid();
                    C89219l.m154716b(secUid, "");
                    a.getMixVideos2(str, "", longValue, i, uid, secUid).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C59785h(mixVideosManageViewModel, dVar, eVar), new C59788i(dVar));
                }
            };
        }
    }

    /* renamed from: a */
    public final void mo97230a(boolean z) {
        mo20662a(new C59796o(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$a */
    public static final class C59777a extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f136175a;

        static {
            Covode.recordClassIndex(70181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59777a(C89233z.C89238e eVar) {
            super(1);
            this.f136175a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, null, this.f136175a.element, null, null, null, null, this.f136175a.element, 61);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$b */
    public static final class C59778b extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f136176a;

        /* renamed from: b */
        final /* synthetic */ MixVideosManageViewModel f136177b;

        /* renamed from: c */
        final /* synthetic */ List f136178c;

        /* renamed from: d */
        final /* synthetic */ List f136179d;

        static {
            Covode.recordClassIndex(70182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59778b(C89233z.C89238e eVar, MixVideosManageViewModel mixVideosManageViewModel, List list, List list2) {
            super(1);
            this.f136176a = eVar;
            this.f136177b = mixVideosManageViewModel;
            this.f136178c = list;
            this.f136179d = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, this.f136176a.element, null, null, null, null, this.f136179d, null, 94);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$e */
    public static final class C59782e extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ List f136185a;

        /* renamed from: b */
        final /* synthetic */ List f136186b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f136187c;

        /* renamed from: d */
        final /* synthetic */ C59853a f136188d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f136189e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f136190f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f136191g;

        /* renamed from: h */
        final /* synthetic */ MixVideosManageViewModel f136192h;

        static {
            Covode.recordClassIndex(70186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59782e(List list, List list2, C89233z.C89238e eVar, C59853a aVar, C89233z.C89238e eVar2, ArrayList arrayList, ArrayList arrayList2, MixVideosManageViewModel mixVideosManageViewModel) {
            super(1);
            this.f136185a = list;
            this.f136186b = list2;
            this.f136187c = eVar;
            this.f136188d = aVar;
            this.f136189e = eVar2;
            this.f136190f = arrayList;
            this.f136191g = arrayList2;
            this.f136192h = mixVideosManageViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, this.f136185a, this.f136191g, this.f136190f, null, null, null, null, 120);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$f */
    public static final class C59783f extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ List f136193a;

        /* renamed from: b */
        final /* synthetic */ List f136194b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f136195c;

        /* renamed from: d */
        final /* synthetic */ C59853a f136196d;

        /* renamed from: e */
        final /* synthetic */ MixVideosManageViewModel f136197e;

        static {
            Covode.recordClassIndex(70187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59783f(List list, List list2, C89233z.C89238e eVar, C59853a aVar, MixVideosManageViewModel mixVideosManageViewModel) {
            super(1);
            this.f136193a = list;
            this.f136194b = list2;
            this.f136195c = eVar;
            this.f136196d = aVar;
            this.f136197e = mixVideosManageViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, null, null, null, null, new C12776a(true), this.f136193a, null, 79);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$g */
    public static final class C59784g extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        public static final C59784g f136198a = new C59784g();

        static {
            Covode.recordClassIndex(70188);
        }

        C59784g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, null, null, null, null, new C12776a(true), null, null, 111);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$i */
    static final class C59788i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f136206a;

        static {
            Covode.recordClassIndex(70192);
        }

        C59788i(AbstractC89124d dVar) {
            this.f136206a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC89124d dVar = this.f136206a;
            Objects.requireNonNull(th, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a((Exception) th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$j */
    static final class C59789j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosManageViewModel f136207a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f136208b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f136209c;

        static {
            Covode.recordClassIndex(70193);
        }

        C59789j(MixVideosManageViewModel mixVideosManageViewModel, AbstractC89124d dVar, C89233z.C89238e eVar) {
            this.f136207a = mixVideosManageViewModel;
            this.f136208b = dVar;
            this.f136209c = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final T t = (T) ((C59399e) obj);
            this.f136207a.mo20667b(new AbstractC89172b<C59853a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.C59789j.C597901 */

                /* renamed from: a */
                final /* synthetic */ C59789j f136210a;

                static {
                    Covode.recordClassIndex(70194);
                }

                {
                    this.f136210a = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$j$1$a */
                static final class C59791a extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

                    /* renamed from: a */
                    final /* synthetic */ C597901 f136212a;

                    /* renamed from: b */
                    final /* synthetic */ List f136213b;

                    static {
                        Covode.recordClassIndex(70195);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C59791a(C597901 r2, List list) {
                        super(1);
                        this.f136212a = r2;
                        this.f136213b = list;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59853a invoke(C59853a aVar) {
                        C59853a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        return C59853a.m109311a(aVar2, this.f136213b, null, null, null, null, null, null, 126);
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59853a aVar) {
                    C89219l.m154721d(aVar, "");
                    List<? extends Aweme> list = t.f135686a;
                    this.f136210a.f136207a.f136172m = t.f135687b;
                    if (list != null) {
                        this.f136210a.f136207a.mo20662a(new C59791a(this, list));
                        AbstractC89124d dVar = this.f136210a.f136208b;
                        Long valueOf = Long.valueOf(t.f135688c);
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new C59774b(it.next()));
                        }
                        dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, valueOf, arrayList, 1)));
                    }
                    return C89391z.f203057a;
                }
            });
            this.f136209c.element = t;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$k */
    static final class C59792k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f136214a;

        static {
            Covode.recordClassIndex(70196);
        }

        C59792k(AbstractC89124d dVar) {
            this.f136214a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC89124d dVar = this.f136214a;
            Objects.requireNonNull(th, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a((Exception) th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$m */
    static final class C59794m extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        public static final C59794m f136216a = new C59794m();

        static {
            Covode.recordClassIndex(70198);
        }

        C59794m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, null, null, null, null, new C12776a(true), null, null, 111);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$n */
    public static final class C59795n extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f136217a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f136218b;

        /* renamed from: c */
        final /* synthetic */ MixVideosManageViewModel f136219c;

        /* renamed from: d */
        final /* synthetic */ String f136220d;

        static {
            Covode.recordClassIndex(70199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59795n(C89233z.C89238e eVar, C89233z.C89238e eVar2, MixVideosManageViewModel mixVideosManageViewModel, String str) {
            super(1);
            this.f136217a = eVar;
            this.f136218b = eVar2;
            this.f136219c = mixVideosManageViewModel;
            this.f136220d = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, null, this.f136218b.element, null, null, null, null, this.f136218b.element, 61);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$p */
    static final class C59797p extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f136222a;

        static {
            Covode.recordClassIndex(70201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59797p(ArrayList arrayList) {
            super(1);
            this.f136222a = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, null, null, null, null, null, null, this.f136222a, 63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$q */
    static final class C59798q extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f136223a;

        static {
            Covode.recordClassIndex(70202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59798q(C89233z.C89238e eVar) {
            super(1);
            this.f136223a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59853a.m109311a(aVar2, null, null, this.f136223a.element, null, null, null, null, 123);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$s */
    public static final class C59800s<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosManageViewModel f136226a;

        /* renamed from: b */
        final /* synthetic */ Activity f136227b;

        static {
            Covode.recordClassIndex(70204);
        }

        public C59800s(MixVideosManageViewModel mixVideosManageViewModel, Activity activity) {
            this.f136226a = mixVideosManageViewModel;
            this.f136227b = activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            new C23144b(this.f136227b).mo37640e(R.string.fz3).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$h */
    static final class C59785h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosManageViewModel f136199a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f136200b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f136201c;

        static {
            Covode.recordClassIndex(70189);
        }

        C59785h(MixVideosManageViewModel mixVideosManageViewModel, AbstractC89124d dVar, C89233z.C89238e eVar) {
            this.f136199a = mixVideosManageViewModel;
            this.f136200b = dVar;
            this.f136201c = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = (T) ((C59399e) obj);
            this.f136199a.mo20671d().mo20680a();
            List<? extends Aweme> list = t.f135686a;
            this.f136199a.f136172m = t.f135687b;
            this.f136199a.mo20667b(new C59786a(list, this, t));
            this.f136201c.element = t;
        }

        /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$h$a */
        static final class C59786a extends AbstractC89220m implements AbstractC89172b<C59853a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ List f136202a;

            /* renamed from: b */
            final /* synthetic */ C59785h f136203b;

            /* renamed from: c */
            final /* synthetic */ C59399e f136204c;

            static {
                Covode.recordClassIndex(70190);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C59786a(List list, C59785h hVar, C59399e eVar) {
                super(1);
                this.f136202a = list;
                this.f136203b = hVar;
                this.f136204c = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C59853a aVar) {
                C59853a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                List<Aweme> list = aVar2.f136325a;
                final C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = (T) new ArrayList();
                if (list != null) {
                    eVar.element.addAll(C89070n.m154590j(list));
                    T t = eVar.element;
                    List list2 = this.f136202a;
                    C48257j.m91661a(t, list2 != null ? C89070n.m154590j(list2) : null);
                }
                this.f136203b.f136199a.mo20662a(new AbstractC89172b<C59853a, C59853a>() {
                    /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.C59785h.C59786a.C597871 */

                    static {
                        Covode.recordClassIndex(70191);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C59853a invoke(C59853a aVar) {
                        C59853a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        return C59853a.m109311a(aVar2, eVar.element, null, null, null, null, null, null, 126);
                    }
                });
                if (this.f136203b.f136199a.f136172m) {
                    AbstractC89124d dVar = this.f136203b.f136200b;
                    Long valueOf = Long.valueOf(this.f136204c.f135688c);
                    List<T> list3 = this.f136202a;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                    for (T t2 : list3) {
                        arrayList.add(new C59774b(t2));
                    }
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, valueOf, arrayList, 1)));
                } else {
                    this.f136203b.f136200b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE)));
                }
                return C89391z.f203057a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$o */
    public static final class C59796o extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ boolean f136221a;

        static {
            Covode.recordClassIndex(70200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59796o(boolean z) {
            super(1);
            this.f136221a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            ArrayList arrayList = null;
            if (!this.f136221a) {
                List<Aweme> list = aVar2.f136325a;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAid());
                    }
                    ArrayList arrayList3 = arrayList2;
                    List<String> list2 = aVar2.f136326b;
                    if (list2 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (T t : list2) {
                            if (!arrayList3.contains(t)) {
                                arrayList4.add(t);
                            }
                        }
                        arrayList = arrayList4;
                    }
                }
            } else {
                arrayList = aVar2.f136326b;
            }
            return C59853a.m109311a(aVar2, null, arrayList, null, new C12776a(Boolean.valueOf(this.f136221a)), null, null, null, 117);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$c */
    public static final class C59779c extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {

        /* renamed from: a */
        final /* synthetic */ MixVideosManageViewModel f136180a;

        /* renamed from: b */
        final /* synthetic */ List f136181b;

        /* renamed from: c */
        final /* synthetic */ List f136182c;

        static {
            Covode.recordClassIndex(70183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59779c(MixVideosManageViewModel mixVideosManageViewModel, List list, List list2) {
            super(1);
            this.f136180a = mixVideosManageViewModel;
            this.f136181b = list;
            this.f136182c = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59853a invoke(C59853a aVar) {
            C59853a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            MixVideosManageViewModel mixVideosManageViewModel = this.f136180a;
            List<Aweme> list = this.f136181b;
            C59853a aVar3 = (C59853a) mixVideosManageViewModel.mo20671d().mo20680a();
            List<String> list2 = aVar3.f136327c;
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) new ArrayList();
            if (list2 != null) {
                eVar.element.addAll(C89070n.m154590j(list2));
                T t = eVar.element;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (Aweme aweme : list) {
                    arrayList.add(aweme.getAid());
                }
                t.addAll(0, arrayList);
            }
            int size = eVar.element.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = i2 - i;
                Object obj = eVar.element.get(i3);
                C89219l.m154716b(obj, "");
                List<String> list3 = aVar3.f136326b;
                if (list3 != null && list3.contains(obj)) {
                    eVar.element.remove(i3);
                    i++;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            List<String> list4 = aVar3.f136331g;
            if (list4 != null) {
                for (String str : list4) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C89219l.m154714a((Object) str, (Object) ((Aweme) it.next()).getAid())) {
                                break;
                            }
                        } else {
                            arrayList2.add(str);
                            break;
                        }
                    }
                }
            }
            mixVideosManageViewModel.mo20662a(new C59797p(arrayList2));
            mixVideosManageViewModel.mo20662a(new C59798q(eVar));
            return C59853a.m109311a(aVar2, null, null, null, null, new C12776a(true), null, null, 111);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel$r */
    public static final class C59799r<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MixVideosManageViewModel f136224a;

        /* renamed from: b */
        final /* synthetic */ Activity f136225b;

        static {
            Covode.recordClassIndex(70203);
        }

        public C59799r(MixVideosManageViewModel mixVideosManageViewModel, Activity activity) {
            this.f136224a = mixVideosManageViewModel;
            this.f136225b = activity;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 8
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 138
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel.C59799r.accept(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractC59400b
    /* renamed from: a */
    public final void mo97074a(int i, int i2) {
        if (i != i2) {
            List<Aweme> list = ((C59853a) mo20671d().mo20680a()).f136325a;
            if (list != null) {
                Collections.swap(list, i, i2);
            }
            mo20662a(C59794m.f136216a);
        }
    }

    /* renamed from: a */
    public final void mo97229a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f136170k = str;
        this.f136171l = str2;
        this.f136169j = str3;
    }
}

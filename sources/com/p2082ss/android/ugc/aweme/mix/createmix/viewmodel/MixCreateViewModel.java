package com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12791m;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.AbstractC59400b;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.AbstractC59856c;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59854b;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel */
public final class MixCreateViewModel extends AssemViewModel<C59528a> implements AbstractC59400b {

    /* renamed from: n */
    public static final C59508a f135805n = new C59508a((byte) 0);

    /* renamed from: j */
    public String f135806j = "";

    /* renamed from: k */
    public String f135807k = "";

    /* renamed from: l */
    public String f135808l = "";

    /* renamed from: m */
    public Aweme f135809m;

    /* renamed from: o */
    private final AbstractC89244h f135810o = C12646c.m22777a(this, C59509b.f135811a);

    static {
        Covode.recordClassIndex(69902);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractC59400b
    /* renamed from: b */
    public final String mo97075b() {
        return "create_playlist";
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$a */
    public static final class C59508a {
        static {
            Covode.recordClassIndex(69903);
        }

        private C59508a() {
        }

        public /* synthetic */ C59508a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractC59400b
    /* renamed from: a */
    public final String mo97073a() {
        return this.f135807k;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$b */
    static final class C59509b extends AbstractC89220m implements AbstractC89171a<AbstractC12644a<AbstractC59856c>> {

        /* renamed from: a */
        public static final C59509b f135811a = new C59509b();

        static {
            Covode.recordClassIndex(69904);
        }

        C59509b() {
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
    public final /* synthetic */ C59528a mo20674f() {
        return new C59528a();
    }

    /* renamed from: h */
    public final boolean mo23343h() {
        return ((C59528a) mo20671d().mo20680a()).f135842k;
    }

    /* renamed from: i */
    public final void mo97106i() {
        mo20667b(new C59515h(this));
    }

    /* renamed from: g */
    public final String mo23342g() {
        String str = ((C59528a) mo20671d().mo20680a()).f135836e;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public final void mo97102a(EnumC59529b bVar) {
        C89219l.m154721d(bVar, "");
        mo20662a(new C59510c(bVar));
    }

    /* renamed from: b */
    public final void mo97105b(String str) {
        C89219l.m154721d(str, "");
        mo20670c(new C59514g(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$c */
    public static final class C59510c extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {

        /* renamed from: a */
        final /* synthetic */ EnumC59529b f135812a;

        static {
            Covode.recordClassIndex(69905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59510c(EnumC59529b bVar) {
            super(1);
            this.f135812a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59528a invoke(C59528a aVar) {
            C59528a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59528a.m109166a(aVar2, null, null, null, null, null, new C12776a(this.f135812a), null, null, null, null, false, 2015);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$d */
    static final class C59511d extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {

        /* renamed from: a */
        final /* synthetic */ boolean f135813a;

        static {
            Covode.recordClassIndex(69906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59511d(boolean z) {
            super(1);
            this.f135813a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59528a invoke(C59528a aVar) {
            C59528a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59528a.m109166a(aVar2, null, null, null, null, null, null, null, null, null, null, this.f135813a, 1023);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$e */
    static final class C59512e extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {

        /* renamed from: a */
        final /* synthetic */ String f135814a;

        static {
            Covode.recordClassIndex(69907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59512e(String str) {
            super(1);
            this.f135814a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59528a invoke(C59528a aVar) {
            C59528a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59528a.m109166a(aVar2, null, null, null, null, null, null, null, null, this.f135814a, null, false, 1791);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$f */
    public static final class C59513f extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {

        /* renamed from: a */
        final /* synthetic */ List f135815a;

        static {
            Covode.recordClassIndex(69908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59513f(List list) {
            super(1);
            this.f135815a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59528a invoke(C59528a aVar) {
            C59528a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59528a.m109166a(aVar2, null, null, this.f135815a, null, null, null, null, null, null, null, false, 2043);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$g */
    static final class C59514g extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {

        /* renamed from: a */
        final /* synthetic */ String f135816a;

        static {
            Covode.recordClassIndex(69909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59514g(String str) {
            super(1);
            this.f135816a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C59528a invoke(C59528a aVar) {
            C59528a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return C59528a.m109166a(aVar2, null, null, null, null, this.f135816a, null, null, null, null, null, false, 2031);
        }
    }

    /* renamed from: a */
    public final void mo97103a(String str) {
        C89219l.m154721d(str, "");
        mo20662a(new C59512e(str));
        this.f135806j = str;
    }

    /* renamed from: a */
    public final void mo97104a(boolean z) {
        mo20662a(new C59511d(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel$h */
    static final class C59515h extends AbstractC89220m implements AbstractC89172b<C59528a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MixCreateViewModel f135817a;

        static {
            Covode.recordClassIndex(69910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59515h(MixCreateViewModel mixCreateViewModel) {
            super(1);
            this.f135817a = mixCreateViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59528a aVar) {
            final C59528a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            final String str = null;
            if (aVar2.f135842k) {
                if (!(aVar2.f135838g instanceof C12791m)) {
                    this.f135817a.mo20670c(C595161.f135818a);
                    List<Aweme> list = aVar2.f135834c;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (next.getCommerceVideoAuthInfo() != null) {
                                C37437a commerceVideoAuthInfo = next.getCommerceVideoAuthInfo();
                                C89219l.m154716b(commerceVideoAuthInfo, "");
                                if (commerceVideoAuthInfo.getDarkPostStatus() == 1) {
                                    this.f135817a.mo20662a(C595193.f135821a);
                                    break;
                                }
                            }
                        }
                    }
                    List<Aweme> list2 = aVar2.f135834c;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getAid());
                        }
                        str = C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
                    }
                    MixCreateViewModel mixCreateViewModel = this.f135817a;
                    AbstractC88412b a = MixFeedApi.C59385a.m109095a().manageMixFeed(MixFeedApi.EnumC59386b.MIXCREATE.getOperation(), aVar2.f135840i, "[" + str + ']', "", "null", aVar2.f135836e).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595204 */

                        /* renamed from: a */
                        final /* synthetic */ C59515h f135822a;

                        static {
                            Covode.recordClassIndex(69915);
                        }

                        {
                            this.f135822a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            List<Aweme> list;
                            final C59396b bVar = (C59396b) obj;
                            this.f135822a.f135817a.mo20662a(new AbstractC89172b<C59528a, C59528a>() {
                                /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595204.C595211 */

                                static {
                                    Covode.recordClassIndex(69916);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C59528a invoke(C59528a aVar) {
                                    C59528a aVar2 = aVar;
                                    C89219l.m154721d(aVar2, "");
                                    return C59528a.m109166a(aVar2, null, null, null, null, null, null, new C12792n(bVar), null, null, null, false, 1983);
                                }
                            });
                            if (!TextUtils.isEmpty(str) && (list = aVar2.f135834c) != null) {
                                C59330a.m109032a(bVar.f135679a, list.size(), this.f135822a.f135817a.f135807k, this.f135822a.f135817a.f135808l);
                            }
                        }
                    }, new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595225 */

                        /* renamed from: a */
                        final /* synthetic */ C59515h f135826a;

                        static {
                            Covode.recordClassIndex(69917);
                        }

                        {
                            this.f135826a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            final Throwable th = (Throwable) obj;
                            this.f135826a.f135817a.mo20662a(new AbstractC89172b<C59528a, C59528a>() {
                                /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595225.C595231 */

                                static {
                                    Covode.recordClassIndex(69918);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C59528a invoke(C59528a aVar) {
                                    C59528a aVar2 = aVar;
                                    C89219l.m154721d(aVar2, "");
                                    Throwable th = th;
                                    C89219l.m154716b(th, "");
                                    return C59528a.m109166a(aVar2, null, null, null, null, null, null, new C12785h(th), null, null, null, false, 1983);
                                }
                            });
                        }
                    });
                    C89219l.m154716b(a, "");
                    mixCreateViewModel.mo20659a(a);
                }
            } else if (!(aVar2.f135839h instanceof C12791m)) {
                this.f135817a.mo20670c(C595246.f135828a);
                List<Aweme> list3 = aVar2.f135834c;
                if (list3 != null) {
                    Iterator<T> it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next2 = it3.next();
                        if (next2.getCommerceVideoAuthInfo() != null) {
                            C37437a commerceVideoAuthInfo2 = next2.getCommerceVideoAuthInfo();
                            C89219l.m154716b(commerceVideoAuthInfo2, "");
                            if (commerceVideoAuthInfo2.getDarkPostStatus() == 1) {
                                this.f135817a.mo20662a(C595257.f135829a);
                                break;
                            }
                        }
                    }
                }
                List<Aweme> list4 = aVar2.f135834c;
                if (list4 != null) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list4, 10));
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(it4.next().getAid());
                    }
                    str = C89070n.m154551a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
                }
                MixCreateViewModel mixCreateViewModel2 = this.f135817a;
                AbstractC88412b a2 = MixFeedApi.C59385a.m109095a().manageMixFeed(MixFeedApi.EnumC59386b.VIDEOADD.getOperation(), aVar2.f135840i, "", "[" + str + ']', "null", aVar2.f135836e).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595268 */

                    /* renamed from: a */
                    final /* synthetic */ C59515h f135830a;

                    static {
                        Covode.recordClassIndex(69921);
                    }

                    {
                        this.f135830a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final C59396b bVar = (C59396b) obj;
                        this.f135830a.f135817a.mo20662a(new AbstractC89172b<C59528a, C59528a>() {
                            /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595268.C595271 */

                            static {
                                Covode.recordClassIndex(69922);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C59528a invoke(C59528a aVar) {
                                C59528a aVar2 = aVar;
                                C89219l.m154721d(aVar2, "");
                                return C59528a.m109166a(aVar2, null, null, null, null, null, null, null, new C12792n(bVar), null, null, false, 1919);
                            }
                        });
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595172 */

                    /* renamed from: a */
                    final /* synthetic */ C59515h f135819a;

                    static {
                        Covode.recordClassIndex(69912);
                    }

                    {
                        this.f135819a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        final Throwable th = (Throwable) obj;
                        this.f135819a.f135817a.mo20662a(new AbstractC89172b<C59528a, C59528a>() {
                            /* class com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel.C59515h.C595172.C595181 */

                            static {
                                Covode.recordClassIndex(69913);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            public final /* synthetic */ C59528a invoke(C59528a aVar) {
                                C59528a aVar2 = aVar;
                                C89219l.m154721d(aVar2, "");
                                Throwable th = th;
                                C89219l.m154716b(th, "");
                                return C59528a.m109166a(aVar2, null, null, null, null, null, null, null, new C12785h(th), null, null, false, 1919);
                            }
                        });
                    }
                });
                C89219l.m154716b(a2, "");
                mixCreateViewModel2.mo20659a(a2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.AbstractC59400b
    /* renamed from: a */
    public final void mo97074a(int i, int i2) {
        List<Aweme> list;
        if (i != i2 && (list = ((C59528a) mo20671d().mo20680a()).f135834c) != null) {
            Collections.swap(list, i, i2);
        }
    }
}

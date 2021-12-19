package com.p2082ss.android.ugc.aweme.mix.addfeed.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.model.C59864a;
import com.p2082ss.android.ugc.aweme.mix.model.C59867d;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel */
public final class GetMixListViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public int f135652a = -1;

    /* renamed from: b */
    public AddFeedToMixFragment.C59338d f135653b;

    /* renamed from: c */
    public boolean f135654c = true;

    /* renamed from: d */
    public boolean f135655d;

    /* renamed from: e */
    public List<AddFeedToMixFragment.C59336b> f135656e = new ArrayList();

    /* renamed from: f */
    public String f135657f = "";

    /* renamed from: g */
    public Aweme f135658g;

    /* renamed from: h */
    public String f135659h = "";

    /* renamed from: i */
    public String f135660i = "";

    /* renamed from: j */
    public boolean f135661j;

    /* renamed from: k */
    private final AbstractC89244h f135662k = C89250i.m154773a((AbstractC89171a) new C59379a(this));

    static {
        Covode.recordClassIndex(69765);
    }

    /* renamed from: a */
    public final AbstractC17692b<C59864a> mo97040a() {
        return (AbstractC17692b) this.f135662k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a */
    static final class C59379a extends AbstractC89220m implements AbstractC89171a<C593801> {

        /* renamed from: a */
        final /* synthetic */ GetMixListViewModel f135663a;

        static {
            Covode.recordClassIndex(69766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59379a(GetMixListViewModel getMixListViewModel) {
            super(0);
            this.f135663a = getMixListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C593801 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42320b = false;
            return new AbstractC17692b<C59864a>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel.C59379a.C593801 */

                /* renamed from: a */
                final /* synthetic */ C59379a f135664a;

                static {
                    Covode.recordClassIndex(69767);
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$b */
                static final class C59382b<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC89124d f135667a;

                    static {
                        Covode.recordClassIndex(69769);
                    }

                    C59382b(AbstractC89124d dVar) {
                        this.f135667a = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f135667a.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$d */
                static final class C59384d<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ AbstractC89124d f135670a;

                    static {
                        Covode.recordClassIndex(69771);
                    }

                    C59384d(AbstractC89124d dVar) {
                        this.f135670a = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f135670a.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(((Throwable) obj).getMessage()))));
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$a */
                static final class C59381a<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ C593801 f135665a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f135666b;

                    static {
                        Covode.recordClassIndex(69768);
                    }

                    C59381a(C593801 r1, AbstractC89124d dVar) {
                        this.f135665a = r1;
                        this.f135666b = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C59864a aVar = (C59864a) obj;
                        if (aVar != null) {
                            List<AddFeedToMixFragment.C59338d> a = this.f135665a.f135664a.f135663a.mo97041a((List<? extends C59867d>) aVar.getMixList(), true);
                            List<AddFeedToMixFragment.C59336b> list = this.f135665a.f135664a.f135663a.f135656e;
                            ArrayList arrayList = new ArrayList();
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            arrayList.addAll(a);
                            if (aVar.getHasMore()) {
                                this.f135666b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(null, aVar, this.f135665a.f135664a.f135663a.mo97041a((List<? extends C59867d>) aVar.getMixList(), true))));
                            } else {
                                this.f135666b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(this.f135665a.f135664a.f135663a.mo97041a((List<? extends C59867d>) aVar.getMixList(), true))));
                            }
                        }
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel$a$1$c */
                static final class C59383c<T> implements AbstractC88433f {

                    /* renamed from: a */
                    final /* synthetic */ C593801 f135668a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f135669b;

                    static {
                        Covode.recordClassIndex(69770);
                    }

                    C59383c(C593801 r1, AbstractC89124d dVar) {
                        this.f135668a = r1;
                        this.f135669b = dVar;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C59864a aVar = (C59864a) obj;
                        if (aVar != null) {
                            List<C59867d> mixList = aVar.getMixList();
                            if (mixList != null && mixList.isEmpty()) {
                                this.f135669b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(this.f135668a.f135664a.f135663a.mo97041a((List<? extends C59867d>) aVar.getMixList(), false))));
                            } else if (aVar.getHasMore()) {
                                this.f135669b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32840a(null, aVar, this.f135668a.f135664a.f135663a.mo97041a((List<? extends C59867d>) aVar.getMixList(), false))));
                            } else {
                                this.f135669b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(this.f135668a.f135664a.f135663a.mo97041a((List<? extends C59867d>) aVar.getMixList(), false))));
                            }
                        }
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<C59864a>> dVar) {
                    C89219l.m154721d(dVar, "");
                    C31575b.m65859a();
                    IAccountUserService e = C31575b.f75524a.mo57069e();
                    C89219l.m154716b(e, "");
                    String curUserId = e.getCurUserId();
                    C31575b.m65859a();
                    IAccountUserService e2 = C31575b.f75524a.mo57069e();
                    C89219l.m154716b(e2, "");
                    String curSecUserId = e2.getCurSecUserId();
                    MixFeedApi a = MixFeedApi.C59385a.m109095a();
                    C89219l.m154716b(curUserId, "");
                    C89219l.m154716b(curSecUserId, "");
                    C89219l.m154716b(a.getUserMixList(curUserId, 0, curSecUserId).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59383c(this, dVar), new C59384d(dVar)), "");
                }

                {
                    this.f135664a = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    C59864a aVar = (C59864a) obj;
                    C89219l.m154721d(dVar, "");
                    C89219l.m154721d(aVar, "");
                    C31575b.m65859a();
                    IAccountUserService e = C31575b.f75524a.mo57069e();
                    C89219l.m154716b(e, "");
                    String curUserId = e.getCurUserId();
                    if (aVar.getHasMore()) {
                        MixFeedApi a = MixFeedApi.C59385a.m109095a();
                        C89219l.m154716b(curUserId, "");
                        C89219l.m154716b(a.getUserMixList(curUserId, aVar.getCursor(), "").mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C59381a(this, dVar), new C59382b(dVar)), "");
                    }
                }
            };
        }
    }

    /* renamed from: b */
    public final void mo97043b() {
        mo97040a().f42330c.mo28163e();
    }

    /* renamed from: a */
    public final void mo97042a(int i, AddFeedToMixFragment.C59338d dVar) {
        this.f135652a = i;
        this.f135653b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r9.isEmpty() != false) goto L_0x0080;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.C59338d> mo97041a(java.util.List<? extends com.p2082ss.android.ugc.aweme.mix.model.C59867d> r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel.mo97041a(java.util.List, boolean):java.util.List");
    }
}

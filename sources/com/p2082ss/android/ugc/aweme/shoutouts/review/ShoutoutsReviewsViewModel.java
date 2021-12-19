package com.p2082ss.android.ugc.aweme.shoutouts.review;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74441e;
import com.p2082ss.android.ugc.aweme.shoutouts.model.C74442f;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingListApi;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3904b.C74541a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3904b.C74542b;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.ArrayList;
import java.util.Iterator;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel */
public final class ShoutoutsReviewsViewModel extends AbstractC1174ac {

    /* renamed from: d */
    public static final C74522a f167575d = new C74522a((byte) 0);

    /* renamed from: a */
    public String f167576a;

    /* renamed from: b */
    public String f167577b;

    /* renamed from: c */
    public String f167578c;

    /* renamed from: e */
    private final AbstractC89244h f167579e = C89250i.m154773a((AbstractC89171a) new C74523b(this));

    static {
        Covode.recordClassIndex(87327);
    }

    /* renamed from: a */
    public final AbstractC17692b<Integer> mo117190a() {
        return (AbstractC17692b) this.f167579e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel$a */
    public static final class C74522a {
        static {
            Covode.recordClassIndex(87328);
        }

        private C74522a() {
        }

        public /* synthetic */ C74522a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel$b */
    static final class C74523b extends AbstractC89220m implements AbstractC89171a<C745241> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutsReviewsViewModel f167580a;

        static {
            Covode.recordClassIndex(87329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74523b(ShoutoutsReviewsViewModel shoutoutsReviewsViewModel) {
            super(0);
            this.f167580a = shoutoutsReviewsViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C745241 invoke() {
            C17693c cVar = new C17693c();
            cVar.f42320b = false;
            cVar.f42319a = 5;
            cVar.f42321c = LoadingFooterCell.class;
            return new AbstractC17692b<Integer>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel.C74523b.C745241 */

                /* renamed from: a */
                public int f167581a;

                /* renamed from: e */
                final /* synthetic */ C74523b f167582e;

                static {
                    Covode.recordClassIndex(87330);
                }

                /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel$b$1$a */
                public static final class C74525a implements AbstractC88406ae<C74442f> {

                    /* renamed from: a */
                    final /* synthetic */ C745241 f167583a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f167584b;

                    static {
                        Covode.recordClassIndex(87331);
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onSubscribe(AbstractC88412b bVar) {
                        C89219l.m154721d(bVar, "");
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onError(Throwable th) {
                        C89219l.m154721d(th, "");
                        this.f167584b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(th.getMessage()))));
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final /* synthetic */ void onSuccess(C74442f fVar) {
                        C74542b a;
                        C74442f fVar2 = fVar;
                        C89219l.m154721d(fVar2, "");
                        if (fVar2.f167416a == 0) {
                            ArrayList<C74441e> arrayList = fVar2.f167420e;
                            if (arrayList != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<C74441e> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C74441e next = it.next();
                                    if (!(next == null || (a = C74541a.m130966a(next)) == null)) {
                                        arrayList2.add(a);
                                        this.f167583a.f167581a++;
                                    }
                                }
                                if (fVar2.f167418c) {
                                    this.f167584b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, Integer.valueOf(this.f167583a.f167581a), arrayList2, 1)));
                                } else {
                                    this.f167584b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                                }
                            }
                        } else {
                            this.f167584b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(this.f167583a.f167582e.f167580a.f167578c))));
                        }
                    }

                    C74525a(C745241 r1, AbstractC89124d dVar) {
                        this.f167583a = r1;
                        this.f167584b = dVar;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel$b$1$b */
                public static final class C74526b implements AbstractC88406ae<C74442f> {

                    /* renamed from: a */
                    final /* synthetic */ C745241 f167585a;

                    /* renamed from: b */
                    final /* synthetic */ AbstractC89124d f167586b;

                    static {
                        Covode.recordClassIndex(87332);
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onSubscribe(AbstractC88412b bVar) {
                        C89219l.m154721d(bVar, "");
                    }

                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final void onError(Throwable th) {
                        C89219l.m154721d(th, "");
                        this.f167586b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(th.getMessage()))));
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88406ae
                    public final /* synthetic */ void onSuccess(C74442f fVar) {
                        C74542b a;
                        C74442f fVar2 = fVar;
                        C89219l.m154721d(fVar2, "");
                        if (fVar2.f167416a == 0) {
                            ArrayList<C74441e> arrayList = fVar2.f167420e;
                            if (arrayList != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<C74441e> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C74441e next = it.next();
                                    if (!(next == null || (a = C74541a.m130966a(next)) == null)) {
                                        arrayList2.add(a);
                                        this.f167585a.f167581a++;
                                    }
                                }
                                if (fVar2.f167418c) {
                                    this.f167586b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, Integer.valueOf(this.f167585a.f167581a), arrayList2, 1)));
                                } else {
                                    this.f167586b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList2)));
                                }
                            }
                        } else {
                            this.f167586b.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(new Exception(this.f167585a.f167582e.f167580a.f167578c))));
                        }
                    }

                    C74526b(C745241 r1, AbstractC89124d dVar) {
                        this.f167585a = r1;
                        this.f167586b = dVar;
                    }
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Integer>> dVar) {
                    C89219l.m154721d(dVar, "");
                    ShoutoutsRatingListApi.C74436a.m130892a().getRatingList(this.f167582e.f167580a.f167576a, this.f167582e.f167580a.f167577b, this.f167581a, 10).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C74526b(this, dVar));
                }

                {
                    this.f167582e = r1;
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    ((Number) obj).intValue();
                    C89219l.m154721d(dVar, "");
                    ShoutoutsRatingListApi.C74436a.m130892a().getRatingList(this.f167582e.f167580a.f167576a, this.f167582e.f167580a.f167577b, this.f167581a, 10).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C74525a(this, dVar));
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel$c */
    public static final class C74527c implements AbstractC88406ae<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f167587a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f167588b;

        static {
            Covode.recordClassIndex(87333);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            AbstractC89171a aVar = this.f167588b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            C89219l.m154721d(baseResponse2, "");
            if (baseResponse2.status_code == 0) {
                AbstractC89171a aVar = this.f167587a;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            AbstractC89171a aVar2 = this.f167588b;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }

        public C74527c(AbstractC89171a aVar, AbstractC89171a aVar2) {
            this.f167587a = aVar;
            this.f167588b = aVar2;
        }
    }
}

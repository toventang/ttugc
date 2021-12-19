package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel */
public final class GroupListViewModel extends AbstractC1174ac implements AbstractC33974au {

    /* renamed from: d */
    public static final C55613a f126855d = new C55613a((byte) 0);

    /* renamed from: a */
    public final List<IMConversation> f126856a = new ArrayList();

    /* renamed from: b */
    public final C1213t<Boolean> f126857b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<IMConversation> f126858c = new C1213t<>();

    /* renamed from: e */
    private final AbstractC89244h f126859e = C89250i.m154773a((AbstractC89171a) new C55614b(this));

    static {
        Covode.recordClassIndex(65392);
    }

    /* renamed from: a */
    public final AbstractC17692b<Long> mo92527a() {
        return (AbstractC17692b) this.f126859e.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel$a */
    public static final class C55613a {
        static {
            Covode.recordClassIndex(65393);
        }

        private C55613a() {
        }

        public /* synthetic */ C55613a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel$b */
    static final class C55614b extends AbstractC89220m implements AbstractC89171a<C556162> {

        /* renamed from: a */
        final /* synthetic */ GroupListViewModel f126860a;

        static {
            Covode.recordClassIndex(65394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55614b(GroupListViewModel groupListViewModel) {
            super(0);
            this.f126860a = groupListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C556162 invoke() {
            final C55617a aVar = new C55617a(this);
            final C556151 r2 = new AbstractC89172b<AbstractC89124d<? super AbstractC17700f<Long>>, C55617a>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.GroupListViewModel.C55614b.C556151 */

                static {
                    Covode.recordClassIndex(65395);
                }

                /* renamed from: a */
                public final C55617a invoke(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
                    C89219l.m154721d(dVar, "");
                    C55617a aVar = aVar;
                    aVar.mo92529a(dVar);
                    return aVar;
                }
            };
            C17693c cVar = new C17693c();
            cVar.f42321c = LoadingFooterCell.class;
            return new AbstractC17692b<Long>(this, cVar) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.GroupListViewModel.C55614b.C556162 */

                /* renamed from: a */
                final /* synthetic */ C55614b f126862a;

                static {
                    Covode.recordClassIndex(65396);
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: a */
                public final void mo23345a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
                    C89219l.m154721d(dVar, "");
                    C56244a.m102191c("GroupListViewModel", "onRefresh");
                    this.f126862a.f126860a.f126856a.clear();
                    C55357e.C55358a.m101168a();
                    C55357e.m101165a(0, r2.invoke(dVar));
                }

                @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
                /* renamed from: b */
                public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                    long longValue = ((Number) obj).longValue();
                    C89219l.m154721d(dVar, "");
                    C56244a.m102191c("GroupListViewModel", "onLoadMore, from cursor: ".concat(String.valueOf(longValue)));
                    C55357e.C55358a.m101168a();
                    C55357e.m101165a(longValue, r2.invoke(dVar));
                }

                {
                    this.f126862a = r1;
                }
            };
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel$b$a */
        public static final class C55617a extends AbstractC19478a<List<? extends C19638h>> {

            /* renamed from: a */
            public AbstractC89124d<? super AbstractC17700f<Long>> f126864a;

            /* renamed from: b */
            final /* synthetic */ C55614b f126865b;

            static {
                Covode.recordClassIndex(65397);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C55617a(C55614b bVar) {
                this.f126865b = bVar;
            }

            /* renamed from: a */
            public final void mo92529a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
                C89219l.m154721d(dVar, "");
                this.f126864a = dVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
                if (((kotlinx.coroutines.AbstractC89671m) r1).mo144213a() != false) goto L_0x0032;
             */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo27860a(com.bytedance.p1399im.core.p1408d.C19672u r5) {
                /*
                    r4 = this;
                    java.lang.String r1 = java.lang.String.valueOf(r5)
                    java.lang.String r0 = "GroupListViewModel"
                    com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a.m102193e(r0, r1)
                    android.content.Context r0 = com.bytedance.ies.ugc.appcontext.C17867d.m33078a()
                    com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55340b.m101158a(r0, r5)
                    h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r0 = r4.f126864a
                    java.lang.String r3 = "continuation"
                    if (r0 != 0) goto L_0x0019
                    p4600h.p4611f.p4613b.C89219l.m154710a(r3)
                L_0x0019:
                    boolean r0 = r0 instanceof kotlinx.coroutines.AbstractC89671m
                    r2 = 1
                    if (r0 == 0) goto L_0x0032
                    h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r1 = r4.f126864a
                    if (r1 != 0) goto L_0x0025
                    p4600h.p4611f.p4613b.C89219l.m154710a(r3)
                L_0x0025:
                    java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<com.bytedance.ies.powerlist.page.PageValue<kotlin.Long>>"
                    java.util.Objects.requireNonNull(r1, r0)
                    kotlinx.coroutines.m r1 = (kotlinx.coroutines.AbstractC89671m) r1
                    boolean r0 = r1.mo144213a()
                    if (r0 == 0) goto L_0x0044
                L_0x0032:
                    h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r1 = r4.f126864a
                    if (r1 != 0) goto L_0x0039
                    p4600h.p4611f.p4613b.C89219l.m154710a(r3)
                L_0x0039:
                    com.bytedance.ies.powerlist.page.f$b r0 = com.bytedance.ies.powerlist.page.AbstractC17700f.C17701a.m32837a()
                    java.lang.Object r0 = p4600h.C89379q.m157068constructorimpl(r0)
                    r1.resumeWith(r0)
                L_0x0044:
                    com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel$b r0 = r4.f126865b
                    com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel r0 = r0.f126860a
                    androidx.lifecycle.t<java.lang.Boolean> r1 = r0.f126857b
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    r1.postValue(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.GroupListViewModel.C55614b.C55617a.mo27860a(com.bytedance.im.core.d.u):void");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a
            /* renamed from: a */
            public final /* synthetic */ void mo31135a(List<? extends C19638h> list, long j, boolean z) {
                boolean z2;
                List<? extends C19638h> list2 = list;
                C56244a.m102191c("GroupListViewModel", new StringBuilder("onResult, result size ").append(list2 != null ? Integer.valueOf(list2.size()) : null).append(", nextCursor: ").append(j).append(", hasMore: ").append(z).toString());
                if (list2 == null || list2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    AbstractC89124d<? super AbstractC17700f<Long>> dVar = this.f126864a;
                    if (dVar == null) {
                        C89219l.m154710a("continuation");
                    }
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE)));
                } else {
                    List<C19638h> f = C89070n.m154580f((Iterable) list2);
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) f, 10));
                    for (C19638h hVar : f) {
                        arrayList.add(C55082e.m100743b(hVar));
                    }
                    this.f126865b.f126860a.f126856a.addAll(arrayList);
                    if (z) {
                        AbstractC89124d<? super AbstractC17700f<Long>> dVar2 = this.f126864a;
                        if (dVar2 == null) {
                            C89219l.m154710a("continuation");
                        }
                        dVar2.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, Long.valueOf(j), null, 5)));
                    } else {
                        AbstractC89124d<? super AbstractC17700f<Long>> dVar3 = this.f126864a;
                        if (dVar3 == null) {
                            C89219l.m154710a("continuation");
                        }
                        dVar3.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(C89086z.INSTANCE)));
                    }
                }
                this.f126865b.f126860a.f126857b.postValue(true);
            }
        }
    }
}

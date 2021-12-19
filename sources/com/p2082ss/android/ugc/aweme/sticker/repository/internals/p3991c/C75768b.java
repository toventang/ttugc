package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3991c;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20191d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.b */
public final class C75768b extends AbstractC20191d<C89391z, FetchFavoriteListResponse> {

    /* renamed from: a */
    public final String f170206a;

    /* renamed from: b */
    public final AbstractC84398d f170207b;

    static {
        Covode.recordClassIndex(88702);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.b$a */
    static final class C75769a<T> implements AbstractC88983w<FetchFavoriteListResponse> {

        /* renamed from: a */
        final /* synthetic */ C75768b f170208a;

        static {
            Covode.recordClassIndex(88703);
        }

        C75769a(C75768b bVar) {
            this.f170208a = bVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<FetchFavoriteListResponse> vVar) {
            C89219l.m154721d(vVar, "");
            this.f170208a.f170207b.mo78893a(this.f170208a.f170206a, new IFetchFavoriteList() {
                /* class com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3991c.C75768b.C75769a.C757701 */

                static {
                    Covode.recordClassIndex(88704);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
                public final void onFailed(ExceptionResult exceptionResult) {
                    C89219l.m154721d(exceptionResult, "");
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (!vVar.isDisposed()) {
                        vVar.mo143024a((Throwable) exceptionResult.getException());
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                    AbstractC88982v vVar = vVar;
                    C89219l.m154716b(vVar, "");
                    if (vVar.isDisposed()) {
                        return;
                    }
                    if (fetchFavoriteListResponse != null) {
                        vVar.mo143031a(fetchFavoriteListResponse);
                        vVar.mo143023a();
                        return;
                    }
                    vVar.mo143024a((Throwable) new IllegalArgumentException("favorite list fetching failed"));
                }
            });
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t mo33481a(Object obj) {
        C89219l.m154721d(obj, "");
        AbstractC88979t a = AbstractC88979t.m154294a(new C75769a(this));
        C89219l.m154716b(a, "");
        return a;
    }

    public C75768b(String str, AbstractC84398d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(dVar, "");
        this.f170206a = str;
        this.f170207b = dVar;
    }
}

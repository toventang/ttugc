package com.p2082ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C71818ev;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72606ah;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72690y;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.f */
public final class C67294f extends AbstractC72639k {

    /* renamed from: a */
    public final AbstractC74304x<C69831ai> f150790a;

    /* renamed from: b */
    private final C67336m f150791b = new C67336m("PublishScheduler-PublishCallbackWrapper");

    static {
        Covode.recordClassIndex(78917);
    }

    public C67294f(AbstractC74304x<C69831ai> xVar) {
        C89219l.m154721d(xVar, "");
        this.f150790a = xVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onProgress(int i, Object obj) {
        if (!(obj instanceof Boolean)) {
            this.f150791b.mo106185a("onProgress extra not boolean");
        } else {
            this.f150790a.onProgressUpdate(i, ((Boolean) obj).booleanValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onFinish(AbstractC72623d dVar, Object obj) {
        C89219l.m154721d(dVar, "");
        C67295g.m119228a("PublishParallel PublishCallbackWrapper onFinish " + toString());
        if (dVar instanceof AbstractC72623d.C72626c) {
            if (!(obj instanceof Boolean)) {
                this.f150791b.mo106185a("onFinish extra not boolean");
            } else {
                this.f150790a.onSuccess(((AbstractC72623d.C72626c) dVar).f162806a, ((Boolean) obj).booleanValue());
            }
        } else if (dVar instanceof AbstractC72623d.C72625b) {
            AbstractC72623d.C72625b bVar = (AbstractC72623d.C72625b) dVar;
            if (bVar.f162805a.f162926d == null || !(bVar.f162805a.f162927e instanceof Boolean)) {
                this.f150791b.mo106185a("onFinish  null error / extra not boolean");
                return;
            }
            AbstractC74304x<C69831ai> xVar = this.f150790a;
            C71818ev evVar = new C71818ev(bVar.f162805a.f162926d, bVar.f162805a.f162925c);
            Object obj2 = bVar.f162805a.f162927e;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            evVar.setRecover(((Boolean) obj2).booleanValue());
            xVar.onError(evVar);
        } else if ((dVar instanceof AbstractC72623d.C72624a) && C68747m.m121180a()) {
            this.f150790a.onParallelPublishCancel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onStageUpdate(String str, AbstractC72606ah ahVar, Object obj) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(ahVar, "");
        if (C89219l.m154714a((Object) str, (Object) "STAGE_SYNTHETIC") && (ahVar instanceof AbstractC72606ah.C72607a)) {
            AbstractC72606ah.C72607a aVar = (AbstractC72606ah.C72607a) ahVar;
            if (aVar.f162763a instanceof AbstractC72690y.C72691a) {
                AbstractC72690y yVar = aVar.f162763a;
                Objects.requireNonNull(yVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                if (((AbstractC72690y.C72691a) yVar).f162966a instanceof String) {
                    AbstractC74304x<C69831ai> xVar = this.f150790a;
                    AbstractC72690y yVar2 = aVar.f162763a;
                    Objects.requireNonNull(yVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                    Object obj2 = ((AbstractC72690y.C72691a) yVar2).f162966a;
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    xVar.onSynthetiseSuccess((String) obj2);
                }
            }
        }
    }
}

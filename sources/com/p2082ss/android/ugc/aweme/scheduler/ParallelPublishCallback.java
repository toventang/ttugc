package com.p2082ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.ParallelPublishCallback */
public final class ParallelPublishCallback extends AbstractC72639k {
    private AbstractC89171a<C89391z> onParallelTaskFinish;

    static {
        Covode.recordClassIndex(78902);
    }

    public ParallelPublishCallback() {
        this(null, 1, null);
    }

    public final AbstractC89171a<C89391z> getOnParallelTaskFinish() {
        return this.onParallelTaskFinish;
    }

    public final void setOnParallelTaskFinish(AbstractC89171a<C89391z> aVar) {
        this.onParallelTaskFinish = aVar;
    }

    public ParallelPublishCallback(AbstractC89171a<C89391z> aVar) {
        this.onParallelTaskFinish = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onFinish(AbstractC72623d dVar, Object obj) {
        C89219l.m154721d(dVar, "");
        super.onFinish(dVar, obj);
        if (((dVar instanceof AbstractC72623d.C72626c) || (dVar instanceof AbstractC72623d.C72625b)) && C67327j.f150875b.mo106168b() > 0) {
            C84911q.m145921a("ParallelPublishCallback onFinish  success publishTask " + dVar.toString());
            if (C63244g.m114602a().mo73284l().isRecordingOrEditing()) {
                C67295g.m119228a("PublishParallel ParallelPublishCallback skip next task because of current activity is record or edit");
            } else {
                C67296h.m119234a();
            }
        }
        AbstractC89171a<C89391z> aVar = this.onParallelTaskFinish;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParallelPublishCallback(AbstractC89171a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : aVar);
    }
}

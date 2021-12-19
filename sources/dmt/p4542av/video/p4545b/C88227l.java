package dmt.p4542av.video.p4545b;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import java.util.concurrent.ScheduledExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: dmt.av.video.b.l */
public class C88227l extends AbstractC88181j {

    /* renamed from: H */
    public AbstractC89171a<? extends AbstractC88175e> f200249H;

    /* renamed from: I */
    private final AbstractC89244h f200250I = C89250i.m154773a((AbstractC89171a) new C88228a(this));

    static {
        Covode.recordClassIndex(104262);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC88175e mo142718a() {
        C88171b bVar = new C88171b();
        bVar.mo142716a(new C88180i(), -1);
        return bVar;
    }

    /* renamed from: dmt.av.video.b.l$a */
    static final class C88228a extends AbstractC89220m implements AbstractC89171a<AbstractC88175e> {

        /* renamed from: a */
        final /* synthetic */ C88227l f200251a;

        static {
            Covode.recordClassIndex(104263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C88228a(C88227l lVar) {
            super(0);
            this.f200251a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88175e invoke() {
            if (this.f200251a.f200249H == null) {
                return this.f200251a.mo142718a();
            }
            AbstractC89171a<? extends AbstractC88175e> aVar = this.f200251a.f200249H;
            if (aVar == null) {
                C89219l.m154715b();
            }
            return aVar.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88227l(C88238s sVar, ScheduledExecutorService scheduledExecutorService) {
        super(sVar, scheduledExecutorService);
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(scheduledExecutorService, "");
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final int mo142714a(Context context, AbstractC14088a aVar, SurfaceView surfaceView, AbstractC1204m mVar) {
        C89219l.m154721d(aVar, "");
        super.mo142714a(context, aVar, surfaceView, mVar);
        if (aVar.getVideoPaths() == null || aVar.getVideoPaths().length == 0 || !C89361p.m154876c(aVar.getVideoPaths()[0], "jpeg", false)) {
            mo142743c().mo56347d(1);
        } else {
            mo142743c().mo56347d(-1);
        }
        return mo142743c().mo56274a(((AbstractC88175e) this.f200250I.getValue()).mo142715a(aVar));
    }
}

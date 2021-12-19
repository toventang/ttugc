package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b */
public final class C72779b implements AbstractC72742a {

    /* renamed from: b */
    public final AbstractC72780a f163200b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b$a */
    public interface AbstractC72780a {
        static {
            Covode.recordClassIndex(85466);
        }

        /* renamed from: a */
        void mo115065a();

        /* renamed from: b */
        void mo115066b();
    }

    static {
        Covode.recordClassIndex(85465);
    }

    public C72779b(AbstractC72780a aVar) {
        C89219l.m154721d(aVar, "");
        this.f163200b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.b$b */
    static final class C72781b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C72779b f163201a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f163202b;

        static {
            Covode.recordClassIndex(85467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C72781b(C72779b bVar, AbstractC89172b bVar2) {
            super(1);
            this.f163201a = bVar;
            this.f163202b = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            this.f163201a.f163200b.mo115066b();
            AbstractC89172b bVar = this.f163202b;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(intValue));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.AbstractC72742a
    /* renamed from: a */
    public final void mo115040a(ASCameraView aSCameraView, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(aSCameraView, "");
        this.f163200b.mo115065a();
        aSCameraView.mo56914a(new C72781b(this, bVar));
    }
}

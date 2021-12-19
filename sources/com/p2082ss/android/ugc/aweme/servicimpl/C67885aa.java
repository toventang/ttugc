package com.p2082ss.android.ugc.aweme.servicimpl;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.AbstractC35372c;
import com.p2082ss.android.ugc.aweme.canvas.C35371b;
import com.p2082ss.android.ugc.aweme.canvas.C35376e;
import com.p2082ss.android.ugc.aweme.canvas.C35377f;
import com.p2082ss.android.ugc.aweme.canvas.C35379g;
import com.p2082ss.android.ugc.aweme.canvas.C35387i;
import com.p2082ss.android.ugc.aweme.canvas.C35413x;
import com.p2082ss.android.ugc.aweme.canvas.C35415y;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2338ar.C33932a;
import com.p2082ss.android.ugc.aweme.photo.C62866e;
import com.p2082ss.android.ugc.aweme.photo.C62869f;
import com.p2082ss.android.ugc.aweme.photo.C62887u;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.servicimpl.AbstractC67954z;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import dmt.p4542av.video.C88273h;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.aa */
public final class C67885aa extends C33932a {

    /* renamed from: a */
    public static final C67885aa f152061a = new C67885aa();

    private C67885aa() {
    }

    static {
        Covode.recordClassIndex(80054);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$b */
    public static final class C67887b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC67954z f152064a;

        static {
            Covode.recordClassIndex(80056);
        }

        C67887b(AbstractC67954z zVar) {
            this.f152064a = zVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((AbstractC67954z.C67955a) this.f152064a).f152242i.invoke(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$c */
    public static final class C67888c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC67954z.C67955a f152065a;

        static {
            Covode.recordClassIndex(80057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67888c(AbstractC67954z.C67955a aVar) {
            super(1);
            this.f152065a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f152065a.f152242i.invoke(Boolean.valueOf(bool.booleanValue()));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.servicimpl.aa$a */
    public static final class C67886a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C35387i f152062a;

        /* renamed from: b */
        final /* synthetic */ AbstractC67954z f152063b;

        static {
            Covode.recordClassIndex(80055);
        }

        C67886a(C35387i iVar, AbstractC67954z zVar) {
            this.f152062a = iVar;
            this.f152063b = zVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C35413x xVar = (C35413x) obj;
            this.f152062a.mo62288a();
            C89219l.m154716b(xVar, "");
            CanvasVideoData a = C35379g.m72408a(xVar, ((AbstractC67954z.C67955a) this.f152063b).f152236c);
            AbstractC67954z zVar = this.f152063b;
            C67885aa.m120151a((AbstractC67954z.C67955a) zVar, a, ((AbstractC67954z.C67955a) zVar).f152241h, null);
        }
    }

    /* renamed from: a */
    public static <RETURN_VALUE> RETURN_VALUE m120150a(AbstractC67954z<RETURN_VALUE> zVar) {
        AbstractC35372c bVar;
        C35377f fVar;
        C89219l.m154721d(zVar, "");
        AbstractC67954z.C67955a aVar = (AbstractC67954z.C67955a) zVar;
        ExtractFramesModel extractFramesModel = aVar.f152240g;
        if (extractFramesModel != null) {
            extractFramesModel.removeLastSegment();
            aVar.f152237d.mo110007a(extractFramesModel);
        }
        C89378p<Integer, Integer> b = C35376e.m72403b();
        int intValue = b.component1().intValue();
        int intValue2 = b.component2().intValue();
        String str = aVar.f152235b;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
            bVar = new C35415y();
        } else {
            bVar = new C35371b();
        }
        AbstractC35372c cVar = bVar;
        C35387i iVar = new C35387i(false);
        iVar.f83483a = System.currentTimeMillis();
        SingleImageCoverBitmapData singleImageCoverBitmapData = aVar.f152237d.f155786aT;
        Bitmap b2 = C88273h.m153393b(singleImageCoverBitmapData);
        if (b2 != null) {
            iVar.mo62288a();
            C35413x xVar = new C35413x();
            xVar.mo62320a(aVar.f152235b);
            xVar.mo62319a(cVar.mo62280a(b2));
            xVar.f83573c = C35379g.m72407a(intValue, intValue2, singleImageCoverBitmapData.getSrcWidth(), singleImageCoverBitmapData.getSrcHeight(), C88273h.m153392a(singleImageCoverBitmapData));
            m120151a(aVar, C35379g.m72408a(xVar, aVar.f152236c), aVar.f152241h, singleImageCoverBitmapData);
            return (RETURN_VALUE) C89391z.f203057a;
        }
        fVar.mo62282a(str, intValue, intValue2, !aVar.f152239f, new C35377f(cVar, false).f83459a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C67886a(iVar, zVar), new C67887b(zVar));
        return (RETURN_VALUE) C89391z.f203057a;
    }

    /* renamed from: a */
    static void m120151a(AbstractC67954z.C67955a aVar, CanvasVideoData canvasVideoData, MediaModel mediaModel, SingleImageCoverBitmapData singleImageCoverBitmapData) {
        new C62866e(new C62869f(new C62887u(aVar.f152234a, aVar.f152237d, !aVar.f152239f, aVar.f152238e, System.currentTimeMillis()), aVar.f152235b, mediaModel, singleImageCoverBitmapData, canvasVideoData, aVar.f152239f, new C67888c(aVar))).mo100837a();
    }
}

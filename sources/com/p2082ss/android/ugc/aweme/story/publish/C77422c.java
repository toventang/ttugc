package com.p2082ss.android.ugc.aweme.story.publish;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72606ah;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72690y;
import com.p2082ss.android.ugc.aweme.story.draft.C76726b;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p077b.C1731i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.c */
public final class C77422c extends AbstractC72639k {

    /* renamed from: a */
    public final CountDownLatch f173713a = new CountDownLatch(2);

    /* renamed from: b */
    public final Bundle f173714b;

    static {
        Covode.recordClassIndex(90453);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.c$a */
    static final class CallableC77423a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C77422c f173715a;

        /* renamed from: b */
        final /* synthetic */ C69831ai f173716b;

        static {
            Covode.recordClassIndex(90454);
        }

        CallableC77423a(C77422c cVar, C69831ai aiVar) {
            this.f173715a = cVar;
            this.f173716b = aiVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Serializable serializable = this.f173715a.f173714b.getSerializable("extra_video_publish_args");
            C43223c cVar = null;
            if (!(serializable instanceof VideoPublishEditModel)) {
                serializable = null;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
            if (videoPublishEditModel != null) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getVideoCacheService().mo93914a(videoPublishEditModel.getOutputFile().toString(), this.f173716b);
                C63253l.f143623a.mo73317m().mo70032a(this.f173716b, videoPublishEditModel, this.f173715a.f173713a);
                String str = videoPublishEditModel.sessionId;
                if (str != null) {
                    C89219l.m154716b(str, "");
                    cVar = C76726b.m134303a(str);
                    if (cVar != null) {
                        C76726b.m134308a(cVar);
                    }
                }
                C63253l.f143623a.mo73317m().mo70034b(this.f173716b, videoPublishEditModel, this.f173715a.f173713a);
                C63253l.f143623a.mo73317m().mo70033a(videoPublishEditModel, cVar, this.f173715a.f173713a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.c$b */
    static final class C77424b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f173717a;

        /* renamed from: b */
        final /* synthetic */ String f173718b;

        /* renamed from: c */
        final /* synthetic */ VideoPublishEditModel f173719c;

        static {
            Covode.recordClassIndex(90455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77424b(String str, VideoPublishEditModel videoPublishEditModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f173718b = str;
            this.f173719c = videoPublishEditModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C77424b(this.f173718b, this.f173719c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C77424b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.publish.c$b$a */
        public static final class C77425a extends AbstractC89220m implements AbstractC89172b<ContentValues, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C77424b f173720a;

            static {
                Covode.recordClassIndex(90456);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77425a(C77424b bVar) {
                super(1);
                this.f173720a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(ContentValues contentValues) {
                ContentValues contentValues2 = contentValues;
                C89219l.m154721d(contentValues2, "");
                contentValues2.put("last_output_path", this.f173720a.f173718b);
                return C89391z.f203057a;
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f173717a == 0) {
                C89382r.m154942a(obj);
                String str = this.f173718b;
                if (str == null || str.length() == 0 || !C84902i.m145892a(this.f173718b)) {
                    return C89391z.f203057a;
                }
                String str2 = this.f173719c.sessionId;
                if (str2 != null) {
                    C89219l.m154716b(str2, "");
                    C77425a aVar = new C77425a(this);
                    C89219l.m154721d(str2, "");
                    C89219l.m154721d(aVar, "");
                    if (C76726b.m134307a()) {
                        ContentValues contentValues = new ContentValues();
                        aVar.invoke(contentValues);
                        ((Boolean) C76726b.m134304a((Object) false, (AbstractC89171a) new C76726b.C76733g(contentValues, str2))).booleanValue();
                    }
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C77422c(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        this.f173714b = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onFinish(AbstractC72623d dVar, Object obj) {
        C89219l.m154721d(dVar, "");
        if (dVar instanceof AbstractC72623d.C72626c) {
            C1731i.m5640b(new CallableC77423a(this, ((AbstractC72623d.C72626c) dVar).f162806a), C40780g.m82241a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
    public final void onStageUpdate(String str, AbstractC72606ah ahVar, Object obj) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(ahVar, "");
        super.onStageUpdate(str, ahVar, obj);
        Serializable serializable = this.f173714b.getSerializable("extra_video_publish_args");
        if (!(serializable instanceof VideoPublishEditModel)) {
            serializable = null;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializable;
        if (videoPublishEditModel != null && TextUtils.equals(str, "STAGE_SYNTHETIC") && (ahVar instanceof AbstractC72606ah.C72607a)) {
            AbstractC72606ah.C72607a aVar = (AbstractC72606ah.C72607a) ahVar;
            if (aVar.f162763a instanceof AbstractC72690y.C72691a) {
                AbstractC72690y yVar = aVar.f162763a;
                Objects.requireNonNull(yVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C77424b(((AbstractC72690y.C72691a) yVar).f162966a.toString(), videoPublishEditModel, null), 3);
            }
        }
    }
}

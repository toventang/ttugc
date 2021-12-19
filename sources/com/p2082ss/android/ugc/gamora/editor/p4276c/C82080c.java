package com.p2082ss.android.ugc.gamora.editor.p4276c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.p2082ss.android.ugc.aweme.p2338ar.C33932a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.AbstractC72480e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a;
import com.p2082ss.android.ugc.gamora.editor.p4276c.AbstractC82074b;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.c.c */
public final class C82080c extends C33932a {

    /* renamed from: a */
    public static final C82080c f183661a = new C82080c();

    private C82080c() {
    }

    static {
        Covode.recordClassIndex(95904);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.c.c$b */
    public static final class C82082b extends AbstractC89220m implements AbstractC89172b<DraftSaveResult, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f183664a;

        /* renamed from: b */
        final /* synthetic */ AbstractC82074b f183665b;

        static {
            Covode.recordClassIndex(95906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82082b(VideoPublishEditModel videoPublishEditModel, AbstractC82074b bVar) {
            super(1);
            this.f183664a = videoPublishEditModel;
            this.f183665b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DraftSaveResult draftSaveResult) {
            C89219l.m154721d(draftSaveResult, "");
            ((AbstractC82074b.C82076b) this.f183665b).f183651c.invoke(C82080c.m142103a(this.f183664a), draftSaveResult);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.c.c$a */
    public static final class C82081a extends AbstractC89220m implements AbstractC89172b<C43223c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f183662a;

        /* renamed from: b */
        final /* synthetic */ AbstractC82074b f183663b;

        static {
            Covode.recordClassIndex(95905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82081a(VideoPublishEditModel videoPublishEditModel, AbstractC82074b bVar) {
            super(1);
            this.f183662a = videoPublishEditModel;
            this.f183663b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C43223c cVar) {
            C43223c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            String a = C82080c.m142103a(this.f183662a);
            cVar2.f100900W.f100843bp = new LighteningExtraInfo(a);
            C63244g.m114602a().mo73275c().mo101841a(cVar2, "update_scheduleId");
            ((AbstractC82074b.C82076b) this.f183663b).f183650b.invoke(a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m142103a(VideoPublishEditModel videoPublishEditModel) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", 0);
        AbstractC77267a n = C63244g.m114602a().mo73286n();
        C89219l.m154716b(bundle, "");
        return n.mo120436a(bundle, videoPublishEditModel, C82083c.f183666a);
    }

    /* renamed from: a */
    public static <RETURN_VALUE> RETURN_VALUE m142102a(AbstractC82074b<RETURN_VALUE> bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar instanceof AbstractC82074b.C82077c) {
            AbstractC82074b.C82077c cVar = (AbstractC82074b.C82077c) bVar;
            boolean z = cVar.f183652a;
            boolean z2 = cVar.f183653b;
            Activity activity = cVar.f183654c;
            Intent intent = cVar.f183655d;
            if (z) {
                C72724a.m128203a().mo62191a(activity, intent, 1002);
            } else if (z2) {
                C72724a.m128203a().mo62191a(activity, intent, 8);
            } else {
                C72724a.m128203a().mo62200b((Context) activity, intent);
            }
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (bVar instanceof AbstractC82074b.C82079e) {
            AbstractC82074b.C82079e eVar = (AbstractC82074b.C82079e) bVar;
            Activity activity2 = eVar.f183658a;
            VideoPublishEditModel videoPublishEditModel = eVar.f183660c;
            C72724a.m128203a().mo62199b(activity2, eVar.f183659b);
            C70005cr.m123611a().mo110456f();
            C70005cr.m123611a().mo110452a(videoPublishEditModel.challenges);
            if (C63244g.m114602a().mo73255A().mo93901a() || !videoPublishEditModel.mIsFromDraft) {
                activity2.finish();
            }
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (bVar instanceof AbstractC82074b.C82075a) {
            C63244g.m114602a().mo73276d().mo101829a();
            ((AbstractC82074b.C82075a) bVar).f183648a.finish();
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (bVar instanceof AbstractC82074b.C82078d) {
            AbstractC82074b.C82078d dVar = (AbstractC82074b.C82078d) bVar;
            Activity activity3 = dVar.f183656a;
            RetakeVideoContext retakeVideoContext = dVar.f183657b;
            Intent intent2 = new Intent();
            intent2.putExtra("retake_video", retakeVideoContext);
            intent2.putExtra("retake_shoot_mode", 1);
            C72724a.m128203a().mo62201c(activity3, intent2);
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (bVar instanceof AbstractC82074b.C82076b) {
            AbstractC72480e b = C72479d.m127867b(C72477c.f162474a);
            b.mo114742d();
            b.mo114739a("after_click_publish", true);
            b.mo114737a(1);
            VideoPublishEditModel videoPublishEditModel2 = ((AbstractC82074b.C82076b) bVar).f183649a;
            C63253l.f143623a.mo73316l().mo104773a(videoPublishEditModel2);
            C63253l.f143623a.mo73316l().mo104774a(videoPublishEditModel2, new C82081a(videoPublishEditModel2, bVar), new C82082b(videoPublishEditModel2, bVar));
            return (RETURN_VALUE) C89391z.f203057a;
        } else {
            throw new C89376n();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.c.c$c */
    public static final class C82083c extends AbstractC89220m implements AbstractC89187q<String, Object, Object, C89391z> {

        /* renamed from: a */
        public static final C82083c f183666a = new C82083c();

        static {
            Covode.recordClassIndex(95907);
        }

        C82083c() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(String str, Object obj, Object obj2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(obj, "");
            C72479d.m127867b(C72477c.f162474a).mo114743e();
            return C89391z.f203057a;
        }
    }
}

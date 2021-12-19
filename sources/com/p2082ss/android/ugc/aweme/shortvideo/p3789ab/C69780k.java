package com.p2082ss.android.ugc.aweme.shortvideo.p3789ab;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.draft.C43205e;
import com.p2082ss.android.ugc.aweme.draft.C43209h;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43234h;
import com.p2082ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.AbstractC69783m;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84879a;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.util.Calendar;
import java.util.TimeZone;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.k */
public final class C69780k {
    static {
        Covode.recordClassIndex(82186);
    }

    /* renamed from: a */
    public static final DraftCheckResult m123307a(AbstractC69783m.C69786c cVar) {
        return C43205e.m86157a(cVar.f155955a).mo73445a();
    }

    /* renamed from: a */
    public static final void m123309a(DraftSaveResult draftSaveResult) {
        C89219l.m154721d(draftSaveResult, "");
        if (!C63244g.m114602a().mo73255A().mo93901a()) {
            C63244g.m114602a().mo73275c().mo101847b().mo101855a(draftSaveResult);
            C63244g.m114602a().mo73275c().mo101843a().mo101860a(draftSaveResult);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ DraftSaveResult m123308a(C43223c cVar) {
        String str = "";
        C89219l.m154721d(cVar, str);
        String f = cVar.mo73676f();
        C89219l.m154716b(f, str);
        int a = C43234h.m86346a(cVar);
        int i = cVar.f100904d;
        long j = cVar.f100886I;
        if (j > 0) {
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            C89219l.m154716b(instance, str);
            instance.setTimeInMillis(j);
            str = DateFormat.format("yyyy-MM-dd hh:mm:ss a", instance).toString();
        }
        return new DraftSaveResult(f, a, i, str, C63244g.m114602a().mo73268N(), null, null, null, null, cVar.f100900W.f100827bG, 224, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ab.k$a */
    public static final class C69781a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super DraftSaveResult>, Object> {

        /* renamed from: a */
        int f155945a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69783m.C69786c f155946b;

        static {
            Covode.recordClassIndex(82187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69781a(AbstractC69783m.C69786c cVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f155946b = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C69781a(this.f155946b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super DraftSaveResult> dVar) {
            return ((C69781a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            AbstractC69768a gVar;
            if (this.f155945a == 0) {
                C89382r.m154942a(obj);
                C63244g.m114602a().mo73295w();
                DraftSaveResult a = C69780k.m123308a(this.f155946b.f155955a);
                try {
                    DraftCheckResult a2 = C69780k.m123307a(this.f155946b);
                    if (!a2.isSuc()) {
                        DraftSaveResult copy$default = DraftSaveResult.copy$default(a, null, 0, 0, null, 0, a2, null, null, null, false, 991, null);
                        C69780k.m123309a(copy$default);
                        return copy$default;
                    }
                    AbstractC69783m.C69786c cVar = this.f155946b;
                    C43223c cVar2 = cVar.f155955a;
                    VideoPublishEditModel videoPublishEditModel = cVar.f155957c;
                    if (cVar.f155956b == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C89219l.m154721d(cVar2, "");
                    C89219l.m154721d(videoPublishEditModel, "");
                    C89219l.m154721d(cVar2, "");
                    C89219l.m154721d(videoPublishEditModel, "");
                    if (videoPublishEditModel.mIsFromDraft) {
                        gVar = new C69772d(cVar2, videoPublishEditModel);
                    } else if (videoPublishEditModel.isFastImport) {
                        if (videoPublishEditModel.isMultiVideoEdit()) {
                            gVar = new C69774f(cVar2, videoPublishEditModel);
                        } else {
                            gVar = new C69771c(cVar2, videoPublishEditModel);
                        }
                    } else if (videoPublishEditModel.isMultiVideoEdit() && C69778i.m123303a()) {
                        gVar = new C69776h(cVar2, videoPublishEditModel, z);
                    } else if (videoPublishEditModel.isMultiVideoEdit() && !C69778i.m123303a()) {
                        gVar = new C69773e(cVar2, videoPublishEditModel, z);
                    } else if (videoPublishEditModel.isStitchMode()) {
                        gVar = new C69782l(cVar2, videoPublishEditModel, z);
                    } else {
                        gVar = new C69775g();
                    }
                    DraftFileSaveResult a3 = gVar.mo110127a();
                    if (a3.isSuc()) {
                        C43223c cVar3 = cVar.f155955a;
                        VideoPublishEditModel videoPublishEditModel2 = cVar.f155957c;
                        C89219l.m154721d(cVar3, "");
                        C89219l.m154721d(videoPublishEditModel2, "");
                        DraftFileSaveException draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
                        if (!videoPublishEditModel2.isDuet()) {
                            a3 = new DraftFileSaveResult(5, draftFileSaveException);
                        } else {
                            String duetVideoPath = videoPublishEditModel2.draftDuetExtraInfo.getDuetVideoPath();
                            String duetAudioPath = videoPublishEditModel2.draftDuetExtraInfo.getDuetAudioPath();
                            if (C84902i.m145892a(duetVideoPath) && C84902i.m145892a(duetAudioPath)) {
                                String str = C70638dj.f158103f + "duet/" + cVar3.mo73676f();
                                String str2 = str + '/' + new File(duetVideoPath).getName();
                                String str3 = str + '/' + new File(duetAudioPath).getName();
                                if (!C84902i.m145892a(str2)) {
                                    draftFileSaveException = C43209h.m86170a(duetVideoPath, str2, true);
                                    if (!draftFileSaveException.isSuc()) {
                                        a3 = new DraftFileSaveResult(5, draftFileSaveException);
                                    }
                                }
                                if (!C84902i.m145892a(str3)) {
                                    draftFileSaveException = C43209h.m86170a(duetAudioPath, str3, true);
                                    if (!draftFileSaveException.isSuc()) {
                                        a3 = new DraftFileSaveResult(5, draftFileSaveException);
                                    }
                                }
                                cVar3.mo73623a(DuetExtraInfo.copy$default(videoPublishEditModel2.draftDuetExtraInfo, str2, str3, 0, 0, null, 0, 60, null));
                            }
                            a3 = new DraftFileSaveResult(5, draftFileSaveException);
                        }
                        if (a3.isSuc()) {
                            VideoPublishEditModel videoPublishEditModel3 = cVar.f155957c;
                            C89219l.m154721d(videoPublishEditModel3, "");
                            if (videoPublishEditModel3.veAudioRecorderParam != null && videoPublishEditModel3.veAudioRecorderParam.hasRecord()) {
                                String audioUrl = videoPublishEditModel3.veAudioRecorderParam.getAudioUrl();
                                AudioRecorderParam audioRecorderParam = videoPublishEditModel3.veAudioRecorderParam;
                                C89219l.m154716b(audioRecorderParam, "");
                                if (!C89219l.m154714a((Object) audioUrl, (Object) C84879a.m145811a(audioRecorderParam))) {
                                    String audioUrl2 = videoPublishEditModel3.veAudioRecorderParam.getAudioUrl();
                                    AudioRecorderParam audioRecorderParam2 = videoPublishEditModel3.veAudioRecorderParam;
                                    C89219l.m154716b(audioRecorderParam2, "");
                                    C80720e.m139932c(audioUrl2, C84879a.m145811a(audioRecorderParam2));
                                }
                                C69779j.m123306b(cVar.f155957c);
                                C69779j.m123305a(cVar.f155957c);
                                C69779j.m123304a(cVar.f155955a, cVar.f155957c);
                            }
                            if (videoPublishEditModel3.veAudioRecorderParam != null && !TextUtils.isEmpty(videoPublishEditModel3.veAudioRecorderParam.getExtraUrl())) {
                                C80720e.m139931c(videoPublishEditModel3.veAudioRecorderParam.getExtraUrl());
                            }
                            C69779j.m123306b(cVar.f155957c);
                            C69779j.m123305a(cVar.f155957c);
                            C69779j.m123304a(cVar.f155955a, cVar.f155957c);
                        }
                    }
                    if (!a3.isSuc()) {
                        DraftSaveResult copy$default2 = DraftSaveResult.copy$default(a, null, 0, 0, null, 0, null, a3, null, null, false, 959, null);
                        C69780k.m123309a(copy$default2);
                        return copy$default2;
                    }
                    DraftCheckResult copy$default3 = DraftCheckResult.copy$default(C69780k.m123307a(this.f155946b), 0, null, null, 1, 7, null);
                    if (!copy$default3.isSuc()) {
                        DraftSaveResult copy$default4 = DraftSaveResult.copy$default(a, null, 0, 0, null, 0, copy$default3, null, null, null, false, 991, null);
                        C69780k.m123309a(copy$default4);
                        return copy$default4;
                    }
                    DraftDBSaveResult a4 = C63244g.m114602a().mo73275c().mo101842a(this.f155946b.f155955a);
                    if (!a4.isSuc()) {
                        DraftSaveResult copy$default5 = DraftSaveResult.copy$default(a, null, 0, 0, null, 0, null, null, a4, null, false, 895, null);
                        C69780k.m123309a(copy$default5);
                        return copy$default5;
                    }
                    C69780k.m123309a(a);
                    return a;
                } catch (Throwable th) {
                    C63244g.m114602a().mo73295w();
                    a = DraftSaveResult.copy$default(a, null, 0, 0, null, 0, null, null, null, th, false, 767, null);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}

package com.p2082ss.android.ugc.aweme.story.draft;

import android.content.ContentValues;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveException;
import com.p2082ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3789ab.C69780k;
import com.p2082ss.android.ugc.aweme.story.draft.C76726b;
import com.p2082ss.android.ugc.aweme.story.draft.p4026a.C76720a;
import com.p2082ss.android.ugc.aweme.story.draft.p4026a.C76722b;
import com.p2082ss.android.ugc.aweme.story.draft.p4026a.C76724c;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.draft.c */
public final class C76735c {

    /* renamed from: a */
    public static final C76735c f172242a = new C76735c();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.draft.c$a */
    public static final class C76736a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f172243a;

        /* renamed from: b */
        int f172244b;

        /* renamed from: c */
        final /* synthetic */ C76735c f172245c;

        static {
            Covode.recordClassIndex(89732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76736a(C76735c cVar, AbstractC89124d dVar) {
            super(dVar);
            this.f172245c = cVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f172243a = obj;
            this.f172244b |= Integer.MIN_VALUE;
            return this.f172245c.mo120446a(null, null, this);
        }
    }

    private C76735c() {
    }

    static {
        Covode.recordClassIndex(89731);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.draft.c$b */
    public static final class C76737b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f172246a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f172247b;

        /* renamed from: c */
        final /* synthetic */ StoryEditClipModel f172248c;

        static {
            Covode.recordClassIndex(89733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76737b(VideoPublishEditModel videoPublishEditModel, StoryEditClipModel storyEditClipModel, AbstractC89124d dVar) {
            super(2, dVar);
            this.f172247b = videoPublishEditModel;
            this.f172248c = storyEditClipModel;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C76737b(this.f172247b, this.f172248c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C76737b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            C76722b bVar;
            DraftFileSaveResult draftFileSaveResult;
            String b;
            boolean booleanValue;
            String str;
            if (this.f172246a == 0) {
                C89382r.m154942a(obj);
                VideoPublishEditModel videoPublishEditModel = this.f172247b;
                StoryEditClipModel storyEditClipModel = this.f172248c;
                new C70974bn("StoryDraftManger");
                C43223c b2 = C70974bn.m125291b(videoPublishEditModel);
                if (b2.f100887J <= 0) {
                    b2.f100887J = System.currentTimeMillis();
                }
                b2.f100886I = System.currentTimeMillis();
                C76726b.m134306a(b2, videoPublishEditModel.getFilterIndex());
                b2.f100906f = storyEditClipModel.getEditMusicModel().getCurrentMusic();
                String str2 = "";
                C89219l.m154716b(b2, str2);
                DraftSaveResult a = C69780k.m123308a(b2);
                VideoPublishEditModel videoPublishEditModel2 = this.f172247b;
                if (videoPublishEditModel2.canvasVideoData != null) {
                    bVar = new C76720a(videoPublishEditModel2, b2);
                } else if (videoPublishEditModel2.isUploadVideo()) {
                    bVar = new C76724c(videoPublishEditModel2, b2);
                } else {
                    bVar = null;
                }
                int i = 0;
                if (bVar == null || (draftFileSaveResult = bVar.mo110127a()) == null) {
                    draftFileSaveResult = new DraftFileSaveResult(0, null, 3, null);
                }
                DraftSaveResult copy$default = DraftSaveResult.copy$default(a, null, 0, 0, null, 0, null, draftFileSaveResult, null, null, false, 959, null);
                if (!draftFileSaveResult.isSuc()) {
                    StringBuilder append = new StringBuilder("StoryDraftManger:copy src error when saving draft,errorCode:").append(draftFileSaveResult.getSaveException().getErrorCode()).append(",msg:");
                    Throwable throwable = draftFileSaveResult.getSaveException().getThrowable();
                    if (throwable != null) {
                        str = throwable.getMessage();
                    } else {
                        str = null;
                    }
                    C84911q.m145921a(append.append(str).toString());
                    C63244g.m114602a().mo73275c().mo101843a().mo101860a(copy$default);
                    return C89391z.f203057a;
                }
                C89219l.m154721d(b2, str2);
                if (!C76726b.m134307a()) {
                    booleanValue = false;
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_draft_session_id", C43225d.m86324a(b2));
                    if (b2.f100902b == null) {
                        b = str2;
                    } else {
                        b = C63244g.m114602a().mo73261G().mo46674b(b2.f100902b);
                    }
                    contentValues.put("aweme", b);
                    contentValues.put("music_path", b2.f100908h);
                    contentValues.put("video_volume", Integer.valueOf(b2.f100910j));
                    contentValues.put("music_volume", Integer.valueOf(b2.f100911k));
                    if (b2.f100906f != null) {
                        str2 = C63244g.m114602a().mo73261G().mo46674b(b2.f100906f);
                    }
                    contentValues.put("music", str2);
                    contentValues.put("filter", Integer.valueOf(b2.f100913m));
                    contentValues.put("music_start", Integer.valueOf(b2.f100914n));
                    contentValues.put("time", Long.valueOf(b2.f100886I));
                    contentValues.put("save_time", Long.valueOf(b2.f100887J));
                    contentValues.put("origin", Integer.valueOf(b2.f100916p));
                    contentValues.put("user_id", b2.f100885H);
                    contentValues.put("segment_video", b2.f100888K);
                    contentValues.put("sticker_id", b2.f100892O);
                    contentValues.put("music_id", C43225d.m86329b(b2));
                    contentValues.put("effect_list", C43225d.m86332c(b2));
                    contentValues.put("camera_poi", Integer.valueOf(b2.f100922v));
                    contentValues.put("filter_label", b2.f100921u);
                    contentValues.put("is_private", Integer.valueOf(b2.f100881D));
                    contentValues.put("max_duration", Long.valueOf(b2.f100883F));
                    contentValues.put("custom_cover_start", Float.valueOf(b2.f100896S));
                    contentValues.put("draft_extras", C63244g.m114602a().mo73261G().mo46674b(b2.f100900W));
                    contentValues.put("last_output_path", b2.f100900W.f100826bF);
                    booleanValue = ((Boolean) C76726b.m134304a((Object) false, (AbstractC89171a) new C76726b.C76728b(contentValues))).booleanValue();
                }
                if (!booleanValue) {
                    i = -1000;
                }
                C63244g.m114602a().mo73275c().mo101843a().mo101860a(DraftSaveResult.copy$default(copy$default, null, 0, 0, null, 0, null, null, new DraftDBSaveResult(new DraftDBSaveException(i, null, 2, null)), null, false, 895, null));
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo120446a(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel r8, p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.p2082ss.android.ugc.aweme.story.draft.C76735c.C76736a
            if (r0 == 0) goto L_0x0045
            r5 = r9
            com.ss.android.ugc.aweme.story.draft.c$a r5 = (com.p2082ss.android.ugc.aweme.story.draft.C76735c.C76736a) r5
            int r0 = r5.f172244b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0045
            int r0 = r5.f172244b
            int r0 = r0 - r1
            r5.f172244b = r0
        L_0x0013:
            java.lang.Object r1 = r5.f172243a
            h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r5.f172244b
            r3 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 != r3) goto L_0x004b
            p4600h.C89382r.m154942a(r1)
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0026:
            p4600h.C89382r.m154942a(r1)
            boolean r0 = com.p2082ss.android.ugc.aweme.story.base.p4020a.C76607a.m134194a()
            if (r0 != 0) goto L_0x0034
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0034:
            kotlinx.coroutines.ah r2 = kotlinx.coroutines.C89546bf.f203267b
            com.ss.android.ugc.aweme.story.draft.c$b r1 = new com.ss.android.ugc.aweme.story.draft.c$b
            r0 = 0
            r1.<init>(r7, r8, r0)
            r5.f172244b = r3
            java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
            if (r0 != r4) goto L_0x0021
            return r4
        L_0x0045:
            com.ss.android.ugc.aweme.story.draft.c$a r5 = new com.ss.android.ugc.aweme.story.draft.c$a
            r5.<init>(r6, r9)
            goto L_0x0013
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.draft.C76735c.mo120446a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, h.c.d):java.lang.Object");
    }
}

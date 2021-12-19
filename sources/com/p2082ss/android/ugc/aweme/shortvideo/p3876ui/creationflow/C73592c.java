package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.p2338ar.C33932a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.property.C65474g;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69844av;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.C70641dm;
import com.p2082ss.android.ugc.aweme.shortvideo.C70650dt;
import com.p2082ss.android.ugc.aweme.shortvideo.C72700q;
import com.p2082ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.DuetContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.AbstractC73587b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74171f;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c */
public final class C73592c extends C33932a {
    static {
        Covode.recordClassIndex(86330);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c$a */
    public static final class C73593a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Activity f165409a;

        /* renamed from: b */
        final /* synthetic */ Intent f165410b;

        static {
            Covode.recordClassIndex(86331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73593a(Activity activity, Intent intent) {
            super(0);
            this.f165409a = activity;
            this.f165410b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C72724a.m128203a().mo62204e(this.f165409a, this.f165410b);
            this.f165409a.overridePendingTransition(0, 0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static boolean m129760a(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (arrayList == null) {
            return true;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            C89219l.m154716b(next, "");
            if (!next.isSupportRetake()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final <RETURN_VALUE> RETURN_VALUE mo116185a(AbstractC73587b<RETURN_VALUE> bVar) {
        List<MultiEditVideoSegmentRecordData> list;
        C89219l.m154721d(bVar, "");
        if (bVar instanceof AbstractC73587b.C73588a) {
            C73586a aVar = ((AbstractC73587b.C73588a) bVar).f165401a;
            Activity activity = aVar.f165392a;
            ShortVideoContext shortVideoContext = aVar.f165395d;
            Intent a = m129758a(aVar, shortVideoContext);
            if (C80510gr.f180108c && !C80510gr.f180106a) {
                C80510gr.f180108c = false;
                C80510gr.m139537b("record_success");
            }
            C73975b.C73976a.f166071a.step("av_video_edit", "startVideoEditActivity");
            if (shortVideoContext.f155797ag) {
                C72724a.m128203a().mo62204e(activity, a);
            } else if (shortVideoContext.f155763X == 15) {
                a.putExtra("extra_request_code", 12345);
                m129759a(activity, new C73593a(activity, a));
            } else {
                a.putExtra("extra_request_code", 12344);
                C72724a.m128203a().mo62204e(activity, a);
            }
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (bVar instanceof AbstractC73587b.C73589b) {
            AbstractC73587b.C73589b bVar2 = (AbstractC73587b.C73589b) bVar;
            ShortVideoContext shortVideoContext2 = bVar2.f165404c;
            Activity activity2 = bVar2.f165402a;
            Intent a2 = m129757a(bVar2.f165404c, bVar2.f165403b, bVar2.f165405d);
            Workspace workspace = shortVideoContext2.f155817b.f155652h;
            C89219l.m154716b(workspace, "");
            File a3 = workspace.mo110089a();
            C89219l.m154716b(a3, "");
            String absolutePath = a3.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            Workspace workspace2 = shortVideoContext2.f155817b.f155652h;
            C89219l.m154716b(workspace2, "");
            File b = workspace2.mo110091b();
            C89219l.m154716b(b, "");
            String absolutePath2 = b.getAbsolutePath();
            C89219l.m154716b(absolutePath2, "");
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = shortVideoContext2.mo110038n().f155735e;
            EditPreviewInfo a4 = C69844av.m123413a(shortVideoContext2, multiEditVideoStatusRecordData, absolutePath, absolutePath2);
            C89219l.m154716b(a4, "");
            a2.putExtra("extra_edit_preview_info", (Parcelable) a4);
            if (multiEditVideoStatusRecordData != null) {
                a2.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                if (!(multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
                    a2.putExtra("extra_video_count", list.size());
                }
            }
            C72724a.m128203a().mo62202c((Context) activity2, a2);
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (bVar instanceof AbstractC73587b.C73590c) {
            ((AbstractC73587b.C73590c) bVar).f165406a.finish();
            return (RETURN_VALUE) C89391z.f203057a;
        } else if (bVar instanceof AbstractC73587b.C73591d) {
            AbstractC73587b.C73591d dVar = (AbstractC73587b.C73591d) bVar;
            if (dVar.f165408b) {
                dVar.f165407a.setResult(-1);
            }
            dVar.f165407a.finish();
            return (RETURN_VALUE) C89391z.f203057a;
        } else {
            throw new C89376n();
        }
    }

    /* renamed from: a */
    private static void m129759a(Context context, AbstractC89171a<C89391z> aVar) {
        if (context instanceof AbstractC1204m) {
            AbstractC1204m mVar = (AbstractC1204m) context;
            AbstractC1196i lifecycle = mVar.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.RESUMED)) {
                aVar.invoke();
            } else {
                mVar.getLifecycle().mo4012a(new RecordStage$startActivitySafely$1(context, aVar));
            }
        } else {
            aVar.invoke();
        }
    }

    /* renamed from: a */
    public static Intent m129758a(C73586a aVar, ShortVideoContext shortVideoContext) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C70625d dVar = aVar.f165397f;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = aVar.f165398g;
        long j = aVar.f165394c;
        int i = aVar.f165396e;
        String str = aVar.f165399h;
        String str2 = aVar.f165400i;
        C74171f fVar = aVar.f165393b;
        C43213k.m86181a("RecordPageAction video path = ".concat(String.valueOf(str)));
        Intent a = m129757a(shortVideoContext, fVar, i);
        if (!(multiEditVideoStatusRecordData == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            a.putExtra("extra_video_count", list.size());
        }
        C40982q.m82522a("type_av_record_concat_time", new C69840ar().mo110188a("duration", Long.valueOf(System.currentTimeMillis() - j)).mo110189a(StringSet.type, "record").mo110185a("abParam", (Boolean) true).mo110191a());
        if (dVar != null) {
            a.putExtra("music_wave_data", dVar);
        }
        if (multiEditVideoStatusRecordData != null) {
            C70650dt j2 = shortVideoContext.f155817b.mo109898j();
            C89219l.m154716b(j2, "");
            if (shortVideoContext.f155817b.f155653i) {
                multiEditVideoStatusRecordData.editSegments = j2;
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
            } else {
                multiEditVideoStatusRecordData.originalSegments = j2;
                multiEditVideoStatusRecordData.isMultiEditRetake = false;
                multiEditVideoStatusRecordData.recordMusic = C70005cr.m123611a().f156482a;
                multiEditVideoStatusRecordData.originalMusicStart = shortVideoContext.f155817b.f155661q;
            }
            a.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
        }
        if (!TextUtils.isEmpty(shortVideoContext.f155821f)) {
            a.putExtra("share_id", shortVideoContext.f155821f);
        }
        if (!TextUtils.isEmpty(shortVideoContext.f155841z)) {
            a.putExtra("channel", shortVideoContext.f155841z);
        }
        EditPreviewInfo a2 = C69844av.m123413a(shortVideoContext, multiEditVideoStatusRecordData, str, str2);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.os.Parcelable");
        a.putExtra("extra_edit_preview_info", (Parcelable) a2);
        return a;
    }

    /* renamed from: a */
    private static Intent m129757a(ShortVideoContext shortVideoContext, C74171f fVar, int i) {
        boolean z;
        String contentType;
        Workspace workspace = shortVideoContext.f155817b.f155652h;
        C70650dt j = shortVideoContext.f155817b.mo109898j();
        Intent intent = new Intent();
        intent.putExtra("workspace", workspace);
        if (shortVideoContext.f155817b.mo109888a()) {
            intent.putExtra("music_start", shortVideoContext.f155817b.f155661q);
        }
        intent.putExtra("draft_from_shoot", shortVideoContext.f155832q);
        intent.putExtra("face_beauty", C65474g.m117201a());
        intent.putExtra("extra_publish_stage", shortVideoContext.f155806ap);
        intent.putExtra("filter_id", 0);
        intent.putExtra("selected_filter_id", "");
        intent.putExtra("extra_record_video_selected_filter_index", shortVideoContext.f155814ax);
        intent.putExtra("extra_record_video_selected_filter_intensity", shortVideoContext.f155815ay);
        boolean z2 = true;
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", true);
        intent.putExtra("video_segment", ShortVideoContext.m123166a((ArrayList<TimeSpeedModelExtension>) j));
        intent.putExtra("hard_encode", shortVideoContext.f155817b.f155649e);
        intent.putExtra("restore", shortVideoContext.f155817b.f155645a);
        intent.putExtra("camera", i);
        intent.putExtra("record_filter_names", shortVideoContext.f155817b.f155642G.f155724a.toString());
        intent.putExtra("record_filter_ids", shortVideoContext.f155817b.f155642G.f155725b.toString());
        intent.putExtra("record_filter_values", shortVideoContext.f155817b.f155642G.f155726c.toString());
        intent.putExtra("record_beauty_mob_param", (Parcelable) shortVideoContext.f155790aX);
        intent.putExtra("filter_lables", shortVideoContext.f155817b.f155642G.f155724a.toString());
        intent.putExtra("filter_ids", shortVideoContext.f155817b.f155642G.f155725b.toString());
        intent.putExtra("smooth_skin_labels", shortVideoContext.f155817b.f155642G.f155727d.toString());
        intent.putExtra("smooth_reshape_labels", shortVideoContext.f155817b.f155642G.f155728e.toString());
        intent.putExtra("smooth_tanning_labels", shortVideoContext.f155817b.f155642G.f155730g.toString());
        intent.putExtra("smooth_eyes_labels", shortVideoContext.f155817b.f155642G.f155729f.toString());
        intent.putExtra("extra_aweme_speed", RecordScene.getSpeedStringByModel(j));
        intent.putExtra("extra_av_camera_ids", RecordScene.getCameraIdsStringByModel(j));
        intent.putExtra("extra_beauty_type", shortVideoContext.f155817b.f155638C);
        intent.putParcelableArrayListExtra("extra_beauty_data", RecordScene.getBeautyMetadatas(j));
        intent.putExtra("extra_video_record_metadata", C80357ds.m139323a(shortVideoContext.f155817b.f155640E));
        intent.putExtra("extra_is_change_speed", RecordScene.isChangeSpeed(j));
        intent.putExtra("sticker_id", RecordScene.getStickerIdsByModel(j));
        intent.putExtra("sticker_info", RecordScene.getStickerInfo(j));
        intent.putExtra("first_sticker_music_ids", RecordScene.getFirstStickerMusicIds(j));
        intent.putExtra("shoot_way", shortVideoContext.f155831p);
        intent.putExtra("shoot_from", shortVideoContext.f155833r);
        intent.putExtra("creation_id", shortVideoContext.f155830o);
        C77816g.m135933a(intent, C72700q.m128167b(shortVideoContext), EnumC77814e.RECORD, EnumC77814e.EDIT);
        intent.putExtra("draft_to_edit_from", shortVideoContext.f155818c);
        intent.putExtra("draft_id", shortVideoContext.f155740A);
        intent.putExtra("new_draft_id", shortVideoContext.f155741B);
        intent.putExtra("max_duration", shortVideoContext.f155817b.f155646b);
        intent.putExtra("wav_form", shortVideoContext.f155819d);
        intent.putExtra("origin", 1);
        intent.putExtra("challenge", (Serializable) C69844av.m123416a(j, shortVideoContext.f155752M));
        intent.putExtra("tag_id", shortVideoContext.f155762W);
        intent.putExtra("video_title", shortVideoContext.f155745F);
        intent.putExtra("video_title_chain", shortVideoContext.f155746G);
        intent.putExtra("duet_from_duet_sticker", shortVideoContext.f155817b.f155659o.f155692n);
        intent.putExtra("duet_from_duet_button", shortVideoContext.f155785aS);
        intent.putExtra("disable_delete_title_chain", shortVideoContext.f155747H);
        List<AVTextExtraStruct> list = shortVideoContext.f155748I;
        if (!(list instanceof Serializable)) {
            list = null;
        }
        intent.putExtra("struct_list", (Serializable) list);
        intent.putExtra("is_rivate", shortVideoContext.f155749J);
        intent.putExtra("duet_from", shortVideoContext.f155817b.f155659o.f155680b);
        intent.putExtra("original_designer_uid_list", shortVideoContext.mo110031g());
        intent.putExtra("original_sticker_count", shortVideoContext.mo110030f());
        intent.putExtra("duet_author", shortVideoContext.f155776aJ);
        intent.putExtra("duet_hash_tag", shortVideoContext.f155817b.f155659o.f155679a);
        intent.putExtra("record_bgm_delay", shortVideoContext.f155774aH);
        intent.putExtra("edit_loudness_param", (Parcelable) shortVideoContext.f155807aq);
        if (shortVideoContext.f155817b.mo109889b()) {
            DuetContext duetContext = shortVideoContext.f155817b.f155659o;
            C89219l.m154716b(duetContext, "");
            String str = duetContext.f155681c;
            if (str == null) {
                C89219l.m154715b();
            }
            String str2 = duetContext.f155682d;
            if (str2 == null) {
                C89219l.m154715b();
            }
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) new DuetExtraInfo(str, str2, duetContext.f155686h, duetContext.f155687i, duetContext.f155693o, duetContext.f155694p));
        }
        intent.putExtra("shout_out_data", shortVideoContext.f155765Z);
        intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.f155766a);
        intent.putExtra("shoot_mode", shortVideoContext.f155763X);
        intent.putExtra("shooted_shoot_mode", shortVideoContext.f155764Y);
        intent.putExtra("duration_mode", shortVideoContext.f155817b.f155664t);
        intent.putExtra("record_mode", shortVideoContext.f155817b.f155665u);
        intent.putExtra("record_game_score", shortVideoContext.f155793ac);
        intent.putExtra("duet_green_srceen", shortVideoContext.f155754O);
        ReactionParams reactionParams = shortVideoContext.f155817b.f155660p.f155723a;
        if (!(reactionParams instanceof Parcelable)) {
            reactionParams = null;
        }
        intent.putExtra("reaction_params", (Parcelable) reactionParams);
        if (!shortVideoContext.f155817b.f155656l || shortVideoContext.f155817b.f155665u == 1) {
            z = false;
        } else {
            z = true;
        }
        intent.putExtra("is_muted", z);
        intent.putExtra("music_origin", shortVideoContext.f155823h);
        intent.putExtra("extract_model", shortVideoContext.f155817b.f155667w);
        intent.putExtra("micro_app_info", shortVideoContext.f155796af);
        intent.putExtra("enter_record_from_other_platform", shortVideoContext.f155797ag);
        if (shortVideoContext.f155796af != null) {
            z2 = false;
        }
        intent.putExtra("back_to_main_after_publish", z2);
        intent.putExtra("extra_import_compile_cost_time", fVar.f166569a.f166733a - fVar.f166569a.f166734b);
        intent.putExtra("extra_start_enter_edit_page", fVar.f166569a.f166734b);
        intent.putExtra("extra_start_enter_edit_reason", fVar.f166569a.f166735c);
        C69844av.m123420b(shortVideoContext);
        if (!C84904k.m145909a(shortVideoContext.f155805ao)) {
            intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.f155805ao);
        }
        if (!C84904k.m145909a(shortVideoContext.f155808ar)) {
            intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.f155808ar);
        }
        if (!C84904k.m145909a(shortVideoContext.f155812av)) {
            intent.putIntegerArrayListExtra("extra_countdown_mode", shortVideoContext.f155812av);
        }
        AVETParameter j2 = shortVideoContext.mo110034j();
        if (j2 != null) {
            if (C89219l.m154714a((Object) j2.getContentType(), (Object) "photo_canvas")) {
                contentType = "video";
            } else {
                contentType = j2.getContentType();
            }
            j2.setContentType(contentType);
        } else {
            j2 = null;
        }
        intent.putExtra("av_et_parameter", j2);
        if (shortVideoContext.f155802al != null) {
            intent.putExtra("extra_mention_user_model", shortVideoContext.f155802al);
        }
        intent.putExtra("enter_from", shortVideoContext.f155837v);
        intent.putExtra("send_to_user_head", shortVideoContext.f155803am);
        if (shortVideoContext.f155810at != null) {
            DraftEditTransferModel draftEditTransferModel = shortVideoContext.f155810at;
            Objects.requireNonNull(draftEditTransferModel, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        if (shortVideoContext.f155817b.f155658n != null) {
            ClientCherEffectParam clientCherEffectParam = shortVideoContext.f155817b.f155658n;
            Objects.requireNonNull(clientCherEffectParam, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
        }
        StringBuilder sb = new StringBuilder();
        if (!C84904k.m145909a(shortVideoContext.f155767aA)) {
            Iterator<String> it = shortVideoContext.f155767aA.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(",");
                }
                sb.append(next);
            }
        }
        intent.putExtra("picture_source", sb.toString());
        intent.putExtra("contain_backgroundvideo", shortVideoContext.mo110036l());
        shortVideoContext.f155816az = 0;
        intent.putExtra("use_music_before_edit", shortVideoContext.f155817b.mo109888a());
        intent.putExtra("support_retake", m129760a(j));
        intent.putExtra("extra_duet_layout", shortVideoContext.f155817b.f155659o.f155688j);
        intent.putExtra("extra_success_enable_aec", shortVideoContext.f155817b.f155659o.f155685g);
        intent.putExtra("comment_video_model", shortVideoContext.f155825j);
        intent.putExtra("question_answer_video_model", shortVideoContext.f155826k);
        intent.putExtra("auto_selected_anchor", shortVideoContext.f155787aU);
        intent.putExtra("open_platform_client_key", shortVideoContext.f155789aW);
        intent.putExtra("open_platform_extra", shortVideoContext.f155788aV);
        intent.putStringArrayListExtra("extra_camera_lens_info", RecordScene.getCameraLensInfoList(j));
        if (shortVideoContext.mo110022c()) {
            StitchParams stitchParams = shortVideoContext.f155743D.f155846a;
            if (!(stitchParams instanceof Parcelable)) {
                stitchParams = null;
            }
            intent.putExtra("stitch_params", (Parcelable) stitchParams);
            StitchParams stitchParams2 = shortVideoContext.f155743D.f155846a;
            if (!(stitchParams2 == null || stitchParams2.getMusic() == null)) {
                long j3 = (long) shortVideoContext.f155817b.f155661q;
                StitchParams stitchParams3 = shortVideoContext.f155743D.f155846a;
                if (stitchParams3 == null) {
                    C89219l.m154715b();
                }
                intent.putExtra("music_start", (int) Math.max(0L, j3 - stitchParams3.getDuration()));
            }
        }
        SharedARModel sharedARModel = shortVideoContext.f155756Q;
        if (sharedARModel != null) {
            Objects.requireNonNull(sharedARModel, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_shared_ar_effect", (Parcelable) sharedARModel);
        }
        if (C84904k.m145910b(j)) {
            intent.putParcelableArrayListExtra("green_screen_material_list", RecordScene.getGreenScreenMaterials(j));
        }
        intent.putExtra("draft_music_legal_param", shortVideoContext.f155755P);
        intent.putExtra("from_prop_id", shortVideoContext.f155761V);
        Boolean isDefaultProp = RecordScene.isDefaultProp(shortVideoContext.f155817b.f155650f, shortVideoContext.f155761V);
        C89219l.m154716b(isDefaultProp, "");
        intent.putExtra("is_default_prop", isDefaultProp.booleanValue());
        intent.putExtra("extra_audio_aec_delay_time", shortVideoContext.f155773aG);
        intent.putExtra("extra_current_zoom_value", shortVideoContext.f155779aM);
        intent.putExtra("enter_method", shortVideoContext.f155838w);
        C70641dm.m124845a(intent, shortVideoContext);
        return intent;
    }
}

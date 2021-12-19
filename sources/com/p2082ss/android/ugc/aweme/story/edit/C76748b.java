package com.p2082ss.android.ugc.aweme.story.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62856b;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.text.C75898d;
import com.p2082ss.android.ugc.aweme.story.base.model.ETParams;
import com.p2082ss.android.ugc.aweme.story.base.model.EditContext;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.p2082ss.android.ugc.aweme.tools.C78609k;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.b */
public final class C76748b {
    static {
        Covode.recordClassIndex(89744);
    }

    /* renamed from: b */
    static final String m134345b(StoryEditModel storyEditModel) {
        if (storyEditModel.getOrigin() == 0) {
            return "upload";
        }
        return "shoot";
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b$c */
    public static final class C76751c extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ long f172264a;

        /* renamed from: b */
        final /* synthetic */ long f172265b;

        static {
            Covode.recordClassIndex(89747);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76751c(long j, long j2) {
            super(1);
            this.f172264a = j;
            this.f172265b = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo129404a("first_frame_duration", this.f172264a);
            bVar2.mo129404a("compile_time", this.f172265b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b$d */
    public static final class C76752d extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f172266a;

        /* renamed from: b */
        final /* synthetic */ String f172267b;

        static {
            Covode.recordClassIndex(89748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76752d(String str, String str2) {
            super(1);
            this.f172266a = str;
            this.f172267b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo129406a("effect_name", this.f172266a);
            bVar2.mo129406a("effect_id", this.f172267b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b$e */
    public static final class C76753e extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f172268a;

        static {
            Covode.recordClassIndex(89749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76753e(boolean z) {
            super(1);
            this.f172268a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            String str;
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (this.f172268a) {
                str = "mute";
            } else {
                str = "unmute";
            }
            bVar2.mo129406a("to_status", str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b$a */
    public static final class C76749a extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryEditModel f172261a;

        /* renamed from: b */
        final /* synthetic */ boolean f172262b;

        static {
            Covode.recordClassIndex(89745);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76749a(StoryEditModel storyEditModel, boolean z) {
            super(1);
            this.f172261a = storyEditModel;
            this.f172262b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            String str;
            ETParams etParams;
            ETParams etParams2;
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            EditContext editContext = this.f172261a.getEditContext();
            String str2 = null;
            if (editContext == null || (etParams2 = editContext.getEtParams()) == null) {
                str = null;
            } else {
                str = etParams2.getEnterMethod();
            }
            bVar2.mo129406a("shoot_enter_method", str);
            EditContext editContext2 = this.f172261a.getEditContext();
            if (!(editContext2 == null || (etParams = editContext2.getEtParams()) == null)) {
                str2 = etParams.getRecordWay();
            }
            bVar2.mo129406a("record_way", str2);
            bVar2.mo129403a("is_in_tab", this.f172262b ? 1 : 0);
            C76748b.m134343a(bVar2, this.f172261a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    static final String m134341a(StoryEditModel storyEditModel) {
        boolean z;
        List<StoryEditClipModel> clips = storyEditModel.getClips();
        boolean z2 = false;
        if (!(clips instanceof Collection) || !clips.isEmpty()) {
            Iterator<T> it = clips.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getSourceContentType() != 1) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        List<StoryEditClipModel> clips2 = storyEditModel.getClips();
        if (!(clips2 instanceof Collection) || !clips2.isEmpty()) {
            Iterator<T> it2 = clips2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().getSourceContentType() != 2) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = true;
        if (z) {
            return "video";
        }
        if (!z2) {
            return "multi";
        }
        return UGCMonitor.TYPE_PHOTO;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b$b */
    static final class C76750b extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryEditModel f172263a;

        static {
            Covode.recordClassIndex(89746);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76750b(StoryEditModel storyEditModel) {
            super(1);
            this.f172263a = storyEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            String str;
            String str2;
            String str3;
            String str4;
            int i;
            String str5;
            String str6;
            ETParams etParams;
            ETParams etParams2;
            StickerInfo stickerInfo;
            StickerInfo stickerInfo2;
            EditPreviewInfo previewMediaInfo;
            List<EditVideoSegment> videoList;
            EditVideoSegment editVideoSegment;
            VideoFileInfo videoFileInfo;
            String g;
            ETParams etParams3;
            C84425b bVar2 = bVar;
            String str7 = "";
            C89219l.m154721d(bVar2, str7);
            bVar2.mo129406a("shoot_entrance", "story");
            EditContext editContext = this.f172263a.getEditContext();
            Float f = null;
            if (editContext == null || (etParams3 = editContext.getEtParams()) == null) {
                str = null;
            } else {
                str = etParams3.getRecordWay();
            }
            bVar2.mo129406a("record_way", str);
            if (C65357b.m117043a()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            bVar2.mo129406a("is_hardcode", str2);
            bVar2.mo129406a("bite_rate", String.valueOf(C65357b.m117047c()));
            EditContext editContext2 = this.f172263a.getEditContext();
            if (editContext2 == null || (str3 = editContext2.getStickers()) == null) {
                str3 = str7;
            }
            bVar2.mo129406a("prop_list", str3);
            EditContext editContext3 = this.f172263a.getEditContext();
            if (editContext3 == null || (str4 = editContext3.getStickers()) == null) {
                str4 = str7;
            }
            bVar2.mo129406a("prop_id", str4);
            StoryEditModel storyEditModel = this.f172263a;
            C89219l.m154721d(storyEditModel, str7);
            StoryEditClipModel storyEditClipModel = (StoryEditClipModel) C89070n.m154583g((List) storyEditModel.getClips());
            if (!(storyEditClipModel == null || (g = C77148a.m134762g(storyEditClipModel)) == null)) {
                str7 = g;
            }
            bVar2.mo129406a("resolution", str7);
            bVar2.mo129403a("video_quality", C65357b.m117048d());
            StoryEditClipModel storyEditClipModel2 = (StoryEditClipModel) C89070n.m154583g((List) this.f172263a.getClips());
            if (storyEditClipModel2 == null || (previewMediaInfo = storyEditClipModel2.getPreviewMediaInfo()) == null || (videoList = previewMediaInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) C89070n.m154583g((List) videoList)) == null || (videoFileInfo = editVideoSegment.getVideoFileInfo()) == null) {
                i = 0;
            } else {
                i = videoFileInfo.getBitrate();
            }
            bVar2.mo129403a("file_bitrate", i);
            EditContext editContext4 = this.f172263a.getEditContext();
            if (editContext4 != null) {
                str5 = editContext4.isWestWindowExist();
            } else {
                str5 = null;
            }
            bVar2.mo129406a("is_westwindow_exist", str5);
            EditContext editContext5 = this.f172263a.getEditContext();
            if (!(editContext5 == null || (stickerInfo2 = editContext5.getStickerInfo()) == null || !stickerInfo2.hasTabOrder())) {
                bVar2.mo129406a("prop_tab_order", stickerInfo2.getTabOrder());
            }
            EditContext editContext6 = this.f172263a.getEditContext();
            if (!(editContext6 == null || (stickerInfo = editContext6.getStickerInfo()) == null || !stickerInfo.hasImprPosition())) {
                bVar2.mo129406a("prop_impr_position", stickerInfo.getImprPosition());
            }
            EditContext editContext7 = this.f172263a.getEditContext();
            if (editContext7 == null || (etParams2 = editContext7.getEtParams()) == null) {
                str6 = null;
            } else {
                str6 = etParams2.getEnterMethod();
            }
            bVar2.mo129406a("shoot_enter_method", str6);
            EditContext editContext8 = this.f172263a.getEditContext();
            if (!(editContext8 == null || (etParams = editContext8.getEtParams()) == null)) {
                f = Float.valueOf(etParams.getZoom());
            }
            bVar2.mo129405a("zoom_value", f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.b$f */
    static final class C76754f extends AbstractC89220m implements AbstractC89172b<C84425b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryEditClipModel f172269a;

        /* renamed from: b */
        final /* synthetic */ StoryEditModel f172270b;

        /* renamed from: c */
        final /* synthetic */ int f172271c;

        /* renamed from: d */
        final /* synthetic */ VideoPublishEditModel f172272d;

        static {
            Covode.recordClassIndex(89750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76754f(StoryEditClipModel storyEditClipModel, StoryEditModel storyEditModel, int i, VideoPublishEditModel videoPublishEditModel) {
            super(1);
            this.f172269a = storyEditClipModel;
            this.f172270b = storyEditModel;
            this.f172271c = i;
            this.f172272d = videoPublishEditModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C84425b bVar) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            int i;
            StickerInfo stickerInfo;
            ETParams etParams;
            InfoStickerModel infoStickerModel;
            List<StickerItemModel> list;
            ETParams etParams2;
            ETParams etParams3;
            C84425b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (this.f172269a.getSourceContentType() == 2) {
                str = UGCMonitor.TYPE_PHOTO;
            } else {
                str = "video";
            }
            bVar2.mo129406a("content_type", str);
            bVar2.mo129406a("enter_from", "video_edit_page");
            EditContext editContext = this.f172270b.getEditContext();
            Object obj = null;
            if (editContext == null || (etParams3 = editContext.getEtParams()) == null) {
                str2 = null;
            } else {
                str2 = etParams3.getRecordWay();
            }
            bVar2.mo129406a("record_way", str2);
            bVar2.mo129403a("clip_index", this.f172271c);
            bVar2.mo129406a("filter_list", this.f172269a.getMCurFilterLabels());
            bVar2.mo129406a("filter_id_list", VideoPublishEditModel.translateNullFilter(this.f172269a.getMCurFilterIds()));
            if (C65357b.m117043a()) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            bVar2.mo129406a("is_hardcode", str3);
            bVar2.mo129406a("bite_rate", String.valueOf(C65357b.m117047c()));
            bVar2.mo129403a("video_quality", C65357b.m117048d());
            bVar2.mo129406a("resolution", C77148a.m134762g(this.f172269a));
            bVar2.mo129406a("music_id", this.f172269a.getEditMusicModel().getMusicId());
            bVar2.mo129406a("privacy_status", C62856b.m113271a(0));
            bVar2.mo129405a("effect_list", this.f172269a.getEffectList());
            bVar2.mo129406a("info_sticker_list", this.f172272d.getInfoStickerList());
            EditContext editContext2 = this.f172270b.getEditContext();
            if (editContext2 == null || (etParams2 = editContext2.getEtParams()) == null) {
                str4 = null;
            } else {
                str4 = etParams2.getEnterMethod();
            }
            bVar2.mo129406a("shoot_enter_method", str4);
            EditContext editContext3 = this.f172270b.getEditContext();
            if (editContext3 != null) {
                str5 = editContext3.isWestWindowExist();
            } else {
                str5 = null;
            }
            bVar2.mo129406a("is_westwindow_exist", str5);
            bVar2.mo129406a("last_group_id", C70747dv.f158358b);
            bVar2.mo129406a("last_gid_from", C70747dv.f158359c);
            bVar2.mo129406a("music_selected_from", this.f172269a.getEditMusicModel().getMusicOrigin());
            EditContext editContext4 = this.f172270b.getEditContext();
            if (editContext4 != null) {
                str6 = editContext4.getStickers();
            } else {
                str6 = null;
            }
            bVar2.mo129406a("prop_list", str6);
            EditContext editContext5 = this.f172270b.getEditContext();
            if (editContext5 != null) {
                str7 = editContext5.getStickers();
            } else {
                str7 = null;
            }
            bVar2.mo129406a("prop_id", str7);
            bVar2.mo129406a("infosticker_from", this.f172272d.getInfoStickerFrom());
            StoryEditClipModel storyEditClipModel = this.f172269a;
            C89219l.m154721d(storyEditClipModel, "");
            if (C77148a.m134763h(storyEditClipModel) && (infoStickerModel = storyEditClipModel.getInfoStickerModel()) != null && (list = infoStickerModel.stickers) != null && (!(list instanceof Collection) || !list.isEmpty())) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    C89219l.m154716b(next, "");
                    if (next.isTextSticker()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            bVar2.mo129403a("text_added", i);
            bVar2.mo129403a("creation_duration", this.f172269a.getPreviewMediaInfo().getPreviewVideoLength());
            EditContext editContext6 = this.f172270b.getEditContext();
            if (!(editContext6 == null || (etParams = editContext6.getEtParams()) == null)) {
                obj = Float.valueOf(etParams.getZoom());
            }
            bVar2.mo129405a("zoom_value", obj);
            EditContext editContext7 = this.f172270b.getEditContext();
            if (!(editContext7 == null || (stickerInfo = editContext7.getStickerInfo()) == null || stickerInfo.getRecId().length() <= 0)) {
                bVar2.mo129406a("prop_rec_id", this.f172270b.getEditContext().getStickerInfo().getRecId());
            }
            InfoStickerModel infoStickerModel2 = this.f172269a.getInfoStickerModel();
            if (infoStickerModel2 != null) {
                boolean[] a = C78609k.m137209a(infoStickerModel2);
                bVar2.mo129403a("is_diy_prop", a[0] ? 1 : 0);
                bVar2.mo129403a("remove_background", a[1] ? 1 : 0);
            }
            if (this.f172272d.mMusicShowRank > 0) {
                bVar2.mo129403a("music_show_rank", this.f172272d.mMusicShowRank);
            }
            List<TextStickerTextWrap> a2 = C75898d.m133085a(this.f172272d);
            if (C46110t.m88972h(a2)) {
                bVar2.mo129406a("text_added", "1");
            }
            if (C46110t.m88971g(a2)) {
                bVar2.mo129406a("anchor_selected_from", "video_edit_page");
                bVar2.mo129406a("anchor_type", "wiki");
            }
            if (C75898d.m133086a((BaseShortVideoContext) this.f172272d)) {
                bVar2.mo129406a("anchor_selected_from", "video_post_page");
                bVar2.mo129406a("anchor_type", "wiki");
            }
            C76748b.m134343a(bVar2, this.f172270b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m134343a(C84425b bVar, StoryEditModel storyEditModel) {
        EditContext editContext = storyEditModel.getEditContext();
        if (editContext != null) {
            long shootTimestamp = editContext.getShootTimestamp();
            if (shootTimestamp > 0) {
                bVar.mo129404a("shoot_publish_duration", System.currentTimeMillis() - shootTimestamp);
            }
        }
    }

    /* renamed from: a */
    public static final void m134344a(String str, StoryEditModel storyEditModel, AbstractC89172b<? super C84425b, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(storyEditModel, "");
        C89219l.m154721d(bVar, "");
        C84425b a = new C84425b().mo129406a("shoot_page", "story_shoot_page").mo129406a("shoot_tab_name", "story").mo129406a("creation_id", storyEditModel.getCreationId()).mo129406a("shoot_way", storyEditModel.getShootWay()).mo129406a("content_type", m134341a(storyEditModel)).mo129406a("content_source", m134345b(storyEditModel)).mo129403a("is_multi_content", storyEditModel.isMultiContent() ? 1 : 0).mo129406a("enter_from", "video_edit_page").mo129403a("clips_cnt", storyEditModel.getClips().size()).mo129403a("is_story", 1);
        C89219l.m154716b(a, "");
        bVar.invoke(a);
        C39162r.m79460a(str, a.f188764a);
    }

    /* renamed from: a */
    public static final void m134342a(StoryEditModel storyEditModel, StoryEditClipModel storyEditClipModel, VideoPublishEditModel videoPublishEditModel, int i) {
        C89219l.m154721d(storyEditModel, "");
        C89219l.m154721d(storyEditClipModel, "");
        C89219l.m154721d(videoPublishEditModel, "");
        m134344a("publish", storyEditModel, new C76754f(storyEditClipModel, storyEditModel, i, videoPublishEditModel));
    }
}

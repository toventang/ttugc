package com.p2082ss.android.ugc.aweme.photo;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69844av;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70080k;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.photo.t */
public final class C62885t {

    /* renamed from: a */
    public static final C62886a f142612a = new C62886a((byte) 0);

    static {
        Covode.recordClassIndex(73717);
    }

    /* renamed from: com.ss.android.ugc.aweme.photo.t$a */
    public static final class C62886a {
        static {
            Covode.recordClassIndex(73718);
        }

        private C62886a() {
        }

        public /* synthetic */ C62886a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static Intent m113287a(C62887u uVar) {
        String str;
        String str2;
        String str3;
        C89219l.m154721d(uVar, "");
        ShortVideoContext shortVideoContext = uVar.f142620h;
        C69844av.m123417a(uVar.f142619g, shortVideoContext);
        Intent intent = new Intent();
        if (shortVideoContext.f155840y != null) {
            intent.putExtra("extra_share_context", shortVideoContext.f155840y);
        }
        intent.putExtra("av_et_parameter", shortVideoContext.mo110034j());
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        List list = a.f156485d;
        if (list == null) {
            list = new ArrayList();
        }
        List<AVChallenge> list2 = uVar.f142613a;
        if (list2 != null && !list2.isEmpty()) {
            list.addAll(uVar.f142613a);
        }
        intent.putExtra("challenge", (Serializable) list);
        if (TextUtils.equals(shortVideoContext.f155837v, "open_platform_share") && shortVideoContext.f155840y != null) {
            intent.putExtra("extra_share_context", shortVideoContext.f155840y);
            ArrayList arrayList = shortVideoContext.f155840y.mHashTags;
            if (arrayList != null && (!arrayList.isEmpty())) {
                Iterator it = shortVideoContext.f155840y.mHashTags.iterator();
                while (it.hasNext()) {
                    AVChallenge aVChallenge = new AVChallenge();
                    aVChallenge.challengeName = (String) it.next();
                    list.add(aVChallenge);
                }
            }
        }
        intent.putExtra("voice_volume", 0.0f);
        intent.putExtra("extract_model", shortVideoContext.f155817b.f155667w);
        intent.putExtra("shoot_way", shortVideoContext.f155831p);
        intent.putExtra("creation_id", shortVideoContext.f155830o);
        intent.putExtra("shoot_mode", shortVideoContext.f155763X);
        intent.putExtra("draft_id", shortVideoContext.f155740A);
        intent.putExtra("new_draft_id", shortVideoContext.f155741B);
        intent.putExtra("origin", uVar.f142621i ? 1 : 0);
        intent.putExtra("content_type", "slideshow");
        if (uVar.f142621i) {
            str = "shoot";
        } else {
            str = "upload";
        }
        intent.putExtra("content_source", str);
        intent.putExtra("tag_id", shortVideoContext.f155762W);
        intent.putExtra("shout_out_data", shortVideoContext.f155765Z);
        intent.putExtra("share_id", shortVideoContext.f155821f);
        intent.putExtra("channel", shortVideoContext.f155841z);
        intent.putExtra("comment_video_model", shortVideoContext.f155825j);
        intent.putExtra("question_answer_video_model", shortVideoContext.f155826k);
        intent.putExtra("extra_start_enter_edit_page", uVar.f142624l);
        intent.putExtra("use_music_before_edit", true);
        FaceStickerBean faceStickerBean = uVar.f142623k;
        if (faceStickerBean != null && (!C89219l.m154714a(faceStickerBean, FaceStickerBean.NONE))) {
            intent.putExtra("sticker_id", String.valueOf(faceStickerBean.getStickerId()));
        }
        String str4 = uVar.f142615c;
        MusicModel musicModel = uVar.f142614b;
        if (!(str4 == null || musicModel == null)) {
            intent.putExtra("path", uVar.f142615c);
            intent.putExtra("music_model", uVar.f142614b);
            if (uVar.f142616d) {
                str3 = shortVideoContext.f155823h;
            } else {
                str3 = "slideshow_rec";
            }
            intent.putExtra("music_origin", str3);
            intent.putExtra("first_sticker_music_ids", new C27910f().mo46674b(C89070n.m154516a(musicModel.getMusicId())));
            intent.putExtra("id", musicModel.getMusicId());
            if (!uVar.f142621i) {
                intent.putExtra("is_photo_mv_music", shortVideoContext.f155753N);
            }
            intent.putExtra("preset_music_source", !uVar.f142616d ? 1 : 0);
            intent.putExtra("need_clean_music_when_back", !uVar.f142616d);
        }
        intent.putExtra("workspace", shortVideoContext.f155817b.f155652h);
        if (shortVideoContext.f155796af != null || CommentUtils.isDataValid(shortVideoContext.f155825j)) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            C70080k.m123730a(shortVideoContext.f155796af, sb, arrayList2);
            intent.putExtra("struct_list", arrayList2);
            shortVideoContext.f155745F = sb.toString();
            intent.putExtra("video_title", shortVideoContext.f155745F);
            intent.putExtra("video_title_chain", shortVideoContext.f155745F);
            intent.putExtra("disable_delete_title_chain", true);
        }
        intent.putExtra("commerce_data_in_tools_line", shortVideoContext.f155794ad.f155707c);
        intent.putExtra("extra_request_code", 12346);
        intent.putExtra("enter_from", shortVideoContext.f155837v);
        intent.putExtra("is_rivate", shortVideoContext.f155749J);
        intent.putExtra("micro_app_info", shortVideoContext.f155796af);
        intent.putExtra("enter_method", shortVideoContext.f155838w);
        boolean z = uVar.f142621i;
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(intent, "");
        if (z) {
            if (!C84904k.m145909a(shortVideoContext.f155805ao)) {
                intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.f155805ao);
            }
            if (!C84904k.m145909a(shortVideoContext.f155808ar)) {
                intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.f155808ar);
            }
        }
        String str5 = shortVideoContext.f155830o;
        if (str5 == null || str5.length() == 0) {
            str2 = shortVideoContext.mo110034j().getCreationId();
        } else {
            str2 = shortVideoContext.f155830o;
        }
        intent.putExtra("creation_id", str2);
        return intent;
    }
}

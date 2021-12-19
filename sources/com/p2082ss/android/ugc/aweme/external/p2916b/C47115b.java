package com.p2082ss.android.ugc.aweme.external.p2916b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.C59187c;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EditConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IEditService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.MediaInfo;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.MultiVideoMedia;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ShareConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.VideoMedia;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import dmt.p4542av.video.C88168aj;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.b.b */
public final class C47115b implements IEditService {
    static {
        Covode.recordClassIndex(55719);
    }

    /* renamed from: a */
    private static Intent m90332a(EditConfig editConfig) {
        Intent intent = new Intent();
        intent.putExtra("creation_id", editConfig.getCreationId());
        intent.putExtra("shoot_way", editConfig.getShootway());
        intent.putExtra("share_id", editConfig.getShareID());
        intent.putExtra("channel", editConfig.getChannel());
        intent.putExtra("hashtag", editConfig.getHashtag());
        AVChallenge challenge = editConfig.getChallenge();
        if (challenge != null) {
            Objects.requireNonNull(challenge, "null cannot be cast to non-null type java.io.Serializable");
            intent.putExtra("av_challenge", (Serializable) challenge);
        }
        String musicOrigin = editConfig.getMusicOrigin();
        if (musicOrigin != null) {
            intent.putExtra("music_origin", musicOrigin);
        }
        Integer launchFlag = editConfig.getLaunchFlag();
        if (launchFlag != null) {
            intent.addFlags(launchFlag.intValue());
        }
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig) {
        MediaInfo mediaInfo;
        C59187c cVar;
        C89219l.m154721d(editConfig, "");
        if (context != null) {
            if (editConfig.getClear() && (cVar = C59187c.f134693a) != null) {
                cVar.mo96693b();
            }
            if (editConfig.getMediaInfo() != null && (mediaInfo = editConfig.getMediaInfo()) != null) {
                int i = -1;
                if (mediaInfo instanceof VideoMedia) {
                    VideoMedia videoMedia = (VideoMedia) mediaInfo;
                    String filePath = videoMedia.getFilePath();
                    Intent a = m90332a(editConfig);
                    Bundle extraBundle = videoMedia.getExtraBundle();
                    if (extraBundle != null) {
                        a.putExtras(extraBundle);
                    }
                    AbstractC89171a<C89391z> onEnterEditListener = editConfig.getOnEnterEditListener();
                    a.putExtra("file_path", filePath);
                    if (a.getBooleanExtra("extra_enter_from_live", false)) {
                        i = 8;
                    }
                    C72724a.m128203a().mo62197a(context, a, i, onEnterEditListener);
                } else if (mediaInfo instanceof MultiVideoMedia) {
                    MultiVideoMedia multiVideoMedia = (MultiVideoMedia) mediaInfo;
                    ArrayList<MediaModel> videoMedias = multiVideoMedia.getVideoMedias();
                    Intent a2 = m90332a(editConfig);
                    Bundle extraBundle2 = multiVideoMedia.getExtraBundle();
                    if (extraBundle2 != null) {
                        a2.putExtras(extraBundle2);
                    }
                    Integer requestCode = editConfig.getRequestCode();
                    AbstractC89171a<C89391z> onEnterEditListener2 = editConfig.getOnEnterEditListener();
                    a2.putExtra("open_sdk_import_media_list", videoMedias);
                    if (requestCode != null) {
                        i = requestCode.intValue();
                    }
                    C72724a.m128203a().mo62197a(context, a2, i, onEnterEditListener2);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig) {
        C89219l.m154721d(editConfig, "");
        C89219l.m154721d(shareConfig, "");
        if (context != null) {
            int type = shareConfig.getType();
            if (type == 2) {
                Bundle bundle = new Bundle();
                bundle.putString("creation_id", editConfig.getCreationId());
                bundle.putString("shoot_way", editConfig.getShootway());
                AVChallenge challenge = editConfig.getChallenge();
                if (challenge != null) {
                    Objects.requireNonNull(challenge, "null cannot be cast to non-null type java.io.Serializable");
                    bundle.putSerializable("av_challenge", challenge);
                }
                List<AVChallenge> challenges = editConfig.getChallenges();
                if (challenges != null) {
                    Objects.requireNonNull(challenges, "null cannot be cast to non-null type java.io.Serializable");
                    bundle.putSerializable("av_challenge_list", (Serializable) challenges);
                }
                bundle.putBoolean("is_from_sys_share", true);
                bundle.putString("extra_share_app_name", shareConfig.getAppName());
                bundle.putSerializable("extra_share_context", shareConfig.getShareContext());
                bundle.putString("open_platform_client_key", shareConfig.getShareContext().mClientKey);
                bundle.putString("open_platform_extra", shareConfig.getShareContext().mOpenPlatformExtra);
                bundle.putString("anchor_source_type", shareConfig.getShareContext().mAnchorSourceType);
                bundle.putSerializable("_aweme_open_sdk_extra_share_options", shareConfig.getShareContext().mExtraShareOptions);
                shareConfig.getShareContext();
                String file = shareConfig.getFile();
                if (file == null) {
                    C89219l.m154715b();
                }
                VideoMedia videoMedia = new VideoMedia(file);
                videoMedia.setExtraBundle(bundle);
                editConfig.setMediaInfo(videoMedia);
            } else if (type == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("shoot_way", editConfig.getShootway());
                AVChallenge challenge2 = editConfig.getChallenge();
                if (!(challenge2 instanceof Serializable)) {
                    challenge2 = null;
                }
                bundle2.putSerializable("av_challenge", challenge2);
                if (editConfig.getChallenges() != null) {
                    List<AVChallenge> challenges2 = editConfig.getChallenges();
                    Objects.requireNonNull(challenges2, "null cannot be cast to non-null type java.io.Serializable");
                    bundle2.putSerializable("av_challenge_list", (Serializable) challenges2);
                }
                bundle2.putBoolean("is_from_sys_share", true);
                bundle2.putString("extra_share_app_name", shareConfig.getAppName());
                bundle2.putSerializable("extra_share_context", shareConfig.getShareContext());
                List<String> videoList = shareConfig.getVideoList();
                if (videoList != null) {
                    ArrayList arrayList = new ArrayList();
                    long j = 0;
                    for (T t : videoList) {
                        MediaModel mediaModel = new MediaModel(j);
                        int[] a = C88168aj.m153237a(t);
                        mediaModel.f134668h = (long) a[3];
                        mediaModel.f134672l = a[0];
                        mediaModel.f134673m = a[1];
                        mediaModel.f134662b = t;
                        arrayList.add(mediaModel);
                        j++;
                    }
                    MultiVideoMedia multiVideoMedia = new MultiVideoMedia(arrayList);
                    multiVideoMedia.setExtraBundle(bundle2);
                    editConfig.setMediaInfo(multiVideoMedia);
                }
            }
            startEdit(context, editConfig);
            C70005cr.m123611a().f156482a = null;
        }
    }
}

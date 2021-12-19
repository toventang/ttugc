package com.p2082ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C28020m;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40971f;
import com.p2082ss.android.ugc.aweme.photo.p3547b.C62858a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65348ar;
import com.p2082ss.android.ugc.aweme.question.EnumC66496a;
import com.p2082ss.android.ugc.aweme.question.EnumC66502b;
import com.p2082ss.android.ugc.aweme.question.ForumInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70973bm;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b.AbstractC71078c;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74046x;
import com.p2082ss.android.ugc.aweme.sticker.data.C75309d;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.utils.C80587it;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dq */
public final class C70646dq {

    /* renamed from: a */
    private final List<CreateAnchorInfo> f158126a = new ArrayList();

    /* renamed from: b */
    private final Keva f158127b = Keva.getRepo("allow_show_keva_repo");

    static {
        Covode.recordClassIndex(83112);
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0799  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x085f  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0868  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0899  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x08b0  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x08c6  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x08e9  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x094d A[SYNTHETIC, Splitter:B:301:0x094d] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x097f A[SYNTHETIC, Splitter:B:314:0x097f] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a07  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0a13  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0a27  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0a62  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0a87  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0a9d  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0aa8  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0ab5  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0ac1  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0acb  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0ae3  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0b15  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0b46  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0b50  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0b5c  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0b7a  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x0ba7  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0c12  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0c30  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0c34  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0c49  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0c5e  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0c66  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0c6c  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0c70  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0c74  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0c77  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0c7a  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0ce5  */
    /* JADX WARNING: Removed duplicated region for block: B:468:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111450a(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r34, java.util.LinkedHashMap<java.lang.String, java.lang.String> r35) {
        /*
        // Method dump skipped, instructions count: 3370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C70646dq.mo111450a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    /* renamed from: a */
    private static void m124869a(Collection<InteractStickerStruct> collection) {
        if (!C13603b.m24435a((Collection) collection)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                if (interactStickerStruct.getType() == 16) {
                    interactStickerStruct.getDuetStickerStruct().completeSecIdList();
                }
            }
        }
    }

    /* renamed from: c */
    private static void m124875c(Collection<InteractStickerStruct> collection) {
        if (!C13603b.m24435a((Collection) collection)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                if (interactStickerStruct.getType() == 8 && interactStickerStruct.getMentionInfo() != null && !TextUtils.isEmpty(interactStickerStruct.getMentionInfo().getUserId())) {
                    interactStickerStruct.getMentionInfo().setUserId("");
                }
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m124867a(VideoPublishEditModel videoPublishEditModel) {
        String videoPath;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            String str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
            if (C80720e.m139927b(str)) {
                return C74046x.m130203a(str);
            }
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            String str2 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
            if (C80720e.m139927b(str2)) {
                return C74046x.m130203a(str2);
            }
        }
        String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
        if (validVideoCoverPath != null) {
            return C74046x.m130203a(validVideoCoverPath);
        }
        if (videoPublishEditModel.canvasVideoData != null) {
            return C74046x.m130203a(videoPublishEditModel.canvasVideoData.getSourceInfo().get(0));
        }
        if (videoPublishEditModel.getPreviewInfo() == null) {
            videoPath = "";
        } else {
            videoPath = videoPublishEditModel.getPreviewInfo().getVideoList().get(0).getVideoPath();
        }
        C80587it.m139728a();
        return C80587it.m139727a(videoPath);
    }

    /* renamed from: b */
    private static void m124874b(Collection<InteractStickerStruct> collection) {
        if (!C13603b.m24435a((Collection) collection)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                if (!(interactStickerStruct.getType() != 10 || interactStickerStruct.getCountDownStickerStruct() == null || interactStickerStruct.getCountDownStickerStruct().getExpiredTime() == null)) {
                    interactStickerStruct.getCountDownStickerStruct().setExpiredTime(Long.valueOf(interactStickerStruct.getCountDownStickerStruct().getExpiredTime().longValue() / 1000));
                }
            }
        }
    }

    /* renamed from: a */
    private static void m124870a(List<InteractStickerStruct> list) {
        if (!C13603b.m24435a((Collection) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                C75309d captionStruct = interactStickerStruct.getCaptionStruct();
                if (captionStruct != null) {
                    captionStruct.setVideoWidth(null);
                    captionStruct.setMarginStart(null);
                    captionStruct.setMarginTop(null);
                    captionStruct.setMarginBottom(null);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m124872a(Object obj) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        boolean isSaveLocal = videoPublishEditModel.isSaveLocal();
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("save_local", "will save locally: ".concat(String.valueOf(isSaveLocal)));
        if (!isSaveLocal) {
            return false;
        }
        String localTempPath = videoPublishEditModel.getLocalTempPath();
        boolean isSaveToLocalPathInsteadOfAlbum = videoPublishEditModel.isSaveToLocalPathInsteadOfAlbum();
        if (videoPublishEditModel.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(localTempPath) || !new File(localTempPath).exists() || new File(localTempPath).length() <= 0) {
            return false;
        }
        String name = new File(localTempPath).getName();
        String str = (Environment.getExternalStorageDirectory().toString() + "/DCIM/Camera/") + name;
        if (C63238c.f143563A.mo93863a(C70005cr.m123611a().f156482a, ShareServiceImpl.m103039a().mo93977a(videoPublishEditModel.getSaveModel().getSaveType()))) {
            VEUtils.extractVideo(localTempPath, str);
        } else if (!C65348ar.m117034a() || Build.VERSION.SDK_INT < 29) {
            C80720e.m139932c(localTempPath, str);
        } else {
            try {
                C84896h.m145857a(C63247i.f143610a, localTempPath, name);
            } catch (Exception e) {
                e.printStackTrace();
                C80720e.m139932c(localTempPath, str);
                C40971f.m82489a("saveVideoToMediaStore exception " + e.getMessage());
            }
        }
        videoPublishEditModel.getSaveModel().setLocalFinalPath(str);
        if (z) {
            C62858a.m113275a(C63238c.f143574a, str);
        }
        return true;
    }

    /* renamed from: a */
    private void m124868a(VideoPublishEditModel videoPublishEditModel, Collection<InteractStickerStruct> collection) {
        if (!(videoPublishEditModel == null || C13603b.m24435a((Collection) collection) || !C70973bm.m125286b(videoPublishEditModel))) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                List<NormalTrackTimeStamp> list = null;
                try {
                    list = (List) C63238c.f143596w.getRetrofitFactoryGson().mo46671a(interactStickerStruct.getTrackList(), new C27895a<List<NormalTrackTimeStamp>>() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.C70646dq.C706471 */

                        static {
                            Covode.recordClassIndex(83113);
                        }
                    }.type);
                } catch (Exception unused) {
                }
                if (C13617h.m24466b(list)) {
                    for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                        if (normalTrackTimeStamp != null) {
                            float[] a = C70973bm.m125285a(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY(), videoPublishEditModel.mVideoCanvasWidth, videoPublishEditModel.mVideoCanvasHeight, videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight);
                            normalTrackTimeStamp.setX(AbstractC71078c.m125575b(a[0]));
                            normalTrackTimeStamp.setY(AbstractC71078c.m125575b(a[1]));
                        }
                    }
                    try {
                        interactStickerStruct.setTrackList(C63238c.f143575b.mo46674b(list));
                    } catch (C28020m unused2) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r0 <= (r7 + ((long) r4))) goto L_0x00e0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m124873b(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r25, java.util.LinkedHashMap<java.lang.String, java.lang.String> r26) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C70646dq.m124873b(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    /* renamed from: a */
    private void m124871a(List<InteractStickerStruct> list, LinkedHashMap<String, String> linkedHashMap) {
        EnumC66502b bVar;
        if (!C13603b.m24435a((Collection) list)) {
            for (InteractStickerStruct interactStickerStruct : list) {
                if (interactStickerStruct.getType() == 17) {
                    QaStruct qaStruct = interactStickerStruct.getQaStruct();
                    long questionId = qaStruct.getQuestionId();
                    int i = this.f158127b.getInt(C69892bn.m123462a(C63244g.m114602a().mo73255A().mo93904c()), EnumC66496a.FORUM_UNKNOWN.ordinal());
                    if (questionId == 0) {
                        bVar = EnumC66502b.FORUM_QUESTION;
                    } else {
                        bVar = EnumC66502b.FORUM_ANSWER;
                    }
                    linkedHashMap.put("forum_info", C63238c.f143596w.getRetrofitFactoryGson().mo46674b(new ForumInfo(bVar.ordinal(), i, qaStruct.getInviteUserList())));
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0425 A[Catch:{ JSONException -> 0x044b }, LOOP:7: B:158:0x041f->B:160:0x0425, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04e5 A[SYNTHETIC, Splitter:B:188:0x04e5] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05c5  */
    /* JADX WARNING: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111449a(com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r20, com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult r21, java.util.LinkedHashMap<java.lang.String, java.lang.String> r22) {
        /*
        // Method dump skipped, instructions count: 1590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.C70646dq.mo111449a(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, java.util.LinkedHashMap):void");
    }
}

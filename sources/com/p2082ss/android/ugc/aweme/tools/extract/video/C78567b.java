package com.p2082ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.AbstractServiceC0583f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65677j;
import com.p2082ss.android.ugc.aweme.settings.C68747m;
import com.p2082ss.android.ugc.aweme.shortvideo.C69745a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71413b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72440e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75926c;
import com.p2082ss.android.ugc.aweme.tools.extract.C78507ab;
import com.p2082ss.android.ugc.aweme.tools.extract.C78594y;
import com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78489b;
import com.p2082ss.android.ugc.aweme.tools.extract.video.C78580o;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.b */
public final class C78567b {
    static {
        Covode.recordClassIndex(91701);
    }

    /* renamed from: b */
    private static Context m137184b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static void m137183a(Context context) {
        Intent intent = new Intent();
        intent.putExtra("authkey", C63244g.m114602a().mo73277e().getSdkV4AuthKey(""));
        AbstractServiceC0583f.enqueueWork(m137184b(context), VideoFramesUploadService.class, 3009, intent);
    }

    /* renamed from: a */
    static /* synthetic */ Object m137181a(CountDownLatch countDownLatch, C43223c cVar, Object obj) {
        C75439a backgroundVideo;
        countDownLatch.await();
        if (cVar != null) {
            C43225d.m86337g(cVar);
            ArrayList<TimeSpeedModelExtension> a = CameraComponentModel.m123137a(cVar.f100888K);
            if (a != null) {
                for (T t : a) {
                    if (!(t == null || (backgroundVideo = t.getBackgroundVideo()) == null)) {
                        C75926c.m133132a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                    }
                }
            }
            if (obj instanceof VideoPublishEditModel) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                if (videoPublishEditModel.mShoutOutsData != null && C74418d.MODE_POST.equals(videoPublishEditModel.mShoutOutsData.getShoutOutsMode()) && !TextUtils.isEmpty(videoPublishEditModel.mShoutOutsData.getPostVideoPath()) && videoPublishEditModel.mShoutOutsData.getPostVideoPath().contains("shoutout")) {
                    C84902i.m145896b(videoPublishEditModel.mShoutOutsData.getPostVideoPath());
                }
            }
        } else if (obj instanceof VideoPublishEditModel) {
            C71413b.m126121a((VideoPublishEditModel) obj);
        }
        if (!(obj instanceof VideoPublishEditModel)) {
            return null;
        }
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj;
        if (videoPublishEditModel2.isMultiVideoEdit() && !C68747m.m121180a()) {
            C71429d.m126159b();
        }
        C71817eu.m126798i(videoPublishEditModel2);
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ Void m137182a(C69831ai aiVar, Object obj, Context context, CountDownLatch countDownLatch, C1731i iVar) {
        ExtractFramesModel extractFramesModel;
        int i;
        boolean z;
        boolean z2;
        C78582p a;
        if (iVar.mo5539b() || iVar.mo5544c()) {
            C78507ab.m137073a(aiVar, obj, (Integer) -1001, (Boolean) false, "");
        }
        C78576k kVar = new C78576k(context);
        C78577l lVar = new C78577l(countDownLatch);
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(lVar, "");
        if (obj instanceof VideoPublishEditModel) {
            C63244g.m114602a();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            C78507ab.C78510c cVar = new C78507ab.C78510c(obj, kVar, false);
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(cVar, "");
            if (!videoPublishEditModel.hasImageStickers()) {
                cVar.mo122415a(true);
            } else if (!C80720e.m139927b(videoPublishEditModel.extractFramesModel.getExtractFramesDir())) {
                cVar.mo122415a(false);
            } else {
                ArrayList<String> a2 = C78489b.m137050a(videoPublishEditModel.extractFramesModel.getExtractFramesDir());
                if (a2.isEmpty()) {
                    cVar.mo122415a(false);
                } else {
                    int size = a2.size();
                    if (size == 0) {
                        cVar.mo122415a(false);
                    } else {
                        C89233z.C89236c cVar2 = new C89233z.C89236c();
                        cVar2.element = 0;
                        ArrayList arrayList = new ArrayList();
                        List<StickerItemModel> list = videoPublishEditModel.infoStickerModel.stickers;
                        C89219l.m154716b(list, "");
                        ArrayList<StickerItemModel> arrayList2 = new ArrayList();
                        for (T t : list) {
                            if (t.type == 11) {
                                arrayList2.add(t);
                            }
                        }
                        for (StickerItemModel stickerItemModel : arrayList2) {
                            if (C72440e.m127817b(stickerItemModel.path) || C72440e.m127819c(stickerItemModel.path)) {
                                cVar2.element++;
                            } else {
                                arrayList.add(stickerItemModel.path);
                            }
                        }
                        if (arrayList.size() != 0) {
                            C78489b.m137051a(arrayList, new C78489b.C78494e(cVar2, cVar, size));
                        } else if (Math.abs(size - cVar2.element) > 3) {
                            cVar.mo122415a(false);
                        } else {
                            cVar.mo122415a(true);
                        }
                    }
                }
            }
            C1731i.m5640b(new C78507ab.CallableC78511d(obj, aiVar), C1731i.f5562a).mo5534a(new C78507ab.C78512e(obj, kVar, false, lVar), C1731i.f5564c, null);
        }
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj;
        C89219l.m154721d(videoPublishEditModel2, "");
        C89219l.m154721d(aiVar, "");
        C69745a a3 = C63238c.f143597x.mo93912a(aiVar);
        if (a3 == null || (extractFramesModel = videoPublishEditModel2.extractFramesModel) == null) {
            a = null;
            z = true;
        } else {
            extractFramesModel.setStickerIds(videoPublishEditModel2.mStickerID);
            C78582p pVar = new C78582p();
            C78580o.C78581a aVar = new C78580o.C78581a();
            aVar.f176598a = a3.aid;
            aVar.f176599b = aiVar.materialId;
            aVar.f176600c = "";
            aVar.f176601d = "";
            aVar.f176602e = extractFramesModel;
            aVar.f176605h = C78594y.m137206a(videoPublishEditModel2).f176443a;
            aVar.f176606i = videoPublishEditModel2.mIsFromDraft;
            String cameraIds = videoPublishEditModel2.getCameraIds();
            if (cameraIds == null || cameraIds.length() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            z = true;
            aVar.f176607j = i ^ 1;
            if (videoPublishEditModel2.mRestoreType == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.f176608k = z2;
            aVar.f176603f = System.currentTimeMillis();
            C78580o a4 = aVar.mo122504a();
            C89219l.m154716b(a4, "");
            a = pVar.mo122505a(a4);
        }
        AbstractC65677j l = C63244g.m114602a().mo73287o().mo104792l();
        StringBuilder sb = new StringBuilder("will insert: ");
        if (a == null) {
            z = false;
        }
        l.mo104817a("extract_frame", sb.append(z).toString());
        if (a != null) {
            try {
                C78579n.m137189a(context).mo122499a(a);
            } catch (Exception e) {
                C78507ab.m137073a(aiVar, obj, (Integer) -1002, (Boolean) false, e.getMessage());
                C63244g.m114602a().mo73287o().mo104792l().mo104817a("extract_frame", "insert sql fail : " + e.getMessage());
            }
        }
        m137183a(context);
        return null;
    }
}

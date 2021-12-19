package com.p2082ss.android.ugc.aweme.p2720cw;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65344an;
import com.p2082ss.android.ugc.aweme.property.C65449ee;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C69745a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69932ck;
import com.p2082ss.android.ugc.aweme.shortvideo.C69934cm;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.CallableC69933cl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a;
import com.p2082ss.android.ugc.aweme.tools.extract.C78588w;
import com.p2082ss.android.ugc.aweme.tools.extract.C78590x;
import com.p2082ss.android.ugc.aweme.tools.extract.C78594y;
import com.p2082ss.android.ugc.aweme.tools.extract.video.C78567b;
import com.p2082ss.android.ugc.aweme.tools.extract.video.C78569d;
import com.p2082ss.android.ugc.aweme.tools.extract.video.C78570e;
import com.p2082ss.android.ugc.aweme.tools.extract.video.CallableC78568c;
import com.p2082ss.android.ugc.aweme.tools.extract.video.CallableC78571f;
import com.p2082ss.android.ugc.aweme.tools.extract.video.CallableC78573h;
import com.p2082ss.android.ugc.aweme.utils.C80414ey;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cw.a */
public final class C40796a implements AbstractC40797b {
    static {
        Covode.recordClassIndex(48648);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2720cw.AbstractC40797b
    /* renamed from: a */
    public final void mo70033a(Object obj, C43223c cVar, CountDownLatch countDownLatch) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(countDownLatch, "");
        C1731i.m5640b(new CallableC78571f(new C78567b(), countDownLatch, cVar, obj), C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2720cw.AbstractC40797b
    /* renamed from: a */
    public final void mo70032a(C69831ai aiVar, VideoPublishEditModel videoPublishEditModel, CountDownLatch countDownLatch) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(countDownLatch, "");
        C69932ck ckVar = new C69932ck();
        Application application = C63247i.f143610a;
        if (!C65449ee.m117170a()) {
            countDownLatch.countDown();
            return;
        }
        boolean a = C78588w.C78589a.m137198a(videoPublishEditModel);
        C63244g.m114602a().mo73287o().mo104792l().mo104817a("original_sound", "need upload original sound: ".concat(String.valueOf(a)));
        C1731i.m5640b(new CallableC69933cl(ckVar, a, aiVar, videoPublishEditModel, application, countDownLatch), C1731i.f5562a).mo5537b((AbstractC1729g) new C69934cm(application));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2720cw.AbstractC40797b
    /* renamed from: b */
    public final void mo70034b(C69831ai aiVar, VideoPublishEditModel videoPublishEditModel, CountDownLatch countDownLatch) {
        Object obj;
        C89378p<Long, Long> a;
        int i;
        boolean z;
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(countDownLatch, "");
        C78567b bVar = new C78567b();
        Application application = C63247i.f143610a;
        if (!C78590x.m137201c(videoPublishEditModel)) {
            countDownLatch.countDown();
            if ((videoPublishEditModel instanceof VideoPublishEditModel) && videoPublishEditModel.extractFramesModel != null) {
                C1731i.m5640b(new CallableC78568c(videoPublishEditModel), C1731i.f5562a);
            }
            C78567b.m137183a(application);
            return;
        }
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        boolean z2 = videoPublishEditModel instanceof VideoPublishEditModel;
        if (z2) {
            C89219l.m154721d(aiVar, "");
            C89219l.m154721d(videoPublishEditModel, "");
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            C69745a a2 = createIAVServiceProxybyMonsterPlugin.getAVConverter().mo93912a(aiVar);
            C69840ar a3 = new C69840ar().mo110187a("stage", (Integer) 1).mo110189a("aweme_id", a2 != null ? a2.aid : null).mo110187a("match_factors", Integer.valueOf(C78594y.m137206a(videoPublishEditModel).f176443a));
            String cameraIds = videoPublishEditModel.getCameraIds();
            if (cameraIds == null || cameraIds.length() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            C69840ar a4 = a3.mo110187a("origin", Integer.valueOf(i ^ 1)).mo110185a("is_draft", Boolean.valueOf(videoPublishEditModel.mIsFromDraft));
            if (videoPublishEditModel.mRestoreType == 2) {
                z = true;
            } else {
                z = false;
            }
            C40982q.m82520a("av_video_audit", 1, a4.mo110185a("is_backup", Boolean.valueOf(z)).mo110187a("video_type", Integer.valueOf(C71817eu.m126796g(videoPublishEditModel))).mo110191a());
        }
        C89219l.m154721d(videoPublishEditModel, "");
        if (z2) {
            if (C65344an.m117030a()) {
                C89219l.m154721d(videoPublishEditModel, "");
                ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
                if (extractFramesModel != null && extractFramesModel.getSegmentEffectPhoto() != null) {
                    ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
                    C89219l.m154716b(finalVideoList, "");
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            TimeSpeedModelExtension next = it.next();
                            if (next.getIdentityKey() == null) {
                                break;
                            }
                            String identityKey = next.getIdentityKey();
                            C89219l.m154716b(identityKey, "");
                            linkedHashSet.add(identityKey);
                        } else {
                            HashMap<String, List<String>> segmentEffectPhoto = extractFramesModel.getSegmentEffectPhoto();
                            if (segmentEffectPhoto == null) {
                                C89219l.m154715b();
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<String, List<String>> entry : segmentEffectPhoto.entrySet()) {
                                if (linkedHashSet.contains(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                C89070n.m154535a((Collection) arrayList, (Iterable) ((List) entry2.getValue()));
                            }
                            HashSet i2 = C89070n.m154589i((Iterable) arrayList);
                            HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                            if (multiStickers != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Map.Entry<Integer, List<String>> entry3 : multiStickers.entrySet()) {
                                    C89070n.m154535a((Collection) arrayList2, (Iterable) entry3.getValue());
                                }
                                ArrayList<String> arrayList3 = new ArrayList();
                                for (Object obj2 : arrayList2) {
                                    if (!i2.contains(obj2)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                for (String str : arrayList3) {
                                    if (new File(str).exists() && C69823b.m123387a(str)) {
                                        C86994k.m150676c(str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (videoPublishEditModel.isStitchMode()) {
                C80414ey.m139399a(videoPublishEditModel);
            } else if (!(!videoPublishEditModel.isMultiVideoEdit() || videoPublishEditModel.extractFramesModel == null || videoPublishEditModel.extractFramesModel.getFramesV1() == null || videoPublishEditModel.extractFramesModel.getSegmentFrameKeys() == null)) {
                ExtractFramesModel extractFramesModel2 = videoPublishEditModel.extractFramesModel;
                Iterator<Map.Entry<Integer, String>> it2 = extractFramesModel2.getSegmentFrameKeys().entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<Integer, String> next2 = it2.next();
                    if (!C80414ey.m139400a(next2.getValue(), videoPublishEditModel)) {
                        HashMap<Integer, ArrayList<FrameItem>> framesV1 = extractFramesModel2.getFramesV1();
                        if (framesV1 != null) {
                            framesV1.remove(next2.getKey());
                        }
                        HashMap<Integer, List<String>> multiStickers2 = extractFramesModel2.getMultiStickers();
                        if (multiStickers2 != null) {
                            multiStickers2.remove(next2.getKey());
                        }
                        it2.remove();
                    }
                }
                HashMap<Integer, ArrayList<FrameItem>> framesV12 = extractFramesModel2.getFramesV1();
                if (framesV12 != null) {
                    for (Map.Entry<Integer, ArrayList<FrameItem>> entry4 : framesV12.entrySet()) {
                        String str2 = extractFramesModel2.getSegmentFrameKeys().get(entry4.getKey());
                        if (!(str2 == null || str2.length() == 0 || (a = C80414ey.m139398a(videoPublishEditModel, str2)) == null)) {
                            C89070n.m154537a((List) entry4.getValue(), (AbstractC89172b) new C80414ey.C80415a(a));
                        }
                    }
                }
            }
        }
        C1743j jVar = new C1743j();
        AbstractC78487a a5 = C78590x.m137199a(videoPublishEditModel);
        if (a5 == null) {
            jVar.mo5557b((Object) null);
            obj = C1731i.f5566e;
        } else {
            C1731i.m5640b(new CallableC78573h(a5, videoPublishEditModel, jVar), C1731i.f5563b);
            obj = jVar.f5610a;
        }
        ((C1731i) Objects.requireNonNull(obj)).mo5537b((AbstractC1729g) new C78569d(bVar, aiVar, videoPublishEditModel)).mo5532a((AbstractC1729g) new C78570e(bVar, aiVar, videoPublishEditModel, application, countDownLatch));
    }
}

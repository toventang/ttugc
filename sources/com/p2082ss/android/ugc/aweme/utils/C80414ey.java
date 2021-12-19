package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ey */
public final class C80414ey {
    static {
        Covode.recordClassIndex(93682);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ey$a */
    public static final class C80415a extends AbstractC89220m implements AbstractC89172b<FrameItem, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C89378p f179976a;

        static {
            Covode.recordClassIndex(93683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C80415a(C89378p pVar) {
            super(1);
            this.f179976a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FrameItem frameItem) {
            boolean z;
            FrameItem frameItem2 = frameItem;
            C89219l.m154721d(frameItem2, "");
            C89378p pVar = this.f179976a;
            long timeStamp = frameItem2.getTimeStamp() / 1000;
            if (timeStamp < ((Number) pVar.getFirst()).longValue() || timeStamp > ((Number) pVar.getSecond()).longValue()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(true ^ z);
        }
    }

    /* renamed from: a */
    public static final void m139399a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.getFramesV1() != null && videoPublishEditModel.extractFramesModel.getSegmentFrameKeys() != null) {
            ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
            Iterator<Map.Entry<Integer, String>> it = extractFramesModel.getSegmentFrameKeys().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, String> next = it.next();
                if (!m139400a(next.getValue(), videoPublishEditModel)) {
                    HashMap<Integer, ArrayList<FrameItem>> framesV1 = extractFramesModel.getFramesV1();
                    if (framesV1 != null) {
                        framesV1.remove(next.getKey());
                    }
                    HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                    if (multiStickers != null) {
                        multiStickers.remove(next.getKey());
                    }
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public static final C89378p<Long, Long> m139398a(VideoPublishEditModel videoPublishEditModel, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(str, "");
        if (videoPublishEditModel.getCurMultiEditVideoRecordData().isSingleVideo) {
            TimeSpeedModelExtension timeSpeedModelExtension = videoPublishEditModel.getFinalVideoList().get(0);
            C89219l.m154716b(timeSpeedModelExtension, "");
            if (C89219l.m154714a((Object) str, (Object) timeSpeedModelExtension.getIdentityKey())) {
                return new C89378p<>(Long.valueOf(videoPublishEditModel.getCurMultiEditVideoRecordData().startTime), Long.valueOf(videoPublishEditModel.getCurMultiEditVideoRecordData().endTime));
            }
            return null;
        }
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        C89219l.m154716b(curMultiEditVideoRecordData, "");
        List<MultiEditVideoSegmentRecordData> d = C71493a.m126281d(curMultiEditVideoRecordData);
        if (videoPublishEditModel.getFinalVideoList().size() != d.size()) {
            return null;
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        C89219l.m154716b(finalVideoList, "");
        int size = finalVideoList.size();
        for (int i = 0; i < size; i++) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = d.get(i);
            TimeSpeedModelExtension timeSpeedModelExtension2 = videoPublishEditModel.getFinalVideoList().get(i);
            C89219l.m154716b(timeSpeedModelExtension2, "");
            if (C89219l.m154714a((Object) str, (Object) timeSpeedModelExtension2.getIdentityKey())) {
                return new C89378p<>(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m139400a(String str, VideoPublishEditModel videoPublishEditModel) {
        T t;
        String stickerId;
        C89219l.m154721d(videoPublishEditModel, "");
        if (str == null) {
            return true;
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        C89219l.m154716b(finalVideoList, "");
        Iterator<T> it = finalVideoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            String identityKey = t.getIdentityKey();
            if (identityKey != null && C89219l.m154714a((Object) identityKey, (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return false;
        }
        if (videoPublishEditModel.hasUploadFrameConditionInEdit() || ((stickerId = t2.getStickerId()) != null && stickerId.length() != 0)) {
            return true;
        }
        return false;
    }
}

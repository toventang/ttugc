package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.sharedar.SharedARModel;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73513bl;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.sticker.C75447n;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.RecordScene */
public class RecordScene {
    public UrlModel audioTrack;
    public String challengeStr;
    public ClientCherEffectParam cherEffectParam;
    public CommentVideoModel commentVideoModel;
    public String creationId;
    public String duetAudioPath;
    public String duetVideoPath;
    public ExtractFramesModel extractFramesModel;
    public int faceBeauty;
    public String filterIds;
    public String filterLabels;
    public String filterValues;
    public int hardEncode;
    public boolean isShoutout;
    public LoudnessBalanceParam loudnessBalanceParam = new LoudnessBalanceParam();
    public long maxDuration;
    public String mp4Path;
    public C69905c musicModel;
    public String musicPath;
    public int musicStart;
    public ReactionParams reactionParams;
    public int recordBGMDelay;
    public int recordMode;
    public SharedARModel sharedARModel;
    public int shootMode;
    public int shootedShootMode;
    public StitchParams stitchParams;
    public Map<String, Object> videoRecordMetadata;
    public ArrayList<TimeSpeedModelExtension> videoSegments;

    static {
        Covode.recordClassIndex(84612);
    }

    public boolean isSegmentsNotValid() {
        return C13603b.m24435a((Collection) this.videoSegments);
    }

    public boolean isStitchMode() {
        if (this.stitchParams != null) {
            return true;
        }
        return false;
    }

    public boolean isReactionMode() {
        ReactionParams reactionParams2 = this.reactionParams;
        if (reactionParams2 == null || C13627m.m24498a(reactionParams2.videoPath)) {
            return false;
        }
        return true;
    }

    public AVChallenge getChallengeFromStr() {
        SimpleAVChallenge deserializeFromJson;
        if (!TextUtils.isEmpty(this.challengeStr) && (deserializeFromJson = SimpleAVChallenge.deserializeFromJson(this.challengeStr)) != null) {
            return deserializeFromJson.parse2AVChallenge();
        }
        return null;
    }

    public boolean isDuetMode() {
        if (!C13627m.m24498a(this.duetVideoPath) || !C13627m.m24498a(this.duetAudioPath)) {
            return true;
        }
        return false;
    }

    public RecordScene audioTrack(UrlModel urlModel) {
        this.audioTrack = urlModel;
        return this;
    }

    public RecordScene creationId(String str) {
        this.creationId = str;
        return this;
    }

    public RecordScene faceBeauty(int i) {
        this.faceBeauty = i;
        return this;
    }

    public RecordScene hardEncode(int i) {
        this.hardEncode = i;
        return this;
    }

    public RecordScene maxDuration(long j) {
        this.maxDuration = j;
        return this;
    }

    public RecordScene mp4Path(String str) {
        this.mp4Path = str;
        return this;
    }

    public RecordScene musicModel(C69905c cVar) {
        this.musicModel = cVar;
        return this;
    }

    public RecordScene musicPath(String str) {
        this.musicPath = str;
        return this;
    }

    public RecordScene musicStart(int i) {
        this.musicStart = i;
        return this;
    }

    public RecordScene reactionParams(ReactionParams reactionParams2) {
        this.reactionParams = reactionParams2;
        return this;
    }

    public RecordScene recordMode(int i) {
        this.recordMode = i;
        return this;
    }

    public RecordScene stitchParams(StitchParams stitchParams2) {
        this.stitchParams = stitchParams2;
        return this;
    }

    public RecordScene videoSegment(String str) {
        this.videoSegments = CameraComponentModel.m123137a(str);
        return this;
    }

    public static String challenge2str(AVChallenge aVChallenge) {
        if (aVChallenge == null) {
            return "";
        }
        return SimpleAVChallenge.serializeToStr(SimpleAVChallenge.fromAVChallenge(aVChallenge));
    }

    public static ClientCherEffectParam getCherEffectParam(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (ClientCherEffectParam) C63244g.m114602a().mo73261G().mo46670a(str, ClientCherEffectParam.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static CommentVideoModel string2CommentVideoModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (CommentVideoModel) C63244g.m114602a().mo73261G().mo46670a(str, CommentVideoModel.class);
    }

    public static ReactionParams string2ReactionParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (ReactionParams) C63244g.m114602a().mo73261G().mo46670a(str, ReactionParams.class);
    }

    public static SharedARModel string2SharedARModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (SharedARModel) C63244g.m114602a().mo73261G().mo46670a(str, SharedARModel.class);
    }

    public static StitchParams string2StitchParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (StitchParams) C63244g.m114602a().mo73261G().mo46670a(str, StitchParams.class);
    }

    public static Boolean containBusiSticker(ArrayList<TimeSpeedModelExtension> arrayList) {
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().isBusiSticker()) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<BeautyMetadata> getBeautyMetadatas(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<BeautyMetadata> arrayList2 = new ArrayList<>();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getBeautyMetadata());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static ArrayList<String> getCameraLensInfoList(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getCameraLensInfo());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static String getFirstStickerMusicIds(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C13603b.m24435a((Collection) arrayList)) {
            return null;
        }
        List<String> stickerMusicIds = arrayList.get(0).getStickerMusicIds();
        if (C13603b.m24435a((Collection) stickerMusicIds)) {
            return null;
        }
        return C63244g.m114602a().mo73261G().mo46674b(stickerMusicIds);
    }

    public static String getStickerIdsByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getStickerId());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isChangeSpeed(java.util.ArrayList<com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension> r8) {
        /*
            boolean r0 = com.bytedance.common.utility.collection.C13603b.m24435a(r8)
            r7 = 0
            if (r0 == 0) goto L_0x0008
            return r7
        L_0x0008:
            java.util.Iterator r6 = r8.iterator()
        L_0x000c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r5 = (com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension) r5
            r3 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r1 = r5.getSpeed()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            double r3 = r5.getSpeed()
            r1 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000c
        L_0x002f:
            r0 = 1
            return r0
        L_0x0031:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene.isChangeSpeed(java.util.ArrayList):boolean");
    }

    public static String getCameraIdsStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C13603b.m24435a((Collection) arrayList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getCameraId() + ",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1);
    }

    public static ArrayList<GreenScreenMaterial> getGreenScreenMaterials(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<GreenScreenMaterial> arrayList2 = new ArrayList<>();
        if (C84904k.m145909a(arrayList)) {
            return arrayList2;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (!next.getRecordExtras().isEmpty()) {
                arrayList2.add(new GreenScreenMaterial(GreenScreenMaterialKt.getType(next).intValue(), GreenScreenMaterialKt.getStartTime(next).longValue(), GreenScreenMaterialKt.getEndTime(next).longValue(), GreenScreenMaterialKt.getResId(next), GreenScreenMaterialKt.getAuthorName(next), GreenScreenMaterialKt.getEffectId(next), GreenScreenMaterialKt.getLocalPath(next), GreenScreenMaterialKt.getMediasource(next)));
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static String getSpeedStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C13603b.m24435a((Collection) arrayList)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next.getSpeed() > 0.2d && next.getSpeed() < 0.4d) {
                sb.append("0.33,");
            } else if (next.getSpeed() > 0.4d && next.getSpeed() < 0.6d) {
                sb.append("0.5,");
            } else if (0.6d < next.getSpeed() && next.getSpeed() < 1.5d) {
                sb.append("1.0,");
            } else if (next.getSpeed() == 1.5d) {
                sb.append("6,");
            } else if (1.5d < next.getSpeed() && next.getSpeed() < 2.5d) {
                sb.append("2.0,");
            } else if (2.5d < next.getSpeed() && next.getSpeed() < 3.5d) {
                sb.append("3.0,");
            }
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1);
    }

    public static StickerInfo getStickerInfo(ArrayList<TimeSpeedModelExtension> arrayList) {
        String a;
        StickerInfo stickerInfo = new StickerInfo();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (!TextUtils.isEmpty(next.getPropRec())) {
                arrayList4.add(next.getPropRec());
            }
            String str = "";
            C89219l.m154721d(next, str);
            StickerInfo stickerInfo2 = next.getStickerInfo();
            if (stickerInfo2 == null) {
                a = str;
            } else {
                a = C75447n.m132310a(stickerInfo2.getPropSource(), stickerInfo2.getNeedFilter());
            }
            if (!a.isEmpty()) {
                arrayList2.add(a);
            }
            if (!next.getGradeKey().isEmpty()) {
                arrayList3.add(next.getStickerId() + ":" + next.getGradeKey());
            }
            if (!TextUtils.isEmpty(next.getTabOrder())) {
                arrayList5.add(next.getTabOrder());
            }
            if (next.getStickerId() != null) {
                if (!TextUtils.isEmpty(next.getImprPosition())) {
                    str = next.getImprPosition();
                }
                arrayList6.add(str);
            }
            if (!stickerInfo.isMusicBeatSticker() && C73513bl.m129647a(next)) {
                stickerInfo.setMusicBeatSticker(true);
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        arrayList3.removeAll(Collections.singleton(null));
        stickerInfo.setPropSource(join(arrayList2, ","));
        stickerInfo.setGradeKey(join(arrayList3, ","));
        stickerInfo.setRecId(join(arrayList4, ","));
        stickerInfo.setTabOrder(join(arrayList5, ","));
        stickerInfo.setImprPosition(join(arrayList6, ","));
        return stickerInfo;
    }

    public static Boolean isDefaultProp(ArrayList<TimeSpeedModelExtension> arrayList, String str) {
        if (str != null && !str.isEmpty() && arrayList != null && !arrayList.isEmpty()) {
            Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().getStickerId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String join(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : list) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}

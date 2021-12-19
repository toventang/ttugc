package com.p2082ss.android.ugc.playerkit.videoview;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.BitRate;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.playerkit.videoview.e */
public final class C84288e {
    static {
        Covode.recordClassIndex(98203);
    }

    /* renamed from: a */
    private static C84237e m144954a(BitRate bitRate) {
        if (bitRate == null) {
            return null;
        }
        C84237e eVar = new C84237e();
        eVar.origin = bitRate;
        eVar.setBytevc1(bitRate.isBytevc1());
        eVar.setPlayAddr(m144955a(bitRate.getPlayAddr()));
        eVar.setBitRate(bitRate.getBitRate());
        eVar.setGearName(bitRate.getGearName());
        eVar.setQualityType(bitRate.getQualityType());
        return eVar;
    }

    /* renamed from: a */
    private static C84239g m144955a(UrlModel urlModel) {
        String uri;
        if (urlModel == null) {
            return null;
        }
        C84239g gVar = new C84239g();
        gVar.origin = urlModel;
        gVar.setFileHash(urlModel.getFileHash());
        gVar.setHeight(urlModel.getHeight());
        gVar.setWidth(urlModel.getWidth());
        gVar.setSize(urlModel.getSize());
        if (urlModel instanceof VideoUrlModel) {
            uri = ((VideoUrlModel) urlModel).getOriginUri();
        } else {
            uri = urlModel.getUri();
        }
        gVar.setUri(uri);
        gVar.setUrlKey(urlModel.getUrlKey());
        gVar.setUrlList(urlModel.getUrlList());
        return gVar;
    }

    /* renamed from: a */
    public static C84241i m144956a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return null;
        }
        C84241i iVar = new C84241i();
        iVar.origin = videoUrlModel;
        ArrayList arrayList = new ArrayList();
        if (videoUrlModel.getBitRate() != null) {
            for (BitRate bitRate : new ArrayList(videoUrlModel.getBitRate())) {
                arrayList.add(m144954a(bitRate));
            }
        }
        iVar.setBitRate(arrayList);
        iVar.setDashVideoId(videoUrlModel.getDashVideoId());
        iVar.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        iVar.setDashVideoId(videoUrlModel.getDashVideoId());
        iVar.setFileCheckSum(videoUrlModel.getFileCheckSum());
        iVar.setBytevc1(videoUrlModel.isBytevc1());
        iVar.setHitBitrate(videoUrlModel.getHitBitrate());
        iVar.setRatio(videoUrlModel.getRatio());
        iVar.setVr(videoUrlModel.isVr());
        iVar.setSourceId(videoUrlModel.getSourceId());
        iVar.setDuration(videoUrlModel.getDuration());
        iVar.setFileHash(videoUrlModel.getFileHash());
        iVar.setHeight(videoUrlModel.getHeight());
        iVar.setWidth(videoUrlModel.getWidth());
        iVar.setSize(videoUrlModel.getSize());
        iVar.setUri(videoUrlModel.getOriginUri());
        iVar.setUrlKey(videoUrlModel.getUrlKey());
        iVar.setUrlList(videoUrlModel.getUrlList());
        return iVar;
    }
}

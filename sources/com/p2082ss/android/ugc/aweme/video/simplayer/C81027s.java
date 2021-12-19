package com.p2082ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63034d;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.aweme.video.C80775n;
import com.p2082ss.android.ugc.aweme.video.C80780p;
import com.p2082ss.android.ugc.aweme.video.EnumC81083x;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.C84180b;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84217p;
import com.p2082ss.android.ugc.playerkit.model.C84221s;
import com.p2082ss.android.ugc.playerkit.model.C84222t;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84179d;
import com.p2082ss.android.ugc.playerkit.p4324d.C84189d;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84232a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84233b;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.s */
public final class C81027s {

    /* renamed from: a */
    static boolean f181142a = true;

    /* renamed from: b */
    public static LruCache<C84241i, C84223u> f181143b;

    /* renamed from: c */
    static LruCache<C84235d, C84221s> f181144c;

    /* renamed from: d */
    static LruCache<C84232a, C84222t> f181145d;

    /* renamed from: a */
    public static void m140682a(C84217p pVar, List<C84235d> list) {
        if (!(list == null || list.isEmpty())) {
            if (pVar.f188189c == null) {
                pVar.f188189c = new ArrayList();
            }
            for (C84235d dVar : list) {
                if (dVar != null) {
                    pVar.f188189c.add(m140676a(dVar));
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(94345);
    }

    /* renamed from: a */
    public static int m140674a() {
        if (C80716a.C80717a.f180462a.mo123864a().isPluginApplied() || C84231a.m144838d().isEnabled()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static AbstractC84179d<C84222t> m140675a(C84232a aVar) {
        return new C81044w(aVar);
    }

    /* renamed from: a */
    private static AbstractC84179d<C84221s> m140676a(C84235d dVar) {
        return new C81043v(dVar);
    }

    /* renamed from: a */
    public static C84241i m140679a(C84240h hVar) {
        boolean z;
        if (hVar == null || !hVar.isColdBoot() || !C84191b.m144782i()) {
            z = false;
        } else {
            z = true;
        }
        if ((!C80780p.m140118a() && !z) || hVar == null || hVar.getH264PlayAddr() == null || hVar.getPlayAddr() == null) {
            if (C80716a.C80717a.f180462a.mo123865b().Bytevc1PlayAddrPolicyUnifyExperiment()) {
                C84241i a = C80780p.m140117a(hVar, C84209m.EnumC84214e.TT);
                if (a != null) {
                    return m140680a(hVar, a);
                }
            } else if (hVar != null) {
                if (C84180b.m144763a(hVar.getPlayAddrBytevc1())) {
                    return m140680a(hVar, hVar.getPlayAddrBytevc1());
                }
                return m140680a(hVar, hVar.getPlayAddrH264());
            }
            return null;
        }
        hVar.setBitRate(null);
        hVar.getH264PlayAddr().setBitRate(null);
        hVar.getH264PlayAddr().setSourceId(hVar.getPlayAddr().getSourceId());
        return m140680a(hVar, hVar.getH264PlayAddr());
    }

    /* renamed from: a */
    public static float m140673a(C84240h hVar, String str) {
        if (hVar == null || TextUtils.isEmpty(hVar.getMeta()) || TextUtils.isEmpty(str)) {
            return Float.MIN_VALUE;
        }
        try {
            String optString = new JSONObject(hVar.getMeta()).optString(str, "");
            if (!TextUtils.isEmpty(optString)) {
                return Float.parseFloat(optString);
            }
        } catch (Exception e) {
            if (!C84231a.m144834a().isDebug()) {
                e.printStackTrace();
            } else {
                throw new RuntimeException(e);
            }
        }
        return Float.MIN_VALUE;
    }

    /* renamed from: a */
    private static C84241i m140680a(C84240h hVar, C84241i iVar) {
        if (!(iVar == null || hVar == null)) {
            iVar.setColdBoot(hVar.isColdBoot());
        }
        return iVar;
    }

    /* renamed from: a */
    public static void m140681a(C84217p pVar, C84233b bVar) {
        if (!(bVar == null || bVar.getCaptionInfos() == null || bVar.getCaptionInfos().isEmpty())) {
            if (pVar.f188190d == null) {
                pVar.f188190d = new ArrayList();
            }
            for (C84232a aVar : bVar.getCaptionInfos()) {
                if (aVar != null) {
                    pVar.f188190d.add(m140675a(aVar));
                }
            }
        }
    }

    /* renamed from: a */
    public static AbstractC84179d<C84223u> m140677a(String str, boolean z, long j) {
        return new C81045x(str, z, j);
    }

    /* renamed from: a */
    public static C84217p m140678a(C84241i iVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, String str, String str2, boolean z7, boolean z8, boolean z9, EnumC81083x xVar, C80775n nVar) {
        String str3;
        boolean z10;
        boolean z11;
        IALog d = C84231a.m144838d();
        StringBuilder sb = new StringBuilder("createNormalPrepareData aid:");
        if (iVar != null) {
            str3 = iVar.getSourceId();
        } else {
            str3 = "null";
        }
        d.mo124333e("SimPlayerHelper", sb.append(str3).toString());
        boolean isAsyncInit = C80716a.C80717a.f180462a.mo123865b().isAsyncInit();
        if (iVar == null) {
            return null;
        }
        final C63059e a = C84189d.m144771a(iVar, null);
        a.f143247l = z7;
        C84217p pVar = new C84217p(new C81042u(z4, iVar, z7), new C81047z(iVar), C84231a.f188309a, iVar.getSourceId(), z, xVar, iVar.isVr(), iVar.isBytevc1(), C84199c.f187979a.getRenderType(), new C81030t(iVar), iVar.getUri(), !z2, isAsyncInit, C80716a.C80717a.f180462a.mo123865b().get265DecodeType(), new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.video.simplayer.C81027s.RunnableC810281 */

            static {
                Covode.recordClassIndex(94346);
            }

            public final void run() {
                AbstractC63034d bitrateSelector = C80716a.C80717a.f180462a.mo123864a().getBitrateSelector();
                if (bitrateSelector != null) {
                    bitrateSelector.mo101166a(a);
                }
            }
        });
        pVar.f188191e = a;
        pVar.f188208v = C80716a.C80717a.f180462a.mo123865b().frameWait();
        pVar.f188211y = iVar.getBitRatedRatioUri();
        C84229a.f188297a.mo129049a(pVar.f188211y, iVar.getFileCheckSum());
        pVar.f188205s = m140674a();
        pVar.f188160aE = C80716a.C80717a.f180462a.mo123865b().isDirectUrlCheckInfoEnable();
        boolean z12 = false;
        if (f181142a) {
            f181142a = false;
            if (z3) {
                pVar.f188149U = "pre";
            } else {
                pVar.f188149U = "nor";
            }
        } else {
            pVar.f188149U = null;
        }
        if (!TextUtils.isEmpty(str)) {
            pVar.f188149U = str;
        }
        if (!TextUtils.isEmpty(xVar.getTag())) {
            pVar.f188149U = xVar.getTag();
        }
        if (!TextUtils.isEmpty(str2)) {
            pVar.f188150V = str2;
        }
        pVar.f188151W = C80716a.C80717a.f180462a.mo123864a().getAverageSpeedInKBps();
        if (!C84199c.f187979a.isUseVideoTextureRenderer() || !z8) {
            z10 = false;
        } else {
            z10 = true;
        }
        pVar.f188136H = z10;
        if (!z5) {
            z11 = true;
        } else if (C80716a.C80717a.f180462a.mo123864a().isHttpsVideoUrlModel(iVar)) {
            z11 = true;
            pVar.f188137I = true;
        } else {
            z11 = true;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", iVar.getSourceId());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C84231a.m144836b().monitorCommonLog("need_set_token_exception", jSONObject);
        }
        pVar.f188143O = z6;
        pVar.f188135G = i;
        if (C80716a.C80717a.f180462a.mo123865b().PlayeAbFixPrepareSeqTmpEnableExp() == z11) {
            z12 = true;
        }
        pVar.f188144P = z12;
        pVar.f188145Q = z9;
        pVar.f188153Y = iVar.getaK();
        if (!(nVar == null || nVar.f180646y == null)) {
            pVar.f188162aa = z11;
            pVar.f188163ab = nVar.f180646y.f180648a;
            pVar.f188164ac = nVar.f180646y.f180649b;
        }
        pVar.f188165ad = (int) iVar.getDuration();
        if (nVar != null) {
            pVar.f188167af = Float.valueOf(m140673a(nVar.f180623b, "loudness"));
            pVar.f188168ag = Float.valueOf(m140673a(nVar.f180623b, "peak"));
        }
        pVar.f188166ae = Float.valueOf(C80716a.C80717a.f180462a.mo123865b().getVolLoudUnity());
        pVar.f188177ap = C80716a.C80717a.f180462a.mo123865b().enableBufferTimeControl();
        pVar.f188178aq = C80716a.C80717a.f180462a.mo123865b().cacheDuration((int) iVar.getDuration());
        pVar.f188183av = C80716a.C80717a.f180462a.mo123864a().disableSleepResume(pVar.f188196j);
        pVar.f188141M = iVar.isColdBoot();
        pVar.f188182au = C80716a.C80717a.f180462a.mo123864a().enableFileIoOpt(pVar.f188196j);
        pVar.f188184aw = C80716a.C80717a.f180462a.mo123865b().resumeFileIoBlockDurationThreshold();
        pVar.f188185ax = C80716a.C80717a.f180462a.mo123865b().memCacheVideoDurationThreshold();
        pVar.f188186ay = C80716a.C80717a.f180462a.mo123865b().enableSplitVideoAudioPlayback();
        return pVar;
    }
}

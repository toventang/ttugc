package com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.simkit.model.BaseResponse;
import com.p2082ss.android.ugc.aweme.simkit.model.p3912a.C74675a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse */
public class RateSettingsResponse<T extends C74675a> extends BaseResponse {
    @AbstractC27891c(mo46611a = "adaptive_gear_group")
    private C74681c adaptiveGearGroup;
    @AbstractC27891c(mo46611a = "auto_biterate_curv")
    private C74679a autoBitrateCurve;
    @AbstractC27891c(mo46611a = "auto_bitrate_params")
    private C74680b autoBitrateSet;
    @AbstractC27891c(mo46611a = "auto_bitrate_params_live")
    private C74680b autoBitrateSetLive;
    @AbstractC27891c(mo46611a = "bandwidth_map")
    private List<BandwidthSet> bandwidthSet;
    @AbstractC27891c(mo46611a = "player_type_v2")
    private T decodeType;
    @AbstractC27891c(mo46611a = "default_gear_group")
    private String defaultGearGroup;
    @AbstractC27891c(mo46611a = "definition_gear_group")
    private C74681c definitionGearGroup;
    @AbstractC27891c(mo46611a = "flow_gear_group")
    private C74681c flowGearGroup;
    @AbstractC27891c(mo46611a = "gear_set")
    private List<GearSet> gearSet;

    static {
        Covode.recordClassIndex(87506);
    }

    /* renamed from: com_ss_android_ugc_aweme_simkit_model_bitrateselect_RateSettingsResponse_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m131143x4083a2ee(String str, String str2) {
        return 0;
    }

    public C74681c getAdaptiveGearGroup() {
        return this.adaptiveGearGroup;
    }

    public C74680b getAutoBitrateSet() {
        return this.autoBitrateSet;
    }

    public C74680b getAutoBitrateSetLive() {
        return this.autoBitrateSetLive;
    }

    public List<BandwidthSet> getBandwidthSet() {
        return this.bandwidthSet;
    }

    public C74675a getDecodeType() {
        return this.decodeType;
    }

    public String getDefaultGearGroup() {
        return this.defaultGearGroup;
    }

    public C74681c getDefinitionGearGroup() {
        return this.definitionGearGroup;
    }

    public C74681c getFlowGearGroup() {
        return this.flowGearGroup;
    }

    public List<GearSet> getGearSet() {
        return this.gearSet;
    }

    public C74680b getLowQltyCurv() {
        C74679a aVar = this.autoBitrateCurve;
        if (aVar == null) {
            return null;
        }
        return aVar.f167864b;
    }

    public C74680b getHighBitrateCurve() {
        C74680b bVar;
        C74679a aVar = this.autoBitrateCurve;
        if (aVar != null && (bVar = aVar.f167863a) != null) {
            return bVar;
        }
        C74680b bVar2 = this.autoBitrateSet;
        m131143x4083a2ee("wbp-video-quality", "getHighBitrateCurve: got null, fallback to default.");
        return bVar2;
    }

    public boolean isValid() {
        if (this.adaptiveGearGroup == null) {
            return false;
        }
        if (this.gearSet == null && this.bandwidthSet == null && this.autoBitrateSet == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.model.BaseResponse
    public String toString() {
        return "RateSettingsResponse{flowGearGroup=" + this.flowGearGroup + ", adaptiveGearGroup=" + this.adaptiveGearGroup + ", defaultGearGroup='" + this.defaultGearGroup + '\'' + ", definitionGearGroup=" + this.definitionGearGroup + ", gearSet=" + this.gearSet + ", bandwidthSet=" + this.bandwidthSet + ", autoBitrateSet=" + this.autoBitrateSet + '}';
    }

    public void setAdaptiveGearGroup(C74681c cVar) {
        this.adaptiveGearGroup = cVar;
    }

    public void setAutoBitrateSet(C74680b bVar) {
        this.autoBitrateSet = bVar;
    }

    public void setAutoBitrateSetLive(C74680b bVar) {
        this.autoBitrateSetLive = bVar;
    }

    public void setBandwidthSet(List<BandwidthSet> list) {
        this.bandwidthSet = list;
    }

    public void setDefaultGearGroup(String str) {
        this.defaultGearGroup = str;
    }

    public void setDefinitionGearGroup(C74681c cVar) {
        this.definitionGearGroup = cVar;
    }

    public void setFlowGearGroup(C74681c cVar) {
        this.flowGearGroup = cVar;
    }

    public void setGearSet(List<GearSet> list) {
        this.gearSet = list;
    }
}

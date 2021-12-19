package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HotSearchWitch */
public class HotSearchWitch {
    @AbstractC27891c(mo46611a = "hotsearch_aweme_billboard_switch")
    private Boolean hotsearchAwemeBillboardSwitch;
    @AbstractC27891c(mo46611a = "hotsearch_billboard_switch")
    private Boolean hotsearchBillboardSwitch;
    @AbstractC27891c(mo46611a = "hotsearch_music_billboard_switch")
    private Boolean hotsearchMusicBillboardSwitch;
    @AbstractC27891c(mo46611a = "hotsearch_positive_energy_billboard_switch")
    private Boolean hotsearchPositiveEnergyBillboardSwitch;
    @AbstractC27891c(mo46611a = "hotsearch_star_billboard_switch")
    private Boolean hotsearchStarBillboardSwitch;

    static {
        Covode.recordClassIndex(62362);
    }

    public Boolean getHotsearchAwemeBillboardSwitch() {
        Boolean bool = this.hotsearchAwemeBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getHotsearchBillboardSwitch() {
        Boolean bool = this.hotsearchBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getHotsearchMusicBillboardSwitch() {
        Boolean bool = this.hotsearchMusicBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getHotsearchPositiveEnergyBillboardSwitch() {
        Boolean bool = this.hotsearchPositiveEnergyBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getHotsearchStarBillboardSwitch() {
        Boolean bool = this.hotsearchStarBillboardSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}

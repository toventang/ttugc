package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings */
public class FlipChatSettings {
    @AbstractC27891c(mo46611a = "main_switch")
    private Boolean mainSwitch;
    @AbstractC27891c(mo46611a = "msg_cell_avatar_url")
    private String msgCellAvatarUrl;
    @AbstractC27891c(mo46611a = "msg_cell_name")
    private String msgCellName;
    @AbstractC27891c(mo46611a = "show_launch_page_popup")
    private Boolean showLaunchPagePopup;
    @AbstractC27891c(mo46611a = "show_login_icon")
    private Boolean showLoginIcon;
    @AbstractC27891c(mo46611a = "show_msg_cell")
    private Boolean showMsgCell;

    static {
        Covode.recordClassIndex(62353);
    }

    public Boolean getMainSwitch() {
        return this.mainSwitch;
    }

    public Boolean getShowLaunchPagePopup() {
        return this.showLaunchPagePopup;
    }

    public Boolean getShowLoginIcon() {
        return this.showLoginIcon;
    }

    public Boolean getShowMsgCell() {
        return this.showMsgCell;
    }

    public String getMsgCellAvatarUrl() {
        String str = this.msgCellAvatarUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getMsgCellName() {
        String str = this.msgCellName;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}

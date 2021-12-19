package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ThirdPlatformLoginSettings */
public class ThirdPlatformLoginSettings {
    @AbstractC27891c(mo46611a = "login_jump")
    private List<LoginJumpStruct> loginJump = new ArrayList();
    @AbstractC27891c(mo46611a = "other_bind_window")
    private List<BindWindowsStruct> otherBindWindow = new ArrayList();
    @AbstractC27891c(mo46611a = "profile_bind_window")
    private List<BindWindowsStruct> profileBindWindow = new ArrayList();

    static {
        Covode.recordClassIndex(62402);
    }

    public List<LoginJumpStruct> getLoginJump() {
        return this.loginJump;
    }

    public List<BindWindowsStruct> getOtherBindWindow() {
        return this.otherBindWindow;
    }

    public List<BindWindowsStruct> getProfileBindWindow() {
        return this.profileBindWindow;
    }
}

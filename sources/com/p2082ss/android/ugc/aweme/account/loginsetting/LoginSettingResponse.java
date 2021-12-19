package com.p2082ss.android.ugc.aweme.account.loginsetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse */
public class LoginSettingResponse {
    @AbstractC27891c(mo46611a = "data")
    private List<SettingInfo> data;
    @AbstractC27891c(mo46611a = "status_code")
    private int status_code;
    @AbstractC27891c(mo46611a = "status_msg")
    private String status_msg;

    static {
        Covode.recordClassIndex(39610);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse$SettingInfo */
    public static class SettingInfo {
        @AbstractC27891c(mo46611a = "button_dialog")
        private String button_dialog;
        private String dialog_content;
        private String dialog_title;
        @AbstractC27891c(mo46611a = "error_codes")
        private List<Integer> error_codes;
        public boolean has_logined_successfully_in_history;
        @AbstractC27891c(mo46611a = "jump_type")
        private int jump_type;
        @AbstractC27891c(mo46611a = "jump_url")
        private String jump_url;
        private String l_button_dialog;
        @AbstractC27891c(mo46611a = "l_jump_type")
        private int l_jump_type;
        @AbstractC27891c(mo46611a = "l_jump_url")
        private String l_jump_url;
        private int login_platform;
        @AbstractC27891c(mo46611a = "plan_type")
        private int plan_type;
        public String platform = "";
        private String r_button_dialog;
        @AbstractC27891c(mo46611a = "r_jump_type")
        private int r_jump_type;
        @AbstractC27891c(mo46611a = "r_jump_url")
        private String r_jump_url;
        public String secUid = "";

        static {
            Covode.recordClassIndex(39611);
        }

        public String getButton_dialog() {
            return this.button_dialog;
        }

        public String getDialog_content() {
            return this.dialog_content;
        }

        public String getDialog_title() {
            return this.dialog_title;
        }

        public int getJump_type() {
            return this.jump_type;
        }

        public String getJump_url() {
            return this.jump_url;
        }

        public String getL_button_dialog() {
            return this.l_button_dialog;
        }

        public int getL_jump_type() {
            return this.l_jump_type;
        }

        public String getL_jump_url() {
            return this.l_jump_url;
        }

        public int getLogin_platform() {
            return this.login_platform;
        }

        public int getPlan_type() {
            return this.plan_type;
        }

        public String getR_button_dialog() {
            return this.r_button_dialog;
        }

        public int getR_jump_type() {
            return this.r_jump_type;
        }

        public String getR_jump_url() {
            return this.r_jump_url;
        }

        public List<Integer> getError_codes() {
            List<Integer> list = this.error_codes;
            if (list == null) {
                return Collections.EMPTY_LIST;
            }
            return list;
        }

        public SettingInfo() {
        }

        public void setButton_dialog(String str) {
            this.button_dialog = str;
        }

        public void setDialog_content(String str) {
            this.dialog_content = str;
        }

        public void setDialog_title(String str) {
            this.dialog_title = str;
        }

        public void setError_codes(List<Integer> list) {
            this.error_codes = list;
        }

        public void setJump_type(int i) {
            this.jump_type = i;
        }

        public void setJump_url(String str) {
            this.jump_url = str;
        }

        public void setL_button_dialog(String str) {
            this.l_button_dialog = str;
        }

        public void setL_jump_type(int i) {
            this.l_jump_type = i;
        }

        public void setL_jump_url(String str) {
            this.l_jump_url = str;
        }

        public void setLogin_platform(int i) {
            this.login_platform = i;
        }

        public void setPlan_type(int i) {
            this.plan_type = i;
        }

        public void setR_button_dialog(String str) {
            this.r_button_dialog = str;
        }

        public void setR_jump_type(int i) {
            this.r_jump_type = i;
        }

        public void setR_jump_url(String str) {
            this.r_jump_url = str;
        }

        public SettingInfo(String str, String str2, String str3, String str4) {
            this.dialog_title = str;
            this.dialog_content = str2;
            this.l_button_dialog = str3;
            this.r_button_dialog = str4;
        }
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public List<SettingInfo> getData() {
        List<SettingInfo> list = this.data;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public void setData(List<SettingInfo> list) {
        this.data = list;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}

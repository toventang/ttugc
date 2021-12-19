package com.bytedance.geckox.settings.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.Common;
import com.google.gson.p2018a.AbstractC27891c;

public class SettingsRequestBody {
    @AbstractC27891c(mo46611a = "common")
    private Common common;
    @AbstractC27891c(mo46611a = "settings")
    private Settings settings;

    static {
        Covode.recordClassIndex(17178);
    }

    public static class Settings {
        @AbstractC27891c(mo46611a = "env")
        private int env;
        @AbstractC27891c(mo46611a = "version")
        private int version;

        static {
            Covode.recordClassIndex(17179);
        }

        public int getEnv() {
            return this.env;
        }

        public int getVersion() {
            return this.version;
        }

        public Settings(int i, int i2) {
            this.version = i;
            this.env = i2;
        }
    }

    public Common getCommon() {
        return this.common;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public void setCommon(Common common2) {
        this.common = common2;
    }

    public void setSettings(Settings settings2) {
        this.settings = settings2;
    }
}

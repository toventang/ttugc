package com.bytedance.bpea.store.policy;

import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;

public final class PrivacyPolicyStore {
    public static final PrivacyPolicyStore INSTANCE = new PrivacyPolicyStore();

    public static /* synthetic */ void audioPrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void clipboardPrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void latitudeAndLongitudePrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void locationPrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void videoPrivacyPolicy$annotations() {
    }

    private PrivacyPolicyStore() {
    }

    static {
        Covode.recordClassIndex(15401);
    }

    public static final C13350k getAudioPrivacyPolicy() {
        return new C13350k("304", "When there is a reasonable purpose scenario, apply for PIA evaluation.", DataType.AUDIO, "2021-05-06 20:00:55");
    }

    public static final C13350k getClipboardPrivacyPolicy() {
        return new C13350k("365", "Reading data from the clipboard is not recommended if there is any alternative. Writing or reading data to/from clipboard in the background is prohibited. A clear tip is a must if writing data to the clipboard occurs.", "clipboard", "2021-05-23 15:36:04");
    }

    public static final C13350k getLatitudeAndLongitudePrivacyPolicy() {
        return new C13350k("27", "When there is a reasonable purpose scenario, apply for PIA evaluation.", "latitudeAndLongitude", "2021-05-06 20:01:06");
    }

    public static final C13350k getLocationPrivacyPolicy() {
        return new C13350k("10002", "When there is a reasonable purpose scenario, apply for PIA evaluation.", "location", "2021-05-06 20:01:04");
    }

    public static final C13350k getVideoPrivacyPolicy() {
        return new C13350k("192", "When there is a reasonable purpose scenario, apply for PIA evaluation.", "video", "2021-05-06 20:00:56");
    }
}

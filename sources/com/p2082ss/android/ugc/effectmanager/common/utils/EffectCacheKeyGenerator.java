package com.p2082ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.EffectCacheKeyGenerator */
public final class EffectCacheKeyGenerator {
    static {
        Covode.recordClassIndex(95510);
    }

    public static String generateHotStickerKey() {
        return "effectgalleryhot";
    }

    private EffectCacheKeyGenerator() {
    }

    public static String generateCategoryCachePattern(String str) {
        return str + File.separator + "effectchannel(.*)";
    }

    public static String generateCategoryVersionPattern(String str) {
        return str + File.separator + "category_version(.*)";
    }

    public static String generatePanelInfoVersionKey(String str) {
        return str + File.separator + "effect_version";
    }

    public static String generatePanelInfoVersionPattern(String str) {
        return str + File.separator + "effect_version(.*)";
    }

    public static String generatePanelPattern(String str) {
        return "effectchannel" + str + "(.*)";
    }

    public static String generateCategoryVersionKey(String str, String str2) {
        return str + File.separator + "category_version" + str2;
    }

    public static String generatePanelInfoKey(String str, String str2) {
        return str2 + File.separator + "effectchannel" + str;
    }

    public static String generatePanelKey(String str, String str2) {
        return "effectchannel" + str2 + str;
    }

    public static String generateCategoryEffectKey(String str, String str2, int i, int i2, int i3) {
        return str + File.separator + "effectchannel" + str2 + i + "_" + i2 + "_" + i3;
    }
}

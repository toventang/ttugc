package com.p2082ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.AbstractC14409e;
import com.bytedance.cukaie.closet.internal.AbstractC14412a;

/* renamed from: com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences_CukaieClosetAdapter */
public final class IVideoRecordPreferences_CukaieClosetAdapter extends AbstractC14412a implements IVideoRecordPreferences {
    static {
        Covode.recordClassIndex(74546);
    }

    public final int getResourcesVersion() {
        return super.getStore().mo23220a("resources_version", 0);
    }

    public IVideoRecordPreferences_CukaieClosetAdapter(AbstractC14409e eVar) {
        super(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final int getCountDownMode(int i) {
        return super.getStore().mo23220a("count_down_mode", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final String getCreativeToolRootDir(String str) {
        return super.getStore().mo23222a("creative_tools_root_path", str);
    }

    public final long getMainPlusClickedTime(long j) {
        return super.getStore().mo23221a("main_plus_clicked_time", j);
    }

    public final long getMainPlusShowBubbleTime(long j) {
        return super.getStore().mo23221a("main_plus_show_bubble_time", j);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final String getPublishParallelUploadRecoverPath(String str) {
        return super.getStore().mo23222a("publish_parallel_uploadRecoverPath", str);
    }

    public final float getUlikeBeautyBlushDefault(float f) {
        return super.getStore().mo23219a("ulikebeauty_blush_default", f);
    }

    public final float getUlikeBeautyBlushMax(float f) {
        return super.getStore().mo23219a("ulikebeauty_blush_max", f);
    }

    public final String getUlikeBeautyDownloadData(String str) {
        return super.getStore().mo23222a("ulikebeauty_download_data", str);
    }

    public final float getUlikeBeautyEyeMax(float f) {
        return super.getStore().mo23219a("ulikebeauty_eye_max", f);
    }

    public final float getUlikeBeautyLipDefault(float f) {
        return super.getStore().mo23219a("ulikebeauty_lip_default", f);
    }

    public final float getUlikeBeautyLipMax(float f) {
        return super.getStore().mo23219a("ulikebeauty_lip_max", f);
    }

    public final float getUlikeBeautyShapeDefault(float f) {
        return super.getStore().mo23219a("ulikebeauty_shape_default", f);
    }

    public final float getUlikeBeautyShapeMax(float f) {
        return super.getStore().mo23219a("ulikebeauty_shape_max", f);
    }

    public final float getUlikeBeautySharpDefault(float f) {
        return super.getStore().mo23219a("ulikebeauty_sharp_default", f);
    }

    public final float getUlikeBeautySharpMax(float f) {
        return super.getStore().mo23219a("ulikebeauty_sharp_max", f);
    }

    public final float getUlikeBeautySmoothDefault(float f) {
        return super.getStore().mo23219a("ulikebeauty_smooth_default", f);
    }

    public final float getUlikeBeautySmoothMax(float f) {
        return super.getStore().mo23219a("ulikebeauty_smooth_max", f);
    }

    public final float getUlikeEyeDefault(float f) {
        return super.getStore().mo23219a("ulikebeauty_eye_default", f);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final String getUploadRecoverPath(String str) {
        return super.getStore().mo23222a("uploadRecoverPath", str);
    }

    public final long getZTLastInsertTime(long j) {
        return super.getStore().mo23221a("ZT_Last_Insert_Time", j);
    }

    public final boolean isBlessingTagClicked(boolean z) {
        return super.getStore().mo23224a("has_click_blessing_tag", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final boolean isDurationModeManuallyChange(boolean z) {
        return super.getStore().mo23224a("is_duration_mode_manually_change", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final boolean isFirstEnterRecordPage(boolean z) {
        return super.getStore().mo23224a("is_first_enter_record_page", z);
    }

    public final void setBlessingTagClicked(boolean z) {
        super.getStore().mo23232b("has_click_blessing_tag", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setCountDownMode(int i) {
        super.getStore().mo23228b("count_down_mode", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setCreativeToolRootDir(String str) {
        super.getStore().mo23230b("creative_tools_root_path", str);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setDurationModeManuallyChange(boolean z) {
        super.getStore().mo23232b("is_duration_mode_manually_change", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setFirstEnterRecordPage(boolean z) {
        super.getStore().mo23232b("is_first_enter_record_page", z);
    }

    public final void setMainPlusClickedTime(long j) {
        super.getStore().mo23229b("main_plus_clicked_time", j);
    }

    public final void setMainPlusHasShowBubble(long j) {
        super.getStore().mo23229b("main_plus_show_bubble_time", j);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setPublishParallelUploadRecoverPath(String str) {
        super.getStore().mo23230b("publish_parallel_uploadRecoverPath", str);
    }

    public final void setResourcesVersion(int i) {
        super.getStore().mo23228b("resources_version", i);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setShouldShowCountDownNewTag(boolean z) {
        super.getStore().mo23232b("count_down_new_tag", z);
    }

    public final void setUlikeBeautyBlushDefault(float f) {
        super.getStore().mo23227b("ulikebeauty_blush_default", f);
    }

    public final void setUlikeBeautyBlushMax(float f) {
        super.getStore().mo23227b("ulikebeauty_blush_max", f);
    }

    public final void setUlikeBeautyDownloadData(String str) {
        super.getStore().mo23230b("ulikebeauty_download_data", str);
    }

    public final void setUlikeBeautyEyeDefault(float f) {
        super.getStore().mo23227b("ulikebeauty_eye_default", f);
    }

    public final void setUlikeBeautyEyeMax(float f) {
        super.getStore().mo23227b("ulikebeauty_eye_max", f);
    }

    public final void setUlikeBeautyLipDefault(float f) {
        super.getStore().mo23227b("ulikebeauty_lip_default", f);
    }

    public final void setUlikeBeautyLipMax(float f) {
        super.getStore().mo23227b("ulikebeauty_lip_max", f);
    }

    public final void setUlikeBeautyShapeDefault(float f) {
        super.getStore().mo23227b("ulikebeauty_shape_default", f);
    }

    public final void setUlikeBeautyShapeMax(float f) {
        super.getStore().mo23227b("ulikebeauty_shape_max", f);
    }

    public final void setUlikeBeautySharpDefault(float f) {
        super.getStore().mo23227b("ulikebeauty_sharp_default", f);
    }

    public final void setUlikeBeautySharpMax(float f) {
        super.getStore().mo23227b("ulikebeauty_sharp_max", f);
    }

    public final void setUlikeBeautySmoothDefault(float f) {
        super.getStore().mo23227b("ulikebeauty_smooth_default", f);
    }

    public final void setUlikeBeautySmoothMax(float f) {
        super.getStore().mo23227b("ulikebeauty_smooth_max", f);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setUploadRecoverPath(String str) {
        super.getStore().mo23230b("uploadRecoverPath", str);
    }

    public final void setZTLastInsertTime(long j) {
        super.getStore().mo23229b("ZT_Last_Insert_Time", j);
    }

    public final boolean shouldShowCountDownNewTag(boolean z) {
        return super.getStore().mo23224a("count_down_new_tag", z);
    }
}

package com.p2082ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.p950a.AbstractC14403a;
import com.bytedance.cukaie.closet.p950a.AbstractC14404b;
import com.bytedance.cukaie.closet.p950a.AbstractC14405c;

@AbstractC14403a(mo23216a = "VideoRecord")
/* renamed from: com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences */
public interface IVideoRecordPreferences {
    static {
        Covode.recordClassIndex(74545);
    }

    @AbstractC14405c(mo23218a = "count_down_mode")
    int getCountDownMode(int i);

    @AbstractC14405c(mo23218a = "creative_tools_root_path")
    String getCreativeToolRootDir(String str);

    @AbstractC14405c(mo23218a = "publish_parallel_uploadRecoverPath")
    String getPublishParallelUploadRecoverPath(String str);

    @AbstractC14405c(mo23218a = "uploadRecoverPath")
    String getUploadRecoverPath(String str);

    @AbstractC14405c(mo23218a = "is_duration_mode_manually_change")
    boolean isDurationModeManuallyChange(boolean z);

    @AbstractC14405c(mo23218a = "is_first_enter_record_page")
    boolean isFirstEnterRecordPage(boolean z);

    @AbstractC14404b(mo23217a = "count_down_mode")
    void setCountDownMode(int i);

    @AbstractC14404b(mo23217a = "creative_tools_root_path")
    void setCreativeToolRootDir(String str);

    @AbstractC14404b(mo23217a = "is_duration_mode_manually_change")
    void setDurationModeManuallyChange(boolean z);

    @AbstractC14404b(mo23217a = "is_first_enter_record_page")
    void setFirstEnterRecordPage(boolean z);

    @AbstractC14404b(mo23217a = "publish_parallel_uploadRecoverPath")
    void setPublishParallelUploadRecoverPath(String str);

    @AbstractC14404b(mo23217a = "count_down_new_tag")
    void setShouldShowCountDownNewTag(boolean z);

    @AbstractC14404b(mo23217a = "uploadRecoverPath")
    void setUploadRecoverPath(String str);
}

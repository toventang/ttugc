package com.p2082ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.d */
public class C61288d implements Serializable {
    @AbstractC27891c(mo46611a = "beat_mv_bit_info")
    public C61285a beatMvInfo;
    @AbstractC27891c(mo46611a = "birthday_bless_mv_param")
    public C61286b birthdayBlessMvParam;
    @AbstractC27891c(mo46611a = "mv_contact_video_path")
    public String contactVideoPath;
    @AbstractC27891c(mo46611a = "enable_mv_origin_audio")
    public boolean enableOriginAudio;
    @AbstractC27891c(mo46611a = "is_beat_mv")
    public boolean isBeatMv;
    @AbstractC27891c(mo46611a = "is_mv_rs_1080p")
    public boolean isMVRes1080p;
    @AbstractC27891c(mo46611a = "is_mixed_template")
    public boolean isMixedTemPlate;
    @AbstractC27891c(mo46611a = "is_red_packet_mv")
    public boolean isRedPacketMv;
    @AbstractC27891c(mo46611a = "is_slideshow_mode")
    public boolean isSlideshowMode = false;
    @AbstractC27891c(mo46611a = "is_upload_sticker")
    public boolean isUploadSticker;
    @AbstractC27891c(mo46611a = "is_use_rgba_mode")
    public boolean isUseRGBAMode;
    @AbstractC27891c(mo46611a = "ktv_audio_durations")
    public int[] ktvAudioDurations;
    @AbstractC27891c(mo46611a = "ktv_audio_paths")
    public String[] ktvAudioPaths;
    @AbstractC27891c(mo46611a = "local_algorithm_materials")
    public ArrayList<String> localAlgorithmMaterials = new ArrayList<>();
    @AbstractC27891c(mo46611a = "mask_file_data")
    public ArrayList<Object> maskFileData = new ArrayList<>();
    @AbstractC27891c(mo46611a = "ktv_mode")
    public int mode;
    @AbstractC27891c(mo46611a = "mv_video_music_ids")
    public List<String> musicIds;
    @AbstractC27891c(mo46611a = "mv_auto_save_toast")
    public String mvAutoSaveToast;
    @AbstractC27891c(mo46611a = "mv_durations")
    public ArrayList<Integer> mvDurations;
    @AbstractC27891c(mo46611a = "mv_id")
    public String mvId;
    @AbstractC27891c(mo46611a = "mv_video_res_unzippath")
    public String mvResUnzipPath;
    @AbstractC27891c(mo46611a = "mv_type")
    public int mvType;
    @AbstractC27891c(mo46611a = "new_mask_file_data")
    public ArrayList<MvNetFileBean> newMaskFileData = new ArrayList<>();
    @AbstractC27891c(mo46611a = "photo_to_save")
    public ArrayList<String> photoToSave = new ArrayList<>();
    @AbstractC27891c(mo46611a = "rgba_mode_res_ratio")
    public int resRatio;
    @AbstractC27891c(mo46611a = "select_media_list")
    public ArrayList<String> selectMediaList = new ArrayList<>();
    @AbstractC27891c(mo46611a = "source_item_list")
    public ArrayList<C61289e> sourceItemList = new ArrayList<>();
    @AbstractC27891c(mo46611a = "select_src_media_list")
    public ArrayList<String> srcSelectMediaList = new ArrayList<>();
    @AbstractC27891c(mo46611a = "select_src_media_types")
    public ArrayList<String> srcSelectMediaListTypes = new ArrayList<>();
    @AbstractC27891c(mo46611a = "mv_video_cover")
    public String videoCoverImgPath;
    @AbstractC27891c(mo46611a = "mv_video_cover_starttime")
    public int videoCoverStartTime;

    static {
        Covode.recordClassIndex(71907);
    }

    public boolean isBirthdayBlessMv() {
        if (this.birthdayBlessMvParam != null) {
            return true;
        }
        return false;
    }

    public boolean isBeatMvValidate() {
        if (!this.isBeatMv || this.beatMvInfo == null) {
            return false;
        }
        return true;
    }

    public int getImageCount() {
        if (!C84892d.m145850a(this.selectMediaList)) {
            return this.selectMediaList.size();
        }
        if (!C84892d.m145850a(this.sourceItemList)) {
            return this.sourceItemList.size();
        }
        return 0;
    }
}

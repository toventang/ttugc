package com.bytedance.android.live.base.model.media;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class VideoModel {
    private static final EnumC2985a DEFAULT_COVER_TYPE = EnumC2985a.LARGE;
    @AbstractC27891c(mo46611a = "allow_cache")
    private boolean allowCache;
    @AbstractC27891c(mo46611a = "avg_color")
    private int avgColor;
    @AbstractC27891c(mo46611a = "cover_medium")
    private ImageModel coverMediumModel;
    @AbstractC27891c(mo46611a = "cover")
    private ImageModel coverModel;
    @AbstractC27891c(mo46611a = "cover_thumb")
    private ImageModel coverThumbModel;
    @AbstractC27891c(mo46611a = "download_url")
    private List<String> downloadList;
    @AbstractC27891c(mo46611a = "duration")
    private double duration;
    @AbstractC27891c(mo46611a = "cover_animated", mo46612b = {"dynamic_cover"})
    private ImageModel dynamicCoverModel;
    @AbstractC27891c(mo46611a = "first_frame")
    private ImageModel firstFrame;
    @AbstractC27891c(mo46611a = "gif_type")
    private int gifType;
    @AbstractC27891c(mo46611a = "gif_url_list")
    private List<String> gifUrlList;
    @AbstractC27891c(mo46611a = "height")
    private int height;
    @AbstractC27891c(mo46611a = "long_duration")
    private float longDuration;
    @AbstractC27891c(mo46611a = "long_uri")
    private String longUri;
    @AbstractC27891c(mo46611a = "long_url")
    private List<String> longUrls;
    private EnumC2985a mCoverType = DEFAULT_COVER_TYPE;
    @AbstractC27891c(mo46611a = "preload_size")
    private int preloadSize = 512000;
    @AbstractC27891c(mo46611a = "quality_info")
    private List<Object> qualityInfo;
    @AbstractC27891c(mo46611a = "uri")
    private String uri;
    @AbstractC27891c(mo46611a = "url_list")
    private List<String> urlList;
    @AbstractC27891c(mo46611a = "videoLocalPath")
    private String videoLocalPath;
    @AbstractC27891c(mo46611a = "watermark")
    private boolean waterMark;
    @AbstractC27891c(mo46611a = "width")
    private int width;

    public List<Object> getBitRate() {
        return this.qualityInfo;
    }

    public ImageModel getCoverMediumModel() {
        return this.coverMediumModel;
    }

    public ImageModel getCoverModel() {
        return this.coverModel;
    }

    public ImageModel getCoverThumbModel() {
        return this.coverThumbModel;
    }

    public EnumC2985a getCoverType() {
        return this.mCoverType;
    }

    public List<String> getDownloadList() {
        return this.downloadList;
    }

    public double getDuration() {
        return this.duration;
    }

    public ImageModel getDynamicCoverModel() {
        return this.dynamicCoverModel;
    }

    public ImageModel getFirstFrame() {
        return this.firstFrame;
    }

    public int getGifType() {
        return this.gifType;
    }

    public List<String> getGifUrlList() {
        return this.gifUrlList;
    }

    public int getHeight() {
        return this.height;
    }

    public float getLongDuration() {
        return this.longDuration;
    }

    public String getLongUri() {
        return this.longUri;
    }

    public List<String> getLongUrls() {
        return this.longUrls;
    }

    public int getPreloadSize() {
        return this.preloadSize;
    }

    public List<Object> getQualityInfo() {
        return this.qualityInfo;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public String getVideoLocalPath() {
        return this.videoLocalPath;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowCache() {
        return this.allowCache;
    }

    public boolean isWaterMark() {
        return this.waterMark;
    }

    static {
        Covode.recordClassIndex(3439);
    }

    public String getUnbitratedUri() {
        if (TextUtils.isEmpty(getUri())) {
            return "";
        }
        return getUri();
    }

    /* renamed from: com.bytedance.android.live.base.model.media.VideoModel$a */
    public enum EnumC2985a {
        LARGE,
        MEDIUM,
        THUMB;

        static {
            Covode.recordClassIndex(3440);
        }
    }

    public void setAllowCache(boolean z) {
        this.allowCache = z;
    }

    public void setCoverMediumModel(ImageModel imageModel) {
        this.coverMediumModel = imageModel;
    }

    public void setCoverModel(ImageModel imageModel) {
        this.coverModel = imageModel;
    }

    public void setCoverThumbModel(ImageModel imageModel) {
        this.coverThumbModel = imageModel;
    }

    public void setCoverType(EnumC2985a aVar) {
        this.mCoverType = aVar;
    }

    public void setDownloadList(List<String> list) {
        this.downloadList = list;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setDynamicCoverModel(ImageModel imageModel) {
        this.dynamicCoverModel = imageModel;
    }

    public void setFirstFrame(ImageModel imageModel) {
        this.firstFrame = imageModel;
    }

    public void setGifType(int i) {
        this.gifType = i;
    }

    public void setGifUrlList(List<String> list) {
        this.gifUrlList = list;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLongDuration(float f) {
        this.longDuration = f;
    }

    public void setLongUri(String str) {
        this.longUri = str;
    }

    public void setLongUrls(List<String> list) {
        this.longUrls = list;
    }

    public void setPreloadSize(int i) {
        this.preloadSize = i;
    }

    public void setQualityInfo(List<Object> list) {
        this.qualityInfo = list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setVideoLocalPath(String str) {
        this.videoLocalPath = str;
    }

    public void setWaterMark(boolean z) {
        this.waterMark = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}

package com.p2082ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ktv.KtvAudioParam */
public final class KtvAudioParam implements Serializable {
    @AbstractC27891c(mo46611a = "audio_track_index")
    private int audioTrackIndex = -1;
    @AbstractC27891c(mo46611a = "audio_uuid")
    private String audioTrackUuid = "";
    @AbstractC27891c(mo46611a = "balance_filter_index")
    private int balanceFilter = -1;
    @AbstractC27891c(mo46611a = "play_url_duration")
    private int duration;
    @AbstractC27891c(mo46611a = "enable_audio_track")
    private boolean enableAudioTrack = true;
    @AbstractC27891c(mo46611a = "volume_loudness")
    private double loudness;
    @AbstractC27891c(mo46611a = "volume_peak")
    private double peak;
    @AbstractC27891c(mo46611a = "play_url_start")
    private int playStart;
    @AbstractC27891c(mo46611a = "play_url")
    private UrlModel playUrl;
    @AbstractC27891c(mo46611a = "play_time_list")
    private List<AudioInterval> timeList = new ArrayList();
    @AbstractC27891c(mo46611a = "volume")
    private float volume = 0.5f;
    @AbstractC27891c(mo46611a = "volume_filter_index_list")
    private List<C89378p<Integer, Boolean>> volumeFilters = new ArrayList();
    @AbstractC27891c(mo46611a = "volume_filter_uuid_list")
    private List<C89378p<String, Boolean>> volumeFiltersNLE = new ArrayList();

    static {
        Covode.recordClassIndex(68028);
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final String getAudioTrackUuid() {
        return this.audioTrackUuid;
    }

    public final int getBalanceFilter() {
        return this.balanceFilter;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean getEnableAudioTrack() {
        return this.enableAudioTrack;
    }

    public final double getLoudness() {
        return this.loudness;
    }

    public final double getPeak() {
        return this.peak;
    }

    public final int getPlayStart() {
        return this.playStart;
    }

    public final UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public final List<AudioInterval> getTimeList() {
        return this.timeList;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final List<C89378p<Integer, Boolean>> getVolumeFilters() {
        return this.volumeFilters;
    }

    public final List<C89378p<String, Boolean>> getVolumeFiltersNLE() {
        return this.volumeFiltersNLE;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setBalanceFilter(int i) {
        this.balanceFilter = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setEnableAudioTrack(boolean z) {
        this.enableAudioTrack = z;
    }

    public final void setLoudness(double d) {
        this.loudness = d;
    }

    public final void setPeak(double d) {
        this.peak = d;
    }

    public final void setPlayStart(int i) {
        this.playStart = i;
    }

    public final void setPlayUrl(UrlModel urlModel) {
        this.playUrl = urlModel;
    }

    public final void setVolume(float f) {
        this.volume = f;
    }

    public final void setAudioTrackUuid(String str) {
        C89219l.m154721d(str, "");
        this.audioTrackUuid = str;
    }

    public final void setTimeList(List<AudioInterval> list) {
        C89219l.m154721d(list, "");
        this.timeList = list;
    }

    public final void setVolumeFilters(List<C89378p<Integer, Boolean>> list) {
        C89219l.m154721d(list, "");
        this.volumeFilters = list;
    }

    public final void setVolumeFiltersNLE(List<C89378p<String, Boolean>> list) {
        C89219l.m154721d(list, "");
        this.volumeFiltersNLE = list;
    }
}

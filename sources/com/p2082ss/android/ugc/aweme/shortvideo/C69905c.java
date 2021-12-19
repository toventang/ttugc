package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.MusicBeat;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c */
public class C69905c implements AbstractC75370g, Serializable, Cloneable {
    @AbstractC27891c(mo46611a = "is_commerce_music")

    /* renamed from: a */
    boolean f156187a;
    @AbstractC27891c(mo46611a = "album")
    public String album;
    @AbstractC27891c(mo46611a = "audition_duration")
    public int auditionDuration;
    @AbstractC27891c(mo46611a = "author")
    public String authorName;
    @AbstractC27891c(mo46611a = "is_original_sound")

    /* renamed from: b */
    boolean f156188b;
    @AbstractC27891c(mo46611a = "dmv_auto_show")

    /* renamed from: c */
    boolean f156189c;
    @AbstractC27891c(mo46611a = "challenge")
    public AVChallenge challenge;
    @AbstractC27891c(mo46611a = "cover_large")
    public UrlModel coverLarge;
    @AbstractC27891c(mo46611a = "cover_medium")
    public UrlModel coverMedium;
    @AbstractC27891c(mo46611a = "cover_thumb")
    public UrlModel coverThumb;
    @AbstractC27891c(mo46611a = "duration")
    public int duration;
    @AbstractC27891c(mo46611a = "local_music_id")

    /* renamed from: e */
    private int f156190e;
    @AbstractC27891c(mo46611a = "extra")
    public String extra;
    @AbstractC27891c(mo46611a = "lyric_url")

    /* renamed from: f */
    private String f156191f;
    @AbstractC27891c(mo46611a = "preview_start_time")

    /* renamed from: g */
    private float f156192g;
    @AbstractC27891c(mo46611a = "lyric_type")

    /* renamed from: h */
    private int f156193h;
    @AbstractC27891c(mo46611a = "prevent_download")

    /* renamed from: i */
    private boolean f156194i;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    public long f156195id;
    @AbstractC27891c(mo46611a = "music_wave_data")

    /* renamed from: j */
    private float[] f156196j;
    @AbstractC27891c(mo46611a = "is_mv_theme_music")

    /* renamed from: k */
    private boolean f156197k;
    @AbstractC27891c(mo46611a = "log_pb")

    /* renamed from: l */
    private LogPbBean f156198l;
    @AbstractC27891c(mo46611a = "come_from_for_mod")

    /* renamed from: m */
    private int f156199m;
    @AbstractC27891c(mo46611a = "title")
    public String musicName;
    @AbstractC27891c(mo46611a = "status")
    public int musicStatus;
    @AbstractC27891c(mo46611a = "music_type")
    public int musicType;
    @AbstractC27891c(mo46611a = "category_id")

    /* renamed from: n */
    private String f156200n;
    @AbstractC27891c(mo46611a = "search_key_words")

    /* renamed from: o */
    private String f156201o;
    @AbstractC27891c(mo46611a = "offline_desc")
    public String offlineDesc;
    @AbstractC27891c(mo46611a = "song_id")

    /* renamed from: p */
    private String f156202p;
    @AbstractC27891c(mo46611a = "path")
    public String path;
    @AbstractC27891c(mo46611a = "play_url")
    public UrlModel playUrl;
    @AbstractC27891c(mo46611a = "stick_point_music_alg")

    /* renamed from: q */
    private C70762ea f156203q = new C70762ea();
    @AbstractC27891c(mo46611a = "music_priority")

    /* renamed from: r */
    private int f156204r;
    @AbstractC27891c(mo46611a = "video_duration")

    /* renamed from: s */
    private int f156205s;
    @AbstractC27891c(mo46611a = "shoot_duration")
    public int shootDuration;
    @AbstractC27891c(mo46611a = "strong_beat_url")
    public UrlModel strongBeatUrl;
    @AbstractC27891c(mo46611a = "is_pgc")

    /* renamed from: t */
    private boolean f156206t;
    @AbstractC27891c(mo46611a = "beat_info")

    /* renamed from: u */
    private MusicBeat f156207u;
    @AbstractC27891c(mo46611a = "user_count")
    public int userCount;
    @AbstractC27891c(mo46611a = "localmusic_duration")

    /* renamed from: v */
    private long f156208v;
    @AbstractC27891c(mo46611a = "mute_share")

    /* renamed from: w */
    private boolean f156209w;

    /* renamed from: x */
    private boolean f156210x;

    /* renamed from: y */
    private boolean f156211y;

    static {
        Covode.recordClassIndex(82314);
    }

    public String getAlbum() {
        return this.album;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public String getCategoryID() {
        return this.f156200n;
    }

    public int getComeFromForMod() {
        return this.f156199m;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public boolean getDmvAutoShow() {
        return this.f156189c;
    }

    public int getDuration() {
        return this.duration;
    }

    public long getId() {
        return this.f156195id;
    }

    public long getLocalMusicDuration() {
        return this.f156208v;
    }

    public int getLocalMusicId() {
        return this.f156190e;
    }

    public LogPbBean getLogPb() {
        return this.f156198l;
    }

    public int getLrcType() {
        return this.f156193h;
    }

    public String getLrcUrl() {
        return this.f156191f;
    }

    public MusicBeat getMusicBeat() {
        return this.f156207u;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicPriority() {
        return this.f156204r;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public int getMusicType() {
        return this.musicType;
    }

    public float[] getMusicWaveData() {
        return this.f156196j;
    }

    public String getName() {
        return this.musicName;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public float getPreviewStartTime() {
        return this.f156192g;
    }

    public String getSearchKeyWords() {
        return this.f156201o;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public String getSinger() {
        return this.authorName;
    }

    public String getSongId() {
        return this.f156202p;
    }

    public C70762ea getStickPointMusicAlg() {
        return this.f156203q;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g
    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public int getVideoDuration() {
        return this.f156205s;
    }

    public boolean isCollected() {
        return this.f156210x;
    }

    public boolean isCommerceMusic() {
        return this.f156187a;
    }

    public boolean isMuteShare() {
        return this.f156209w;
    }

    public boolean isMvThemeMusic() {
        return this.f156197k;
    }

    public boolean isNeedSetCookie() {
        return this.f156211y;
    }

    public boolean isOriginalSound() {
        return this.f156188b;
    }

    public boolean isPgc() {
        return this.f156206t;
    }

    public boolean isPreventDownload() {
        return this.f156194i;
    }

    public String getMid() {
        return String.valueOf(this.f156195id);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g
    public String getMusicId() {
        return String.valueOf(this.f156195id);
    }

    public int getPresenterDuration() {
        int i = this.shootDuration;
        if (i > 0) {
            return i;
        }
        return this.duration;
    }

    @Override // java.lang.Object
    public C69905c clone() {
        try {
            return (C69905c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int getRealAuditionDuration() {
        int i = this.auditionDuration;
        if (i > 0) {
            return i;
        }
        return getPresenterDuration();
    }

    public boolean isLocalMusic() {
        if (this.musicType == MusicModel.MusicType.LOCAL.ordinal()) {
            return true;
        }
        return false;
    }

    public String getPicBig() {
        UrlModel urlModel = this.coverLarge;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverLarge.getUrlList().isEmpty()) {
            return null;
        }
        return this.coverLarge.getUrlList().get(0);
    }

    public String getPicMedium() {
        UrlModel urlModel = this.coverMedium;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverMedium.getUrlList().isEmpty()) {
            return null;
        }
        return this.coverMedium.getUrlList().get(0);
    }

    public String getPicSmall() {
        UrlModel urlModel = this.coverThumb;
        if (urlModel == null || urlModel.getUrlList() == null || this.coverThumb.getUrlList().isEmpty()) {
            return null;
        }
        return this.coverThumb.getUrlList().get(0);
    }

    public void setCategoryID(String str) {
        this.f156200n = str;
    }

    public void setCollected(boolean z) {
        this.f156210x = z;
    }

    public void setComeFromForMod(int i) {
        this.f156199m = i;
    }

    public void setCommerceMusic(boolean z) {
        this.f156187a = z;
    }

    public void setDmvAutoShow(boolean z) {
        this.f156189c = z;
    }

    public void setLocalMusicDuration(long j) {
        this.f156208v = j;
    }

    public void setLocalMusicId(int i) {
        this.f156190e = i;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.f156198l = logPbBean;
    }

    public void setLrcType(int i) {
        this.f156193h = i;
    }

    public void setLrcUrl(String str) {
        this.f156191f = str;
    }

    public void setMusicBeat(MusicBeat musicBeat) {
        this.f156207u = musicBeat;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.AbstractC75370g
    public void setMusicPriority(int i) {
        this.f156204r = i;
    }

    public void setMusicWaveData(float[] fArr) {
        this.f156196j = fArr;
    }

    public void setMuteShare(boolean z) {
        this.f156209w = z;
    }

    public void setMvThemeMusic(boolean z) {
        this.f156197k = z;
    }

    public void setNeedSetCookie(boolean z) {
        this.f156211y = z;
    }

    public void setOriginalSound(boolean z) {
        this.f156188b = z;
    }

    public void setPgc(boolean z) {
        this.f156206t = z;
    }

    public void setPreventDownload(boolean z) {
        this.f156194i = z;
    }

    public void setPreviewStartTime(float f) {
        this.f156192g = f;
    }

    public void setSearchKeyWords(String str) {
        this.f156201o = str;
    }

    public void setSongId(String str) {
        this.f156202p = str;
    }

    public void setStickPointMusicAlg(C70762ea eaVar) {
        this.f156203q = eaVar;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }

    public void setVideoDuration(int i) {
        this.f156205s = i;
    }

    public void setMusicId(String str) {
        try {
            this.f156195id = Long.parseLong(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

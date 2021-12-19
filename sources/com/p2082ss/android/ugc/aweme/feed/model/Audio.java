package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Audio */
public final class Audio implements Serializable {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "CdnUrlExpired")
    public long CdnUrlExpired;
    @AbstractC27891c(mo46611a = "TtsInfos")
    public List<TtsInfos> TtsInfos;

    static {
        Covode.recordClassIndex(58611);
    }

    public Audio() {
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_Audio_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93158xe9190a8e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final List<C84235d> convertToSimAudio(Video video, Audio audio) {
        return Companion.convertToSimAudio(video, audio);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.Audio */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Audio copy$default(Audio audio, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = audio.CdnUrlExpired;
        }
        if ((i & 2) != 0) {
            list = audio.TtsInfos;
        }
        return audio.copy(j, list);
    }

    public final long component1() {
        return this.CdnUrlExpired;
    }

    public final List<TtsInfos> component2() {
        return this.TtsInfos;
    }

    public final Audio copy(long j, List<TtsInfos> list) {
        C89219l.m154721d(list, "");
        return new Audio(j, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Audio)) {
            return false;
        }
        Audio audio = (Audio) obj;
        return this.CdnUrlExpired == audio.CdnUrlExpired && C89219l.m154714a(this.TtsInfos, audio.TtsInfos);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_Audio_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m93158xe9190a8e(this.CdnUrlExpired) * 31;
        List<TtsInfos> list = this.TtsInfos;
        return com_ss_android_ugc_aweme_feed_model_Audio_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Audio(CdnUrlExpired=" + this.CdnUrlExpired + ", TtsInfos=" + this.TtsInfos + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.Audio$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58612);
        }

        /* renamed from: com_ss_android_ugc_aweme_feed_model_Audio$Companion_com_ss_android_ugc_aweme_lancet_LogLancet_d */
        public static int m93159xbbd60392(String str, String str2) {
            return 0;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        public final List<C84235d> convertToSimAudio(Video video, Audio audio) {
            List<TtsInfos> ttsInfos;
            T t;
            Object obj;
            List<String> urlList;
            String fileCS;
            String urlKey;
            String urlKey2;
            List<String> urlList2;
            BitRate bitRate;
            C89219l.m154721d(video, "");
            ArrayList arrayList = new ArrayList();
            if (!(audio == null || (ttsInfos = audio.getTtsInfos()) == null)) {
                Iterator<T> it = ttsInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.getVoiceType(), (Object) "2")) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null || t2.getPlayAddress() == null) {
                    return null;
                }
                if (C89219l.m154714a((Object) t2.getVoiceType(), (Object) "2")) {
                    C84235d.C84236a aVar = new C84235d.C84236a();
                    String voiceType = t2.getVoiceType();
                    if (voiceType != null) {
                        aVar.f188343a.setVoiceType(voiceType);
                    }
                    List<BitRate> bitRate2 = video.getBitRate();
                    if (!(bitRate2 == null || (bitRate = (BitRate) C89070n.m154583g((List) bitRate2)) == null)) {
                        aVar.f188343a.setBitRate(Integer.valueOf(bitRate.getBitRate()));
                    }
                    String lang = t2.getLang();
                    if (lang != null) {
                        aVar.f188343a.setLang(lang);
                    }
                    PlayAddress playAddress = t2.getPlayAddress();
                    if (!(playAddress == null || (urlList2 = playAddress.getUrlList()) == null)) {
                        aVar.mo129118a(urlList2);
                    }
                    PlayAddress playAddress2 = t2.getPlayAddress();
                    if (!(playAddress2 == null || (urlKey2 = playAddress2.getUrlKey()) == null)) {
                        aVar.f188343a.setFileKey(urlKey2);
                    }
                    PlayAddress playAddress3 = t2.getPlayAddress();
                    if (!(playAddress3 == null || (urlKey = playAddress3.getUrlKey()) == null)) {
                        aVar.f188343a.f188358d = urlKey;
                    }
                    aVar.f188343a.setCdnUrlExpired(Long.valueOf(audio.getCdnUrlExpired()));
                    PlayAddress playAddress4 = t2.getPlayAddress();
                    if (!(playAddress4 == null || (fileCS = playAddress4.getFileCS()) == null)) {
                        aVar.mo129117a(fileCS);
                    }
                    aVar.f188343a.setInfoId(Integer.valueOf(InfoIdType.TRANSLATED.getInfoId()));
                    try {
                        aVar.f188343a.setLoudness(Float.valueOf((float) new JSONObject(t2.getVolumeInfo()).getDouble("Loudness")));
                    } catch (JSONException unused) {
                        m93159xbbd60392("Audio.kt", "Loudness Exception");
                    }
                    try {
                        aVar.f188343a.setPeak(Float.valueOf((float) new JSONObject(t2.getVolumeInfo()).getDouble("Peak")));
                    } catch (JSONException unused2) {
                        m93159xbbd60392("Audio.kt", "Peak Exception");
                    }
                    aVar.f188343a.setCreateTime(SystemClock.elapsedRealtime());
                    arrayList.add(aVar.f188343a);
                }
                VideoUrlModel videoUrlModel = video.playAddr;
                if (videoUrlModel == null || (urlList = videoUrlModel.getUrlList()) == null) {
                    obj = null;
                } else {
                    obj = C89070n.m154583g((List) urlList);
                }
                if (obj == null) {
                    return null;
                }
                return arrayList;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.Audio$InfoIdType */
    public enum InfoIdType {
        ORIGINAL(1),
        TRANSLATED(2);
        
        private final int infoId;

        public final int getInfoId() {
            return this.infoId;
        }

        static {
            Covode.recordClassIndex(58613);
        }

        private InfoIdType(int i) {
            this.infoId = i;
        }
    }

    public final long getCdnUrlExpired() {
        return this.CdnUrlExpired;
    }

    public final List<TtsInfos> getTtsInfos() {
        return this.TtsInfos;
    }

    public Audio(long j, List<TtsInfos> list) {
        C89219l.m154721d(list, "");
        this.CdnUrlExpired = j;
        this.TtsInfos = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Audio(long j, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? -1 : j, list);
    }
}

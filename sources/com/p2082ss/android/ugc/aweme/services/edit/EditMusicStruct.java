package com.p2082ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.edit.EditMusicStruct */
public final class EditMusicStruct {
    @AbstractC27891c(mo46611a = "music_id")
    private String musicID = "";
    @AbstractC27891c(mo46611a = "music_time_range")
    private MusicTimeStruct musicTime = new MusicTimeStruct();
    @AbstractC27891c(mo46611a = "music_volume")
    private String musicVolume = "";

    static {
        Covode.recordClassIndex(79767);
    }

    public final String getMusicID() {
        return this.musicID;
    }

    public final MusicTimeStruct getMusicTime() {
        return this.musicTime;
    }

    public final String getMusicVolume() {
        return this.musicVolume;
    }

    public final void setMusicID(String str) {
        C89219l.m154721d(str, "");
        this.musicID = str;
    }

    public final void setMusicTime(MusicTimeStruct musicTimeStruct) {
        C89219l.m154721d(musicTimeStruct, "");
        this.musicTime = musicTimeStruct;
    }

    public final void setMusicVolume(String str) {
        C89219l.m154721d(str, "");
        this.musicVolume = str;
    }
}

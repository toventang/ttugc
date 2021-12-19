package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct */
public class InteractStickerStruct implements AbstractC75310e, Serializable {
    public String attr;
    @AbstractC27891c(mo46611a = "duet_with_me")
    public DuetStickerStruct duetStickerStruct;
    @AbstractC27891c(mo46611a = "hashtag_info")
    public HashtagStruct hashtagInfo;
    public int index;
    @AbstractC27891c(mo46611a = "auto_video_caption_info")
    public C75309d mCaptionStruct;
    @AbstractC27891c(mo46611a = "countdown_info")
    public CountDownStickerStruct mCountDownStickerStruct;
    @AbstractC27891c(mo46611a = "question_info")
    public QaStruct mQaStruct;
    @AbstractC27891c(mo46611a = "text_info")
    public String mTextStruct;
    @AbstractC27891c(mo46611a = "mention_info")
    public MentionStruct mentionInfo;
    @AbstractC27891c(mo46611a = "vote_info")
    public PollStruct pollStruct;
    @AbstractC27891c(mo46611a = "track_info")
    public String trackList;
    public int type;

    static {
        Covode.recordClassIndex(88214);
    }

    public String getAttr() {
        return this.attr;
    }

    public C75309d getCaptionStruct() {
        return this.mCaptionStruct;
    }

    public CountDownStickerStruct getCountDownStickerStruct() {
        return this.mCountDownStickerStruct;
    }

    public DuetStickerStruct getDuetStickerStruct() {
        return this.duetStickerStruct;
    }

    public HashtagStruct getHashtagInfo() {
        return this.hashtagInfo;
    }

    public int getIndex() {
        return this.index;
    }

    public MentionStruct getMentionInfo() {
        return this.mentionInfo;
    }

    public PollStruct getPollStruct() {
        return this.pollStruct;
    }

    public QaStruct getQaStruct() {
        return this.mQaStruct;
    }

    public String getTextStruct() {
        return this.mTextStruct;
    }

    public String getTrackList() {
        return this.trackList;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.index * 31;
    }

    public void setAttr(String str) {
        this.attr = str;
    }

    public void setCaptionStruct(C75309d dVar) {
        this.mCaptionStruct = dVar;
    }

    public void setCountDownStickerStruct(CountDownStickerStruct countDownStickerStruct) {
        this.mCountDownStickerStruct = countDownStickerStruct;
    }

    public void setDuetStickerStruct(DuetStickerStruct duetStickerStruct2) {
        this.duetStickerStruct = duetStickerStruct2;
    }

    public void setHashtagInfo(HashtagStruct hashtagStruct) {
        this.hashtagInfo = hashtagStruct;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setMentionInfo(MentionStruct mentionStruct) {
        this.mentionInfo = mentionStruct;
    }

    public void setPollStruct(PollStruct pollStruct2) {
        this.pollStruct = pollStruct2;
    }

    public void setQaStruct(QaStruct qaStruct) {
        this.mQaStruct = qaStruct;
    }

    public void setTextStruct(String str) {
        this.mTextStruct = str;
    }

    public void setTrackList(String str) {
        this.trackList = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
            if (this.type != interactStickerStruct.type || this.index != interactStickerStruct.index) {
                return false;
            }
            String str = this.trackList;
            if (str == null ? interactStickerStruct.trackList != null : !str.equals(interactStickerStruct.trackList)) {
                return false;
            }
            PollStruct pollStruct2 = this.pollStruct;
            if (pollStruct2 == null ? interactStickerStruct.pollStruct != null : !pollStruct2.equals(interactStickerStruct.pollStruct)) {
                return false;
            }
            HashtagStruct hashtagStruct = this.hashtagInfo;
            if (hashtagStruct == null ? interactStickerStruct.hashtagInfo != null : !hashtagStruct.equals(interactStickerStruct.hashtagInfo)) {
                return false;
            }
            MentionStruct mentionStruct = this.mentionInfo;
            if (mentionStruct == null ? interactStickerStruct.mentionInfo != null : !mentionStruct.equals(interactStickerStruct.mentionInfo)) {
                return false;
            }
            String str2 = this.mTextStruct;
            if (str2 == null ? interactStickerStruct.mTextStruct != null : !str2.equals(interactStickerStruct.mTextStruct)) {
                return false;
            }
            CountDownStickerStruct countDownStickerStruct = this.mCountDownStickerStruct;
            if (countDownStickerStruct == null ? interactStickerStruct.mCountDownStickerStruct != null : !countDownStickerStruct.equals(interactStickerStruct.mCountDownStickerStruct)) {
                return false;
            }
            QaStruct qaStruct = this.mQaStruct;
            if (qaStruct == null ? interactStickerStruct.mQaStruct != null : !qaStruct.equals(interactStickerStruct.mQaStruct)) {
                return false;
            }
            String str3 = this.attr;
            String str4 = interactStickerStruct.attr;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }
}

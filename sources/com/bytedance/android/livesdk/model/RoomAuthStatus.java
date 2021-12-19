package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class RoomAuthStatus {
    @AbstractC27891c(mo46611a = "GiftAnchorMt")
    int anchorGiftType;
    @AbstractC27891c(mo46611a = "GoldenEnvelope")
    int anchorRedEnvelopeType;
    @AbstractC27891c(mo46611a = "Banner")
    int bannerState;
    @AbstractC27891c(mo46611a = "ChatSubOnly")
    public boolean chatSubOnly;
    @AbstractC27891c(mo46611a = "DonationSticker")
    int donationSticker;
    @AbstractC27891c(mo46611a = "Chat")
    public boolean enableChat;
    @AbstractC27891c(mo46611a = "ChatL2")
    public boolean enableChatL2;
    @AbstractC27891c(mo46611a = "Danmaku")
    public boolean enableDanmaku;
    @AbstractC27891c(mo46611a = "Digg")
    public boolean enableDigg;
    @AbstractC27891c(mo46611a = "Gift")
    public boolean enableGift;
    @AbstractC27891c(mo46611a = "LuckMoney")
    boolean enableLuckMoney;
    @AbstractC27891c(mo46611a = "Promote")
    boolean enablePromote;
    @AbstractC27891c(mo46611a = "Props")
    public boolean enableProps;
    @AbstractC27891c(mo46611a = "InteractionQuestion")
    boolean enableQuestion;
    @AbstractC27891c(mo46611a = "RoomContributor")
    boolean enableRoomContributor;
    @AbstractC27891c(mo46611a = "Share")
    public boolean enableShare;
    @AbstractC27891c(mo46611a = "Viewers")
    boolean enableViewers;
    @AbstractC27891c(mo46611a = "Landscape")
    int landscape;
    @AbstractC27891c(mo46611a = "PublicScreen")
    public int messageType;
    @AbstractC27891c(mo46611a = "Rank")
    int rankState;
    @AbstractC27891c(mo46611a = "transaction_history")
    int rankingsSwitchStatus;
    @AbstractC27891c(mo46611a = "OffReason")
    RoomAuthOffReasons roomAuthOffReasons;
    @AbstractC27891c(mo46611a = "UserCount")
    int userCountDisplayState;

    static {
        Covode.recordClassIndex(11048);
    }

    public int getBannerState() {
        return this.bannerState;
    }

    public int getPublicScreenAuth() {
        return this.messageType;
    }

    public int getRankState() {
        return this.rankState;
    }

    public int getRankingsSwitchStatus() {
        return this.rankingsSwitchStatus;
    }

    public RoomAuthOffReasons getRoomAuthOffReasons() {
        return this.roomAuthOffReasons;
    }

    public int getUserCountDisplayState() {
        return this.userCountDisplayState;
    }

    public boolean isChatL2Enabled() {
        return this.enableChatL2;
    }

    public boolean isEnableChat() {
        return this.enableChat;
    }

    public boolean isEnableDanmaku() {
        return this.enableDanmaku;
    }

    public boolean isEnableDigg() {
        return this.enableDigg;
    }

    public boolean isEnableGift() {
        return this.enableGift;
    }

    public boolean isEnableLuckMoney() {
        return this.enableLuckMoney;
    }

    public boolean isEnablePromote() {
        return this.enablePromote;
    }

    public boolean isEnableProps() {
        return this.enableProps;
    }

    public boolean isEnableQuestion() {
        return this.enableQuestion;
    }

    public boolean isEnableRoomContributor() {
        return this.enableRoomContributor;
    }

    public boolean isEnableShare() {
        return this.enableShare;
    }

    public boolean isEnableViewers() {
        return this.enableViewers;
    }

    public boolean isEnableStickerDonation() {
        if (this.donationSticker == 1) {
            return true;
        }
        return false;
    }

    public boolean showRedEnvelope() {
        if (this.anchorRedEnvelopeType == 1) {
            return true;
        }
        return false;
    }

    public boolean isAnchorGiftEnable() {
        if (this.anchorGiftType != 2) {
            return true;
        }
        return false;
    }

    public boolean isBannerEnable() {
        if (this.bannerState != 2) {
            return true;
        }
        return false;
    }

    public boolean isEnableLandscape() {
        if (this.landscape != 2) {
            return true;
        }
        return false;
    }

    public boolean isMessageEnable() {
        if (this.messageType != 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Chat:").append(this.enableChat).append(" ; ");
        sb.append("Danmaku:").append(this.enableDanmaku).append(" ; ");
        sb.append("Gift:").append(this.enableGift).append(" ; ");
        sb.append("Props:").append(this.enableProps).append(" ; ");
        sb.append("Digg:").append(this.enableDigg).append(" ; ");
        sb.append("LuckMoney:").append(this.enableLuckMoney).append(" ; ");
        sb.append("RoomContributor:").append(this.enableRoomContributor).append(" ; ");
        sb.append("Banner:").append(this.bannerState).append(" ; ");
        sb.append("GiftAnchorMt:").append(this.anchorGiftType).append(" ; ");
        sb.append("PublicScreen:").append(this.messageType).append(" ; ");
        sb.append("DonationSticker:").append(this.donationSticker).append(" ; ");
        sb.append("Share").append(this.enableShare).append(" ; ");
        sb.append("Viewers").append(this.enableViewers).append(" ; ");
        sb.append("Red Envelope:").append(this.anchorRedEnvelopeType).append(" ; ");
        sb.append("ChatL2:").append(this.enableChatL2).append(" ; ");
        return sb.toString();
    }

    public void setBannerState(int i) {
        this.bannerState = i;
    }

    public void setChatL2Enabled(boolean z) {
        this.enableChatL2 = z;
    }

    public void setEnableChat(boolean z) {
        this.enableChat = z;
    }

    public void setEnableDanmaku(boolean z) {
        this.enableDanmaku = z;
    }

    public void setEnableDigg(boolean z) {
        this.enableDigg = z;
    }

    public void setEnableGift(boolean z) {
        this.enableGift = z;
    }

    public void setEnableLuckMoney(boolean z) {
        this.enableLuckMoney = z;
    }

    public void setEnablePromote(boolean z) {
        this.enablePromote = z;
    }

    public void setEnableProps(boolean z) {
        this.enableProps = z;
    }

    public void setEnableQuestion(boolean z) {
        this.enableQuestion = z;
    }

    public void setEnableRoomContributor(boolean z) {
        this.enableRoomContributor = z;
    }

    public void setEnableViewers(boolean z) {
        this.enableViewers = z;
    }

    public void setRankState(int i) {
        this.rankState = i;
    }

    public void setRankingsSwitchStatus(int i) {
        this.rankingsSwitchStatus = i;
    }

    public void setUserCountDisplayState(int i) {
        this.userCountDisplayState = i;
    }
}

package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class DiamondPackageExtra extends Extra {
    @AbstractC27891c(mo46611a = "recommended_packet_id")
    public int RecommendedPacketId;
    @AbstractC27891c(mo46611a = "badge_icon")
    private String mBadgeIcon;
    @AbstractC27891c(mo46611a = "channel")
    private String mChannel;
    @AbstractC27891c(mo46611a = "channel_id")
    private int mChannelId;
    @AbstractC27891c(mo46611a = "currency_list")
    private List<String> mCurrencyList;
    @AbstractC27891c(mo46611a = "default_currency")
    private String mDefaultCurrency;
    @AbstractC27891c(mo46611a = "is_default")
    private boolean mIsDefault;
    @AbstractC27891c(mo46611a = "is_recommend")
    private boolean mIsRecommend;
    @AbstractC27891c(mo46611a = "need_auth")
    private int mNeedAuth;
    @AbstractC27891c(mo46611a = "should_display_customized_web_recharge")
    public boolean officialRecharge;
    @AbstractC27891c(mo46611a = "recently_purchased_packet_id")
    public int recentlyPurchasedPacketId;

    static {
        Covode.recordClassIndex(12946);
    }

    public String getBadgeIcon() {
        return this.mBadgeIcon;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public int getChannelId() {
        return this.mChannelId;
    }

    public List<String> getCurrencyList() {
        return this.mCurrencyList;
    }

    public String getDefaultCurrency() {
        return this.mDefaultCurrency;
    }

    public boolean getIsDefault() {
        return this.mIsDefault;
    }

    public boolean getIsRecommend() {
        return this.mIsRecommend;
    }

    public int getNeedAuth() {
        return this.mNeedAuth;
    }

    public void setBadgeIcon(String str) {
        this.mBadgeIcon = str;
    }

    public void setChannel(String str) {
        this.mChannel = str;
    }

    public void setChannelId(int i) {
        this.mChannelId = i;
    }

    public void setCurrencyList(List<String> list) {
        this.mCurrencyList = list;
    }

    public void setDefaultCurrency(String str) {
        this.mDefaultCurrency = str;
    }

    public void setIsDefault(boolean z) {
        this.mIsDefault = z;
    }

    public void setIsRecommend(boolean z) {
        this.mIsRecommend = z;
    }

    public void setNeedAuth(int i) {
        this.mNeedAuth = i;
    }
}

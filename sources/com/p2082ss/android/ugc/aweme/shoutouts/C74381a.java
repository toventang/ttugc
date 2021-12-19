package com.p2082ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.a */
public final class C74381a implements Serializable {
    @AbstractC27891c(mo46611a = "money")

    /* renamed from: a */
    private int f167281a;
    @AbstractC27891c(mo46611a = "currency_name")

    /* renamed from: b */
    private String f167282b;
    @AbstractC27891c(mo46611a = "currency_character")

    /* renamed from: c */
    private String f167283c;
    @AbstractC27891c(mo46611a = "money_str")

    /* renamed from: d */
    private String f167284d;

    static {
        Covode.recordClassIndex(87158);
    }

    public final String getCurrencyCharacter() {
        return this.f167283c;
    }

    public final String getCurrencyName() {
        return this.f167282b;
    }

    public final int getMoney() {
        return this.f167281a;
    }

    public final String getMoneyStr() {
        return this.f167284d;
    }

    public final void setCurrencyCharacter(String str) {
        this.f167283c = str;
    }

    public final void setCurrencyName(String str) {
        this.f167282b = str;
    }

    public final void setMoney(int i) {
        this.f167281a = i;
    }

    public final void setMoneyStr(String str) {
        this.f167284d = str;
    }
}

package com.p2082ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.d */
public final class C74418d implements Serializable {
    public static final C74419a Companion = new C74419a((byte) 0);
    public static String MODE_CREATE = "1";
    public static String MODE_EDIT = "4";
    public static String MODE_POST = "2";
    public static String MODE_SEND = "3";
    public static String MOD_ORDER_ID = "order_id";
    public static String MOD_REVIEWED = "reviewed";
    public static String shootWay = "shoutouts";
    @AbstractC27891c(mo46611a = "so_product_id")

    /* renamed from: a */
    private String f167345a;
    @AbstractC27891c(mo46611a = "shoutouts_mode")

    /* renamed from: b */
    private String f167346b;
    @AbstractC27891c(mo46611a = "so_order_id")

    /* renamed from: c */
    private String f167347c;
    @AbstractC27891c(mo46611a = "des")

    /* renamed from: d */
    private String f167348d;
    @AbstractC27891c(mo46611a = "so_coins")

    /* renamed from: e */
    private int f167349e;
    @AbstractC27891c(mo46611a = "img")

    /* renamed from: f */
    private String f167350f;
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: g */
    private C74426g f167351g;
    @AbstractC27891c(mo46611a = "music_id")

    /* renamed from: h */
    private String f167352h;
    @AbstractC27891c(mo46611a = "buyer_payment")

    /* renamed from: i */
    private C74381a f167353i;
    @AbstractC27891c(mo46611a = "post_video_path")

    /* renamed from: j */
    private String f167354j;
    @AbstractC27891c(mo46611a = "reviewed")

    /* renamed from: k */
    private int f167355k;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.d$a */
    public static final class C74419a {
        static {
            Covode.recordClassIndex(87197);
        }

        private C74419a() {
        }

        public /* synthetic */ C74419a(byte b) {
            this();
        }
    }

    public final C74381a getBuyerMoneyDes() {
        return this.f167353i;
    }

    public final int getCoins() {
        return this.f167349e;
    }

    public final String getCoverUrl() {
        return this.f167350f;
    }

    public final String getDesc() {
        return this.f167348d;
    }

    public final String getMusicId() {
        return this.f167352h;
    }

    public final String getOrderId() {
        return this.f167347c;
    }

    public final String getPostVideoPath() {
        return this.f167354j;
    }

    public final C74426g getPrice() {
        return this.f167351g;
    }

    public final String getProductId() {
        return this.f167345a;
    }

    public final int getReviewed() {
        return this.f167355k;
    }

    public final String getShoutOutsMode() {
        return this.f167346b;
    }

    static {
        Covode.recordClassIndex(87196);
    }

    public final void setBuyerMoneyDes(C74381a aVar) {
        this.f167353i = aVar;
    }

    public final void setCoins(int i) {
        this.f167349e = i;
    }

    public final void setCoverUrl(String str) {
        this.f167350f = str;
    }

    public final void setDesc(String str) {
        this.f167348d = str;
    }

    public final void setMusicId(String str) {
        this.f167352h = str;
    }

    public final void setOrderId(String str) {
        this.f167347c = str;
    }

    public final void setPostVideoPath(String str) {
        this.f167354j = str;
    }

    public final void setPrice(C74426g gVar) {
        this.f167351g = gVar;
    }

    public final void setProductId(String str) {
        this.f167345a = str;
    }

    public final void setReviewed(int i) {
        this.f167355k = i;
    }

    public final void setShoutOutsMode(String str) {
        this.f167346b = str;
    }
}

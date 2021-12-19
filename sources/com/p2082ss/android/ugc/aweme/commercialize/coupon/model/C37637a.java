package com.p2082ss.android.ugc.aweme.commercialize.coupon.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.a */
public class C37637a extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "codabar_image_url")

    /* renamed from: A */
    private String f88969A;
    @AbstractC27891c(mo46611a = "pay_type")

    /* renamed from: B */
    private int f88970B;
    @AbstractC27891c(mo46611a = "desc")

    /* renamed from: C */
    private String f88971C;
    @AbstractC27891c(mo46611a = "coupon_id")

    /* renamed from: a */
    private int f88972a;
    @AbstractC27891c(mo46611a = "merchant_name")

    /* renamed from: b */
    private String f88973b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    private String f88974c;
    @AbstractC27891c(mo46611a = "can_rate")
    public int canRate;
    @AbstractC27891c(mo46611a = "condition")

    /* renamed from: d */
    private String f88975d;
    @AbstractC27891c(mo46611a = "valid_start")

    /* renamed from: e */
    private String f88976e;
    @AbstractC27891c(mo46611a = "valid_end")

    /* renamed from: f */
    private String f88977f;
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: g */
    private String f88978g;
    @AbstractC27891c(mo46611a = "code_id")

    /* renamed from: h */
    private String f88979h;
    @AbstractC27891c(mo46611a = "hint_text")
    public String hintText;
    @AbstractC27891c(mo46611a = "logo_image_url")

    /* renamed from: i */
    private UrlModel f88980i;
    @AbstractC27891c(mo46611a = "head_image_url")

    /* renamed from: j */
    private UrlModel f88981j;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: k */
    private int f88982k;
    @AbstractC27891c(mo46611a = "notification")

    /* renamed from: l */
    private String f88983l;
    @AbstractC27891c(mo46611a = "create_time")

    /* renamed from: m */
    private String f88984m;
    @AbstractC27891c(mo46611a = "user_id")

    /* renamed from: n */
    private Long f88985n;
    @AbstractC27891c(mo46611a = "sec_uid")

    /* renamed from: o */
    private String f88986o;
    @AbstractC27891c(mo46611a = "object_type")
    public int objectType;
    @AbstractC27891c(mo46611a = "group")

    /* renamed from: p */
    private String f88987p;
    @AbstractC27891c(mo46611a = "service_tel")

    /* renamed from: q */
    private String f88988q;
    @AbstractC27891c(mo46611a = "detail_url")

    /* renamed from: r */
    private String f88989r;
    @AbstractC27891c(mo46611a = "activity_id")

    /* renamed from: s */
    private int f88990s;
    @AbstractC27891c(mo46611a = "abbr_condition")

    /* renamed from: t */
    private String f88991t;
    @AbstractC27891c(mo46611a = "qrcode_url")

    /* renamed from: u */
    private UrlModel f88992u;
    @AbstractC27891c(mo46611a = "is_default_head_image")

    /* renamed from: v */
    private boolean f88993v;
    @AbstractC27891c(mo46611a = "valid_date_text")
    public String validDateText;
    @AbstractC27891c(mo46611a = "coupon_type")

    /* renamed from: w */
    private int f88994w;
    @AbstractC27891c(mo46611a = "coupon_source")

    /* renamed from: x */
    private int f88995x;
    @AbstractC27891c(mo46611a = "use_page_link")

    /* renamed from: y */
    private String f88996y;
    @AbstractC27891c(mo46611a = "store_page_link")

    /* renamed from: z */
    private String f88997z;

    static {
        Covode.recordClassIndex(45063);
    }

    public String getAbbrCondition() {
        return this.f88991t;
    }

    public int getActivityId() {
        return this.f88990s;
    }

    public String getCodabarImageUrl() {
        return this.f88969A;
    }

    public String getCode() {
        return this.f88978g;
    }

    public String getCodeId() {
        return this.f88979h;
    }

    public String getCondition() {
        return this.f88975d;
    }

    public int getCouponId() {
        return this.f88972a;
    }

    public int getCouponSource() {
        return this.f88995x;
    }

    public int getCouponType() {
        return this.f88994w;
    }

    public String getCreateTime() {
        return this.f88984m;
    }

    public String getDesc() {
        return this.f88971C;
    }

    public String getDetailUrl() {
        return this.f88989r;
    }

    public String getGroup() {
        return this.f88987p;
    }

    public UrlModel getHeadImageUrl() {
        return this.f88981j;
    }

    public UrlModel getLogoImageUrl() {
        return this.f88980i;
    }

    public String getMerchantName() {
        return this.f88973b;
    }

    public String getNotification() {
        return this.f88983l;
    }

    public int getPayType() {
        return this.f88970B;
    }

    public UrlModel getQrCodeUrl() {
        return this.f88992u;
    }

    public String getSecUid() {
        return this.f88986o;
    }

    public String getServiceTel() {
        return this.f88988q;
    }

    public int getStatus() {
        return this.f88982k;
    }

    public String getStorePageLink() {
        return this.f88997z;
    }

    public String getTitle() {
        return this.f88974c;
    }

    public String getUsePageLink() {
        return this.f88996y;
    }

    public Long getUserId() {
        return this.f88985n;
    }

    public String getValidEnd() {
        return this.f88977f;
    }

    public String getValidStart() {
        return this.f88976e;
    }

    public boolean isDefaultHeadImage() {
        return this.f88993v;
    }

    public void setAbbrCondition(String str) {
        this.f88991t = str;
    }

    public void setActivityId(int i) {
        this.f88990s = i;
    }

    public void setCodabarImageUrl(String str) {
        this.f88969A = str;
    }

    public void setCode(String str) {
        this.f88978g = str;
    }

    public void setCodeId(String str) {
        this.f88979h = str;
    }

    public void setCondition(String str) {
        this.f88975d = str;
    }

    public void setCouponId(int i) {
        this.f88972a = i;
    }

    public void setCouponSource(int i) {
        this.f88995x = i;
    }

    public void setCouponType(int i) {
        this.f88994w = i;
    }

    public void setCreateTime(String str) {
        this.f88984m = str;
    }

    public void setDefaultHeadImage(boolean z) {
        this.f88993v = z;
    }

    public void setDetailUrl(String str) {
        this.f88989r = str;
    }

    public void setGroup(String str) {
        this.f88987p = str;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.f88981j = urlModel;
    }

    public void setLogoImageUrl(UrlModel urlModel) {
        this.f88980i = urlModel;
    }

    public void setMerchantName(String str) {
        this.f88973b = str;
    }

    public void setNotification(String str) {
        this.f88983l = str;
    }

    public void setQrCodeUrl(UrlModel urlModel) {
        this.f88992u = urlModel;
    }

    public void setSecUid(String str) {
        this.f88986o = str;
    }

    public void setServiceTel(String str) {
        this.f88988q = str;
    }

    public void setStatus(int i) {
        this.f88982k = i;
    }

    public void setStorePageLink(String str) {
        this.f88997z = str;
    }

    public void setTitle(String str) {
        this.f88974c = str;
    }

    public void setUsePageLink(String str) {
        this.f88996y = str;
    }

    public void setUserId(Long l) {
        this.f88985n = l;
    }

    public void setValidEnd(String str) {
        this.f88977f = str;
    }

    public void setValidStart(String str) {
        this.f88976e = str;
    }
}

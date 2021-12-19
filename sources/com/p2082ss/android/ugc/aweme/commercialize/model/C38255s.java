package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.s */
public class C38255s extends Comment implements Serializable {
    private static final long serialVersionUID = 1075399560205544614L;
    @AbstractC27891c(mo46611a = "avatar_icon")

    /* renamed from: a */
    private UrlModel f90393a;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: b */
    private String f90394b;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    private String f90395c;
    @AbstractC27891c(mo46611a = "button_text")

    /* renamed from: d */
    private String f90396d;
    @AbstractC27891c(mo46611a = "comment_info")

    /* renamed from: e */
    private String f90397e;
    @AbstractC27891c(mo46611a = "comment_time")

    /* renamed from: f */
    private long f90398f;
    @AbstractC27891c(mo46611a = "comment_style")

    /* renamed from: g */
    private int f90399g;
    @AbstractC27891c(mo46611a = "show_button_number")

    /* renamed from: h */
    private int f90400h;
    @AbstractC27891c(mo46611a = "comment_nickname")

    /* renamed from: i */
    private String f90401i;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: j */
    private int f90402j;
    @AbstractC27891c(mo46611a = "tag_text")

    /* renamed from: k */
    private String f90403k;
    @AbstractC27891c(mo46611a = "show_comment_number")

    /* renamed from: l */
    private int f90404l;
    @AbstractC27891c(mo46611a = "mock_creator")

    /* renamed from: m */
    private int f90405m;
    @AbstractC27891c(mo46611a = "mock_count")

    /* renamed from: n */
    private int f90406n;

    /* renamed from: o */
    private String f90407o;

    /* renamed from: p */
    private AwemeRawAd f90408p;

    /* renamed from: q */
    private boolean f90409q;

    static {
        Covode.recordClassIndex(45739);
    }

    public String getAid() {
        return this.f90407o;
    }

    public UrlModel getAvatarIcon() {
        return this.f90393a;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.f90408p;
    }

    public String getButtonText() {
        return this.f90396d;
    }

    public String getCommentInfo() {
        return this.f90397e;
    }

    public String getCommentNickName() {
        return this.f90401i;
    }

    public int getCommentStyle() {
        return this.f90399g;
    }

    public long getCommentTime() {
        return this.f90398f;
    }

    public int getShowButtonNumber() {
        return this.f90400h;
    }

    public int getShowCommentNumber() {
        return this.f90404l;
    }

    public String getSource() {
        return this.f90394b;
    }

    public String getTagText() {
        return this.f90403k;
    }

    public String getTitle() {
        return this.f90395c;
    }

    public int getType() {
        return this.f90402j;
    }

    public boolean isAdFake() {
        return this.f90409q;
    }

    public boolean showAsDefault() {
        if (this.f90406n == 1) {
            return true;
        }
        return false;
    }

    public boolean showCreatorTag() {
        if (this.f90405m == 1) {
            return true;
        }
        return false;
    }

    public C38255s setAdFake(boolean z) {
        this.f90409q = z;
        return this;
    }

    public C38255s setAid(String str) {
        this.f90407o = str;
        return this;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.f90393a = urlModel;
    }

    public C38255s setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.f90408p = awemeRawAd;
        return this;
    }

    public void setButtonText(String str) {
        this.f90396d = str;
    }

    public void setCommentInfo(String str) {
        this.f90397e = str;
    }

    public void setCommentNickName(String str) {
        this.f90401i = str;
    }

    public void setCommentStyle(int i) {
        this.f90399g = i;
    }

    public void setCommentTime(long j) {
        this.f90398f = j;
    }

    public void setShowButtonNumber(int i) {
        this.f90400h = i;
    }

    public void setSource(String str) {
        this.f90394b = str;
    }

    public void setTitle(String str) {
        this.f90395c = str;
    }
}

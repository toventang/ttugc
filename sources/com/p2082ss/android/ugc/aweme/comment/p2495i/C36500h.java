package com.p2082ss.android.ugc.aweme.comment.p2495i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.feed.AbstractC48309ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.i.h */
public class C36500h extends C36495d<C36500h> {
    private static final long serialVersionUID = -8706130331733501305L;

    /* renamed from: A */
    private transient AbstractC48309ae f86376A;

    /* renamed from: B */
    private C38255s f86377B;

    /* renamed from: C */
    private boolean f86378C;

    /* renamed from: D */
    private boolean f86379D;

    /* renamed from: E */
    private boolean f86380E;

    /* renamed from: F */
    private int f86381F;

    /* renamed from: G */
    private String f86382G;

    /* renamed from: H */
    private String f86383H;

    /* renamed from: I */
    private String f86384I;

    /* renamed from: J */
    private String f86385J;

    /* renamed from: K */
    private String f86386K;

    /* renamed from: L */
    private String f86387L;

    /* renamed from: M */
    private String f86388M;

    /* renamed from: N */
    private boolean f86389N;

    /* renamed from: O */
    private List<User> f86390O;

    /* renamed from: P */
    private boolean f86391P;

    /* renamed from: Q */
    private String f86392Q;

    /* renamed from: R */
    private boolean f86393R;

    /* renamed from: S */
    private String f86394S;

    /* renamed from: T */
    private String f86395T;

    /* renamed from: U */
    private long f86396U;

    /* renamed from: V */
    private int f86397V = -1;

    /* renamed from: W */
    private String f86398W;

    /* renamed from: X */
    private String f86399X = "";

    /* renamed from: Y */
    private String f86400Y = "";

    /* renamed from: Z */
    private String f86401Z;

    /* renamed from: aa */
    private String f86402aa;

    /* renamed from: ab */
    private String f86403ab;

    /* renamed from: d */
    private int f86404d;

    /* renamed from: e */
    private String f86405e;

    /* renamed from: f */
    private String f86406f;

    /* renamed from: g */
    private String f86407g;

    /* renamed from: h */
    private boolean f86408h;

    /* renamed from: i */
    private boolean f86409i;

    /* renamed from: j */
    private boolean f86410j;

    /* renamed from: k */
    private int f86411k;

    /* renamed from: l */
    private int f86412l;

    /* renamed from: m */
    private String f86413m;

    /* renamed from: n */
    private int f86414n;

    /* renamed from: o */
    private String f86415o;

    /* renamed from: p */
    private String f86416p;

    /* renamed from: q */
    private String f86417q;

    /* renamed from: r */
    private boolean f86418r;

    /* renamed from: s */
    private boolean f86419s;

    /* renamed from: t */
    private boolean f86420t;

    /* renamed from: u */
    private boolean f86421u;

    /* renamed from: v */
    private boolean f86422v;

    /* renamed from: w */
    private boolean f86423w;

    /* renamed from: x */
    private boolean f86424x;

    /* renamed from: y */
    private Map<String, String> f86425y;

    /* renamed from: z */
    private String f86426z;

    static {
        Covode.recordClassIndex(43803);
    }

    public long getCommentCount() {
        return this.f86396U;
    }

    public String getCommentEnterMethod() {
        return this.f86399X;
    }

    public String getCreationId() {
        return this.f86392Q;
    }

    public String getEnterMethod() {
        return this.f86382G;
    }

    public String getEventType() {
        return this.f86406f;
    }

    public String getFromGroupId() {
        return this.f86401Z;
    }

    public String getHintCids() {
        return this.f86416p;
    }

    public Map<String, String> getHotPlayerMap() {
        return this.f86425y;
    }

    public String getInsertCids() {
        return this.f86415o;
    }

    public String getInsertLikeUserIds() {
        return this.f86413m;
    }

    public String getInsertVid() {
        return this.f86417q;
    }

    public int getIsLongItem() {
        return this.f86381F;
    }

    public String getLabelText() {
        return this.f86403ab;
    }

    public int getLabelType() {
        return this.f86397V;
    }

    public String getLastGroupId() {
        return this.f86400Y;
    }

    public int getLikeUserCount() {
        return this.f86414n;
    }

    public List<User> getLikeUsers() {
        return this.f86390O;
    }

    public int getLocatePageType() {
        return this.f86412l;
    }

    public String getNewsId() {
        return this.f86402aa;
    }

    public AbstractC48309ae getOnShowHeightChangeListener() {
        return this.f86376A;
    }

    public int getPageType() {
        return this.f86411k;
    }

    public String getParentTagId() {
        return this.f86384I;
    }

    public String getPlayListId() {
        return this.f86387L;
    }

    public String getPlayListIdKey() {
        return this.f86386K;
    }

    public String getPlayListType() {
        return this.f86385J;
    }

    public String getPreviousPage() {
        return this.f86426z;
    }

    public String getRequestId() {
        return this.f86407g;
    }

    public String getSearchId() {
        return this.f86394S;
    }

    public String getSearchResultId() {
        return this.f86395T;
    }

    public int getSource() {
        return this.f86404d;
    }

    public String getTabName() {
        return this.f86388M;
    }

    public String getTagId() {
        return this.f86383H;
    }

    public String getTempEnterMethod() {
        return this.f86398W;
    }

    public boolean isCommentClose() {
        return this.f86379D;
    }

    public boolean isCommentLimited() {
        return this.f86380E;
    }

    public boolean isEnableComment() {
        return this.f86410j;
    }

    public boolean isEnterFullScreen() {
        return this.f86389N;
    }

    public boolean isForceHideKeyboard() {
        return this.f86421u;
    }

    public boolean isForceOpenReply() {
        return this.f86420t;
    }

    public boolean isForceRefresh() {
        return this.f86378C;
    }

    public boolean isFromPostList() {
        return this.f86393R;
    }

    public boolean isHotPlayer() {
        return this.f86424x;
    }

    public boolean isMyProfile() {
        return this.f86409i;
    }

    public boolean isNeedAutoLikeComment() {
        return this.f86422v;
    }

    public boolean isNeedShowReplyPanel() {
        return this.f86423w;
    }

    public boolean isPrivateAweme() {
        return this.f86408h;
    }

    public boolean isScrollToTop() {
        return this.f86418r;
    }

    public boolean isShowLikeUsers() {
        return this.f86391P;
    }

    public boolean showReplyWithInsertCid() {
        return this.f86419s;
    }

    public C38255s getAdCommentStruct() {
        C38255s sVar = this.f86377B;
        if (sVar == null) {
            return null;
        }
        sVar.setAwemeId(this.f86363b);
        User user = new User();
        user.setUid(this.f86364c);
        user.setAvatarThumb(this.f86377B.getAvatarIcon());
        this.f86377B.setUser(user);
        this.f86377B.setCommentType(10);
        return this.f86377B;
    }

    public String getCommentTag() {
        String str = this.f86406f;
        str.hashCode();
        if (!str.equals("collection") && !str.equals("opus")) {
            return this.f86406f;
        }
        if (isMyProfile()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public String getEnterFrom() {
        if (!TextUtils.isEmpty(this.f86405e)) {
            return this.f86405e;
        }
        int i = this.f86411k;
        if (i == 1000) {
            return "personal_homepage";
        }
        if (i == 1001) {
            return "personal_collection";
        }
        if (i == 2000) {
            return "others_homepage";
        }
        if (i != 2001) {
            return this.f86406f;
        }
        return "others_collection";
    }

    public C36500h forceRefresh(boolean z) {
        this.f86378C = z;
        return this;
    }

    public C36500h setAdCommentStruct(C38255s sVar) {
        this.f86377B = sVar;
        return this;
    }

    public C36500h setCommentClose(boolean z) {
        this.f86379D = z;
        return this;
    }

    public C36500h setCommentCount(long j) {
        this.f86396U = j;
        return this;
    }

    public C36500h setCommentEnterMethod(String str) {
        this.f86399X = str;
        return this;
    }

    public C36500h setCommentLimited(boolean z) {
        this.f86380E = z;
        return this;
    }

    public C36500h setCreationId(String str) {
        this.f86392Q = str;
        return this;
    }

    public C36500h setEnableComment(boolean z) {
        this.f86410j = z;
        return this;
    }

    public C36500h setEnterFrom(String str) {
        this.f86405e = str;
        return this;
    }

    public C36500h setEnterFullScreen(boolean z) {
        this.f86389N = z;
        return this;
    }

    public C36500h setEnterMethod(String str) {
        this.f86382G = str;
        return this;
    }

    public C36500h setEventType(String str) {
        this.f86406f = str;
        return this;
    }

    public C36500h setForceHideKeyboard(boolean z) {
        this.f86421u = z;
        return this;
    }

    public C36500h setFromGroupId(String str) {
        this.f86401Z = str;
        return this;
    }

    public C36500h setFromPostList(boolean z) {
        this.f86393R = z;
        return this;
    }

    public C36500h setHintCids(String str) {
        this.f86416p = str;
        return this;
    }

    public C36500h setHotPlayer(boolean z) {
        this.f86424x = z;
        return this;
    }

    public C36500h setHotPlayerMap(Map<String, String> map) {
        this.f86425y = map;
        return this;
    }

    public C36500h setInsertLikeUserIds(String str) {
        this.f86413m = str;
        return this;
    }

    public C36500h setInsertVid(String str) {
        this.f86417q = str;
        return this;
    }

    public C36500h setIsLongItem(int i) {
        this.f86381F = i;
        return this;
    }

    public C36500h setLabelText(String str) {
        this.f86403ab = str;
        return this;
    }

    public C36500h setLabelType(int i) {
        this.f86397V = i;
        return this;
    }

    public C36500h setLastGroupId(String str) {
        this.f86400Y = str;
        return this;
    }

    public C36500h setLikeUserCount(int i) {
        this.f86414n = i;
        return this;
    }

    public C36500h setLikeUsers(List<User> list) {
        this.f86390O = list;
        return this;
    }

    public C36500h setLocatePageType(int i) {
        this.f86412l = i;
        return this;
    }

    public C36500h setMyProfile(boolean z) {
        this.f86409i = z;
        return this;
    }

    public C36500h setNeedAutoLikeComment(boolean z) {
        this.f86422v = z;
        return this;
    }

    public C36500h setNeedShowReplyPanel(boolean z) {
        this.f86423w = z;
        return this;
    }

    public C36500h setNewsId(String str) {
        this.f86402aa = str;
        return this;
    }

    public C36500h setOnShowHeightChangeListener(AbstractC48309ae aeVar) {
        this.f86376A = aeVar;
        return this;
    }

    public C36500h setPageType(int i) {
        this.f86411k = i;
        return this;
    }

    public void setParentTagId(String str) {
        this.f86384I = str;
    }

    public C36500h setPlayListId(String str) {
        this.f86387L = str;
        return this;
    }

    public C36500h setPlayListIdKey(String str) {
        this.f86386K = str;
        return this;
    }

    public C36500h setPlayListType(String str) {
        this.f86385J = str;
        return this;
    }

    public C36500h setPreviousPage(String str) {
        this.f86426z = str;
        return this;
    }

    public C36500h setPrivateAweme(boolean z) {
        this.f86408h = z;
        return this;
    }

    public C36500h setRequestId(String str) {
        this.f86407g = str;
        return this;
    }

    public C36500h setScrollToTop(boolean z) {
        this.f86418r = z;
        return this;
    }

    public C36500h setSearchId(String str) {
        this.f86394S = str;
        return this;
    }

    public C36500h setSearchResultId(String str) {
        this.f86395T = str;
        return this;
    }

    public C36500h setShowLikeUsers(boolean z) {
        this.f86391P = z;
        return this;
    }

    public C36500h setSource(int i) {
        this.f86404d = i;
        return this;
    }

    public C36500h setTabName(String str) {
        this.f86388M = str;
        return this;
    }

    public void setTagId(String str) {
        this.f86383H = str;
    }

    public void setTempEnterMethod(String str) {
        this.f86398W = str;
    }

    public C36500h(String str) {
        super(str);
    }

    public C36500h setInsertCids(String str, boolean z, boolean z2) {
        this.f86415o = str;
        this.f86419s = z;
        this.f86420t = z2;
        return this;
    }
}

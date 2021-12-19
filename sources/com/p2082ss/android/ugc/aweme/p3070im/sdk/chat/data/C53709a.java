package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.a */
public class C53709a implements Serializable {

    /* renamed from: a */
    private String f123233a = "";

    /* renamed from: b */
    private int f123234b;

    /* renamed from: c */
    private List<C19538ai> f123235c;

    /* renamed from: d */
    private int f123236d;

    /* renamed from: e */
    private int f123237e;

    /* renamed from: f */
    private String f123238f = "";

    /* renamed from: g */
    private C53712b f123239g = new C53712b(null, 1, null);

    /* renamed from: h */
    private int f123240h;

    static {
        Covode.recordClassIndex(63289);
    }

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public IMUser getSingleChatFromUser() {
        return null;
    }

    public String getSingleChatFromUserId() {
        return null;
    }

    public final int getChatType() {
        return this.f123236d;
    }

    public final String getConversationId() {
        return this.f123233a;
    }

    public final int getEnterFrom() {
        return this.f123237e;
    }

    public final String getEnterFromForMob() {
        return this.f123238f;
    }

    public final List<C19538ai> getSelectMsgList() {
        return this.f123235c;
    }

    public final int getSelectMsgType() {
        return this.f123234b;
    }

    public final C53712b getStatictisParams() {
        return this.f123239g;
    }

    public final int getUnreadCount() {
        return this.f123240h;
    }

    public final boolean isFriendChat() {
        if (this.f123236d == 0) {
            return true;
        }
        return false;
    }

    public final boolean isStrangerChat() {
        if (this.f123236d == 1) {
            return true;
        }
        return false;
    }

    public final boolean isAuthorSupporterChat() {
        if (this.f123236d == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEnterpriseChat() {
        if (this.f123236d == 2) {
            return true;
        }
        return false;
    }

    public final boolean isGroupChat() {
        if (this.f123236d == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSingleChat() {
        int i = this.f123236d;
        if (i == 0 || i == 1 || i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public final void setChatType(int i) {
        this.f123236d = i;
    }

    public final void setEnterFrom(int i) {
        this.f123237e = i;
    }

    public final void setEnterFromForMob(String str) {
        this.f123238f = str;
    }

    public final void setSelectMsgList(List<C19538ai> list) {
        this.f123235c = list;
    }

    public final void setSelectMsgType(int i) {
        this.f123234b = i;
    }

    public final void setUnreadCount(int i) {
        this.f123240h = i;
    }

    public final void setConversationId(String str) {
        C89219l.m154721d(str, "");
        this.f123233a = str;
    }

    public final void setStatictisParams(C53712b bVar) {
        C89219l.m154721d(bVar, "");
        this.f123239g = bVar;
    }
}

package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.a */
public final class C56245a implements Serializable {
    public static final C56247b Companion = new C56247b((byte) 0);

    /* renamed from: a */
    private transient Context f128255a;

    /* renamed from: b */
    private String f128256b;

    /* renamed from: c */
    private int f128257c;

    /* renamed from: d */
    private int f128258d;

    /* renamed from: e */
    private String f128259e;

    /* renamed from: f */
    private String f128260f;

    /* renamed from: g */
    private String f128261g;

    /* renamed from: h */
    private String f128262h;

    /* renamed from: i */
    private IMUser f128263i;

    /* renamed from: j */
    private IMContact f128264j;

    /* renamed from: k */
    private String f128265k;

    /* renamed from: l */
    private C56252e f128266l;

    /* renamed from: m */
    private Serializable f128267m;

    /* renamed from: n */
    private transient String f128268n;

    /* renamed from: o */
    private transient AbstractC89172b<? super Boolean, C89391z> f128269o;

    /* renamed from: p */
    private boolean f128270p;

    /* renamed from: q */
    private int f128271q;

    /* renamed from: r */
    private boolean f128272r;

    /* renamed from: s */
    private int f128273s;

    /* renamed from: t */
    private boolean f128274t;

    /* renamed from: u */
    private String f128275u;

    /* renamed from: v */
    private int f128276v;

    /* renamed from: w */
    private String f128277w;

    /* renamed from: x */
    private String f128278x;

    /* renamed from: y */
    private boolean f128279y;

    /* renamed from: z */
    private boolean f128280z;

    static {
        Covode.recordClassIndex(66058);
    }

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public static final C56246a newBuilder(Context context, int i, String str) {
        return C56247b.m102212a(context, i, str);
    }

    public static final C56246a newBuilder(Context context, IMContact iMContact) {
        return C56247b.m102213a(context, iMContact);
    }

    public static final C56246a newBuilder(Context context, IMUser iMUser) {
        return C56247b.m102214a(context, iMUser);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.model.a$b */
    public static final class C56247b {
        static {
            Covode.recordClassIndex(66060);
        }

        private C56247b() {
        }

        public /* synthetic */ C56247b(byte b) {
            this();
        }

        /* renamed from: a */
        public static C56246a m102213a(Context context, IMContact iMContact) {
            return new C56246a().mo93264a(iMContact).mo93263a(context);
        }

        /* renamed from: a */
        public static C56246a m102214a(Context context, IMUser iMUser) {
            return new C56246a().mo93265a(iMUser).mo93263a(context);
        }

        /* renamed from: a */
        public static C56246a m102212a(Context context, int i, String str) {
            return new C56246a().mo93268a(str).mo93270b(i).mo93263a(context);
        }
    }

    public final String getButtonType() {
        return this.f128262h;
    }

    public final Serializable getChatExt() {
        return this.f128267m;
    }

    public final int getChatType() {
        return this.f128257c;
    }

    public final Context getContext() {
        return this.f128255a;
    }

    public final int getEnterFrom() {
        return this.f128258d;
    }

    public final String getEnterFromForMob() {
        return this.f128259e;
    }

    public final String getEnterFromSubPage() {
        return this.f128260f;
    }

    public final String getEnterMethodForMob() {
        return this.f128261g;
    }

    public final boolean getEnterSelectChatMsgActivity() {
        return this.f128270p;
    }

    public final int getFollowStatus() {
        return this.f128276v;
    }

    public final String getGroupId() {
        return this.f128275u;
    }

    public final boolean getHasUnreadDot() {
        return this.f128280z;
    }

    public final C56252e getImAdLog() {
        return this.f128266l;
    }

    public final IMContact getImContact() {
        return this.f128264j;
    }

    public final IMUser getImUser() {
        return this.f128263i;
    }

    public final boolean getKeepEnterFrom() {
        return this.f128274t;
    }

    public final boolean getNoEvent() {
        return this.f128272r;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final AbstractC89172b<Boolean, C89391z> getRouterCallback() {
        return this.f128269o;
    }

    public final int getSelectMsgType() {
        return this.f128271q;
    }

    public final String getSessionId() {
        return this.f128256b;
    }

    public final String getShareUserId() {
        return this.f128265k;
    }

    public final String getStoryCollectionId() {
        return this.f128278x;
    }

    public final String getStoryType() {
        return this.f128277w;
    }

    public final String getThirdAppName() {
        return this.f128268n;
    }

    public final int getUnreadCount() {
        return this.f128273s;
    }

    public final boolean isStickyTop() {
        return this.f128279y;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.model.a$a */
    public static final class C56246a {

        /* renamed from: a */
        public C56245a f128281a = new C56245a(null);

        static {
            Covode.recordClassIndex(66059);
        }

        /* renamed from: a */
        public final C56246a mo93261a() {
            this.f128281a.setKeepEnterFrom(true);
            return this;
        }

        /* renamed from: b */
        public final C56246a mo93270b(int i) {
            this.f128281a.setChatType(i);
            return this;
        }

        /* renamed from: c */
        public final C56246a mo93273c(int i) {
            this.f128281a.setUnreadCount(i);
            return this;
        }

        /* renamed from: d */
        public final C56246a mo93275d(int i) {
            this.f128281a.setFollowStatus(i);
            return this;
        }

        /* renamed from: e */
        public final C56246a mo93277e(String str) {
            this.f128281a.setGroupId(str);
            return this;
        }

        /* renamed from: f */
        public final C56246a mo93278f(String str) {
            this.f128281a.setStoryType(str);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93262a(int i) {
            this.f128281a.setEnterFrom(i);
            return this;
        }

        /* renamed from: b */
        public final C56246a mo93271b(String str) {
            this.f128281a.setEnterMethodForMob(str);
            return this;
        }

        /* renamed from: c */
        public final C56246a mo93274c(String str) {
            this.f128281a.setEnterFromForMob(str);
            return this;
        }

        /* renamed from: d */
        public final C56246a mo93276d(String str) {
            this.f128281a.setButtonType(str);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93263a(Context context) {
            this.f128281a.setContext(context);
            return this;
        }

        /* renamed from: b */
        public final C56246a mo93272b(boolean z) {
            this.f128281a.setHasUnreadDot(z);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93264a(IMContact iMContact) {
            this.f128281a.setImContact(iMContact);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93265a(IMUser iMUser) {
            this.f128281a.setImUser(iMUser);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93266a(C56252e eVar) {
            this.f128281a.setImAdLog(eVar);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93267a(Serializable serializable) {
            this.f128281a.setChatExt(serializable);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93268a(String str) {
            this.f128281a.setSessionId(str);
            return this;
        }

        /* renamed from: a */
        public final C56246a mo93269a(boolean z) {
            this.f128281a.setStickyTop(z);
            return this;
        }
    }

    public final String getUserId() {
        IMUser iMUser = this.f128263i;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return "";
    }

    private C56245a() {
        this.f128256b = "";
        this.f128257c = -1;
        this.f128259e = "";
        this.f128261g = "";
        this.f128275u = "";
        this.f128276v = -1;
        this.f128277w = "";
        this.f128278x = "";
    }

    public /* synthetic */ C56245a(C89214g gVar) {
        this();
    }

    public final void setButtonType(String str) {
        this.f128262h = str;
    }

    public final void setChatExt(Serializable serializable) {
        this.f128267m = serializable;
    }

    public final void setChatType(int i) {
        this.f128257c = i;
    }

    public final void setContext(Context context) {
        this.f128255a = context;
    }

    public final void setEnterFrom(int i) {
        this.f128258d = i;
    }

    public final void setEnterFromForMob(String str) {
        this.f128259e = str;
    }

    public final void setEnterFromSubPage(String str) {
        this.f128260f = str;
    }

    public final void setEnterMethodForMob(String str) {
        this.f128261g = str;
    }

    public final void setEnterSelectChatMsgActivity(boolean z) {
        this.f128270p = z;
    }

    public final void setFollowStatus(int i) {
        this.f128276v = i;
    }

    public final void setGroupId(String str) {
        this.f128275u = str;
    }

    public final void setHasUnreadDot(boolean z) {
        this.f128280z = z;
    }

    public final void setImAdLog(C56252e eVar) {
        this.f128266l = eVar;
    }

    public final void setImContact(IMContact iMContact) {
        this.f128264j = iMContact;
    }

    public final void setImUser(IMUser iMUser) {
        this.f128263i = iMUser;
    }

    public final void setKeepEnterFrom(boolean z) {
        this.f128274t = z;
    }

    public final void setNoEvent(boolean z) {
        this.f128272r = z;
    }

    public final void setRouterCallback(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f128269o = bVar;
    }

    public final void setSelectMsgType(int i) {
        this.f128271q = i;
    }

    public final void setSessionId(String str) {
        this.f128256b = str;
    }

    public final void setShareUserId(String str) {
        this.f128265k = str;
    }

    public final void setStickyTop(boolean z) {
        this.f128279y = z;
    }

    public final void setStoryCollectionId(String str) {
        this.f128278x = str;
    }

    public final void setStoryType(String str) {
        this.f128277w = str;
    }

    public final void setThirdAppName(String str) {
        this.f128268n = str;
    }

    public final void setUnreadCount(int i) {
        this.f128273s = i;
    }
}

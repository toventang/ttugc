package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p2082ss.android.ugc.aweme.notification.bean.C61880l;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62150u;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62261f;
import com.p2082ss.android.ugc.aweme.notification.utils.C62265i;
import com.p2082ss.android.ugc.aweme.p2315ao.C33515a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.notification.h.a */
public class View$OnClickListenerC62026a extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: a */
    private BaseNotice f140763a;

    /* renamed from: b */
    private Map<String, BaseNotice> f140764b;

    /* renamed from: c */
    private View f140765c;

    /* renamed from: d */
    private AbstractC62100e f140766d;

    /* renamed from: g */
    protected boolean f140767g;

    /* renamed from: h */
    public BaseNotificationVM f140768h;

    static {
        Covode.recordClassIndex(72780);
    }

    /* renamed from: c */
    private static boolean mo100157c(int i) {
        return i == 23 || i == 25 || i == 26 || i == 27;
    }

    /* renamed from: d */
    private static boolean mo100087d(int i) {
        return i == 54 || i == 55;
    }

    public void cf_() {
    }

    /* renamed from: d */
    public void mo100081d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo100082e() {
        return false;
    }

    /* renamed from: a */
    public void mo100078a(AbstractC62100e eVar) {
        this.f140766d = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T extends View> T mo100077a(int i) {
        return (T) this.itemView.findViewById(i);
    }

    /* renamed from: b */
    protected static boolean m112177b(int i) {
        if (i == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141118e || i == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141119f) {
            return true;
        }
        return false;
    }

    public View$OnClickListenerC62026a(View view) {
        super(view);
        this.f140765c = view;
        if (mo100082e()) {
            this.f140765c.setOnLongClickListener(this);
        }
    }

    /* renamed from: a */
    public static String m112171a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\d+\\d$").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public void onClick(View view) {
        BaseNotice baseNotice;
        ClickAgent.onClick(view);
        Map<String, BaseNotice> map = this.f140764b;
        if (map != null && (baseNotice = this.f140763a) != null) {
            map.put(baseNotice.nid, this.f140763a);
        }
    }

    public boolean onLongClick(View view) {
        int layoutPosition = getLayoutPosition();
        if (this.f140766d == null || layoutPosition < 0 || !mo100082e()) {
            return true;
        }
        this.f140766d.mo93497a(layoutPosition);
        return true;
    }

    /* renamed from: a */
    protected static String m112170a(CommentNotice commentNotice) {
        if (commentNotice == null) {
            return "";
        }
        switch (commentNotice.getCommentType()) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_SELECT_SCENE:
                return "comment_a";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case 15:
                return "comment_b";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case 16:
                return "comment_c";
            default:
                return "";
        }
    }

    /* renamed from: a */
    private static void m112172a(C61880l lVar, BaseNotice baseNotice) {
        FollowNotice followNotice = baseNotice.followNotice;
        if (followNotice != null) {
            lVar.f140481k = 0;
            lVar.f140478h = followNotice.getUser().getUid();
            int followStatus = followNotice.getUser().getFollowStatus();
            m112173a(lVar, Collections.singletonList(followNotice.getUser()));
            if (followStatus == 0) {
                lVar.f140476f = "follow";
            } else if (followStatus == 1 || followStatus == 2) {
                lVar.f140476f = "followed";
            }
        }
    }

    /* renamed from: d */
    private static void m112180d(C61880l lVar, BaseNotice baseNotice) {
        String str;
        AtMe atMe = baseNotice.atMe;
        if (atMe != null) {
            lVar.f140481k = 0;
            lVar.f140478h = atMe.getUser().getUid();
            m112173a(lVar, Collections.singletonList(atMe.getUser()));
            Aweme aweme = atMe.getAweme();
            if (aweme != null) {
                lVar.f140490t = aweme.getGroupId();
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    lVar.f140490t = aid;
                    if (mo100087d(atMe.getSubType())) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    lVar.f140491u = str;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m112173a(C61880l lVar, List<User> list) {
        String a = C33515a.m68676a(list);
        lVar.f140492v = a;
        C89378p<Integer, Integer> b = C33515a.m68678b(list);
        if (a != null && b != null) {
            int intValue = b.getFirst().intValue();
            int intValue2 = b.getSecond().intValue();
            if (intValue != 0) {
                return;
            }
            if (intValue2 == 0) {
                lVar.f140493w = "follow";
            } else {
                lVar.f140493w = "follow_back";
            }
        }
    }

    /* renamed from: b */
    private static void m112175b(C61880l lVar, BaseNotice baseNotice) {
        List<User> users;
        String str;
        DiggNotice diggNotice = baseNotice.diggNotice;
        if (!(diggNotice == null || (users = diggNotice.getUsers()) == null || users.size() == 0)) {
            int mergeCount = diggNotice.getMergeCount();
            m112173a(lVar, users);
            if (mergeCount == 1) {
                lVar.f140481k = 0;
                lVar.f140478h = users.get(0).getUid();
            } else {
                lVar.f140481k = 1;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < users.size(); i++) {
                    User user = users.get(i);
                    if (i == users.size() - 1) {
                        sb.append(user.getUid());
                    } else {
                        sb.append(user.getUid()).append(",");
                    }
                }
                lVar.f140478h = sb.toString();
            }
            if (diggNotice.getDiggType() == 3) {
                lVar.f140479i = UGCMonitor.EVENT_COMMENT;
                lVar.f140480j = diggNotice.getCid();
            } else {
                lVar.f140479i = "video";
                lVar.f140480j = diggNotice.getForwardId();
            }
            Aweme aweme = diggNotice.getAweme();
            if (aweme != null) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    lVar.f140490t = aid;
                    if (m112177b(diggNotice.getDiggType())) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    lVar.f140491u = str;
                }
            }
        }
    }

    /* renamed from: c */
    private static void m112178c(C61880l lVar, BaseNotice baseNotice) {
        String str;
        CommentNotice commentNotice = baseNotice.commentNotice;
        if (commentNotice != null) {
            Aweme aweme = commentNotice.getAweme();
            if (aweme != null) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    lVar.f140490t = aid;
                    if (mo100157c(commentNotice.getCommentType())) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    lVar.f140491u = str;
                }
            }
            m112173a(lVar, Collections.singletonList(commentNotice.getComment().getUser()));
            lVar.f140481k = 0;
            lVar.f140478h = commentNotice.getComment().getUser().getUid();
            int commentType = commentNotice.getCommentType();
            if (!(commentType == 0 || commentType == 1)) {
                if (!(commentType == 2 || commentType == 4)) {
                    if (commentType != 5) {
                        if (!(commentType == 6 || commentType == 8)) {
                            if (!(commentType == 14 || commentType == 11)) {
                                if (commentType != 12) {
                                    return;
                                }
                            }
                        }
                    }
                }
                lVar.f140479i = UGCMonitor.EVENT_COMMENT;
                lVar.f140480j = commentNotice.getForwardId();
                return;
            }
            lVar.f140479i = "video";
            lVar.f140480j = commentNotice.getForwardId();
        }
    }

    /* renamed from: b */
    public static void m112176b(String str, String str2, String str3) {
        SmartRouter.buildRoute(C17867d.m33078a(), "aweme://user/profile/").withParam("uid", str).withParam("enter_from", str3).withParam("sec_user_id", str2).withParam("previous_page", "message").withParam("enter_method", "follow_button").withParam("extra_from_pre_page", "notification_page").withParam("extra_previous_page_position", "card_head").open();
    }

    /* renamed from: a */
    protected static void m112174a(String str, String str2, String str3) {
        C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", str2).mo59983a("enter_method", str3).mo59983a("to_user_id", str).f79943a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100080a(String str, String str2, int i, BaseNotice baseNotice, String str3, String str4, String str5, User user) {
        mo100079a(str, str2, i, baseNotice, str3, str4, str5, -1, user);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100079a(String str, String str2, int i, BaseNotice baseNotice, String str3, String str4, String str5, int i2, User user) {
        if (baseNotice != null) {
            C61880l lVar = new C61880l();
            lVar.f140471a = str;
            lVar.f140472b = str2;
            lVar.f140477g = baseNotice.createTime;
            lVar.f140475e = str3;
            lVar.f140482l = baseNotice.logPbBean;
            lVar.f140485o = str4;
            if (user != null) {
                lVar.f140486p = C62265i.m112641a(this.f140765c.getContext(), user);
            }
            if (baseNotice.timeLineType != -1) {
                lVar.f140483m = C62261f.m112631a(baseNotice.timeLineType);
                lVar.f140484n = "1002";
            }
            if (!TextUtils.isEmpty(baseNotice.getLabelText())) {
                lVar.f140488r = baseNotice.getLabelText();
            }
            if (i != -1) {
                lVar.f140473c = i;
            }
            lVar.f140474d = "";
            if (!TextUtils.isEmpty(str5)) {
                lVar.f140487q = str5;
            }
            str2.hashCode();
            switch (str2.hashCode()) {
                case 3123:
                    if (str2.equals("at")) {
                        m112180d(lVar, baseNotice);
                        break;
                    }
                    break;
                case 3135424:
                    if (str2.equals("fans")) {
                        m112172a(lVar, baseNotice);
                        break;
                    }
                    break;
                case 3321751:
                    if (str2.equals("like")) {
                        m112175b(lVar, baseNotice);
                        break;
                    }
                    break;
                case 950398559:
                    if (str2.equals(UGCMonitor.EVENT_COMMENT)) {
                        m112178c(lVar, baseNotice);
                        break;
                    }
                    break;
            }
            if (i2 != -1) {
                lVar.f140489s = i2;
            }
            lVar.mo99974a();
        }
    }
}

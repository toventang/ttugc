package com.p2082ss.android.ugc.aweme.notification.view.template;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartRoundImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.FollowUserBtn;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.utils.C62264h;
import com.p2082ss.android.ugc.aweme.notification.utils.C62265i;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView */
public final class NoticeTemplateRightView extends AbstractView$OnClickListenerC62342g {

    /* renamed from: a */
    private C51086a f141444a;

    /* renamed from: b */
    private SparseArray f141445b;

    static {
        Covode.recordClassIndex(73104);
    }

    public NoticeTemplateRightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final View mo100306a(int i) {
        if (this.f141445b == null) {
            this.f141445b = new SparseArray();
        }
        View view = (View) this.f141445b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141445b.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    public final EnumC62343h getTemplatePosition() {
        return EnumC62343h.Right;
    }

    /* renamed from: a */
    public final User mo100313a() {
        C61621c cVar;
        C61624f fVar;
        List<User> list;
        C61630e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f139886b) == null || (fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null) {
            return null;
        }
        return (User) C89070n.m154583g((List) list);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: b */
    public final String mo100309b(View view) {
        Integer valueOf;
        C61630e templateNotice;
        C61621c cVar;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null || ((valueOf.intValue() != R.id.cu6 && valueOf.intValue() != R.id.dkg && valueOf.intValue() != R.id.cu2) || (templateNotice = getTemplateNotice()) == null || (cVar = templateNotice.f139886b) == null)) {
            return null;
        }
        return cVar.f139854o;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final boolean mo100308a(View view) {
        Integer valueOf;
        String b;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return false;
        }
        if ((valueOf.intValue() != R.id.cu6 && valueOf.intValue() != R.id.dkg && valueOf.intValue() != R.id.cu2) || (b = mo100309b(view)) == null) {
            return false;
        }
        mo100329a(b);
        return true;
    }

    /* renamed from: a */
    public final void mo100314a(int i, String str) {
        String str2;
        MusNotice mBaseNotice = getMBaseNotice();
        String str3 = null;
        if (mBaseNotice == null || (str2 = mBaseNotice.templateId) == null) {
            str2 = "";
        }
        C33744d a = new C33744d().mo59983a("action_type", "click");
        AbstractC62027a mBridge = getMBridge();
        if (mBridge != null) {
            str3 = mBridge.mo100097q();
        }
        C33744d a2 = a.mo59983a("account_type", str3).mo59983a("client_order", String.valueOf(i)).mo59983a("template_id", str2);
        if (!TextUtils.isEmpty(str)) {
            a2.mo59983a("button_type", str);
        }
        C39162r.m79460a("notification_message_inner_message", a2.f79943a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f4, code lost:
        if (com.p2082ss.android.ugc.aweme.notice.api.C61542b.m111469c(r3.intValue()) != false) goto L_0x01f6;
     */
    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo100307a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r14, com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a r15) {
        /*
        // Method dump skipped, instructions count: 635
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.mo100307a(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, com.ss.android.ugc.aweme.notification.h.a.a):void");
    }

    private /* synthetic */ NoticeTemplateRightView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateRightView(final Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.l8, this, true);
        DmtButton dmtButton = (DmtButton) mo100306a(R.id.cu6);
        C89219l.m154716b(dmtButton, "");
        dmtButton.getLayoutParams().width = C62262g.m112633a(context);
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) mo100306a(R.id.cue);
        C89219l.m154716b(notificationFollowUserBtn, "");
        notificationFollowUserBtn.getLayoutParams().width = C62262g.m112633a(context);
        C62023a.m112168a(mo100306a(R.id.cue));
        ((DmtButton) mo100306a(R.id.cu6)).setOnClickListener(this);
        ((SmartRoundImageView) mo100306a(R.id.dkg)).setOnClickListener(this);
        ((ConstraintLayout) mo100306a(R.id.cu2)).setOnClickListener(this);
        C51086a aVar = new C51086a((FollowUserBtn) mo100306a(R.id.cue), new C51086a.C51094g(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.C623201 */

            /* renamed from: a */
            final /* synthetic */ NoticeTemplateRightView f141446a;

            static {
                Covode.recordClassIndex(73105);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                this.f141446a.getMBaseNotice();
                return "notification_page";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f141446a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int i, User user) {
                String str;
                String str2;
                JSONObject jSONObject;
                int i2;
                C61630e eVar;
                String str3;
                super.mo63346a(i, user);
                if (user != null) {
                    if (i == 0) {
                        str = "follow_cancel";
                    } else {
                        str = "follow";
                    }
                    if (user.getFollowerStatus() == 1) {
                        str2 = "mutual";
                    } else {
                        str2 = "single";
                    }
                    C39162r.onEvent(new MobClick().setEventName(str).setLabelName("message").setValue(user.getUid()));
                    C59256u a = new C59256u().mo96834a("notification_page");
                    a.f135350a = C59256u.EnumC59259c.INBOX_NOTICE;
                    C59256u a2 = a.mo96832a(user);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    MusNotice mBaseNotice = this.f141446a.getMBaseNotice();
                    if (mBaseNotice == null || (eVar = mBaseNotice.templateNotice) == null || (str3 = eVar.f139893i) == null) {
                        jSONObject = new JSONObject();
                    } else {
                        jSONObject = new JSONObject(str3);
                    }
                    Iterator<String> keys = jSONObject.keys();
                    C89219l.m154716b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            if (C89219l.m154714a((Object) next, (Object) "business_extra")) {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                                Iterator<String> keys2 = jSONObject2.keys();
                                C89219l.m154716b(keys2, "");
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    C89219l.m154716b(next2, "");
                                    String optString = jSONObject2.optString(next2);
                                    C89219l.m154716b(optString, "");
                                    linkedHashMap.put(next2, optString);
                                }
                            } else if (!linkedHashMap.containsKey(next)) {
                                C89219l.m154716b(next, "");
                                String optString2 = jSONObject.optString(next);
                                C89219l.m154716b(optString2, "");
                                linkedHashMap.put(next, optString2);
                            }
                            C89379q.m157068constructorimpl(C89391z.f203057a);
                        } catch (Throwable th) {
                            C89379q.m157068constructorimpl(C89382r.m154941a(th));
                        }
                    }
                    a2.mo96788a(linkedHashMap);
                    String str4 = null;
                    if (C89219l.m154714a((Object) str, (Object) "follow")) {
                        C59260v a3 = new C59260v().mo96847a("notification_page");
                        a3.f135402b = "";
                        a3.f135403c = "other_places";
                        a3.f135409s = "follow_button";
                        a3.f135405e = user.getUid();
                        a3.f135412v = str2;
                        AbstractC62027a mBridge = this.f141446a.getMBridge();
                        if (mBridge != null) {
                            str4 = mBridge.mo100097q();
                        }
                        a3.f135382ag = str4;
                        a3.f135376aa = user.isSecret() ? 1 : 0;
                        a3.f135378ac = new AwemeRelationRecommendModel(0, "", user.getRecType(), user.getFriendTypeStr());
                        a3.mo96792f();
                        MusNotice mBaseNotice2 = this.f141446a.getMBaseNotice();
                        if (mBaseNotice2 != null && mBaseNotice2.type == 225) {
                            a2.f135352b = C59256u.EnumC59257a.FOLLOW;
                            a2.mo96792f();
                            return;
                        }
                        return;
                    }
                    C33744d a4 = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("to_user_id", user.getUid()).mo59983a("scene_id", "1002").mo59983a("previous_page", "message").mo59983a("enter_method", "follow_button").mo59983a("previous_page_position", "other_places").mo59983a("request_id", user.getRequestId()).mo59983a("author_id", user.getUid()).mo59980a("is_private", user.isSecret() ? 1 : 0);
                    if (user.getFollowStatus() == 4) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    C33744d a5 = a4.mo59980a("cancel_type", i2);
                    AbstractC62027a mBridge2 = this.f141446a.getMBridge();
                    if (mBridge2 != null) {
                        str4 = mBridge2.mo100097q();
                    }
                    C39162r.m79460a("follow_cancel", a5.mo59983a("account_type", str4).f79943a);
                    MusNotice mBaseNotice3 = this.f141446a.getMBaseNotice();
                    if (mBaseNotice3 != null && mBaseNotice3.type == 225) {
                        a2.f135352b = C59256u.EnumC59257a.FOLLOW_CANCEL;
                        a2.mo96792f();
                    }
                }
            }
        });
        this.f141444a = aVar;
        aVar.f117879e = new C51086a.AbstractC51090c(this) {
            /* class com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.C623212 */

            /* renamed from: a */
            final /* synthetic */ NoticeTemplateRightView f141447a;

            static {
                Covode.recordClassIndex(73106);
            }

            {
                this.f141447a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
            /* renamed from: a */
            public final boolean mo63341a(int i) {
                NoticeTemplateRightView noticeTemplateRightView = this.f141447a;
                Context context = context;
                User a = noticeTemplateRightView.mo100313a();
                C89219l.m154716b(this.f141447a.mo100306a(R.id.cue), "");
                return noticeTemplateRightView.mo100315a(context, a, NotificationFollowUserBtn.m95704b());
            }
        };
        C51086a aVar2 = this.f141444a;
        if (aVar2 != null) {
            aVar2.f117878d = new C51086a.AbstractC51091d(this) {
                /* class com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView.C623223 */

                /* renamed from: a */
                final /* synthetic */ NoticeTemplateRightView f141449a;

                static {
                    Covode.recordClassIndex(73107);
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
                /* renamed from: b */
                public final void mo63344b() {
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
                /* renamed from: a */
                public final void mo63342a() {
                    int i;
                    AbstractC62027a mBridge = this.f141449a.getMBridge();
                    if (mBridge != null) {
                        mBridge.mo100094n();
                    }
                    NoticeTemplateRightView noticeTemplateRightView = this.f141449a;
                    AbstractC62027a mBridge2 = noticeTemplateRightView.getMBridge();
                    if (mBridge2 != null) {
                        i = mBridge2.mo100092l();
                    } else {
                        i = -1;
                    }
                    noticeTemplateRightView.mo100314a(i, C62265i.m112641a(context, this.f141449a.mo100313a()));
                }

                @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
                /* renamed from: a */
                public final void mo63343a(FollowStatus followStatus) {
                    if (followStatus != null) {
                        IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                    }
                }

                {
                    this.f141449a = r1;
                }
            };
        }
        C62023a.m112168a(mo100306a(R.id.dkg));
    }

    /* renamed from: a */
    public final boolean mo100315a(Context context, User user, boolean z) {
        MusNotice mBaseNotice;
        JSONObject jSONObject;
        C61630e eVar;
        String str;
        boolean a = C62264h.m112640a(context, user, null, null, null, z, 28);
        if (a && (mBaseNotice = getMBaseNotice()) != null && mBaseNotice.type == 225) {
            AbstractC62027a mBridge = getMBridge();
            if (mBridge != null) {
                mBridge.mo100094n();
            }
            C59256u uVar = new C59256u();
            uVar.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
            C59256u a2 = uVar.mo96834a("notification_page");
            a2.f135350a = C59256u.EnumC59259c.INBOX_NOTICE;
            C59256u a3 = a2.mo96832a(user);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MusNotice mBaseNotice2 = getMBaseNotice();
            if (mBaseNotice2 == null || (eVar = mBaseNotice2.templateNotice) == null || (str = eVar.f139893i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (C89219l.m154714a((Object) next, (Object) "business_extra")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                        Iterator<String> keys2 = jSONObject2.keys();
                        C89219l.m154716b(keys2, "");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            C89219l.m154716b(next2, "");
                            String optString = jSONObject2.optString(next2);
                            C89219l.m154716b(optString, "");
                            linkedHashMap.put(next2, optString);
                        }
                    } else if (!linkedHashMap.containsKey(next)) {
                        C89219l.m154716b(next, "");
                        String optString2 = jSONObject.optString(next);
                        C89219l.m154716b(optString2, "");
                        linkedHashMap.put(next, optString2);
                    }
                    C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
            }
            a3.mo96788a(linkedHashMap).mo96792f();
        }
        return a;
    }
}

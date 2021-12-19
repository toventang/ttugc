package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46920f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56378h;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p2082ss.android.ugc.aweme.notification.LikeListDetailActivity;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61863b;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62150u;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.notification.utils.C62268k;
import com.p2082ss.android.ugc.aweme.notification.view.C62290d;
import com.p2082ss.android.ugc.aweme.notification.view.C62307g;
import com.p2082ss.android.ugc.aweme.p2315ao.C33515a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.p */
public class C62129p extends AbstractView$OnLongClickListenerC62118k {

    /* renamed from: o */
    public static final boolean f141026o = false;

    /* renamed from: p */
    public static final C62130a f141027p = new C62130a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f141028a = C89250i.m154773a((AbstractC89171a) new C62132c(this));

    /* renamed from: b */
    private final AbstractC89244h f141029b = C89250i.m154773a((AbstractC89171a) new C62134e(this));

    /* renamed from: c */
    private final AbstractC89244h f141030c = C89250i.m154773a((AbstractC89171a) new C62131b(this));

    /* renamed from: m */
    public boolean f141031m;

    /* renamed from: n */
    public Bundle f141032n;

    /* renamed from: c */
    private int mo100067c() {
        return ((Number) this.f141028a.getValue()).intValue();
    }

    /* renamed from: h */
    private int mo100149h() {
        return ((Number) this.f141029b.getValue()).intValue();
    }

    /* renamed from: i */
    private String mo100089i() {
        return (String) this.f141030c.getValue();
    }

    /* renamed from: a */
    public void mo100151a(View view) {
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    public int ce_() {
        return R.id.cv7;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.p$a */
    public static final class C62130a {
        static {
            Covode.recordClassIndex(72884);
        }

        private C62130a() {
        }

        public /* synthetic */ C62130a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m112359a(String str, String str2, boolean z, String str3, String str4) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            AbstractView$OnLongClickListenerC62118k.m112176b(str, str2, "message");
            if (TextUtils.isEmpty(str4)) {
                str4 = "notification_page";
            }
            if (str3 == null) {
                if (z) {
                    str3 = "click_name";
                } else {
                    str3 = "click_head";
                }
            }
            AbstractView$OnLongClickListenerC62118k.m112174a(str, str4, str3);
        }

        /* renamed from: a */
        public static /* synthetic */ void m112360a(String str, String str2, boolean z, String str3, String str4, int i) {
            if ((i & 8) != 0) {
                z = false;
            }
            if ((i & 16) != 0) {
                str3 = null;
            }
            if ((i & 32) != 0) {
                str4 = "";
            }
            m112359a(str, str2, z, str3, str4);
        }
    }

    /* renamed from: a */
    public final void mo100153a(TextView textView, User user, BaseNotice baseNotice, String str, String str2) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(user, "");
        textView.setText(m112339a((C62129p) C89070n.m154516a(user), (List) 0, 1, (int) baseNotice, (BaseNotice) true, (boolean) str, (String) null));
        textView.setMovementMethod(C62290d.m112693a());
        C80581io.m139703a(this.f140983i, new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), null, 9, null), textView);
    }

    /* renamed from: a */
    public final void mo100154a(TextView textView, List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        C89219l.m154721d(textView, "");
        textView.setText(m112339a((C62129p) list, (List) i, i2, (int) baseNotice, (BaseNotice) z, (boolean) str, (String) null));
        textView.setMovementMethod(C62290d.m112693a());
        if (list != null && list.size() == 1) {
            C80581io.m139703a(this.f140983i, new UserVerify(null, ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), null, 9, null), textView);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public static void m112345a(com.p2082ss.android.ugc.aweme.notification.view.FollowTuxTextView r8, java.lang.String r9, java.util.List<? extends com.p2082ss.android.ugc.aweme.profile.model.User> r10, android.view.View r11) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p.m112345a(com.ss.android.ugc.aweme.notification.view.FollowTuxTextView, java.lang.String, java.util.List, android.view.View):void");
    }

    /* renamed from: a */
    public static void m112346a(MutualRelationView mutualRelationView, List<? extends User> list, View view, View view2) {
        C89219l.m154721d(mutualRelationView, "");
        User c = list != null ? C33515a.m68680c(list) : null;
        if (c == null) {
            C61862a.m111997a(mutualRelationView);
            C61863b.m112001a(mutualRelationView, view, view2, false);
            return;
        }
        C61863b.m112002a(mutualRelationView, c.getMatchedFriendStruct(), 0);
        C61863b.m112001a(mutualRelationView, view, view2, true);
    }

    /* renamed from: a */
    public final void mo100152a(TextView textView, SpannableStringBuilder spannableStringBuilder, int i, int i2, User user, BaseNotice baseNotice, String str) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(spannableStringBuilder, "");
        C89219l.m154721d(user, "");
        spannableStringBuilder.setSpan(m112340a(this, user, 0, baseNotice, false, str, 24), i, i2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(mo100067c()), i, i2, 33);
        textView.setMovementMethod(C62290d.m112693a());
    }

    /* renamed from: a */
    public final void mo100155a(TextView textView, List<? extends User> list, Integer num, BaseNotice baseNotice, String str) {
        C89219l.m154721d(textView, "");
        textView.setText(m112339a(list, 100, num != null ? num.intValue() : 0, baseNotice, false, (String) null, str));
        textView.setMovementMethod(C62290d.m112693a());
        if (list != null && list.size() == 1) {
            C80581io.m139703a(this.f140983i, new UserVerify(null, ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), null, 9, null), textView);
        }
    }

    /* renamed from: a */
    public final void mo100156a(String str, String str2, Integer num, List<String> list, int i) {
        C89219l.m154721d(str, "");
        C61968c.HandlerC61971c b = C61968c.m112097b();
        if (b != null) {
            b.mo100034b(this.f140984j);
        }
        BaseNotice baseNotice = this.f140984j;
        String str3 = null;
        Integer valueOf = baseNotice != null ? Integer.valueOf(baseNotice.type) : null;
        BaseNotice baseNotice2 = this.f140984j;
        if (baseNotice2 != null) {
            str3 = baseNotice2.nid;
        }
        C56378h.m102356b(str, valueOf, str3);
        if (MSAdaptionService.m97895c().mo89377c(this.f140983i)) {
            SmartRouter.buildRoute(C17867d.m33078a(), "//duo").withParam("duo_type", "duo_detail").withParam("id", str).withParam("refer", "notification_page").withParam("cid", str2).open();
        } else {
            SmartRoute withParam = SmartRouter.buildRoute(C17867d.m33078a(), "aweme://aweme/detail/").withParam("id", str).withParam("refer", "notification_page").withParam("cid", str2);
            C89219l.m154716b(withParam, "");
            SmartRoute a = C61968c.m112094a(withParam, "aweme://aweme/detail/");
            if (num != null) {
                a.withParam("story_comment_user_follow_status", num.intValue());
            }
            if (list != null && !list.isEmpty()) {
                a.withParam("like_ids", C80342dg.m139300a().mo46674b(list));
                a.withParam("like_count", i);
            }
            a.open();
        }
        Context context = this.f140983i;
        C89219l.m154716b(context, "");
        C62266j.m112644a(context);
    }

    /* renamed from: a */
    public static void m112348a(String str, String str2, Integer num) {
        C89219l.m154721d(str, "");
        SmartRoute withParam = SmartRouter.buildRoute(C17867d.m33078a(), "aweme://story/detail").withParam("video_from", "STORY_ENTRANCE_DEFAULT").withParam("enter_from", "notification_page").withParam("id", str).withParam("cid", str2);
        if (num != null) {
            withParam.withParam("story_comment_user_follow_status", num.intValue());
        }
        withParam.open();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.p$b */
    public static final class C62131b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C62129p f141033a;

        static {
            Covode.recordClassIndex(72885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62131b(C62129p pVar) {
            super(0);
            this.f141033a = pVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f141033a.f140983i.getString(R.string.djh);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.p$c */
    public static final class C62132c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C62129p f141034a;

        static {
            Covode.recordClassIndex(72886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62132c(C62129p pVar) {
            super(0);
            this.f141034a = pVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f141034a.f140983i, R.color.bx));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.p$e */
    public static final class C62134e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C62129p f141041a;

        static {
            Covode.recordClassIndex(72888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62134e(C62129p pVar) {
            super(0);
            this.f141041a = pVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f141041a.f140983i, R.color.c4));
        }
    }

    static {
        Covode.recordClassIndex(72883);
    }

    /* renamed from: c */
    public void mo100157c(int i) {
        this.f141032n = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62129p(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    /* renamed from: a */
    protected static int m112336a(User user) {
        C89219l.m154721d(user, "");
        int followStatus = user.getFollowStatus();
        if ((followStatus != 0 && followStatus != 4) || user.getFollowStatus() == 4) {
            return 0;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return 1;
        }
        return 4;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.p$d */
    public static final class C62133d implements AbstractC62099d {

        /* renamed from: a */
        final /* synthetic */ C62129p f141035a;

        /* renamed from: b */
        final /* synthetic */ int f141036b;

        /* renamed from: c */
        final /* synthetic */ BaseNotice f141037c;

        /* renamed from: d */
        final /* synthetic */ boolean f141038d;

        /* renamed from: e */
        final /* synthetic */ String f141039e;

        /* renamed from: f */
        final /* synthetic */ String f141040f;

        static {
            Covode.recordClassIndex(72887);
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62099d
        /* renamed from: a */
        public final void mo100133a(View view, User user) {
            boolean z;
            int i;
            DiggNotice diggNotice;
            String str;
            String str2 = "";
            C89219l.m154721d(view, str2);
            this.f141035a.mo100151a(view);
            int i2 = this.f141036b;
            boolean z2 = false;
            if (i2 == 0) {
                if (TextUtils.equals("notification_page", "fans")) {
                    Context context = this.f141035a.f140983i;
                    C89219l.m154716b(context, str2);
                    BaseNotice baseNotice = this.f141037c;
                    if (baseNotice != null) {
                        i = baseNotice.clientOrder;
                    } else {
                        i = -1;
                    }
                    C62266j.m112645a(context, "fans", i);
                }
                if (user != null) {
                    C62129p pVar = this.f141035a;
                    BaseNotice baseNotice2 = this.f141037c;
                    C89219l.m154721d(pVar, str2);
                    C89219l.m154721d(user, str2);
                    pVar.getClass().getSimpleName();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String uid = user.getUid();
                    if (uid == null || uid.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashMap.put("invalid_u", "1");
                    }
                    String secUid = user.getSecUid();
                    if (secUid == null || secUid.length() == 0) {
                        linkedHashMap.put("invalid_sec_u", "1");
                    }
                    if (!linkedHashMap.isEmpty()) {
                        String simpleName = pVar.getClass().getSimpleName();
                        if (simpleName == null) {
                            simpleName = str2;
                        }
                        linkedHashMap.put("caller", simpleName);
                        if (baseNotice2 != null) {
                            String str3 = baseNotice2.nid;
                            if (str3 == null) {
                                str3 = str2;
                            }
                            linkedHashMap.put("nid", str3);
                            linkedHashMap.put(StringSet.type, String.valueOf(baseNotice2.type));
                        }
                        C39162r.m79460a("inbox_vh_invalid_user", linkedHashMap);
                        C39109f.m79404c("NameSpanMonitor", "check, invalid user: ".concat(String.valueOf(linkedHashMap)));
                    }
                    String uid2 = user.getUid();
                    if (uid2 == null) {
                        uid2 = str2;
                    }
                    String secUid2 = user.getSecUid();
                    if (secUid2 != null) {
                        str2 = secUid2;
                    }
                    C62130a.m112360a(uid2, str2, true, null, null, 48);
                }
            } else if (i2 == 1) {
                BaseNotice baseNotice3 = this.f141037c;
                if (baseNotice3 != null && (diggNotice = baseNotice3.diggNotice) != null) {
                    String cid = diggNotice.getCid();
                    if (cid == null || cid.length() == 0) {
                        z2 = true;
                    }
                    String str4 = null;
                    ArrayList arrayList = null;
                    if (!z2 || C62129p.m112177b(diggNotice.getDiggType()) || !C46920f.m90222b()) {
                        int diggType = diggNotice.getDiggType();
                        if (diggType == 0) {
                            C62129p pVar2 = this.f141035a;
                            Aweme aweme = diggNotice.getAweme();
                            C89219l.m154716b(aweme, str2);
                            String aid = aweme.getAid();
                            C89219l.m154716b(aid, str2);
                            C62129p.m112344a(pVar2, aid, diggNotice.getCid(), (Integer) null, (List) null, 0, 28);
                        } else if (diggType == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141118e || diggType == View$OnClickListenerC62150u.AbstractC62152a.C62153a.f141119f) {
                            Aweme aweme2 = diggNotice.getAweme();
                            C89219l.m154716b(aweme2, str2);
                            String aid2 = aweme2.getAid();
                            C89219l.m154716b(aid2, str2);
                            C62129p.m112348a(aid2, diggNotice.getCid(), (Integer) null);
                        } else {
                            if (diggNotice.getDiggType() == 3) {
                                Comment comment = diggNotice.getComment();
                                if (comment != null) {
                                    str = comment.getCid();
                                }
                                str = null;
                            } else {
                                Aweme aweme3 = diggNotice.getAweme();
                                if (aweme3 != null) {
                                    str = aweme3.getAid();
                                }
                                str = null;
                            }
                            Context context2 = view.getContext();
                            C89219l.m154716b(context2, str2);
                            BaseNotice baseNotice4 = this.f141035a.f140984j;
                            String str5 = baseNotice4 != null ? baseNotice4.nid : null;
                            Aweme aweme4 = diggNotice.getAweme();
                            if (aweme4 != null) {
                                str4 = aweme4.getAid();
                            }
                            boolean z3 = this.f141038d;
                            int diggType2 = diggNotice.getDiggType();
                            long j = this.f141037c.lastReadTime;
                            String a = C62102g.m112296a(diggNotice.getComment());
                            Aweme aweme5 = diggNotice.getAweme();
                            C89219l.m154716b(aweme5, str2);
                            Video video = aweme5.getVideo();
                            C89219l.m154716b(video, str2);
                            LikeListDetailActivity.C61640a.m111668a(context2, str5, str4, str, z3, diggType2, j, a, video.getOriginCover(), this.f141039e);
                        }
                    } else {
                        C62129p pVar3 = this.f141035a;
                        Aweme aweme6 = diggNotice.getAweme();
                        C89219l.m154716b(aweme6, str2);
                        String aid3 = aweme6.getAid();
                        C89219l.m154716b(aid3, str2);
                        List<User> users = diggNotice.getUsers();
                        if (users != null) {
                            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) users, 10));
                            for (T t : users) {
                                C89219l.m154716b(t, str2);
                                arrayList2.add(t.getUid());
                            }
                            arrayList = arrayList2;
                        }
                        pVar3.mo100156a(aid3, (String) null, (Integer) null, arrayList, diggNotice.getMergeCount());
                    }
                }
            } else if (i2 == 2) {
                C62129p pVar4 = this.f141035a;
                pVar4.mo100143a("check_profile", pVar4.getLayoutPosition());
                C62268k.m112648a(view.getContext());
            } else if (i2 == 100) {
                C36125t.m73598a(C36125t.m73591a(), this.f141040f);
            }
        }

        C62133d(C62129p pVar, int i, BaseNotice baseNotice, boolean z, String str, String str2) {
            this.f141035a = pVar;
            this.f141036b = i;
            this.f141037c = baseNotice;
            this.f141038d = z;
            this.f141039e = str;
            this.f141040f = str2;
        }
    }

    /* renamed from: a */
    private final C17191a.C17192a m112337a(C17191a.C17192a aVar, User user, BaseNotice baseNotice, String str) {
        String a = C62266j.m112643a(user);
        if (!TextUtils.isEmpty(a)) {
            C62307g a2 = m112340a(this, user, 0, baseNotice, false, str, 24);
            C89219l.m154721d(a, "");
            int length = aVar.f40973a.length();
            C17191a.C17194c.m31757a(aVar.f40973a, a);
            if (a2 != null) {
                aVar.f40973a.setSpan(a2, length, aVar.f40973a.length(), 33);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private final C62307g m112341a(User user, int i, BaseNotice baseNotice, boolean z, String str, String str2) {
        return new C62307g(user, i, mo100067c(), mo100149h(), new C62133d(this, i, baseNotice, z, str2, str));
    }

    /* renamed from: a */
    private static /* synthetic */ C62307g m112340a(C62129p pVar, User user, int i, BaseNotice baseNotice, boolean z, String str, int i2) {
        BaseNotice baseNotice2 = baseNotice;
        boolean z2 = z;
        String str2 = null;
        if ((i2 & 4) != 0) {
            baseNotice2 = null;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        if ((i2 & 32) == 0) {
            str2 = str;
        }
        return pVar.m112341a(user, i, baseNotice2, z2, (String) null, str2);
    }

    /* renamed from: a */
    private final C17191a m112339a(List<? extends User> list, int i, int i2, BaseNotice baseNotice, boolean z, String str, String str2) {
        C62307g a;
        C17191a.C17192a aVar = new C17191a.C17192a();
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                m112337a(aVar, (User) list.get(0), baseNotice, str);
            } else if (list.size() == 2 && 1 <= i2 && 3 >= i2) {
                C17191a.C17192a a2 = m112337a(aVar, (User) list.get(0), baseNotice, str).mo27177a(" ");
                String i3 = mo100089i();
                C89219l.m154716b(i3, "");
                m112337a(a2.mo27177a(i3).mo27177a(" "), (User) list.get(1), baseNotice, str);
            } else if (list.size() == 3 || (i2 == 3 && list.size() > 3)) {
                C17191a.C17192a a3 = m112337a(m112337a(aVar, (User) list.get(0), baseNotice, str).mo27177a(", "), (User) list.get(1), baseNotice, str).mo27177a(" ");
                String i4 = mo100089i();
                C89219l.m154716b(i4, "");
                m112337a(a3.mo27177a(i4).mo27177a(" "), (User) list.get(2), baseNotice, str);
            } else if (list.size() > 1) {
                String string = this.f140983i.getString(R.string.djg, Integer.valueOf(Math.max(i2, list.size()) - 2));
                C89219l.m154716b(string, "");
                if (i == 2) {
                    a = m112340a(this, (User) null, 2, baseNotice, false, str, 24);
                } else if (i == 1) {
                    a = m112340a(this, (User) null, 1, baseNotice, z, str, 16);
                } else {
                    a = m112341a((User) null, 100, baseNotice, z, str2, str);
                }
                C17191a.C17192a a4 = m112337a(m112337a(aVar, (User) list.get(0), baseNotice, str).mo27177a(", "), (User) list.get(1), baseNotice, str).mo27177a(" ");
                String i5 = mo100089i();
                C89219l.m154716b(i5, "");
                a4.mo27177a(i5).mo27177a(" ").mo27178a(string, a, 33);
            }
        }
        return aVar.f40973a;
    }

    /* renamed from: a */
    public static /* synthetic */ void m112344a(C62129p pVar, String str, String str2, Integer num, List list, int i, int i2) {
        Integer num2 = num;
        int i3 = i;
        List list2 = null;
        if ((i2 & 4) != 0) {
            num2 = null;
        }
        if ((i2 & 8) == 0) {
            list2 = list;
        }
        if ((i2 & 16) != 0) {
            i3 = 0;
        }
        pVar.mo100156a(str, str2, num2, list2, i3);
    }
}

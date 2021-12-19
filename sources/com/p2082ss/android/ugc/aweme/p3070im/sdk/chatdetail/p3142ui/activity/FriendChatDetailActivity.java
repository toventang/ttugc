package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53651a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a.C54833b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55099j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55185ag;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.BlockResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.activity.RelationSelectActivity;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56194a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity */
public final class FriendChatDetailActivity extends AbstractView$OnClickListenerC54682a implements WeakHandler.IHandler, AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public static final C54629a f125225j = new C54629a((byte) 0);

    /* renamed from: f */
    TextView f125226f;

    /* renamed from: g */
    public IMUser f125227g;

    /* renamed from: h */
    public WeakHandler f125228h;

    /* renamed from: i */
    int f125229i;

    /* renamed from: k */
    private RelativeLayout f125230k;

    /* renamed from: l */
    private AvatarImageView f125231l;

    /* renamed from: m */
    private ImageView f125232m;

    /* renamed from: n */
    private TextView f125233n;

    /* renamed from: o */
    private TextView f125234o;

    /* renamed from: p */
    private TextView f125235p;

    /* renamed from: q */
    private RelativeLayout f125236q;

    /* renamed from: r */
    private boolean f125237r;

    /* renamed from: s */
    private boolean f125238s;

    /* renamed from: t */
    private HashMap f125239t;

    static {
        Covode.recordClassIndex(64342);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f125239t;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f125239t == null) {
            this.f125239t = new HashMap();
        }
        View view = (View) this.f125239t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f125239t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(325, new RunnableC90250g(FriendChatDetailActivity.class, "onBlockUserSuccessEvent", C56194a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$a */
    public static final class C54629a {
        static {
            Covode.recordClassIndex(64343);
        }

        private C54629a() {
        }

        public /* synthetic */ C54629a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$b */
    public static final class RunnableC54630b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FriendChatDetailActivity f125240a;

        /* renamed from: b */
        final /* synthetic */ boolean f125241b;

        static {
            Covode.recordClassIndex(64344);
        }

        public final void run() {
            if (this.f125241b) {
                FriendChatDetailActivity.m100133a(this.f125240a).setFollowStatus(0);
            }
            FriendChatDetailActivity.m100133a(this.f125240a).setBlock(this.f125241b);
            C55085g.m100752a(FriendChatDetailActivity.m100133a(this.f125240a));
        }

        RunnableC54630b(FriendChatDetailActivity friendChatDetailActivity, boolean z) {
            this.f125240a = friendChatDetailActivity;
            this.f125241b = z;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onResume", true);
        super.onResume();
        IMUser iMUser = this.f125227g;
        if (iMUser == null) {
            C89219l.m154710a("mUser");
        }
        if (!IMUser.isInvalidUser(iMUser.getUid())) {
            IMUser iMUser2 = this.f125227g;
            if (iMUser2 == null) {
                C89219l.m154710a("mUser");
            }
            String uid = iMUser2.getUid();
            IMUser iMUser3 = this.f125227g;
            if (iMUser3 == null) {
                C89219l.m154710a("mUser");
            }
            C55085g.m100755a(uid, iMUser3.getSecUid(), new C54639h(this));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onResume", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a
    /* renamed from: c */
    public final void mo91692c() {
        Serializable serializable;
        super.mo91692c();
        Bundle a = m100132a(getIntent());
        if (a != null) {
            serializable = a.getSerializable("simple_uesr");
        } else {
            serializable = null;
        }
        boolean z = true;
        if (a == null || !(serializable instanceof IMUser)) {
            StringBuilder sb = new StringBuilder("initParams, containsExtra: ");
            if (a == null) {
                z = false;
            }
            C56244a.m102193e("FriendChatDetailActivity", sb.append(z).append(", containsUser: ").append(serializable instanceof IMUser).toString());
            finish();
            return;
        }
        IMUser iMUser = (IMUser) serializable;
        this.f125227g = iMUser;
        if (iMUser == null) {
            C89219l.m154710a("mUser");
        }
        String uid = iMUser.getUid();
        if (!(uid == null || uid.length() == 0)) {
            try {
                this.f125311e = AbstractC17427b.C17428a.m32308a(AbstractC17427b.C17428a.m32309a(Long.parseLong(uid)));
            } catch (Exception unused) {
            }
        }
        this.f125237r = a.getBoolean("is_stranger", false);
        this.f125238s = a.getBoolean("is_author_supporter", false);
        this.f125228h = new WeakHandler(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a
    /* renamed from: e */
    public final void mo91694e() {
        super.mo91694e();
        if (this.f125227g == null) {
            C56244a.m102193e("FriendChatDetailActivity", "initEvents, mUser is not initialized, isFinishing: " + isFinishing());
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout = this.f125230k;
        if (relativeLayout == null) {
            C89219l.m154710a("mAvatarLayout");
        }
        relativeLayout.setOnClickListener(this);
        AvatarImageView avatarImageView = this.f125231l;
        if (avatarImageView == null) {
            C89219l.m154710a("mAvatarImage");
        }
        avatarImageView.setOnClickListener(this);
        TextView textView = this.f125226f;
        if (textView == null) {
            C89219l.m154710a("mBlockText");
        }
        textView.setOnClickListener(this);
        TextView textView2 = this.f125235p;
        if (textView2 == null) {
            C89219l.m154710a("mReportText");
        }
        textView2.setOnClickListener(this);
        ((ConstraintLayout) _$_findCachedViewById(R.id.c3p)).setOnClickListener(this);
        C55173ae.View$OnTouchListenerC55177a aVar = new C55173ae.View$OnTouchListenerC55177a();
        View[] viewArr = new View[2];
        RelativeLayout relativeLayout2 = this.f125230k;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mAvatarLayout");
        }
        viewArr[0] = relativeLayout2;
        AvatarImageView avatarImageView2 = this.f125231l;
        if (avatarImageView2 == null) {
            C89219l.m154710a("mAvatarImage");
        }
        viewArr[1] = avatarImageView2;
        aVar.mo92194a(viewArr);
        int c = C0643b.m2378c(this, R.color.c9);
        int c2 = C0643b.m2378c(this, R.color.j);
        View[] viewArr2 = new View[2];
        TextView textView3 = this.f125226f;
        if (textView3 == null) {
            C89219l.m154710a("mBlockText");
        }
        viewArr2[0] = textView3;
        TextView textView4 = this.f125235p;
        if (textView4 == null) {
            C89219l.m154710a("mReportText");
        }
        viewArr2[1] = textView4;
        C55173ae.m100881a(c, c2, viewArr2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a
    /* renamed from: d */
    public final void mo91693d() {
        super.mo91693d();
        if (this.f125227g == null) {
            C56244a.m102193e("FriendChatDetailActivity", "initViews, mUser is not initialized, isFinishing: " + isFinishing());
            if (!isFinishing()) {
                finish();
                return;
            }
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.ot);
        C89219l.m154716b(relativeLayout, "");
        this.f125230k = relativeLayout;
        AvatarImageView avatarImageView = (AvatarImageView) _$_findCachedViewById(R.id.on);
        C89219l.m154716b(avatarImageView, "");
        this.f125231l = avatarImageView;
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.fbe);
        C89219l.m154716b(tuxIconView, "");
        this.f125232m = tuxIconView;
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.cpq);
        C89219l.m154716b(tuxTextView, "");
        this.f125233n = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.akb);
        C89219l.m154716b(tuxTextView2, "");
        this.f125234o = tuxTextView2;
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.t1);
        C89219l.m154716b(relativeLayout2, "");
        this.f125236q = relativeLayout2;
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.diw);
        C89219l.m154716b(tuxTextView3, "");
        this.f125235p = tuxTextView3;
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.t3);
        C89219l.m154716b(tuxTextView4, "");
        this.f125226f = tuxTextView4;
        int i = 8;
        if (this.f125237r) {
            RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(R.id.c51);
            C89219l.m154716b(relativeLayout3, "");
            relativeLayout3.setVisibility(8);
            RelativeLayout relativeLayout4 = (RelativeLayout) _$_findCachedViewById(R.id.c6h);
            C89219l.m154716b(relativeLayout4, "");
            relativeLayout4.setVisibility(8);
        }
        if (this.f125238s) {
            RelativeLayout relativeLayout5 = (RelativeLayout) _$_findCachedViewById(R.id.c5t);
            C89219l.m154716b(relativeLayout5, "");
            relativeLayout5.setVisibility(8);
            RelativeLayout relativeLayout6 = (RelativeLayout) _$_findCachedViewById(R.id.t1);
            C89219l.m154716b(relativeLayout6, "");
            relativeLayout6.setVisibility(8);
            TuxIconView tuxIconView2 = (TuxIconView) _$_findCachedViewById(R.id.clz);
            C89219l.m154716b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
            TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.akb);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
            AvatarImageView avatarImageView2 = (AvatarImageView) _$_findCachedViewById(R.id.on);
            C89219l.m154716b(avatarImageView2, "");
            avatarImageView2.setEnabled(false);
            RelativeLayout relativeLayout7 = (RelativeLayout) _$_findCachedViewById(R.id.ot);
            C89219l.m154716b(relativeLayout7, "");
            relativeLayout7.setEnabled(false);
        }
        if (C55052e.m100675f()) {
            ((TuxTextView) _$_findCachedViewById(R.id.diw)).setTextColorRes(R.attr.av);
            TuxIconView tuxIconView3 = (TuxIconView) _$_findCachedViewById(R.id.dir);
            C89219l.m154716b(tuxIconView3, "");
            tuxIconView3.setVisibility(8);
            ((TuxTextView) _$_findCachedViewById(R.id.t3)).setTextColorRes(R.attr.av);
            TuxIconView tuxIconView4 = (TuxIconView) _$_findCachedViewById(R.id.sz);
            C89219l.m154716b(tuxIconView4, "");
            tuxIconView4.setVisibility(8);
        }
        IMUser iMUser = this.f125227g;
        if (iMUser == null) {
            C89219l.m154710a("mUser");
        }
        mo91691a(iMUser);
        IMUser iMUser2 = this.f125227g;
        if (iMUser2 == null) {
            C89219l.m154710a("mUser");
        }
        if (TextUtils.equals(iMUser2.getUid(), C55197c.m100919b())) {
            RelativeLayout relativeLayout8 = this.f125236q;
            if (relativeLayout8 == null) {
                C89219l.m154710a("mBlockLayout");
            }
            relativeLayout8.setVisibility(8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.c3p);
        C89219l.m154716b(constraintLayout, "");
        boolean a = C56201b.m102110a();
        if (a) {
            IMUser iMUser3 = this.f125227g;
            if (iMUser3 == null) {
                C89219l.m154710a("mUser");
            }
            boolean isFriend = IMUser.isFriend(iMUser3.getFollowStatus());
            if (isFriend) {
                i = 0;
            } else if (isFriend) {
                throw new C89376n();
            }
        } else if (a) {
            throw new C89376n();
        }
        constraintLayout.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$e */
    public static final class DialogInterface$OnClickListenerC54633e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FriendChatDetailActivity f125244a;

        static {
            Covode.recordClassIndex(64347);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        DialogInterface$OnClickListenerC54633e(FriendChatDetailActivity friendChatDetailActivity) {
            this.f125244a = friendChatDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                String a = C55099j.m100775a(FriendChatDetailActivity.m100133a(this.f125244a));
                WeakHandler weakHandler = this.f125244a.f125228h;
                if (weakHandler == null) {
                    C89219l.m154710a("mHandler");
                }
                String uid = FriendChatDetailActivity.m100133a(this.f125244a).getUid();
                C89219l.m154716b(uid, "");
                C55257a.m101014a(weakHandler, uid, a, 1, 1);
                C55059b.m100690a("success", FriendChatDetailActivity.m100133a(this.f125244a).getUid(), "chat");
                C54833b.m100431b("confirm", FriendChatDetailActivity.m100133a(this.f125244a).getUid());
                return;
            }
            C55059b.m100690a("cancel", FriendChatDetailActivity.m100133a(this.f125244a).getUid(), "chat");
            C54833b.m100431b("cancel", FriendChatDetailActivity.m100133a(this.f125244a).getUid());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$h */
    public static final class C54639h implements AbstractC56230a {

        /* renamed from: a */
        final /* synthetic */ FriendChatDetailActivity f125250a;

        static {
            Covode.recordClassIndex(64353);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54639h(FriendChatDetailActivity friendChatDetailActivity) {
            this.f125250a = friendChatDetailActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91086a(Throwable th) {
            C89219l.m154721d(th, "");
            C89219l.m154721d(th, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91085a(IMUser iMUser) {
            if (iMUser != null) {
                FriendChatDetailActivity friendChatDetailActivity = this.f125250a;
                if (iMUser.isBlock()) {
                    friendChatDetailActivity.f125229i = 1;
                    TextView textView = friendChatDetailActivity.f125226f;
                    if (textView == null) {
                        C89219l.m154710a("mBlockText");
                    }
                    textView.setText(R.string.ci8);
                } else {
                    friendChatDetailActivity.f125229i = 0;
                    TextView textView2 = friendChatDetailActivity.f125226f;
                    if (textView2 == null) {
                        C89219l.m154710a("mBlockText");
                    }
                    textView2.setText(R.string.ccf);
                }
                friendChatDetailActivity.f125227g = iMUser;
                IMUser iMUser2 = friendChatDetailActivity.f125227g;
                if (iMUser2 == null) {
                    C89219l.m154710a("mUser");
                }
                friendChatDetailActivity.mo91691a(iMUser2);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m100132a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IMUser m100133a(FriendChatDetailActivity friendChatDetailActivity) {
        IMUser iMUser = friendChatDetailActivity.f125227g;
        if (iMUser == null) {
            C89219l.m154710a("mUser");
        }
        return iMUser;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$f */
    static final class C54634f extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Activity f125245a;

        static {
            Covode.recordClassIndex(64348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54634f(Activity activity) {
            super(1);
            this.f125245a = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.ep1, (AbstractC89172b<? super C23024a, C89391z>) null);
            bVar2.mo37418b(R.string.ep2, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.FriendChatDetailActivity.C54634f.C546351 */

                /* renamed from: a */
                final /* synthetic */ C54634f f125246a;

                static {
                    Covode.recordClassIndex(64349);
                }

                {
                    this.f125246a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    SmartRouter.buildRoute(this.f125246a.f125245a, "//setting/blocklist").open();
                    return C89391z.f203057a;
                }
            });
            bVar2.f54513b = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$g */
    static final class C54636g extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C54636g f125247a = new C54636g();

        static {
            Covode.recordClassIndex(64350);
        }

        C54636g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C546371.f125248a);
            baseActivityViewModel2.config(C546382.f125249a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final void m100136c(boolean z) {
        WeakHandler weakHandler = this.f125228h;
        if (weakHandler == null) {
            C89219l.m154710a("mHandler");
        }
        weakHandler.post(new RunnableC54630b(this, z));
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onCreate", true);
        activityConfiguration(C54636g.f125247a);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m100134a(int i) {
        int i2 = R.string.cdr;
        if (i != -1) {
            if (i == 0) {
                i2 = R.string.cci;
            } else if (i == 1) {
                i2 = R.string.ci9;
            }
        }
        new C23144b(this).mo37640e(i2).mo37637b();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C56194a aVar) {
        C89219l.m154721d(aVar, "");
        this.f125229i = 1;
        TextView textView = this.f125226f;
        if (textView == null) {
            C89219l.m154710a("mBlockText");
        }
        textView.setText(R.string.ci8);
        new C23144b(this).mo37640e(R.string.cci).mo37637b();
        m100136c(true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91691a(com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.FriendChatDetailActivity.mo91691a(com.ss.android.ugc.aweme.im.service.model.IMUser):void");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C89219l.m154721d(message, "");
        if (message.what == 1) {
            Object obj = message.obj;
            if (obj instanceof C34485a) {
                if (((C34480a) obj).getErrorCode() != 3002038) {
                    m100134a(-1);
                } else {
                    C23028c.m43435a((C23023b) new C23023b(this).mo37483b(R.string.ep3), new C54634f(this)).mo37405a().mo37396b().show();
                }
            } else if (obj instanceof BlockResponse) {
                BlockResponse blockResponse = (BlockResponse) obj;
                if (blockResponse.getBlockStaus() == 1) {
                    this.f125229i = 1;
                    TextView textView = this.f125226f;
                    if (textView == null) {
                        C89219l.m154710a("mBlockText");
                    }
                    textView.setText(R.string.ci8);
                    m100134a(0);
                    m100136c(true);
                } else if (blockResponse.getBlockStaus() == 0) {
                    this.f125229i = 0;
                    TextView textView2 = this.f125226f;
                    if (textView2 == null) {
                        C89219l.m154710a("mBlockText");
                    }
                    textView2.setText(R.string.ccf);
                    m100134a(1);
                    m100136c(false);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a
    public final void onClick(View view) {
        String b;
        String str;
        int i;
        C19638h c;
        String str2 = "";
        C89219l.m154721d(view, str2);
        super.onClick(view);
        int id = view.getId();
        Long l = null;
        boolean z = true;
        if (id == R.id.ot || id == R.id.on) {
            if (!this.f125238s || C53651a.m98930d()) {
                C55099j jVar = C55099j.f126093b;
                IMUser iMUser = this.f125227g;
                if (iMUser == null) {
                    C89219l.m154710a("mUser");
                }
                jVar.mo92008b(iMUser.getUid());
                IMUser iMUser2 = this.f125227g;
                if (iMUser2 == null) {
                    C89219l.m154710a("mUser");
                }
                C55185ag.m100886a(iMUser2.getUid());
            }
        } else if (id == R.id.t3) {
            if (this.f125229i == 0) {
                DialogInterface$OnClickListenerC54633e eVar = new DialogInterface$OnClickListenerC54633e(this);
                String string = getString(R.string.ccg);
                C89219l.m154716b(string, str2);
                C17197a.C17200a aVar = new C17197a.C17200a(this);
                aVar.f41071b = string;
                aVar.mo27190a(R.string.cd4, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC54631c(eVar), false).mo27195b(R.string.cck, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC54632d(eVar), false).mo27193a().mo27185c();
                IMUser iMUser3 = this.f125227g;
                if (iMUser3 == null) {
                    C89219l.m154710a("mUser");
                }
                C55059b.m100690a("chat", iMUser3.getUid(), (String) null);
                IMUser iMUser4 = this.f125227g;
                if (iMUser4 == null) {
                    C89219l.m154710a("mUser");
                }
                C54833b.m100428a("block", iMUser4.getUid());
                return;
            }
            IMUser iMUser5 = this.f125227g;
            if (iMUser5 == null) {
                C89219l.m154710a("mUser");
            }
            String a = C55099j.m100775a(iMUser5);
            WeakHandler weakHandler = this.f125228h;
            if (weakHandler == null) {
                C89219l.m154710a("mHandler");
            }
            IMUser iMUser6 = this.f125227g;
            if (iMUser6 == null) {
                C89219l.m154710a("mUser");
            }
            String uid = iMUser6.getUid();
            C89219l.m154716b(uid, str2);
            C55257a.m101014a(weakHandler, uid, a, 0, 1);
            IMUser iMUser7 = this.f125227g;
            if (iMUser7 == null) {
                C89219l.m154710a("mUser");
            }
            C39162r.onEvent(MobClick.obtain().setEventName("unblock").setLabelName("chat").setValue(iMUser7.getUid()));
            IMUser iMUser8 = this.f125227g;
            if (iMUser8 == null) {
                C89219l.m154710a("mUser");
            }
            C54833b.m100428a("unblock", iMUser8.getUid());
        } else if (id == R.id.diw) {
            AbstractC17427b bVar = this.f125311e;
            if (bVar != null) {
                str = bVar.mo27743b();
            } else {
                str = null;
            }
            AbstractC17427b bVar2 = this.f125311e;
            if (!(bVar2 == null || (c = bVar2.mo27749c()) == null)) {
                l = Long.valueOf(c.getConversationShortId());
            }
            IMUser iMUser9 = this.f125227g;
            if (iMUser9 == null) {
                C89219l.m154710a("mUser");
            }
            String uid2 = iMUser9.getUid();
            if (uid2 != null && uid2.length() != 0 && str != null && str.length() != 0 && l != null && l.longValue() > 0) {
                if (this.f125237r) {
                    i = 1;
                } else {
                    IMUser iMUser10 = this.f125227g;
                    if (iMUser10 == null) {
                        C89219l.m154710a("mUser");
                    }
                    if (iMUser10.getCommerceUserLevel() > 0) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
                String valueOf = String.valueOf(l.longValue());
                IMUser iMUser11 = this.f125227g;
                if (iMUser11 == null) {
                    C89219l.m154710a("mUser");
                }
                String uid3 = iMUser11.getUid();
                C89219l.m154716b(uid3, str2);
                IMUser iMUser12 = this.f125227g;
                if (iMUser12 == null) {
                    C89219l.m154710a("mUser");
                }
                String contactName = iMUser12.getContactName();
                IMUser iMUser13 = this.f125227g;
                if (iMUser13 == null) {
                    C89219l.m154710a("mUser");
                }
                String a2 = C53688g.m98961a(iMUser13);
                if (this.f125229i != 1) {
                    z = false;
                }
                C53688g.m98963a(new C53688g.C53689a(valueOf, uid3, str, a2, Boolean.valueOf(z), "im", i, contactName, 32), this, "1");
                IMUser iMUser14 = this.f125227g;
                if (iMUser14 == null) {
                    C89219l.m154710a("mUser");
                }
                C55059b.m100699d(iMUser14.getUid(), "click_share_button");
            }
        } else if (id == R.id.c3p) {
            Bundle bundle = new Bundle();
            IMUser iMUser15 = this.f125227g;
            if (iMUser15 == null) {
                C89219l.m154710a("mUser");
            }
            List a3 = C89070n.m154516a(iMUser15);
            C89086z zVar = C89086z.INSTANCE;
            EnumC55388a aVar2 = EnumC55388a.CREATE_GROUP;
            AbstractC17427b bVar3 = this.f125311e;
            if (!(bVar3 == null || (b = bVar3.mo27743b()) == null)) {
                str2 = b;
            }
            bundle.putSerializable("member_select_config", new C55539b.C55555p(a3, zVar, aVar2, str2));
            RelationSelectActivity.C55896a.m101698a(this, bundle, 12345);
            C54603a.m100103a("private_chat");
            C54603a.m100100a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$c */
    static final class DialogInterface$OnClickListenerC54631c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnClickListenerC54633e f125242a;

        static {
            Covode.recordClassIndex(64345);
        }

        DialogInterface$OnClickListenerC54631c(DialogInterface$OnClickListenerC54633e eVar) {
            this.f125242a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f125242a.onClick(dialogInterface, -1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity$d */
    static final class DialogInterface$OnClickListenerC54632d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnClickListenerC54633e f125243a;

        static {
            Covode.recordClassIndex(64346);
        }

        DialogInterface$OnClickListenerC54632d(DialogInterface$OnClickListenerC54633e eVar) {
            this.f125243a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f125243a.onClick(dialogInterface, -2);
        }
    }

    /* renamed from: a */
    private static void m100135a(TextView textView, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
            return;
        }
        textView.setVisibility(4);
    }
}

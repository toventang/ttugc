package com.bytedance.android.livesdk.usercard;

import android.animation.Animator;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.C4366j;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3903ac;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p379n.C5793y;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p385p.C5840e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.model.C9587g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6782a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p456as.EnumC6874h;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.subscribe.C10786c;
import com.bytedance.android.livesdk.usercard.C10992x;
import com.bytedance.android.livesdk.usercard.View$OnClickListenerC10973o;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.android.livesdk.utils.C11218ah;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.ComboView;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.android.livesdkapi.p689e.C11752b;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.android.livesdk.usercard.f */
public final class View$OnClickListenerC10962f extends C10935a implements View.OnClickListener, C10992x.AbstractC10993a {

    /* renamed from: A */
    private ViewGroup f26347A;

    /* renamed from: B */
    private LiveButton f26348B;

    /* renamed from: C */
    private LiveButton f26349C;

    /* renamed from: D */
    private LiveButton f26350D;

    /* renamed from: E */
    private LiveButton f26351E;

    /* renamed from: F */
    private LiveButton f26352F;

    /* renamed from: G */
    private ComboView f26353G;

    /* renamed from: H */
    private View f26354H;

    /* renamed from: I */
    private RecyclerView f26355I;

    /* renamed from: J */
    private C10955ak f26356J;

    /* renamed from: K */
    private TextView f26357K;

    /* renamed from: L */
    private final Animator[] f26358L = {null, null};

    /* renamed from: M */
    private final Animator[] f26359M = {null, null};

    /* renamed from: N */
    private boolean f26360N;

    /* renamed from: O */
    private boolean f26361O;

    /* renamed from: P */
    private boolean f26362P;

    /* renamed from: Q */
    private boolean f26363Q;

    /* renamed from: R */
    private int[] f26364R = {R.id.b6g, R.id.c_0, R.id.m2, R.id.fi9, R.id.eal};

    /* renamed from: a */
    public ImageView f26365a;

    /* renamed from: b */
    Activity f26366b;

    /* renamed from: c */
    DataChannel f26367c;

    /* renamed from: d */
    User f26368d;

    /* renamed from: e */
    int f26369e;

    /* renamed from: f */
    boolean f26370f;

    /* renamed from: g */
    long f26371g;

    /* renamed from: h */
    Room f26372h;

    /* renamed from: i */
    C10985v f26373i;

    /* renamed from: j */
    boolean f26374j;

    /* renamed from: k */
    C10992x f26375k;

    /* renamed from: l */
    int f26376l;

    /* renamed from: m */
    String f26377m;

    /* renamed from: n */
    public Map<String, String> f26378n;

    /* renamed from: o */
    String f26379o;

    /* renamed from: p */
    public View$OnClickListenerC10973o.AbstractC10978a f26380p;

    /* renamed from: q */
    private TextView f26381q;

    /* renamed from: r */
    private TextView f26382r;

    /* renamed from: s */
    private TextView f26383s;

    /* renamed from: t */
    private TextView f26384t;

    /* renamed from: u */
    private TextView f26385u;

    /* renamed from: v */
    private TextView f26386v;

    /* renamed from: w */
    private TextView f26387w;

    /* renamed from: x */
    private View f26388x;

    /* renamed from: y */
    private View f26389y;

    /* renamed from: z */
    private LinearLayout f26390z;

    static {
        Covode.recordClassIndex(12577);
    }

    /* renamed from: f */
    private static boolean m19591f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.f26367c;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5840e.class, false);
        }
        this.f26361O = false;
        m19583a(this.f26358L[0]);
        m19583a(this.f26358L[1]);
        m19583a(this.f26359M[0]);
        m19583a(this.f26359M[1]);
        DataChannelGlobal.f42558d.mo28326b(this);
    }

    /* renamed from: c */
    private void m19586c() {
        User user = this.f26368d;
        if (user == null) {
            this.f26363Q = true;
            return;
        }
        EnumC10960d a = C10953ai.m19573a(user, this.f26374j);
        if (a == EnumC10960d.ACTIVE) {
            m19584a(this.f26349C);
            this.f26351E.setVisibility(0);
            this.f26351E.setOnClickListener(new View$OnClickListenerC10967i(this));
        } else if (a == EnumC10960d.GRAYED) {
            m19584a(this.f26349C);
            this.f26351E.setVisibility(0);
            this.f26351E.setEnabled(false);
        } else {
            this.f26351E.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo17817a() {
        User user = this.f26368d;
        if (user == null) {
            this.f26362P = true;
            return;
        }
        EnumC10960d a = C10959c.m19580a(user, this.f26374j);
        if (a == EnumC10960d.ACTIVE) {
            m19584a(this.f26349C);
            this.f26351E.setVisibility(0);
            this.f26351E.setOnClickListener(new View$OnClickListenerC10968j(this));
        } else if (a == EnumC10960d.GRAYED) {
            m19584a(this.f26349C);
            this.f26351E.setVisibility(0);
            this.f26351E.setEnabled(false);
        } else {
            this.f26351E.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m19588d() {
        int childCount = this.f26347A.getChildCount();
        View view = null;
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f26347A.getChildAt(i);
            if ((childAt instanceof TextView) || (childAt instanceof ViewGroup)) {
                if (childAt.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (z) {
                childAt.setVisibility(0);
                view = childAt;
            } else {
                childAt.setVisibility(8);
            }
        }
        if (view != null) {
            view.setVisibility(8);
        }
        HashSet hashSet = new HashSet();
        int[] iArr = this.f26364R;
        for (int i2 : iArr) {
            View findViewById = this.f26354H.findViewById(i2);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f26349C.getLayoutParams();
        if (hashSet.contains(Integer.valueOf((int) R.id.b6g))) {
            if (hashSet.size() == 1) {
                layoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.xg));
            } else if (hashSet.size() == 2) {
                layoutParams.setMarginStart(getContext().getResources().getDimensionPixelSize(R.dimen.xh));
            } else if (hashSet.contains(Integer.valueOf((int) R.id.eal))) {
                int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.xh);
                layoutParams.setMarginStart(dimensionPixelSize);
                layoutParams.setMarginEnd(dimensionPixelSize);
            } else {
                int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.xh);
                int dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(R.dimen.xg);
                layoutParams.setMarginStart(dimensionPixelSize2);
                layoutParams.setMarginEnd(dimensionPixelSize3);
            }
        }
        this.f26349C.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private void m19590e() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_view");
        hashMap.put("event_type", "core");
        hashMap.put("event_page", "live_detail");
        hashMap.put("action_type", "click");
        hashMap.put("event_module", "right_anchor");
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", "right_anchor");
        hashMap.put("anchor_id", String.valueOf(this.f26368d.getId()));
        hashMap.put("room_id", String.valueOf(this.f26368d.getLiveRoomId()));
        hashMap.put("right_user_id", String.valueOf(this.f26368d.getId()));
        hashMap.put("live_type", C11729j.m20684a(this.f26372h.getStreamType()));
        if (C4384b.C4385a.m10496a().f11957e > 0) {
            hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
            if (C4384b.C4385a.m10496a().f11970r == 0) {
                str = "anchor";
            } else {
                str = "pk";
            }
            hashMap.put("connection_type", str);
        }
        String g = C6544e.m13993g();
        if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        hashMap.put("is_return", "0");
        C6501b.C6502a.m13948a("live_show").mo12652a((Map<String, String>) hashMap).mo12643a(this.f26367c).mo12655b();
    }

    /* renamed from: g */
    private void m19592g() {
        boolean z;
        boolean z2;
        List<ImageModel> badgeImageList;
        User user;
        User user2 = this.f26368d;
        if (user2 == null || user2.getBadgeImageList() == null || this.f26368d.getBadgeImageList().size() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (this.f26353G == null || (user = this.f26368d) == null || user.getComboBadgeInfo() == null || !((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).isRankEnabled(EnumC10345i.WEEKLY_RANK.getType())) {
            z2 = false;
            if (!z) {
                this.f26390z.setVisibility(8);
                return;
            }
        } else {
            z2 = true;
        }
        this.f26390z.setVisibility(0);
        if (z2) {
            this.f26353G.setVisibility(0);
            this.f26353G.mo18155a(this.f26368d.getComboBadgeInfo().f8810a, (int) this.f26368d.getComboBadgeInfo().f8811b);
        }
        if (z && (badgeImageList = this.f26368d.getBadgeImageList()) != null) {
            for (ImageModel imageModel : badgeImageList) {
                if (imageModel.getImageType() == 30) {
                    Boolean bool = (Boolean) this.f26367c.mo28318b(C10786c.class);
                    if (bool == null || !bool.booleanValue()) {
                        this.f26367c.mo28311a(C10786c.class, (Object) true);
                        C6501b.C6502a.m13948a("livesdk_privilege_badge_show").mo12646a("anchor_id", this.f26372h.getOwnerUserId()).mo12646a("room_id", this.f26372h.getId()).mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12661f("click").mo12651a("request_id", C6544e.m13997k()).mo12651a("video_id", C6544e.m13992f()).mo12651a("show_entrance", "personal_profile").mo12655b();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17821b() {
        if (this.f26368d != null && m19587c(this.f26372h.getOwner()) && this.f26368d.getId() == this.f26372h.getOwnerUserId()) {
            if (this.f26372h.getOwner().getFollowInfo().getFollowStatus() == 1 || this.f26372h.getOwner().getFollowInfo().getFollowStatus() == 2 || this.f26372h.getOwner().getSubscribeInfo().isSubscribed()) {
                this.f26349C.mo9603b(R.style.sz);
                if (this.f26368d.getFollowInfo().getFollowStatus() == 2) {
                    this.f26349C.setIcon(2131234837);
                } else if (this.f26368d.getFollowInfo().getFollowStatus() == 1) {
                    this.f26349C.setIcon(2131234836);
                } else {
                    this.f26349C.setIcon(2131234835);
                }
                this.f26349C.setText((CharSequence) null);
                this.f26350D.setVisibility(0);
                this.f26350D.setOnClickListener(this);
                m19592g();
                if (m19589d(this.f26372h.getOwner())) {
                    this.f26350D.setText(R.string.elt);
                    this.f26350D.mo9603b(R.style.sz);
                }
                C6501b.C6502a.m13948a("livesdk_subscribe_icon_show").mo12646a("anchor_id", this.f26372h.getOwnerUserId()).mo12646a("room_id", this.f26372h.getId()).mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12661f("click").mo12651a("request_id", C6544e.m13997k()).mo12651a("video_id", C6544e.m13992f()).mo12651a("show_entrance", "profile_card").mo12655b();
                return;
            }
            this.f26349C.setText(R.string.gpo);
            this.f26349C.setIcon((Drawable) null);
            this.f26349C.mo9603b(R.style.st);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f26349C.getLayoutParams();
            layoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(R.dimen.xg));
            this.f26349C.setLayoutParams(layoutParams);
            this.f26350D.setVisibility(8);
        }
    }

    /* renamed from: a */
    private static void m19583a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            if (animator.isRunning()) {
                animator.cancel();
            }
        }
    }

    /* renamed from: a */
    private static void m19584a(LiveButton liveButton) {
        if (liveButton.getVisibility() == 0) {
            liveButton.setIcon((Drawable) null);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) liveButton.getLayoutParams();
            layoutParams.weight = 3.1f;
            liveButton.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: c */
    private static boolean m19587c(User user) {
        if (user == null || user.getSubscribeInfo() == null) {
            return false;
        }
        return user.getSubscribeInfo().isAnchorQualified();
    }

    /* renamed from: d */
    private static boolean m19589d(User user) {
        if (!m19587c(user) || !user.getSubscribeInfo().isSubscribed()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.usercard.C10992x.AbstractC10993a
    /* renamed from: a */
    public final void mo17819a(C11688a aVar) {
        User user;
        if (this.f26361O && (user = this.f26368d) != null && user.getFollowInfo() != null && ((int) this.f26368d.getFollowInfo().getFollowStatus()) != aVar.mo18451a()) {
            C6779a.m14563a().mo13053a(new C11625a(aVar));
        }
    }

    public final void onEvent(C11625a aVar) {
        User user;
        C11688a aVar2 = aVar.f27775a;
        if (aVar2 != null && aVar2.f27930a == this.f26371g && this.f26361O && (user = this.f26368d) != null && user.getFollowInfo() != null && ((int) this.f26368d.getFollowInfo().getFollowStatus()) != aVar2.mo18451a()) {
            this.f26368d.setFollowStatus(aVar2.mo18451a());
            m19585b(this.f26368d);
            mo17821b();
            m19588d();
        }
    }

    /* renamed from: b */
    private void m19585b(User user) {
        if (user != null) {
            if (!user.isFollowing()) {
                if (this.f26350D.getVisibility() != 0) {
                    this.f26349C.mo9603b(R.style.st);
                    this.f26349C.setText(R.string.gpo);
                } else {
                    this.f26349C.setIcon(2131234835);
                }
                this.f26368d.getFollowInfo().setPushStatus(2);
                return;
            }
            this.f26349C.mo9603b(R.style.sz);
            if (this.f26350D.getVisibility() != 0) {
                this.f26349C.setText(R.string.gpp);
            } else {
                this.f26349C.setIcon(2131234836);
            }
            if (user.getFollowInfo() != null && user.getFollowInfo().getFollowStatus() == 2) {
                if (this.f26350D.getVisibility() != 0) {
                    this.f26349C.setText(R.string.e_3);
                } else {
                    this.f26349C.setIcon(2131234837);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.C10992x.AbstractC10993a
    /* renamed from: a */
    public final void mo17820a(Throwable th) {
        if (this.f26361O) {
            if (th instanceof C2912a) {
                C11226ao.m19883a(C3966y.m9669e(), ((C2912a) th).getPrompt(), 0);
                return;
            }
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpl);
        }
    }

    /* renamed from: a */
    public final void mo17818a(User user) {
        boolean z;
        ImageModel imageModel;
        long j;
        String str;
        if (!this.f26361O || user == null || user.getId() <= 0) {
            View view = this.f26354H;
            if (view != null) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        if (this.f26354H.getVisibility() != 0) {
            this.f26354H.setVisibility(0);
        }
        if (this.f26373i == null) {
            this.f26373i = new C10985v(this.f26366b, this.f26372h, user.getId());
        }
        this.f26368d = user;
        this.f26371g = user.getId();
        long c = C11115u.m19743a().mo17915b().mo13161c();
        boolean z2 = true;
        if (c == this.f26371g) {
            z = true;
        } else {
            z = false;
        }
        this.f26360N = z;
        if (this.f26362P) {
            mo17817a();
        } else if (this.f26363Q) {
            m19586c();
        }
        if (this.f26372h.getOwnerUserId() == this.f26371g) {
            this.f26369e = 0;
        } else if (C4384b.C4385a.m10496a().f11958f == this.f26371g) {
            this.f26369e = 2;
        } else {
            this.f26369e = 1;
        }
        if (c != this.f26372h.getOwnerUserId()) {
            z2 = false;
        }
        this.f26370f = z2;
        C9587g authenticationInfo = this.f26368d.getAuthenticationInfo();
        if (authenticationInfo == null) {
            imageModel = null;
        } else {
            imageModel = authenticationInfo.f23240c;
        }
        if (this.f26372h.getOwnerUserId() == this.f26371g && imageModel != null) {
            this.f26365a.setVisibility(0);
            C3951p.m9627a(this.f26365a, imageModel, 0, new C3951p.AbstractC3953a.C3954a() {
                /* class com.bytedance.android.livesdk.usercard.View$OnClickListenerC10962f.C109631 */

                static {
                    Covode.recordClassIndex(12578);
                }

                @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a.C3954a
                /* renamed from: a */
                public final void mo9304a(boolean z) {
                    int i;
                    if (View$OnClickListenerC10962f.this.mStatusActive) {
                        ImageView imageView = View$OnClickListenerC10962f.this.f26365a;
                        if (z) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        imageView.setVisibility(i);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.f26371g));
            hashMap.put("room_id", this.f26372h.getIdStr());
            hashMap.put("show_type", "data_card_anchor");
            hashMap.put("live_type", this.f26372h.getStreamType().logStreamingType);
            hashMap.put("enter_from_merge", C6544e.m13987a());
            hashMap.put("enter_method", C6544e.m13990d());
            hashMap.put("action_type", "click");
            AbstractC2994b a = C11115u.m19743a().mo17915b().mo13147a();
            if (this.f26370f) {
                str = "anchor";
            } else if (a.getUserAttr() == null || !a.getUserAttr().f23192b) {
                str = "viewer";
            } else {
                str = "admin";
            }
            hashMap.put("admin_type", str);
            C6501b.C6502a.m13948a("livesdk_authentication_icon_show").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f26368d.getBadgeImageList() != null) {
            arrayList.addAll(this.f26368d.getBadgeImageList());
        }
        this.f26356J.mo17815a(arrayList);
        this.f26356J.f26336a = new View.OnClickListener() {
            /* class com.bytedance.android.livesdk.usercard.View$OnClickListenerC10962f.View$OnClickListenerC109642 */

            static {
                Covode.recordClassIndex(12579);
            }

            public final void onClick(View view) {
                String queryParameter;
                String queryParameter2;
                if (view.getTag() instanceof ImageModel) {
                    ImageModel imageModel = (ImageModel) view.getTag();
                    if (!(C13627m.m24498a(imageModel.getSchema()) || View$OnClickListenerC10962f.this.getContext() == null)) {
                        View$OnClickListenerC10962f fVar = View$OnClickListenerC10962f.this;
                        String schema = imageModel.getSchema();
                        Uri parse = Uri.parse(schema);
                        String queryParameter3 = parse.getQueryParameter("noble_intercept");
                        if (!(queryParameter3 == null || C11218ah.m19873b(queryParameter3) == 0 || (queryParameter = parse.getQueryParameter("url")) == null)) {
                            String uri = Uri.parse(queryParameter).buildUpon().appendQueryParameter("status_bar_height", String.valueOf(C3966y.m9668e(C3903ac.m9533a(fVar.getContext())))).build().toString();
                            Set<String> queryParameterNames = parse.getQueryParameterNames();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            for (String str : queryParameterNames) {
                                if ("url".equals(str)) {
                                    queryParameter2 = uri;
                                } else {
                                    queryParameter2 = parse.getQueryParameter(str);
                                }
                                clearQuery.appendQueryParameter(str, queryParameter2);
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put(StringSet.type, "card");
                            C6501b.C6502a.m13948a("livesdk_nobility_page_click").mo12652a((Map<String, String>) hashMap).mo12655b();
                            schema = clearQuery.build().toString();
                        }
                        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(View$OnClickListenerC10962f.this.getContext(), schema);
                    }
                }
            }
        };
        if (TextUtils.isEmpty(this.f26368d.getDisplayId())) {
            this.f26381q.setVisibility(8);
        } else {
            this.f26381q.setText(this.f26368d.getDisplayId());
            this.f26381q.setVisibility(0);
        }
        this.f26381q.setText(this.f26368d.getDisplayId());
        m19592g();
        if (TextUtils.isEmpty(this.f26368d.getNickName())) {
            this.f26382r.setVisibility(8);
        } else {
            this.f26382r.setText(this.f26368d.getNickName());
            this.f26382r.setVisibility(0);
        }
        if (!this.f26368d.isVerified() || TextUtils.isEmpty(this.f26368d.getVerifiedReason())) {
            this.f26383s.setVisibility(8);
        } else {
            this.f26383s.setText(this.f26368d.getVerifiedReason());
            this.f26383s.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f26368d.getAutoGraph())) {
            this.f26384t.setText(R.string.gjs);
        } else {
            this.f26384t.setText(this.f26368d.getAutoGraph());
        }
        this.f26384t.setMaxLines(2);
        FollowInfo followInfo = this.f26368d.getFollowInfo();
        if (followInfo != null) {
            this.f26385u.setText(C11207aa.m19864b(followInfo.getFollowingCount()));
            this.f26386v.setText(C11207aa.m19864b(followInfo.getFollowerCount()));
            this.f26386v.setText(C11207aa.m19864b(followInfo.getFollowerCount()));
        } else {
            this.f26385u.setText("0");
            this.f26386v.setText("0");
        }
        if (!this.f26360N) {
            m19585b(this.f26368d);
            mo17821b();
            this.f26349C.setOnClickListener(this);
            if (C4384b.C4385a.m10496a().f11958f == this.f26368d.getId() || this.f26376l == 2) {
                this.f26348B.setVisibility(8);
            } else {
                this.f26348B.setVisibility(0);
                this.f26348B.setOnClickListener(this);
            }
            if (this.f26370f) {
                C13628n.m24510a(this.f26352F, 8);
            } else if (C4384b.C4385a.m10496a().f11958f == this.f26368d.getId()) {
                C13628n.m24510a(this.f26348B, 8);
                C13628n.m24510a(this.f26350D, 8);
                C13628n.m24510a(this.f26352F, 0);
                this.f26352F.setOnClickListener(this);
                m19590e();
            } else {
                C13628n.m24510a(this.f26352F, 8);
            }
            if (this.f26372h.officialChannelInfo == null || this.f26372h.officialChannelInfo.f23136a == null) {
                j = -1;
            } else {
                j = this.f26372h.officialChannelInfo.f23136a.getId();
            }
            if (C10961e.m19582a(this.f26372h.getOwnerUserId(), this.f26368d.getId(), c, this.f26379o, j)) {
                this.f26389y.setVisibility(8);
            } else {
                this.f26389y.setVisibility(0);
            }
        } else if (this.f26370f) {
            this.f26389y.setVisibility(8);
            if (m19587c(this.f26368d)) {
                C13628n.m24510a(this.f26388x, 0);
                this.f26387w.setText(Integer.toString(this.f26368d.getSubscribeInfo().getSubscriberCount()));
            }
        } else {
            this.f26349C.setVisibility(8);
            this.f26348B.setVisibility(8);
            this.f26389y.setVisibility(8);
        }
        if (this.f26357K != null) {
            User user2 = this.f26368d;
            if (user2 == null || user2.getAuthorInfo() == null) {
                this.f26357K.setText("0");
            } else {
                this.f26357K.setText(C11207aa.m19864b(this.f26368d.getAuthorInfo().f23243c));
            }
        }
        m19588d();
    }

    public final void onClick(View view) {
        long j;
        boolean z;
        boolean z2;
        long j2;
        User user;
        int id = view.getId();
        if (id != R.id.bfd) {
            String str = "right_anchor";
            if (id == R.id.b6g) {
                if (!C11115u.m19743a().mo17915b().mo13165e()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", "live_detail");
                    bundle.putString("action_type", "follow");
                    bundle.putString("source", "live");
                    bundle.putString("v1_source", "follow");
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    Activity activity = this.f26366b;
                    C6876j.C6877a a = C6876j.m14732a();
                    a.f17232a = C6782a.m14569a();
                    a.f17233b = C6782a.m14570b();
                    a.f17236e = "live_detail";
                    a.f17237f = "follow";
                    a.f17235d = "live";
                    a.f17234c = -1;
                    b.mo13149a(activity, a.mo13173a()).mo143062b(new C6873g());
                } else {
                    getContext();
                    if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132253e = m19591f();
                    }
                    if (!C58029j.f132253e) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
                    } else {
                        if (this.f26370f) {
                            str = "live_anchor_c_audience";
                        } else {
                            int i = this.f26369e;
                            if (i == 0) {
                                str = "live_audience_c_anchor";
                            } else if (i != 2) {
                                str = "live_audience_c_audience";
                            }
                        }
                        if (!this.f26368d.isFollowing()) {
                            C10992x xVar = this.f26375k;
                            String requestId = this.f26372h.getRequestId();
                            long j3 = this.f26371g;
                            long id2 = this.f26372h.getId();
                            String labels = this.f26372h.getLabels();
                            if (!xVar.f26466c) {
                                xVar.f26466c = true;
                                xVar.f26464a.mo142945a(C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6867b().mo13134a(j3)).mo13136a(requestId).mo13139b("live_detail").mo13140c(str).mo13138b(id2).mo13142d(labels).mo13141c()).mo143255a(new C10946ac(xVar), new C10947ad(xVar), new C10948ae(xVar)));
                            }
                            if (C11199a.m19850a(this.f26367c) && this.f26372h.getOwner() != null && this.f26371g == this.f26372h.getOwner().getId()) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("refer", "card_follow_button");
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("anchor_id", String.valueOf(this.f26372h.getOwner().getId()));
                                hashMap2.put("room_id", String.valueOf(this.f26372h.getId()));
                                C11199a.m19849a("live_ad", "follow", hashMap, hashMap2);
                            }
                            Map<String, String> map = this.f26378n;
                            if (map != null) {
                                this.f26373i.f26450d = map;
                            }
                            C10985v vVar = this.f26373i;
                            long j4 = this.f26371g;
                            String str2 = this.f26377m;
                            boolean z3 = this.f26370f;
                            int i2 = this.f26369e;
                            if (C4384b.C4385a.m10496a().f11958f == this.f26368d.getId()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (this.f26368d.getFollowInfo() != null) {
                                j2 = this.f26368d.getFollowInfo().getFollowStatus();
                            } else {
                                j2 = 0;
                            }
                            vVar.mo17842a(true, j4, str2, z3, i2, z2, j2, this.f26374j);
                        } else {
                            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
                            aVar.f22245b = getContext().getString(R.string.ebd, C6581g.m14075a(this.f26368d));
                            DialogC9148b.C9149a b2 = aVar.mo15244a(R.string.ebc, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10969k(this, str), false).mo15249b(R.string.gi8, DialogInterface$OnClickListenerC10970l.f26399a, false);
                            b2.f22249f = DialogInterface$OnDismissListenerC10971m.f26400a;
                            b2.f22250g = DialogInterface$OnShowListenerC10972n.f26401a;
                            b2.mo15247a().show();
                        }
                    }
                }
            } else if (id != R.id.eal) {
                String str3 = "";
                if (id == R.id.m2) {
                    if (!C11115u.m19743a().mo17915b().mo13158a(EnumC6874h.AT)) {
                        C6558k.m14024a(this.f26373i.f26447a);
                        this.f26375k.mo17844a();
                        Room room = this.f26372h;
                        if (room == null || room.getOrientation() != 2 || this.f26367c.mo28318b(C9076co.class) == null || ((Boolean) this.f26367c.mo28318b(C9076co.class)).booleanValue()) {
                            C7382ao aoVar = new C7382ao(C6581g.m14075a(this.f26368d), str3);
                            aoVar.f18301e = this.f26368d;
                            this.f26367c.mo28320c(C4366j.class, aoVar);
                        }
                    }
                } else if (id == R.id.fi9) {
                    if (this.f26368d.isFollowing() || this.f26368d.getSecret() != 1) {
                        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_profile_click", 34560, EnumC11866b.BussinessApiCall).mo19003a("click to jump room"));
                        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                        C11870f.C11871a.f28404a.mo19012a(EnterRoomLinkSession.m20943a(enterRoomConfig));
                        enterRoomConfig.f28232b.f28259c = str;
                        enterRoomConfig.f28233c.f28293J = "live_detail";
                        enterRoomConfig.f28233c.f28295L = str;
                        enterRoomConfig.f28232b.f28270n = this.f26372h.getId();
                        enterRoomConfig.f28232b.f28271o = (String) this.f26367c.mo28318b(C11752b.class);
                        enterRoomConfig.f28232b.f28258b = String.valueOf(this.f26368d.getId());
                        enterRoomConfig.f28233c.f28307X = "live_detail";
                        C6779a.m14563a().mo13053a(new C8452e(this.f26368d.getLiveRoomId(), enterRoomConfig));
                        boolean z4 = true;
                        boolean z5 = !this.f26370f;
                        boolean a2 = C4394ah.m10505a(((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getCurrentLinkMode(), 4);
                        if (this.f26371g != ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getRivalAnchorUidWhenAnchorLinkMic()) {
                            z4 = false;
                        }
                        if (z5 && a2 && z4) {
                            if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
                                j = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getBattleId();
                                str3 = "manual_pk";
                            } else {
                                if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInCoHost()) {
                                    str3 = "anchor";
                                } else if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInMultiGuest()) {
                                    str3 = "audience";
                                }
                                j = 0;
                            }
                            C6501b.C6502a.m13948a("livesdk_profile_swicth_click").mo12639a().mo12646a("to_anchor_id", this.f26371g).mo12646a("to_room_id", this.f26368d.getLiveRoomId()).mo12646a("channel_id", ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getChannelId()).mo12651a("connection_type", str3).mo12646a("pk_id", j).mo12655b();
                        }
                    } else {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.eh0);
                        C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("click_secret_user", 3072, EnumC11866b.SdkInterfaceCall));
                        return;
                    }
                }
            } else if (m19587c(this.f26372h.getOwner())) {
                DataChannel dataChannel = this.f26367c;
                if (dataChannel == null || dataChannel.mo28318b(C9076co.class) == null) {
                    z = true;
                } else {
                    z = ((Boolean) this.f26367c.mo28318b(C9076co.class)).booleanValue();
                }
                C6501b.C6502a.m13948a("livesdk_subscribe_icon_click").mo12646a("anchor_id", this.f26372h.getOwnerUserId()).mo12646a("room_id", this.f26372h.getId()).mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12661f("click").mo12651a("request_id", C6544e.m13997k()).mo12651a("video_id", C6544e.m13992f()).mo12651a("click_position", "profile_card").mo12655b();
                if (!z) {
                    C6779a.m14563a().mo13053a(new C11756a("subscribe_profile_card"));
                } else {
                    if (m19589d(this.f26372h.getOwner())) {
                        ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeState(this.f26366b, this.f26372h, "profile_card");
                    } else {
                        ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeEntry(this.f26366b, this.f26372h, "profile_card");
                    }
                    View$OnClickListenerC10973o.AbstractC10978a aVar2 = this.f26380p;
                    if (aVar2 != null) {
                        aVar2.mo17839a();
                    }
                }
            }
        } else if (!this.f26370f && (user = this.f26368d) != null) {
            if (C4386c.m10499a().f17248n.intValue() == 2) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.go9);
            } else {
                int i3 = this.f26369e;
                if (i3 == 0) {
                    C10985v vVar2 = this.f26373i;
                    user.getId();
                    vVar2.mo17841a();
                } else if (i3 == 2) {
                    C10985v vVar3 = this.f26373i;
                    user.getId();
                    vVar3.mo17841a();
                } else {
                    C10985v vVar4 = this.f26373i;
                    user.getId();
                    vVar4.mo17841a();
                }
                C6501b.C6502a.m13948a("livesdk_enter_personal_detail").mo12639a().mo12651a("to_user_id", user.getIdStr()).mo12655b();
                HashMap hashMap3 = new HashMap(1);
                hashMap3.put("log_enter_live_source", this.f26367c.mo28318b(C11752b.class));
                hashMap3.put("sec_user_id", user.getSecUid());
                ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).showUserProfile(user.getId(), null, hashMap3);
            }
        } else {
            return;
        }
        m19588d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f26361O = true;
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C11625a.class).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C10965g(this));
        if (this.f26374j) {
            i = R.layout.b8q;
        } else {
            i = R.layout.b8r;
        }
        View a = C1764a.m5927a(layoutInflater, i, viewGroup, false);
        this.f26354H = a;
        this.f26381q = (TextView) a.findViewById(R.id.cpj);
        this.f26355I = (RecyclerView) this.f26354H.findViewById(R.id.f_p);
        this.f26382r = (TextView) this.f26354H.findViewById(R.id.csk);
        this.f26365a = (ImageView) this.f26354H.findViewById(R.id.n1);
        this.f26383s = (TextView) this.f26354H.findViewById(R.id.fbf);
        this.f26384t = (TextView) this.f26354H.findViewById(R.id.esl);
        this.f26385u = (TextView) this.f26354H.findViewById(R.id.b7c);
        this.f26386v = (TextView) this.f26354H.findViewById(R.id.b72);
        this.f26387w = (TextView) this.f26354H.findViewById(R.id.eas);
        this.f26388x = this.f26354H.findViewById(R.id.eat);
        this.f26389y = this.f26354H.findViewById(R.id.c6);
        this.f26390z = (LinearLayout) this.f26354H.findViewById(R.id.q9);
        this.f26347A = (ViewGroup) this.f26354H.findViewById(R.id.c5);
        this.f26351E = (LiveButton) this.f26354H.findViewById(R.id.c_0);
        this.f26348B = (LiveButton) this.f26354H.findViewById(R.id.m2);
        this.f26349C = (LiveButton) this.f26354H.findViewById(R.id.b6g);
        this.f26350D = (LiveButton) this.f26354H.findViewById(R.id.eal);
        this.f26352F = (LiveButton) this.f26354H.findViewById(R.id.fi9);
        this.f26353G = (ComboView) this.f26354H.findViewById(R.id.a8v);
        this.f26356J = new C10955ak(this.f26374j);
        RecyclerView recyclerView = this.f26355I;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.f26355I.setAdapter(this.f26356J);
        this.f26357K = (TextView) this.f26354H.findViewById(R.id.c8w);
        mo17818a(this.f26368d);
        DataChannel dataChannel = this.f26367c;
        if (dataChannel != null) {
            dataChannel.mo28320c(C5840e.class, true);
        }
        DataChannelGlobal.f42558d.mo28322a(this, this, C5793y.class, new C10966h(this));
        return this.f26354H;
    }
}

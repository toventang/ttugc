package com.bytedance.android.livesdk.usercard;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p185c.C3049b;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p379n.C5765aa;
import com.bytedance.android.live.p379n.C5769c;
import com.bytedance.android.live.p385p.C5840e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorInviteGuestLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveHideAudienceFollowingSetting;
import com.bytedance.android.livesdk.model.AbstractC9514aa;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.p424a.C6431l;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9083cv;
import com.bytedance.android.livesdk.usercard.C10992x;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p689e.C11752b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.usercard.o */
public class View$OnClickListenerC10973o extends AbstractC11293v implements View.OnClickListener, C10992x.AbstractC10994b {

    /* renamed from: a */
    public static final String f26402a = View$OnClickListenerC10973o.class.getSimpleName();

    /* renamed from: A */
    ImageView f26403A;

    /* renamed from: B */
    Activity f26404B;

    /* renamed from: C */
    public View$OnClickListenerC10962f f26405C;

    /* renamed from: D */
    boolean f26406D;

    /* renamed from: E */
    public final C88411a f26407E = new C88411a();

    /* renamed from: F */
    UserProfileEvent f26408F;

    /* renamed from: G */
    private long f26409G;

    /* renamed from: H */
    private String f26410H;

    /* renamed from: I */
    private View f26411I;

    /* renamed from: J */
    private View f26412J;

    /* renamed from: K */
    private ViewGroup f26413K;

    /* renamed from: L */
    private View f26414L;

    /* renamed from: M */
    private HSImageView f26415M;

    /* renamed from: N */
    private HSImageView f26416N;

    /* renamed from: b */
    int f26417b;

    /* renamed from: c */
    C10992x f26418c;

    /* renamed from: d */
    public C10985v f26419d;

    /* renamed from: e */
    public long f26420e;

    /* renamed from: f */
    public User f26421f;

    /* renamed from: g */
    public Room f26422g;

    /* renamed from: h */
    User f26423h;

    /* renamed from: i */
    boolean f26424i;

    /* renamed from: j */
    public boolean f26425j;

    /* renamed from: k */
    public boolean f26426k;

    /* renamed from: l */
    public boolean f26427l;

    /* renamed from: m */
    public boolean f26428m;

    /* renamed from: n */
    public boolean f26429n;

    /* renamed from: t */
    String f26430t = "";

    /* renamed from: u */
    public View f26431u;

    /* renamed from: v */
    public View f26432v;

    /* renamed from: w */
    public View f26433w;

    /* renamed from: x */
    public ImageView f26434x;

    /* renamed from: y */
    public HSImageView f26435y;

    /* renamed from: z */
    HSImageView f26436z;

    /* renamed from: com.bytedance.android.livesdk.usercard.o$a */
    public interface AbstractC10978a {
        static {
            Covode.recordClassIndex(12593);
        }

        /* renamed from: a */
        void mo17839a();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return C11221ak.EnumC11222a.PANEL_PROFILE;
    }

    @Override // com.bytedance.android.livesdk.usercard.C10992x.AbstractC10994b
    /* renamed from: g */
    public final void mo17836g() {
        dismiss();
    }

    static {
        Covode.recordClassIndex(12588);
    }

    /* renamed from: k */
    private static boolean m19602k() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9929d() {
        UserProfileEvent userProfileEvent = this.f26408F;
        if (userProfileEvent != null) {
            this.f26409G = userProfileEvent.msgId;
            this.f26410H = this.f26408F.content;
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.C10992x.AbstractC10994b
    /* renamed from: f */
    public final void mo17835f() {
        View$OnClickListenerC10962f fVar;
        if (this.f27009o && (fVar = this.f26405C) != null) {
            fVar.mo17817a();
        }
    }

    /* renamed from: e */
    public static boolean m19599e() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean k = m19602k();
        C58029j.f132253e = k;
        return k;
    }

    /* renamed from: h */
    private void m19600h() {
        if (this.f26422g != null && this.f26421f != null) {
            this.f26413K.setVisibility(4);
            this.f26411I.setVisibility(4);
            this.f26413K.post(new Runnable() {
                /* class com.bytedance.android.livesdk.usercard.View$OnClickListenerC10973o.RunnableC109741 */

                static {
                    Covode.recordClassIndex(12589);
                }

                /* JADX WARNING: Removed duplicated region for block: B:17:0x007f  */
                /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
                /* JADX WARNING: Removed duplicated region for block: B:51:0x013c  */
                /* JADX WARNING: Removed duplicated region for block: B:75:0x0219  */
                /* JADX WARNING: Removed duplicated region for block: B:86:0x0260  */
                /* JADX WARNING: Removed duplicated region for block: B:87:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
                /* JADX WARNING: Removed duplicated region for block: B:9:0x0057  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 611
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.View$OnClickListenerC10973o.RunnableC109741.run():void");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        int i;
        if (this.f26406D) {
            i = R.layout.b6j;
        } else {
            i = R.layout.b6g;
        }
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(i);
        bVar.f27014a = 0;
        if (this.f26406D) {
            bVar.f27020g = 80;
            bVar.f27021h = -1;
            bVar.f27022i = -1;
            bVar.f27015b = R.style.mf;
        } else {
            bVar.f27020g = 5;
            bVar.f27021h = C3966y.m9667d(R.dimen.wl);
            bVar.f27022i = -1;
            bVar.f27015b = R.style.mg;
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C10992x xVar = this.f26418c;
        if (xVar != null) {
            xVar.mo8577b();
        }
        this.f26424i = false;
        if (this.f27010p != null) {
            this.f27010p.mo28320c(C5840e.class, false);
        }
        this.f26407E.mo142944a();
        C6894d.m14753a().f17266k = false;
        super.onDestroy();
    }

    /* renamed from: j */
    private void m19601j() {
        String str;
        if (this.f26422g != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("target_uid", String.valueOf(this.f26420e));
            hashMap.put("sec_target_uid", C11115u.m19743a().mo17915b().mo13153a(this.f26420e));
            hashMap.put("packed_level", "2");
            hashMap.put("current_room_id", String.valueOf(this.f26422g.getId()));
            hashMap.put("request_from", "live_push_settings");
            if (this.f26422g.getOwner() != null) {
                str = String.valueOf(this.f26422g.getOwner().getId());
            } else {
                str = "0";
            }
            hashMap.put("anchor_id", str);
            hashMap.put("sec_anchor_id", C11115u.m19743a().mo17915b().mo13153a(this.f26422g.getOwnerUserId()));
            C10992x xVar = this.f26418c;
            if (xVar != null) {
                xVar.mo17846a(hashMap);
                int currentLinkMode = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getCurrentLinkMode();
                if (this.f26428m && C4394ah.m10505a(currentLinkMode, 2) && LiveAnchorInviteGuestLinkmicSetting.INSTANCE.getValue()) {
                    this.f26418c.mo17845a(this.f26422g, this.f26420e);
                }
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26424i = true;
        C10992x xVar = this.f26418c;
        if (xVar != null) {
            xVar.mo10297a(this);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f27010p != null) {
            this.f27010p.mo28315b(C5765aa.class, (Object) false);
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.C10992x.AbstractC10994b
    /* renamed from: a */
    public final void mo17833a(Throwable th) {
        C6497a b = C3049b.C3050a.m8358b("ttlive_show_profile_all", th);
        b.f16149e = true;
        b.mo12632a();
        if (this.f26424i) {
            if (this.f26412J.getVisibility() == 8) {
                this.f26411I.setVisibility(8);
                this.f26412J.setVisibility(0);
            } else if (th instanceof C2912a) {
                C11226ao.m19883a(C3966y.m9669e(), ((C2912a) th).getPrompt(), 0);
            } else {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpu);
            }
        }
    }

    /* renamed from: b */
    public final void mo17834b(int i) {
        Context e;
        int i2;
        int i3;
        int i4;
        if (getContext() != null) {
            e = getContext();
        } else {
            e = C3966y.m9669e();
        }
        if (i != 0) {
            if (i == 1) {
                ImageView imageView = this.f26434x;
                if (this.f26406D) {
                    i3 = 2131234896;
                } else {
                    i3 = 2131234897;
                }
                imageView.setImageDrawable(C0196a.m619b(e, i3));
                return;
            } else if (i != 2) {
                if (i == 3) {
                    ImageView imageView2 = this.f26434x;
                    if (this.f26406D) {
                        i4 = 2131234898;
                    } else {
                        i4 = 2131234899;
                    }
                    imageView2.setImageDrawable(C0196a.m619b(e, i4));
                    return;
                }
                return;
            }
        }
        ImageView imageView3 = this.f26434x;
        if (this.f26406D) {
            i2 = 2131234900;
        } else {
            i2 = 2131234901;
        }
        imageView3.setImageDrawable(C0196a.m619b(e, i2));
    }

    /* renamed from: a */
    public final void mo17832a(C9591j jVar) {
        Activity activity = this.f26404B;
        if (activity == null || activity.getRequestedOrientation() != 0) {
            C13628n.m24510a(this.f26414L, 0);
            this.f26421f.getLiveRoomId();
            View view = this.f26414L;
            if (view == null) {
                return;
            }
            if (jVar != null) {
                C13628n.m24510a(view, 8);
                C13628n.m24510a(this.f26415M, 0);
                C3941k.m9601a(this.f26415M, jVar.f23265a);
                HSImageView hSImageView = this.f26416N;
                if (hSImageView != null) {
                    C13628n.m24510a(hSImageView, 0);
                    C3951p.m9622a(this.f26416N, jVar.f23268d, 0);
                    return;
                }
                return;
            }
            C13628n.m24510a(view, 0);
            C13628n.m24510a(this.f26415M, 8);
            HSImageView hSImageView2 = this.f26416N;
            if (hSImageView2 != null) {
                C13628n.m24510a(hSImageView2, 8);
            }
        } else if (jVar != null) {
            C13628n.m24510a(this.f26414L, 8);
            C13628n.m24510a(this.f26415M, 0);
            this.f26435y.setPadding(0, 0, 0, 0);
            this.f26435y.setBackgroundResource(0);
            C3941k.m9601a(this.f26415M, jVar.f23265a);
        } else {
            C13628n.m24510a(this.f26414L, 8);
            C13628n.m24510a(this.f26415M, 8);
            this.f26435y.setPadding(0, C3966y.m9653a(5.0f), 0, C3966y.m9653a(7.0f));
            this.f26435y.setBackgroundResource(2131234061);
        }
    }

    @Override // com.bytedance.android.livesdk.usercard.C10992x.AbstractC10994b
    /* renamed from: a */
    public final void mo17831a(User user) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f26424i) {
            boolean z2 = true;
            if (user == null || user.getId() <= 0) {
                C6497a b = C3051c.C3052a.m8362d("ttlive_show_profile_all").mo12635b("error_code", (Integer) 1).mo12637b("error_msg", "user is null");
                b.f16149e = true;
                b.mo12632a();
                mo17833a(new IllegalArgumentException("User is invalid"));
                return;
            }
            if (C6204h.m13480b()) {
                this.f26421f = user;
            } else {
                this.f26421f = User.from(user);
            }
            m19600h();
            C6497a a = C3051c.C3052a.m8360b("ttlive_show_profile_all").mo12625a("target_is_anchor", Boolean.valueOf(this.f26426k)).mo12625a("self_is_anchor", Boolean.valueOf(this.f26428m)).mo12628a("user_id", Long.valueOf(this.f26421f.getId())).mo12629a("user_name", this.f26421f.getNickName());
            if (this.f26421f.getFollowInfo() != null && this.f26426k) {
                this.f27010p.mo28320c(C5769c.class, Long.valueOf(this.f26421f.getFollowInfo().getFollowerCount()));
            }
            if (this.f26421f.getFollowInfo() != null) {
                a.mo12628a("followers", Long.valueOf(user.getFollowInfo().getFollowerCount())).mo12628a("following", Long.valueOf(user.getFollowInfo().getFollowingCount()));
            }
            a.f16147c = true;
            a.mo12632a();
            if (Room.isValid(this.f26422g)) {
                long id = this.f26422g.getOwner().getId();
                int i = 0;
                if (C11115u.m19743a().mo17915b().mo13161c() == 0 || C11115u.m19743a().mo17915b().mo13161c() != id) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.f26421f.getLiveRoomId() == 0) {
                    z2 = false;
                }
                if (z) {
                    if (z2) {
                        str = "live_anchor_c_anchor";
                    } else {
                        str = "live_anchor_c_audience";
                    }
                } else if (z2) {
                    str = "live_audience_c_anchor";
                } else {
                    str = "live_audience_c_audience";
                }
                if (this.f26422g != null && this.f26421f != null) {
                    AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
                    if (!(aVar == null || !aVar.isMicRoomForRoom(this.f26422g) || this.f26422g.officialChannelInfo == null)) {
                        if (aVar.isMicAudience() && this.f26421f.getId() == this.f26422g.officialChannelInfo.f23136a.getId()) {
                            str = "carousel_audience_c_official_id";
                        } else if (!aVar.isMicAudience() && this.f26421f.getId() == this.f26422g.officialChannelInfo.f23136a.getId()) {
                            str = "loyal_audience_c_official_id";
                        } else if (aVar.isMicAudience() && this.f26421f.getId() == this.f26422g.getOwner().getId()) {
                            str = "carousel_audience_c_anchor";
                        } else if (!aVar.isMicAudience() && this.f26421f.getId() == this.f26422g.getOwner().getId()) {
                            str = "loyal_audience_c_anchor";
                        }
                    }
                    String g = C6544e.m13993g();
                    C6501b a2 = C6501b.C6502a.m13948a("livesdk_live_click_user").mo12643a(this.f27010p).mo12658d("live_detail").mo12654b("live_interact").mo12651a("click_type", str);
                    UserProfileEvent userProfileEvent = this.f26408F;
                    if (userProfileEvent != null) {
                        str2 = userProfileEvent.clickModule;
                    } else {
                        str2 = "";
                    }
                    C6501b a3 = a2.mo12651a("click_module", str2).mo12651a("request_page", str).mo12651a("to_user_id", String.valueOf(this.f26421f.getId())).mo12651a("enter_live_method", C7411d.m15284a().mo13614e());
                    if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
                        str3 = "0";
                    } else {
                        str3 = "1";
                    }
                    C6501b a4 = a3.mo12651a("is_subscribe", str3);
                    if (this.f26406D) {
                        str4 = "portrait";
                    } else {
                        str4 = "landscape";
                    }
                    C6501b a5 = a4.mo12651a("room_orientation", str4);
                    UserProfileEvent userProfileEvent2 = this.f26408F;
                    if (userProfileEvent2 == null || TextUtils.isEmpty(userProfileEvent2.mClickUserPosition)) {
                        str5 = "profile_card";
                    } else {
                        str5 = this.f26408F.mClickUserPosition;
                    }
                    C6501b a6 = a5.mo12651a("click_user_position", str5);
                    if (this.f26421f.getSubscribeInfo() != null) {
                        if (this.f26421f.getSubscribeInfo().isAnchorQualified()) {
                            str6 = "open";
                        } else {
                            str6 = "close";
                        }
                        C6501b a7 = a6.mo12651a("subscription_status", str6);
                        if (this.f26421f.getSubscribeInfo().isAnchorQualified()) {
                            i = this.f26421f.getSubscribeInfo().getSubscriberCount();
                        }
                        a7.mo12645a("subscriber", i);
                    }
                    a6.mo12655b();
                }
            }
        }
    }

    public void onClick(View view) {
        User user;
        String str;
        Room room;
        int id = view.getId();
        if (id == R.id.nz) {
            if ((view.getTag(R.id.nz) instanceof User) && !this.f26428m) {
                User user2 = (User) view.getTag(R.id.nz);
                if (this.f26422g != null) {
                    if (C4386c.m10499a().f17248n.intValue() == 2) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.go9);
                    } else {
                        if (this.f26426k) {
                            C10985v vVar = this.f26419d;
                            user2.getId();
                            vVar.mo17841a();
                        } else {
                            C10985v vVar2 = this.f26419d;
                            user2.getId();
                            vVar2.mo17841a();
                        }
                        HashMap hashMap = new HashMap(1);
                        if (this.f27010p != null) {
                            hashMap.put("log_enter_live_source", this.f27010p.mo28318b(C11752b.class));
                        } else {
                            hashMap.put("log_enter_live_source", this.f26430t);
                        }
                        hashMap.put("sec_user_id", user2.getSecUid());
                        if (LiveHideAudienceFollowingSetting.INSTANCE.getValue() && (room = this.f26422g) != null) {
                            hashMap.put("room_id", String.valueOf(room.getId()));
                        }
                        hashMap.put("enter_from", "live");
                        ((IHostAction) C6193a.m13435a(IHostAction.class)).openUserProfilePage(user2.getId(), hashMap);
                        User user3 = this.f26421f;
                        if (!(user3 == null || user3.getFollowInfo() == null)) {
                            C6501b.C6502a.m13949b("enter_personal_detail").mo12643a(this.f27010p).mo12651a("enter_method", "click_head").mo12646a("to_user_id", this.f26421f.getId()).mo12646a("anchor_id", this.f26421f.getId()).mo12646a("follow_status", this.f26421f.getFollowInfo().getFollowStatus()).mo12651a("enter_from", "live").mo12651a("enter_from_method", "live").mo12651a("play_mode", "normal").mo12646a("relation_tag", this.f26421f.getFollowInfo().getFollowStatus()).mo12655b();
                        }
                        dismiss();
                    }
                }
                dismiss();
            }
        } else if (id == R.id.djd) {
            this.f26411I.setVisibility(0);
            this.f26412J.setVisibility(8);
            m19601j();
        } else {
            String str2 = "";
            if (id == R.id.ci9) {
                if (this.f26422g != null) {
                    getContext();
                    if (!m19599e()) {
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
                        return;
                    }
                    AbstractC0952i iVar = (AbstractC0952i) this.f27010p.mo28318b(C9021ao.class);
                    if (iVar != null) {
                        if (this.f26421f == null || this.f26422g.getOwner().getId() == this.f26421f.getId()) {
                            new C6431l().show(iVar, f26402a);
                        } else {
                            this.f27010p.mo28311a(C9083cv.class, this.f26421f);
                            long j = this.f26409G;
                            String str3 = this.f26410H;
                            boolean z = this.f26406D;
                            View$OnClickListenerC10986w wVar = new View$OnClickListenerC10986w();
                            Bundle bundle = new Bundle();
                            bundle.putLong("arg_msg_id", j);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            bundle.putString("arg_msg_content", str2);
                            bundle.putBoolean("arg_msg_is_vertical", z);
                            wVar.setArguments(bundle);
                            wVar.show(iVar, f26402a);
                        }
                    }
                    long c = C11115u.m19743a().mo17915b().mo13161c();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("user_id", String.valueOf(c));
                    hashMap2.put("to_user_id", String.valueOf(this.f26420e));
                    if (c == this.f26422g.getOwnerUserId()) {
                        str = "anchor";
                    } else {
                        str = "admin";
                    }
                    hashMap2.put("admin_type", str);
                    C6501b.C6502a.m13948a("livesdk_manage_click").mo12652a((Map<String, String>) hashMap2).mo12643a(this.f27010p).mo12656c("click").mo12655b();
                }
            } else if (id == this.f26434x.getId() && this.f26422g != null && (user = this.f26421f) != null && user.getFollowInfo() != null) {
                int pushStatus = (int) this.f26421f.getFollowInfo().getPushStatus();
                AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
                if (aVar == null || !aVar.isMicRoomForRoom(this.f26422g) || !aVar.isMicAudienceForRoom(this.f26422g)) {
                    str2 = this.f26421f.displayId;
                } else {
                    Room room2 = this.f26422g;
                    if (!(room2 == null || room2.officialChannelInfo == null || this.f26422g.officialChannelInfo.f23136a == null)) {
                        str2 = this.f26422g.officialChannelInfo.f23136a.displayId;
                    }
                }
                IHostApp.C11789a aVar2 = new IHostApp.C11789a();
                aVar2.f28170b = String.valueOf(this.f26421f.getId());
                aVar2.f28169a = String.valueOf(this.f26422g.getId());
                aVar2.f28171c = "message";
                aVar2.f28172d = "live_cell";
                aVar2.f28173e.put("event_belong", "live");
                aVar2.f28173e.put("event_page", "notification_setting");
                ((IHostApp) C6193a.m13435a(IHostApp.class)).showNotificationTipDialog(new StringBuilder().append(this.f26421f.getId()).toString(), str2, this.f26421f.getSecUid(), pushStatus, this.f26434x, "", aVar2, ((Boolean) this.f27010p.mo28318b(C9076co.class)).booleanValue(), new AbstractC9514aa() {
                    /* class com.bytedance.android.livesdk.usercard.View$OnClickListenerC10973o.C109773 */

                    static {
                        Covode.recordClassIndex(12592);
                    }

                    @Override // com.bytedance.android.livesdk.model.AbstractC9514aa
                    /* renamed from: a */
                    public final void mo13796a() {
                    }

                    @Override // com.bytedance.android.livesdk.model.AbstractC9514aa
                    /* renamed from: a */
                    public final void mo13797a(int i) {
                        View$OnClickListenerC10973o.this.mo17834b(i);
                        View$OnClickListenerC10973o.this.f26421f.getFollowInfo().setPushStatus((long) i);
                    }
                });
                HashMap hashMap3 = new HashMap();
                hashMap3.put("enter_from_merge", "message");
                hashMap3.put("enter_method", "live_cell");
                hashMap3.put("anchor_id", String.valueOf(this.f26420e));
                hashMap3.put("room_id", String.valueOf(this.f26422g.getId()));
                C6501b.C6502a.m13948a("livesdk_live_notification_button_click").mo12652a((Map<String, String>) hashMap3).mo12643a(this.f27010p).mo12656c("click").mo12654b("live").mo12651a("event_page", "anchor_profile").mo12655b();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f26422g != null) {
            view.findViewById(R.id.emn).setOnClickListener(new View$OnClickListenerC10979p(this));
            this.f26432v = view.findViewById(R.id.cbi);
            this.f26413K = (ViewGroup) view.findViewById(R.id.cg3);
            this.f26411I = view.findViewById(R.id.d_3);
            View findViewById = view.findViewById(R.id.djd);
            this.f26412J = findViewById;
            findViewById.setOnClickListener(this);
            boolean z = false;
            this.f26411I.setVisibility(0);
            this.f26412J.setVisibility(8);
            this.f26431u = view.findViewById(R.id.dii);
            this.f26433w = view.findViewById(R.id.ci9);
            this.f26434x = (ImageView) view.findViewById(R.id.cu6);
            this.f26435y = (HSImageView) view.findViewById(R.id.nz);
            this.f26414L = view.findViewById(R.id.bsx);
            this.f26415M = (HSImageView) view.findViewById(R.id.bss);
            this.f26436z = (HSImageView) view.findViewById(R.id.b9l);
            this.f26403A = (ImageView) view.findViewById(R.id.b9k);
            this.f26416N = (HSImageView) view.findViewById(R.id.bst);
            this.f26435y.setOnClickListener(this);
            this.f26434x.setOnClickListener(this);
            Activity activity = this.f26404B;
            User user = this.f26421f;
            Room room = this.f26422g;
            boolean z2 = this.f26406D;
            int i = this.f26417b;
            C10992x xVar = this.f26418c;
            DataChannel dataChannel = this.f27010p;
            String str = this.f26430t;
            UserProfileEvent userProfileEvent = this.f26408F;
            View$OnClickListenerC10962f fVar = new View$OnClickListenerC10962f();
            fVar.f26368d = user;
            if (user != null) {
                fVar.f26371g = user.getId();
                fVar.f26373i = new C10985v(activity, room, user.getId());
            }
            fVar.f26372h = room;
            fVar.f26376l = i;
            fVar.f26374j = z2;
            fVar.f26375k = xVar;
            fVar.f26366b = activity;
            fVar.f26367c = dataChannel;
            fVar.f26379o = str;
            fVar.f26377m = userProfileEvent.interactLogLabel;
            this.f26405C = fVar;
            fVar.f26380p = new C10983t(this);
            UserProfileEvent userProfileEvent2 = this.f26408F;
            if (!(userProfileEvent2 == null || userProfileEvent2.mRankInfo == null)) {
                this.f26405C.f26378n = this.f26408F.mRankInfo;
            }
            C10992x xVar2 = this.f26418c;
            if (xVar2 != null) {
                xVar2.f26465b = this.f26405C;
            }
            View$OnClickListenerC10962f fVar2 = this.f26405C;
            if (fVar2 != null) {
                AbstractC0976n a = getChildFragmentManager().mo3552a();
                a.mo3469b(R.id.d7o, fVar2);
                a.mo3473c();
            }
            if (this.f26423h == null) {
                this.f26432v.setVisibility(8);
                this.f26413K.setVisibility(0);
            } else {
                m19600h();
            }
            long c = C11115u.m19743a().mo17915b().mo13161c();
            if (this.f26422g.getOwner() != null && c == this.f26422g.getOwner().getId()) {
                z = true;
            }
            this.f26428m = z;
            if (z) {
                this.f26429n = true;
            } else {
                User user2 = this.f26423h;
                if (!(user2 == null || user2.getUserAttr() == null)) {
                    this.f26429n = this.f26423h.getUserAttr().f23192b;
                }
            }
            m19601j();
            ((AbstractC11181z) C6779a.m14563a().mo13052a(C11625a.class).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143274a(C11152e.m19789a((Fragment) this))).mo17949a(new C10980q(this));
        }
    }
}

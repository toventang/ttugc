package com.bytedance.android.livesdk.userinfowidget;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.d */
final /* synthetic */ class RunnableC11028d implements Runnable {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26571a;

    static {
        Covode.recordClassIndex(12646);
    }

    RunnableC11028d(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26571a = liveRoomUserInfoWidget;
    }

    public final void run() {
        String str;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26571a;
        if (liveRoomUserInfoWidget.isViewValid()) {
            User owner = liveRoomUserInfoWidget.f26536q.getOwner();
            if (owner != null) {
                liveRoomUserInfoWidget.f26523d.setVAble(false);
                if (liveRoomUserInfoWidget.f26538s || liveRoomUserInfoWidget.f26545z == null || !liveRoomUserInfoWidget.f26545z.isMicRoomForCurrentRoom() || liveRoomUserInfoWidget.f26536q.officialChannelInfo == null || liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a == null) {
                    if (!liveRoomUserInfoWidget.f26541v && owner.getAvatarThumb() != null) {
                        liveRoomUserInfoWidget.f26541v = true;
                        C7577g.m15570a(liveRoomUserInfoWidget.f26523d, owner.getAvatarThumb(), 2131234442);
                    }
                    liveRoomUserInfoWidget.f26525f.setText(C6581g.m14076b(owner));
                } else {
                    if (!liveRoomUserInfoWidget.f26541v && liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a.getAvatarThumb() != null) {
                        liveRoomUserInfoWidget.f26541v = true;
                        C7577g.m15570a(liveRoomUserInfoWidget.f26523d, liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a.getAvatarThumb(), 2131234442);
                    }
                    liveRoomUserInfoWidget.f26525f.setText(liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a.displayId);
                }
                liveRoomUserInfoWidget.mo17856a(C8313a.m16463a(owner));
                liveRoomUserInfoWidget.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.UNFOLLOW);
                if (liveRoomUserInfoWidget.f26538s || liveRoomUserInfoWidget.f26545z == null || liveRoomUserInfoWidget.f26536q.officialChannelInfo == null || liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a == null || !liveRoomUserInfoWidget.f26545z.isMicRoomForCurrentRoom()) {
                    if (owner.isFollowing()) {
                        liveRoomUserInfoWidget.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.FOLLOWED);
                    }
                } else if (liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a.getFollowInfo().getFollowStatus() == 1 || liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a.getFollowInfo().getFollowStatus() == 2) {
                    liveRoomUserInfoWidget.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.FOLLOWED);
                }
                if (C11115u.m19743a().mo17915b().mo13161c() == owner.getId()) {
                    liveRoomUserInfoWidget.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.FOLLOWED);
                }
                if (owner.getAuthenticationInfo() != null) {
                    C13628n.m24510a(liveRoomUserInfoWidget.f26526g, 0);
                    C3951p.m9627a(liveRoomUserInfoWidget.f26526g, owner.getAuthenticationInfo().f23240c, 0, new C3951p.AbstractC3953a.C3954a() {
                        /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.C110197 */

                        static {
                            Covode.recordClassIndex(12636);
                        }

                        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a.C3954a
                        /* renamed from: a */
                        public final void mo9304a(boolean z) {
                            int i;
                            ImageView imageView = LiveRoomUserInfoWidget.this.f26526g;
                            if (z) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            C13628n.m24510a(imageView, i);
                        }
                    });
                    if (liveRoomUserInfoWidget.f26542w != liveRoomUserInfoWidget.f26536q.getId()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("anchor_id", owner.getIdStr());
                        hashMap.put("room_id", liveRoomUserInfoWidget.f26536q.getIdStr());
                        hashMap.put("show_type", "nickname_anchor");
                        hashMap.put("live_type", liveRoomUserInfoWidget.f26536q.getStreamType().logStreamingType);
                        hashMap.put("enter_from_merge", C6544e.m13987a());
                        hashMap.put("enter_method", C6544e.m13990d());
                        AbstractC2994b a = C11115u.m19743a().mo17915b().mo13147a();
                        if (a.getId() == owner.getId()) {
                            str = "anchor";
                        } else {
                            str = (a.getUserAttr() == null || !a.getUserAttr().f23192b) ? "viewer" : "admin";
                        }
                        hashMap.put("admin_type", str);
                        C6501b.C6502a.m13948a("livesdk_authentication_icon_show").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
                    }
                } else {
                    C13628n.m24510a(liveRoomUserInfoWidget.f26526g, 8);
                    liveRoomUserInfoWidget.f26526g.setImageDrawable(null);
                }
            }
            liveRoomUserInfoWidget.f26542w = liveRoomUserInfoWidget.f26536q.getId();
            liveRoomUserInfoWidget.show();
        }
    }
}

package com.bytedance.android.livesdk.subscribe;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.subscribe.b */
public class C10785b implements AbstractC5834a {
    static {
        Covode.recordClassIndex(12386);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.p384o.AbstractC5834a
    public Fragment getSubscribeInfoListFragment(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        C10783a aVar = new C10783a();
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.bytedance.android.live.p384o.AbstractC5834a
    public void openUserSubscribeEntry(Context context, Room room, String str) {
        SubscribeInfo subscribeInfo;
        C89219l.m154721d(context, "");
        C89219l.m154721d(room, "");
        C89219l.m154721d(str, "");
        C29844g gVar = new C29844g(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_entry());
        gVar.mo52130a("anchor_id", C11115u.m19743a().mo17915b().mo13153a(room.getOwnerUserId()));
        gVar.mo52129a("room_id", room.getId());
        gVar.mo52130a("enter_from_merge", C6544e.m13987a());
        gVar.mo52130a("enter_method", C6544e.m13990d());
        gVar.mo52130a("show_entrance", str);
        gVar.mo52130a("request_id", C6544e.m13997k());
        gVar.mo52130a("video_id", C6544e.m13992f());
        User owner = room.getOwner();
        int i = 1;
        if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            i = 0;
        }
        gVar.mo52128a("is_subscribe", i);
        Uri parse = Uri.parse(gVar.mo52126a());
        C89219l.m154716b(parse, "");
        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(context, parse);
    }

    @Override // com.bytedance.android.live.p384o.AbstractC5834a
    public void openUserSubscribeState(Context context, Room room, String str) {
        SubscribeInfo subscribeInfo;
        C89219l.m154721d(context, "");
        C89219l.m154721d(room, "");
        C89219l.m154721d(str, "");
        C29844g gVar = new C29844g(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_subscribe_state());
        gVar.mo52130a("anchor_id", C11115u.m19743a().mo17915b().mo13153a(room.getOwnerUserId()));
        gVar.mo52129a("room_id", room.getId());
        gVar.mo52130a("enter_from_merge", C6544e.m13987a());
        gVar.mo52130a("enter_method", C6544e.m13990d());
        gVar.mo52130a("show_entrance", str);
        gVar.mo52130a("request_id", C6544e.m13997k());
        gVar.mo52130a("video_id", C6544e.m13992f());
        User owner = room.getOwner();
        int i = 1;
        if (owner == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isSubscribed()) {
            i = 0;
        }
        gVar.mo52128a("is_subscribe", i);
        Uri parse = Uri.parse(gVar.mo52126a());
        C89219l.m154716b(parse, "");
        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(context, parse);
    }
}

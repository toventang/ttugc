package com.bytedance.android.livesdk.watch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.C6561ab;
import com.bytedance.android.livesdk.RunnableC6628ad;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.detail.C7454r;
import com.bytedance.android.livesdk.chatroom.interaction.C7628a;
import com.bytedance.android.livesdk.chatroom.p489d.C7413a;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdk.drawerfeed.C8418d;
import com.bytedance.android.livesdk.event.C8455h;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.live.p564a.C9286a;
import com.bytedance.android.livesdk.live.p566c.C9294a;
import com.bytedance.android.livesdk.p425aa.C6545f;
import com.bytedance.android.livesdk.p441ah.C6699h;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p571m.C9452a;
import com.bytedance.android.livesdk.p571m.C9454b;
import com.bytedance.android.livesdk.p571m.DialogInterfaceC9457d;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.survey.p638ui.p639a.C10865v;
import com.bytedance.android.livesdk.watch.chatroom.C11324b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.depend.p680d.EnumC11628a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.watch.f */
public class C11327f implements AbstractC11325d {
    private int liveRoomChangeCount = 1;

    static {
        Covode.recordClassIndex(12966);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public int getLiveRoomChangeCount() {
        return this.liveRoomChangeCount;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public AbstractC11322c getPreFetchManager() {
        return C7454r.C7455a.m15360a();
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void setLiveRoomChangeCount(int i) {
        this.liveRoomChangeCount = i;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void addLiveDuration(long j) {
        C7822br.f19400aq.add(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public C10865v createShareGuideEvasionStrategy(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        return new C10865v(dataChannel);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void addLiveDurationTask(AbstractC7258b bVar) {
        C7413a a = C7413a.m15292a();
        if (bVar != null) {
            a.f18386a.add(bVar);
            if (a.f18387b) {
                a.mo13617a(bVar);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void preloadWatchResource(Context context) {
        C89219l.m154721d(context, "");
        C11330h.m20085a();
        ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).preloadAudienceToolbarWidget();
        C2690b.m7787a((int) R.layout.bg5);
        ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).preloadWidgetView();
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public AbstractC11650h createLiveRoomFragment(EnterRoomConfig enterRoomConfig) {
        String concat;
        C89219l.m154721d(enterRoomConfig, "");
        C6561ab.f16389a = new C6545f();
        C9286a aVar = C9294a.m17572a().f22727a;
        if ((aVar == null || TextUtils.isEmpty(aVar.f22694a) || (!aVar.f22694a.equals(EnumC11628a.FEED.typeName) && !aVar.f22694a.equals(EnumC11628a.FEED_WITH_PREVIEW.typeName))) && enterRoomConfig != null) {
            String str = enterRoomConfig.f28233c.f28293J;
            String str2 = enterRoomConfig.f28233c.f28295L;
            String str3 = enterRoomConfig.f28233c.f28293J;
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                if (!TextUtils.isEmpty(str)) {
                    concat = "from_merge_".concat(String.valueOf(str));
                } else if (!TextUtils.isEmpty(str3)) {
                    concat = "extra_from_merge_".concat(String.valueOf(str3));
                } else {
                    concat = "method_".concat(String.valueOf(str2));
                }
                C9294a.m17572a().f22727a = new C9286a(concat);
            }
        }
        C6203g.m13462a(RunnableC6628ad.f16525a);
        C6561ab abVar = new C6561ab();
        C89219l.m154716b(abVar, "");
        return abVar;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public List<?> audienceToolbarList(DataChannel dataChannel, Context context) {
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(context, "");
        return C7628a.m15642a(dataChannel, context);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public AbstractC11321b createDrawerFeedFragment(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        C8418d dVar = new C8418d();
        dVar.f20830h = null;
        dVar.f20826d = bundle;
        dVar.f20828f = fullDraggableContainer;
        return dVar;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void showMaskLayer(long j, boolean z) {
        C6779a.m14563a().mo13053a(new C8455h(j, z));
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public boolean shouldDislikeActionShow(String str, String str2) {
        if (C89219l.m154714a((Object) str2, (Object) EnumC10345i.HOURLY_RANK.getRankName()) || !C89070n.m154556a((Iterable) ((ArrayList) C9452a.f22985a.getValue()), (Object) str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void openShareSettingsDialog(Activity activity, String str) {
        C89219l.m154721d(str, "");
        if (activity instanceof ActivityC0945e) {
            C89219l.m154721d(str, "");
            C6699h hVar = new C6699h();
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", str);
            hVar.setArguments(bundle);
            AbstractC0952i supportFragmentManager = ((ActivityC0945e) activity).getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            hVar.show(supportFragmentManager, C6699h.f16623b);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void dislikeLiveFromSharePanel(Room room, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C9452a.m17753a(room, str, str2, C9454b.EnumC9455a.SHARING_PANEL);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void logDislikeLiveFromLongPressSharePanel(Room room, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C9452a.m17754b(room, str, str2, C9454b.EnumC9455a.LONG_PRESS);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void logDislikeLiveFromSharePanel(Room room, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C9452a.m17754b(room, str, str2, C9454b.EnumC9455a.SHARING_PANEL);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void logReportLiveFromSharePanel(Room room, String str, String str2, String str3) {
        if (room != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            C11324b.m20078a(room, str, str2, str3);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public DialogInterface openLongPressDialog(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3) {
        if (context == null || room == null || !(context instanceof ActivityC0945e)) {
            return null;
        }
        DialogInterfaceC9457d dVar = new DialogInterfaceC9457d();
        dVar.f22991a = !shouldDislikeActionShow(str, str2);
        dVar.f22994d = str;
        dVar.f22995e = str2;
        C89219l.m154721d(room, "");
        dVar.f22993c = room;
        dVar.f22996f = str3;
        dVar.f22992b = iHostLongPressCallback;
        AbstractC0952i supportFragmentManager = ((ActivityC0945e) context).getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        dVar.show(supportFragmentManager, "LiveLongPressDialog");
        return dVar;
    }
}

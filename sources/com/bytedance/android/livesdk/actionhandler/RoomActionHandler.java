package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.event.C8453f;
import com.bytedance.android.livesdk.livesetting.roomfunction.ReturnBackSettingsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptSchemaWatchLiveSetting;
import com.bytedance.android.livesdk.p425aa.AbstractC6556j;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

public class RoomActionHandler implements AbstractC6613e {
    private boolean isFromPush;
    private volatile C6625q roomActionHandler2;

    static {
        Covode.recordClassIndex(7345);
    }

    private C6625q getRoomActionHandler2() {
        MethodCollector.m26663i(2781);
        if (this.roomActionHandler2 == null) {
            synchronized (this) {
                try {
                    if (this.roomActionHandler2 == null) {
                        this.roomActionHandler2 = new C6625q();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2781);
                    throw th;
                }
            }
        }
        C6625q qVar = this.roomActionHandler2;
        MethodCollector.m26664o(2781);
        return qVar;
    }

    public String getExtraAutoRouteSchema(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).getString("auto_route_schema");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public boolean canHandle(Uri uri) {
        if (TextUtils.equals("live", uri.getHost())) {
            return true;
        }
        if (!TextUtils.equals("webcast_room", uri.getHost())) {
            return false;
        }
        if (TextUtils.equals("/", uri.getPath()) || TextUtils.equals("", uri.getPath())) {
            return true;
        }
        return false;
    }

    private EnterRoomConfig fillInEnterRoomConfig(Room room, EnterRoomConfig enterRoomConfig) {
        enterRoomConfig.f28233c.f28308Y = room.getId();
        return enterRoomConfig;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handle$0$RoomActionHandler(long j, AbstractC88982v vVar) {
        String str;
        try {
            T t = ((ActionHandlerApi) C5805e.m12718a().mo11572a(ActionHandlerApi.class)).getRoomStats(false, j, 2).execute().f52262b;
            if (t != null) {
                Room room = (Room) ((C5832d) t).data;
                if (room != null) {
                    User owner = room.getOwner();
                    if (room.getStatus() == 4) {
                        str = "live_finish";
                    } else {
                        str = "live_on";
                    }
                    logPushCheckLiveState(owner, j, str);
                }
            }
        } catch (Exception e) {
            C3854a.m9458a("ttlive_push", e);
        }
    }

    public void logPushClick(String str, String str2) {
        if (this.isFromPush) {
            C6501b.C6502a.m13948a("livesdk_push_click").mo12652a(new AbstractC6556j.C6557a().mo12691a("anchor_id", str2).mo12691a("room_id", str).f16374a).mo12655b();
        }
    }

    public EnterRoomConfig addSlimRoomData(String str, EnterRoomConfig enterRoomConfig) {
        SlimRoom slimRoom = (SlimRoom) C11116a.m19745a(C11266h.m19967a(str), SlimRoom.class);
        if (slimRoom != null) {
            enterRoomConfig.f28231a.f28386m = true;
            enterRoomConfig.f28231a.f28385l = slimRoom.getId();
            enterRoomConfig.f28231a.f28375b = slimRoom.buildPullUrl();
            enterRoomConfig.f28231a.f28376c = slimRoom.getSdkParams();
            enterRoomConfig.f28231a.f28377d = slimRoom.getMultiStreamData();
            enterRoomConfig.f28231a.f28379f = slimRoom.getMultiStreamDefaultQualitySdkKey();
            C11738s.C11739a aVar = slimRoom.getStreamUrlExtraSafely().f28106n;
            if (aVar != null) {
                enterRoomConfig.f28231a.f28380g = aVar.f28114a;
                enterRoomConfig.f28231a.f28381h = aVar.f28115b;
                enterRoomConfig.f28231a.f28382i = aVar.f28116c;
            }
            enterRoomConfig.f28231a.f28383j = slimRoom.getStreamType().ordinal();
        }
        return enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public boolean handle(final Context context, final Uri uri) {
        if (LiveOptSchemaWatchLiveSetting.INSTANCE.getValue()) {
            return getRoomActionHandler2().handle(context, uri);
        }
        String queryParameter = uri.getQueryParameter("room_id");
        long j = 0;
        if (!TextUtils.isEmpty(queryParameter)) {
            long parseLong = Long.parseLong(queryParameter);
            if (parseLong <= 0) {
                return false;
            }
            String str = "";
            String queryParameter2 = uri.getQueryParameter("enter_from_merge");
            String queryParameter3 = uri.getQueryParameter("enter_method");
            String queryParameter4 = uri.getQueryParameter("inner_push_type");
            String queryParameter5 = uri.getQueryParameter("gd_label");
            String queryParameter6 = uri.getQueryParameter("user_id");
            if (!TextUtils.isEmpty(queryParameter6)) {
                try {
                    j = Long.parseLong(queryParameter6);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            if (C13627m.m24498a(str)) {
                str = String.valueOf(j);
            }
            logPushClick(queryParameter, queryParameter6);
            if (this.isFromPush) {
                AbstractC88979t.m154294a(new C6620l(this, parseLong)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143300g();
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28233c.f28301R = parseLong;
            enterRoomConfig.f28232b.f28258b = str;
            enterRoomConfig.f28233c.f28307X = uri.getQueryParameter("enter_live_source");
            enterRoomConfig.f28233c.f28293J = queryParameter2;
            enterRoomConfig.f28233c.f28295L = uri.getQueryParameter("enter_method");
            enterRoomConfig.f28232b.f28269m = uri.getQueryParameter("enter_from_module");
            enterRoomConfig.f28233c.f28287D = queryParameter6;
            enterRoomConfig.f28233c.f28355k = uri.getQueryParameter("tip");
            enterRoomConfig.f28233c.f28295L = queryParameter3;
            enterRoomConfig.f28232b.f28273q = queryParameter4;
            enterRoomConfig.f28232b.f28274r = queryParameter5;
            enterRoomConfig.f28232b.f28257a = uri.getQueryParameter("request_id");
            enterRoomConfig.f28232b.f28263g = uri.getQueryParameter("log_pb");
            enterRoomConfig.f28233c.f28354j = uri.getQueryParameter("tip_i18n");
            enterRoomConfig.f28232b.f28272p = uri.getQueryParameter("top_message_type");
            enterRoomConfig.f28233c.f28362r = -1;
            enterRoomConfig.f28232b.f28276t = uri.getQueryParameter("pop_type");
            enterRoomConfig.f28232b.f28259c = uri.getQueryParameter("video_id");
            enterRoomConfig.f28233c.f28353i = uri.getQueryParameter("back_room");
            enterRoomConfig.f28232b.f28265i = uri.getQueryParameter("request_page");
            enterRoomConfig.f28232b.f28266j = uri.getQueryParameter("anchor_type");
            enterRoomConfig.f28232b.f28251H = uri.getQueryParameter("magic3_source");
            enterRoomConfig.f28232b.f28252I = uri.getQueryParameter("magic3_activityId");
            enterRoomConfig.f28232b.f28253J = uri.getQueryParameter("magic3_comptype");
            enterRoomConfig.f28232b.f28280x = uri.getQueryParameter("search_id");
            enterRoomConfig.f28232b.f28282z = uri.getQueryParameter("search_result_id");
            enterRoomConfig.f28233c.f28316aF = getExtraAutoRouteSchema(uri.getQueryParameter("extra_params"));
            String queryParameter7 = uri.getQueryParameter("slim_room");
            C11199a.m19846a(uri, enterRoomConfig);
            if (!TextUtils.isEmpty(queryParameter7)) {
                enterRoomConfig = addSlimRoomData(queryParameter7, enterRoomConfig);
            }
            return handleEnterRoom(context, enterRoomConfig);
        }
        final String queryParameter8 = uri.getQueryParameter("user_id");
        if (TextUtils.isEmpty(queryParameter8)) {
            return false;
        }
        long parseLong2 = Long.parseLong(queryParameter8);
        if (parseLong2 <= 0) {
            return false;
        }
        C11115u.m19743a().mo17915b().mo13160b(parseLong2).mo116431a_(new AbstractC88406ae<User>() {
            /* class com.bytedance.android.livesdk.actionhandler.RoomActionHandler.C66081 */

            static {
                Covode.recordClassIndex(7346);
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onSubscribe(AbstractC88412b bVar) {
            }

            @Override // p4560f.p4561a.AbstractC88406ae
            public final void onError(Throwable th) {
                RoomActionHandler.this.logPushClick("-1", queryParameter8);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88406ae
            public final /* synthetic */ void onSuccess(User user) {
                String str;
                User user2 = user;
                RoomActionHandler.this.logPushClick(String.valueOf(user2.getLiveRoomId()), queryParameter8);
                long liveRoomId = user2.getLiveRoomId();
                RoomActionHandler roomActionHandler = RoomActionHandler.this;
                if (liveRoomId > 0) {
                    str = "live_on";
                } else {
                    str = "live_finish";
                }
                roomActionHandler.logPushCheckLiveState(user2, liveRoomId, str);
                if (liveRoomId > 0) {
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.f28233c.f28301R = liveRoomId;
                    enterRoomConfig.f28232b.f28258b = queryParameter8;
                    enterRoomConfig.f28232b.f28267k = liveRoomId;
                    enterRoomConfig.f28233c.f28307X = uri.getQueryParameter("enter_live_source");
                    enterRoomConfig.f28233c.f28293J = uri.getQueryParameter("enter_from_merge");
                    enterRoomConfig.f28232b.f28269m = uri.getQueryParameter("enter_from_module");
                    enterRoomConfig.f28233c.f28287D = queryParameter8;
                    enterRoomConfig.f28233c.f28355k = uri.getQueryParameter("tip");
                    enterRoomConfig.f28233c.f28295L = uri.getQueryParameter("enter_method");
                    enterRoomConfig.f28232b.f28273q = uri.getQueryParameter("inner_push_type");
                    enterRoomConfig.f28232b.f28274r = uri.getQueryParameter("gd_label");
                    enterRoomConfig.f28232b.f28257a = uri.getQueryParameter("request_id");
                    enterRoomConfig.f28232b.f28263g = uri.getQueryParameter("log_pb");
                    enterRoomConfig.f28233c.f28354j = uri.getQueryParameter("tip_i18n");
                    enterRoomConfig.f28232b.f28272p = uri.getQueryParameter("top_message_type");
                    enterRoomConfig.f28232b.f28276t = uri.getQueryParameter("pop_type");
                    enterRoomConfig.f28232b.f28259c = uri.getQueryParameter("video_id");
                    enterRoomConfig.f28233c.f28353i = uri.getQueryParameter("back_room");
                    enterRoomConfig.f28232b.f28265i = uri.getQueryParameter("request_page");
                    enterRoomConfig.f28232b.f28266j = uri.getQueryParameter("anchor_type");
                    enterRoomConfig.f28232b.f28251H = uri.getQueryParameter("magic3_source");
                    enterRoomConfig.f28232b.f28252I = uri.getQueryParameter("magic3_activityId");
                    enterRoomConfig.f28232b.f28253J = uri.getQueryParameter("magic3_comptype");
                    enterRoomConfig.f28232b.f28280x = uri.getQueryParameter("search_id");
                    enterRoomConfig.f28232b.f28282z = uri.getQueryParameter("search_result_id");
                    enterRoomConfig.f28233c.f28316aF = RoomActionHandler.this.getExtraAutoRouteSchema(uri.getQueryParameter("extra_params"));
                    String queryParameter = uri.getQueryParameter("slim_room");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        enterRoomConfig = RoomActionHandler.this.addSlimRoomData(queryParameter, enterRoomConfig);
                    }
                    RoomActionHandler.this.handleEnterRoom(context, enterRoomConfig);
                    return;
                }
                C11226ao.m19883a(context, C3966y.m9669e().getString(R.string.gpa), 0);
            }
        });
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0153, code lost:
        if (r1 != com.bytedance.android.livesdk.chatroom.p491f.C7557c.f18769a) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleEnterRoom(android.content.Context r12, com.bytedance.android.livesdkapi.session.EnterRoomConfig r13) {
        /*
        // Method dump skipped, instructions count: 421
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.actionhandler.RoomActionHandler.handleEnterRoom(android.content.Context, com.bytedance.android.livesdkapi.session.EnterRoomConfig):boolean");
    }

    @Override // com.bytedance.android.livesdk.actionhandler.AbstractC6614f
    public boolean handle(Context context, Uri uri, Map<String, String> map) {
        if (LiveOptSchemaWatchLiveSetting.INSTANCE.getValue()) {
            return getRoomActionHandler2().handle(context, uri, map);
        }
        return handle(context, uri);
    }

    public void logPushCheckLiveState(User user, long j, String str) {
        if (this.isFromPush) {
            C6501b a = C6501b.C6502a.m13948a("livesdk_push_click_lookup_anchor");
            AbstractC6556j.C6557a a2 = new AbstractC6556j.C6557a().mo12691a("anchor_id", String.valueOf(user.getId())).mo12691a("anchor_status", str);
            if (j <= 0) {
                j = 0;
            }
            a.mo12652a(a2.mo12691a("room_id", String.valueOf(j)).f16374a).mo12655b();
        }
    }

    private void jumpToOtherRoom(EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig) {
        String str;
        EnterRoomConfig fillInEnterRoomConfig = fillInEnterRoomConfig(room, enterRoomConfig);
        enterRoomLinkSession.mo18994a(new Event("live_scheme_jump_to_other_room", 771, EnumC11866b.BussinessApiCall));
        C8452e eVar = new C8452e(fillInEnterRoomConfig.f28233c.f28301R);
        eVar.f20899d = fillInEnterRoomConfig;
        if ("true".equals(fillInEnterRoomConfig.f28233c.f28353i)) {
            C6779a.m14563a().mo13053a(new C8453f(eVar));
            return;
        }
        if (ReturnBackSettingsSetting.INSTANCE.getValue().mo13893a()) {
            if (!((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoom() || !fillInEnterRoomConfig.f28233c.f28326ag) {
                str = "jump_source_live_banner";
            } else {
                str = "jump_source_mic_room";
            }
            fillInEnterRoomConfig.f28233c.f28341av = str;
        }
        C6779a.m14563a().mo13053a(eVar);
    }

    private void jumpToOtherRoom(EnterRoomLinkSession enterRoomLinkSession, Room room, long j, EnterRoomConfig enterRoomConfig) {
        String str;
        EnterRoomConfig fillInEnterRoomConfig = fillInEnterRoomConfig(room, enterRoomConfig);
        C8452e eVar = new C8452e(j);
        enterRoomLinkSession.mo18994a(new Event("live_scheme_jump_to_other_room", 772, EnumC11866b.BussinessApiCall));
        eVar.f20899d = fillInEnterRoomConfig;
        if ("true".equals(fillInEnterRoomConfig.f28233c.f28353i)) {
            C6779a.m14563a().mo13053a(new C8453f(eVar));
            return;
        }
        if (ReturnBackSettingsSetting.INSTANCE.getValue().mo13893a()) {
            if (!((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoom() || !fillInEnterRoomConfig.f28233c.f28326ag) {
                str = "jump_source_live_banner";
            } else {
                str = "jump_source_mic_room";
            }
            fillInEnterRoomConfig.f28233c.f28341av = str;
        }
        C6779a.m14563a().mo13053a(eVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$handleEnterRoom$3$RoomActionHandler(EnterRoomLinkSession enterRoomLinkSession, Room room, EnterRoomConfig enterRoomConfig, DialogInterface dialogInterface, int i) {
        jumpToOtherRoom(enterRoomLinkSession, room, enterRoomConfig.f28233c.f28301R, enterRoomConfig);
        dialogInterface.dismiss();
    }
}

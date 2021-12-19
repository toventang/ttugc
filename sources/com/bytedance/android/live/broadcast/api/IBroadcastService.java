package com.bytedance.android.live.broadcast.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.api.p184b.AbstractC3022a;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3062b;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3063c;
import com.bytedance.android.live.p379n.AbstractC5776i;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7600a;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h;
import com.bytedance.android.livesdkapi.p697j.AbstractC11821a;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.avframework.livestreamv2.core.Client;
import com.p2082ss.avframework.livestreamv2.core.LiveCore;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.C89391z;

public interface IBroadcastService extends AbstractC2953a {

    /* renamed from: com.bytedance.android.live.broadcast.api.IBroadcastService$a */
    public interface AbstractC3017a {
        static {
            Covode.recordClassIndex(3487);
        }

        /* renamed from: a */
        C89391z mo8220a();

        /* renamed from: a */
        C89391z mo8221a(String str);

        /* renamed from: a */
        C89391z mo8222a(String str, String str2);
    }

    static {
        Covode.recordClassIndex(3486);
    }

    C11672a convertStickerBean(Effect effect);

    AbstractBinderC11605a createBgBroadcastBinder();

    AbstractC11677a createBgBroadcastFragment(AbstractC11678b bVar, Bundle bundle);

    AbstractC3063c createCoverController(Fragment fragment, Room room);

    Client createGuestClient(Context context, LiveCore.InteractConfig interactConfig);

    AbstractC3062b createLinkInRoomView(AbstractC3055a aVar, Context context, int i);

    AbstractC7600a createLinkVideoView(Context context, AbstractC3060a.C3061a aVar);

    AbstractC5776i createLiveBroadcastEndFragment(Bundle bundle);

    AbstractC11679c createLiveBroadcastFragment(AbstractC11678b bVar, Bundle bundle);

    AbstractC11685f createStartLiveFragment(AbstractC11821a aVar);

    Activity getBroadcastActivity();

    String getLiveComposerFilePath();

    String getLiveCoreVersion();

    Map<String, String> getRoomInfo();

    AbstractC3054d getSubscribeEntranceHelper();

    Fragment getSubscribeSettingFragment();

    <T> Class<T> getWidgetClass(int i);

    boolean haveNewFilter();

    void init();

    AbstractC88979t<Integer> loadShortVideoRes();

    void onLiveTabShow(Context context);

    void setApplyLivePermission(C11825a aVar);

    void setBroadcastActivity(Activity activity);

    void setDetailLivePermission(C11826b bVar);

    void showEndPageForPaidEvent();

    void showGuideBirthdayEditDialog(Activity activity, String str, String str2, AbstractC3017a aVar);

    AbstractC11687h startLiveManager();

    AbstractC3022a stickerPresenter();
}

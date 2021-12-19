package com.bytedance.android.live.broadcast.api.p183a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.AbstractC3054d;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
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

/* renamed from: com.bytedance.android.live.broadcast.api.a.a */
public class C3019a implements IBroadcastService {
    public static boolean hasShown;

    static {
        Covode.recordClassIndex(3492);
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public C11672a convertStickerBean(Effect effect) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractBinderC11605a createBgBroadcastBinder() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11677a createBgBroadcastFragment(AbstractC11678b bVar, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3063c createCoverController(Fragment fragment, Room room) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Client createGuestClient(Context context, LiveCore.InteractConfig interactConfig) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3062b createLinkInRoomView(AbstractC3055a aVar, Context context, int i) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC7600a createLinkVideoView(Context context, AbstractC3060a.C3061a aVar) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC5776i createLiveBroadcastEndFragment(Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11679c createLiveBroadcastFragment(AbstractC11678b bVar, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11685f createStartLiveFragment(AbstractC11821a aVar) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Activity getBroadcastActivity() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveComposerFilePath() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public String getLiveCoreVersion() {
        return "";
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Map<String, String> getRoomInfo() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3054d getSubscribeEntranceHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public Fragment getSubscribeSettingFragment() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public <T> Class<T> getWidgetClass(int i) {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public boolean haveNewFilter() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void init() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC88979t<Integer> loadShortVideoRes() {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void onLiveTabShow(Context context) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setApplyLivePermission(C11825a aVar) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setBroadcastActivity(Activity activity) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void setDetailLivePermission(C11826b bVar) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showEndPageForPaidEvent() {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public void showGuideBirthdayEditDialog(Activity activity, String str, String str2, IBroadcastService.AbstractC3017a aVar) {
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC11687h startLiveManager() {
        return null;
    }

    @Override // com.bytedance.android.live.broadcast.api.IBroadcastService
    public AbstractC3022a stickerPresenter() {
        return null;
    }
}

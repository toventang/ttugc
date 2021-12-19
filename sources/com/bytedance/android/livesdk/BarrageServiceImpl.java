package com.bytedance.android.livesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.android.livesdk.chatroom.interaction.C7635d;
import com.bytedance.android.livesdk.chatroom.p477a.p478a.C7266a;
import com.bytedance.android.livesdk.chatroom.p477a.p479b.C7269a;
import com.bytedance.android.livesdk.like.AbstractC9167a;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.C9169c;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget;
import com.bytedance.android.livesdk.like.widget.OthersLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.OthersLikeWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveOptimizedLikeSetting;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.widget.BarrageWidget;
import com.bytedance.android.livesdk.widget.C11368a;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BarrageServiceImpl implements AbstractC10073p, AbstractC33974au {
    private final Map<Long, AbstractC9168b> likeHelperMap = new HashMap();

    static {
        Covode.recordClassIndex(7149);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbsBarrageWidget getBarrageWidget() {
        return new BarrageWidget();
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public Class<? extends LiveRecyclableWidget> getLikeUserInfoAnimWidgetClass(AbstractC9168b bVar) {
        return LikeUserInfoAnimWidget.class;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC9168b getLikeHelper(long j) {
        return this.likeHelperMap.get(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public Class<? extends LiveRecyclableWidget> getOthersLikeWidgetClass(AbstractC9168b bVar) {
        if (!bVar.mo15298p()) {
            return OthersLikeWidget.class;
        }
        return OthersLikeViewOptimizedWidget.class;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public Class<? extends LiveRecyclableWidget> getSelfLikeWidgetClass(AbstractC9168b bVar) {
        if (!bVar.mo15298p()) {
            return SelfLikeWidget.class;
        }
        return SelfLikeViewOptimizedWidget.class;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public void releaseLikeHelper(long j) {
        this.likeHelperMap.remove(Long.valueOf(j));
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public String formatLikeNumber(long j) {
        if (j < 0) {
            return "";
        }
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return C1764a.m5929a(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j / 100)) / 10.0f)}) + 'K';
        } else if (j < 1000000000) {
            return C1764a.m5929a(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j / 100000)) / 10.0f)}) + 'M';
        } else {
            return C1764a.m5929a(Locale.US, "%.1f", new Object[]{Float.valueOf(((float) (j / 100000000)) / 10.0f)}) + 'B';
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC11633b getBarrageLauncher(Context context, ViewGroup viewGroup) {
        return new C11368a(context, viewGroup);
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC87059a getDiggController(BarrageLayout barrageLayout, int i) {
        return new C7269a(barrageLayout, i);
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC87048a getDiggBarrage(Bitmap bitmap, Double d) {
        return new C7266a(bitmap, d.doubleValue());
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public void configInteractionHelper(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout) {
        new C7635d(fragment, dataChannel, gestureDetectLayout);
    }

    public static void addALogTrace(Room room, boolean z, boolean z2, boolean z3, DataChannel dataChannel, AbstractC9168b bVar) {
        String str;
        String str2;
        String str3 = "enabled";
        String str4 = null;
        if (bVar.mo15295n()) {
            str = "disabled_due_to_landscape_mode";
            if (z) {
                str4 = str3;
            } else {
                str4 = str;
            }
            if (z2) {
                str = str3;
            }
            if (z3) {
                str2 = str3;
            } else {
                str2 = "disabled_due_to_being_audience_and_mic_room";
            }
        } else {
            if (!room.getRoomAuthStatus().isEnableDigg()) {
                str3 = "disabled_by_room_auth";
            } else if (!C11115u.m19743a().mo17915b().mo13165e()) {
                str3 = "disabled_due_to_unlogin";
            } else if (!((Boolean) dataChannel.mo28318b(C9119ed.class)).booleanValue() || DiggParamsSetting.INSTANCE.getValue().f19049a == 1) {
                str3 = null;
                str4 = null;
            } else {
                str3 = "disabled_due_to_being_anchor_and_ab";
            }
            str = str4;
            str2 = str;
        }
        C9169c.m17443a(room.getId(), C11115u.m19743a().mo17915b().mo13161c(), room.getOwnerUserId(), str3, str4, str, str2);
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public void configLikeHelper(ActivityC0945e eVar, AbstractC1204m mVar, Room room, AbstractC9167a aVar, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
        AbstractC9168b optimizedLikeHelper;
        if (eVar != null && mVar != null && room != null && dataChannel != null) {
            if (room.getRoomAuthStatus() == null) {
                C9169c.m17443a(room.getId(), C11115u.m19743a().mo17915b().mo13161c(), room.getOwnerUserId(), "disabled_due_to_empty_room_auth", null, null, null);
                return;
            }
            eVar.getLifecycle().mo4012a(this);
            if (!LiveOptimizedLikeSetting.INSTANCE.getValue()) {
                optimizedLikeHelper = new LikeHelper(eVar, mVar, room, z, z2, z3, dataChannel);
            } else {
                optimizedLikeHelper = new OptimizedLikeHelper(eVar, mVar, room, z, z2, z3, dataChannel);
            }
            addALogTrace(room, z, z2, z3, dataChannel, optimizedLikeHelper);
            this.likeHelperMap.put(Long.valueOf(room.getId()), optimizedLikeHelper);
            if (z && aVar != null && aVar.mo13855a() != null) {
                aVar.mo13855a().mo18161a(optimizedLikeHelper.mo15266a());
            }
        }
    }
}

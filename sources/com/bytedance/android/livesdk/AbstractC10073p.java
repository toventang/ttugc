package com.bytedance.android.livesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.like.AbstractC9167a;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;

/* renamed from: com.bytedance.android.livesdk.p */
public interface AbstractC10073p extends AbstractC2953a {
    static {
        Covode.recordClassIndex(11635);
    }

    void configInteractionHelper(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout);

    void configLikeHelper(ActivityC0945e eVar, AbstractC1204m mVar, Room room, AbstractC9167a aVar, boolean z, boolean z2, boolean z3, DataChannel dataChannel);

    String formatLikeNumber(long j);

    AbstractC11633b getBarrageLauncher(Context context, ViewGroup viewGroup);

    AbsBarrageWidget getBarrageWidget();

    AbstractC87048a getDiggBarrage(Bitmap bitmap, Double d);

    AbstractC87059a getDiggController(BarrageLayout barrageLayout, int i);

    AbstractC9168b getLikeHelper(long j);

    Class<? extends LiveRecyclableWidget> getLikeUserInfoAnimWidgetClass(AbstractC9168b bVar);

    Class<? extends LiveRecyclableWidget> getOthersLikeWidgetClass(AbstractC9168b bVar);

    Class<? extends LiveRecyclableWidget> getSelfLikeWidgetClass(AbstractC9168b bVar);

    void releaseLikeHelper(long j);
}

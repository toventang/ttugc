package com.bytedance.android.live.slot;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.Map;

public interface ISlotService extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6855);
    }

    AbstractC6189w createIconSlotController(ActivityC0945e eVar, IIconSlot.AbstractC6148a aVar, IIconSlot.EnumC6149b bVar, IIconSlot.EnumC6150c cVar);

    void dispatchMessage(IMessage iMessage);

    AbstractC6190x getAggregateProviderByID(IIconSlot.EnumC6149b bVar);

    Class<? extends LiveRecyclableWidget> getBarrageWidget();

    Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameSlotWidget();

    List<AbstractC11664a> getLiveShareSheetAction(Map<String, Object> map, IIconSlot.EnumC6149b bVar);

    List<C6161ad> getProviderWrappersByID(IFrameSlot.EnumC6146b bVar);

    List<C6161ad> getProviderWrappersByID(IIconSlot.EnumC6149b bVar);

    AbstractC6156aa getSlotMessagerByBiz(String str);

    boolean isBizTypeRegistered(String str);

    void registerAggregateSlot(AbstractC6190x xVar);

    void registerSlot(AbstractC6191y yVar);
}

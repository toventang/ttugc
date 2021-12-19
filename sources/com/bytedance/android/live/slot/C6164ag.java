package com.bytedance.android.live.slot;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.slot.ag */
public class C6164ag implements ISlotService {
    static {
        Covode.recordClassIndex(6870);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public AbstractC6189w createIconSlotController(ActivityC0945e eVar, IIconSlot.AbstractC6148a aVar, IIconSlot.EnumC6149b bVar, IIconSlot.EnumC6150c cVar) {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void dispatchMessage(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public AbstractC6190x getAggregateProviderByID(IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBarrageWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameSlotWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public AbstractC6156aa getSlotMessagerByBiz(String str) {
        C89219l.m154721d(str, "");
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public boolean isBizTypeRegistered(String str) {
        return false;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerAggregateSlot(AbstractC6190x xVar) {
        C89219l.m154721d(xVar, "");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerSlot(AbstractC6191y yVar) {
        C89219l.m154721d(yVar, "");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<C6161ad> getProviderWrappersByID(IFrameSlot.EnumC6146b bVar) {
        C89219l.m154721d(bVar, "");
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<C6161ad> getProviderWrappersByID(IIconSlot.EnumC6149b bVar) {
        C89219l.m154721d(bVar, "");
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<AbstractC11664a> getLiveShareSheetAction(Map<String, Object> map, IIconSlot.EnumC6149b bVar) {
        return new ArrayList();
    }
}

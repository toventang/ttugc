package com.bytedance.android.live;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.C4321g;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.slot.AbstractC6155a;
import com.bytedance.android.live.slot.AbstractC6156aa;
import com.bytedance.android.live.slot.AbstractC6189w;
import com.bytedance.android.live.slot.AbstractC6190x;
import com.bytedance.android.live.slot.AbstractC6191y;
import com.bytedance.android.live.slot.BarrageWidget;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.C6161ad;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.IconSlotController;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlotExperiment;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.i */
public class C4350i implements ISlotService {
    static {
        Covode.recordClassIndex(4924);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBarrageWidget() {
        return BarrageWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget() {
        return BottomLeftSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget() {
        return FrameL2SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget() {
        return FrameL3SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public Class<? extends LiveRecyclableWidget> getFrameSlotWidget() {
        return FrameSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public AbstractC6190x getAggregateProviderByID(IIconSlot.EnumC6149b bVar) {
        return C4321g.m10436a().mo10012b(bVar);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<C6161ad> getProviderWrappersByID(IFrameSlot.EnumC6146b bVar) {
        return C4321g.m10436a().mo10010a(bVar);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public boolean isBizTypeRegistered(String str) {
        return C4321g.m10436a().f11872a.f11876d.containsKey(str);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void dispatchMessage(IMessage iMessage) {
        Iterator<AbstractC6191y> it = C4321g.m10436a().f11872a.f11876d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<C6161ad> getProviderWrappersByID(IIconSlot.EnumC6149b bVar) {
        return C4321g.m10436a().mo10011a(bVar);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public AbstractC6156aa getSlotMessagerByBiz(String str) {
        C4321g a = C4321g.m10436a();
        if (a.f11872a.f11876d.containsKey(str) && a.f11872a.mo10013a(str) != null) {
            a.f11872a.mo10013a(str);
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerAggregateSlot(AbstractC6190x xVar) {
        C4321g a = C4321g.m10436a();
        String b = xVar.mo12096b();
        if (!TextUtils.isEmpty(b)) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(b);
            if (slotBizTypeDisallow == null || !slotBizTypeDisallow.getDisallowAll()) {
                C4321g.C4322a aVar = a.f11872a;
                aVar.f11877e.put(xVar.mo12096b(), xVar);
                List<IIconSlot.EnumC6149b> a2 = xVar.mo12095a();
                if (a2 != null) {
                    for (IIconSlot.EnumC6149b bVar : a2) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(bVar.name())) {
                            a.f11872a.f11875c.put(bVar, xVar);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public void registerSlot(AbstractC6191y yVar) {
        C4321g a = C4321g.m10436a();
        String c = yVar.mo12101c();
        if (!TextUtils.isEmpty(c)) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(c);
            if (slotBizTypeDisallow == null || !slotBizTypeDisallow.getDisallowAll()) {
                C4321g.C4322a aVar = a.f11872a;
                aVar.f11876d.put(yVar.mo12101c(), yVar);
                List<IIconSlot.EnumC6149b> a2 = yVar.mo12099a();
                if (a2 != null) {
                    for (IIconSlot.EnumC6149b bVar : a2) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(bVar.name())) {
                            C4321g.C4322a aVar2 = a.f11872a;
                            List<AbstractC6191y> list = aVar2.f11873a.get(bVar);
                            if (list == null) {
                                list = new ArrayList<>();
                                aVar2.f11873a.put(bVar, list);
                            }
                            list.add(yVar);
                        }
                    }
                }
                List<IFrameSlot.EnumC6146b> b = yVar.mo12100b();
                if (b != null) {
                    for (IFrameSlot.EnumC6146b bVar2 : b) {
                        if (slotBizTypeDisallow == null || slotBizTypeDisallow.getFrameSlotDisallowList() == null || !slotBizTypeDisallow.getFrameSlotDisallowList().contains(bVar2.name())) {
                            C4321g.C4322a aVar3 = a.f11872a;
                            List<AbstractC6191y> list2 = aVar3.f11874b.get(bVar2);
                            if (list2 == null) {
                                list2 = new ArrayList<>();
                                aVar3.f11874b.put(bVar2, list2);
                            }
                            list2.add(yVar);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public List<AbstractC11664a> getLiveShareSheetAction(Map<String, Object> map, IIconSlot.EnumC6149b bVar) {
        ArrayList arrayList = new ArrayList();
        List<C6161ad> a = C4321g.m10436a().mo10011a(bVar);
        if (a == null) {
            return arrayList;
        }
        for (C6161ad adVar : a) {
            List list = null;
            AbstractC6155a aVar = adVar.f15391b instanceof AbstractC6155a ? (AbstractC6155a) adVar.f15391b : null;
            if (aVar != null) {
                try {
                    list = (List) aVar.mo12068a(map, bVar).get("param_live_broadcast_share_sheet_list");
                } catch (Exception unused) {
                    C3854a.m9453a(4, "TAG", "getLiveShareSheetAction responseParams get param_live_broadcast_share_sheet_list, error");
                }
                if (list != null && list.size() > 0) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public AbstractC6189w createIconSlotController(ActivityC0945e eVar, IIconSlot.AbstractC6148a aVar, IIconSlot.EnumC6149b bVar, IIconSlot.EnumC6150c cVar) {
        return new IconSlotController(eVar, aVar, bVar, cVar);
    }
}

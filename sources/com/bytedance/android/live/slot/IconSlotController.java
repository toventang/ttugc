package com.bytedance.android.live.slot;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.C4321g;
import com.bytedance.android.live.p379n.C5787s;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9015ai;
import com.bytedance.android.livesdk.p561j.C9016aj;
import com.bytedance.android.livesdk.p561j.C9044bj;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class IconSlotController implements AbstractC6189w {

    /* renamed from: a */
    Map<String, Object> f15368a = new HashMap();

    /* renamed from: b */
    Map<IIconSlot.EnumC6149b, AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b>> f15369b = new HashMap();

    /* renamed from: c */
    Map<IIconSlot.EnumC6149b, IIconSlot.SlotViewModel> f15370c = new HashMap();

    /* renamed from: d */
    Queue<C6165ah> f15371d;

    /* renamed from: e */
    WeakHandler f15372e = new WeakHandler(this);

    /* renamed from: f */
    ActivityC0945e f15373f;

    /* renamed from: g */
    public IIconSlot.AbstractC6148a f15374g;

    /* renamed from: h */
    protected DataChannel f15375h;

    /* renamed from: i */
    protected IMessageManager f15376i;

    /* renamed from: j */
    IIconSlot.EnumC6149b f15377j;

    /* renamed from: k */
    C6167c f15378k;

    /* renamed from: l */
    IIconSlot.EnumC6150c f15379l;

    /* renamed from: m */
    private AbstractC6157ab.AbstractC6158a f15380m = new AbstractC6157ab.AbstractC6158a() {
        /* class com.bytedance.android.live.slot.IconSlotController.C61511 */

        static {
            Covode.recordClassIndex(6857);
        }

        @Override // com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6158a
        /* renamed from: a */
        public final Context mo12042a() {
            return IconSlotController.this.f15373f;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6158a
        /* renamed from: a */
        public final boolean mo12043a(AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar, IIconSlot.SlotViewModel slotViewModel) {
            if (IconSlotController.this.f15378k == null) {
                return false;
            }
            IconSlotController.this.f15374g.mo8829a(abVar, slotViewModel);
            return true;
        }
    };

    static {
        Covode.recordClassIndex(6856);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6192z
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        Queue<C6165ah> queue = this.f15371d;
        if (queue != null) {
            Iterator<C6165ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6192z
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        Queue<C6165ah> queue = this.f15371d;
        if (queue != null) {
            Iterator<C6165ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    private HashMap<String, String> m13377a() {
        DataChannel dataChannel = this.f15375h;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = (HashMap) dataChannel.mo28318b(C5787s.class);
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f15375h.mo28311a(C5787s.class, hashMap2);
        return hashMap2;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6192z
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        Queue<C6165ah> queue = this.f15371d;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12070a(new Bundle());
            }
            C6167c cVar = this.f15378k;
            if (!(cVar == null || cVar.f15404a == null)) {
                this.f15378k.f15404a.mo12070a(new Bundle());
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6192z
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        IMessageManager iMessageManager = this.f15376i;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f15372e.removeCallbacksAndMessages(null);
        Queue<C6165ah> queue = this.f15371d;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12077d();
            }
            C6167c cVar = this.f15378k;
            if (!(cVar == null || cVar.f15404a == null)) {
                this.f15378k.f15404a.mo12077d();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6192z
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
        Queue<C6165ah> queue = this.f15371d;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12075b();
            }
            C6167c cVar = this.f15378k;
            if (!(cVar == null || cVar.f15404a == null)) {
                this.f15378k.f15404a.mo12075b();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6192z
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        Queue<C6165ah> queue = this.f15371d;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12076c();
            }
            C6167c cVar = this.f15378k;
            if (!(cVar == null || cVar.f15404a == null)) {
                this.f15378k.f15404a.mo12076c();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6189w
    /* renamed from: a */
    public final /* synthetic */ AbstractC6189w mo12058a(DataChannel dataChannel) {
        this.f15375h = dataChannel;
        if (dataChannel != null) {
            this.f15376i = (IMessageManager) dataChannel.mo28318b(C9068cg.class);
        }
        return this;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        Queue<C6165ah> queue = this.f15371d;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                if (ahVar.f15399c) {
                    ahVar.f15398b.mo12072a(iMessage);
                }
            }
            C6167c cVar = this.f15378k;
            if (!(cVar == null || cVar.f15404a == null)) {
                this.f15378k.f15404a.mo12072a(iMessage);
            }
        }
    }

    /* renamed from: a */
    private void m13378a(List<C6165ah> list) {
        if (this.f15378k == null) {
            C6167c cVar = new C6167c();
            this.f15378k = cVar;
            cVar.f15404a = C4321g.m10436a().mo10012b(this.f15377j).mo12094a(this.f15373f, this.f15377j);
            this.f15378k.f15404a.mo12074a(this.f15368a, new AbstractC6157ab.AbstractC6159b() {
                /* class com.bytedance.android.live.slot.IconSlotController.C61544 */

                static {
                    Covode.recordClassIndex(6860);
                }

                @Override // com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6159b
                /* renamed from: a */
                public final void mo12045a(boolean z) {
                }
            });
        }
        for (C6165ah ahVar : list) {
            if (!ahVar.f15401e) {
                IIconSlot.SlotViewModel a = IIconSlot.SlotViewModel.m13371a(ahVar.f15398b, this.f15373f);
                ahVar.f15398b.mo12071a(a, this.f15380m);
                ahVar.f15401e = true;
                this.f15378k.f15404a.mo12092a(ahVar.f15398b, a);
            }
        }
        IIconSlot.SlotViewModel a2 = IIconSlot.SlotViewModel.m13371a(this.f15378k.f15404a, this.f15373f);
        if (!this.f15378k.f15405b) {
            this.f15378k.f15405b = true;
        }
        this.f15378k.f15404a.mo12071a(a2, this.f15380m);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message.what == 1) {
            C6165ah ahVar = (C6165ah) message.obj;
            Iterator<C6165ah> it = this.f15371d.iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                C6165ah next = it.next();
                if (!next.f15400d || next.f15399c) {
                    arrayList.add(next);
                } else {
                    next.f15398b.mo12077d();
                    it.remove();
                }
            }
            if (arrayList.size() > 1 && this.f15379l == IIconSlot.EnumC6150c.AGGREGATE) {
                m13378a(arrayList);
            } else if (ahVar.f15399c && !ahVar.f15401e && (ahVar.f15398b.mo12079f() instanceof IIconSlot)) {
                IIconSlot.SlotViewModel a = IIconSlot.SlotViewModel.m13371a(ahVar.f15398b, this.f15373f);
                this.f15374g.mo8830a(ahVar, a);
                ahVar.f15398b.mo12071a(a, this.f15380m);
                ahVar.f15401e = true;
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6189w
    /* renamed from: a */
    public final void mo12060a(String str, Object obj) {
        this.f15368a.put(str, obj);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6189w
    /* renamed from: a */
    public final void mo12059a(ActivityC0945e eVar, IIconSlot.EnumC6149b bVar) {
        this.f15371d = new PriorityBlockingQueue(3, new Comparator<C6165ah>() {
            /* class com.bytedance.android.live.slot.IconSlotController.C61522 */

            static {
                Covode.recordClassIndex(6858);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C6165ah ahVar, C6165ah ahVar2) {
                return ahVar.f15397a - ahVar2.f15397a;
            }
        });
        List<C6161ad> a = C4321g.m10436a().mo10011a(bVar);
        if (a != null) {
            mo12060a("param_live_enter_from_merge", C6544e.m13987a());
            mo12060a("param_live_enter_method_merge", C6544e.m13990d());
            mo12060a("param_live_action_type", C6544e.m13991e());
            mo12060a("param_live_rec_content_id", C6544e.m14001o());
            mo12060a("param_live_rec_content_type", C6544e.m14002p());
            mo12060a("param_search_id", C6544e.m14003q());
            mo12060a("param_search_result_id", C6544e.m14004r());
            DataChannel dataChannel = this.f15375h;
            if (dataChannel != null) {
                mo12060a("param_room", dataChannel.mo28318b(C9093de.class));
                mo12060a("param_effect_ad_extra", this.f15375h.mo28318b(C9044bj.class));
                mo12060a("param_enter_from_effect_ad_bool", this.f15375h.mo28318b(C9016aj.class));
                m13377a().put("param_live_slot_load_time", new StringBuilder().append(System.currentTimeMillis()).toString());
                mo12060a("param_live_show_time", m13377a());
                mo12060a("param_extra_auto_route_schema", this.f15375h.mo28318b(C9015ai.class));
            }
            for (C6161ad adVar : a) {
                AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> a2 = adVar.f15391b.mo12098a(eVar, bVar);
                if (a2 != null) {
                    final C6165ah ahVar = new C6165ah();
                    ahVar.f15397a = C6163af.m13408a(a2.mo12078e(), a2.mo12080g());
                    ahVar.f15398b = a2;
                    this.f15371d.offer(ahVar);
                    if (!(this.f15376i == null || a2.mo12069a() == null)) {
                        for (Integer num : a2.mo12069a()) {
                            if (num.intValue() > 0) {
                                this.f15376i.addMessageListener(num.intValue(), this);
                            }
                        }
                    }
                    a2.mo12074a(this.f15368a, new AbstractC6157ab.AbstractC6159b() {
                        /* class com.bytedance.android.live.slot.IconSlotController.C61533 */

                        static {
                            Covode.recordClassIndex(6859);
                        }

                        @Override // com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6159b
                        /* renamed from: a */
                        public final void mo12045a(boolean z) {
                            ahVar.mo12083a(z);
                            Message obtainMessage = IconSlotController.this.f15372e.obtainMessage(1);
                            obtainMessage.obj = ahVar;
                            IconSlotController.this.f15372e.sendMessage(obtainMessage);
                        }
                    });
                }
            }
        }
    }

    public IconSlotController(ActivityC0945e eVar, IIconSlot.AbstractC6148a aVar, IIconSlot.EnumC6149b bVar, IIconSlot.EnumC6150c cVar) {
        this.f15373f = eVar;
        this.f15374g = aVar;
        this.f15377j = bVar;
        this.f15379l = cVar;
        aVar.mo8828a(cVar);
    }
}

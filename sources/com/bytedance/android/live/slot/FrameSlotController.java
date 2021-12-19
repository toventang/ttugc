package com.bytedance.android.live.slot;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.live.C4321g;
import com.bytedance.android.live.p379n.C5787s;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9015ai;
import com.bytedance.android.livesdk.p561j.C9016aj;
import com.bytedance.android.livesdk.p561j.C9044bj;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class FrameSlotController implements WeakHandler.IHandler, AbstractC33974au, OnMessageListener {

    /* renamed from: a */
    Map<IFrameSlot.EnumC6146b, AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b>> f15316a = new HashMap();

    /* renamed from: b */
    Map<IFrameSlot.EnumC6146b, IFrameSlot.SlotViewModel> f15317b = new HashMap();

    /* renamed from: c */
    Queue<C6165ah> f15318c;

    /* renamed from: d */
    WeakHandler f15319d = new WeakHandler(this);

    /* renamed from: e */
    ActivityC0945e f15320e;

    /* renamed from: f */
    protected DataChannel f15321f;

    /* renamed from: g */
    protected IMessageManager f15322g;

    /* renamed from: h */
    Map<String, Object> f15323h = new HashMap();

    /* renamed from: i */
    IFrameSlot.EnumC6147c f15324i;

    /* renamed from: j */
    private IFrameSlot.AbstractC6145a f15325j;

    /* renamed from: k */
    private Room f15326k;

    /* renamed from: l */
    private boolean f15327l;

    /* renamed from: m */
    private AbstractC6157ab.AbstractC6158a f15328m = new AbstractC6157ab.AbstractC6158a() {
        /* class com.bytedance.android.live.slot.FrameSlotController.C61381 */

        static {
            Covode.recordClassIndex(6837);
        }

        @Override // com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6158a
        /* renamed from: a */
        public final boolean mo12043a(AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar, IIconSlot.SlotViewModel slotViewModel) {
            return false;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6158a
        /* renamed from: a */
        public final Context mo12042a() {
            return FrameSlotController.this.f15320e;
        }
    };

    static {
        Covode.recordClassIndex(6836);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public void onPause() {
        Queue<C6165ah> queue = this.f15318c;
        if (queue != null) {
            Iterator<C6165ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        Queue<C6165ah> queue = this.f15318c;
        if (queue != null) {
            Iterator<C6165ah> it = queue.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public void onStart() {
        Queue<C6165ah> queue = this.f15318c;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12075b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        Queue<C6165ah> queue = this.f15318c;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12076c();
            }
        }
    }

    /* renamed from: a */
    private HashMap<String, String> m13352a() {
        DataChannel dataChannel = this.f15321f;
        if (dataChannel == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = (HashMap) dataChannel.mo28318b(C5787s.class);
        if (hashMap != null) {
            return hashMap;
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.f15321f.mo28311a(C5787s.class, hashMap2);
        return hashMap2;
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public void onCreate() {
        Queue<C6165ah> queue = this.f15318c;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12070a(new Bundle());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        IMessageManager iMessageManager = this.f15322g;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f15319d.removeCallbacksAndMessages(null);
        Queue<C6165ah> queue = this.f15318c;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                ahVar.f15398b.mo12077d();
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        Queue<C6165ah> queue = this.f15318c;
        if (queue != null) {
            for (C6165ah ahVar : queue) {
                if (ahVar.f15399c) {
                    ahVar.f15398b.mo12072a(iMessage);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12035a(AbstractC8094bq bqVar) {
        DataChannel provideDataChannel = bqVar.provideDataChannel();
        this.f15321f = provideDataChannel;
        if (provideDataChannel != null) {
            this.f15322g = (IMessageManager) provideDataChannel.mo28318b(C9068cg.class);
            this.f15326k = (Room) this.f15321f.mo28318b(C9093de.class);
            this.f15327l = ((Boolean) this.f15321f.mo28318b(C9119ed.class)).booleanValue();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        AbstractC1174ac a;
        if (message.what == 1) {
            C6165ah ahVar = (C6165ah) message.obj;
            Iterator<C6165ah> it = this.f15318c.iterator();
            while (it.hasNext()) {
                C6165ah next = it.next();
                if (next.f15400d && !next.f15399c) {
                    next.f15398b.mo12077d();
                    it.remove();
                }
            }
            if (ahVar != null && ahVar.f15399c && !ahVar.f15401e && (ahVar.f15398b.mo12079f() instanceof IFrameSlot)) {
                AbstractC6157ab abVar = ahVar.f15398b;
                C1175ad a2 = C1181ae.m3881a(this.f15320e, (C1175ad.AbstractC1177b) null);
                String str = abVar.mo12078e().name() + abVar.hashCode();
                if (IFrameSlot.SlotViewModel.class.equals(ScopeViewModel.class)) {
                    a = a2.mo3984a(str, IFrameSlot.SlotViewModel.class);
                } else {
                    a = a2.mo3984a(str, IFrameSlot.SlotViewModel.class);
                    C1171ab.m3870a(a, a2);
                }
                IFrameSlot.SlotViewModel slotViewModel = (IFrameSlot.SlotViewModel) a;
                this.f15325j.mo12019a(ahVar, slotViewModel);
                ahVar.f15398b.mo12071a(slotViewModel, this.f15328m);
                ahVar.f15401e = true;
            }
        }
    }

    /* renamed from: a */
    private void m13353a(String str, Object obj) {
        this.f15323h.put(str, obj);
    }

    /* renamed from: a */
    public final void mo12034a(ActivityC0945e eVar, IFrameSlot.EnumC6146b bVar) {
        int i;
        Integer num;
        this.f15318c = new PriorityBlockingQueue(3, new Comparator<C6165ah>() {
            /* class com.bytedance.android.live.slot.FrameSlotController.C61392 */

            static {
                Covode.recordClassIndex(6838);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C6165ah ahVar, C6165ah ahVar2) {
                return ahVar.f15397a - ahVar2.f15397a;
            }
        });
        List<C6161ad> a = C4321g.m10436a().mo10010a(bVar);
        if (a != null) {
            m13353a("param_live_enter_from_merge", C6544e.m13987a());
            m13353a("param_live_enter_method_merge", C6544e.m13990d());
            m13353a("param_live_action_type", C6544e.m13991e());
            m13353a("param_live_rec_content_id", C6544e.m14001o());
            m13353a("param_live_rec_content_type", C6544e.m14002p());
            DataChannel dataChannel = this.f15321f;
            if (dataChannel != null) {
                m13353a("param_room", dataChannel.mo28318b(C9093de.class));
                m13353a("param_effect_ad_extra", this.f15321f.mo28318b(C9044bj.class));
                m13353a("param_enter_from_effect_ad_bool", this.f15321f.mo28318b(C9016aj.class));
                m13352a().put("param_live_slot_load_time", new StringBuilder().append(System.currentTimeMillis()).toString());
                m13353a("param_live_show_time", m13352a());
                m13353a("param_extra_auto_route_schema", this.f15321f.mo28318b(C9015ai.class));
                m13353a("param_search_id", C6544e.m14003q());
                m13353a("param_search_result_id", C6544e.m14004r());
            }
            for (C6161ad adVar : a) {
                AbstractC6157ab<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> a2 = adVar.f15391b.mo12097a(eVar, bVar);
                if (a2 != null) {
                    final C6165ah ahVar = new C6165ah();
                    IFrameSlot.EnumC6146b e = a2.mo12078e();
                    String g = a2.mo12080g();
                    Map<String, Integer> map = C6163af.f15393b.get(e);
                    if (map == null || (num = map.get(g)) == null) {
                        i = C6163af.f15396e;
                    } else {
                        i = num.intValue();
                    }
                    ahVar.f15397a = i;
                    ahVar.f15398b = a2;
                    this.f15318c.offer(ahVar);
                    if (!(this.f15322g == null || a2.mo12069a() == null)) {
                        for (Integer num2 : a2.mo12069a()) {
                            if (num2.intValue() > 0) {
                                this.f15322g.addMessageListener(num2.intValue(), this);
                            }
                        }
                    }
                    a2.mo12074a(this.f15323h, new AbstractC6157ab.AbstractC6159b() {
                        /* class com.bytedance.android.live.slot.FrameSlotController.C61403 */

                        static {
                            Covode.recordClassIndex(6839);
                        }

                        @Override // com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6159b
                        /* renamed from: a */
                        public final void mo12045a(boolean z) {
                            ahVar.mo12083a(z);
                            Message obtainMessage = FrameSlotController.this.f15319d.obtainMessage(1);
                            obtainMessage.obj = ahVar;
                            FrameSlotController.this.f15319d.sendMessage(obtainMessage);
                        }
                    });
                }
            }
        }
    }

    public FrameSlotController(ActivityC0945e eVar, IFrameSlot.AbstractC6145a aVar, IFrameSlot.EnumC6147c cVar) {
        this.f15320e = eVar;
        this.f15325j = aVar;
        this.f15324i = cVar;
        aVar.mo12018a(cVar);
    }
}

package com.p2082ss.android.ugc.aweme.live.slot;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.AbstractC6187u;
import com.bytedance.android.live.slot.C6163af;
import com.bytedance.android.live.slot.C6165ah;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1206f.C17309b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.ss.android.ugc.aweme.live.slot.c */
public final class C58763c implements AbstractC6187u<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> {

    /* renamed from: a */
    C58769c f133730a = new C58769c();

    /* renamed from: b */
    public C58767b f133731b = new C58767b();

    /* renamed from: c */
    IIconSlot.SlotViewModel f133732c;

    /* renamed from: d */
    AbstractC6157ab.AbstractC6158a f133733d;

    /* renamed from: e */
    int f133734e;

    /* renamed from: f */
    int f133735f;

    /* renamed from: g */
    public boolean f133736g;

    /* renamed from: h */
    boolean f133737h;

    /* renamed from: i */
    IIconSlot.EnumC6149b f133738i;

    /* renamed from: j */
    AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> f133739j;

    /* renamed from: k */
    C58766a f133740k;

    /* renamed from: l */
    HashMap<AbstractC6157ab, IIconSlot.SlotViewModel> f133741l = new HashMap<>();

    static {
        Covode.recordClassIndex(69071);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final List<Integer> mo12069a() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12070a(Bundle bundle) {
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12072a(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: b */
    public final void mo12075b() {
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: c */
    public final void mo12076c() {
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "LIVE_SDK_GroupBusiness";
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12079f() {
        return this.f133731b;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.c$b */
    public class C58767b implements IIconSlot {

        /* renamed from: a */
        String f133748a = "GroupIconSlot";

        /* renamed from: b */
        C58780e f133749b;

        static {
            Covode.recordClassIndex(69075);
        }

        @Override // com.bytedance.android.live.slot.IIconSlot
        /* renamed from: b */
        public final Animator.AnimatorListener mo12056b() {
            return null;
        }

        @Override // com.bytedance.android.live.slot.IIconSlot
        /* renamed from: a */
        public final AbstractC6162ae mo12055a() {
            return new AbstractC6162ae() {
                /* class com.p2082ss.android.ugc.aweme.live.slot.C58763c.C58767b.C587681 */

                static {
                    Covode.recordClassIndex(69076);
                }

                @Override // com.bytedance.android.live.slot.AbstractC6162ae
                /* renamed from: a */
                public final void mo12082a(View view, String str) {
                    if (C58767b.this.f133749b == null) {
                        C58767b.this.f133749b = new C58780e(C58763c.this.f133738i, C58763c.this.f133740k);
                        C58767b.this.f133749b.f133782a = C58763c.this.f133730a;
                    }
                    if (!C58767b.this.f133749b.mo18054n()) {
                        C58767b.this.f133749b.show(((ActivityC0945e) C58763c.this.f133733d.mo12042a()).getSupportFragmentManager(), C58767b.this.f133748a);
                        C39162r.m79460a("livesdk_business_icon_click", new C33744d().mo59983a("anchor_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).mo59983a("room_id", C58763c.this.f133740k.mo96162a()).mo59983a("live_status", C58763c.this.f133740k.f133747d).mo59983a("icon_type", "Business").mo59983a("enter_from_merge", C58763c.this.f133740k.f133744a).mo59983a("enter_method", C58763c.this.f133740k.f133745b).f79943a);
                        C39162r.m79460a("livesdk_tiktokec_business_icon_click", new C33744d().mo59983a("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).mo59983a("room_id", C58763c.this.f133740k.mo96162a()).mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI").mo59983a("live_status", C58763c.this.f133740k.f133747d).f79943a);
                    }
                    if (C58763c.this.f133737h) {
                        C58763c.this.f133732c.f15353d.postValue(false);
                        C58763c.this.f133737h = false;
                    }
                }
            };
        }

        public C58767b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.c$a */
    public static class C58766a {

        /* renamed from: a */
        public String f133744a;

        /* renamed from: b */
        public String f133745b;

        /* renamed from: c */
        public Room f133746c;

        /* renamed from: d */
        public String f133747d;

        static {
            Covode.recordClassIndex(69074);
        }

        /* renamed from: a */
        public final String mo96162a() {
            Room room = this.f133746c;
            if (room != null) {
                return String.valueOf(room.getId());
            }
            return "";
        }

        public C58766a(IIconSlot.EnumC6149b bVar) {
            String str;
            if (bVar == IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
                str = "before_live";
            } else if (bVar == IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR) {
                str = "during_live";
            } else {
                str = "";
            }
            this.f133747d = str;
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: d */
    public final void mo12077d() {
        C58767b bVar = this.f133731b;
        if (bVar.f133749b != null && bVar.f133749b.mo18054n()) {
            bVar.f133749b.dismissAllowingStateLoss();
        }
    }

    /* renamed from: h */
    private void m107967h() {
        for (Map.Entry<AbstractC6157ab, IIconSlot.SlotViewModel> entry : this.f133730a.f133753b.entrySet()) {
            IIconSlot.SlotViewModel value = entry.getValue();
            if (Boolean.TRUE.equals(value.f15351b.getValue())) {
                this.f133741l.put(entry.getKey(), value);
            }
        }
        if (this.f133741l.size() == 0) {
            m107966a(false);
            this.f133733d.mo12043a(this, this.f133732c);
        } else if (this.f133741l.size() == 1) {
            Map.Entry<AbstractC6157ab, IIconSlot.SlotViewModel> next = this.f133741l.entrySet().iterator().next();
            this.f133733d.mo12043a(next.getKey(), next.getValue());
        } else {
            m107966a(true);
            this.f133733d.mo12043a(this, this.f133732c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.c$c */
    public class C58769c {

        /* renamed from: a */
        List<AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b>> f133752a = new ArrayList();

        /* renamed from: b */
        Map<AbstractC6157ab, IIconSlot.SlotViewModel> f133753b = new HashMap();

        static {
            Covode.recordClassIndex(69077);
        }

        public C58769c() {
        }

        /* renamed from: a */
        public final synchronized void mo96163a(AbstractC6157ab abVar, IIconSlot.SlotViewModel slotViewModel) {
            MethodCollector.m26663i(1765);
            Integer valueOf = Integer.valueOf(C6163af.m13409a(abVar.mo12080g()));
            int size = this.f133752a.size();
            int i = 0;
            while (true) {
                if (i >= this.f133752a.size()) {
                    break;
                }
                if (valueOf.intValue() < Integer.valueOf(C6163af.m13409a(this.f133752a.get(i).mo12080g())).intValue()) {
                    size = i;
                    break;
                }
                i++;
            }
            this.f133752a.add(size, abVar);
            this.f133753b.put(abVar, slotViewModel);
            MethodCollector.m26664o(1765);
        }
    }

    /* renamed from: a */
    private String m107965a(Context context) {
        if (this.f133738i == IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
            return context.getString(R.string.i);
        }
        if (this.f133738i == IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR) {
            return context.getString(R.string.i);
        }
        if (this.f133738i == IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR) {
            return context.getString(R.string.i);
        }
        return context.getString(R.string.i);
    }

    public C58763c(IIconSlot.EnumC6149b bVar) {
        this.f133738i = bVar;
        int i = 2131234302;
        if (bVar == IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR || !(this.f133738i == IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR || this.f133738i == IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR)) {
            i = 2131234317;
        }
        this.f133734e = i;
        int i2 = 2131234303;
        if (this.f133738i == IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR || !(this.f133738i == IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR || this.f133738i == IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR)) {
            i2 = -1;
        }
        this.f133735f = i2;
        this.f133740k = new C58766a(bVar);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12073a(String str) {
        C39162r.m79460a("livesdk_business_icon_show_notify", new C33744d().mo59983a("anchor_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).mo59983a("room_id", this.f133740k.mo96162a()).mo59983a("live_status", this.f133740k.f133747d).mo59983a("enter_from_merge", this.f133740k.f133744a).mo59983a("enter_method", this.f133740k.f133745b).f79943a);
        C39162r.m79460a("livesdk_tiktokec_business_icon_show", new C33744d().mo59983a("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()).mo59983a("room_id", this.f133740k.mo96162a()).mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI").mo59983a("live_status", this.f133740k.f133747d).f79943a);
    }

    /* renamed from: a */
    private void m107966a(boolean z) {
        int a;
        this.f133732c.f15351b.setValue(Boolean.valueOf(z));
        this.f133732c.f15354e.setValue(C0643b.m2369a(this.f133733d.mo12042a(), this.f133734e));
        if (this.f133735f > 0) {
            this.f133732c.f15355f.setValue(C0643b.m2369a(this.f133733d.mo12042a(), this.f133735f));
        }
        this.f133732c.f15358i.setValue(m107965a(this.f133733d.mo12042a()));
        C58769c cVar = this.f133730a;
        if (cVar != null) {
            for (AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar : cVar.f133752a) {
                IIconSlot.SlotViewModel slotViewModel = this.f133730a.f133753b.get(abVar);
                if (slotViewModel.f15352c.getValue() != null) {
                    this.f133732c.f15352c.setValue(slotViewModel.f15352c.getValue());
                }
                slotViewModel.f15352c.observe((AbstractC1204m) this.f133733d.mo12042a(), new AbstractC1214u<String>() {
                    /* class com.p2082ss.android.ugc.aweme.live.slot.C58763c.C587641 */

                    static {
                        Covode.recordClassIndex(69072);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // androidx.lifecycle.AbstractC1214u
                    public final /* synthetic */ void onChanged(String str) {
                        C58763c.this.f133732c.f15352c.postValue(str);
                    }
                });
            }
            if (this.f133732c.f15352c.getValue() == null && this.f133738i == IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR && (a = C17309b.m32048a(this.f133733d.mo12042a(), C17309b.f41588b).mo27617a("ttlive_broadcast_preview_business_icon_guide_count", 0)) < 5) {
                this.f133732c.f15353d.postValue(true);
                this.f133737h = true;
                C17309b.m32048a(this.f133733d.mo12042a(), C17309b.f41588b).mo27619a("ttlive_broadcast_preview_business_icon_guide_count", Integer.valueOf(a + 1)).mo27621a();
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6187u
    /* renamed from: a */
    public final void mo12092a(AbstractC6157ab abVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f133730a.mo96163a(abVar, slotViewModel);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(AbstractC1174ac acVar, AbstractC6157ab.AbstractC6158a aVar) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) acVar;
        IIconSlot.SlotViewModel slotViewModel2 = this.f133732c;
        this.f133732c = slotViewModel;
        this.f133736g = true;
        this.f133733d = aVar;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(3, new Comparator<C6165ah>() {
            /* class com.p2082ss.android.ugc.aweme.live.slot.C58763c.C587652 */

            static {
                Covode.recordClassIndex(69073);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C6165ah ahVar, C6165ah ahVar2) {
                return ahVar.f15397a - ahVar2.f15397a;
            }
        });
        for (Map.Entry<AbstractC6157ab, IIconSlot.SlotViewModel> entry : this.f133730a.f133753b.entrySet()) {
            if (!(entry.getValue().f15365p == null || entry.getValue().f15365p.intValue() == 0)) {
                priorityBlockingQueue.add(new C6165ah(entry.getKey(), C6163af.m13408a(this.f133738i, entry.getKey().mo12080g())));
            }
        }
        if (priorityBlockingQueue.size() > 0) {
            AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar = ((C6165ah) priorityBlockingQueue.peek()).f15398b;
            if (this.f133739j != abVar) {
                this.f133733d.mo12043a(abVar, this.f133730a.f133753b.get(abVar));
                this.f133739j = abVar;
            }
        } else if (slotViewModel2 != slotViewModel) {
            m107967h();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12074a(Map<String, Object> map, AbstractC6157ab.AbstractC6159b bVar) {
        this.f133740k.f133744a = (String) map.get("param_live_enter_from_merge");
        this.f133740k.f133745b = (String) map.get("param_live_enter_method_merge");
        this.f133740k.f133746c = (Room) map.get("param_room");
        bVar.mo12045a(true);
    }
}

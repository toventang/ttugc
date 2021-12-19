package com.bytedance.android.live.broadcast.preview;

import android.view.View;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.broadcast.C3184c;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.widget.C3793l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6189w;
import com.bytedance.android.live.slot.C6165ah;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.broadcast.preview.v */
public final class C3561v {

    /* renamed from: a */
    ActivityC0945e f9871a;

    /* renamed from: b */
    C10935a f9872b;

    /* renamed from: c */
    View f9873c;

    /* renamed from: d */
    DataChannel f9874d;

    /* renamed from: e */
    AbstractC3563b f9875e;

    /* renamed from: f */
    public C3562a f9876f;

    /* renamed from: g */
    public C3562a f9877g;

    /* renamed from: com.bytedance.android.live.broadcast.preview.v$b */
    interface AbstractC3563b {
        static {
            Covode.recordClassIndex(4047);
        }

        /* renamed from: a */
        void mo8776a();
    }

    static {
        Covode.recordClassIndex(4045);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.v$a */
    public static class C3562a implements IIconSlot.AbstractC6148a {

        /* renamed from: a */
        ActivityC0945e f9878a;

        /* renamed from: b */
        DataChannel f9879b;

        /* renamed from: c */
        public C3793l f9880c;

        /* renamed from: d */
        public AbstractC6189w f9881d;

        /* renamed from: e */
        IIconSlot.EnumC6150c f9882e;

        /* renamed from: f */
        private C10935a f9883f;

        /* renamed from: g */
        private IIconSlot.SlotViewModel f9884g;

        static {
            Covode.recordClassIndex(4046);
        }

        /* renamed from: a */
        public final Integer mo8826a() {
            C3793l lVar = this.f9880c;
            if (lVar == null) {
                return null;
            }
            return Integer.valueOf(lVar.getId());
        }

        @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
        /* renamed from: a */
        public final void mo8828a(IIconSlot.EnumC6150c cVar) {
            this.f9882e = cVar;
        }

        /* renamed from: a */
        public final void mo8827a(int i) {
            this.f9880c.setIconMarginTop(i);
        }

        /* renamed from: a */
        public final void mo8831a(boolean z) {
            if (this.f9880c != null && this.f9884g != null) {
                if (!z || !Boolean.TRUE.equals(this.f9884g.f15351b.getValue())) {
                    this.f9880c.setVisibility(8);
                } else {
                    this.f9880c.setVisibility(0);
                }
            }
        }

        @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
        /* renamed from: a */
        public final void mo8830a(C6165ah ahVar, IIconSlot.SlotViewModel slotViewModel) {
            mo8829a(ahVar.f15398b, slotViewModel);
        }

        @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
        /* renamed from: a */
        public final void mo8829a(AbstractC6157ab abVar, IIconSlot.SlotViewModel slotViewModel) {
            if (slotViewModel != null) {
                slotViewModel.f15350a.setValue(true);
                this.f9884g = slotViewModel;
                slotViewModel.f15351b.observe(this.f9883f, new C3368aa(this, slotViewModel, abVar));
                slotViewModel.f15357h.observe(this.f9883f, new C3369ab(this, slotViewModel));
                slotViewModel.f15353d.observe(this.f9883f, new C3370ac(this, slotViewModel));
                slotViewModel.f15352c.observe(this.f9883f, new C3371ad(this, slotViewModel));
                slotViewModel.f15354e.observe(this.f9883f, new C3372ae(this, slotViewModel));
                slotViewModel.f15358i.observe(this.f9883f, new C3373af(this, slotViewModel));
                this.f9880c.setOnClickListener(new View$OnClickListenerC3374ag(this, abVar));
                if (this.f9879b.mo28318b(C3802x.class) == EnumC11728i.SCREEN_RECORD) {
                    mo8831a(false);
                }
            }
        }

        public C3562a(ActivityC0945e eVar, C10935a aVar, DataChannel dataChannel, IIconSlot.EnumC6149b bVar, IIconSlot.EnumC6150c cVar) {
            this.f9878a = eVar;
            this.f9883f = aVar;
            this.f9879b = dataChannel;
            AbstractC6189w createIconSlotController = ((ISlotService) C6193a.m13435a(ISlotService.class)).createIconSlotController(this.f9878a, this, bVar, cVar);
            this.f9881d = createIconSlotController;
            createIconSlotController.mo12058a(dataChannel);
            C3793l lVar = new C3793l(this.f9878a);
            this.f9880c = lVar;
            lVar.setId(C0792v.m2735a());
            this.f9880c.setVisibility(8);
        }
    }

    C3561v(DataChannel dataChannel, C10935a aVar, View view, AbstractC3563b bVar) {
        this.f9871a = aVar.getActivity();
        this.f9873c = view;
        this.f9872b = aVar;
        this.f9874d = dataChannel;
        this.f9875e = bVar;
        dataChannel.mo28310a(C3184c.class, (AbstractC89172b) new C3576w(this));
    }
}

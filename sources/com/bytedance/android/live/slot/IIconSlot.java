package com.bytedance.android.live.slot;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.p1587vm.ScopeViewModel;

public interface IIconSlot {

    /* renamed from: com.bytedance.android.live.slot.IIconSlot$a */
    public interface AbstractC6148a {
        static {
            Covode.recordClassIndex(6852);
        }

        /* renamed from: a */
        void mo8828a(EnumC6150c cVar);

        /* renamed from: a */
        void mo8829a(AbstractC6157ab abVar, SlotViewModel slotViewModel);

        /* renamed from: a */
        void mo8830a(C6165ah ahVar, SlotViewModel slotViewModel);
    }

    static {
        Covode.recordClassIndex(6850);
    }

    /* renamed from: a */
    AbstractC6162ae mo12055a();

    /* renamed from: b */
    Animator.AnimatorListener mo12056b();

    /* renamed from: com.bytedance.android.live.slot.IIconSlot$b */
    public enum EnumC6149b {
        SLOT_BROADCAST_PREVIEW_TOOLBAR,
        SLOT_LIVE_ANCHOR_TOOLBAR,
        SLOT_LIVE_WATCHER_TOOLBAR,
        SLOT_LIVE_WATCHER_L2_TOOLBAR,
        SLOT_BROADCAST_PREVIEW_PROMOTE,
        SLOT_BROADCAST_SHARE,
        SLOT_AUDIENCE_SHARE;

        static {
            Covode.recordClassIndex(6853);
        }
    }

    /* renamed from: com.bytedance.android.live.slot.IIconSlot$c */
    public enum EnumC6150c {
        PRIORITY,
        AGGREGATE,
        PREEMPTION,
        FIRST,
        LAST;

        static {
            Covode.recordClassIndex(6854);
        }
    }

    public static class SlotViewModel extends AbstractC1174ac {

        /* renamed from: a */
        public final C1213t<Boolean> f15350a = new C1213t<>();

        /* renamed from: b */
        public final C1213t<Boolean> f15351b = new C1213t<>();

        /* renamed from: c */
        public final C1213t<String> f15352c = new C1213t<>();

        /* renamed from: d */
        public final C1213t<Boolean> f15353d = new C1213t<>();

        /* renamed from: e */
        public final C1213t<Drawable> f15354e = new C1213t<>();

        /* renamed from: f */
        public final C1213t<Drawable> f15355f = new C1213t<>();

        /* renamed from: g */
        public final C1213t<Drawable> f15356g = new C1213t<>();

        /* renamed from: h */
        public final C1213t<Drawable> f15357h = new C1213t<>();

        /* renamed from: i */
        public final C1213t<String> f15358i = new C1213t<>();

        /* renamed from: j */
        public final C1213t<String> f15359j = new C1213t<>();

        /* renamed from: k */
        public final C1213t<String> f15360k = new C1213t<>();

        /* renamed from: l */
        public final C1213t<Boolean> f15361l = new C1213t<>();

        /* renamed from: m */
        public long f15362m = 0;

        /* renamed from: n */
        public String f15363n;

        /* renamed from: o */
        public String f15364o;

        /* renamed from: p */
        public Integer f15365p;

        static {
            Covode.recordClassIndex(6851);
        }

        /* renamed from: b */
        private void m13372b(AbstractC1204m mVar) {
            this.f15350a.removeObservers(mVar);
            this.f15351b.removeObservers(mVar);
            this.f15352c.removeObservers(mVar);
            this.f15353d.removeObservers(mVar);
            this.f15354e.removeObservers(mVar);
            this.f15357h.removeObservers(mVar);
            this.f15358i.removeObservers(mVar);
            this.f15359j.removeObservers(mVar);
            this.f15360k.removeObservers(mVar);
            this.f15356g.removeObservers(mVar);
            this.f15361l.removeObservers(mVar);
        }

        /* renamed from: a */
        public final void mo12057a(AbstractC1204m mVar) {
            m13372b(mVar);
            this.f15362m = 0;
            this.f15364o = null;
            this.f15363n = null;
            this.f15351b.setValue(false);
            this.f15352c.setValue(null);
            this.f15353d.setValue(false);
            this.f15354e.setValue(null);
            this.f15357h.setValue(null);
            this.f15358i.setValue(null);
            this.f15359j.setValue(null);
            this.f15360k.setValue(null);
            this.f15361l.setValue(false);
            this.f15356g.setValue(null);
            this.f15350a.setValue(false);
        }

        /* renamed from: a */
        public static SlotViewModel m13371a(AbstractC6157ab abVar, ActivityC0945e eVar) {
            AbstractC1174ac a;
            C1175ad a2 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
            String str = abVar.mo12078e().name() + abVar.hashCode();
            if (SlotViewModel.class.equals(ScopeViewModel.class)) {
                a = a2.mo3984a(str, SlotViewModel.class);
            } else {
                a = a2.mo3984a(str, SlotViewModel.class);
                C1171ab.m3870a(a, a2);
            }
            return (SlotViewModel) a;
        }
    }
}

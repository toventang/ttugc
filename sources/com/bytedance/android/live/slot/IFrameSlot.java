package com.bytedance.android.live.slot;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;

public interface IFrameSlot {

    /* renamed from: com.bytedance.android.live.slot.IFrameSlot$a */
    public interface AbstractC6145a {
        static {
            Covode.recordClassIndex(6847);
        }

        /* renamed from: a */
        void mo12018a(EnumC6147c cVar);

        /* renamed from: a */
        void mo12019a(C6165ah ahVar, SlotViewModel slotViewModel);
    }

    static {
        Covode.recordClassIndex(6845);
    }

    /* renamed from: a */
    View mo12051a(Context context);

    /* renamed from: a */
    Animation mo12052a();

    /* renamed from: b */
    Animation mo12053b();

    /* renamed from: com.bytedance.android.live.slot.IFrameSlot$b */
    public enum EnumC6146b {
        SLOT_LIVE_BOTTOM_POP,
        SLOT_LIVE_WATCHER_L2_POP,
        SLOT_LIVE_WATCHER_L3_POP;

        static {
            Covode.recordClassIndex(6848);
        }
    }

    /* renamed from: com.bytedance.android.live.slot.IFrameSlot$c */
    public enum EnumC6147c {
        PRIORITY,
        AGGREGATE,
        PREEMPTION,
        FIRST,
        LAST;

        static {
            Covode.recordClassIndex(6849);
        }
    }

    public static class SlotViewModel extends AbstractC1174ac {

        /* renamed from: a */
        public final C1213t<Pair<Boolean, String>> f15346a = new C1213t<>();

        /* renamed from: b */
        public final C1213t<Boolean> f15347b = new C1213t<>();

        static {
            Covode.recordClassIndex(6846);
        }

        /* renamed from: a */
        public final void mo12054a(AbstractC1204m mVar) {
            this.f15346a.removeObservers(mVar);
            this.f15347b.removeObservers(mVar);
            this.f15346a.setValue(new Pair<>(false, "visibility_reason_dispose"));
            this.f15347b.setValue(null);
        }
    }
}

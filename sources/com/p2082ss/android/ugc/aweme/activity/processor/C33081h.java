package com.p2082ss.android.ugc.aweme.activity.processor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.AbstractC17350d;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.uikit.p1279a.C18236d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.h */
public final class C33081h extends AbstractC17350d {

    /* renamed from: d */
    public static final C33082a f78641d = new C33082a((byte) 0);

    /* renamed from: h */
    private static int f78642h;

    /* renamed from: e */
    private String f78643e;

    /* renamed from: f */
    private BroadcastReceiver f78644f;

    /* renamed from: g */
    private int f78645g;

    static {
        Covode.recordClassIndex(39893);
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.h$a */
    public static final class C33082a {
        static {
            Covode.recordClassIndex(39894);
        }

        private C33082a() {
        }

        public /* synthetic */ C33082a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: c */
    public final void mo27660c(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27660c(aVar);
        this.f78645g++;
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: e */
    public final void mo27664e(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27664e(aVar);
        this.f78645g--;
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: p */
    public final void mo27675p(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27675p(aVar);
        C17873f.m33093a(aVar);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27650a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.mo27650a(bundle);
        if (bundle.containsKey("abs_Activity_Key")) {
            this.f78643e = bundle.getString("abs_Activity_Key");
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: b */
    public final void mo27657b(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27657b(aVar);
        C18236d.AbstractC18237a a = C18236d.m33937a();
        if (a != null) {
            a.mo29098b(aVar);
        }
        C17873f.m33093a(null);
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17350d, com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: d */
    public final void mo27662d(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27662d(aVar);
        BroadcastReceiver broadcastReceiver = this.f78644f;
        if (broadcastReceiver != null) {
            C0998a.m3454a(aVar).mo3692a(broadcastReceiver);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: f */
    public final void mo27665f(ActivityC17312a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo27665f(aVar);
        C18236d.AbstractC18237a a = C18236d.m33937a();
        if (a != null) {
            a.mo29097a(aVar);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27651a(ActivityC17312a aVar) {
        FrameLayout frameLayout;
        T t;
        MethodCollector.m26663i(270);
        C89219l.m154721d(aVar, "");
        super.mo27651a(aVar);
        Iterator<T> it = mo27704b().mo27699b().iterator();
        while (true) {
            frameLayout = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t instanceof C33104y) {
                break;
            }
        }
        if (!(t instanceof C33104y)) {
            t = null;
        }
        T t2 = t;
        if (t2 == null || !t2.f78677b) {
            View findViewById = aVar.findViewById(R.id.c0);
            if (findViewById == null) {
                MethodCollector.m26664o(270);
                return;
            }
            ViewParent parent = findViewById.getParent();
            if (!(parent instanceof FrameLayout)) {
                parent = null;
            }
            FrameLayout frameLayout2 = (FrameLayout) parent;
            if (frameLayout2 != null) {
                View findViewById2 = aVar.findViewById(16908290);
                if (findViewById2 instanceof FrameLayout) {
                    frameLayout = findViewById2;
                }
                FrameLayout frameLayout3 = frameLayout;
                if (frameLayout3 == null || frameLayout3.getChildCount() != 1) {
                    MethodCollector.m26664o(270);
                    return;
                }
                View childAt = frameLayout3.getChildAt(0);
                frameLayout3.removeAllViews();
                frameLayout2.addView(childAt);
                findViewById2.setId(-1);
                frameLayout2.setId(16908290);
                MethodCollector.m26664o(270);
                return;
            }
            MethodCollector.m26664o(270);
            return;
        }
        MethodCollector.m26664o(270);
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.h$b */
    public static final class C33083b extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C33081h f78646a;

        /* renamed from: b */
        final /* synthetic */ ActivityC17312a f78647b;

        static {
            Covode.recordClassIndex(39895);
        }

        C33083b(C33081h hVar, ActivityC17312a aVar) {
            this.f78646a = hVar;
            this.f78647b = aVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if (!this.f78647b.isFinishing()) {
                this.f78646a.mo27646a();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: a */
    public final void mo27653a(ActivityC17312a aVar, Bundle bundle) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bundle, "");
        super.mo27653a(aVar, bundle);
        bundle.putString("abs_Activity_Key", this.f78643e);
        bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.bytedance.ies.foundation.activity.AbstractC17350d, com.bytedance.ies.foundation.activity.AbstractC17315b, com.bytedance.ies.foundation.base.AbstractC17368c
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27658b(com.bytedance.ies.foundation.activity.ActivityC17312a r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.activity.processor.C33081h.mo27658b(com.bytedance.ies.foundation.activity.a, android.os.Bundle):void");
    }
}

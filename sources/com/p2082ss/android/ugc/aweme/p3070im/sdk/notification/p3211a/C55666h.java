package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.AbstractView$OnClickListenerC54682a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.fragment.SessionListFragment;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.utils.C80320cy;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.h */
public final class C55666h {

    /* renamed from: a */
    int f126960a;

    /* renamed from: b */
    private final Map<String, Integer> f126961b;

    /* renamed from: c */
    private final AbstractC55665g f126962c;

    static {
        Covode.recordClassIndex(65449);
    }

    /* renamed from: a */
    public final boolean mo92554a() {
        if (this.f126960a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final int m101426b() {
        if (C56297a.m102303e()) {
            return 2;
        }
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        if (!a.mo92214k() || m101425a(C55075a.m100721a()) || this.f126961b.containsValue(2)) {
            return 2;
        }
        AbstractC56220e b = C55076b.m100723b();
        if (b == null || !b.canShowInnerNotification() || this.f126961b.containsValue(1)) {
            return 1;
        }
        return 0;
    }

    public C55666h(AbstractC55665g gVar) {
        C89219l.m154721d(gVar, "");
        this.f126962c = gVar;
        this.f126961b = new LinkedHashMap();
        this.f126960a = 2;
        this.f126960a = m101426b();
    }

    /* renamed from: a */
    private static boolean m101425a(Activity activity) {
        Fragment fragment;
        if ((activity instanceof ActivityC54429b) || (activity instanceof AbstractView$OnClickListenerC54682a) || (activity instanceof GroupChatDetailActivity)) {
            return true;
        }
        if (activity != null) {
            fragment = C80320cy.m139242a(activity);
        } else {
            fragment = null;
        }
        if (fragment instanceof SessionListFragment) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo92553a(String str, int i) {
        C89219l.m154721d(str, "");
        if (i == 0) {
            this.f126961b.remove(str);
        } else {
            this.f126961b.put(str, Integer.valueOf(i));
        }
        int b = m101426b();
        if (this.f126960a != b) {
            this.f126960a = b;
            this.f126962c.mo92541a(b);
        }
    }
}

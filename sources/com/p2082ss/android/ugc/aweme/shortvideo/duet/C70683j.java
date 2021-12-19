package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.p2730de.C40980o;
import com.p2082ss.android.ugc.aweme.p2730de.C40981p;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63202az;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.j */
public final class C70683j {

    /* renamed from: a */
    static C40981p f158213a;

    /* renamed from: b */
    public static final C70683j f158214b = new C70683j();

    private C70683j() {
    }

    /* renamed from: a */
    public static void m124919a() {
        f158213a.mo70164c("duet_layout_up_down_drag_gesture_hint");
    }

    /* renamed from: b */
    public static void m124921b() {
        f158213a.mo70164c("duet_layout_three_screen_drag_gesture_hint");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.j$a */
    static final class RunnableC70684a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f158215a;

        /* renamed from: b */
        final /* synthetic */ AbstractC23317a f158216b;

        /* renamed from: c */
        final /* synthetic */ int f158217c;

        static {
            Covode.recordClassIndex(83155);
        }

        RunnableC70684a(Activity activity, AbstractC23317a aVar, int i) {
            this.f158215a = activity;
            this.f158216b = aVar;
            this.f158217c = i;
        }

        public final void run() {
            if (!this.f158215a.isFinishing()) {
                this.f158216b.mo38001a();
                C70683j.f158213a.mo70162a("duet_layout_tool_bar_bubble_hint", this.f158217c + 1);
            }
        }
    }

    static {
        Covode.recordClassIndex(83154);
        Application application = C63238c.f143574a;
        AbstractC63202az azVar = C63238c.f143586m;
        C89219l.m154716b(azVar, "");
        f158213a = C40980o.m82513a(application, azVar.mo93851a());
    }

    /* renamed from: a */
    public static void m124920a(View view, Activity activity) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(activity, "");
        int a = f158213a.mo70159a("duet_layout_tool_bar_bubble_hint");
        if (a < 3 && view.getParent() != null && !activity.isFinishing()) {
            view.postDelayed(new RunnableC70684a(activity, ((C23329a) new C23329a(activity).mo38041b(view)).mo38023e(R.string.bec).mo38030a(5000L).mo38034a(EnumC23352h.START).mo38012d(), a), 500);
        }
    }
}

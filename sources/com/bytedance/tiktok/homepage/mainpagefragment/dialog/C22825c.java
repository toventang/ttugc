package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39235f;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49676d;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.AbstractC53316a;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61538b;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61964b;
import com.p2082ss.android.ugc.aweme.notification.view.C62295f;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c */
public final class C22825c implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C62295f f53901a;

    /* renamed from: b */
    public AbstractC39235f f53902b;

    /* renamed from: c */
    public TabChangeManager f53903c;

    /* renamed from: d */
    public AbstractC18234b f53904d;

    /* renamed from: e */
    public AbstractC22824b f53905e;

    /* renamed from: f */
    public View f53906f;

    /* renamed from: g */
    public ScrollSwitchStateManager f53907g;

    /* renamed from: h */
    public DrawerViewModel f53908h;

    /* renamed from: i */
    public boolean f53909i;

    /* renamed from: j */
    public boolean f53910j;

    /* renamed from: k */
    public int f53911k;

    /* renamed from: l */
    public boolean f53912l;

    /* renamed from: m */
    public boolean f53913m;

    /* renamed from: n */
    public boolean f53914n;

    /* renamed from: o */
    public boolean f53915o;

    /* renamed from: p */
    private AbstractC56223a f53916p;

    /* renamed from: q */
    private final AbstractC89244h f53917q = C89250i.m154773a((AbstractC89171a) C22829d.f53921a);

    static {
        Covode.recordClassIndex(26723);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(231, new RunnableC90250g(C22825c.class, "onCommentDialogEvent", C49676d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c$e */
    public static final class RunnableC22830e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22825c f53922a;

        static {
            Covode.recordClassIndex(26728);
        }

        RunnableC22830e(C22825c cVar) {
            this.f53922a = cVar;
        }

        public final void run() {
            this.f53922a.mo37148b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c$b */
    public static final class C22827b implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C22825c f53919a;

        static {
            Covode.recordClassIndex(26725);
        }

        C22827b(C22825c cVar) {
            this.f53919a = cVar;
        }

        public final void onDismiss() {
            this.f53919a.f53910j = false;
            C22825c.m43050a(this.f53919a).mo37144b();
        }
    }

    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c$d */
    static final class C22829d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C22829d f53921a = new C22829d();

        static {
            Covode.recordClassIndex(26727);
        }

        C22829d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c$c */
    public static final class RunnableC22828c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C22825c f53920a;

        static {
            Covode.recordClassIndex(26726);
        }

        RunnableC22828c(C22825c cVar) {
            this.f53920a = cVar;
        }

        public final void run() {
            this.f53920a.f53910j = false;
            if (C61538b.m111451b()) {
                C22825c.m43050a(this.f53920a).mo37145c();
            } else {
                C22825c.m43050a(this.f53920a).mo37144b();
            }
        }
    }

    /* renamed from: a */
    public final void mo37147a() {
        C62295f fVar;
        if (this.f53910j && (fVar = this.f53901a) != null) {
            fVar.mo100288a();
        }
    }

    /* renamed from: c */
    public final void mo37149c() {
        this.f53910j = true;
        View view = this.f53906f;
        if (view == null) {
            C89219l.m154710a("mAnchorView");
        }
        Context context = view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        View b = HomeTabViewModel.C53309a.m98315a((ActivityC0945e) context).mo89739b("NOTIFICATION");
        if (b == null) {
            C89219l.m154715b();
        }
        AbstractC53316a aVar = (AbstractC53316a) b;
        C62295f fVar = this.f53901a;
        if (fVar == null) {
            C89219l.m154715b();
        }
        boolean a = fVar.mo100289a(aVar);
        this.f53909i = a;
        if (a) {
            this.f53915o = false;
        }
        if (!C61538b.m111451b()) {
            AbstractC22824b bVar = this.f53905e;
            if (bVar == null) {
                C89219l.m154710a("mNotificationCallback");
            }
            bVar.mo37146d();
        } else if (this.f53909i) {
            AbstractC22824b bVar2 = this.f53905e;
            if (bVar2 == null) {
                C89219l.m154710a("mNotificationCallback");
            }
            bVar2.mo37146d();
        }
        C61964b.m112089a("MainPageFragment", "UnReadCountMonitor isShowNotifyPop: " + this.f53909i);
    }

    /* renamed from: d */
    public final void mo37150d() {
        View contentView;
        AbstractC18234b bVar = this.f53904d;
        if (bVar == null) {
            C89219l.m154710a("mFragment");
        }
        ActivityC0945e activity = bVar.getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
        C62295f fVar = new C62295f(activity);
        this.f53901a = fVar;
        fVar.setOutsideTouchable(true);
        C62295f fVar2 = this.f53901a;
        if (!(fVar2 == null || (contentView = fVar2.getContentView()) == null)) {
            contentView.setOnClickListener(new View$OnClickListenerC22826a(this));
        }
        C62295f fVar3 = this.f53901a;
        if (fVar3 != null) {
            fVar3.setOnDismissListener(new C22827b(this));
        }
        C62295f fVar4 = this.f53901a;
        if (fVar4 != null) {
            fVar4.f134414a = new RunnableC22828c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r0.getToastVisibility() != 0) goto L_0x0094;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37148b() {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.C22825c.mo37148b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.dialog.c$a */
    public static final class View$OnClickListenerC22826a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22825c f53918a;

        static {
            Covode.recordClassIndex(26724);
        }

        View$OnClickListenerC22826a(C22825c cVar) {
            this.f53918a = cVar;
        }

        public final void onClick(View view) {
            C22825c.m43050a(this.f53918a).mo37143a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC22824b m43050a(C22825c cVar) {
        AbstractC22824b bVar = cVar.f53905e;
        if (bVar == null) {
            C89219l.m154710a("mNotificationCallback");
        }
        return bVar;
    }

    @AbstractC90264r
    public final void onCommentDialogEvent(C49676d dVar) {
        C89219l.m154721d(dVar, "");
        this.f53911k = dVar.f114332a;
    }

    public C22825c(AbstractC56223a aVar) {
        C89219l.m154721d(aVar, "");
        this.f53916p = aVar;
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f53914n = false;
    }
}

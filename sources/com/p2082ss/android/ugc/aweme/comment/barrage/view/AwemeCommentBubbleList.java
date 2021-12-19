package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.comment.barrage.cell.ReactionBubbleDescriptionCell;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36306a;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2487b.C36307b;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.p3538o.C62690a;
import com.p2082ss.android.ugc.aweme.p3538o.C62692b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList */
public final class AwemeCommentBubbleList extends PowerList implements AbstractC90252i, AbstractC90253j {

    /* renamed from: U */
    public static final C36353a f85961U = new C36353a((byte) 0);

    /* renamed from: P */
    final View f85962P;

    /* renamed from: Q */
    public boolean f85963Q;

    /* renamed from: R */
    boolean f85964R;

    /* renamed from: S */
    public int f85965S;

    /* renamed from: T */
    public boolean f85966T;

    /* renamed from: V */
    private AbstractC88412b f85967V;

    /* renamed from: W */
    private AbstractC36318a f85968W;

    /* renamed from: aa */
    private C36296a f85969aa;

    /* renamed from: ab */
    private boolean f85970ab;

    /* renamed from: ac */
    private int f85971ac;

    static {
        Covode.recordClassIndex(43637);
    }

    public AwemeCommentBubbleList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean canScrollVertically(int i) {
        return false;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(303, new RunnableC90250g(AwemeCommentBubbleList.class, "onDiggEvent", C62692b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(304, new RunnableC90250g(AwemeCommentBubbleList.class, "onBlockUser", C63494a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(305, new RunnableC90250g(AwemeCommentBubbleList.class, "onCommentEvent", C62690a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList$a */
    public static final class C36353a {
        static {
            Covode.recordClassIndex(43639);
        }

        private C36353a() {
        }

        public /* synthetic */ C36353a(byte b) {
            this();
        }
    }

    public final AbstractC36318a getBubbleListManager() {
        return this.f85968W;
    }

    public final boolean getForbidAppendItem() {
        return this.f85970ab;
    }

    public final C36296a getMMobEventParam() {
        return this.f85969aa;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList$b */
    static final class RunnableC36354b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AwemeCommentBubbleList f85973a;

        static {
            Covode.recordClassIndex(43640);
        }

        RunnableC36354b(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f85973a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f85973a.mo27122r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList$e */
    static final class RunnableC36357e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AwemeCommentBubbleList f85976a;

        static {
            Covode.recordClassIndex(43643);
        }

        RunnableC36357e(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f85976a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f85976a.mo27122r();
        }
    }

    public final int getFirstDataPositionInState() {
        if (this.f85964R) {
            return 1;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList$c */
    static final class RunnableC36355c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AwemeCommentBubbleList f85974a;

        static {
            Covode.recordClassIndex(43641);
        }

        RunnableC36355c(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f85974a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f85974a.mo27122r();
            this.f85974a.f85966T = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList$d */
    static final class RunnableC36356d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AwemeCommentBubbleList f85975a;

        static {
            Covode.recordClassIndex(43642);
        }

        RunnableC36356d(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f85975a = awemeCommentBubbleList;
        }

        public final void run() {
            this.f85975a.mo4413b(0);
            AwemeCommentBubbleList awemeCommentBubbleList = this.f85975a;
            awemeCommentBubbleList.f85965S = awemeCommentBubbleList.getFirstDataPositionInState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC88412b bVar = this.f85967V;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f85967V = null;
    }

    /* renamed from: s */
    public final void mo63602s() {
        C37199i.m75173a("ReactionBubbleList", "dz[stopAutoScroll]");
        AbstractC88412b bVar = this.f85967V;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: q */
    public final void mo5599q() {
        this.f85971ac = -1;
        this.f85965S = getFirstDataPositionInState();
        this.f85970ab = true;
        this.f85966T = false;
        setVisibility(4);
        mo63602s();
        mo4413b(0);
        getState().mo28128a();
    }

    /* renamed from: r */
    public final void mo27122r() {
        C37199i.m75173a("ReactionBubbleList", "dz[startAutoScroll]");
        this.f85970ab = false;
        AbstractC88412b bVar = this.f85967V;
        if (bVar == null || bVar.isDisposed()) {
            setVisibility(0);
            this.f85967V = AbstractC88924h.m154137a(TimeUnit.MILLISECONDS).mo143203b().mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143202b(new C36358f(this));
        }
    }

    public final void setBubbleListManager(AbstractC36318a aVar) {
        this.f85968W = aVar;
    }

    public final void setForbidAppendItem(boolean z) {
        this.f85970ab = z;
    }

    public final void setMMobEventParam(C36296a aVar) {
        this.f85969aa = aVar;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onBlockUser(C63494a aVar) {
        AbstractC36318a aVar2 = this.f85968W;
        if (aVar2 != null) {
            aVar2.mo63567c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList$f */
    public static final class C36358f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AwemeCommentBubbleList f85977a;

        static {
            Covode.recordClassIndex(43644);
        }

        C36358f(AwemeCommentBubbleList awemeCommentBubbleList) {
            this.f85977a = awemeCommentBubbleList;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (!this.f85977a.f85966T) {
                AwemeCommentBubbleList awemeCommentBubbleList = this.f85977a;
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                awemeCommentBubbleList.mo4395a(0, C89241a.m154730a(TypedValue.applyDimension(1, 6.0f, system.getDisplayMetrics())));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C89219l.m154721d(motionEvent, "");
        if (getScrollState() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 0 || !z) {
            return onInterceptTouchEvent;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCommentEvent(C62690a aVar) {
        C89219l.m154721d(aVar, "");
        Comment comment = aVar.f142127b;
        int i = aVar.f142126a;
        if (i == 1) {
            C89219l.m154721d(comment, "");
            C37199i.m75173a("ReactionBubbleList", "from outside comment");
            if (this.f85968W != null) {
                setVisibility(0);
                mo63602s();
                if (this.f85965S == 0 || (getState().mo28135b(this.f85965S - 1) instanceof C36306a) || (getState().mo28135b(this.f85965S - 1) instanceof C36307b)) {
                    getState().mo28130a(this.f85965S, C36378a.m74089a(comment, this.f85969aa));
                } else {
                    getState().mo28130a(getFirstDataPositionInState(), C36378a.m74089a(comment, this.f85969aa));
                }
                postDelayed(new RunnableC36354b(this), 80);
            }
        } else if (i == 2) {
            C89219l.m154721d(comment, "");
            String fakeId = comment.getFakeId();
            C89219l.m154716b(fakeId, "");
            if (!TextUtils.isEmpty(fakeId)) {
                int i2 = 0;
                for (AbstractC17641a aVar2 : getState().mo28140c()) {
                    if (!(aVar2 instanceof C36306a) || !C89219l.m154714a((Object) ((C36306a) aVar2).f85823a.getFakeId(), (Object) fakeId)) {
                        i2++;
                    } else if (i2 >= 0) {
                        AbstractC17641a b = getState().mo28135b(i2);
                        if (b instanceof C36306a) {
                            getState().mo28136b(i2, new C36306a(comment, ((C36306a) b).f85824b, this.f85969aa));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        } else if (i == 3) {
            C89219l.m154721d(comment, "");
            C37199i.m75173a("ReactionBubbleList", "onCommentDeleted");
            AbstractC36318a aVar3 = this.f85968W;
            if (aVar3 != null) {
                aVar3.mo63567c();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDiggEvent(C62692b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar.f142129a == 1) {
            C37199i.m75173a("ReactionBubbleList", "diggSuccess");
            if (!this.f85970ab && !this.f85966T && getState() != null && getState().mo28134b() != 0) {
                C37199i.m75173a("ReactionBubbleList", "[diggSuccess size is: " + getState().mo28134b() + ", insert position: " + this.f85965S + ']');
                setVisibility(0);
                this.f85966T = true;
                mo63602s();
                this.f85971ac = this.f85965S;
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                getState().mo28130a(this.f85971ac, C36378a.m74090a(curUser, this.f85969aa));
                C37199i.m75173a("ReactionBubbleList", "[diggSuccess finish insert and state size is: " + getState().mo28134b() + ']');
                postDelayed(new RunnableC36355c(this), 40);
            }
        }
    }

    private /* synthetic */ AwemeCommentBubbleList(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AwemeCommentBubbleList(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        EventBus.m156966a(EventBus.m156962a(), this);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        mo4402a(new C51453d(0, C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())), 1));
        setHasFixedSize(true);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.ji, this, false);
        C89219l.m154716b(a, "");
        this.f85962P = a;
        a.setTag(2);
        mo28088i(a);
        View a2 = C1764a.m5927a(LayoutInflater.from(context), R.layout.ji, this, false);
        mo28089j(a2);
        C89219l.m154716b(a2, "");
        a2.setTag(2);
        setItemAnimator(null);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList.ViewTreeObserver$OnGlobalLayoutListenerC363521 */

            /* renamed from: a */
            final /* synthetic */ AwemeCommentBubbleList f85972a;

            static {
                Covode.recordClassIndex(43638);
            }

            {
                this.f85972a = r1;
            }

            public final void onGlobalLayout() {
                View view;
                View view2;
                int i = 0;
                RecyclerView.ViewHolder a = this.f85972a.mo4392a(0, false);
                RecyclerView.ViewHolder a2 = this.f85972a.mo4392a(1, false);
                AwemeCommentBubbleList awemeCommentBubbleList = this.f85972a;
                if (a != null && a2 != null && (a2 instanceof ReactionBubbleDescriptionCell) && !awemeCommentBubbleList.f85963Q && (view = a.itemView) != null) {
                    C89219l.m154716b(view, "");
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    int a3 = C89241a.m154730a(TypedValue.applyDimension(1, 256.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    int a4 = a3 - C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
                    if (!(a2 == null || (view2 = a2.itemView) == null)) {
                        i = view2.getMeasuredHeight();
                    }
                    int i2 = a4 - i;
                    if (i2 >= 0) {
                        layoutParams.height = i2;
                        view.setLayoutParams(layoutParams);
                    }
                }
            }
        });
        this.f85970ab = true;
        this.f85971ac = -1;
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        int b = getState().mo28134b();
        if (b >= 0) {
            int i5 = 0;
            while (true) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    float top = (float) childAt.getTop();
                    if (top <= 0.0f) {
                        childAt.setVisibility(4);
                        if (C89219l.m154714a(childAt.getTag(), (Object) 1)) {
                            childAt.setTag(0);
                        }
                    } else {
                        Resources system = Resources.getSystem();
                        C89219l.m154709a((Object) system, "");
                        int i6 = -1;
                        if (top <= ((float) C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())))) {
                            childAt.setVisibility(0);
                            Resources system2 = Resources.getSystem();
                            C89219l.m154709a((Object) system2, "");
                            childAt.setAlpha(top / ((float) C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()))));
                            if (getLayoutManager() != null) {
                                i6 = RecyclerView.AbstractC1362i.m4426e(childAt);
                            }
                            if (i6 == getState().mo28134b()) {
                                getState().mo28140c().size();
                                this.f85970ab = true;
                                mo63602s();
                                postDelayed(new RunnableC36356d(this), 40);
                                postDelayed(new RunnableC36357e(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                            }
                        } else {
                            Resources system3 = Resources.getSystem();
                            C89219l.m154709a((Object) system3, "");
                            if (top <= ((float) C89241a.m154730a(TypedValue.applyDimension(1, 188.0f, system3.getDisplayMetrics())))) {
                                childAt.setVisibility(0);
                                childAt.setAlpha(1.0f);
                            } else {
                                Resources system4 = Resources.getSystem();
                                C89219l.m154709a((Object) system4, "");
                                if (top <= ((float) C89241a.m154730a(TypedValue.applyDimension(1, 208.0f, system4.getDisplayMetrics())))) {
                                    childAt.setVisibility(0);
                                    if (C89219l.m154714a(childAt.getTag(), (Object) 1) || C89219l.m154714a(childAt.getTag(), (Object) 2)) {
                                        childAt.setAlpha(1.0f);
                                    } else {
                                        Resources system5 = Resources.getSystem();
                                        C89219l.m154709a((Object) system5, "");
                                        Resources system6 = Resources.getSystem();
                                        C89219l.m154709a((Object) system6, "");
                                        childAt.setAlpha((((float) C89241a.m154730a(TypedValue.applyDimension(1, 208.0f, system5.getDisplayMetrics()))) - top) / ((float) C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system6.getDisplayMetrics()))));
                                    }
                                    if (getLayoutManager() != null) {
                                        i6 = RecyclerView.AbstractC1362i.m4426e(childAt);
                                    }
                                    if (i6 >= getFirstDataPositionInState() + 1) {
                                        this.f85965S = i6;
                                        if (i6 > getState().mo28134b()) {
                                            this.f85965S = getState().mo28134b();
                                        }
                                    }
                                } else {
                                    childAt.setVisibility(4);
                                    childAt.setAlpha(0.0f);
                                    return;
                                }
                            }
                        }
                    }
                }
                if (i5 != b) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }
}

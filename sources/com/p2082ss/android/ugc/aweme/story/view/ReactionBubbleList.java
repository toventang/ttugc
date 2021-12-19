package com.p2082ss.android.ugc.aweme.story.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51453d;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77295a;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77296b;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77301f;
import com.p2082ss.android.ugc.aweme.story.interaction.p4057b.C77302g;
import com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList */
public final class ReactionBubbleList extends PowerList implements AbstractC77713a {

    /* renamed from: S */
    public static final C77701a f174267S = new C77701a((byte) 0);

    /* renamed from: P */
    public int f174268P;

    /* renamed from: Q */
    public int f174269Q;

    /* renamed from: R */
    public boolean f174270R;

    /* renamed from: T */
    private AbstractC88412b f174271T;

    /* renamed from: U */
    private AbstractC77307a f174272U;

    /* renamed from: V */
    private final View f174273V;

    /* renamed from: W */
    private C77302g f174274W;

    /* renamed from: aa */
    private boolean f174275aa;

    /* renamed from: ab */
    private boolean f174276ab;

    static {
        Covode.recordClassIndex(90749);
    }

    public ReactionBubbleList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean canScrollVertically(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList$a */
    public static final class C77701a {
        static {
            Covode.recordClassIndex(90750);
        }

        private C77701a() {
        }

        public /* synthetic */ C77701a(byte b) {
            this();
        }
    }

    public final AbstractC77307a getBubbleListManager() {
        return this.f174272U;
    }

    public final boolean getForbidAppendItem() {
        return this.f174275aa;
    }

    public final C77302g getMobEventParam() {
        return this.f174274W;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList$c */
    static final class RunnableC77703c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleList f174278a;

        static {
            Covode.recordClassIndex(90752);
        }

        RunnableC77703c(ReactionBubbleList reactionBubbleList) {
            this.f174278a = reactionBubbleList;
        }

        public final void run() {
            this.f174278a.mo27122r();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList$f */
    static final class RunnableC77706f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleList f174281a;

        static {
            Covode.recordClassIndex(90755);
        }

        RunnableC77706f(ReactionBubbleList reactionBubbleList) {
            this.f174281a = reactionBubbleList;
        }

        public final void run() {
            this.f174281a.mo27122r();
        }
    }

    /* renamed from: s */
    private void m135723s() {
        AbstractC88412b bVar = this.f174271T;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final int getFirstDataPositionInState() {
        if (this.f174276ab) {
            return 1;
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList$b */
    static final class RunnableC77702b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleList f174277a;

        static {
            Covode.recordClassIndex(90751);
        }

        RunnableC77702b(ReactionBubbleList reactionBubbleList) {
            this.f174277a = reactionBubbleList;
        }

        public final void run() {
            ReactionBubbleList reactionBubbleList = this.f174277a;
            reactionBubbleList.mo4435d(reactionBubbleList.f174269Q + 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList$d */
    static final class RunnableC77704d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleList f174279a;

        static {
            Covode.recordClassIndex(90753);
        }

        RunnableC77704d(ReactionBubbleList reactionBubbleList) {
            this.f174279a = reactionBubbleList;
        }

        public final void run() {
            ReactionBubbleList reactionBubbleList = this.f174279a;
            reactionBubbleList.mo4435d(reactionBubbleList.f174269Q + 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList$e */
    static final class RunnableC77705e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleList f174280a;

        static {
            Covode.recordClassIndex(90754);
        }

        RunnableC77705e(ReactionBubbleList reactionBubbleList) {
            this.f174280a = reactionBubbleList;
        }

        public final void run() {
            this.f174280a.mo4413b(0);
            ReactionBubbleList reactionBubbleList = this.f174280a;
            reactionBubbleList.f174268P = reactionBubbleList.getFirstDataPositionInState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC88412b bVar = this.f174271T;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f174271T = null;
    }

    /* renamed from: q */
    public final void mo5599q() {
        this.f174269Q = -1;
        this.f174268P = getFirstDataPositionInState();
        this.f174275aa = true;
        this.f174270R = false;
        setVisibility(4);
        m135723s();
        mo4413b(0);
        getState().mo28128a();
    }

    /* renamed from: r */
    public final void mo27122r() {
        this.f174275aa = false;
        AbstractC88412b bVar = this.f174271T;
        if (bVar == null || bVar.isDisposed()) {
            setVisibility(0);
            this.f174271T = AbstractC88924h.m154137a(TimeUnit.MILLISECONDS).mo143203b().mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143202b(new C77707g(this));
        }
    }

    public final void setBubbleListManager(AbstractC77307a aVar) {
        this.f174272U = aVar;
    }

    public final void setForbidAppendItem(boolean z) {
        this.f174275aa = z;
    }

    public final void setMobEventParam(C77302g gVar) {
        this.f174274W = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a
    /* renamed from: d */
    public final void mo121208d(Comment comment) {
        C89219l.m154721d(comment, "");
        AbstractC77307a aVar = this.f174272U;
        if (aVar != null) {
            aVar.f173438c.mo5599q();
            aVar.f173437b.f42330c.mo28163e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.view.ReactionBubbleList$g */
    public static final class C77707g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ReactionBubbleList f174282a;

        static {
            Covode.recordClassIndex(90756);
        }

        C77707g(ReactionBubbleList reactionBubbleList) {
            this.f174282a = reactionBubbleList;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (!this.f174282a.f174270R) {
                ReactionBubbleList reactionBubbleList = this.f174282a;
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                reactionBubbleList.mo4395a(0, C89241a.m154730a(TypedValue.applyDimension(1, 6.0f, system.getDisplayMetrics())));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a
    /* renamed from: b */
    public final boolean mo121205b(Comment comment) {
        C89219l.m154721d(comment, "");
        if (!this.f174270R) {
            return false;
        }
        AbstractC17641a b = getState().mo28135b(this.f174269Q);
        Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.interaction.item.ReactionBubbleCommentItem");
        if (!((C77295a) b).f173409b) {
            this.f174270R = false;
            return false;
        }
        getState().mo28136b(this.f174269Q, new C77295a(comment, true, this.f174274W));
        mo27122r();
        this.f174269Q = -1;
        this.f174270R = false;
        return true;
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

    @Override // com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a
    /* renamed from: a */
    public final boolean mo121202a(Comment comment) {
        C89219l.m154721d(comment, "");
        AbstractC77307a aVar = this.f174272U;
        if (aVar == null || !aVar.mo120908a()) {
            return false;
        }
        setVisibility(0);
        m135723s();
        if (this.f174268P == 0 || (getState().mo28135b(this.f174268P - 1) instanceof C77295a) || (getState().mo28135b(this.f174268P - 1) instanceof C77301f)) {
            getState().mo28130a(this.f174268P, C77296b.m135158a(comment, this.f174274W));
        } else {
            getState().mo28130a(getFirstDataPositionInState(), C77296b.m135158a(comment, this.f174274W));
        }
        postDelayed(new RunnableC77703c(this), 80);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a
    /* renamed from: b */
    public final void mo121204b(String str) {
        C89219l.m154721d(str, "");
        if (this.f174270R && getState() != null && getState().mo28134b() != 0) {
            AbstractC17641a b = getState().mo28135b(this.f174269Q);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.interaction.item.ReactionBubbleCommentItem");
            C77295a aVar = (C77295a) b;
            if (!aVar.f173409b) {
                this.f174270R = false;
                return;
            }
            Comment comment = new Comment();
            comment.setUser(aVar.f173408a.getUser());
            comment.setText(aVar.f173408a.getText() + str);
            getState().mo28136b(this.f174269Q, new C77295a(comment, true, this.f174274W));
            postDelayed(new RunnableC77702b(this), 40);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a
    /* renamed from: c */
    public final void mo121206c(Comment comment) {
        C89219l.m154721d(comment, "");
        String fakeId = comment.getFakeId();
        C89219l.m154716b(fakeId, "");
        if (!TextUtils.isEmpty(fakeId)) {
            int i = 0;
            for (AbstractC17641a aVar : getState().mo28140c()) {
                if (!(aVar instanceof C77295a) || !C89219l.m154714a((Object) ((C77295a) aVar).f173408a.getFakeId(), (Object) fakeId)) {
                    i++;
                } else if (i >= 0) {
                    AbstractC17641a b = getState().mo28135b(i);
                    if (b instanceof C77295a) {
                        getState().mo28136b(i, new C77295a(comment, ((C77295a) b).f173409b, this.f174274W));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo121209d(boolean z) {
        this.f174276ab = z;
        this.f174268P = getFirstDataPositionInState();
        ViewGroup.LayoutParams layoutParams = this.f174273V.getLayoutParams();
        if (z) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 192.0f, system.getDisplayMetrics()));
        } else {
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 240.0f, system2.getDisplayMetrics()));
        }
        this.f174273V.setLayoutParams(layoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.view.AbstractC77713a
    /* renamed from: a */
    public final boolean mo121203a(String str) {
        C89219l.m154721d(str, "");
        if (this.f174275aa || this.f174270R) {
            return false;
        }
        getState().mo28134b();
        setVisibility(0);
        this.f174270R = true;
        m135723s();
        this.f174269Q = this.f174268P;
        Comment comment = new Comment();
        comment.setUser(C80580in.m139683b());
        comment.setText(str);
        getState().mo28130a(this.f174269Q, new C77295a(comment, true, this.f174274W));
        getState().mo28134b();
        postDelayed(new RunnableC77704d(this), 40);
        return true;
    }

    private /* synthetic */ ReactionBubbleList(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ReactionBubbleList(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        mo4402a(new C51453d(0, C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())), 1));
        setHasFixedSize(true);
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b1o, this, false);
        C89219l.m154716b(a, "");
        this.f174273V = a;
        a.setTag(2);
        mo28088i(a);
        View a2 = C1764a.m5927a(LayoutInflater.from(context), R.layout.b1o, this, false);
        mo28089j(a2);
        C89219l.m154716b(a2, "");
        a2.setTag(2);
        setItemAnimator(null);
        this.f174275aa = true;
        this.f174269Q = -1;
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
                                this.f174275aa = true;
                                m135723s();
                                postDelayed(new RunnableC77705e(this), 40);
                                postDelayed(new RunnableC77706f(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
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
                                        this.f174268P = i6;
                                        if (i6 > getState().mo28134b()) {
                                            this.f174268P = getState().mo28134b();
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

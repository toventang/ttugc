package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.AbstractC35331bz;
import com.p2082ss.android.ugc.aweme.TabFragmentNode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.CircleImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49687o;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.main.experiment.C59081b;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61557i;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.p3682s.C67246b;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab */
public final class FollowTab extends TabFragmentNode implements AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public View f115339b;

    /* renamed from: c */
    public ViewStub f115340c;

    /* renamed from: d */
    public TextView f115341d;

    /* renamed from: j */
    public ViewStub f115342j;

    /* renamed from: k */
    public TextView f115343k;

    /* renamed from: l */
    public ViewGroup f115344l;

    /* renamed from: m */
    public ViewStub f115345m;

    /* renamed from: n */
    public View f115346n;

    /* renamed from: o */
    public ViewStub f115347o;

    /* renamed from: p */
    public final Context f115348p;

    /* renamed from: q */
    private List<? extends CircleImageView> f115349q;

    /* renamed from: r */
    private View f115350r;

    /* renamed from: s */
    private final Map<Integer, C61557i> f115351s = new LinkedHashMap();

    /* renamed from: t */
    private C61557i f115352t;

    /* renamed from: u */
    private final Handler f115353u = new Handler(Looper.getMainLooper());

    /* renamed from: v */
    private final Runnable f115354v = new RunnableC50007i(this);

    static {
        Covode.recordClassIndex(59115);
    }

    /* renamed from: b */
    private static String m93873b(int i) {
        switch (i) {
            case 38:
                return "live";
            case 39:
                return "head";
            case 40:
                return "dot";
            case 41:
                return "number";
            default:
                return "";
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: a */
    public final int mo57291a() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.bytedance.hox.AbstractC15501d
    /* renamed from: d */
    public final String mo25232d() {
        return "Following";
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: e */
    public final String mo25233e() {
        return "homepage_follow";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(54, new RunnableC90250g(FollowTab.class, "onNoticeFollowingTabInfo", C61557i.class, ThreadMode.MAIN, 0, false));
        hashMap.put(55, new RunnableC90250g(FollowTab.class, "onFollowFeedHideRedDotEvent", C49687o.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: f */
    public final Class<? extends Fragment> mo25234f() {
        return C50403p.class;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$i */
    static final class RunnableC50007i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FollowTab f115364a;

        static {
            Covode.recordClassIndex(59124);
        }

        RunnableC50007i(FollowTab followTab) {
            this.f115364a = followTab;
        }

        public final void run() {
            this.f115364a.mo85039a(false);
            this.f115364a.mo85042k();
        }
    }

    /* renamed from: l */
    public final String mo85043l() {
        C61557i iVar = this.f115352t;
        if (iVar != null) {
            return m93873b(iVar.f139726a);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$e */
    public static final class RunnableC50003e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FollowTab f115360a;

        static {
            Covode.recordClassIndex(59120);
        }

        RunnableC50003e(FollowTab followTab) {
            this.f115360a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.m26663i(10746);
            FollowTab followTab = this.f115360a;
            ViewStub viewStub = followTab.f115342j;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.f115341d = (TextView) view;
            this.f115360a.f115342j = null;
            MethodCollector.m26664o(10746);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$f */
    public static final class RunnableC50004f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FollowTab f115361a;

        static {
            Covode.recordClassIndex(59121);
        }

        RunnableC50004f(FollowTab followTab) {
            this.f115361a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.m26663i(10440);
            FollowTab followTab = this.f115361a;
            ViewStub viewStub = followTab.f115340c;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.f115339b = view;
            this.f115361a.f115340c = null;
            MethodCollector.m26664o(10440);
        }
    }

    /* renamed from: m */
    private final void m93875m() {
        if (this.f115339b == null && this.f115340c != null) {
            C67246b.m119169a(new RunnableC50004f(this));
        }
    }

    /* renamed from: n */
    private final void m93876n() {
        if (this.f115341d == null && this.f115342j != null) {
            C67246b.m119169a(new RunnableC50003e(this));
        }
    }

    /* renamed from: o */
    private final void m93877o() {
        if (this.f115344l == null && this.f115345m != null) {
            C67246b.m119169a(new RunnableC50006h(this));
        }
    }

    /* renamed from: p */
    private final void m93878p() {
        if (this.f115346n == null && this.f115347o != null) {
            C67246b.m119169a(new RunnableC50005g(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: Y_ */
    public final String mo62207Y_() {
        Resources resources;
        Context context = this.f115348p;
        if (context != null) {
            resources = context.getResources();
        } else {
            resources = null;
        }
        String string = resources.getString(R.string.ggv);
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.bytedance.hox.AbstractC15501d
    /* renamed from: g */
    public final Bundle mo25235g() {
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 1);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow");
        return bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: h */
    public final void mo57292h() {
        C61557i iVar = this.f115352t;
        if (iVar != null) {
            m93871a(iVar, "click");
        }
        SpecActServiceImpl.m131497i().mo118025a("Follow");
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by, com.p2082ss.android.ugc.aweme.TabFragmentNode
    /* renamed from: i */
    public final void mo57293i() {
        mo85039a(true);
        int a = C51648a.f118980a.mo87293a("homepage_follow");
        Context context = this.f115348p;
        if (context instanceof ActivityC0945e) {
            C51648a.f118980a.mo87303a(a, "homepage_follow", (ActivityC0945e) context);
        }
        mo85042k();
        AbstractC33200b.f78894b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$g */
    public static final class RunnableC50005g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FollowTab f115362a;

        static {
            Covode.recordClassIndex(59122);
        }

        RunnableC50005g(FollowTab followTab) {
            this.f115362a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.m26663i(12215);
            FollowTab followTab = this.f115362a;
            ViewStub viewStub = followTab.f115347o;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.f115346n = view;
            this.f115362a.mo85040b();
            this.f115362a.f115347o = null;
            MethodCollector.m26664o(12215);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$h */
    public static final class RunnableC50006h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FollowTab f115363a;

        static {
            Covode.recordClassIndex(59123);
        }

        RunnableC50006h(FollowTab followTab) {
            this.f115363a = followTab;
        }

        public final void run() {
            View view;
            MethodCollector.m26663i(12356);
            FollowTab followTab = this.f115363a;
            ViewStub viewStub = followTab.f115345m;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            followTab.f115344l = (ViewGroup) view;
            this.f115363a.mo85041j();
            this.f115363a.f115345m = null;
            MethodCollector.m26664o(12356);
        }
    }

    /* renamed from: b */
    public final void mo85040b() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        View view = this.f115346n;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
        }
        View view2 = this.f115346n;
        if (view2 != null) {
            i = view2.getMeasuredWidth();
        } else {
            i = 0;
        }
        View view3 = this.f115346n;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            int i2 = Build.VERSION.SDK_INT;
            ((LinearLayout.LayoutParams) layoutParams).setMarginStart(-i);
        }
    }

    /* renamed from: j */
    public final void mo85041j() {
        ViewGroup viewGroup = this.f115344l;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f115344l;
        if (viewGroup2 != null) {
            List<Number> b = C89070n.m154522b(Integer.valueOf((int) R.id.buk), Integer.valueOf((int) R.id.bul), Integer.valueOf((int) R.id.bum));
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) b, 10));
            for (Number number : b) {
                arrayList.add(viewGroup2.findViewById(number.intValue()));
            }
            ArrayList<CircleImageView> arrayList2 = arrayList;
            this.f115349q = arrayList2;
            if (arrayList2 != null) {
                for (CircleImageView circleImageView : arrayList2) {
                    circleImageView.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo85042k() {
        Object obj;
        String valueOf;
        Iterator it = C89070n.m154553a((Iterable) this.f115351s.values(), (Comparator) new C50008j()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C61557i iVar = (C61557i) obj;
            if (m93874c(iVar.f139726a)) {
                if (C61542b.m111469c(iVar.f139726a)) {
                    break;
                }
            }
        }
        C61557i iVar2 = (C61557i) obj;
        if (iVar2 != null) {
            int i = iVar2.f139726a;
            C61557i iVar3 = this.f115352t;
            if (iVar3 == null || i != iVar3.f139726a) {
                m93871a(iVar2, "show");
                this.f115352t = iVar2;
                this.f115353u.removeCallbacks(this.f115354v);
                switch (iVar2.f139726a) {
                    case 38:
                        m93869a(iVar2.f139726a);
                        this.f115353u.postDelayed(this.f115354v, 120000);
                        return;
                    case 39:
                        m93869a(-1);
                        m93872a(iVar2.f139728c);
                        return;
                    case 40:
                        m93869a(iVar2.f139726a);
                        return;
                    case 41:
                        int a = C61542b.m111458a(iVar2.f139726a);
                        if (a > 0) {
                            TextView textView = this.f115341d;
                            if (textView != null) {
                                if (a > 99) {
                                    valueOf = "99+";
                                } else {
                                    valueOf = String.valueOf(a);
                                }
                                textView.setText(valueOf);
                            }
                            m93869a(iVar2.f139726a);
                            return;
                        }
                        m93869a(40);
                        return;
                    default:
                        return;
                }
            }
        } else if (this.f115352t != null) {
            mo85039a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$a */
    public static final class View$OnAttachStateChangeListenerC49999a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ FollowTab f115355a;

        static {
            Covode.recordClassIndex(59116);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC49999a(FollowTab followTab) {
            this.f115355a = followTab;
        }

        public final void onViewAttachedToWindow(View view) {
            EventBus.m156966a(EventBus.m156962a(), this.f115355a);
        }

        public final void onViewDetachedFromWindow(View view) {
            EventBus.m156962a().mo145395b(this.f115355a);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onFollowFeedHideRedDotEvent(C49687o oVar) {
        mo85039a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$b */
    public static final class C50000b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ FollowTab f115356a;

        /* renamed from: b */
        final /* synthetic */ List f115357b;

        static {
            Covode.recordClassIndex(59117);
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            ViewGroup viewGroup = this.f115356a.f115344l;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            TextView textView = this.f115356a.f115343k;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }

        C50000b(FollowTab followTab, List list) {
            this.f115356a = followTab;
            this.f115357b = list;
        }
    }

    /* renamed from: a */
    private static void m93870a(View view) {
        if (C16048b.m29633a().mo25421a(true, "following_red_dot_reverse", false)) {
            if (view != null) {
                view.setBackgroundResource(R.drawable.a_o);
            }
        } else if (view != null) {
            view.setBackgroundResource(R.drawable.a_l);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onNoticeFollowingTabInfo(C61557i iVar) {
        C89219l.m154721d(iVar, "");
        this.f115351s.put(Integer.valueOf(iVar.f139726a), iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$c */
    public static final class C50001c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CircleImageView f115358a;

        static {
            Covode.recordClassIndex(59118);
        }

        C50001c(CircleImageView circleImageView) {
            this.f115358a = circleImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f115358a.setTranslationY(100.0f * floatValue);
            this.f115358a.setAlpha(1.0f - floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$d */
    public static final class C50002d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CircleImageView f115359a;

        static {
            Covode.recordClassIndex(59119);
        }

        C50002d(CircleImageView circleImageView) {
            this.f115359a = circleImageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f115359a.setVisibility(0);
            this.f115359a.setTranslationY(50.0f * floatValue);
            this.f115359a.setAlpha(1.0f - floatValue);
        }
    }

    public FollowTab(Context context) {
        C89219l.m154721d(context, "");
        this.f115348p = context;
    }

    /* renamed from: c */
    private static boolean m93874c(int i) {
        if (i != 38) {
            if ((i == 40 || i == 41) && C59081b.m108558a() == 2) {
                return false;
            }
        } else if (C16048b.m29633a().mo25412a(true, "i18n_following_live_skylight_type", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m93869a(int i) {
        boolean z;
        boolean z2;
        if (C67261e.m119187e()) {
            if (i == 40) {
                m93875m();
                m93870a(this.f115341d);
            } else if (i == 41) {
                m93876n();
            } else if (i == 38) {
                m93878p();
            }
        }
        View view = this.f115339b;
        boolean z3 = true;
        if (view != null) {
            if (i == 40) {
                z2 = true;
            } else {
                z2 = false;
            }
            C50009k.m93893a(view, z2);
        }
        TextView textView = this.f115341d;
        if (textView != null) {
            if (i == 41) {
                z = true;
            } else {
                z = false;
            }
            C50009k.m93893a(textView, z);
        }
        View view2 = this.f115346n;
        if (view2 != null) {
            if (i != 38) {
                z3 = false;
            }
            C50009k.m93893a(view2, z3);
        }
    }

    /* renamed from: a */
    private void m93872a(List<? extends User> list) {
        if (list != null) {
            int size = list.size();
            if (C67261e.m119187e()) {
                m93877o();
            }
            List<? extends CircleImageView> list2 = this.f115349q;
            int i = 0;
            if (list2 != null) {
                int i2 = 0;
                for (T t : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (i2 < size) {
                        C34577e.m70592a(t2, ((User) list.get(i2)).getAvatarThumb());
                        t2.setVisibility(4);
                    } else {
                        t2.setVisibility(8);
                    }
                    i2 = i3;
                }
            }
            TextView textView = this.f115343k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ViewGroup viewGroup = this.f115344l;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            List<? extends CircleImageView> list3 = this.f115349q;
            if (list3 != null) {
                for (T t3 : list3) {
                    int i4 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t4 = t3;
                    if (i < size) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        C89219l.m154716b(ofFloat, "");
                        ofFloat.setDuration(400L);
                        ofFloat.setStartDelay(((long) i) * 30);
                        ofFloat.addUpdateListener(new C50002d(t4));
                        arrayList.add(ofFloat);
                    }
                    i = i4;
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC35329by
    /* renamed from: a */
    public final View mo62208a(AbstractC35331bz bzVar) {
        TextView textView;
        View view;
        TextView textView2;
        ViewGroup viewGroup;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        C89219l.m154721d(bzVar, "");
        if (C67261e.m119187e()) {
            Context context = this.f115348p;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            this.f115350r = C1870c.m6045a((Activity) context, (int) R.layout.a41);
        } else {
            Context context2 = this.f115348p;
            Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
            this.f115350r = C1870c.m6045a((Activity) context2, (int) R.layout.a40);
        }
        View view2 = this.f115350r;
        if (view2 != null) {
            view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC49999a(this));
        }
        View view3 = this.f115350r;
        View view4 = null;
        ViewStub viewStub4 = null;
        if (view3 != null) {
            textView = (TextView) view3.findViewById(16908308);
        } else {
            textView = null;
        }
        this.f115343k = textView;
        if (textView != null) {
            textView.setText(mo62207Y_());
        }
        if (C67261e.m119187e()) {
            View view5 = this.f115350r;
            if (view5 != null) {
                viewStub = (ViewStub) view5.findViewById(R.id.f5d);
            } else {
                viewStub = null;
            }
            this.f115340c = viewStub;
            View view6 = this.f115350r;
            if (view6 != null) {
                viewStub2 = (ViewStub) view6.findViewById(R.id.f5b);
            } else {
                viewStub2 = null;
            }
            this.f115342j = viewStub2;
            View view7 = this.f115350r;
            if (view7 != null) {
                viewStub3 = (ViewStub) view7.findViewById(R.id.b7j);
            } else {
                viewStub3 = null;
            }
            this.f115345m = viewStub3;
            View view8 = this.f115350r;
            if (view8 != null) {
                viewStub4 = (ViewStub) view8.findViewById(R.id.f5c);
            }
            this.f115347o = viewStub4;
        } else {
            View view9 = this.f115350r;
            if (view9 != null) {
                view = view9.findViewById(R.id.f5_);
            } else {
                view = null;
            }
            this.f115339b = view;
            View view10 = this.f115350r;
            if (view10 != null) {
                textView2 = (TextView) view10.findViewById(R.id.f5a);
            } else {
                textView2 = null;
            }
            this.f115341d = textView2;
            View view11 = this.f115350r;
            if (view11 != null) {
                viewGroup = (ViewGroup) view11.findViewById(R.id.b7i);
            } else {
                viewGroup = null;
            }
            this.f115344l = viewGroup;
            mo85041j();
            View view12 = this.f115350r;
            if (view12 != null) {
                view4 = view12.findViewById(R.id.cc5);
            }
            this.f115346n = view4;
            mo85040b();
        }
        m93869a(-1);
        if (!C67261e.m119187e()) {
            m93870a(this.f115339b);
        }
        TextView textView3 = this.f115343k;
        if (textView3 != null) {
            textView3.setShadowLayer(C13628n.m24520b(C17867d.m33078a(), 2.0f), 0.0f, C13628n.m24520b(C17867d.m33078a(), 2.0f), Color.parseColor("#26000000"));
        }
        View view13 = this.f115350r;
        if (view13 == null) {
            C89219l.m154715b();
        }
        return view13;
    }

    /* renamed from: a */
    public final void mo85039a(boolean z) {
        List<? extends CircleImageView> list;
        int i;
        C61557i iVar = this.f115352t;
        if (iVar != null) {
            int i2 = iVar.f139726a;
            m93869a(-1);
            if (i2 == 39) {
                if (C67261e.m119187e()) {
                    m93877o();
                }
                ViewGroup viewGroup = this.f115344l;
                if (!(viewGroup == null || viewGroup.getVisibility() != 0 || (list = this.f115349q) == null)) {
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (it.next().getVisibility() == 0 && (i = i + 1) < 0) {
                                C89070n.m154523b();
                            }
                        }
                    } else {
                        i = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    List<? extends CircleImageView> list2 = this.f115349q;
                    if (list2 != null) {
                        int i3 = 0;
                        for (T t : list2) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                C89070n.m154520a();
                            }
                            T t2 = t;
                            if (i3 < i) {
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                C89219l.m154716b(ofFloat, "");
                                ofFloat.setDuration(400L);
                                ofFloat.setStartDelay(((long) ((i - i3) - 1)) * 30);
                                ofFloat.addUpdateListener(new C50001c(t2));
                                arrayList.add(ofFloat);
                            }
                            i3 = i4;
                        }
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.addListener(new C50000b(this, arrayList));
                    animatorSet.playTogether(arrayList);
                    animatorSet.start();
                }
            }
            if (z) {
                C61542b.m111470d(38);
                C61542b.m111470d(39);
                C61542b.m111470d(40);
                C61542b.m111470d(41);
            } else {
                C61542b.m111470d(i2);
            }
            this.f115352t = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$k */
    public static final class C50009k extends AbstractC89220m implements AbstractC89183m<View, Boolean, C89391z> {

        /* renamed from: a */
        public static final C50009k f115365a = new C50009k();

        static {
            Covode.recordClassIndex(59126);
        }

        C50009k() {
            super(2);
        }

        /* renamed from: a */
        public static void m93893a(View view, boolean z) {
            int i;
            C89219l.m154721d(view, "");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(View view, Boolean bool) {
            m93893a(view, bool.booleanValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.FollowTab$j */
    public static final class C50008j<T> implements Comparator {
        static {
            Covode.recordClassIndex(59125);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t2.f139727b), Integer.valueOf(t.f139727b));
        }
    }

    /* renamed from: a */
    private static void m93871a(C61557i iVar, String str) {
        User user;
        C33744d a = new C33744d().mo59983a("notice_type", m93873b(iVar.f139726a)).mo59983a("action_type", str);
        List<User> list = iVar.f139728c;
        if (!(list == null || (user = (User) C89070n.m154583g((List) list)) == null)) {
            a.mo59983a("to_user_id", user.getUid());
        }
        if (iVar.f139726a == 41) {
            a.mo59980a("number_cnt", C61542b.m111458a(iVar.f139726a));
        }
        C39162r.m79460a("homepage_follow_notice", a.f79943a);
    }
}

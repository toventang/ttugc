package com.p2082ss.android.ugc.aweme.social.widget.card.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74783e;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.C74875a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SocialCardVM;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout */
public final class LegacyPermissionLayout extends LinearLayout implements AbstractC1202k {

    /* renamed from: a */
    public final C74743a f168337a;

    /* renamed from: b */
    public final C74765i f168338b;

    /* renamed from: c */
    private final AbstractC89244h f168339c;

    /* renamed from: d */
    private final Map<C74808c, View> f168340d;

    /* renamed from: e */
    private ViewGroup.LayoutParams f168341e;

    /* renamed from: f */
    private final int f168342f;

    static {
        Covode.recordClassIndex(87742);
    }

    public final SocialCardVM getSocialCardVM() {
        return (SocialCardVM) this.f168339c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout$c */
    public static final class C74885c implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f168347a;

        static {
            Covode.recordClassIndex(87747);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout.C74885c.C748861 */

                /* renamed from: a */
                public int f168348a;

                /* renamed from: b */
                final /* synthetic */ C74885c f168349b;

                static {
                    Covode.recordClassIndex(87748);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f168348a < this.f168349b.f168347a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f168349b.f168347a;
                    int i = this.f168348a;
                    this.f168348a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f168349b = r1;
                }
            };
        }

        public C74885c(ViewGroup viewGroup) {
            this.f168347a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout$d */
    static final class C74887d extends AbstractC89220m implements AbstractC89171a<SocialCardVM> {

        /* renamed from: a */
        final /* synthetic */ LegacyPermissionLayout f168350a;

        static {
            Covode.recordClassIndex(87749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74887d(LegacyPermissionLayout legacyPermissionLayout) {
            super(0);
            this.f168350a = legacyPermissionLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SocialCardVM invoke() {
            AbstractC1174ac a = new C1175ad(this.f168350a.f168337a, new C74875a(this.f168350a.f168338b)).mo3983a(SocialCardVM.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f168341e = layoutParams;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout$f */
    public static final class C74889f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LegacyPermissionLayout f168355a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f168356b;

        static {
            Covode.recordClassIndex(87751);
        }

        public final void onAnimationCancel(Animator animator) {
            View view = (View) this.f168356b.get();
            if (view != null) {
                this.f168355a.removeView(view);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            View view = (View) this.f168356b.get();
            if (view != null) {
                this.f168355a.removeView(view);
            }
        }

        C74889f(LegacyPermissionLayout legacyPermissionLayout, WeakReference weakReference) {
            this.f168355a = legacyPermissionLayout;
            this.f168356b = weakReference;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout$a */
    static final class C74881a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LegacyPermissionLayout f168343a;

        static {
            Covode.recordClassIndex(87743);
        }

        C74881a(LegacyPermissionLayout legacyPermissionLayout) {
            this.f168343a = legacyPermissionLayout;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t instanceof C74808c) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (this.f168343a.getChildCount() == 0) {
                    this.f168343a.setUpInitialData(arrayList2);
                } else {
                    this.f168343a.mo117923a(arrayList2);
                }
            }
        }
    }

    public final void removeView(View view) {
        View childAt;
        MethodCollector.m26663i(7470);
        int indexOfChild = indexOfChild(view) - 1;
        int childCount = getChildCount();
        if (indexOfChild >= 0 && childCount > indexOfChild && (childAt = getChildAt(indexOfChild)) != null) {
            C23163i.m43668b(childAt, null, null, 0, null, false, 27);
        }
        super.removeView(view);
        if (getChildCount() == 0) {
            setVisibility(8);
        }
        MethodCollector.m26664o(7470);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout$b */
    static final class C74882b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LegacyPermissionLayout f168344a;

        static {
            Covode.recordClassIndex(87744);
        }

        C74882b(LegacyPermissionLayout legacyPermissionLayout) {
            this.f168344a = legacyPermissionLayout;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Context context = this.f168344a.getContext();
            C89219l.m154716b(context, "");
            Class<? extends AbstractC79495a> a = C74783e.m131297a(((C74808c) obj).f168131a);
            User b = C80580in.m139683b();
            C89219l.m154716b(b, "");
            String uid = b.getUid();
            String str = this.f168344a.f168338b.f168055d.get("enter_from");
            if (str == null) {
                str = "";
            }
            AbstractC88412b a2 = C79515b.m138229a(context, a, uid, str, "click", true, false, null).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C748831.f168345a, C748842.f168346a);
            C89219l.m154716b(a2, "");
            C88934a.m154195a(a2, this.f168344a.getSocialCardVM().f168261b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout$e */
    public static final class C74888e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LegacyPermissionLayout f168351a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f168352b;

        /* renamed from: c */
        final /* synthetic */ int f168353c;

        /* renamed from: d */
        final /* synthetic */ int f168354d;

        static {
            Covode.recordClassIndex(87750);
        }

        C74888e(LegacyPermissionLayout legacyPermissionLayout, WeakReference weakReference, int i, int i2) {
            this.f168351a = legacyPermissionLayout;
            this.f168352b = weakReference;
            this.f168353c = i;
            this.f168354d = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = (View) this.f168352b.get();
            if (this.f168351a.getOrientation() == 0) {
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = (int) (floatValue * ((float) this.f168353c));
                        view.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = (int) (floatValue * ((float) this.f168354d));
                    view.setLayoutParams(layoutParams2);
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    /* renamed from: a */
    public final void mo117923a(List<? extends C74808c> list) {
        for (Object obj : C89047am.m154441a(this.f168340d.keySet(), list)) {
            View remove = this.f168340d.remove(obj);
            if (remove != null) {
                int width = remove.getWidth();
                int height = remove.getHeight();
                ObjectAnimator duration = ObjectAnimator.ofFloat(remove, "alpha", 1.0f, 0.0f).setDuration(120L);
                C89219l.m154716b(duration, "");
                ValueAnimator duration2 = ObjectAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                WeakReference weakReference = new WeakReference(remove);
                duration2.addUpdateListener(new C74888e(this, weakReference, width, height));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(duration).with(duration2);
                animatorSet.addListener(new C74889f(this, weakReference));
                animatorSet.start();
            }
        }
    }

    public final void setUpInitialData(List<? extends C74808c> list) {
        int i = getLayoutParams().height;
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            PermissionCell permissionCell = (PermissionCell) C74783e.m131298a(t2.f168131a, t2.mo117859a()).newInstance();
            if (permissionCell instanceof PermissionCell) {
                permissionCell.f168111a = getSocialCardVM();
                View a = permissionCell.mo23349a((ViewGroup) this);
                if (t2.mo117859a() == EnumC74754a.SQUARE && i2 != list.size() - 1) {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    C23163i.m43668b(a, null, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()))), null, false, 27);
                }
                permissionCell.mo117854b((Object) t2);
                this.f168340d.put(t2, a);
                addView(a);
                i = a.getLayoutParams().height;
            }
            i2 = i3;
        }
        if (this.f168341e != null) {
            for (View view : new C74885c(this)) {
                ViewGroup.LayoutParams layoutParams = this.f168341e;
                C89378p pVar = null;
                Integer num = null;
                if (layoutParams != null) {
                    Integer valueOf = layoutParams.width > 0 ? Integer.valueOf(layoutParams.width) : null;
                    if (layoutParams.height > 0) {
                        num = Integer.valueOf(layoutParams.height);
                    }
                    pVar = C89387v.m154943a(valueOf, num);
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    if (pVar != null) {
                        Integer num2 = (Integer) pVar.getFirst();
                        if (num2 != null) {
                            layoutParams2.width = num2.intValue();
                        }
                        Integer num3 = (Integer) pVar.getSecond();
                        if (num3 != null) {
                            layoutParams2.height = num3.intValue();
                        }
                    }
                    view.setLayoutParams(layoutParams2);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = i;
            setLayoutParams(layoutParams3);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            this.f168337a.getLifecycle().mo4013b(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LegacyPermissionLayout(C74743a aVar, C74765i iVar, int i) {
        super(aVar.f168002a, null, 0);
        ViewGroup.LayoutParams layoutParams;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        MethodCollector.m26663i(7473);
        this.f168337a = aVar;
        this.f168338b = iVar;
        this.f168342f = i;
        this.f168339c = C89250i.m154773a((AbstractC89171a) new C74887d(this));
        this.f168340d = new LinkedHashMap();
        setOrientation(i);
        if (getOrientation() == 1) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        setLayoutParams(layoutParams);
        setOrientation(i);
        aVar.getLifecycle().mo4012a(this);
        getSocialCardVM().f168272m.observe(aVar, new C74881a(this));
        getSocialCardVM().f168279t.observe(aVar, new C74882b(this));
        MethodCollector.m26664o(7473);
    }

    public /* synthetic */ LegacyPermissionLayout(C74743a aVar, C74765i iVar, int i, byte b) {
        this(aVar, iVar, i);
    }
}

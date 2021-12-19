package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC0974l;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator */
public final class AdFakeUserProfileNavigator extends RelativeLayout {

    /* renamed from: e */
    public static final C38346a f90610e = new C38346a((byte) 0);

    /* renamed from: a */
    public LinearLayout f90611a;

    /* renamed from: b */
    public View f90612b;

    /* renamed from: c */
    public View f90613c;

    /* renamed from: d */
    public boolean f90614d;

    /* renamed from: f */
    private AbstractC0974l f90615f;

    /* renamed from: g */
    private ViewPager.AbstractC1579e f90616g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator$b */
    public interface AbstractC38347b {
        static {
            Covode.recordClassIndex(45844);
        }

        /* renamed from: a */
        void mo66956a();
    }

    static {
        Covode.recordClassIndex(45842);
    }

    public AdFakeUserProfileNavigator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator$a */
    public static final class C38346a {
        static {
            Covode.recordClassIndex(45843);
        }

        private C38346a() {
        }

        public /* synthetic */ C38346a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ayy);
        C89219l.m154716b(findViewById, "");
        this.f90611a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.ayq);
        C89219l.m154716b(findViewById2, "");
        this.f90612b = findViewById2;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator$e */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC38350e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNavigator f90623a;

        /* renamed from: b */
        final /* synthetic */ ViewTreeObserver f90624b;

        /* renamed from: c */
        final /* synthetic */ ViewPager f90625c;

        static {
            Covode.recordClassIndex(45847);
        }

        public final void onGlobalLayout() {
            if (this.f90624b.isAlive()) {
                this.f90624b.removeOnGlobalLayoutListener(this);
                AdFakeUserProfileNavigator adFakeUserProfileNavigator = this.f90623a;
                ViewPager viewPager = this.f90625c;
                View a = AdFakeUserProfileNavigator.m77747a(adFakeUserProfileNavigator);
                if (viewPager != null && a != null) {
                    adFakeUserProfileNavigator.mo66953a(viewPager.getCurrentItem(), 0.0f, a);
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC38350e(AdFakeUserProfileNavigator adFakeUserProfileNavigator, ViewTreeObserver viewTreeObserver, ViewPager viewPager) {
            this.f90623a = adFakeUserProfileNavigator;
            this.f90624b = viewTreeObserver;
            this.f90625c = viewPager;
        }
    }

    /* renamed from: a */
    private final View m77746a(int i) {
        LinearLayout linearLayout = this.f90611a;
        if (linearLayout == null) {
            C89219l.m154710a("tabContainer");
        }
        return linearLayout.getChildAt(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator$c */
    static final class View$OnClickListenerC38348c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNavigator f90617a;

        /* renamed from: b */
        final /* synthetic */ AbstractC38347b f90618b;

        /* renamed from: c */
        final /* synthetic */ int f90619c;

        /* renamed from: d */
        final /* synthetic */ ViewPager f90620d;

        static {
            Covode.recordClassIndex(45845);
        }

        View$OnClickListenerC38348c(AdFakeUserProfileNavigator adFakeUserProfileNavigator, AbstractC38347b bVar, int i, ViewPager viewPager) {
            this.f90617a = adFakeUserProfileNavigator;
            this.f90618b = bVar;
            this.f90619c = i;
            this.f90620d = viewPager;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f90617a.f90614d) {
                this.f90620d.setCurrentItem(this.f90619c);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m77747a(AdFakeUserProfileNavigator adFakeUserProfileNavigator) {
        View view = adFakeUserProfileNavigator.f90612b;
        if (view == null) {
            C89219l.m154710a("indicator");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileNavigator$d */
    public static final class C38349d implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileNavigator f90621a;

        /* renamed from: b */
        final /* synthetic */ AbstractC38347b f90622b;

        static {
            Covode.recordClassIndex(45846);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            LinearLayout linearLayout = this.f90621a.f90611a;
            if (linearLayout == null) {
                C89219l.m154710a("tabContainer");
            }
            View childAt = linearLayout.getChildAt(i);
            if (this.f90621a.f90613c != null) {
                View view = this.f90621a.f90613c;
                if (view == null) {
                    C89219l.m154715b();
                }
                view.setSelected(false);
            }
            if (childAt != null) {
                childAt.setSelected(true);
                this.f90621a.f90613c = childAt;
            }
            AbstractC38347b bVar = this.f90622b;
            if (bVar != null) {
                bVar.mo66956a();
            }
        }

        C38349d(AdFakeUserProfileNavigator adFakeUserProfileNavigator, AbstractC38347b bVar) {
            this.f90621a = adFakeUserProfileNavigator;
            this.f90622b = bVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            AdFakeUserProfileNavigator adFakeUserProfileNavigator = this.f90621a;
            adFakeUserProfileNavigator.mo66953a(i, f, AdFakeUserProfileNavigator.m77747a(adFakeUserProfileNavigator));
        }
    }

    /* renamed from: a */
    public final void mo66954a(ViewPager viewPager, AbstractC38347b bVar) {
        MethodCollector.m26663i(2273);
        if (viewPager == null) {
            MethodCollector.m26664o(2273);
        } else if (viewPager.getAdapter() == null) {
            MethodCollector.m26664o(2273);
        } else {
            List b = C89070n.m154522b(Integer.valueOf((int) R.drawable.cd), Integer.valueOf((int) R.raw.icon_3pt_video));
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                AbstractC0974l lVar = (AbstractC0974l) adapter;
                this.f90615f = lVar;
                if (lVar != null) {
                    int count = lVar.getCount();
                    if (count <= 0) {
                        MethodCollector.m26664o(2273);
                        return;
                    }
                    LinearLayout linearLayout = this.f90611a;
                    if (linearLayout == null) {
                        C89219l.m154710a("tabContainer");
                    }
                    linearLayout.removeAllViews();
                    int i = 0;
                    do {
                        Context context = getContext();
                        LinearLayout linearLayout2 = this.f90611a;
                        if (linearLayout2 == null) {
                            C89219l.m154710a("tabContainer");
                        }
                        int intValue = ((Number) b.get(i)).intValue();
                        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.apv, linearLayout2, false);
                        if (a != null) {
                            AdFakeUserProfileTabImageView adFakeUserProfileTabImageView = (AdFakeUserProfileTabImageView) a;
                            adFakeUserProfileTabImageView.setImageResource(intValue);
                            adFakeUserProfileTabImageView.setAnimationEnabled(true);
                            adFakeUserProfileTabImageView.setOnClickListener(new View$OnClickListenerC38348c(this, bVar, i, viewPager));
                            LinearLayout linearLayout3 = this.f90611a;
                            if (linearLayout3 == null) {
                                C89219l.m154710a("tabContainer");
                            }
                            linearLayout3.addView(adFakeUserProfileTabImageView);
                            i++;
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileTabImageView");
                            MethodCollector.m26664o(2273);
                            throw nullPointerException;
                        }
                    } while (i < count);
                    AdFakeUserProfileTabImageView adFakeUserProfileTabImageView2 = (AdFakeUserProfileTabImageView) m77746a(0);
                    if (adFakeUserProfileTabImageView2 != null) {
                        this.f90613c = adFakeUserProfileTabImageView2;
                        adFakeUserProfileTabImageView2.setSelected(true);
                    }
                    ViewPager.AbstractC1579e eVar = this.f90616g;
                    if (eVar != null) {
                        viewPager.removeOnPageChangeListener(eVar);
                    }
                    C38349d dVar = new C38349d(this, bVar);
                    this.f90616g = dVar;
                    viewPager.addOnPageChangeListener(dVar);
                    ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC38350e(this, viewTreeObserver, viewPager));
                        MethodCollector.m26664o(2273);
                        return;
                    }
                    MethodCollector.m26664o(2273);
                    return;
                }
                MethodCollector.m26664o(2273);
                return;
            }
            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentPagerAdapter");
            MethodCollector.m26664o(2273);
            throw nullPointerException2;
        }
    }

    private /* synthetic */ AdFakeUserProfileNavigator(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdFakeUserProfileNavigator(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2398);
        this.f90614d = true;
        MethodCollector.m26664o(2398);
    }

    /* renamed from: a */
    public final void mo66953a(int i, float f, View view) {
        View a;
        View a2;
        if (C34729o.m70957a(view) && (a = m77746a(i)) != null && (a2 = m77746a(i + 1)) != null) {
            if (a.getVisibility() == 0 && a2.getVisibility() == 0) {
                float x = (a.getX() + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2));
                view.setX(getX() + x + (f * (((a2.getX() + ((float) (a2.getWidth() / 2))) - ((float) (view.getWidth() / 2))) - x)));
            } else if (C34729o.m70957a(a)) {
                view.setX(((getX() + a.getX()) + ((float) (a.getWidth() / 2))) - ((float) (view.getWidth() / 2)));
            }
        }
    }
}

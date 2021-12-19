package com.p2082ss.android.ugc.aweme.trending.p4146b;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48191b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.trending.p4147c.C79055a;
import com.p2082ss.android.ugc.aweme.trending.viewmodel.TrendingMainViewModel;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.b.a */
public final class C79044a implements ViewPager.AbstractC1580f {

    /* renamed from: a */
    public static final C79045a f177671a = new C79045a((byte) 0);

    /* renamed from: b */
    private final int f177672b = C34728n.m70946a(16.0d);

    /* renamed from: c */
    private final C79053c f177673c = new C79053c();

    /* renamed from: d */
    private final C79048c f177674d;

    static {
        Covode.recordClassIndex(92221);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.b.a$a */
    public static final class C79045a {
        static {
            Covode.recordClassIndex(92222);
        }

        private C79045a() {
        }

        public /* synthetic */ C79045a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.b.a$b */
    static final class C79046b {

        /* renamed from: a */
        public static final C79046b f177675a = new C79046b();

        private C79046b() {
        }

        static {
            Covode.recordClassIndex(92223);
        }

        /* renamed from: com.ss.android.ugc.aweme.trending.b.a$b$a */
        static final class C79047a extends ViewOutlineProvider {

            /* renamed from: a */
            public float f177676a;

            /* renamed from: b */
            private final C79051b f177677b = new C79051b();

            static {
                Covode.recordClassIndex(92224);
            }

            public final void getOutline(View view, Outline outline) {
                C89219l.m154721d(view, "");
                C89219l.m154721d(outline, "");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f177677b.getInterpolation(this.f177676a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.b.a$c */
    static final class C79048c {

        /* renamed from: a */
        public int f177678a;

        /* renamed from: b */
        public int f177679b;

        /* renamed from: c */
        public boolean f177680c;

        /* renamed from: d */
        final AbstractC89244h f177681d = C89250i.m154773a((AbstractC89171a) new C79050a(this));

        /* renamed from: e */
        public int f177682e = -1;

        /* renamed from: f */
        public boolean f177683f;

        /* renamed from: g */
        public final VerticalViewPager f177684g;

        /* renamed from: h */
        private final TrendingMainViewModel f177685h;

        /* renamed from: i */
        private final AbstractC20527q f177686i;

        static {
            Covode.recordClassIndex(92225);
        }

        /* renamed from: com.ss.android.ugc.aweme.trending.b.a$c$a */
        static final class C79050a extends AbstractC89220m implements AbstractC89171a<AbstractC48191b> {

            /* renamed from: a */
            final /* synthetic */ C79048c f177688a;

            static {
                Covode.recordClassIndex(92227);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C79050a(C79048c cVar) {
                super(0);
                this.f177688a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AbstractC48191b invoke() {
                PagerAdapter adapter = this.f177688a.f177684g.getAdapter();
                if (!(adapter instanceof AbstractC48191b)) {
                    return null;
                }
                return adapter;
            }
        }

        public C79048c(VerticalViewPager verticalViewPager, TrendingMainViewModel trendingMainViewModel, AbstractC20527q qVar) {
            C89219l.m154721d(verticalViewPager, "");
            C89219l.m154721d(trendingMainViewModel, "");
            C89219l.m154721d(qVar, "");
            this.f177684g = verticalViewPager;
            this.f177685h = trendingMainViewModel;
            this.f177686i = qVar;
            verticalViewPager.mo67974a(new ViewPager.C1582h(this) {
                /* class com.p2082ss.android.ugc.aweme.trending.p4146b.C79044a.C79048c.C790491 */

                /* renamed from: a */
                final /* synthetic */ C79048c f177687a;

                static {
                    Covode.recordClassIndex(92226);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f177687a = r1;
                }

                @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrollStateChanged(int i) {
                    if (i == 0) {
                        this.f177687a.f177682e = -1;
                        this.f177687a.f177678a = 0;
                        this.f177687a.f177683f = false;
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
                public final void onPageScrolled(int i, float f, int i2) {
                    int i3;
                    if (this.f177687a.f177682e == -1) {
                        C79048c cVar = this.f177687a;
                        cVar.f177682e = cVar.f177684g.getCurrentItem();
                    }
                    int i4 = this.f177687a.f177678a;
                    if (!C79055a.m137879a(f, 0.0f)) {
                        C79048c cVar2 = this.f177687a;
                        if (cVar2.f177682e > i) {
                            i3 = 2;
                        } else {
                            i3 = 1;
                        }
                        cVar2.f177678a = i3;
                    }
                    if (i4 != this.f177687a.f177678a) {
                        this.f177687a.f177683f = false;
                    }
                }
            });
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1580f
    /* renamed from: a */
    public final void mo5330a(View view, float f) {
        float f2;
        boolean z;
        float f3;
        float f4;
        int itemPosition;
        Aweme c;
        Aweme c2;
        String str;
        C89219l.m154721d(view, "");
        if (f <= 1.0f && f >= -1.0f) {
            float f5 = 0.0f;
            if (f > 0.0f) {
                f2 = 1.0f - f;
            } else {
                f2 = f;
            }
            C79048c cVar = this.f177674d;
            C89219l.m154721d(view, "");
            int i = 0;
            if (cVar.f177678a != 1 ? f > 0.0f : f < 0.0f) {
                z = false;
            } else {
                z = true;
            }
            cVar.f177680c = z;
            ViewOutlineProvider viewOutlineProvider = null;
            if (!cVar.f177683f) {
                AbstractC48191b bVar = (AbstractC48191b) cVar.f177681d.getValue();
                if (!(bVar == null || (itemPosition = bVar.getItemPosition(view)) == -2)) {
                    if (cVar.f177678a == 1) {
                        if (f >= 0.0f) {
                            c = bVar.mo80287c(itemPosition);
                            c2 = bVar.mo80287c(itemPosition - 1);
                        } else {
                            c2 = bVar.mo80287c(itemPosition);
                            c = bVar.mo80287c(itemPosition + 1);
                        }
                    } else if (f > 0.0f) {
                        c2 = bVar.mo80287c(itemPosition);
                        c = bVar.mo80287c(itemPosition - 1);
                    } else {
                        c = bVar.mo80287c(itemPosition);
                        c2 = bVar.mo80287c(itemPosition + 1);
                    }
                    bVar.getCount();
                    if (c2 != null) {
                        c2.getDesc();
                    }
                    if (c != null) {
                        c.getDesc();
                        if (c2 != null) {
                            str = c2.getTrendingId();
                        } else {
                            str = null;
                        }
                        if (!C89219l.m154714a((Object) str, (Object) c.getTrendingId())) {
                            i = 1;
                        }
                    }
                }
                cVar.f177679b = i;
            }
            if (this.f177674d.f177678a == 0 || this.f177674d.f177679b == 0) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                return;
            }
            float interpolation = this.f177673c.getInterpolation(Math.abs(f2));
            view.setScaleX(interpolation);
            view.setScaleY(interpolation);
            if (this.f177674d.f177678a == 1) {
                if (this.f177674d.f177680c) {
                    f = 1.0f - f;
                } else {
                    f = -f;
                }
            } else if (this.f177674d.f177680c) {
                f += 1.0f;
            }
            float f6 = ((float) this.f177672b) * f;
            float height = ((float) view.getHeight()) * (1.0f - interpolation);
            if (this.f177674d.f177680c) {
                if (height < ((float) this.f177672b)) {
                    if (this.f177674d.f177678a == 1) {
                        f4 = ((float) this.f177672b) - height;
                    } else {
                        f3 = height - ((float) this.f177672b);
                        f5 = f3 + f6;
                    }
                } else if (this.f177674d.f177678a == 1) {
                    f4 = (((float) this.f177672b) - height) / 2.0f;
                } else {
                    f3 = (height - ((float) this.f177672b)) / 2.0f;
                    f5 = f3 + f6;
                }
                f5 = f4 - f6;
            } else if (!C79055a.m137879a(f, 1.0f)) {
                if (height < ((float) this.f177672b)) {
                    if (this.f177674d.f177678a == 1) {
                        f5 = -f6;
                    } else {
                        f5 = f6;
                    }
                } else if (this.f177674d.f177678a == 1) {
                    f5 = ((height - ((float) this.f177672b)) / 2.0f) - f6;
                } else {
                    f5 = ((((float) this.f177672b) - height) / 2.0f) + f6;
                }
            }
            view.setTranslationY(f5);
            view.getTranslationY();
            if (Build.VERSION.SDK_INT >= 21) {
                C89219l.m154721d(view, "");
                ViewOutlineProvider outlineProvider = view.getOutlineProvider();
                if (outlineProvider instanceof C79046b.C79047a) {
                    viewOutlineProvider = outlineProvider;
                }
                C79046b.C79047a aVar = (C79046b.C79047a) viewOutlineProvider;
                if (aVar == null) {
                    aVar = new C79046b.C79047a();
                    view.setOutlineProvider(aVar);
                    view.setClipToOutline(true);
                } else {
                    view.invalidateOutline();
                }
                aVar.f177676a = Math.abs(f2);
            }
        }
    }

    public C79044a(VerticalViewPager verticalViewPager, TrendingMainViewModel trendingMainViewModel, AbstractC20527q qVar) {
        C89219l.m154721d(verticalViewPager, "");
        C89219l.m154721d(trendingMainViewModel, "");
        C89219l.m154721d(qVar, "");
        this.f177674d = new C79048c(verticalViewPager, trendingMainViewModel, qVar);
    }
}

package com.p2082ss.android.ugc.aweme.tools.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78962g;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.C78916i;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78929a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4140e.C78947a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f.C78957b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f.C78960e;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f.C78961f;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.thumbnail.C79000a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.thumbnail.MvThumbnailRecyclerView;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.CircularAnimateButton;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView */
public class MvTemplateView extends FrameLayout implements AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private ActivityC0945e f177142A;

    /* renamed from: B */
    private C78970m f177143B = new C78970m();

    /* renamed from: C */
    private C78961f f177144C;

    /* renamed from: D */
    private int f177145D;

    /* renamed from: E */
    private C21582f f177146E;

    /* renamed from: F */
    private C78962g.EnumC78963a f177147F;

    /* renamed from: a */
    public TextView f177148a;

    /* renamed from: b */
    public TextView f177149b;

    /* renamed from: c */
    TextView f177150c;

    /* renamed from: d */
    MvThumbnailRecyclerView f177151d;

    /* renamed from: e */
    View f177152e;

    /* renamed from: f */
    CircularAnimateButton f177153f;

    /* renamed from: g */
    public int f177154g;

    /* renamed from: h */
    public int f177155h;

    /* renamed from: i */
    View f177156i;

    /* renamed from: j */
    DmtLoadingLayout f177157j;

    /* renamed from: k */
    public boolean f177158k;

    /* renamed from: l */
    View f177159l;

    /* renamed from: m */
    public AbstractC78969l f177160m;

    /* renamed from: n */
    MvThemeListViewPager f177161n;

    /* renamed from: o */
    public C78960e f177162o;

    /* renamed from: p */
    public int f177163p;

    /* renamed from: q */
    C79000a f177164q;

    /* renamed from: r */
    public AbstractC78837a f177165r;

    /* renamed from: s */
    public boolean f177166s;

    /* renamed from: t */
    public boolean f177167t = false;

    /* renamed from: u */
    ObjectAnimator f177168u;

    /* renamed from: v */
    ObjectAnimator f177169v;

    /* renamed from: w */
    AbstractC78929a f177170w;

    /* renamed from: x */
    private ViewGroup f177171x;

    /* renamed from: y */
    private View f177172y;

    /* renamed from: z */
    private int f177173z;

    static {
        Covode.recordClassIndex(91973);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(217, new RunnableC90250g(MvTemplateView.class, "handleSelectEvent", C78962g.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public int getDataCount() {
        return this.f177162o.getCount();
    }

    /* renamed from: d */
    public final void mo122652d() {
        C78957b a = mo122644a(this.f177155h);
        if (a != null) {
            a.mo122753f();
        }
    }

    /* renamed from: e */
    public final void mo122654e() {
        C78957b a = mo122644a(this.f177155h);
        if (a != null) {
            a.mo122754g();
        }
    }

    private int getItemWidth() {
        C78957b b;
        if (this.f177163p <= 0 && (b = this.f177162o.mo3649a(0)) != null) {
            this.f177163p = b.mo122751d();
        }
        return this.f177163p;
    }

    /* renamed from: b */
    public final void mo122650b() {
        final int i = this.f177155h;
        mo122649a(false);
        final MvThemeData c = this.f177162o.mo122760c(i);
        final C78957b a = mo122644a(i);
        if (c != null) {
            this.f177143B.mo122765a(c.f177184a, new IEffectDownloadProgressListener() {
                /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788336 */

                static {
                    Covode.recordClassIndex(91979);
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                    MvTemplateView.this.mo122649a(false);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final /* synthetic */ void onSuccess(Effect effect) {
                    Effect effect2 = effect;
                    MvTemplateView mvTemplateView = MvTemplateView.this;
                    int i = i;
                    C78957b bVar = a;
                    if (i == mvTemplateView.f177155h) {
                        mvTemplateView.mo122649a(true);
                        if (mvTemplateView.f177160m != null) {
                            mvTemplateView.f177160m.mo122727a(mvTemplateView.f177162o.mo122760c(mvTemplateView.f177155h), 1, mvTemplateView.f177155h);
                        }
                    }
                    if (bVar != null) {
                        bVar.mo122750b(false);
                    }
                    C78947a.m137759a(c, (ExceptionResult) null, true);
                    C73991bj.m130128a("MVRes: Download Success:" + effect2.getUnzipPath());
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    C85041d.m146222a(MvTemplateView.this.getContext(), MvTemplateView.this.getResources().getString(R.string.fe2)).mo129984b();
                    MvTemplateView mvTemplateView = MvTemplateView.this;
                    int i = i;
                    C78957b bVar = a;
                    if (i == mvTemplateView.f177155h) {
                        mvTemplateView.mo122649a(true);
                    }
                    if (bVar != null) {
                        bVar.mo122750b(false);
                    }
                    C78947a.m137759a(c, exceptionResult, false);
                    if (effect != null) {
                        C73991bj.m130128a("MVRes: Download Failed:" + effect.getName());
                    } else {
                        C73991bj.m130128a("MVRes: Download Failed:" + c.mo122672f());
                    }
                }

                @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                public final void onProgress(Effect effect, int i, long j) {
                    C78957b bVar = a;
                    if (bVar != null) {
                        bVar.mo122750b(true);
                        bVar.mo122749a(false);
                        if (bVar.f177452a != null) {
                            bVar.f177452a.setProgress((float) i);
                        }
                        if (bVar.f177453b != null) {
                            bVar.f177453b.setText(i + "%");
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo122651c() {
        CircularAnimateButton circularAnimateButton = this.f177153f;
        circularAnimateButton.setText(circularAnimateButton.getContext().getResources().getString(R.string.f83));
        this.f177153f.setClickable(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView$7 */
    static /* synthetic */ class C788347 {

        /* renamed from: a */
        static final /* synthetic */ int[] f177183a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 91980(0x1674c, float:1.28891E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.tools.mvtemplate.g$a[] r0 = com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78962g.EnumC78963a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788347.f177183a = r2
                com.ss.android.ugc.aweme.tools.mvtemplate.g$a r0 = com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78962g.EnumC78963a.ICON_LIST     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788347.f177183a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.tools.mvtemplate.g$a r0 = com.p2082ss.android.ugc.aweme.tools.mvtemplate.C78962g.EnumC78963a.MAIN_TEMPLATE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788347.<clinit>():void");
        }
    }

    /* renamed from: f */
    public final void mo122655f() {
        View findViewById;
        this.f177164q.f177538e = false;
        MvThumbnailRecyclerView mvThumbnailRecyclerView = this.f177151d;
        View childAt = mvThumbnailRecyclerView.getChildAt(mvThumbnailRecyclerView.getChildCount() - 1);
        if (childAt != null && (findViewById = childAt.findViewById(R.id.cg3)) != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo122645a() {
        this.f177157j.setVisibility(8);
        this.f177156i.setVisibility(0);
        this.f177149b.setVisibility(0);
        this.f177148a.setVisibility(0);
        if (!this.f177166s) {
            this.f177150c.setVisibility(0);
        }
        this.f177161n.setNoScroll(false);
        C78960e eVar = this.f177162o;
        if (eVar != null) {
            mo122646a(eVar.mo122760c(this.f177155h));
        } else {
            mo122649a(true);
        }
        this.f177153f.mo122819a();
        this.f177158k = false;
        AbstractC78969l lVar = this.f177160m;
        if (lVar != null) {
            lVar.mo122731b(this.f177162o.mo122760c(0));
        }
    }

    public void setMoreDataFetcher(AbstractC78837a aVar) {
        this.f177165r = aVar;
    }

    public void setMvThemeClickListener(AbstractC78969l lVar) {
        this.f177160m = lVar;
    }

    public void setMvEffectPlatform(AbstractC46415f fVar) {
        this.f177143B.f177483a = fVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() >= 2) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C78957b mo122644a(int i) {
        if (this.f177162o.getCount() <= 0 || i < 0 || i >= this.f177162o.getCount()) {
            return null;
        }
        return this.f177162o.mo3649a(i);
    }

    public void setDiContainer(C21582f fVar) {
        this.f177146E = this.f177146E;
        this.f177162o.f177467a = fVar;
        this.f177170w = ((AbstractC78928a) fVar.mo35249a(AbstractC78928a.class, (String) null)).getAVAppPlayingVideoViewProxy();
    }

    /* renamed from: b */
    private static List<MvThemeData> m137595b(List<MvThemeData> list) {
        if (!AVCommerceServiceImpl.m102988h().mo93962a()) {
            return list;
        }
        if (C84904k.m145909a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (MvThemeData mvThemeData : list) {
            if (mvThemeData.f177201r) {
                arrayList.add(mvThemeData);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122646a(MvThemeData mvThemeData) {
        if (mvThemeData == null || mvThemeData.f177184a == null) {
            mo122649a(true);
        } else {
            mo122649a(!this.f177143B.mo122766a(mvThemeData.f177184a));
        }
    }

    /* renamed from: a */
    public final void mo122647a(Boolean bool) {
        float b;
        int b2 = (int) C13628n.m24520b(getContext(), 16.0f);
        CircularAnimateButton circularAnimateButton = this.f177153f;
        if (circularAnimateButton != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) circularAnimateButton.getLayoutParams();
            if (bool.booleanValue()) {
                b = ((float) b2) + C13628n.m24520b(getContext(), 65.0f);
            } else {
                b = C13628n.m24520b(getContext(), 65.0f);
            }
            layoutParams.bottomMargin = (int) b;
            this.f177153f.setLayoutParams(layoutParams);
        }
    }

    @AbstractC90264r
    public void handleSelectEvent(C78962g gVar) {
        if (gVar.f177471a == C78962g.EnumC78964b.START) {
            this.f177147F = gVar.f177472b;
        } else if (!(this.f177147F == null || gVar.f177472b == this.f177147F)) {
            return;
        }
        int i = C788347.f177183a[gVar.f177472b.ordinal()];
        if (i != 1) {
            if (i == 2 && gVar.f177471a == C78962g.EnumC78964b.SCROLL) {
                this.f177151d.mo122804a(gVar.f177473c, gVar.f177474d, false);
            }
        } else if (gVar.f177471a == C78962g.EnumC78964b.SCROLL) {
            float f = gVar.f177474d;
            this.f177161n.scrollTo((int) ((((float) gVar.f177473c) + f) * ((float) (getItemWidth() + this.f177145D))), 0);
            if (gVar.f177473c != this.f177161n.getCurrentItem() && ((double) f) < 0.01d) {
                this.f177161n.setCurrentItem(gVar.f177473c);
            }
            C78957b b = this.f177162o.mo3649a(gVar.f177473c);
            if (b != null) {
                this.f177144C.mo122761b(b.getView(), f);
                int i2 = gVar.f177473c + 1;
                if (i2 < this.f177162o.getCount()) {
                    this.f177144C.mo122761b(this.f177162o.mo3649a(i2).getView(), 1.0f - f);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo122648a(List<MvThemeData> list) {
        List<MvThemeData> b = m137595b(list);
        if (!C84904k.m145909a(b)) {
            if (this.f177166s) {
                if (this.f177158k) {
                    this.f177164q.f177534a.clear();
                    this.f177164q.f177537d = true;
                    this.f177163p = 0;
                }
                this.f177167t = false;
                int size = this.f177164q.f177534a.size();
                this.f177164q.f177534a.addAll(b);
                if (this.f177151d.mo4484l()) {
                    this.f177151d.post(new RunnableC78968k(this, size, b));
                } else if (size == 0) {
                    this.f177164q.notifyDataSetChanged();
                } else {
                    this.f177164q.notifyItemRangeInserted(size + 1, b.size());
                }
            }
            if (getDataCount() == 0 || this.f177158k) {
                this.f177161n.setAdapter(this.f177162o);
                this.f177162o.mo122757a(b);
                if (this.f177150c != null && !C84904k.m145909a(b)) {
                    this.f177150c.setText("1/" + b.size());
                    MvThemeData mvThemeData = b.get(0);
                    if (mvThemeData != null) {
                        if (!TextUtils.isEmpty(mvThemeData.mo122672f())) {
                            this.f177148a.setText(mvThemeData.mo122672f());
                        }
                        if (!TextUtils.isEmpty(mvThemeData.mo122674h())) {
                            this.f177149b.setText(mvThemeData.mo122674h());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.f177162o.mo122759b(b);
        }
    }

    /* renamed from: a */
    public final void mo122649a(boolean z) {
        if (z) {
            CircularAnimateButton circularAnimateButton = this.f177153f;
            circularAnimateButton.setText(circularAnimateButton.getContext().getResources().getString(R.string.f83));
            this.f177153f.setClickable(true);
            return;
        }
        CircularAnimateButton circularAnimateButton2 = this.f177153f;
        circularAnimateButton2.setText(circularAnimateButton2.getContext().getResources().getString(R.string.z3));
        this.f177153f.setClickable(false);
    }

    public MvTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f;
        MethodCollector.m26663i(5137);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof ActivityC0945e) {
                this.f177142A = (ActivityC0945e) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        this.f177173z = C0643b.m2378c(context, R.color.bh);
        this.f177166s = false;
        setClipChildren(false);
        setBackgroundColor(Color.parseColor("#C0000000"));
        LayoutInflater.from(context).inflate(R.layout.agi, this);
        this.f177148a = (TextView) findViewById(R.id.eh7);
        this.f177149b = (TextView) findViewById(R.id.eh6);
        this.f177150c = (TextView) findViewById(R.id.af0);
        this.f177151d = (MvThumbnailRecyclerView) findViewById(R.id.doj);
        this.f177171x = (ViewGroup) findViewById(R.id.c7c);
        this.f177153f = (CircularAnimateButton) findViewById(R.id.e6h);
        this.f177156i = findViewById(R.id.ade);
        this.f177157j = (DmtLoadingLayout) findViewById(R.id.cfq);
        this.f177152e = findViewById(R.id.cz5);
        this.f177172y = findViewById(R.id.fgp);
        this.f177153f.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788281 */

            static {
                Covode.recordClassIndex(91974);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                MvTemplateView mvTemplateView = MvTemplateView.this;
                MvThemeData c = mvTemplateView.f177162o.mo122760c(mvTemplateView.f177155h);
                if (mvTemplateView.f177160m != null && mvTemplateView.f177160m.mo122729a(c)) {
                    MvTemplateView.this.mo122650b();
                }
            }
        });
        this.f177159l = findViewById(R.id.cp7);
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41573g);
        if (a != null) {
            this.f177153f.setTypeface(a);
        }
        this.f177159l.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788292 */

            static {
                Covode.recordClassIndex(91975);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                if (MvTemplateView.this.f177160m != null) {
                    MvTemplateView.this.f177160m.mo122727a(MvTemplateView.this.f177162o.mo122760c(MvTemplateView.this.f177155h), 2, MvTemplateView.this.f177155h);
                }
            }
        });
        this.f177148a.setSelected(true);
        this.f177149b.setSelected(true);
        if (this.f177166s) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f177152e.getLayoutParams();
            layoutParams.topMargin = (int) (((float) C70636dh.m124833c(getContext())) + C13628n.m24520b(getContext(), 32.0f));
            this.f177152e.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f177152e.getLayoutParams();
            layoutParams2.topMargin = (int) (((float) C70636dh.m124833c(getContext())) + C13628n.m24520b(getContext(), 68.5f));
            this.f177152e.setLayoutParams(layoutParams2);
        }
        MvThemeListViewPager mvThemeListViewPager = (MvThemeListViewPager) findViewById(R.id.fgn);
        this.f177161n = mvThemeListViewPager;
        mvThemeListViewPager.setOffscreenPageLimit(3);
        C78916i iVar = new C78916i(this.f177161n.getContext());
        MvThemeListViewPager mvThemeListViewPager2 = this.f177161n;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(mvThemeListViewPager2, iVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        iVar.f177388a = 500;
        if (this.f177166s) {
            f = 0.0f;
        } else {
            f = 0.6f;
        }
        this.f177144C = new C78961f(f);
        int b = (int) C13628n.m24520b(this.f177142A, 16.0f);
        this.f177145D = b;
        this.f177161n.setPageMargin(b);
        this.f177161n.setPageTransformer(true, this.f177144C);
        this.f177161n.setBounceScrollListener(new MvThemeListViewPager.AbstractC79007a() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788303 */

            static {
                Covode.recordClassIndex(91976);
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.AbstractC79007a
            /* renamed from: a */
            public final void mo122662a() {
                MvTemplateView.this.f177148a.setAlpha(1.0f);
                MvTemplateView.this.f177149b.setAlpha(1.0f);
            }

            @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager.AbstractC79007a
            /* renamed from: a */
            public final void mo122663a(float f) {
                C78957b b;
                if (MvTemplateView.this.f177163p == 0 && (b = MvTemplateView.this.f177162o.mo3649a(0)) != null) {
                    MvTemplateView.this.f177163p = b.mo122751d();
                }
                if (MvTemplateView.this.f177163p > 0 && f < 0.0f) {
                    float abs = 1.0f - ((Math.abs(f) / ((float) MvTemplateView.this.f177163p)) * 2.0f);
                    MvTemplateView.this.f177148a.setAlpha(abs);
                    MvTemplateView.this.f177149b.setAlpha(abs);
                }
            }
        });
        C78960e eVar = new C78960e(this.f177142A.getSupportFragmentManager());
        this.f177162o = eVar;
        this.f177161n.setAdapter(eVar);
        this.f177161n.addOnPageChangeListener(new ViewPager.AbstractC1579e() {
            /* class com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvTemplateView.C788314 */

            static {
                Covode.recordClassIndex(91977);
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageSelected(int i) {
                MvThemeData c = MvTemplateView.this.f177162o.mo122760c(i);
                if (c != null) {
                    if (MvTemplateView.this.f177154g != i) {
                        MvTemplateView mvTemplateView = MvTemplateView.this;
                        int i2 = mvTemplateView.f177154g;
                        mvTemplateView.f177148a.setText(c.mo122672f());
                        mvTemplateView.f177149b.setText(c.mo122674h());
                        mvTemplateView.f177150c.setText((i + 1) + "/" + mvTemplateView.f177162o.getCount());
                        C78957b a = mvTemplateView.mo122644a(i2);
                        if (!(a == null || a.f177455d == null)) {
                            a.mo122754g();
                        }
                        C78957b a2 = mvTemplateView.mo122644a(i);
                        if (!(a2 == null || a2.f177455d == null)) {
                            a2.mo122752e();
                        }
                        mvTemplateView.mo122646a(c);
                        if (mvTemplateView.f177160m != null) {
                            mvTemplateView.f177160m.mo122727a(c, 3, i);
                        }
                    }
                    MvTemplateView.this.f177154g = i;
                }
                MvTemplateView.this.f177155h = i;
                if (MvTemplateView.this.f177166s && MvTemplateView.this.f177167t) {
                    MvTemplateView.this.f177165r.mo122688a();
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
            public final void onPageScrolled(int i, float f, int i2) {
                AbstractC81915c.m141874a(new C78962g(C78962g.EnumC78964b.SCROLL, C78962g.EnumC78963a.MAIN_TEMPLATE, i, f));
            }
        });
        this.f177161n.setHandleClickChange(true ^ this.f177166s);
        this.f177172y.setOnTouchListener(new View$OnTouchListenerC78967j(this));
        if (this.f177166s) {
            this.f177171x.setVisibility(0);
            C79000a aVar = new C79000a();
            this.f177164q = aVar;
            aVar.f177535b = new C78965h(this);
            this.f177164q.f177536c = new C78966i(this);
            this.f177151d.setAdapter(this.f177164q);
        }
        this.f177153f.setBackgroundColor(this.f177173z);
        MethodCollector.m26664o(5137);
    }
}

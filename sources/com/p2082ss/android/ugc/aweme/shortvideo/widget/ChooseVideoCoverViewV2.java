package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.AbstractC0706b;
import androidx.core.graphics.drawable.C0708d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2 */
public final class ChooseVideoCoverViewV2 extends FrameLayout {

    /* renamed from: a */
    public C74302q f166763a;

    /* renamed from: b */
    public AbstractC74239a f166764b;

    /* renamed from: c */
    public final C88960c<MotionEvent> f166765c;

    /* renamed from: d */
    private int f166766d;

    /* renamed from: e */
    private int f166767e;

    /* renamed from: f */
    private int f166768f;

    /* renamed from: g */
    private RecyclerView f166769g;

    /* renamed from: h */
    private View f166770h;

    /* renamed from: i */
    private final AbstractC88979t<MotionEvent> f166771i;

    /* renamed from: j */
    private final AbstractC88979t<MotionEvent> f166772j;

    /* renamed from: k */
    private final AbstractC88979t<MotionEvent> f166773k;

    /* renamed from: l */
    private final AbstractC88979t<MotionEvent> f166774l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$a */
    public interface AbstractC74239a {
        static {
            Covode.recordClassIndex(87001);
        }

        /* renamed from: a */
        void mo110428a(float f);

        /* renamed from: b */
        void mo110433b(float f);

        /* renamed from: c */
        void mo110435c();
    }

    static {
        Covode.recordClassIndex(86995);
    }

    public ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getCoverSize() {
        return this.f166766d;
    }

    public final int getCurPage() {
        return this.f166768f;
    }

    public final int getItemCount() {
        return this.f166766d;
    }

    public final RecyclerView getRecyclerView() {
        return this.f166769g;
    }

    public final View getShadowView() {
        return this.f166770h;
    }

    public final int getTotalPage() {
        return this.f166767e;
    }

    public final C74302q getVideoCoverView() {
        return this.f166763a;
    }

    public final RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> getAdapter() {
        return this.f166769g.getAdapter();
    }

    public final float getVideoCoverViewX() {
        return this.f166763a.getX();
    }

    public final float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / (this.f166766d / this.f166767e));
    }

    private final float getOneThumbHeight() {
        return ((float) this.f166763a.getHeight()) - (C13628n.m24520b(getContext(), 2.0f) * 2.0f);
    }

    public final void setCurPage(int i) {
        this.f166768f = i;
    }

    public final void setItemCount(int i) {
        this.f166766d = i;
    }

    public final void setTotalPage(int i) {
        this.f166767e = i;
    }

    public final void setOnScrollListener(AbstractC74239a aVar) {
        C89219l.m154721d(aVar, "");
        this.f166764b = aVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f166769g = recyclerView;
    }

    public final void setShadowView(View view) {
        C89219l.m154721d(view, "");
        this.f166770h = view;
    }

    public final void setVideoCoverView(C74302q qVar) {
        C89219l.m154721d(qVar, "");
        this.f166763a = qVar;
    }

    public final void setAdapter(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        C89219l.m154721d(aVar, "");
        this.f166769g.setAdapter(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$b */
    static final class C74240b<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C74240b f166780a = new C74240b();

        static {
            Covode.recordClassIndex(87002);
        }

        C74240b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C89219l.m154721d(motionEvent, "");
            if (motionEvent.getActionMasked() == 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$c */
    static final class C74241c<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C74241c f166781a = new C74241c();

        static {
            Covode.recordClassIndex(87003);
        }

        C74241c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C89219l.m154721d(motionEvent, "");
            if (motionEvent.getActionMasked() == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$d */
    static final class C74242d<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C74242d f166782a = new C74242d();

        static {
            Covode.recordClassIndex(87004);
        }

        C74242d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C89219l.m154721d(motionEvent, "");
            if (motionEvent.getActionMasked() == 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2$e */
    static final class C74243e<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C74243e f166783a = new C74243e();

        static {
            Covode.recordClassIndex(87005);
        }

        C74243e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            MotionEvent motionEvent = (MotionEvent) obj;
            C89219l.m154721d(motionEvent, "");
            if (motionEvent.getActionMasked() == 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo116718a(float f) {
        this.f166763a.animate().scaleX(f).scaleY(f).setDuration(100).start();
    }

    /* renamed from: a */
    public final void mo116719a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (x <= getOneThumbWidth() / 2.0f) {
            this.f166763a.setX(0.0f);
        } else if (x >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
            this.f166763a.setX(((float) getMeasuredWidth()) - getOneThumbWidth());
        } else {
            this.f166763a.setX(x - (getOneThumbWidth() / 2.0f));
        }
    }

    /* renamed from: b */
    public final float mo116720b(MotionEvent motionEvent) {
        float x;
        float oneThumbWidth;
        float f;
        if (motionEvent.getX() <= getOneThumbWidth() / 2.0f) {
            f = 0.0f;
        } else {
            if (motionEvent.getX() >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
                x = (float) getMeasuredWidth();
                oneThumbWidth = getOneThumbWidth();
            } else {
                x = motionEvent.getX();
                oneThumbWidth = getOneThumbWidth() / 2.0f;
            }
            f = x - oneThumbWidth;
        }
        float measuredWidth = f / (((float) getMeasuredWidth()) - getOneThumbWidth());
        if (measuredWidth > 0.9f) {
            measuredWidth = 0.9f;
        }
        return (1.0f / ((float) this.f166767e)) * (((float) this.f166768f) + measuredWidth);
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        int i;
        int i2;
        MethodCollector.m26663i(10464);
        C89219l.m154721d(bitmap, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float oneThumbWidth = getOneThumbWidth();
        float oneThumbHeight = getOneThumbHeight();
        if (((float) height) * oneThumbWidth > ((float) width) * oneThumbHeight) {
            i = (int) oneThumbHeight;
            i2 = (width * i) / height;
        } else {
            int i3 = (int) oneThumbWidth;
            i = (height * i3) / width;
            i2 = i3;
        }
        C74302q qVar = this.f166763a;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i, true);
        int min = Math.min(i2, i);
        int i4 = (int) ((((float) min) * oneThumbHeight) / oneThumbWidth);
        int max = Math.max((i2 - min) / 2, 0);
        int max2 = Math.max((i - i4) / 2, 0);
        if (max + min > i2 || max2 + i4 > i) {
            qVar.setImageBitmap(createScaledBitmap);
            MethodCollector.m26664o(10464);
            return;
        }
        AbstractC0706b a = C0708d.m2514a(qVar.getResources(), Bitmap.createBitmap(createScaledBitmap, max, max2, min, i4));
        a.mo2738a(C13628n.m24520b(qVar.getContext(), 4.0f));
        qVar.setImageDrawable(a);
        MethodCollector.m26664o(10464);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(10462);
        super.onMeasure(i, i2);
        this.f166763a.mo116907a(getMeasuredWidth() / (this.f166766d / this.f166767e), getMeasuredHeight());
        MethodCollector.m26664o(10462);
    }

    private /* synthetic */ ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChooseVideoCoverViewV2(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10629);
        this.f166766d = 7;
        this.f166767e = 1;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        this.f166769g = recyclerView;
        C74302q qVar = new C74302q(context);
        qVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qVar.setColor(C0643b.m2378c(context, R.color.bh));
        this.f166763a = qVar;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.q0);
        this.f166770h = view;
        C88960c<MotionEvent> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f166765c = cVar;
        AbstractC88979t<MotionEvent> a = cVar.mo143268a(C74241c.f166781a);
        this.f166771i = a;
        AbstractC88979t<MotionEvent> a2 = cVar.mo143268a(C74242d.f166782a);
        this.f166772j = a2;
        AbstractC88979t<MotionEvent> a3 = cVar.mo143268a(C74243e.f166783a);
        this.f166773k = a3;
        AbstractC88979t<MotionEvent> a4 = cVar.mo143268a(C74240b.f166780a);
        this.f166774l = a4;
        addView(this.f166769g, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f166770h, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f166763a);
        setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.View$OnTouchListenerC742341 */

            /* renamed from: a */
            final /* synthetic */ ChooseVideoCoverViewV2 f166775a;

            static {
                Covode.recordClassIndex(86996);
            }

            {
                this.f166775a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f166775a.f166765c.onNext(motionEvent);
                return true;
            }
        });
        a.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.C742352 */

            /* renamed from: a */
            final /* synthetic */ ChooseVideoCoverViewV2 f166776a;

            static {
                Covode.recordClassIndex(86997);
            }

            {
                this.f166776a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f166776a.mo116718a(1.2f);
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f166776a;
                C89219l.m154716b(motionEvent, "");
                chooseVideoCoverViewV2.mo116719a(motionEvent);
                AbstractC74239a aVar = this.f166776a.f166764b;
                if (aVar != null) {
                    this.f166776a.mo116720b(motionEvent);
                    aVar.mo110435c();
                }
            }
        });
        a2.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.C742363 */

            /* renamed from: a */
            final /* synthetic */ ChooseVideoCoverViewV2 f166777a;

            static {
                Covode.recordClassIndex(86998);
            }

            {
                this.f166777a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f166777a;
                C89219l.m154716b(motionEvent, "");
                chooseVideoCoverViewV2.mo116719a(motionEvent);
                AbstractC74239a aVar = this.f166777a.f166764b;
                if (aVar != null) {
                    aVar.mo110428a(this.f166777a.mo116720b(motionEvent));
                }
            }
        });
        a3.mo143291d(200, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.C742374 */

            /* renamed from: a */
            final /* synthetic */ ChooseVideoCoverViewV2 f166778a;

            static {
                Covode.recordClassIndex(86999);
            }

            {
                this.f166778a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f166778a.mo116718a(1.0f);
                ChooseVideoCoverViewV2 chooseVideoCoverViewV2 = this.f166778a;
                C89219l.m154716b(motionEvent, "");
                chooseVideoCoverViewV2.mo116719a(motionEvent);
                AbstractC74239a aVar = this.f166778a.f166764b;
                if (aVar != null) {
                    aVar.mo110433b(this.f166778a.mo116720b(motionEvent));
                }
            }
        });
        a4.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverViewV2.C742385 */

            /* renamed from: a */
            final /* synthetic */ ChooseVideoCoverViewV2 f166779a;

            static {
                Covode.recordClassIndex(87000);
            }

            {
                this.f166779a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f166779a.mo116718a(1.0f);
            }
        });
        MethodCollector.m26664o(10629);
    }
}

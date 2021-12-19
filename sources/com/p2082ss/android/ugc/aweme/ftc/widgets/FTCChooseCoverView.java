package com.p2082ss.android.ugc.aweme.ftc.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74302q;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView */
public final class FTCChooseCoverView extends FrameLayout {

    /* renamed from: a */
    public C74302q f121500a;

    /* renamed from: b */
    public AbstractC52809a f121501b;

    /* renamed from: c */
    public final C88960c<MotionEvent> f121502c;

    /* renamed from: d */
    private int f121503d;

    /* renamed from: e */
    private RecyclerView f121504e;

    /* renamed from: f */
    private View f121505f;

    /* renamed from: g */
    private final AbstractC88979t<MotionEvent> f121506g;

    /* renamed from: h */
    private final AbstractC88979t<MotionEvent> f121507h;

    /* renamed from: i */
    private final AbstractC88979t<MotionEvent> f121508i;

    /* renamed from: j */
    private final AbstractC88979t<MotionEvent> f121509j;

    /* renamed from: com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView$a */
    public interface AbstractC52809a {
        static {
            Covode.recordClassIndex(62209);
        }

        /* renamed from: a */
        void mo88435a(float f);

        /* renamed from: b */
        void mo88438b(float f);

        /* renamed from: d */
        void mo88442d();
    }

    static {
        Covode.recordClassIndex(62203);
    }

    public FTCChooseCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final int getCoverSize() {
        return this.f121503d;
    }

    public final RecyclerView getRecyclerView() {
        return this.f121504e;
    }

    public final C74302q getVideoCoverView() {
        return this.f121500a;
    }

    public final float getVideoCoverViewX() {
        return this.f121500a.getX();
    }

    public final float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / this.f121503d);
    }

    private final float getOneThumbHeight() {
        return ((float) this.f121500a.getHeight()) - (C13628n.m24520b(getContext(), 2.0f) * 2.0f);
    }

    public final void setOnScrollListener(AbstractC52809a aVar) {
        C89219l.m154721d(aVar, "");
        this.f121501b = aVar;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f121504e = recyclerView;
    }

    public final void setVideoCoverView(C74302q qVar) {
        C89219l.m154721d(qVar, "");
        this.f121500a = qVar;
    }

    public final void setAdapter(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        C89219l.m154721d(aVar, "");
        this.f121504e.setAdapter(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView$b */
    static final class C52810b<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C52810b f121515a = new C52810b();

        static {
            Covode.recordClassIndex(62210);
        }

        C52810b() {
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView$c */
    static final class C52811c<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C52811c f121516a = new C52811c();

        static {
            Covode.recordClassIndex(62211);
        }

        C52811c() {
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView$d */
    static final class C52812d<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C52812d f121517a = new C52812d();

        static {
            Covode.recordClassIndex(62212);
        }

        C52812d() {
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView$e */
    static final class C52813e<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C52813e f121518a = new C52813e();

        static {
            Covode.recordClassIndex(62213);
        }

        C52813e() {
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
    public final void mo88460a(float f) {
        this.f121500a.animate().scaleX(f).scaleY(f).setDuration(100).start();
    }

    public final void setVideoCoverFrameView(Bitmap bitmap) {
        int i;
        int i2;
        MethodCollector.m26663i(7218);
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
        this.f121500a.setImageBitmap(Bitmap.createScaledBitmap(bitmap, i2, i, true));
        MethodCollector.m26664o(7218);
    }

    /* renamed from: a */
    public final void mo88461a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (x <= getOneThumbWidth() / 2.0f) {
            this.f121500a.setX(0.0f);
        } else if (x >= ((float) getMeasuredWidth()) - (getOneThumbWidth() / 2.0f)) {
            this.f121500a.setX(((float) getMeasuredWidth()) - getOneThumbWidth());
        } else {
            this.f121500a.setX(x - (getOneThumbWidth() / 2.0f));
        }
    }

    /* renamed from: b */
    public final float mo88462b(MotionEvent motionEvent) {
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
            return 0.9f;
        }
        return measuredWidth;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7216);
        super.onMeasure(i, i2);
        this.f121500a.mo116907a(getMeasuredWidth() / this.f121503d, getMeasuredHeight());
        MethodCollector.m26664o(7216);
    }

    private /* synthetic */ FTCChooseCoverView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FTCChooseCoverView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7362);
        this.f121503d = 7;
        RecyclerView recyclerView = new RecyclerView(context, attributeSet);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setHasFixedSize(true);
        this.f121504e = recyclerView;
        C74302q qVar = new C74302q(context);
        qVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qVar.setColor(C0643b.m2378c(context, R.color.bh));
        this.f121500a = qVar;
        View view = new View(context, attributeSet);
        view.setBackgroundResource(R.drawable.q0);
        this.f121505f = view;
        C88960c<MotionEvent> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f121502c = cVar;
        AbstractC88979t<MotionEvent> a = cVar.mo143268a(C52811c.f121516a);
        this.f121506g = a;
        AbstractC88979t<MotionEvent> a2 = cVar.mo143268a(C52812d.f121517a);
        this.f121507h = a2;
        AbstractC88979t<MotionEvent> a3 = cVar.mo143268a(C52813e.f121518a);
        this.f121508i = a3;
        AbstractC88979t<MotionEvent> a4 = cVar.mo143268a(C52810b.f121515a);
        this.f121509j = a4;
        addView(this.f121504e, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f121505f, new FrameLayout.LayoutParams(-1, -1));
        addView(this.f121500a);
        setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.View$OnTouchListenerC528041 */

            /* renamed from: a */
            final /* synthetic */ FTCChooseCoverView f121510a;

            static {
                Covode.recordClassIndex(62204);
            }

            {
                this.f121510a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f121510a.f121502c.onNext(motionEvent);
                return true;
            }
        });
        a.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.C528052 */

            /* renamed from: a */
            final /* synthetic */ FTCChooseCoverView f121511a;

            static {
                Covode.recordClassIndex(62205);
            }

            {
                this.f121511a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f121511a.mo88460a(1.2f);
                FTCChooseCoverView fTCChooseCoverView = this.f121511a;
                C89219l.m154716b(motionEvent, "");
                fTCChooseCoverView.mo88461a(motionEvent);
                AbstractC52809a aVar = this.f121511a.f121501b;
                if (aVar != null) {
                    this.f121511a.mo88462b(motionEvent);
                    aVar.mo88442d();
                }
            }
        });
        a2.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.C528063 */

            /* renamed from: a */
            final /* synthetic */ FTCChooseCoverView f121512a;

            static {
                Covode.recordClassIndex(62206);
            }

            {
                this.f121512a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                FTCChooseCoverView fTCChooseCoverView = this.f121512a;
                C89219l.m154716b(motionEvent, "");
                fTCChooseCoverView.mo88461a(motionEvent);
                AbstractC52809a aVar = this.f121512a.f121501b;
                if (aVar != null) {
                    aVar.mo88435a(this.f121512a.mo88462b(motionEvent));
                }
            }
        });
        a3.mo143291d(200, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.C528074 */

            /* renamed from: a */
            final /* synthetic */ FTCChooseCoverView f121513a;

            static {
                Covode.recordClassIndex(62207);
            }

            {
                this.f121513a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                MotionEvent motionEvent = (MotionEvent) obj;
                this.f121513a.mo88460a(1.0f);
                FTCChooseCoverView fTCChooseCoverView = this.f121513a;
                C89219l.m154716b(motionEvent, "");
                fTCChooseCoverView.mo88461a(motionEvent);
                AbstractC52809a aVar = this.f121513a.f121501b;
                if (aVar != null) {
                    aVar.mo88438b(this.f121513a.mo88462b(motionEvent));
                }
            }
        });
        a4.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView.C528085 */

            /* renamed from: a */
            final /* synthetic */ FTCChooseCoverView f121514a;

            static {
                Covode.recordClassIndex(62208);
            }

            {
                this.f121514a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f121514a.mo88460a(1.0f);
            }
        });
        MethodCollector.m26664o(7362);
    }
}

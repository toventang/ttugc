package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView */
public class ChooseVideoCoverView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    private int f166742a;

    /* renamed from: b */
    private RecyclerView f166743b;

    /* renamed from: c */
    private C74302q f166744c;

    /* renamed from: d */
    private Context f166745d;

    /* renamed from: e */
    private float f166746e;

    /* renamed from: f */
    private float f166747f;

    /* renamed from: g */
    private View f166748g;

    /* renamed from: h */
    private View f166749h;

    /* renamed from: i */
    private FrameLayout.LayoutParams f166750i;

    /* renamed from: j */
    private FrameLayout.LayoutParams f166751j;

    /* renamed from: k */
    private int f166752k;

    /* renamed from: l */
    private int f166753l;

    /* renamed from: m */
    private AbstractC74233b f166754m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$b */
    public interface AbstractC74233b {
        static {
            Covode.recordClassIndex(86994);
        }
    }

    static {
        Covode.recordClassIndex(86991);
    }

    public int getCoverSize() {
        return this.f166742a;
    }

    public int getFrameHeight() {
        return this.f166753l;
    }

    public int getFrameWidth() {
        return this.f166752k;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$a */
    public static class C74231a extends RecyclerView.AbstractC1350a<C74232a> {

        /* renamed from: a */
        C74297p f166755a;

        /* renamed from: b */
        C89378p[] f166756b;

        /* renamed from: c */
        boolean f166757c = true;

        /* renamed from: d */
        AbstractC88412b f166758d;

        /* renamed from: e */
        private int f166759e;

        /* renamed from: f */
        private int f166760f;

        /* renamed from: g */
        private boolean f166761g;

        static {
            Covode.recordClassIndex(86992);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C74232a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m130504a(this, viewGroup, i);
        }

        /* renamed from: b */
        public final void mo116717b() {
            this.f166758d.dispose();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f166755a.f167074a;
        }

        /* renamed from: a */
        public final void mo116715a() {
            this.f166758d = this.f166755a.mo116905a().mo143289d(new C74279d(this));
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView$a$a */
        public static class C74232a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public ImageView f166762a;

            static {
                Covode.recordClassIndex(86993);
            }

            public C74232a(View view) {
                super(view);
                this.f166762a = (ImageView) view.findViewById(R.id.c0f);
            }
        }

        /* renamed from: a */
        public final void mo116716a(boolean z) {
            if (this.f166761g ^ z) {
                this.f166761g = z;
                notifyDataSetChanged();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C74232a aVar, int i) {
            C89378p pVar;
            Bitmap bitmap;
            int i2;
            C74232a aVar2 = aVar;
            int itemCount = getItemCount();
            if (this.f166761g && (itemCount - i) - 1 >= 0 && i2 < itemCount) {
                i = i2;
            }
            C89378p pVar2 = this.f166756b[i];
            if ((pVar2 == null || (bitmap = (Bitmap) pVar2.getSecond()) == null || bitmap.isRecycled()) && ((pVar = this.f166756b[0]) == null || (bitmap = (Bitmap) pVar.getSecond()) == null || bitmap.isRecycled())) {
                bitmap = null;
            }
            aVar2.f166762a.setImageBitmap(bitmap);
            aVar2.f166762a.setPadding(0, 0, 0, 0);
        }

        public C74231a(C74297p pVar, int i, int i2) {
            this.f166755a = pVar;
            this.f166759e = i;
            this.f166760f = i2;
            this.f166756b = new C89378p[pVar.f167074a];
            mo116715a();
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m130504a(C74231a aVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(10750);
            ImageView imageView = (ImageView) C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2x, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = aVar.f166760f;
            layoutParams.width = aVar.f166759e;
            imageView.setLayoutParams(layoutParams);
            C74232a aVar2 = new C74232a(imageView);
            try {
                if (aVar2.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(aVar2.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = aVar2.getClass().getName();
            MethodCollector.m26664o(10750);
            return aVar2;
        }
    }

    public RecyclerView.AbstractC1350a getAdapter() {
        return this.f166743b.getAdapter();
    }

    public float getOneThumbWidth() {
        return (float) (getMeasuredWidth() / this.f166742a);
    }

    /* renamed from: a */
    public final void mo116701a() {
        C74302q qVar = this.f166744c;
        if (qVar != null) {
            qVar.setOnTouchListener(null);
            this.f166744c.setVisibility(8);
        }
    }

    public float getOneThumbHeight() {
        return ((float) this.f166744c.getHeight()) - (C13628n.m24520b(getContext(), 2.0f) * 2.0f);
    }

    public void setCoverSize(int i) {
        this.f166742a = i;
    }

    public void setOnScrollListener(AbstractC74233b bVar) {
        this.f166754m = bVar;
    }

    /* renamed from: b */
    private void m130498b(float f) {
        if (this.f166754m != null) {
            m130496a(f);
        }
    }

    /* renamed from: c */
    private void m130500c(float f) {
        if (this.f166754m != null) {
            m130496a(f);
        }
    }

    /* renamed from: d */
    private void m130501d(float f) {
        if (this.f166754m != null) {
            m130496a(f);
        }
    }

    public void setAdapter(RecyclerView.AbstractC1350a aVar) {
        this.f166743b.setAdapter(aVar);
    }

    public void setLayoutManager(RecyclerView.AbstractC1362i iVar) {
        this.f166743b.setLayoutManager(iVar);
    }

    /* renamed from: a */
    private float m130496a(float f) {
        return f / ((float) (this.f166744c.getWidth() * this.f166742a));
    }

    /* renamed from: b */
    private void m130499b(MotionEvent motionEvent) {
        float a = m130497a(motionEvent);
        this.f166744c.animate().x(a).y(this.f166744c.getY()).setDuration(0).start();
        m130502e(a);
        m130501d(a);
    }

    /* renamed from: e */
    private void m130502e(float f) {
        this.f166750i.width = (int) (f - 0.0f);
        this.f166748g.setLayoutParams(this.f166750i);
        this.f166751j.width = (int) ((((float) getMeasuredWidth()) - f) + ((float) this.f166744c.getWidth()));
        this.f166749h.setX(f + ((float) this.f166744c.getWidth()));
        this.f166749h.setLayoutParams(this.f166751j);
    }

    public void setVideoCoverFrameView(Bitmap bitmap) {
        MethodCollector.m26663i(11190);
        if (bitmap == null) {
            MethodCollector.m26664o(11190);
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int oneThumbWidth = (int) getOneThumbWidth();
        int oneThumbHeight = (int) getOneThumbHeight();
        int i = height * oneThumbWidth;
        int i2 = width * oneThumbHeight;
        if (i > i2) {
            oneThumbWidth = i2 / height;
        } else {
            oneThumbHeight = i / width;
        }
        this.f166744c.setImageBitmap(Bitmap.createScaledBitmap(bitmap, oneThumbWidth, oneThumbHeight, true));
        MethodCollector.m26664o(11190);
    }

    /* renamed from: a */
    private float m130497a(MotionEvent motionEvent) {
        this.f166746e = (float) ((ViewGroup) getParent()).getPaddingLeft();
        this.f166747f = (float) getPaddingLeft();
        float rawX = (this.f166747f + (motionEvent.getRawX() - this.f166746e)) - (((float) this.f166744c.getWidth()) / 2.0f);
        if (rawX > ((float) (this.f166744c.getWidth() * (this.f166742a - 1)))) {
            rawX = (float) (this.f166744c.getWidth() * (this.f166742a - 1));
        }
        if (rawX < 0.0f) {
            return 0.0f;
        }
        return rawX;
    }

    public ChooseVideoCoverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(11041);
        super.onMeasure(i, i2);
        this.f166744c.mo116907a(getMeasuredWidth() / this.f166742a, getMeasuredHeight());
        m130502e(this.f166744c.getX());
        MethodCollector.m26664o(11041);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str = (String) view.getTag();
        if (str == null) {
            return false;
        }
        if (str.equals("tag_VideoCoverFrameView")) {
            int action = motionEvent.getAction();
            if (action == 0) {
                m130498b(m130497a(motionEvent));
            } else if (action == 1) {
                m130500c(m130497a(motionEvent));
            } else if (action == 2) {
                m130499b(motionEvent);
            }
            return true;
        } else if (!str.equals("tag_RecyclerView")) {
            return super.onTouchEvent(motionEvent);
        } else {
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                m130498b(m130497a(motionEvent));
            } else if (action2 == 1) {
                m130499b(motionEvent);
                m130500c(m130497a(motionEvent));
            }
            return true;
        }
    }

    private ChooseVideoCoverView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10894);
        this.f166742a = 7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.q9, R.attr.qp, R.attr.qq, R.attr.ux, R.attr.uy, R.attr.a1t, R.attr.a5e, R.attr.a5f, R.attr.a69, R.attr.a7h, R.attr.abt, R.attr.act, R.attr.af6});
            this.f166752k = Math.round(obtainStyledAttributes.getDimension(4, 0.0f));
            this.f166753l = Math.round(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f166745d = context;
        RecyclerView recyclerView = new RecyclerView(this.f166745d);
        this.f166743b = recyclerView;
        recyclerView.setTag("tag_RecyclerView");
        this.f166743b.setOnTouchListener(this);
        addView(this.f166743b, new FrameLayout.LayoutParams(-1, -1));
        C74302q qVar = new C74302q(this.f166745d);
        this.f166744c = qVar;
        qVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f166744c.setColor(C0643b.m2378c(getContext(), R.color.bh));
        this.f166744c.setTag("tag_VideoCoverFrameView");
        this.f166744c.setOnTouchListener(this);
        addView(this.f166744c);
        this.f166748g = new View(this.f166745d);
        this.f166750i = new FrameLayout.LayoutParams(-1, -1);
        this.f166748g.setBackgroundResource(R.drawable.q0);
        this.f166749h = new View(this.f166745d);
        this.f166751j = new FrameLayout.LayoutParams(-1, -1);
        this.f166749h.setBackgroundResource(R.drawable.q0);
        MethodCollector.m26664o(10894);
    }
}

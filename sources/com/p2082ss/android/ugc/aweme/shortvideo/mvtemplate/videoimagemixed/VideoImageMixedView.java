package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView */
public final class VideoImageMixedView extends FrameLayout {

    /* renamed from: b */
    public static final C72418b f162337b = new C72418b((byte) 0);

    /* renamed from: a */
    public RecyclerView f162338a;

    /* renamed from: c */
    private View f162339c;

    /* renamed from: d */
    private TextView f162340d;

    /* renamed from: e */
    private TextView f162341e;

    static {
        Covode.recordClassIndex(85089);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$b */
    public static final class C72418b {
        static {
            Covode.recordClassIndex(85092);
        }

        private C72418b() {
        }

        public /* synthetic */ C72418b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$d */
    public static final class RunnableC72420d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f162345a;

        static {
            Covode.recordClassIndex(85094);
        }

        RunnableC72420d(VideoImageMixedView videoImageMixedView) {
            this.f162345a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.m127715a(this.f162345a).setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$e */
    public static final class RunnableC72421e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f162346a;

        static {
            Covode.recordClassIndex(85095);
        }

        RunnableC72421e(VideoImageMixedView videoImageMixedView) {
            this.f162346a = videoImageMixedView;
        }

        public final void run() {
            VideoImageMixedView.m127715a(this.f162346a).setVisibility(8);
        }
    }

    public final RecyclerView getMediaSelectRecyclerView() {
        RecyclerView recyclerView = this.f162338a;
        if (recyclerView == null) {
            C89219l.m154710a("mediaSelectRecyclerView");
        }
        return recyclerView;
    }

    public final TextView getSureTextView() {
        TextView textView = this.f162340d;
        if (textView == null) {
            C89219l.m154710a("sureTextView");
        }
        return textView;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$c */
    final class C72419c extends ViewOutlineProvider {
        static {
            Covode.recordClassIndex(85093);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C72419c() {
        }

        public final void getOutline(View view, Outline outline) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(outline, "");
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$a */
    final class C72416a extends LinearLayoutManager {

        /* renamed from: a */
        final /* synthetic */ VideoImageMixedView f162342a;

        static {
            Covode.recordClassIndex(85090);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedView$a$a */
        final class C72417a extends C1481r {

            /* renamed from: f */
            final /* synthetic */ C72416a f162343f;

            static {
                Covode.recordClassIndex(85091);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                C89219l.m154721d(displayMetrics, "");
                return 200.0f / ((float) displayMetrics.densityDpi);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C72417a(C72416a aVar, Context context) {
                super(context);
                C89219l.m154721d(context, "");
                this.f162343f = aVar;
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
                return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
        }

        public C72416a(VideoImageMixedView videoImageMixedView, Context context) {
            C89219l.m154721d(context, "");
            this.f162342a = videoImageMixedView;
            mo4356b(0);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
            C89219l.m154721d(recyclerView, "");
            Context context = recyclerView.getContext();
            C89219l.m154716b(context, "");
            C72417a aVar = new C72417a(this, context);
            aVar.f4515g = i;
            mo4695a(aVar);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m127715a(VideoImageMixedView videoImageMixedView) {
        RecyclerView recyclerView = videoImageMixedView.f162338a;
        if (recyclerView == null) {
            C89219l.m154710a("mediaSelectRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: a */
    public final void mo114681a(int i) {
        View view;
        if (i >= 0) {
            RecyclerView recyclerView = this.f162338a;
            if (recyclerView == null) {
                C89219l.m154710a("mediaSelectRecyclerView");
            }
            RecyclerView.ViewHolder f = recyclerView.mo4451f(i);
            if (f != null) {
                view = f.itemView;
            } else {
                view = null;
            }
            int i2 = 0;
            if (view == null) {
                RecyclerView recyclerView2 = this.f162338a;
                if (recyclerView2 == null) {
                    C89219l.m154710a("mediaSelectRecyclerView");
                }
                int i3 = i - 1;
                if (i3 > 0) {
                    i2 = i3;
                }
                recyclerView2.mo4413b(i2);
                return;
            }
            RecyclerView recyclerView3 = this.f162338a;
            if (recyclerView3 == null) {
                C89219l.m154710a("mediaSelectRecyclerView");
            }
            int i4 = i - 1;
            if (i4 > 0) {
                i2 = i4;
            }
            recyclerView3.mo4435d(i2);
        }
    }

    /* renamed from: a */
    public final void mo114683a(boolean z) {
        C84911q.m145928d("VideoImageMixedView showOrHideMediaRecyclerView ".concat(String.valueOf(z)));
        if (z) {
            RecyclerView recyclerView = this.f162338a;
            if (recyclerView == null) {
                C89219l.m154710a("mediaSelectRecyclerView");
            }
            recyclerView.postDelayed(new RunnableC72420d(this), 250);
            return;
        }
        RecyclerView recyclerView2 = this.f162338a;
        if (recyclerView2 == null) {
            C89219l.m154710a("mediaSelectRecyclerView");
        }
        recyclerView2.post(new RunnableC72421e(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoImageMixedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11025);
        View inflate = LayoutInflater.from(context).inflate(R.layout.ait, this);
        C89219l.m154716b(inflate, "");
        this.f162339c = inflate;
        if (inflate == null) {
            C89219l.m154710a("contentRootView");
        }
        View findViewById = inflate.findViewById(R.id.ec4);
        C89219l.m154716b(findViewById, "");
        this.f162340d = (TextView) findViewById;
        View view = this.f162339c;
        if (view == null) {
            C89219l.m154710a("contentRootView");
        }
        View findViewById2 = view.findViewById(R.id.fcw);
        C89219l.m154716b(findViewById2, "");
        this.f162341e = (TextView) findViewById2;
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C72419c());
            setClipToOutline(true);
            setElevation(C30745b.m63132b(context, 16.0f));
        }
        MethodCollector.m26664o(11025);
    }

    /* renamed from: a */
    public final void mo114682a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.f162341e;
            if (textView == null) {
                C89219l.m154710a("hintTextView");
            }
            textView.setText(str);
        } else if (z) {
            TextView textView2 = this.f162341e;
            if (textView2 == null) {
                C89219l.m154710a("hintTextView");
            }
            textView2.setText("");
        }
    }
}

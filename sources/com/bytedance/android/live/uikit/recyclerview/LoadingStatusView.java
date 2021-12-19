package com.bytedance.android.live.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {

    /* renamed from: a */
    List<View> f15597a;

    /* renamed from: b */
    int f15598b;

    /* renamed from: c */
    private final String f15599c;

    static {
        Covode.recordClassIndex(6942);
    }

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a */
    public static class C6234a {

        /* renamed from: a */
        Context f15600a;

        /* renamed from: b */
        public View f15601b;

        /* renamed from: c */
        public View f15602c;

        /* renamed from: d */
        public View f15603d;

        static {
            Covode.recordClassIndex(6943);
        }

        /* renamed from: b */
        private LiveLoadingView m13529b() {
            return new LiveLoadingView(this.f15600a);
        }

        /* renamed from: a */
        private C6234a m13527a() {
            this.f15601b = m13530c(R.string.gow);
            return this;
        }

        public C6234a(Context context) {
            if (context != null) {
                this.f15600a = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        /* renamed from: a */
        public static C6234a m13528a(Context context) {
            return new C6234a(context).mo12211b(R.string.gip).m13527a().mo12210a(R.string.giw, null);
        }

        /* renamed from: c */
        private View m13530c(int i) {
            MethodCollector.m26663i(12288);
            TextView textView = (TextView) LayoutInflater.from(this.f15600a).inflate(R.layout.bbi, (ViewGroup) null);
            textView.setText(i);
            MethodCollector.m26664o(12288);
            return textView;
        }

        /* renamed from: b */
        public final C6234a mo12211b(int i) {
            MethodCollector.m26663i(12287);
            TextView textView = (TextView) LayoutInflater.from(this.f15600a).inflate(R.layout.bbj, (ViewGroup) null);
            textView.setText(i);
            this.f15602c = textView;
            MethodCollector.m26664o(12287);
            return this;
        }

        /* renamed from: a */
        public final C6234a mo12209a(int i) {
            LiveLoadingView b = m13529b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.height = i;
            layoutParams.width = i;
            layoutParams.gravity = 17;
            b.setLayoutParams(layoutParams);
            this.f15601b = b;
            return this;
        }

        /* renamed from: a */
        public final C6234a mo12210a(int i, View.OnClickListener onClickListener) {
            View c = m13530c(i);
            c.setOnClickListener(onClickListener);
            this.f15603d = c;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo12206a() {
        int i = this.f15598b;
        if (i != -1) {
            this.f15597a.get(i).setVisibility(4);
            this.f15598b = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    public void setStatus(int i) {
        int i2 = this.f15598b;
        if (i2 != i) {
            if (i2 >= 0) {
                this.f15597a.get(i2).setVisibility(4);
            }
            if (this.f15597a.get(i) != null) {
                this.f15597a.get(i).setVisibility(0);
                this.f15598b = i;
                C3854a.m9453a(3, this.f15599c, "setStatus    ".concat(String.valueOf(i)));
            }
        }
    }

    public void setBuilder(C6234a aVar) {
        MethodCollector.m26663i(12410);
        if (aVar == null) {
            aVar = C6234a.m13528a(getContext());
        }
        this.f15597a.clear();
        this.f15597a.add(aVar.f15601b);
        this.f15597a.add(aVar.f15602c);
        this.f15597a.add(aVar.f15603d);
        removeAllViews();
        for (int i = 0; i < this.f15597a.size(); i++) {
            View view = this.f15597a.get(i);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                addView(view);
            }
        }
        MethodCollector.m26664o(12410);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadingStatusView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12294);
        this.f15599c = LoadingStatusView.class.getSimpleName();
        this.f15597a = new ArrayList(3);
        this.f15598b = -1;
        setBuilder(null);
        MethodCollector.m26664o(12294);
    }
}

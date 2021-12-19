package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView */
public final class CommentAtSearchLoadingView extends FrameLayout {

    /* renamed from: a */
    public static final C37001a f87150a = new C37001a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f87151b;

    /* renamed from: c */
    private final AbstractC89244h f87152c;

    static {
        Covode.recordClassIndex(44353);
    }

    public CommentAtSearchLoadingView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public CommentAtSearchLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final ObjectAnimator getLoadingAnimator() {
        return (ObjectAnimator) this.f87152c.getValue();
    }

    public final View getView() {
        return (View) this.f87151b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$a */
    public static final class C37001a {
        static {
            Covode.recordClassIndex(44354);
        }

        private C37001a() {
        }

        public /* synthetic */ C37001a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLoadingAnimator().cancel();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$c */
    static final class C37003c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLoadingView f87154a;

        /* renamed from: b */
        final /* synthetic */ Context f87155b;

        static {
            Covode.recordClassIndex(44356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37003c(CommentAtSearchLoadingView commentAtSearchLoadingView, Context context) {
            super(0);
            this.f87154a = commentAtSearchLoadingView;
            this.f87155b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(8906);
            View inflate = View.inflate(this.f87155b, R.layout.jw, this.f87154a);
            MethodCollector.m26664o(8906);
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$b */
    static final class C37002b extends AbstractC89220m implements AbstractC89171a<ObjectAnimator> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLoadingView f87153a;

        static {
            Covode.recordClassIndex(44355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37002b(CommentAtSearchLoadingView commentAtSearchLoadingView) {
            super(0);
            this.f87153a = commentAtSearchLoadingView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ObjectAnimator invoke() {
            View view = this.f87153a.getView();
            C89219l.m154716b(view, "");
            return ObjectAnimator.ofFloat(view.findViewById(R.id.bxh), "rotation", 360.0f);
        }
    }

    /* renamed from: a */
    private final void m74648a() {
        getLoadingAnimator().setDuration(1000L);
        getLoadingAnimator().setRepeatCount(-1);
        getLoadingAnimator().setInterpolator(new LinearInterpolator());
        getLoadingAnimator().start();
    }

    /* renamed from: a */
    public final void mo64511a(boolean z) {
        if (z == getLoadingAnimator().isRunning()) {
            return;
        }
        if (z) {
            m74648a();
        } else {
            getLoadingAnimator().cancel();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8909);
        this.f87151b = C89250i.m154773a((AbstractC89171a) new C37003c(this, context));
        this.f87152c = C89250i.m154773a((AbstractC89171a) new C37002b(this));
        MethodCollector.m26664o(8909);
    }
}

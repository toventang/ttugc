package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36317c;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.AbstractC36304d;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2486a.C36297a;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout */
public final class CommentMultiAnchorTagLayout extends FrameLayout {

    /* renamed from: g */
    public static final C36368a f86007g = new C36368a((byte) 0);

    /* renamed from: a */
    public AbstractC36304d f86008a;

    /* renamed from: b */
    public final TuxTextView f86009b;

    /* renamed from: c */
    public final TuxIconView f86010c;

    /* renamed from: d */
    public final AnchorsFlowLayout f86011d;

    /* renamed from: e */
    public boolean f86012e;

    /* renamed from: f */
    public C36317c f86013f;

    static {
        Covode.recordClassIndex(43658);
    }

    public CommentMultiAnchorTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout$a */
    public static final class C36368a {
        static {
            Covode.recordClassIndex(43659);
        }

        private C36368a() {
        }

        public /* synthetic */ C36368a(byte b) {
            this();
        }
    }

    public final AnchorsFlowLayout getFlowView() {
        return this.f86011d;
    }

    /* renamed from: a */
    public final void mo63636a() {
        mo63638b(this.f86012e);
        mo63637a(this.f86012e);
        boolean z = !this.f86012e;
        this.f86012e = z;
        C36317c cVar = this.f86013f;
        if (cVar != null) {
            cVar.setAnchorsFold(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC36369b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CommentMultiAnchorTagLayout f86014a;

        static {
            Covode.recordClassIndex(43660);
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f86014a.f86011d.getViewTreeObserver();
            if (this.f86014a.f86011d.getWidth() != 0) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                C37199i.m75173a("CommentMultiAnchorTag", " flow.finalLines: " + this.f86014a.f86011d.getFinalLines() + "  childViewCount " + this.f86014a.f86011d.getChildCount() + "  flow.firstLineCount " + this.f86014a.f86011d.getFirstLineCount());
                if (this.f86014a.f86011d.getChildCount() > this.f86014a.f86011d.getFirstLineCount()) {
                    C89393b.m154951c(this.f86014a.f86009b);
                    CommentMultiAnchorTagLayout commentMultiAnchorTagLayout = this.f86014a;
                    commentMultiAnchorTagLayout.mo63637a(!commentMultiAnchorTagLayout.f86012e);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewTreeObserver$OnGlobalLayoutListenerC36369b(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
            this.f86014a = commentMultiAnchorTagLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout$c */
    public static final class View$OnClickListenerC36370c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentMultiAnchorTagLayout f86015a;

        static {
            Covode.recordClassIndex(43661);
        }

        public View$OnClickListenerC36370c(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
            this.f86015a = commentMultiAnchorTagLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86015a.mo63636a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout$d */
    public static final class View$OnClickListenerC36371d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentMultiAnchorTagLayout f86016a;

        static {
            Covode.recordClassIndex(43662);
        }

        public View$OnClickListenerC36371d(CommentMultiAnchorTagLayout commentMultiAnchorTagLayout) {
            this.f86016a = commentMultiAnchorTagLayout;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86016a.mo63636a();
        }
    }

    /* renamed from: b */
    public final void mo63638b(boolean z) {
        if (z) {
            this.f86011d.setMaxTagLines(100);
        } else {
            this.f86011d.setMaxTagLines(1);
        }
    }

    /* renamed from: a */
    public final void mo63637a(boolean z) {
        if (z) {
            this.f86009b.setText(getContext().getString(R.string.aj8));
            C89393b.m154949a(this.f86010c);
            return;
        }
        C89393b.m154951c(this.f86010c);
        this.f86009b.setText("+" + (this.f86011d.getChildCount() - this.f86011d.getFirstLineCount()) + ' ' + getContext().getString(R.string.d4h));
    }

    private /* synthetic */ CommentMultiAnchorTagLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentMultiAnchorTagLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9032);
        this.f86008a = new C36297a();
        this.f86012e = true;
        FrameLayout.inflate(context, R.layout.je, this);
        View findViewById = findViewById(R.id.eem);
        C89219l.m154716b(findViewById, "");
        AnchorsFlowLayout anchorsFlowLayout = (AnchorsFlowLayout) findViewById;
        this.f86011d = anchorsFlowLayout;
        anchorsFlowLayout.setGravity(-1);
        anchorsFlowLayout.setMaxTagLines(1);
        View findViewById2 = findViewById(R.id.axq);
        C89219l.m154716b(findViewById2, "");
        this.f86009b = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.axp);
        C89219l.m154716b(findViewById3, "");
        this.f86010c = (TuxIconView) findViewById3;
        MethodCollector.m26664o(9032);
    }
}

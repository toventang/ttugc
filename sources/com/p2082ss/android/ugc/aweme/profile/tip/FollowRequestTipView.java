package com.p2082ss.android.ugc.aweme.profile.tip;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.tip.FollowRequestTipView */
public final class FollowRequestTipView extends AbstractC63908a {

    /* renamed from: d */
    public AbstractC89171a<C89391z> f144885d;

    /* renamed from: e */
    public AbstractC89171a<C89391z> f144886e;

    /* renamed from: f */
    private SparseArray f144887f;

    static {
        Covode.recordClassIndex(75336);
    }

    public FollowRequestTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.tip.AbstractC63908a
    /* renamed from: a */
    public final View mo103458a(int i) {
        if (this.f144887f == null) {
            this.f144887f = new SparseArray();
        }
        View view = (View) this.f144887f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f144887f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.tip.AbstractC63908a
    /* renamed from: a */
    public final View mo103457a() {
        MethodCollector.m26663i(7366);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.apj, this);
        C89219l.m154716b(inflate, "");
        MethodCollector.m26664o(7366);
        return inflate;
    }

    public final void setAcceptCallback(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f144885d = aVar;
    }

    public final void setDeleteCallback(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f144886e = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.tip.FollowRequestTipView$a */
    public static final class View$OnClickListenerC63906a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowRequestTipView f144888a;

        static {
            Covode.recordClassIndex(75337);
        }

        public View$OnClickListenerC63906a(FollowRequestTipView followRequestTipView) {
            this.f144888a = followRequestTipView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f144888a.f144886e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.tip.FollowRequestTipView$b */
    public static final class View$OnClickListenerC63907b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowRequestTipView f144889a;

        static {
            Covode.recordClassIndex(75338);
        }

        public View$OnClickListenerC63907b(FollowRequestTipView followRequestTipView) {
            this.f144889a = followRequestTipView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a<C89391z> aVar = this.f144889a.f144885d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    private /* synthetic */ FollowRequestTipView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FollowRequestTipView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}

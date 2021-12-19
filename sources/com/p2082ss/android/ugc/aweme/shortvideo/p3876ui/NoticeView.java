package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74286i;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView */
public final class NoticeView extends LinearLayout {

    /* renamed from: a */
    public static final C73307a f164635a = new C73307a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f164636b;

    /* renamed from: c */
    private final AbstractC89244h f164637c;

    /* renamed from: d */
    private final AbstractC89244h f164638d;

    /* renamed from: e */
    private final AbstractC89244h f164639e;

    /* renamed from: f */
    private final AbstractC89244h f164640f;

    /* renamed from: g */
    private HashMap f164641g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$d */
    static final class View$OnClickListenerC73310d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC73310d f164644a = new View$OnClickListenerC73310d();

        static {
            Covode.recordClassIndex(86033);
        }

        View$OnClickListenerC73310d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(86029);
    }

    private final AVAutoRTLImageView getCloseImage() {
        return (AVAutoRTLImageView) this.f164639e.getValue();
    }

    private final RemoteImageView getIconImage() {
        return (RemoteImageView) this.f164638d.getValue();
    }

    private final LinearLayout getNoticeRoot() {
        return (LinearLayout) this.f164640f.getValue();
    }

    private final TuxTextView getTitleContext() {
        return (TuxTextView) this.f164637c.getValue();
    }

    private final TuxTextView getTitleText() {
        return (TuxTextView) this.f164636b.getValue();
    }

    /* renamed from: a */
    public final View mo115821a(int i) {
        if (this.f164641g == null) {
            this.f164641g = new HashMap();
        }
        View view = (View) this.f164641g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f164641g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$a */
    public static final class C73307a {
        static {
            Covode.recordClassIndex(86030);
        }

        private C73307a() {
        }

        public /* synthetic */ C73307a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$b */
    static final class C73308b extends AbstractC89220m implements AbstractC89171a<AVAutoRTLImageView> {

        /* renamed from: a */
        final /* synthetic */ NoticeView f164642a;

        static {
            Covode.recordClassIndex(86031);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73308b(NoticeView noticeView) {
            super(0);
            this.f164642a = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AVAutoRTLImageView invoke() {
            return this.f164642a.mo115821a(R.id.a75);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$c */
    static final class C73309c extends AbstractC89220m implements AbstractC89171a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ NoticeView f164643a;

        static {
            Covode.recordClassIndex(86032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73309c(NoticeView noticeView) {
            super(0);
            this.f164643a = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.f164643a.mo115821a(R.id.bhq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$e */
    static final class C73311e extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ NoticeView f164645a;

        static {
            Covode.recordClassIndex(86034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73311e(NoticeView noticeView) {
            super(0);
            this.f164645a = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f164645a.mo115821a(R.id.cty);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$h */
    static final class C73314h extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ NoticeView f164648a;

        static {
            Covode.recordClassIndex(86037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73314h(NoticeView noticeView) {
            super(0);
            this.f164648a = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f164648a.mo115821a(R.id.eu6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$i */
    static final class C73315i extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ NoticeView f164649a;

        static {
            Covode.recordClassIndex(86038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73315i(NoticeView noticeView) {
            super(0);
            this.f164649a = noticeView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f164649a.mo115821a(R.id.f63);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$f */
    static final class View$OnClickListenerC73312f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f164646a;

        static {
            Covode.recordClassIndex(86035);
        }

        View$OnClickListenerC73312f(AbstractC89171a aVar) {
            this.f164646a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164646a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.NoticeView$g */
    public static final class View$OnClickListenerC73313g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f164647a;

        static {
            Covode.recordClassIndex(86036);
        }

        View$OnClickListenerC73313g(AbstractC89171a aVar) {
            this.f164647a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164647a.invoke();
        }
    }

    public final void setIconImage(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        getIconImage().setImageDrawable(drawable);
    }

    public final void setTitleContent(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        getTitleContext().setText(charSequence);
    }

    public final void setTitleText(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        getTitleText().setText(charSequence);
    }

    public final void setContentClickListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        getTitleContext().setOnClickListener(new View$OnClickListenerC73312f(aVar));
    }

    public final void setOnCloseClickListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        getCloseImage().setOnClickListener(new View$OnClickListenerC73313g(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoticeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9558);
        this.f164636b = C89250i.m154773a((AbstractC89171a) new C73315i(this));
        this.f164637c = C89250i.m154773a((AbstractC89171a) new C73314h(this));
        this.f164638d = C89250i.m154773a((AbstractC89171a) new C73309c(this));
        this.f164639e = C89250i.m154773a((AbstractC89171a) new C73308b(this));
        this.f164640f = C89250i.m154773a((AbstractC89171a) new C73311e(this));
        View.inflate(context, R.layout.agj, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.o3, R.attr.vz, R.attr.a6b, R.attr.aix, R.attr.aj5, R.attr.aj7});
        C89219l.m154716b(obtainStyledAttributes, "");
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            getIconImage().setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            getCloseImage().setImageDrawable(drawable2);
        }
        getTitleText().setText(obtainStyledAttributes.getString(4));
        getTitleText().setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        getTitleContext().setText(obtainStyledAttributes.getString(3));
        getTitleContext().setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        int color = obtainStyledAttributes.getColor(2, C0643b.m2378c(getContext(), R.color.nc));
        obtainStyledAttributes.recycle();
        C74286i.C74288b.m130698a(this, color, C71812ep.m126783a(4.0d, context), C0643b.m2378c(getContext(), R.color.bo), C71812ep.m126783a(12.0d, context), 0, 2);
        getNoticeRoot().setOnClickListener(View$OnClickListenerC73310d.f164644a);
        MethodCollector.m26664o(9558);
    }
}

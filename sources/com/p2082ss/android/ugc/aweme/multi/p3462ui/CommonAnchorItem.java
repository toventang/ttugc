package com.p2082ss.android.ugc.aweme.multi.p3462ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem */
public class CommonAnchorItem extends FrameLayout {

    /* renamed from: a */
    public static final C60293a f137410a = new C60293a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f137411b;

    /* renamed from: c */
    private final AbstractC89244h f137412c;

    /* renamed from: d */
    private final AbstractC89244h f137413d;

    /* renamed from: e */
    private boolean f137414e;

    /* renamed from: f */
    private final Queue<AbstractC89171a<C89391z>> f137415f;

    static {
        Covode.recordClassIndex(70825);
    }

    public CommonAnchorItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final SmartImageView getIconView() {
        return (SmartImageView) this.f137413d.getValue();
    }

    private final TextView getSubTitleView() {
        return (TextView) this.f137412c.getValue();
    }

    private final TextView getTitleView() {
        return (TextView) this.f137411b.getValue();
    }

    /* renamed from: a */
    public int mo97960a() {
        return R.layout.a9k;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$a */
    public static final class C60293a {
        static {
            Covode.recordClassIndex(70826);
        }

        private C60293a() {
        }

        public /* synthetic */ C60293a(byte b) {
            this();
        }

        /* renamed from: a */
        public static CommonAnchorItem m109980a(Context context) {
            C89219l.m154721d(context, "");
            View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.a9l, null, false);
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem");
            return (CommonAnchorItem) a;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean getAttached() {
        return this.f137414e;
    }

    /* access modifiers changed from: protected */
    public final Queue<AbstractC89171a<C89391z>> getPendingSetting() {
        return this.f137415f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f137414e = false;
        super.onDetachedFromWindow();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$b */
    static final class C60294b extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ CommonAnchorItem f137416a;

        static {
            Covode.recordClassIndex(70827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60294b(CommonAnchorItem commonAnchorItem) {
            super(0);
            this.f137416a = commonAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f137416a.findViewById(R.id.abb);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$c */
    public static final class C60295c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommonAnchorItem f137417a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f137418b;

        static {
            Covode.recordClassIndex(70828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60295c(CommonAnchorItem commonAnchorItem, UrlModel urlModel) {
            super(0);
            this.f137417a = commonAnchorItem;
            this.f137418b = urlModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137417a.setIcon(this.f137418b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$d */
    public static final class C60296d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommonAnchorItem f137419a;

        /* renamed from: b */
        final /* synthetic */ int f137420b;

        static {
            Covode.recordClassIndex(70829);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60296d(CommonAnchorItem commonAnchorItem, int i) {
            super(0);
            this.f137419a = commonAnchorItem;
            this.f137420b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137419a.setIconRes(this.f137420b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$e */
    public static final class C60297e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommonAnchorItem f137421a;

        /* renamed from: b */
        final /* synthetic */ String f137422b;

        static {
            Covode.recordClassIndex(70830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60297e(CommonAnchorItem commonAnchorItem, String str) {
            super(0);
            this.f137421a = commonAnchorItem;
            this.f137422b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137421a.setSubTitle(this.f137422b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$f */
    public static final class C60298f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommonAnchorItem f137423a;

        /* renamed from: b */
        final /* synthetic */ String f137424b;

        static {
            Covode.recordClassIndex(70831);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60298f(CommonAnchorItem commonAnchorItem, String str) {
            super(0);
            this.f137423a = commonAnchorItem;
            this.f137424b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137423a.setTitle(this.f137424b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$g */
    static final class C60299g extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ CommonAnchorItem f137425a;

        static {
            Covode.recordClassIndex(70832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60299g(CommonAnchorItem commonAnchorItem) {
            super(0);
            this.f137425a = commonAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f137425a.findViewById(R.id.abc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.CommonAnchorItem$h */
    static final class C60300h extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ CommonAnchorItem f137426a;

        static {
            Covode.recordClassIndex(70833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60300h(CommonAnchorItem commonAnchorItem) {
            super(0);
            this.f137426a = commonAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f137426a.findViewById(R.id.abd);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f137414e = true;
        C1764a.m5927a(LayoutInflater.from(getContext()), mo97960a(), this, true);
        while (this.f137415f.peek() != null) {
            this.f137415f.poll().invoke();
        }
    }

    /* access modifiers changed from: protected */
    public final void setAttached(boolean z) {
        this.f137414e = z;
    }

    public final void setIconRes(int i) {
        if (!this.f137414e) {
            this.f137415f.offer(new C60296d(this, i));
        } else {
            getIconView().setImageResource(i);
        }
    }

    public final void setSubTitle(String str) {
        C89219l.m154721d(str, "");
        if (!this.f137414e) {
            this.f137415f.offer(new C60297e(this, str));
            return;
        }
        TextView subTitleView = getSubTitleView();
        C89219l.m154716b(subTitleView, "");
        subTitleView.setText(str);
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        if (!this.f137414e) {
            this.f137415f.offer(new C60298f(this, str));
            return;
        }
        TextView titleView = getTitleView();
        C89219l.m154716b(titleView, "");
        titleView.setText(str);
    }

    public final void setIcon(UrlModel urlModel) {
        if (urlModel != null) {
            if (!this.f137414e) {
                this.f137415f.offer(new C60295c(this, urlModel));
                return;
            }
            float b = C13628n.m24520b(getContext(), 64.0f);
            float b2 = C13628n.m24520b(getContext(), (float) ((urlModel.getHeight() * 64) / urlModel.getWidth()));
            SmartImageView iconView = getIconView();
            C89219l.m154716b(iconView, "");
            ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            layoutParams.width = (int) b;
            layoutParams.height = (int) b2;
            SmartImageView iconView2 = getIconView();
            C89219l.m154716b(iconView2, "");
            iconView2.setLayoutParams(layoutParams);
            C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
            a.f49124u = Bitmap.Config.ARGB_8888;
            a.f49092E = getIconView();
            a.mo34186c();
        }
    }

    private /* synthetic */ CommonAnchorItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonAnchorItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7121);
        this.f137411b = C89250i.m154773a((AbstractC89171a) new C60300h(this));
        this.f137412c = C89250i.m154773a((AbstractC89171a) new C60299g(this));
        this.f137413d = C89250i.m154773a((AbstractC89171a) new C60294b(this));
        this.f137415f = new LinkedList();
        MethodCollector.m26664o(7121);
    }
}

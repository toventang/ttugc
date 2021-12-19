package com.p2082ss.android.ugc.aweme.multi.p3462ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem */
public class ToolsAnchorItem extends CommonAnchorItem {

    /* renamed from: b */
    public static final C60301a f137427b = new C60301a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f137428c;

    static {
        Covode.recordClassIndex(70836);
    }

    public ToolsAnchorItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final SmartImageView getActionButton() {
        return (SmartImageView) this.f137428c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.p3462ui.CommonAnchorItem
    /* renamed from: a */
    public final int mo97960a() {
        return R.layout.ab2;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem$a */
    public static final class C60301a {
        static {
            Covode.recordClassIndex(70837);
        }

        private C60301a() {
        }

        public /* synthetic */ C60301a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ToolsAnchorItem m109982a(Context context) {
            C89219l.m154721d(context, "");
            View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.ab3, null, false);
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem");
            return (ToolsAnchorItem) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem$b */
    static final class C60302b extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ ToolsAnchorItem f137429a;

        static {
            Covode.recordClassIndex(70838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60302b(ToolsAnchorItem toolsAnchorItem) {
            super(0);
            this.f137429a = toolsAnchorItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f137429a.findViewById(R.id.aba);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem$c */
    public static final class C60303c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ToolsAnchorItem f137430a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f137431b;

        static {
            Covode.recordClassIndex(70839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60303c(ToolsAnchorItem toolsAnchorItem, UrlModel urlModel) {
            super(0);
            this.f137430a = toolsAnchorItem;
            this.f137431b = urlModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137430a.setButtonIcon(this.f137431b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem$d */
    public static final class C60304d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ToolsAnchorItem f137432a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f137433b;

        static {
            Covode.recordClassIndex(70840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60304d(ToolsAnchorItem toolsAnchorItem, AbstractC89171a aVar) {
            super(0);
            this.f137432a = toolsAnchorItem;
            this.f137433b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137432a.setButtonOnClickListener(this.f137433b);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem$e */
    public static final class View$OnClickListenerC60305e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f137434a;

        static {
            Covode.recordClassIndex(70841);
        }

        View$OnClickListenerC60305e(AbstractC89171a aVar) {
            this.f137434a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137434a.invoke();
        }
    }

    public final void setButtonIcon(UrlModel urlModel) {
        if (urlModel != null) {
            if (!getAttached()) {
                getPendingSetting().offer(new C60303c(this, urlModel));
                return;
            }
            C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
            a.f49124u = Bitmap.Config.ARGB_8888;
            a.f49092E = getActionButton();
            a.mo34186c();
        }
    }

    public final void setButtonOnClickListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (!getAttached()) {
            getPendingSetting().offer(new C60304d(this, aVar));
        } else {
            getActionButton().setOnClickListener(new View$OnClickListenerC60305e(aVar));
        }
    }

    private /* synthetic */ ToolsAnchorItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ToolsAnchorItem(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f137428c = C89250i.m154773a((AbstractC89171a) new C60302b(this));
    }
}

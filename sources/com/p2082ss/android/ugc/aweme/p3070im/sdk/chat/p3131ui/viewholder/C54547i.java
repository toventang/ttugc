package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23008e;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53679d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.p2082ss.android.ugc.trill.R;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i */
public class C54547i extends AbstractC54482a<CommentContent> {

    /* renamed from: A */
    private int f125020A = -1;

    /* renamed from: B */
    private final AbstractC89516am f125021B = C89517an.m155448a(C89546bf.f203267b);

    /* renamed from: a */
    protected TuxTextView f125022a;

    /* renamed from: b */
    public CommentContent f125023b;

    /* renamed from: x */
    public Aweme f125024x;

    /* renamed from: y */
    private RemoteImageView f125025y;

    /* renamed from: z */
    private C19538ai f125026z;

    static {
        Covode.recordClassIndex(64258);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final TuxTextView mo91638i() {
        TuxTextView tuxTextView = this.f125022a;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        return tuxTextView;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.d1t);
        C89219l.m154716b(findViewById, "");
        this.f125025y = (RemoteImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.title_tv);
        C89219l.m154716b(findViewById2, "");
        this.f125022a = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.acq);
        C89219l.m154716b(findViewById3, "");
        this.f124819o = C54438a.C54439a.m99780a(findViewById3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i$b */
    public static final class View$OnClickListenerC54549b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54547i f125029a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f125030b;

        static {
            Covode.recordClassIndex(64260);
        }

        View$OnClickListenerC54549b(C54547i iVar, View.OnClickListener onClickListener) {
            this.f125029a = iVar;
            this.f125030b = onClickListener;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125029a.mo91637a(view);
            View.OnClickListener onClickListener = this.f125030b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i$c */
    public static final class View$OnClickListenerC54550c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54547i f125031a;

        /* renamed from: b */
        final /* synthetic */ View.OnClickListener f125032b;

        static {
            Covode.recordClassIndex(64261);
        }

        View$OnClickListenerC54550c(C54547i iVar, View.OnClickListener onClickListener) {
            this.f125031a = iVar;
            this.f125032b = onClickListener;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125031a.mo91637a(view);
            View.OnClickListener onClickListener = this.f125032b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        super.mo91564a(onClickListener);
        RemoteImageView remoteImageView = this.f125025y;
        if (remoteImageView == null) {
            C89219l.m154710a("coverView");
        }
        remoteImageView.setOnClickListener(new View$OnClickListenerC54549b(this, onClickListener));
        this.f124819o.mo91506a(new View$OnClickListenerC54550c(this, onClickListener));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i$d */
    public static final class C54551d extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ C54547i f125033a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f125034b;

        /* renamed from: c */
        final /* synthetic */ Context f125035c;

        /* renamed from: d */
        final /* synthetic */ String f125036d;

        /* renamed from: e */
        final /* synthetic */ String f125037e;

        /* renamed from: f */
        final /* synthetic */ String f125038f;

        static {
            Covode.recordClassIndex(64262);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (bitmap != null) {
                C89233z.C89238e eVar = this.f125034b;
                Context context = this.f125035c;
                C89219l.m154716b(context, "");
                String str = this.f125036d;
                String str2 = this.f125037e;
                String str3 = this.f125038f;
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                eVar.element = (T) CommentSharePackage.C69213a.m122323a(context, str, str2, str3, bitmap, C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics())));
                this.f125033a.mo91638i().setText(this.f125034b.element);
            }
        }

        C54551d(C54547i iVar, C89233z.C89238e eVar, Context context, String str, String str2, String str3) {
            this.f125033a = iVar;
            this.f125034b = eVar;
            this.f125035c = context;
            this.f125036d = str;
            this.f125037e = str2;
            this.f125038f = str3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i$f */
    public static final class C54553f extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f125040a = R.raw.icon_bubble_ellipsis_right;

        static {
            Covode.recordClassIndex(64264);
        }

        C54553f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f125040a;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 19.5f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i$a */
    public static final class C54548a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125027a;

        /* renamed from: b */
        final /* synthetic */ C54547i f125028b;

        static {
            Covode.recordClassIndex(64259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54548a(C54547i iVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f125028b = iVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54548a(this.f125028b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54548a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f125027a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C53679d dVar = C53679d.f123181a;
                CommentContent commentContent = this.f125028b.f125023b;
                if (commentContent == null) {
                    C89219l.m154710a("mContent");
                }
                this.f125027a = 1;
                obj = dVar.mo90229a(commentContent, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Aweme aweme = (Aweme) obj;
            if (aweme != null) {
                this.f125028b.f125024x = aweme;
                AwemeService.m70060b().mo60677a(this.f125028b.f125024x);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.i$e */
    public static final class C54552e extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C54552e f125039a = new C54552e();

        static {
            Covode.recordClassIndex(64263);
        }

        C54552e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.h);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54469h = C89241a.m154730a(TypedValue.applyDimension(1, 42.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54468g = C89241a.m154730a(TypedValue.applyDimension(1, 56.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo91637a(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("position", (long) this.f125020A);
        bundle.putSerializable("currentAweme", this.f125024x);
        if (view != null) {
            view.setTag(50331652, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91572a(IMUser iMUser, C19538ai aiVar) {
        C89219l.m154721d(iMUser, "");
        C89219l.m154721d(aiVar, "");
        super.mo91572a(iMUser, aiVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54547i(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91008a(com.bytedance.p1399im.core.p1408d.C19538ai r24, com.bytedance.p1399im.core.p1408d.C19538ai r25, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CommentContent r26, int r27) {
        /*
        // Method dump skipped, instructions count: 588
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54547i.mo91008a(com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent, int):void");
    }
}

package com.p2082ss.android.ugc.aweme.upvote.publish.p4192a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.d */
public final class C79964d extends ConstraintLayout {

    /* renamed from: g */
    public boolean f179257g;

    static {
        Covode.recordClassIndex(93191);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.bsh);
        if (this.f179257g) {
            lottieAnimationView.mo5826a();
            return;
        }
        C89219l.m154716b(lottieAnimationView, "");
        lottieAnimationView.setProgress(1.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.d$a */
    public static final class View$OnClickListenerC79965a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f179258a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179259b;

        static {
            Covode.recordClassIndex(93192);
        }

        public View$OnClickListenerC79965a(String str, AbstractC89171a aVar) {
            this.f179258a = str;
            this.f179259b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a aVar = this.f179259b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.d$b */
    public static final class View$OnClickListenerC79966b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f179260a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179261b;

        static {
            Covode.recordClassIndex(93193);
        }

        public View$OnClickListenerC79966b(String str, AbstractC89171a aVar) {
            this.f179260a = str;
            this.f179261b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a aVar = this.f179261b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.d$c */
    public static final class View$OnClickListenerC79967c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f179262a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f179263b;

        static {
            Covode.recordClassIndex(93194);
        }

        public View$OnClickListenerC79967c(String str, AbstractC89171a aVar) {
            this.f179262a = str;
            this.f179263b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC89171a aVar = this.f179263b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.d$e */
    public static final class View$OnClickListenerC79969e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f179265a;

        static {
            Covode.recordClassIndex(93196);
        }

        public View$OnClickListenerC79969e(AbstractC89171a aVar) {
            this.f179265a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f179265a.invoke();
        }
    }

    public final void setAnimFile(String str) {
        C89219l.m154721d(str, "");
        ((LottieAnimationView) findViewById(R.id.bsh)).setAnimation(str);
    }

    public final void setAvatar(C34602l lVar) {
        C20766v a = C20761r.m39060a(lVar);
        a.f49092E = (SmartAvatarImageView) findViewById(R.id.bsr);
        a.mo34186c();
    }

    public final void setDesc(String str) {
        C89219l.m154721d(str, "");
        View findViewById = findViewById(R.id.ev0);
        C89219l.m154716b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        View findViewById = findViewById(R.id.f63);
        C89219l.m154716b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.d$d */
    static final class C79968d extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f179264a;

        static {
            Covode.recordClassIndex(93195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79968d(LinearLayout linearLayout) {
            super(1);
            this.f179264a = linearLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(C0643b.m2378c(this.f179264a.getContext(), R.color.f));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C79964d(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bhg, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cd4);
        C23008e a = C23009f.m43397a(new C79968d(linearLayout));
        Context context2 = linearLayout.getContext();
        C89219l.m154716b(context2, "");
        linearLayout.setBackground(a.mo37389a(context2));
    }

    public /* synthetic */ C79964d(Context context, byte b) {
        this(context);
    }
}

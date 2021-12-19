package com.p2082ss.android.ugc.aweme.tools.beauty.p4084a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2740a.C41095a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77859d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4093b.AbstractC77897c;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.C78088b;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.style.C84966b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.h */
public class C77841h extends RecyclerView.ViewHolder {

    /* renamed from: l */
    public static final C77842a f174630l = new C77842a((byte) 0);

    /* renamed from: a */
    private final Context f174631a;

    /* renamed from: b */
    private final AbstractC89244h f174632b;

    /* renamed from: e */
    final C78088b f174633e = ((C78088b) this.itemView.findViewById(R.id.brs));

    /* renamed from: f */
    public final ImageView f174634f = ((ImageView) this.itemView.findViewById(R.id.bt6));

    /* renamed from: g */
    final View f174635g = this.itemView.findViewById(R.id.brt);

    /* renamed from: h */
    int f174636h;

    /* renamed from: i */
    public AbstractC89183m<? super ComposerBeauty, ? super Integer, C89391z> f174637i;

    /* renamed from: j */
    public final View f174638j;

    /* renamed from: k */
    public final C77859d f174639k;

    static {
        Covode.recordClassIndex(90928);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ObjectAnimator mo121452a() {
        return (ObjectAnimator) this.f174632b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.h$a */
    public static final class C77842a {
        static {
            Covode.recordClassIndex(90929);
        }

        private C77842a() {
        }

        public /* synthetic */ C77842a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.h$a$a */
        static final class C77843a extends AbstractC89220m implements AbstractC89172b<C78088b.C78089a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C77859d f174640a;

            /* renamed from: b */
            final /* synthetic */ View f174641b;

            static {
                Covode.recordClassIndex(90930);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77843a(C77859d dVar, View view) {
                super(1);
                this.f174640a = dVar;
                this.f174641b = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C78088b.C78089a aVar) {
                C78088b.C78089a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                aVar2.f190273d = this.f174640a.f174673e;
                Context context = this.f174641b.getContext();
                C89219l.m154716b(context, "");
                aVar2.f190274e = (int) C84912r.m145930a(context, this.f174640a.f174672d);
                Context context2 = this.f174641b.getContext();
                C89219l.m154716b(context2, "");
                aVar2.f190277h = (int) C84912r.m145930a(context2, this.f174640a.f174671c);
                Context context3 = this.f174641b.getContext();
                C89219l.m154716b(context3, "");
                aVar2.f190276g = (int) C84912r.m145930a(context3, this.f174640a.f174670b);
                aVar2.f190278i = this.f174640a.f174675g;
                aVar2.f190284o = this.f174640a.f174674f;
                aVar2.f190279j = this.f174640a.f174678j;
                aVar2.f190288s = this.f174640a.f174676h;
                aVar2.f190282m = this.f174640a.f174681m;
                aVar2.f190287r = this.f174640a.f174684p;
                aVar2.f190286q = this.f174640a.f174683o;
                aVar2.f175333a = this.f174640a.f174677i;
                aVar2.f175334b = this.f174640a.f174682n;
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static C78088b m135949a(View view, C77859d dVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(dVar, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            return C78088b.C78090b.m136507a(context, new C77843a(dVar, view));
        }

        /* renamed from: a */
        public static Drawable m135948a(Context context, boolean z, float f) {
            C89219l.m154721d(context, "");
            int color = context.getResources().getColor(R.color.d9);
            if (z) {
                return C84966b.C84967a.m146038a().mo129752a(1).mo129755b(color).mo129753a(color, 0).mo129750a();
            }
            return C84966b.C84967a.m146038a().mo129752a(0).mo129755b(color).mo129751a(C84912r.m145930a(context, f)).mo129753a(color, 0).mo129750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.h$c */
    static final class C77845c extends AbstractC89220m implements AbstractC89171a<ObjectAnimator> {

        /* renamed from: a */
        final /* synthetic */ C77841h f174648a;

        static {
            Covode.recordClassIndex(90932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77845c(C77841h hVar) {
            super(0);
            this.f174648a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ObjectAnimator invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f174648a.f174634f, "rotation", 0.0f, 360.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(800L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            return ofFloat;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo121455b() {
        ObjectAnimator a = mo121452a();
        if (a.isRunning()) {
            a.cancel();
        }
        ImageView imageView = this.f174634f;
        C89219l.m154716b(imageView, "");
        imageView.setRotation(0.0f);
        this.f174634f.setImageResource(2131230945);
    }

    /* renamed from: a */
    public void mo121453a(boolean z) {
        float f;
        View view = this.f174638j;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        view.setAlpha(f);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.h$b */
    static final class View$OnClickListenerC77844b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UrlModel f174642a;

        /* renamed from: b */
        final /* synthetic */ ComposerBeauty f174643b;

        /* renamed from: c */
        final /* synthetic */ C77841h f174644c;

        /* renamed from: d */
        final /* synthetic */ C77827c f174645d;

        /* renamed from: e */
        final /* synthetic */ boolean f174646e;

        /* renamed from: f */
        final /* synthetic */ boolean f174647f;

        static {
            Covode.recordClassIndex(90931);
        }

        View$OnClickListenerC77844b(UrlModel urlModel, ComposerBeauty composerBeauty, C77841h hVar, C77827c cVar, boolean z, boolean z2) {
            this.f174642a = urlModel;
            this.f174643b = composerBeauty;
            this.f174644c = hVar;
            this.f174645d = cVar;
            this.f174646e = z;
            this.f174647f = z2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f174643b.getEnable()) {
                AbstractC77897c cVar = C77886a.f174746c;
                if (cVar != null) {
                    Context context = this.f174644c.f174638j.getContext();
                    C89219l.m154716b(context, "");
                    String string = this.f174644c.f174638j.getContext().getString(R.string.fsw);
                    C89219l.m154716b(string, "");
                    cVar.mo22725a(context, string);
                    return;
                }
                return;
            }
            AbstractC89183m<? super ComposerBeauty, ? super Integer, C89391z> mVar = this.f174644c.f174637i;
            if (mVar != null) {
                mVar.invoke(this.f174643b, Integer.valueOf(this.f174644c.getLayoutPosition()));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77841h(View view, C77859d dVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        this.f174638j = view;
        this.f174639k = dVar;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f174631a = context;
        this.f174636h = 1;
        this.f174632b = C89250i.m154773a((AbstractC89171a) new C77845c(this));
    }

    /* renamed from: a */
    public final void mo121454a(boolean z, boolean z2) {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = (int) C41095a.m82772b(this.f174631a);
        if (z) {
            marginLayoutParams.leftMargin = (int) C41095a.m82773c(this.f174631a);
        } else {
            marginLayoutParams.leftMargin = 0;
        }
        int i = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd((int) C41095a.m82772b(this.f174631a));
        if (z) {
            marginLayoutParams.setMarginStart((int) C41095a.m82773c(this.f174631a));
        } else {
            marginLayoutParams.setMarginStart(0);
        }
        if (z2) {
            marginLayoutParams.rightMargin = (int) C41095a.m82773c(this.f174631a);
            int i2 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginEnd((int) C41095a.m82773c(this.f174631a));
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setLayoutParams(marginLayoutParams);
    }
}

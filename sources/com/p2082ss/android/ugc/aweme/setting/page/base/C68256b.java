package com.p2082ss.android.ugc.aweme.setting.page.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.base.b */
public final class C68256b {

    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.b$d */
    public final /* synthetic */ class View$OnClickListenerC68260d implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f152805a;

        static {
            Covode.recordClassIndex(80468);
        }

        public View$OnClickListenerC68260d(AbstractC89172b bVar) {
            this.f152805a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f152805a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(80464);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.b$a */
    public static final class C68257a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC68195a f152802a;

        static {
            Covode.recordClassIndex(80465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68257a(AbstractC68195a aVar) {
            super(1);
            this.f152802a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f152802a.mo108725h();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.b$b */
    public static final class C68258b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC68195a f152803a;

        static {
            Covode.recordClassIndex(80466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68258b(AbstractC68195a aVar) {
            super(1);
            this.f152803a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f152803a.mo108725h();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.b$c */
    public static final class C68259c extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC68195a f152804a;

        static {
            Covode.recordClassIndex(80467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68259c(AbstractC68195a aVar) {
            super(1);
            this.f152804a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f152804a.mo108725h();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m120519a(AbstractC68195a aVar, AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        Context context = aVar.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.findViewById(R.id.pi).setOnClickListener(new View$OnClickListenerC68260d(bVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m120518a(AbstractC68195a aVar, int i, AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        String string = aVar.getString(i);
        C89219l.m154716b(string, "");
        m120520a(aVar, string, bVar);
    }

    /* renamed from: a */
    public static final void m120520a(AbstractC68195a aVar, String str, AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        Context context = aVar.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            View findViewById = activity.findViewById(R.id.title);
            C89219l.m154716b(findViewById, "");
            ((TextView) findViewById).setText(str);
            activity.findViewById(R.id.pi).setOnClickListener(new View$OnClickListenerC68260d(bVar));
        }
    }
}

package com.p2082ss.android.ugc.aweme.multi.p3461a;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.C33506b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.multi.a.b */
public class C60195b implements AbstractC33504a {
    static {
        Covode.recordClassIndex(70724);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.a.b$c */
    public static final class RunnableC60198c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f137223a;

        /* renamed from: b */
        final /* synthetic */ int f137224b;

        /* renamed from: c */
        final /* synthetic */ int f137225c;

        /* renamed from: d */
        final /* synthetic */ TextView f137226d;

        static {
            Covode.recordClassIndex(70727);
        }

        RunnableC60198c(TextView textView, int i, int i2, TextView textView2) {
            this.f137223a = textView;
            this.f137224b = i;
            this.f137225c = i2;
            this.f137226d = textView2;
        }

        public final void run() {
            TextView textView;
            int i;
            TextView textView2;
            ViewParent parent = this.f137223a.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int measuredWidth = ((ViewGroup) parent).getMeasuredWidth();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = measuredWidth - C89241a.m154730a(TypedValue.applyDimension(1, 13.0f, system.getDisplayMetrics()));
            int i2 = this.f137224b;
            int i3 = this.f137225c;
            if (i2 + i3 > a) {
                int i4 = a / 2;
                if (i2 <= i4 && i3 > i4) {
                    textView = this.f137223a;
                } else {
                    textView = this.f137226d;
                }
                if (C89219l.m154714a(textView, this.f137223a)) {
                    i = this.f137224b;
                } else {
                    i = this.f137225c;
                }
                int min = Math.min(i, i4);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = min;
                textView.setLayoutParams(layoutParams);
                if (C89219l.m154714a(textView, this.f137223a)) {
                    textView2 = this.f137226d;
                } else {
                    textView2 = this.f137223a;
                }
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                layoutParams2.width = a - min;
                textView2.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.a.b$d */
    public static final class C60199d extends AbstractC89220m implements AbstractC89172b<AbstractC60201c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60195b f137227a;

        /* renamed from: b */
        final /* synthetic */ C60202d f137228b;

        static {
            Covode.recordClassIndex(70728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60199d(C60195b bVar, C60202d dVar) {
            super(1);
            this.f137227a = bVar;
            this.f137228b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC60201c cVar) {
            AbstractC60201c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C60202d dVar = this.f137228b;
            cVar2.mo97867a(C33506b.m68655b(dVar, cVar2, this.f137227a.mo97876a(dVar)));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public boolean mo97876a(C60202d dVar) {
        C89219l.m154721d(dVar, "");
        AbstractC60201c cVar = (AbstractC60201c) C89070n.m154583g((List) dVar.f137229a);
        if (cVar == null || cVar.mo97874d() <= 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.a.b$a */
    public static final class View$OnClickListenerC60196a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC60201c f137215a;

        /* renamed from: b */
        final /* synthetic */ C60195b f137216b;

        /* renamed from: c */
        final /* synthetic */ AbstractC34673c f137217c;

        /* renamed from: d */
        final /* synthetic */ C60202d f137218d;

        static {
            Covode.recordClassIndex(70725);
        }

        View$OnClickListenerC60196a(AbstractC60201c cVar, C60195b bVar, AbstractC34673c cVar2, C60202d dVar) {
            this.f137215a = cVar;
            this.f137216b = bVar;
            this.f137217c = cVar2;
            this.f137218d = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC60201c cVar = this.f137215a;
            C60202d dVar = this.f137218d;
            cVar.mo97892c(C33506b.m68654a(dVar, cVar, this.f137216b.mo97876a(dVar)));
            AbstractC60201c cVar2 = this.f137215a;
            C60202d dVar2 = this.f137218d;
            cVar2.mo97893d(C33506b.m68655b(dVar2, cVar2, this.f137216b.mo97876a(dVar2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.a.b$b */
    public static final class View$OnClickListenerC60197b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC60201c f137219a;

        /* renamed from: b */
        final /* synthetic */ C60195b f137220b;

        /* renamed from: c */
        final /* synthetic */ AbstractC34673c f137221c;

        /* renamed from: d */
        final /* synthetic */ C60202d f137222d;

        static {
            Covode.recordClassIndex(70726);
        }

        View$OnClickListenerC60197b(AbstractC60201c cVar, C60195b bVar, AbstractC34673c cVar2, C60202d dVar) {
            this.f137219a = cVar;
            this.f137220b = bVar;
            this.f137221c = cVar2;
            this.f137222d = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC60201c cVar = this.f137219a;
            C60202d dVar = this.f137222d;
            cVar.mo97892c(C33506b.m68654a(dVar, cVar, this.f137220b.mo97876a(dVar)));
            AbstractC60201c cVar2 = this.f137219a;
            C60202d dVar2 = this.f137222d;
            cVar2.mo97893d(C33506b.m68655b(dVar2, cVar2, this.f137220b.mo97876a(dVar2)));
        }
    }

    /* renamed from: a */
    protected static void m109705a(C60202d dVar, AbstractC89172b<? super AbstractC60201c, C89391z> bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        AnchorCustomData anchorCustomData = dVar.f137230b.getAnchorCustomData();
        if (anchorCustomData != null && anchorCustomData.getShouldOpen()) {
            Object g = C89070n.m154583g((List) dVar.f137229a);
            if (g != 0) {
                bVar.invoke(g);
            }
            anchorCustomData.setShouldOpen(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a
    /* renamed from: b */
    public void mo59605b(C60202d dVar, AbstractC34673c cVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        AbstractC60201c cVar2 = (AbstractC60201c) C89070n.m154579f((List) dVar.f137229a);
        cVar2.mo97889a(cVar.mo59614d());
        cVar.mo59621k().setVisibility(0);
        cVar2.mo97864a().mo97881a(true);
        cVar.mo59618h().setOnClickListener(new View$OnClickListenerC60196a(cVar2, this, cVar, dVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a
    /* renamed from: c */
    public final void mo59606c(C60202d dVar, AbstractC34673c cVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        try {
            Object f = C89070n.m154579f((List) dVar.f137229a);
            AbstractC60201c cVar2 = (AbstractC60201c) f;
            cVar2.mo97891b(C33506b.m68654a(dVar, cVar2, mo97876a(dVar)));
            cVar.mo59621k().setVisibility(0);
            C89379q.m157068constructorimpl((AbstractC60201c) f);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Iterator<T> it = dVar.f137229a.iterator();
        while (it.hasNext()) {
            it.next().mo97871a(dVar, cVar, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        if (r1 == null) goto L_0x005b;
     */
    @Override // com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59604a(com.p2082ss.android.ugc.aweme.multi.C60202d r9, com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c r10) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.multi.p3461a.C60195b.mo59604a(com.ss.android.ugc.aweme.multi.d, com.ss.android.ugc.aweme.base.ui.anchor.c):void");
    }
}

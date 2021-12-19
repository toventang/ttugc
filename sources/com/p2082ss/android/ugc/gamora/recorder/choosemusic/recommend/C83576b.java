package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.C23342c;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b */
public final class C83576b {

    /* renamed from: f */
    public static final C83577a f186614f = new C83577a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f186615a = C89250i.m154773a((AbstractC89171a) new C83584f(this));

    /* renamed from: b */
    final AbstractC89244h f186616b = C89250i.m154773a((AbstractC89171a) new C83590l(this));

    /* renamed from: c */
    final Handler f186617c = new Handler(Looper.getMainLooper(), new C83582d(this));

    /* renamed from: d */
    public boolean f186618d;

    /* renamed from: e */
    public final AbstractC89172b<Boolean, C89391z> f186619e;

    /* renamed from: g */
    private final AbstractC89244h f186620g;

    /* renamed from: h */
    private final AbstractC89244h f186621h = C89250i.m154773a((AbstractC89171a) new C83585g(this));

    /* renamed from: i */
    private final AbstractC89244h f186622i = C89250i.m154773a((AbstractC89171a) new C83583e(this));

    /* renamed from: j */
    private final AbstractC89244h f186623j = C89250i.m154773a((AbstractC89171a) new C83587i(this));

    /* renamed from: k */
    private final AbstractC89244h f186624k = C89250i.m154773a((AbstractC89171a) new C83586h(this));

    /* renamed from: l */
    private final AbstractC89244h f186625l;

    static {
        Covode.recordClassIndex(97463);
    }

    /* renamed from: a */
    public final View mo128585a() {
        return (View) this.f186620g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final TextView mo128586b() {
        return (TextView) this.f186621h.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final TextView mo128587c() {
        return (TextView) this.f186622i.getValue();
    }

    /* renamed from: d */
    public final ImageView mo128588d() {
        return (ImageView) this.f186623j.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final ObjectAnimator mo128589e() {
        return (ObjectAnimator) this.f186624k.getValue();
    }

    /* renamed from: f */
    public final AbstractC23317a mo128590f() {
        return (AbstractC23317a) this.f186625l.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$a */
    public static final class C83577a {
        static {
            Covode.recordClassIndex(97464);
        }

        private C83577a() {
        }

        public /* synthetic */ C83577a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$e */
    static final class C83583e extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C83576b f186633a;

        static {
            Covode.recordClassIndex(97470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83583e(C83576b bVar) {
            super(0);
            this.f186633a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f186633a.mo128585a().findViewById(R.id.cnk);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$f */
    static final class C83584f extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ C83576b f186634a;

        static {
            Covode.recordClassIndex(97471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83584f(C83576b bVar) {
            super(0);
            this.f186634a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f186634a.mo128585a().findViewById(R.id.cnr);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$g */
    static final class C83585g extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C83576b f186635a;

        static {
            Covode.recordClassIndex(97472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83585g(C83576b bVar) {
            super(0);
            this.f186635a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f186635a.mo128585a().findViewById(R.id.coj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$i */
    static final class C83587i extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C83576b f186637a;

        static {
            Covode.recordClassIndex(97474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83587i(C83576b bVar) {
            super(0);
            this.f186637a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f186637a.mo128585a().findViewById(R.id.d2z);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$l */
    static final class C83590l extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C83576b f186642a;

        static {
            Covode.recordClassIndex(97477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83590l(C83576b bVar) {
            super(0);
            this.f186642a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f186642a.mo128585a().findViewById(R.id.f_5);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$c */
    static final class C83581c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ Context f186631a;

        static {
            Covode.recordClassIndex(97468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83581c(Context context) {
            super(0);
            this.f186631a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(9612);
            View inflate = LayoutInflater.from(this.f186631a).inflate(R.layout.f1, (ViewGroup) null);
            MethodCollector.m26664o(9612);
            return inflate;
        }
    }

    /* renamed from: g */
    public final void mo128591g() {
        if (mo128590f().isShowing()) {
            this.f186618d = false;
            mo128590f().dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$h */
    static final class C83586h extends AbstractC89220m implements AbstractC89171a<ObjectAnimator> {

        /* renamed from: a */
        final /* synthetic */ C83576b f186636a;

        static {
            Covode.recordClassIndex(97473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83586h(C83576b bVar) {
            super(0);
            this.f186636a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ObjectAnimator invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f186636a.mo128588d(), "rotation", 0.0f, 360.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(4000L);
            ofFloat.setRepeatCount(-1);
            return ofFloat;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$b */
    static final class C83578b extends AbstractC89220m implements AbstractC89171a<AbstractC23317a> {

        /* renamed from: a */
        final /* synthetic */ C83576b f186626a;

        /* renamed from: b */
        final /* synthetic */ Context f186627b;

        /* renamed from: c */
        final /* synthetic */ C89378p f186628c;

        static {
            Covode.recordClassIndex(97465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83578b(C83576b bVar, Context context, C89378p pVar) {
            super(0);
            this.f186626a = bVar;
            this.f186627b = context;
            this.f186628c = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC23317a invoke() {
            C23342c cVar = new C23342c(this.f186627b);
            View a = this.f186626a.mo128585a();
            C89219l.m154716b(a, "");
            return cVar.mo38031a(a).mo38037a(true, (View.OnClickListener) null).mo38036a(true).mo38042b(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83576b.C83578b.C835791 */

                /* renamed from: a */
                final /* synthetic */ C83578b f186629a;

                static {
                    Covode.recordClassIndex(97466);
                }

                {
                    this.f186629a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f186629a.f186626a.f186619e.invoke(true);
                    return C89391z.f203057a;
                }
            }).mo38035a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83576b.C83578b.C835802 */

                /* renamed from: a */
                final /* synthetic */ C83578b f186630a;

                static {
                    Covode.recordClassIndex(97467);
                }

                {
                    this.f186630a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f186630a.f186626a.f186619e.invoke(false);
                    return C89391z.f203057a;
                }
            }).mo38029a(((Number) this.f186628c.getFirst()).intValue(), ((Number) this.f186628c.getSecond()).intValue()).mo38034a(EnumC23352h.BOTTOM).mo38045c(C84912r.m145934b(this.f186627b, 9.0f)).mo38012d();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$j */
    static final class View$OnClickListenerC83588j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83576b f186638a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f186639b;

        static {
            Covode.recordClassIndex(97475);
        }

        View$OnClickListenerC83588j(C83576b bVar, AbstractC89171a aVar) {
            this.f186638a = bVar;
            this.f186639b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f186638a.f186618d = false;
            this.f186639b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$k */
    static final class View$OnClickListenerC83589k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83576b f186640a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f186641b;

        static {
            Covode.recordClassIndex(97476);
        }

        View$OnClickListenerC83589k(C83576b bVar, AbstractC89171a aVar) {
            this.f186640a = bVar;
            this.f186641b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f186640a.f186618d = false;
            this.f186641b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.b$d */
    static final class C83582d implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ C83576b f186632a;

        static {
            Covode.recordClassIndex(97469);
        }

        C83582d(C83576b bVar) {
            this.f186632a = bVar;
        }

        public final boolean handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 1 && this.f186632a.f186618d) {
                this.f186632a.mo128590f().dismiss();
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C83576b(Context context, C89378p<Integer, Integer> pVar, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(bVar, "");
        this.f186619e = bVar;
        this.f186620g = C89250i.m154773a((AbstractC89171a) new C83581c(context));
        this.f186625l = C89250i.m154773a((AbstractC89171a) new C83578b(this, context, pVar));
        this.f186618d = true;
    }
}

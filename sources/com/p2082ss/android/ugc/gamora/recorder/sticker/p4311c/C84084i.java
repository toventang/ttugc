package com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.p2306ah.C33458f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75415a;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.p3966a.C75417b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75512c;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.AbstractC75517h;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.C75499a;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.C75516g;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3974c.View$OnClickListenerC75500b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.C75622d;
import com.p2082ss.android.ugc.aweme.sticker.types.p3999a.C75911e;
import com.p2082ss.android.ugc.gamora.recorder.sticker.C83958b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.originalPanel.C84098a;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.i */
public final class C84084i implements AbstractC83989b {

    /* renamed from: a */
    public static int f187668a;

    /* renamed from: b */
    public static final C84085a f187669b = new C84085a((byte) 0);

    static {
        Covode.recordClassIndex(97977);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.i$a */
    public static final class C84085a {
        static {
            Covode.recordClassIndex(97978);
        }

        private C84085a() {
        }

        public /* synthetic */ C84085a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.i$c */
    static final class C84087c extends AbstractC89220m implements AbstractC89171a<Drawable> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0218d f187671a;

        static {
            Covode.recordClassIndex(97980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84087c(ActivityC0218d dVar) {
            super(0);
            this.f187671a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Drawable invoke() {
            return C63244g.m114602a().mo73259E().mo93883a((Context) this.f187671a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.i$b */
    static final class C84086b extends AbstractC89220m implements AbstractC89183m<String, String, AbstractC75512c> {

        /* renamed from: a */
        public static final C84086b f187670a = new C84086b();

        static {
            Covode.recordClassIndex(97979);
        }

        C84086b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC75512c invoke(String str, String str2) {
            String str3 = str;
            C89219l.m154721d(str3, "");
            AbstractC32846a a = C63244g.m114602a().mo73255A().mo93896a(str3, str2);
            C89219l.m154721d(a, "");
            return new C83958b(a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.c.i$d */
    static final class C84088d implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f187672a;

        static {
            Covode.recordClassIndex(97981);
        }

        C84088d(C89233z.C89238e eVar) {
            this.f187672a = eVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            T t = this.f187672a.element;
            if (t == null) {
                return true;
            }
            t.mo119173c();
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC83989b
    /* renamed from: a */
    public final C75622d mo122961a(ActivityC0218d dVar, AbstractC75655o oVar, AbstractC75300d dVar2, AbstractC84398d dVar3, ShortVideoContext shortVideoContext, AbstractC14330a aVar, AbstractC84919c cVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(dVar3, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(aVar, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        C84088d dVar4 = new C84088d(eVar);
        boolean z = !C63244g.m114602a().mo73255A().mo93901a();
        C63244g.m114602a().mo73259E();
        eVar.element = (T) new View$OnClickListenerC75500b(z, C84086b.f187670a, new C84087c(dVar), oVar, dVar2, new C75415a(shortVideoContext), dVar, new C84098a(shortVideoContext, cVar, dVar, dVar4, aVar));
        C75622d dVar5 = new C75622d();
        dVar5.mo119356a((AbstractC75517h) eVar.element);
        dVar5.mo119356a(new C75911e(new C75417b(shortVideoContext), C33458f.f79509a));
        dVar5.mo119356a(new C75499a());
        dVar5.mo119356a(new C75516g(!C63244g.m114602a().mo73255A().mo93901a()));
        return dVar5;
    }
}

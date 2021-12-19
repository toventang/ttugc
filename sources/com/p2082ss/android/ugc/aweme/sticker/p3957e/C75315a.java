package com.p2082ss.android.ugc.aweme.sticker.p3957e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.effectplatform.C46402a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73754h;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3990b.C75760g;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75706l;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84445d;
import java.util.List;
import java.util.concurrent.Callable;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.e.a */
public final class C75315a {

    /* renamed from: a */
    public boolean f169308a;

    /* renamed from: b */
    public boolean f169309b;

    /* renamed from: c */
    public final C88411a f169310c = new C88411a();

    /* renamed from: d */
    final boolean f169311d;

    /* renamed from: e */
    final AbstractC75706l f169312e;

    static {
        Covode.recordClassIndex(88232);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.a$a */
    public static final class CallableC75316a<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C75315a f169313a;

        /* renamed from: b */
        final /* synthetic */ Effect f169314b;

        static {
            Covode.recordClassIndex(88233);
        }

        public CallableC75316a(C75315a aVar, Effect effect) {
            this.f169313a = aVar;
            this.f169314b = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            List<String> urlList;
            UrlModel hintIcon = this.f169314b.getHintIcon();
            boolean z = true;
            String str = null;
            if (!(hintIcon == null || (urlList = hintIcon.getUrlList()) == null || urlList.isEmpty())) {
                str = urlList.get(0);
            }
            if (TextUtils.isEmpty(str) || C84402a.m145178a(Uri.parse(str))) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.a$b */
    public static final class C75317b<T, R> implements AbstractC88434g<Throwable, Boolean> {

        /* renamed from: a */
        public static final C75317b f169315a = new C75317b();

        static {
            Covode.recordClassIndex(88234);
        }

        C75317b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Boolean apply(Throwable th) {
            C89219l.m154721d(th, "");
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.a$e */
    static final class C75320e<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C75315a f169322a;

        /* renamed from: b */
        final /* synthetic */ Effect f169323b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75374c.AbstractC75375a f169324c;

        static {
            Covode.recordClassIndex(88237);
        }

        C75320e(C75315a aVar, Effect effect, AbstractC75374c.AbstractC75375a aVar2) {
            this.f169322a = aVar;
            this.f169323b = effect;
            this.f169324c = aVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f169322a.f169308a = false;
            this.f169324c.mo118619a(this.f169323b, new ExceptionResult(new Exception(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.a$f */
    public static final class C75321f implements C84402a.AbstractC84406b {

        /* renamed from: a */
        final /* synthetic */ C75315a f169325a;

        /* renamed from: b */
        final /* synthetic */ Effect f169326b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75374c.AbstractC75375a f169327c;

        static {
            Covode.recordClassIndex(88238);
        }

        @Override // com.p2082ss.android.ugc.tools.p4340c.C84402a.AbstractC84406b
        /* renamed from: a */
        public final void mo88263a(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            C89219l.m154721d(cVar, "");
            this.f169325a.f169309b = true;
            this.f169325a.mo118898a(this.f169326b, this.f169327c);
        }

        @Override // com.p2082ss.android.ugc.tools.p4340c.C84402a.AbstractC84406b
        /* renamed from: a */
        public final void mo88264a(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f169325a.f169309b = true;
            this.f169325a.mo118898a(this.f169326b, this.f169327c);
        }

        C75321f(C75315a aVar, Effect effect, AbstractC75374c.AbstractC75375a aVar2) {
            this.f169325a = aVar;
            this.f169326b = effect;
            this.f169327c = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.a$c */
    public static final class C75318c<T> implements AbstractC88433f<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C75315a f169316a;

        /* renamed from: b */
        final /* synthetic */ Effect f169317b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75374c.AbstractC75375a f169318c;

        static {
            Covode.recordClassIndex(88235);
        }

        public C75318c(C75315a aVar, Effect effect, AbstractC75374c.AbstractC75375a aVar2) {
            this.f169316a = aVar;
            this.f169317b = effect;
            this.f169318c = aVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f169316a.f169309b = true;
            }
            C75315a aVar = this.f169316a;
            Effect effect = this.f169317b;
            AbstractC75374c.AbstractC75375a aVar2 = this.f169318c;
            boolean z = aVar.f169311d;
            if ((!C75466g.m132366r(effect) || (C73754h.m129793b(effect.getEffectId()) == null && aVar.f169312e.mo119434a(effect))) && z) {
                aVar.f169308a = true;
            }
            if (!aVar.mo118898a(effect, aVar2)) {
                if (!aVar.f169308a) {
                    AbstractC88412b a = C75760g.m132921a(aVar.f169312e, effect, false, true).mo143261a(C88392a.m153583a()).mo143254a(new C75319d(aVar, effect, aVar2), new C75320e(aVar, effect, aVar2));
                    C89219l.m154716b(a, "");
                    C88934a.m154195a(a, aVar.f169310c);
                }
                if (!aVar.f169309b) {
                    C84402a.m145177a(C46402a.m89551a(effect.getHintIcon()), new C75321f(aVar, effect, aVar2));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.e.a$d */
    static final class C75319d<T> implements AbstractC88433f<C84445d<C75691ac, Effect>> {

        /* renamed from: a */
        final /* synthetic */ C75315a f169319a;

        /* renamed from: b */
        final /* synthetic */ Effect f169320b;

        /* renamed from: c */
        final /* synthetic */ AbstractC75374c.AbstractC75375a f169321c;

        static {
            Covode.recordClassIndex(88236);
        }

        C75319d(C75315a aVar, Effect effect, AbstractC75374c.AbstractC75375a aVar2) {
            this.f169319a = aVar;
            this.f169320b = effect;
            this.f169321c = aVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C84445d<C75691ac, Effect> dVar) {
            C84445d<C75691ac, Effect> dVar2 = dVar;
            int i = C75322b.f169328a[dVar2.f188779a.ordinal()];
            if (i != 1) {
                int i2 = 0;
                if (i == 2) {
                    this.f169319a.f169308a = false;
                    AbstractC75374c.AbstractC75375a aVar = this.f169321c;
                    Effect effect = this.f169320b;
                    Integer num = dVar2.f188783e;
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    aVar.mo118618a(effect, i2);
                } else if (i == 3) {
                    this.f169319a.f169308a = true;
                    this.f169319a.mo118898a(this.f169320b, this.f169321c);
                } else if (i == 4) {
                    this.f169319a.f169308a = false;
                    this.f169321c.mo118619a(this.f169320b, new ExceptionResult(dVar2.f188782d));
                }
            } else {
                this.f169321c.mo118621c(this.f169320b);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo118898a(Effect effect, AbstractC75374c.AbstractC75375a aVar) {
        if (!this.f169308a || !this.f169309b) {
            return false;
        }
        aVar.mo118620b(effect);
        return true;
    }

    public C75315a(boolean z, AbstractC75706l lVar) {
        C89219l.m154721d(lVar, "");
        this.f169311d = z;
        this.f169312e = lVar;
    }
}

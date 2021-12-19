package com.bytedance.nita.p1556d;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.C21521a;
import com.bytedance.nita.api.AbstractC21524b;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.api.EnumC21529f;
import com.bytedance.nita.api.EnumC21530g;
import com.bytedance.nita.p1554b.C21532b;
import com.bytedance.nita.p1555c.C21538b;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.bytedance.nita.p1557e.C21554a;
import com.bytedance.nita.p1557e.C21558b;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.d.a */
public abstract class AbstractC21539a implements Handler.Callback, AbstractC21551d {

    /* renamed from: a */
    public final Handler f51127a = new Handler(Looper.getMainLooper(), this);

    /* renamed from: b */
    public final ConcurrentHashMap<String, ArrayList<AbstractC89171a<C89391z>>> f51128b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final ArrayList<String> f51129c = new ArrayList<>();

    static {
        Covode.recordClassIndex(25180);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.nita.d.a$a */
    public static final class C21540a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f51130a;

        /* renamed from: b */
        final /* synthetic */ AbstractC21525c f51131b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f51132c;

        static {
            Covode.recordClassIndex(25181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21540a(Context context, AbstractC21525c cVar, AbstractC89171a aVar) {
            super(0);
            this.f51130a = context;
            this.f51131b = cVar;
            this.f51132c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C21558b.m40491a(this.f51130a)) {
                if (this.f51131b.mo35195g() != EnumC21529f.MUTIPLE || (Build.VERSION.SDK_INT >= 24 && Build.VERSION.SDK_INT <= 27)) {
                    C21554a.m40486a(C21554a.f51150b).post(new Runnable(this) {
                        /* class com.bytedance.nita.p1556d.AbstractC21539a.C21540a.RunnableC215422 */

                        /* renamed from: a */
                        final /* synthetic */ C21540a f51134a;

                        static {
                            Covode.recordClassIndex(25183);
                        }

                        {
                            this.f51134a = r1;
                        }

                        public final void run() {
                            this.f51134a.f51132c.invoke();
                            Thread currentThread = Thread.currentThread();
                            C89219l.m154709a((Object) currentThread, "");
                            C21554a.m40487a(currentThread).mo35232a(this.f51134a.f51130a);
                        }
                    });
                } else {
                    C21554a.f51150b.mo35228a().execute(new Runnable(this) {
                        /* class com.bytedance.nita.p1556d.AbstractC21539a.C21540a.RunnableC215411 */

                        /* renamed from: a */
                        final /* synthetic */ C21540a f51133a;

                        static {
                            Covode.recordClassIndex(25182);
                        }

                        {
                            this.f51133a = r1;
                        }

                        public final void run() {
                            this.f51133a.f51132c.invoke();
                            Thread currentThread = Thread.currentThread();
                            C89219l.m154709a((Object) currentThread, "");
                            C21554a.m40487a(currentThread).mo35232a(this.f51133a.f51130a);
                        }
                    });
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo35215a() {
        Message obtainMessage = this.f51127a.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = null;
        this.f51127a.removeMessages(1);
        this.f51127a.sendMessageDelayed(obtainMessage, 5000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35217b() {
        synchronized (this.f51128b) {
            if (this.f51129c.size() > 0) {
                String remove = this.f51129c.remove(0);
                C89219l.m154709a((Object) remove, "");
                String str = remove;
                ArrayList<AbstractC89171a<C89391z>> arrayList = this.f51128b.get(str);
                if (arrayList != null) {
                    if (arrayList.size() > 0) {
                        AbstractC89171a<C89391z> remove2 = arrayList.remove(0);
                        C89219l.m154709a((Object) remove2, "");
                        remove2.invoke();
                    } else {
                        this.f51128b.remove(str);
                    }
                }
                if (this.f51128b.size() > 0 && !this.f51127a.hasMessages(1)) {
                    mo35215a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.nita.d.a$b */
    public static final class C21543b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f51135a;

        /* renamed from: b */
        final /* synthetic */ AbstractC21525c f51136b;

        /* renamed from: c */
        final /* synthetic */ Context f51137c;

        static {
            Covode.recordClassIndex(25184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21543b(int i, AbstractC21525c cVar, Context context) {
            super(0);
            this.f51135a = i;
            this.f51136b = cVar;
            this.f51137c = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(6496);
            int i = this.f51135a;
            int i2 = 0;
            loop0:
            while (true) {
                if (i2 < i) {
                    int length = this.f51136b.mo35193d().length;
                    for (int i3 = 0; i3 < length; i3++) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!C21558b.m40491a(this.f51137c)) {
                            break loop0;
                        }
                        try {
                            View a = this.f51136b.mo35179b().mo35234a(this.f51137c, this.f51136b.mo35192b(this.f51137c), this.f51136b.mo35193d()[i3]);
                            HandlerC21534a aVar = HandlerC21534a.f51121f;
                            AbstractC21525c cVar = this.f51136b;
                            aVar.mo35201a(a, cVar, cVar.mo35193d()[i3]);
                        } catch (Exception e) {
                            AbstractC21524b bVar = C21521a.f51098b;
                            if (bVar != null) {
                                this.f51136b.mo35193d();
                                bVar.mo35198a(e);
                            }
                        }
                        AbstractC21524b bVar2 = C21521a.f51098b;
                        if (bVar2 != null) {
                            AbstractC21525c cVar2 = this.f51136b;
                            cVar2.mo35193d();
                            bVar2.mo35196a(System.currentTimeMillis() - currentTimeMillis, cVar2);
                        }
                        if (i2 == 0) {
                            HandlerC21534a aVar2 = HandlerC21534a.f51121f;
                            AbstractC21525c cVar3 = this.f51136b;
                            Context context = this.f51137c;
                            int i4 = cVar3.mo35193d()[i3];
                            C89219l.m154719c(cVar3, "");
                            C89219l.m154719c(context, "");
                            String a2 = cVar3.mo35178a();
                            if (cVar3.mo35194f() != EnumC21530g.ACTIVITY_DESTORY) {
                                HandlerC21534a.m40471a(context, cVar3);
                                Message obtain = Message.obtain(aVar2);
                                obtain.obj = a2;
                                obtain.what = i4;
                                obtain.arg1 = aVar2.mo35200a(a2, context, false);
                                C89219l.m154709a((Object) obtain, "");
                                int i5 = C21538b.f51126a[cVar3.mo35194f().ordinal()];
                                if (i5 == 1) {
                                    aVar2.sendMessageDelayed(obtain, EnumC21530g.LONG.getDelay());
                                } else if (i5 == 2) {
                                    aVar2.sendMessageDelayed(obtain, EnumC21530g.SHORT.getDelay());
                                }
                            } else if (context instanceof Activity) {
                                HandlerC21534a.m40471a(context, cVar3);
                            } else {
                                C21532b bVar3 = new C21532b("NitaView with non activity context, can not be cleared with TtlType.ACTIVITY_DESTORY");
                                MethodCollector.m26664o(6496);
                                throw bVar3;
                            }
                            if (HandlerC21534a.f51117b.size() > HandlerC21534a.f51116a) {
                                HandlerC21534a.m40470a();
                            }
                        }
                    }
                    i2++;
                } else {
                    String a3 = this.f51136b.mo35178a();
                    C89219l.m154719c(a3, "");
                    synchronized (HandlerC21534a.f51120e) {
                        try {
                            if (HandlerC21534a.f51119d.size() == 5) {
                                HandlerC21534a.f51119d.remove(0);
                            }
                            HandlerC21534a.f51119d.add(a3);
                        } catch (Throwable th) {
                            MethodCollector.m26664o(6496);
                            throw th;
                        }
                    }
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(6496);
            return zVar;
        }
    }

    /* renamed from: a */
    public static AbstractC89171a<C89391z> m40478a(AbstractC21525c cVar, int i, Context context) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(context, "");
        return new C21540a(context, cVar, new C21543b(i, cVar, context));
    }

    @Override // com.bytedance.nita.p1556d.AbstractC21551d
    /* renamed from: a */
    public void mo35216a(AbstractC21525c cVar, Context context, int i) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(context, "");
        synchronized (this.f51128b) {
            if (this.f51128b.get(cVar.mo35178a()) == null) {
                this.f51128b.put(cVar.mo35178a(), new ArrayList<>());
            }
            ArrayList<AbstractC89171a<C89391z>> arrayList = this.f51128b.get(cVar.mo35178a());
            if (arrayList == null) {
                C89219l.m154707a();
            }
            arrayList.add(m40478a(cVar, i, context));
            this.f51129c.add(cVar.mo35178a());
        }
    }
}

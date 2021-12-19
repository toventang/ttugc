package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3929c.C74972b;
import com.p2082ss.android.ugc.aweme.specact.popup.api.ISpecApi;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import com.p2082ss.android.ugc.aweme.specact.popup.p3944c.C75183a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i */
public final class C75069i {

    /* renamed from: h */
    public static final AbstractC89244h f168721h = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C75072c.f168730a);

    /* renamed from: i */
    public static final C75071b f168722i = new C75071b((byte) 0);

    /* renamed from: a */
    int f168723a;

    /* renamed from: b */
    public boolean f168724b;

    /* renamed from: c */
    public AbstractC75070a f168725c;

    /* renamed from: d */
    public String f168726d = "coin2";

    /* renamed from: e */
    public Boolean f168727e = false;

    /* renamed from: f */
    public Integer f168728f = 5;

    /* renamed from: g */
    public List<C75126k.C75135i> f168729g;

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i$a */
    public interface AbstractC75070a {
        static {
            Covode.recordClassIndex(87942);
        }

        /* renamed from: a */
        void mo118066a();

        /* renamed from: a */
        void mo118067a(int i, String str, Boolean bool, Integer num);

        /* renamed from: a */
        void mo118068a(List<C75126k.C75135i> list);

        /* renamed from: b */
        void mo118069b();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i$b */
    public static final class C75071b {
        static {
            Covode.recordClassIndex(87943);
        }

        /* renamed from: a */
        public static C75069i m131841a() {
            return (C75069i) C75069i.f168721h.getValue();
        }

        private C75071b() {
        }

        public /* synthetic */ C75071b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i$c */
    static final class C75072c extends AbstractC89220m implements AbstractC89171a<C75069i> {

        /* renamed from: a */
        public static final C75072c f168730a = new C75072c();

        static {
            Covode.recordClassIndex(87944);
        }

        C75072c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C75069i invoke() {
            return new C75069i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i$g */
    static final class RunnableC75076g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C75069i f168735a;

        /* renamed from: b */
        final /* synthetic */ Activity f168736b;

        static {
            Covode.recordClassIndex(87948);
        }

        RunnableC75076g(C75069i iVar, Activity activity) {
            this.f168735a = iVar;
            this.f168736b = activity;
        }

        public final void run() {
            C75069i iVar = this.f168735a;
            iVar.mo118183a(this.f168736b, iVar.f168725c);
        }
    }

    static {
        Covode.recordClassIndex(87941);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i$f */
    public static final class C75075f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C75069i f168733a;

        /* renamed from: b */
        final /* synthetic */ Activity f168734b;

        static {
            Covode.recordClassIndex(87947);
        }

        C75075f(C75069i iVar, Activity activity) {
            this.f168733a = iVar;
            this.f168734b = activity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (TextUtils.equals("retry_error", ((Throwable) obj).getMessage())) {
                C75069i iVar = this.f168733a;
                Activity activity = this.f168734b;
                AbstractC75070a aVar = iVar.f168725c;
                iVar.f168723a++;
                if (iVar.f168723a < 3) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC75076g(iVar, activity), TimeUnit.SECONDS.toMillis(5));
                } else if (aVar != null) {
                    aVar.mo118066a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i$e */
    public static final class C75074e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C75069i f168732a;

        static {
            Covode.recordClassIndex(87946);
        }

        C75074e(C75069i iVar) {
            this.f168732a = iVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC75070a aVar;
            Integer num = (Integer) obj;
            if (num.intValue() >= 0) {
                this.f168732a.f168723a = 0;
                AbstractC75070a aVar2 = this.f168732a.f168725c;
                if (aVar2 != null) {
                    C89219l.m154716b(num, "");
                    aVar2.mo118067a(num.intValue(), this.f168732a.f168726d, this.f168732a.f168727e, this.f168732a.f168728f);
                }
            } else if (num.intValue() == -1) {
                AbstractC75070a aVar3 = this.f168732a.f168725c;
                if (aVar3 != null) {
                    aVar3.mo118066a();
                }
            } else if (num.intValue() == -2) {
                AbstractC75070a aVar4 = this.f168732a.f168725c;
                if (aVar4 != null) {
                    aVar4.mo118069b();
                }
            } else if (num.intValue() == -3 && (aVar = this.f168732a.f168725c) != null) {
                aVar.mo118068a(this.f168732a.f168729g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.i$d */
    public static final class C75073d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C75069i f168731a;

        static {
            Covode.recordClassIndex(87945);
        }

        C75073d(C75069i iVar) {
            this.f168731a = iVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Integer> vVar) {
            String str;
            List<C75124i> list;
            C75124i iVar;
            String str2;
            Integer num;
            String str3;
            C75126k.C75136j jVar;
            List<C75126k.C75135i> list2;
            Boolean bool;
            Integer num2;
            C75126k.C75127a aVar;
            C75126k.C75127a aVar2;
            C89219l.m154721d(vVar, "");
            Long l = null;
            try {
                C75126k kVar = ISpecApi.C75138a.m131890a().getTaskInfo("[task_list]").get();
                if (kVar != null && kVar.status_code == 0) {
                    C74972b.m131622a(kVar.f168904a);
                    C75069i iVar2 = this.f168731a;
                    C75126k.C75129c cVar = kVar.f168904a;
                    if (cVar != null) {
                        str = cVar.f168916h;
                    } else {
                        str = null;
                    }
                    iVar2.f168726d = str;
                    C75126k.C75129c cVar2 = kVar.f168904a;
                    if (!(cVar2 == null || (jVar = cVar2.f168909a) == null || (list2 = jVar.f168947a) == null)) {
                        Iterator<C75126k.C75135i> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C75126k.C75135i next = it.next();
                            if (next.f168942b == 1022 && C89219l.m154714a((Object) next.f168944d, (Object) false)) {
                                this.f168731a.f168724b = true;
                                C75069i iVar3 = this.f168731a;
                                C75126k.C75128b bVar = next.f168946f;
                                if (bVar == null || (aVar2 = bVar.f168907a) == null) {
                                    bool = null;
                                } else {
                                    bool = aVar2.f168905a;
                                }
                                iVar3.f168727e = bool;
                                C75069i iVar4 = this.f168731a;
                                C75126k.C75128b bVar2 = next.f168946f;
                                if (bVar2 == null || (aVar = bVar2.f168907a) == null) {
                                    num2 = null;
                                } else {
                                    num2 = Integer.valueOf(aVar.f168906b);
                                }
                                iVar4.f168728f = num2;
                                vVar.mo143031a(Integer.valueOf(next.mo118292a()));
                            }
                        }
                        this.f168731a.f168729g = list2;
                    }
                    if (!this.f168731a.f168724b) {
                        vVar.mo143031a((Integer) -1);
                    }
                    vVar.mo143031a((Integer) -3);
                    C75183a a = C75183a.C75184a.m131921a();
                    C89219l.m154721d(kVar, "");
                    C75126k.C75129c cVar3 = kVar.f168904a;
                    if (cVar3 != null) {
                        list = cVar3.f168910b;
                    } else {
                        list = null;
                    }
                    a.f169046a = list;
                    C75126k.C75129c cVar4 = kVar.f168904a;
                    if (cVar4 != null) {
                        iVar = cVar4.f168911c;
                    } else {
                        iVar = null;
                    }
                    a.f169048c = iVar;
                    if (a.f169048c != null) {
                        C33744d dVar = new C33744d();
                        C75124i iVar5 = a.f169048c;
                        if (iVar5 != null) {
                            str2 = iVar5.f168883c;
                        } else {
                            str2 = null;
                        }
                        C33744d a2 = dVar.mo59983a("pop_name", str2);
                        C75124i iVar6 = a.f169048c;
                        if (iVar6 != null) {
                            num = Integer.valueOf(iVar6.f168899s);
                        } else {
                            num = null;
                        }
                        C33744d a3 = a2.mo59982a("round", num);
                        if (C75063d.m131826a()) {
                            str3 = "feed";
                        } else {
                            str3 = "others";
                        }
                        C39162r.m79460a("receive_pop_request", a3.mo59983a("position", str3).f79943a);
                    }
                    C75126k.C75129c cVar5 = kVar.f168904a;
                    if (cVar5 != null) {
                        l = Long.valueOf(cVar5.f168915g);
                    }
                    a.f169050e = l;
                    a.mo118340a();
                    vVar.mo143031a((Integer) -2);
                    vVar.mo143023a();
                }
            } catch (InterruptedException e) {
                LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
                C89219l.m154716b(localTestApi, "");
                localTestApi.getSpecActDebugService().mo106976a("SpecApi", "request task/page occur InterruptedException: " + e.toString());
            } catch (ExecutionException e2) {
                LocalTestApi localTestApi2 = C58939a.C58940a.f134171a.f134170a;
                C89219l.m154716b(localTestApi2, "");
                localTestApi2.getSpecActDebugService().mo106976a("SpecApi", "request task/page occur ExecutionException: " + e2.toString());
            }
            vVar.mo143024a(new Throwable("retry_error"));
            vVar.mo143023a();
        }
    }

    /* renamed from: a */
    public final void mo118183a(Activity activity, AbstractC75070a aVar) {
        C89219l.m154721d(activity, "");
        LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
        C89219l.m154716b(localTestApi, "");
        localTestApi.getSpecActDebugService().mo106976a("SpecApi", "request task/page actually");
        this.f168725c = aVar;
        AbstractC88979t.m154294a(new C75073d(this)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C75074e(this), new C75075f(this, activity));
    }
}

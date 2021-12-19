package com.p2082ss.android.ugc.aweme.specact.p3926b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3928b.C74958a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75061b;
import com.p2082ss.android.ugc.aweme.specact.popup.api.ISpecApi;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.b.c */
public final class C74939c {

    /* renamed from: a */
    public static final C74940a f168471a = new C74940a((byte) 0);

    static {
        Covode.recordClassIndex(87807);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.b.c$a */
    public static final class C74940a {
        static {
            Covode.recordClassIndex(87808);
        }

        private C74940a() {
        }

        public /* synthetic */ C74940a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.b.c$c */
    public static final class C74942c implements AbstractC88986z<C74936a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f168476a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f168477b;

        /* renamed from: c */
        final /* synthetic */ String f168478c;

        static {
            Covode.recordClassIndex(87810);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            AbstractC89172b bVar = this.f168477b;
            if (bVar != null) {
                bVar.invoke(new C74936a(100000, "Report final failed"));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C74936a aVar) {
            C74936a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f168465a == 0) {
                AbstractC89172b bVar = this.f168476a;
                if (bVar != null) {
                    bVar.invoke(aVar2);
                    return;
                }
                return;
            }
            AbstractC89172b bVar2 = this.f168477b;
            if (bVar2 != null) {
                bVar2.invoke(aVar2);
            }
        }

        C74942c(AbstractC89172b bVar, AbstractC89172b bVar2, String str) {
            this.f168476a = bVar;
            this.f168477b = bVar2;
            this.f168478c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.b.c$b */
    static final class C74941b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ String f168472a;

        /* renamed from: b */
        final /* synthetic */ int f168473b;

        /* renamed from: c */
        final /* synthetic */ String f168474c;

        /* renamed from: d */
        final /* synthetic */ boolean f168475d;

        static {
            Covode.recordClassIndex(87809);
        }

        C74941b(String str, int i, String str2, boolean z) {
            this.f168472a = str;
            this.f168473b = i;
            this.f168474c = str2;
            this.f168475d = z;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C74936a> vVar) {
            Integer num;
            Boolean bool;
            Integer num2;
            Integer num3;
            String str;
            int i;
            C89219l.m154721d(vVar, "");
            Boolean bool2 = null;
            try {
                C74958a aVar = ISpecApi.C75138a.m131890a().getTaskAwardByTaskId(this.f168472a, this.f168473b).get();
                if (aVar != null && aVar.status_code == 0) {
                    if (aVar.f168518a == 0) {
                        C74958a.C74959a aVar2 = aVar.f168519b;
                        if (aVar2 != null) {
                            num = Integer.valueOf(aVar2.f168523d);
                        } else {
                            num = null;
                        }
                        String valueOf = String.valueOf(num);
                        C74958a.C74959a aVar3 = aVar.f168519b;
                        if (aVar3 != null) {
                            bool = Boolean.valueOf(aVar3.f168524e);
                        } else {
                            bool = null;
                        }
                        C74958a.C74959a aVar4 = aVar.f168519b;
                        if (aVar4 != null) {
                            num2 = Integer.valueOf(aVar4.f168525f);
                        } else {
                            num2 = null;
                        }
                        C74958a.C74959a aVar5 = aVar.f168519b;
                        if (aVar5 != null) {
                            num3 = Integer.valueOf(aVar5.f168526g);
                        } else {
                            num3 = null;
                        }
                        C74958a.C74959a aVar6 = aVar.f168519b;
                        if (aVar6 != null) {
                            str = aVar6.f168527h;
                        } else {
                            str = null;
                        }
                        C74958a.C74959a aVar7 = aVar.f168519b;
                        if (aVar7 != null) {
                            bool2 = Boolean.valueOf(aVar7.f168528i);
                        }
                        C74958a.C74959a aVar8 = aVar.f168519b;
                        if (aVar8 != null) {
                            i = aVar8.f168529j;
                        } else {
                            i = 0;
                        }
                        vVar.mo143031a(new C74936a(0, new JSONObject().put("cold_down", valueOf).put("is_last_round", bool).put("display_amount", num2).put("display_cash_amount", num3).put("display_cash_amount_i18n", str).put("show_points", bool2).put("canival_ratio", i).toString()));
                        C75061b.m131822a(0, this.f168472a);
                        return;
                    }
                    int i2 = aVar.f168518a;
                    String str2 = aVar.message;
                    if (!this.f168475d) {
                        vVar.mo143031a(new C74936a(i2, str2));
                        C75061b.m131822a(i2, this.f168472a);
                    } else if (i2 == 10006 || i2 == 10009) {
                        vVar.mo143031a(new C74936a(i2, str2));
                        C75061b.m131822a(i2, this.f168472a);
                    } else {
                        vVar.mo143104b(new Throwable("report Failed"));
                        C75061b.m131822a(i2, this.f168472a);
                    }
                }
            } catch (ExecutionException e) {
                e.printStackTrace();
                vVar.mo143031a(new C74936a(100000, e.toString()));
            } catch (InterruptedException e2) {
                e2.printStackTrace();
                vVar.mo143031a(new C74936a(100000, e2.toString()));
            }
        }
    }

    /* renamed from: a */
    public static void m131538a(String str, int i, boolean z, AbstractC89172b<? super C74936a, C89391z> bVar, AbstractC89172b<? super C74936a, C89391z> bVar2) {
        C89219l.m154721d(str, "");
        AbstractC88979t.m154294a(new C74941b(str, i, "SpecActPendant", z)).mo143302g(new C74937b()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b((AbstractC88986z) new C74942c(bVar, bVar2, "SpecActPendant"));
    }
}

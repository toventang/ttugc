package com.p2082ss.android.ugc.aweme.qainvitation.p3639d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.api.QAInvitationAPI;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65845b;
import com.p2082ss.android.ugc.aweme.qainvitation.p3642g.C65855a;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.d.c */
public final class C65839c {

    /* renamed from: j */
    public static final C65840a f148370j = new C65840a((byte) 0);

    /* renamed from: a */
    public String f148371a = "";

    /* renamed from: b */
    public String f148372b = "";

    /* renamed from: c */
    public long f148373c;

    /* renamed from: d */
    public long f148374d;

    /* renamed from: e */
    public List<? extends IMUser> f148375e = C89086z.INSTANCE;

    /* renamed from: f */
    public boolean f148376f;

    /* renamed from: g */
    public int f148377g;

    /* renamed from: h */
    public List<IMUser> f148378h = new ArrayList();

    /* renamed from: i */
    public final C88411a f148379i;

    static {
        Covode.recordClassIndex(77340);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.c$a */
    public static final class C65840a {
        static {
            Covode.recordClassIndex(77341);
        }

        private C65840a() {
        }

        public /* synthetic */ C65840a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.c$b */
    static final class C65841b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C65839c f148380a;

        static {
            Covode.recordClassIndex(77342);
        }

        C65841b(C65839c cVar) {
            this.f148380a = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.c$b$b */
        static final class C65843b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65841b f148383a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f148384b;

            static {
                Covode.recordClassIndex(77344);
            }

            C65843b(C65841b bVar, AbstractC88982v vVar) {
                this.f148383a = bVar;
                this.f148384b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C89219l.m154721d(th, "");
                this.f148384b.mo143031a(this.f148383a.f148380a.f148378h);
                th.getMessage();
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<List<IMUser>> vVar) {
            C89219l.m154721d(vVar, "");
            this.f148380a.f148379i.mo142945a(QAInvitationAPI.C65759a.m117687a(this.f148380a.f148374d, this.f148380a.f148373c, this.f148380a.f148377g).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C65842a(this, vVar), new C65843b(this, vVar)));
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.d.c$b$a */
        static final class C65842a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C65841b f148381a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f148382b;

            static {
                Covode.recordClassIndex(77343);
            }

            C65842a(C65841b bVar, AbstractC88982v vVar) {
                this.f148381a = bVar;
                this.f148382b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                boolean z;
                int i;
                C65845b bVar = (C65845b) obj;
                if (bVar != null) {
                    C65839c cVar = this.f148381a.f148380a;
                    Integer num = bVar.f148389d;
                    if (num != null && num.intValue() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f148376f = z;
                    Integer num2 = bVar.f148388c;
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = 0;
                    }
                    cVar.f148377g = i;
                    List<User> list = bVar.f148386a;
                    if (list != null && !list.isEmpty()) {
                        List<User> list2 = bVar.f148386a;
                        if (list2 == null) {
                            C89219l.m154715b();
                        }
                        cVar.f148378h.addAll(C65855a.m117768a(list2));
                    }
                    this.f148382b.mo143031a(this.f148381a.f148380a.f148378h);
                    return;
                }
                this.f148382b.mo143031a(this.f148381a.f148380a.f148378h);
            }
        }
    }

    public C65839c(C88411a aVar) {
        C89219l.m154721d(aVar, "");
        this.f148379i = aVar;
    }
}

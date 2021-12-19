package com.p2082ss.android.ugc.aweme.player;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.player.f */
public final class C62957f {

    /* renamed from: a */
    public static C88411a f142901a = new C88411a();

    /* renamed from: b */
    public static boolean f142902b;

    /* renamed from: c */
    public static long f142903c = 30000;

    /* renamed from: d */
    public static AbstractC88922b<Long> f142904d;

    /* renamed from: e */
    public static final C62957f f142905e = new C62957f();

    /* renamed from: com.ss.android.ugc.aweme.player.f$a */
    public static final class C62958a extends AbstractC88922b<Long> {
        static {
            Covode.recordClassIndex(73795);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        C62958a() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            if (C17873f.f42636l) {
                C81079v.m140776O().mo123909C();
            }
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Object obj) {
            ((Number) obj).longValue();
        }
    }

    private C62957f() {
    }

    static {
        Covode.recordClassIndex(73794);
    }

    /* renamed from: com.ss.android.ugc.aweme.player.f$b */
    public static final class C62959b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C62959b f142906a = new C62959b();

        static {
            Covode.recordClassIndex(73796);
        }

        C62959b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean c = C49510c.m92749c();
            if (booleanValue && !c) {
                if (C62957f.f142904d != null) {
                    AbstractC88922b<Long> bVar = C62957f.f142904d;
                    if (bVar == null) {
                        C89219l.m154715b();
                    }
                    bVar.dispose();
                    C62957f.f142904d = null;
                }
                C62957f.f142904d = (AbstractC88922b) AbstractC88979t.m154307b(C62957f.f142903c, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143288c(new C62958a());
            } else if (C62957f.f142904d != null) {
                AbstractC88922b<Long> bVar2 = C62957f.f142904d;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                bVar2.dispose();
                C62957f.f142904d = null;
            }
        }
    }
}

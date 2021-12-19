package com.bytedance.android.live.liveinteract.platform.common.p370b;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.api.AbstractC4444o;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.Client;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b */
public final class C5676b {

    /* renamed from: a */
    public AbstractC5675a f14410a;

    /* renamed from: b */
    public final C88411a f14411b = new C88411a();

    /* renamed from: c */
    public final C5677a f14412c = new C5677a(this);

    static {
        Covode.recordClassIndex(6274);
    }

    /* renamed from: a */
    public final void mo11460a() {
        if (!this.f14411b.isDisposed()) {
            this.f14411b.dispose();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b$a */
    public static final class C5677a implements Client.Listener {

        /* renamed from: a */
        final /* synthetic */ C5676b f14413a;

        static {
            Covode.recordClassIndex(6275);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b$a$b */
        static final class C5679b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C5679b f14418a = new C5679b();

            static {
                Covode.recordClassIndex(6277);
            }

            C5679b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C3854a.m9458a(AbstractC4444o.f12039a, (Throwable) obj);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b$a$d */
        static final class C5681d<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C5681d f14423a = new C5681d();

            static {
                Covode.recordClassIndex(6279);
            }

            C5681d() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C3854a.m9458a(AbstractC4444o.f12039a, (Throwable) obj);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5677a(C5676b bVar) {
            this.f14413a = bVar;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b$a$a */
        static final class C5678a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C5677a f14414a;

            /* renamed from: b */
            final /* synthetic */ int f14415b;

            /* renamed from: c */
            final /* synthetic */ long f14416c;

            /* renamed from: d */
            final /* synthetic */ Exception f14417d;

            static {
                Covode.recordClassIndex(6276);
            }

            C5678a(C5677a aVar, int i, long j, Exception exc) {
                this.f14414a = aVar;
                this.f14415b = i;
                this.f14416c = j;
                this.f14417d = exc;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                String message;
                String message2;
                AbstractC5675a aVar;
                String message3;
                int i = this.f14415b;
                String str = "";
                if (i == -3) {
                    AbstractC5675a aVar2 = this.f14414a.f14413a.f14410a;
                    if (aVar2 != null) {
                        int i2 = (int) this.f14416c;
                        Exception exc = this.f14417d;
                        if (!(exc == null || (message = exc.getMessage()) == null)) {
                            str = message;
                        }
                        aVar2.mo10315c(i2, str);
                    }
                } else if (i == -2) {
                    AbstractC5675a aVar3 = this.f14414a.f14413a.f14410a;
                    if (aVar3 != null) {
                        int i3 = (int) this.f14416c;
                        Exception exc2 = this.f14417d;
                        if (!(exc2 == null || (message2 = exc2.getMessage()) == null)) {
                            str = message2;
                        }
                        aVar3.mo10306b(i3, str);
                    }
                } else if (i == -1 && (aVar = this.f14414a.f14413a.f14410a) != null) {
                    int i4 = (int) this.f14416c;
                    Exception exc3 = this.f14417d;
                    if (!(exc3 == null || (message3 = exc3.getMessage()) == null)) {
                        str = message3;
                    }
                    aVar.mo10290a(i4, str);
                }
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.platform.common.b.b$a$c */
        static final class C5680c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C5677a f14419a;

            /* renamed from: b */
            final /* synthetic */ int f14420b;

            /* renamed from: c */
            final /* synthetic */ long f14421c;

            /* renamed from: d */
            final /* synthetic */ Object[] f14422d;

            static {
                Covode.recordClassIndex(6278);
            }

            C5680c(C5677a aVar, int i, long j, Object[] objArr) {
                this.f14419a = aVar;
                this.f14420b = i;
                this.f14421c = j;
                this.f14422d = objArr;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r1v9 */
            /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r6v5 */
            /* JADX WARN: Type inference failed for: r3v13 */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r3v14 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[]] */
            /* JADX WARN: Type inference failed for: r3v20 */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARNING: Unknown variable types count: 16 */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void accept(java.lang.Object r9) {
                /*
                // Method dump skipped, instructions count: 534
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.platform.common.p370b.C5676b.C5677a.C5680c.accept(java.lang.Object):void");
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.Client.Listener
        public final void onError(Client client, int i, long j, Exception exc) {
            this.f14413a.f14411b.mo142945a(AbstractC88979t.m154310b((Object) 1).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5678a(this, i, j, exc), C5679b.f14418a));
        }

        @Override // com.p2082ss.avframework.livestreamv2.core.Client.Listener
        public final void onInfo(Client client, int i, long j, Object... objArr) {
            C89219l.m154721d(objArr, "");
            this.f14413a.f14411b.mo142945a(AbstractC88979t.m154310b((Object) 1).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C5680c(this, i, j, objArr), C5681d.f14423a));
        }
    }

    /* renamed from: a */
    public final void mo11461a(AbstractC5675a aVar) {
        C89219l.m154721d(aVar, "");
        this.f14410a = aVar;
    }
}

package com.bytedance.android.livesdk.p455ar;

import com.bytedance.android.live.network.response.C5830b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManagerV2;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87081e;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87083f;
import com.p2082ss.ugc.live.sdk.msg.p4473d.AbstractC87110f;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ar.a */
public final class C6829a {

    /* renamed from: a */
    public static final C6830a f17116a = new C6830a((byte) 0);

    static {
        Covode.recordClassIndex(7567);
    }

    /* renamed from: com.bytedance.android.livesdk.ar.a$a */
    public static final class C6830a {
        static {
            Covode.recordClassIndex(7568);
        }

        private C6830a() {
        }

        public /* synthetic */ C6830a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.ar.a$a$a */
        public static final class C6831a<T> implements AbstractC88983w {

            /* renamed from: a */
            final /* synthetic */ IMessageManagerV2 f17117a;

            /* renamed from: b */
            final /* synthetic */ long f17118b;

            /* renamed from: c */
            final /* synthetic */ C87081e f17119c;

            static {
                Covode.recordClassIndex(7569);
            }

            C6831a(IMessageManagerV2 iMessageManagerV2, long j, C87081e eVar) {
                this.f17117a = iMessageManagerV2;
                this.f17118b = j;
                this.f17119c = eVar;
            }

            @Override // p4560f.p4561a.AbstractC88983w
            public final void subscribe(final AbstractC88982v<T> vVar) {
                C89219l.m154721d(vVar, "");
                this.f17117a.sendRequest(this.f17118b, this.f17119c, new AbstractC87079c() {
                    /* class com.bytedance.android.livesdk.p455ar.C6829a.C6830a.C6831a.C68321 */

                    static {
                        Covode.recordClassIndex(7570);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: f.a.v */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c
                    /* renamed from: a */
                    public final void mo13086a(AbstractC87110f<C87083f, ? extends Exception> fVar) {
                        C89219l.m154721d(fVar, "");
                        if (fVar instanceof AbstractC87110f.C87113c) {
                            V v = ((AbstractC87110f.C87113c) fVar).f196386b;
                            Object obj = v.f196316e;
                            if (obj instanceof C5830b) {
                                ((C5830b) obj).requestType = v.f196317f;
                            }
                            vVar.mo143031a(obj);
                            vVar.mo143023a();
                        } else if (fVar instanceof AbstractC87110f.C87112b) {
                            vVar.mo143024a((Throwable) ((AbstractC87110f.C87112b) fVar).f196385b);
                        } else {
                            throw new C89376n();
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.ar.a$a$b */
        public static final class C6833b<T> implements AbstractC88407af {

            /* renamed from: a */
            final /* synthetic */ IMessageManagerV2 f17121a;

            /* renamed from: b */
            final /* synthetic */ long f17122b;

            /* renamed from: c */
            final /* synthetic */ C87081e f17123c;

            static {
                Covode.recordClassIndex(7571);
            }

            C6833b(IMessageManagerV2 iMessageManagerV2, long j, C87081e eVar) {
                this.f17121a = iMessageManagerV2;
                this.f17122b = j;
                this.f17123c = eVar;
            }

            @Override // p4560f.p4561a.AbstractC88407af
            public final void subscribe(final AbstractC88405ad<T> adVar) {
                C89219l.m154721d(adVar, "");
                this.f17121a.sendRequest(this.f17122b, this.f17123c, new AbstractC87079c() {
                    /* class com.bytedance.android.livesdk.p455ar.C6829a.C6830a.C6833b.C68341 */

                    static {
                        Covode.recordClassIndex(7572);
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: f.a.ad */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c
                    /* renamed from: a */
                    public final void mo13086a(AbstractC87110f<C87083f, ? extends Exception> fVar) {
                        C89219l.m154721d(fVar, "");
                        if (fVar instanceof AbstractC87110f.C87113c) {
                            V v = ((AbstractC87110f.C87113c) fVar).f196386b;
                            Object obj = v.f196316e;
                            if (obj instanceof C5830b) {
                                ((C5830b) obj).requestType = v.f196317f;
                            }
                            adVar.mo142931a(obj);
                        } else if (fVar instanceof AbstractC87110f.C87112b) {
                            adVar.mo142932a((Throwable) ((AbstractC87110f.C87112b) fVar).f196385b);
                        } else {
                            throw new C89376n();
                        }
                    }
                });
            }
        }
    }
}

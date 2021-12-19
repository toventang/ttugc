package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import java.util.concurrent.atomic.AtomicInteger;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4591l.C88962d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.p */
public final class C74297p {

    /* renamed from: d */
    public static final C74298a f167073d = new C74298a((byte) 0);

    /* renamed from: a */
    public final int f167074a;

    /* renamed from: b */
    public final int f167075b;

    /* renamed from: c */
    public final AbstractC69978a f167076c;

    /* renamed from: e */
    private C88962d<C89378p<Integer, Bitmap>> f167077e;

    /* renamed from: f */
    private boolean f167078f;

    /* renamed from: g */
    private final AbstractC89244h f167079g;

    static {
        Covode.recordClassIndex(87069);
    }

    /* renamed from: c */
    private final AbstractC88979t<C89378p<Integer, Bitmap>> m130706c() {
        return (AbstractC88979t) this.f167079g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.p$a */
    public static final class C74298a {
        static {
            Covode.recordClassIndex(87070);
        }

        private C74298a() {
        }

        public /* synthetic */ C74298a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.p$b */
    static final class C74299b extends AbstractC89220m implements AbstractC89171a<AbstractC88979t<C89378p<? extends Integer, ? extends Bitmap>>> {

        /* renamed from: a */
        final /* synthetic */ C74297p f167080a;

        /* renamed from: b */
        final /* synthetic */ int f167081b;

        /* renamed from: c */
        final /* synthetic */ int f167082c;

        /* renamed from: d */
        final /* synthetic */ int f167083d;

        static {
            Covode.recordClassIndex(87071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74299b(C74297p pVar, int i, int i2, int i3) {
            super(0);
            this.f167080a = pVar;
            this.f167081b = i;
            this.f167082c = i2;
            this.f167083d = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88979t<C89378p<? extends Integer, ? extends Bitmap>> invoke() {
            return AbstractC88979t.m154294a(new AbstractC88983w<C89378p<? extends Integer, ? extends Bitmap>>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p.C74299b.C743001 */

                /* renamed from: a */
                final /* synthetic */ C74299b f167084a;

                static {
                    Covode.recordClassIndex(87072);
                }

                {
                    this.f167084a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [f.a.v<h.p<java.lang.Integer, android.graphics.Bitmap>>] */
                @Override // p4560f.p4561a.AbstractC88983w
                public final void subscribe(final AbstractC88982v<C89378p<? extends Integer, ? extends Bitmap>> vVar) {
                    C89219l.m154721d(vVar, "");
                    final AtomicInteger atomicInteger = new AtomicInteger();
                    this.f167084a.f167080a.f167076c.mo110422a(this.f167084a.f167081b, this.f167084a.f167082c, new AbstractC69978a.AbstractC69979a(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.C74297p.C74299b.C743001.C743011 */

                        /* renamed from: a */
                        final /* synthetic */ C743001 f167085a;

                        static {
                            Covode.recordClassIndex(87073);
                        }

                        {
                            this.f167085a = r1;
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: f.a.v */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a.AbstractC69979a
                        /* renamed from: a */
                        public final void mo110426a(int i, Bitmap bitmap) {
                            vVar.mo143031a(new C89378p(Integer.valueOf(i), bitmap));
                            if (atomicInteger.incrementAndGet() == this.f167085a.f167084a.f167083d) {
                                vVar.mo143023a();
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<C89378p<Integer, Bitmap>> mo116905a() {
        if (!this.f167078f) {
            m130706c().mo143062b((AbstractC88986z<? super C89378p<Integer, Bitmap>>) this.f167077e);
            this.f167078f = true;
        }
        return this.f167077e;
    }

    /* renamed from: b */
    public final void mo116906b() {
        this.f167076c.mo110423b();
        this.f167078f = false;
        C88962d<C89378p<Integer, Bitmap>> i = C88962d.m154225i();
        C89219l.m154716b(i, "");
        this.f167077e = i;
    }

    public C74297p(AbstractC69978a aVar, int i, int i2, int i3) {
        C89219l.m154721d(aVar, "");
        this.f167076c = aVar;
        C88962d<C89378p<Integer, Bitmap>> i4 = C88962d.m154225i();
        C89219l.m154716b(i4, "");
        this.f167077e = i4;
        this.f167074a = i3;
        this.f167075b = i;
        this.f167079g = C89250i.m154773a((AbstractC89171a) new C74299b(this, i, i2, i3));
    }
}

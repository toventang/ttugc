package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.p3481ui.C61182o;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.a */
public abstract class AbstractC61087a {

    /* renamed from: a */
    public Effect f138639a;

    /* renamed from: b */
    public C61173h f138640b;

    /* renamed from: c */
    public final Context f138641c;

    /* renamed from: d */
    public String f138642d;

    /* renamed from: e */
    public final MusicModel f138643e;

    /* renamed from: f */
    private AbstractC88412b f138644f;

    /* renamed from: g */
    private AbstractC88412b f138645g;

    /* renamed from: h */
    private final C60789f f138646h;

    static {
        Covode.recordClassIndex(71690);
    }

    /* renamed from: a */
    public abstract void mo98633a(Map<String, String> map, AbstractC61172g gVar);

    /* renamed from: c */
    public abstract AbstractC88433f<C61198q> mo98636c();

    /* renamed from: d */
    public abstract AbstractC88433f<C61197p> mo98637d();

    /* renamed from: b */
    public final void mo98635b() {
        C61173h hVar = this.f138640b;
        if (hVar != null) {
            hVar.mo98719a((AbstractC61172g) null);
        }
    }

    /* renamed from: a */
    public final void mo98630a() {
        AbstractC88412b bVar = this.f138644f;
        if (bVar != null && (!bVar.isDisposed())) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f138645g;
        if (bVar2 != null && (!bVar2.isDisposed())) {
            bVar2.dispose();
        }
        mo98635b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.a$a */
    public static final class C61088a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC61087a f138647a;

        static {
            Covode.recordClassIndex(71691);
        }

        C61088a(AbstractC61087a aVar) {
            this.f138647a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C61198q qVar = (C61198q) obj;
            C89219l.m154721d(qVar, "");
            this.f138647a.f138639a = qVar.f138948e;
            return qVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.a$c */
    public static final class C61090c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC61087a f138649a;

        static {
            Covode.recordClassIndex(71693);
        }

        C61090c(AbstractC61087a aVar) {
            this.f138649a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C61198q qVar = (C61198q) obj;
            C89219l.m154721d(qVar, "");
            this.f138649a.f138639a = qVar.f138948e;
            return qVar;
        }
    }

    /* renamed from: a */
    private final AbstractC88412b m110681a(C88960c<C61197p> cVar) {
        AbstractC88412b d = cVar.mo143289d(mo98637d());
        C89219l.m154716b(d, "");
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo98632a(Map<String, String> map) {
        C88960c<C61197p> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f138644f = m110681a(cVar);
        this.f138645g = m110682a(cVar, map);
    }

    /* renamed from: a */
    public final void mo98631a(AbstractC61172g gVar, boolean z) {
        mo98634a(null, gVar, z, this.f138642d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.ui.a$b */
    public static final class C61089b<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C61089b f138648a = new C61089b();

        static {
            Covode.recordClassIndex(71692);
        }

        C61089b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            C61198q qVar = (C61198q) obj;
            C61198q qVar2 = (C61198q) obj2;
            C89219l.m154721d(qVar, "");
            C89219l.m154721d(qVar2, "");
            String str = qVar.f138944a;
            if (str == null) {
                str = qVar2.f138944a;
            }
            MusicWaveBean musicWaveBean = qVar.f138945b;
            if (musicWaveBean == null) {
                musicWaveBean = qVar2.f138945b;
            }
            Integer num = qVar.f138946c;
            if (num == null) {
                num = qVar2.f138946c;
            }
            C84125a aVar = qVar.f138947d;
            if (aVar == null) {
                aVar = qVar2.f138947d;
            }
            Effect effect = qVar.f138948e;
            if (effect == null) {
                effect = qVar2.f138948e;
            }
            Integer num2 = qVar.f138949f;
            if (num2 == null) {
                num2 = qVar2.f138949f;
            }
            ExceptionResult exceptionResult = qVar.f138950g;
            if (exceptionResult == null) {
                exceptionResult = qVar2.f138950g;
            }
            return new C61198q(str, musicWaveBean, num, aVar, effect, num2, exceptionResult);
        }
    }

    /* renamed from: a */
    private final AbstractC88412b m110682a(C88960c<C61197p> cVar, Map<String, String> map) {
        AbstractC88412b d = AbstractC88979t.m154296a(C61182o.m110813a(this.f138646h, this.f138643e, cVar), C61181n.m110811a(this.f138641c, this.f138642d, this.f138639a, cVar, map).mo143292d(new C61088a(this)), C61089b.f138648a).mo143289d(mo98636c());
        C89219l.m154716b(d, "");
        return d;
    }

    public AbstractC61087a(Context context, String str, MusicModel musicModel, C60789f fVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(fVar, "");
        this.f138641c = context;
        this.f138642d = str;
        this.f138643e = musicModel;
        this.f138646h = fVar;
    }

    /* renamed from: a */
    public final void mo98634a(Map<String, String> map, AbstractC61172g gVar, boolean z, String str) {
        String str2;
        String str3;
        if (this.f138640b != null && gVar == null) {
            this.f138642d = str;
        } else if ((this.f138644f == null || this.f138645g == null || (!C89219l.m154714a((Object) this.f138642d, (Object) str))) && !z) {
            Effect effect = this.f138639a;
            if (effect != null) {
                str3 = effect.getId();
            } else {
                str3 = null;
            }
            if (!TextUtils.equals(str3, str)) {
                this.f138639a = null;
            }
            this.f138642d = str;
            this.f138640b = new C61173h(gVar);
            mo98632a(map);
        } else if ((this.f138644f == null || this.f138645g == null || (!C89219l.m154714a((Object) this.f138642d, (Object) str))) && z) {
            Effect effect2 = this.f138639a;
            if (effect2 != null) {
                str2 = effect2.getId();
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str2, str)) {
                this.f138639a = null;
            }
            this.f138642d = str;
            this.f138640b = new C61173h(gVar);
            C88960c<C61197p> cVar = new C88960c<>();
            C89219l.m154716b(cVar, "");
            this.f138644f = m110681a(cVar);
            Context context = this.f138641c;
            String str4 = this.f138642d;
            Effect effect3 = this.f138639a;
            C89219l.m154721d(context, "");
            C89219l.m154721d(cVar, "");
            AbstractC88979t a = AbstractC88979t.m154294a(new C61182o.C61191b(cVar, str4, effect3, context, map));
            C89219l.m154716b(a, "");
            AbstractC88412b d = a.mo143292d(new C61090c(this)).mo143289d(mo98636c());
            C89219l.m154716b(d, "");
            this.f138645g = d;
        } else {
            this.f138642d = str;
            AbstractC88412b bVar = this.f138645g;
            if (bVar == null) {
                C89219l.m154715b();
            }
            if (bVar.isDisposed()) {
                C61173h hVar = this.f138640b;
                if (hVar != null) {
                    hVar.mo98719a(gVar);
                }
                this.f138644f = null;
                this.f138645g = null;
            } else if (gVar == null || !z) {
                mo98633a(map, gVar);
            } else {
                C61173h hVar2 = this.f138640b;
                if (hVar2 != null) {
                    hVar2.mo98719a(gVar);
                }
                AbstractC88412b bVar2 = this.f138644f;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                AbstractC88412b bVar3 = this.f138645g;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                this.f138644f = null;
                this.f138645g = null;
                gVar.mo98716a(this.f138642d, null);
            }
        }
    }
}

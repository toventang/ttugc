package com.bytedance.android.livesdk.util.rxutils.autodispose;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.util.rxutils.AbstractC11190e;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p647a.C11134c;
import com.bytedance.covode.number.Covode;
import org.p4663a.AbstractC90213b;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.AbstractC88409ah;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.AbstractC88970m;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88502d;
import p4560f.p4561a.p4568e.p4573e.p4575b.C88552l;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.e */
public final class C11152e {
    static {
        Covode.recordClassIndex(12779);
    }

    /* renamed from: a */
    public static <T> AbstractC11164m<T> m19788a(View view) {
        if (view == null) {
            return m19791a(C11160i.f26776a);
        }
        return m19791a(C11134c.m19772a(view));
    }

    /* renamed from: b */
    static final /* synthetic */ AbstractC88917f m19794b(AbstractC11136ab abVar) {
        try {
            return abVar.mo17928c();
        } catch (C11135aa e) {
            AbstractC88433f<? super C11135aa> fVar = C11168q.f26783a;
            if (fVar == null) {
                return AbstractC88410b.m153640a(e);
            }
            fVar.accept(e);
            return C88925a.m154165a(C88502d.f200771a);
        }
    }

    /* renamed from: c */
    static final /* synthetic */ AbstractC88917f m19795c(AbstractC11136ab abVar) {
        try {
            return abVar.mo17928c();
        } catch (C11135aa e) {
            AbstractC88433f<? super C11135aa> fVar = C11168q.f26783a;
            if (fVar == null) {
                return AbstractC88410b.m153640a(e);
            }
            fVar.accept(e);
            return C88925a.m154165a(C88502d.f200771a);
        }
    }

    /* renamed from: a */
    public static <T> AbstractC11164m<T> m19789a(Fragment fragment) {
        if (fragment == null) {
            return m19791a(C11158g.f26774a);
        }
        return m19791a(C11126a.m19763a(fragment, AbstractC1196i.EnumC1198a.ON_DESTROY));
    }

    /* renamed from: a */
    public static <T> AbstractC11164m<T> m19790a(AbstractC1204m mVar) {
        if (mVar == null) {
            return m19791a(C11159h.f26775a);
        }
        return m19791a(C11126a.m19763a(mVar, AbstractC1196i.EnumC1198a.ON_DESTROY));
    }

    /* renamed from: a */
    public static <T> AbstractC11164m<T> m19791a(AbstractC11136ab abVar) {
        C11170s.m19819a(abVar, "provider == null");
        return m19793a(AbstractC88410b.m153641a(new CallableC11161j(abVar)), (AbstractC11190e) null);
    }

    /* renamed from: a */
    private static <T> AbstractC11164m<T> m19793a(final AbstractC88917f fVar, final AbstractC11190e<T> eVar) {
        C11170s.m19819a(fVar, "scope == null");
        return new AbstractC11164m<T>() {
            /* class com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e.C111531 */

            static {
                Covode.recordClassIndex(12780);
            }

            @Override // p4560f.p4561a.AbstractC88404ac
            /* renamed from: a */
            public final /* synthetic */ Object mo17944a(final AbstractC88403ab abVar) {
                AbstractC11190e eVar = eVar;
                if (eVar != null) {
                    abVar = abVar.mo142910a((AbstractC88409ah) eVar);
                }
                return new AbstractC11137ac<T>() {
                    /* class com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e.C111531.C111563 */

                    static {
                        Covode.recordClassIndex(12783);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac
                    /* renamed from: a */
                    public final AbstractC88412b mo17935a() {
                        return new C11169r(abVar, fVar).mo142926c();
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac
                    /* renamed from: a */
                    public final AbstractC88412b mo17936a(AbstractC88433f<? super T> fVar) {
                        return new C11169r(abVar, fVar).mo142929d(fVar);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac
                    /* renamed from: a */
                    public final void mo17938a(AbstractC88406ae<? super T> aeVar) {
                        new C11169r(abVar, fVar).mo116431a_(aeVar);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac
                    /* renamed from: a */
                    public final AbstractC88412b mo17937a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2) {
                        return new C11169r(abVar, fVar).mo142915a(fVar, fVar2);
                    }
                };
            }

            @Override // p4560f.p4561a.AbstractC88981u
            /* renamed from: a */
            public final /* synthetic */ Object mo17946a(final AbstractC88979t tVar) {
                AbstractC11190e eVar = eVar;
                if (eVar != null) {
                    tVar = tVar.mo143271a(eVar);
                }
                return new AbstractC11181z<T>() {
                    /* class com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e.C111531.C111552 */

                    static {
                        Covode.recordClassIndex(12782);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z
                    /* renamed from: a */
                    public final AbstractC88412b mo17948a() {
                        return new C11167p(tVar, fVar).mo143300g();
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z
                    /* renamed from: a */
                    public final AbstractC88412b mo17949a(AbstractC88433f<? super T> fVar) {
                        return new C11167p(tVar, fVar).mo143289d(fVar);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z
                    /* renamed from: a */
                    public final AbstractC88412b mo17950a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2) {
                        return new C11167p(tVar, fVar).mo143254a(fVar, fVar2);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z
                    /* renamed from: a */
                    public final AbstractC88412b mo17951a(AbstractC88433f<? super T> fVar, AbstractC88433f<? super Throwable> fVar2, AbstractC88428a aVar) {
                        return new C11167p(tVar, fVar).mo143255a(fVar, fVar2, aVar);
                    }
                };
            }

            @Override // p4560f.p4561a.AbstractC88926i
            /* renamed from: a */
            public final /* synthetic */ Object mo17945a(final AbstractC88924h hVar) {
                AbstractC11190e eVar = eVar;
                if (eVar != null) {
                    AbstractC90213b a = ((AbstractC88970m) C88466b.m153697a((Object) eVar, "composer is null")).mo17969a(hVar);
                    if (a instanceof AbstractC88924h) {
                        hVar = C88925a.m154168a((AbstractC88924h) a);
                    } else {
                        C88466b.m153697a((Object) a, "publisher is null");
                        hVar = C88925a.m154168a(new C88552l(a));
                    }
                }
                return new AbstractC11180y<T>() {
                    /* class com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e.C111531.C111541 */

                    static {
                        Covode.recordClassIndex(12781);
                    }

                    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11180y
                    /* renamed from: a */
                    public final AbstractC88412b mo17947a(AbstractC88433f<? super T> fVar) {
                        return new C11166o(hVar, fVar).mo143202b(fVar);
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static <T> AbstractC11164m<T> m19792a(AbstractC11136ab abVar, AbstractC11190e<T> eVar) {
        C11170s.m19819a(abVar, "provider == null");
        return m19793a(AbstractC88410b.m153641a(new CallableC11162k(abVar)), eVar);
    }
}

package com.bytedance.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.p022b.p023a.C0464a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.widget.C23666b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.widget.c */
public final class C23669c {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f56021a = {new C89232y(C89204ab.m154669a(C23669c.class), "asyncLayoutInflater", "getAsyncLayoutInflater()Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;"), new C89232y(C89204ab.m154669a(C23669c.class), "syncLayoutInflater", "getSyncLayoutInflater()Landroid/view/LayoutInflater;")};

    /* renamed from: h */
    public static final C23671a f56022h = new C23671a((byte) 0);

    /* renamed from: b */
    final AbstractC89244h f56023b;

    /* renamed from: c */
    final AbstractC89244h f56024c;

    /* renamed from: d */
    public final CopyOnWriteArrayList<Widget> f56025d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    final HashMap<Widget, ViewGroup> f56026e = new HashMap<>();

    /* renamed from: f */
    public C23666b f56027f;

    /* renamed from: g */
    public final AbstractC1196i f56028g;

    /* renamed from: i */
    private final View f56029i;

    /* renamed from: com.bytedance.widget.c$a */
    public static final class C23671a {
        static {
            Covode.recordClassIndex(27773);
        }

        private C23671a() {
        }

        public /* synthetic */ C23671a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C23669c m44763a(Fragment fragment, View view) {
            C89219l.m154719c(fragment, "");
            if (fragment == null) {
                C89219l.m154707a();
            }
            AbstractC0952i childFragmentManager = fragment.getChildFragmentManager();
            C89219l.m154709a((Object) childFragmentManager, "");
            Fragment a = childFragmentManager.mo3551a(C23666b.f56012d);
            if (!(a instanceof C23666b)) {
                a = null;
            }
            C23666b bVar = (C23666b) a;
            if (bVar == null) {
                bVar = new C23666b();
                bVar.f56014a = fragment;
                AbstractC0952i fragmentManager = fragment.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.mo3555a((AbstractC0952i.AbstractC0954b) new C23666b.C23667a.C23668a(bVar), false);
                }
                childFragmentManager.mo3552a().mo3456a(bVar, C23666b.f56012d).mo3478e();
            }
            AbstractC1196i lifecycle = bVar.getLifecycle();
            C89219l.m154709a((Object) lifecycle, "");
            return m44764a(lifecycle, bVar, view);
        }

        /* renamed from: a */
        public static C23669c m44764a(AbstractC1196i iVar, C23666b bVar, View view) {
            C89219l.m154719c(iVar, "");
            C89219l.m154719c(bVar, "");
            C23669c a = bVar.mo39095a(iVar);
            if (a != null) {
                return a;
            }
            C23669c cVar = new C23669c(bVar, view, iVar);
            bVar.mo39096a(iVar, cVar);
            return cVar;
        }
    }

    /* renamed from: com.bytedance.widget.c$b */
    static final class C23672b extends AbstractC89220m implements AbstractC89171a<C0464a> {

        /* renamed from: a */
        final /* synthetic */ C23666b f56031a;

        static {
            Covode.recordClassIndex(27774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23672b(C23666b bVar) {
            super(0);
            this.f56031a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C0464a invoke() {
            return new C0464a(this.f56031a.mo39094a());
        }
    }

    /* renamed from: com.bytedance.widget.c$e */
    static final class C23676e extends AbstractC89220m implements AbstractC89171a<LayoutInflater> {

        /* renamed from: a */
        final /* synthetic */ C23666b f56040a;

        static {
            Covode.recordClassIndex(27778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23676e(C23666b bVar) {
            super(0);
            this.f56040a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LayoutInflater invoke() {
            return LayoutInflater.from(this.f56040a.mo39094a());
        }
    }

    /* renamed from: a */
    public final C23666b mo39099a() {
        C23666b bVar = this.f56027f;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    static {
        Covode.recordClassIndex(27771);
    }

    /* renamed from: com.bytedance.widget.c$c */
    static final class C23673c extends AbstractC89220m implements AbstractC89172b<ViewGroup, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C23669c f56032a;

        /* renamed from: b */
        final /* synthetic */ Widget f56033b;

        /* renamed from: c */
        final /* synthetic */ AbstractC23665a f56034c;

        static {
            Covode.recordClassIndex(27775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23673c(C23669c cVar, Widget widget, AbstractC23665a aVar) {
            super(1);
            this.f56032a = cVar;
            this.f56033b = widget;
            this.f56034c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154719c(viewGroup2, "");
            C23669c cVar = this.f56032a;
            Widget widget = this.f56033b;
            cVar.mo39103a(widget, viewGroup2, this.f56034c.mo39093a(widget.mo39079b(), viewGroup2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.widget.c$d */
    static final class C23674d extends AbstractC89220m implements AbstractC89172b<ViewGroup, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C23669c f56035a;

        /* renamed from: b */
        final /* synthetic */ boolean f56036b;

        /* renamed from: c */
        final /* synthetic */ Widget f56037c;

        static {
            Covode.recordClassIndex(27776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23674d(C23669c cVar, boolean z, Widget widget) {
            super(1);
            this.f56035a = cVar;
            this.f56036b = z;
            this.f56037c = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ViewGroup viewGroup) {
            final ViewGroup viewGroup2 = viewGroup;
            C89219l.m154719c(viewGroup2, "");
            if (this.f56036b) {
                ((C0464a) this.f56035a.f56023b.getValue()).mo2025a(this.f56037c.mo39079b(), viewGroup2, new C0464a.AbstractC0469d(this) {
                    /* class com.bytedance.widget.C23669c.C23674d.C236751 */

                    /* renamed from: a */
                    final /* synthetic */ C23674d f56038a;

                    static {
                        Covode.recordClassIndex(27777);
                    }

                    {
                        this.f56038a = r1;
                    }

                    @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
                    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
                        C89219l.m154719c(view, "");
                        if (this.f56038a.f56035a.f56027f != null && !this.f56038a.f56035a.mo39099a().isDetached() && !this.f56038a.f56035a.mo39099a().isRemoving() && this.f56038a.f56035a.f56028g.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                            this.f56038a.f56035a.mo39103a(this.f56038a.f56037c, viewGroup2, view);
                        }
                    }
                });
            } else {
                C23669c cVar = this.f56035a;
                Widget widget = this.f56037c;
                View a = C1764a.m5927a((LayoutInflater) cVar.f56024c.getValue(), this.f56037c.mo39079b(), viewGroup2, false);
                C89219l.m154709a((Object) a, "");
                cVar.mo39103a(widget, viewGroup2, a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final C23669c mo39102a(Widget widget) {
        C89219l.m154719c(widget, "");
        if (this.f56025d.contains(widget)) {
            return this;
        }
        widget.f56002b = mo39099a();
        this.f56025d.add(widget);
        mo39099a().mo39097a(widget);
        this.f56028g.mo4012a(widget);
        return this;
    }

    /* renamed from: a */
    public final C23669c mo39101a(int i, Widget widget, boolean z) {
        C89219l.m154719c(widget, "");
        m44757a(i, widget, new C23674d(this, z, widget));
        return this;
    }

    /* renamed from: a */
    private final C23669c m44757a(int i, Widget widget, AbstractC89172b<? super ViewGroup, C89391z> bVar) {
        if (widget.mo39079b() <= 0) {
            return mo39102a(widget);
        }
        View view = this.f56029i;
        if (view != null) {
            widget.f56002b = mo39099a();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(i);
            C89219l.m154709a((Object) viewGroup, "");
            widget.mo39078a(viewGroup);
            this.f56026e.put(widget, viewGroup);
            bVar.invoke(viewGroup);
            return this;
        }
        throw new IllegalArgumentException("make sure this WidgetManager is created with rootView".toString());
    }

    public C23669c(C23666b bVar, View view, AbstractC1196i iVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(iVar, "");
        this.f56029i = view;
        this.f56028g = iVar;
        this.f56023b = C89250i.m154773a((AbstractC89171a) new C23672b(bVar));
        this.f56024c = C89250i.m154773a((AbstractC89171a) new C23676e(bVar));
        this.f56027f = bVar;
        C236701 r1 = new AbstractC89171a<C89391z>(this) {
            /* class com.bytedance.widget.C23669c.C236701 */

            /* renamed from: a */
            final /* synthetic */ C23669c f56030a;

            static {
                Covode.recordClassIndex(27772);
            }

            {
                this.f56030a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                MethodCollector.m26663i(2342);
                for (T t : this.f56030a.f56025d) {
                    C23669c cVar = this.f56030a;
                    C89219l.m154709a((Object) t, "");
                    C89219l.m154719c(t, "");
                    cVar.f56028g.mo4013b(t);
                    int i = C23677d.f56041a[cVar.f56028g.mo4011a().ordinal()];
                    if (i != 2) {
                        if (i == 3) {
                            t.destroy$widget_release();
                        } else if (i == 4) {
                            t.stop$widget_release();
                            t.destroy$widget_release();
                        } else if (i == 5) {
                            t.pause$widget_release();
                            t.stop$widget_release();
                            t.destroy$widget_release();
                        }
                    } else if (!t.f56003c) {
                        t.destroy$widget_release();
                    }
                    t.f56002b = null;
                    cVar.f56025d.remove(t);
                    if (cVar.f56026e.containsKey(t)) {
                        ViewGroup viewGroup = cVar.f56026e.get(t);
                        if (viewGroup == null) {
                            C89219l.m154707a();
                        }
                        viewGroup.removeAllViews();
                        cVar.f56026e.remove(t);
                    }
                    C23666b a = cVar.mo39099a();
                    C89219l.m154719c(t, "");
                    Iterator<T> it = a.f56015b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                this.f56030a.f56025d.clear();
                this.f56030a.f56027f = null;
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(2342);
                return zVar;
            }
        };
        C89219l.m154719c(r1, "");
        bVar.f56016c.add(r1);
    }

    /* renamed from: a */
    public final C23669c mo39100a(int i, Widget widget, AbstractC23665a aVar) {
        C89219l.m154719c(widget, "");
        C89219l.m154719c(aVar, "");
        m44757a(i, widget, new C23673c(this, widget, aVar));
        return this;
    }

    /* renamed from: a */
    public final void mo39103a(Widget widget, ViewGroup viewGroup, View view) {
        MethodCollector.m26663i(2384);
        C89219l.m154719c(view, "");
        widget.f56005e = view;
        viewGroup.addView(view);
        this.f56025d.add(widget);
        mo39099a().mo39097a(widget);
        this.f56028g.mo4012a(widget);
        MethodCollector.m26664o(2384);
    }
}

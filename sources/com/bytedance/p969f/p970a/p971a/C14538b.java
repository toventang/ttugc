package com.bytedance.p969f.p970a.p971a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.f.a.a.b */
final class C14538b implements AbstractC14552j {

    /* renamed from: a */
    public final C14540c f35143a;

    /* renamed from: b */
    public final Context f35144b;

    /* renamed from: c */
    public final ViewGroup f35145c;

    /* renamed from: d */
    private final InvocationHandler f35146d;

    /* renamed from: e */
    private final GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a f35147e;

    /* renamed from: f */
    private final GestureDetector$OnDoubleTapListenerC14546h f35148f;

    static {
        Covode.recordClassIndex(16625);
    }

    @Override // com.bytedance.p969f.p970a.p971a.AbstractC14552j
    /* renamed from: a */
    public final FrameLayout mo23382a() {
        return this.f35148f;
    }

    /* renamed from: b */
    public final void mo23384b() {
        View c;
        Iterator<T> it = this.f35143a.f35151b.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            AbstractC14551i iVar = it.next().f35158b;
            if (!(iVar == null || (c = iVar.mo23431c()) == null)) {
                C0792v.m2765c(c, f);
                f = 1.0f + f;
            }
        }
    }

    /* renamed from: com.bytedance.f.a.a.b$a */
    public static final class C14539a implements AbstractC14543e {

        /* renamed from: a */
        final /* synthetic */ C14538b f35149a;

        static {
            Covode.recordClassIndex(16626);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14539a(C14538b bVar) {
            this.f35149a = bVar;
        }

        @Override // com.bytedance.p969f.p970a.p971a.AbstractC14543e
        /* renamed from: a */
        public final void mo23386a(C14544f fVar) {
            int indexOf;
            C89219l.m154721d(fVar, "");
            C14540c cVar = this.f35149a.f35143a;
            C89219l.m154721d(fVar, "");
            int indexOf2 = cVar.f35150a.indexOf(fVar);
            if (indexOf2 >= 0) {
                Iterator<T> it = cVar.f35150a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.f35157a == fVar.f35157a) {
                        if (next != null && (indexOf = cVar.f35150a.indexOf(next)) >= 0 && indexOf2 != indexOf) {
                            Collections.swap(cVar.f35150a, indexOf2, indexOf);
                        }
                    }
                }
            }
            this.f35149a.mo23384b();
        }
    }

    @Override // com.bytedance.p969f.p970a.p971a.AbstractC14552j
    /* renamed from: b */
    public final void mo23385b(C14544f fVar) {
        C89219l.m154721d(fVar, "");
        C14540c cVar = this.f35143a;
        C89219l.m154721d(fVar, "");
        cVar.f35150a.remove(fVar);
        AbstractC14551i iVar = fVar.f35158b;
        if (iVar != null) {
            this.f35148f.removeView(iVar.mo23431c());
        }
    }

    @Override // com.bytedance.p969f.p970a.p971a.AbstractC14552j
    /* renamed from: a */
    public final void mo23383a(C14544f fVar) {
        C89219l.m154721d(fVar, "");
        C14540c cVar = this.f35143a;
        C89219l.m154721d(fVar, "");
        cVar.f35150a.add(0, fVar);
        C89070n.m154530a((List) cVar.f35150a, (Comparator) cVar.f35152c);
        AbstractC14551i iVar = fVar.f35158b;
        if (iVar != null) {
            if (iVar.mo23431c().getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                iVar.mo23431c().setLayoutParams(layoutParams);
            }
            this.f35148f.addView(iVar.mo23431c());
            mo23384b();
        }
    }

    public C14538b(Context context, ViewGroup viewGroup) {
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(828);
        this.f35144b = context;
        this.f35145c = viewGroup;
        C14540c cVar = new C14540c();
        this.f35143a = cVar;
        C14542d dVar = new C14542d(cVar, new C14539a(this));
        this.f35146d = dVar;
        Object newProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a.class}, dVar);
        if (newProxyInstance != null) {
            GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a aVar = (GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a) newProxyInstance;
            this.f35147e = aVar;
            GestureDetector$OnDoubleTapListenerC14546h hVar = new GestureDetector$OnDoubleTapListenerC14546h(context);
            hVar.setOnGestureListener(aVar);
            hVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (viewGroup != null) {
                viewGroup.addView(hVar);
            }
            this.f35148f = hVar;
            MethodCollector.m26664o(828);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.createx.editor.gesture.GestureLayout.OnGestureListener");
        MethodCollector.m26664o(828);
        throw nullPointerException;
    }
}

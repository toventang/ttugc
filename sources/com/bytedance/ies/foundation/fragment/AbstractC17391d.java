package com.bytedance.ies.foundation.fragment;

import android.content.Context;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1214u;
import androidx.p012a.p013a.p016c.AbstractC0189a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17368c;
import com.bytedance.ies.foundation.base.p1207a.C17363a;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.ies.foundation.fragment.d */
public abstract class AbstractC17391d extends AbstractC17368c {

    /* renamed from: b */
    public static final C17392a f41720b = new C17392a((byte) 0);

    /* renamed from: a */
    public WeakReference<C17372a> f41721a;

    static {
        Covode.recordClassIndex(19878);
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.d$a */
    public static final class C17392a {
        static {
            Covode.recordClassIndex(19879);
        }

        private C17392a() {
        }

        public /* synthetic */ C17392a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.d$b */
    public static final class C17393b<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41722a;

        /* renamed from: b */
        final /* synthetic */ C17372a f41723b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41724c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41725d;

        static {
            Covode.recordClassIndex(19880);
        }

        public C17393b(AbstractC89290k kVar, C17372a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41722a = kVar;
            this.f41723b = aVar;
            this.f41724c = eVar;
            this.f41725d = bVar;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            AbstractC89290k kVar = this.f41722a;
            C89219l.m154716b(obj, "");
            return new C17363a(kVar.get(obj));
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.d$c */
    public static final class C17394c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41726a;

        /* renamed from: b */
        final /* synthetic */ C17372a f41727b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41728c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41729d;

        static {
            Covode.recordClassIndex(19881);
        }

        public C17394c(AbstractC89290k kVar, C17372a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41726a = kVar;
            this.f41727b = aVar;
            this.f41728c = eVar;
            this.f41729d = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((C17363a) obj);
            if (!C89219l.m154714a((Object) t, (Object) this.f41728c.element)) {
                AbstractC89172b bVar = this.f41729d;
                if (bVar != null) {
                    bVar.invoke(t.f41680a);
                }
                this.f41728c.element = t;
            }
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.d$d */
    public static final class C17395d<I, O> implements AbstractC0189a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41730a;

        /* renamed from: b */
        final /* synthetic */ C17372a f41731b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41732c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41733d;

        static {
            Covode.recordClassIndex(19882);
        }

        public C17395d(AbstractC89290k kVar, C17372a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41730a = kVar;
            this.f41731b = aVar;
            this.f41732c = eVar;
            this.f41733d = bVar;
        }

        @Override // androidx.p012a.p013a.p016c.AbstractC0189a
        /* renamed from: a */
        public final /* synthetic */ Object mo365a(Object obj) {
            AbstractC89290k kVar = this.f41730a;
            C89219l.m154716b(obj, "");
            return new C17363a(kVar.get(obj));
        }
    }

    /* renamed from: com.bytedance.ies.foundation.fragment.d$e */
    public static final class C17396e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k f41734a;

        /* renamed from: b */
        final /* synthetic */ C17372a f41735b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f41736c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f41737d;

        static {
            Covode.recordClassIndex(19883);
        }

        public C17396e(AbstractC89290k kVar, C17372a aVar, C89233z.C89238e eVar, AbstractC89172b bVar) {
            this.f41734a = kVar;
            this.f41735b = aVar;
            this.f41736c = eVar;
            this.f41737d = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t = (T) ((C17363a) obj);
            if (!C89219l.m154714a((Object) t, (Object) this.f41736c.element)) {
                AbstractC89172b bVar = this.f41737d;
                if (bVar != null) {
                    bVar.invoke(t.f41680a);
                }
                this.f41736c.element = t;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.base.AbstractC17368c, com.bytedance.ies.foundation.fragment.AbstractC17390c
    /* renamed from: c */
    public final void mo27707c(AbstractC0952i iVar, C17372a aVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        super.mo27707c(iVar, aVar);
        this.f41721a = null;
    }

    @Override // com.bytedance.ies.foundation.base.AbstractC17368c, com.bytedance.ies.foundation.fragment.AbstractC17390c
    /* renamed from: a */
    public final void mo27701a(AbstractC0952i iVar, C17372a aVar, Context context) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(context, "");
        super.mo27701a(iVar, aVar, context);
        if (aVar != null) {
            this.f41721a = new WeakReference<>(aVar);
        }
    }
}
